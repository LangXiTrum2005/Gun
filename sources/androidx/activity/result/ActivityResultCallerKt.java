package androidx.activity.result;

import androidx.activity.result.contract.ActivityResultContract;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5152z0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes.dex */
public final class ActivityResultCallerKt {
    public static final <I, O> ActivityResultLauncher<C5033xf0> registerForActivityResult(ActivityResultCaller activityResultCaller, ActivityResultContract<I, O> activityResultContract, I i, ActivityResultRegistry activityResultRegistry, InterfaceC2766Sw interfaceC2766Sw) {
        return new ActivityResultCallerLauncher(activityResultCaller.registerForActivityResult(activityResultContract, activityResultRegistry, new C5152z0(0, interfaceC2766Sw)), activityResultContract, i);
    }

    public static final <I, O> ActivityResultLauncher<C5033xf0> registerForActivityResult(ActivityResultCaller activityResultCaller, ActivityResultContract<I, O> activityResultContract, I i, InterfaceC2766Sw interfaceC2766Sw) {
        return new ActivityResultCallerLauncher(activityResultCaller.registerForActivityResult(activityResultContract, new C5152z0(1, interfaceC2766Sw)), activityResultContract, i);
    }
}
