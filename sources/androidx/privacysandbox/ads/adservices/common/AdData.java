package androidx.privacysandbox.ads.adservices.common;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes.dex */
public final class AdData {
    private final String metadata;
    private final Uri renderUri;

    public AdData(Uri uri, String str) {
        AbstractC2995aW.q(uri, "renderUri");
        AbstractC2995aW.q(str, TtmlNode.TAG_METADATA);
        this.renderUri = uri;
        this.metadata = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdData)) {
            return false;
        }
        AdData adData = (AdData) obj;
        return AbstractC2995aW.i(this.renderUri, adData.renderUri) && AbstractC2995aW.i(this.metadata, adData.metadata);
    }

    public final String getMetadata() {
        return this.metadata;
    }

    public final Uri getRenderUri() {
        return this.renderUri;
    }

    public int hashCode() {
        return this.metadata.hashCode() + (this.renderUri.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AdData: renderUri=");
        sb.append(this.renderUri);
        sb.append(", metadata='");
        return DM.l(sb, this.metadata, '\'');
    }
}
