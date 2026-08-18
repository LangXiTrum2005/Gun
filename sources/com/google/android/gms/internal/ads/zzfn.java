package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: loaded from: classes3.dex */
final class zzfn implements Comparable {
    private long zzc;
    private long zzb = C.TIME_UNSET;
    private final zzdy zza = new zzdy();

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zzfn zzfnVar = (zzfn) obj;
        int iCompare = Long.compare(this.zzb, zzfnVar.zzb);
        return iCompare != 0 ? iCompare : Long.compare(this.zzc, zzfnVar.zzc);
    }

    public final void zzc(long j, long j2, zzdy zzdyVar) {
        zzcw.zzf(j != C.TIME_UNSET);
        this.zzb = j;
        this.zzc = j2;
        this.zza.zzI(zzdyVar.zzb());
        System.arraycopy(zzdyVar.zzN(), zzdyVar.zzd(), this.zza.zzN(), 0, zzdyVar.zzb());
    }
}
