package androidx.privacysandbox.ads.adservices.adselection;

import android.net.Uri;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes.dex */
public final class AdSelectionOutcome {
    private final long adSelectionId;
    private final Uri renderUri;

    public AdSelectionOutcome(long j, Uri uri) {
        AbstractC2995aW.q(uri, "renderUri");
        this.adSelectionId = j;
        this.renderUri = uri;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdSelectionOutcome)) {
            return false;
        }
        AdSelectionOutcome adSelectionOutcome = (AdSelectionOutcome) obj;
        return this.adSelectionId == adSelectionOutcome.adSelectionId && AbstractC2995aW.i(this.renderUri, adSelectionOutcome.renderUri);
    }

    public final long getAdSelectionId() {
        return this.adSelectionId;
    }

    public final Uri getRenderUri() {
        return this.renderUri;
    }

    public int hashCode() {
        long j = this.adSelectionId;
        return this.renderUri.hashCode() + (((int) (j ^ (j >>> 32))) * 31);
    }

    public String toString() {
        return "AdSelectionOutcome: adSelectionId=" + this.adSelectionId + ", renderUri=" + this.renderUri;
    }
}
