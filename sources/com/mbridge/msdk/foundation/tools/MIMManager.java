package com.mbridge.msdk.foundation.tools;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.umeng.analytics.pro.bc;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.net.URLEncoder;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class MIMManager {
    private static volatile String i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f1256a;
    private int b;
    private CopyOnWriteArrayList<CampaignEx> c;
    private Context d;
    private volatile Boolean e;
    private CampaignEx f;
    private volatile g g;
    private volatile MiOverseaMiniCardBroadcasterReceiver h;

    public static class MiOverseaMiniCardBroadcasterReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (i0.a("DFKwWgtuDkKwLZPwD+z8H+N/xjK+n3eyNVx6ZVPn5jcincKZx5f5ncN=").equals(intent.getAction())) {
                String stringExtra = intent.getStringExtra(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);
                int intExtra = intent.getIntExtra("errorCode", 0);
                int intExtra2 = intExtra < 0 ? intent.getIntExtra("reason", 0) : -1;
                o0.b("MIMManager", stringExtra + " " + intExtra + " " + intExtra2);
                if (intExtra == 1 || intExtra == 2 || intExtra == 3 || intExtra == 4 || intExtra == 7) {
                    try {
                        com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
                        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                        eVar.a("key", URLEncoder.encode("m_mini_card", "utf-8"));
                        CampaignEx campaignExA = MIMManager.b().a(stringExtra);
                        if (campaignExA != null) {
                            eVar.a("rid", campaignExA.getRequestId());
                            eVar.a("rid_n", campaignExA.getRequestIdNotice());
                            eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, campaignExA.getCampaignUnitId());
                            eVar.a("u_stid", com.mbridge.msdk.foundation.controller.a.s.get(campaignExA.getCampaignUnitId()));
                            cVar.a(campaignExA);
                        }
                        eVar.a(NotificationCompat.CATEGORY_EVENT, String.valueOf(intExtra));
                        eVar.a("pkg_name", stringExtra);
                        if (intExtra2 != -1) {
                            eVar.a("reasonCode", String.valueOf(intExtra2));
                        }
                        cVar.a("m_mini_card", eVar);
                        com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_mini_card", cVar);
                    } catch (Exception e) {
                        o0.b("MIMManager", e.getMessage());
                    }
                }
            }
        }
    }

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f1257a;

        public a(Context context) {
            this.f1257a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MIMManager.this.f1256a.compareAndSet(false, true)) {
                try {
                    MIMManager mIMManager = MIMManager.this;
                    mIMManager.e = mIMManager.a();
                } catch (Exception e) {
                    o0.a("MIMManager", e.getMessage());
                }
                if (MIMManager.this.e == null || !MIMManager.this.e.booleanValue() || this.f1257a == null) {
                    return;
                }
                try {
                    MIMManager.this.g = new g(null);
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction(i0.a("DFKwWgtuDkKwLZPwD+z8H+N/xj26Vjcdx5KyVj5GxVN="));
                    intentFilter.addAction(i0.a("DFKwWgtuDkKwLZPwD+z8H+N/xj26Vjcdx5KanjKnxVN="));
                    intentFilter.addAction(i0.a("DFKwWgtuDkKwLZPwD+z8H+N/xjQZxVfV+T2SZVe6V2xS5c5n"));
                    this.f1257a.registerReceiver(MIMManager.this.g, intentFilter);
                } catch (Exception e2) {
                    o0.a("MIMManager", e2.getMessage());
                }
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f1258a;
        final /* synthetic */ CampaignEx b;

        public b(Context context, CampaignEx campaignEx) {
            this.f1258a = context;
            this.b = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                MIMManager.this.e(this.f1258a, this.b);
            } catch (Exception e) {
                o0.b("MIMManager", e.getMessage());
            }
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f1259a;
        final /* synthetic */ CampaignEx b;

        public c(Context context, CampaignEx campaignEx) {
            this.f1259a = context;
            this.b = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                MIMManager.this.d(this.f1259a, this.b);
            } catch (Exception e) {
                o0.b("MIMManager", e.getMessage());
            }
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f1260a;
        final /* synthetic */ CampaignEx b;

        public d(Context context, CampaignEx campaignEx) {
            this.f1260a = context;
            this.b = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                MIMManager.this.f(this.f1260a, this.b);
            } catch (Exception e) {
                o0.b("MIMManager", e.getMessage());
            } finally {
                if (MIMManager.this.c != null && MIMManager.this.c.contains(this.b)) {
                    MIMManager.this.c.remove(this.b);
                }
            }
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f1261a;
        final /* synthetic */ String b;
        final /* synthetic */ CampaignEx c;
        final /* synthetic */ int d;

        public e(Context context, String str, CampaignEx campaignEx, int i) {
            this.f1261a = context;
            this.b = str;
            this.c = campaignEx;
            this.d = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (this.f1261a == null || TextUtils.isEmpty(this.b) || this.c == null) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key", "2000100");
                jSONObject.put(bc.T, k0.s(this.f1261a));
                jSONObject.put("rid", this.c.getRequestId());
                jSONObject.put("rid_n", this.c.getRequestIdNotice());
                if (!TextUtils.isEmpty(this.c.getCampaignUnitId())) {
                    jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.c.getCampaignUnitId());
                    String str = com.mbridge.msdk.foundation.controller.a.s.get(this.c.getCampaignUnitId());
                    if (str == null) {
                        str = "";
                    }
                    jSONObject.put("u_stid", str);
                }
                jSONObject.put(BidResponsedEx.KEY_CID, this.c.getId());
                jSONObject.put(NotificationCompat.CATEGORY_STATUS, this.b);
                jSONObject.put("code", this.d);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
            } catch (Throwable th) {
                o0.b("MIMManager", th.getMessage());
            }
        }
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final MIMManager f1262a = new MIMManager(null);
    }

    public static class g extends BroadcastReceiver {
        private g() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            CampaignEx campaignExA;
            String action = intent.getAction();
            if (TextUtils.isEmpty(action) || action.equals(i0.a("DFKwWgtuDkKwLZPwD+z8H+N/xj26Vjcdx5KyVj5GxVN=")) || action.equals(i0.a("DFKwWgtuDkKwLZPwD+z8H+N/xj26Vjcdx5KanjKnxVN=")) || !action.equals(i0.a("DFKwWgtuDkKwLZPwD+z8H+N/xjQZxVfV+T2SZVe6V2xS5c5n"))) {
                return;
            }
            try {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    return;
                }
                int i = extras.getInt("statusCode", -1);
                String string = extras.getString(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, "");
                if (i == -1 || TextUtils.isEmpty(string) || (campaignExA = MIMManager.b().a(string)) == null) {
                    return;
                }
                MIMManager.b().a(context, campaignExA, i);
                MIMManager.b().a(context, "dm_page_status", i, MIMManager.b().c());
            } catch (Exception e) {
                o0.b("MIMManager", e.getMessage());
            }
        }

        public /* synthetic */ g(a aVar) {
            this();
        }
    }

    public /* synthetic */ MIMManager(a aVar) {
        this();
    }

    public void f() {
        this.b++;
    }

    public void g() {
        int i2 = this.b - 1;
        this.b = i2;
        if (i2 <= 0) {
            a(this.d);
        }
    }

    public void h() {
        try {
            if (this.h == null) {
                this.h = new MiOverseaMiniCardBroadcasterReceiver();
            }
            IntentFilter intentFilter = new IntentFilter(i0.a("DFKwWgtuDkKwLZPwD+z8H+N/xjK+n3eyNVx6ZVPn5jcincKZx5f5ncN="));
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            if (contextD != null) {
                contextD.registerReceiver(this.h, intentFilter);
            }
        } catch (Exception e2) {
            o0.a("MIMManager", e2.getMessage());
        }
    }

    public void i() {
        try {
            if (this.h != null) {
                Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                if (contextD != null) {
                    contextD.unregisterReceiver(this.h);
                }
                this.f = null;
                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.c;
                if (copyOnWriteArrayList != null) {
                    copyOnWriteArrayList.clear();
                }
                this.c = null;
                this.h = null;
            }
        } catch (Exception e2) {
            o0.a("MIMManager", e2.getMessage());
        }
    }

    private MIMManager() {
        this.b = 0;
        this.c = new CopyOnWriteArrayList<>();
        this.f1256a = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Context context, CampaignEx campaignEx) {
        String[] strArrW;
        if (campaignEx != null) {
            try {
                com.mbridge.msdk.foundation.entity.j nativeVideoTracking = campaignEx.getNativeVideoTracking();
                if (nativeVideoTracking == null || (strArrW = nativeVideoTracking.w()) == null) {
                    return;
                }
                for (String str : strArrW) {
                    com.mbridge.msdk.click.a.a(context, campaignEx, campaignEx.getCampaignUnitId(), str, false, false);
                }
            } catch (Exception e2) {
                o0.b("MIMManager", e2.getMessage());
            }
        }
    }

    public String d() {
        try {
            if (i == null) {
                return "";
            }
            return "[" + i + "]";
        } catch (Exception unused) {
            return "";
        }
    }

    public Boolean e() {
        return this.e;
    }

    public static MIMManager b() {
        return f.f1262a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Context context, CampaignEx campaignEx) {
        String[] strArrU;
        if (campaignEx != null) {
            try {
                com.mbridge.msdk.foundation.entity.j nativeVideoTracking = campaignEx.getNativeVideoTracking();
                if (nativeVideoTracking == null || (strArrU = nativeVideoTracking.u()) == null) {
                    return;
                }
                for (String str : strArrU) {
                    com.mbridge.msdk.click.a.a(context, campaignEx, campaignEx.getCampaignUnitId(), str, false, false);
                }
            } catch (Exception e2) {
                o0.b("MIMManager", e2.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Context context, CampaignEx campaignEx) {
        String[] strArrV;
        if (campaignEx != null) {
            try {
                com.mbridge.msdk.foundation.entity.j nativeVideoTracking = campaignEx.getNativeVideoTracking();
                if (nativeVideoTracking == null || (strArrV = nativeVideoTracking.v()) == null) {
                    return;
                }
                for (String str : strArrV) {
                    com.mbridge.msdk.click.a.a(context, campaignEx, campaignEx.getCampaignUnitId(), str, false, false);
                }
            } catch (Exception e2) {
                o0.b("MIMManager", e2.getMessage());
            }
        }
    }

    public CampaignEx c() {
        return this.f;
    }

    private Runnable c(Context context, CampaignEx campaignEx) {
        return new d(context, campaignEx);
    }

    public void b(Context context) {
        this.d = context;
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new a(context));
    }

    public void a(CampaignEx campaignEx) {
        try {
            if (this.e != null && campaignEx != null && this.e.booleanValue()) {
                this.f = campaignEx;
                this.c.add(campaignEx);
            }
            if (com.mbridge.msdk.util.b.b() && campaignEx != null && campaignEx.getDeepLinkURL().startsWith("mimarket")) {
                if (this.h == null) {
                    h();
                }
                this.f = campaignEx;
                this.c.add(campaignEx);
            }
        } catch (Exception e2) {
            o0.b("MIMManager", e2.getMessage());
        }
    }

    public void b(CampaignEx campaignEx) {
        try {
            if (this.e == null || campaignEx == null || !this.e.booleanValue()) {
                return;
            }
            this.f = null;
            try {
                this.c.remove(campaignEx);
            } catch (Exception e2) {
                o0.a("MIMManager", e2.getMessage());
            }
        } catch (Exception e3) {
            o0.b("MIMManager", e3.getMessage());
        }
    }

    private Runnable b(Context context, CampaignEx campaignEx) {
        return new b(context, campaignEx);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CampaignEx a(String str) {
        try {
            CampaignEx campaignEx = this.f;
            if (campaignEx != null && TextUtils.equals(campaignEx.getPackageName(), str)) {
                return this.f;
            }
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.c;
            if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
                return null;
            }
            for (CampaignEx campaignEx2 : this.c) {
                if (campaignEx2 != null && TextUtils.equals(campaignEx2.getPackageName(), str)) {
                    return campaignEx2;
                }
            }
            return null;
        } catch (Exception e2) {
            o0.b("MIMManager", e2.getMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Boolean a() {
        Cursor cursorQuery;
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        Boolean boolValueOf = null;
        if (contextD != null) {
            try {
                if (contextD.getContentResolver() != null) {
                    try {
                        cursorQuery = contextD.getContentResolver().query(Uri.parse(i0.a("DFK/J75/JaEXWFfXYZP9LkcXYk3/YkcBLF5TWgSBYbHuH75BW3xuhr5UJj2tLkeNhrKFLkxQhl==")), null, null, null, null);
                    } catch (Exception unused) {
                        cursorQuery = null;
                    }
                    if (cursorQuery != null) {
                        while (cursorQuery.moveToNext()) {
                            try {
                                String string = cursorQuery.getString(cursorQuery.getColumnIndex("support"));
                                if (!TextUtils.isEmpty(string) && !string.equalsIgnoreCase("null") && (string.equalsIgnoreCase("false") || string.equalsIgnoreCase("true"))) {
                                    boolValueOf = Boolean.valueOf(Boolean.parseBoolean(string));
                                }
                            } catch (Exception e2) {
                                o0.a("MIMManager", e2.getMessage());
                            }
                            try {
                                i = cursorQuery.getString(cursorQuery.getColumnIndex("detailStyle"));
                            } catch (Exception e3) {
                                o0.a("MIMManager", e3.getMessage());
                            }
                        }
                        try {
                            cursorQuery.close();
                        } catch (Exception e4) {
                            o0.a("MIMManager", e4.getMessage());
                        }
                    }
                }
            } catch (Exception e5) {
                o0.b("MIMManager", e5.getMessage());
            }
        }
        return boolValueOf;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0030 A[PHI: r4
  0x0030: PHI (r4v7 java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx>) = 
  (r4v6 java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx>)
  (r4v8 java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx>)
 binds: [B:20:0x002e, B:16:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    public void a(Context context) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList;
        if (context != null) {
            try {
                try {
                    if (this.g != null) {
                        context.unregisterReceiver(this.g);
                    }
                    if (this.h != null) {
                        context.unregisterReceiver(this.h);
                    }
                    this.f = null;
                    copyOnWriteArrayList = this.c;
                    if (copyOnWriteArrayList != null) {
                        copyOnWriteArrayList.clear();
                    }
                } catch (Exception e2) {
                    o0.a("MIMManager", e2.getMessage());
                    this.f = null;
                    copyOnWriteArrayList = this.c;
                    if (copyOnWriteArrayList != null) {
                        copyOnWriteArrayList.clear();
                    }
                }
                this.c = null;
                this.g = null;
                this.d = null;
            } catch (Throwable th) {
                this.f = null;
                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = this.c;
                if (copyOnWriteArrayList2 != null) {
                    copyOnWriteArrayList2.clear();
                }
                this.c = null;
                this.g = null;
                this.d = null;
                throw th;
            }
        }
        try {
            i();
        } catch (Throwable th2) {
            o0.b("MIMManager", th2.getMessage());
        }
    }

    public void a(Context context, CampaignEx campaignEx, int i2) {
        Runnable runnableB;
        if (i2 == 3001) {
            runnableB = b(context, campaignEx);
        } else if (i2 != 3002) {
            runnableB = i2 != 3008 ? null : c(context, campaignEx);
        } else {
            runnableB = a(context, campaignEx);
        }
        if (runnableB != null) {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(runnableB);
        }
    }

    private Runnable a(Context context, CampaignEx campaignEx) {
        return new c(context, campaignEx);
    }

    public void a(Context context, String str, int i2, CampaignEx campaignEx) {
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new e(context, str, campaignEx, i2));
    }
}
