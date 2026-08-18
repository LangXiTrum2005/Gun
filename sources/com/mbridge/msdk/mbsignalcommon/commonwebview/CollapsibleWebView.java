package com.mbridge.msdk.mbsignalcommon.commonwebview;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import androidx.webkit.ProxyConfig;
import com.mbridge.msdk.foundation.tools.o0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class CollapsibleWebView extends CommonWebView {
    private CopyOnWriteArrayList<CommonWebView.h> v;
    private CopyOnWriteArrayList<CommonWebView.h> w;
    private CopyOnWriteArrayList<e> x;
    private String y;
    private String z;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CollapsibleWebView.this.hideToolBarButton("doCollapse");
            CollapsibleWebView.this.showToolBarButton("doSpand");
            CollapsibleWebView.this.d();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CollapsibleWebView.this.hideToolBarButton("doSpand");
            CollapsibleWebView.this.showToolBarButton("doCollapse");
            CollapsibleWebView.this.e();
        }
    }

    public class c implements CommonWebView.i {
        public c() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView.i
        public void a(String str) {
            CollapsibleWebView collapsibleWebView = CollapsibleWebView.this;
            collapsibleWebView.b(collapsibleWebView.j, str);
        }
    }

    public class d extends WebViewClient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Boolean f1466a = Boolean.FALSE;
        String b = "";

        public d() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            if (this.f1466a.booleanValue()) {
                return;
            }
            CollapsibleWebView.this.a((View) webView, str);
            this.f1466a = Boolean.FALSE;
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.b = str;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            HashMap map = new HashMap();
            map.put("type", "error");
            map.put("url", str2);
            map.put("description", str);
            if (!this.f1466a.booleanValue() && this.b.equals(str2)) {
                this.f1466a = Boolean.TRUE;
                CollapsibleWebView.this.b(webView, map);
            }
            CollapsibleWebView.this.a(webView, map);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            HashMap mapV = AbstractC3950lJ.v("type", ProxyConfig.MATCH_HTTP);
            String str = webResourceRequest.getUrl() + "";
            mapV.put("url", str);
            mapV.put("statusCode", webResourceResponse.getStatusCode() + "");
            mapV.put("description", "http error");
            if (!this.f1466a.booleanValue() && (this.b.equals(str) || TextUtils.isEmpty(this.b))) {
                this.f1466a = Boolean.TRUE;
                CollapsibleWebView.this.b(webView, mapV);
            }
            CollapsibleWebView.this.a(webView, mapV);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            HashMap mapV = AbstractC3950lJ.v("type", "ssl");
            mapV.put("url", sslError.getUrl());
            mapV.put("description", "ssl error");
            if (!this.f1466a.booleanValue()) {
                if (this.b.equals(sslError.getUrl() + "")) {
                    this.f1466a = Boolean.TRUE;
                    CollapsibleWebView.this.b(webView, mapV);
                }
            }
            CollapsibleWebView.this.a(webView, mapV);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            o0.b("CollapsibleWebView", "WebView called onRenderProcessGone");
            return true;
        }
    }

    public interface e {
        void a(View view, String str);

        void a(View view, Map<String, String> map);

        void b(View view, String str);

        void b(View view, Map<String, String> map);
    }

    public CollapsibleWebView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        Iterator<CommonWebView.h> it = this.v.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        Iterator<CommonWebView.h> it = this.w.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    private ToolBar.b getCollapseButton() {
        return new ToolBar.b("doCollapse").a(false).a("mbridge_arrow_down_white_blackbg").a(new a());
    }

    private ToolBar.b getExpandButton() {
        return new ToolBar.b("doSpand").a("mbridge_arrow_up_black").a(new b());
    }

    public String getCollapseIconName() {
        return this.y;
    }

    public String getExpandIconName() {
        return this.z;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.commonwebview.CommonWebView
    public void init() {
        super.init();
        this.v = new CopyOnWriteArrayList<>();
        this.w = new CopyOnWriteArrayList<>();
        this.x = new CopyOnWriteArrayList<>();
        this.y = "mbridge_arrow_down_white_blackbg";
        this.z = "mbridge_arrow_up_white";
        useDeeplink();
        initWebViewListener();
        useProgressBar();
        ArrayList<ToolBar.b> arrayList = new ArrayList<>();
        arrayList.add(getCollapseButton());
        arrayList.add(getExpandButton());
        useDefaultToolBar();
        useCustomizedToolBar(arrayList, true);
    }

    public void initWebViewListener() {
        setPageLoadTimtoutListener(new c());
        setPageLoadTimtout(CommonWebView.DEFAULT_JUMP_TIMEOUT);
        addWebViewClient(new d());
    }

    public void setCollapseIconName(String str) {
        this.y = str;
    }

    public void setCollapseListener(CommonWebView.h hVar) {
        this.v.add(hVar);
    }

    public void setCustomizedToolBarMarginWidthPixel(int i, int i2, int i3, int i4) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.c.getLayoutParams();
        layoutParams.setMargins(i, i2, i3, i4);
        this.c.setLayoutParams(layoutParams);
    }

    public void setExpandIconName(String str) {
        this.z = str;
    }

    public void setExpandListener(CommonWebView.h hVar) {
        this.w.add(hVar);
    }

    public void setPageLoadListener(e eVar) {
        this.x.add(eVar);
    }

    public CollapsibleWebView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public CollapsibleWebView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view, String str) {
        Iterator<e> it = this.x.iterator();
        while (it.hasNext()) {
            it.next().a(view, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(View view, Map<String, String> map) {
        Iterator<e> it = this.x.iterator();
        while (it.hasNext()) {
            it.next().b(view, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view, Map<String, String> map) {
        Iterator<e> it = this.x.iterator();
        while (it.hasNext()) {
            it.next().a(view, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(View view, String str) {
        Iterator<e> it = this.x.iterator();
        while (it.hasNext()) {
            it.next().b(view, str);
        }
    }
}
