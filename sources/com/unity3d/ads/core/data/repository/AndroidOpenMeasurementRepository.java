package com.unity3d.ads.core.data.repository;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.manager.OmidManager;
import com.unity3d.ads.core.data.model.OMData;
import com.unity3d.ads.core.data.model.OMResult;
import com.unity3d.ads.core.data.model.OmidOptions;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3899kk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4995x90;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2838Vq;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2942Zq;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3026an0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4187o1;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4523ro0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4839vT;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4907w90;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC3346eT;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC5042xk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Fn0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4309pQ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.L2;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.NT;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.O2;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.P2;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RC;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.U5;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.V2;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidOpenMeasurementRepository implements OpenMeasurementRepository {
    private final InterfaceC4309pQ _isOMActive;
    private final InterfaceC4309pQ activeSessions;
    private final InterfaceC4309pQ finishedSessions;
    private final AbstractC3899kk mainDispatcher;
    private final OmidManager omidManager;
    private final NT partner;

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$activateOM$2, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$activateOM$2", f = "AndroidOpenMeasurementRepository.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ Context $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Context context, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$context = context;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return AndroidOpenMeasurementRepository.this.new AnonymousClass2(this.$context, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((AnonymousClass2) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
            if (AndroidOpenMeasurementRepository.this.isOMActive()) {
                return new OMResult.Failure("om_already_active", null, 2, null);
            }
            try {
                AndroidOpenMeasurementRepository.this.omidManager.activate(this.$context);
                AndroidOpenMeasurementRepository androidOpenMeasurementRepository = AndroidOpenMeasurementRepository.this;
                androidOpenMeasurementRepository.setOMActive(androidOpenMeasurementRepository.omidManager.isActive());
                return AndroidOpenMeasurementRepository.this.isOMActive() ? OMResult.Success.INSTANCE : new OMResult.Failure("om_activate_failure_time", null, 2, null);
            } catch (Throwable th) {
                return new OMResult.Failure("uncaught_exception", ExceptionExtensionsKt.getShortenedStackTrace$default(th, 0, 1, null));
            }
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$finishSession$2, reason: invalid class name and case insensitive filesystem */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$finishSession$2", f = "AndroidOpenMeasurementRepository.kt", l = {}, m = "invokeSuspend")
    public static final class C21992 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ ByteString $opportunityId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21992(ByteString byteString, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$opportunityId = byteString;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return AndroidOpenMeasurementRepository.this.new C21992(this.$opportunityId, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((C21992) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
            if (!AndroidOpenMeasurementRepository.this.isOMActive()) {
                return new OMResult.Failure("om_not_active", null, 2, null);
            }
            L2 session = AndroidOpenMeasurementRepository.this.getSession(this.$opportunityId);
            if (session == null) {
                return new OMResult.Failure("om_session_not_found", null, 2, null);
            }
            C3026an0 c3026an0 = (C3026an0) session;
            if (!c3026an0.g) {
                c3026an0.d.clear();
                if (!c3026an0.g) {
                    c3026an0.c.clear();
                }
                c3026an0.g = true;
                c3026an0.e.o();
                Fn0 fn0 = Fn0.c;
                boolean z = fn0.b.size() > 0;
                fn0.f3088a.remove(c3026an0);
                ArrayList arrayList = fn0.b;
                arrayList.remove(c3026an0);
                if (z && arrayList.size() <= 0) {
                    C4523ro0.e().h();
                }
                c3026an0.e.m();
                c3026an0.e = null;
            }
            AndroidOpenMeasurementRepository.this.sessionFinished(this.$opportunityId);
            return OMResult.Success.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$impressionOccurred$2, reason: invalid class name and case insensitive filesystem */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$impressionOccurred$2", f = "AndroidOpenMeasurementRepository.kt", l = {}, m = "invokeSuspend")
    public static final class C22002 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ ByteString $opportunityId;
        final /* synthetic */ boolean $signalLoaded;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22002(ByteString byteString, boolean z, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$opportunityId = byteString;
            this.$signalLoaded = z;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return AndroidOpenMeasurementRepository.this.new C22002(this.$opportunityId, this.$signalLoaded, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((C22002) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
            L2 session = AndroidOpenMeasurementRepository.this.getSession(this.$opportunityId);
            if (session == null) {
                return new OMResult.Failure("om_session_not_found", null, 2, null);
            }
            C4187o1 c4187o1CreateAdEvents = AndroidOpenMeasurementRepository.this.omidManager.createAdEvents(session);
            boolean z = this.$signalLoaded;
            EnumC3346eT enumC3346eT = EnumC3346eT.NATIVE;
            if (z) {
                C3026an0 c3026an0 = c4187o1CreateAdEvents.f4771a;
                if (!c3026an0.f) {
                    throw new IllegalStateException("AdSession is not started");
                }
                if (c3026an0.g) {
                    throw new IllegalStateException("AdSession is finished");
                }
                if (enumC3346eT != c3026an0.b.f3490a) {
                    throw new IllegalStateException("Impression event is not expected from the Native AdSession");
                }
                if (c3026an0.j) {
                    throw new IllegalStateException("Loaded event can only be sent once");
                }
                V2 v2 = c3026an0.e;
                switch (v2.f3855a) {
                    case 0:
                        v2.j();
                        break;
                    default:
                        v2.j();
                        break;
                }
                c3026an0.j = true;
            }
            C3026an0 c3026an1 = c4187o1CreateAdEvents.f4771a;
            boolean z2 = c3026an1.g;
            if (z2) {
                throw new IllegalStateException("AdSession is finished");
            }
            if (enumC3346eT != c3026an1.b.f3490a) {
                throw new IllegalStateException("Impression event is not expected from the Native AdSession");
            }
            if (!c3026an1.f || z2) {
                try {
                    c3026an1.b();
                } catch (Exception unused) {
                }
            }
            if (c3026an1.f && !c3026an1.g) {
                if (c3026an1.i) {
                    throw new IllegalStateException("Impression event can only be sent once");
                }
                c3026an1.e.p();
                c3026an1.i = true;
            }
            return OMResult.Success.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$startSession$2, reason: invalid class name and case insensitive filesystem */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$startSession$2", f = "AndroidOpenMeasurementRepository.kt", l = {}, m = "invokeSuspend")
    public static final class C22012 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ ByteString $opportunityId;
        final /* synthetic */ OmidOptions $options;
        final /* synthetic */ WebView $webView;
        int label;

        /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidOpenMeasurementRepository$startSession$2$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC5042xk.values().length];
                try {
                    iArr[1] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[3] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22012(ByteString byteString, OmidOptions omidOptions, WebView webView, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$opportunityId = byteString;
            this.$options = omidOptions;
            this.$webView = webView;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return AndroidOpenMeasurementRepository.this.new C22012(this.$opportunityId, this.$options, this.$webView, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((C22012) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            P2 p2CreateHtmlAdSessionContext;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
            try {
                if (!AndroidOpenMeasurementRepository.this.isOMActive()) {
                    return new OMResult.Failure("om_not_active", null, 2, null);
                }
                if (((Map) ((C4907w90) AndroidOpenMeasurementRepository.this.activeSessions).getValue()).containsKey(this.$opportunityId.toStringUtf8())) {
                    return new OMResult.Failure("om_session_already_exists", null, 2, null);
                }
                EnumC5042xk creativeType = this.$options.getCreativeType();
                if (creativeType == null) {
                    return new OMResult.Failure("om_creative_type_null", null, 2, null);
                }
                OmidManager omidManager = AndroidOpenMeasurementRepository.this.omidManager;
                RC impressionType = this.$options.getImpressionType();
                if (impressionType == null) {
                    impressionType = RC.DEFINED_BY_JAVASCRIPT;
                }
                RC rc = impressionType;
                EnumC3346eT impressionOwner = this.$options.getImpressionOwner();
                EnumC3346eT enumC3346eT = EnumC3346eT.JAVASCRIPT;
                EnumC3346eT enumC3346eT2 = impressionOwner == null ? enumC3346eT : impressionOwner;
                EnumC3346eT videoEventsOwner = this.$options.getVideoEventsOwner();
                O2 o2CreateAdSessionConfiguration = omidManager.createAdSessionConfiguration(creativeType, rc, enumC3346eT2, videoEventsOwner == null ? enumC3346eT : videoEventsOwner, this.$options.getIsolateVerificationScripts());
                int iOrdinal = creativeType.ordinal();
                if (iOrdinal == 1) {
                    p2CreateHtmlAdSessionContext = AndroidOpenMeasurementRepository.this.omidManager.createHtmlAdSessionContext(AndroidOpenMeasurementRepository.this.partner, this.$webView, null, this.$options.getCustomReferenceData());
                } else {
                    if (iOrdinal != 3) {
                        return new OMResult.Failure("om_creative_type_invalid", null, 2, null);
                    }
                    p2CreateHtmlAdSessionContext = AndroidOpenMeasurementRepository.this.omidManager.createJavaScriptAdSessionContext(AndroidOpenMeasurementRepository.this.partner, this.$webView, null, this.$options.getCustomReferenceData());
                }
                L2 l2CreateAdSession = AndroidOpenMeasurementRepository.this.omidManager.createAdSession(o2CreateAdSessionConfiguration, p2CreateHtmlAdSessionContext);
                l2CreateAdSession.a(this.$webView);
                l2CreateAdSession.b();
                AndroidOpenMeasurementRepository.this.addSession(this.$opportunityId, l2CreateAdSession);
                return OMResult.Success.INSTANCE;
            } catch (Throwable th) {
                return new OMResult.Failure("uncaught_exception", ExceptionExtensionsKt.getShortenedStackTrace$default(th, 0, 1, null));
            }
        }
    }

    public AndroidOpenMeasurementRepository(AbstractC3899kk abstractC3899kk, OmidManager omidManager) {
        AbstractC2995aW.q(abstractC3899kk, "mainDispatcher");
        AbstractC2995aW.q(omidManager, "omidManager");
        this.mainDispatcher = abstractC3899kk;
        this.omidManager = omidManager;
        if (TextUtils.isEmpty(UnityAdsConstants.OpenMeasurement.OM_PARTNER_NAME)) {
            throw new IllegalArgumentException("Name is null or empty");
        }
        if (TextUtils.isEmpty("4.13.1")) {
            throw new IllegalArgumentException("Version is null or empty");
        }
        this.partner = new NT();
        this.activeSessions = AbstractC4995x90.a(C2838Vq.f3896a);
        this.finishedSessions = AbstractC4995x90.a(C2942Zq.f4095a);
        this._isOMActive = AbstractC4995x90.a(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addSession(ByteString byteString, L2 l2) {
        C4907w90 c4907w90;
        Object value;
        InterfaceC4309pQ interfaceC4309pQ = this.activeSessions;
        do {
            c4907w90 = (C4907w90) interfaceC4309pQ;
            value = c4907w90.getValue();
        } while (!c4907w90.h(value, U5.w0((Map) value, new C4839vT(byteString.toStringUtf8(), l2))));
    }

    private final OMData buildOmData() {
        return new OMData(this.omidManager.getVersion(), UnityAdsConstants.OpenMeasurement.OM_PARTNER_NAME, "1");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final L2 getSession(ByteString byteString) {
        return (L2) ((Map) ((C4907w90) this.activeSessions).getValue()).get(byteString.toStringUtf8());
    }

    private final void removeSession(ByteString byteString) {
        C4907w90 c4907w90;
        Object value;
        Map linkedHashMap;
        InterfaceC4309pQ interfaceC4309pQ = this.activeSessions;
        do {
            c4907w90 = (C4907w90) interfaceC4309pQ;
            value = c4907w90.getValue();
            Map map = (Map) value;
            Object stringUtf8 = byteString.toStringUtf8();
            AbstractC2995aW.p(stringUtf8, "opportunityId.toStringUtf8()");
            AbstractC2995aW.q(map, "<this>");
            linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.remove(stringUtf8);
            int size = linkedHashMap.size();
            if (size == 0) {
                linkedHashMap = C2838Vq.f3896a;
            } else if (size == 1) {
                linkedHashMap = AbstractC3375el.c0(linkedHashMap);
            }
        } while (!c4907w90.h(value, linkedHashMap));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sessionFinished(ByteString byteString) {
        C4907w90 c4907w90;
        Object value;
        LinkedHashSet linkedHashSet;
        InterfaceC4309pQ interfaceC4309pQ = this.finishedSessions;
        do {
            c4907w90 = (C4907w90) interfaceC4309pQ;
            value = c4907w90.getValue();
            Set set = (Set) value;
            String stringUtf8 = byteString.toStringUtf8();
            AbstractC2995aW.p(stringUtf8, "opportunityId.toStringUtf8()");
            AbstractC2995aW.q(set, "<this>");
            linkedHashSet = new LinkedHashSet(AbstractC3375el.N(set.size() + 1));
            linkedHashSet.addAll(set);
            linkedHashSet.add(stringUtf8);
        } while (!c4907w90.h(value, linkedHashSet));
        removeSession(byteString);
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public Object activateOM(Context context, InterfaceC2857Wj interfaceC2857Wj) {
        return WD.X(new AnonymousClass2(context, null), this.mainDispatcher, interfaceC2857Wj);
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public Object finishSession(ByteString byteString, InterfaceC2857Wj interfaceC2857Wj) {
        return WD.X(new C21992(byteString, null), this.mainDispatcher, interfaceC2857Wj);
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public OMData getOmData() {
        return buildOmData();
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public boolean hasSessionFinished(ByteString byteString) {
        AbstractC2995aW.q(byteString, "opportunityId");
        return ((Set) ((C4907w90) this.finishedSessions).getValue()).contains(byteString.toStringUtf8());
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public Object impressionOccurred(ByteString byteString, boolean z, InterfaceC2857Wj interfaceC2857Wj) {
        return WD.X(new C22002(byteString, z, null), this.mainDispatcher, interfaceC2857Wj);
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public boolean isOMActive() {
        return ((Boolean) ((C4907w90) this._isOMActive).getValue()).booleanValue();
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public void setOMActive(boolean z) {
        C4907w90 c4907w90;
        Object value;
        InterfaceC4309pQ interfaceC4309pQ = this._isOMActive;
        do {
            c4907w90 = (C4907w90) interfaceC4309pQ;
            value = c4907w90.getValue();
            ((Boolean) value).getClass();
        } while (!c4907w90.h(value, Boolean.valueOf(z)));
    }

    @Override // com.unity3d.ads.core.data.repository.OpenMeasurementRepository
    public Object startSession(ByteString byteString, WebView webView, OmidOptions omidOptions, InterfaceC2857Wj interfaceC2857Wj) {
        return WD.X(new C22012(byteString, omidOptions, webView, null), this.mainDispatcher, interfaceC2857Wj);
    }
}
