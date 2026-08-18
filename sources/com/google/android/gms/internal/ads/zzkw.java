package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class zzkw implements zzur, zzrb {
    final /* synthetic */ zzla zza;
    private final zzky zzb;

    public zzkw(zzla zzlaVar, zzky zzkyVar) {
        this.zza = zzlaVar;
        this.zzb = zzkyVar;
    }

    @Nullable
    private final Pair zzf(int i, @Nullable zzug zzugVar) {
        zzug zzugVarZza;
        zzug zzugVar2 = null;
        if (zzugVar != null) {
            zzky zzkyVar = this.zzb;
            int i2 = 0;
            while (true) {
                if (i2 >= zzkyVar.zzc.size()) {
                    zzugVarZza = null;
                    break;
                }
                if (((zzug) zzkyVar.zzc.get(i2)).zzd == zzugVar.zzd) {
                    zzugVarZza = zzugVar.zza(Pair.create(zzkyVar.zzb, zzugVar.zza));
                    break;
                }
                i2++;
            }
            if (zzugVarZza == null) {
                return null;
            }
            zzugVar2 = zzugVarZza;
        }
        return Pair.create(Integer.valueOf(this.zzb.zzd), zzugVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final void zzaf(int i, @Nullable zzug zzugVar, final zzuc zzucVar) {
        final Pair pairZzf = zzf(0, zzugVar);
        if (pairZzf != null) {
            this.zza.zzi.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzku
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = pairZzf;
                    this.zza.zza.zzh.zzaf(((Integer) pair.first).intValue(), (zzug) pair.second, zzucVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final void zzag(int i, @Nullable zzug zzugVar, final zztx zztxVar, final zzuc zzucVar) {
        final Pair pairZzf = zzf(0, zzugVar);
        if (pairZzf != null) {
            this.zza.zzi.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzks
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = pairZzf;
                    this.zza.zza.zzh.zzag(((Integer) pair.first).intValue(), (zzug) pair.second, zztxVar, zzucVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final void zzah(int i, @Nullable zzug zzugVar, final zztx zztxVar, final zzuc zzucVar) {
        final Pair pairZzf = zzf(0, zzugVar);
        if (pairZzf != null) {
            this.zza.zzi.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkv
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = pairZzf;
                    this.zza.zza.zzh.zzah(((Integer) pair.first).intValue(), (zzug) pair.second, zztxVar, zzucVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final void zzai(int i, @Nullable zzug zzugVar, final zztx zztxVar, final zzuc zzucVar, final IOException iOException, final boolean z) {
        final Pair pairZzf = zzf(0, zzugVar);
        if (pairZzf != null) {
            this.zza.zzi.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkr
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = pairZzf;
                    this.zza.zza.zzh.zzai(((Integer) pair.first).intValue(), (zzug) pair.second, zztxVar, zzucVar, iOException, z);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzur
    public final void zzaj(int i, @Nullable zzug zzugVar, final zztx zztxVar, final zzuc zzucVar) {
        final Pair pairZzf = zzf(0, zzugVar);
        if (pairZzf != null) {
            this.zza.zzi.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkt
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = pairZzf;
                    this.zza.zza.zzh.zzaj(((Integer) pair.first).intValue(), (zzug) pair.second, zztxVar, zzucVar);
                }
            });
        }
    }
}
