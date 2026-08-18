package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.internal.ads.zzbga;
import com.google.android.gms.internal.ads.zzbgg;
import com.google.android.gms.internal.ads.zzbhv;
import com.google.android.gms.internal.ads.zzbhw;
import com.google.android.gms.internal.ads.zzbkr;
import com.google.android.gms.internal.ads.zzbpe;
import com.google.android.gms.internal.ads.zzbsx;
import com.google.android.gms.internal.ads.zzbtb;
import com.google.android.gms.internal.ads.zzbte;
import com.google.android.gms.internal.ads.zzbuj;
import com.google.android.gms.internal.ads.zzbwp;
import com.google.android.gms.internal.ads.zzbxb;
import com.google.android.gms.internal.ads.zzbyu;
import com.umeng.ccg.a;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzba {
    private final zzk zza;
    private final zzi zzb;
    private final zzfe zzc;
    private final zzbhv zzd;
    private final zzbtb zze;
    private final zzbhw zzf;
    private zzbuj zzg;
    private final zzl zzh;

    public zzba(zzk zzkVar, zzi zziVar, zzfe zzfeVar, zzbhv zzbhvVar, zzbxb zzbxbVar, zzbtb zzbtbVar, zzbhw zzbhwVar, zzl zzlVar) {
        this.zza = zzkVar;
        this.zzb = zziVar;
        this.zzc = zzfeVar;
        this.zzd = zzbhvVar;
        this.zze = zzbtbVar;
        this.zzf = zzbhwVar;
        this.zzh = zzlVar;
    }

    public static /* bridge */ /* synthetic */ void zzv(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString(a.w, "no_ads_fallback");
        bundle.putString("flow", str);
        zzbc.zzb().zzn(context, zzbc.zzc().afmaVersion, "gmob-apps", bundle, true);
    }

    public final zzbu zzd(Context context, String str, zzbpe zzbpeVar) {
        return (zzbu) new zzar(this, context, str, zzbpeVar).zzd(context, false);
    }

    public final zzby zze(Context context, zzs zzsVar, String str, zzbpe zzbpeVar) {
        return (zzby) new zzan(this, context, zzsVar, str, zzbpeVar).zzd(context, false);
    }

    public final zzby zzf(Context context, zzs zzsVar, String str, zzbpe zzbpeVar) {
        return (zzby) new zzap(this, context, zzsVar, str, zzbpeVar).zzd(context, false);
    }

    public final zzci zzg(Context context, zzbpe zzbpeVar) {
        return (zzci) new zzat(this, context, zzbpeVar).zzd(context, false);
    }

    @Nullable
    public final zzdu zzh(Context context, zzbpe zzbpeVar) {
        return (zzdu) new zzaf(this, context, zzbpeVar).zzd(context, false);
    }

    public final zzbga zzj(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (zzbga) new zzax(this, frameLayout, frameLayout2, context).zzd(context, false);
    }

    public final zzbgg zzk(View view, HashMap map, HashMap map2) {
        return (zzbgg) new zzaz(this, view, map, map2).zzd(view.getContext(), false);
    }

    public final zzbkr zzn(Context context, zzbpe zzbpeVar, OnH5AdsEventListener onH5AdsEventListener) {
        return (zzbkr) new zzal(this, context, zzbpeVar, onH5AdsEventListener).zzd(context, false);
    }

    @Nullable
    public final zzbsx zzo(Context context, zzbpe zzbpeVar) {
        return (zzbsx) new zzaj(this, context, zzbpeVar).zzd(context, false);
    }

    @Nullable
    public final zzbte zzq(Activity activity) {
        zzad zzadVar = new zzad(this, activity);
        Intent intent = activity.getIntent();
        boolean booleanExtra = false;
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            booleanExtra = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        } else {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("useClientJar flag not found in activity intent extras.");
        }
        return (zzbte) zzadVar.zzd(activity, booleanExtra);
    }

    public final zzbwp zzs(Context context, String str, zzbpe zzbpeVar) {
        return (zzbwp) new zzab(this, context, str, zzbpeVar).zzd(context, false);
    }

    @Nullable
    public final zzbyu zzt(Context context, zzbpe zzbpeVar) {
        return (zzbyu) new zzah(this, context, zzbpeVar).zzd(context, false);
    }
}
