package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbee;
import com.google.android.gms.internal.ads.zzbyr;
import com.google.android.gms.internal.ads.zzbyy;
import com.google.android.gms.internal.ads.zzfgw;
import com.google.android.gms.internal.ads.zzfhh;
import com.google.android.gms.internal.ads.zzgcd;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
final class zzaq implements zzgcd {
    final /* synthetic */ AI zza;
    final /* synthetic */ zzbyy zzb;
    final /* synthetic */ zzbyr zzc;
    final /* synthetic */ zzfgw zzd;
    final /* synthetic */ zzau zze;

    public zzaq(zzau zzauVar, AI ai, zzbyy zzbyyVar, zzbyr zzbyrVar, zzfgw zzfgwVar) {
        this.zza = ai;
        this.zzb = zzbyyVar;
        this.zzc = zzbyrVar;
        this.zzd = zzfgwVar;
        this.zze = zzauVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable th) {
        String message = th.getMessage();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzhC)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzp().zzv(th, "SignalGeneratorImpl.generateSignals");
        } else {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "SignalGeneratorImpl.generateSignals");
        }
        zzfhh zzfhhVarZzr = zzau.zzr(this.zza, this.zzb);
        if (((Boolean) zzbee.zze.zze()).booleanValue() && zzfhhVarZzr != null) {
            zzfgw zzfgwVar = this.zzd;
            zzfgwVar.zzh(th);
            zzfgwVar.zzg(false);
            zzfhhVarZzr.zza(zzfgwVar);
            zzfhhVarZzr.zzh();
        }
        if (this.zzc == null) {
            return;
        }
        try {
            if (!"Unknown format is no longer supported.".equals(message)) {
                message = "Internal error. " + message;
            }
            this.zzc.zzb(message);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final /* bridge */ /* synthetic */ void zzb(@Nullable Object obj) {
        zzbk zzbkVar = (zzbk) obj;
        zzfhh zzfhhVarZzr = zzau.zzr(this.zza, this.zzb);
        this.zze.zzG.set(true);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzhx)).booleanValue()) {
            try {
                zzbyr zzbyrVar = this.zzc;
                if (zzbyrVar != null) {
                    zzbyrVar.zzb("QueryInfo generation has been disabled.");
                }
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("QueryInfo generation has been disabled.".concat(e.toString()));
            }
            if (!((Boolean) zzbee.zze.zze()).booleanValue() || zzfhhVarZzr == null) {
                return;
            }
            zzfgw zzfgwVar = this.zzd;
            zzfgwVar.zzc("QueryInfo generation has been disabled.");
            zzfgwVar.zzg(false);
            zzfhhVarZzr.zza(zzfgwVar);
            zzfhhVarZzr.zzh();
            return;
        }
        try {
            if (zzbkVar == null) {
                zzbyr zzbyrVar2 = this.zzc;
                if (zzbyrVar2 != null) {
                    zzbyrVar2.zzc(null, null, null);
                }
                this.zzd.zzg(true);
                if (!((Boolean) zzbee.zze.zze()).booleanValue() || zzfhhVarZzr == null) {
                    return;
                }
                zzfhhVarZzr.zza(this.zzd);
                zzfhhVarZzr.zzh();
                return;
            }
            try {
                if (TextUtils.isEmpty((!TextUtils.isEmpty(zzbkVar.zzc) ? new JSONObject(zzbkVar.zzc) : new JSONObject(zzbkVar.zzb)).optString("request_id", ""))) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("The request ID is empty in request JSON.");
                    zzbyr zzbyrVar3 = this.zzc;
                    if (zzbyrVar3 != null) {
                        zzbyrVar3.zzb("Internal error: request ID is empty in request JSON.");
                    }
                    zzfgw zzfgwVar2 = this.zzd;
                    zzfgwVar2.zzc("Request ID empty");
                    zzfgwVar2.zzg(false);
                    if (!((Boolean) zzbee.zze.zze()).booleanValue() || zzfhhVarZzr == null) {
                        return;
                    }
                    zzfhhVarZzr.zza(this.zzd);
                    zzfhhVarZzr.zzh();
                    return;
                }
                Bundle bundle = zzbkVar.zzf;
                zzau zzauVar = this.zze;
                if (zzauVar.zzu && bundle != null && bundle.getInt(zzauVar.zzw, -1) == -1) {
                    zzau zzauVar2 = this.zze;
                    bundle.putInt(zzauVar2.zzw, zzauVar2.zzx.get());
                }
                zzau zzauVar3 = this.zze;
                if (zzauVar3.zzt && bundle != null && TextUtils.isEmpty(bundle.getString(zzauVar3.zzv))) {
                    if (TextUtils.isEmpty(this.zze.zzz)) {
                        zzau zzauVar4 = this.zze;
                        com.google.android.gms.ads.internal.util.zzs zzsVarZzq = com.google.android.gms.ads.internal.zzv.zzq();
                        zzau zzauVar5 = this.zze;
                        zzauVar4.zzz = zzsVarZzq.zzc(zzauVar5.zzg, zzauVar5.zzy.afmaVersion);
                    }
                    zzau zzauVar6 = this.zze;
                    bundle.putString(zzauVar6.zzv, zzauVar6.zzz);
                }
                if (this.zzc != null) {
                    if (TextUtils.isEmpty(zzbkVar.zzc)) {
                        this.zzc.zzc(zzbkVar.zza, zzbkVar.zzb, bundle);
                    } else {
                        this.zzc.zzc(zzbkVar.zza, zzbkVar.zzc, bundle);
                    }
                }
                this.zzd.zzg(true);
                if (!((Boolean) zzbee.zze.zze()).booleanValue() || zzfhhVarZzr == null) {
                    return;
                }
                zzfhhVarZzr.zza(this.zzd);
                zzfhhVarZzr.zzh();
            } catch (JSONException e2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to create JSON object from the request string.");
                zzbyr zzbyrVar4 = this.zzc;
                if (zzbyrVar4 != null) {
                    zzbyrVar4.zzb("Internal error for request JSON: " + e2.toString());
                }
                zzfgw zzfgwVar3 = this.zzd;
                zzfgwVar3.zzh(e2);
                zzfgwVar3.zzg(false);
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e2, "SignalGeneratorImpl.generateSignals.onSuccess");
                if (!((Boolean) zzbee.zze.zze()).booleanValue() || zzfhhVarZzr == null) {
                    return;
                }
                zzfhhVarZzr.zza(this.zzd);
                zzfhhVarZzr.zzh();
            }
        } catch (RemoteException e3) {
            zzfgw zzfgwVar4 = this.zzd;
            zzfgwVar4.zzh(e3);
            zzfgwVar4.zzg(false);
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e3);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e3, "SignalGeneratorImpl.generateSignals.onSuccess");
        } finally {
            if (((Boolean) zzbee.zze.zze()).booleanValue() && zzfhhVarZzr != null) {
                zzfhhVarZzr.zza(this.zzd);
                zzfhhVarZzr.zzh();
            }
        }
    }
}
