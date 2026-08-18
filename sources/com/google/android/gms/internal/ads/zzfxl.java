package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzfxl extends zzfvn {
    private final zzfxn zza;

    public zzfxl(zzfxn zzfxnVar, int i) {
        super(zzfxnVar.size(), i);
        this.zza = zzfxnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final Object zza(int i) {
        return this.zza.get(i);
    }
}
