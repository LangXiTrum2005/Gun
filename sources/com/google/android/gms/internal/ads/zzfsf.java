package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfsf {
    @SuppressLint({"RestrictedApi"})
    public static zzfse zza(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return new zzfsg(new zzfsw(context));
    }
}
