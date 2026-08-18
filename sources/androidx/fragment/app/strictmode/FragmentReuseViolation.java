package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes.dex */
public final class FragmentReuseViolation extends Violation {
    private final String previousFragmentId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentReuseViolation(Fragment fragment, String str) {
        super(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + str);
        AbstractC2995aW.q(fragment, "fragment");
        AbstractC2995aW.q(str, "previousFragmentId");
        this.previousFragmentId = str;
    }

    public final String getPreviousFragmentId() {
        return this.previousFragmentId;
    }
}
