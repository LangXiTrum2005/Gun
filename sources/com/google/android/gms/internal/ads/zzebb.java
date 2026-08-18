package com.google.android.gms.internal.ads;

import android.app.Activity;
import androidx.annotation.Nullable;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes3.dex */
final class zzebb extends zzebx {
    private final Activity zza;

    @Nullable
    private final com.google.android.gms.ads.internal.overlay.zzm zzb;

    @Nullable
    private final String zzc;

    @Nullable
    private final String zzd;

    public /* synthetic */ zzebb(Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar, String str, String str2, zzeba zzebaVar) {
        this.zza = activity;
        this.zzb = zzmVar;
        this.zzc = str;
        this.zzd = str2;
    }

    public final boolean equals(Object obj) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar;
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzebx) {
            zzebx zzebxVar = (zzebx) obj;
            if (this.zza.equals(zzebxVar.zza()) && ((zzmVar = this.zzb) != null ? zzmVar.equals(zzebxVar.zzb()) : zzebxVar.zzb() == null) && ((str = this.zzc) != null ? str.equals(zzebxVar.zzc()) : zzebxVar.zzc() == null) && ((str2 = this.zzd) != null ? str2.equals(zzebxVar.zzd()) : zzebxVar.zzd() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() ^ 1000003;
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzb;
        int iHashCode2 = ((iHashCode * 1000003) ^ (zzmVar == null ? 0 : zzmVar.hashCode())) * 1000003;
        String str = this.zzc;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.zzd;
        return iHashCode3 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbR = DM.r("OfflineUtilsParams{activity=", this.zza.toString(), ", adOverlay=", String.valueOf(this.zzb), ", gwsQueryId=");
        sbR.append(this.zzc);
        sbR.append(", uri=");
        return DM.m(sbR, this.zzd, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzebx
    public final Activity zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzebx
    @Nullable
    public final com.google.android.gms.ads.internal.overlay.zzm zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzebx
    @Nullable
    public final String zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzebx
    @Nullable
    public final String zzd() {
        return this.zzd;
    }
}
