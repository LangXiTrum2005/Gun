package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzglx {
    public static final zzglp zza = new zzglv(null);

    public static zzglu zza(zzgnf zzgnfVar) {
        zzgdz zzgdzVar;
        zzglr zzglrVar = new zzglr();
        zzglrVar.zzb(zzgnfVar.zza());
        Iterator it = zzgnfVar.zze().iterator();
        while (it.hasNext()) {
            for (zzgnd zzgndVar : (List) it.next()) {
                int iZzf = zzgndVar.zzf() - 2;
                if (iZzf == 1) {
                    zzgdzVar = zzgdz.zza;
                } else if (iZzf == 2) {
                    zzgdzVar = zzgdz.zzb;
                } else {
                    if (iZzf != 3) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    zzgdzVar = zzgdz.zzc;
                }
                int iZza = zzgndVar.zza();
                String strZze = zzgndVar.zze();
                if (strZze.startsWith("type.googleapis.com/google.crypto.")) {
                    strZze = strZze.substring(34);
                }
                zzglrVar.zza(zzgdzVar, iZza, strZze, zzgndVar.zzb().name());
            }
        }
        if (zzgnfVar.zzc() != null) {
            zzglrVar.zzc(zzgnfVar.zzc().zza());
        }
        try {
            return zzglrVar.zzd();
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
