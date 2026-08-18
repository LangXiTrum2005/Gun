package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.base.zaq;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"HandlerLeak"})
final class zac extends zaq {
    final /* synthetic */ GoogleApiAvailability zaa;
    private final Context zab;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zac(GoogleApiAvailability googleApiAvailability, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.zaa = googleApiAvailability;
        this.zab = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 1) {
            return;
        }
        int iIsGooglePlayServicesAvailable = this.zaa.isGooglePlayServicesAvailable(this.zab);
        if (this.zaa.isUserResolvableError(iIsGooglePlayServicesAvailable)) {
            this.zaa.showErrorNotification(this.zab, iIsGooglePlayServicesAvailable);
        }
    }
}
