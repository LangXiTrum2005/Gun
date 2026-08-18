package com.unity3d.ads.core.data.model;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes4.dex */
public final class OMData {
    private final String partnerName;
    private final String partnerVersion;
    private final String version;

    public OMData(String str, String str2, String str3) {
        AbstractC2995aW.q(str, "version");
        AbstractC2995aW.q(str2, HandleInvocationsFromAdViewer.KEY_OM_PARTNER);
        AbstractC2995aW.q(str3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION);
        this.version = str;
        this.partnerName = str2;
        this.partnerVersion = str3;
    }

    public static /* synthetic */ OMData copy$default(OMData oMData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oMData.version;
        }
        if ((i & 2) != 0) {
            str2 = oMData.partnerName;
        }
        if ((i & 4) != 0) {
            str3 = oMData.partnerVersion;
        }
        return oMData.copy(str, str2, str3);
    }

    public final String component1() {
        return this.version;
    }

    public final String component2() {
        return this.partnerName;
    }

    public final String component3() {
        return this.partnerVersion;
    }

    public final OMData copy(String str, String str2, String str3) {
        AbstractC2995aW.q(str, "version");
        AbstractC2995aW.q(str2, HandleInvocationsFromAdViewer.KEY_OM_PARTNER);
        AbstractC2995aW.q(str3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION);
        return new OMData(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OMData)) {
            return false;
        }
        OMData oMData = (OMData) obj;
        return AbstractC2995aW.i(this.version, oMData.version) && AbstractC2995aW.i(this.partnerName, oMData.partnerName) && AbstractC2995aW.i(this.partnerVersion, oMData.partnerVersion);
    }

    public final String getPartnerName() {
        return this.partnerName;
    }

    public final String getPartnerVersion() {
        return this.partnerVersion;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.partnerVersion.hashCode() + DM.d(this.partnerName, this.version.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("OMData(version=");
        sb.append(this.version);
        sb.append(", partnerName=");
        sb.append(this.partnerName);
        sb.append(", partnerVersion=");
        return DM.l(sb, this.partnerVersion, ')');
    }
}
