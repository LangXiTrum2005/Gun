package androidx.activity;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.RequiresApi;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2642Oc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2734Rq;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC5024xb;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4530rv;

/* JADX INFO: loaded from: classes.dex */
public final class PipHintTrackerKt {
    @RequiresApi(26)
    public static final Object trackPipAnimationHintView(final Activity activity, View view, InterfaceC2857Wj interfaceC2857Wj) {
        Object objCollect = new C2642Oc(new PipHintTrackerKt$trackPipAnimationHintView$flow$1(view, null), C2734Rq.f3684a, -2, EnumC5024xb.f5229a).collect(new InterfaceC4530rv() { // from class: androidx.activity.PipHintTrackerKt.trackPipAnimationHintView.2
            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4530rv
            public final Object emit(Rect rect, InterfaceC2857Wj interfaceC2857Wj2) {
                Api26Impl.INSTANCE.setPipParamsSourceRectHint(activity, rect);
                return C5033xf0.f5238a;
            }
        }, interfaceC2857Wj);
        return objCollect == EnumC4602sk.f4993a ? objCollect : C5033xf0.f5238a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect trackPipAnimationHintView$positionInWindow(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect;
    }
}
