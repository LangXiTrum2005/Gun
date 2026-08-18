package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;

/* JADX INFO: loaded from: classes3.dex */
final class zzfno extends zzfnk {
    private final String zza;
    private final boolean zzb;
    private final boolean zzc;
    private final long zzd;
    private final long zze;

    public /* synthetic */ zzfno(String str, boolean z, boolean z2, boolean z3, long j, boolean z4, long j2, zzfnn zzfnnVar) {
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = j;
        this.zze = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfnk) {
            zzfnk zzfnkVar = (zzfnk) obj;
            if (this.zza.equals(zzfnkVar.zzd()) && this.zzb == zzfnkVar.zzh() && this.zzc == zzfnkVar.zzg()) {
                zzfnkVar.zzf();
                if (this.zzd == zzfnkVar.zzb()) {
                    zzfnkVar.zze();
                    if (this.zze == zzfnkVar.zza()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.zza.hashCode() ^ 1000003) * 1000003) ^ (true != this.zzb ? 1237 : 1231)) * 1000003) ^ (true != this.zzc ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.zzd)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.zze);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdShield2Options{clientVersion=");
        sb.append(this.zza);
        sb.append(", shouldGetAdvertisingId=");
        sb.append(this.zzb);
        sb.append(", isGooglePlayServicesAvailable=");
        sb.append(this.zzc);
        sb.append(", enableQuerySignalsTimeout=false, querySignalsTimeoutMs=");
        sb.append(this.zzd);
        sb.append(", enableQuerySignalsCache=false, querySignalsCacheTtlSeconds=");
        return AbstractC3950lJ.s(sb, this.zze, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzfnk
    public final long zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfnk
    public final long zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfnk
    public final String zzd() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfnk
    public final boolean zze() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfnk
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfnk
    public final boolean zzg() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfnk
    public final boolean zzh() {
        return this.zzb;
    }
}
