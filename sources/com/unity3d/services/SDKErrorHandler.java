package com.unity3d.services;

import com.umeng.analytics.pro.f;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3899kk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3987lk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4251ok;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4839vT;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3373ek;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3461fk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3549gk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4075mk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.U5;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes4.dex */
public final class SDKErrorHandler implements InterfaceC4075mk {
    public static final Companion Companion = new Companion(null);
    public static final String UNITY_PACKAGE = "com.unity3d";
    public static final String UNKNOWN_FILE = "unknown";
    private final AlternativeFlowReader alternativeFlowReader;
    private final AbstractC3899kk ioDispatcher;
    private final C3987lk key;
    private final InterfaceC4514rk scope;
    private final SDKMetricsSender sdkMetricsSender;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.unity3d.services.SDKErrorHandler$sendDiagnostic$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.services.SDKErrorHandler$sendDiagnostic$1", f = "SDKErrorHandler.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ String $name;
        final /* synthetic */ String $reason;
        final /* synthetic */ String $scopeName;
        final /* synthetic */ String $stackTrace;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, String str3, String str4, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$name = str;
            this.$reason = str2;
            this.$stackTrace = str3;
            this.$scopeName = str4;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return SDKErrorHandler.this.new AnonymousClass1(this.$name, this.$reason, this.$stackTrace, this.$scopeName, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((AnonymousClass1) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
            SendDiagnosticEvent.DefaultImpls.invoke$default(SDKErrorHandler.this.sendDiagnosticEvent, this.$name, null, U5.u0(new C4839vT("reason", this.$reason), new C4839vT("reason_debug", this.$stackTrace), new C4839vT("coroutine_name", this.$scopeName)), null, null, 26, null);
            return C5033xf0.f5238a;
        }
    }

    public SDKErrorHandler(AbstractC3899kk abstractC3899kk, AlternativeFlowReader alternativeFlowReader, SendDiagnosticEvent sendDiagnosticEvent, SDKMetricsSender sDKMetricsSender) {
        AbstractC2995aW.q(abstractC3899kk, "ioDispatcher");
        AbstractC2995aW.q(alternativeFlowReader, "alternativeFlowReader");
        AbstractC2995aW.q(sendDiagnosticEvent, "sendDiagnosticEvent");
        AbstractC2995aW.q(sDKMetricsSender, "sdkMetricsSender");
        this.ioDispatcher = abstractC3899kk;
        this.alternativeFlowReader = alternativeFlowReader;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.sdkMetricsSender = sDKMetricsSender;
        this.scope = WD.L(WD.a(abstractC3899kk), new C4251ok("SDKErrorHandler"));
        this.key = C3987lk.f4661a;
    }

    private final String retrieveCoroutineName(InterfaceC3549gk interfaceC3549gk) {
        String str;
        C4251ok c4251ok = (C4251ok) interfaceC3549gk.get(C4251ok.b);
        return (c4251ok == null || (str = c4251ok.f4803a) == null) ? "unknown" : str;
    }

    private final void sendDiagnostic(String str, String str2, String str3, String str4) {
        WD.D(this.scope, null, 0, new AnonymousClass1(str, str2, str4, str3, null), 3);
    }

    private final void sendMetric(Metric metric) {
        this.sdkMetricsSender.sendMetric(metric);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3549gk
    public <R> R fold(R r, InterfaceC3567gx interfaceC3567gx) {
        AbstractC2995aW.q(interfaceC3567gx, "operation");
        return (R) interfaceC3567gx.invoke(r, this);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3549gk
    public <E extends InterfaceC3373ek> E get(InterfaceC3461fk interfaceC3461fk) {
        return (E) AbstractC2995aW.D(this, interfaceC3461fk);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4075mk
    public void handleException(InterfaceC3549gk interfaceC3549gk, Throwable th) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        String str;
        AbstractC2995aW.q(interfaceC3549gk, f.X);
        AbstractC2995aW.q(th, "exception");
        String strRetrieveCoroutineName = retrieveCoroutineName(interfaceC3549gk);
        if (th instanceof NullPointerException) {
            str = "native_exception_npe";
        } else if (th instanceof OutOfMemoryError) {
            str = "native_exception_oom";
        } else if (th instanceof IllegalStateException) {
            str = "native_exception_ise";
        } else if (th instanceof SecurityException) {
            str = "native_exception_se";
        } else {
            str = th instanceof RuntimeException ? "native_exception_re" : "native_exception";
        }
        String str2 = str;
        boolean zInvoke = this.alternativeFlowReader.invoke();
        String strRetrieveUnityCrashValue = ExceptionExtensionsKt.retrieveUnityCrashValue(th);
        DeviceLog.error("Unity Ads SDK encountered an exception: " + strRetrieveUnityCrashValue);
        if (zInvoke) {
            sendDiagnostic(str2, strRetrieveUnityCrashValue, strRetrieveCoroutineName, ExceptionExtensionsKt.getShortenedStackTrace(th, 15));
        } else {
            sendMetric(new Metric(str2, strRetrieveUnityCrashValue, null, 4, null));
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3549gk
    public InterfaceC3549gk minusKey(InterfaceC3461fk interfaceC3461fk) {
        return AbstractC2995aW.b0(this, interfaceC3461fk);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3549gk
    public InterfaceC3549gk plus(InterfaceC3549gk interfaceC3549gk) {
        return AbstractC2995aW.f0(this, interfaceC3549gk);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3373ek
    public C3987lk getKey() {
        return this.key;
    }
}
