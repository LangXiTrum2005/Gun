package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgx implements zzfy {
    private final zzfy zza;
    private long zzb;
    private Uri zzc = Uri.EMPTY;
    private Map zzd = Collections.emptyMap();

    public zzgx(zzfy zzfyVar) {
        this.zza = zzfyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        int iZza = this.zza.zza(bArr, i, i2);
        if (iZza != -1) {
            this.zzb += (long) iZza;
        }
        return iZza;
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final long zzb(zzgd zzgdVar) throws IOException {
        this.zzc = zzgdVar.zza;
        this.zzd = Collections.emptyMap();
        try {
            long jZzb = this.zza.zzb(zzgdVar);
            if (zzc() != null) {
            }
            return jZzb;
        } finally {
            Uri uriZzc = zzc();
            if (uriZzc != null) {
                this.zzc = uriZzc;
            }
            this.zzd = zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    @Nullable
    public final Uri zzc() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final Map zze() {
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final void zzf(zzgy zzgyVar) {
        zzgyVar.getClass();
        this.zza.zzf(zzgyVar);
    }

    public final long zzg() {
        return this.zzb;
    }

    public final Uri zzh() {
        return this.zzc;
    }

    public final Map zzi() {
        return this.zzd;
    }
}
