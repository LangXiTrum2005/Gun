package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaxo extends zzaxr {
    private final View zzh;

    public zzaxo(zzawd zzawdVar, String str, String str2, zzasc zzascVar, int i, int i2, View view) {
        super(zzawdVar, "mEjNDtPMm+doViWgwYfgFasHLoNhAzlke51uTCfqtDoGOxX1zsnuUhlK2oJYi5bg", "XF2ECF8x32hNHbBL1ZweWW5YOt0QuzlbOpXni7lBWlc=", zzascVar, i, 57);
        this.zzh = view;
    }

    @Override // com.google.android.gms.internal.ads.zzaxr
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzh != null) {
            Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdy);
            Boolean bool2 = (Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkP);
            zzawh zzawhVar = new zzawh((String) this.zze.invoke(null, this.zzh, this.zza.zzb().getResources().getDisplayMetrics(), bool, bool2));
            zzasw zzaswVarZza = zzasx.zza();
            zzaswVarZza.zzb(zzawhVar.zza.longValue());
            zzaswVarZza.zzd(zzawhVar.zzb.longValue());
            zzaswVarZza.zze(zzawhVar.zzc.longValue());
            if (bool2.booleanValue()) {
                zzaswVarZza.zzc(zzawhVar.zze.longValue());
            }
            if (bool.booleanValue()) {
                zzaswVarZza.zza(zzawhVar.zzd.longValue());
            }
            this.zzd.zzY((zzasx) zzaswVarZza.zzbr());
        }
    }
}
