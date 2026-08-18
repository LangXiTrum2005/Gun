package com.mbridge.msdk.video.dynview.moffer;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.g0;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.video.dynview.listener.g;
import com.mbridge.msdk.video.module.MBridgeNativeEndCardView;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class a {
    private static volatile a c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, SoftReference<MOfferModel>> f2149a = new ConcurrentHashMap();
    private int b = 500;

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MOfferModel f2151a;

        public b(MOfferModel mOfferModel) {
            this.f2151a = mOfferModel;
        }

        @Override // java.lang.Runnable
        public void run() {
            MOfferModel mOfferModel = this.f2151a;
            if (mOfferModel != null) {
                mOfferModel.checkViewVisiableState();
            }
        }
    }

    public class c implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MOfferModel f2152a;
        final /* synthetic */ ViewGroup b;

        public c(MOfferModel mOfferModel, ViewGroup viewGroup) {
            this.f2152a = mOfferModel;
            this.b = viewGroup;
        }

        @Override // com.mbridge.msdk.video.dynview.listener.g
        public void a(int i, String str) {
        }

        @Override // com.mbridge.msdk.video.dynview.listener.g
        public void a(ViewGroup viewGroup, CampaignUnit campaignUnit) {
            if (viewGroup == null || campaignUnit == null) {
                return;
            }
            try {
                a.this.a(this.f2152a, this.b, viewGroup, campaignUnit);
            } catch (Exception e) {
                o0.b("MOfferEnergize", e.getMessage());
            }
        }
    }

    private a() {
    }

    public boolean b(String str) {
        if (this.f2149a == null || TextUtils.isEmpty(str)) {
            return false;
        }
        return this.f2149a.containsKey(str);
    }

    public static a a() {
        a aVar;
        if (c != null) {
            return c;
        }
        synchronized (a.class) {
            try {
                if (c == null) {
                    c = new a();
                }
                aVar = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.video.dynview.moffer.a$a, reason: collision with other inner class name */
    public class C0257a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f2150a;
        final /* synthetic */ MOfferModel b;

        public C0257a(ViewGroup viewGroup, MOfferModel mOfferModel) {
            this.f2150a = viewGroup;
            this.b = mOfferModel;
        }

        @Override // com.mbridge.msdk.video.dynview.listener.g
        public void a(ViewGroup viewGroup, CampaignUnit campaignUnit) {
            ViewGroup viewGroup2;
            if (viewGroup == null || (viewGroup2 = this.f2150a) == null) {
                return;
            }
            try {
                a.this.a(this.b, viewGroup2, viewGroup, campaignUnit);
            } catch (Exception e) {
                o0.b("MOfferEnergize", e.getMessage());
            }
        }

        @Override // com.mbridge.msdk.video.dynview.listener.g
        public void a(int i, String str) {
            o0.b("MOfferEnergize", str);
        }
    }

    public void b() {
        MOfferModel mOfferModel;
        try {
            Map<String, SoftReference<MOfferModel>> map = this.f2149a;
            if (map != null) {
                for (SoftReference<MOfferModel> softReference : map.values()) {
                    if (softReference != null && (mOfferModel = softReference.get()) != null) {
                        mOfferModel.mofDestroy();
                    }
                }
                this.f2149a.clear();
            }
        } catch (Exception e) {
            o0.b("MOfferEnergize", e.getMessage());
        }
    }

    public void a(ViewGroup viewGroup, String str, com.mbridge.msdk.video.module.listener.a aVar) {
        if (viewGroup == null || aVar == null || this.f2149a == null || TextUtils.isEmpty(str) || !this.f2149a.containsKey(str)) {
            return;
        }
        SoftReference<MOfferModel> softReference = this.f2149a.get(str);
        MOfferModel mOfferModel = (softReference == null || softReference.get() == null) ? null : softReference.get();
        if (mOfferModel == null) {
            return;
        }
        a(mOfferModel, viewGroup, aVar);
    }

    private void a(MOfferModel mOfferModel, ViewGroup viewGroup, com.mbridge.msdk.video.module.listener.a aVar) {
        if (mOfferModel == null) {
            return;
        }
        mOfferModel.setMoreOfferListener(new C0257a(viewGroup, mOfferModel), aVar);
        mOfferModel.showView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MOfferModel mOfferModel, ViewGroup viewGroup, ViewGroup viewGroup2, CampaignUnit campaignUnit) {
        if (mOfferModel == null || viewGroup == null || viewGroup2 == null || campaignUnit == null) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) viewGroup2.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        }
        layoutParams.addRule(12, -1);
        int iA = t0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 5.0f);
        layoutParams.setMargins(iA, iA, iA, iA);
        a(viewGroup2);
        viewGroup2.setLayoutParams(layoutParams);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
        if (viewGroup3 != null) {
            viewGroup3.removeAllViews();
        }
        if (mOfferModel.getECParentTemplateCode() == 1302) {
            a(mOfferModel, viewGroup, viewGroup2);
        } else {
            a(viewGroup, viewGroup2);
        }
        new com.mbridge.msdk.video.dynview.ui.b().a(viewGroup2, 0, t0.g(com.mbridge.msdk.foundation.controller.c.n().d()), 0, AbstractC3950lJ.j(100.0f), 0L);
        if (viewGroup instanceof MBridgeNativeEndCardView) {
            ((MBridgeNativeEndCardView) viewGroup).setMoreOfferCampaignUnit(campaignUnit);
        }
        viewGroup.postDelayed(new b(mOfferModel), this.b + 500);
    }

    private void a(ViewGroup viewGroup, ViewGroup viewGroup2) {
        RelativeLayout relativeLayout;
        try {
            if (viewGroup instanceof MBridgeNativeEndCardView) {
                if (((MBridgeNativeEndCardView) viewGroup).isDyXmlSuccess()) {
                    relativeLayout = (RelativeLayout) viewGroup.findViewById(-1642631508);
                } else {
                    relativeLayout = (RelativeLayout) viewGroup.findViewById(a("mbridge_native_ec_layout"));
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(relativeLayout);
                new com.mbridge.msdk.video.dynview.ui.b().a(arrayList, 0, t0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 100.0f), this.b);
            }
            RelativeLayout relativeLayout2 = (RelativeLayout) viewGroup.findViewById(a("mbridge_reward_moreoffer_layout"));
            if (relativeLayout2 == null) {
                relativeLayout2 = (RelativeLayout) viewGroup.findViewById(-82036151);
            }
            if (relativeLayout2 != null) {
                if (viewGroup.isShown()) {
                    relativeLayout2.setVisibility(0);
                    relativeLayout2.addView(viewGroup2);
                    return;
                }
                return;
            }
            viewGroup.addView(viewGroup2);
        } catch (Exception e) {
            o0.b("MOfferEnergize", e.getMessage());
        }
    }

    private void a(MOfferModel mOfferModel, ViewGroup viewGroup, ViewGroup viewGroup2) {
        ImageView imageView;
        RelativeLayout relativeLayout;
        ImageView imageView2;
        TextView textView;
        if (mOfferModel != null) {
            try {
                if (mOfferModel.getmMainOfferCampaignEx() != null && mOfferModel.getmMainOfferCampaignEx().getRewardTemplateMode() != null) {
                    int iB = mOfferModel.getmMainOfferCampaignEx().getRewardTemplateMode().b();
                    if (iB == 0) {
                        iB = k0.F(com.mbridge.msdk.foundation.controller.c.n().d());
                    }
                    if (iB != 1 && (viewGroup instanceof MBridgeNativeEndCardView)) {
                        if (((MBridgeNativeEndCardView) viewGroup).isDyXmlSuccess()) {
                            imageView = (ImageView) viewGroup.findViewById(-1803557032);
                        } else {
                            imageView = (ImageView) viewGroup.findViewById(a("mbridge_iv_adbanner"));
                        }
                        int iH = t0.h(com.mbridge.msdk.foundation.controller.c.n().d()) - t0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 220.0f);
                        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
                        layoutParams.height = iH;
                        layoutParams.width = (iH * 16) / 9;
                        imageView.setLayoutParams(layoutParams);
                    }
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                    return;
                }
                return;
            }
        }
        if (viewGroup instanceof MBridgeNativeEndCardView) {
            if (((MBridgeNativeEndCardView) viewGroup).isDyXmlSuccess()) {
                relativeLayout = (RelativeLayout) viewGroup.findViewById(-1642631508);
                imageView2 = (ImageView) viewGroup.findViewById(389008949);
                textView = (TextView) viewGroup.findViewById(1561614848);
            } else {
                relativeLayout = (RelativeLayout) viewGroup.findViewById(a("mbridge_native_ec_layout"));
                imageView2 = (ImageView) viewGroup.findViewById(a("mbridge_iv_flag"));
                textView = (TextView) viewGroup.findViewById(a("mbridge_tv_flag"));
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(imageView2);
            arrayList.add(textView);
            new com.mbridge.msdk.video.dynview.ui.b().a(arrayList, 0, t0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 100.0f), this.b);
        } else {
            relativeLayout = null;
        }
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) viewGroup2.getLayoutParams();
        layoutParams2.setMargins(0, 0, 0, 0);
        viewGroup2.setLayoutParams(layoutParams2);
        if (relativeLayout != null) {
            relativeLayout.addView(viewGroup2);
        }
    }

    private void a(ViewGroup viewGroup) {
        View viewFindViewById;
        if (viewGroup != null && viewGroup.getBackground() == null) {
            try {
                Drawable drawable = com.mbridge.msdk.foundation.controller.c.n().d().getResources().getDrawable(g0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_more_offer_default_bg", "drawable"));
                if (drawable == null || (viewFindViewById = viewGroup.findViewById(a("mbridge_moreoffer_hls"))) == null) {
                    return;
                }
                viewFindViewById.setBackground(drawable);
            } catch (Exception e) {
                o0.b("MOfferEnergize", e.getMessage());
            }
        }
    }

    public void a(CampaignEx campaignEx, int i) {
        if (campaignEx == null) {
            return;
        }
        String str = campaignEx.getRequestId() + "_" + campaignEx.getId();
        if (this.f2149a == null) {
            this.f2149a = new ConcurrentHashMap();
        }
        if (this.f2149a.containsKey(str)) {
            return;
        }
        try {
            MOfferModel mOfferModel = new MOfferModel();
            mOfferModel.setFromType(i);
            SoftReference<MOfferModel> softReference = new SoftReference<>(mOfferModel);
            if (softReference.get() != null) {
                this.f2149a.put(str, softReference);
                softReference.get().buildMofferAd(campaignEx);
            }
        } catch (Exception e) {
            o0.b("MOfferEnergize", e.getMessage());
        }
    }

    public void a(CampaignEx campaignEx, ViewGroup viewGroup, com.mbridge.msdk.video.module.listener.a aVar, int i) {
        if (campaignEx == null) {
            return;
        }
        String str = campaignEx.getRequestId() + "_" + campaignEx.getId();
        if (this.f2149a == null) {
            this.f2149a = new ConcurrentHashMap();
        }
        try {
            MOfferModel mOfferModel = new MOfferModel();
            mOfferModel.setFromType(i);
            SoftReference<MOfferModel> softReference = new SoftReference<>(mOfferModel);
            if (softReference.get() != null) {
                this.f2149a.put(str, softReference);
                MOfferModel mOfferModel2 = softReference.get();
                mOfferModel2.setMoreOfferListener(new c(mOfferModel2, viewGroup), aVar);
                mOfferModel2.setIsRetry(true);
                mOfferModel2.buildMofferAd(campaignEx);
            }
        } catch (Exception e) {
            o0.b("MOfferEnergize", e.getMessage());
        }
    }

    private int a(String str) {
        return g0.a(com.mbridge.msdk.foundation.controller.c.n().d(), str, "id");
    }
}
