package com.google.android.gms.internal.measurement;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzv extends zzai {
    private final zzz zza;

    public zzv(zzz zzzVar) {
        super("internal.registerCallback");
        this.zza = zzzVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzap zza(zzg zzgVar, List list) {
        zzh.zzh(this.zzd, 3, list);
        String strZzi = zzgVar.zzb((zzap) list.get(0)).zzi();
        zzap zzapVarZzb = zzgVar.zzb((zzap) list.get(1));
        if (!(zzapVarZzb instanceof zzao)) {
            throw new IllegalArgumentException("Invalid callback type");
        }
        zzap zzapVarZzb2 = zzgVar.zzb((zzap) list.get(2));
        if (!(zzapVarZzb2 instanceof zzam)) {
            throw new IllegalArgumentException("Invalid callback params");
        }
        zzam zzamVar = (zzam) zzapVarZzb2;
        if (!zzamVar.zzt("type")) {
            throw new IllegalArgumentException("Undefined rule type");
        }
        this.zza.zza(strZzi, zzamVar.zzt(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY) ? zzh.zzb(zzamVar.zzf(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY).zzh().doubleValue()) : 1000, (zzao) zzapVarZzb, zzamVar.zzf("type").zzi());
        return zzap.zzf;
    }
}
