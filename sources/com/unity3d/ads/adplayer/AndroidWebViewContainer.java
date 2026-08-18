package com.unity3d.ads.adplayer;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.badlogic.gdx.Input;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.unity3d.ads.adplayer.model.ErrorReason;
import com.unity3d.ads.adplayer.model.WebViewBridgeInterface;
import com.unity3d.ads.adplayer.model.WebViewClientError;
import com.unity3d.ads.core.domain.SendWebViewClientErrorDiagnostics;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2340Cl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2883Xj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3899kk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4995x90;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2805Uj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4251ok;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4907w90;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.CX;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3549gk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3732io;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4309pQ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4443qv;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4530rv;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4731u90;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.MR;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ClickableViewAccessibility"})
public final class AndroidWebViewContainer implements WebViewContainer {
    private final InterfaceC4309pQ _lastInputEvent;
    private final InterfaceC4731u90 lastInputEvent;
    private final InterfaceC4514rk scope;
    private final SendWebViewClientErrorDiagnostics sendWebViewClientErrorDiagnostics;
    private final WebView webView;
    private final AndroidWebViewClient webViewClient;

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$2, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$2", f = "AndroidWebViewContainer.kt", l = {37}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends Ea0 implements InterfaceC3567gx {
        int label;

        public AnonymousClass2(InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return AndroidWebViewContainer.this.new AnonymousClass2(interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (InterfaceC2857Wj) obj2);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i = this.label;
            if (i == 0) {
                AbstractC3375el.b0(obj);
                AndroidWebViewContainer androidWebViewContainer = AndroidWebViewContainer.this;
                this.label = 1;
                if (androidWebViewContainer.onRenderProcessGone(this) == enumC4602sk) {
                    return enumC4602sk;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
            }
            return C5033xf0.f5238a;
        }

        public final Object invoke(boolean z, InterfaceC2857Wj interfaceC2857Wj) {
            return ((AnonymousClass2) create(Boolean.valueOf(z), interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer", f = "AndroidWebViewContainer.kt", l = {Input.Keys.MUTE}, m = "addJavascriptInterface")
    public static final class AnonymousClass1 extends AbstractC2883Xj {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(InterfaceC2857Wj interfaceC2857Wj) {
            super(interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidWebViewContainer.this.addJavascriptInterface(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$2, reason: invalid class name and case insensitive filesystem */
    @InterfaceC2314Bl(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$2", f = "AndroidWebViewContainer.kt", l = {}, m = "invokeSuspend")
    public static final class C21572 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ String $name;
        final /* synthetic */ WebViewBridge $webViewBridgeInterface;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21572(String str, WebViewBridge webViewBridge, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$name = str;
            this.$webViewBridgeInterface = webViewBridge;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return AndroidWebViewContainer.this.new C21572(this.$name, this.$webViewBridgeInterface, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((C21572) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
            final WebViewBridge webViewBridge = this.$webViewBridgeInterface;
            AndroidWebViewContainer.this.getWebView().addJavascriptInterface(new WebViewBridgeInterface() { // from class: com.unity3d.ads.adplayer.AndroidWebViewContainer$addJavascriptInterface$2$wrapper$1
                @Override // com.unity3d.ads.adplayer.model.WebViewBridgeInterface
                @JavascriptInterface
                public void handleCallback(String str, String str2, String str3) {
                    AbstractC2995aW.q(str, "callbackId");
                    AbstractC2995aW.q(str2, "callbackStatus");
                    AbstractC2995aW.q(str3, "rawParameters");
                    webViewBridge.handleCallback(str, str2, str3);
                }

                @Override // com.unity3d.ads.adplayer.model.WebViewBridgeInterface
                @JavascriptInterface
                public void handleInvocation(String str) {
                    AbstractC2995aW.q(str, PglCryptUtils.KEY_MESSAGE);
                    webViewBridge.handleInvocation(str);
                }
            }, this.$name);
            return C5033xf0.f5238a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$destroy$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC2314Bl(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer", f = "AndroidWebViewContainer.kt", l = {109}, m = "destroy")
    public static final class C21581 extends AbstractC2883Xj {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C21581(InterfaceC2857Wj interfaceC2857Wj) {
            super(interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidWebViewContainer.this.destroy(this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$destroy$2, reason: invalid class name and case insensitive filesystem */
    @InterfaceC2314Bl(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$destroy$2", f = "AndroidWebViewContainer.kt", l = {}, m = "invokeSuspend")
    public static final class C21592 extends Ea0 implements InterfaceC3567gx {
        int label;

        public C21592(InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return AndroidWebViewContainer.this.new C21592(interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((C21592) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
            ViewParent parent = AndroidWebViewContainer.this.getWebView().getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(AndroidWebViewContainer.this.getWebView());
            }
            AndroidWebViewContainer.this.getWebView().destroy();
            return C5033xf0.f5238a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$evaluateJavascript$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC2314Bl(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer", f = "AndroidWebViewContainer.kt", l = {Input.Keys.PLUS}, m = "evaluateJavascript")
    public static final class C21601 extends AbstractC2883Xj {
        int label;
        /* synthetic */ Object result;

        public C21601(InterfaceC2857Wj interfaceC2857Wj) {
            super(interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidWebViewContainer.this.evaluateJavascript(null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$evaluateJavascript$2, reason: invalid class name and case insensitive filesystem */
    @InterfaceC2314Bl(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$evaluateJavascript$2", f = "AndroidWebViewContainer.kt", l = {}, m = "invokeSuspend")
    public static final class C21612 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ String $script;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21612(String str, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$script = str;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return AndroidWebViewContainer.this.new C21612(this.$script, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((C21612) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
            AndroidWebViewContainer.this.getWebView().evaluateJavascript("javascript:" + this.$script, null);
            return C5033xf0.f5238a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC2314Bl(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer", f = "AndroidWebViewContainer.kt", l = {67, Input.Keys.LEFT_BRACKET, Input.Keys.BACKSLASH}, m = "loadUrl")
    public static final class C21621 extends AbstractC2883Xj {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C21621(InterfaceC2857Wj interfaceC2857Wj) {
            super(interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidWebViewContainer.this.loadUrl(null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$2, reason: invalid class name and case insensitive filesystem */
    @InterfaceC2314Bl(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$loadUrl$2", f = "AndroidWebViewContainer.kt", l = {}, m = "invokeSuspend")
    public static final class C21632 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ String $url;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21632(String str, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$url = str;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return AndroidWebViewContainer.this.new C21632(this.$url, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((C21632) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
            AndroidWebViewContainer.this.getWebView().loadUrl(this.$url);
            return C5033xf0.f5238a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$onRenderProcessGone$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC2314Bl(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer", f = "AndroidWebViewContainer.kt", l = {55}, m = "onRenderProcessGone")
    public static final class C21641 extends AbstractC2883Xj {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C21641(InterfaceC2857Wj interfaceC2857Wj) {
            super(interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidWebViewContainer.this.onRenderProcessGone(this);
        }
    }

    public AndroidWebViewContainer(WebView webView, AndroidWebViewClient androidWebViewClient, SendWebViewClientErrorDiagnostics sendWebViewClientErrorDiagnostics, AbstractC3899kk abstractC3899kk, AbstractC3899kk abstractC3899kk2, InterfaceC4514rk interfaceC4514rk) {
        AbstractC2995aW.q(webView, "webView");
        AbstractC2995aW.q(androidWebViewClient, "webViewClient");
        AbstractC2995aW.q(sendWebViewClientErrorDiagnostics, "sendWebViewClientErrorDiagnostics");
        AbstractC2995aW.q(abstractC3899kk, "mainDispatcher");
        AbstractC2995aW.q(abstractC3899kk2, "defaultDispatcher");
        AbstractC2995aW.q(interfaceC4514rk, "adPlayerScope");
        this.webView = webView;
        this.webViewClient = androidWebViewClient;
        this.sendWebViewClientErrorDiagnostics = sendWebViewClientErrorDiagnostics;
        C2805Uj c2805UjL = WD.L(WD.L(interfaceC4514rk, abstractC3899kk), new C4251ok("AndroidWebViewContainer"));
        this.scope = c2805UjL;
        C4907w90 c4907w90A = AbstractC4995x90.a(null);
        this._lastInputEvent = c4907w90A;
        this.lastInputEvent = new CX(c4907w90A);
        final InterfaceC4731u90 interfaceC4731u90IsRenderProcessGone = androidWebViewClient.isRenderProcessGone();
        AbstractC3375el.K(AbstractC3375el.Q(new AnonymousClass2(null), new InterfaceC4443qv() { // from class: com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC4530rv {
                final /* synthetic */ InterfaceC4530rv $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1$2$1, reason: invalid class name */
                @InterfaceC2314Bl(c = "com.unity3d.ads.adplayer.AndroidWebViewContainer$special$$inlined$filter$1$2", f = "AndroidWebViewContainer.kt", l = {EnumC4719u30.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
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
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC4530rv interfaceC4530rv) {
                    this.$this_unsafeFlow = interfaceC4530rv;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4530rv
                public final Object emit(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
                    AnonymousClass1 anonymousClass1;
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
                    Object obj2 = anonymousClass1.result;
                    EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        AbstractC3375el.b0(obj2);
                        InterfaceC4530rv interfaceC4530rv = this.$this_unsafeFlow;
                        if (((Boolean) obj).booleanValue()) {
                            anonymousClass1.label = 1;
                            if (interfaceC4530rv.emit(obj, anonymousClass1) == enumC4602sk) {
                                return enumC4602sk;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC3375el.b0(obj2);
                    }
                    return C5033xf0.f5238a;
                }
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4443qv
            public Object collect(InterfaceC4530rv interfaceC4530rv, InterfaceC2857Wj interfaceC2857Wj) {
                Object objCollect = interfaceC4731u90IsRenderProcessGone.collect(new AnonymousClass2(interfaceC4530rv), interfaceC2857Wj);
                return objCollect == EnumC4602sk.f4993a ? objCollect : C5033xf0.f5238a;
            }
        }), WD.L(c2805UjL, abstractC3899kk2));
        webView.setOnTouchListener(new View.OnTouchListener() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.E4
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return AndroidWebViewContainer._init_$lambda$1(this.f3004a, view, motionEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$1(AndroidWebViewContainer androidWebViewContainer, View view, MotionEvent motionEvent) throws IllegalAccessException, InvocationTargetException {
        AbstractC2995aW.q(androidWebViewContainer, "this$0");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 1 && actionMasked != 5 && actionMasked != 6) {
            return false;
        }
        ((C4907w90) androidWebViewContainer._lastInputEvent).i(motionEvent);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object onRenderProcessGone(InterfaceC2857Wj interfaceC2857Wj) {
        C21641 c21641;
        AndroidWebViewContainer androidWebViewContainer;
        if (interfaceC2857Wj instanceof C21641) {
            c21641 = (C21641) interfaceC2857Wj;
            int i = c21641.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c21641.label = i - Integer.MIN_VALUE;
            } else {
                c21641 = new C21641(interfaceC2857Wj);
            }
        } else {
            c21641 = new C21641(interfaceC2857Wj);
        }
        Object obj = c21641.result;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = c21641.label;
        if (i2 == 0) {
            AbstractC3375el.b0(obj);
            c21641.L$0 = this;
            c21641.label = 1;
            if (destroy(c21641) == enumC4602sk) {
                return enumC4602sk;
            }
            androidWebViewContainer = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidWebViewContainer = (AndroidWebViewContainer) c21641.L$0;
            AbstractC3375el.b0(obj);
        }
        androidWebViewContainer.sendWebViewClientErrorDiagnostics.invoke(AbstractC2340Cl.J(new WebViewClientError("Render process gone", ErrorReason.REASON_WEBVIEW_RENDER_PROCESS_GONE, null, 4, null)));
        return C5033xf0.f5238a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.adplayer.WebViewContainer
    public Object addJavascriptInterface(WebViewBridge webViewBridge, String str, InterfaceC2857Wj interfaceC2857Wj) {
        AnonymousClass1 anonymousClass1;
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
        Object obj = anonymousClass1.result;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = anonymousClass1.label;
        try {
            if (i2 == 0) {
                AbstractC3375el.b0(obj);
                InterfaceC3549gk coroutineContext = this.scope.getCoroutineContext();
                C21572 c21572 = new C21572(str, webViewBridge, null);
                anonymousClass1.label = 1;
                if (WD.X(c21572, coroutineContext, anonymousClass1) == enumC4602sk) {
                    return enumC4602sk;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
            }
        } catch (CancellationException unused) {
        }
        return C5033xf0.f5238a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.adplayer.WebViewContainer
    public Object destroy(InterfaceC2857Wj interfaceC2857Wj) {
        C21581 c21581;
        AndroidWebViewContainer androidWebViewContainer;
        if (interfaceC2857Wj instanceof C21581) {
            c21581 = (C21581) interfaceC2857Wj;
            int i = c21581.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c21581.label = i - Integer.MIN_VALUE;
            } else {
                c21581 = new C21581(interfaceC2857Wj);
            }
        } else {
            c21581 = new C21581(interfaceC2857Wj);
        }
        Object obj = c21581.result;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = c21581.label;
        if (i2 == 0) {
            AbstractC3375el.b0(obj);
            InterfaceC3549gk interfaceC3549gkPlus = this.scope.getCoroutineContext().plus(MR.f3404a);
            C21592 c21592 = new C21592(null);
            c21581.L$0 = this;
            c21581.label = 1;
            if (WD.X(c21592, interfaceC3549gkPlus, c21581) == enumC4602sk) {
                return enumC4602sk;
            }
            androidWebViewContainer = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidWebViewContainer = (AndroidWebViewContainer) c21581.L$0;
            AbstractC3375el.b0(obj);
        }
        WD.i(androidWebViewContainer.scope);
        return C5033xf0.f5238a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.adplayer.WebViewContainer
    public Object evaluateJavascript(String str, InterfaceC2857Wj interfaceC2857Wj) {
        C21601 c21601;
        if (interfaceC2857Wj instanceof C21601) {
            c21601 = (C21601) interfaceC2857Wj;
            int i = c21601.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c21601.label = i - Integer.MIN_VALUE;
            } else {
                c21601 = new C21601(interfaceC2857Wj);
            }
        } else {
            c21601 = new C21601(interfaceC2857Wj);
        }
        Object obj = c21601.result;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = c21601.label;
        try {
            if (i2 == 0) {
                AbstractC3375el.b0(obj);
                InterfaceC3549gk coroutineContext = this.scope.getCoroutineContext();
                C21612 c21612 = new C21612(str, null);
                c21601.label = 1;
                if (WD.X(c21612, coroutineContext, c21601) == enumC4602sk) {
                    return enumC4602sk;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
            }
        } catch (CancellationException unused) {
        }
        return C5033xf0.f5238a;
    }

    @Override // com.unity3d.ads.adplayer.WebViewContainer
    public InterfaceC4731u90 getLastInputEvent() {
        return this.lastInputEvent;
    }

    public final InterfaceC4514rk getScope() {
        return this.scope;
    }

    public final WebView getWebView() {
        return this.webView;
    }

    public final InterfaceC4309pQ get_lastInputEvent() {
        return this._lastInputEvent;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0085  */
    /* JADX WARN: Code duplicated, block: B:29:0x0091 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x0092  */
    /* JADX WARN: Code duplicated, block: B:33:0x009f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.adplayer.WebViewContainer
    public Object loadUrl(String str, InterfaceC2857Wj interfaceC2857Wj) throws LoadWebViewError {
        C21621 c21621;
        AndroidWebViewContainer androidWebViewContainer;
        List<WebViewClientError> list;
        AndroidWebViewContainer androidWebViewContainer2;
        List<WebViewClientError> list2;
        if (interfaceC2857Wj instanceof C21621) {
            c21621 = (C21621) interfaceC2857Wj;
            int i = c21621.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c21621.label = i - Integer.MIN_VALUE;
            } else {
                c21621 = new C21621(interfaceC2857Wj);
            }
        } else {
            c21621 = new C21621(interfaceC2857Wj);
        }
        Object objS = c21621.result;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = c21621.label;
        if (i2 != 0) {
            if (i2 == 1) {
                androidWebViewContainer = (AndroidWebViewContainer) c21621.L$0;
                AbstractC3375el.b0(objS);
            } else if (i2 == 2) {
                androidWebViewContainer = (AndroidWebViewContainer) c21621.L$0;
                AbstractC3375el.b0(objS);
                list = (List) objS;
                if (!list.isEmpty()) {
                    return C5033xf0.f5238a;
                }
                c21621.L$0 = androidWebViewContainer;
                c21621.L$1 = list;
                c21621.label = 3;
                if (androidWebViewContainer.destroy(c21621) == enumC4602sk) {
                    return enumC4602sk;
                }
                androidWebViewContainer2 = androidWebViewContainer;
                list2 = list;
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list2 = (List) c21621.L$1;
                androidWebViewContainer2 = (AndroidWebViewContainer) c21621.L$0;
                AbstractC3375el.b0(objS);
            }
            androidWebViewContainer2.sendWebViewClientErrorDiagnostics.invoke(list2);
            throw new LoadWebViewError(list2);
        }
        AbstractC3375el.b0(objS);
        InterfaceC3549gk coroutineContext = this.scope.getCoroutineContext();
        C21632 c21632 = new C21632(str, null);
        c21621.L$0 = this;
        c21621.label = 1;
        if (WD.X(c21632, coroutineContext, c21621) == enumC4602sk) {
            return enumC4602sk;
        }
        androidWebViewContainer = this;
        InterfaceC3732io onLoadFinished = androidWebViewContainer.webViewClient.getOnLoadFinished();
        c21621.L$0 = androidWebViewContainer;
        c21621.label = 2;
        objS = onLoadFinished.s(c21621);
        if (objS == enumC4602sk) {
            return enumC4602sk;
        }
        list = (List) objS;
        if (!list.isEmpty()) {
            return C5033xf0.f5238a;
        }
        c21621.L$0 = androidWebViewContainer;
        c21621.L$1 = list;
        c21621.label = 3;
        if (androidWebViewContainer.destroy(c21621) == enumC4602sk) {
            return enumC4602sk;
        }
        androidWebViewContainer2 = androidWebViewContainer;
        list2 = list;
        androidWebViewContainer2.sendWebViewClientErrorDiagnostics.invoke(list2);
        throw new LoadWebViewError(list2);
    }
}
