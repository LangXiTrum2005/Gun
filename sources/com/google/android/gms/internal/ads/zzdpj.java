package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdpj {
    private final Map zza = new HashMap();

    @Nullable
    public final synchronized zzdpi zza(String str) {
        return (zzdpi) this.zza.get(str);
    }

    public final String zzb(String str) {
        zzbrs zzbrsVar;
        zzdpi zzdpiVarZza = zza(str);
        return (zzdpiVarZza == null || (zzbrsVar = zzdpiVarZza.zzb) == null) ? "" : zzbrsVar.toString();
    }

    public final synchronized void zzc(String str, @Nullable zzfdh zzfdhVar) {
        zzbrs zzbrsVarZze;
        if (this.zza.containsKey(str)) {
            return;
        }
        zzbrs zzbrsVarZzf = null;
        if (zzfdhVar == null) {
            zzbrsVarZze = null;
        } else {
            try {
                zzbrsVarZze = zzfdhVar.zze();
            } catch (zzfcq unused) {
                zzbrsVarZze = null;
            }
        }
        if (zzfdhVar != null) {
            try {
                zzbrsVarZzf = zzfdhVar.zzf();
            } catch (zzfcq unused2) {
            }
        }
        boolean z = true;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjk)).booleanValue()) {
            if (zzfdhVar == null) {
                z = false;
            } else {
                try {
                    zzfdhVar.zzC();
                } catch (zzfcq unused3) {
                    z = false;
                }
            }
        }
        this.zza.put(str, new zzdpi(str, zzbrsVarZze, zzbrsVarZzf, z));
    }

    public final synchronized void zzd(String str, zzbrd zzbrdVar) {
        if (this.zza.containsKey(str)) {
            return;
        }
        try {
            this.zza.put(str, new zzdpi(str, zzbrdVar.zzf(), zzbrdVar.zzg(), true));
        } catch (Throwable unused) {
        }
    }
}
