package androidx.savedstate;

import android.view.View;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.A40;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5073y40;

/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeSavedStateRegistryOwner {
    public static final SavedStateRegistryOwner get(View view) {
        AbstractC2995aW.q(view, "<this>");
        return (SavedStateRegistryOwner) AbstractC5073y40.K0(AbstractC5073y40.N0(A40.I0(ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$1.INSTANCE, view), ViewTreeSavedStateRegistryOwner$findViewTreeSavedStateRegistryOwner$2.INSTANCE));
    }

    public static final void set(View view, SavedStateRegistryOwner savedStateRegistryOwner) {
        AbstractC2995aW.q(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, savedStateRegistryOwner);
    }
}
