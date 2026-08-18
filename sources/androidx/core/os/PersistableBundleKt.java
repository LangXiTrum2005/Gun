package androidx.core.os;

import android.os.PersistableBundle;
import androidx.annotation.RequiresApi;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4839vT;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class PersistableBundleKt {
    @RequiresApi(21)
    public static final PersistableBundle persistableBundleOf(C4839vT... c4839vTArr) {
        PersistableBundle persistableBundleCreatePersistableBundle = PersistableBundleApi21ImplKt.createPersistableBundle(c4839vTArr.length);
        for (C4839vT c4839vT : c4839vTArr) {
            PersistableBundleApi21ImplKt.putValue(persistableBundleCreatePersistableBundle, (String) c4839vT.f5132a, c4839vT.b);
        }
        return persistableBundleCreatePersistableBundle;
    }

    @RequiresApi(21)
    public static final PersistableBundle toPersistableBundle(Map<String, ? extends Object> map) {
        PersistableBundle persistableBundleCreatePersistableBundle = PersistableBundleApi21ImplKt.createPersistableBundle(map.size());
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            PersistableBundleApi21ImplKt.putValue(persistableBundleCreatePersistableBundle, entry.getKey(), entry.getValue());
        }
        return persistableBundleCreatePersistableBundle;
    }

    @RequiresApi(21)
    public static final PersistableBundle persistableBundleOf() {
        return PersistableBundleApi21ImplKt.createPersistableBundle(0);
    }
}
