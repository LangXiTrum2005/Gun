package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzauz extends zzauy {
    private zzauz(Context context, zzaux zzauxVar) {
        super(context, zzauxVar);
    }

    public static zzauz zzu(Context context, zzaux zzauxVar) {
        zzauy.zzs(context, zzauxVar);
        return new zzauz(context, zzauxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzauy
    public final List zzq(zzawd zzawdVar, Context context, zzasc zzascVar, zzarp zzarpVar) {
        if (zzawdVar.zzk() == null || !((zzauy) this).zzu.zza) {
            return super.zzq(zzawdVar, context, zzascVar, null);
        }
        int iZza = zzawdVar.zza();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.zzq(zzawdVar, context, zzascVar, null));
        arrayList.add(new zzawv(zzawdVar, "mYdY7l5D+eRA2n+1DSS0l4Onm7QwkKst2ndSMEehloNd2MnZiOwv+qpmI2KWHSFP", "85J7Wr+LLVwpDfypFtzN1eoOiAfuTMa63SuSJgN9bwE=", zzascVar, iZza, 24));
        return arrayList;
    }
}
