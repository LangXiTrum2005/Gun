package androidx.privacysandbox.ads.adservices.adid;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes.dex */
public final class AdId {
    private final String adId;
    private final boolean isLimitAdTrackingEnabled;

    public /* synthetic */ AdId(String str, boolean z, int i, AbstractC2471Hm abstractC2471Hm) {
        this(str, (i & 2) != 0 ? false : z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdId)) {
            return false;
        }
        AdId adId = (AdId) obj;
        return AbstractC2995aW.i(this.adId, adId.adId) && this.isLimitAdTrackingEnabled == adId.isLimitAdTrackingEnabled;
    }

    public final String getAdId() {
        return this.adId;
    }

    public int hashCode() {
        return (this.adId.hashCode() * 31) + (this.isLimitAdTrackingEnabled ? 1231 : 1237);
    }

    public final boolean isLimitAdTrackingEnabled() {
        return this.isLimitAdTrackingEnabled;
    }

    public String toString() {
        return "AdId: adId=" + this.adId + ", isLimitAdTrackingEnabled=" + this.isLimitAdTrackingEnabled;
    }

    public AdId(String str, boolean z) {
        AbstractC2995aW.q(str, "adId");
        this.adId = str;
        this.isLimitAdTrackingEnabled = z;
    }
}
