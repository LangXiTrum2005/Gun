package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.IModuleConfiguration;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.webview.WebViewApp;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.HZ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IZ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes4.dex */
@InterfaceC2314Bl(c = "com.unity3d.services.core.domain.task.InitializeStateReset$doWork$2", f = "InitializeStateReset.kt", l = {41}, m = "invokeSuspend")
public final class InitializeStateReset$doWork$2 extends Ea0 implements InterfaceC3567gx {
    final /* synthetic */ InitializeStateReset.Params $params;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ InitializeStateReset this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateReset$doWork$2(InitializeStateReset.Params params, InitializeStateReset initializeStateReset, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.$params = params;
        this.this$0 = initializeStateReset;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new InitializeStateReset$doWork$2(this.$params, this.this$0, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
        return ((InitializeStateReset$doWork$2) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x007c A[Catch: all -> 0x0016, CancellationException -> 0x0019, TryCatch #2 {CancellationException -> 0x0019, all -> 0x0016, blocks: (B:6:0x0012, B:26:0x005f, B:31:0x006d, B:33:0x007c, B:35:0x0082, B:37:0x0090, B:38:0x0092, B:40:0x0095, B:42:0x00a1, B:43:0x00a8, B:44:0x00ab, B:45:0x00b0, B:46:0x00b7, B:47:0x00b8, B:48:0x00bf, B:29:0x0065, B:30:0x006c, B:15:0x002b, B:17:0x0036, B:19:0x003b, B:22:0x0043), top: B:59:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0082 A[Catch: all -> 0x0016, CancellationException -> 0x0019, TryCatch #2 {CancellationException -> 0x0019, all -> 0x0016, blocks: (B:6:0x0012, B:26:0x005f, B:31:0x006d, B:33:0x007c, B:35:0x0082, B:37:0x0090, B:38:0x0092, B:40:0x0095, B:42:0x00a1, B:43:0x00a8, B:44:0x00ab, B:45:0x00b0, B:46:0x00b7, B:47:0x00b8, B:48:0x00bf, B:29:0x0065, B:30:0x006c, B:15:0x002b, B:17:0x0036, B:19:0x003b, B:22:0x0043), top: B:59:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0090 A[Catch: all -> 0x0016, CancellationException -> 0x0019, TryCatch #2 {CancellationException -> 0x0019, all -> 0x0016, blocks: (B:6:0x0012, B:26:0x005f, B:31:0x006d, B:33:0x007c, B:35:0x0082, B:37:0x0090, B:38:0x0092, B:40:0x0095, B:42:0x00a1, B:43:0x00a8, B:44:0x00ab, B:45:0x00b0, B:46:0x00b7, B:47:0x00b8, B:48:0x00bf, B:29:0x0065, B:30:0x006c, B:15:0x002b, B:17:0x0036, B:19:0x003b, B:22:0x0043), top: B:59:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0095 A[Catch: all -> 0x0016, CancellationException -> 0x0019, TryCatch #2 {CancellationException -> 0x0019, all -> 0x0016, blocks: (B:6:0x0012, B:26:0x005f, B:31:0x006d, B:33:0x007c, B:35:0x0082, B:37:0x0090, B:38:0x0092, B:40:0x0095, B:42:0x00a1, B:43:0x00a8, B:44:0x00ab, B:45:0x00b0, B:46:0x00b7, B:47:0x00b8, B:48:0x00bf, B:29:0x0065, B:30:0x006c, B:15:0x002b, B:17:0x0036, B:19:0x003b, B:22:0x0043), top: B:59:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a1 A[Catch: all -> 0x0016, CancellationException -> 0x0019, TryCatch #2 {CancellationException -> 0x0019, all -> 0x0016, blocks: (B:6:0x0012, B:26:0x005f, B:31:0x006d, B:33:0x007c, B:35:0x0082, B:37:0x0090, B:38:0x0092, B:40:0x0095, B:42:0x00a1, B:43:0x00a8, B:44:0x00ab, B:45:0x00b0, B:46:0x00b7, B:47:0x00b8, B:48:0x00bf, B:29:0x0065, B:30:0x006c, B:15:0x002b, B:17:0x0036, B:19:0x003b, B:22:0x0043), top: B:59:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b0 A[Catch: all -> 0x0016, CancellationException -> 0x0019, TryCatch #2 {CancellationException -> 0x0019, all -> 0x0016, blocks: (B:6:0x0012, B:26:0x005f, B:31:0x006d, B:33:0x007c, B:35:0x0082, B:37:0x0090, B:38:0x0092, B:40:0x0095, B:42:0x00a1, B:43:0x00a8, B:44:0x00ab, B:45:0x00b0, B:46:0x00b7, B:47:0x00b8, B:48:0x00bf, B:29:0x0065, B:30:0x006c, B:15:0x002b, B:17:0x0036, B:19:0x003b, B:22:0x0043), top: B:59:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00b8 A[Catch: all -> 0x0016, CancellationException -> 0x0019, TryCatch #2 {CancellationException -> 0x0019, all -> 0x0016, blocks: (B:6:0x0012, B:26:0x005f, B:31:0x006d, B:33:0x007c, B:35:0x0082, B:37:0x0090, B:38:0x0092, B:40:0x0095, B:42:0x00a1, B:43:0x00a8, B:44:0x00ab, B:45:0x00b0, B:46:0x00b7, B:47:0x00b8, B:48:0x00bf, B:29:0x0065, B:30:0x006c, B:15:0x002b, B:17:0x0036, B:19:0x003b, B:22:0x0043), top: B:59:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00a8 A[SYNTHETIC] */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        Object objV;
        Throwable thA;
        InitializeStateReset.Params params;
        InitializeStateReset initializeStateReset;
        InitializeStateReset initializeStateReset2;
        int i;
        Class[] moduleConfigurationList;
        IModuleConfiguration moduleConfiguration;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = this.label;
        try {
            if (i2 == 0) {
                AbstractC3375el.b0(obj);
                params = this.$params;
                initializeStateReset = this.this$0;
                DeviceLog.debug("Unity Ads init: starting init");
                WebViewApp currentApp = WebViewApp.getCurrentApp();
                if (currentApp != null) {
                    currentApp.resetWebViewAppInitialization();
                }
                if ((currentApp != null ? currentApp.getWebView() : null) != null) {
                    long webViewAppCreateTimeout = params.getConfig().getWebViewAppCreateTimeout();
                    InitializeStateReset$doWork$2$1$success$1 initializeStateReset$doWork$2$1$success$1 = new InitializeStateReset$doWork$2$1$success$1(initializeStateReset, currentApp, null);
                    this.L$0 = params;
                    this.L$1 = initializeStateReset;
                    this.label = 1;
                    Object objF0 = AbstractC2995aW.F0(webViewAppCreateTimeout, initializeStateReset$doWork$2$1$success$1, this);
                    if (objF0 == enumC4602sk) {
                        return enumC4602sk;
                    }
                    initializeStateReset2 = initializeStateReset;
                    obj = objF0;
                }
                initializeStateReset.unregisterLifecycleCallbacks();
                SdkProperties.setCacheDirectory(null);
                SdkProperties.setWebViewCacheDirectory(null);
                if (SdkProperties.getCacheDirectory() != null) {
                    throw new Exception("Cache directory is NULL");
                }
                if (SdkProperties.getWebViewCacheDirectory() != null) {
                    throw new Exception("WebView cache directory is NULL");
                }
                SdkProperties.setInitialized(false);
                moduleConfigurationList = params.getConfig().getModuleConfigurationList();
                if (moduleConfigurationList == null) {
                    moduleConfigurationList = new Class[0];
                }
                for (Class cls : moduleConfigurationList) {
                    moduleConfiguration = params.getConfig().getModuleConfiguration(cls);
                    if (moduleConfiguration != null) {
                        moduleConfiguration.resetState(params.getConfig());
                    }
                }
                objV = params.getConfig();
                if (!(!(objV instanceof HZ)) && (thA = IZ.a(objV)) != null) {
                    objV = AbstractC3375el.v(thA);
                }
                return new IZ(objV);
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            initializeStateReset2 = (InitializeStateReset) this.L$1;
            params = (InitializeStateReset.Params) this.L$0;
            AbstractC3375el.b0(obj);
            if (((C5033xf0) obj) == null) {
                throw new Exception("Reset failed on opening ConditionVariable");
            }
            initializeStateReset = initializeStateReset2;
            initializeStateReset.unregisterLifecycleCallbacks();
            SdkProperties.setCacheDirectory(null);
            SdkProperties.setWebViewCacheDirectory(null);
            if (SdkProperties.getCacheDirectory() != null) {
                throw new Exception("Cache directory is NULL");
            }
            if (SdkProperties.getWebViewCacheDirectory() != null) {
                throw new Exception("WebView cache directory is NULL");
            }
            SdkProperties.setInitialized(false);
            moduleConfigurationList = params.getConfig().getModuleConfigurationList();
            if (moduleConfigurationList == null) {
                moduleConfigurationList = new Class[0];
            }
            while (i < r3) {
                moduleConfiguration = params.getConfig().getModuleConfiguration(cls);
                if (moduleConfiguration != null) {
                    moduleConfiguration.resetState(params.getConfig());
                }
            }
            objV = params.getConfig();
            if (!(!(objV instanceof HZ))) {
                objV = AbstractC3375el.v(thA);
            }
            return new IZ(objV);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            objV = AbstractC3375el.v(th);
        }
    }
}
