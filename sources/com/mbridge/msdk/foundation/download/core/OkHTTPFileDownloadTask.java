package com.mbridge.msdk.foundation.download.core;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadProgress;
import com.mbridge.msdk.foundation.download.DownloadResponse;
import com.mbridge.msdk.foundation.download.DownloadStatus;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.download.database.IDatabaseHelper;
import com.mbridge.msdk.foundation.download.resource.MBResourceManager;
import com.mbridge.msdk.foundation.download.resource.stream.DownloadFileOutputStream;
import com.mbridge.msdk.foundation.download.utils.Objects;
import com.mbridge.msdk.foundation.download.utils.Utils;
import com.mbridge.msdk.foundation.same.d;
import com.mbridge.msdk.foundation.same.net.MBridgeHostnameVerifier;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.thrid.okhttp.c;
import com.mbridge.msdk.thrid.okhttp.t;
import com.mbridge.msdk.thrid.okhttp.w;
import com.mbridge.msdk.thrid.okhttp.y;
import com.mbridge.msdk.thrid.okhttp.z;
import com.mbridge.msdk.tracker.network.q;
import com.mbridge.msdk.tracker.network.toolbox.OKHTTPEventListener;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
class OkHTTPFileDownloadTask implements IDownloadTask {
    private static final String CLOSE = "close";
    private static final String CONNECTION = "Connection";
    private static final String FORMAT_RANGE = "bytes=%d-";
    private static final String RESPONSE_BODY_IS_NULL = "response body is null";
    private static final String RESPONSE_CODE = "responseCode ";
    private static final String RESPONSE_CONTENT_LENGTH_IS_NULL = "response content length is null";
    private static final String RESPONSE_INPUTSTREAM_IS_NULL = "response inputStream is null";
    private static final String RESPONSE_IS_NULL = "response is null";
    private final IDatabaseHelper _databaseHelper;
    private volatile DownloadMessage _downloadMessage;
    private DownloadModel _downloadModel;
    private final DownloadRequest _downloadRequest;
    private DownloadResponse _downloadResponse;
    private DownloaderReporter.Builder _downloaderReporter;
    private String _etag = "";
    private InputStream _inputStream;
    private DownloadFileOutputStream _outputStream;
    private z _responseBody;
    private q monitor;

    private OkHTTPFileDownloadTask(DownloadRequest downloadRequest, DownloadModel downloadModel, IDatabaseHelper iDatabaseHelper, DownloadMessage downloadMessage, DownloaderReporter.Builder builder) {
        this._downloadRequest = downloadRequest;
        this._downloadModel = downloadModel;
        this._databaseHelper = iDatabaseHelper;
        this._downloadMessage = downloadMessage;
        this._downloaderReporter = builder;
    }

    public static IDownloadTask create(DownloadRequest downloadRequest, DownloadModel downloadModel, IDatabaseHelper iDatabaseHelper, DownloadMessage downloadMessage, DownloaderReporter.Builder builder) {
        if (Objects.isNull(builder)) {
            builder = new DownloaderReporter.Builder(DownloadCommon.DOWNLOAD_REPORT_KEY);
        }
        return new OkHTTPFileDownloadTask(downloadRequest, downloadModel, iDatabaseHelper, downloadMessage, builder);
    }

