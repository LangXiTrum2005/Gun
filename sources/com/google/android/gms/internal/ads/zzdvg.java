package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdvg implements com.google.android.gms.ads.internal.overlay.zzr, zzcgn {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private zzduv zzc;
    private zzcex zzd;
    private boolean zze;
    private boolean zzf;
    private long zzg;

    @Nullable
    private com.google.android.gms.ads.internal.client.zzdl zzh;
    private boolean zzi;

    public zzdvg(Context context, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = versionInfoParcel;
    }

    private final synchronized boolean zzl(com.google.android.gms.ads.internal.client.zzdl zzdlVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zziN)).booleanValue()) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Ad inspector had an internal error.");
            try {
                zzdlVar.zze(zzfdk.zzd(16, null, null));
            } catch (RemoteException unused) {
            }
            return false;
        }
        if (this.zzc == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Ad inspector had an internal error.");
            try {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(new NullPointerException("InspectorManager null"), "InspectorUi.shouldOpenUi");
                zzdlVar.zze(zzfdk.zzd(16, null, null));
            } catch (RemoteException unused2) {
            }
            return false;
        }
        if (!this.zze && !this.zzf) {
            if (com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() >= this.zzg + ((long) ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zziQ)).intValue())) {
                return true;
            }
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Ad inspector cannot be opened because it is already open.");
        try {
            zzdlVar.zze(zzfdk.zzd(19, null, null));
        } catch (RemoteException unused3) {
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcgn
    public final synchronized void zza(boolean z, int i, String str, String str2) {
        if (z) {
            com.google.android.gms.ads.internal.util.zze.zza("Ad inspector loaded.");
            this.zze = true;
            zzk("");
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Ad inspector failed to load.");
        try {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(new Exception("Failed to load UI. Error code: " + i + ", Description: " + str + ", Failing URL: " + str2), "InspectorUi.onAdWebViewFinishedLoading 0");
            com.google.android.gms.ads.internal.client.zzdl zzdlVar = this.zzh;
            if (zzdlVar != null) {
                zzdlVar.zze(zzfdk.zzd(17, null, null));
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "InspectorUi.onAdWebViewFinishedLoading 1");
        }
        this.zzi = true;
        this.zzd.destroy();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdE() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdi() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdp() {
        this.zzf = true;
        zzk("");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdr() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzds(int i) {
        this.zzd.destroy();
        if (!this.zzi) {
            com.google.android.gms.ads.internal.util.zze.zza("Inspector closed.");
            com.google.android.gms.ads.internal.client.zzdl zzdlVar = this.zzh;
            if (zzdlVar != null) {
                try {
                    zzdlVar.zze(null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.zzf = false;
        this.zze = false;
        this.zzg = 0L;
        this.zzi = false;
        this.zzh = null;
    }

    @Nullable
    public final Activity zzg() {
        zzcex zzcexVar = this.zzd;
        if (zzcexVar == null || zzcexVar.zzaE()) {
            return null;
        }
        return this.zzd.zzi();
    }

    public final void zzh(zzduv zzduvVar) {
        this.zzc = zzduvVar;
    }

    public final /* synthetic */ void zzi(String str) {
        JSONObject jSONObjectZze = this.zzc.zze();
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObjectZze.put("redirectUrl", str);
            } catch (JSONException unused) {
            }
        }
        this.zzd.zzb("window.inspectorInfo", jSONObjectZze.toString());
    }

    public final synchronized void zzj(com.google.android.gms.ads.internal.client.zzdl zzdlVar, zzbkj zzbkjVar, zzbkc zzbkcVar, zzbjq zzbjqVar) {
        if (zzl(zzdlVar)) {
            try {
                com.google.android.gms.ads.internal.zzv.zzA();
                zzcex zzcexVarZza = zzcfk.zza(this.zza, zzcgr.zza(), "", false, false, null, null, this.zzb, null, null, null, zzbbj.zza(), null, null, null, null);
                this.zzd = zzcexVarZza;
                zzcgp zzcgpVarZzN = zzcexVarZza.zzN();
                if (zzcgpVarZzN == null) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to obtain a web view for the ad inspector");
                    try {
                        com.google.android.gms.ads.internal.zzv.zzp().zzw(new NullPointerException("Failed to obtain a web view for the ad inspector"), "InspectorUi.openInspector 2");
                        zzdlVar.zze(zzfdk.zzd(17, "Failed to obtain a web view for the ad inspector", null));
                        return;
                    } catch (RemoteException e) {
                        com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "InspectorUi.openInspector 3");
                        return;
                    }
                }
                this.zzh = zzdlVar;
                zzcgpVarZzN.zzV(null, null, null, null, null, false, null, null, null, null, null, null, null, zzbkjVar, null, new zzbki(this.zza), zzbkcVar, zzbjqVar, null);
                zzcgpVarZzN.zzC(this);
                this.zzd.loadUrl((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zziO));
                com.google.android.gms.ads.internal.zzv.zzj();
                com.google.android.gms.ads.internal.overlay.zzn.zza(this.zza, new AdOverlayInfoParcel(this, this.zzd, 1, this.zzb), true, null);
                this.zzg = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
            } catch (zzcfj e2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to obtain a web view for the ad inspector", e2);
                try {
                    com.google.android.gms.ads.internal.zzv.zzp().zzw(e2, "InspectorUi.openInspector 0");
                    zzdlVar.zze(zzfdk.zzd(17, "Failed to obtain a web view for the ad inspector", null));
                } catch (RemoteException e3) {
                    com.google.android.gms.ads.internal.zzv.zzp().zzw(e3, "InspectorUi.openInspector 1");
                }
            }
        }
    }

    public final synchronized void zzk(final String str) {
        if (this.zze && this.zzf) {
            zzbzw.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdvf
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzi(str);
                }
            });
        }
    }
}
