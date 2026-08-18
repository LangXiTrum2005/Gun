package androidx.privacysandbox.ads.adservices.customaudience;

import android.net.Uri;
import androidx.privacysandbox.ads.adservices.common.AdData;
import androidx.privacysandbox.ads.adservices.common.AdSelectionSignals;
import androidx.privacysandbox.ads.adservices.common.AdTechIdentifier;
import com.mbridge.msdk.foundation.entity.b;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.time.Instant;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class CustomAudience {
    private final Instant activationTime;
    private final List<AdData> ads;
    private final Uri biddingLogicUri;
    private final AdTechIdentifier buyer;
    private final Uri dailyUpdateUri;
    private final Instant expirationTime;
    private final String name;
    private final TrustedBiddingData trustedBiddingSignals;
    private final AdSelectionSignals userBiddingSignals;

    public static final class Builder {
        private Instant activationTime;
        private List<AdData> ads;
        private Uri biddingLogicUri;
        private AdTechIdentifier buyer;
        private Uri dailyUpdateUri;
        private Instant expirationTime;
        private String name;
        private TrustedBiddingData trustedBiddingData;
        private AdSelectionSignals userBiddingSignals;

        public Builder(AdTechIdentifier adTechIdentifier, String str, Uri uri, Uri uri2, List<AdData> list) {
            AbstractC2995aW.q(adTechIdentifier, "buyer");
            AbstractC2995aW.q(str, "name");
            AbstractC2995aW.q(uri, "dailyUpdateUri");
            AbstractC2995aW.q(uri2, "biddingLogicUri");
            AbstractC2995aW.q(list, b.JSON_KEY_ADS);
            this.buyer = adTechIdentifier;
            this.name = str;
            this.dailyUpdateUri = uri;
            this.biddingLogicUri = uri2;
            this.ads = list;
        }

        public final CustomAudience build() {
            return new CustomAudience(this.buyer, this.name, this.dailyUpdateUri, this.biddingLogicUri, this.ads, this.activationTime, this.expirationTime, this.userBiddingSignals, this.trustedBiddingData);
        }

        public final Builder setActivationTime(Instant instant) {
            AbstractC2995aW.q(instant, "activationTime");
            this.activationTime = instant;
            return this;
        }

        public final Builder setAds(List<AdData> list) {
            AbstractC2995aW.q(list, b.JSON_KEY_ADS);
            this.ads = list;
            return this;
        }

        public final Builder setBiddingLogicUri(Uri uri) {
            AbstractC2995aW.q(uri, "biddingLogicUri");
            this.biddingLogicUri = uri;
            return this;
        }

        public final Builder setBuyer(AdTechIdentifier adTechIdentifier) {
            AbstractC2995aW.q(adTechIdentifier, "buyer");
            this.buyer = adTechIdentifier;
            return this;
        }

        public final Builder setDailyUpdateUri(Uri uri) {
            AbstractC2995aW.q(uri, "dailyUpdateUri");
            this.dailyUpdateUri = uri;
            return this;
        }

        public final Builder setExpirationTime(Instant instant) {
            AbstractC2995aW.q(instant, "expirationTime");
            this.expirationTime = instant;
            return this;
        }

        public final Builder setName(String str) {
            AbstractC2995aW.q(str, "name");
            this.name = str;
            return this;
        }

        public final Builder setTrustedBiddingData(TrustedBiddingData trustedBiddingData) {
            AbstractC2995aW.q(trustedBiddingData, "trustedBiddingSignals");
            this.trustedBiddingData = trustedBiddingData;
            return this;
        }

        public final Builder setUserBiddingSignals(AdSelectionSignals adSelectionSignals) {
            AbstractC2995aW.q(adSelectionSignals, "userBiddingSignals");
            this.userBiddingSignals = adSelectionSignals;
            return this;
        }
    }

    public /* synthetic */ CustomAudience(AdTechIdentifier adTechIdentifier, String str, Uri uri, Uri uri2, List list, Instant instant, Instant instant2, AdSelectionSignals adSelectionSignals, TrustedBiddingData trustedBiddingData, int i, AbstractC2471Hm abstractC2471Hm) {
        this(adTechIdentifier, str, uri, uri2, list, (i & 32) != 0 ? null : instant, (i & 64) != 0 ? null : instant2, (i & 128) != 0 ? null : adSelectionSignals, (i & 256) != 0 ? null : trustedBiddingData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomAudience)) {
            return false;
        }
        CustomAudience customAudience = (CustomAudience) obj;
        return AbstractC2995aW.i(this.buyer, customAudience.buyer) && AbstractC2995aW.i(this.name, customAudience.name) && AbstractC2995aW.i(this.activationTime, customAudience.activationTime) && AbstractC2995aW.i(this.expirationTime, customAudience.expirationTime) && AbstractC2995aW.i(this.dailyUpdateUri, customAudience.dailyUpdateUri) && AbstractC2995aW.i(this.userBiddingSignals, customAudience.userBiddingSignals) && AbstractC2995aW.i(this.trustedBiddingSignals, customAudience.trustedBiddingSignals) && AbstractC2995aW.i(this.ads, customAudience.ads);
    }

    public final Instant getActivationTime() {
        return this.activationTime;
    }

    public final List<AdData> getAds() {
        return this.ads;
    }

    public final Uri getBiddingLogicUri() {
        return this.biddingLogicUri;
    }

    public final AdTechIdentifier getBuyer() {
        return this.buyer;
    }

    public final Uri getDailyUpdateUri() {
        return this.dailyUpdateUri;
    }

    public final Instant getExpirationTime() {
        return this.expirationTime;
    }

    public final String getName() {
        return this.name;
    }

    public final TrustedBiddingData getTrustedBiddingSignals() {
        return this.trustedBiddingSignals;
    }

    public final AdSelectionSignals getUserBiddingSignals() {
        return this.userBiddingSignals;
    }

    public int hashCode() {
        int iD = DM.d(this.name, this.buyer.hashCode() * 31, 31);
        Instant instant = this.activationTime;
        int iHashCode = (iD + (instant != null ? instant.hashCode() : 0)) * 31;
        Instant instant2 = this.expirationTime;
        int iHashCode2 = (this.dailyUpdateUri.hashCode() + ((iHashCode + (instant2 != null ? instant2.hashCode() : 0)) * 31)) * 31;
        AdSelectionSignals adSelectionSignals = this.userBiddingSignals;
        int iHashCode3 = (iHashCode2 + (adSelectionSignals != null ? adSelectionSignals.hashCode() : 0)) * 31;
        TrustedBiddingData trustedBiddingData = this.trustedBiddingSignals;
        int iHashCode4 = trustedBiddingData != null ? trustedBiddingData.hashCode() : 0;
        return this.ads.hashCode() + ((this.biddingLogicUri.hashCode() + ((iHashCode3 + iHashCode4) * 31)) * 31);
    }

    public String toString() {
        return "CustomAudience: buyer=" + this.biddingLogicUri + ", activationTime=" + this.activationTime + ", expirationTime=" + this.expirationTime + ", dailyUpdateUri=" + this.dailyUpdateUri + ", userBiddingSignals=" + this.userBiddingSignals + ", trustedBiddingSignals=" + this.trustedBiddingSignals + ", biddingLogicUri=" + this.biddingLogicUri + ", ads=" + this.ads;
    }

    public CustomAudience(AdTechIdentifier adTechIdentifier, String str, Uri uri, Uri uri2, List<AdData> list, Instant instant, Instant instant2, AdSelectionSignals adSelectionSignals, TrustedBiddingData trustedBiddingData) {
        AbstractC2995aW.q(adTechIdentifier, "buyer");
        AbstractC2995aW.q(str, "name");
        AbstractC2995aW.q(uri, "dailyUpdateUri");
        AbstractC2995aW.q(uri2, "biddingLogicUri");
        AbstractC2995aW.q(list, b.JSON_KEY_ADS);
        this.buyer = adTechIdentifier;
        this.name = str;
        this.dailyUpdateUri = uri;
        this.biddingLogicUri = uri2;
        this.ads = list;
        this.activationTime = instant;
        this.expirationTime = instant2;
        this.userBiddingSignals = adSelectionSignals;
        this.trustedBiddingSignals = trustedBiddingData;
    }
}
