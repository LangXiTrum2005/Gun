package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzduj implements zzcvw, zzcyq, zzcxl {
    private final zzduv zza;
    private final String zzb;
    private final String zzc;
    private zzcvm zzf;
    private com.google.android.gms.ads.internal.client.zze zzg;
    private JSONObject zzk;
    private JSONObject zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private int zzd = 0;
    private zzdui zze = zzdui.AD_REQUESTED;

    public zzduj(zzduv zzduvVar, zzfcj zzfcjVar, String str) {
        this.zza = zzduvVar;
        this.zzc = str;
        this.zzb = zzfcjVar.zzf;
    }

    private static JSONObject zzh(com.google.android.gms.ads.internal.client.zze zzeVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", zzeVar.zzc);
        jSONObject.put("errorCode", zzeVar.zza);
        jSONObject.put("errorDescription", zzeVar.zzb);
        com.google.android.gms.ads.internal.client.zze zzeVar2 = zzeVar.zzd;
        jSONObject.put("underlyingError", zzeVar2 == null ? null : zzh(zzeVar2));
        return jSONObject;
    }

    private final JSONObject zzi(zzcvm zzcvmVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", zzcvmVar.zzg());
        jSONObject.put("responseSecsSinceEpoch", zzcvmVar.zzc());
        jSONObject.put("responseId", zzcvmVar.zzi());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzje)).booleanValue()) {
            String strZzd = zzcvmVar.zzd();
            if (!TextUtils.isEmpty(strZzd)) {
                com.google.android.gms.ads.internal.util.client.zzo.zze("Bidding data: ".concat(String.valueOf(strZzd)));
                jSONObject.put("biddingData", new JSONObject(strZzd));
            }
        }
        if (!TextUtils.isEmpty(this.zzh)) {
            jSONObject.put("adRequestUrl", this.zzh);
        }
        if (!TextUtils.isEmpty(this.zzi)) {
            jSONObject.put("postBody", this.zzi);
        }
        if (!TextUtils.isEmpty(this.zzj)) {
            jSONObject.put("adResponseBody", this.zzj);
        }
        Object obj = this.zzk;
        if (obj != null) {
            jSONObject.put("adResponseHeaders", obj);
        }
        Object obj2 = this.zzl;
        if (obj2 != null) {
            jSONObject.put("transactionExtras", obj2);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjh)).booleanValue()) {
            jSONObject.put("hasExceededMemoryLimit", this.zzo);
        }
        JSONArray jSONArray = new JSONArray();
        for (com.google.android.gms.ads.internal.client.zzw zzwVar : zzcvmVar.zzj()) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adapterClassName", zzwVar.zza);
            jSONObject2.put("latencyMillis", zzwVar.zzb);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjf)).booleanValue()) {
                jSONObject2.put("credentials", com.google.android.gms.ads.internal.client.zzbc.zzb().zzi(zzwVar.zzd));
            }
            com.google.android.gms.ads.internal.client.zze zzeVar = zzwVar.zzc;
            jSONObject2.put("error", zzeVar == null ? null : zzh(zzeVar));
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzcxl
    public final void zza(zzcqz zzcqzVar) {
        if (this.zza.zzq()) {
            this.zzf = zzcqzVar.zzm();
            this.zze = zzdui.AD_LOADED;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjl)).booleanValue()) {
                this.zza.zzf(this.zzb, this);
            }
        }
    }

    public final String zzc() {
        return this.zzc;
    }

    public final JSONObject zzd() throws JSONException {
        JSONObject jSONObjectZzi;
        IBinder iBinder;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", this.zze);
        jSONObject.put("format", zzfbo.zza(this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjl)).booleanValue()) {
            jSONObject.put("isOutOfContext", this.zzm);
            if (this.zzm) {
                jSONObject.put("shown", this.zzn);
            }
        }
        zzcvm zzcvmVar = this.zzf;
        if (zzcvmVar != null) {
            jSONObjectZzi = zzi(zzcvmVar);
        } else {
            com.google.android.gms.ads.internal.client.zze zzeVar = this.zzg;
            JSONObject jSONObjectZzi2 = null;
            if (zzeVar != null && (iBinder = zzeVar.zze) != null) {
                zzcvm zzcvmVar2 = (zzcvm) iBinder;
                jSONObjectZzi2 = zzi(zzcvmVar2);
                if (zzcvmVar2.zzj().isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(zzh(this.zzg));
                    jSONObjectZzi2.put("errors", jSONArray);
                }
            }
            jSONObjectZzi = jSONObjectZzi2;
        }
        jSONObject.put("responseInfo", jSONObjectZzi);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzdl(zzbvk zzbvkVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjl)).booleanValue() || !this.zza.zzq()) {
            return;
        }
        this.zza.zzf(this.zzb, this);
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzdm(zzfca zzfcaVar) {
        if (this.zza.zzq()) {
            if (!zzfcaVar.zzb.zza.isEmpty()) {
                this.zzd = ((zzfbo) zzfcaVar.zzb.zza.get(0)).zzb;
            }
            if (!TextUtils.isEmpty(zzfcaVar.zzb.zzb.zzl)) {
                this.zzh = zzfcaVar.zzb.zzb.zzl;
            }
            if (!TextUtils.isEmpty(zzfcaVar.zzb.zzb.zzm)) {
                this.zzi = zzfcaVar.zzb.zzb.zzm;
            }
            if (zzfcaVar.zzb.zzb.zzp.length() > 0) {
                this.zzl = zzfcaVar.zzb.zzb.zzp;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjh)).booleanValue()) {
                if (!this.zza.zzs()) {
                    this.zzo = true;
                    return;
                }
                if (!TextUtils.isEmpty(zzfcaVar.zzb.zzb.zzn)) {
                    this.zzj = zzfcaVar.zzb.zzb.zzn;
                }
                if (zzfcaVar.zzb.zzb.zzo.length() > 0) {
                    this.zzk = zzfcaVar.zzb.zzb.zzo;
                }
                zzduv zzduvVar = this.zza;
                JSONObject jSONObject = this.zzk;
                int length = jSONObject != null ? jSONObject.toString().length() : 0;
                if (!TextUtils.isEmpty(this.zzj)) {
                    length += this.zzj.length();
                }
                zzduvVar.zzk(length);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvw
    public final void zzdz(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zza.zzq()) {
            this.zze = zzdui.AD_LOAD_FAILED;
            this.zzg = zzeVar;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjl)).booleanValue()) {
                this.zza.zzf(this.zzb, this);
            }
        }
    }

    public final void zze() {
        this.zzm = true;
    }

    public final void zzf() {
        this.zzn = true;
    }

    public final boolean zzg() {
        return this.zze != zzdui.AD_REQUESTED;
    }
}
