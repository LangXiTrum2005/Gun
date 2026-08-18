package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbtv {
    private static zzbyu zza;
    private final Context zzb;
    private final AdFormat zzc;

    @Nullable
    private final com.google.android.gms.ads.internal.client.zzei zzd;

    @Nullable
    private final String zze;

    public zzbtv(Context context, AdFormat adFormat, @Nullable com.google.android.gms.ads.internal.client.zzei zzeiVar, @Nullable String str) {
        this.zzb = context;
        this.zzc = adFormat;
        this.zzd = zzeiVar;
        this.zze = str;
    }

    @Nullable
    public static zzbyu zza(Context context) {
        zzbyu zzbyuVar;
        synchronized (zzbtv.class) {
            try {
                if (zza == null) {
                    zza = com.google.android.gms.ads.internal.client.zzbc.zza().zzt(context, new zzbpa());
                }
                zzbyuVar = zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbyuVar;
    }

    public final void zzb(QueryInfoGenerationCallback queryInfoGenerationCallback) {
        com.google.android.gms.ads.internal.client.zzm zzmVarZza;
        long jCurrentTimeMillis = System.currentTimeMillis();
        zzbyu zzbyuVarZza = zza(this.zzb);
        if (zzbyuVarZza == null) {
            queryInfoGenerationCallback.onFailure("Internal Error, query info generator is null.");
            return;
        }
        Context context = this.zzb;
        com.google.android.gms.ads.internal.client.zzei zzeiVar = this.zzd;
        IObjectWrapper iObjectWrapperWrap = ObjectWrapper.wrap(context);
        if (zzeiVar == null) {
            com.google.android.gms.ads.internal.client.zzn zznVar = new com.google.android.gms.ads.internal.client.zzn();
            zznVar.zzg(jCurrentTimeMillis);
            zzmVarZza = zznVar.zza();
        } else {
            zzeiVar.zzq(jCurrentTimeMillis);
            zzmVarZza = com.google.android.gms.ads.internal.client.zzr.zza.zza(this.zzb, this.zzd);
        }
        try {
            zzbyuVarZza.zzf(iObjectWrapperWrap, new zzbyy(this.zze, this.zzc.name(), null, zzmVarZza, 0, null), new zzbtu(this, queryInfoGenerationCallback));
        } catch (RemoteException unused) {
            queryInfoGenerationCallback.onFailure("Internal Error.");
        }
    }
}
