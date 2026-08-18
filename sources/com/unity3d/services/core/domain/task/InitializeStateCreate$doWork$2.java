package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.webview.WebViewApp;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.HZ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IZ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes4.dex */
@InterfaceC2314Bl(c = "com.unity3d.services.core.domain.task.InitializeStateCreate$doWork$2", f = "InitializeStateCreate.kt", l = {}, m = "invokeSuspend")
public final class InitializeStateCreate$doWork$2 extends Ea0 implements InterfaceC3567gx {
    final /* synthetic */ InitializeStateCreate.Params $params;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateCreate$doWork$2(InitializeStateCreate.Params params, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.$params = params;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new InitializeStateCreate$doWork$2(this.$params, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
        return ((InitializeStateCreate$doWork$2) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        Object objV;
        Throwable thA;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC3375el.b0(obj);
        InitializeStateCreate.Params params = this.$params;
        try {
            DeviceLog.debug("Unity Ads init: creating webapp");
            Configuration config = params.getConfig();
            config.setWebViewData(params.getWebViewData());
            try {
                ErrorState errorStateCreate = WebViewApp.create(config, false);
                objV = config;
                if (errorStateCreate != null) {
                    String webAppFailureMessage = WebViewApp.getCurrentApp().getWebAppFailureMessage() != null ? WebViewApp.getCurrentApp().getWebAppFailureMessage() : "Unity Ads WebApp creation failed";
                    DeviceLog.error(webAppFailureMessage);
                    throw new InitializationException(errorStateCreate, new Exception(webAppFailureMessage), config);
                }
            } catch (IllegalThreadStateException e) {
                DeviceLog.exception("Illegal Thread", e);
                throw new InitializationException(ErrorState.CreateWebApp, e, config);
            }
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            objV = AbstractC3375el.v(th);
        }
        boolean z = !(objV instanceof HZ);
        Object objV2 = objV;
        if (!z && (thA = IZ.a(objV)) != null) {
            objV2 = objV;
            objV2 = AbstractC3375el.v(thA);
        }
        objV2 = objV;
        return new IZ(objV2);
    }
}
