package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
final class zzgzx {
    public static final /* synthetic */ int zza = 0;
    private static final zzhah zzb;

    static {
        int i = zzgzm.zza;
        zzb = new zzhaj();
    }

    public static void zzA(int i, List list, zzhaw zzhawVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhawVar.zzu(i, list, z);
    }

    public static void zzB(int i, List list, zzhaw zzhawVar, zzgzv zzgzvVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((zzgwx) zzhawVar).zzv(i, list.get(i2), zzgzvVar);
        }
    }

    public static void zzC(int i, List list, zzhaw zzhawVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhawVar.zzy(i, list, z);
    }

    public static void zzD(int i, List list, zzhaw zzhawVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhawVar.zzA(i, list, z);
    }

    public static void zzE(int i, List list, zzhaw zzhawVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhawVar.zzC(i, list, z);
    }

    public static void zzF(int i, List list, zzhaw zzhawVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhawVar.zzE(i, list, z);
    }

    public static void zzG(int i, List list, zzhaw zzhawVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhawVar.zzH(i, list);
    }

    public static void zzH(int i, List list, zzhaw zzhawVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhawVar.zzJ(i, list, z);
    }

    public static void zzI(int i, List list, zzhaw zzhawVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhawVar.zzL(i, list, z);
    }

    public static boolean zzJ(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int zza(List list) {
        int iZzE;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgxs) {
            zzgxs zzgxsVar = (zzgxs) list;
            iZzE = 0;
            while (i < size) {
                iZzE += zzgww.zzE(zzgxsVar.zzd(i));
                i++;
            }
        } else {
            iZzE = 0;
            while (i < size) {
                iZzE += zzgww.zzE(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iZzE;
    }

    public static int zzb(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgww.zzD(i << 3) + 4) * size;
    }

    public static int zzc(List list) {
        return list.size() * 4;
    }

    public static int zzd(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgww.zzD(i << 3) + 8) * size;
    }

    public static int zze(List list) {
        return list.size() * 8;
    }

    public static int zzf(List list) {
        int iZzE;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgxs) {
            zzgxs zzgxsVar = (zzgxs) list;
            iZzE = 0;
            while (i < size) {
                iZzE += zzgww.zzE(zzgxsVar.zzd(i));
                i++;
            }
        } else {
            iZzE = 0;
            while (i < size) {
                iZzE += zzgww.zzE(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iZzE;
    }

    public static int zzg(List list) {
        int iZzE;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgyr) {
            zzgyr zzgyrVar = (zzgyr) list;
            iZzE = 0;
            while (i < size) {
                iZzE += zzgww.zzE(zzgyrVar.zza(i));
                i++;
            }
        } else {
            iZzE = 0;
            while (i < size) {
                iZzE += zzgww.zzE(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return iZzE;
    }

    public static int zzh(int i, Object obj, zzgzv zzgzvVar) {
        int i2 = i << 3;
        if (!(obj instanceof zzgyn)) {
            return zzgww.zzA((zzgzc) obj, zzgzvVar) + zzgww.zzD(i2);
        }
        int iZzD = zzgww.zzD(i2);
        int iZza = ((zzgyn) obj).zza();
        return AbstractC3888ke0.c(iZza, iZza, iZzD);
    }

    public static int zzi(List list) {
        int iZzD;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgxs) {
            zzgxs zzgxsVar = (zzgxs) list;
            iZzD = 0;
            while (i < size) {
                int iZzd = zzgxsVar.zzd(i);
                iZzD += zzgww.zzD((iZzd >> 31) ^ (iZzd + iZzd));
                i++;
            }
        } else {
            iZzD = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iZzD += zzgww.zzD((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
        }
        return iZzD;
    }

    public static int zzj(List list) {
        int iZzE;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgyr) {
            zzgyr zzgyrVar = (zzgyr) list;
            iZzE = 0;
            while (i < size) {
                long jZza = zzgyrVar.zza(i);
                iZzE += zzgww.zzE((jZza >> 63) ^ (jZza + jZza));
                i++;
            }
        } else {
            iZzE = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iZzE += zzgww.zzE((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
        }
        return iZzE;
    }

    public static int zzk(List list) {
        int iZzD;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgxs) {
            zzgxs zzgxsVar = (zzgxs) list;
            iZzD = 0;
            while (i < size) {
                iZzD += zzgww.zzD(zzgxsVar.zzd(i));
                i++;
            }
        } else {
            iZzD = 0;
            while (i < size) {
                iZzD += zzgww.zzD(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iZzD;
    }

    public static int zzl(List list) {
        int iZzE;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgyr) {
            zzgyr zzgyrVar = (zzgyr) list;
            iZzE = 0;
            while (i < size) {
                iZzE += zzgww.zzE(zzgyrVar.zza(i));
                i++;
            }
        } else {
            iZzE = 0;
            while (i < size) {
                iZzE += zzgww.zzE(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return iZzE;
    }

    public static zzhah zzm() {
        return zzb;
    }

    public static Object zzn(Object obj, int i, List list, zzgxx zzgxxVar, Object obj2, zzhah zzhahVar) {
        if (zzgxxVar == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Integer num = (Integer) list.get(i3);
                int iIntValue = num.intValue();
                if (zzgxxVar.zza(iIntValue)) {
                    if (i3 != i2) {
                        list.set(i2, num);
                    }
                    i2++;
                } else {
                    obj2 = zzo(obj, i, iIntValue, obj2, zzhahVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return obj2;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = ((Integer) it.next()).intValue();
                if (!zzgxxVar.zza(iIntValue2)) {
                    obj2 = zzo(obj, i, iIntValue2, obj2, zzhahVar);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    public static Object zzo(Object obj, int i, int i2, Object obj2, zzhah zzhahVar) {
        if (obj2 == null) {
            obj2 = zzhahVar.zza(obj);
        }
        zzhahVar.zzh(obj2, i, i2);
        return obj2;
    }

    public static void zzp(zzgxc zzgxcVar, Object obj, Object obj2) {
        if (((zzgxn) obj2).zza.zza.isEmpty()) {
            return;
        }
        throw null;
    }

    public static void zzq(zzhah zzhahVar, Object obj, Object obj2) {
        zzgxr zzgxrVar = (zzgxr) obj;
        zzhai zzhaiVarZze = zzgxrVar.zzt;
        zzhai zzhaiVar = ((zzgxr) obj2).zzt;
        if (!zzhai.zzc().equals(zzhaiVar)) {
            if (zzhai.zzc().equals(zzhaiVarZze)) {
                zzhaiVarZze = zzhai.zze(zzhaiVarZze, zzhaiVar);
            } else {
                zzhaiVarZze.zzd(zzhaiVar);
            }
        }
        zzgxrVar.zzt = zzhaiVarZze;
    }

    public static void zzr(int i, List list, zzhaw zzhawVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhawVar.zzc(i, list, z);
    }

    public static void zzs(int i, List list, zzhaw zzhawVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhawVar.zze(i, list);
    }

    public static void zzt(int i, List list, zzhaw zzhawVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhawVar.zzg(i, list, z);
    }

    public static void zzu(int i, List list, zzhaw zzhawVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhawVar.zzj(i, list, z);
    }

    public static void zzv(int i, List list, zzhaw zzhawVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhawVar.zzl(i, list, z);
    }

    public static void zzw(int i, List list, zzhaw zzhawVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhawVar.zzn(i, list, z);
    }

    public static void zzx(int i, List list, zzhaw zzhawVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhawVar.zzp(i, list, z);
    }

    public static void zzy(int i, List list, zzhaw zzhawVar, zzgzv zzgzvVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((zzgwx) zzhawVar).zzq(i, list.get(i2), zzgzvVar);
        }
    }

    public static void zzz(int i, List list, zzhaw zzhawVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhawVar.zzs(i, list, z);
    }
}
