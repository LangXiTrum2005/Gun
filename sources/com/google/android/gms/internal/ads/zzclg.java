package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzclg implements zzcla {
    private final zzduv zza;

    public zzclg(zzduv zzduvVar) {
        this.zza = zzduvVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    @Override // com.google.android.gms.internal.ads.zzcla
    public final void zza(Map map) {
        byte b;
        String str = (String) map.get("gesture");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != 97520651) {
            if (iHashCode == 109399814 && str.equals("shake")) {
                b = 0;
            } else {
                b = -1;
            }
        } else if (str.equals("flick")) {
            b = 1;
        } else {
            b = -1;
        }
        if (b == 0) {
            this.zza.zzm(zzdur.SHAKE);
        } else if (b != 1) {
            this.zza.zzm(zzdur.NONE);
        } else {
            this.zza.zzm(zzdur.FLICK);
        }
    }
}
