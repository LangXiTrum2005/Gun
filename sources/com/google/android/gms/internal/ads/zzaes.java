package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaes implements zzacn {
    private final byte[] zza;
    private final zzdy zzb;
    private final zzact zzc;
    private zzacq zzd;
    private zzadt zze;
    private int zzf;

    @Nullable
    private zzay zzg;
    private zzacy zzh;
    private int zzi;
    private int zzj;
    private zzaer zzk;
    private int zzl;
    private long zzm;

    public zzaes() {
        throw null;
    }

    private final long zza(zzdy zzdyVar, boolean z) {
        boolean zZzc;
        this.zzh.getClass();
        int iZzd = zzdyVar.zzd();
        while (iZzd <= zzdyVar.zze() - 16) {
            zzdyVar.zzL(iZzd);
            if (zzacu.zzc(zzdyVar, this.zzh, this.zzj, this.zzc)) {
                zzdyVar.zzL(iZzd);
                return this.zzc.zza;
            }
            iZzd++;
        }
        if (!z) {
            zzdyVar.zzL(iZzd);
            return -1L;
        }
        while (iZzd <= zzdyVar.zze() - this.zzi) {
            zzdyVar.zzL(iZzd);
            try {
                zZzc = zzacu.zzc(zzdyVar, this.zzh, this.zzj, this.zzc);
            } catch (IndexOutOfBoundsException unused) {
                zZzc = false;
            }
            if (zzdyVar.zzd() <= zzdyVar.zze() && zZzc) {
                zzdyVar.zzL(iZzd);
                return this.zzc.zza;
            }
            iZzd++;
        }
        zzdyVar.zzL(zzdyVar.zze());
        return -1L;
    }

    private final void zzg() {
        long j = this.zzm * 1000000;
        zzacy zzacyVar = this.zzh;
        int i = zzei.zza;
        this.zze.zzt(j / ((long) zzacyVar.zze), 1, this.zzl, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final int zzb(zzaco zzacoVar, zzadj zzadjVar) throws IOException {
        boolean zZzp;
        zzadm zzadlVar;
        boolean z;
        int i = this.zzf;
        if (i == 0) {
            zzacoVar.zzj();
            long jZze = zzacoVar.zze();
            zzay zzayVarZza = zzacv.zza(zzacoVar, true);
            zzacoVar.zzk((int) (zzacoVar.zze() - jZze));
            this.zzg = zzayVarZza;
            this.zzf = 1;
            return 0;
        }
        if (i == 1) {
            zzacoVar.zzh(this.zza, 0, 42);
            zzacoVar.zzj();
            this.zzf = 2;
            return 0;
        }
        if (i == 2) {
            zzdy zzdyVar = new zzdy(4);
            zzacoVar.zzi(zzdyVar.zzN(), 0, 4);
            if (zzdyVar.zzu() != 1716281667) {
                throw zzbc.zza("Failed to read FLAC stream marker.", null);
            }
            this.zzf = 3;
            return 0;
        }
        if (i == 3) {
            zzacy zzacyVarZze = this.zzh;
            do {
                zzacoVar.zzj();
                zzdx zzdxVar = new zzdx(new byte[4], 4);
                zzacoVar.zzh(zzdxVar.zza, 0, 4);
                zZzp = zzdxVar.zzp();
                int iZzd = zzdxVar.zzd(7);
                int iZzd2 = zzdxVar.zzd(24) + 4;
                if (iZzd == 0) {
                    byte[] bArr = new byte[38];
                    zzacoVar.zzi(bArr, 0, 38);
                    zzacyVarZze = new zzacy(bArr, 4);
                } else {
                    if (zzacyVarZze == null) {
                        throw new IllegalArgumentException();
                    }
                    if (iZzd == 3) {
                        zzdy zzdyVar2 = new zzdy(iZzd2);
                        zzacoVar.zzi(zzdyVar2.zzN(), 0, iZzd2);
                        zzacyVarZze = zzacyVarZze.zzf(zzacv.zzb(zzdyVar2));
                    } else if (iZzd == 4) {
                        zzdy zzdyVar3 = new zzdy(iZzd2);
                        zzacoVar.zzi(zzdyVar3.zzN(), 0, iZzd2);
                        zzdyVar3.zzM(4);
                        zzacyVarZze = zzacyVarZze.zzg(Arrays.asList(zzadz.zzc(zzdyVar3, false, false).zza));
                    } else if (iZzd == 6) {
                        zzdy zzdyVar4 = new zzdy(iZzd2);
                        zzacoVar.zzi(zzdyVar4.zzN(), 0, iZzd2);
                        zzdyVar4.zzM(4);
                        zzacyVarZze = zzacyVarZze.zze(zzfxn.zzo(zzafn.zzb(zzdyVar4)));
                    } else {
                        zzacoVar.zzk(iZzd2);
                    }
                }
                int i2 = zzei.zza;
                this.zzh = zzacyVarZze;
            } while (!zZzp);
            zzacyVarZze.getClass();
            this.zzi = Math.max(zzacyVarZze.zzc, 6);
            this.zze.zzm(this.zzh.zzc(this.zza, this.zzg));
            this.zzf = 4;
            return 0;
        }
        if (i == 4) {
            zzacoVar.zzj();
            zzdy zzdyVar5 = new zzdy(2);
            zzacoVar.zzh(zzdyVar5.zzN(), 0, 2);
            int iZzq = zzdyVar5.zzq();
            if ((iZzq >> 2) != 16382) {
                zzacoVar.zzj();
                throw zzbc.zza("First frame does not start with sync code.", null);
            }
            zzacoVar.zzj();
            this.zzj = iZzq;
            zzacq zzacqVar = this.zzd;
            int i3 = zzei.zza;
            long jZzf = zzacoVar.zzf();
            long jZzd = zzacoVar.zzd();
            zzacy zzacyVar = this.zzh;
            zzacyVar.getClass();
            if (zzacyVar.zzk != null) {
                zzadlVar = new zzacw(zzacyVar, jZzf);
            } else if (jZzd == -1 || zzacyVar.zzj <= 0) {
                zzadlVar = new zzadl(zzacyVar.zza(), 0L);
            } else {
                zzaer zzaerVar = new zzaer(zzacyVar, this.zzj, jZzf, jZzd);
                this.zzk = zzaerVar;
                zzadlVar = zzaerVar.zzb();
            }
            zzacqVar.zzO(zzadlVar);
            this.zzf = 5;
            return 0;
        }
        this.zze.getClass();
        zzacy zzacyVar2 = this.zzh;
        zzacyVar2.getClass();
        zzaer zzaerVar2 = this.zzk;
        if (zzaerVar2 != null && zzaerVar2.zze()) {
            return zzaerVar2.zza(zzacoVar, zzadjVar);
        }
        if (this.zzm == -1) {
            this.zzm = zzacu.zzb(zzacoVar, zzacyVar2);
            return 0;
        }
        zzdy zzdyVar6 = this.zzb;
        int iZze = zzdyVar6.zze();
        if (iZze < 32768) {
            int iZza = zzacoVar.zza(zzdyVar6.zzN(), iZze, 32768 - iZze);
            z = iZza == -1;
            if (!z) {
                this.zzb.zzK(iZze + iZza);
            } else if (this.zzb.zzb() == 0) {
                zzg();
                return -1;
            }
        } else {
            z = false;
        }
        zzdy zzdyVar7 = this.zzb;
        int iZzd3 = zzdyVar7.zzd();
        int i4 = this.zzl;
        int i5 = this.zzi;
        if (i4 < i5) {
            zzdyVar7.zzM(Math.min(i5 - i4, zzdyVar7.zzb()));
        }
        long jZza = zza(this.zzb, z);
        zzdy zzdyVar8 = this.zzb;
        int iZzd4 = zzdyVar8.zzd() - iZzd3;
        zzdyVar8.zzL(iZzd3);
        this.zze.zzr(this.zzb, iZzd4);
        this.zzl += iZzd4;
        if (jZza != -1) {
            zzg();
            this.zzl = 0;
            this.zzm = jZza;
        }
        zzdy zzdyVar9 = this.zzb;
        if (zzdyVar9.zzb() >= 16) {
            return 0;
        }
        int iZzb = zzdyVar9.zzb();
        System.arraycopy(zzdyVar9.zzN(), zzdyVar9.zzd(), zzdyVar9.zzN(), 0, iZzb);
        this.zzb.zzL(0);
        this.zzb.zzK(iZzb);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final /* synthetic */ zzacn zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final /* synthetic */ List zzd() {
        return zzfxn.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zze(zzacq zzacqVar) {
        this.zzd = zzacqVar;
        this.zze = zzacqVar.zzw(0, 1);
        zzacqVar.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzf(long j, long j2) {
        if (j == 0) {
            this.zzf = 0;
        } else {
            zzaer zzaerVar = this.zzk;
            if (zzaerVar != null) {
                zzaerVar.zzd(j2);
            }
        }
        this.zzm = j2 != 0 ? -1L : 0L;
        this.zzl = 0;
        this.zzb.zzI(0);
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final boolean zzi(zzaco zzacoVar) throws IOException {
        zzacv.zza(zzacoVar, false);
        zzdy zzdyVar = new zzdy(4);
        ((zzacc) zzacoVar).zzm(zzdyVar.zzN(), 0, 4, false);
        return zzdyVar.zzu() == 1716281667;
    }

    public zzaes(int i) {
        this.zza = new byte[42];
        this.zzb = new zzdy(new byte[32768], 0);
        this.zzc = new zzact();
        this.zzf = 0;
    }
}
