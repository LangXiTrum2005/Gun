package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbjv implements zzbjp {
    private final Context zza;
    private final Map zzb;

    public zzbjv(Context context, Map map) {
        this.zza = context;
        this.zzb = map;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    @Override // com.google.android.gms.internal.ads.zzbjp
    public final void zza(Object obj, Map map) {
        byte b;
        if (com.google.android.gms.ads.internal.zzv.zzo().zzp(this.zza)) {
            String str = (String) map.get("eventName");
            String str2 = (String) map.get("eventId");
            int iHashCode = str.hashCode();
            if (iHashCode != 94399) {
                if (iHashCode != 94401) {
                    if (iHashCode == 94407 && str.equals("_ai")) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                } else if (str.equals("_ac")) {
                    b = 0;
                } else {
                    b = -1;
                }
            } else if (str.equals("_aa")) {
                b = 2;
            } else {
                b = -1;
            }
            if (b == 0) {
                com.google.android.gms.ads.internal.zzv.zzo().zzj(this.zza, str2, (Map) this.zzb.get("_ac"));
            } else if (b == 1) {
                com.google.android.gms.ads.internal.zzv.zzo().zzk(this.zza, str2, (Map) this.zzb.get("_ai"));
            } else if (b != 2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("logScionEvent gmsg contained unsupported eventName");
            } else {
                com.google.android.gms.ads.internal.zzv.zzo().zzh(this.zza, str2);
            }
        }
    }
}
