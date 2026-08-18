package androidx.webkit.internal;

import android.webkit.CookieManager;
import android.webkit.SafeBrowsingResponse;
import android.webkit.ServiceWorkerWebSettings;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4496rb;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4544s4;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.UR;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ya0;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebResourceRequestBoundaryInterface;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewCookieManagerBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class WebkitToCompatConverter {
    private final WebkitToCompatConverterBoundaryInterface mImpl;

    public WebkitToCompatConverter(@NonNull WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface) {
        this.mImpl = webkitToCompatConverterBoundaryInterface;
    }

    @NonNull
    public CookieManagerAdapter convertCookieManager(@NonNull CookieManager cookieManager) {
        return new CookieManagerAdapter((WebViewCookieManagerBoundaryInterface) AbstractC4496rb.h(WebViewCookieManagerBoundaryInterface.class, this.mImpl.convertCookieManager(cookieManager)));
    }

    @NonNull
    public InvocationHandler convertSafeBrowsingResponse(@NonNull SafeBrowsingResponse safeBrowsingResponse) {
        return this.mImpl.convertSafeBrowsingResponse(safeBrowsingResponse);
    }

    @NonNull
    public InvocationHandler convertServiceWorkerSettings(@NonNull ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return this.mImpl.convertServiceWorkerSettings(serviceWorkerWebSettings);
    }

    @NonNull
    public WebSettingsAdapter convertSettings(@NonNull WebSettings webSettings) {
        return new WebSettingsAdapter((WebSettingsBoundaryInterface) AbstractC4496rb.h(WebSettingsBoundaryInterface.class, this.mImpl.convertSettings(webSettings)));
    }

    @NonNull
    public InvocationHandler convertWebMessagePort(@NonNull WebMessagePort webMessagePort) {
        return this.mImpl.convertWebMessagePort(webMessagePort);
    }

    @NonNull
    public InvocationHandler convertWebResourceError(@NonNull WebResourceError webResourceError) {
        return this.mImpl.convertWebResourceError(webResourceError);
    }

    @NonNull
    public WebResourceRequestAdapter convertWebResourceRequest(@NonNull WebResourceRequest webResourceRequest) {
        return new WebResourceRequestAdapter((WebResourceRequestBoundaryInterface) AbstractC4496rb.h(WebResourceRequestBoundaryInterface.class, this.mImpl.convertWebResourceRequest(webResourceRequest)));
    }

    @NonNull
    @RequiresApi(27)
    public SafeBrowsingResponse convertSafeBrowsingResponse(@NonNull InvocationHandler invocationHandler) {
        return AbstractC4544s4.d(this.mImpl.convertSafeBrowsingResponse(invocationHandler));
    }

    @NonNull
    @RequiresApi(24)
    public ServiceWorkerWebSettings convertServiceWorkerSettings(@NonNull InvocationHandler invocationHandler) {
        return UR.k(this.mImpl.convertServiceWorkerSettings(invocationHandler));
    }

    @NonNull
    @RequiresApi(23)
    public WebMessagePort convertWebMessagePort(@NonNull InvocationHandler invocationHandler) {
        return Ya0.l(this.mImpl.convertWebMessagePort(invocationHandler));
    }

    @NonNull
    @RequiresApi(23)
    public WebResourceError convertWebResourceError(@NonNull InvocationHandler invocationHandler) {
        return Ya0.m(this.mImpl.convertWebResourceError(invocationHandler));
    }
}
