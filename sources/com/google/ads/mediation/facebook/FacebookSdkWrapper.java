package com.google.ads.mediation.facebook;

import com.facebook.ads.internal.settings.AdSdkVersion;

/* JADX INFO: loaded from: classes2.dex */
public final class FacebookSdkWrapper {
    public static final FacebookSdkWrapper INSTANCE = new FacebookSdkWrapper();

    public static final String getSdkVersion() {
        return AdSdkVersion.BUILD;
    }

    public static /* synthetic */ void getSdkVersion$annotations() {
    }
}
