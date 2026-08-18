package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgmk {
    private static final zzgmk zza = (zzgmk) zzgnt.zza(new zzgns() { // from class: com.google.android.gms.internal.ads.zzgmi
        @Override // com.google.android.gms.internal.ads.zzgns
        public final Object zza() throws GeneralSecurityException {
            zzgmk zzgmkVar = new zzgmk();
            zzgmkVar.zzg(new zzgle(zzglk.class, zzgnh.class, new zzglf() { // from class: com.google.android.gms.internal.ads.zzgmj
                @Override // com.google.android.gms.internal.ads.zzglf
                public final zzgnm zza(zzgdx zzgdxVar, zzgeo zzgeoVar) {
                    return ((zzglk) zzgdxVar).zza(zzgeoVar);
                }
            }));
            return zzgmkVar;
        }
    });
    private final AtomicReference zzb = new AtomicReference(new zzgnr(new zzgnn(), null));

    public static zzgmk zzc() {
        return zza;
    }

    public final zzgdx zza(zzgnm zzgnmVar, @Nullable zzgeo zzgeoVar) throws GeneralSecurityException {
        return ((zzgnr) this.zzb.get()).zza(zzgnmVar, zzgeoVar);
    }

    public final zzgek zzb(zzgnm zzgnmVar) throws GeneralSecurityException {
        return ((zzgnr) this.zzb.get()).zzb(zzgnmVar);
    }

    public final zzgnm zzd(zzgdx zzgdxVar, Class cls, @Nullable zzgeo zzgeoVar) throws GeneralSecurityException {
        return ((zzgnr) this.zzb.get()).zzc(zzgdxVar, cls, zzgeoVar);
    }

    public final zzgnm zze(zzgek zzgekVar, Class cls) throws GeneralSecurityException {
        return ((zzgnr) this.zzb.get()).zzd(zzgekVar, cls);
    }

    public final synchronized void zzf(zzgld zzgldVar) throws GeneralSecurityException {
        zzgnn zzgnnVar = new zzgnn((zzgnr) this.zzb.get());
        zzgnnVar.zza(zzgldVar);
        this.zzb.set(new zzgnr(zzgnnVar, null));
    }

    public final synchronized void zzg(zzglh zzglhVar) throws GeneralSecurityException {
        zzgnn zzgnnVar = new zzgnn((zzgnr) this.zzb.get());
        zzgnnVar.zzb(zzglhVar);
        this.zzb.set(new zzgnr(zzgnnVar, null));
    }

    public final synchronized void zzh(zzgmp zzgmpVar) throws GeneralSecurityException {
        zzgnn zzgnnVar = new zzgnn((zzgnr) this.zzb.get());
        zzgnnVar.zzc(zzgmpVar);
        this.zzb.set(new zzgnr(zzgnnVar, null));
    }

    public final synchronized void zzi(zzgmt zzgmtVar) throws GeneralSecurityException {
        zzgnn zzgnnVar = new zzgnn((zzgnr) this.zzb.get());
        zzgnnVar.zzd(zzgmtVar);
        this.zzb.set(new zzgnr(zzgnnVar, null));
    }

    public final boolean zzj(zzgnm zzgnmVar) {
        return ((zzgnr) this.zzb.get()).zzi(zzgnmVar);
    }

    public final boolean zzk(zzgnm zzgnmVar) {
        return ((zzgnr) this.zzb.get()).zzj(zzgnmVar);
    }
}
