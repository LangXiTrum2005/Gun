package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
final class zzefb implements zzdgc {
    private final zzfbo zza;
    private final zzbrd zzb;
    private final AdFormat zzc;

    @Nullable
    private zzcwl zzd = null;

    public zzefb(zzfbo zzfboVar, zzbrd zzbrdVar, AdFormat adFormat) {
        this.zza = zzfboVar;
        this.zzb = zzbrdVar;
        this.zzc = adFormat;
    }

    @Override // com.google.android.gms.internal.ads.zzdgc
    public final void zza(boolean z, Context context, @Nullable zzcwg zzcwgVar) throws zzdgb {
        boolean zZzs;
        try {
            AdFormat adFormat = AdFormat.BANNER;
            int iOrdinal = this.zzc.ordinal();
            if (iOrdinal == 1) {
                zZzs = this.zzb.zzs(ObjectWrapper.wrap(context));
            } else {
                if (iOrdinal != 2) {
                    if (iOrdinal == 5) {
                        zZzs = this.zzb.zzr(ObjectWrapper.wrap(context));
                    }
                    throw new zzdgb("Adapter failed to show.");
                }
                zZzs = this.zzb.zzt(ObjectWrapper.wrap(context));
            }
            if (zZzs) {
                zzcwl zzcwlVar = this.zzd;
                if (zzcwlVar == null) {
                    return;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzbE)).booleanValue() || this.zza.zzY != 2) {
                    return;
                }
                zzcwlVar.zza();
                return;
            }
            throw new zzdgb("Adapter failed to show.");
        } catch (Throwable th) {
            throw new zzdgb(th);
        }
    }

    public final void zzb(zzcwl zzcwlVar) {
        this.zzd = zzcwlVar;
    }
}
