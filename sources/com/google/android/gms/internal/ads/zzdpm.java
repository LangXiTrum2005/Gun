package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.VisibleForTesting;
import com.google.ads.mediation.admob.AdMobAdapter;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdpm {
    private final zzfdf zza;
    private final zzdpj zzb;

    public zzdpm(zzfdf zzfdfVar, zzdpj zzdpjVar) {
        this.zza = zzfdfVar;
        this.zzb = zzdpjVar;
    }

    @VisibleForTesting
    public final zzbpe zza() throws RemoteException {
        zzbpe zzbpeVarZzb = this.zza.zzb();
        if (zzbpeVarZzb != null) {
            return zzbpeVarZzb;
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Unexpected call to adapter creator.");
        throw new RemoteException();
    }

    public final zzbrd zzb(String str) throws RemoteException {
        zzbrd zzbrdVarZzc = zza().zzc(str);
        this.zzb.zzd(str, zzbrdVarZzc);
        return zzbrdVarZzc;
    }

    public final zzfdh zzc(String str, JSONObject jSONObject) throws zzfcq {
        zzbph zzbphVarZzb;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zzbphVarZzb = new zzbqf(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                zzbphVarZzb = new zzbqf(new zzbrw());
            } else {
                zzbpe zzbpeVarZza = zza();
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        if (zzbpeVarZza.zze(string)) {
                            zzbphVarZzb = zzbpeVarZza.zzb("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
                        } else {
                            zzbphVarZzb = zzbpeVarZza.zzd(string) ? zzbpeVarZza.zzb(string) : zzbpeVarZza.zzb("com.google.ads.mediation.customevent.CustomEventAdapter");
                        }
                    } catch (JSONException e) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("Invalid custom event.", e);
                        zzbphVarZzb = zzbpeVarZza.zzb(str);
                    }
                } else {
                    zzbphVarZzb = zzbpeVarZza.zzb(str);
                }
            }
            zzfdh zzfdhVar = new zzfdh(zzbphVarZzb);
            this.zzb.zzc(str, zzfdhVar);
            return zzfdhVar;
        } catch (Throwable th) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjk)).booleanValue()) {
                this.zzb.zzc(str, null);
            }
            throw new zzfcq(th);
        }
    }

    public final boolean zzd() {
        return this.zza.zzb() != null;
    }
}
