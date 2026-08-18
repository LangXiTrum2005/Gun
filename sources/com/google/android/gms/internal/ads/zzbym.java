package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes3.dex */
final class zzbym implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ zzbyn zza;
    private final String zzb;

    public zzbym(zzbyn zzbynVar, String str) {
        this.zza = zzbynVar;
        this.zzb = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        synchronized (this.zza) {
            try {
                for (zzbyl zzbylVar : this.zza.zzb) {
                    zzbylVar.zza.zzb(zzbylVar.zzb, sharedPreferences, this.zzb, str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
