package com.mbridge.msdk.foundation.tools;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.DownloadResourceType;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.download.OnDownloadStateListener;
import com.mbridge.msdk.foundation.download.resource.MBResourceManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final List<String> f1297a;

    public class a implements OnDownloadStateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f1298a;
        final /* synthetic */ String b;
        final /* synthetic */ c c;
        final /* synthetic */ String d;
        final /* synthetic */ String e;

        public a(String str, String str2, c cVar, String str3, String str4) {
            this.f1298a = str;
            this.b = str2;
            this.c = cVar;
            this.d = str3;
            this.e = str4;
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onCancelDownload(DownloadMessage downloadMessage) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadComplete(DownloadMessage downloadMessage) throws Throwable {
            String str;
            try {
                String str2 = this.f1298a + File.separator + this.b;
                String str3 = this.f1298a;
                MBResourceManager.getInstance().unZip(str2, str3);
                if (this.c != null) {
                    if (downloadMessage != null) {
                        try {
                            str = (String) downloadMessage.getExtra("responseHeaders");
                        } catch (Throwable th) {
                            o0.b("DynamicViewResourceManager", th.getMessage());
                            str = "";
                        }
                    } else {
                        str = "";
                    }
                    try {
                        this.c.a(this.d, str3, this.e, str, false);
                    } catch (Exception e) {
                        o0.b("DynamicViewResourceManager", e.getMessage());
                    }
                }
            } catch (Exception unused) {
            }
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadError(DownloadMessage downloadMessage, DownloadError downloadError) {
            c cVar = this.c;
            if (cVar != null) {
                try {
                    cVar.a(this.d, downloadError);
                } catch (Exception e) {
                    o0.b("DynamicViewResourceManager", e.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadStart(DownloadMessage downloadMessage) {
        }
    }

    public class b implements OnDownloadStateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f1299a;
        final /* synthetic */ String b;

        public b(String str, String str2) {
            this.f1299a = str;
            this.b = str2;
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onCancelDownload(DownloadMessage downloadMessage) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadComplete(DownloadMessage downloadMessage) throws Throwable {
            try {
                MBResourceManager.getInstance().unZip(this.f1299a + File.separator + this.b, this.f1299a);
            } catch (Exception unused) {
            }
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadError(DownloadMessage downloadMessage, DownloadError downloadError) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadStart(DownloadMessage downloadMessage) {
        }
    }

    public interface c {
        void a(String str, DownloadError downloadError);

        void a(String str, String str2, String str3, String str4, boolean z);
    }

    static {
        ArrayList arrayList = new ArrayList(4);
        f1297a = arrayList;
        arrayList.add("mbridge_splash_native_template_v_v1.xml");
        arrayList.add("mbridge_splash_native_template_h_v1.xml");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:
    
        if (r14 != 5) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(int r14, java.lang.String r15, java.lang.String r16, com.mbridge.msdk.foundation.tools.x.c r17, com.mbridge.msdk.foundation.entity.CampaignEx r18) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.x.a(int, java.lang.String, java.lang.String, com.mbridge.msdk.foundation.tools.x$c, com.mbridge.msdk.foundation.entity.CampaignEx):void");
    }

    private static String b(int i, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        try {
            String path = new URL(str2).getPath();
            String strSubstring = path.substring(path.lastIndexOf(47) + 1);
            return !TextUtils.isEmpty(strSubstring) ? strSubstring.replace(".zip", "") : "";
        } catch (Exception unused) {
            return "";
        }
    }

    private static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String path = new URL(str).getPath();
            String strSubstring = path.substring(path.lastIndexOf(47) + 1);
            if (TextUtils.isEmpty(strSubstring)) {
                return "";
            }
            String strReplace = strSubstring.replace(".zip", "");
            List<String> list = f1297a;
            return (list == null || list.contains(strReplace)) ? "" : strReplace;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String a(int i, String str, String str2) {
        String strB;
        File file;
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        try {
            strB = b(i, str, str2);
        } catch (Exception unused) {
            strB = "";
        }
        String str3 = com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_XML) + File.separator;
        try {
            file = !TextUtils.isEmpty(strB) ? new File(str3, strB) : null;
        } catch (Exception unused2) {
        }
        if (file == null || !file.exists()) {
            file = new File(DM.m(DM.o(str3), File.separator, strB.replace(".xml", "")), strB);
        }
        return file.getPath();
    }

    public static String a(String str) {
        String strB;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String queryParameter = Uri.parse(str).getQueryParameter(MBridgeConstans.DYNAMIC_VIEW_KEY_NATMP);
            if (!TextUtils.isEmpty(queryParameter) && !queryParameter.equals("1")) {
                return "";
            }
        } catch (Throwable unused) {
        }
        try {
            strB = b(str);
        } catch (Exception unused2) {
            strB = "";
        }
        if (TextUtils.isEmpty(strB)) {
            return "";
        }
        try {
            String str2 = com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_XML) + File.separator;
            File file = new File(str2, strB);
            if (file.isFile() && file.exists()) {
                return file.getPath();
            }
            String path = new URL(str).getPath();
            a(str, path.substring(path.lastIndexOf(47) + 1), str2, strB);
            return "";
        } catch (Exception unused3) {
        }
    }

    private static final void a(String str, String str2, String str3, String str4, c cVar, CampaignEx campaignEx, int i) throws Exception {
        o0.a("test_zip_download ", "start download path： " + str3 + str2);
        DownloadMessage<?> downloadMessage = new DownloadMessage<>(campaignEx, str, str2, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_OTHER);
        downloadMessage.addExtra("resource_type", Integer.valueOf(i));
        MBDownloadManager.getInstance().download(downloadMessage).withReadTimeout((long) com.mbridge.msdk.foundation.same.a.u).withConnectTimeout((long) com.mbridge.msdk.foundation.same.a.t).withTimeout(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS).withWriteTimeout((long) com.mbridge.msdk.foundation.same.a.s).with("download_scene", "download_dynamic_view").withDownloadPriority(DownloadPriority.MEDIUM).withHttpRetryCounter(1).withDirectoryPathInternal(str3).withDownloadStateListener(new a(str3, str2, cVar, str, str4)).build().start();
    }

    private static final void a(String str, String str2, String str3, String str4) throws Exception {
        MBDownloadManager.getInstance().download(new DownloadMessage<>(new Object(), str, str2, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_OTHER)).withReadTimeout(com.mbridge.msdk.foundation.same.a.u).withConnectTimeout(com.mbridge.msdk.foundation.same.a.o).with("download_scene", "download_dynamic_view").withWriteTimeout(com.mbridge.msdk.foundation.same.a.s).withTimeout(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS).withDownloadPriority(DownloadPriority.MEDIUM).withHttpRetryCounter(1).withDirectoryPathInternal(str3).withDownloadStateListener(new b(str3, str2)).build().start();
    }
}
