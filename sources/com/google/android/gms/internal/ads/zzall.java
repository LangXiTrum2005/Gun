package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class zzall implements zzakf {
    private final zzdy zza = new zzdy();

    @Override // com.google.android.gms.internal.ads.zzakf
    public final void zza(byte[] bArr, int i, int i2, zzake zzakeVar, zzdb zzdbVar) {
        zzco zzcoVarZzp;
        this.zza.zzJ(bArr, i2 + i);
        this.zza.zzL(i);
        ArrayList arrayList = new ArrayList();
        while (true) {
            zzdy zzdyVar = this.zza;
            if (zzdyVar.zzb() <= 0) {
                zzdbVar.zza(new zzajx(arrayList, C.TIME_UNSET, C.TIME_UNSET));
                return;
            }
            zzcw.zze(zzdyVar.zzb() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            zzdy zzdyVar2 = this.zza;
            int iZzg = zzdyVar2.zzg() - 8;
            if (zzdyVar2.zzg() == 1987343459) {
                zzdy zzdyVar3 = this.zza;
                CharSequence charSequenceZza = null;
                zzcm zzcmVarZzb = null;
                while (iZzg > 0) {
                    zzcw.zze(iZzg >= 8, "Incomplete vtt cue box header found.");
                    int iZzg2 = zzdyVar3.zzg();
                    int iZzg3 = zzdyVar3.zzg();
                    int i3 = iZzg - 8;
                    int i4 = iZzg2 - 8;
                    String strZzC = zzei.zzC(zzdyVar3.zzN(), zzdyVar3.zzd(), i4);
                    zzdyVar3.zzM(i4);
                    if (iZzg3 == 1937011815) {
                        zzcmVarZzb = zzalv.zzb(strZzC);
                    } else if (iZzg3 == 1885436268) {
                        charSequenceZza = zzalv.zza(null, strZzC.trim(), Collections.emptyList());
                    }
                    iZzg = i3 - i4;
                }
                if (charSequenceZza == null) {
                    charSequenceZza = "";
                }
                if (zzcmVarZzb != null) {
                    zzcmVarZzb.zzl(charSequenceZza);
                    zzcoVarZzp = zzcmVarZzb.zzp();
                } else {
                    zzalt zzaltVar = new zzalt();
                    zzaltVar.zzc = charSequenceZza;
                    zzcoVarZzp = zzaltVar.zza().zzp();
                }
                arrayList.add(zzcoVarZzp);
            } else {
                this.zza.zzM(iZzg);
            }
        }
    }
}