    private DownloadResponse handleInputStream(String str, String str2, String str3, String str4) throws IllegalAccessException, IOException {
        String md5;
        String str5;
        MessageDigest messageDigest;
        boolean z;
        byte[] bArr;
        String str6;
        DownloadResponse downloadResponse;
        String str7;
        String str8 = IDownloadTask.TAG;
        DownloadResponse downloadResponse2 = new DownloadResponse();
        if (Objects.isNull(this._downloadModel)) {
            DownloadModel downloadModelCreate = DownloadModel.create(this._downloadRequest.getDownloadId(), this._downloadMessage.getDownloadUrl(), this._downloadMessage.getResourceUrl(), str4, str2, this._downloadMessage.getSaveFileName(), this._downloadRequest.getTotalBytes(), 0L, this._downloadMessage.getDownloadRate(), 1, this._downloadMessage.getDownloadResourceType());
            this._downloadModel = downloadModelCreate;
            this._databaseHelper.insert(downloadModelCreate);
        } else {
            DownloadModel downloadModelCreate2 = DownloadModel.create(this._downloadModel.getDownloadId(), this._downloadModel.getDownloadUrl(), this._downloadMessage.getResourceUrl(), this._downloadModel.getEtag(), this._downloadModel.getSaveDirectorPath(), this._downloadModel.getSaveFileName(), this._downloadRequest.getTotalBytes(), this._downloadModel.getDownloadedBytes(), this._downloadMessage.getDownloadRate(), this._downloadModel.getUsageCounter() + 1, this._downloadMessage.getDownloadResourceType());
            this._downloadModel = downloadModelCreate2;
            this._databaseHelper.update(downloadModelCreate2, str2);
        }
        DownloadFileOutputStream downloadFileOutputStream = MBResourceManager.getInstance().getDownloadFileOutputStream(new File(str2, str));
        this._outputStream = downloadFileOutputStream;
        downloadFileOutputStream.seek(this._downloadRequest.getDownloadedBytes());
        MessageDigest messageDigest2 = null;
        try {
            if (this._downloadMessage == null || !this._downloadMessage.isCheckMD5() || TextUtils.isEmpty(this._downloadMessage.getMd5())) {
                messageDigest = null;
                str5 = "";
                z = false;
            } else {
                md5 = this._downloadMessage.getMd5();
                try {
                    messageDigest2 = MessageDigest.getInstance(SameMD5.TAG);
                    if (this._downloadMessage.getDownloadRate() != 100 || TextUtils.isEmpty(md5)) {
                        messageDigest = messageDigest2;
                        str5 = md5;
                        z = false;
                    } else {
                        messageDigest = messageDigest2;
                        str5 = md5;
                        z = true;
                    }
                } catch (Throwable th) {
                    th = th;
                    GlobalComponent.getInstance().getLogger().log(IDownloadTask.TAG, th.getMessage());
                }
            }
            while (true) {
                int i = this._inputStream.read(bArr);
                if (i == -1) {
                    str6 = str8;
                    downloadResponse = downloadResponse2;
                    break;
                }
                this._outputStream.write(bArr, 0, i);
                DownloadRequest downloadRequest = this._downloadRequest;
                downloadRequest.setDownloadedBytes(downloadRequest.getDownloadedBytes() + ((long) i));
                if (z && messageDigest != null) {
                    try {
                        messageDigest.update(bArr, 0, i);
                    } catch (Exception unused) {
                    }
                }
                this._outputStream.flushAndSync();
                int downloadRate = Utils.getDownloadRate(this._downloadRequest.getTotalBytes(), this._downloadRequest.getDownloadedBytes());
                str6 = str8;
                DownloadResponse downloadResponse3 = downloadResponse2;
                sendProgress(this._downloadRequest, this._downloadMessage, this._downloadRequest.getDownloadedBytes(), this._downloadRequest.getTotalBytes(), downloadRate);
                q qVar = this.monitor;
                if (qVar != null) {
                    qVar.c(this._downloadRequest.getDownloadedBytes());
                }
                if (this._downloadMessage.getDownloadRate() != 100 && downloadRate >= this._downloadMessage.getDownloadRate()) {
                    downloadResponse = downloadResponse3;
                    break;
                }
                if (this._downloadRequest.getStatus() == DownloadStatus.CANCELLED) {
                    downloadResponse = downloadResponse3;
                    downloadResponse.setCancelled(true);
                    break;
                }
                str8 = str6;
                downloadResponse2 = downloadResponse3;
            }
        } catch (Throwable th2) {
            th = th2;
            md5 = "";
        }
        q qVar2 = this.monitor;
        if (qVar2 != null) {
            qVar2.d("process_data_start");
        }
        bArr = new byte[GlobalComponent.getInstance().getByteBufferSize()];
        q qVar3 = this.monitor;
        if (qVar3 != null) {
            qVar3.d("process_data_end");
        }
        String str9 = str5;
        GlobalComponent.getInstance().getDatabaseHelper().updateProgress(str3, str2, DownloadModel.create(str3, this._downloadMessage.getDownloadUrl(), this._downloadMessage.getResourceUrl(), str4, str2, this._downloadMessage.getSaveFileName(), this._downloadRequest.getTotalBytes(), this._downloadRequest.getDownloadedBytes(), this._downloadMessage.getDownloadRate(), this._downloadModel.getUsageCounter(), this._downloadMessage.getDownloadResourceType()));
        if (z) {
            try {
                if (this._downloadRequest.getStatus() != DownloadStatus.CANCELLED) {
                    q qVar4 = this.monitor;
                    if (qVar4 != null) {
                        qVar4.d("validate_data_start");
                    }
                    String strHexEncode = SameMD5.hexEncode(messageDigest.digest());
                    String lowerCase = TextUtils.isEmpty(str9) ? "" : str9.toLowerCase(Locale.US);
                    str7 = str6;
                    try {
                        GlobalComponent.getInstance().getLogger().log(str7, strHexEncode + " " + lowerCase);
                        q qVar5 = this.monitor;
                        if (qVar5 != null) {
                            qVar5.d("validate_data_end");
                        }
                        if (!TextUtils.isEmpty(strHexEncode) && !strHexEncode.equals(lowerCase)) {
                            this._downloadMessage.setMd5VerifyResult(1);
                            downloadResponse.setFailed(true);
                            downloadResponse.setError(new DownloadError(new Exception("File MD5 check fail.")));
                            return downloadResponse;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        GlobalComponent.getInstance().getLogger().log(str7, th.getMessage());
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                str7 = str6;
            }
        }
        if (!downloadResponse.isCancelled()) {
            downloadResponse.setSuccessful(true);
        }
        return downloadResponse;
    }

    private void handlerException(String str, String str2, String str3, Exception exc) {
        try {
            if (Objects.isNotNull(this._databaseHelper) && Objects.isNotNull(this._downloadRequest)) {
                if (!q0.a().a("r_f_s_d_e", true)) {
                    this._databaseHelper.remove(str3, str2);
                    MBResourceManager.getInstance().deleteFile(new File(this._downloadRequest.getCacheDirectoryPath() + this._downloadMessage.getSaveFileName()));
                }
                this._downloadRequest.setDownloadedBytes(0L);
                this._downloadRequest.setTotalBytes(0L);
            }
        } catch (Exception e) {
            GlobalComponent.getInstance().getLogger().log(IDownloadTask.TAG, e.getMessage());
        }
        this._downloadResponse.setError(exc);
    }

    private DownloadResponse handlerRequestSuccessful(String str, String str2, String str3, y yVar, int i) throws IllegalAccessException, IOException {
        DownloadResponse downloadResponse = new DownloadResponse();
        boolean z = !isSupportResume(i, this._downloadModel);
        boolean z2 = (yVar == null || this._downloadRequest == null || i != 206 || yVar.d() == null || this._downloadRequest.getTotalBytes() <= 0 || yVar.d().h() == this._downloadRequest.getTotalBytes() - this._downloadRequest.getDownloadedBytes()) ? false : true;
        if (z && z2) {
            this._downloadRequest.setDownloadedBytes(0L);
            this._downloadRequest.setTotalBytes(0L);
            if (Objects.isNotNull(this._databaseHelper)) {
                this._databaseHelper.remove(str3, str2);
            }
            this._downloadModel = null;
            MBResourceManager.getInstance().deleteFile(new File(this._downloadRequest.getCacheDirectoryPath() + this._downloadMessage.getSaveFileName()));
        }
        z zVarD = yVar.d();
        this._responseBody = zVarD;
        if (Objects.isNull(zVarD)) {
            downloadResponse.setError(new IOException(RESPONSE_BODY_IS_NULL));
            this._downloadRequest.setTotalBytes(0L);
            this._downloadRequest.setDownloadedBytes(0L);
            return downloadResponse;
        }
        long jH = this._responseBody.h();
        if (jH <= 0) {
            downloadResponse.setError(new IOException(RESPONSE_CONTENT_LENGTH_IS_NULL));
            return downloadResponse;
        }
        if (this._downloadRequest.getTotalBytes() == 0) {
            this._downloadRequest.setTotalBytes(jH);
        }
        InputStream inputStreamD = this._responseBody.d();
        this._inputStream = inputStreamD;
        if (!Objects.isNull(inputStreamD)) {
            return handleInputStream(str, str2, str3, this._etag);
        }
        downloadResponse.setError(new IOException(RESPONSE_INPUTSTREAM_IS_NULL));
        return downloadResponse;
    }

    private boolean isSupportResume(int i, DownloadModel downloadModel) {
        return i == 206 && !TextUtils.isEmpty(this._etag) && (downloadModel == null || TextUtils.equals(this._etag, downloadModel.getEtag()));
    }

    private void reportDownloadMessage() {
        boolean zIsSuccessful = this._downloadResponse.isSuccessful();
        this._downloaderReporter.add("su", Boolean.toString(zIsSuccessful));
        boolean zIsCancelled = this._downloadResponse.isCancelled();
        this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_CANCEL, Boolean.toString(zIsCancelled));
        this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_RATE, String.valueOf(Utils.getDownloadRate(this._downloadRequest.getTotalBytes(), this._downloadRequest.getDownloadedBytes())));
        if (!zIsSuccessful && !zIsCancelled) {
            this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_REASON, this._downloadResponse.getErrorMessage());
        }
        q qVar = this.monitor;
        if (qVar != null) {
            if (zIsSuccessful) {
                qVar.a(1);
            } else {
                String errorMessage = this._downloadResponse.getErrorMessage();
                DownloadError error = this._downloadResponse.getError();
                Exception exception = error == null ? null : error.getException();
                q qVar2 = this.monitor;
                if (zIsCancelled) {
                    exception = new IOException("download request canceled");
                }
                qVar2.a(exception);
                if (TextUtils.equals(errorMessage, "timeout")) {
                    this.monitor.a(3);
                } else {
                    this.monitor.a(2);
                }
            }
        }
        this._downloaderReporter.build().report();
    }

