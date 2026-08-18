package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;

/* JADX INFO: loaded from: classes3.dex */
final class zzaey extends zzaex {
    private final zzdy zzb;
    private final zzdy zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    public zzaey(zzadt zzadtVar) {
        super(zzadtVar);
        this.zzb = new zzdy(zzfk.zza);
        this.zzc = new zzdy(4);
    }

    @Override // com.google.android.gms.internal.ads.zzaex
    public final boolean zza(zzdy zzdyVar) throws zzaew {
        int iZzm = zzdyVar.zzm();
        int i = iZzm >> 4;
        int i2 = iZzm & 15;
        if (i2 != 7) {
            throw new zzaew(AbstractC3950lJ.p("Video format not supported: ", i2));
        }
        this.zzg = i;
        return i != 5;
    }

    @Override // com.google.android.gms.internal.ads.zzaex
    public final boolean zzb(zzdy zzdyVar, long j) throws zzbc {
        int i;
        int iZzm = zzdyVar.zzm();
        long jZzh = zzdyVar.zzh();
        if (iZzm == 0) {
            if (!this.zze) {
                zzdy zzdyVar2 = new zzdy(new byte[zzdyVar.zzb()]);
                zzdyVar.zzH(zzdyVar2.zzN(), 0, zzdyVar.zzb());
                zzabr zzabrVarZza = zzabr.zza(zzdyVar2);
                this.zzd = zzabrVarZza.zzb;
                zzz zzzVar = new zzz();
                zzzVar.zzaa("video/avc");
                zzzVar.zzA(zzabrVarZza.zzl);
                zzzVar.zzaf(zzabrVarZza.zzc);
                zzzVar.zzK(zzabrVarZza.zzd);
                zzzVar.zzW(zzabrVarZza.zzk);
                zzzVar.zzN(zzabrVarZza.zza);
                this.zza.zzm(zzzVar.zzag());
                this.zze = true;
                return false;
            }
        } else if (iZzm == 1 && this.zze) {
            int i2 = this.zzg == 1 ? 1 : 0;
            if (this.zzf) {
                i = i2;
            } else if (i2 != 0) {
                i = 1;
            }
            byte[] bArrZzN = this.zzc.zzN();
            bArrZzN[0] = 0;
            bArrZzN[1] = 0;
            bArrZzN[2] = 0;
            int i3 = 4 - this.zzd;
            int i4 = 0;
            while (zzdyVar.zzb() > 0) {
                zzdyVar.zzH(this.zzc.zzN(), i3, this.zzd);
                this.zzc.zzL(0);
                zzdy zzdyVar3 = this.zzc;
                zzdy zzdyVar4 = this.zzb;
                int iZzp = zzdyVar3.zzp();
                zzdyVar4.zzL(0);
                this.zza.zzr(this.zzb, 4);
                this.zza.zzr(zzdyVar, iZzp);
                i4 = i4 + 4 + iZzp;
            }
            this.zza.zzt((jZzh * 1000) + j, i, i4, 0, null);
            this.zzf = true;
            return true;
        }
        return false;
    }
}
