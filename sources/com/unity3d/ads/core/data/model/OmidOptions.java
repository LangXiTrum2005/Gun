package com.unity3d.ads.core.data.model;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC3346eT;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC5042xk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RC;

/* JADX INFO: loaded from: classes4.dex */
public final class OmidOptions {
    private final EnumC5042xk creativeType;
    private final String customReferenceData;
    private final EnumC3346eT impressionOwner;
    private final RC impressionType;
    private final boolean isolateVerificationScripts;
    private final EnumC3346eT mediaEventsOwner;
    private final EnumC3346eT videoEventsOwner;

    public OmidOptions() {
        this(false, null, null, null, null, null, null, EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, null);
    }

    public static /* synthetic */ OmidOptions copy$default(OmidOptions omidOptions, boolean z, EnumC3346eT enumC3346eT, EnumC3346eT enumC3346eT2, String str, RC rc, EnumC5042xk enumC5042xk, EnumC3346eT enumC3346eT3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = omidOptions.isolateVerificationScripts;
        }
        if ((i & 2) != 0) {
            enumC3346eT = omidOptions.impressionOwner;
        }
        EnumC3346eT enumC3346eT4 = enumC3346eT;
        if ((i & 4) != 0) {
            enumC3346eT2 = omidOptions.videoEventsOwner;
        }
        EnumC3346eT enumC3346eT5 = enumC3346eT2;
        if ((i & 8) != 0) {
            str = omidOptions.customReferenceData;
        }
        String str2 = str;
        if ((i & 16) != 0) {
            rc = omidOptions.impressionType;
        }
        RC rc2 = rc;
        if ((i & 32) != 0) {
            enumC5042xk = omidOptions.creativeType;
        }
        EnumC5042xk enumC5042xk2 = enumC5042xk;
        if ((i & 64) != 0) {
            enumC3346eT3 = omidOptions.mediaEventsOwner;
        }
        return omidOptions.copy(z, enumC3346eT4, enumC3346eT5, str2, rc2, enumC5042xk2, enumC3346eT3);
    }

    public final boolean component1() {
        return this.isolateVerificationScripts;
    }

    public final EnumC3346eT component2() {
        return this.impressionOwner;
    }

    public final EnumC3346eT component3() {
        return this.videoEventsOwner;
    }

    public final String component4() {
        return this.customReferenceData;
    }

    public final RC component5() {
        return this.impressionType;
    }

    public final EnumC5042xk component6() {
        return this.creativeType;
    }

    public final EnumC3346eT component7() {
        return this.mediaEventsOwner;
    }

    public final OmidOptions copy(boolean z, EnumC3346eT enumC3346eT, EnumC3346eT enumC3346eT2, String str, RC rc, EnumC5042xk enumC5042xk, EnumC3346eT enumC3346eT3) {
        return new OmidOptions(z, enumC3346eT, enumC3346eT2, str, rc, enumC5042xk, enumC3346eT3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OmidOptions)) {
            return false;
        }
        OmidOptions omidOptions = (OmidOptions) obj;
        return this.isolateVerificationScripts == omidOptions.isolateVerificationScripts && this.impressionOwner == omidOptions.impressionOwner && this.videoEventsOwner == omidOptions.videoEventsOwner && AbstractC2995aW.i(this.customReferenceData, omidOptions.customReferenceData) && this.impressionType == omidOptions.impressionType && this.creativeType == omidOptions.creativeType && this.mediaEventsOwner == omidOptions.mediaEventsOwner;
    }

    public final EnumC5042xk getCreativeType() {
        return this.creativeType;
    }

    public final String getCustomReferenceData() {
        return this.customReferenceData;
    }

    public final EnumC3346eT getImpressionOwner() {
        return this.impressionOwner;
    }

    public final RC getImpressionType() {
        return this.impressionType;
    }

    public final boolean getIsolateVerificationScripts() {
        return this.isolateVerificationScripts;
    }

    public final EnumC3346eT getMediaEventsOwner() {
        return this.mediaEventsOwner;
    }

    public final EnumC3346eT getVideoEventsOwner() {
        return this.videoEventsOwner;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    public int hashCode() {
        boolean z = this.isolateVerificationScripts;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        EnumC3346eT enumC3346eT = this.impressionOwner;
        int iHashCode = (i + (enumC3346eT == null ? 0 : enumC3346eT.hashCode())) * 31;
        EnumC3346eT enumC3346eT2 = this.videoEventsOwner;
        int iHashCode2 = (iHashCode + (enumC3346eT2 == null ? 0 : enumC3346eT2.hashCode())) * 31;
        String str = this.customReferenceData;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        RC rc = this.impressionType;
        int iHashCode4 = (iHashCode3 + (rc == null ? 0 : rc.hashCode())) * 31;
        EnumC5042xk enumC5042xk = this.creativeType;
        int iHashCode5 = (iHashCode4 + (enumC5042xk == null ? 0 : enumC5042xk.hashCode())) * 31;
        EnumC3346eT enumC3346eT3 = this.mediaEventsOwner;
        return iHashCode5 + (enumC3346eT3 != null ? enumC3346eT3.hashCode() : 0);
    }

    public String toString() {
        return "OmidOptions(isolateVerificationScripts=" + this.isolateVerificationScripts + ", impressionOwner=" + this.impressionOwner + ", videoEventsOwner=" + this.videoEventsOwner + ", customReferenceData=" + this.customReferenceData + ", impressionType=" + this.impressionType + ", creativeType=" + this.creativeType + ", mediaEventsOwner=" + this.mediaEventsOwner + ')';
    }

    public /* synthetic */ OmidOptions(boolean z, EnumC3346eT enumC3346eT, EnumC3346eT enumC3346eT2, String str, RC rc, EnumC5042xk enumC5042xk, EnumC3346eT enumC3346eT3, int i, AbstractC2471Hm abstractC2471Hm) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : enumC3346eT, (i & 4) != 0 ? null : enumC3346eT2, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : rc, (i & 32) != 0 ? null : enumC5042xk, (i & 64) == 0 ? enumC3346eT3 : null);
    }

    public OmidOptions(boolean z, EnumC3346eT enumC3346eT, EnumC3346eT enumC3346eT2, String str, RC rc, EnumC5042xk enumC5042xk, EnumC3346eT enumC3346eT3) {
        this.isolateVerificationScripts = z;
        this.impressionOwner = enumC3346eT;
        this.videoEventsOwner = enumC3346eT2;
        this.customReferenceData = str;
        this.impressionType = rc;
        this.creativeType = enumC5042xk;
        this.mediaEventsOwner = enumC3346eT3;
    }
}
