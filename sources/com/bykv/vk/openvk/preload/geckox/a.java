package com.bykv.vk.openvk.preload.geckox;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bykv.vk.openvk.preload.b.d;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.CheckRequestBodyModel;
import com.mbridge.msdk.newreward.player.view.hybrid.util.MRAIDCommunicatorUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<String> f318a = new ArrayList();
    private com.bykv.vk.openvk.preload.falconx.a.a b = new com.bykv.vk.openvk.preload.falconx.a.a();
    private Queue<String> c = new LinkedBlockingQueue();
    private b d;
    private File e;

    private a(b bVar) {
        this.d = bVar;
        File fileL = bVar.l();
        this.e = fileL;
        fileL.mkdirs();
        com.bykv.vk.openvk.preload.geckox.statistic.b.a(this, this.d);
    }

    public static /* synthetic */ void d(a aVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(aVar.d.e());
        try {
            String strA = com.bykv.vk.openvk.preload.geckox.c.b.a().b().a(new com.bykv.vk.openvk.preload.geckox.a.c(arrayList));
            if (aVar.c.size() < 10) {
                aVar.c.add(strA);
            }
        } catch (Throwable unused) {
        }
    }

    public static a a(b bVar) {
        List<String> listE = bVar.e();
        if (listE == null || listE.isEmpty()) {
            throw new IllegalArgumentException("access key empty");
        }
        return new a(bVar);
    }

    private boolean b(Map<String, List<CheckRequestBodyModel.TargetChannel>> map) {
        if (map != null && !map.isEmpty()) {
            List<String> listE = this.d.e();
            for (Map.Entry<String, List<CheckRequestBodyModel.TargetChannel>> entry : map.entrySet()) {
                Iterator<String> it = listE.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    if (TextUtils.equals(it.next(), entry.getKey())) {
                        z = true;
                    }
                }
                if (!z) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean a() {
        List<String> listD = this.d.d();
        List<String> listE = this.d.e();
        if (listD == null || listD.isEmpty() || listE == null || listE.isEmpty()) {
            return false;
        }
        for (String str : listE) {
            Iterator<String> it = listD.iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (TextUtils.equals(str, it.next())) {
                    z = true;
                }
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public final void a(Class<? extends d<?, ?>> cls, com.bykv.vk.openvk.preload.b.b.a aVar) {
        this.b.a(cls, aVar);
    }

    public final void a(final Map<String, List<CheckRequestBodyModel.TargetChannel>> map) {
        final String str = MRAIDCommunicatorUtil.STATES_DEFAULT;
        if (!TextUtils.isEmpty(MRAIDCommunicatorUtil.STATES_DEFAULT)) {
            if (a()) {
                if (b(map)) {
                    b.h().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.a.1
                        private /* synthetic */ com.bykv.vk.openvk.preload.geckox.e.a.a b = null;
                        private /* synthetic */ Map c = null;

                        @Override // java.lang.Runnable
                        public final void run() {
                            com.bykv.vk.openvk.preload.geckox.a.a.b bVarA;
                            GeckoLogger.d("gecko-debug-tag", "start check update...", str);
                            if (a.this.d.b() != null) {
                                bVarA = a.this.d.b().a();
                                bVarA.a(a.this.d.b(), a.this.d.l(), a.this.d.e());
                            } else {
                                bVarA = null;
                            }
                            try {
                                try {
                                    a.this.d.a(new JSONObject());
                                    GeckoLogger.d("gecko-debug-tag", "update finished", com.bykv.vk.openvk.preload.geckox.g.a.a(a.this.e, a.this.d, a.this.b, map, str).a(str));
                                    if (bVarA != null) {
                                        bVarA.a();
                                    }
                                    a.this.d.n().upload("download_gecko_end", a.this.d.f());
                                    GeckoLogger.d("gecko-debug-tag", "all channel update finished");
                                } catch (Exception e) {
                                    try {
                                        JSONObject jSONObject = new JSONObject();
                                        jSONObject.put("success", false);
                                        jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, e.toString());
                                        jSONObject.put("code", 2);
                                        a.this.d.a(jSONObject);
                                    } catch (Throwable unused) {
                                    }
                                    GeckoLogger.w("gecko-debug-tag", "Gecko update failed:", e);
                                    if (bVarA != null) {
                                        bVarA.a();
                                    }
                                    a.this.d.n().upload("download_gecko_end", a.this.d.f());
                                    GeckoLogger.d("gecko-debug-tag", "all channel update finished");
                                }
                                a.d(a.this);
                            } catch (Throwable th) {
                                if (bVarA != null) {
                                    bVarA.a();
                                }
                                a.this.d.n().upload("download_gecko_end", a.this.d.f());
                                GeckoLogger.d("gecko-debug-tag", "all channel update finished");
                                throw th;
                            }
                        }
                    });
                    return;
                }
                throw new IllegalArgumentException("target keys not in deployments keys");
            }
            throw new IllegalArgumentException("deployments keys not in local keys");
        }
        throw new IllegalArgumentException("groupType == null");
    }
}
