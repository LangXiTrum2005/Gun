package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4545s40;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WG;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ViewGroupKt$descendants$1$1 extends WG implements InterfaceC2766Sw {
    public static final ViewGroupKt$descendants$1$1 INSTANCE = new ViewGroupKt$descendants$1$1();

    public ViewGroupKt$descendants$1$1() {
        super(1);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
    public final Iterator<View> invoke(View view) {
        InterfaceC4545s40 children;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null || (children = ViewGroupKt.getChildren(viewGroup)) == null) {
            return null;
        }
        return children.iterator();
    }
}
