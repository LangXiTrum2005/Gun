package com.mbridge.msdk.click;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.widget.Toast;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.activity.MBCommonActivity;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.d0;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static Handler f952a = new a(Looper.getMainLooper());

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            String str;
            String str2;
            String string;
            super.handleMessage(message);
            try {
                if (message.what == 1000) {
                    int i = message.arg1;
                    int i2 = message.arg2;
                    Bundle data = message.getData();
                    if (data != null) {
                        String string2 = data.getString("rid");
                        String string3 = data.getString("rid_n");
                        string = data.getString(BidResponsedEx.KEY_CID);
                        str = string2;
                        str2 = string3;
                    } else {
                        str = "";
                        str2 = str;
                        string = str2;
                    }
                    new com.mbridge.msdk.foundation.same.report.h(com.mbridge.msdk.foundation.controller.c.n().d()).a(i, i2, str, str2, string);
                }
            } catch (Throwable th) {
                if (MBridgeConstans.DEBUG) {
                    th.printStackTrace();
                }
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f953a;
        final /* synthetic */ String b;

        public b(Context context, String str) {
            this.f953a = context;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = d0.class.getMethod("mia", Context.class, String.class);
                Context context = this.f953a;
                if (context != null) {
                    method.invoke(null, context, this.b);
                } else {
                    o0.b("CommonClickUtil", "Context is null");
                }
            } catch (Throwable th) {
                o0.b("CommonClickUtil", th.getMessage());
            }
        }
    }

    public static boolean a(CampaignEx campaignEx) {
        return d.a(campaignEx);
    }

    public static void b(Context context, String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
            boolean z = listQueryIntentActivities.size() > 0;
            if (!str.startsWith("market://")) {
                if (str.startsWith("https://play.google.com/")) {
                    b(context, "market://details?id=" + str.replace("https://play.google.com/store/apps/details?id=", ""));
                    return;
                }
                return;
            }
            if (!z) {
                d(context, "https://play.google.com/store/apps/details?id=" + str.replace("market://details?id=", ""));
                return;
            }
            Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
            while (it.hasNext()) {
                if (it.next().activityInfo.packageName.equals("com.android.vending")) {
                    intent.setClassName("com.android.vending", "com.android.vending.AssetBrowserActivity");
                    break;
                }
            }
            try {
                context.startActivity(intent);
            } catch (Exception unused) {
                d(context, "https://play.google.com/store/apps/details?id=" + str.replace("market://details?id=", ""));
            }
        } catch (Exception e) {
            o0.b("CommonClickUtil", "Exception", e);
        }
    }

    public static void c(Context context, String str) {
        Intent launchIntentForPackage;
        List<ResolveInfo> listQueryIntentActivities;
        ResolveInfo next;
        try {
            if (TextUtils.isEmpty(str) || !a(context, str) || (launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str)) == null || (listQueryIntentActivities = context.getPackageManager().queryIntentActivities(launchIntentForPackage, 0)) == null || listQueryIntentActivities.size() <= 0 || (next = listQueryIntentActivities.iterator().next()) == null) {
                return;
            }
            ActivityInfo activityInfo = next.activityInfo;
            ComponentName componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
            Intent intent = new Intent();
            intent.setComponent(componentName);
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (Exception e) {
            if (com.mbridge.msdk.util.b.a()) {
                Toast.makeText(context, "The app connot start up", 0).show();
            }
            e.printStackTrace();
        }
    }

    public static void d(Context context, String str) {
        if (str == null || context == null) {
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
            if (resolveInfoResolveActivity != null) {
                ActivityInfo activityInfo = resolveInfoResolveActivity.activityInfo;
                intent.setClassName(activityInfo.packageName, activityInfo.name);
            }
            context.startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
            try {
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent2.addFlags(268435456);
                context.startActivity(intent2);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static boolean e(Context context, String str) {
        Intent intent;
        try {
            if (!TextUtils.isEmpty(str)) {
                Uri uri = Uri.parse(str);
                if (uri.getScheme().equals("intent")) {
                    intent = Intent.parseUri(str, 1);
                } else if (!uri.getScheme().equals("android-app") || Build.VERSION.SDK_INT < 22) {
                    intent = new Intent("android.intent.action.VIEW", uri);
                    intent.setData(uri);
                } else {
                    intent = Intent.parseUri(str, 2);
                }
                if (intent != null) {
                    intent.setComponent(null);
                    intent.setSelector(null);
                    if (a(context, intent)) {
                        return true;
                    }
                    intent.setFlags(268435456);
                    context.startActivity(intent);
                    return true;
                }
            }
        } catch (Throwable th) {
            o0.b("CommonClickUtil", th.getMessage(), th);
        }
        return false;
    }

    public static void f(Context context, String str) {
        if (context == null || str == null) {
            return;
        }
        try {
            int i = MBCommonActivity.e;
            Intent intent = new Intent(context, (Class<?>) MBCommonActivity.class);
            intent.putExtra("url", str);
            if (!(context instanceof ContextThemeWrapper)) {
                intent.setFlags(268435456);
            }
            context.startActivity(intent);
        } catch (ClassNotFoundException e) {
            o0.b("CommonClickUtil", e.getMessage());
        } catch (Throwable th) {
            o0.b("CommonClickUtil", th.getMessage());
        }
    }

    public static String a(String str, String str2, String str3) {
        Map<String, com.mbridge.msdk.setting.b.a> mapL;
        try {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            String host = Uri.parse(str).getHost();
            com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
            if (gVarD == null || (mapL = gVarD.l()) == null || TextUtils.isEmpty(host)) {
                return str;
            }
            Iterator<Map.Entry<String, com.mbridge.msdk.setting.b.a>> it = mapL.entrySet().iterator();
            while (it.hasNext()) {
                String key = it.next().getKey();
                if (!TextUtils.isEmpty(key) && host.contains(key)) {
                    com.mbridge.msdk.setting.b.a aVar = mapL.get(key);
                    return aVar != null ? a(a(a(a(str, aVar.a(), String.valueOf(k0.m(com.mbridge.msdk.foundation.controller.c.n().d()))), aVar.b(), String.valueOf(k0.n(com.mbridge.msdk.foundation.controller.c.n().d()))), aVar.c(), str2), aVar.d(), str3) : str;
                }
            }
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    private static String a(String str, List<String> list, String str2) {
        if (list != null) {
            for (String str3 : list) {
                if (!TextUtils.isEmpty(str3)) {
                    str = str.replaceAll(str3, str2);
                }
            }
        }
        return str;
    }

    public static boolean a(Context context, String str) {
        if (str != null && !"".equals(str)) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 8192);
                if (packageInfo != null) {
                    return str.equals(packageInfo.packageName);
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static boolean a(Context context, Intent intent) {
        try {
            if (context instanceof Activity) {
                context.startActivity(intent);
                return true;
            }
            if (com.mbridge.msdk.foundation.controller.c.n().f() != null) {
                Context contextF = com.mbridge.msdk.foundation.controller.c.n().f();
                if (!(contextF instanceof Activity)) {
                    return false;
                }
                contextF.startActivity(intent);
                return true;
            }
            return false;
        } catch (Throwable th) {
            o0.b("CommonClickUtil", th.getMessage(), th);
        }
    }

    public static void a(Context context, int i, String str) {
        if (i == 0) {
            return;
        }
        try {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new b(context, str));
        } catch (Throwable th) {
            o0.b("CommonClickUtil", th.getMessage());
        }
    }
}
