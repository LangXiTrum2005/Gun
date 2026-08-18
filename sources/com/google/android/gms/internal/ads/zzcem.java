package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.Nullable;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcem extends zzcay {
    private final zzcbt zzc;

    @Nullable
    private zzcen zzd;
    private Uri zze;
    private zzcax zzf;
    private boolean zzg;
    private int zzh;

    public zzcem(Context context, zzcbt zzcbtVar) {
        super(context);
        this.zzh = 1;
        this.zzg = false;
        this.zzc = zzcbtVar;
        zzcbtVar.zza(this);
    }

    private final boolean zzm() {
        int i = this.zzh;
        return (i == 1 || i == 2 || this.zzd == null) ? false : true;
    }

    private final void zzv(int i) {
        if (i == 4) {
            this.zzc.zzc();
            this.zzb.zzb();
        } else if (this.zzh == 4) {
            this.zzc.zze();
            this.zzb.zzc();
        }
        this.zzh = i;
    }

    @Override // android.view.View
    public final String toString() {
        return DM.i(zzcem.class.getName(), "@", Integer.toHexString(hashCode()));
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final int zzb() {
        return zzm() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final int zzc() {
        return zzm() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final int zzd() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final int zze() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final long zzf() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final long zzg() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final long zzh() {
        return 0L;
    }

    public final /* synthetic */ void zzi() {
        zzcax zzcaxVar = this.zzf;
        if (zzcaxVar != null) {
            zzcaxVar.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final String zzj() {
        return "ImmersivePlayer";
    }

    public final /* synthetic */ void zzk() {
        zzcax zzcaxVar = this.zzf;
        if (zzcaxVar != null) {
            if (!this.zzg) {
                zzcaxVar.zzg();
                this.zzg = true;
            }
            this.zzf.zze();
        }
    }

    public final /* synthetic */ void zzl() {
        zzcax zzcaxVar = this.zzf;
        if (zzcaxVar != null) {
            zzcaxVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcay, com.google.android.gms.internal.ads.zzcbv
    public final void zzn() {
        if (this.zzd != null) {
            this.zzb.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void zzo() {
        com.google.android.gms.ads.internal.util.zze.zza("AdImmersivePlayerView pause");
        if (zzm() && this.zzd.zzd()) {
            this.zzd.zza();
            zzv(5);
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcel
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzi();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void zzp() {
        com.google.android.gms.ads.internal.util.zze.zza("AdImmersivePlayerView play");
        if (zzm()) {
            this.zzd.zzb();
            zzv(4);
            this.zza.zzb();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcek
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzk();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void zzq(int i) {
        com.google.android.gms.ads.internal.util.zze.zza("AdImmersivePlayerView seek " + i);
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void zzr(zzcax zzcaxVar) {
        this.zzf = zzcaxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void zzs(@Nullable String str) {
        if (str != null) {
            Uri uri = Uri.parse(str);
            this.zze = uri;
            this.zzd = new zzcen(uri.toString());
            zzv(3);
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcej
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzl();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void zzt() {
        com.google.android.gms.ads.internal.util.zze.zza("AdImmersivePlayerView stop");
        zzcen zzcenVar = this.zzd;
        if (zzcenVar != null) {
            zzcenVar.zzc();
            this.zzd = null;
            zzv(1);
        }
        this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void zzu(float f, float f2) {
    }
}
