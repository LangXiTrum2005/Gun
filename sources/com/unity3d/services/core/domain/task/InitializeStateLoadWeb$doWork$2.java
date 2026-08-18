package com.unity3d.services.core.domain.task;

import com.badlogic.gdx.Input;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.extensions.TaskExtensionsKt;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.RequestType;
import com.unity3d.services.core.properties.SdkProperties;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3899kk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.HZ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IZ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;
import java.io.File;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes4.dex */
@InterfaceC2314Bl(c = "com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2", f = "InitializeStateLoadWeb.kt", l = {46, 64, Input.Keys.LEFT_BRACKET}, m = "invokeSuspend")
public final class InitializeStateLoadWeb$doWork$2 extends Ea0 implements InterfaceC3567gx {
    final /* synthetic */ InitializeStateLoadWeb.Params $params;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ InitializeStateLoadWeb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateLoadWeb$doWork$2(InitializeStateLoadWeb.Params params, InitializeStateLoadWeb initializeStateLoadWeb, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.$params = params;
        this.this$0 = initializeStateLoadWeb;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        InitializeStateLoadWeb$doWork$2 initializeStateLoadWeb$doWork$2 = new InitializeStateLoadWeb$doWork$2(this.$params, this.this$0, interfaceC2857Wj);
        initializeStateLoadWeb$doWork$2.L$0 = obj;
        return initializeStateLoadWeb$doWork$2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
        return ((InitializeStateLoadWeb$doWork$2) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0153 A[Catch: all -> 0x001f, CancellationException -> 0x0022, TryCatch #6 {CancellationException -> 0x0022, all -> 0x001f, blocks: (B:8:0x0018, B:54:0x0172, B:58:0x0196, B:60:0x01a0, B:63:0x01ab, B:64:0x01bd, B:66:0x01c0, B:67:0x01cc, B:49:0x014e, B:51:0x0153, B:55:0x0176, B:56:0x0188, B:48:0x0149, B:41:0x0120, B:57:0x0189, B:40:0x011c, B:27:0x0072), top: B:85:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0171 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x0176 A[Catch: all -> 0x001f, CancellationException -> 0x0022, TryCatch #6 {CancellationException -> 0x0022, all -> 0x001f, blocks: (B:8:0x0018, B:54:0x0172, B:58:0x0196, B:60:0x01a0, B:63:0x01ab, B:64:0x01bd, B:66:0x01c0, B:67:0x01cc, B:49:0x014e, B:51:0x0153, B:55:0x0176, B:56:0x0188, B:48:0x0149, B:41:0x0120, B:57:0x0189, B:40:0x011c, B:27:0x0072), top: B:85:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:66:0x01c0 A[Catch: all -> 0x001f, CancellationException -> 0x0022, TryCatch #6 {CancellationException -> 0x0022, all -> 0x001f, blocks: (B:8:0x0018, B:54:0x0172, B:58:0x0196, B:60:0x01a0, B:63:0x01ab, B:64:0x01bd, B:66:0x01c0, B:67:0x01cc, B:49:0x014e, B:51:0x0153, B:55:0x0176, B:56:0x0188, B:48:0x0149, B:41:0x0120, B:57:0x0189, B:40:0x011c, B:27:0x0072), top: B:85:0x000c }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        Object objV;
        Object objV2;
        HttpRequest httpRequest;
        InitializeStateLoadWeb.Params params;
        Object objX;
        Throwable thA;
        InitializeStateLoadWeb.Params params2;
        String string;
        String webViewHash;
        HttpRequest httpRequest2;
        InitializeStateLoadWeb initializeStateLoadWeb;
        HttpRequest httpRequest3;
        InitializeStateLoadWeb initializeStateLoadWeb2;
        Object objWithRetry;
        Object objV3;
        HttpRequest httpRequest4;
        Object objMo81invokegIAlus;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.label;
        try {
            try {
                if (i != 0) {
                    if (i == 1) {
                        httpRequest3 = (HttpRequest) this.L$3;
                        initializeStateLoadWeb2 = (InitializeStateLoadWeb) this.L$2;
                        params2 = (InitializeStateLoadWeb.Params) this.L$1;
                        try {
                            AbstractC3375el.b0(obj);
                            objWithRetry = obj;
                            httpRequest3 = httpRequest3;
                        } catch (Throwable th) {
                            th = th;
                            objV3 = AbstractC3375el.v(th);
                            httpRequest4 = httpRequest3;
                        }
                    } else if (i == 2) {
                        HttpRequest httpRequest5 = (HttpRequest) this.L$2;
                        initializeStateLoadWeb2 = (InitializeStateLoadWeb) this.L$1;
                        params2 = (InitializeStateLoadWeb.Params) this.L$0;
                        AbstractC3375el.b0(obj);
                        objMo81invokegIAlus = ((IZ) obj).f3222a;
                        i = httpRequest5;
                        i = httpRequest4;
                        objV2 = new IZ(objMo81invokegIAlus);
                        httpRequest = i;
                        params = params2;
                        if (!(objV2 instanceof HZ)) {
                            throw new InitializationException(ErrorState.NetworkWebviewRequest, new Exception("No connected events within the timeout!"), params.getConfig());
                        }
                        AbstractC3899kk io = initializeStateLoadWeb2.dispatchers.getIo();
                        InitializeStateLoadWeb$doWork$2$1$webViewData$1 initializeStateLoadWeb$doWork$2$1$webViewData$1 = new InitializeStateLoadWeb$doWork$2$1$webViewData$1(initializeStateLoadWeb2, httpRequest, null);
                        this.L$0 = params;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 3;
                        objX = WD.X(initializeStateLoadWeb$doWork$2$1$webViewData$1, io, this);
                        if (objX == enumC4602sk) {
                            return enumC4602sk;
                        }
                    } else {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        params = (InitializeStateLoadWeb.Params) this.L$0;
                        AbstractC3375el.b0(obj);
                        objX = obj;
                    }
                    string = (String) objX;
                    params2 = params;
                    webViewHash = params2.getConfig().getWebViewHash();
                    if (webViewHash != null && !AbstractC2995aW.i(Utilities.Sha256(string), webViewHash)) {
                        throw new InitializationException(ErrorState.InvalidHash, new Exception("Invalid webViewHash"), params2.getConfig());
                    }
                    if (webViewHash != null) {
                        Utilities.writeFile(new File(SdkProperties.getLocalWebViewFile()), string);
                    }
                    objV = new InitializeStateLoadWeb.LoadWebResult(params2.getConfig(), string);
                    if (!(!(objV instanceof HZ)) && (thA = IZ.a(objV)) != null) {
                        objV = AbstractC3375el.v(thA);
                    }
                    return new IZ(objV);
                }
                AbstractC3375el.b0(obj);
                InterfaceC4514rk interfaceC4514rk = (InterfaceC4514rk) this.L$0;
                InitializeStateLoadWeb.Params params3 = this.$params;
                InitializeStateLoadWeb initializeStateLoadWeb3 = this.this$0;
                DeviceLog.info("Unity Ads init: loading webapp from " + params3.getConfig().getWebViewUrl());
                String webViewUrl = params3.getConfig().getWebViewUrl();
                AbstractC2995aW.p(webViewUrl, "params.config.webViewUrl");
                HttpRequest httpRequest6 = new HttpRequest(webViewUrl, null, RequestType.GET, null, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131066, null);
                try {
                    int maxRetries = params3.getConfig().getMaxRetries();
                    double retryScalingFactor = params3.getConfig().getRetryScalingFactor();
                    long retryDelay = params3.getConfig().getRetryDelay();
                    InitializationException initializationException = new InitializationException(ErrorState.NetworkWebviewRequest, new Exception(), params3.getConfig());
                    InitializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1 initializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1 = new InitializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1(initializeStateLoadWeb3, httpRequest6, null);
                    this.L$0 = interfaceC4514rk;
                    this.L$1 = params3;
                    this.L$2 = initializeStateLoadWeb3;
                    this.L$3 = httpRequest6;
                    this.label = 1;
                    httpRequest2 = httpRequest6;
                    initializeStateLoadWeb = initializeStateLoadWeb3;
                    try {
                        objWithRetry = TaskExtensionsKt.withRetry(retryDelay, maxRetries, retryScalingFactor, initializationException, initializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1, this);
                        if (objWithRetry == enumC4602sk) {
                            return enumC4602sk;
                        }
                        httpRequest3 = httpRequest2;
                        params2 = params3;
                        initializeStateLoadWeb2 = initializeStateLoadWeb;
                    } catch (Throwable th2) {
                        th = th2;
                        httpRequest3 = httpRequest2;
                        params2 = params3;
                        initializeStateLoadWeb2 = initializeStateLoadWeb;
                        objV3 = AbstractC3375el.v(th);
                        httpRequest4 = httpRequest3;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    httpRequest2 = httpRequest6;
                    initializeStateLoadWeb = initializeStateLoadWeb3;
                }
                objV3 = (HttpResponse) objWithRetry;
                httpRequest4 = httpRequest3;
                if (objV3 instanceof HZ) {
                    InitializeStateNetworkError initializeStateNetworkError = initializeStateLoadWeb2.initializeStateNetworkError;
                    InitializeStateNetworkError.Params params4 = new InitializeStateNetworkError.Params(params2.getConfig());
                    this.L$0 = params2;
                    this.L$1 = initializeStateLoadWeb2;
                    this.L$2 = httpRequest4;
                    this.L$3 = null;
                    this.label = 2;
                    objMo81invokegIAlus = initializeStateNetworkError.mo81invokegIAlus(params4, this);
                    if (objMo81invokegIAlus == enumC4602sk) {
                        i = httpRequest4;
                        return enumC4602sk;
                    }
                    i = httpRequest4;
                    objV2 = new IZ(objMo81invokegIAlus);
                    httpRequest = i;
                    params = params2;
                    if (!(objV2 instanceof HZ)) {
                        throw new InitializationException(ErrorState.NetworkWebviewRequest, new Exception("No connected events within the timeout!"), params.getConfig());
                    }
                    AbstractC3899kk io2 = initializeStateLoadWeb2.dispatchers.getIo();
                    InitializeStateLoadWeb$doWork$2$1$webViewData$1 initializeStateLoadWeb$doWork$2$1$webViewData$2 = new InitializeStateLoadWeb$doWork$2$1$webViewData$1(initializeStateLoadWeb2, httpRequest, null);
                    this.L$0 = params;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 3;
                    objX = WD.X(initializeStateLoadWeb$doWork$2$1$webViewData$2, io2, this);
                    if (objX == enumC4602sk) {
                        return enumC4602sk;
                    }
                    string = (String) objX;
                    params2 = params;
                } else {
                    AbstractC3375el.b0(objV3);
                    string = ((HttpResponse) objV3).getBody().toString();
                }
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th4) {
                objV = AbstractC3375el.v(th4);
            }
        } catch (Throwable th5) {
            objV2 = AbstractC3375el.v(th5);
            httpRequest = i;
        }
        webViewHash = params2.getConfig().getWebViewHash();
        if (webViewHash != null) {
            throw new InitializationException(ErrorState.InvalidHash, new Exception("Invalid webViewHash"), params2.getConfig());
        }
        if (webViewHash != null) {
            Utilities.writeFile(new File(SdkProperties.getLocalWebViewFile()), string);
        }
        objV = new InitializeStateLoadWeb.LoadWebResult(params2.getConfig(), string);
        if (!(!(objV instanceof HZ))) {
            objV = AbstractC3375el.v(thA);
        }
        return new IZ(objV);
    }
}
