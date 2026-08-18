package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzci;
import com.google.android.gms.internal.ads.zzbpa;

/* JADX INFO: loaded from: classes2.dex */
public final class zzb {
    private static volatile zzci zza;

    private zzb() {
    }

    public static zzci zza(Context context) {
        if (zza == null) {
            synchronized (zzb.class) {
                try {
                    if (zza == null) {
                        zza = zzbc.zza().zzg(context.getApplicationContext(), new zzbpa());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zza;
    }
}
