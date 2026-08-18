package com.unity3d.services.core.domain.task;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.HZ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IZ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import java.nio.charset.Charset;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes4.dex */
@InterfaceC2314Bl(c = "com.unity3d.services.core.domain.task.InitializeStateLoadCache$doWork$2", f = "InitializeStateLoadCache.kt", l = {}, m = "invokeSuspend")
public final class InitializeStateLoadCache$doWork$2 extends Ea0 implements InterfaceC3567gx {
    final /* synthetic */ InitializeStateLoadCache.Params $params;
    int label;
    final /* synthetic */ InitializeStateLoadCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateLoadCache$doWork$2(InitializeStateLoadCache initializeStateLoadCache, InitializeStateLoadCache.Params params, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.this$0 = initializeStateLoadCache;
        this.$params = params;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new InitializeStateLoadCache$doWork$2(this.this$0, this.$params, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
        return ((InitializeStateLoadCache$doWork$2) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        Object objV;
        Throwable thA;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC3375el.b0(obj);
        InitializeStateLoadCache initializeStateLoadCache = this.this$0;
        InitializeStateLoadCache.Params params = this.$params;
        try {
            DeviceLog.debug("Unity Ads init: check if webapp can be loaded from local cache");
            byte[] webViewData = initializeStateLoadCache.getWebViewData();
            if (webViewData == null) {
                objV = new InitializeStateLoadCache.LoadCacheResult(true, null, 2, null);
            } else {
                String strSha256 = Utilities.Sha256(webViewData);
                Charset charsetForName = Charset.forName(C.UTF8_NAME);
                AbstractC2995aW.p(charsetForName, "forName(\"UTF-8\")");
                String str = new String(webViewData, charsetForName);
                boolean z = strSha256 == null || !AbstractC2995aW.i(strSha256, params.getConfig().getWebViewHash());
                if (!z) {
                    DeviceLog.info("Unity Ads init: webapp loaded from local cache");
                }
                objV = new InitializeStateLoadCache.LoadCacheResult(z, str);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            objV = AbstractC3375el.v(th);
        }
        if (!(!(objV instanceof HZ)) && (thA = IZ.a(objV)) != null) {
            objV = AbstractC3375el.v(thA);
        }
        return new IZ(objV);
    }
}
