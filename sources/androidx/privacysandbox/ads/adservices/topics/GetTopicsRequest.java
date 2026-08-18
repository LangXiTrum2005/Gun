package androidx.privacysandbox.ads.adservices.topics;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes.dex */
public final class GetTopicsRequest {
    private final String adsSdkName;
    private final boolean shouldRecordObservation;

    public static final class Builder {
        private String adsSdkName = "";
        private boolean shouldRecordObservation = true;

        public final GetTopicsRequest build() {
            if (this.adsSdkName.length() > 0) {
                return new GetTopicsRequest(this.adsSdkName, this.shouldRecordObservation);
            }
            throw new IllegalStateException("adsSdkName must be set".toString());
        }

        public final Builder setAdsSdkName(String str) {
            AbstractC2995aW.q(str, "adsSdkName");
            this.adsSdkName = str;
            return this;
        }

        public final Builder setShouldRecordObservation(boolean z) {
            this.shouldRecordObservation = z;
            return this;
        }
    }

    public GetTopicsRequest() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetTopicsRequest)) {
            return false;
        }
        GetTopicsRequest getTopicsRequest = (GetTopicsRequest) obj;
        return AbstractC2995aW.i(this.adsSdkName, getTopicsRequest.adsSdkName) && this.shouldRecordObservation == getTopicsRequest.shouldRecordObservation;
    }

    public final String getAdsSdkName() {
        return this.adsSdkName;
    }

    public int hashCode() {
        return (this.adsSdkName.hashCode() * 31) + (this.shouldRecordObservation ? 1231 : 1237);
    }

    public final boolean shouldRecordObservation() {
        return this.shouldRecordObservation;
    }

    public String toString() {
        return "GetTopicsRequest: adsSdkName=" + this.adsSdkName + ", shouldRecordObservation=" + this.shouldRecordObservation;
    }

    public /* synthetic */ GetTopicsRequest(String str, boolean z, int i, AbstractC2471Hm abstractC2471Hm) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z);
    }

    public GetTopicsRequest(String str, boolean z) {
        AbstractC2995aW.q(str, "adsSdkName");
        this.adsSdkName = str;
        this.shouldRecordObservation = z;
    }
}
