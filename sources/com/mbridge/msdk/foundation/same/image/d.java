package com.mbridge.msdk.foundation.same.image;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.DownloadResourceType;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.download.OnDownloadStateListener;
import com.mbridge.msdk.foundation.download.core.DownloadRequest;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.File;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ThreadPoolExecutor f1188a;
    private final Handler b;
    private final String c;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f1189a;
        final /* synthetic */ com.mbridge.msdk.foundation.same.image.c b;

        /* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.image.d$a$a, reason: collision with other inner class name */
        public class RunnableC0168a implements Runnable {
            public RunnableC0168a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                aVar.b.onFailedLoad("create download request error", aVar.f1189a);
            }
        }

        public a(String str, g gVar, com.mbridge.msdk.foundation.same.image.c cVar) {
            this.f1189a = str;
            this.b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            DownloadRequest downloadRequestA = d.this.a(m0.d(this.f1189a), this.f1189a, null, this.b);
            if (downloadRequestA != null) {
                downloadRequestA.start();
                return;
            }
            if (MBridgeConstans.DEBUG) {
                o0.b("CommonImageLoaderRefactor", "createDownloadRequest error");
            }
            if (this.b == null) {
                return;
            }
            d.this.b.post(new RunnableC0168a());
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final d f1191a = new d(null);
    }

    public static final class c implements OnDownloadStateListener<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ThreadPoolExecutor f1192a;
        private final Handler b;
        private final String c;
        private final String d;
        private final String e;
        private final com.mbridge.msdk.foundation.same.image.c f;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.a();
            }
        }

        public class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f1194a;

            public b(String str) {
                this.f1194a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    c.this.f.onFailedLoad(c.this.e, this.f1194a);
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        o0.b("CommonImageLoaderRefactor", "callbackForFailed error", e);
                    }
                }
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.image.d$c$c, reason: collision with other inner class name */
        public class RunnableC0169c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Bitmap f1195a;

            public RunnableC0169c(Bitmap bitmap) {
                this.f1195a = bitmap;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    c.this.f.onSuccessLoad(this.f1195a, c.this.e);
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        o0.b("CommonImageLoaderRefactor", "callbackForSuccess error", e);
                    }
                }
            }
        }

        public c(Handler handler, ThreadPoolExecutor threadPoolExecutor, String str, String str2, String str3, g gVar, com.mbridge.msdk.foundation.same.image.c cVar) {
            this.b = handler;
            this.f1192a = threadPoolExecutor;
            this.e = str;
            this.c = str2;
            this.d = str3;
            this.f = cVar;
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onCancelDownload(DownloadMessage<Object> downloadMessage) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadComplete(DownloadMessage<Object> downloadMessage) {
            b();
            this.f1192a.execute(new a());
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadError(DownloadMessage<Object> downloadMessage, DownloadError downloadError) {
            if (MBridgeConstans.DEBUG) {
                o0.a("CommonImageLoaderRefactor", "onDownloadError imageUrl = " + downloadError.getException().getLocalizedMessage());
            }
            a(downloadError.getException().getLocalizedMessage());
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadStart(DownloadMessage<Object> downloadMessage) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            if (this.f == null) {
                return;
            }
            try {
                Bitmap bitmapB = d.b(this.c + this.d);
                if (bitmapB == null) {
                    a("bitmap decode failed");
                    return;
                }
                Bitmap bitmapA = a(bitmapB, null);
                if (bitmapA == null) {
                    a("bitmap transformation failed");
                } else {
                    a(bitmapA);
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    o0.a("CommonImageLoaderRefactor", "onDownloadComplete decodeBitmap error = " + e.getLocalizedMessage());
                }
                a("bitmap decode failed");
            }
        }

        private void b() {
            File file;
            if (MBridgeConstans.DEBUG) {
                o0.a("CommonImageLoaderRefactor", "onDownloadComplete imageUrl = " + this.e + " imagePath = " + this.c + this.d);
                try {
                    file = new File(this.c + this.d);
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        o0.b("CommonImageLoaderRefactor", "onDownloadComplete error", e);
                    }
                    file = null;
                }
                if (file == null || !file.isFile() || !file.exists()) {
                    o0.b("CommonImageLoaderRefactor", "onDownloadComplete file not exist");
                    return;
                }
                o0.a("CommonImageLoaderRefactor", "onDownloadComplete file size = " + file.length());
            }
        }

        private void a(String str) {
            if (this.f == null) {
                return;
            }
            this.b.post(new b(str));
        }

        private Bitmap a(Bitmap bitmap, g gVar) {
            if (gVar == null) {
                return bitmap;
            }
            try {
                return gVar.a(bitmap);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    o0.b("CommonImageLoaderRefactor", "handlerImageTransformation error", e);
                }
                return bitmap;
            }
        }

        private void a(Bitmap bitmap) {
            if (this.f == null) {
                return;
            }
            this.b.post(new RunnableC0169c(bitmap));
        }
    }

    public /* synthetic */ d(a aVar) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bitmap b(String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inJustDecodeBounds = false;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inDither = true;
        return BitmapFactory.decodeFile(str, options);
    }

    public Bitmap c(String str) {
        if (MBridgeConstans.DEBUG) {
            AbstractC3888ke0.s("getImageBitmapByUrl imageUrl = ", str, "CommonImageLoaderRefactor");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String strM = DM.m(new StringBuilder(), this.c, m0.d(str));
        File file = new File(strM);
        if (file.isFile() && file.exists()) {
            try {
                return b(strM);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    o0.b("CommonImageLoaderRefactor", "getImageBitmapByUrl error", e);
                }
            }
        }
        return null;
    }

    public boolean d(String str) {
        File file;
        if (MBridgeConstans.DEBUG) {
            AbstractC3888ke0.s("isImageFileExists imageUrl = ", str, "CommonImageLoaderRefactor");
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            try {
                file = new File(this.c + m0.d(str));
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    o0.b("CommonImageLoaderRefactor", "isImageFileExists error", e);
                }
                file = null;
            }
            return file != null && file.isFile() && file.exists();
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                o0.b("CommonImageLoaderRefactor", "isImageFileExists error", e2);
            }
            return false;
        }
    }

    private d() {
        this.b = new Handler(Looper.getMainLooper());
        this.c = com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_IMG) + File.separator;
        this.f1188a = f.b();
    }

    public static d a() {
        return b.f1191a;
    }

    private Runnable a(String str, g gVar, com.mbridge.msdk.foundation.same.image.c cVar) {
        return new a(str, gVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DownloadRequest<?> a(String str, String str2, g gVar, com.mbridge.msdk.foundation.same.image.c cVar) {
        try {
            return MBDownloadManager.getInstance().download(new DownloadMessage<>(new Object(), str2, str, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_IMAGE)).withReadTimeout(com.mbridge.msdk.foundation.same.a.u).withConnectTimeout(com.mbridge.msdk.foundation.same.a.t).withWriteTimeout(com.mbridge.msdk.foundation.same.a.s).withDownloadPriority(DownloadPriority.LOW).withHttpRetryCounter(1).withDirectoryPathInternal(this.c).withDownloadStateListener(new c(this.b, this.f1188a, str2, this.c, str, gVar, cVar)).with("download_scene", "download_image").withProgressStateListener(null).withTimeout(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS).with("do_us_fi_re", Boolean.FALSE.toString()).build();
        } catch (Exception e) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            o0.b("CommonImageLoaderRefactor", "createDownloadRequest error", e);
            return null;
        }
    }

    public void b(String str, g gVar, com.mbridge.msdk.foundation.same.image.c cVar) {
        try {
            this.f1188a.execute(a(str, gVar, cVar));
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                o0.b("CommonImageLoaderRefactor", "loadImage error", e);
            }
        }
    }
}
