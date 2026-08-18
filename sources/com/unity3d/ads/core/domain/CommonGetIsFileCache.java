package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2883Xj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3089ba0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Bc0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4839vT;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IP;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;

/* JADX INFO: loaded from: classes4.dex */
public final class CommonGetIsFileCache implements GetIsFileCache {
    private final CacheRepository cacheRepository;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.CommonGetIsFileCache$invoke$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.CommonGetIsFileCache", f = "CommonGetIsFileCache.kt", l = {22}, m = "invoke")
    public static final class AnonymousClass1 extends AbstractC2883Xj {
        long J$0;
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
            return CommonGetIsFileCache.this.invoke(null, this);
        }
    }

    public CommonGetIsFileCache(CacheRepository cacheRepository, SendDiagnosticEvent sendDiagnosticEvent) {
        AbstractC2995aW.q(cacheRepository, "cacheRepository");
        AbstractC2995aW.q(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.cacheRepository = cacheRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.GetIsFileCache
    public Object invoke(String str, InterfaceC2857Wj interfaceC2857Wj) {
        AnonymousClass1 anonymousClass1;
        CommonGetIsFileCache commonGetIsFileCache;
        long j;
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
        Object objDoesFileExist = anonymousClass1.result;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            AbstractC3375el.b0(objDoesFileExist);
            long jA = IP.a();
            String strT0 = AbstractC3089ba0.T0(AbstractC3089ba0.R0(str), ".");
            CacheRepository cacheRepository = this.cacheRepository;
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = str;
            anonymousClass1.J$0 = jA;
            anonymousClass1.label = 1;
            objDoesFileExist = cacheRepository.doesFileExist(strT0, anonymousClass1);
            if (objDoesFileExist == enumC4602sk) {
                return enumC4602sk;
            }
            commonGetIsFileCache = this;
            j = jA;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = anonymousClass1.J$0;
            str = (String) anonymousClass1.L$1;
            commonGetIsFileCache = (CommonGetIsFileCache) anonymousClass1.L$0;
            AbstractC3375el.b0(objDoesFileExist);
        }
        Boolean bool = (Boolean) objDoesFileExist;
        SendDiagnosticEvent.DefaultImpls.invoke$default(commonGetIsFileCache.sendDiagnosticEvent, bool.booleanValue() ? "native_show_is_file_cached_success_time" : "native_show_is_file_cached_failure_time", new Double(TimeExtensionsKt.elapsedMillis(new Bc0(j))), AbstractC3375el.O(new C4839vT("url", str)), null, null, 24, null);
        return bool;
    }
}
