package androidx.webkit.internal;

import android.webkit.ServiceWorkerController;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.webkit.ServiceWorkerClientCompat;
import androidx.webkit.ServiceWorkerControllerCompat;
import androidx.webkit.ServiceWorkerWebSettingsCompat;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4409qb;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class ServiceWorkerControllerImpl extends ServiceWorkerControllerCompat {
    private ServiceWorkerControllerBoundaryInterface mBoundaryInterface;
    private ServiceWorkerController mFrameworksImpl;
    private final ServiceWorkerWebSettingsCompat mWebSettings;

    public ServiceWorkerControllerImpl() {
        ApiFeature.N n = WebViewFeatureInternal.SERVICE_WORKER_BASIC_USAGE;
        if (n.isSupportedByFramework()) {
            this.mFrameworksImpl = ApiHelperForN.getServiceWorkerControllerInstance();
            this.mBoundaryInterface = null;
            this.mWebSettings = ApiHelperForN.getServiceWorkerWebSettingsImpl(getFrameworksImpl());
        } else {
            if (!n.isSupportedByWebView()) {
                throw WebViewFeatureInternal.getUnsupportedOperationException();
            }
            this.mFrameworksImpl = null;
            ServiceWorkerControllerBoundaryInterface serviceWorkerController = WebViewGlueCommunicator.getFactory().getServiceWorkerController();
            this.mBoundaryInterface = serviceWorkerController;
            this.mWebSettings = new ServiceWorkerWebSettingsImpl(serviceWorkerController.getServiceWorkerWebSettings());
        }
    }

    private ServiceWorkerControllerBoundaryInterface getBoundaryInterface() {
        if (this.mBoundaryInterface == null) {
            this.mBoundaryInterface = WebViewGlueCommunicator.getFactory().getServiceWorkerController();
        }
        return this.mBoundaryInterface;
    }

    @RequiresApi(24)
    private ServiceWorkerController getFrameworksImpl() {
        if (this.mFrameworksImpl == null) {
            this.mFrameworksImpl = ApiHelperForN.getServiceWorkerControllerInstance();
        }
        return this.mFrameworksImpl;
    }

    @Override // androidx.webkit.ServiceWorkerControllerCompat
    @NonNull
    public ServiceWorkerWebSettingsCompat getServiceWorkerWebSettings() {
        return this.mWebSettings;
    }

    @Override // androidx.webkit.ServiceWorkerControllerCompat
    public void setServiceWorkerClient(@Nullable ServiceWorkerClientCompat serviceWorkerClientCompat) {
        ApiFeature.N n = WebViewFeatureInternal.SERVICE_WORKER_BASIC_USAGE;
        if (n.isSupportedByFramework()) {
            if (serviceWorkerClientCompat == null) {
                ApiHelperForN.setServiceWorkerClient(getFrameworksImpl(), null);
                return;
            } else {
                ApiHelperForN.setServiceWorkerClientCompat(getFrameworksImpl(), serviceWorkerClientCompat);
                return;
            }
        }
        if (!n.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        if (serviceWorkerClientCompat == null) {
            getBoundaryInterface().setServiceWorkerClient(null);
        } else {
            getBoundaryInterface().setServiceWorkerClient(new C4409qb(new ServiceWorkerClientAdapter(serviceWorkerClientCompat)));
        }
    }
}
