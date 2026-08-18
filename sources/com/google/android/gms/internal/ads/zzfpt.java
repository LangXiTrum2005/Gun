package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes3.dex */
final class zzfpt extends zzfqa {
    private final String zzb;
    private final int zzc;
    private final int zzd;

    public /* synthetic */ zzfpt(String str, boolean z, int i, zzfpp zzfppVar, zzfpq zzfpqVar, int i2, zzfps zzfpsVar) {
        this.zzb = str;
        this.zzc = i;
        this.zzd = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfqa) {
            zzfqa zzfqaVar = (zzfqa) obj;
            if (this.zzb.equals(zzfqaVar.zzc())) {
                zzfqaVar.zzd();
                int i = this.zzc;
                int iZze = zzfqaVar.zze();
                if (i == 0) {
                    throw null;
                }
                if (i == iZze) {
                    zzfqaVar.zza();
                    zzfqaVar.zzb();
                    int i2 = this.zzd;
                    int iZzf = zzfqaVar.zzf();
                    if (i2 == 0) {
                        throw null;
                    }
                    if (iZzf == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzb.hashCode() ^ 1000003;
        int i = this.zzc;
        if (i == 0) {
            throw null;
        }
        int i2 = (((iHashCode * 1000003) ^ 1237) * 1000003) ^ i;
        if (this.zzd != 0) {
            return (i2 * 583896283) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        String str;
        int i = this.zzc;
        if (i == 1) {
            str = "ALL_CHECKS";
        } else if (i == 2) {
            str = "SKIP_COMPLIANCE_CHECK";
        } else if (i != 3) {
            str = i != 4 ? "null" : "NO_CHECKS";
        } else {
            str = "SKIP_SECURITY_CHECK";
        }
        return DM.m(DM.r("FileComplianceOptions{fileOwner=", this.zzb, ", hasDifferentDmaOwner=false, fileChecks=", str, ", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose="), this.zzd == 1 ? "READ_AND_WRITE" : "null", "}");
    }

    @Override // com.google.android.gms.internal.ads.zzfqa
    public final zzfpp zza() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfqa
    public final zzfpq zzb() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfqa
    public final String zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfqa
    public final boolean zzd() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfqa
    public final int zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfqa
    public final int zzf() {
        return this.zzd;
    }
}
