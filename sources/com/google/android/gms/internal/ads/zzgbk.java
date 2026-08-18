package com.google.android.gms.internal.ads;

import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
final class zzgbk extends zzgbi {
    private zzgbk() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgbi
    public final int zza(zzgbm zzgbmVar) {
        int i;
        synchronized (zzgbmVar) {
            i = zzgbmVar.remaining - 1;
            zzgbmVar.remaining = i;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzgbi
    public final void zzb(zzgbm zzgbmVar, @CheckForNull Set set, Set set2) {
        synchronized (zzgbmVar) {
            try {
                if (zzgbmVar.seenExceptions == null) {
                    zzgbmVar.seenExceptions = set2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* synthetic */ zzgbk(zzgbl zzgblVar) {
        super(null);
    }
}
