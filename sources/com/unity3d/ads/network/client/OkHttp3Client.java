package com.unity3d.ads.network.client;

import androidx.core.app.NotificationCompat;
import com.unity3d.ads.network.HttpClient;
import com.unity3d.ads.network.mapper.HttpRequestToOkHttpRequestKt;
import com.unity3d.ads.network.model.HttpRequest;
import com.unity3d.ads.network.model.HttpResponse;
import com.unity3d.services.core.domain.ISDKDispatchers;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2798Uc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4750uS;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4838vS;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5021xZ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.CZ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.HY;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2409Fc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2539Kc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;
import java.io.IOException;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class OkHttp3Client implements HttpClient {
    private final C4838vS client;
    private final ISDKDispatchers dispatchers;

    /* JADX INFO: renamed from: com.unity3d.ads.network.client.OkHttp3Client$execute$2, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.network.client.OkHttp3Client$execute$2", f = "OkHttp3Client.kt", l = {35}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ HttpRequest $request;
        int label;
        final /* synthetic */ OkHttp3Client this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HttpRequest httpRequest, OkHttp3Client okHttp3Client, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$request = httpRequest;
            this.this$0 = okHttp3Client;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return new AnonymousClass2(this.$request, this.this$0, interfaceC2857Wj);
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
                HY okHttpRequest = HttpRequestToOkHttpRequestKt.toOkHttpRequest(this.$request);
                OkHttp3Client okHttp3Client = this.this$0;
                long connectTimeout = this.$request.getConnectTimeout();
                long readTimeout = this.$request.getReadTimeout();
                this.label = 1;
                obj = okHttp3Client.makeRequest(okHttpRequest, connectTimeout, readTimeout, this);
                if (obj == enumC4602sk) {
                    return enumC4602sk;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
            }
            C5021xZ c5021xZ = (C5021xZ) obj;
            int i2 = c5021xZ.d;
            TreeMap treeMapD = c5021xZ.f.d();
            String str = c5021xZ.f5227a.f3175a.i;
            CZ cz = c5021xZ.g;
            String strString = cz != null ? cz.string() : null;
            if (strString == null) {
                strString = "";
            }
            AbstractC2995aW.p(str, "toString()");
            return new HttpResponse(strString, i2, treeMapD, str);
        }
    }

    public OkHttp3Client(ISDKDispatchers iSDKDispatchers, C4838vS c4838vS) {
        AbstractC2995aW.q(iSDKDispatchers, "dispatchers");
        AbstractC2995aW.q(c4838vS, "client");
        this.dispatchers = iSDKDispatchers;
        this.client = c4838vS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object makeRequest(HY hy, long j, long j2, InterfaceC2857Wj interfaceC2857Wj) {
        final C2798Uc c2798Uc = new C2798Uc(1, WD.w(interfaceC2857Wj));
        c2798Uc.t();
        C4750uS c4750uSA = this.client.a();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c4750uSA.a(j, timeUnit);
        c4750uSA.b(j2, timeUnit);
        new C4838vS(c4750uSA).b(hy).d(new InterfaceC2539Kc() { // from class: com.unity3d.ads.network.client.OkHttp3Client$makeRequest$2$1
            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2539Kc
            public void onFailure(InterfaceC2409Fc interfaceC2409Fc, IOException iOException) {
                AbstractC2995aW.q(interfaceC2409Fc, NotificationCompat.CATEGORY_CALL);
                AbstractC2995aW.q(iOException, "e");
                c2798Uc.resumeWith(AbstractC3375el.v(iOException));
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2539Kc
            public void onResponse(InterfaceC2409Fc interfaceC2409Fc, C5021xZ c5021xZ) {
                AbstractC2995aW.q(interfaceC2409Fc, NotificationCompat.CATEGORY_CALL);
                AbstractC2995aW.q(c5021xZ, "response");
                c2798Uc.resumeWith(c5021xZ);
            }
        });
        return c2798Uc.s();
    }

    @Override // com.unity3d.ads.network.HttpClient
    public Object execute(HttpRequest httpRequest, InterfaceC2857Wj interfaceC2857Wj) {
        return WD.X(new AnonymousClass2(httpRequest, this, null), this.dispatchers.getIo(), interfaceC2857Wj);
    }
}
