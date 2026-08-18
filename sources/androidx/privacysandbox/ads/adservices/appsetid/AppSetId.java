package androidx.privacysandbox.ads.adservices.appsetid;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;

/* JADX INFO: loaded from: classes.dex */
public final class AppSetId {
    public static final Companion Companion = new Companion(null);
    public static final int SCOPE_APP = 1;
    public static final int SCOPE_DEVELOPER = 2;
    private final String id;
    private final int scope;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
            this();
        }
    }

    public AppSetId(String str, int i) {
        AbstractC2995aW.q(str, "id");
        this.id = str;
        this.scope = i;
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException("Scope undefined.".toString());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppSetId)) {
            return false;
        }
        AppSetId appSetId = (AppSetId) obj;
        return AbstractC2995aW.i(this.id, appSetId.id) && this.scope == appSetId.scope;
    }

    public final String getId() {
        return this.id;
    }

    public final int getScope() {
        return this.scope;
    }

    public int hashCode() {
        return (this.id.hashCode() * 31) + this.scope;
    }

    public String toString() {
        return AbstractC5044xl.p(new StringBuilder("AppSetId: id="), this.id, ", scope=", this.scope == 1 ? "SCOPE_APP" : "SCOPE_DEVELOPER");
    }
}
