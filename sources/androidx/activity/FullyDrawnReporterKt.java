package androidx.activity;

import com.badlogic.gdx.Input;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2883Xj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;

/* JADX INFO: loaded from: classes.dex */
public final class FullyDrawnReporterKt {

    /* JADX INFO: renamed from: androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "androidx.activity.FullyDrawnReporterKt", f = "FullyDrawnReporter.kt", l = {Input.Keys.F15}, m = "reportWhenComplete")
    public static final class AnonymousClass1 extends AbstractC2883Xj {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(InterfaceC2857Wj interfaceC2857Wj) {
            super(interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FullyDrawnReporterKt.reportWhenComplete(null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object reportWhenComplete(FullyDrawnReporter fullyDrawnReporter, InterfaceC2766Sw interfaceC2766Sw, InterfaceC2857Wj interfaceC2857Wj) {
        AnonymousClass1 anonymousClass1;
        if (interfaceC2857Wj instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) interfaceC2857Wj;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(interfaceC2857Wj);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(interfaceC2857Wj);
        }
        Object obj = anonymousClass1.result;
        Object obj2 = EnumC4602sk.f4993a;
        int i2 = anonymousClass1.label;
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        try {
            if (i2 == 0) {
                AbstractC3375el.b0(obj);
                fullyDrawnReporter.addReporter();
                if (fullyDrawnReporter.isFullyDrawnReported()) {
                    return c5033xf0;
                }
                anonymousClass1.L$0 = fullyDrawnReporter;
                anonymousClass1.label = 1;
                if (interfaceC2766Sw.invoke(anonymousClass1) == obj2) {
                    return obj2;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fullyDrawnReporter = (FullyDrawnReporter) anonymousClass1.L$0;
                AbstractC3375el.b0(obj);
            }
            fullyDrawnReporter.removeReporter();
            return c5033xf0;
        } catch (Throwable th) {
            fullyDrawnReporter.removeReporter();
            throw th;
        }
    }

    private static final Object reportWhenComplete$$forInline(FullyDrawnReporter fullyDrawnReporter, InterfaceC2766Sw interfaceC2766Sw, InterfaceC2857Wj interfaceC2857Wj) {
        fullyDrawnReporter.addReporter();
        boolean zIsFullyDrawnReported = fullyDrawnReporter.isFullyDrawnReported();
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        if (zIsFullyDrawnReported) {
            return c5033xf0;
        }
        try {
            interfaceC2766Sw.invoke(interfaceC2857Wj);
            return c5033xf0;
        } finally {
            fullyDrawnReporter.removeReporter();
        }
    }
}
