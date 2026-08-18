package com.unity3d.ads.core.domain.events;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2883Xj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;

/* JADX INFO: loaded from: classes4.dex */
public final class EventObservers {
    private final DiagnosticEventObserver diagnosticEventObserver;
    private final OperativeEventObserver operativeEventObserver;
    private final TransactionEventObserver transactionEventObserver;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.events.EventObservers$invoke$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.events.EventObservers", f = "EventObservers.kt", l = {16, 17, 18}, m = "invoke")
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
            return EventObservers.this.invoke(this);
        }
    }

    public EventObservers(OperativeEventObserver operativeEventObserver, DiagnosticEventObserver diagnosticEventObserver, TransactionEventObserver transactionEventObserver) {
        AbstractC2995aW.q(operativeEventObserver, "operativeEventObserver");
        AbstractC2995aW.q(diagnosticEventObserver, "diagnosticEventObserver");
        AbstractC2995aW.q(transactionEventObserver, "transactionEventObserver");
        this.operativeEventObserver = operativeEventObserver;
        this.diagnosticEventObserver = diagnosticEventObserver;
        this.transactionEventObserver = transactionEventObserver;
    }

    public final DiagnosticEventObserver getDiagnosticEventObserver() {
        return this.diagnosticEventObserver;
    }

    public final OperativeEventObserver getOperativeEventObserver() {
        return this.operativeEventObserver;
    }

    public final TransactionEventObserver getTransactionEventObserver() {
        return this.transactionEventObserver;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0070 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object invoke(InterfaceC2857Wj interfaceC2857Wj) {
        AnonymousClass1 anonymousClass1;
        EventObservers eventObservers;
        TransactionEventObserver transactionEventObserver;
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
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = anonymousClass1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                eventObservers = (EventObservers) anonymousClass1.L$0;
                AbstractC3375el.b0(obj);
            } else if (i2 == 2) {
                eventObservers = (EventObservers) anonymousClass1.L$0;
                AbstractC3375el.b0(obj);
                transactionEventObserver = eventObservers.transactionEventObserver;
                anonymousClass1.L$0 = null;
                anonymousClass1.label = 3;
                if (transactionEventObserver.invoke(anonymousClass1) == enumC4602sk) {
                    return enumC4602sk;
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
            }
            return C5033xf0.f5238a;
        }
        AbstractC3375el.b0(obj);
        OperativeEventObserver operativeEventObserver = this.operativeEventObserver;
        anonymousClass1.L$0 = this;
        anonymousClass1.label = 1;
        if (operativeEventObserver.invoke(anonymousClass1) == enumC4602sk) {
            return enumC4602sk;
        }
        eventObservers = this;
        DiagnosticEventObserver diagnosticEventObserver = eventObservers.diagnosticEventObserver;
        anonymousClass1.L$0 = eventObservers;
        anonymousClass1.label = 2;
        if (diagnosticEventObserver.invoke(anonymousClass1) == enumC4602sk) {
            return enumC4602sk;
        }
        transactionEventObserver = eventObservers.transactionEventObserver;
        anonymousClass1.L$0 = null;
        anonymousClass1.label = 3;
        if (transactionEventObserver.invoke(anonymousClass1) == enumC4602sk) {
            return enumC4602sk;
        }
        return C5033xf0.f5238a;
    }
}
