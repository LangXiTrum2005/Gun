package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfcj {

    @Nullable
    public final com.google.android.gms.ads.internal.client.zzga zza;

    @Nullable
    public final zzblz zzb;

    @Nullable
    public final zzekn zzc;
    public final com.google.android.gms.ads.internal.client.zzm zzd;
    public final com.google.android.gms.ads.internal.client.zzs zze;
    public final String zzf;
    public final ArrayList zzg;
    public final ArrayList zzh;

    @Nullable
    public final zzbfl zzi;
    public final com.google.android.gms.ads.internal.client.zzy zzj;
    public final int zzk;
    public final AdManagerAdViewOptions zzl;
    public final PublisherAdViewOptions zzm;

    @Nullable
    public final com.google.android.gms.ads.internal.client.zzcm zzn;
    public final zzfbw zzo;
    public final boolean zzp;
    public final boolean zzq;
    public final boolean zzr;
    public final Bundle zzs;

    @Nullable
    public final com.google.android.gms.ads.internal.client.zzcq zzt;

    public /* synthetic */ zzfcj(zzfch zzfchVar, zzfci zzfciVar) {
        this.zze = zzfchVar.zzb;
        this.zzf = zzfchVar.zzc;
        this.zzt = zzfchVar.zzu;
        int i = zzfchVar.zza.zza;
        long j = zzfchVar.zza.zzb;
        Bundle bundle = zzfchVar.zza.zzc;
        int i2 = zzfchVar.zza.zzd;
        List list = zzfchVar.zza.zze;
        boolean z = zzfchVar.zza.zzf;
        int i3 = zzfchVar.zza.zzg;
        boolean z2 = true;
        if (!zzfchVar.zza.zzh && !zzfchVar.zze) {
            z2 = false;
        }
        this.zzd = new com.google.android.gms.ads.internal.client.zzm(i, j, bundle, i2, list, z, i3, z2, zzfchVar.zza.zzi, zzfchVar.zza.zzj, zzfchVar.zza.zzk, zzfchVar.zza.zzl, zzfchVar.zza.zzm, zzfchVar.zza.zzn, zzfchVar.zza.zzo, zzfchVar.zza.zzp, zzfchVar.zza.zzq, zzfchVar.zza.zzr, zzfchVar.zza.zzs, zzfchVar.zza.zzt, zzfchVar.zza.zzu, zzfchVar.zza.zzv, com.google.android.gms.ads.internal.util.zzs.zza(zzfchVar.zza.zzw), zzfchVar.zza.zzx, zzfchVar.zza.zzy, zzfchVar.zza.zzz);
        this.zza = zzfchVar.zzd != null ? zzfchVar.zzd : zzfchVar.zzh != null ? zzfchVar.zzh.zzf : null;
        this.zzg = zzfchVar.zzf;
        this.zzh = zzfchVar.zzg;
        this.zzi = zzfchVar.zzf == null ? null : zzfchVar.zzh == null ? new zzbfl(new NativeAdOptions.Builder().build()) : zzfchVar.zzh;
        this.zzj = zzfchVar.zzi;
        this.zzk = zzfchVar.zzm;
        this.zzl = zzfchVar.zzj;
        this.zzm = zzfchVar.zzk;
        this.zzn = zzfchVar.zzl;
        this.zzb = zzfchVar.zzn;
        this.zzo = new zzfbw(zzfchVar.zzo, null);
        this.zzp = zzfchVar.zzp;
        this.zzq = zzfchVar.zzq;
        this.zzc = zzfchVar.zzr;
        this.zzr = zzfchVar.zzs;
        this.zzs = zzfchVar.zzt;
    }

    @Nullable
    public final zzbhn zza() {
        PublisherAdViewOptions publisherAdViewOptions = this.zzm;
        if (publisherAdViewOptions == null && this.zzl == null) {
            return null;
        }
        return publisherAdViewOptions != null ? publisherAdViewOptions.zzb() : this.zzl.zza();
    }

    public final boolean zzb() {
        return this.zzf.matches((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdn));
    }
}
