package com.google.android.gms.internal.ads;

import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
final class zzzh implements zzabh {
    private final zzaal zza;
    private final zzaaq zzb;
    private zzab zzc = new zzz().zzag();

    public zzzh(zzaal zzaalVar, zzaaq zzaaqVar) {
        this.zza = zzaalVar;
        this.zzb = zzaaqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final Surface zza() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzb() {
        this.zza.zzm(null);
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzc() {
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzd(boolean z) {
        if (z) {
            this.zza.zzi();
        }
        this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zze(zzab zzabVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzf(boolean z) {
        this.zza.zzc(z);
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzg(int i, zzab zzabVar) {
        zzab zzabVar2 = this.zzc;
        int i2 = zzabVar2.zzv;
        int i3 = zzabVar.zzv;
        if (i3 != i2 || zzabVar.zzw != zzabVar2.zzw) {
            this.zzb.zzb(i3, zzabVar.zzw);
        }
        float f = zzabVar.zzx;
        if (f != this.zzc.zzx) {
            this.zza.zzl(f);
        }
        this.zzc = zzabVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzh() {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzi(boolean z) {
        this.zza.zze(z);
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzj() {
        this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzk() {
        this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzl() {
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzm(long j, long j2) throws zzabg {
        try {
            this.zzb.zzd(j, j2);
        } catch (zzib e) {
            throw new zzabg(e, this.zzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzn(int i) {
        this.zza.zzj(i);
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzo(zzabe zzabeVar, Executor executor) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzp(Surface surface, zzdz zzdzVar) {
        this.zza.zzm(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzq(float f) {
        this.zza.zzn(f);
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzr(long j, long j2, long j3, long j4) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzs(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzt(zzaai zzaaiVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final boolean zzu(long j, boolean z, long j2, long j3, zzabf zzabfVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final boolean zzv() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final boolean zzw() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final boolean zzx(boolean z) {
        return this.zza.zzo(z);
    }
}
