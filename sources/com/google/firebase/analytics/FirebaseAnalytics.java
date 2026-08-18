package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import androidx.annotation.Size;
import androidx.work.WorkRequest;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzef;
import com.google.android.gms.measurement.internal.zzil;
import com.google.android.gms.tasks.Tasks;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4266ou;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4617su;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4705tu;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.jp0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public final class FirebaseAnalytics {
    public static volatile FirebaseAnalytics b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzef f842a;

    public FirebaseAnalytics(zzef zzefVar) {
        Preconditions.checkNotNull(zzefVar);
        this.f842a = zzefVar;
    }

    @NonNull
    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @Keep
    public static FirebaseAnalytics getInstance(@NonNull Context context) {
        if (b == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (b == null) {
                        b = new FirebaseAnalytics(zzef.zzg(context, null, null, null, null));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    @Nullable
    @Keep
    public static zzil getScionFrontendApiImplementation(Context context, @Nullable Bundle bundle) {
        zzef zzefVarZzg = zzef.zzg(context, null, null, null, bundle);
        if (zzefVarZzg == null) {
            return null;
        }
        return new jp0(zzefVarZzg);
    }

    @NonNull
    @Keep
    public String getFirebaseInstanceId() {
        try {
            Object obj = C4617su.m;
            C4266ou c4266ouB = C4266ou.b();
            Preconditions.checkArgument(true, "Null is not a valid value of FirebaseApp.");
            c4266ouB.a();
            return (String) Tasks.await(((C4617su) c4266ouB.d.a(InterfaceC4705tu.class)).d(), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        } catch (ExecutionException e2) {
            throw new IllegalStateException(e2.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @MainThread
    @Deprecated
    public void setCurrentScreen(@NonNull Activity activity, @Nullable @Size(max = 36, min = 1) String str, @Nullable @Size(max = 36, min = 1) String str2) {
        this.f842a.zzH(activity, str, str2);
    }
}
