package androidx.privacysandbox.ads.adservices.customaudience;

import androidx.privacysandbox.ads.adservices.common.AdTechIdentifier;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes.dex */
public final class LeaveCustomAudienceRequest {
    private final AdTechIdentifier buyer;
    private final String name;

    public LeaveCustomAudienceRequest(AdTechIdentifier adTechIdentifier, String str) {
        AbstractC2995aW.q(adTechIdentifier, "buyer");
        AbstractC2995aW.q(str, "name");
        this.buyer = adTechIdentifier;
        this.name = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LeaveCustomAudienceRequest)) {
            return false;
        }
        LeaveCustomAudienceRequest leaveCustomAudienceRequest = (LeaveCustomAudienceRequest) obj;
        return AbstractC2995aW.i(this.buyer, leaveCustomAudienceRequest.buyer) && AbstractC2995aW.i(this.name, leaveCustomAudienceRequest.name);
    }

    public final AdTechIdentifier getBuyer() {
        return this.buyer;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode() + (this.buyer.hashCode() * 31);
    }

    public String toString() {
        return "LeaveCustomAudience: buyer=" + this.buyer + ", name=" + this.name;
    }
}
