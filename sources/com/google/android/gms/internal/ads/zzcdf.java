package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcdf implements zzbjp {
    @Nullable
    private static final Integer zzb(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) map.get(str)));
        } catch (NumberFormatException unused) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Precache invalid numeric parameter '" + str + "': " + ((String) map.get(str)));
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcde zzcdhVar;
        zzcbs zzcbsVar = (zzcbs) obj;
        if (com.google.android.gms.ads.internal.util.client.zzo.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            com.google.android.gms.ads.internal.util.client.zzo.zze("Precache GMSG: ".concat(jSONObject.toString()));
        }
        zzccx<zzccw> zzccxVarZzz = com.google.android.gms.ads.internal.zzv.zzz();
        if (map.containsKey("abort")) {
            if (zzccxVarZzz.zzd(zzcbsVar)) {
                return;
            }
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Precache abort but no precache task running.");
            return;
        }
        String str = (String) map.get("src");
        Integer numZzb = zzb(map, "periodicReportIntervalMs");
        Integer numZzb2 = zzb(map, "exoPlayerRenderingIntervalMs");
        Integer numZzb3 = zzb(map, "exoPlayerIdleIntervalMs");
        zzcbr zzcbrVar = new zzcbr((String) map.get("flags"));
        boolean z = zzcbrVar.zzk;
        if (str != null) {
            String[] strArr = {str};
            String str2 = (String) map.get("demuxed");
            zzccw zzccwVarZza = null;
            if (str2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i = 0; i < jSONArray.length(); i++) {
                        strArr2[i] = jSONArray.getString(i);
                    }
                    strArr = strArr2;
                } catch (JSONException unused) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Malformed demuxed URL list for precache: ".concat(str2));
                    strArr = null;
                }
            }
            if (strArr == null) {
                strArr = new String[]{str};
            }
            if (z) {
                for (zzccw zzccwVar : zzccxVarZzz) {
                    if (zzccwVar.zza == zzcbsVar && str.equals(zzccwVar.zze())) {
                        zzccwVarZza = zzccwVar;
                        break;
                    }
                }
            } else {
                zzccwVarZza = zzccxVarZzz.zza(zzcbsVar);
            }
            if (zzccwVarZza != null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Precache task is already running.");
                return;
            }
            if (zzcbsVar.zzj() == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Precache requires a dependency provider.");
                return;
            }
            Integer numZzb4 = zzb(map, "player");
            if (numZzb4 == null) {
                numZzb4 = 0;
            }
            if (numZzb != null) {
                zzcbsVar.zzA(numZzb.intValue());
            }
            if (numZzb2 != null) {
                zzcbsVar.zzy(numZzb2.intValue());
            }
            if (numZzb3 != null) {
                zzcbsVar.zzx(numZzb3.intValue());
            }
            int iIntValue = numZzb4.intValue();
            zzccp zzccpVar = zzcbsVar.zzj().zzb;
            if (iIntValue > 0) {
                int i2 = zzcbrVar.zzg;
                int iZzu = zzcbj.zzu();
                if (iZzu < i2) {
                    zzcdhVar = new zzcdn(zzcbsVar, zzcbrVar);
                } else {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzn)).booleanValue()) {
                        iZzu = zzcdk.zzi();
                    }
                    zzcdhVar = iZzu < zzcbrVar.zzb ? new zzcdk(zzcbsVar, zzcbrVar) : new zzcdi(zzcbsVar);
                }
            } else {
                zzcdhVar = new zzcdh(zzcbsVar);
            }
            new zzccw(zzcbsVar, zzcdhVar, str, strArr).zzb();
        } else {
            zzccw zzccwVarZza2 = zzccxVarZzz.zza(zzcbsVar);
            if (zzccwVarZza2 == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Precache must specify a source.");
                return;
            }
            zzcdhVar = zzccwVarZza2.zzb;
        }
        Integer numZzb5 = zzb(map, "minBufferMs");
        if (numZzb5 != null) {
            zzcdhVar.zzs(numZzb5.intValue());
        }
        Integer numZzb6 = zzb(map, "maxBufferMs");
        if (numZzb6 != null) {
            zzcdhVar.zzr(numZzb6.intValue());
        }
        Integer numZzb7 = zzb(map, "bufferForPlaybackMs");
        if (numZzb7 != null) {
            zzcdhVar.zzp(numZzb7.intValue());
        }
        Integer numZzb8 = zzb(map, "bufferForPlaybackAfterRebufferMs");
        if (numZzb8 != null) {
            zzcdhVar.zzq(numZzb8.intValue());
        }
    }
}
