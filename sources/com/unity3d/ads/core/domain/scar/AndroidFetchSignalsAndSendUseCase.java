package com.unity3d.ads.core.domain.scar;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.manager.ScarManager;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Bc0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2390Ej;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.HZ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IP;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidFetchSignalsAndSendUseCase implements FetchSignalsAndSendUseCase {
    private final HandleGetTokenRequest handleGetTokenRequest;
    private final ScarManager scarManager;
    private final InterfaceC4514rk scope;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.scar.AndroidFetchSignalsAndSendUseCase$invoke$2, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.scar.AndroidFetchSignalsAndSendUseCase$invoke$2", f = "AndroidFetchSignalsAndSendUseCase.kt", l = {31, 49}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ ByteString $tokenId;
        long J$0;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ByteString byteString, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$tokenId = byteString;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            AnonymousClass2 anonymousClass2 = AndroidFetchSignalsAndSendUseCase.this.new AnonymousClass2(this.$tokenId, interfaceC2857Wj);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((AnonymousClass2) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        /* JADX WARN: Code duplicated, block: B:41:0x00d2  */
        /* JADX WARN: Code duplicated, block: B:43:0x00d6  */
        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            long j;
            Object signals;
            Object objV;
            Object objInvoke;
            long j2;
            String str;
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i = this.label;
            C5033xf0 c5033xf0 = C5033xf0.f5238a;
            if (i != 0) {
                if (i == 1) {
                    j = this.J$0;
                    try {
                        AbstractC3375el.b0(obj);
                        signals = obj;
                    } catch (Throwable th) {
                        th = th;
                        objV = AbstractC3375el.v(th);
                    }
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j2 = this.J$0;
                    AbstractC3375el.b0(obj);
                    objInvoke = obj;
                }
                if (((UniversalResponseOuterClass.UniversalResponse) objInvoke).hasError()) {
                    str = "native_scar_signals_upload_failure_time";
                } else {
                    str = "native_scar_signals_upload_success_time";
                }
                SendDiagnosticEvent.DefaultImpls.invoke$default(AndroidFetchSignalsAndSendUseCase.this.sendDiagnosticEvent, str, new Double(TimeExtensionsKt.elapsedMillis(new Bc0(j2))), AndroidFetchSignalsAndSendUseCase.this.getTags(), null, null, 24, null);
                return c5033xf0;
            }
            AbstractC3375el.b0(obj);
            long jA = IP.a();
            SendDiagnosticEvent.DefaultImpls.invoke$default(AndroidFetchSignalsAndSendUseCase.this.sendDiagnosticEvent, "native_scar_signals_collection_started", null, null, null, null, 30, null);
            AndroidFetchSignalsAndSendUseCase androidFetchSignalsAndSendUseCase = AndroidFetchSignalsAndSendUseCase.this;
            try {
                ScarManager scarManager = androidFetchSignalsAndSendUseCase.scarManager;
                List<InitializationResponseOuterClass.AdFormat> scarEligibleFormats = androidFetchSignalsAndSendUseCase.sessionRepository.getScarEligibleFormats();
                this.J$0 = jA;
                this.label = 1;
                signals = scarManager.getSignals(scarEligibleFormats, this);
                if (signals == enumC4602sk) {
                    return enumC4602sk;
                }
                j = jA;
            } catch (Throwable th2) {
                th = th2;
                j = jA;
                objV = AbstractC3375el.v(th);
            }
            objV = (BiddingSignals) signals;
            if (objV instanceof HZ) {
                objV = null;
            }
            BiddingSignals biddingSignals = (BiddingSignals) objV;
            SendDiagnosticEvent.DefaultImpls.invoke$default(AndroidFetchSignalsAndSendUseCase.this.sendDiagnosticEvent, biddingSignals != null ? "native_scar_signals_collection_success_time" : "native_scar_signals_collection_failure_time", new Double(TimeExtensionsKt.elapsedMillis(new Bc0(j))), AndroidFetchSignalsAndSendUseCase.this.getTags(), null, null, 24, null);
            if (biddingSignals == null) {
                return c5033xf0;
            }
            long jA2 = IP.a();
            SendDiagnosticEvent.DefaultImpls.invoke$default(AndroidFetchSignalsAndSendUseCase.this.sendDiagnosticEvent, "native_scar_signals_upload_started", null, null, null, null, 30, null);
            HandleGetTokenRequest handleGetTokenRequest = AndroidFetchSignalsAndSendUseCase.this.handleGetTokenRequest;
            ByteString byteString = this.$tokenId;
            this.J$0 = jA2;
            this.label = 2;
            objInvoke = handleGetTokenRequest.invoke(byteString, biddingSignals, this);
            if (objInvoke == enumC4602sk) {
                return enumC4602sk;
            }
            j2 = jA2;
            if (((UniversalResponseOuterClass.UniversalResponse) objInvoke).hasError()) {
                str = "native_scar_signals_upload_failure_time";
            } else {
                str = "native_scar_signals_upload_success_time";
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(AndroidFetchSignalsAndSendUseCase.this.sendDiagnosticEvent, str, new Double(TimeExtensionsKt.elapsedMillis(new Bc0(j2))), AndroidFetchSignalsAndSendUseCase.this.getTags(), null, null, 24, null);
            return c5033xf0;
        }
    }

    public AndroidFetchSignalsAndSendUseCase(InterfaceC4514rk interfaceC4514rk, SessionRepository sessionRepository, ScarManager scarManager, HandleGetTokenRequest handleGetTokenRequest, SendDiagnosticEvent sendDiagnosticEvent) {
        AbstractC2995aW.q(interfaceC4514rk, "scope");
        AbstractC2995aW.q(sessionRepository, "sessionRepository");
        AbstractC2995aW.q(scarManager, "scarManager");
        AbstractC2995aW.q(handleGetTokenRequest, "handleGetTokenRequest");
        AbstractC2995aW.q(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.scope = interfaceC4514rk;
        this.sessionRepository = sessionRepository;
        this.scarManager = scarManager;
        this.handleGetTokenRequest = handleGetTokenRequest;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, String> getTags() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<InitializationResponseOuterClass.AdFormat> scarEligibleFormats = this.sessionRepository.getScarEligibleFormats();
        if (scarEligibleFormats.contains(InitializationResponseOuterClass.AdFormat.AD_FORMAT_BANNER)) {
            linkedHashMap.put("banner", "true");
        }
        if (scarEligibleFormats.contains(InitializationResponseOuterClass.AdFormat.AD_FORMAT_REWARDED)) {
            linkedHashMap.put(C2390Ej.PLACEMENT_TYPE_REWARDED, "true");
        }
        if (scarEligibleFormats.contains(InitializationResponseOuterClass.AdFormat.AD_FORMAT_INTERSTITIAL)) {
            linkedHashMap.put(C2390Ej.PLACEMENT_TYPE_INTERSTITIAL, "true");
        }
        return linkedHashMap;
    }

    @Override // com.unity3d.ads.core.domain.scar.FetchSignalsAndSendUseCase
    public Object invoke(ByteString byteString, InterfaceC2857Wj interfaceC2857Wj) {
        WD.D(this.scope, null, 0, new AnonymousClass2(byteString, null), 3);
        return C5033xf0.f5238a;
    }
}
