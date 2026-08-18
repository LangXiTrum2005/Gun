package com.mbridge.msdk.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.image.c;
import com.mbridge.msdk.foundation.same.net.utils.d;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;

/* JADX INFO: loaded from: classes2.dex */
public class MBAdChoice extends MBImageView {
    private final Context c;
    private String d;
    private String e;
    private String f;
    private CampaignEx g;
    private com.mbridge.msdk.foundation.feedback.a h;

    public class a implements com.mbridge.msdk.foundation.feedback.a {
        public a() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void showed() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void summit(String str) {
        }
    }

    public class b implements c {
        public b() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            MBAdChoice.this.setImageBitmap(bitmap);
        }
    }

    public MBAdChoice(Context context) {
        super(context);
        this.d = "";
        this.e = "";
        this.f = "";
        this.c = context;
        b();
    }

    private boolean a(CampaignEx campaignEx) {
        this.g = campaignEx;
        g gVarF = AbstractC3888ke0.f(h.b());
        c(campaignEx, gVarF);
        a(campaignEx, gVarF);
        b(campaignEx, gVarF);
        boolean z = (TextUtils.isEmpty(this.d) || TextUtils.isEmpty(this.e) || TextUtils.isEmpty(this.f)) ? false : true;
        setImageUrl(this.d);
        return z;
    }

    private void b() {
        setScaleType(ImageView.ScaleType.FIT_CENTER);
        setClickable(true);
    }

    private void c(CampaignEx campaignEx, g gVar) {
        this.g = campaignEx;
        if (campaignEx == null) {
            if (gVar != null) {
                this.e = gVar.c();
                return;
            }
            return;
        }
        String privacyUrl = campaignEx.getPrivacyUrl();
        this.e = privacyUrl;
        if (TextUtils.isEmpty(privacyUrl)) {
            CampaignEx.a adchoice = campaignEx.getAdchoice();
            if (adchoice != null) {
                this.e = adchoice.c();
            }
            if (TextUtils.isEmpty(this.e) && gVar != null) {
                this.e = gVar.c();
            }
            if (TextUtils.isEmpty(this.e)) {
                this.e = d.h().g;
            }
        }
    }

    @Override // android.view.View
    public boolean performClick() {
        if (this.h == null) {
            this.h = new a();
        }
        t0.a(this.g, this.h, 4, "");
        return true;
    }

    public void setCampaign(Campaign campaign) {
        if (!(campaign instanceof CampaignEx)) {
            this.g = null;
            return;
        }
        CampaignEx campaignEx = (CampaignEx) campaign;
        this.g = campaignEx;
        if (a(campaignEx)) {
            a();
        }
    }

    public void setFeedbackDialogEventListener(com.mbridge.msdk.foundation.feedback.a aVar) {
        this.h = aVar;
    }

    private void b(CampaignEx campaignEx, g gVar) {
        this.g = campaignEx;
        if (campaignEx == null) {
            if (gVar != null) {
                this.f = gVar.d();
                return;
            }
            return;
        }
        CampaignEx.a adchoice = campaignEx.getAdchoice();
        if (adchoice != null) {
            this.f = adchoice.d();
        }
        if (!TextUtils.isEmpty(this.f) || gVar == null) {
            return;
        }
        this.f = gVar.d();
    }

    public MBAdChoice(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = "";
        this.e = "";
        this.f = "";
        this.c = context;
        b();
    }

    private void a() {
        if (this.c != null) {
            com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(this.d, new b());
        }
    }

    public MBAdChoice(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = "";
        this.e = "";
        this.f = "";
        this.c = context;
        b();
    }

    private void a(CampaignEx campaignEx, g gVar) {
        this.g = campaignEx;
        if (campaignEx == null) {
            if (gVar != null) {
                this.d = gVar.b();
                return;
            }
            return;
        }
        CampaignEx.a adchoice = campaignEx.getAdchoice();
        if (adchoice != null) {
            this.d = adchoice.b();
        }
        if (!TextUtils.isEmpty(this.d) || gVar == null) {
            return;
        }
        this.d = gVar.b();
    }
}
