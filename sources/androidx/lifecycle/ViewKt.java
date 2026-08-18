package androidx.lifecycle;

import android.view.View;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes.dex */
public final class ViewKt {
    public static final /* synthetic */ LifecycleOwner findViewTreeLifecycleOwner(View view) {
        AbstractC2995aW.q(view, "<this>");
        return ViewTreeLifecycleOwner.get(view);
    }
}
