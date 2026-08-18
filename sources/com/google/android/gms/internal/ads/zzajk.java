package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class zzajk extends zzajt {

    @Nullable
    private zzacy zza;

    @Nullable
    private zzajj zzb;

    private static boolean zzd(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.google.android.gms.internal.ads.zzajt
    public final long zza(zzdy zzdyVar) {
        if (!zzd(zzdyVar.zzN())) {
            return -1L;
        }
        int i = (zzdyVar.zzN()[2] & 255) >> 4;
        if (i == 6) {
            zzdyVar.zzM(4);
            zzdyVar.zzx();
        } else if (i == 7) {
            i = 7;
            zzdyVar.zzM(4);
            zzdyVar.zzx();
        }
        int iZza = zzacu.zza(zzdyVar, i);
        zzdyVar.zzL(0);
        return iZza;
    }

    @Override // com.google.android.gms.internal.ads.zzajt
    public final void zzb(boolean z) {
        super.zzb(z);
        if (z) {
            this.zza = null;
            this.zzb = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajt
    public final boolean zzc(zzdy zzdyVar, long j, zzajq zzajqVar) {
        byte[] bArrZzN = zzdyVar.zzN();
        zzacy zzacyVar = this.zza;
        if (zzacyVar == null) {
            zzacy zzacyVar2 = new zzacy(bArrZzN, 17);
            this.zza = zzacyVar2;
            zzajqVar.zza = zzacyVar2.zzc(Arrays.copyOfRange(bArrZzN, 9, zzdyVar.zze()), null);
            return true;
        }
        if ((bArrZzN[0] & 127) == 3) {
            zzacx zzacxVarZzb = zzacv.zzb(zzdyVar);
            zzacy zzacyVarZzf = zzacyVar.zzf(zzacxVarZzb);
            this.zza = zzacyVarZzf;
            this.zzb = new zzajj(zzacyVarZzf, zzacxVarZzb);
            return true;
        }
        if (!zzd(bArrZzN)) {
            return true;
        }
        zzajj zzajjVar = this.zzb;
        if (zzajjVar != null) {
            zzajjVar.zza(j);
            zzajqVar.zzb = this.zzb;
        }
        zzajqVar.zza.getClass();
        return false;
    }
}
