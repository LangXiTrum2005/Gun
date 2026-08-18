package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes3.dex */
final class zzfsb extends zzftd {

    @Nullable
    private final String zza;

    @Nullable
    private final String zzb;

    public /* synthetic */ zzfsb(String str, String str2, zzfsa zzfsaVar) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzftd) {
            zzftd zzftdVar = (zzftd) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzftdVar.zzb()) : zzftdVar.zzb() == null) {
                String str2 = this.zzb;
                if (str2 != null ? str2.equals(zzftdVar.zza()) : zzftdVar.zza() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.zzb;
        return ((iHashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverlayDisplayUpdateRequest{sessionToken=");
        sb.append(this.zza);
        sb.append(", appId=");
        return DM.m(sb, this.zzb, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzftd
    @Nullable
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzftd
    @Nullable
    public final String zzb() {
        return this.zza;
    }
}
