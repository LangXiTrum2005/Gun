package com.google.android.gms.measurement.internal;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzfs implements com.google.android.gms.internal.measurement.zzr {
    final /* synthetic */ zzfu zza;

    public zzfs(zzfu zzfuVar) {
        this.zza = zzfuVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzr
    public final void zza(int i, String str, List list, boolean z, boolean z2) {
        zzer zzerVarZzc;
        int i2 = i - 1;
        if (i2 == 0) {
            zzerVarZzc = this.zza.zzt.zzaA().zzc();
        } else if (i2 != 1) {
            if (i2 == 3) {
                zzerVarZzc = this.zza.zzt.zzaA().zzj();
            } else if (i2 != 4) {
                zzerVarZzc = this.zza.zzt.zzaA().zzi();
            } else if (z) {
                zzerVarZzc = this.zza.zzt.zzaA().zzm();
            } else {
                zzerVarZzc = !z2 ? this.zza.zzt.zzaA().zzl() : this.zza.zzt.zzaA().zzk();
            }
        } else if (z) {
            zzerVarZzc = this.zza.zzt.zzaA().zzh();
        } else {
            zzerVarZzc = !z2 ? this.zza.zzt.zzaA().zze() : this.zza.zzt.zzaA().zzd();
        }
        int size = list.size();
        if (size == 1) {
            zzerVarZzc.zzb(str, list.get(0));
            return;
        }
        if (size == 2) {
            zzerVarZzc.zzc(str, list.get(0), list.get(1));
        } else if (size != 3) {
            zzerVarZzc.zza(str);
        } else {
            zzerVarZzc.zzd(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
