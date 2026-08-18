package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzguw {
    public static final zzguw zza = new zzguw(new zzgux());
    public static final zzguw zzb = new zzguw(new zzgvb());
    private final zzguu zzc;

    static {
        new zzguw(new zzgvd());
        new zzguw(new zzgvc());
        new zzguw(new zzguy());
        new zzguw(new zzgva());
        new zzguw(new zzguz());
    }

    public zzguw(zzgve zzgveVar) {
        zzguv zzguvVar = null;
        this.zzc = !zzgkt.zzb() ? "The Android Project".equals(System.getProperty("java.vendor")) ? new zzgur(zzgveVar, zzguvVar) : new zzgus(zzgveVar, zzguvVar) : new zzgut(zzgveVar, zzguvVar);
    }

    public static List zzb(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public final Object zza(String str) throws GeneralSecurityException {
        return this.zzc.zza(str);
    }
}
