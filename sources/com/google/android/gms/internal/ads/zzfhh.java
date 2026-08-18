package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.AdFormat;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2390Ej;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfhh implements Runnable {
    private final zzfhk zzb;
    private String zzc;
    private String zze;
    private zzfbz zzf;
    private com.google.android.gms.ads.internal.client.zze zzg;
    private Future zzh;
    private final List zza = new ArrayList();
    private int zzi = 2;
    private zzfhm zzd = zzfhm.SCAR_REQUEST_TYPE_UNSPECIFIED;

    public zzfhh(zzfhk zzfhkVar) {
        this.zzb = zzfhkVar;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        zzh();
    }

    public final synchronized zzfhh zza(zzfgw zzfgwVar) {
        try {
            if (((Boolean) zzbee.zzc.zze()).booleanValue()) {
                List list = this.zza;
                zzfgwVar.zzj();
                list.add(zzfgwVar);
                Future future = this.zzh;
                if (future != null) {
                    future.cancel(false);
                }
                this.zzh = zzbzw.zzd.schedule(this, ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zziG)).intValue(), TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final synchronized zzfhh zzb(String str) {
        if (((Boolean) zzbee.zzc.zze()).booleanValue() && zzfhg.zze(str)) {
            this.zzc = str;
        }
        return this;
    }

    public final synchronized zzfhh zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) zzbee.zzc.zze()).booleanValue()) {
            this.zzg = zzeVar;
        }
        return this;
    }

    public final synchronized zzfhh zzd(ArrayList arrayList) {
        try {
            if (((Boolean) zzbee.zzc.zze()).booleanValue()) {
                if (arrayList.contains("banner") || arrayList.contains(AdFormat.BANNER.name())) {
                    this.zzi = 3;
                } else if (arrayList.contains(C2390Ej.PLACEMENT_TYPE_INTERSTITIAL) || arrayList.contains(AdFormat.INTERSTITIAL.name())) {
                    this.zzi = 4;
                } else if (arrayList.contains("native") || arrayList.contains(AdFormat.NATIVE.name())) {
                    this.zzi = 8;
                } else if (arrayList.contains(C2390Ej.PLACEMENT_TYPE_REWARDED) || arrayList.contains(AdFormat.REWARDED.name())) {
                    this.zzi = 5;
                } else if (arrayList.contains("app_open_ad")) {
                    this.zzi = 7;
                } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains(AdFormat.REWARDED_INTERSTITIAL.name())) {
                    this.zzi = 6;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final synchronized zzfhh zze(String str) {
        if (((Boolean) zzbee.zzc.zze()).booleanValue()) {
            this.zze = str;
        }
        return this;
    }

    public final synchronized zzfhh zzf(Bundle bundle) {
        if (((Boolean) zzbee.zzc.zze()).booleanValue()) {
            this.zzd = com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zza(bundle);
        }
        return this;
    }

    public final synchronized zzfhh zzg(zzfbz zzfbzVar) {
        if (((Boolean) zzbee.zzc.zze()).booleanValue()) {
            this.zzf = zzfbzVar;
        }
        return this;
    }

    public final synchronized void zzh() {
        try {
            if (((Boolean) zzbee.zzc.zze()).booleanValue()) {
                Future future = this.zzh;
                if (future != null) {
                    future.cancel(false);
                }
                for (zzfgw zzfgwVar : this.zza) {
                    int i = this.zzi;
                    if (i != 2) {
                        zzfgwVar.zzn(i);
                    }
                    if (!TextUtils.isEmpty(this.zzc)) {
                        zzfgwVar.zze(this.zzc);
                    }
                    if (!TextUtils.isEmpty(this.zze) && !zzfgwVar.zzl()) {
                        zzfgwVar.zzd(this.zze);
                    }
                    zzfbz zzfbzVar = this.zzf;
                    if (zzfbzVar != null) {
                        zzfgwVar.zzb(zzfbzVar);
                    } else {
                        com.google.android.gms.ads.internal.client.zze zzeVar = this.zzg;
                        if (zzeVar != null) {
                            zzfgwVar.zza(zzeVar);
                        }
                    }
                    zzfgwVar.zzf(this.zzd);
                    this.zzb.zzb(zzfgwVar.zzm());
                }
                this.zza.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized zzfhh zzi(int i) {
        if (((Boolean) zzbee.zzc.zze()).booleanValue()) {
            this.zzi = i;
        }
        return this;
    }
}
