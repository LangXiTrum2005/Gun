package com.mbridge.msdk.foundation.same.report.crashreport;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.text.TextUtils;
import android.text.format.Formatter;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.directory.e;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class d implements Thread.UncaughtExceptionHandler {
    private static volatile d d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference<Context> f1231a;
    private Throwable b;
    private Thread.UncaughtExceptionHandler c;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Thread f1232a;
        final /* synthetic */ Throwable b;

        public a(Thread thread, Throwable th) {
            this.f1232a = thread;
            this.b = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                HashMap<String, Object> mapA = d.this.a();
                if (mapA == null || mapA.get("file") == null) {
                    return;
                }
                Object obj = mapA.get("report_info");
                JSONObject jSONObject = obj instanceof JSONObject ? (JSONObject) obj : null;
                Object obj2 = mapA.get("file");
                File file = obj2 instanceof File ? (File) obj2 : null;
                if (jSONObject != null) {
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
                }
                com.mbridge.msdk.foundation.same.d.a(file);
                d.this.a(this.f1232a, this.b);
            } catch (Throwable unused) {
                d.this.a(this.f1232a, this.b);
            }
        }
    }

    private d(Context context) {
        this.f1231a = new WeakReference<>(context);
    }

    public static String b(Context context) {
        try {
            return context.getApplicationContext().getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.getMessage();
            return "";
        }
    }

    public static d c(Context context) {
        if (d == null) {
            synchronized (d.class) {
                try {
                    if (d == null) {
                        d = new d(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public int d(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        try {
            this.b = th;
            String strB = b();
            List<String> listB = b(strB);
            if (listB.isEmpty()) {
                a(a(th), strB, th, thread);
                return;
            }
            Iterator<String> it = listB.iterator();
            while (it.hasNext()) {
                a(a(th), it.next(), th, thread);
            }
        } catch (Exception e) {
            a(thread, th);
            AbstractC3888ke0.q(e, new StringBuilder("uncaughtException failed: "), "CrashHandlerUtil");
        }
    }

    public static List<String> a(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        try {
            Matcher matcher = Pattern.compile(str2).matcher(str);
            while (matcher.find()) {
                arrayList.add(matcher.group(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    public static String b() {
        try {
            g gVarD = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
            if (gVarD == null) {
                gVarD = h.b().a();
            }
            String strP = gVarD.P();
            return TextUtils.isEmpty(strP) ? "<mvpackage>mbridge</mvpackage>" : strP;
        } catch (Exception unused) {
            return "<mvpackage>mbridge</mvpackage>";
        }
    }

    public void c() {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler == null || (defaultUncaughtExceptionHandler instanceof d)) {
            return;
        }
        this.c = defaultUncaughtExceptionHandler;
        this.b = null;
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    public static List<String> b(String str) {
        try {
            List<String> listA = a(str, "<mvpackage>(.*?)</mvpackage>");
            return listA == null ? new ArrayList() : listA;
        } catch (Exception unused) {
            return new ArrayList();
        }
    }

    public JSONObject a(Throwable th, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObjectA = a(str);
            if (jSONObjectA == null) {
                return null;
            }
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            jSONObjectA.put("crashinfo", stringWriter.toString());
            String string = jSONObjectA.toString();
            jSONObject.put("key", "2000052");
            jSONObject.put("crash_first_index_from_mtg", c.a(th.getStackTrace()));
            jSONObject.put("exception", string);
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00b2  */
    public HashMap<String, Object> a() throws Throwable {
        PrintWriter printWriter;
        HashMap<String, Object> map = new HashMap<>();
        PrintWriter printWriter2 = null;
        if (this.b == null) {
            return null;
        }
        String strB = e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_CRASH_INFO);
        File file = new File(DM.h(strB, "/"));
        if (!file.exists()) {
            file.mkdirs();
        }
        String str = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis()));
        File file2 = new File(AbstractC3888ke0.j(strB, "/sdkcrash", str, ".txt"));
        try {
            printWriter = new PrintWriter(new BufferedWriter(new FileWriter(file2)));
            try {
                JSONObject jSONObjectA = a(this.b, str);
                printWriter.println(jSONObjectA.toString());
                printWriter.println("====");
                this.b.printStackTrace(printWriter);
                printWriter.close();
                map.put("file", file2);
                map.put("time", str);
                map.put("report_info", jSONObjectA);
                printWriter.close();
                return map;
            } catch (Exception e) {
                e = e;
                try {
                    if (MBridgeConstans.DEBUG) {
                        o0.b("dumpExceptionToSDCard", "dumpExceptionToSDCard failed: " + e.getMessage());
                    }
                    if (printWriter != null) {
                        printWriter.close();
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    printWriter2 = printWriter;
                    printWriter = printWriter2;
                    if (printWriter != null) {
                        printWriter.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                if (printWriter != null) {
                    printWriter.close();
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            printWriter = null;
        } catch (Throwable th3) {
            th = th3;
            printWriter = printWriter2;
            if (printWriter != null) {
                printWriter.close();
            }
            throw th;
        }
    }

    public String a(Context context) {
        try {
            return context.getResources().getString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.labelRes);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public JSONObject a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Context context = this.f1231a.get();
        if (context == null) {
            return null;
        }
        float fMaxMemory = (float) ((Runtime.getRuntime().maxMemory() * 1.0d) / 1048576.0d);
        float f = (float) ((Runtime.getRuntime().totalMemory() * 1.0d) / 1048576.0d);
        float fFreeMemory = (float) ((Runtime.getRuntime().freeMemory() * 1.0d) / 1048576.0d);
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        long usableSpace = externalStorageDirectory.getUsableSpace();
        long totalSpace = externalStorageDirectory.getTotalSpace();
        String fileSize = Formatter.formatFileSize(context, usableSpace);
        String fileSize2 = Formatter.formatFileSize(context, totalSpace);
        jSONObject.put("max_memory", String.valueOf(fMaxMemory));
        jSONObject.put("memoryby_app", String.valueOf(f));
        jSONObject.put("remaining_memory", fFreeMemory);
        jSONObject.put("sdcard_remainder", fileSize);
        jSONObject.put("totalspacestr", fileSize2);
        jSONObject.put("crashtime", str);
        String strB = com.mbridge.msdk.foundation.controller.c.n().b();
        if (TextUtils.isEmpty(strB)) {
            strB = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("app_id");
        }
        if (!TextUtils.isEmpty(strB)) {
            jSONObject.put("appid", strB);
        }
        try {
            jSONObject.put("osversion", Build.VERSION.SDK_INT);
            jSONObject.put("appversioncode", d(context));
            jSONObject.put("appversionname", b(context));
            jSONObject.put("appname", a(context));
        } catch (Exception unused) {
            jSONObject.put("osversion", 0);
            jSONObject.put("appversioncode", "-1");
            jSONObject.put("appversionname", "-1");
            jSONObject.put("appname", "");
        }
        return jSONObject;
    }

    public String a(Throwable th) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb.append(stackTraceElement.toString() + "\n");
        }
        return sb.toString();
    }

    public void a(String str, String str2, Throwable th, Thread thread) {
        if (!TextUtils.isEmpty(str) && str.contains(str2)) {
            a(th, thread);
            return;
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.c;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    private void a(Throwable th, Thread thread) {
        try {
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new a(thread, th));
        } catch (Throwable unused) {
            a(thread, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Thread thread, Throwable th) {
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Process.killProcess(Process.myPid());
    }
}
