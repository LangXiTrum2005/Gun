package com.mbridge.msdk.advanced.view;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.AdError;
import com.mbridge.msdk.advanced.signal.b;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.mbridge.msdk.newreward.player.view.hybrid.util.MRAIDCommunicatorUtil;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class MBNativeAdvancedView extends RelativeLayout {
    private static String h = "MBAdvancedNativeView";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MBNativeAdvancedWebview f942a;
    private View b;
    private boolean c;
    private boolean d;
    private boolean e;
    private b f;
    private Context g;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                o0.a(MBNativeAdvancedView.h, "webviewshow");
                String string = "";
                try {
                    int[] iArr = new int[2];
                    MBNativeAdvancedView.this.f942a.getLocationOnScreen(iArr);
                    o0.b(MBNativeAdvancedView.h, "coordinate:" + iArr[0] + "--" + iArr[1]);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("startX", t0.b(c.n().d(), (float) iArr[0]));
                    jSONObject.put("startY", t0.b(c.n().d(), (float) iArr[1]));
                    string = jSONObject.toString();
                } catch (Throwable th) {
                    o0.b(MBNativeAdvancedView.h, th.getMessage(), th);
                }
                f.a().a((WebView) MBNativeAdvancedView.this.f942a, "webviewshow", Base64.encodeToString(string.toString().getBytes(), 2));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public MBNativeAdvancedView(Context context) {
        this(context, null);
    }

    private void b() {
        MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f942a;
        if (mBNativeAdvancedWebview != null && mBNativeAdvancedWebview.getParent() == null) {
            addView(this.f942a, new ViewGroup.LayoutParams(-1, -1));
        }
        c();
        View view = this.b;
        if (view != null) {
            if (view.getParent() != null) {
                bringChildToFront(this.b);
                return;
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(t0.a(getContext(), 28.0f), t0.a(getContext(), 16.0f));
            layoutParams.addRule(10);
            layoutParams.addRule(11);
            layoutParams.rightMargin = t0.a(getContext(), 2.0f);
            layoutParams.topMargin = t0.a(getContext(), 2.0f);
            addView(this.b, layoutParams);
        }
    }

    private void c() {
        int[] iArr = new int[2];
        this.f942a.getLocationInWindow(iArr);
        MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f942a;
        transInfoForMraid(mBNativeAdvancedWebview, iArr[0], iArr[1], mBNativeAdvancedWebview.getWidth(), this.f942a.getHeight());
        MBNativeAdvancedWebview mBNativeAdvancedWebview2 = this.f942a;
        if (mBNativeAdvancedWebview2 != null) {
            mBNativeAdvancedWebview2.setObject(this.f);
            this.f942a.post(new a());
        }
    }

    public static void transInfoForMraid(WebView webView, int i, int i2, int i3, int i4) {
        String str;
        o0.b(h, "transInfoForMraid");
        try {
            int i5 = c.n().d().getResources().getConfiguration().orientation;
            JSONObject jSONObject = new JSONObject();
            if (i5 == 2) {
                str = "landscape";
            } else {
                str = i5 == 1 ? "portrait" : AdError.UNDEFINED_DOMAIN;
            }
            jSONObject.put(AdUnitActivity.EXTRA_ORIENTATION, str);
            jSONObject.put("locked", "true");
            float fN = k0.n(c.n().d());
            float fM = k0.m(c.n().d());
            HashMap mapV = k0.v(c.n().d());
            int iIntValue = ((Integer) mapV.get("width")).intValue();
            int iIntValue2 = ((Integer) mapV.get("height")).intValue();
            HashMap map = new HashMap();
            map.put(MRAIDCommunicatorUtil.KEY_PLACEMENTTYPE, MRAIDCommunicatorUtil.PLACEMENT_INLINE);
            map.put("state", MRAIDCommunicatorUtil.STATES_DEFAULT);
            map.put(MRAIDCommunicatorUtil.KEY_VIEWABLE, "true");
            map.put(MRAIDCommunicatorUtil.KEY_CURRENTORIENTATION, jSONObject);
            float f = i;
            float f2 = i2;
            float f3 = i3;
            float f4 = i4;
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(webView, f, f2, f3, f4);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(webView, f, f2, f3, f4);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(webView, fN, fM);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(webView, iIntValue, iIntValue2);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(webView, map);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(webView);
        } catch (Throwable th) {
            o0.b(h, "transInfoForMraid", th);
        }
    }

    public void changeCloseBtnState(int i) {
        View view = this.b;
        if (view != null) {
            if (i == 2) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        }
    }

    public void clearResState() {
        this.e = false;
        this.d = false;
        this.c = false;
    }

    public void clearResStateAndRemoveClose() {
        clearResState();
        View view = this.b;
        if (view == null || view.getParent() == null) {
            return;
        }
        removeView(this.b);
    }

    public void destroy() {
        removeAllViews();
        MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f942a;
        if (mBNativeAdvancedWebview != null && !mBNativeAdvancedWebview.isDestoryed()) {
            this.f942a.release();
            com.mbridge.msdk.advanced.signal.a.a(this.f942a, "onSystemDestory", "");
        }
        if (this.g != null) {
            this.g = null;
        }
    }

    public b getAdvancedNativeSignalCommunicationImpl() {
        return this.f;
    }

    public MBNativeAdvancedWebview getAdvancedNativeWebview() {
        return this.f942a;
    }

    public View getCloseView() {
        return this.b;
    }

    public boolean isEndCardReady() {
        return this.e;
    }

    public boolean isH5Ready() {
        return this.c;
    }

    public boolean isVideoReady() {
        return this.d;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void resetLoadState() {
        this.e = false;
        this.d = false;
        this.c = false;
    }

    public void setAdvancedNativeSignalCommunicationImpl(b bVar) {
        this.f = bVar;
        MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f942a;
        if (mBNativeAdvancedWebview != null) {
            mBNativeAdvancedWebview.setObject(bVar);
        }
    }

    public void setAdvancedNativeWebview(MBNativeAdvancedWebview mBNativeAdvancedWebview) {
        this.f942a = mBNativeAdvancedWebview;
        b bVar = this.f;
        if (bVar != null) {
            mBNativeAdvancedWebview.setObject(bVar);
        }
    }

    public void setCloseView(View view) {
        this.b = view;
        if (view != null) {
            view.setContentDescription("closeButton");
        }
    }

    public void setEndCardReady(boolean z) {
        this.e = z;
    }

    public void setH5Ready(boolean z) {
        this.c = z;
    }

    public void setVideoReady(boolean z) {
        this.d = z;
    }

    public void show() {
        b();
        clearResState();
    }

    public MBNativeAdvancedView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MBNativeAdvancedView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = context;
    }
}
