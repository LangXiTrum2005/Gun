package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class zzazv implements Comparator {
    public zzazv(zzazw zzazwVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzazk zzazkVar = (zzazk) obj;
        zzazk zzazkVar2 = (zzazk) obj2;
        if (zzazkVar.zzd() < zzazkVar2.zzd()) {
            return -1;
        }
        if (zzazkVar.zzd() <= zzazkVar2.zzd()) {
            if (zzazkVar.zzb() < zzazkVar2.zzb()) {
                return -1;
            }
            if (zzazkVar.zzb() <= zzazkVar2.zzb()) {
                float fZza = (zzazkVar.zza() - zzazkVar.zzd()) * (zzazkVar.zzc() - zzazkVar.zzb());
                float fZza2 = (zzazkVar2.zza() - zzazkVar2.zzd()) * (zzazkVar2.zzc() - zzazkVar2.zzb());
                if (fZza > fZza2) {
                    return -1;
                }
                if (fZza >= fZza2) {
                    return 0;
                }
            }
        }
        return 1;
    }
}
