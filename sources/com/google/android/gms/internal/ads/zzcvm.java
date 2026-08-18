package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.List;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcvm extends com.google.android.gms.ads.internal.client.zzdx {
    private final String zza;

    @Nullable
    private final String zzb;
    private final String zzc;

    @Nullable
    private final String zzd;
    private final List zze;
    private final long zzf;
    private final String zzg;

    @Nullable
    private final zzedb zzh;
    private final Bundle zzi;

    public zzcvm(@Nullable zzfbo zzfboVar, String str, zzedb zzedbVar, @Nullable zzfbr zzfbrVar, String str2) {
        String string = null;
        this.zzb = zzfboVar == null ? null : zzfboVar.zzab;
        this.zzc = str2;
        this.zzd = zzfbrVar == null ? null : zzfbrVar.zzb;
        if (("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) && zzfboVar != null) {
            try {
                string = zzfboVar.zzv.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.zza = string != null ? string : str;
        this.zze = zzedbVar.zzc();
        this.zzh = zzedbVar;
        this.zzf = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() / 1000;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgE)).booleanValue() || zzfbrVar == null) {
            this.zzi = new Bundle();
        } else {
            this.zzi = zzfbrVar.zzk;
        }
        this.zzg = (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzje)).booleanValue() || zzfbrVar == null || TextUtils.isEmpty(zzfbrVar.zzi)) ? "" : zzfbrVar.zzi;
    }

    public final long zzc() {
        return this.zzf;
    }

    public final String zzd() {
        return this.zzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final Bundle zze() {
        return this.zzi;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzw zzf() {
        zzedb zzedbVar = this.zzh;
        if (zzedbVar != null) {
            return zzedbVar.zza();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final String zzg() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final String zzh() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    @Nullable
    public final String zzi() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final List zzj() {
        return this.zze;
    }

    @Nullable
    public final String zzk() {
        return this.zzd;
    }
}
