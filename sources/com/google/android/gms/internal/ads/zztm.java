package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zztm implements zzur, zzrb {
    final /* synthetic */ zzto zza;
    private final Object zzb;
    private zzuq zzc;
    private zzra zzd;

    public zztm(zzto zztoVar, Object obj) {
        this.zza = zztoVar;
        this.zzc = zztoVar.zze(null);
        this.zzd = zztoVar.zzc(null);
        this.zzb = obj;
    }

    private final zzuc zzf(zzuc zzucVar, @Nullable zzug zzugVar) {
        zzto zztoVar = this.zza;
        Object obj = this.zzb;
        long j = zzucVar.zzc;
        zztoVar.zzx(obj, j, zzugVar);
        zzto zztoVar2 = this.zza;
        Object obj2 = this.zzb;
        long j2 = zzucVar.zzd;
        zztoVar2.zzx(obj2, j2, zzugVar);
        return (j == zzucVar.zzc && j2 == zzucVar.zzd) ? zzucVar : new zzuc(1, zzucVar.zza, zzucVar.zzb, 0, null, j, j2);
    }

    private final boolean zzg(int i, @Nullable zzug zzugVar) {
        zzug zzugVarZzy;
        if (zzugVar != null) {
            zzugVarZzy = this.zza.zzy(this.zzb, zzugVar);
            if (zzugVarZzy == null) {
                return false;
            }
        } else {
            zzugVarZzy = null;
        }
        this.zza.zzw(this.zzb, 0);
        zzuq zzuqVar = this.zzc;
        int i2 = zzuqVar.zza;
        if (!Objects.equals(zzuqVar.zzb, zzugVarZzy)) {
            this.zzc = this.zza.zzf(0, zzugVarZzy);
        }
        zzra zzraVar = this.zzd;
        int i3 = zzraVar.zza;
        if (Objects.equals(zzraVar.zzb, zzugVarZzy)) {
            return true;
        }
        this.zzd = this.zza.zzd(0, zzugVarZzy);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final void zzaf(int i, @Nullable zzug zzugVar, zzuc zzucVar) {
        if (zzg(0, zzugVar)) {
            this.zzc.zzd(zzf(zzucVar, zzugVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final void zzag(int i, @Nullable zzug zzugVar, zztx zztxVar, zzuc zzucVar) {
        if (zzg(0, zzugVar)) {
            this.zzc.zze(zztxVar, zzf(zzucVar, zzugVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final void zzah(int i, @Nullable zzug zzugVar, zztx zztxVar, zzuc zzucVar) {
        if (zzg(0, zzugVar)) {
            this.zzc.zzf(zztxVar, zzf(zzucVar, zzugVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final void zzai(int i, @Nullable zzug zzugVar, zztx zztxVar, zzuc zzucVar, IOException iOException, boolean z) {
        if (zzg(0, zzugVar)) {
            this.zzc.zzg(zztxVar, zzf(zzucVar, zzugVar), iOException, z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final void zzaj(int i, @Nullable zzug zzugVar, zztx zztxVar, zzuc zzucVar) {
        if (zzg(0, zzugVar)) {
            this.zzc.zzh(zztxVar, zzf(zzucVar, zzugVar));
        }
    }
}
