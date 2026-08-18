package androidx.work;

import androidx.annotation.NonNull;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3156cG;

/* JADX INFO: loaded from: classes.dex */
public final class OneTimeWorkRequestKt {
    public static final <W extends ListenableWorker> OneTimeWorkRequest.Builder OneTimeWorkRequestBuilder() {
        AbstractC2995aW.w0();
        throw null;
    }

    public static final OneTimeWorkRequest.Builder setInputMerger(OneTimeWorkRequest.Builder builder, @NonNull InterfaceC3156cG interfaceC3156cG) {
        AbstractC2995aW.q(builder, "<this>");
        AbstractC2995aW.q(interfaceC3156cG, "inputMerger");
        OneTimeWorkRequest.Builder inputMerger = builder.setInputMerger(AbstractC2995aW.K(interfaceC3156cG));
        AbstractC2995aW.p(inputMerger, "setInputMerger(inputMerger.java)");
        return inputMerger;
    }
}
