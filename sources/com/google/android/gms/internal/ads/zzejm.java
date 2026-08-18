package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.umeng.analytics.pro.bc;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzejm extends zzbrf {
    private final String zza;
    private final zzbrd zzb;
    private final zzcab zzc;
    private final JSONObject zzd;
    private final long zze;
    private boolean zzf;

    public zzejm(String str, zzbrd zzbrdVar, zzcab zzcabVar, long j) {
        JSONObject jSONObject = new JSONObject();
        this.zzd = jSONObject;
        this.zzf = false;
        this.zzc = zzcabVar;
        this.zza = str;
        this.zzb = zzbrdVar;
        this.zze = j;
        try {
            jSONObject.put("adapter_version", zzbrdVar.zzf().toString());
            jSONObject.put("sdk_version", zzbrdVar.zzg().toString());
            jSONObject.put("name", str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    public static synchronized void zzb(String str, zzcab zzcabVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("name", str);
                jSONObject.put("signal_error", "Adapter failed to instantiate");
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzbI)).booleanValue()) {
                    jSONObject.put("signal_error_code", 1);
                }
                zzcabVar.zzc(jSONObject);
            } catch (JSONException unused) {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzh(String str, int i) {
        try {
            if (this.zzf) {
                return;
            }
            try {
                this.zzd.put("signal_error", str);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzbJ)).booleanValue()) {
                    this.zzd.put(bc.aZ, com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - this.zze);
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzbI)).booleanValue()) {
                    this.zzd.put("signal_error_code", i);
                }
            } catch (JSONException unused) {
            }
            this.zzc.zzc(this.zzd);
            this.zzf = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzc() {
        zzh("Signal collection timeout.", 3);
    }

    public final synchronized void zzd() {
        if (this.zzf) {
            return;
        }
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzbI)).booleanValue()) {
                this.zzd.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.zzc.zzc(this.zzd);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbrg
    public final synchronized void zze(String str) throws RemoteException {
        if (this.zzf) {
            return;
        }
        if (str == null) {
            zzf("Adapter returned null signals");
            return;
        }
        try {
            this.zzd.put("signals", str);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzbJ)).booleanValue()) {
                this.zzd.put(bc.aZ, com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - this.zze);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzbI)).booleanValue()) {
                this.zzd.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.zzc.zzc(this.zzd);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbrg
    public final synchronized void zzf(String str) throws RemoteException {
        zzh(str, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzbrg
    public final synchronized void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzh(zzeVar.zzb, 2);
    }
}
