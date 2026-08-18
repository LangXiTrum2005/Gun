package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2883Xj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Bc0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4839vT;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IP;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.U5;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes4.dex */
public final class CommonCacheFile implements CacheFile {
    private final CacheRepository cacheRepository;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.CommonCacheFile$invoke$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.CommonCacheFile", f = "CommonCacheFile.kt", l = {27}, m = "invoke")
    public static final class AnonymousClass1 extends AbstractC2883Xj {
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(InterfaceC2857Wj interfaceC2857Wj) {
            super(interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommonCacheFile.this.invoke(null, null, null, 0, this);
        }
    }

    public CommonCacheFile(CacheRepository cacheRepository, SendDiagnosticEvent sendDiagnosticEvent) {
        AbstractC2995aW.q(cacheRepository, "cacheRepository");
        AbstractC2995aW.q(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.cacheRepository = cacheRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    @Override // com.unity3d.ads.core.domain.CacheFile
    public Object invoke(String str, AdObject adObject, JSONArray jSONArray, int i, InterfaceC2857Wj interfaceC2857Wj) {
        AnonymousClass1 anonymousClass1;
        long jA;
        String str2;
        Object file;
        CommonCacheFile commonCacheFile;
        AdObject adObject2;
        if (interfaceC2857Wj instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) interfaceC2857Wj;
            int i2 = anonymousClass1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i2 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(interfaceC2857Wj);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(interfaceC2857Wj);
        }
        AnonymousClass1 anonymousClass2 = anonymousClass1;
        Object obj = anonymousClass2.result;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i3 = anonymousClass2.label;
        if (i3 == 0) {
            AbstractC3375el.b0(obj);
            jA = IP.a();
            CacheRepository cacheRepository = this.cacheRepository;
            String stringUtf8 = adObject.getOpportunityId().toStringUtf8();
            AbstractC2995aW.p(stringUtf8, "adObject.opportunityId.toStringUtf8()");
            anonymousClass2.L$0 = this;
            str2 = str;
            anonymousClass2.L$1 = str2;
            anonymousClass2.L$2 = adObject;
            anonymousClass2.J$0 = jA;
            anonymousClass2.label = 1;
            file = cacheRepository.getFile(str, stringUtf8, jSONArray, i, anonymousClass2);
            if (file == enumC4602sk) {
                return enumC4602sk;
            }
            commonCacheFile = this;
            adObject2 = adObject;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j = anonymousClass2.J$0;
            AdObject adObject3 = (AdObject) anonymousClass2.L$2;
            String str3 = (String) anonymousClass2.L$1;
            commonCacheFile = (CommonCacheFile) anonymousClass2.L$0;
            AbstractC3375el.b0(obj);
            jA = j;
            adObject2 = adObject3;
            file = obj;
            str2 = str3;
        }
        CacheResult cacheResult = (CacheResult) file;
        if (cacheResult instanceof CacheResult.Success) {
            CacheResult.Success success = (CacheResult.Success) cacheResult;
            commonCacheFile.sendDiagnosticEvent.invoke("native_load_cache_success_time", new Double(TimeExtensionsKt.elapsedMillis(new Bc0(jA))), U5.u0(new C4839vT("cache_source", success.getSource().toString()), new C4839vT("url", str2), new C4839vT("protocol", success.getCachedFile().getProtocol())), AbstractC3375el.O(new C4839vT("size_kb", new Integer((int) (success.getCachedFile().getContentLength() / ((long) 1024))))), adObject2);
        } else if (cacheResult instanceof CacheResult.Failure) {
            CacheResult.Failure failure = (CacheResult.Failure) cacheResult;
            SendDiagnosticEvent.DefaultImpls.invoke$default(commonCacheFile.sendDiagnosticEvent, "native_load_cache_failure_time", new Double(TimeExtensionsKt.elapsedMillis(new Bc0(jA))), U5.u0(new C4839vT("cache_source", failure.getSource().toString()), new C4839vT("url", str2), new C4839vT("reason", failure.getError().toString())), null, adObject2, 8, null);
        }
        return cacheResult;
    }
}
