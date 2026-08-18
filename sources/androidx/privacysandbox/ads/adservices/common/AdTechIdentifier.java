package androidx.privacysandbox.ads.adservices.common;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes.dex */
public final class AdTechIdentifier {
    private final String identifier;

    public AdTechIdentifier(String str) {
        AbstractC2995aW.q(str, "identifier");
        this.identifier = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AdTechIdentifier) {
            return AbstractC2995aW.i(this.identifier, ((AdTechIdentifier) obj).identifier);
        }
        return false;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public int hashCode() {
        return this.identifier.hashCode();
    }

    public String toString() {
        return String.valueOf(this.identifier);
    }
}
