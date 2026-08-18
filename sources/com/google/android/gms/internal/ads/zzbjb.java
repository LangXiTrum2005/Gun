package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzbjb implements zzbjp {
    @Override // com.google.android.gms.internal.ads.zzbjp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcex zzcexVar = (zzcex) obj;
        try {
            zzfre.zzj(zzcexVar.getContext()).zzk();
            zzfrf.zzi(zzcexVar.getContext()).zzj();
            zzfrg.zza(zzcexVar.getContext()).zzb(null);
        } catch (IOException e) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "DefaultGmsgHandlers.ResetPaid");
        }
    }
}
