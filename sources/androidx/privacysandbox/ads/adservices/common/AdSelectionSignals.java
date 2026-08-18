package androidx.privacysandbox.ads.adservices.common;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes.dex */
public final class AdSelectionSignals {
    private final String signals;

    public AdSelectionSignals(String str) {
        AbstractC2995aW.q(str, "signals");
        this.signals = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AdSelectionSignals) {
            return AbstractC2995aW.i(this.signals, ((AdSelectionSignals) obj).signals);
        }
        return false;
    }

    public final String getSignals() {
        return this.signals;
    }

    public int hashCode() {
        return this.signals.hashCode();
    }

    public String toString() {
        return "AdSelectionSignals: " + this.signals;
    }
}
