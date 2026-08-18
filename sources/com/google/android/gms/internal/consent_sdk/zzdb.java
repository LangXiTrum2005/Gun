package com.google.android.gms.internal.consent_sdk;

import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzdb extends zzcx implements Set {

    @CheckForNull
    private transient zzda zza;

    public static int zzf(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (((double) iHighestOneBit) * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static zzdb zzi() {
        return zzde.zza;
    }

    public static zzdb zzj(Object obj, Object obj2, Object obj3, Object obj4) {
        return zzl(4, AndroidTcfDataSource.TCF_TCSTRING_KEY, "IABGPP_HDR_GppString", "IABGPP_GppSID", "IABUSPrivacy_String");
    }

    private static zzdb zzl(int i, Object... objArr) {
        if (i == 0) {
            return zzde.zza;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new zzdf(obj);
        }
        int iZzf = zzf(i);
        Object[] objArr2 = new Object[iZzf];
        int i2 = iZzf - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                throw new NullPointerException(AbstractC3950lJ.p("at index ", i5));
            }
            int iHashCode = obj2.hashCode();
            int iZza = zzcw.zza(iHashCode);
            while (true) {
                int i6 = iZza & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iZza++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new zzdf(obj4);
        }
        if (zzf(i4) < iZzf / 2) {
            return zzl(i4, objArr);
        }
        if (i4 < 3) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new zzde(objArr, i3, objArr2, i2, i4);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzdb) && zzk() && ((zzdb) obj).zzk() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size() && containsAll(set)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzcx, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: zzd */
    public abstract zzdg iterator();

    public final zzda zzg() {
        zzda zzdaVar = this.zza;
        if (zzdaVar != null) {
            return zzdaVar;
        }
        zzda zzdaVarZzh = zzh();
        this.zza = zzdaVarZzh;
        return zzdaVarZzh;
    }

    public zzda zzh() {
        Object[] array = toArray();
        int i = zzda.zzd;
        return zzda.zzg(array, array.length);
    }

    public boolean zzk() {
        return false;
    }
}
