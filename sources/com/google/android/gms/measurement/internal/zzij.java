package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzpb;

/* JADX INFO: loaded from: classes3.dex */
@TargetApi(14)
@MainThread
@VisibleForTesting
final class zzij implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ zzik zza;

    public zzij(zzik zzikVar) {
        this.zza = zzikVar;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00c4  */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zzgd zzgdVar;
        Uri uri;
        try {
            try {
                this.zza.zzt.zzaA().zzj().zza("onActivityCreated");
                Intent intent = activity.getIntent();
                if (intent == null) {
                    zzgdVar = this.zza.zzt;
                } else {
                    zzpb.zzc();
                    Uri data = null;
                    if (this.zza.zzt.zzf().zzs(null, zzeg.zzaF)) {
                        Uri data2 = intent.getData();
                        if (data2 == null || !data2.isHierarchical()) {
                            Bundle extras = intent.getExtras();
                            if (extras != null) {
                                String string = extras.getString("com.android.vending.referral_url");
                                if (!TextUtils.isEmpty(string)) {
                                    data = Uri.parse(string);
                                }
                            }
                        } else {
                            uri = data2;
                        }
                        if (uri == null && uri.isHierarchical()) {
                            this.zza.zzt.zzv();
                            String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                            this.zza.zzt.zzaB().zzp(new zzii(this, bundle == null, uri, ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) ? "gs" : "auto", uri.getQueryParameter("referrer")));
                            zzgdVar = this.zza.zzt;
                        } else {
                            zzgdVar = this.zza.zzt;
                        }
                    } else {
                        data = intent.getData();
                    }
                    uri = data;
                    if (uri == null) {
                        zzgdVar = this.zza.zzt;
                    } else {
                        zzgdVar = this.zza.zzt;
                    }
                }
            } catch (RuntimeException e) {
                this.zza.zzt.zzaA().zzd().zzb("Throwable caught in onActivityCreated", e);
                zzgdVar = this.zza.zzt;
            }
            zziz zzizVarZzs = zzgdVar.zzs();
        } finally {
            this.zza.zzt.zzs().zzr(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.zza.zzt.zzs().zzs(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @MainThread
    public final void onActivityPaused(Activity activity) {
        this.zza.zzt.zzs().zzt(activity);
        zzkp zzkpVarZzu = this.zza.zzt.zzu();
        zzkpVarZzu.zzt.zzaB().zzp(new zzki(zzkpVarZzu, zzkpVarZzu.zzt.zzax().elapsedRealtime()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @MainThread
    public final void onActivityResumed(Activity activity) {
        zzkp zzkpVarZzu = this.zza.zzt.zzu();
        zzkpVarZzu.zzt.zzaB().zzp(new zzkh(zzkpVarZzu, zzkpVarZzu.zzt.zzax().elapsedRealtime()));
        this.zza.zzt.zzs().zzu(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.zza.zzt.zzs().zzv(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
