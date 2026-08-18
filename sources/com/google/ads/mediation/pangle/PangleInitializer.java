package com.google.ads.mediation.pangle;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bytedance.sdk.openadsdk.api.init.PAGConfig;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.google.android.gms.ads.AdError;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class PangleInitializer implements PAGSdk.PAGInitCallback {
    public static PangleInitializer f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f770a;
    public boolean b;
    public final ArrayList c;
    public final PangleSdkWrapper d;
    public final PangleFactory e;

    public interface Listener {
        void onInitializeError(@NonNull AdError adError);

        void onInitializeSuccess();
    }

    public PangleInitializer() {
        this.f770a = false;
        this.b = false;
        this.c = new ArrayList();
        this.d = new PangleSdkWrapper();
        this.e = new PangleFactory();
    }

    @NonNull
    public static PangleInitializer getInstance() {
        if (f == null) {
            f = new PangleInitializer();
        }
        return f;
    }

    @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
    public void fail(int i, @NonNull String str) {
        this.f770a = false;
        this.b = false;
        AdError adErrorCreateSdkError = PangleConstants.createSdkError(i, str);
        ArrayList arrayList = this.c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Listener) it.next()).onInitializeError(adErrorCreateSdkError);
        }
        arrayList.clear();
    }

    public void initialize(@NonNull Context context, @NonNull String str, @NonNull Listener listener) {
        if (TextUtils.isEmpty(str)) {
            AdError adErrorCreateAdapterError = PangleConstants.createAdapterError(101, "Failed to initialize Pangle SDK. Missing or invalid App ID.");
            adErrorCreateAdapterError.toString();
            listener.onInitializeError(adErrorCreateAdapterError);
            return;
        }
        boolean z = this.f770a;
        ArrayList arrayList = this.c;
        if (z) {
            arrayList.add(listener);
            return;
        }
        if (this.b) {
            listener.onInitializeSuccess();
            return;
        }
        this.f770a = true;
        arrayList.add(listener);
        this.e.getClass();
        this.d.init(context, new PAGConfig.Builder().appId(str).setChildDirected(PanglePrivacyConfig.getCoppa()).setGDPRConsent(PangleMediationAdapter.getGDPRConsent()).setDoNotSell(PangleMediationAdapter.getDoNotSell()).setUserData("[{\"name\":\"mediation\",\"value\":\"google\"},{\"name\":\"adapter_version\",\"value\":\"6.5.0.4.0\"}]").build(), this);
    }

    @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
    public void success() {
        this.f770a = false;
        this.b = true;
        ArrayList arrayList = this.c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Listener) it.next()).onInitializeSuccess();
        }
        arrayList.clear();
    }

    @VisibleForTesting
    public PangleInitializer(PangleSdkWrapper pangleSdkWrapper, PangleFactory pangleFactory) {
        this.f770a = false;
        this.b = false;
        this.c = new ArrayList();
        this.d = pangleSdkWrapper;
        this.e = pangleFactory;
    }
}
