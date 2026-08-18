package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
public final class zzbnx {
    private final Object zza = new Object();
    private final Object zzb = new Object();
    private zzbog zzc;
    private zzbog zzd;

    private static final Context zzc(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public final zzbog zza(Context context, VersionInfoParcel versionInfoParcel, @Nullable zzfhk zzfhkVar) {
        zzbog zzbogVar;
        synchronized (this.zza) {
            try {
                if (this.zzc == null) {
                    this.zzc = new zzbog(zzc(context), versionInfoParcel, (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zza), zzfhkVar);
                }
                zzbogVar = this.zzc;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbogVar;
    }

    public final zzbog zzb(Context context, VersionInfoParcel versionInfoParcel, zzfhk zzfhkVar) {
        zzbog zzbogVar;
        synchronized (this.zzb) {
            try {
                if (this.zzd == null) {
                    this.zzd = new zzbog(zzc(context), versionInfoParcel, (String) zzbev.zza.zze(), zzfhkVar);
                }
                zzbogVar = this.zzd;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbogVar;
    }
}
