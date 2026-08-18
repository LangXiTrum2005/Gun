package androidx.webkit.internal;

import androidx.annotation.NonNull;
import androidx.webkit.JavaScriptReplyProxy;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4496rb;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4409qb;
import java.lang.reflect.InvocationHandler;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class JavaScriptReplyProxyImpl extends JavaScriptReplyProxy {
    private JsReplyProxyBoundaryInterface mBoundaryInterface;

    public JavaScriptReplyProxyImpl(@NonNull JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        this.mBoundaryInterface = jsReplyProxyBoundaryInterface;
    }

    @NonNull
    public static JavaScriptReplyProxyImpl forInvocationHandler(@NonNull InvocationHandler invocationHandler) {
        final JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) AbstractC4496rb.h(JsReplyProxyBoundaryInterface.class, invocationHandler);
        return (JavaScriptReplyProxyImpl) jsReplyProxyBoundaryInterface.getOrCreatePeer(new Callable<Object>() { // from class: androidx.webkit.internal.JavaScriptReplyProxyImpl.1
            @Override // java.util.concurrent.Callable
            public Object call() {
                return new JavaScriptReplyProxyImpl(jsReplyProxyBoundaryInterface);
            }
        });
    }

    @Override // androidx.webkit.JavaScriptReplyProxy
    public void postMessage(@NonNull String str) {
        if (!WebViewFeatureInternal.WEB_MESSAGE_LISTENER.isSupportedByWebView()) {
            throw WebViewFeatureInternal.getUnsupportedOperationException();
        }
        this.mBoundaryInterface.postMessage(str);
    }

    @Override // androidx.webkit.JavaScriptReplyProxy
    public void postMessage(@NonNull byte[] bArr) {
        Objects.requireNonNull(bArr, "ArrayBuffer must be non-null");
        if (WebViewFeatureInternal.WEB_MESSAGE_ARRAY_BUFFER.isSupportedByWebView()) {
            this.mBoundaryInterface.postMessageWithPayload(new C4409qb(new WebMessagePayloadAdapter(bArr)));
            return;
        }
        throw WebViewFeatureInternal.getUnsupportedOperationException();
    }
}
