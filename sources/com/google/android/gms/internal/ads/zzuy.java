package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzuy extends zzto {
    private static final zzar zza;
    private final zzui[] zzb;
    private final List zzc;
    private final zzbq[] zzd;
    private final ArrayList zze;
    private int zzf = -1;
    private long[][] zzg;

    @Nullable
    private zzuv zzh;
    private final zztr zzi;

    static {
        zzaf zzafVar = new zzaf();
        zzafVar.zza("MergingMediaSource");
        zza = zzafVar.zzc();
    }

    public zzuy(boolean z, boolean z2, zztr zztrVar, zzui... zzuiVarArr) {
        this.zzb = zzuiVarArr;
        this.zzi = zztrVar;
        this.zze = new ArrayList(Arrays.asList(zzuiVarArr));
        this.zzc = new ArrayList(zzuiVarArr.length);
        int i = 0;
        while (true) {
            int length = zzuiVarArr.length;
            if (i >= length) {
                this.zzd = new zzbq[length];
                this.zzg = new long[0][];
                new HashMap();
                zzfyt.zzb(8).zzb(2).zza();
                return;
            }
            this.zzc.add(new ArrayList());
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzto
    public final /* bridge */ /* synthetic */ void zzA(Object obj, zzui zzuiVar, zzbq zzbqVar) {
        int iZzb;
        Integer num = (Integer) obj;
        if (this.zzh != null) {
            return;
        }
        if (this.zzf == -1) {
            iZzb = zzbqVar.zzb();
            this.zzf = iZzb;
        } else {
            int iZzb2 = zzbqVar.zzb();
            int i = this.zzf;
            if (iZzb2 != i) {
                this.zzh = new zzuv(0);
                return;
            }
            iZzb = i;
        }
        if (this.zzg.length == 0) {
            this.zzg = (long[][]) Array.newInstance((Class<?>) Long.TYPE, iZzb, this.zzd.length);
        }
        this.zze.remove(zzuiVar);
        this.zzd[num.intValue()] = zzbqVar;
        if (this.zze.isEmpty()) {
            zzo(this.zzd[0]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public final void zzG(zzue zzueVar) {
        zzuu zzuuVar = (zzuu) zzueVar;
        for (int i = 0; i < this.zzb.length; i++) {
            List list = (List) this.zzc.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (((zzuw) list.get(i2)).zzb.equals(zzueVar)) {
                    list.remove(i2);
                    break;
                }
            }
            this.zzb[i].zzG(zzuuVar.zzn(i));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public final zzue zzI(zzug zzugVar, zzyk zzykVar, long j) {
        zzbq[] zzbqVarArr = this.zzd;
        int length = this.zzb.length;
        zzue[] zzueVarArr = new zzue[length];
        int iZza = zzbqVarArr[0].zza(zzugVar.zza);
        for (int i = 0; i < length; i++) {
            zzug zzugVarZza = zzugVar.zza(this.zzd[i].zzf(iZza));
            zzueVarArr[i] = this.zzb[i].zzI(zzugVarZza, zzykVar, j - this.zzg[iZza][i]);
            ((List) this.zzc.get(i)).add(new zzuw(zzugVarZza, zzueVarArr[i], null));
        }
        return new zzuu(this.zzi, this.zzg[iZza], zzueVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public final zzar zzJ() {
        zzui[] zzuiVarArr = this.zzb;
        return zzuiVarArr.length > 0 ? zzuiVarArr[0].zzJ() : zza;
    }

    @Override // com.google.android.gms.internal.ads.zzto, com.google.android.gms.internal.ads.zztf
    public final void zzn(@Nullable zzgy zzgyVar) {
        super.zzn(zzgyVar);
        int i = 0;
        while (true) {
            zzui[] zzuiVarArr = this.zzb;
            if (i >= zzuiVarArr.length) {
                return;
            }
            zzB(Integer.valueOf(i), zzuiVarArr[i]);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzto, com.google.android.gms.internal.ads.zztf
    public final void zzq() {
        super.zzq();
        Arrays.fill(this.zzd, (Object) null);
        this.zzf = -1;
        this.zzh = null;
        this.zze.clear();
        Collections.addAll(this.zze, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zztf, com.google.android.gms.internal.ads.zzui
    public final void zzt(zzar zzarVar) {
        this.zzb[0].zzt(zzarVar);
    }

    @Override // com.google.android.gms.internal.ads.zzto
    @Nullable
    public final /* bridge */ /* synthetic */ zzug zzy(Object obj, zzug zzugVar) {
        List list = (List) this.zzc.get(((Integer) obj).intValue());
        for (int i = 0; i < list.size(); i++) {
            if (((zzuw) list.get(i)).zza.equals(zzugVar)) {
                return ((zzuw) ((List) this.zzc.get(0)).get(i)).zza;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzto, com.google.android.gms.internal.ads.zzui
    public final void zzz() throws IOException {
        zzuv zzuvVar = this.zzh;
        if (zzuvVar != null) {
            throw zzuvVar;
        }
        super.zzz();
    }
}
