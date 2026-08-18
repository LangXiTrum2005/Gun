package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class zzflp {

    @SuppressLint({"StaticFieldLeak"})
    private static final zzflp zza = new zzflp();
    private Context zzb;

    private zzflp() {
    }

    public static zzflp zzb() {
        return zza;
    }

    public final Context zza() {
        return this.zzb;
    }

    public final void zzc(Context context) {
        this.zzb = context != null ? context.getApplicationContext() : null;
    }
}
