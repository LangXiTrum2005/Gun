package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabsCallback;

/* JADX INFO: loaded from: classes3.dex */
final class zzbdj extends CustomTabsCallback {
    final /* synthetic */ zzbdk zza;

    public zzbdj(zzbdk zzbdkVar) {
        this.zza = zzbdkVar;
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void onNavigationEvent(int i, @Nullable Bundle bundle) {
        this.zza.zze(i);
    }
}
