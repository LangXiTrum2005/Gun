package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.MobileAds;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzazc implements Application.ActivityLifecycleCallbacks {

    @Nullable
    private Activity zza;
    private Context zzb;
    private Runnable zzh;
    private long zzj;
    private final Object zzc = new Object();
    private boolean zzd = true;
    private boolean zze = false;
    private final List zzf = new ArrayList();
    private final List zzg = new ArrayList();
    private boolean zzi = false;

    private final void zzk(Activity activity) {
        synchronized (this.zzc) {
            try {
                if (!activity.getClass().getName().startsWith(MobileAds.ERROR_DOMAIN)) {
                    this.zza = activity;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.zzc) {
            try {
                Activity activity2 = this.zza;
                if (activity2 == null) {
                    return;
                }
                if (activity2.equals(activity)) {
                    this.zza = null;
                }
                Iterator it = this.zzg.iterator();
                while (it.hasNext()) {
                    try {
                        if (((zzazr) it.next()).zza()) {
                            it.remove();
                        }
                    } catch (Exception e) {
                        com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        zzk(activity);
        synchronized (this.zzc) {
            Iterator it = this.zzg.iterator();
            while (it.hasNext()) {
                try {
                    ((zzazr) it.next()).zzb();
                } catch (Exception e) {
                    com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AppActivityTracker.ActivityListener.onActivityPaused");
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
                }
            }
        }
        this.zze = true;
        Runnable runnable = this.zzh;
        if (runnable != null) {
            com.google.android.gms.ads.internal.util.zzs.zza.removeCallbacks(runnable);
        }
        zzfqw zzfqwVar = com.google.android.gms.ads.internal.util.zzs.zza;
        zzazb zzazbVar = new zzazb(this);
        this.zzh = zzazbVar;
        zzfqwVar.postDelayed(zzazbVar, this.zzj);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        zzk(activity);
        this.zze = false;
        boolean z = !this.zzd;
        this.zzd = true;
        Runnable runnable = this.zzh;
        if (runnable != null) {
            com.google.android.gms.ads.internal.util.zzs.zza.removeCallbacks(runnable);
        }
        synchronized (this.zzc) {
            Iterator it = this.zzg.iterator();
            while (it.hasNext()) {
                try {
                    ((zzazr) it.next()).zzc();
                } catch (Exception e) {
                    com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "AppActivityTracker.ActivityListener.onActivityResumed");
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
                }
            }
            if (z) {
                Iterator it2 = this.zzf.iterator();
                while (it2.hasNext()) {
                    try {
                        ((zzazd) it2.next()).zza(true);
                    } catch (Exception e2) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("", e2);
                    }
                }
            } else {
                com.google.android.gms.ads.internal.util.client.zzo.zze("App is still foreground.");
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        zzk(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Nullable
    public final Activity zza() {
        return this.zza;
    }

    @Nullable
    public final Context zzb() {
        return this.zzb;
    }

    public final void zzf(zzazd zzazdVar) {
        synchronized (this.zzc) {
            this.zzf.add(zzazdVar);
        }
    }

    public final void zzg(Application application, Context context) {
        if (this.zzi) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
        if (context instanceof Activity) {
            zzk((Activity) context);
        }
        this.zzb = application;
        this.zzj = ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzbc)).longValue();
        this.zzi = true;
    }

    public final void zzh(zzazd zzazdVar) {
        synchronized (this.zzc) {
            this.zzf.remove(zzazdVar);
        }
    }
}
