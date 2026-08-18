package com.unity3d.ads.core.domain;

import android.annotation.SuppressLint;
import android.content.Context;
import android.webkit.WebView;
import com.umeng.analytics.pro.f;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2883Xj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3899kk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidGetWebViewContainerUseCase implements GetWebViewContainerUseCase {
    private final AndroidWebViewClient androidWebViewClient;
    private final Context context;
    private final AbstractC3899kk defaultDispatcher;
    private final AbstractC3899kk mainDispatcher;
    private final SendWebViewClientErrorDiagnostics sendWebViewClientErrorDiagnostics;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase$invoke$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase", f = "AndroidGetWebViewContainerUseCase.kt", l = {24}, m = "invoke")
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
            return AndroidGetWebViewContainerUseCase.this.invoke(null, this);
        }
    }

    public AndroidGetWebViewContainerUseCase(Context context, AndroidWebViewClient androidWebViewClient, SendWebViewClientErrorDiagnostics sendWebViewClientErrorDiagnostics, AbstractC3899kk abstractC3899kk, AbstractC3899kk abstractC3899kk2) {
        AbstractC2995aW.q(context, f.X);
        AbstractC2995aW.q(androidWebViewClient, "androidWebViewClient");
        AbstractC2995aW.q(sendWebViewClientErrorDiagnostics, "sendWebViewClientErrorDiagnostics");
        AbstractC2995aW.q(abstractC3899kk, "mainDispatcher");
        AbstractC2995aW.q(abstractC3899kk2, "defaultDispatcher");
        this.context = context;
        this.androidWebViewClient = androidWebViewClient;
        this.sendWebViewClientErrorDiagnostics = sendWebViewClientErrorDiagnostics;
        this.mainDispatcher = abstractC3899kk;
        this.defaultDispatcher = abstractC3899kk2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.GetWebViewContainerUseCase
    @SuppressLint({"SetJavaScriptEnabled"})
    public Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
        AnonymousClass1 anonymousClass1;
        AndroidGetWebViewContainerUseCase androidGetWebViewContainerUseCase;
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
        Object objX = anonymousClass1.result;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            AbstractC3375el.b0(objX);
            AbstractC3899kk abstractC3899kk = this.mainDispatcher;
            AndroidGetWebViewContainerUseCase$invoke$webview$1 androidGetWebViewContainerUseCase$invoke$webview$1 = new AndroidGetWebViewContainerUseCase$invoke$webview$1(this, null);
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = interfaceC4514rk;
            anonymousClass1.label = 1;
            objX = WD.X(androidGetWebViewContainerUseCase$invoke$webview$1, abstractC3899kk, anonymousClass1);
            if (objX == enumC4602sk) {
                return enumC4602sk;
            }
            androidGetWebViewContainerUseCase = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC4514rk = (InterfaceC4514rk) anonymousClass1.L$1;
            androidGetWebViewContainerUseCase = (AndroidGetWebViewContainerUseCase) anonymousClass1.L$0;
            AbstractC3375el.b0(objX);
        }
        return new AndroidWebViewContainer((WebView) objX, androidGetWebViewContainerUseCase.androidWebViewClient, androidGetWebViewContainerUseCase.sendWebViewClientErrorDiagnostics, androidGetWebViewContainerUseCase.mainDispatcher, androidGetWebViewContainerUseCase.defaultDispatcher, interfaceC4514rk);
    }
}
