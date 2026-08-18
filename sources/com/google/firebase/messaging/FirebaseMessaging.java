package com.google.firebase.messaging;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.webkit.ProxyConfig;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2294Ar;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2504It;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3285dk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4092mw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4266ou;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4483rP;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.F90;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ia0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4320pa0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4705tu;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RY;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Td0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y60;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Zc0;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class FirebaseMessaging {
    public static final long j = TimeUnit.HOURS.toSeconds(8);
    public static C2294Ar k;
    public static Td0 l;
    public static ScheduledThreadPoolExecutor m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4266ou f844a;
    public final Context b;
    public final C4092mw c;
    public final RY d;
    public final Y60 e;
    public final Executor f;
    public final Executor g;
    public final C4483rP h;
    public boolean i;

    public FirebaseMessaging(C4266ou c4266ou, AW aw, AW aw2, InterfaceC4705tu interfaceC4705tu, Td0 td0, InterfaceC4320pa0 interfaceC4320pa0) {
        c4266ou.a();
        Context context = c4266ou.f4812a;
        final C4483rP c4483rP = new C4483rP(context);
        c4266ou.a();
        Rpc rpc = new Rpc(context);
        final C4092mw c4092mw = new C4092mw();
        c4092mw.c = c4266ou;
        c4092mw.b = c4483rP;
        c4092mw.d = rpc;
        c4092mw.e = aw;
        c4092mw.f = aw2;
        c4092mw.f4722a = interfaceC4705tu;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Task"));
        final int i = 1;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("Firebase-Messaging-File-Io"));
        final int i2 = 0;
        this.i = false;
        l = td0;
        this.f844a = c4266ou;
        this.e = new Y60(this, interfaceC4320pa0);
        c4266ou.a();
        final Context context2 = c4266ou.f4812a;
        this.b = context2;
        C2504It c2504It = new C2504It();
        this.h = c4483rP;
        this.f = executorServiceNewSingleThreadExecutor;
        this.c = c4092mw;
        this.d = new RY(executorServiceNewSingleThreadExecutor);
        this.g = threadPoolExecutor;
        c4266ou.a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(c2504It);
        } else {
            Objects.toString(context);
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.yu
            public final /* synthetic */ FirebaseMessaging b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                ApplicationInfo applicationInfo;
                Bundle bundle;
                int i3 = i2;
                FirebaseMessaging firebaseMessaging = this.b;
                switch (i3) {
                    case 0:
                        if (firebaseMessaging.e.d() && firebaseMessaging.g(firebaseMessaging.d())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.i) {
                                    firebaseMessaging.f(0L);
                                }
                                break;
                            }
                            return;
                        }
                        return;
                    default:
                        Context context3 = firebaseMessaging.b;
                        Context applicationContext = context3.getApplicationContext();
                        if (applicationContext == null) {
                            applicationContext = context3;
                        }
                        if (applicationContext.getSharedPreferences("com.google.firebase.messaging", 0).getBoolean("proxy_notification_initialized", false)) {
                            return;
                        }
                        N5 n5 = new N5(24);
                        try {
                            Context applicationContext2 = context3.getApplicationContext();
                            PackageManager packageManager = applicationContext2.getPackageManager();
                            z = (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext2.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_notification_delegation_enabled")) ? applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled") : true;
                            break;
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                        if (!PlatformVersion.isAtLeastQ()) {
                            Tasks.forResult(null);
                            return;
                        }
                        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                        n5.execute(new BW(context3, z, taskCompletionSource));
                        taskCompletionSource.getTask();
                        return;
                }
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Topics-Io"));
        int i3 = Zc0.j;
        Tasks.call(scheduledThreadPoolExecutor2, new Callable() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Yc0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Xc0 xc0;
                Context context3 = context2;
                ScheduledExecutorService scheduledExecutorService = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                C4483rP c4483rP2 = c4483rP;
                C4092mw c4092mw2 = c4092mw;
                synchronized (Xc0.class) {
                    try {
                        WeakReference weakReference = Xc0.d;
                        xc0 = weakReference != null ? (Xc0) weakReference.get() : null;
                        if (xc0 == null) {
                            Xc0 xc1 = new Xc0(context3.getSharedPreferences("com.google.android.gms.appid", 0), scheduledExecutorService);
                            xc1.b();
                            Xc0.d = new WeakReference(xc1);
                            xc0 = xc1;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return new Zc0(firebaseMessaging, c4483rP2, xc0, c4092mw2, context3, scheduledExecutorService);
            }
        }).addOnSuccessListener(scheduledThreadPoolExecutor, new OnSuccessListener() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.xu
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                boolean z;
                Zc0 zc0 = (Zc0) obj;
                if (!this.f5252a.e.d() || zc0.h.a() == null) {
                    return;
                }
                synchronized (zc0) {
                    z = zc0.g;
                }
                if (z) {
                    return;
                }
                zc0.g(0L);
            }
        });
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.yu
            public final /* synthetic */ FirebaseMessaging b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                ApplicationInfo applicationInfo;
                Bundle bundle;
                int i4 = i;
                FirebaseMessaging firebaseMessaging = this.b;
                switch (i4) {
                    case 0:
                        if (firebaseMessaging.e.d() && firebaseMessaging.g(firebaseMessaging.d())) {
                            synchronized (firebaseMessaging) {
                                if (!firebaseMessaging.i) {
                                    firebaseMessaging.f(0L);
                                }
                                break;
                            }
                            return;
                        }
                        return;
                    default:
                        Context context3 = firebaseMessaging.b;
                        Context applicationContext = context3.getApplicationContext();
                        if (applicationContext == null) {
                            applicationContext = context3;
                        }
                        if (applicationContext.getSharedPreferences("com.google.firebase.messaging", 0).getBoolean("proxy_notification_initialized", false)) {
                            return;
                        }
                        N5 n5 = new N5(24);
                        try {
                            Context applicationContext2 = context3.getApplicationContext();
                            PackageManager packageManager = applicationContext2.getPackageManager();
                            z = (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext2.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_notification_delegation_enabled")) ? applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled") : true;
                            break;
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                        if (!PlatformVersion.isAtLeastQ()) {
                            Tasks.forResult(null);
                            return;
                        }
                        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                        n5.execute(new BW(context3, z, taskCompletionSource));
                        taskCompletionSource.getTask();
                        return;
                }
            }
        });
    }

    public static void b(long j2, Ia0 ia0) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (m == null) {
                    m = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("TAG"));
                }
                m.schedule(ia0, j2, TimeUnit.SECONDS);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized C2294Ar c(Context context) {
        try {
            if (k == null) {
                k = new C2294Ar(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return k;
    }

    @NonNull
    @Keep
    public static synchronized FirebaseMessaging getInstance(@NonNull C4266ou c4266ou) {
        FirebaseMessaging firebaseMessaging;
        c4266ou.a();
        firebaseMessaging = (FirebaseMessaging) c4266ou.d.a(FirebaseMessaging.class);
        Preconditions.checkNotNull(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String a() {
        Task taskContinueWithTask;
        final F90 f90D = d();
        if (!g(f90D)) {
            return f90D.f3056a;
        }
        final String strC = C4483rP.c(this.f844a);
        RY ry = this.d;
        synchronized (ry) {
            taskContinueWithTask = (Task) ry.b.get(strC);
            if (taskContinueWithTask == null) {
                C4092mw c4092mw = this.c;
                taskContinueWithTask = c4092mw.c(c4092mw.f(C4483rP.c((C4266ou) c4092mw.c), ProxyConfig.MATCH_ALL_SCHEMES, new Bundle())).onSuccessTask(this.g, new SuccessContinuation() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.zu
                    @Override // com.google.android.gms.tasks.SuccessContinuation
                    public final Task then(Object obj) {
                        String string;
                        FirebaseMessaging firebaseMessaging = this.f5350a;
                        String str = strC;
                        F90 f90 = f90D;
                        String str2 = (String) obj;
                        C2294Ar c2294ArC = FirebaseMessaging.c(firebaseMessaging.b);
                        C4266ou c4266ou = firebaseMessaging.f844a;
                        c4266ou.a();
                        String strC2 = "[DEFAULT]".equals(c4266ou.b) ? "" : c4266ou.c();
                        String strA = firebaseMessaging.h.a();
                        synchronized (c2294ArC) {
                            try {
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                int i = F90.e;
                                try {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put(BidResponsed.KEY_TOKEN, str2);
                                    jSONObject.put("appVersion", strA);
                                    jSONObject.put("timestamp", jCurrentTimeMillis);
                                    string = jSONObject.toString();
                                } catch (JSONException e) {
                                    e.toString();
                                    string = null;
                                }
                                if (string != null) {
                                    SharedPreferences.Editor editorEdit = ((SharedPreferences) c2294ArC.b).edit();
                                    editorEdit.putString(strC2 + "|T|" + str + "|*", string);
                                    editorEdit.commit();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (f90 == null || !str2.equals(f90.f3056a)) {
                            C4266ou c4266ou2 = firebaseMessaging.f844a;
                            c4266ou2.a();
                            if ("[DEFAULT]".equals(c4266ou2.b)) {
                                if (Log.isLoggable("FirebaseMessaging", 3)) {
                                    c4266ou2.a();
                                }
                                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                                intent.putExtra(BidResponsed.KEY_TOKEN, str2);
                                new C2478Ht(firebaseMessaging.b).b(intent);
                            }
                        }
                        return Tasks.forResult(str2);
                    }
                }).continueWithTask(ry.f3661a, new C3285dk(15, ry, strC));
                ry.b.put(strC, taskContinueWithTask);
            }
        }
        try {
            return (String) Tasks.await(taskContinueWithTask);
        } catch (InterruptedException | ExecutionException e) {
            throw new IOException(e);
        }
    }

    public final F90 d() {
        F90 f90A;
        C2294Ar c2294ArC = c(this.b);
        C4266ou c4266ou = this.f844a;
        c4266ou.a();
        String strC = "[DEFAULT]".equals(c4266ou.b) ? "" : c4266ou.c();
        String strC2 = C4483rP.c(this.f844a);
        synchronized (c2294ArC) {
            f90A = F90.a(((SharedPreferences) c2294ArC.b).getString(strC + "|T|" + strC2 + "|*", null));
        }
        return f90A;
    }

    public final synchronized void e(boolean z) {
        this.i = z;
    }

    public final synchronized void f(long j2) {
        b(j2, new Ia0(this, Math.min(Math.max(30L, 2 * j2), j)));
        this.i = true;
    }

    public final boolean g(F90 f90) {
        if (f90 != null) {
            String strA = this.h.a();
            if (System.currentTimeMillis() <= f90.c + F90.d && strA.equals(f90.b)) {
                return false;
            }
        }
        return true;
    }
}
