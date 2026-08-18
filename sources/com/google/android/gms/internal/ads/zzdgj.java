package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzdgj implements zzcrc {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final zzhfj zzd;
    private final zzdiq zze;

    public zzdgj(Map map, Map map2, Map map3, zzhfj zzhfjVar, zzdiq zzdiqVar) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = map3;
        this.zzd = zzhfjVar;
        this.zze = zzdiqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcrc
    @Nullable
    public final zzecw zza(int i, String str) {
        zzecw zzecwVarZza;
        zzecw zzecwVar = (zzecw) this.zza.get(str);
        if (zzecwVar != null) {
            return zzecwVar;
        }
        if (i != 1) {
            if (i != 4) {
                return null;
            }
            zzefk zzefkVar = (zzefk) this.zzc.get(str);
            if (zzefkVar != null) {
                return new zzecx(zzefkVar, new zzfuc() { // from class: com.google.android.gms.internal.ads.zzcre
                    @Override // com.google.android.gms.internal.ads.zzfuc
                    public final Object apply(Object obj) {
                        return new zzcrh((List) obj);
                    }
                });
            }
            zzecwVarZza = (zzecw) this.zzb.get(str);
            if (zzecwVarZza == null) {
                return null;
            }
        } else if (this.zze.zze() == null || (zzecwVarZza = ((zzcrc) this.zzd.zzb()).zza(i, str)) == null) {
            return null;
        }
        return new zzecx(zzecwVarZza, new zzfuc() { // from class: com.google.android.gms.internal.ads.zzcrf
            @Override // com.google.android.gms.internal.ads.zzfuc
            public final Object apply(Object obj) {
                return new zzcrh((zzcqz) obj);
            }
        });
    }
}
