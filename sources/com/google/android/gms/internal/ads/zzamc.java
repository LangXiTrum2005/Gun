package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzamc implements zzacn {
    private final zzamd zza = new zzamd(null, 0);
    private final zzdy zzb = new zzdy(16384);
    private boolean zzc;

    @Override // com.google.android.gms.internal.ads.zzacn
    public final int zzb(zzaco zzacoVar, zzadj zzadjVar) throws IOException {
        int iZza = zzacoVar.zza(this.zzb.zzN(), 0, 16384);
        if (iZza == -1) {
            return -1;
        }
        this.zzb.zzL(0);
        this.zzb.zzK(iZza);
        if (!this.zzc) {
            this.zza.zzd(0L, 4);
            this.zzc = true;
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
        this.zza.zzb(zzacqVar, new zzanx(Integer.MIN_VALUE, 0, 1));
        zzacqVar.zzD();
        zzacqVar.zzO(new zzadl(C.TIME_UNSET, 0L));
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzf(long j, long j2) {
        this.zzc = false;
        this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final boolean zzi(zzaco zzacoVar) throws IOException {
        int i;
        zzdy zzdyVar = new zzdy(10);
        int i2 = 0;
        while (true) {
            zzacc zzaccVar = (zzacc) zzacoVar;
            zzaccVar.zzm(zzdyVar.zzN(), 0, 10, false);
            zzdyVar.zzL(0);
            if (zzdyVar.zzo() != 4801587) {
                break;
            }
            zzdyVar.zzM(3);
            int iZzl = zzdyVar.zzl();
            i2 += iZzl + 10;
            zzaccVar.zzl(iZzl, false);
        }
        zzacoVar.zzj();
        zzacc zzaccVar2 = (zzacc) zzacoVar;
        zzaccVar2.zzl(i2, false);
        int i3 = i2;
        while (true) {
            int i4 = 0;
            while (true) {
                int i5 = 7;
                zzaccVar2.zzm(zzdyVar.zzN(), 0, 7, false);
                zzdyVar.zzL(0);
                int iZzq = zzdyVar.zzq();
                if (iZzq == 44096 || iZzq == 44097) {
                    i4++;
                    if (i4 >= 4) {
                        return true;
                    }
                    byte[] bArrZzN = zzdyVar.zzN();
                    if (bArrZzN.length < 7) {
                        i = -1;
                    } else {
                        int i6 = ((bArrZzN[2] & 255) << 8) | (bArrZzN[3] & 255);
                        if (i6 == 65535) {
                            i6 = ((bArrZzN[4] & 255) << 16) | ((bArrZzN[5] & 255) << 8) | (bArrZzN[6] & 255);
                        } else {
                            i5 = 4;
                        }
                        if (iZzq == 44097) {
                            i5 += 2;
                        }
                        i = i6 + i5;
                    }
                    if (i == -1) {
                        return false;
                    }
                    zzaccVar2.zzl(i - 7, false);
                }
            }
            zzacoVar.zzj();
            i3++;
            if (i3 - i2 >= 8192) {
                return false;
            }
            zzaccVar2.zzl(i3, false);
        }
    }
}
