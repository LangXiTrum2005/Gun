package com.unity3d.ads.adplayer;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.JSONArrayExtensionsKt;
import com.unity3d.services.core.log.DeviceLog;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2883Xj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3899kk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4637t60;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4995x90;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BX;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2805Uj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2854Wg;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2942Zq;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3013ah;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4251ok;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4549s60;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4839vT;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4907w90;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2828Vg;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3732io;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4221oQ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4286p60;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4309pQ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.J0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Jc0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
public final class CommonWebViewBridge implements WebViewBridge {
    private final InterfaceC4221oQ _onInvocation;
    private final InterfaceC4309pQ callbacks;
    private final InterfaceC4286p60 onInvocation;
    private final InterfaceC4514rk scope;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final WebViewContainer webViewContainer;

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$1", f = "CommonWebViewBridge.kt", l = {30}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends Ea0 implements InterfaceC3567gx {
        int label;

        public AnonymousClass1(InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return CommonWebViewBridge.this.new AnonymousClass1(interfaceC2857Wj);
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
                WebViewContainer webViewContainer = CommonWebViewBridge.this.webViewContainer;
                CommonWebViewBridge commonWebViewBridge = CommonWebViewBridge.this;
                this.label = 1;
                if (webViewContainer.addJavascriptInterface(commonWebViewBridge, "webviewbridge", this) == enumC4602sk) {
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
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC2314Bl(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$1", f = "CommonWebViewBridge.kt", l = {109, 111, 112, 112, EnumC4719u30.PROTOBUF_SERIALIZATION_ERROR_VALUE}, m = "invokeSuspend")
    public static final class C21651 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ String $callback;
        final /* synthetic */ String $location;
        final /* synthetic */ JSONArray $parameters;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        final /* synthetic */ CommonWebViewBridge this$0;

        /* JADX INFO: renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$1$1, reason: invalid class name and collision with other inner class name */
        @InterfaceC2314Bl(c = "com.unity3d.ads.adplayer.CommonWebViewBridge$handleInvocation$1$1", f = "CommonWebViewBridge.kt", l = {111}, m = "invokeSuspend")
        public static final class C02961 extends Ea0 implements InterfaceC3567gx {
            final /* synthetic */ Invocation $invocation;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02961(Invocation invocation, InterfaceC2857Wj interfaceC2857Wj) {
                super(2, interfaceC2857Wj);
                this.$invocation = invocation;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
            public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
                return new C02961(this.$invocation, interfaceC2857Wj);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
            public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
                return ((C02961) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
            public final Object invokeSuspend(Object obj) {
                EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
                int i = this.label;
                if (i == 0) {
                    AbstractC3375el.b0(obj);
                    InterfaceC3732io interfaceC3732ioIsHandled = this.$invocation.isHandled();
                    this.label = 1;
                    if (interfaceC3732ioIsHandled.s(this) == enumC4602sk) {
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
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21651(String str, JSONArray jSONArray, CommonWebViewBridge commonWebViewBridge, String str2, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$location = str;
            this.$parameters = jSONArray;
            this.this$0 = commonWebViewBridge;
            this.$callback = str2;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return new C21651(this.$location, this.$parameters, this.this$0, this.$callback, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((C21651) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        /* JADX WARN: Code duplicated, block: B:32:0x00a6 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:33:0x00a7  */
        /* JADX WARN: Code duplicated, block: B:36:0x00bf A[RETURN] */
        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            String message;
            Invocation invocation;
            CommonWebViewBridge commonWebViewBridge;
            String str;
            String str2;
            Object[] objArr;
            Object result;
            Object[] objArr2;
            Object[] objArr3;
            int i;
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i2 = this.label;
            try {
                if (i2 != 0) {
                    if (i2 == 1) {
                        invocation = (Invocation) this.L$0;
                        AbstractC3375el.b0(obj);
                    } else if (i2 == 2) {
                        invocation = (Invocation) this.L$0;
                        AbstractC3375el.b0(obj);
                        commonWebViewBridge = this.this$0;
                        str = this.$callback;
                        str2 = "OK";
                        objArr = new Object[1];
                        this.L$0 = objArr;
                        this.L$1 = commonWebViewBridge;
                        this.L$2 = str;
                        this.L$3 = "OK";
                        this.L$4 = objArr;
                        this.I$0 = 0;
                        this.label = 3;
                        result = invocation.getResult(this);
                        if (result == enumC4602sk) {
                            return enumC4602sk;
                        }
                        objArr2 = objArr;
                        objArr3 = objArr2;
                        obj = result;
                        i = 0;
                        objArr2[i] = obj;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.label = 4;
                        if (commonWebViewBridge.respond(str, str2, objArr3, this) == enumC4602sk) {
                            return enumC4602sk;
                        }
                    } else if (i2 == 3) {
                        i = this.I$0;
                        objArr2 = (Object[]) this.L$4;
                        str2 = (String) this.L$3;
                        str = (String) this.L$2;
                        commonWebViewBridge = (CommonWebViewBridge) this.L$1;
                        objArr3 = (Object[]) this.L$0;
                        AbstractC3375el.b0(obj);
                        objArr2[i] = obj;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.label = 4;
                        if (commonWebViewBridge.respond(str, str2, objArr3, this) == enumC4602sk) {
                            return enumC4602sk;
                        }
                    } else {
                        if (i2 != 4 && i2 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC3375el.b0(obj);
                    }
                    return C5033xf0.f5238a;
                }
                AbstractC3375el.b0(obj);
                Invocation invocation2 = new Invocation(this.$location, JSONArrayExtensionsKt.toTypedArray(this.$parameters));
                InterfaceC4221oQ interfaceC4221oQ = this.this$0._onInvocation;
                this.L$0 = invocation2;
                this.label = 1;
                if (interfaceC4221oQ.emit(invocation2, this) == enumC4602sk) {
                    return enumC4602sk;
                }
                invocation = invocation2;
                C02961 c02961 = new C02961(invocation, null);
                this.L$0 = invocation;
                this.label = 2;
                if (AbstractC2995aW.E0(5000L, c02961, this) == enumC4602sk) {
                    return enumC4602sk;
                }
                commonWebViewBridge = this.this$0;
                str = this.$callback;
                str2 = "OK";
                objArr = new Object[1];
                this.L$0 = objArr;
                this.L$1 = commonWebViewBridge;
                this.L$2 = str;
                this.L$3 = "OK";
                this.L$4 = objArr;
                this.I$0 = 0;
                this.label = 3;
                result = invocation.getResult(this);
                if (result == enumC4602sk) {
                    return enumC4602sk;
                }
                objArr2 = objArr;
                objArr3 = objArr2;
                obj = result;
                i = 0;
                objArr2[i] = obj;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 4;
                if (commonWebViewBridge.respond(str, str2, objArr3, this) == enumC4602sk) {
                    return enumC4602sk;
                }
                return C5033xf0.f5238a;
            } catch (Exception e) {
                if (e instanceof Jc0) {
                    message = DM.m(new StringBuilder("Invocation("), this.$location, ") is not handled");
                } else {
                    message = e.getMessage();
                    if (message == null) {
                        message = "Unknown error";
                    }
                }
                CommonWebViewBridge commonWebViewBridge2 = this.this$0;
                String str3 = this.$callback;
                Object[] objArr4 = {message};
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 5;
                if (commonWebViewBridge2.respond(str3, "ERROR", objArr4, this) == enumC4602sk) {
                    return enumC4602sk;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.CommonWebViewBridge$request$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC2314Bl(c = "com.unity3d.ads.adplayer.CommonWebViewBridge", f = "CommonWebViewBridge.kt", l = {63, 65}, m = J0.REQUEST_KEY_EXTRA)
    public static final class C21661 extends AbstractC2883Xj {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C21661(InterfaceC2857Wj interfaceC2857Wj) {
            super(interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommonWebViewBridge.this.request(null, null, null, this);
        }
    }

    public CommonWebViewBridge(AbstractC3899kk abstractC3899kk, WebViewContainer webViewContainer, InterfaceC4514rk interfaceC4514rk, SendDiagnosticEvent sendDiagnosticEvent) {
        AbstractC2995aW.q(abstractC3899kk, "dispatcher");
        AbstractC2995aW.q(webViewContainer, "webViewContainer");
        AbstractC2995aW.q(interfaceC4514rk, "adPlayerScope");
        AbstractC2995aW.q(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.webViewContainer = webViewContainer;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        C2805Uj c2805UjL = WD.L(WD.L(interfaceC4514rk, abstractC3899kk), new C4251ok("CommonWebViewBridge"));
        this.scope = c2805UjL;
        this.callbacks = AbstractC4995x90.a(C2942Zq.f4095a);
        C4549s60 c4549s60B = AbstractC4637t60.b(0, 7);
        this._onInvocation = c4549s60B;
        this.onInvocation = new BX(c4549s60B);
        WD.D(c2805UjL, null, 0, new AnonymousClass1(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object execute(HandlerType handlerType, String str, InterfaceC2857Wj interfaceC2857Wj) {
        Object objEvaluateJavascript = this.webViewContainer.evaluateJavascript("window.nativebridge." + handlerType.getJsPath() + '(' + str + ");", interfaceC2857Wj);
        return objEvaluateJavascript == EnumC4602sk.f4993a ? objEvaluateJavascript : C5033xf0.f5238a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object respond(String str, String str2, Object[] objArr, InterfaceC2857Wj interfaceC2857Wj) {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONArray.put(str2);
        jSONArray.put(new JSONArray(objArr));
        Object objExecute = execute(HandlerType.CALLBACK, "[" + jSONArray + ']', interfaceC2857Wj);
        return objExecute == EnumC4602sk.f4993a ? objExecute : C5033xf0.f5238a;
    }

    @Override // com.unity3d.ads.adplayer.WebViewBridge
    public InterfaceC4286p60 getOnInvocation() {
        return this.onInvocation;
    }

    public final InterfaceC4514rk getScope() {
        return this.scope;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00bd  */
    @Override // com.unity3d.ads.adplayer.WebViewBridge
    public void handleCallback(String str, String str2, String str3) throws IllegalAccessException, InvocationTargetException {
        Object next;
        C4907w90 c4907w90;
        Object value;
        LinkedHashSet linkedHashSet;
        AbstractC2995aW.q(str, "callbackId");
        AbstractC2995aW.q(str2, "callbackStatus");
        AbstractC2995aW.q(str3, "rawParameters");
        Object[] typedArray = JSONArrayExtensionsKt.toTypedArray(new JSONArray(str3));
        Iterator it = ((Iterable) ((C4907w90) this.callbacks).getValue()).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC2995aW.i((String) ((C4839vT) next).f5132a, str));
        C4839vT c4839vT = (C4839vT) next;
        if (c4839vT == null) {
            return;
        }
        InterfaceC2828Vg interfaceC2828Vg = (InterfaceC2828Vg) c4839vT.b;
        if (AbstractC2995aW.q0("success", "error").contains(str2)) {
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "old_callback_status", null, null, null, null, 30, null);
        }
        int iHashCode = str2.hashCode();
        if (iHashCode != -1867169789) {
            if (iHashCode != 2524) {
                if (iHashCode == 66247144 ? str2.equals("ERROR") : iHashCode == 96784904 && str2.equals("error")) {
                    Object obj = typedArray[0];
                    AbstractC2995aW.o(obj, "null cannot be cast to non-null type kotlin.String");
                    Exception exc = new Exception((String) obj);
                    C2854Wg c2854Wg = (C2854Wg) interfaceC2828Vg;
                    c2854Wg.getClass();
                    c2854Wg.S(new C3013ah(false, exc));
                }
            } else if (str2.equals("OK")) {
                ((C2854Wg) interfaceC2828Vg).S(typedArray);
            }
        } else if (str2.equals("success")) {
            ((C2854Wg) interfaceC2828Vg).S(typedArray);
        }
        InterfaceC4309pQ interfaceC4309pQ = this.callbacks;
        do {
            c4907w90 = (C4907w90) interfaceC4309pQ;
            value = c4907w90.getValue();
            Set set = (Set) value;
            AbstractC2995aW.q(set, "<this>");
            linkedHashSet = new LinkedHashSet(AbstractC3375el.N(set.size()));
            boolean z = false;
            for (Object obj2 : set) {
                boolean z2 = true;
                if (!z && AbstractC2995aW.i(obj2, c4839vT)) {
                    z = true;
                    z2 = false;
                }
                if (z2) {
                    linkedHashSet.add(obj2);
                }
            }
        } while (!c4907w90.h(value, linkedHashSet));
    }

    @Override // com.unity3d.ads.adplayer.WebViewBridge
    public void handleInvocation(String str) throws JSONException {
        AbstractC2995aW.q(str, PglCryptUtils.KEY_MESSAGE);
        JSONArray jSONArray = new JSONArray(str);
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            AbstractC2995aW.o(obj, "null cannot be cast to non-null type org.json.JSONArray");
            JSONArray jSONArray2 = (JSONArray) obj;
            Object obj2 = jSONArray2.get(0);
            AbstractC2995aW.o(obj2, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) obj2;
            Object obj3 = jSONArray2.get(1);
            AbstractC2995aW.o(obj3, "null cannot be cast to non-null type kotlin.String");
            String str3 = (String) obj3;
            Object obj4 = jSONArray2.get(2);
            AbstractC2995aW.o(obj4, "null cannot be cast to non-null type org.json.JSONArray");
            JSONArray jSONArray3 = (JSONArray) obj4;
            Object obj5 = jSONArray2.get(3);
            AbstractC2995aW.o(obj5, "null cannot be cast to non-null type kotlin.String");
            String str4 = (String) obj5;
            DeviceLog.debug("Unity Ads WebView calling for: " + str2 + '.' + str3 + '(' + jSONArray3 + ')');
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append('.');
            sb.append(str3);
            WD.D(this.scope, null, 0, new C21651(sb.toString(), jSONArray3, this, str4, null), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Override // com.unity3d.ads.adplayer.WebViewBridge
    public Object request(String str, String str2, Object[] objArr, InterfaceC2857Wj interfaceC2857Wj) throws Throwable {
        C21661 c21661;
        C4907w90 c4907w90;
        Object value;
        LinkedHashSet linkedHashSet;
        InterfaceC2828Vg interfaceC2828Vg;
        if (interfaceC2857Wj instanceof C21661) {
            c21661 = (C21661) interfaceC2857Wj;
            int i = c21661.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c21661.label = i - Integer.MIN_VALUE;
            } else {
                c21661 = new C21661(interfaceC2857Wj);
            }
        } else {
            c21661 = new C21661(interfaceC2857Wj);
        }
        Object objZ = c21661.result;
        Object obj = EnumC4602sk.f4993a;
        int i2 = c21661.label;
        if (i2 != 0) {
            if (i2 == 1) {
                interfaceC2828Vg = (InterfaceC2828Vg) c21661.L$0;
                AbstractC3375el.b0(objZ);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(objZ);
            }
        }
        AbstractC3375el.b0(objZ);
        C2854Wg c2854WgB = AbstractC3375el.b();
        String strValueOf = String.valueOf(c2854WgB.hashCode());
        InterfaceC4309pQ interfaceC4309pQ = this.callbacks;
        do {
            c4907w90 = (C4907w90) interfaceC4309pQ;
            value = c4907w90.getValue();
            Set set = (Set) value;
            C4839vT c4839vT = new C4839vT(strValueOf, c2854WgB);
            AbstractC2995aW.q(set, "<this>");
            linkedHashSet = new LinkedHashSet(AbstractC3375el.N(set.size() + 1));
            linkedHashSet.addAll(set);
            linkedHashSet.add(c4839vT);
        } while (!c4907w90.h(value, linkedHashSet));
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONArray.put(str2);
        jSONArray.put(strValueOf);
        for (Object obj2 : objArr) {
            jSONArray.put(obj2);
        }
        HandlerType handlerType = HandlerType.INVOCATION;
        String string = jSONArray.toString();
        AbstractC2995aW.p(string, "arguments.toString()");
        c21661.L$0 = c2854WgB;
        c21661.label = 1;
        if (execute(handlerType, string, c21661) == obj) {
            return obj;
        }
        interfaceC2828Vg = c2854WgB;
        c21661.L$0 = null;
        c21661.label = 2;
        objZ = ((C2854Wg) interfaceC2828Vg).z(c21661);
        return objZ == obj ? obj : objZ;
    }

    @Override // com.unity3d.ads.adplayer.WebViewBridge
    public Object sendEvent(WebViewEvent webViewEvent, InterfaceC2857Wj interfaceC2857Wj) {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(webViewEvent.getCategory());
        jSONArray.put(webViewEvent.getName());
        for (Object obj : webViewEvent.getParameters()) {
            jSONArray.put(obj);
        }
        HandlerType handlerType = HandlerType.EVENT;
        String string = jSONArray.toString();
        AbstractC2995aW.p(string, "arguments.toString()");
        Object objExecute = execute(handlerType, string, interfaceC2857Wj);
        return objExecute == EnumC4602sk.f4993a ? objExecute : C5033xf0.f5238a;
    }
}
