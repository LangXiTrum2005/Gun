package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzglr {

    @Nullable
    private ArrayList zza = new ArrayList();
    private zzglo zzb = zzglo.zza;

    @Nullable
    private Integer zzc = null;

    public final zzglr zza(zzgdz zzgdzVar, int i, String str, String str2) {
        ArrayList arrayList = this.zza;
        if (arrayList == null) {
            throw new IllegalStateException("addEntry cannot be called after build()");
        }
        arrayList.add(new zzgls(zzgdzVar, i, str, str2, null));
        return this;
    }

    public final zzglr zzb(zzglo zzgloVar) {
        if (this.zza == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build()");
        }
        this.zzb = zzgloVar;
        return this;
    }

    public final zzglr zzc(int i) {
        if (this.zza == null) {
            throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
        }
        this.zzc = Integer.valueOf(i);
        return this;
    }

    public final zzglu zzd() throws GeneralSecurityException {
        if (this.zza == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        Integer num = this.zzc;
        if (num != null) {
            int iIntValue = num.intValue();
            ArrayList arrayList = this.zza;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                int iZza = ((zzgls) arrayList.get(i)).zza();
                i++;
                if (iZza == iIntValue) {
                }
            }
            throw new GeneralSecurityException("primary key ID is not present in entries");
        }
        zzglu zzgluVar = new zzglu(this.zzb, Collections.unmodifiableList(this.zza), this.zzc, null);
        this.zza = null;
        return zzgluVar;
    }
}
