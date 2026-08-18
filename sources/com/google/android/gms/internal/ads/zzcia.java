package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcia implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;

    public zzcia(zzhfj zzhfjVar, zzhfj zzhfjVar2) {
        this.zza = zzhfjVar;
        this.zzb = zzhfjVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzbve zzb() {
        Context contextZza = ((zzche) this.zza).zza();
        zzfhk zzfhkVar = (zzfhk) this.zzb.zzb();
        zzbog zzbogVarZzb = com.google.android.gms.ads.internal.zzv.zzg().zzb(contextZza, VersionInfoParcel.forPackage(), zzfhkVar);
        zzboa zzboaVar = zzbod.zza;
        zzbogVarZzb.zza("google.afma.request.getAdDictionary", zzboaVar, zzboaVar);
        return new zzbvg(contextZza, com.google.android.gms.ads.internal.zzv.zzg().zzb(contextZza, VersionInfoParcel.forPackage(), zzfhkVar).zza("google.afma.sdkConstants.getSdkConstants", zzboaVar, zzboaVar), VersionInfoParcel.forPackage());
    }
}
