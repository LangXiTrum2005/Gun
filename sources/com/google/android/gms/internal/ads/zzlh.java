package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzlh extends zzhi {
    public static final /* synthetic */ int zzb = 0;
    private final int zzc;
    private final int zzd;
    private final int[] zze;
    private final int[] zzf;
    private final zzbq[] zzg;
    private final Object[] zzh;
    private final HashMap zzi;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzlh(Collection collection, zzwb zzwbVar) {
        zzbq[] zzbqVarArr = new zzbq[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            zzbqVarArr[i2] = ((zzkp) it.next()).zza();
            i2++;
        }
        Object[] objArr = new Object[collection.size()];
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            objArr[i] = ((zzkp) it2.next()).zzb();
            i++;
        }
        this(zzbqVarArr, objArr, zzwbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbq
    public final int zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbq
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhi
    public final int zzp(Object obj) {
        Integer num = (Integer) this.zzi.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.internal.ads.zzhi
    public final int zzq(int i) {
        return zzei.zzc(this.zze, i + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzhi
    public final int zzr(int i) {
        return zzei.zzc(this.zzf, i + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzhi
    public final int zzs(int i) {
        return this.zze[i];
    }

    @Override // com.google.android.gms.internal.ads.zzhi
    public final int zzt(int i) {
        return this.zzf[i];
    }

    @Override // com.google.android.gms.internal.ads.zzhi
    public final zzbq zzu(int i) {
        return this.zzg[i];
    }

    @Override // com.google.android.gms.internal.ads.zzhi
    public final Object zzv(int i) {
        return this.zzh[i];
    }

    public final List zzw() {
        return Arrays.asList(this.zzg);
    }

    public final zzlh zzx(zzwb zzwbVar) {
        zzbq[] zzbqVarArr = new zzbq[this.zzg.length];
        int i = 0;
        while (true) {
            zzbq[] zzbqVarArr2 = this.zzg;
            if (i >= zzbqVarArr2.length) {
                return new zzlh(zzbqVarArr, this.zzh, zzwbVar);
            }
            zzbqVarArr[i] = new zzlg(this, zzbqVarArr2[i]);
            i++;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzlh(zzbq[] zzbqVarArr, Object[] objArr, zzwb zzwbVar) {
        super(false, zzwbVar);
        int i = 0;
        this.zzg = zzbqVarArr;
        int length = zzbqVarArr.length;
        this.zze = new int[length];
        this.zzf = new int[length];
        this.zzh = objArr;
        this.zzi = new HashMap();
        int iZzc = 0;
        int iZzb = 0;
        int i2 = 0;
        while (i < zzbqVarArr.length) {
            zzbq zzbqVar = zzbqVarArr[i];
            this.zzg[i2] = zzbqVar;
            this.zzf[i2] = iZzc;
            this.zze[i2] = iZzb;
            iZzc += zzbqVar.zzc();
            iZzb += this.zzg[i2].zzb();
            this.zzi.put(objArr[i2], Integer.valueOf(i2));
            i++;
            i2++;
        }
        this.zzc = iZzc;
        this.zzd = iZzb;
    }
}
