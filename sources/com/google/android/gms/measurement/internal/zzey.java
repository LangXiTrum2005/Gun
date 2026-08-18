package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;
import com.badlogic.gdx.net.HttpResponseHeader;
import com.efs.sdk.base.Constants;
import com.google.android.gms.common.internal.Preconditions;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@WorkerThread
final class zzey implements Runnable {
    final /* synthetic */ zzez zza;
    private final URL zzb;
    private final byte[] zzc;
    private final zzev zzd;
    private final String zze;
    private final Map zzf;

    public zzey(zzez zzezVar, String str, URL url, byte[] bArr, Map map, zzev zzevVar) {
        this.zza = zzezVar;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(zzevVar);
        this.zzb = url;
        this.zzc = bArr;
        this.zzd = zzevVar;
        this.zze = str;
        this.zzf = map;
    }

    /* JADX WARN: Code duplicated, block: B:75:0x014f  */
    /* JADX WARN: Code duplicated, block: B:85:0x018d  */
    /* JADX WARN: Code duplicated, block: B:89:0x0133 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0171 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0109: MOVE (r12 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]) (LINE:266), block:B:54:0x0108 */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x010d: MOVE (r12 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]) (LINE:270), block:B:55:0x010b */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Throwable th;
        HttpURLConnection httpURLConnection;
        Map map;
        IOException e;
        Map map2;
        int i;
        zzex zzexVar;
        zzga zzgaVarZzaB;
        IOException iOException;
        int i2;
        Map map3;
        Map map4;
        InputStream inputStream;
        this.zza.zzaz();
        OutputStream outputStream = null;
        try {
            zzez zzezVar = this.zza;
            URLConnection uRLConnectionOpenConnection = this.zzb.openConnection();
            if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setDefaultUseCaches(false);
            zzezVar.zzt.zzf();
            httpURLConnection.setConnectTimeout(MBridgeCommon.DEFAULT_LOAD_TIMEOUT);
            zzezVar.zzt.zzf();
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            try {
                Map map5 = this.zzf;
                if (map5 != null) {
                    for (Map.Entry entry : map5.entrySet()) {
                        httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                if (this.zzc != null) {
                    byte[] bArrZzz = this.zza.zzf.zzu().zzz(this.zzc);
                    zzer zzerVarZzj = this.zza.zzt.zzaA().zzj();
                    int length = bArrZzz.length;
                    zzerVarZzj.zzb("Uploading data. size", Integer.valueOf(length));
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.addRequestProperty(HttpResponseHeader.ContentEncoding, Constants.CP_GZIP);
                    httpURLConnection.setFixedLengthStreamingMode(length);
                    httpURLConnection.connect();
                    OutputStream outputStream2 = httpURLConnection.getOutputStream();
                    try {
                        outputStream2.write(bArrZzz);
                        outputStream2.close();
                    } catch (IOException e2) {
                        e = e2;
                        map2 = null;
                        outputStream = outputStream2;
                        iOException = e;
                        i2 = 0;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException e3) {
                                this.zza.zzt.zzaA().zzd().zzc("Error closing HTTP compressed POST connection output stream. appId", zzet.zzn(this.zze), e3);
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        zzgaVarZzaB = this.zza.zzt.zzaB();
                        zzexVar = new zzex(this.zze, this.zzd, i2, iOException, null, map2, null);
                        zzgaVarZzaB.zzp(zzexVar);
                    } catch (Throwable th2) {
                        th = th2;
                        map = null;
                        outputStream = outputStream2;
                        i = 0;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException e4) {
                                this.zza.zzt.zzaA().zzd().zzc("Error closing HTTP compressed POST connection output stream. appId", zzet.zzn(this.zze), e4);
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        this.zza.zzt.zzaB().zzp(new zzex(this.zze, this.zzd, i, null, null, map, null));
                        throw th;
                    }
                }
                int responseCode = httpURLConnection.getResponseCode();
                try {
                    try {
                        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            inputStream = httpURLConnection.getInputStream();
                            try {
                                byte[] bArr = new byte[1024];
                                while (true) {
                                    int i3 = inputStream.read(bArr);
                                    if (i3 <= 0) {
                                        break;
                                    } else {
                                        byteArrayOutputStream.write(bArr, 0, i3);
                                    }
                                }
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                inputStream.close();
                                httpURLConnection.disconnect();
                                zzgaVarZzaB = this.zza.zzt.zzaB();
                                zzexVar = new zzex(this.zze, this.zzd, responseCode, null, byteArray, headerFields, null);
                                zzgaVarZzaB.zzp(zzexVar);
                            } catch (Throwable th3) {
                                th = th3;
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            inputStream = null;
                        }
                    } catch (IOException e5) {
                        iOException = e5;
                        i2 = responseCode;
                        map2 = map4;
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        zzgaVarZzaB = this.zza.zzt.zzaB();
                        zzexVar = new zzex(this.zze, this.zzd, i2, iOException, null, map2, null);
                    } catch (Throwable th5) {
                        th = th5;
                        i = responseCode;
                        map = map3;
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        this.zza.zzt.zzaB().zzp(new zzex(this.zze, this.zzd, i, null, null, map, null));
                        throw th;
                    }
                } catch (IOException e6) {
                    map2 = null;
                    iOException = e6;
                    i2 = responseCode;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    zzgaVarZzaB = this.zza.zzt.zzaB();
                    zzexVar = new zzex(this.zze, this.zzd, i2, iOException, null, map2, null);
                } catch (Throwable th6) {
                    th = th6;
                    map = null;
                    i = responseCode;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    this.zza.zzt.zzaB().zzp(new zzex(this.zze, this.zzd, i, null, null, map, null));
                    throw th;
                }
            } catch (IOException e7) {
                map2 = null;
                iOException = e7;
                i2 = 0;
                if (outputStream != null) {
                    outputStream.close();
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                zzgaVarZzaB = this.zza.zzt.zzaB();
                zzexVar = new zzex(this.zze, this.zzd, i2, iOException, null, map2, null);
                zzgaVarZzaB.zzp(zzexVar);
            } catch (Throwable th7) {
                map = null;
                th = th7;
            }
        } catch (IOException e8) {
            e = e8;
            httpURLConnection = null;
            map2 = null;
        } catch (Throwable th8) {
            th = th8;
            httpURLConnection = null;
            map = null;
        }
    }
}
