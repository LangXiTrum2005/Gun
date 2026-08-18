package com.unity3d.ads.core.domain.om;

import android.content.Context;
import com.umeng.analytics.pro.f;
import com.unity3d.ads.core.data.model.OMResult;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2883Xj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Bc0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2985aM;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IP;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidInitializeOMSDK implements InitializeOMSDK {
    private final Context context;
    private final OpenMeasurementRepository omRepository;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK$invoke$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.om.AndroidInitializeOMSDK", f = "AndroidInitializeOMSDK.kt", l = {27}, m = "invoke")
    public static final class AnonymousClass1 extends AbstractC2883Xj {
        long J$0;
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
            return AndroidInitializeOMSDK.this.invoke(this);
        }
    }

    public AndroidInitializeOMSDK(Context context, SendDiagnosticEvent sendDiagnosticEvent, SessionRepository sessionRepository, OpenMeasurementRepository openMeasurementRepository) {
        AbstractC2995aW.q(context, f.X);
        AbstractC2995aW.q(sendDiagnosticEvent, "sendDiagnosticEvent");
        AbstractC2995aW.q(sessionRepository, "sessionRepository");
        AbstractC2995aW.q(openMeasurementRepository, "omRepository");
        this.context = context;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.sessionRepository = sessionRepository;
        this.omRepository = openMeasurementRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.om.InitializeOMSDK
    public Object invoke(InterfaceC2857Wj interfaceC2857Wj) {
        AnonymousClass1 anonymousClass1;
        AndroidInitializeOMSDK androidInitializeOMSDK;
        long j;
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
        Object objActivateOM = anonymousClass1.result;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            AbstractC3375el.b0(objActivateOM);
            if (this.sessionRepository.isOmEnabled()) {
                long jA = IP.a();
                SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "om_activate_started", null, null, null, null, 30, null);
                OpenMeasurementRepository openMeasurementRepository = this.omRepository;
                Context context = this.context;
                anonymousClass1.L$0 = this;
                anonymousClass1.J$0 = jA;
                anonymousClass1.label = 1;
                objActivateOM = openMeasurementRepository.activateOM(context, anonymousClass1);
                if (objActivateOM == enumC4602sk) {
                    return enumC4602sk;
                }
                androidInitializeOMSDK = this;
                j = jA;
            }
            return C5033xf0.f5238a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j = anonymousClass1.J$0;
        androidInitializeOMSDK = (AndroidInitializeOMSDK) anonymousClass1.L$0;
        AbstractC3375el.b0(objActivateOM);
        OMResult oMResult = (OMResult) objActivateOM;
        if (oMResult instanceof OMResult.Success) {
            SendDiagnosticEvent.DefaultImpls.invoke$default(androidInitializeOMSDK.sendDiagnosticEvent, "om_activate_success_time", new Double(TimeExtensionsKt.elapsedMillis(new Bc0(j))), null, null, null, 28, null);
        } else if (oMResult instanceof OMResult.Failure) {
            SendDiagnosticEvent sendDiagnosticEvent = androidInitializeOMSDK.sendDiagnosticEvent;
            Double d = new Double(TimeExtensionsKt.elapsedMillis(new Bc0(j)));
            C2985aM c2985aMW = AbstractC3375el.w();
            OMResult.Failure failure = (OMResult.Failure) oMResult;
            c2985aMW.put("reason", failure.getReason());
            if (failure.getReasonDebug() != null) {
                c2985aMW.put("reason_debug", failure.getReasonDebug());
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "om_activate_failure_time", d, AbstractC3375el.g(c2985aMW), null, null, 24, null);
        }
        return C5033xf0.f5238a;
    }
}
