package com.unity3d.ads.core.domain.om;

import android.webkit.WebView;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.OMResult;
import com.unity3d.ads.core.data.model.OmidOptions;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2883Xj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2985aM;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidOmStartSession extends AndroidOmInteraction {
    private final OpenMeasurementRepository openMeasurementRepository;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.om.AndroidOmStartSession$invoke$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.om.AndroidOmStartSession", f = "AndroidOmStartSession.kt", l = {18}, m = "invoke")
    public static final class AnonymousClass1 extends AbstractC2883Xj {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(InterfaceC2857Wj interfaceC2857Wj) {
            super(interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidOmStartSession.this.invoke(null, null, this);
        }
    }

    public AndroidOmStartSession(OpenMeasurementRepository openMeasurementRepository, SendDiagnosticEvent sendDiagnosticEvent) {
        AbstractC2995aW.q(openMeasurementRepository, "openMeasurementRepository");
        AbstractC2995aW.q(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.openMeasurementRepository = openMeasurementRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.om.OmInteraction
    public Object invoke(AdObject adObject, JSONObject jSONObject, InterfaceC2857Wj interfaceC2857Wj) {
        AnonymousClass1 anonymousClass1;
        AndroidOmStartSession androidOmStartSession;
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
        Object objStartSession = anonymousClass1.result;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            AbstractC3375el.b0(objStartSession);
            OpenMeasurementRepository openMeasurementRepository = this.openMeasurementRepository;
            ByteString opportunityId = adObject.getOpportunityId();
            WebView webview = getWebview(adObject);
            OmidOptions oMidOptions = getOMidOptions(jSONObject);
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = adObject;
            anonymousClass1.label = 1;
            objStartSession = openMeasurementRepository.startSession(opportunityId, webview, oMidOptions, anonymousClass1);
            if (objStartSession == enumC4602sk) {
                return enumC4602sk;
            }
            androidOmStartSession = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            adObject = (AdObject) anonymousClass1.L$1;
            androidOmStartSession = (AndroidOmStartSession) anonymousClass1.L$0;
            AbstractC3375el.b0(objStartSession);
        }
        AdObject adObject2 = adObject;
        OMResult oMResult = (OMResult) objStartSession;
        if (oMResult instanceof OMResult.Success) {
            SendDiagnosticEvent.DefaultImpls.invoke$default(androidOmStartSession.sendDiagnosticEvent, "om_session_start_success", null, null, null, adObject2, 14, null);
        } else if (oMResult instanceof OMResult.Failure) {
            SendDiagnosticEvent sendDiagnosticEvent = androidOmStartSession.sendDiagnosticEvent;
            C2985aM c2985aMW = AbstractC3375el.w();
            OMResult.Failure failure = (OMResult.Failure) oMResult;
            c2985aMW.put("reason", failure.getReason());
            if (failure.getReasonDebug() != null) {
                c2985aMW.put("reason_debug", failure.getReasonDebug());
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "om_session_start_failure", null, AbstractC3375el.g(c2985aMW), null, adObject2, 10, null);
        }
        return C5033xf0.f5238a;
    }
}
