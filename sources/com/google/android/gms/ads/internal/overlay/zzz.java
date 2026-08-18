package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbzw;
import com.google.android.gms.internal.ads.zzcex;
import com.google.android.gms.internal.ads.zzfsc;
import com.google.android.gms.internal.ads.zzfsd;
import com.google.android.gms.internal.ads.zzfse;
import com.google.android.gms.internal.ads.zzfsf;
import com.google.android.gms.internal.ads.zzfsy;
import com.google.android.gms.internal.ads.zzfta;
import com.google.android.gms.internal.ads.zzftb;
import com.google.android.gms.internal.ads.zzftc;
import com.google.android.gms.internal.ads.zzftd;
import com.google.android.gms.internal.ads.zzftq;
import com.umeng.ccg.a;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzz {
    private zzftb zzf;

    @Nullable
    private zzcex zzc = null;
    private boolean zze = false;

    @Nullable
    private String zza = null;

    @Nullable
    private zzfse zzd = null;

    @Nullable
    private String zzb = null;

    private final zzftd zzl() {
        zzftc zzftcVarZzc = zzftd.zzc();
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzlq)).booleanValue() || TextUtils.isEmpty(this.zzb)) {
            String str = this.zza;
            if (str != null) {
                zzftcVarZzc.zzb(str);
            } else {
                zzf("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzftcVarZzc.zza(this.zzb);
        }
        return zzftcVarZzc.zzc();
    }

    private final void zzm() {
        if (this.zzf == null) {
            this.zzf = new zzy(this);
        }
    }

    public final synchronized void zza(@Nullable zzcex zzcexVar, Context context) {
        this.zzc = zzcexVar;
        if (!zzk(context)) {
            zzf("Unable to bind", "on_play_store_bind");
            return;
        }
        HashMap map = new HashMap();
        map.put(a.w, "fetch_completed");
        zze("on_play_store_bind", map);
    }

    public final void zzb() {
        zzfse zzfseVar;
        if (!this.zze || (zzfseVar = this.zzd) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
        } else {
            zzfseVar.zza(zzl(), this.zzf);
            zzd("onLMDOverlayCollapse");
        }
    }

    public final void zzc() {
        zzfse zzfseVar;
        if (!this.zze || (zzfseVar = this.zzd) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
            return;
        }
        zzfsc zzfscVarZzc = zzfsd.zzc();
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzlq)).booleanValue() || TextUtils.isEmpty(this.zzb)) {
            String str = this.zza;
            if (str != null) {
                zzfscVarZzc.zzb(str);
            } else {
                zzf("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzfscVarZzc.zza(this.zzb);
        }
        zzfseVar.zzb(zzfscVarZzc.zzc(), this.zzf);
    }

    @VisibleForTesting
    public final void zzd(String str) {
        zze(str, new HashMap());
    }

    @VisibleForTesting
    public final void zze(final String str, final Map map) {
        zzbzw.zzf.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzx
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzh(str, map);
            }
        });
    }

    @VisibleForTesting
    public final void zzf(String str, String str2) {
        com.google.android.gms.ads.internal.util.zze.zza(str);
        if (this.zzc != null) {
            HashMap map = new HashMap();
            map.put(PglCryptUtils.KEY_MESSAGE, str);
            map.put(a.w, str2);
            zze("onError", map);
        }
    }

    public final void zzg() {
        zzfse zzfseVar;
        if (!this.zze || (zzfseVar = this.zzd) == null) {
            com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
        } else {
            zzfseVar.zzc(zzl(), this.zzf);
            zzd("onLMDOverlayExpand");
        }
    }

    public final /* synthetic */ void zzh(String str, Map map) {
        zzcex zzcexVar = this.zzc;
        if (zzcexVar != null) {
            zzcexVar.zzd(str, map);
        }
    }

    @VisibleForTesting
    public final void zzi(zzfta zzftaVar) {
        if (!TextUtils.isEmpty(zzftaVar.zzb())) {
            if (!((Boolean) zzbe.zzc().zza(zzbcl.zzlq)).booleanValue()) {
                this.zza = zzftaVar.zzb();
            }
        }
        switch (zzftaVar.zza()) {
            case 8152:
                zzd("onLMDOverlayOpened");
                break;
            case 8153:
                zzd("onLMDOverlayClicked");
                break;
            case 8155:
                zzd("onLMDOverlayClose");
                break;
            case 8157:
                this.zza = null;
                this.zzb = null;
                this.zze = false;
                break;
            case 8160:
            case 8161:
            case 8162:
                HashMap map = new HashMap();
                map.put("error", String.valueOf(zzftaVar.zza()));
                zze("onLMDOverlayFailedToOpen", map);
                break;
        }
    }

    public final void zzj(@Nullable zzcex zzcexVar, @Nullable zzfsy zzfsyVar) {
        if (zzcexVar == null) {
            zzf("adWebview missing", "onLMDShow");
            return;
        }
        this.zzc = zzcexVar;
        if (!this.zze && !zzk(zzcexVar.getContext())) {
            zzf("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzlq)).booleanValue()) {
            this.zzb = zzfsyVar.zzh();
        }
        zzm();
        zzfse zzfseVar = this.zzd;
        if (zzfseVar != null) {
            zzfseVar.zzd(zzfsyVar, this.zzf);
        }
    }

    public final synchronized boolean zzk(Context context) {
        if (!zzftq.zza(context)) {
            return false;
        }
        try {
            this.zzd = zzfsf.zza(context);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Error connecting LMD Overlay service");
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "LastMileDeliveryOverlay.bindLastMileDeliveryService");
        }
        if (this.zzd == null) {
            this.zze = false;
            return false;
        }
        zzm();
        this.zze = true;
        return true;
    }
}
