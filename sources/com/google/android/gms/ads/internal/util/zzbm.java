package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzapi;
import com.google.android.gms.internal.ads.zzapm;
import com.google.android.gms.internal.ads.zzaps;
import com.google.android.gms.internal.ads.zzaqj;
import com.google.android.gms.internal.ads.zzcab;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbm extends zzapm {
    private final zzcab zza;
    private final com.google.android.gms.ads.internal.util.client.zzl zzb;

    public zzbm(String str, Map map, zzcab zzcabVar) {
        super(0, str, new zzbl(zzcabVar));
        this.zza = zzcabVar;
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
        this.zzb = zzlVar;
        zzlVar.zzd(str, "GET", null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final zzaps zzh(zzapi zzapiVar) {
        return zzaps.zzb(zzapiVar, zzaqj.zzb(zzapiVar));
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final /* bridge */ /* synthetic */ void zzo(Object obj) {
        zzapi zzapiVar = (zzapi) obj;
        this.zzb.zzf(zzapiVar.zzc, zzapiVar.zza);
        byte[] bArr = zzapiVar.zzb;
        if (com.google.android.gms.ads.internal.util.client.zzl.zzk() && bArr != null) {
            this.zzb.zzh(bArr);
        }
        this.zza.zzc(zzapiVar);
    }
}
