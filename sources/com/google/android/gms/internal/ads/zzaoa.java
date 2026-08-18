package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzaoa {
    private final List zza;
    private final zzadt[] zzb;

    public zzaoa(List list) {
        this.zza = list;
        this.zzb = new zzadt[list.size()];
    }

    public final void zza(long j, zzdy zzdyVar) {
        if (zzdyVar.zzb() < 9) {
            return;
        }
        int iZzg = zzdyVar.zzg();
        int iZzg2 = zzdyVar.zzg();
        int iZzm = zzdyVar.zzm();
        if (iZzg == 434 && iZzg2 == 1195456820 && iZzm == 3) {
            zzabz.zzb(j, zzdyVar, this.zzb);
        }
    }

    public final void zzb(zzacq zzacqVar, zzanx zzanxVar) {
        for (int i = 0; i < this.zzb.length; i++) {
            zzanxVar.zzc();
            zzadt zzadtVarZzw = zzacqVar.zzw(zzanxVar.zza(), 3);
            zzab zzabVar = (zzab) this.zza.get(i);
            String str = zzabVar.zzo;
            boolean z = true;
            if (!MimeTypes.APPLICATION_CEA608.equals(str) && !MimeTypes.APPLICATION_CEA708.equals(str)) {
                z = false;
            }
            zzcw.zze(z, "Invalid closed caption MIME type provided: ".concat(String.valueOf(str)));
            zzz zzzVar = new zzz();
            zzzVar.zzM(zzanxVar.zzb());
            zzzVar.zzaa(str);
            zzzVar.zzac(zzabVar.zze);
            zzzVar.zzQ(zzabVar.zzd);
            zzzVar.zzx(zzabVar.zzI);
            zzzVar.zzN(zzabVar.zzr);
            zzadtVarZzw.zzm(zzzVar.zzag());
            this.zzb[i] = zzadtVarZzw;
        }
    }
}
