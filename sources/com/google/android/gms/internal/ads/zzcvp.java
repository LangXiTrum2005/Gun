package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcvp implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;

    public zzcvp(zzcvo zzcvoVar, zzhfj zzhfjVar, zzhfj zzhfjVar2, zzhfj zzhfjVar3, zzhfj zzhfjVar4) {
        this.zza = zzhfjVar;
        this.zzb = zzhfjVar2;
        this.zzc = zzhfjVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context context = (Context) this.zza.zzb();
        VersionInfoParcel versionInfoParcelZza = ((zzchs) this.zzb).zza();
        zzfbo zzfboVarZza = ((zzcrq) this.zzc).zza();
        zzbxq zzbxqVar = new zzbxq();
        zzbxr zzbxrVar = zzfboVarZza.zzA;
        if (zzbxrVar == null) {
            return null;
        }
        zzfbt zzfbtVar = zzfboVarZza.zzs;
        return new zzbxp(context, versionInfoParcelZza, zzbxrVar, zzfbtVar == null ? null : zzfbtVar.zzb, zzbxqVar);
    }
}
