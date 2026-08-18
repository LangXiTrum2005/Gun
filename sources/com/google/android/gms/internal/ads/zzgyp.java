package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzgyp {
    public static final List zza(Object obj, long j) {
        zzgyd zzgydVar = (zzgyd) zzhao.zzh(obj, j);
        if (zzgydVar.zzc()) {
            return zzgydVar;
        }
        int size = zzgydVar.size();
        zzgyd zzgydVarZzf = zzgydVar.zzf(size == 0 ? 10 : size + size);
        zzhao.zzv(obj, j, zzgydVarZzf);
        return zzgydVarZzf;
    }
}
