package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaca implements zzadm {
    public final int zza;
    public final int[] zzb;
    public final long[] zzc;
    public final long[] zzd;
    public final long[] zze;
    private final long zzf;

    public zzaca(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.zzb = iArr;
        this.zzc = jArr;
        this.zzd = jArr2;
        this.zze = jArr3;
        int length = iArr.length;
        this.zza = length;
        if (length <= 0) {
            this.zzf = 0L;
        } else {
            int i = length - 1;
            this.zzf = jArr2[i] + jArr3[i];
        }
    }

    public final String toString() {
        long[] jArr = this.zzd;
        long[] jArr2 = this.zze;
        long[] jArr3 = this.zzc;
        String string = Arrays.toString(this.zzb);
        String string2 = Arrays.toString(jArr3);
        String string3 = Arrays.toString(jArr2);
        String string4 = Arrays.toString(jArr);
        StringBuilder sb = new StringBuilder("ChunkIndex(length=");
        sb.append(this.zza);
        sb.append(", sizes=");
        sb.append(string);
        sb.append(", offsets=");
        AbstractC5044xl.t(sb, string2, ", timeUs=", string3, ", durationsUs=");
        return DM.m(sb, string4, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final long zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final zzadk zzg(long j) {
        long[] jArr = this.zze;
        int iZzd = zzei.zzd(jArr, j, true, true);
        zzadn zzadnVar = new zzadn(jArr[iZzd], this.zzc[iZzd]);
        if (zzadnVar.zzb >= j || iZzd == this.zza - 1) {
            return new zzadk(zzadnVar, zzadnVar);
        }
        int i = iZzd + 1;
        return new zzadk(zzadnVar, new zzadn(this.zze[i], this.zzc[i]));
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final boolean zzh() {
        return true;
    }
}
