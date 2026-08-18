package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzbjg implements zzbjp {
    @Override // com.google.android.gms.internal.ads.zzbjp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcex zzcexVar = (zzcex) obj;
        if (zzcexVar.zzJ() != null) {
            zzcexVar.zzJ().zza();
        }
        com.google.android.gms.ads.internal.overlay.zzm zzmVarZzL = zzcexVar.zzL();
        if (zzmVarZzL != null) {
            zzmVarZzL.zzb();
            return;
        }
        com.google.android.gms.ads.internal.overlay.zzm zzmVarZzM = zzcexVar.zzM();
        if (zzmVarZzM != null) {
            zzmVarZzM.zzb();
        } else {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
