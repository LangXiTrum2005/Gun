package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
final class zzbze {
    final /* synthetic */ zzbzf zza;
    private long zzb = -1;
    private long zzc = -1;

    public zzbze(zzbzf zzbzfVar) {
        this.zza = zzbzfVar;
    }

    public final long zza() {
        return this.zzc;
    }

    public final Bundle zzb() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.zzb);
        bundle.putLong("tclose", this.zzc);
        return bundle;
    }

    public final void zzc() {
        this.zzc = this.zza.zza.elapsedRealtime();
    }

    public final void zzd() {
        this.zzb = this.zza.zza.elapsedRealtime();
    }
}
