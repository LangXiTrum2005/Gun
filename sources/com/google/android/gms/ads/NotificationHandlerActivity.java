package com.google.android.gms.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzbpa;
import com.google.android.gms.internal.ads.zzbsx;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public final class NotificationHandlerActivity extends Activity {

    @NonNull
    @KeepForSdk
    public static final String CLASS_NAME = "com.google.android.gms.ads.NotificationHandlerActivity";

    @Override // android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        try {
            zzbsx zzbsxVarZzo = zzbc.zza().zzo(this, new zzbpa());
            if (zzbsxVarZzo == null) {
                zzo.zzg("OfflineUtils is null");
            } else {
                zzbsxVarZzo.zze(getIntent());
            }
        } catch (RemoteException e) {
            zzo.zzg("RemoteException calling handleNotificationIntent: ".concat(e.toString()));
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        finish();
    }
}
