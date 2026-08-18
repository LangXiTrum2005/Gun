package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdnq {
    private final zzcvr zza;
    private final zzcxa zzb;
    private final zzcxn zzc;
    private final zzcxz zzd;
    private final zzdap zze;
    private final zzddq zzf;
    private final zzdrw zzg;
    private final zzfja zzh;
    private final zzebk zzi;
    private final zzcmk zzj;

    public zzdnq(zzcvr zzcvrVar, zzcxa zzcxaVar, zzcxn zzcxnVar, zzcxz zzcxzVar, zzdap zzdapVar, zzddq zzddqVar, zzdrw zzdrwVar, zzfja zzfjaVar, zzebk zzebkVar, zzcmk zzcmkVar) {
        this.zza = zzcvrVar;
        this.zzb = zzcxaVar;
        this.zzc = zzcxnVar;
        this.zzd = zzcxzVar;
        this.zze = zzdapVar;
        this.zzf = zzddqVar;
        this.zzg = zzdrwVar;
        this.zzh = zzfjaVar;
        this.zzi = zzebkVar;
        this.zzj = zzcmkVar;
    }

    public final void zza(zzdnr zzdnrVar, zzcex zzcexVar) {
        zzdno zzdnoVar = zzdnrVar.zza;
        final zzcxa zzcxaVar = this.zzb;
        Objects.requireNonNull(zzcxaVar);
        zzdnoVar.zzi(this.zza, this.zzc, this.zzd, this.zze, new com.google.android.gms.ads.internal.overlay.zzac() { // from class: com.google.android.gms.internal.ads.zzdnp
            @Override // com.google.android.gms.ads.internal.overlay.zzac
            public final void zzg() {
                zzcxaVar.zzb();
            }
        }, this.zzf);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjZ)).booleanValue() || zzcexVar == null || zzcexVar.zzN() == null) {
            return;
        }
        zzcgp zzcgpVarZzN = zzcexVar.zzN();
        zzcgpVarZzN.zzK(this.zzj, this.zzi, this.zzh);
        zzcgpVarZzN.zzM(this.zzj, this.zzi, this.zzg);
    }
}
