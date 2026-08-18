package androidx.lifecycle;

import android.view.View;
import androidx.lifecycle.runtime.R;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.A40;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5073y40;

/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeLifecycleOwner {
    public static final LifecycleOwner get(View view) {
        AbstractC2995aW.q(view, "<this>");
        return (LifecycleOwner) AbstractC5073y40.K0(AbstractC5073y40.N0(A40.I0(ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$1.INSTANCE, view), ViewTreeLifecycleOwner$findViewTreeLifecycleOwner$2.INSTANCE));
    }

    public static final void set(View view, LifecycleOwner lifecycleOwner) {
        AbstractC2995aW.q(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, lifecycleOwner);
    }
}
