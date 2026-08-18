package androidx.privacysandbox.ads.adservices.topics;

import android.annotation.SuppressLint;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo;
import androidx.core.os.OutcomeReceiverKt;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2883Xj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2798Uc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.J0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.N5;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.SM;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@RequiresExtension(extension = 1000000, version = 4)
@SuppressLint({"NewApi"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class TopicsManagerImplCommon extends TopicsManager {
    private final android.adservices.topics.TopicsManager mTopicsManager;

    /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$getTopics$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon", f = "TopicsManagerImplCommon.kt", l = {22}, m = "getTopics$suspendImpl")
    public static final class AnonymousClass1 extends AbstractC2883Xj {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(InterfaceC2857Wj interfaceC2857Wj) {
            super(interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TopicsManagerImplCommon.getTopics$suspendImpl(TopicsManagerImplCommon.this, null, this);
        }
    }

    public TopicsManagerImplCommon(android.adservices.topics.TopicsManager topicsManager) {
        AbstractC2995aW.q(topicsManager, "mTopicsManager");
        this.mTopicsManager = topicsManager;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_TOPICS")
    @DoNotInline
    public static Object getTopics$suspendImpl(TopicsManagerImplCommon topicsManagerImplCommon, GetTopicsRequest getTopicsRequest, InterfaceC2857Wj interfaceC2857Wj) {
        AnonymousClass1 anonymousClass1;
        if (interfaceC2857Wj instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) interfaceC2857Wj;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = topicsManagerImplCommon.new AnonymousClass1(interfaceC2857Wj);
            }
        } else {
            anonymousClass1 = topicsManagerImplCommon.new AnonymousClass1(interfaceC2857Wj);
        }
        Object topicsAsyncInternal = anonymousClass1.result;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            AbstractC3375el.b0(topicsAsyncInternal);
            android.adservices.topics.GetTopicsRequest getTopicsRequestConvertRequest$ads_adservices_release = topicsManagerImplCommon.convertRequest$ads_adservices_release(getTopicsRequest);
            anonymousClass1.L$0 = topicsManagerImplCommon;
            anonymousClass1.label = 1;
            topicsAsyncInternal = topicsManagerImplCommon.getTopicsAsyncInternal(getTopicsRequestConvertRequest$ads_adservices_release, anonymousClass1);
            if (topicsAsyncInternal == enumC4602sk) {
                return enumC4602sk;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            topicsManagerImplCommon = (TopicsManagerImplCommon) anonymousClass1.L$0;
            AbstractC3375el.b0(topicsAsyncInternal);
        }
        return topicsManagerImplCommon.convertResponse$ads_adservices_release(SM.n(topicsAsyncInternal));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_TOPICS")
    public final Object getTopicsAsyncInternal(android.adservices.topics.GetTopicsRequest getTopicsRequest, InterfaceC2857Wj interfaceC2857Wj) {
        C2798Uc c2798Uc = new C2798Uc(1, WD.w(interfaceC2857Wj));
        c2798Uc.t();
        this.mTopicsManager.getTopics(getTopicsRequest, new N5(14), OutcomeReceiverKt.asOutcomeReceiver(c2798Uc));
        return c2798Uc.s();
    }

    public android.adservices.topics.GetTopicsRequest convertRequest$ads_adservices_release(GetTopicsRequest getTopicsRequest) {
        AbstractC2995aW.q(getTopicsRequest, J0.REQUEST_KEY_EXTRA);
        android.adservices.topics.GetTopicsRequest getTopicsRequestBuild = SM.j().setAdsSdkName(getTopicsRequest.getAdsSdkName()).build();
        AbstractC2995aW.p(getTopicsRequestBuild, "Builder()\n            .s…ame)\n            .build()");
        return getTopicsRequestBuild;
    }

    public final GetTopicsResponse convertResponse$ads_adservices_release(android.adservices.topics.GetTopicsResponse getTopicsResponse) {
        AbstractC2995aW.q(getTopicsResponse, "response");
        ArrayList arrayList = new ArrayList();
        Iterator it = getTopicsResponse.getTopics().iterator();
        while (it.hasNext()) {
            android.adservices.topics.Topic topicO = SM.o(it.next());
            arrayList.add(new Topic(topicO.getTaxonomyVersion(), topicO.getModelVersion(), topicO.getTopicId()));
        }
        return new GetTopicsResponse(arrayList);
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.TopicsManager
    @RequiresPermission("android.permission.ACCESS_ADSERVICES_TOPICS")
    @DoNotInline
    public Object getTopics(GetTopicsRequest getTopicsRequest, InterfaceC2857Wj interfaceC2857Wj) {
        return getTopics$suspendImpl(this, getTopicsRequest, interfaceC2857Wj);
    }
}
