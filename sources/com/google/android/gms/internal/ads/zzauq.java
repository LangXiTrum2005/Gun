package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
final class zzauq implements zzfpd {
    final /* synthetic */ zzfnd zza;

    public zzauq(zzaus zzausVar, zzfnd zzfndVar) {
        this.zza = zzfndVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfpd
    public final boolean zza(File file) {
        try {
            return this.zza.zza(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
