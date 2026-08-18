package com.unity3d.services.ads.token;

import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.configuration.InitializeEventsMetricSender;
import com.unity3d.services.core.configuration.PrivacyConfigStorage;
import com.unity3d.services.core.device.reader.GameSessionIdReader;
import com.unity3d.services.core.device.reader.builder.DeviceInfoReaderBuilder;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2340Cl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4995x90;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2953a0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4907w90;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4124nH;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3069bH;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4309pQ;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
public final class InMemoryTokenStorage implements TokenStorage, IServiceComponent {
    private final ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();
    private final InterfaceC4309pQ accessCounter = AbstractC4995x90.a(-1);
    private final InterfaceC4309pQ initToken = AbstractC4995x90.a(null);
    private final ExecutorService executorService = Executors.newSingleThreadExecutor();
    private final InterfaceC3069bH asyncTokenStorage$delegate = AbstractC2340Cl.H(EnumC4124nH.c, new InMemoryTokenStorage$special$$inlined$inject$default$1(this, ""));

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _get_nativeGeneratedToken_$lambda$2(String str) {
        WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.TOKEN, TokenEvent.TOKEN_NATIVE_DATA, str);
    }

    private final AsyncTokenStorage getAsyncTokenStorage() {
        return (AsyncTokenStorage) this.asyncTokenStorage$delegate.getValue();
    }

    private final void triggerTokenAvailable(boolean z) {
        InitializeEventsMetricSender.getInstance().sdkTokenDidBecomeAvailableWithConfig(z);
    }

    @Override // com.unity3d.services.ads.token.TokenStorage
    public void appendTokens(JSONArray jSONArray) throws JSONException {
        AbstractC2995aW.q(jSONArray, "tokens");
        ((C4907w90) this.accessCounter).h(-1, 0);
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            this.queue.add(jSONArray.getString(i));
        }
        if (length > 0) {
            triggerTokenAvailable(false);
            getAsyncTokenStorage().onTokenAvailable();
        }
    }

    @Override // com.unity3d.services.ads.token.TokenStorage
    public void createTokens(JSONArray jSONArray) throws JSONException {
        AbstractC2995aW.q(jSONArray, "tokens");
        deleteTokens();
        appendTokens(jSONArray);
    }

    @Override // com.unity3d.services.ads.token.TokenStorage
    public void deleteTokens() {
        C4907w90 c4907w90;
        Object value;
        this.queue.clear();
        InterfaceC4309pQ interfaceC4309pQ = this.accessCounter;
        do {
            c4907w90 = (C4907w90) interfaceC4309pQ;
            value = c4907w90.getValue();
            ((Number) value).intValue();
        } while (!c4907w90.h(value, -1));
    }

    @Override // com.unity3d.services.ads.token.TokenStorage
    public C5033xf0 getNativeGeneratedToken() {
        new NativeTokenGenerator(this.executorService, new DeviceInfoReaderBuilder(new ConfigurationReader(), PrivacyConfigStorage.getInstance(), GameSessionIdReader.getInstance()), null).generateToken(new C2953a0(7));
        return C5033xf0.f5238a;
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    @Override // com.unity3d.services.ads.token.TokenStorage
    public String getToken() {
        C4907w90 c4907w90;
        Object value;
        Number number;
        if (((Number) ((C4907w90) this.accessCounter).getValue()).intValue() == -1) {
            return (String) ((C4907w90) this.initToken).getValue();
        }
        if (this.queue.isEmpty()) {
            WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.TOKEN, TokenEvent.QUEUE_EMPTY, new Object[0]);
            return null;
        }
        InterfaceC4309pQ interfaceC4309pQ = this.accessCounter;
        do {
            c4907w90 = (C4907w90) interfaceC4309pQ;
            value = c4907w90.getValue();
            number = (Number) value;
        } while (!c4907w90.h(value, Integer.valueOf(number.intValue() + 1)));
        WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.TOKEN, TokenEvent.TOKEN_ACCESS, Integer.valueOf(number.intValue()));
        return this.queue.poll();
    }

    @Override // com.unity3d.services.ads.token.TokenStorage
    public void setInitToken(String str) {
        C4907w90 c4907w90;
        Object value;
        if (str == null) {
            return;
        }
        InterfaceC4309pQ interfaceC4309pQ = this.initToken;
        do {
            c4907w90 = (C4907w90) interfaceC4309pQ;
            value = c4907w90.getValue();
        } while (!c4907w90.h(value, str));
        triggerTokenAvailable(true);
        getAsyncTokenStorage().onTokenAvailable();
    }
}
