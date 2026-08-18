package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.extensions.JSONArrayExtensionsKt;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.RequestType;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3899kk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2838Vq;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3770jF;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.U5;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidExecuteAdViewerRequest implements ExecuteAdViewerRequest {
    private final HttpClient httpClient;
    private final AbstractC3899kk ioDispatcher;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RequestType.values().length];
            try {
                iArr[RequestType.GET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RequestType.HEAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RequestType.POST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest$invoke$2, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest$invoke$2", f = "AndroidExecuteAdViewerRequest.kt", l = {24}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ Object[] $parameters;
        final /* synthetic */ RequestType $type;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(RequestType requestType, Object[] objArr, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$type = requestType;
            this.$parameters = objArr;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return AndroidExecuteAdViewerRequest.this.new AnonymousClass2(this.$type, this.$parameters, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((AnonymousClass2) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i = this.label;
            if (i == 0) {
                AbstractC3375el.b0(obj);
                HttpRequest httpRequestCreateRequest = AndroidExecuteAdViewerRequest.this.createRequest(this.$type, this.$parameters);
                HttpClient httpClient = AndroidExecuteAdViewerRequest.this.httpClient;
                this.label = 1;
                obj = httpClient.execute(httpRequestCreateRequest, this);
                if (obj == enumC4602sk) {
                    return enumC4602sk;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
            }
            return obj;
        }
    }

    public AndroidExecuteAdViewerRequest(AbstractC3899kk abstractC3899kk, HttpClient httpClient) {
        AbstractC2995aW.q(abstractC3899kk, "ioDispatcher");
        AbstractC2995aW.q(httpClient, "httpClient");
        this.ioDispatcher = abstractC3899kk;
        this.httpClient = httpClient;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HttpRequest createRequest(RequestType requestType, Object[] objArr) {
        Map<String, List<String>> headersMap;
        Map<String, List<String>> headersMap2;
        String str = (String) U5.p0(1, objArr);
        if (!(!(str == null || str.length() == 0))) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i = WhenMappings.$EnumSwitchMapping$0[requestType.ordinal()];
        C2838Vq c2838Vq = C2838Vq.f3896a;
        if (i == 1 || i == 2) {
            JSONArray jSONArray = (JSONArray) U5.p0(2, objArr);
            Integer num = (Integer) U5.p0(3, objArr);
            Integer num2 = (Integer) U5.p0(4, objArr);
            return new HttpRequest(str, null, requestType, null, (jSONArray == null || (headersMap = JSONArrayExtensionsKt.getHeadersMap(jSONArray)) == null) ? c2838Vq : headersMap, null, null, null, null, num != null ? num.intValue() : 30000, num2 != null ? num2.intValue() : 30000, 0, 0, false, null, null, 0, 129514, null);
        }
        if (i != 3) {
            throw new C3770jF(7, 0);
        }
        String str2 = (String) U5.p0(2, objArr);
        JSONArray jSONArray2 = (JSONArray) U5.p0(3, objArr);
        Integer num3 = (Integer) U5.p0(4, objArr);
        Integer num4 = (Integer) U5.p0(5, objArr);
        return new HttpRequest(str, null, requestType, str2, (jSONArray2 == null || (headersMap2 = JSONArrayExtensionsKt.getHeadersMap(jSONArray2)) == null) ? c2838Vq : headersMap2, null, null, null, null, num3 != null ? num3.intValue() : 30000, num4 != null ? num4.intValue() : 30000, 0, 0, false, null, null, 0, 129506, null);
    }

    @Override // com.unity3d.ads.core.domain.ExecuteAdViewerRequest
    public Object invoke(RequestType requestType, Object[] objArr, InterfaceC2857Wj interfaceC2857Wj) {
        return WD.X(new AnonymousClass2(requestType, objArr, null), this.ioDispatcher, interfaceC2857Wj);
    }
}
