package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import androidx.annotation.GuardedBy;
import com.google.android.gms.internal.ads.zzbcl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcb {

    @GuardedBy("this")
    private final Map zza = new HashMap();

    @GuardedBy("this")
    private final List zzb = new ArrayList();
    private final Context zzc;

    public zzcb(Context context) {
        this.zzc = context;
    }

    public final synchronized void zzb(String str) {
        try {
            if (this.zza.containsKey(str)) {
                return;
            }
            SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.zzc) : this.zzc.getSharedPreferences(str, 0);
            zzca zzcaVar = new zzca(this, str);
            this.zza.put(str, zzcaVar);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(zzcaVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void zzc() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkm)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzq();
            Map mapZzw = zzs.zzw((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkr));
            Iterator it = mapZzw.keySet().iterator();
            while (it.hasNext()) {
                zzb((String) it.next());
            }
            zzd(new zzbz(mapZzw));
        }
    }

    public final synchronized void zzd(zzbz zzbzVar) {
        this.zzb.add(zzbzVar);
    }
}
