package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzaou;
import com.google.android.gms.internal.ads.zzapq;
import com.google.android.gms.internal.ads.zzapr;
import com.google.android.gms.internal.ads.zzaqr;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzbj extends zzaqr {
    final /* synthetic */ byte[] zza;
    final /* synthetic */ Map zzb;
    final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzl zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbj(zzbo zzboVar, int i, String str, zzapr zzaprVar, zzapq zzapqVar, byte[] bArr, Map map, com.google.android.gms.ads.internal.util.client.zzl zzlVar) {
        super(i, str, zzaprVar, zzapqVar);
        this.zza = bArr;
        this.zzb = map;
        this.zzc = zzlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final Map zzl() throws zzaou {
        Map map = this.zzb;
        return map == null ? Collections.emptyMap() : map;
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final byte[] zzx() throws zzaou {
        byte[] bArr = this.zza;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzaqr, com.google.android.gms.internal.ads.zzapm
    /* JADX INFO: renamed from: zzz */
    public final void zzo(String str) {
        this.zzc.zzg(str);
        super.zzo(str);
    }
}
