package com.unity3d.ads.gatewayclient;

import com.badlogic.gdx.Input;
import com.google.protobuf.InvalidProtocolBufferException;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.model.exception.NetworkTimeoutException;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.HandleGatewayUniversalResponse;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.HttpResponseKt;
import com.unity3d.services.core.network.model.RequestType;
import gatewayprotocol.v1.ErrorKt;
import gatewayprotocol.v1.ErrorOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gatewayprotocol.v1.UniversalResponseKt;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2307Be;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2340Cl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2883Xj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3173cX;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Bc0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2985aM;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4839vT;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IP;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5203zc0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Jc0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.U5;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class CommonGatewayClient implements GatewayClient {
    public static final int CODE_400 = 400;
    public static final int CODE_599 = 599;
    public static final Companion Companion = new Companion(null);
    public static final String HEADER_CONTENT_TYPE = "Content-Type";
    public static final String HEADER_PROTOBUF = "application/x-protobuf";
    public static final String HEADER_RETRY_ATTEMPT = "X-RETRY-ATTEMPT";
    private final HandleGatewayUniversalResponse handleGatewayUniversalResponse;
    private final HttpClient httpClient;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.gatewayclient.CommonGatewayClient$executeRequest$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.gatewayclient.CommonGatewayClient", f = "CommonGatewayClient.kt", l = {116}, m = "executeRequest")
    public static final class AnonymousClass1 extends AbstractC2883Xj {
        int I$0;
        long J$0;
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
            return CommonGatewayClient.this.executeRequest(null, 0, null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.gatewayclient.CommonGatewayClient$executeWithRetry$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC2314Bl(c = "com.unity3d.ads.gatewayclient.CommonGatewayClient", f = "CommonGatewayClient.kt", l = {Input.Keys.SLASH, Input.Keys.MENU, Input.Keys.BUTTON_X}, m = "executeWithRetry")
    public static final class C22581 extends AbstractC2883Xj {
        int I$0;
        long J$0;
        long J$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C22581(InterfaceC2857Wj interfaceC2857Wj) {
            super(interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommonGatewayClient.this.executeWithRetry(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.gatewayclient.CommonGatewayClient$request$2, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.gatewayclient.CommonGatewayClient$request$2", f = "CommonGatewayClient.kt", l = {Input.Keys.TAB}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ OperationType $operationType;
        final /* synthetic */ UniversalRequestOuterClass.UniversalRequest $request;
        final /* synthetic */ RequestPolicy $requestPolicy;
        final /* synthetic */ String $url;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, UniversalRequestOuterClass.UniversalRequest universalRequest, RequestPolicy requestPolicy, OperationType operationType, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$url = str;
            this.$request = universalRequest;
            this.$requestPolicy = requestPolicy;
            this.$operationType = operationType;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return CommonGatewayClient.this.new AnonymousClass2(this.$url, this.$request, this.$requestPolicy, this.$operationType, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((AnonymousClass2) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) throws NetworkTimeoutException {
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i = this.label;
            if (i == 0) {
                AbstractC3375el.b0(obj);
                CommonGatewayClient commonGatewayClient = CommonGatewayClient.this;
                String str = this.$url;
                UniversalRequestOuterClass.UniversalRequest universalRequest = this.$request;
                RequestPolicy requestPolicy = this.$requestPolicy;
                OperationType operationType = this.$operationType;
                this.label = 1;
                obj = commonGatewayClient.executeWithRetry(str, universalRequest, requestPolicy, operationType, this);
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

    public CommonGatewayClient(HttpClient httpClient, HandleGatewayUniversalResponse handleGatewayUniversalResponse, SendDiagnosticEvent sendDiagnosticEvent, SessionRepository sessionRepository) {
        AbstractC2995aW.q(httpClient, "httpClient");
        AbstractC2995aW.q(handleGatewayUniversalResponse, "handleGatewayUniversalResponse");
        AbstractC2995aW.q(sendDiagnosticEvent, "sendDiagnosticEvent");
        AbstractC2995aW.q(sessionRepository, "sessionRepository");
        this.httpClient = httpClient;
        this.handleGatewayUniversalResponse = handleGatewayUniversalResponse;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.sessionRepository = sessionRepository;
    }

    private final HttpRequest buildHttpRequest(String str, Map<String, ? extends List<String>> map, RequestPolicy requestPolicy, UniversalRequestOuterClass.UniversalRequest universalRequest) {
        return new HttpRequest(str, null, RequestType.POST, universalRequest.toByteArray(), map, null, null, null, null, requestPolicy.getConnectTimeout(), requestPolicy.getReadTimeout(), requestPolicy.getWriteTimeout(), requestPolicy.getOverallTimeout(), true, null, null, 0, 115170, null);
    }

    private final long calculateDelayTime(long j, RequestPolicy requestPolicy, int i) {
        return Math.min(calculateExponentialBackoff(j, requestPolicy, i) + calculateJitter(requestPolicy.getRetryWaitBase(), requestPolicy.getRetryJitterPct()), requestPolicy.getRetryMaxInterval());
    }

    private final long calculateExponentialBackoff(long j, RequestPolicy requestPolicy, int i) {
        if (i == 0) {
            return j;
        }
        return (long) (requestPolicy.getRetryScalingFactor() * j);
    }

    private final long calculateJitter(int i, float f) {
        if (f == 0.0f) {
            return 0L;
        }
        long j = (long) (i * f);
        AbstractC3173cX.f4226a.getClass();
        return AbstractC3173cX.b.d(-j, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object executeRequest(HttpRequest httpRequest, int i, OperationType operationType, InterfaceC2857Wj interfaceC2857Wj) throws NetworkTimeoutException {
        AnonymousClass1 anonymousClass1;
        long jA;
        int i2;
        OperationType operationType2;
        CommonGatewayClient commonGatewayClient;
        int i3;
        if (interfaceC2857Wj instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) interfaceC2857Wj;
            int i4 = anonymousClass1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i4 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(interfaceC2857Wj);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(interfaceC2857Wj);
        }
        Object objExecute = anonymousClass1.result;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i5 = anonymousClass1.label;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j = anonymousClass1.J$0;
            i3 = anonymousClass1.I$0;
            OperationType operationType3 = (OperationType) anonymousClass1.L$1;
            commonGatewayClient = (CommonGatewayClient) anonymousClass1.L$0;
            try {
                AbstractC3375el.b0(objExecute);
                operationType2 = operationType3;
                jA = j;
                try {
                    HttpResponse httpResponse = (HttpResponse) objExecute;
                    commonGatewayClient.sendNetworkSuccessDiagnosticEvent(httpResponse, i3, operationType2, new Bc0(jA));
                    return httpResponse;
                } catch (UnityAdsNetworkException e) {
                    e = e;
                    i2 = i3;
                    commonGatewayClient.sendNetworkErrorDiagnosticEvent(e, i2, operationType2, new Bc0(jA));
                    return HttpResponseKt.toHttpResponse(e);
                } catch (Jc0 unused) {
                    i2 = i3;
                    NetworkTimeoutException networkTimeoutException = new NetworkTimeoutException("Gateway request was canceled due to exceeding timeout for operation", null, null, null, null, null, null, EnumC4719u30.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, null);
                    commonGatewayClient.sendNetworkErrorDiagnosticEvent(networkTimeoutException, i2, operationType2, new Bc0(jA));
                    throw networkTimeoutException;
                }
            } catch (UnityAdsNetworkException e2) {
                e = e2;
                i2 = i3;
                operationType2 = operationType3;
                jA = j;
                commonGatewayClient.sendNetworkErrorDiagnosticEvent(e, i2, operationType2, new Bc0(jA));
                return HttpResponseKt.toHttpResponse(e);
            } catch (Jc0 unused2) {
                i2 = i3;
                operationType2 = operationType3;
                jA = j;
                NetworkTimeoutException networkTimeoutException2 = new NetworkTimeoutException("Gateway request was canceled due to exceeding timeout for operation", null, null, null, null, null, null, EnumC4719u30.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, null);
                commonGatewayClient.sendNetworkErrorDiagnosticEvent(networkTimeoutException2, i2, operationType2, new Bc0(jA));
                throw networkTimeoutException2;
            }
        }
        AbstractC3375el.b0(objExecute);
        jA = IP.a();
        try {
            HttpClient httpClient = this.httpClient;
            anonymousClass1.L$0 = this;
            operationType2 = operationType;
            try {
                anonymousClass1.L$1 = operationType2;
                i2 = i;
                try {
                    anonymousClass1.I$0 = i2;
                    anonymousClass1.J$0 = jA;
                    anonymousClass1.label = 1;
                    objExecute = httpClient.execute(httpRequest, anonymousClass1);
                    if (objExecute == enumC4602sk) {
                        return enumC4602sk;
                    }
                    commonGatewayClient = this;
                    i3 = i2;
                    HttpResponse httpResponse2 = (HttpResponse) objExecute;
                    commonGatewayClient.sendNetworkSuccessDiagnosticEvent(httpResponse2, i3, operationType2, new Bc0(jA));
                    return httpResponse2;
                } catch (UnityAdsNetworkException e3) {
                    e = e3;
                    commonGatewayClient = this;
                    commonGatewayClient.sendNetworkErrorDiagnosticEvent(e, i2, operationType2, new Bc0(jA));
                    return HttpResponseKt.toHttpResponse(e);
                } catch (Jc0 unused3) {
                    commonGatewayClient = this;
                    NetworkTimeoutException networkTimeoutException3 = new NetworkTimeoutException("Gateway request was canceled due to exceeding timeout for operation", null, null, null, null, null, null, EnumC4719u30.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, null);
                    commonGatewayClient.sendNetworkErrorDiagnosticEvent(networkTimeoutException3, i2, operationType2, new Bc0(jA));
                    throw networkTimeoutException3;
                }
            } catch (UnityAdsNetworkException e4) {
                e = e4;
                i2 = i;
            } catch (Jc0 unused4) {
                i2 = i;
            }
        } catch (UnityAdsNetworkException e5) {
            e = e5;
            i2 = i;
            operationType2 = operationType;
        } catch (Jc0 unused5) {
            i2 = i;
            operationType2 = operationType;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x00df A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:29:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:31:0x0110 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x0111  */
    /* JADX WARN: Code duplicated, block: B:34:0x0113  */
    /* JADX WARN: Code duplicated, block: B:39:0x0156 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x0157  */
    /* JADX WARN: Code duplicated, block: B:47:0x013b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0157 -> B:41:0x015c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object executeWithRetry(java.lang.String r33, gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest r34, com.unity3d.ads.gatewayclient.RequestPolicy r35, com.unity3d.ads.core.data.model.OperationType r36, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj r37) throws com.unity3d.ads.core.data.model.exception.NetworkTimeoutException {
        /*
            Method dump skipped, instruction units count: 487
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.gatewayclient.CommonGatewayClient.executeWithRetry(java.lang.String, gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest, com.unity3d.ads.gatewayclient.RequestPolicy, com.unity3d.ads.core.data.model.OperationType, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Wj):java.lang.Object");
    }

    private final String getGatewayUrl(String str) {
        return !AbstractC2995aW.i(str, UnityAdsConstants.DefaultUrls.GATEWAY_URL) ? str : this.sessionRepository.getGatewayUrl();
    }

    private final Map<String, List<String>> getHeaders(int i) {
        C2985aM c2985aMW = AbstractC3375el.w();
        c2985aMW.put("Content-Type", AbstractC2340Cl.J(HEADER_PROTOBUF));
        if (i > 0) {
            c2985aMW.put(HEADER_RETRY_ATTEMPT, AbstractC2340Cl.J(String.valueOf(i)));
        }
        return AbstractC3375el.g(c2985aMW);
    }

    private final UniversalResponseOuterClass.UniversalResponse getUniversalResponse(HttpResponse httpResponse, OperationType operationType) {
        try {
            Object body = httpResponse.getBody();
            if (body instanceof byte[]) {
                UniversalResponseOuterClass.UniversalResponse from = UniversalResponseOuterClass.UniversalResponse.parseFrom((byte[]) body);
                AbstractC2995aW.p(from, "parseFrom(responseBody)");
                return from;
            }
            if (!(body instanceof String)) {
                throw new InvalidProtocolBufferException("Could not parse response from gateway service");
            }
            byte[] bytes = ((String) body).getBytes(AbstractC2307Be.f2881a);
            AbstractC2995aW.p(bytes, "this as java.lang.String).getBytes(charset)");
            UniversalResponseOuterClass.UniversalResponse from2 = UniversalResponseOuterClass.UniversalResponse.parseFrom(bytes);
            AbstractC2995aW.p(from2, "parseFrom(\n             ….UTF_8)\n                )");
            return from2;
        } catch (InvalidProtocolBufferException e) {
            DeviceLog.debug("Failed to parse response from gateway service with exception: %s", e.getLocalizedMessage());
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_network_parse_failure", null, U5.u0(new C4839vT("operation", operationType.toString()), new C4839vT("reason", "protobuf_parsing"), new C4839vT("reason_debug", httpResponse.getBody().toString())), null, null, 26, null);
            UniversalResponseKt.Dsl.Companion companion = UniversalResponseKt.Dsl.Companion;
            UniversalResponseOuterClass.UniversalResponse.Builder builderNewBuilder = UniversalResponseOuterClass.UniversalResponse.newBuilder();
            AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
            UniversalResponseKt.Dsl dsl_create = companion._create(builderNewBuilder);
            ErrorKt.Dsl.Companion companion2 = ErrorKt.Dsl.Companion;
            ErrorOuterClass.Error.Builder builderNewBuilder2 = ErrorOuterClass.Error.newBuilder();
            AbstractC2995aW.p(builderNewBuilder2, "newBuilder()");
            ErrorKt.Dsl dsl_create2 = companion2._create(builderNewBuilder2);
            dsl_create2.setErrorText("ERROR: Could not parse response from gateway service");
            dsl_create.setError(dsl_create2._build());
            return dsl_create._build();
        }
    }

    private final void sendNetworkErrorDiagnosticEvent(UnityAdsNetworkException unityAdsNetworkException, int i, OperationType operationType, InterfaceC5203zc0 interfaceC5203zc0) {
        if (operationType == OperationType.UNIVERSAL_EVENT) {
            return;
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_network_failure_time", Double.valueOf(TimeExtensionsKt.elapsedMillis(interfaceC5203zc0)), U5.v0(new C4839vT("operation", operationType.toString()), new C4839vT("retries", String.valueOf(i)), new C4839vT("protocol", String.valueOf(unityAdsNetworkException.getProtocol())), new C4839vT("network_client", String.valueOf(unityAdsNetworkException.getClient())), new C4839vT("reason_code", String.valueOf(unityAdsNetworkException.getCode())), new C4839vT("reason_debug", unityAdsNetworkException.getMessage())), null, null, 24, null);
    }

    private final void sendNetworkSuccessDiagnosticEvent(HttpResponse httpResponse, int i, OperationType operationType, InterfaceC5203zc0 interfaceC5203zc0) {
        if (operationType == OperationType.UNIVERSAL_EVENT) {
            return;
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_network_success_time", Double.valueOf(TimeExtensionsKt.elapsedMillis(interfaceC5203zc0)), U5.v0(new C4839vT("operation", operationType.toString()), new C4839vT("retries", String.valueOf(i)), new C4839vT("protocol", httpResponse.getProtocol()), new C4839vT("network_client", httpResponse.getClient()), new C4839vT("reason_code", String.valueOf(httpResponse.getStatusCode()))), null, null, 24, null);
    }

    private final boolean shouldRetry(int i, long j, int i2) {
        return 400 <= i && i < 600 && j < ((long) i2);
    }

    @Override // com.unity3d.ads.gatewayclient.GatewayClient
    public Object request(String str, UniversalRequestOuterClass.UniversalRequest universalRequest, RequestPolicy requestPolicy, OperationType operationType, InterfaceC2857Wj interfaceC2857Wj) {
        return AbstractC2995aW.E0(requestPolicy.getMaxDuration(), new AnonymousClass2(str, universalRequest, requestPolicy, operationType, null), interfaceC2857Wj);
    }
}
