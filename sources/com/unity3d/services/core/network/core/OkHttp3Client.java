package com.unity3d.services.core.network.core;

import androidx.core.app.NotificationCompat;
import com.unity3d.ads.core.data.model.exception.NetworkTimeoutException;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.network.mapper.HttpRequestToOkHttpRequestKt;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4496rb;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4926wS;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2798Uc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4750uS;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4838vS;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5021xZ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.CZ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DX;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.HY;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IX;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2409Fc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2460Hb;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2539Kc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.J0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Vg0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.SocketTimeoutException;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public final class OkHttp3Client implements HttpClient {
    public static final Companion Companion = new Companion(null);
    public static final String MSG_CONNECTION_FAILED = "Network request failed";
    public static final String MSG_CONNECTION_TIMEOUT = "Network request timeout";
    public static final String NETWORK_CLIENT_OKHTTP = "okhttp";
    private final C4838vS client;
    private final ISDKDispatchers dispatchers;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.unity3d.services.core.network.core.OkHttp3Client$execute$2, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.services.core.network.core.OkHttp3Client$execute$2", f = "OkHttp3Client.kt", l = {52}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ HttpRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HttpRequest httpRequest, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$request = httpRequest;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return OkHttp3Client.this.new AnonymousClass2(this.$request, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((AnonymousClass2) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) throws IllegalAccessException, UnityAdsNetworkException, InvocationTargetException {
            Object objMakeRequest;
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i = this.label;
            try {
                if (i == 0) {
                    AbstractC3375el.b0(obj);
                    OkHttp3Client okHttp3Client = OkHttp3Client.this;
                    HttpRequest httpRequest = this.$request;
                    long connectTimeout = httpRequest.getConnectTimeout();
                    long readTimeout = this.$request.getReadTimeout();
                    long writeTimeout = this.$request.getWriteTimeout();
                    this.label = 1;
                    objMakeRequest = okHttp3Client.makeRequest(httpRequest, connectTimeout, readTimeout, writeTimeout, this);
                    if (objMakeRequest == enumC4602sk) {
                        return enumC4602sk;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC3375el.b0(obj);
                    objMakeRequest = obj;
                }
                C5021xZ c5021xZ = (C5021xZ) objMakeRequest;
                this.$request.getDownloadDestination();
                Object objString = null;
                if (this.$request.isProtobuf()) {
                    CZ cz = c5021xZ.g;
                    if (cz != null) {
                        objString = cz.bytes();
                    }
                } else {
                    CZ cz2 = c5021xZ.g;
                    if (cz2 != null) {
                        objString = cz2.string();
                    }
                }
                int i2 = c5021xZ.d;
                TreeMap treeMapD = c5021xZ.f.d();
                String str = c5021xZ.f5227a.f3175a.i;
                if (objString == null) {
                    objString = "";
                }
                String str2 = c5021xZ.b.f5279a;
                AbstractC2995aW.p(str, "toString()");
                AbstractC2995aW.p(str2, "toString()");
                return new HttpResponse(objString, i2, treeMapD, str, str2, OkHttp3Client.NETWORK_CLIENT_OKHTTP, 0L, 64, null);
            } catch (SocketTimeoutException unused) {
                throw new NetworkTimeoutException(OkHttp3Client.MSG_CONNECTION_TIMEOUT, null, null, this.$request.getBaseURL(), null, null, OkHttp3Client.NETWORK_CLIENT_OKHTTP, 54, null);
            } catch (IOException unused2) {
                throw new UnityAdsNetworkException(OkHttp3Client.MSG_CONNECTION_FAILED, null, null, this.$request.getBaseURL(), null, null, OkHttp3Client.NETWORK_CLIENT_OKHTTP, 54, null);
            }
        }
    }

    /* JADX INFO: renamed from: com.unity3d.services.core.network.core.OkHttp3Client$executeBlocking$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.services.core.network.core.OkHttp3Client$executeBlocking$1", f = "OkHttp3Client.kt", l = {41}, m = "invokeSuspend")
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
            return OkHttp3Client.this.new AnonymousClass1(this.$request, interfaceC2857Wj);
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
                OkHttp3Client okHttp3Client = OkHttp3Client.this;
                HttpRequest httpRequest = this.$request;
                this.label = 1;
                obj = okHttp3Client.execute(httpRequest, this);
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

    public OkHttp3Client(ISDKDispatchers iSDKDispatchers, C4838vS c4838vS) {
        AbstractC2995aW.q(iSDKDispatchers, "dispatchers");
        AbstractC2995aW.q(c4838vS, "client");
        this.dispatchers = iSDKDispatchers;
        this.client = c4838vS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object makeRequest(final HttpRequest httpRequest, long j, long j2, long j3, InterfaceC2857Wj interfaceC2857Wj) {
        final C2798Uc c2798Uc = new C2798Uc(1, WD.w(interfaceC2857Wj));
        c2798Uc.t();
        HY okHttpProtoRequest = httpRequest.isProtobuf() ? HttpRequestToOkHttpRequestKt.toOkHttpProtoRequest(httpRequest) : HttpRequestToOkHttpRequestKt.toOkHttpRequest(httpRequest);
        C4750uS c4750uSA = this.client.a();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c4750uSA.a(j, timeUnit);
        c4750uSA.b(j2, timeUnit);
        c4750uSA.A = Vg0.b(j3, timeUnit);
        new C4838vS(c4750uSA).b(okHttpProtoRequest).d(new InterfaceC2539Kc() { // from class: com.unity3d.services.core.network.core.OkHttp3Client$makeRequest$2$1
            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2539Kc
            public void onFailure(InterfaceC2409Fc interfaceC2409Fc, IOException iOException) {
                AbstractC2995aW.q(interfaceC2409Fc, NotificationCompat.CATEGORY_CALL);
                AbstractC2995aW.q(iOException, "e");
                c2798Uc.resumeWith(AbstractC3375el.v(new UnityAdsNetworkException(OkHttp3Client.MSG_CONNECTION_FAILED, null, null, ((IX) interfaceC2409Fc).b.f3175a.i, null, null, OkHttp3Client.NETWORK_CLIENT_OKHTTP, 54, null)));
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2539Kc
            public void onResponse(InterfaceC2409Fc interfaceC2409Fc, C5021xZ c5021xZ) {
                InterfaceC2460Hb interfaceC2460HbSource;
                AbstractC2995aW.q(interfaceC2409Fc, NotificationCompat.CATEGORY_CALL);
                AbstractC2995aW.q(c5021xZ, "response");
                try {
                    File downloadDestination = httpRequest.getDownloadDestination();
                    if (downloadDestination != null && downloadDestination.exists()) {
                        Logger logger = AbstractC4926wS.f5180a;
                        DX dxE = AbstractC4496rb.e(AbstractC4496rb.w(downloadDestination));
                        try {
                            CZ cz = c5021xZ.g;
                            if (cz != null && (interfaceC2460HbSource = cz.source()) != null) {
                                try {
                                    dxE.B(interfaceC2460HbSource);
                                    AbstractC3375el.n(interfaceC2460HbSource, null);
                                } catch (Throwable th) {
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        AbstractC3375el.n(interfaceC2460HbSource, th);
                                        throw th2;
                                    }
                                }
                            }
                            AbstractC3375el.n(dxE, null);
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                AbstractC3375el.n(dxE, th3);
                                throw th4;
                            }
                        }
                    }
                    c2798Uc.resumeWith(c5021xZ);
                } catch (Exception e) {
                    c2798Uc.resumeWith(AbstractC3375el.v(e));
                }
            }
        });
        return c2798Uc.s();
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    public Object execute(HttpRequest httpRequest, InterfaceC2857Wj interfaceC2857Wj) {
        return WD.X(new AnonymousClass2(httpRequest, null), this.dispatchers.getIo(), interfaceC2857Wj);
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    public HttpResponse executeBlocking(HttpRequest httpRequest) {
        AbstractC2995aW.q(httpRequest, J0.REQUEST_KEY_EXTRA);
        return (HttpResponse) WD.R(this.dispatchers.getIo(), new AnonymousClass1(httpRequest, null));
    }
}
