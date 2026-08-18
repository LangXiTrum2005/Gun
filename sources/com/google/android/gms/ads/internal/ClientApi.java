package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.client.zzci;
import com.google.android.gms.ads.internal.client.zzco;
import com.google.android.gms.ads.internal.client.zzcz;
import com.google.android.gms.ads.internal.client.zzdu;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzab;
import com.google.android.gms.ads.internal.overlay.zzaf;
import com.google.android.gms.ads.internal.overlay.zzah;
import com.google.android.gms.ads.internal.overlay.zzai;
import com.google.android.gms.ads.internal.overlay.zzw;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbga;
import com.google.android.gms.internal.ads.zzbgg;
import com.google.android.gms.internal.ads.zzbko;
import com.google.android.gms.internal.ads.zzbkr;
import com.google.android.gms.internal.ads.zzbpe;
import com.google.android.gms.internal.ads.zzbsx;
import com.google.android.gms.internal.ads.zzbte;
import com.google.android.gms.internal.ads.zzbvz;
import com.google.android.gms.internal.ads.zzbwp;
import com.google.android.gms.internal.ads.zzbyu;
import com.google.android.gms.internal.ads.zzcgx;
import com.google.android.gms.internal.ads.zzdiz;
import com.google.android.gms.internal.ads.zzdjb;
import com.google.android.gms.internal.ads.zzdtg;
import com.google.android.gms.internal.ads.zzejq;
import com.google.android.gms.internal.ads.zzewo;
import com.google.android.gms.internal.ads.zzeyc;
import com.google.android.gms.internal.ads.zzezt;
import com.google.android.gms.internal.ads.zzfbh;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class ClientApi extends zzco {
    @KeepForSdk
    public ClientApi() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzbu zzb(IObjectWrapper iObjectWrapper, String str, zzbpe zzbpeVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        return new zzejq(zzcgx.zzb(context, zzbpeVar, i), context, str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzby zzc(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzs zzsVar, String str, zzbpe zzbpeVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzewo zzewoVarZzt = zzcgx.zzb(context, zzbpeVar, i).zzt();
        zzewoVarZzt.zza(str);
        zzewoVarZzt.zzb(context);
        return zzewoVarZzt.zzc().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzby zzd(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzs zzsVar, String str, zzbpe zzbpeVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzeyc zzeycVarZzu = zzcgx.zzb(context, zzbpeVar, i).zzu();
        zzeycVarZzu.zzc(context);
        zzeycVarZzu.zza(zzsVar);
        zzeycVarZzu.zzb(str);
        return zzeycVarZzu.zzd().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzby zze(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzs zzsVar, String str, zzbpe zzbpeVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzezt zzeztVarZzv = zzcgx.zzb(context, zzbpeVar, i).zzv();
        zzeztVarZzv.zzc(context);
        zzeztVarZzv.zza(zzsVar);
        zzeztVarZzv.zzb(str);
        return zzeztVarZzv.zzd().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzby zzf(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzs zzsVar, String str, int i) {
        return new zzu((Context) ObjectWrapper.unwrap(iObjectWrapper), zzsVar, str, new VersionInfoParcel(244410000, i, true, false));
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzci zzg(IObjectWrapper iObjectWrapper, zzbpe zzbpeVar, int i) {
        return zzcgx.zzb((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbpeVar, i).zzA();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzcz zzh(IObjectWrapper iObjectWrapper, int i) {
        return zzcgx.zzb((Context) ObjectWrapper.unwrap(iObjectWrapper), null, i).zzc();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzdu zzi(IObjectWrapper iObjectWrapper, zzbpe zzbpeVar, int i) {
        return zzcgx.zzb((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbpeVar, i).zzm();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzbga zzj(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        return new zzdjb((FrameLayout) ObjectWrapper.unwrap(iObjectWrapper), (FrameLayout) ObjectWrapper.unwrap(iObjectWrapper2), 244410000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzbgg zzk(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        return new zzdiz((View) ObjectWrapper.unwrap(iObjectWrapper), (HashMap) ObjectWrapper.unwrap(iObjectWrapper2), (HashMap) ObjectWrapper.unwrap(iObjectWrapper3));
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzbkr zzl(IObjectWrapper iObjectWrapper, zzbpe zzbpeVar, int i, zzbko zzbkoVar) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzdtg zzdtgVarZzk = zzcgx.zzb(context, zzbpeVar, i).zzk();
        zzdtgVarZzk.zzb(context);
        zzdtgVarZzk.zza(zzbkoVar);
        return zzdtgVarZzk.zzc().zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzbsx zzm(IObjectWrapper iObjectWrapper, zzbpe zzbpeVar, int i) {
        return zzcgx.zzb((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbpeVar, i).zzn();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzbte zzn(IObjectWrapper iObjectWrapper) {
        Activity activity = (Activity) ObjectWrapper.unwrap(iObjectWrapper);
        AdOverlayInfoParcel adOverlayInfoParcelZza = AdOverlayInfoParcel.zza(activity.getIntent());
        if (adOverlayInfoParcelZza == null) {
            return new zzw(activity);
        }
        int i = adOverlayInfoParcelZza.zzk;
        if (i == 1) {
            return new com.google.android.gms.ads.internal.overlay.zzv(activity);
        }
        if (i == 2) {
            return new zzah(activity);
        }
        if (i == 3) {
            return new zzai(activity);
        }
        if (i != 4) {
            return i != 5 ? new zzw(activity) : new zzaf(activity);
        }
        return new zzab(activity, adOverlayInfoParcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzbvz zzo(IObjectWrapper iObjectWrapper, zzbpe zzbpeVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfbh zzfbhVarZzw = zzcgx.zzb(context, zzbpeVar, i).zzw();
        zzfbhVarZzw.zzb(context);
        return zzfbhVarZzw.zzc().zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzbwp zzp(IObjectWrapper iObjectWrapper, String str, zzbpe zzbpeVar, int i) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzfbh zzfbhVarZzw = zzcgx.zzb(context, zzbpeVar, i).zzw();
        zzfbhVarZzw.zzb(context);
        zzfbhVarZzw.zza(str);
        return zzfbhVarZzw.zzc().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzbyu zzq(IObjectWrapper iObjectWrapper, zzbpe zzbpeVar, int i) {
        return zzcgx.zzb((Context) ObjectWrapper.unwrap(iObjectWrapper), zzbpeVar, i).zzq();
    }
}
