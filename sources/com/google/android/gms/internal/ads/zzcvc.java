package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcvc {
    private final Context zza;
    private final zzfcj zzb;
    private final Bundle zzc;

    @Nullable
    private final zzfcb zzd;

    @Nullable
    private final zzcut zze;

    @Nullable
    private final zzedb zzf;
    private final int zzg;

    public /* synthetic */ zzcvc(zzcva zzcvaVar, zzcvb zzcvbVar) {
        this.zza = zzcvaVar.zza;
        this.zzb = zzcvaVar.zzb;
        this.zzc = zzcvaVar.zzc;
        this.zzd = zzcvaVar.zzd;
        this.zze = zzcvaVar.zze;
        this.zzf = zzcvaVar.zzf;
        this.zzg = zzcvaVar.zzg;
    }

    public final int zza() {
        return this.zzg;
    }

    public final Context zzb(Context context) {
        return this.zza;
    }

    @Nullable
    public final Bundle zzc() {
        return this.zzc;
    }

    @Nullable
    public final zzcut zzd() {
        return this.zze;
    }

    public final zzcva zze() {
        zzcva zzcvaVar = new zzcva();
        zzcvaVar.zzf(this.zza);
        zzcvaVar.zzk(this.zzb);
        zzcvaVar.zzg(this.zzc);
        zzcvaVar.zzh(this.zze);
        zzcvaVar.zze(this.zzf);
        return zzcvaVar;
    }

    public final zzedb zzf(String str) {
        zzedb zzedbVar = this.zzf;
        return zzedbVar != null ? zzedbVar : new zzedb(str);
    }

    @Nullable
    public final zzfcb zzg() {
        return this.zzd;
    }

    public final zzfcj zzh() {
        return this.zzb;
    }
}
