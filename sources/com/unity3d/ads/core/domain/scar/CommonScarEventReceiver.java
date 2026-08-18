package com.unity3d.ads.core.domain.scar;

import com.badlogic.gdx.Input;
import com.unity3d.scar.adapter.common.GMAEvent;
import com.unity3d.services.banners.bridge.BannerBridge;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2853Wf;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4637t60;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BX;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4549s60;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4221oQ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4286p60;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;

/* JADX INFO: loaded from: classes4.dex */
public final class CommonScarEventReceiver implements IEventSender {
    private final InterfaceC4221oQ _gmaEventFlow;
    private final InterfaceC4221oQ _versionFlow;
    private final InterfaceC4286p60 gmaEventFlow;
    private final InterfaceC4514rk scope;
    private final InterfaceC4286p60 versionFlow;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.scar.CommonScarEventReceiver$sendEvent$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.scar.CommonScarEventReceiver$sendEvent$1", f = "CommonScarEventReceiver.kt", l = {35, 41, 52, 66, Input.Keys.BACKSLASH}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ Enum<?> $eventId;
        final /* synthetic */ Object[] $params;
        int label;
        final /* synthetic */ CommonScarEventReceiver this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Enum<?> r1, Object[] objArr, CommonScarEventReceiver commonScarEventReceiver, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$eventId = r1;
            this.$params = objArr;
            this.this$0 = commonScarEventReceiver;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return new AnonymousClass1(this.$eventId, this.$params, this.this$0, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((AnonymousClass1) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        /* JADX WARN: Code duplicated, block: B:40:0x00f9  */
        /* JADX WARN: Code duplicated, block: B:42:0x0128 A[RETURN] */
        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            InterfaceC4221oQ interfaceC4221oQ;
            GmaEventData gmaEventData;
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i = this.label;
            if (i != 0) {
                if (i != 1 && i != 2 && i != 3) {
                    if (i == 4) {
                        AbstractC3375el.b0(obj);
                        if (this.$eventId instanceof BannerBridge.BannerEvent) {
                            interfaceC4221oQ = this.this$0._gmaEventFlow;
                            GMAEvent gMAEvent = GMAEvent.BANNER;
                            BannerBridge.BannerEvent bannerEvent = (BannerBridge.BannerEvent) this.$eventId;
                            Object obj2 = this.$params[0];
                            AbstractC2995aW.o(obj2, "null cannot be cast to non-null type kotlin.String");
                            gmaEventData = new GmaEventData(gMAEvent, bannerEvent, (String) obj2, null, null, null, null, 120, null);
                            this.label = 5;
                            if (interfaceC4221oQ.emit(gmaEventData, this) == enumC4602sk) {
                                return enumC4602sk;
                            }
                        }
                    } else if (i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                AbstractC3375el.b0(obj);
            } else {
                AbstractC3375el.b0(obj);
                Enum<?> r2 = this.$eventId;
                if (r2 == GMAEvent.VERSION) {
                    Object[] objArr = this.$params;
                    CommonScarEventReceiver commonScarEventReceiver = this.this$0;
                    String str = (String) objArr[0];
                    InterfaceC4221oQ interfaceC4221oQ2 = commonScarEventReceiver._versionFlow;
                    if (!(!AbstractC2995aW.i(str, "0.0.0"))) {
                        str = null;
                    }
                    this.label = 1;
                    if (interfaceC4221oQ2.emit(str, this) == enumC4602sk) {
                        return enumC4602sk;
                    }
                } else {
                    GMAEvent gMAEvent2 = GMAEvent.AD_LOADED;
                    if (r2 == gMAEvent2) {
                        Object[] objArr2 = this.$params;
                        InterfaceC4221oQ interfaceC4221oQ3 = this.this$0._gmaEventFlow;
                        Object obj3 = objArr2[0];
                        AbstractC2995aW.o(obj3, "null cannot be cast to non-null type kotlin.String");
                        GmaEventData gmaEventData2 = new GmaEventData(gMAEvent2, null, null, (String) obj3, null, null, null, EnumC4719u30.PROTOBUF_SERIALIZATION_ERROR_VALUE, null);
                        this.label = 2;
                        if (interfaceC4221oQ3.emit(gmaEventData2, this) == enumC4602sk) {
                            return enumC4602sk;
                        }
                    } else {
                        GMAEvent gMAEvent3 = GMAEvent.LOAD_ERROR;
                        if (r2 == gMAEvent3) {
                            Object[] objArr3 = this.$params;
                            InterfaceC4221oQ interfaceC4221oQ4 = this.this$0._gmaEventFlow;
                            Object obj4 = objArr3[0];
                            AbstractC2995aW.o(obj4, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj4;
                            Object obj5 = objArr3[1];
                            AbstractC2995aW.o(obj5, "null cannot be cast to non-null type kotlin.String");
                            Object obj6 = objArr3[2];
                            AbstractC2995aW.o(obj6, "null cannot be cast to non-null type kotlin.String");
                            Object obj7 = objArr3[3];
                            AbstractC2995aW.o(obj7, "null cannot be cast to non-null type kotlin.Int");
                            GmaEventData gmaEventData3 = new GmaEventData(gMAEvent3, null, null, str2, (String) obj5, (String) obj6, (Integer) obj7, 6, null);
                            this.label = 3;
                            if (interfaceC4221oQ4.emit(gmaEventData3, this) == enumC4602sk) {
                                return enumC4602sk;
                            }
                        } else {
                            if (r2 instanceof GMAEvent) {
                                InterfaceC4221oQ interfaceC4221oQ5 = this.this$0._gmaEventFlow;
                                GmaEventData gmaEventData4 = new GmaEventData((GMAEvent) this.$eventId, null, null, null, null, null, null, EnumC4719u30.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, null);
                                this.label = 4;
                                if (interfaceC4221oQ5.emit(gmaEventData4, this) == enumC4602sk) {
                                    return enumC4602sk;
                                }
                            }
                            if (this.$eventId instanceof BannerBridge.BannerEvent) {
                                interfaceC4221oQ = this.this$0._gmaEventFlow;
                                GMAEvent gMAEvent4 = GMAEvent.BANNER;
                                BannerBridge.BannerEvent bannerEvent2 = (BannerBridge.BannerEvent) this.$eventId;
                                Object obj8 = this.$params[0];
                                AbstractC2995aW.o(obj8, "null cannot be cast to non-null type kotlin.String");
                                gmaEventData = new GmaEventData(gMAEvent4, bannerEvent2, (String) obj8, null, null, null, null, 120, null);
                                this.label = 5;
                                if (interfaceC4221oQ.emit(gmaEventData, this) == enumC4602sk) {
                                    return enumC4602sk;
                                }
                            }
                        }
                    }
                }
            }
            return C5033xf0.f5238a;
        }
    }

    public CommonScarEventReceiver(InterfaceC4514rk interfaceC4514rk) {
        AbstractC2995aW.q(interfaceC4514rk, "scope");
        this.scope = interfaceC4514rk;
        C4549s60 c4549s60B = AbstractC4637t60.b(0, 7);
        this._versionFlow = c4549s60B;
        this.versionFlow = new BX(c4549s60B);
        C4549s60 c4549s60B2 = AbstractC4637t60.b(0, 7);
        this._gmaEventFlow = c4549s60B2;
        this.gmaEventFlow = new BX(c4549s60B2);
    }

    @Override // com.unity3d.services.core.webview.bridge.IEventSender
    public boolean canSend() {
        return true;
    }

    public final InterfaceC4286p60 getGmaEventFlow() {
        return this.gmaEventFlow;
    }

    public final InterfaceC4286p60 getVersionFlow() {
        return this.versionFlow;
    }

    @Override // com.unity3d.services.core.webview.bridge.IEventSender
    public boolean sendEvent(Enum<?> r7, Enum<?> r8, Object... objArr) {
        AbstractC2995aW.q(r7, "eventCategory");
        AbstractC2995aW.q(r8, "eventId");
        AbstractC2995aW.q(objArr, "params");
        if (!AbstractC2853Wf.d0(AbstractC2995aW.q0(WebViewEventCategory.INIT_GMA, WebViewEventCategory.GMA, WebViewEventCategory.BANNER), r7)) {
            return false;
        }
        WD.D(this.scope, null, 0, new AnonymousClass1(r8, objArr, this, null), 3);
        return true;
    }
}
