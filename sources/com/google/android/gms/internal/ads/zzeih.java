package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdError;

/* JADX INFO: loaded from: classes3.dex */
final class zzeih implements zzcxc {
    boolean zza = false;
    final /* synthetic */ zzecz zzb;
    final /* synthetic */ zzcab zzc;

    public zzeih(zzeii zzeiiVar, zzecz zzeczVar, zzcab zzcabVar) {
        this.zzb = zzeczVar;
        this.zzc = zzcabVar;
    }

    private final synchronized void zze(com.google.android.gms.ads.internal.client.zze zzeVar) {
        int i = 1;
        if (true == ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfu)).booleanValue()) {
            i = 3;
        }
        this.zzc.zzd(new zzeda(i, zzeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final synchronized void zza(int i) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(new com.google.android.gms.ads.internal.client.zze(i, zzeii.zze(this.zzb.zza, i), AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final synchronized void zzb(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final synchronized void zzc(int i, @Nullable String str) {
        try {
            if (this.zza) {
                return;
            }
            this.zza = true;
            if (str == null) {
                str = zzeii.zze(this.zzb.zza, i);
            }
            zze(new com.google.android.gms.ads.internal.client.zze(i, str, AdError.UNDEFINED_DOMAIN, null, null));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final synchronized void zzd() {
        this.zzc.zzc(null);
    }
}
