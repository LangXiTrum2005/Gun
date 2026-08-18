package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdwr implements zzher {
    private final zzhfj zza;

    public zzdwr(zzhfj zzhfjVar) {
        this.zza = zzhfjVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0037  */
    /* JADX WARN: Code duplicated, block: B:14:0x0052  */
    /* JADX WARN: Code duplicated, block: B:18:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ Object zzb() {
        String strValueOf;
        zzfcj zzfcjVarZza = ((zzcvk) this.zza).zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzhb)).booleanValue()) {
            String str = zzfcjVarZza.zzd.zzx;
            if (!TextUtils.isEmpty(str)) {
                try {
                    strValueOf = new JSONObject(str).getString("request_id");
                    if (TextUtils.isEmpty(strValueOf)) {
                        if (zzfcjVarZza.zzd.zzs != null) {
                            try {
                                strValueOf = new JSONObject(zzfcjVarZza.zzd.zzs.zza).getString("request_id");
                                if (TextUtils.isEmpty(strValueOf)) {
                                    strValueOf = String.valueOf(com.google.android.gms.ads.internal.client.zzbc.zze().nextInt() & Integer.MAX_VALUE);
                                }
                            } catch (JSONException unused) {
                            }
                        } else {
                            strValueOf = String.valueOf(com.google.android.gms.ads.internal.client.zzbc.zze().nextInt() & Integer.MAX_VALUE);
                        }
                    }
                } catch (JSONException unused2) {
                }
            } else if (zzfcjVarZza.zzd.zzs != null) {
                strValueOf = new JSONObject(zzfcjVarZza.zzd.zzs.zza).getString("request_id");
                if (TextUtils.isEmpty(strValueOf)) {
                    strValueOf = String.valueOf(com.google.android.gms.ads.internal.client.zzbc.zze().nextInt() & Integer.MAX_VALUE);
                }
            } else {
                strValueOf = String.valueOf(com.google.android.gms.ads.internal.client.zzbc.zze().nextInt() & Integer.MAX_VALUE);
            }
        } else {
            strValueOf = String.valueOf(com.google.android.gms.ads.internal.client.zzbc.zze().nextInt() & Integer.MAX_VALUE);
        }
        zzhez.zzb(strValueOf);
        return strValueOf;
    }
}
