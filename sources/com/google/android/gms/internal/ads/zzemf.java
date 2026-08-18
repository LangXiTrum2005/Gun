package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;

/* JADX INFO: loaded from: classes3.dex */
public final class zzemf implements zzetr {
    private final zzetr zza;
    private final zzfcj zzb;
    private final Context zzc;
    private final zzbzm zzd;

    public zzemf(zzeoj zzeojVar, zzfcj zzfcjVar, Context context, zzbzm zzbzmVar) {
        this.zza = zzeojVar;
        this.zzb = zzfcjVar;
        this.zzc = context;
        this.zzd = zzbzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 7;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final AI zzb() {
        return zzgch.zzm(this.zza.zzb(), new zzfuc() { // from class: com.google.android.gms.internal.ads.zzeme
            @Override // com.google.android.gms.internal.ads.zzfuc
            public final Object apply(Object obj) {
                return this.zza.zzc((zzeua) obj);
            }
        }, zzbzw.zzg);
    }

    public final /* synthetic */ zzemg zzc(zzeua zzeuaVar) {
        String str;
        boolean z;
        String strZzj;
        int i;
        float f;
        int i2;
        int i3;
        DisplayMetrics displayMetrics;
        com.google.android.gms.ads.internal.client.zzs zzsVar = this.zzb.zze;
        com.google.android.gms.ads.internal.client.zzs[] zzsVarArr = zzsVar.zzg;
        if (zzsVarArr != null) {
            str = null;
            boolean z2 = false;
            boolean z3 = false;
            z = false;
            for (com.google.android.gms.ads.internal.client.zzs zzsVar2 : zzsVarArr) {
                boolean z4 = zzsVar2.zzi;
                if (!z4 && !z2) {
                    str = zzsVar2.zza;
                    z2 = true;
                }
                if (z4) {
                    if (z3) {
                        z3 = true;
                    } else {
                        z3 = true;
                        z = true;
                    }
                }
                if (z2 && z3) {
                    break;
                }
            }
        } else {
            str = zzsVar.zza;
            z = zzsVar.zzi;
        }
        Resources resources = this.zzc.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            strZzj = null;
            i = 0;
            f = 0.0f;
            i2 = 0;
        } else {
            zzbzm zzbzmVar = this.zzd;
            f = displayMetrics.density;
            i2 = displayMetrics.widthPixels;
            i = displayMetrics.heightPixels;
            strZzj = zzbzmVar.zzi().zzj();
        }
        StringBuilder sb = new StringBuilder();
        com.google.android.gms.ads.internal.client.zzs[] zzsVarArr2 = zzsVar.zzg;
        if (zzsVarArr2 != null) {
            boolean z5 = false;
            for (com.google.android.gms.ads.internal.client.zzs zzsVar3 : zzsVarArr2) {
                if (zzsVar3.zzi) {
                    z5 = true;
                } else {
                    if (sb.length() != 0) {
                        sb.append("|");
                    }
                    int i4 = zzsVar3.zze;
                    if (i4 == -1) {
                        i4 = f != 0.0f ? (int) (zzsVar3.zzf / f) : -1;
                    }
                    sb.append(i4);
                    sb.append("x");
                    int i5 = zzsVar3.zzb;
                    if (i5 == -2) {
                        i5 = f != 0.0f ? (int) (zzsVar3.zzc / f) : -2;
                    }
                    sb.append(i5);
                }
            }
            if (z5) {
                if (sb.length() != 0) {
                    i3 = 0;
                    sb.insert(0, "|");
                } else {
                    i3 = 0;
                }
                sb.insert(i3, "320x50");
            }
        }
        return new zzemg(zzsVar, str, z, sb.toString(), f, i2, i, strZzj, this.zzb.zzq);
    }
}
