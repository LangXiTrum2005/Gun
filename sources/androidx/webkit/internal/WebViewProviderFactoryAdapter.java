package androidx.webkit.internal;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4496rb;
import org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface;
import org.chromium.support_lib_boundary.ProfileStoreBoundaryInterface;
import org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.TracingControllerBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class WebViewProviderFactoryAdapter implements WebViewProviderFactory {
    final WebViewProviderFactoryBoundaryInterface mImpl;

    public WebViewProviderFactoryAdapter(@NonNull WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.mImpl = webViewProviderFactoryBoundaryInterface;
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    @NonNull
    public WebViewProviderBoundaryInterface createWebView(@NonNull WebView webView) {
        return (WebViewProviderBoundaryInterface) AbstractC4496rb.h(WebViewProviderBoundaryInterface.class, this.mImpl.createWebView(webView));
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    @NonNull
    public DropDataContentProviderBoundaryInterface getDropDataProvider() {
        return (DropDataContentProviderBoundaryInterface) AbstractC4496rb.h(DropDataContentProviderBoundaryInterface.class, this.mImpl.getDropDataProvider());
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    @NonNull
    public ProfileStoreBoundaryInterface getProfileStore() {
        return (ProfileStoreBoundaryInterface) AbstractC4496rb.h(ProfileStoreBoundaryInterface.class, this.mImpl.getProfileStore());
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    @NonNull
    public ProxyControllerBoundaryInterface getProxyController() {
        return (ProxyControllerBoundaryInterface) AbstractC4496rb.h(ProxyControllerBoundaryInterface.class, this.mImpl.getProxyController());
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    @NonNull
    public ServiceWorkerControllerBoundaryInterface getServiceWorkerController() {
        return (ServiceWorkerControllerBoundaryInterface) AbstractC4496rb.h(ServiceWorkerControllerBoundaryInterface.class, this.mImpl.getServiceWorkerController());
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    @NonNull
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) AbstractC4496rb.h(StaticsBoundaryInterface.class, this.mImpl.getStatics());
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    @NonNull
    public TracingControllerBoundaryInterface getTracingController() {
        return (TracingControllerBoundaryInterface) AbstractC4496rb.h(TracingControllerBoundaryInterface.class, this.mImpl.getTracingController());
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    @NonNull
    public String[] getWebViewFeatures() {
        return this.mImpl.getSupportedFeatures();
    }

    @Override // androidx.webkit.internal.WebViewProviderFactory
    @NonNull
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) AbstractC4496rb.h(WebkitToCompatConverterBoundaryInterface.class, this.mImpl.getWebkitToCompatConverter());
    }
}
