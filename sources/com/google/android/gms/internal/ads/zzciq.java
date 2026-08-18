package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
final class zzciq implements zzeyc {
    private final zzcih zza;
    private Context zzb;
    private String zzc;
    private com.google.android.gms.ads.internal.client.zzs zzd;

    public /* synthetic */ zzciq(zzcih zzcihVar, zzcjm zzcjmVar) {
        this.zza = zzcihVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeyc
    public final /* bridge */ /* synthetic */ zzeyc zza(com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzsVar.getClass();
        this.zzd = zzsVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeyc
    public final /* bridge */ /* synthetic */ zzeyc zzb(String str) {
        str.getClass();
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeyc
    public final /* bridge */ /* synthetic */ zzeyc zzc(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzeyc
    public final zzeyd zzd() {
        zzhez.zzc(this.zzb, Context.class);
        zzhez.zzc(this.zzc, String.class);
        zzhez.zzc(this.zzd, com.google.android.gms.ads.internal.client.zzs.class);
        return new zzcir(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
