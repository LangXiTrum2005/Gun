package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgls {
    private final zzgdz zza;
    private final int zzb;
    private final String zzc;
    private final String zzd;

    public /* synthetic */ zzgls(zzgdz zzgdzVar, int i, String str, String str2, zzglt zzgltVar) {
        this.zza = zzgdzVar;
        this.zzb = i;
        this.zzc = str;
        this.zzd = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgls)) {
            return false;
        }
        zzgls zzglsVar = (zzgls) obj;
        return this.zza == zzglsVar.zza && this.zzb == zzglsVar.zzb && this.zzc.equals(zzglsVar.zzc) && this.zzd.equals(zzglsVar.zzd);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final String toString() {
        zzgdz zzgdzVar = this.zza;
        int i = this.zzb;
        String str = this.zzc;
        String str2 = this.zzd;
        StringBuilder sb = new StringBuilder("(status=");
        sb.append(zzgdzVar);
        sb.append(", keyId=");
        sb.append(i);
        sb.append(", keyType='");
        return DM.n(sb, str, "', keyPrefix='", str2, "')");
    }

    public final int zza() {
        return this.zzb;
    }
}
