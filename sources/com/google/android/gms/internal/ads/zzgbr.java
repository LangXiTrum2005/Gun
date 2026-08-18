package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzgbr extends zzgbh {

    @CheckForNull
    private List zza;

    public zzgbr(zzfxi zzfxiVar, boolean z) {
        super(zzfxiVar, z, true);
        List listEmptyList = zzfxiVar.isEmpty() ? Collections.emptyList() : zzfyd.zza(zzfxiVar.size());
        for (int i = 0; i < zzfxiVar.size(); i++) {
            listEmptyList.add(null);
        }
        this.zza = listEmptyList;
    }

    public abstract Object zzG(List list);

    @Override // com.google.android.gms.internal.ads.zzgbh
    public final void zzf(int i, Object obj) {
        List list = this.zza;
        if (list != null) {
            list.set(i, new zzgbq(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgbh
    public final void zzu() {
        List list = this.zza;
        if (list != null) {
            zzc(zzG(list));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgbh
    public final void zzy(int i) {
        super.zzy(i);
        this.zza = null;
    }
}