    private void sendProgress(DownloadRequest downloadRequest, DownloadMessage downloadMessage, long j, long j2, int i) {
        if (downloadRequest.getStatus() != DownloadStatus.CANCELLED) {
            downloadRequest.handlerProcessEvent(downloadMessage, new DownloadProgress(j, j2, i));
        }
    }

    /* JADX WARN: Code duplicated, block: B:68:0x02a2 A[PHI: r1
  0x02a2: PHI (r1v20 com.mbridge.msdk.foundation.download.core.OkHTTPFileDownloadTask) = 
  (r1v41 com.mbridge.msdk.foundation.download.core.OkHTTPFileDownloadTask)
  (r1v42 com.mbridge.msdk.foundation.download.core.OkHTTPFileDownloadTask)
 binds: [B:67:0x02a0, B:53:0x0252] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16, types: [com.mbridge.msdk.thrid.okhttp.y] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40 */
    @Override // com.mbridge.msdk.foundation.download.core.IDownloadTask
    public DownloadResponse run() throws Throwable {
        OkHTTPFileDownloadTask okHTTPFileDownloadTask;
        OkHTTPFileDownloadTask okHTTPFileDownloadTask2;
        this._downloadResponse = new DownloadResponse();
        if (this._downloadRequest.getStatus() == DownloadStatus.CANCELLED) {
            this._downloadResponse.setCancelled(true);
            return this._downloadResponse;
        }
        long totalBytes = this._downloadRequest.getTotalBytes();
        long downloadedBytes = this._downloadRequest.getDownloadedBytes();
        this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_CURRENT_RATE, String.valueOf(Utils.getDownloadRate(totalBytes, downloadedBytes)));
        this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_DOWNLOAD_BYTES, String.valueOf(downloadedBytes));
        this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_TOTAL_BYTES, String.valueOf(totalBytes));
        if (totalBytes != 0 && downloadedBytes != 0 && totalBytes == downloadedBytes) {
            this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR_VALUE);
            this._downloaderReporter.build().report();
            this._downloadResponse.setSuccessful(true);
            return this._downloadResponse;
        }
        String saveFileName = this._downloadMessage.getSaveFileName();
        String cacheDirectoryPath = this._downloadRequest.getCacheDirectoryPath();
        String downloadId = this._downloadRequest.getDownloadId();
        String downloadUrl = this._downloadMessage.getDownloadUrl();
        q monitor = this._downloadRequest.getMonitor();
        this.monitor = monitor;
        if (monitor == null && this._downloadRequest.canTrack() && !TextUtils.isEmpty(downloadUrl)) {
            q qVar = new q(d.a((DownloadRequest<?>) this._downloadRequest), "GET");
            this.monitor = qVar;
            qVar.f(downloadUrl);
            this._downloadRequest.setMonitor(this.monitor);
        }
        long timeout = this._downloadRequest.getTimeout();
        long connectTimeout = this._downloadRequest.getConnectTimeout();
        long readTimeout = this._downloadRequest.getReadTimeout();
        long writeTimeout = this._downloadRequest.getWriteTimeout();
        long requestQueueTime = this._downloadRequest.getRequestQueueTime();
        q qVar2 = this.monitor;
        if (qVar2 != null) {
            qVar2.i(timeout);
            this.monitor.e(connectTimeout);
            this.monitor.f(readTimeout);
            this.monitor.j(writeTimeout);
            this.monitor.d("queue");
            this.monitor.a(requestQueueTime);
        }
        Locale locale = Locale.ENGLISH;
        String strI = AbstractC5044xl.i("bytes=", downloadedBytes, "-");
        try {
            t.b bVarS = GlobalComponent.getInstance().getOkHttpClient().s();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            okHTTPFileDownloadTask = this;
            try {
                t tVarA = bVarS.b(connectTimeout, timeUnit).a(new MBridgeHostnameVerifier(downloadUrl)).d(readTimeout, timeUnit).e(writeTimeout, timeUnit).a(Math.max(0L, timeout), timeUnit).a(new OKHTTPEventListener(okHTTPFileDownloadTask.monitor)).a(true).a();
                w wVarA = new w.a().b(downloadUrl).a(new c.a().b().a()).a("Connection", "close").a("Range", strI).a("User-Agent").a("User-Agent", Command.DEFAULT_USER_AGENT).a();
                okHTTPFileDownloadTask._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_HOST, wVarA.g().g());
                okHTTPFileDownloadTask._downloaderReporter.add("url", downloadUrl);
                com.mbridge.msdk.thrid.okhttp.d dVarA = tVarA.a(wVarA);
                ?? r1 = 0;
                y yVar = null;
                try {
                    try {
                        y yVarD = dVarA.d();
                        try {
                            if (!Objects.isNull(yVarD) && !Objects.isNull(yVarD.d())) {
                                int iK = yVarD.k();
                                q qVar3 = okHTTPFileDownloadTask.monitor;
                                if (qVar3 != null) {
                                    qVar3.b(iK);
                                }
                                okHTTPFileDownloadTask._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_RESPONSE_CODE, String.valueOf(iK));
                                if (!yVarD.n()) {
                                    okHTTPFileDownloadTask._downloadResponse.setError(new IOException(RESPONSE_CODE + iK));
                                    DownloadResponse downloadResponse = okHTTPFileDownloadTask._downloadResponse;
                                    Objects.closeInputStream(okHTTPFileDownloadTask._inputStream);
                                    Objects.closeOutputStream(okHTTPFileDownloadTask._outputStream);
                                    Objects.closeResponse(yVarD);
                                    Objects.closeResponseBody(okHTTPFileDownloadTask._responseBody);
                                    if (!dVarA.h()) {
                                        dVarA.cancel();
                                    }
                                    reportDownloadMessage();
                                    return downloadResponse;
                                }
                                okHTTPFileDownloadTask._etag = yVarD.a("ETag", "");
                                OkHTTPFileDownloadTask okHTTPFileDownloadTask3 = this;
                                okHTTPFileDownloadTask._downloadResponse = okHTTPFileDownloadTask3.handlerRequestSuccessful(saveFileName, cacheDirectoryPath, downloadId, yVarD, iK);
                                Objects.closeInputStream(okHTTPFileDownloadTask._inputStream);
                                Objects.closeOutputStream(okHTTPFileDownloadTask._outputStream);
                                Objects.closeResponse(yVarD);
                                Objects.closeResponseBody(okHTTPFileDownloadTask._responseBody);
                                r1 = okHTTPFileDownloadTask3;
                                okHTTPFileDownloadTask2 = okHTTPFileDownloadTask3;
                                if (!dVarA.h()) {
                                    dVarA.cancel();
                                    r1 = okHTTPFileDownloadTask2;
                                }
                                reportDownloadMessage();
                                return okHTTPFileDownloadTask._downloadResponse;
                            }
                            okHTTPFileDownloadTask._downloadResponse.setError(new IOException(RESPONSE_IS_NULL));
                            DownloadResponse downloadResponse2 = okHTTPFileDownloadTask._downloadResponse;
                            Objects.closeInputStream(okHTTPFileDownloadTask._inputStream);
                            Objects.closeOutputStream(okHTTPFileDownloadTask._outputStream);
                            Objects.closeResponse(yVarD);
                            Objects.closeResponseBody(okHTTPFileDownloadTask._responseBody);
                            if (!dVarA.h()) {
                                dVarA.cancel();
                            }
                            reportDownloadMessage();
                            return downloadResponse2;
                        } catch (Exception e) {
                            e = e;
                            yVar = yVarD;
                            okHTTPFileDownloadTask.handlerException(saveFileName, cacheDirectoryPath, downloadId, e);
                            Objects.closeInputStream(okHTTPFileDownloadTask._inputStream);
                            Objects.closeOutputStream(okHTTPFileDownloadTask._outputStream);
                            Objects.closeResponse(yVar);
                            Objects.closeResponseBody(okHTTPFileDownloadTask._responseBody);
                            r1 = yVar;
                            okHTTPFileDownloadTask2 = yVar;
                            if (!dVarA.h()) {
                                dVarA.cancel();
                                r1 = okHTTPFileDownloadTask2;
                            }
                        } catch (Throwable th) {
                            th = th;
                            r1 = yVarD;
                            Objects.closeInputStream(okHTTPFileDownloadTask._inputStream);
                            Objects.closeOutputStream(okHTTPFileDownloadTask._outputStream);
                            Objects.closeResponse(r1);
                            Objects.closeResponseBody(okHTTPFileDownloadTask._responseBody);
                            if (!dVarA.h()) {
                                dVarA.cancel();
                            }
                            reportDownloadMessage();
                            throw th;
                        }
                    } catch (Exception e2) {
                        e = e2;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e3) {
                e = e3;
                okHTTPFileDownloadTask.handlerException(saveFileName, cacheDirectoryPath, downloadId, e);
                okHTTPFileDownloadTask._downloadResponse.setSuccessful(false);
                return okHTTPFileDownloadTask._downloadResponse;
            }
        } catch (Exception e4) {
            e = e4;
            okHTTPFileDownloadTask = this;
        }
    }
}
