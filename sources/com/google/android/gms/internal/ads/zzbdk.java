package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import com.umeng.ccg.a;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbdk extends CustomTabsServiceConnection {
    public static final /* synthetic */ int zza = 0;
    private final AtomicBoolean zzb = new AtomicBoolean(false);

    @Nullable
    private Context zzc;

    @Nullable
    private zzdrw zzd;

    @Nullable
    private CustomTabsSession zze;

    @Nullable
    private CustomTabsClient zzf;

    private final void zzf(@Nullable Context context) {
        String packageName;
        if (this.zzf != null || context == null || (packageName = CustomTabsClient.getPackageName(context, null)) == null) {
            return;
        }
        CustomTabsClient.bindCustomTabsService(context, packageName, this);
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public final void onCustomTabsServiceConnected(@NonNull ComponentName componentName, @NonNull CustomTabsClient customTabsClient) {
        this.zzf = customTabsClient;
        customTabsClient.warmup(0L);
        this.zze = customTabsClient.newSession(new zzbdj(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.zzf = null;
        this.zze = null;
    }

    @Nullable
    public final CustomTabsSession zza() {
        if (this.zze == null) {
            zzbzw.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbdi
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzc();
                }
            });
        }
        return this.zze;
    }

    public final void zzb(Context context, zzdrw zzdrwVar) {
        if (this.zzb.getAndSet(true)) {
            return;
        }
        this.zzc = context;
        this.zzd = zzdrwVar;
        zzf(context);
    }

    public final /* synthetic */ void zzc() {
        zzf(this.zzc);
    }

    public final /* synthetic */ void zzd(int i) {
        zzdrw zzdrwVar = this.zzd;
        if (zzdrwVar != null) {
            zzdrv zzdrvVarZza = zzdrwVar.zza();
            zzdrvVarZza.zzb(a.w, "cct_nav");
            zzdrvVarZza.zzb("cct_navs", String.valueOf(i));
            zzdrvVarZza.zzg();
        }
    }

    @VisibleForTesting
    public final void zze(final int i) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzeF)).booleanValue() || this.zzd == null) {
            return;
        }
        zzbzw.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbdh
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd(i);
            }
        });
    }
}
