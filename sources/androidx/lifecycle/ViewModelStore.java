package androidx.lifecycle;

import androidx.annotation.RestrictTo;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class ViewModelStore {
    private final Map<String, ViewModel> map = new LinkedHashMap();

    public final void clear() {
        Iterator<ViewModel> it = this.map.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.map.clear();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final ViewModel get(String str) {
        AbstractC2995aW.q(str, "key");
        return this.map.get(str);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Set<String> keys() {
        return new HashSet(this.map.keySet());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void put(String str, ViewModel viewModel) {
        AbstractC2995aW.q(str, "key");
        AbstractC2995aW.q(viewModel, "viewModel");
        ViewModel viewModelPut = this.map.put(str, viewModel);
        if (viewModelPut != null) {
            viewModelPut.onCleared();
        }
    }
}
