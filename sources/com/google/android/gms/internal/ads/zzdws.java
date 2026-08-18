package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdws implements zzher {
    private final zzhfj zza;

    public zzdws(zzhfj zzhfjVar) {
        this.zza = zzhfjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final String zzb() {
        String packageName = ((zzche) this.zza).zza().getPackageName();
        zzhez.zzb(packageName);
        return packageName;
    }
}
