package com.mbridge.msdk.splash.manager;

import android.content.Context;
import android.view.View;
import com.mbridge.msdk.dycreator.binding.response.SplashResData;
import com.mbridge.msdk.dycreator.binding.response.base.BaseRespData;
import com.mbridge.msdk.dycreator.listener.DyCountDownListener;
import com.mbridge.msdk.dycreator.listener.action.EAction;
import com.mbridge.msdk.dycreator.wrapper.DyAdType;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.dycreator.wrapper.DynamicViewBackListener;
import com.mbridge.msdk.dycreator.wrapper.DynamicViewCreator;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.splash.view.MBSplashView;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
class c extends com.mbridge.msdk.splash.manager.a {

    public class a implements DyCountDownListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ DyOption f1834a;

        public a(DyOption dyOption) {
            this.f1834a = dyOption;
        }

        @Override // com.mbridge.msdk.dycreator.listener.DyCountDownListener
        public void getCountDownValue(int i) {
            this.f1834a.setDyCountDownListener(i);
        }
    }

    public class b implements DynamicViewBackListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.splash.inter.a f1835a;
        final /* synthetic */ MBSplashView b;
        final /* synthetic */ com.mbridge.msdk.splash.common.c c;
        final /* synthetic */ DyOption d;

        public b(com.mbridge.msdk.splash.inter.a aVar, MBSplashView mBSplashView, com.mbridge.msdk.splash.common.c cVar, DyOption dyOption) {
            this.f1835a = aVar;
            this.b = mBSplashView;
            this.c = cVar;
            this.d = dyOption;
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DynamicViewBackListener
        public void viewClicked(BaseRespData baseRespData) {
            com.mbridge.msdk.splash.signal.b splashSignalCommunicationImpl;
            MBSplashView mBSplashView = this.b;
            com.mbridge.msdk.splash.middle.a aVarA = (mBSplashView == null || (splashSignalCommunicationImpl = mBSplashView.getSplashSignalCommunicationImpl()) == null) ? null : splashSignalCommunicationImpl.a();
            DyOption dyOption = this.d;
            CampaignEx campaignEx = dyOption != null ? dyOption.getCampaignEx() : null;
            EAction eAction = baseRespData instanceof SplashResData ? ((SplashResData) baseRespData).geteAction() : null;
            if (eAction != null) {
                int i = C0242c.f1836a[eAction.ordinal()];
                if (i == 1) {
                    if (aVarA != null) {
                        if (baseRespData == null) {
                            aVarA.a(campaignEx);
                            return;
                        } else {
                            if (baseRespData instanceof SplashResData) {
                                SplashResData splashResData = (SplashResData) baseRespData;
                                if (splashResData.getBaseViewData() != null) {
                                    c.this.a(splashResData.getBaseViewData(), aVarA, campaignEx);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                if (i == 2) {
                    if (aVarA != null) {
                        aVarA.close();
                    }
                } else if (i == 3) {
                    if (this.d != null) {
                        com.mbridge.msdk.click.c.f(com.mbridge.msdk.foundation.controller.c.n().d(), this.d.getAdChoiceLink());
                    }
                } else if (i == 4 && baseRespData != null && (baseRespData instanceof SplashResData)) {
                    SplashResData splashResData2 = (SplashResData) baseRespData;
                    if (splashResData2.getBaseViewData() != null) {
                        c.this.a(aVarA, campaignEx, splashResData2.getBaseViewData());
                    }
                }
            }
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DynamicViewBackListener
        public void viewCreateFail(com.mbridge.msdk.dycreator.error.a aVar) {
            MBSplashView mBSplashView = this.b;
            if (mBSplashView != null) {
                Context context = mBSplashView.getContext();
                if (context == null) {
                    context = com.mbridge.msdk.foundation.controller.c.n().d();
                }
                c.this.a(context, this.b, this.c, this.f1835a);
            }
        }

        @Override // com.mbridge.msdk.dycreator.wrapper.DynamicViewBackListener
        public void viewCreatedSuccess(View view) {
            com.mbridge.msdk.splash.inter.a aVar = this.f1835a;
            if (aVar != null) {
                if (view != null) {
                    aVar.a(view);
                } else {
                    aVar.onError("View render error.");
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.manager.c$c, reason: collision with other inner class name */
    public static /* synthetic */ class C0242c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1836a;

        static {
            int[] iArr = new int[EAction.values().length];
            f1836a = iArr;
            try {
                iArr[EAction.DOWNLOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1836a[EAction.CLOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1836a[EAction.NOTICE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1836a[EAction.FEEDBACK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final c f1837a = new c(null);
    }

    public /* synthetic */ c(a aVar) {
        this();
    }

    public static c a() {
        return d.f1837a;
    }

    private c() {
    }

    @Override // com.mbridge.msdk.splash.manager.a
    public void a(List<String> list, MBSplashView mBSplashView, com.mbridge.msdk.splash.common.c cVar, com.mbridge.msdk.splash.inter.a aVar) {
        h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
        DyOption dyOptionBuild = new DyOption.Builder().campaignEx(cVar.b()).fileDirs(list).dyAdType(DyAdType.SPLASH).canSkip(cVar.m()).isScreenClick(cVar.f() == 1).isClickButtonVisible(cVar.c() == 0).isShakeVisible(cVar.i() == 1).isApkInfoVisible(cVar.a() == 0).isLogoVisible(cVar.e() == 1).shakeStrenght(cVar.j()).shakeTime(cVar.k()).orientation(cVar.g()).countDownTime(cVar.d()).adChoiceLink(t0.a(cVar.b())).build();
        mBSplashView.setDyCountDownListener(new a(dyOptionBuild));
        DynamicViewCreator.getInstance().createDynamicView(dyOptionBuild, new b(aVar, mBSplashView, cVar, dyOptionBuild));
    }
}
