package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzgcd;

/* JADX INFO: loaded from: classes2.dex */
final class zzat implements zzgcd {
    final /* synthetic */ zzau zza;

    public zzat(zzau zzauVar) {
        this.zza = zzauVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        zzaa.zzd(this.zza.zzp, null, "sgf", new Pair("sgf_reason", th.getMessage()), new Pair("se", "query_g"), new Pair("ad_format", AdFormat.BANNER.name()), new Pair("rtype", Integer.toString(6)), new Pair("scar", "true"), new Pair("sgi_rn", Integer.toString(this.zza.zzH.get())));
        com.google.android.gms.ads.internal.util.client.zzo.zzh("Failed to initialize webview for loading SDKCore. ", th);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjB)).booleanValue() || this.zza.zzG.get() || this.zza.zzH.getAndIncrement() >= ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjC)).intValue()) {
            return;
        }
        this.zza.zzT();
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final /* bridge */ /* synthetic */ void zzb(@Nullable Object obj) {
        com.google.android.gms.ads.internal.util.client.zzo.zze("Initialized webview successfully for SDKCore.");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjB)).booleanValue()) {
            zzaa.zzd(this.zza.zzp, null, "sgs", new Pair("se", "query_g"), new Pair("ad_format", AdFormat.BANNER.name()), new Pair("rtype", Integer.toString(6)), new Pair("scar", "true"), new Pair("sgi_rn", Integer.toString(this.zza.zzH.get())));
            this.zza.zzG.set(true);
        }
    }
}
