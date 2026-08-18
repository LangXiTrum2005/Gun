package androidx.lifecycle;

import android.view.View;
import androidx.lifecycle.viewmodel.R;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.A40;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5073y40;

/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeViewModelStoreOwner {
    public static final ViewModelStoreOwner get(View view) {
        AbstractC2995aW.q(view, "<this>");
        return (ViewModelStoreOwner) AbstractC5073y40.K0(AbstractC5073y40.N0(A40.I0(ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$1.INSTANCE, view), ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2.INSTANCE));
    }

    public static final void set(View view, ViewModelStoreOwner viewModelStoreOwner) {
        AbstractC2995aW.q(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, viewModelStoreOwner);
    }
}
