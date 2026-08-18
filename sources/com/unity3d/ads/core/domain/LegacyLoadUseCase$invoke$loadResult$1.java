package com.unity3d.ads.core.domain;

import android.content.Context;
import com.badlogic.gdx.Input;
import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.LoadResult;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3770jF;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
@InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.LegacyLoadUseCase$invoke$loadResult$1", f = "LegacyLoadUseCase.kt", l = {114, 131, 138, Input.Keys.F9}, m = "invokeSuspend")
public final class LegacyLoadUseCase$invoke$loadResult$1 extends Ea0 implements InterfaceC3567gx {
    final /* synthetic */ Context $context;
    final /* synthetic */ AdRequestOuterClass.BannerSize $gatewayBannerSize;
    final /* synthetic */ UnityAdsLoadOptions $loadOptions;
    final /* synthetic */ String $placement;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ LegacyLoadUseCase this$0;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InitializationState.values().length];
            try {
                iArr[InitializationState.INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InitializationState.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InitializationState.NOT_INITIALIZED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InitializationState.INITIALIZING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyLoadUseCase$invoke$loadResult$1(String str, LegacyLoadUseCase legacyLoadUseCase, UnityAdsLoadOptions unityAdsLoadOptions, Context context, AdRequestOuterClass.BannerSize bannerSize, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.$placement = str;
        this.this$0 = legacyLoadUseCase;
        this.$loadOptions = unityAdsLoadOptions;
        this.$context = context;
        this.$gatewayBannerSize = bannerSize;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        return new LegacyLoadUseCase$invoke$loadResult$1(this.$placement, this.this$0, this.$loadOptions, this.$context, this.$gatewayBannerSize, interfaceC2857Wj);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
        return ((LegacyLoadUseCase$invoke$loadResult$1) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0121  */
    /* JADX WARN: Code duplicated, block: B:45:0x0123  */
    /* JADX WARN: Code duplicated, block: B:47:0x012d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x012f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0154  */
    /* JADX WARN: Code duplicated, block: B:50:0x016c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0189 A[RETURN] */
    /* JADX WARN: Instruction removed from duplicated block: B:48:0x012f, please report this as an issue */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        ByteString byteString;
        Object objHasOpportunityId;
        Object objInvoke;
        Object objInvoke$default;
        ByteString byteString2;
        HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup;
        InitializationState initializationState;
        int i;
        Object objInvoke2;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = this.label;
        if (i2 == 0) {
            AbstractC3375el.b0(obj);
            if (this.$placement == null) {
                return new LoadResult.Failure(UnityAds.UnityAdsLoadError.INVALID_ARGUMENT, LoadResult.MSG_PLACEMENT_NULL, null, "placement_null", null, false, 52, null);
            }
            String opportunityId = this.this$0.getOpportunityId(this.$loadOptions);
            if (opportunityId == null) {
                return new LoadResult.Failure(UnityAds.UnityAdsLoadError.INVALID_ARGUMENT, LoadResult.MSG_OPPORTUNITY_ID, null, "no_opportunity_id", null, false, 52, null);
            }
            UUID uuidFromString = UUID.fromString(opportunityId);
            AbstractC2995aW.p(uuidFromString, "fromString(opportunityId)");
            byteString = ProtobufExtensionsKt.toByteString(uuidFromString);
            this.this$0.opportunity = byteString;
            AdRepository adRepository = this.this$0.adRepository;
            this.L$0 = byteString;
            this.label = 1;
            objHasOpportunityId = adRepository.hasOpportunityId(byteString, this);
            if (objHasOpportunityId == enumC4602sk) {
                return enumC4602sk;
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    AbstractC3375el.b0(obj);
                    objInvoke = obj;
                    return (LoadResult) objInvoke;
                }
                if (i2 == 3) {
                    HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup2 = (HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup) this.L$1;
                    ByteString byteString3 = (ByteString) this.L$0;
                    AbstractC3375el.b0(obj);
                    headerBiddingAdMarkup = headerBiddingAdMarkup2;
                    byteString2 = byteString3;
                    objInvoke$default = obj;
                    initializationState = (InitializationState) objInvoke$default;
                    if (initializationState == null) {
                        i = -1;
                    } else {
                        i = WhenMappings.$EnumSwitchMapping$0[initializationState.ordinal()];
                    }
                    if (i != 1) {
                        if (i != 2) {
                            return new LoadResult.Failure(UnityAds.UnityAdsLoadError.INITIALIZE_FAILED, LoadResult.MSG_NOT_INITIALIZED, null, "not_initialized", null, false, 52, null);
                        }
                        return new LoadResult.Failure(UnityAds.UnityAdsLoadError.TIMEOUT, LoadResult.MSG_TIMEOUT + this.$placement, null, "timeout_initialization", null, false, 52, null);
                    }
                    Load load = this.this$0.load;
                    Context context = this.$context;
                    String str = this.$placement;
                    AdRequestOuterClass.BannerSize bannerSize = this.$gatewayBannerSize;
                    UnityAdsLoadOptions unityAdsLoadOptions = this.$loadOptions;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 4;
                    objInvoke2 = load.invoke(context, str, byteString2, headerBiddingAdMarkup, bannerSize, unityAdsLoadOptions, this);
                    if (objInvoke2 == enumC4602sk) {
                        return enumC4602sk;
                    }
                } else {
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC3375el.b0(obj);
                    objInvoke2 = obj;
                }
                return (LoadResult) objInvoke2;
            }
            byteString = (ByteString) this.L$0;
            AbstractC3375el.b0(obj);
            objHasOpportunityId = obj;
        }
        ByteString byteString4 = byteString;
        if (((Boolean) objHasOpportunityId).booleanValue()) {
            new LoadResult.Failure(UnityAds.UnityAdsLoadError.INVALID_ARGUMENT, LoadResult.MSG_OPPORTUNITY_ID_USED, null, "opportunity_id_used", null, false, 52, null);
        }
        LegacyLoadUseCase legacyLoadUseCase = this.this$0;
        HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup3 = legacyLoadUseCase.getHeaderBiddingAdMarkup(legacyLoadUseCase.adMarkup);
        if (headerBiddingAdMarkup3 == null) {
            return new LoadResult.Failure(UnityAds.UnityAdsLoadError.INTERNAL_ERROR, LoadResult.MSG_AD_MARKUP_PARSING, null, "invalid_admarkup", null, false, 52, null);
        }
        int i3 = WhenMappings.$EnumSwitchMapping$0[GetInitializationState.DefaultImpls.invoke$default(this.this$0.getInitializationState, false, 1, null).ordinal()];
        if (i3 == 1) {
            Load load2 = this.this$0.load;
            Context context2 = this.$context;
            String str2 = this.$placement;
            AdRequestOuterClass.BannerSize bannerSize2 = this.$gatewayBannerSize;
            UnityAdsLoadOptions unityAdsLoadOptions2 = this.$loadOptions;
            this.L$0 = null;
            this.label = 2;
            objInvoke = load2.invoke(context2, str2, byteString4, headerBiddingAdMarkup3, bannerSize2, unityAdsLoadOptions2, this);
            if (objInvoke == enumC4602sk) {
                return enumC4602sk;
            }
            return (LoadResult) objInvoke;
        }
        if (i3 == 2 || i3 == 3) {
            return new LoadResult.Failure(UnityAds.UnityAdsLoadError.INITIALIZE_FAILED, LoadResult.MSG_NOT_INITIALIZED, null, "not_initialized", null, false, 52, null);
        }
        if (i3 != 4) {
            throw new C3770jF(7, 0);
        }
        AwaitInitialization awaitInitialization = this.this$0.awaitInitialization;
        this.L$0 = byteString4;
        this.L$1 = headerBiddingAdMarkup3;
        this.label = 3;
        objInvoke$default = AwaitInitialization.DefaultImpls.invoke$default(awaitInitialization, 0L, this, 1, null);
        if (objInvoke$default == enumC4602sk) {
            return enumC4602sk;
        }
        byteString2 = byteString4;
        headerBiddingAdMarkup = headerBiddingAdMarkup3;
        initializationState = (InitializationState) objInvoke$default;
        if (initializationState == null) {
            i = -1;
        } else {
            i = WhenMappings.$EnumSwitchMapping$0[initializationState.ordinal()];
        }
        if (i != 1) {
            if (i != 2) {
                return new LoadResult.Failure(UnityAds.UnityAdsLoadError.INITIALIZE_FAILED, LoadResult.MSG_NOT_INITIALIZED, null, "not_initialized", null, false, 52, null);
            }
            return new LoadResult.Failure(UnityAds.UnityAdsLoadError.TIMEOUT, LoadResult.MSG_TIMEOUT + this.$placement, null, "timeout_initialization", null, false, 52, null);
        }
        Load load3 = this.this$0.load;
        Context context3 = this.$context;
        String str3 = this.$placement;
        AdRequestOuterClass.BannerSize bannerSize3 = this.$gatewayBannerSize;
        UnityAdsLoadOptions unityAdsLoadOptions3 = this.$loadOptions;
        this.L$0 = null;
        this.L$1 = null;
        this.label = 4;
        objInvoke2 = load3.invoke(context3, str3, byteString2, headerBiddingAdMarkup, bannerSize3, unityAdsLoadOptions3, this);
        if (objInvoke2 == enumC4602sk) {
            return enumC4602sk;
        }
        return (LoadResult) objInvoke2;
    }
}
