package com.unity3d.services.core.network.core;

import com.unity3d.ads.core.data.model.exception.NetworkTimeoutException;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.RequestType;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2307Be;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3089ba0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2798Uc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2772Tc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.J0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Z90;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetException;
import org.chromium.net.NetworkException;
import org.chromium.net.UploadDataProviders;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: loaded from: classes4.dex */
public final class CronetClient implements HttpClient {
    public static final Companion Companion = new Companion(null);
    private static final String MSG_CONNECTION_FAILED = "Network request failed";
    private static final String MSG_CONNECTION_TIMEOUT = "Network request timed out";
    private static final String NETWORK_CLIENT_CRONET = "cronet";
    private final ISDKDispatchers dispatchers;
    private final CronetEngine engine;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.unity3d.services.core.network.core.CronetClient$executeBlocking$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.services.core.network.core.CronetClient$executeBlocking$1", f = "CronetClient.kt", l = {31}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ HttpRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HttpRequest httpRequest, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$request = httpRequest;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return CronetClient.this.new AnonymousClass1(this.$request, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((AnonymousClass1) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i = this.label;
            if (i == 0) {
                AbstractC3375el.b0(obj);
                CronetClient cronetClient = CronetClient.this;
                HttpRequest httpRequest = this.$request;
                this.label = 1;
                obj = cronetClient.execute(httpRequest, this);
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

    public CronetClient(CronetEngine cronetEngine, ISDKDispatchers iSDKDispatchers) {
        AbstractC2995aW.q(cronetEngine, "engine");
        AbstractC2995aW.q(iSDKDispatchers, "dispatchers");
        this.engine = cronetEngine;
        this.dispatchers = iSDKDispatchers;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String buildUrl(HttpRequest httpRequest) {
        return AbstractC3089ba0.E0("/", AbstractC3089ba0.W0(httpRequest.getBaseURL(), '/') + '/' + AbstractC3089ba0.W0(httpRequest.getPath(), '/'));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getContentSize(UrlResponseInfo urlResponseInfo) {
        String str;
        Long lJ0;
        List<String> list = urlResponseInfo.getAllHeaders().get("Content-Length");
        if (list == null || (str = list.get(0)) == null || (lJ0 = Z90.j0(str)) == null) {
            return -1L;
        }
        return lJ0.longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getPriority(int i) {
        if (i == 0) {
            return 4;
        }
        if (i != 1) {
            return i != 2 ? 1 : 2;
        }
        return 3;
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    public Object execute(HttpRequest httpRequest, InterfaceC2857Wj interfaceC2857Wj) {
        byte[] bytes;
        final C2798Uc c2798Uc = new C2798Uc(1, WD.w(interfaceC2857Wj));
        c2798Uc.t();
        final ISDKDispatchers iSDKDispatchers = this.dispatchers;
        final long readTimeout = httpRequest.getReadTimeout();
        UnityAdsUrlRequestCallback unityAdsUrlRequestCallback = new UnityAdsUrlRequestCallback(iSDKDispatchers, readTimeout) { // from class: com.unity3d.services.core.network.core.CronetClient$execute$2$callback$1
            @Override // com.unity3d.services.core.network.core.UnityAdsUrlRequestCallback, org.chromium.net.UrlRequest.Callback
            public void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
                super.onCanceled(urlRequest, urlResponseInfo);
                c2798Uc.resumeWith(AbstractC3375el.v(new NetworkTimeoutException("Network request timed out", null, null, urlResponseInfo != null ? urlResponseInfo.getUrl() : null, urlResponseInfo != null ? urlResponseInfo.getNegotiatedProtocol() : null, null, "cronet", 38, null)));
            }

            @Override // com.unity3d.services.core.network.core.UnityAdsUrlRequestCallback, org.chromium.net.UrlRequest.Callback
            public void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
                super.onFailed(urlRequest, urlResponseInfo, cronetException);
                NetworkException networkException = cronetException instanceof NetworkException ? (NetworkException) cronetException : null;
                c2798Uc.resumeWith(AbstractC3375el.v(new UnityAdsNetworkException(OkHttp3Client.MSG_CONNECTION_FAILED, null, urlResponseInfo != null ? Integer.valueOf(urlResponseInfo.getHttpStatusCode()) : null, urlResponseInfo != null ? urlResponseInfo.getUrl() : null, urlResponseInfo != null ? urlResponseInfo.getNegotiatedProtocol() : null, networkException != null ? Integer.valueOf(networkException.getCronetInternalErrorCode()) : null, "cronet", 2, null)));
            }

            @Override // com.unity3d.services.core.network.core.UnityAdsUrlRequestCallback
            public void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, byte[] bArr) {
                AbstractC2995aW.q(urlRequest, J0.REQUEST_KEY_EXTRA);
                AbstractC2995aW.q(urlResponseInfo, "info");
                AbstractC2995aW.q(bArr, "bodyBytes");
                InterfaceC2772Tc interfaceC2772Tc = c2798Uc;
                int httpStatusCode = urlResponseInfo.getHttpStatusCode();
                Map<String, List<String>> allHeaders = urlResponseInfo.getAllHeaders();
                String url = urlResponseInfo.getUrl();
                String negotiatedProtocol = urlResponseInfo.getNegotiatedProtocol();
                long contentSize = this.getContentSize(urlResponseInfo);
                AbstractC2995aW.p(allHeaders, "allHeaders");
                AbstractC2995aW.p(url, "url");
                AbstractC2995aW.p(negotiatedProtocol, "negotiatedProtocol");
                interfaceC2772Tc.resumeWith(new HttpResponse(bArr, httpStatusCode, allHeaders, url, negotiatedProtocol, "cronet", contentSize));
            }
        };
        UrlRequest.Builder builderNewUrlRequestBuilder = this.engine.newUrlRequestBuilder(buildUrl(httpRequest), unityAdsUrlRequestCallback, WD.f(this.dispatchers.getIo()));
        for (Map.Entry<String, List<String>> entry : httpRequest.getHeaders().entrySet()) {
            String key = entry.getKey();
            Iterator<T> it = entry.getValue().iterator();
            while (it.hasNext()) {
                builderNewUrlRequestBuilder.addHeader(key, (String) it.next());
            }
        }
        if (httpRequest.getMethod() == RequestType.POST) {
            Object body = httpRequest.getBody();
            if (body instanceof byte[]) {
                bytes = (byte[]) httpRequest.getBody();
            } else if (body instanceof String) {
                bytes = ((String) httpRequest.getBody()).getBytes(AbstractC2307Be.f2881a);
                AbstractC2995aW.p(bytes, "this as java.lang.String).getBytes(charset)");
            } else {
                bytes = new byte[0];
            }
            builderNewUrlRequestBuilder.setUploadDataProvider(UploadDataProviders.create(bytes), WD.f(this.dispatchers.getIo()));
        }
        UrlRequest urlRequestBuild = builderNewUrlRequestBuilder.setHttpMethod(httpRequest.getMethod().toString()).setPriority(getPriority(httpRequest.getPriority())).build();
        c2798Uc.n(new CronetClient$execute$2$2(urlRequestBuild));
        AbstractC2995aW.p(urlRequestBuild, "req");
        unityAdsUrlRequestCallback.startTimer(urlRequestBuild);
        urlRequestBuild.start();
        return c2798Uc.s();
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    public HttpResponse executeBlocking(HttpRequest httpRequest) {
        AbstractC2995aW.q(httpRequest, J0.REQUEST_KEY_EXTRA);
        return (HttpResponse) WD.R(this.dispatchers.getIo(), new AnonymousClass1(httpRequest, null));
    }

    public final void shutdown() {
        this.engine.shutdown();
    }
}
