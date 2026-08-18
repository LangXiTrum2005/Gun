package com.google.android.gms.internal.ads;

import com.google.android.gms.security.ProviderInstaller;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class zzgut implements zzguu {
    private final zzgve zza;

    public /* synthetic */ zzgut(zzgve zzgveVar, zzguv zzguvVar) {
        this.zza = zzgveVar;
    }

    @Override // com.google.android.gms.internal.ads.zzguu
    public final Object zza(String str) throws GeneralSecurityException {
        Iterator it = zzguw.zzb(ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL", "Conscrypt").iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return this.zza.zza(str, (Provider) it.next());
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
