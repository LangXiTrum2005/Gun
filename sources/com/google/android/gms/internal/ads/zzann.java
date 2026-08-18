package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzann {
    private final List zza;
    private final zzadt[] zzb;
    private final zzfo zzc = new zzfo(new zzfm() { // from class: com.google.android.gms.internal.ads.zzanm
        @Override // com.google.android.gms.internal.ads.zzfm
        public final void zza(long j, zzdy zzdyVar) {
            this.zza.zzd(j, zzdyVar);
        }
    });

    public zzann(List list) {
        this.zza = list;
        this.zzb = new zzadt[list.size()];
    }

    public final void zza(long j, zzdy zzdyVar) {
        this.zzc.zzb(j, zzdyVar);
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
            String strZzb = zzabVar.zza;
            if (strZzb == null) {
                strZzb = zzanxVar.zzb();
            }
            zzz zzzVar = new zzz();
            zzzVar.zzM(strZzb);
            zzzVar.zzaa(str);
            zzzVar.zzac(zzabVar.zze);
            zzzVar.zzQ(zzabVar.zzd);
            zzzVar.zzx(zzabVar.zzI);
            zzzVar.zzN(zzabVar.zzr);
            zzadtVarZzw.zzm(zzzVar.zzag());
            this.zzb[i] = zzadtVarZzw;
        }
    }

    public final void zzc() {
        this.zzc.zzc();
    }

    public final /* synthetic */ void zzd(long j, zzdy zzdyVar) {
        zzabz.zza(j, zzdyVar, this.zzb);
    }

    public final void zze(int i) {
        this.zzc.zzd(i);
    }
}
