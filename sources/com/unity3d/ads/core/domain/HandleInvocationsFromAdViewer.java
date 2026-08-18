package com.unity3d.ads.core.domain;

import com.badlogic.gdx.Input;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.adplayer.ExposedFunctionLocation;
import com.unity3d.ads.adplayer.Invocation;
import com.unity3d.ads.core.data.model.AdData;
import com.unity3d.ads.core.data.model.AdDataRefreshToken;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.ImpressionConfig;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4232oa0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4839vT;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4286p60;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4530rv;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.U5;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class HandleInvocationsFromAdViewer implements IServiceComponent {
    public static final Companion Companion = new Companion(null);
    public static final String KEY_AD_DATA = "adData";
    public static final String KEY_AD_DATA_REFRESH_TOKEN = "adDataRefreshToken";
    public static final String KEY_AD_STRING = "adString";
    public static final String KEY_AD_TYPE = "type";
    public static final String KEY_AD_UNIT_ID = "adUnitId";
    public static final String KEY_DOWNLOAD_PRIORITY = "priority";
    public static final String KEY_DOWNLOAD_URL = "url";
    public static final String KEY_IMPRESSION_CONFIG = "impressionConfig";
    public static final String KEY_IS_HEADER_BIDDING = "isHeaderBidding";
    public static final String KEY_LOAD_OPTIONS = "loadOptions";
    public static final String KEY_NATIVE_CONTEXT = "nativeContext";
    public static final String KEY_OMID = "openMeasurement";
    public static final String KEY_OMJS_SERVICE = "serviceFilePath";
    public static final String KEY_OMJS_SESSION = "sessionFilePath";
    public static final String KEY_OM_PARTNER = "partnerName";
    public static final String KEY_OM_PARTNER_VERSION = "partnerVersion";
    public static final String KEY_OM_VERSION = "version";
    public static final String KEY_PACKAGE_NAME = "packageName";
    public static final String KEY_PLACEMENT_ID = "placementId";
    public static final String KEY_PRIVACY_UPDATE_CONTENT = "content";
    public static final String KEY_PRIVACY_UPDATE_VERSION = "version";
    public static final String KEY_QUERY_ID = "queryId";
    public static final String KEY_TRACKING_TOKEN = "trackingToken";
    public static final String KEY_VIDEO_LENGTH = "videoLength";

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2", f = "HandleInvocationsFromAdViewer.kt", l = {Input.Keys.NUMPAD_EQUALS}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ InterfaceC2766Sw $onSubscription;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(InterfaceC2766Sw interfaceC2766Sw, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$onSubscription = interfaceC2766Sw;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return new AnonymousClass2(this.$onSubscription, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4530rv interfaceC4530rv, InterfaceC2857Wj interfaceC2857Wj) {
            return ((AnonymousClass2) create(interfaceC4530rv, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i = this.label;
            if (i == 0) {
                AbstractC3375el.b0(obj);
                InterfaceC2766Sw interfaceC2766Sw = this.$onSubscription;
                this.label = 1;
                if (interfaceC2766Sw.invoke(this) == enumC4602sk) {
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

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$3, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$3", f = "HandleInvocationsFromAdViewer.kt", l = {165}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ Map<String, InterfaceC2714Qw> $definition;
        /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$3$1, reason: invalid class name */
        @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$3$1", f = "HandleInvocationsFromAdViewer.kt", l = {165}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends Ea0 implements InterfaceC2766Sw {
            final /* synthetic */ ExposedFunction $exposedFunction;
            final /* synthetic */ Invocation $it;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ExposedFunction exposedFunction, Invocation invocation, InterfaceC2857Wj interfaceC2857Wj) {
                super(1, interfaceC2857Wj);
                this.$exposedFunction = exposedFunction;
                this.$it = invocation;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
            public final InterfaceC2857Wj create(InterfaceC2857Wj interfaceC2857Wj) {
                return new AnonymousClass1(this.$exposedFunction, this.$it, interfaceC2857Wj);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
            public final Object invoke(InterfaceC2857Wj interfaceC2857Wj) {
                return ((AnonymousClass1) create(interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
            public final Object invokeSuspend(Object obj) {
                EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
                int i = this.label;
                if (i == 0) {
                    AbstractC3375el.b0(obj);
                    ExposedFunction exposedFunction = this.$exposedFunction;
                    Object[] parameters = this.$it.getParameters();
                    this.label = 1;
                    obj = exposedFunction.invoke(parameters, this);
                    if (obj == enumC4602sk) {
                        return enumC4602sk;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC3375el.b0(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(Map<String, ? extends InterfaceC2714Qw> map, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$definition = map;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$definition, interfaceC2857Wj);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(Invocation invocation, InterfaceC2857Wj interfaceC2857Wj) {
            return ((AnonymousClass3) create(invocation, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            ExposedFunction exposedFunction;
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i = this.label;
            C5033xf0 c5033xf0 = C5033xf0.f5238a;
            if (i == 0) {
                AbstractC3375el.b0(obj);
                Invocation invocation = (Invocation) this.L$0;
                InterfaceC2714Qw interfaceC2714Qw = this.$definition.get(invocation.getLocation());
                if (interfaceC2714Qw != null && (exposedFunction = (ExposedFunction) interfaceC2714Qw.invoke()) != null) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(exposedFunction, invocation, null);
                    this.label = 1;
                    if (invocation.handle(anonymousClass1, this) == enumC4602sk) {
                        return enumC4602sk;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
            }
            return c5033xf0;
        }
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    public final Object invoke(InterfaceC4286p60 interfaceC4286p60, String str, String str2, String str3, AdObject adObject, InterfaceC2766Sw interfaceC2766Sw, InterfaceC2857Wj interfaceC2857Wj) {
        return AbstractC3375el.Q(new AnonymousClass3(U5.u0(new C4839vT(ExposedFunctionLocation.GET_AD_CONTEXT, new HandleInvocationsFromAdViewer$invoke$definition$1(this, AdData.m54constructorimpl(str), ImpressionConfig.m68constructorimpl(str3), AdDataRefreshToken.m61constructorimpl(str2), adObject)), new C4839vT(ExposedFunctionLocation.GET_CONNECTION_TYPE, new HandleInvocationsFromAdViewer$invoke$definition$2(this)), new C4839vT(ExposedFunctionLocation.GET_DEVICE_VOLUME, new HandleInvocationsFromAdViewer$invoke$definition$3(this)), new C4839vT(ExposedFunctionLocation.GET_DEVICE_MAX_VOLUME, new HandleInvocationsFromAdViewer$invoke$definition$4(this)), new C4839vT(ExposedFunctionLocation.GET_SCREEN_HEIGHT, new HandleInvocationsFromAdViewer$invoke$definition$5(this)), new C4839vT(ExposedFunctionLocation.GET_SCREEN_WIDTH, new HandleInvocationsFromAdViewer$invoke$definition$6(this)), new C4839vT(ExposedFunctionLocation.OPEN_URL, new HandleInvocationsFromAdViewer$invoke$definition$7(this)), new C4839vT(ExposedFunctionLocation.SET_ORIENTATION, new HandleInvocationsFromAdViewer$invoke$definition$8(adObject)), new C4839vT(ExposedFunctionLocation.SEND_OPERATIVE_EVENT, new HandleInvocationsFromAdViewer$invoke$definition$9(this, adObject)), new C4839vT(ExposedFunctionLocation.STORAGE_WRITE, HandleInvocationsFromAdViewer$invoke$definition$10.INSTANCE), new C4839vT(ExposedFunctionLocation.STORAGE_READ, HandleInvocationsFromAdViewer$invoke$definition$11.INSTANCE), new C4839vT(ExposedFunctionLocation.STORAGE_DELETE, HandleInvocationsFromAdViewer$invoke$definition$12.INSTANCE), new C4839vT(ExposedFunctionLocation.STORAGE_CLEAR, HandleInvocationsFromAdViewer$invoke$definition$13.INSTANCE), new C4839vT(ExposedFunctionLocation.STORAGE_GET_KEYS, HandleInvocationsFromAdViewer$invoke$definition$14.INSTANCE), new C4839vT(ExposedFunctionLocation.STORAGE_GET, HandleInvocationsFromAdViewer$invoke$definition$15.INSTANCE), new C4839vT(ExposedFunctionLocation.STORAGE_SET, HandleInvocationsFromAdViewer$invoke$definition$16.INSTANCE), new C4839vT(ExposedFunctionLocation.GET_PRIVACY_FSM, new HandleInvocationsFromAdViewer$invoke$definition$17(this)), new C4839vT(ExposedFunctionLocation.SET_PRIVACY_FSM, new HandleInvocationsFromAdViewer$invoke$definition$18(this)), new C4839vT(ExposedFunctionLocation.GET_PRIVACY, new HandleInvocationsFromAdViewer$invoke$definition$19(this)), new C4839vT(ExposedFunctionLocation.SET_PRIVACY, new HandleInvocationsFromAdViewer$invoke$definition$20(this)), new C4839vT(ExposedFunctionLocation.GET_ALLOWED_PII, new HandleInvocationsFromAdViewer$invoke$definition$21(this)), new C4839vT(ExposedFunctionLocation.SET_ALLOWED_PII, new HandleInvocationsFromAdViewer$invoke$definition$22(this)), new C4839vT(ExposedFunctionLocation.GET_SESSION_TOKEN, new HandleInvocationsFromAdViewer$invoke$definition$23(this)), new C4839vT(ExposedFunctionLocation.MARK_CAMPAIGN_STATE_SHOWN, new HandleInvocationsFromAdViewer$invoke$definition$24(this, adObject)), new C4839vT(ExposedFunctionLocation.REFRESH_AD_DATA, new HandleInvocationsFromAdViewer$invoke$definition$25(this, adObject)), new C4839vT(ExposedFunctionLocation.UPDATE_TRACKING_TOKEN, new HandleInvocationsFromAdViewer$invoke$definition$26(adObject)), new C4839vT(ExposedFunctionLocation.SEND_PRIVACY_UPDATE_REQUEST, new HandleInvocationsFromAdViewer$invoke$definition$27(this)), new C4839vT(ExposedFunctionLocation.SEND_DIAGNOSTIC_EVENT, new HandleInvocationsFromAdViewer$invoke$definition$28(this, adObject)), new C4839vT(ExposedFunctionLocation.INCREMENT_BANNER_IMPRESSION_COUNT, new HandleInvocationsFromAdViewer$invoke$definition$29(this)), new C4839vT(ExposedFunctionLocation.DOWNLOAD, new HandleInvocationsFromAdViewer$invoke$definition$30(this, adObject)), new C4839vT(ExposedFunctionLocation.IS_FILE_CACHED, new HandleInvocationsFromAdViewer$invoke$definition$31(this)), new C4839vT(ExposedFunctionLocation.OM_START_SESSION, new HandleInvocationsFromAdViewer$invoke$definition$32(this, adObject)), new C4839vT(ExposedFunctionLocation.OM_FINISH_SESSION, new HandleInvocationsFromAdViewer$invoke$definition$33(this, adObject)), new C4839vT(ExposedFunctionLocation.OM_IMPRESSION, new HandleInvocationsFromAdViewer$invoke$definition$34(this, adObject)), new C4839vT(ExposedFunctionLocation.OM_GET_DATA, new HandleInvocationsFromAdViewer$invoke$definition$35(this)), new C4839vT(ExposedFunctionLocation.IS_ATTRIBUTION_AVAILABLE, new HandleInvocationsFromAdViewer$invoke$definition$36(this)), new C4839vT(ExposedFunctionLocation.ATTRIBUTION_REGISTER_VIEW, new HandleInvocationsFromAdViewer$invoke$definition$37(this, adObject)), new C4839vT(ExposedFunctionLocation.ATTRIBUTION_REGISTER_CLICK, new HandleInvocationsFromAdViewer$invoke$definition$38(this, adObject)), new C4839vT(ExposedFunctionLocation.LOAD_SCAR_AD, new HandleInvocationsFromAdViewer$invoke$definition$39(this, adObject)), new C4839vT(ExposedFunctionLocation.SHOW_SCAR_AD, HandleInvocationsFromAdViewer$invoke$definition$40.INSTANCE), new C4839vT(ExposedFunctionLocation.HEADER_BIDDING_TOKEN_INCREMENT_WINS, new HandleInvocationsFromAdViewer$invoke$definition$41(this)), new C4839vT(ExposedFunctionLocation.HEADER_BIDDING_TOKEN_INCREMENT_STARTS, new HandleInvocationsFromAdViewer$invoke$definition$42(this)), new C4839vT(ExposedFunctionLocation.HEADER_BIDDING_TOKEN_RESET, new HandleInvocationsFromAdViewer$invoke$definition$43(this))), null), new C4232oa0(interfaceC4286p60, new AnonymousClass2(interfaceC2766Sw, null)));
    }
}
