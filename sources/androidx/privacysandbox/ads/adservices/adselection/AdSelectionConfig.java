package androidx.privacysandbox.ads.adservices.adselection;

import android.net.Uri;
import androidx.privacysandbox.ads.adservices.common.AdSelectionSignals;
import androidx.privacysandbox.ads.adservices.common.AdTechIdentifier;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AdSelectionConfig {
    private final AdSelectionSignals adSelectionSignals;
    private final List<AdTechIdentifier> customAudienceBuyers;
    private final Uri decisionLogicUri;
    private final Map<AdTechIdentifier, AdSelectionSignals> perBuyerSignals;
    private final AdTechIdentifier seller;
    private final AdSelectionSignals sellerSignals;
    private final Uri trustedScoringSignalsUri;

    public AdSelectionConfig(AdTechIdentifier adTechIdentifier, Uri uri, List<AdTechIdentifier> list, AdSelectionSignals adSelectionSignals, AdSelectionSignals adSelectionSignals2, Map<AdTechIdentifier, AdSelectionSignals> map, Uri uri2) {
        AbstractC2995aW.q(adTechIdentifier, "seller");
        AbstractC2995aW.q(uri, "decisionLogicUri");
        AbstractC2995aW.q(list, "customAudienceBuyers");
        AbstractC2995aW.q(adSelectionSignals, "adSelectionSignals");
        AbstractC2995aW.q(adSelectionSignals2, "sellerSignals");
        AbstractC2995aW.q(map, "perBuyerSignals");
        AbstractC2995aW.q(uri2, "trustedScoringSignalsUri");
        this.seller = adTechIdentifier;
        this.decisionLogicUri = uri;
        this.customAudienceBuyers = list;
        this.adSelectionSignals = adSelectionSignals;
        this.sellerSignals = adSelectionSignals2;
        this.perBuyerSignals = map;
        this.trustedScoringSignalsUri = uri2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdSelectionConfig)) {
            return false;
        }
        AdSelectionConfig adSelectionConfig = (AdSelectionConfig) obj;
        return AbstractC2995aW.i(this.seller, adSelectionConfig.seller) && AbstractC2995aW.i(this.decisionLogicUri, adSelectionConfig.decisionLogicUri) && AbstractC2995aW.i(this.customAudienceBuyers, adSelectionConfig.customAudienceBuyers) && AbstractC2995aW.i(this.adSelectionSignals, adSelectionConfig.adSelectionSignals) && AbstractC2995aW.i(this.sellerSignals, adSelectionConfig.sellerSignals) && AbstractC2995aW.i(this.perBuyerSignals, adSelectionConfig.perBuyerSignals) && AbstractC2995aW.i(this.trustedScoringSignalsUri, adSelectionConfig.trustedScoringSignalsUri);
    }

    public final AdSelectionSignals getAdSelectionSignals() {
        return this.adSelectionSignals;
    }

    public final List<AdTechIdentifier> getCustomAudienceBuyers() {
        return this.customAudienceBuyers;
    }

    public final Uri getDecisionLogicUri() {
        return this.decisionLogicUri;
    }

    public final Map<AdTechIdentifier, AdSelectionSignals> getPerBuyerSignals() {
        return this.perBuyerSignals;
    }

    public final AdTechIdentifier getSeller() {
        return this.seller;
    }

    public final AdSelectionSignals getSellerSignals() {
        return this.sellerSignals;
    }

    public final Uri getTrustedScoringSignalsUri() {
        return this.trustedScoringSignalsUri;
    }

    public int hashCode() {
        return this.trustedScoringSignalsUri.hashCode() + ((this.perBuyerSignals.hashCode() + ((this.sellerSignals.hashCode() + ((this.adSelectionSignals.hashCode() + ((this.customAudienceBuyers.hashCode() + ((this.decisionLogicUri.hashCode() + (this.seller.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "AdSelectionConfig: seller=" + this.seller + ", decisionLogicUri='" + this.decisionLogicUri + "', customAudienceBuyers=" + this.customAudienceBuyers + ", adSelectionSignals=" + this.adSelectionSignals + ", sellerSignals=" + this.sellerSignals + ", perBuyerSignals=" + this.perBuyerSignals + ", trustedScoringSignalsUri=" + this.trustedScoringSignalsUri;
    }
}
