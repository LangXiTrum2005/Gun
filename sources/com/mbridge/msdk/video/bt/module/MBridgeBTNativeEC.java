package com.mbridge.msdk.video.bt.module;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.g0;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.video.module.listener.impl.j;
import com.mbridge.msdk.video.signal.impl.k;
import com.mbridge.msdk.videocommon.view.RoundImageView;
import com.mbridge.msdk.videocommon.view.StarLevelView;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class MBridgeBTNativeEC extends MBridgeBTNativeECDiff {
    private TextView A;
    private StarLevelView B;
    private boolean C;
    private boolean D;
    private int E;
    private Runnable F;
    private boolean G;
    private View H;
    private String I;
    private k J;
    private WebView K;
    private ViewGroup p;
    private ViewGroup q;
    private RelativeLayout r;
    private ImageView s;
    private RoundImageView t;
    private ImageView u;
    private ImageView v;
    private ImageView w;
    private ImageView x;
    private TextView y;
    private TextView z;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeBTNativeEC.this.D = true;
            if (MBridgeBTNativeEC.this.H != null) {
                MBridgeBTNativeEC.this.H.setVisibility(0);
            }
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MBridgeBTNativeEC.this.C) {
                MBridgeBTNativeEC.this.a(1, view.getContext());
                MBridgeBTNativeEC.this.a(view.getX(), view.getY());
            }
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MBridgeBTNativeEC.this.K != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", MBridgeBTNativeEC.this.d);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("unitId", MBridgeBTNativeEC.this.I);
                    jSONObject.put("data", jSONObject2);
                    o0.a(BTBaseView.TAG, "NativeEC Call H5 onCloseBtnClicked " + jSONObject.toString());
                } catch (JSONException e) {
                    o0.a(BTBaseView.TAG, e.getMessage());
                }
                com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(MBridgeBTNativeEC.this.K, "onCloseBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            }
        }
    }

    public class d extends com.mbridge.msdk.widget.a {
        public d() {
        }

        @Override // com.mbridge.msdk.widget.a
        public void onNoDoubleClick(View view) {
            MBridgeBTNativeEC.this.a(0, view.getContext());
            MBridgeBTNativeEC.this.a(view.getX(), view.getY());
        }
    }

    public class e extends com.mbridge.msdk.widget.a {
        public e() {
        }

        @Override // com.mbridge.msdk.widget.a
        public void onNoDoubleClick(View view) {
            if (!com.mbridge.msdk.util.b.a() || MBridgeBTNativeEC.this.checkChinaProgressBarStatus()) {
                MBridgeBTNativeEC.this.a(0, view.getContext());
            }
            MBridgeBTNativeEC.this.a(view.getX(), view.getY());
        }
    }

    public class f extends com.mbridge.msdk.widget.a {
        public f() {
        }

        @Override // com.mbridge.msdk.widget.a
        public void onNoDoubleClick(View view) {
            if (!com.mbridge.msdk.util.b.a() || MBridgeBTNativeEC.this.checkChinaProgressBarStatus()) {
                MBridgeBTNativeEC.this.a(0, view.getContext());
            }
            MBridgeBTNativeEC.this.a(view.getX(), view.getY());
        }
    }

    public MBridgeBTNativeEC(Context context) {
        super(context);
        this.C = false;
        this.D = false;
        this.E = 0;
        this.G = false;
    }

    @TargetApi(17)
    public Bitmap blurBitmap(Bitmap bitmap) {
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            RenderScript renderScriptCreate = RenderScript.create(this.f2094a.getApplicationContext());
            ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
            Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap);
            Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
            scriptIntrinsicBlurCreate.setRadius(10.0f);
            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
            scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
            allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
            bitmap.recycle();
            renderScriptCreate.destroy();
            return bitmapCreateBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.MBridgeBTNativeECDiff, com.mbridge.msdk.video.bt.module.BTBaseView
    public void init(Context context) {
        int iC = c();
        if (g0.a(iC)) {
            this.h = b(iC);
            b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.F == null) {
            this.F = new a();
        }
        Runnable runnable = this.F;
        if (runnable != null) {
            postDelayed(runnable, this.E * 1000);
        }
        if (!this.h && this.K != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("id", this.d);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("unitId", this.I);
                jSONObject.put("data", jSONObject2);
                o0.a(BTBaseView.TAG, "NativeEC Call H5 onCloseBtnClicked " + jSONObject.toString());
            } catch (JSONException e2) {
                o0.a(BTBaseView.TAG, e2.getMessage());
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.K, "onCloseBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        }
        if (this.K != null) {
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("id", this.d);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("unitId", this.I);
                jSONObject3.put("data", jSONObject4);
                o0.a(BTBaseView.TAG, "NativeEC Call H5 onEndCardShow " + jSONObject3.toString());
            } catch (JSONException e3) {
                o0.a(BTBaseView.TAG, e3.getMessage());
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.K, "onNativeECShow", Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.MBridgeBTNativeECDiff, com.mbridge.msdk.video.bt.module.BTBaseView
    public void onDestory() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.F;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        int i = configuration.orientation;
        this.g = i;
        if (i == 2) {
            removeView(this.p);
            b(this.q);
        } else {
            removeView(this.q);
            b(this.p);
        }
    }

    public void preLoadData() {
        Bitmap bitmapBlurBitmap;
        try {
            CampaignEx campaignEx = this.b;
            if (campaignEx == null || !this.h) {
                return;
            }
            if (campaignEx.getCbd() > -2) {
                this.E = this.b.getCbd();
            } else {
                com.mbridge.msdk.videocommon.setting.c cVar = this.e;
                if (cVar != null) {
                    this.E = cVar.i();
                }
            }
            com.mbridge.msdk.foundation.same.image.b.a(this.f2094a.getApplicationContext()).a(this.b.getImageUrl(), new com.mbridge.msdk.video.module.listener.impl.e(this.t, this.b, this.I));
            com.mbridge.msdk.foundation.same.image.b.a(this.f2094a.getApplicationContext()).a(this.b.getIconUrl(), new j(this.u, t0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 8.0f)));
            this.y.setText(this.b.getAppName());
            this.z.setText(this.b.getAppDesc());
            this.A.setText(this.b.getNumberRating() + ")");
            this.B.removeAllViews();
            if (com.mbridge.msdk.util.b.a()) {
                setChinaCTAData(this.b);
            }
            double rating = this.b.getRating();
            if (rating <= 0.0d) {
                rating = 5.0d;
            }
            this.B.initScore(rating);
            try {
                Bitmap bitmapA = a(this.t.getDrawable());
                if (bitmapA != null && (bitmapBlurBitmap = blurBitmap(bitmapA)) != null) {
                    this.s.setImageBitmap(bitmapBlurBitmap);
                }
            } catch (Throwable unused) {
                this.s.setVisibility(8);
            }
            if (!TextUtils.isEmpty(this.b.getendcard_url()) && this.b.getendcard_url().contains("alecfc=1")) {
                this.C = true;
            }
            if (!TextUtils.isEmpty(this.b.getendcard_url()) && this.b.getendcard_url().contains("wlgo=1")) {
                this.G = true;
            }
            String language = Locale.getDefault().getLanguage();
            if (TextUtils.isEmpty(language) || !language.equals("zh")) {
                this.v.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("mbridge_reward_flag_en", "drawable", com.mbridge.msdk.foundation.controller.c.n().h())));
            } else {
                this.v.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("mbridge_reward_flag_cn", "drawable", com.mbridge.msdk.foundation.controller.c.n().h())));
            }
            if (!this.G) {
                this.v.setVisibility(4);
                this.x.setVisibility(4);
            }
            t0.a(2, this.w, this.b, this.f2094a, true, null);
            if (this.D) {
                return;
            }
            this.H.setVisibility(8);
        } catch (Throwable th) {
            o0.a(BTBaseView.TAG, th.getMessage());
        }
    }

    public void setCreateWebView(WebView webView) {
        this.K = webView;
    }

    public void setJSCommon(k kVar) {
        this.J = kVar;
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void setUnitId(String str) {
        this.I = str;
    }

    private void b(View view) {
        if (view == null) {
            init(this.f2094a);
            preLoadData();
            return;
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        addView(view);
        a(view);
        b();
    }

    private int c() {
        return findLayout(isLandscape() ? "mbridge_reward_endcard_native_land" : "mbridge_reward_endcard_native_hor");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, Context context) {
        JSONObject jSONObject;
        try {
            try {
                jSONObject = new JSONObject();
                try {
                    jSONObject.put(com.mbridge.msdk.foundation.same.a.j, a(i));
                } catch (JSONException e2) {
                    e = e2;
                    e.printStackTrace();
                }
            } catch (Throwable th) {
                o0.a(BTBaseView.TAG, th.getMessage());
                return;
            }
        } catch (JSONException e3) {
            e = e3;
            jSONObject = null;
        }
        if (this.J != null) {
            if (com.mbridge.msdk.util.b.a()) {
                doChinaJumpClick(context, this.J);
            }
            this.J.click(1, jSONObject != null ? jSONObject.toString() : "");
        }
    }

    public MBridgeBTNativeEC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.C = false;
        this.D = false;
        this.E = 0;
        this.G = false;
    }

    private boolean b(int i) {
        if (isLandscape()) {
            ViewGroup viewGroup = (ViewGroup) this.f.inflate(i, (ViewGroup) null);
            this.q = viewGroup;
            addView(viewGroup);
            return a(this.q);
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f.inflate(i, (ViewGroup) null);
        this.p = viewGroup2;
        addView(viewGroup2);
        return a(this.p);
    }

    private boolean a(View view) {
        try {
            this.r = (RelativeLayout) view.findViewById(findID("mbridge_native_ec_layout"));
            this.s = (ImageView) view.findViewById(findID("mbridge_iv_adbanner_bg"));
            this.t = (RoundImageView) view.findViewById(findID("mbridge_iv_adbanner"));
            this.u = (ImageView) view.findViewById(findID("mbridge_iv_icon"));
            this.v = (ImageView) view.findViewById(findID("mbridge_iv_flag"));
            this.w = (ImageView) view.findViewById(findID("mbridge_iv_link"));
            this.y = (TextView) view.findViewById(findID("mbridge_tv_apptitle"));
            this.z = (TextView) view.findViewById(findID("mbridge_tv_appdesc"));
            this.A = (TextView) view.findViewById(findID("mbridge_tv_number"));
            this.B = (StarLevelView) view.findViewById(findID("mbridge_sv_starlevel"));
            this.H = view.findViewById(findID("mbridge_iv_close"));
            this.ctaView = view.findViewById(findID("mbridge_tv_cta"));
            this.x = (ImageView) view.findViewById(findID("mbridge_iv_logo"));
            return isNotNULL(this.s, this.t, this.u, this.y, this.z, this.A, this.B, this.H, this.ctaView);
        } catch (Throwable th) {
            o0.b(BTBaseView.TAG, th.getMessage(), th);
            return false;
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void b() {
        if (this.h) {
            this.r.setOnClickListener(new b());
            this.H.setOnClickListener(new c());
            this.ctaView.setOnClickListener(new d());
            this.u.setOnClickListener(new e());
            this.t.setOnClickListener(new f());
        }
    }

    private Bitmap a(Drawable drawable) {
        try {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (Throwable th) {
            o0.a(BTBaseView.TAG, th.getMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(float f2, float f3) {
        if (this.K != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", BTBaseView.n);
                jSONObject.put("id", this.d);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("x", String.valueOf(f2));
                jSONObject2.put("y", String.valueOf(f3));
                jSONObject.put("data", jSONObject2);
                com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.K, "onClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            } catch (Exception unused) {
                com.mbridge.msdk.video.bt.component.d.c().a(this.K, "onClicked", this.d);
            }
        }
    }
}
