package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: loaded from: classes3.dex */
public final class zzamv implements zzamj {
    private final zzdy zza;
    private final zzadf zzb;

    @Nullable
    private final String zzc;
    private final int zzd;
    private zzadt zze;
    private String zzf;
    private int zzg;
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private long zzk;
    private int zzl;
    private long zzm;

    public zzamv() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zza(zzdy zzdyVar) {
        zzcw.zzb(this.zze);
        while (zzdyVar.zzb() > 0) {
            int i = this.zzg;
            if (i == 0) {
                byte[] bArrZzN = zzdyVar.zzN();
                int iZzd = zzdyVar.zzd();
                int iZze = zzdyVar.zze();
                while (true) {
                    if (iZzd >= iZze) {
                        zzdyVar.zzL(iZze);
                        break;
                    }
                    int i2 = iZzd + 1;
                    byte b = bArrZzN[iZzd];
                    boolean z = (b & 255) == 255;
                    boolean z2 = this.zzj && (b & 224) == 224;
                    this.zzj = z;
                    if (z2) {
                        zzdyVar.zzL(i2);
                        this.zzj = false;
                        this.zza.zzN()[1] = bArrZzN[iZzd];
                        this.zzh = 2;
                        this.zzg = 1;
                        break;
                    }
                    iZzd = i2;
                }
            } else if (i != 1) {
                int iMin = Math.min(zzdyVar.zzb(), this.zzl - this.zzh);
                this.zze.zzr(zzdyVar, iMin);
                int i3 = this.zzh + iMin;
                this.zzh = i3;
                if (i3 >= this.zzl) {
                    zzcw.zzf(this.zzm != C.TIME_UNSET);
                    this.zze.zzt(this.zzm, 1, this.zzl, 0, null);
                    this.zzm += this.zzk;
                    this.zzh = 0;
                    this.zzg = 0;
                }
            } else {
                int iMin2 = Math.min(zzdyVar.zzb(), 4 - this.zzh);
                zzdyVar.zzH(this.zza.zzN(), this.zzh, iMin2);
                int i4 = this.zzh + iMin2;
                this.zzh = i4;
                if (i4 >= 4) {
                    this.zza.zzL(0);
                    if (this.zzb.zza(this.zza.zzg())) {
                        zzadf zzadfVar = this.zzb;
                        this.zzl = zzadfVar.zzc;
                        if (!this.zzi) {
                            this.zzk = (((long) zzadfVar.zzg) * 1000000) / ((long) zzadfVar.zzd);
                            zzz zzzVar = new zzz();
                            zzzVar.zzM(this.zzf);
                            zzzVar.zzaa(this.zzb.zzb);
                            zzzVar.zzR(4096);
                            zzzVar.zzz(this.zzb.zze);
                            zzzVar.zzab(this.zzb.zzd);
                            zzzVar.zzQ(this.zzc);
                            zzzVar.zzY(this.zzd);
                            this.zze.zzm(zzzVar.zzag());
                            this.zzi = true;
                        }
                        this.zza.zzL(0);
                        this.zze.zzr(this.zza, 4);
                        this.zzg = 2;
                    } else {
                        this.zzh = 0;
                        this.zzg = 1;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zzb(zzacq zzacqVar, zzanx zzanxVar) {
        zzanxVar.zzc();
        this.zzf = zzanxVar.zzb();
        this.zze = zzacqVar.zzw(zzanxVar.zza(), 1);
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
        this.zzj = false;
        this.zzm = C.TIME_UNSET;
    }

    public zzamv(@Nullable String str, int i) {
        this.zzg = 0;
        zzdy zzdyVar = new zzdy(4);
        this.zza = zzdyVar;
        zzdyVar.zzN()[0] = -1;
        this.zzb = new zzadf();
        this.zzm = C.TIME_UNSET;
        this.zzc = str;
        this.zzd = i;
    }
}
