package com.unity3d.services.core.network.core;

import androidx.annotation.VisibleForTesting;
import com.badlogic.gdx.Input;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.log.DeviceLog;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5000xE;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.J0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import org.chromium.net.CronetException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: loaded from: classes4.dex */
public abstract class UnityAdsUrlRequestCallback extends UrlRequest.Callback {
    private static final int BYTE_BUFFER_CAPACITY_BYTES = 16384;
    public static final Companion Companion = new Companion(null);
    private final ByteArrayOutputStream bytesReceived;
    private final ISDKDispatchers dispatchers;
    private final long readTimeout;
    private final WritableByteChannel receiveChannel;
    private InterfaceC5000xE task;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.unity3d.services.core.network.core.UnityAdsUrlRequestCallback$startTimer$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.services.core.network.core.UnityAdsUrlRequestCallback$startTimer$1", f = "UnityAdsUrlRequestCallback.kt", l = {Input.Keys.APOSTROPHE}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ UrlRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UrlRequest urlRequest, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$request = urlRequest;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return UnityAdsUrlRequestCallback.this.new AnonymousClass1(this.$request, interfaceC2857Wj);
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
                long readTimeout = UnityAdsUrlRequestCallback.this.getReadTimeout();
                this.label = 1;
                if (AbstractC2995aW.v(readTimeout, this) == enumC4602sk) {
                    return enumC4602sk;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
            }
            this.$request.cancel();
            return C5033xf0.f5238a;
        }
    }

    public UnityAdsUrlRequestCallback(ISDKDispatchers iSDKDispatchers, long j) {
        AbstractC2995aW.q(iSDKDispatchers, "dispatchers");
        this.dispatchers = iSDKDispatchers;
        this.readTimeout = j;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.bytesReceived = byteArrayOutputStream;
        this.receiveChannel = Channels.newChannel(byteArrayOutputStream);
    }

    private final void cancelTimer() {
        InterfaceC5000xE interfaceC5000xE = this.task;
        if (interfaceC5000xE != null) {
            interfaceC5000xE.a(null);
        }
        this.task = null;
    }

    @VisibleForTesting
    public static /* synthetic */ void getTask$annotations() {
    }

    public final long getReadTimeout() {
        return this.readTimeout;
    }

    public final InterfaceC5000xE getTask() {
        return this.task;
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        super.onCanceled(urlRequest, urlResponseInfo);
        cancelTimer();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        cancelTimer();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        AbstractC2995aW.q(urlRequest, J0.REQUEST_KEY_EXTRA);
        AbstractC2995aW.q(urlResponseInfo, "info");
        AbstractC2995aW.q(byteBuffer, "byteBuffer");
        cancelTimer();
        byteBuffer.flip();
        try {
            this.receiveChannel.write(byteBuffer);
        } catch (IOException e) {
            DeviceLog.info("IOException during ByteBuffer read. Details: ", e);
        }
        byteBuffer.clear();
        startTimer(urlRequest);
        urlRequest.read(byteBuffer);
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
        AbstractC2995aW.q(urlRequest, J0.REQUEST_KEY_EXTRA);
        urlRequest.followRedirect();
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        AbstractC2995aW.q(urlRequest, J0.REQUEST_KEY_EXTRA);
        AbstractC2995aW.q(urlResponseInfo, "info");
        startTimer(urlRequest);
        urlRequest.read(ByteBuffer.allocateDirect(16384));
    }

    @Override // org.chromium.net.UrlRequest.Callback
    public final void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        AbstractC2995aW.q(urlRequest, J0.REQUEST_KEY_EXTRA);
        AbstractC2995aW.q(urlResponseInfo, "info");
        cancelTimer();
        byte[] byteArray = this.bytesReceived.toByteArray();
        AbstractC2995aW.p(byteArray, "bodyBytes");
        onSucceeded(urlRequest, urlResponseInfo, byteArray);
    }

    public abstract void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, byte[] bArr);

    public final void setTask(InterfaceC5000xE interfaceC5000xE) {
        this.task = interfaceC5000xE;
    }

    public final void startTimer(UrlRequest urlRequest) {
        AbstractC2995aW.q(urlRequest, J0.REQUEST_KEY_EXTRA);
        cancelTimer();
        this.task = WD.D(WD.a(this.dispatchers.getIo()), null, 0, new AnonymousClass1(urlRequest, null), 3);
    }
}
