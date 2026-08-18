package com.mbridge.msdk.tracker.network.toolbox;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.work.WorkRequest;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.DownloadResourceType;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.download.OnDownloadStateListener;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.newreward.function.common.MBridgeSharedPreferenceModel;
import java.io.File;
import java.io.FileInputStream;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class i {
    private static final String f = "i";
    private static volatile i g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, InetAddress> f2056a = new ConcurrentHashMap<>();
    private final AtomicBoolean b = new AtomicBoolean(false);
    private String d = "";
    private String e = "";
    private final MBridgeSharedPreferenceModel c = MBridgeSharedPreferenceModel.getInstance("local_dns_config");

    public static class a implements OnDownloadStateListener<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f2057a;
        private final String b;
        private final String c;

        public a(String str, String str2, String str3) {
            this.f2057a = str;
            this.b = str2;
            this.c = str3;
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onCancelDownload(DownloadMessage<Object> downloadMessage) {
            i.b().c();
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadComplete(DownloadMessage<Object> downloadMessage) {
            i.b().b(this.f2057a, this.b, this.c);
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadError(DownloadMessage<Object> downloadMessage, DownloadError downloadError) {
            i.b().c();
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadStart(DownloadMessage<Object> downloadMessage) {
        }
    }

    private i() {
    }

    public static i b() {
        if (g == null) {
            synchronized (i.class) {
                try {
                    if (g == null) {
                        g = new i();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return g;
    }

    private void c(String str) {
        try {
            this.e = d(com.mbridge.msdk.foundation.same.net.utils.d.h().y);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(i0.a(str));
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!TextUtils.isEmpty(next) && next.contains(this.e)) {
                    String string = jSONObject.getString(next);
                    if (!TextUtils.isEmpty(string)) {
                        try {
                            this.f2056a.put(next, InetAddress.getByAddress(next, com.mbridge.msdk.foundation.same.c.b(string)));
                        } catch (UnknownHostException e) {
                            this.d = "create InetAddress failed for " + next + " with ip " + string;
                            o0.b(f, "init: local dns cache error", e);
                        }
                    }
                }
            }
            this.b.set(true);
        } catch (Exception e2) {
            o0.b(f, "init: local dns cache json parse error", e2);
            this.d = "parse local dns config error";
            this.f2056a.clear();
            this.b.set(false);
        }
    }

    private static String d(String str) {
        return str.replace("https://{}", "").replace("http://{}", "");
    }

    public void e(String str) {
        if (TextUtils.isEmpty(str) || !e()) {
            return;
        }
        this.b.set(false);
        this.f2056a.clear();
        a();
    }

    public boolean d() {
        return this.b.get() && !this.f2056a.isEmpty();
    }

    private void a() {
        String string = this.c.getString("cache", "");
        String string2 = this.c.getString("url", "");
        String strB = q0.a().b("local_dns_config_url", "", false);
        if (TextUtils.isEmpty(strB)) {
            this.c.putString("cache", "");
        } else if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2) && TextUtils.equals(strB, string2)) {
            c(string);
        } else {
            a(strB);
        }
    }

    public boolean e() {
        return q0.a().b("local_dns", false, false);
    }

    public boolean b(String str) {
        return TextUtils.equals(str, com.mbridge.msdk.foundation.same.net.utils.d.h().e.replace("https://", ""));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, String str2, String str3) {
        try {
            String strA = com.mbridge.msdk.foundation.same.c.a(new FileInputStream(new File(str2, str3)));
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            this.c.putString("cache", strA);
            this.c.putString("url", str);
            c(strA);
        } catch (Exception e) {
            o0.b(f, "downloadLocalDNSConfig: onDownloadComplete: file not found", e);
            this.d = "find local dns config file error";
        }
    }

    private void a(String str) {
        a(str, com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_OTHER) + File.separator, com.mbridge.msdk.newreward.function.utils.c.a(str));
    }

    private void a(String str, String str2, String str3) {
        MBDownloadManager.getInstance().download(new DownloadMessage<>(new Object(), str, str3, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_OTHER)).withConnectTimeout(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS).withReadTimeout(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS).withWriteTimeout(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS).withTimeout(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS).withHttpRetryCounter(5).withDirectoryPathInternal(str2).withDownloadPriority(DownloadPriority.HIGH).withDownloadStateListener(new a(str, str2, str3)).build().start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.b.set(false);
        this.d = "download local dns config error";
    }

    public boolean c(String str, String str2, String str3) {
        return e() && d() && TextUtils.equals(str, MBInterstitialActivity.INTENT_CAMAPIGN) && !b(str3) && (TextUtils.equals(str2, String.valueOf(94)) || TextUtils.equals(str2, String.valueOf(287)));
    }

    public List<InetAddress> a(@NonNull String str, UnknownHostException unknownHostException) throws UnknownHostException {
        InetAddress inetAddress;
        try {
            inetAddress = this.f2056a.get(str);
        } catch (Exception e) {
            o0.b(f, "lookup: local dns cache error", e);
            inetAddress = null;
        }
        if (inetAddress != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(inetAddress);
            return arrayList;
        }
        throw unknownHostException;
    }
}
