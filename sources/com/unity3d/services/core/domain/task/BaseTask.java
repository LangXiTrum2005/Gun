package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.domain.task.BaseParams;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IZ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;

/* JADX INFO: loaded from: classes4.dex */
public interface BaseTask<P extends BaseParams, R> extends IServiceComponent {

    public static final class DefaultImpls {
        public static <P extends BaseParams, R> IServiceProvider getServiceProvider(BaseTask<? super P, R> baseTask) {
            return IServiceComponent.DefaultImpls.getServiceProvider(baseTask);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX INFO: renamed from: invoke-gIAlu-s, reason: not valid java name */
        public static <P extends BaseParams, R> Object m82invokegIAlus(BaseTask<? super P, R> baseTask, P p, InterfaceC2857Wj interfaceC2857Wj) {
            BaseTask$invoke$1 baseTask$invoke$1;
            if (interfaceC2857Wj instanceof BaseTask$invoke$1) {
                baseTask$invoke$1 = (BaseTask$invoke$1) interfaceC2857Wj;
                int i = baseTask$invoke$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    baseTask$invoke$1.label = i - Integer.MIN_VALUE;
                } else {
                    baseTask$invoke$1 = new BaseTask$invoke$1(interfaceC2857Wj);
                }
            } else {
                baseTask$invoke$1 = new BaseTask$invoke$1(interfaceC2857Wj);
            }
            Object obj = baseTask$invoke$1.result;
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i2 = baseTask$invoke$1.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
                return ((IZ) obj).f3222a;
            }
            AbstractC3375el.b0(obj);
            baseTask$invoke$1.label = 1;
            Object objMo80doWorkgIAlus = baseTask.mo80doWorkgIAlus(p, baseTask$invoke$1);
            return objMo80doWorkgIAlus == enumC4602sk ? enumC4602sk : objMo80doWorkgIAlus;
        }
    }

    /* JADX INFO: renamed from: doWork-gIAlu-s, reason: not valid java name */
    Object mo80doWorkgIAlus(P p, InterfaceC2857Wj interfaceC2857Wj);

    /* JADX INFO: renamed from: invoke-gIAlu-s, reason: not valid java name */
    Object mo81invokegIAlus(P p, InterfaceC2857Wj interfaceC2857Wj);
}
