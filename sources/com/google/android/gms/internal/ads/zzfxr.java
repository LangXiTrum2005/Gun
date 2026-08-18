package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfxr extends zzfxg {

    @CheckForNull
    Object[] zzd;
    private int zze;

    public zzfxr() {
        super(4);
    }

    @Override // com.google.android.gms.internal.ads.zzfxg, com.google.android.gms.internal.ads.zzfxh
    public final /* bridge */ /* synthetic */ zzfxh zzb(Object obj) {
        zzf(obj);
        return this;
    }

    public final zzfxr zzf(Object obj) {
        obj.getClass();
        if (this.zzd != null) {
            int iZzh = zzfxs.zzh(this.zzb);
            Object[] objArr = this.zzd;
            if (iZzh <= objArr.length) {
                int length = objArr.length - 1;
                int iHashCode = obj.hashCode();
                int iZza = zzfxf.zza(iHashCode);
                while (true) {
                    int i = iZza & length;
                    Object[] objArr2 = this.zzd;
                    Object obj2 = objArr2[i];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            break;
                        }
                        iZza = i + 1;
                    } else {
                        objArr2[i] = obj;
                        this.zze += iHashCode;
                        zza(obj);
                        break;
                    }
                }
                return this;
            }
        }
        this.zzd = null;
        zza(obj);
        return this;
    }

    public final zzfxr zzg(Object... objArr) {
        if (this.zzd != null) {
            for (int i = 0; i < 2; i++) {
                zzf(objArr[i]);
            }
        } else {
            zzd(objArr, 2);
        }
        return this;
    }

    public final zzfxr zzh(Iterable iterable) {
        iterable.getClass();
        if (this.zzd != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                zzf(it.next());
            }
        } else {
            zzc(iterable);
        }
        return this;
    }

    public final zzfxs zzi() {
        zzfxs zzfxsVarZzv;
        int i = this.zzb;
        if (i == 0) {
            return zzfzf.zza;
        }
        if (i == 1) {
            Object obj = this.zza[0];
            Objects.requireNonNull(obj);
            return new zzfzq(obj);
        }
        if (this.zzd == null || zzfxs.zzh(i) != this.zzd.length) {
            zzfxsVarZzv = zzfxs.zzv(this.zzb, this.zza);
            this.zzb = zzfxsVarZzv.size();
        } else {
            int i2 = this.zzb;
            Object[] objArrCopyOf = this.zza;
            if (zzfxs.zzw(i2, objArrCopyOf.length)) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i2);
            }
            int i3 = this.zze;
            Object[] objArr = this.zzd;
            zzfxsVarZzv = new zzfzf(objArrCopyOf, i3, objArr, objArr.length - 1, this.zzb);
        }
        this.zzc = true;
        this.zzd = null;
        return zzfxsVarZzv;
    }

    public zzfxr(int i, boolean z) {
        super(i);
        this.zzd = new Object[zzfxs.zzh(i)];
    }
}
