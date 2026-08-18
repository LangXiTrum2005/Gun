package com.unity3d.ads.core.domain;

import android.app.Activity;
import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.AndroidShowOptions;
import com.unity3d.ads.core.configuration.GameServerIdReader;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.ShowEvent;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.extensions.JSONObjectExtensionsKt;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2298Av;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2350Cv;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2765Sv;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4706tv;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3655hx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4443qv;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4530rv;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidShow implements Show {
    private final AdRepository adRepository;
    private final GameServerIdReader gameServerIdReader;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidShow$invoke$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1", f = "AndroidShow.kt", l = {29, 53}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ UnityAdsShowOptions $showOptions;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ AndroidShow this$0;

        /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidShow$invoke$1$2, reason: invalid class name */
        @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1$2", f = "AndroidShow.kt", l = {}, m = "invokeSuspend")
        public static final class AnonymousClass2 extends Ea0 implements InterfaceC3567gx {
            final /* synthetic */ Activity $activity;
            final /* synthetic */ AdObject $ad;
            final /* synthetic */ UnityAdsShowOptions $showOptions;
            int label;
            final /* synthetic */ AndroidShow this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(AdObject adObject, AndroidShow androidShow, Activity activity, UnityAdsShowOptions unityAdsShowOptions, InterfaceC2857Wj interfaceC2857Wj) {
                super(2, interfaceC2857Wj);
                this.$ad = adObject;
                this.this$0 = androidShow;
                this.$activity = activity;
                this.$showOptions = unityAdsShowOptions;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
            public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
                return new AnonymousClass2(this.$ad, this.this$0, this.$activity, this.$showOptions, interfaceC2857Wj);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
            public final Object invoke(InterfaceC4530rv interfaceC4530rv, InterfaceC2857Wj interfaceC2857Wj) {
                return ((AnonymousClass2) create(interfaceC4530rv, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
            }

            /* JADX WARN: Code duplicated, block: B:11:0x0026  */
            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
                AdObject adObject = this.$ad;
                GameServerIdReader gameServerIdReader = this.this$0.gameServerIdReader;
                Object obj2 = gameServerIdReader.getJsonStorage().get(gameServerIdReader.getKey());
                if (obj2 == null) {
                    obj2 = null;
                } else {
                    if (!(obj2 instanceof String)) {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        obj2 = null;
                    }
                }
                if (gameServerIdReader.getJsonStorage().get(gameServerIdReader.getKey()) != null) {
                    gameServerIdReader.getJsonStorage().delete(gameServerIdReader.getKey());
                }
                adObject.setPlayerServerId((String) obj2);
                AdPlayer adPlayer = this.$ad.getAdPlayer();
                WeakReference weakReference = new WeakReference(this.$activity);
                JSONObject data = this.$showOptions.getData();
                adPlayer.show(new AndroidShowOptions(weakReference, data != null ? JSONObjectExtensionsKt.toBuiltInMap(data) : null, this.$ad.getPlacementId(), this.$ad.isScarAd(), this.$ad.getScarQueryId(), null, this.$ad.getScarAdUnitId(), 32, null));
                return C5033xf0.f5238a;
            }
        }

        /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidShow$invoke$1$3, reason: invalid class name */
        @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1$3", f = "AndroidShow.kt", l = {48}, m = "invokeSuspend")
        public static final class AnonymousClass3 extends Ea0 implements InterfaceC3655hx {
            final /* synthetic */ ByteString $opportunityId;
            int label;
            final /* synthetic */ AndroidShow this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(AndroidShow androidShow, ByteString byteString, InterfaceC2857Wj interfaceC2857Wj) {
                super(3, interfaceC2857Wj);
                this.this$0 = androidShow;
                this.$opportunityId = byteString;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3655hx
            public final Object invoke(InterfaceC4530rv interfaceC4530rv, Throwable th, InterfaceC2857Wj interfaceC2857Wj) {
                return new AnonymousClass3(this.this$0, this.$opportunityId, interfaceC2857Wj).invokeSuspend(C5033xf0.f5238a);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
            public final Object invokeSuspend(Object obj) {
                EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
                int i = this.label;
                if (i == 0) {
                    AbstractC3375el.b0(obj);
                    AdRepository adRepository = this.this$0.adRepository;
                    ByteString byteString = this.$opportunityId;
                    this.label = 1;
                    if (adRepository.removeAd(byteString, this) == enumC4602sk) {
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

        /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidShow$invoke$1$4, reason: invalid class name */
        @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1$4", f = "AndroidShow.kt", l = {50}, m = "invokeSuspend")
        public static final class AnonymousClass4 extends Ea0 implements InterfaceC3655hx {
            private /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            public AnonymousClass4(InterfaceC2857Wj interfaceC2857Wj) {
                super(3, interfaceC2857Wj);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3655hx
            public final Object invoke(InterfaceC4530rv interfaceC4530rv, ShowEvent showEvent, InterfaceC2857Wj interfaceC2857Wj) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(interfaceC2857Wj);
                anonymousClass4.L$0 = interfaceC4530rv;
                anonymousClass4.L$1 = showEvent;
                return anonymousClass4.invokeSuspend(C5033xf0.f5238a);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
            public final Object invokeSuspend(Object obj) {
                ShowEvent showEvent;
                EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
                int i = this.label;
                if (i == 0) {
                    AbstractC3375el.b0(obj);
                    InterfaceC4530rv interfaceC4530rv = (InterfaceC4530rv) this.L$0;
                    ShowEvent showEvent2 = (ShowEvent) this.L$1;
                    this.L$0 = showEvent2;
                    this.label = 1;
                    if (interfaceC4530rv.emit(showEvent2, this) == enumC4602sk) {
                        return enumC4602sk;
                    }
                    showEvent = showEvent2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    showEvent = (ShowEvent) this.L$0;
                    AbstractC3375el.b0(obj);
                }
                return Boolean.valueOf(((showEvent instanceof ShowEvent.Completed) || (showEvent instanceof ShowEvent.Error)) ? false : true);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AdObject adObject, AndroidShow androidShow, Activity activity, UnityAdsShowOptions unityAdsShowOptions, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$adObject = adObject;
            this.this$0 = androidShow;
            this.$activity = activity;
            this.$showOptions = unityAdsShowOptions;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$adObject, this.this$0, this.$activity, this.$showOptions, interfaceC2857Wj);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4530rv interfaceC4530rv, InterfaceC2857Wj interfaceC2857Wj) {
            return ((AnonymousClass1) create(interfaceC4530rv, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            Object ad;
            final InterfaceC4530rv interfaceC4530rv;
            ByteString byteString;
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    byteString = (ByteString) this.L$1;
                    InterfaceC4530rv interfaceC4530rv2 = (InterfaceC4530rv) this.L$0;
                    AbstractC3375el.b0(obj);
                    interfaceC4530rv = interfaceC4530rv2;
                    ad = obj;
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC3375el.b0(obj);
                }
                return C5033xf0.f5238a;
            }
            AbstractC3375el.b0(obj);
            InterfaceC4530rv interfaceC4530rv3 = (InterfaceC4530rv) this.L$0;
            if (!(!this.$adObject.getOpportunityId().isEmpty())) {
                throw new IllegalArgumentException("No opportunityId".toString());
            }
            ByteString opportunityId = this.$adObject.getOpportunityId();
            AdRepository adRepository = this.this$0.adRepository;
            this.L$0 = interfaceC4530rv3;
            this.L$1 = opportunityId;
            this.label = 1;
            ad = adRepository.getAd(opportunityId, this);
            if (ad == enumC4602sk) {
                return enumC4602sk;
            }
            interfaceC4530rv = interfaceC4530rv3;
            byteString = opportunityId;
            AdObject adObject = (AdObject) ad;
            if (adObject == null) {
                throw new IllegalStateException("No ad associated with opportunityId");
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.this$0.sendDiagnosticEvent, "native_show_started_ad_viewer", null, null, null, this.$adObject, 14, null);
            AdPlayer adPlayer = adObject.getAdPlayer();
            if (adPlayer == null) {
                throw new IllegalStateException("No adPlayer associated with ad");
            }
            C4706tv c4706tv = new C4706tv(new C2765Sv(new C2298Av(new C2350Cv(new AnonymousClass2(adObject, this.this$0, this.$activity, this.$showOptions, null), adPlayer.getOnShowEvent()), new AnonymousClass3(this.this$0, byteString, null)), new AnonymousClass4(null), null));
            InterfaceC4530rv interfaceC4530rv4 = new InterfaceC4530rv() { // from class: com.unity3d.ads.core.domain.AndroidShow.invoke.1.5
                @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4530rv
                public final Object emit(ShowEvent showEvent, InterfaceC2857Wj interfaceC2857Wj) {
                    Object objEmit = interfaceC4530rv.emit(showEvent, interfaceC2857Wj);
                    return objEmit == EnumC4602sk.f4993a ? objEmit : C5033xf0.f5238a;
                }
            };
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            if (c4706tv.collect(interfaceC4530rv4, this) == enumC4602sk) {
                return enumC4602sk;
            }
            return C5033xf0.f5238a;
        }
    }

    public AndroidShow(AdRepository adRepository, GameServerIdReader gameServerIdReader, SendDiagnosticEvent sendDiagnosticEvent) {
        AbstractC2995aW.q(adRepository, "adRepository");
        AbstractC2995aW.q(gameServerIdReader, "gameServerIdReader");
        AbstractC2995aW.q(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.adRepository = adRepository;
        this.gameServerIdReader = gameServerIdReader;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    @Override // com.unity3d.ads.core.domain.Show
    public InterfaceC4443qv invoke(Activity activity, AdObject adObject, UnityAdsShowOptions unityAdsShowOptions) {
        AbstractC2995aW.q(activity, "activity");
        AbstractC2995aW.q(adObject, "adObject");
        AbstractC2995aW.q(unityAdsShowOptions, "showOptions");
        return new C4706tv(new AnonymousClass1(adObject, this, activity, unityAdsShowOptions, null));
    }

    @Override // com.unity3d.ads.core.domain.Show
    public Object terminate(AdObject adObject, InterfaceC2857Wj interfaceC2857Wj) {
        Object objDestroy;
        AdPlayer adPlayer = adObject.getAdPlayer();
        return (adPlayer == null || (objDestroy = adPlayer.destroy(interfaceC2857Wj)) != EnumC4602sk.f4993a) ? C5033xf0.f5238a : objDestroy;
    }
}
