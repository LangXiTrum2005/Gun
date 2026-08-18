package androidx.privacysandbox.ads.adservices.measurement;

import android.net.Uri;
import androidx.annotation.RequiresApi;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(33)
public final class WebTriggerRegistrationRequest {
    private final Uri destination;
    private final List<WebTriggerParams> webTriggerParams;

    public WebTriggerRegistrationRequest(List<WebTriggerParams> list, Uri uri) {
        AbstractC2995aW.q(list, "webTriggerParams");
        AbstractC2995aW.q(uri, "destination");
        this.webTriggerParams = list;
        this.destination = uri;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebTriggerRegistrationRequest)) {
            return false;
        }
        WebTriggerRegistrationRequest webTriggerRegistrationRequest = (WebTriggerRegistrationRequest) obj;
        return AbstractC2995aW.i(this.webTriggerParams, webTriggerRegistrationRequest.webTriggerParams) && AbstractC2995aW.i(this.destination, webTriggerRegistrationRequest.destination);
    }

    public final Uri getDestination() {
        return this.destination;
    }

    public final List<WebTriggerParams> getWebTriggerParams() {
        return this.webTriggerParams;
    }

    public int hashCode() {
        return this.destination.hashCode() + (this.webTriggerParams.hashCode() * 31);
    }

    public String toString() {
        return "WebTriggerRegistrationRequest { WebTriggerParams=" + this.webTriggerParams + ", Destination=" + this.destination;
    }
}
