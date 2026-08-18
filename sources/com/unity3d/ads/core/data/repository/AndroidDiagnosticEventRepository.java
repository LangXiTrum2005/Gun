package com.unity3d.ads.core.data.repository;

import com.badlogic.gdx.Input;
import com.unity3d.ads.core.domain.events.GetDiagnosticEventRequest;
import com.unity3d.ads.core.utils.CoroutineTimer;
import com.unity3d.services.core.log.DeviceLog;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2853Wf;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3899kk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4637t60;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4995x90;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5073y40;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BX;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2812Uq;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4251ok;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4549s60;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4907w90;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4221oQ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4286p60;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4309pQ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WG;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidDiagnosticEventRepository implements DiagnosticEventRepository {
    private final InterfaceC4221oQ _diagnosticEvents;
    private final Set<DiagnosticEventRequestOuterClass.DiagnosticEventType> allowedEvents;
    private final InterfaceC4309pQ batch;
    private final Set<DiagnosticEventRequestOuterClass.DiagnosticEventType> blockedEvents;
    private final InterfaceC4309pQ configured;
    private final InterfaceC4514rk coroutineScope;
    private final InterfaceC4286p60 diagnosticEvents;
    private final InterfaceC4309pQ enabled;
    private final CoroutineTimer flushTimer;
    private final GetDiagnosticEventRequest getDiagnosticEventRequest;
    private int maxBatchSize;

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository$configure$1, reason: invalid class name */
    public static final class AnonymousClass1 extends WG implements InterfaceC2714Qw {
        public AnonymousClass1() {
            super(0);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
        public /* bridge */ /* synthetic */ Object invoke() {
            m74invoke();
            return C5033xf0.f5238a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m74invoke() {
            AndroidDiagnosticEventRepository.this.flush();
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository$flush$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository$flush$1", f = "AndroidDiagnosticEventRepository.kt", l = {Input.Keys.GRAVE}, m = "invokeSuspend")
    public static final class C21981 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ List<DiagnosticEventRequestOuterClass.DiagnosticEvent> $events;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21981(List<DiagnosticEventRequestOuterClass.DiagnosticEvent> list, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$events = list;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return AndroidDiagnosticEventRepository.this.new C21981(this.$events, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((C21981) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i = this.label;
            if (i == 0) {
                AbstractC3375el.b0(obj);
                InterfaceC4221oQ interfaceC4221oQ = AndroidDiagnosticEventRepository.this._diagnosticEvents;
                List<DiagnosticEventRequestOuterClass.DiagnosticEvent> list = this.$events;
                this.label = 1;
                if (interfaceC4221oQ.emit(list, this) == enumC4602sk) {
                    return enumC4602sk;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
            }
            return C5033xf0.f5238a;
        }
    }

    public AndroidDiagnosticEventRepository(CoroutineTimer coroutineTimer, GetDiagnosticEventRequest getDiagnosticEventRequest, AbstractC3899kk abstractC3899kk) {
        AbstractC2995aW.q(coroutineTimer, "flushTimer");
        AbstractC2995aW.q(getDiagnosticEventRequest, "getDiagnosticEventRequest");
        AbstractC2995aW.q(abstractC3899kk, "dispatcher");
        this.flushTimer = coroutineTimer;
        this.getDiagnosticEventRequest = getDiagnosticEventRequest;
        this.coroutineScope = WD.L(WD.a(abstractC3899kk), new C4251ok("DiagnosticEventRepository"));
        this.batch = AbstractC4995x90.a(C2812Uq.f3846a);
        this.maxBatchSize = Integer.MAX_VALUE;
        this.allowedEvents = Collections.synchronizedSet(new LinkedHashSet());
        this.blockedEvents = Collections.synchronizedSet(new LinkedHashSet());
        Boolean bool = Boolean.FALSE;
        this.enabled = AbstractC4995x90.a(bool);
        this.configured = AbstractC4995x90.a(bool);
        C4549s60 c4549s60B = AbstractC4637t60.b(100, 6);
        this._diagnosticEvents = c4549s60B;
        this.diagnosticEvents = new BX(c4549s60B);
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void addDiagnosticEvent(DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
        C4907w90 c4907w90;
        Object value;
        C4907w90 c4907w91;
        Object value2;
        AbstractC2995aW.q(diagnosticEvent, "diagnosticEvent");
        if (!((Boolean) ((C4907w90) this.configured).getValue()).booleanValue()) {
            InterfaceC4309pQ interfaceC4309pQ = this.batch;
            do {
                c4907w91 = (C4907w90) interfaceC4309pQ;
                value2 = c4907w91.getValue();
            } while (!c4907w91.h(value2, AbstractC2853Wf.q0(diagnosticEvent, (List) value2)));
            return;
        }
        if (((Boolean) ((C4907w90) this.enabled).getValue()).booleanValue()) {
            InterfaceC4309pQ interfaceC4309pQ2 = this.batch;
            do {
                c4907w90 = (C4907w90) interfaceC4309pQ2;
                value = c4907w90.getValue();
            } while (!c4907w90.h(value, AbstractC2853Wf.q0(diagnosticEvent, (List) value)));
            if (((List) ((C4907w90) this.batch).getValue()).size() >= this.maxBatchSize) {
                flush();
            }
        }
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void clear() {
        C4907w90 c4907w90;
        Object value;
        InterfaceC4309pQ interfaceC4309pQ = this.batch;
        do {
            c4907w90 = (C4907w90) interfaceC4309pQ;
            value = c4907w90.getValue();
        } while (!c4907w90.h(value, C2812Uq.f3846a));
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void configure(NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticEventsConfiguration) throws IllegalAccessException, InvocationTargetException {
        AbstractC2995aW.q(diagnosticEventsConfiguration, "diagnosticsEventsConfiguration");
        ((C4907w90) this.configured).i(Boolean.TRUE);
        ((C4907w90) this.enabled).i(Boolean.valueOf(diagnosticEventsConfiguration.getEnabled()));
        if (!((Boolean) ((C4907w90) this.enabled).getValue()).booleanValue()) {
            clear();
            return;
        }
        this.maxBatchSize = diagnosticEventsConfiguration.getMaxBatchSize();
        Set<DiagnosticEventRequestOuterClass.DiagnosticEventType> set = this.allowedEvents;
        List<DiagnosticEventRequestOuterClass.DiagnosticEventType> allowedEventsList = diagnosticEventsConfiguration.getAllowedEventsList();
        AbstractC2995aW.p(allowedEventsList, "diagnosticsEventsConfiguration.allowedEventsList");
        set.addAll(allowedEventsList);
        Set<DiagnosticEventRequestOuterClass.DiagnosticEventType> set2 = this.blockedEvents;
        List<DiagnosticEventRequestOuterClass.DiagnosticEventType> blockedEventsList = diagnosticEventsConfiguration.getBlockedEventsList();
        AbstractC2995aW.p(blockedEventsList, "diagnosticsEventsConfiguration.blockedEventsList");
        set2.addAll(blockedEventsList);
        this.flushTimer.start(0L, diagnosticEventsConfiguration.getMaxBatchIntervalMs(), new AnonymousClass1());
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public void flush() {
        C4907w90 c4907w90;
        Object value;
        if (((Boolean) ((C4907w90) this.enabled).getValue()).booleanValue()) {
            InterfaceC4309pQ interfaceC4309pQ = this.batch;
            do {
                c4907w90 = (C4907w90) interfaceC4309pQ;
                value = c4907w90.getValue();
            } while (!c4907w90.h(value, C2812Uq.f3846a));
            List listP0 = AbstractC5073y40.P0(AbstractC5073y40.J0(AbstractC5073y40.J0(AbstractC5073y40.M0(AbstractC2853Wf.c0((Iterable) value), new AndroidDiagnosticEventRepository$flush$events$2(this)), new AndroidDiagnosticEventRepository$flush$events$3(this)), new AndroidDiagnosticEventRepository$flush$events$4(this)));
            if (!listP0.isEmpty()) {
                DeviceLog.debug("Unity Ads Sending diagnostic batch enabled: " + ((Boolean) ((C4907w90) this.enabled).getValue()).booleanValue() + " size: " + listP0.size() + " :: " + listP0);
                WD.D(this.coroutineScope, null, 0, new C21981(listP0, null), 3);
            }
        }
    }

    @Override // com.unity3d.ads.core.data.repository.DiagnosticEventRepository
    public InterfaceC4286p60 getDiagnosticEvents() {
        return this.diagnosticEvents;
    }
}
