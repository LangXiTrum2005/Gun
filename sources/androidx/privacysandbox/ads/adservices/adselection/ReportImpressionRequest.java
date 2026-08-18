package androidx.privacysandbox.ads.adservices.adselection;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes.dex */
public final class ReportImpressionRequest {
    private final AdSelectionConfig adSelectionConfig;
    private final long adSelectionId;

    public ReportImpressionRequest(long j, AdSelectionConfig adSelectionConfig) {
        AbstractC2995aW.q(adSelectionConfig, "adSelectionConfig");
        this.adSelectionId = j;
        this.adSelectionConfig = adSelectionConfig;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReportImpressionRequest)) {
            return false;
        }
        ReportImpressionRequest reportImpressionRequest = (ReportImpressionRequest) obj;
        return this.adSelectionId == reportImpressionRequest.adSelectionId && AbstractC2995aW.i(this.adSelectionConfig, reportImpressionRequest.adSelectionConfig);
    }

    public final AdSelectionConfig getAdSelectionConfig() {
        return this.adSelectionConfig;
    }

    public final long getAdSelectionId() {
        return this.adSelectionId;
    }

    public int hashCode() {
        long j = this.adSelectionId;
        return this.adSelectionConfig.hashCode() + (((int) (j ^ (j >>> 32))) * 31);
    }

    public String toString() {
        return "ReportImpressionRequest: adSelectionId=" + this.adSelectionId + ", adSelectionConfig=" + this.adSelectionConfig;
    }
}
