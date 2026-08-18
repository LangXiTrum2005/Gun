package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzaff extends zzada {
    final /* synthetic */ zzadm zza;
    final /* synthetic */ zzafg zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaff(zzafg zzafgVar, zzadm zzadmVar, zzadm zzadmVar2) {
        super(zzadmVar);
        this.zza = zzadmVar2;
        this.zzb = zzafgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzada, com.google.android.gms.internal.ads.zzadm
    public final zzadk zzg(long j) {
        zzadk zzadkVarZzg = this.zza.zzg(j);
        zzadn zzadnVar = zzadkVarZzg.zza;
        zzadn zzadnVar2 = new zzadn(zzadnVar.zzb, this.zzb.zzb + zzadnVar.zzc);
        zzadn zzadnVar3 = zzadkVarZzg.zzb;
        return new zzadk(zzadnVar2, new zzadn(zzadnVar3.zzb, this.zzb.zzb + zzadnVar3.zzc));
    }
}
