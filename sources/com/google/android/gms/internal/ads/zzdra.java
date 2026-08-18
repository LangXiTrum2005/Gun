package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.MobileAds;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.umeng.ccg.a;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdra implements zzdan, com.google.android.gms.ads.internal.client.zza, zzcwn, zzcvx {
    private final Context zza;
    private final zzfdb zzb;
    private final zzdrw zzc;
    private final zzfca zzd;
    private final zzfbo zze;
    private final zzebk zzf;
    private final String zzg;

    @Nullable
    private Boolean zzh;
    private final boolean zzi = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgF)).booleanValue();

    public zzdra(Context context, zzfdb zzfdbVar, zzdrw zzdrwVar, zzfca zzfcaVar, zzfbo zzfboVar, zzebk zzebkVar, String str) {
        this.zza = context;
        this.zzb = zzfdbVar;
        this.zzc = zzdrwVar;
        this.zzd = zzfcaVar;
        this.zze = zzfboVar;
        this.zzf = zzebkVar;
        this.zzg = str;
    }

    private final zzdrv zzd(String str) {
        zzfbz zzfbzVar = this.zzd.zzb;
        zzdrv zzdrvVarZza = this.zzc.zza();
        zzdrvVarZza.zzd(zzfbzVar.zzb);
        zzdrvVarZza.zzc(this.zze);
        zzdrvVarZza.zzb(a.w, str);
        zzdrvVarZza.zzb("ad_format", this.zzg.toUpperCase(Locale.ROOT));
        if (!this.zze.zzt.isEmpty()) {
            zzdrvVarZza.zzb("ancn", (String) this.zze.zzt.get(0));
        }
        if (this.zze.zzb()) {
            zzdrvVarZza.zzb("device_connectivity", true != com.google.android.gms.ads.internal.zzv.zzp().zzA(this.zza) ? "offline" : CustomTabsCallback.ONLINE_EXTRAS_KEY);
            zzdrvVarZza.zzb("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis()));
            zzdrvVarZza.zzb("offline_ad", "1");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgM)).booleanValue()) {
            boolean z = com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzf(this.zzd.zza.zza) != 1;
            zzdrvVarZza.zzb("scar", String.valueOf(z));
            if (z) {
                com.google.android.gms.ads.internal.client.zzm zzmVar = this.zzd.zza.zza.zzd;
                zzdrvVarZza.zzb("ragent", zzmVar.zzp);
                zzdrvVarZza.zzb("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzc(zzmVar)));
            }
        }
        return zzdrvVarZza;
    }

    private final void zze(zzdrv zzdrvVar) {
        if (!this.zze.zzb()) {
            zzdrvVar.zzg();
            return;
        }
        this.zzf.zzd(new zzebm(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis(), this.zzd.zzb.zzb.zzb, zzdrvVar.zze(), 2));
    }

    private final boolean zzf() {
        String strZzq;
        if (this.zzh == null) {
            synchronized (this) {
                if (this.zzh == null) {
                    String str = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzbB);
                    com.google.android.gms.ads.internal.zzv.zzq();
                    try {
                        strZzq = com.google.android.gms.ads.internal.util.zzs.zzq(this.zza);
                    } catch (RemoteException unused) {
                        strZzq = null;
                    }
                    boolean zMatches = false;
                    if (str != null && strZzq != null) {
                        try {
                            zMatches = Pattern.matches(str, strZzq);
                        } catch (RuntimeException e) {
                            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.zzh = Boolean.valueOf(zMatches);
                }
            }
        }
        return this.zzh.booleanValue();
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (this.zze.zzb()) {
            zze(zzd(CampaignEx.JSON_NATIVE_VIDEO_CLICK));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvx
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.client.zze zzeVar2;
        if (this.zzi) {
            zzdrv zzdrvVarZzd = zzd("ifts");
            zzdrvVarZzd.zzb("reason", "adapter");
            int i = zzeVar.zza;
            String str = zzeVar.zzb;
            if (zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN) && (zzeVar2 = zzeVar.zzd) != null && !zzeVar2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                com.google.android.gms.ads.internal.client.zze zzeVar3 = zzeVar.zzd;
                i = zzeVar3.zza;
                str = zzeVar3.zzb;
            }
            if (i >= 0) {
                zzdrvVarZzd.zzb("arec", String.valueOf(i));
            }
            String strZza = this.zzb.zza(str);
            if (strZza != null) {
                zzdrvVarZzd.zzb("areec", strZza);
            }
            zzdrvVarZzd.zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvx
    public final void zzb() {
        if (this.zzi) {
            zzdrv zzdrvVarZzd = zzd("ifts");
            zzdrvVarZzd.zzb("reason", "blocked");
            zzdrvVarZzd.zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvx
    public final void zzc(zzdgb zzdgbVar) {
        if (this.zzi) {
            zzdrv zzdrvVarZzd = zzd("ifts");
            zzdrvVarZzd.zzb("reason", "exception");
            if (!TextUtils.isEmpty(zzdgbVar.getMessage())) {
                zzdrvVarZzd.zzb(NotificationCompat.CATEGORY_MESSAGE, zzdgbVar.getMessage());
            }
            zzdrvVarZzd.zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdan
    public final void zzi() {
        if (zzf()) {
            zzd("adapter_shown").zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdan
    public final void zzj() {
        if (zzf()) {
            zzd("adapter_impression").zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final void zzr() {
        if (zzf() || this.zze.zzb()) {
            zze(zzd("impression"));
        }
    }
}
