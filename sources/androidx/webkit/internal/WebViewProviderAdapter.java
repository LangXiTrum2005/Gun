package androidx.webkit.internal;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.webkit.Profile;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebMessagePortCompat;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewRenderProcess;
import androidx.webkit.WebViewRenderProcessClient;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4496rb;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4409qb;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.ProfileBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class WebViewProviderAdapter {
    WebViewProviderBoundaryInterface mImpl;

    public WebViewProviderAdapter(@NonNull WebViewProviderBoundaryInterface webViewProviderBoundaryInterface) {
        this.mImpl = webViewProviderBoundaryInterface;
    }

    @NonNull
    public ScriptHandlerImpl addDocumentStartJavaScript(@NonNull String str, @NonNull String[] strArr) {
        return ScriptHandlerImpl.toScriptHandler(this.mImpl.addDocumentStartJavaScript(str, strArr));
    }

    public void addWebMessageListener(@NonNull String str, @NonNull String[] strArr, @NonNull WebViewCompat.WebMessageListener webMessageListener) {
        this.mImpl.addWebMessageListener(str, strArr, new C4409qb(new WebMessageListenerAdapter(webMessageListener)));
    }

    @NonNull
    public WebMessagePortCompat[] createWebMessageChannel() {
        InvocationHandler[] invocationHandlerArrCreateWebMessageChannel = this.mImpl.createWebMessageChannel();
        WebMessagePortCompat[] webMessagePortCompatArr = new WebMessagePortCompat[invocationHandlerArrCreateWebMessageChannel.length];
        for (int i = 0; i < invocationHandlerArrCreateWebMessageChannel.length; i++) {
            webMessagePortCompatArr[i] = new WebMessagePortImpl(invocationHandlerArrCreateWebMessageChannel[i]);
        }
        return webMessagePortCompatArr;
    }

    @NonNull
    public Profile getProfile() {
        return new ProfileImpl((ProfileBoundaryInterface) AbstractC4496rb.h(ProfileBoundaryInterface.class, this.mImpl.getProfile()));
    }

    @Nullable
    public WebChromeClient getWebChromeClient() {
        return this.mImpl.getWebChromeClient();
    }

    @NonNull
    public WebViewClient getWebViewClient() {
        return this.mImpl.getWebViewClient();
    }

    @Nullable
    public WebViewRenderProcess getWebViewRenderProcess() {
        return WebViewRenderProcessImpl.forInvocationHandler(this.mImpl.getWebViewRenderer());
    }

    @Nullable
    public WebViewRenderProcessClient getWebViewRenderProcessClient() {
        InvocationHandler webViewRendererClient = this.mImpl.getWebViewRendererClient();
        if (webViewRendererClient == null) {
            return null;
        }
        return ((WebViewRenderProcessClientAdapter) ((C4409qb) webViewRendererClient).f4887a).getWebViewRenderProcessClient();
    }

    public void insertVisualStateCallback(long j, @NonNull WebViewCompat.VisualStateCallback visualStateCallback) {
        this.mImpl.insertVisualStateCallback(j, new C4409qb(new VisualStateCallbackAdapter(visualStateCallback)));
    }

    public boolean isAudioMuted() {
        return this.mImpl.isAudioMuted();
    }

    public void postWebMessage(@NonNull WebMessageCompat webMessageCompat, @NonNull Uri uri) {
        this.mImpl.postMessageToMainFrame(new C4409qb(new WebMessageAdapter(webMessageCompat)), uri);
    }

    public void removeWebMessageListener(@NonNull String str) {
        this.mImpl.removeWebMessageListener(str);
    }

    public void setAudioMuted(boolean z) {
        this.mImpl.setAudioMuted(z);
    }

    public void setProfileWithName(@NonNull String str) {
        this.mImpl.setProfile(str);
    }

    @SuppressLint({"LambdaLast"})
    public void setWebViewRenderProcessClient(@Nullable Executor executor, @Nullable WebViewRenderProcessClient webViewRenderProcessClient) {
        this.mImpl.setWebViewRendererClient(webViewRenderProcessClient != null ? new C4409qb(new WebViewRenderProcessClientAdapter(executor, webViewRenderProcessClient)) : null);
    }
}
