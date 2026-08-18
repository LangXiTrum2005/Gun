package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzajz {
    public static void zza(zzaka zzakaVar, zzake zzakeVar, zzdb zzdbVar) {
        for (int i = 0; i < zzakaVar.zza(); i++) {
            long jZzb = zzakaVar.zzb(i);
            List listZzc = zzakaVar.zzc(jZzb);
            if (!listZzc.isEmpty()) {
                if (i == zzakaVar.zza() - 1) {
                    throw new IllegalStateException();
                }
                long jZzb2 = zzakaVar.zzb(i + 1) - zzakaVar.zzb(i);
                if (jZzb2 > 0) {
                    zzdbVar.zza(new zzajx(listZzc, jZzb, jZzb2));
                }
            }
        }
    }
}
