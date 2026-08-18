package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
final class zzjl implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, zzabc, zzpf, zzwm, zzte, zzhp, zzhk {
    public static final /* synthetic */ int zzb = 0;
    final /* synthetic */ zzjp zza;

    public /* synthetic */ zzjl(zzjp zzjpVar, zzjo zzjoVar) {
        this.zza = zzjpVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        zzjp.zzK(this.zza, surfaceTexture);
        this.zza.zzZ(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.zza.zzac(null);
        this.zza.zzZ(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.zza.zzZ(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.zza.zzZ(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.zza.zzZ(0, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzpf
    public final void zza(Exception exc) {
        this.zza.zzq.zzv(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzpf
    public final void zzb(String str, long j, long j2) {
        this.zza.zzq.zzw(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzpf
    public final void zzc(String str) {
        this.zza.zzq.zzx(str);
    }

    @Override // com.google.android.gms.internal.ads.zzpf
    public final void zzd(zzhs zzhsVar) {
        this.zza.zzq.zzy(zzhsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpf
    public final void zze(zzhs zzhsVar) {
        this.zza.zzq.zzz(zzhsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpf
    public final void zzf(zzab zzabVar, @Nullable zzht zzhtVar) {
        this.zza.zzq.zzA(zzabVar, zzhtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpf
    public final void zzg(long j) {
        this.zza.zzq.zzB(j);
    }

    @Override // com.google.android.gms.internal.ads.zzpf
    public final void zzh(Exception exc) {
        this.zza.zzq.zzC(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzpf
    public final void zzi(zzpg zzpgVar) {
        this.zza.zzq.zzD(zzpgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpf
    public final void zzj(zzpg zzpgVar) {
        this.zza.zzq.zzE(zzpgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpf
    public final void zzk(int i, long j, long j2) {
        this.zza.zzq.zzF(i, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzl(int i, long j) {
        this.zza.zzq.zzG(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzm(Object obj, long j) {
        this.zza.zzq.zzH(obj, j);
        zzjp zzjpVar = this.zza;
        if (zzjpVar.zzF == obj) {
            zzdn zzdnVar = zzjpVar.zzl;
            zzdnVar.zzd(26, new zzdk() { // from class: com.google.android.gms.internal.ads.zzjk
                @Override // com.google.android.gms.internal.ads.zzdk
                public final void zza(Object obj2) {
                }
            });
            zzdnVar.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpf
    public final void zzn(final boolean z) {
        zzjp zzjpVar = this.zza;
        if (zzjpVar.zzM == z) {
            return;
        }
        zzjpVar.zzM = z;
        zzdn zzdnVar = this.zza.zzl;
        zzdnVar.zzd(23, new zzdk() { // from class: com.google.android.gms.internal.ads.zzji
            @Override // com.google.android.gms.internal.ads.zzdk
            public final void zza(Object obj) {
                ((zzbh) obj).zzn(z);
            }
        });
        zzdnVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzo(Exception exc) {
        this.zza.zzq.zzJ(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzp(String str, long j, long j2) {
        this.zza.zzq.zzK(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzq(String str) {
        this.zza.zzq.zzL(str);
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzr(zzhs zzhsVar) {
        this.zza.zzq.zzM(zzhsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzs(zzhs zzhsVar) {
        this.zza.zzq.zzN(zzhsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzt(long j, int i) {
        this.zza.zzq.zzO(j, i);
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzu(zzab zzabVar, @Nullable zzht zzhtVar) {
        this.zza.zzq.zzP(zzabVar, zzhtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabc
    public final void zzv(final zzcd zzcdVar) {
        zzdn zzdnVar = this.zza.zzl;
        zzdnVar.zzd(25, new zzdk() { // from class: com.google.android.gms.internal.ads.zzjj
            @Override // com.google.android.gms.internal.ads.zzdk
            public final void zza(Object obj) {
                ((zzbh) obj).zzr(zzcdVar);
            }
        });
        zzdnVar.zzc();
    }
}
