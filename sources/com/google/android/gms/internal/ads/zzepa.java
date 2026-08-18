package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzepa implements zzher {
    public static zzepa zza() {
        return zzeoz.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* synthetic */ Object zzb() {
        List arrayList = new ArrayList();
        zzbcc zzbccVar = zzbcl.zzlD;
        if (!((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbccVar)).isEmpty()) {
            arrayList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbccVar)).split(","));
        }
        zzhez.zzb(arrayList);
        return arrayList;
    }
}
