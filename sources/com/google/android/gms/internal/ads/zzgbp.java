package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzgbp extends zzgbr {
    public zzgbp(zzfxi zzfxiVar, boolean z) {
        super(zzfxiVar, z);
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzgbr
    public final /* bridge */ /* synthetic */ Object zzG(List list) {
        ArrayList arrayListZza = zzfyd.zza(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzgbq zzgbqVar = (zzgbq) it.next();
            arrayListZza.add(zzgbqVar != null ? zzgbqVar.zza : null);
        }
        return Collections.unmodifiableList(arrayListZza);
    }
}
