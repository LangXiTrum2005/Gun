package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzame implements zzacn {
    private final zzamf zza;
    private final zzdy zzb;
    private final zzdy zzc;
    private final zzdx zzd;
    private zzacq zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private boolean zzi;

    public zzame() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final int zzb(zzaco zzacoVar, zzadj zzadjVar) throws IOException {
        zzcw.zzb(this.zze);
        int iZza = zzacoVar.zza(this.zzb.zzN(), 0, 2048);
        if (!this.zzi) {
            this.zze.zzO(new zzadl(C.TIME_UNSET, 0L));
            this.zzi = true;
        }
        if (iZza == -1) {
            return -1;
        }
        this.zzb.zzL(0);
        this.zzb.zzK(iZza);
        if (!this.zzh) {
            this.zza.zzd(this.zzf, 4);
            this.zzh = true;
        }
        this.zza.zza(this.zzb);
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
        this.zze = zzacqVar;
        this.zza.zzb(zzacqVar, new zzanx(Integer.MIN_VALUE, 0, 1));
        zzacqVar.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzf(long j, long j2) {
        this.zzh = false;
        this.zza.zze();
        this.zzf = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final boolean zzi(zzaco zzacoVar) throws IOException {
        int i = 0;
        while (true) {
            zzacc zzaccVar = (zzacc) zzacoVar;
            zzaccVar.zzm(this.zzc.zzN(), 0, 10, false);
            this.zzc.zzL(0);
            if (this.zzc.zzo() != 4801587) {
                break;
            }
            this.zzc.zzM(3);
            int iZzl = this.zzc.zzl();
            i += iZzl + 10;
            zzaccVar.zzl(iZzl, false);
        }
        zzacoVar.zzj();
        zzacc zzaccVar2 = (zzacc) zzacoVar;
        zzaccVar2.zzl(i, false);
        if (this.zzg == -1) {
            this.zzg = i;
        }
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        do {
            zzaccVar2.zzm(this.zzc.zzN(), 0, 2, false);
            this.zzc.zzL(0);
            if (zzamf.zzf(this.zzc.zzq())) {
                i3++;
                if (i3 >= 4 && i4 > 188) {
                    return true;
                }
                zzaccVar2.zzm(this.zzc.zzN(), 0, 4, false);
                this.zzd.zzl(14);
                int iZzd = this.zzd.zzd(13);
                if (iZzd <= 6) {
                    i2++;
                    zzacoVar.zzj();
                    zzaccVar2.zzl(i2, false);
                } else {
                    zzaccVar2.zzl(iZzd - 6, false);
                    i4 += iZzd;
                }
            } else {
                i2++;
                zzacoVar.zzj();
                zzaccVar2.zzl(i2, false);
            }
            i3 = 0;
            i4 = 0;
        } while (i2 - i < 8192);
        return false;
    }

    public zzame(int i) {
        this.zza = new zzamf(true, null, 0);
        this.zzb = new zzdy(2048);
        this.zzg = -1L;
        zzdy zzdyVar = new zzdy(10);
        this.zzc = zzdyVar;
        byte[] bArrZzN = zzdyVar.zzN();
        this.zzd = new zzdx(bArrZzN, bArrZzN.length);
    }
}
