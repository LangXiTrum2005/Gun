package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdbm {
    private final Set zza;
    private final Set zzb;
    private final Set zzc;
    private final Set zzd;
    private final Set zze;
    private final Set zzf;
    private final Set zzg;
    private final Set zzh;
    private final Set zzi;
    private final Set zzj;
    private final Set zzk;
    private final Set zzl;
    private final Set zzm;
    private final Set zzn;

    @Nullable
    private final zzezc zzo;
    private zzcvv zzp;

    public /* synthetic */ zzdbm(zzdbk zzdbkVar, zzdbl zzdblVar) {
        this.zza = zzdbkVar.zzc;
        this.zzb = zzdbkVar.zzd;
        this.zzd = zzdbkVar.zzf;
        this.zze = zzdbkVar.zzg;
        this.zzc = zzdbkVar.zze;
        this.zzf = zzdbkVar.zzh;
        this.zzg = zzdbkVar.zza;
        this.zzh = zzdbkVar.zzi;
        this.zzi = zzdbkVar.zzl;
        this.zzj = zzdbkVar.zzj;
        this.zzk = zzdbkVar.zzk;
        this.zzl = zzdbkVar.zzm;
        this.zzo = zzdbkVar.zzo;
        this.zzm = zzdbkVar.zzn;
        this.zzn = zzdbkVar.zzb;
    }

    public final zzcvv zza(Set set) {
        if (this.zzp == null) {
            this.zzp = new zzcvv(set);
        }
        return this.zzp;
    }

    @Nullable
    public final zzezc zzb() {
        return this.zzo;
    }

    public final Set zzc() {
        return this.zzm;
    }

    public final Set zzd() {
        return this.zza;
    }

    public final Set zze() {
        return this.zzh;
    }

    public final Set zzf() {
        return this.zzi;
    }

    public final Set zzg() {
        return this.zzd;
    }

    public final Set zzh() {
        return this.zzc;
    }

    public final Set zzi() {
        return this.zzf;
    }

    public final Set zzj() {
        return this.zzg;
    }

    public final Set zzk() {
        return this.zzj;
    }

    public final Set zzl() {
        return this.zze;
    }

    public final Set zzm() {
        return this.zzl;
    }

    public final Set zzn() {
        return this.zzn;
    }

    public final Set zzo() {
        return this.zzk;
    }

    public final Set zzp() {
        return this.zzb;
    }
}
