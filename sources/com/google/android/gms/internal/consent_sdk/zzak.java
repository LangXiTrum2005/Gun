package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzak implements zzd {
    private final Application zza;
    private final zzam zzb;
    private final Executor zzc;

    public zzak(Application application, zzam zzamVar, Executor executor) {
        this.zza = application;
        this.zzb = zzamVar;
        this.zzc = executor;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzd
    public final Executor zza() {
        return this.zzc;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    @Override // com.google.android.gms.internal.consent_sdk.zzd
    public final boolean zzb(String str, JSONObject jSONObject) {
        byte b;
        int iHashCode = str.hashCode();
        if (iHashCode != 94746189) {
            if (iHashCode == 113399775 && str.equals("write")) {
                b = 0;
            } else {
                b = -1;
            }
        } else if (str.equals("clear")) {
            b = 1;
        } else {
            b = -1;
        }
        if (b == 0) {
            zzck zzckVar = new zzck(this.zza);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object objOpt = jSONObject.opt(next);
                String.valueOf(objOpt);
                if (zzckVar.zzc(next, objOpt)) {
                    this.zzb.zzd().add(next);
                } else {
                    "Failed writing key: ".concat(String.valueOf(next));
                }
            }
            this.zzb.zzf();
            zzckVar.zzb();
            return true;
        }
        if (b != 1) {
            return false;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("keys");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
            "Action[clear]: wrong args.".concat(String.valueOf(jSONObject.toString()));
        } else {
            HashSet hashSet = new HashSet();
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                String strOptString = jSONArrayOptJSONArray.optString(i);
                if (!TextUtils.isEmpty(strOptString)) {
                    hashSet.add(strOptString);
                }
            }
            zzcl.zzb(this.zza, hashSet);
        }
        return true;
    }
}
