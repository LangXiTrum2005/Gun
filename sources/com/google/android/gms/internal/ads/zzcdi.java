package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcdi extends zzcde {
    public zzcdi(zzcbs zzcbsVar) {
        super(zzcbsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final boolean zzt(String str) {
        String strZzf = com.google.android.gms.ads.internal.util.client.zzf.zzf(str);
        zzcbs zzcbsVar = (zzcbs) this.zzc.get();
        if (zzcbsVar != null && strZzf != null) {
            zzcbsVar.zzt(strZzf, this);
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzj("VideoStreamNoopCache is doing nothing.");
        zzg(str, strZzf, "noop", "Noop cache is a noop.");
        return false;
    }
}
