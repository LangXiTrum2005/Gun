package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: loaded from: classes3.dex */
public final class zzamd implements zzamj {
    private final zzdx zza;
    private final zzdy zzb;

    @Nullable
    private final String zzc;
    private final int zzd;
    private String zze;
    private zzadt zzf;
    private int zzg;
    private int zzh;
    private boolean zzi;
    private long zzj;
    private zzab zzk;
    private int zzl;
    private long zzm;

    public zzamd() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zza(zzdy zzdyVar) {
        zzcw.zzb(this.zzf);
        while (zzdyVar.zzb() > 0) {
            int i = this.zzg;
            if (i == 0) {
                while (true) {
                    if (zzdyVar.zzb() > 0) {
                        if (this.zzi) {
                            int iZzm = zzdyVar.zzm();
                            this.zzi = iZzm == 172;
                            if (iZzm != 64) {
                                if (iZzm == 65) {
                                    iZzm = 65;
                                }
                            }
                            this.zzg = 1;
                            zzdy zzdyVar2 = this.zzb;
                            zzdyVar2.zzN()[0] = -84;
                            zzdyVar2.zzN()[1] = iZzm == 65 ? (byte) 65 : (byte) 64;
                            this.zzh = 2;
                        } else {
                            this.zzi = zzdyVar.zzm() == 172;
                        }
                    }
                }
            } else if (i != 1) {
                int iMin = Math.min(zzdyVar.zzb(), this.zzl - this.zzh);
                this.zzf.zzr(zzdyVar, iMin);
                int i2 = this.zzh + iMin;
                this.zzh = i2;
                if (i2 == this.zzl) {
                    zzcw.zzf(this.zzm != C.TIME_UNSET);
                    this.zzf.zzt(this.zzm, 1, this.zzl, 0, null);
                    this.zzm += this.zzj;
                    this.zzg = 0;
                }
            } else {
                byte[] bArrZzN = this.zzb.zzN();
                int iMin2 = Math.min(zzdyVar.zzb(), 16 - this.zzh);
                zzdyVar.zzH(bArrZzN, this.zzh, iMin2);
                int i3 = this.zzh + iMin2;
                this.zzh = i3;
                if (i3 == 16) {
                    this.zza.zzl(0);
                    zzabo zzaboVarZza = zzabq.zza(this.zza);
                    zzab zzabVar = this.zzk;
                    if (zzabVar == null || zzabVar.zzD != 2 || zzaboVarZza.zza != zzabVar.zzE || !"audio/ac4".equals(zzabVar.zzo)) {
                        zzz zzzVar = new zzz();
                        zzzVar.zzM(this.zze);
                        zzzVar.zzaa("audio/ac4");
                        zzzVar.zzz(2);
                        zzzVar.zzab(zzaboVarZza.zza);
                        zzzVar.zzQ(this.zzc);
                        zzzVar.zzY(this.zzd);
                        zzab zzabVarZzag = zzzVar.zzag();
                        this.zzk = zzabVarZzag;
                        this.zzf.zzm(zzabVarZzag);
                    }
                    this.zzl = zzaboVarZza.zzb;
                    this.zzj = (((long) zzaboVarZza.zzc) * 1000000) / ((long) this.zzk.zzE);
                    this.zzb.zzL(0);
                    this.zzf.zzr(this.zzb, 16);
                    this.zzg = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zzb(zzacq zzacqVar, zzanx zzanxVar) {
        zzanxVar.zzc();
        this.zze = zzanxVar.zzb();
        this.zzf = zzacqVar.zzw(zzanxVar.zza(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zzc(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zzd(long j, int i) {
        this.zzm = j;
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zze() {
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = false;
        this.zzm = C.TIME_UNSET;
    }

    public zzamd(@Nullable String str, int i) {
        zzdx zzdxVar = new zzdx(new byte[16], 16);
        this.zza = zzdxVar;
        this.zzb = new zzdy(zzdxVar.zza);
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = false;
        this.zzm = C.TIME_UNSET;
        this.zzc = str;
        this.zzd = i;
    }
}
