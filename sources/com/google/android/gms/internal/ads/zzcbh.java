package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcbh {
    private final Context zza;
    private final zzcbs zzb;
    private final ViewGroup zzc;
    private zzcbg zzd;

    public zzcbh(Context context, ViewGroup viewGroup, zzcex zzcexVar) {
        this.zza = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzc = viewGroup;
        this.zzb = zzcexVar;
        this.zzd = null;
    }

    public final zzcbg zza() {
        return this.zzd;
    }

    @Nullable
    public final Integer zzb() {
        zzcbg zzcbgVar = this.zzd;
        if (zzcbgVar != null) {
            return zzcbgVar.zzl();
        }
        return null;
    }

    public final void zzc(int i, int i2, int i3, int i4) {
        Preconditions.checkMainThread("The underlay may only be modified from the UI thread.");
        zzcbg zzcbgVar = this.zzd;
        if (zzcbgVar != null) {
            zzcbgVar.zzF(i, i2, i3, i4);
        }
    }

    public final void zzd(int i, int i2, int i3, int i4, int i5, boolean z, zzcbr zzcbrVar) {
        if (this.zzd != null) {
            return;
        }
        zzbcs.zza(this.zzb.zzm().zza(), this.zzb.zzk(), "vpr2");
        Context context = this.zza;
        zzcbs zzcbsVar = this.zzb;
        zzcbg zzcbgVar = new zzcbg(context, zzcbsVar, i5, z, zzcbsVar.zzm().zza(), zzcbrVar);
        this.zzd = zzcbgVar;
        this.zzc.addView(zzcbgVar, 0, new ViewGroup.LayoutParams(-1, -1));
        this.zzd.zzF(i, i2, i3, i4);
        this.zzb.zzz(false);
    }

    public final void zze() {
        Preconditions.checkMainThread("onDestroy must be called from the UI thread.");
        zzcbg zzcbgVar = this.zzd;
        if (zzcbgVar != null) {
            zzcbgVar.zzo();
            this.zzc.removeView(this.zzd);
            this.zzd = null;
        }
    }

    public final void zzf() {
        Preconditions.checkMainThread("onPause must be called from the UI thread.");
        zzcbg zzcbgVar = this.zzd;
        if (zzcbgVar != null) {
            zzcbgVar.zzu();
        }
    }

    public final void zzg(int i) {
        zzcbg zzcbgVar = this.zzd;
        if (zzcbgVar != null) {
            zzcbgVar.zzC(i);
        }
    }
}
