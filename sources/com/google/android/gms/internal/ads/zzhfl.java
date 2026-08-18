package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhfl extends CustomTabsServiceConnection {
    private final WeakReference zza;

    public zzhfl(zzbdm zzbdmVar) {
        this.zza = new WeakReference(zzbdmVar);
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public final void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
        zzbdm zzbdmVar = (zzbdm) this.zza.get();
        if (zzbdmVar != null) {
            zzbdmVar.zzc(customTabsClient);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzbdm zzbdmVar = (zzbdm) this.zza.get();
        if (zzbdmVar != null) {
            zzbdmVar.zzd();
        }
    }
}
