package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzcdt implements zzfy {
    private final zzfy zza;
    private final long zzb;
    private final zzfy zzc;
    private long zzd;
    private Uri zze;

    public zzcdt(zzfy zzfyVar, int i, zzfy zzfyVar2) {
        this.zza = zzfyVar;
        this.zzb = i;
        this.zzc = zzfyVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        long j = this.zzd;
        long j2 = this.zzb;
        if (j < j2) {
            int iZza = this.zza.zza(bArr, i, (int) Math.min(i2, j2 - j));
            long j3 = this.zzd + ((long) iZza);
            this.zzd = j3;
            i3 = iZza;
            j = j3;
        } else {
            i3 = 0;
        }
        if (j < this.zzb) {
            return i3;
        }
        int iZza2 = this.zzc.zza(bArr, i + i3, i2 - i3);
        int i4 = i3 + iZza2;
        this.zzd += (long) iZza2;
        return i4;
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final long zzb(zzgd zzgdVar) throws IOException {
        zzgd zzgdVar2;
        this.zze = zzgdVar.zza;
        long j = zzgdVar.zze;
        long j2 = this.zzb;
        zzgd zzgdVar3 = null;
        if (j >= j2) {
            zzgdVar2 = null;
        } else {
            long j3 = zzgdVar.zzf;
            long jMin = j2 - j;
            if (j3 != -1) {
                jMin = Math.min(j3, jMin);
            }
            zzgdVar2 = new zzgd(zzgdVar.zza, j, jMin, null);
        }
        long j4 = zzgdVar.zzf;
        if (j4 == -1 || zzgdVar.zze + j4 > this.zzb) {
            long jMax = Math.max(this.zzb, zzgdVar.zze);
            long j5 = zzgdVar.zzf;
            zzgdVar3 = new zzgd(zzgdVar.zza, jMax, j5 != -1 ? Math.min(j5, (zzgdVar.zze + j5) - this.zzb) : -1L, null);
        }
        long jZzb = zzgdVar2 != null ? this.zza.zzb(zzgdVar2) : 0L;
        long jZzb2 = zzgdVar3 != null ? this.zzc.zzb(zzgdVar3) : 0L;
        this.zzd = zzgdVar.zze;
        if (jZzb == -1 || jZzb2 == -1) {
            return -1L;
        }
        return jZzb + jZzb2;
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final Uri zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final void zzd() throws IOException {
        this.zza.zzd();
        this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final Map zze() {
        return zzfxq.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final void zzf(zzgy zzgyVar) {
    }
}
