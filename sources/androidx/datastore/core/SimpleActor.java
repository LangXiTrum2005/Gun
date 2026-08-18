package androidx.datastore.core;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2542Kf;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3799je;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3975le;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G7;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2851Wd;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5000xE;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WG;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class SimpleActor<T> {
    private final InterfaceC3567gx consumeMessage;
    private final InterfaceC2851Wd messageQueue;
    private final AtomicInteger remainingMessages;
    private final InterfaceC4514rk scope;

    /* JADX INFO: renamed from: androidx.datastore.core.SimpleActor$1, reason: invalid class name */
    public static final class AnonymousClass1 extends WG implements InterfaceC2766Sw {
        final /* synthetic */ InterfaceC2766Sw $onComplete;
        final /* synthetic */ InterfaceC3567gx $onUndeliveredElement;
        final /* synthetic */ SimpleActor<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC2766Sw interfaceC2766Sw, SimpleActor<T> simpleActor, InterfaceC3567gx interfaceC3567gx) {
            super(1);
            this.$onComplete = interfaceC2766Sw;
            this.this$0 = simpleActor;
            this.$onUndeliveredElement = interfaceC3567gx;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C5033xf0.f5238a;
        }

        public final void invoke(Throwable th) {
            C5033xf0 c5033xf0;
            this.$onComplete.invoke(th);
            ((SimpleActor) this.this$0).messageQueue.q(th);
            do {
                Object objO = ((SimpleActor) this.this$0).messageQueue.o();
                c5033xf0 = null;
                if (objO instanceof C3975le) {
                    objO = null;
                }
                if (objO != null) {
                    this.$onUndeliveredElement.invoke(objO, th);
                    c5033xf0 = C5033xf0.f5238a;
                }
            } while (c5033xf0 != null);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.core.SimpleActor$offer$2, reason: invalid class name */
    @InterfaceC2314Bl(c = "androidx.datastore.core.SimpleActor$offer$2", f = "SimpleActor.kt", l = {122, 122}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends Ea0 implements InterfaceC3567gx {
        Object L$0;
        int label;
        final /* synthetic */ SimpleActor<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SimpleActor<T> simpleActor, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.this$0 = simpleActor;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return new AnonymousClass2(this.this$0, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((AnonymousClass2) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0057 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:20:0x0063 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:23:0x0070  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0061 -> B:21:0x0064). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:17:0x0057
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.sk r0 = gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk.f4993a
                int r1 = r5.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el.b0(r6)
                goto L64
            L10:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L18:
                java.lang.Object r1 = r5.L$0
                gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.gx r1 = (gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx) r1
                gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el.b0(r6)
                goto L58
            L20:
                gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el.b0(r6)
                androidx.datastore.core.SimpleActor<T> r6 = r5.this$0
                java.util.concurrent.atomic.AtomicInteger r6 = androidx.datastore.core.SimpleActor.access$getRemainingMessages$p(r6)
                int r6 = r6.get()
                if (r6 <= 0) goto L31
                r6 = 1
                goto L32
            L31:
                r6 = 0
            L32:
                if (r6 == 0) goto L73
            L34:
                androidx.datastore.core.SimpleActor<T> r6 = r5.this$0
                gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.rk r6 = androidx.datastore.core.SimpleActor.access$getScope$p(r6)
                gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.gk r6 = r6.getCoroutineContext()
                gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW.w(r6)
                androidx.datastore.core.SimpleActor<T> r6 = r5.this$0
                gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.gx r1 = androidx.datastore.core.SimpleActor.access$getConsumeMessage$p(r6)
                androidx.datastore.core.SimpleActor<T> r6 = r5.this$0
                gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Wd r6 = androidx.datastore.core.SimpleActor.access$getMessageQueue$p(r6)
                r5.L$0 = r1
                r5.label = r3
                java.lang.Object r6 = r6.i(r5)
                if (r6 != r0) goto L58
                return r0
            L58:
                r4 = 0
                r5.L$0 = r4
                r5.label = r2
                java.lang.Object r6 = r1.invoke(r6, r5)
                if (r6 != r0) goto L64
                return r0
            L64:
                androidx.datastore.core.SimpleActor<T> r6 = r5.this$0
                java.util.concurrent.atomic.AtomicInteger r6 = androidx.datastore.core.SimpleActor.access$getRemainingMessages$p(r6)
                int r6 = r6.decrementAndGet()
                if (r6 != 0) goto L34
                gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.xf0 r6 = gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0.f5238a
                return r6
            L73:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "Check failed."
                java.lang.String r0 = r0.toString()
                r6.<init>(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SimpleActor.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public SimpleActor(InterfaceC4514rk interfaceC4514rk, InterfaceC2766Sw interfaceC2766Sw, InterfaceC3567gx interfaceC3567gx, InterfaceC3567gx interfaceC3567gx2) {
        AbstractC2995aW.q(interfaceC4514rk, "scope");
        AbstractC2995aW.q(interfaceC2766Sw, "onComplete");
        AbstractC2995aW.q(interfaceC3567gx, "onUndeliveredElement");
        AbstractC2995aW.q(interfaceC3567gx2, "consumeMessage");
        this.scope = interfaceC4514rk;
        this.consumeMessage = interfaceC3567gx2;
        this.messageQueue = AbstractC3375el.a(Integer.MAX_VALUE, null, 6);
        this.remainingMessages = new AtomicInteger(0);
        InterfaceC5000xE interfaceC5000xE = (InterfaceC5000xE) interfaceC4514rk.getCoroutineContext().get(G7.e);
        if (interfaceC5000xE == null) {
            return;
        }
        interfaceC5000xE.p(new AnonymousClass1(interfaceC2766Sw, this, interfaceC3567gx));
    }

    public final void offer(T t) {
        Object objF = this.messageQueue.f(t);
        boolean z = objF instanceof C3799je;
        if (z) {
            C3799je c3799je = z ? (C3799je) objF : null;
            Throwable th = c3799je != null ? c3799je.f4562a : null;
            if (th != null) {
                throw th;
            }
            throw new C2542Kf("Channel was closed normally");
        }
        if (!(!(objF instanceof C3975le))) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (this.remainingMessages.getAndIncrement() == 0) {
            WD.D(this.scope, null, 0, new AnonymousClass2(this, null), 3);
        }
    }
}
