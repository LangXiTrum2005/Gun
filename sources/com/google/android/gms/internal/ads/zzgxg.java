package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzgxg {
    private static final zzgxg zzb = new zzgxg(true);
    final zzhad zza = new zzgzy();
    private boolean zzc;
    private boolean zzd;

    private zzgxg() {
    }

    public static int zza(zzhau zzhauVar, int i, Object obj) {
        int iZzD = zzgww.zzD(i << 3);
        if (zzhauVar == zzhau.zzj) {
            zzgzc zzgzcVar = (zzgzc) obj;
            byte[] bArr = zzgye.zzb;
            if (zzgzcVar instanceof zzgvt) {
                throw null;
            }
            iZzD += iZzD;
        }
        return iZzD + zzb(zzhauVar, obj);
    }

    public static int zzb(zzhau zzhauVar, Object obj) {
        int iZzd;
        int iZzD;
        zzhau zzhauVar2 = zzhau.zza;
        zzhav zzhavVar = zzhav.INT;
        switch (zzhauVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                int i = zzgww.zzf;
                return 8;
            case 1:
                ((Float) obj).getClass();
                int i2 = zzgww.zzf;
                return 4;
            case 2:
                return zzgww.zzE(((Long) obj).longValue());
            case 3:
                return zzgww.zzE(((Long) obj).longValue());
            case 4:
                return zzgww.zzE(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                int i3 = zzgww.zzf;
                return 8;
            case 6:
                ((Integer) obj).getClass();
                int i4 = zzgww.zzf;
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                int i5 = zzgww.zzf;
                return 1;
            case 8:
                if (!(obj instanceof zzgwj)) {
                    return zzgww.zzC((String) obj);
                }
                int i6 = zzgww.zzf;
                iZzd = ((zzgwj) obj).zzd();
                iZzD = zzgww.zzD(iZzd);
                break;
                break;
            case 9:
                int i7 = zzgww.zzf;
                return ((zzgzc) obj).zzaY();
            case 10:
                if (!(obj instanceof zzgym)) {
                    return zzgww.zzz((zzgzc) obj);
                }
                int i8 = zzgww.zzf;
                iZzd = ((zzgym) obj).zza();
                iZzD = zzgww.zzD(iZzd);
                break;
                break;
            case 11:
                if (!(obj instanceof zzgwj)) {
                    int i9 = zzgww.zzf;
                    iZzd = ((byte[]) obj).length;
                    iZzD = zzgww.zzD(iZzd);
                } else {
                    int i10 = zzgww.zzf;
                    iZzd = ((zzgwj) obj).zzd();
                    iZzD = zzgww.zzD(iZzd);
                }
                break;
            case 12:
                return zzgww.zzD(((Integer) obj).intValue());
            case 13:
                return obj instanceof zzgxv ? zzgww.zzE(((zzgxv) obj).zza()) : zzgww.zzE(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                int i11 = zzgww.zzf;
                return 4;
            case 15:
                ((Long) obj).getClass();
                int i12 = zzgww.zzf;
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return zzgww.zzD((iIntValue >> 31) ^ (iIntValue + iIntValue));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return zzgww.zzE((jLongValue >> 63) ^ (jLongValue + jLongValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return iZzD + iZzd;
    }

    public static int zzc(zzgxf zzgxfVar, Object obj) {
        zzhau zzhauVarZzb = zzgxfVar.zzb();
        int iZza = zzgxfVar.zza();
        if (!zzgxfVar.zze()) {
            return zza(zzhauVarZzb, iZza, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i = 0;
        if (!zzgxfVar.zzd()) {
            int iZza2 = 0;
            while (i < size) {
                iZza2 += zza(zzhauVarZzb, iZza, list.get(i));
                i++;
            }
            return iZza2;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iZzb = 0;
        while (i < size) {
            iZzb += zzb(zzhauVarZzb, list.get(i));
            i++;
        }
        return zzgww.zzD(iZzb) + zzgww.zzD(iZza << 3) + iZzb;
    }

    public static zzgxg zze() {
        return zzb;
    }

    private static boolean zzj(Map.Entry entry) {
        zzgxf zzgxfVar = (zzgxf) entry.getKey();
        if (zzgxfVar.zzc() != zzhav.MESSAGE) {
            return true;
        }
        if (!zzgxfVar.zze()) {
            return zzk(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!zzk(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzk(Object obj) {
        if (obj instanceof zzgzd) {
            return ((zzgzd) obj).zzbw();
        }
        if (obj instanceof zzgym) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzl(Map.Entry entry) {
        int i;
        int iZzD;
        int iZzz;
        zzgxf zzgxfVar = (zzgxf) entry.getKey();
        Object value = entry.getValue();
        if (zzgxfVar.zzc() != zzhav.MESSAGE || zzgxfVar.zze() || zzgxfVar.zzd()) {
            return zzc(zzgxfVar, value);
        }
        if (value instanceof zzgym) {
            int iZza = ((zzgxf) entry.getKey()).zza();
            int iZzD2 = zzgww.zzD(8);
            i = iZzD2 + iZzD2;
            iZzD = zzgww.zzD(iZza) + zzgww.zzD(16);
            int iZzD3 = zzgww.zzD(24);
            int iZza2 = ((zzgym) value).zza();
            iZzz = AbstractC3888ke0.c(iZza2, iZza2, iZzD3);
        } else {
            int iZza3 = ((zzgxf) entry.getKey()).zza();
            int iZzD4 = zzgww.zzD(8);
            i = iZzD4 + iZzD4;
            iZzD = zzgww.zzD(iZza3) + zzgww.zzD(16);
            iZzz = zzgww.zzz((zzgzc) value) + zzgww.zzD(24);
        }
        return i + iZzD + iZzz;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    private static final void zzm(zzgxf zzgxfVar, Object obj) {
        boolean z;
        zzgxfVar.zzb();
        byte[] bArr = zzgye.zzb;
        obj.getClass();
        zzhau zzhauVar = zzhau.zza;
        zzhav zzhavVar = zzhav.INT;
        switch (r0.zza()) {
            case INT:
                z = obj instanceof Integer;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgxfVar.zza()), zzgxfVar.zzb().zza(), obj.getClass().getName()));
            case LONG:
                z = obj instanceof Long;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgxfVar.zza()), zzgxfVar.zzb().zza(), obj.getClass().getName()));
            case FLOAT:
                z = obj instanceof Float;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgxfVar.zza()), zzgxfVar.zzb().zza(), obj.getClass().getName()));
            case DOUBLE:
                z = obj instanceof Double;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgxfVar.zza()), zzgxfVar.zzb().zza(), obj.getClass().getName()));
            case BOOLEAN:
                z = obj instanceof Boolean;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgxfVar.zza()), zzgxfVar.zzb().zza(), obj.getClass().getName()));
            case STRING:
                z = obj instanceof String;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgxfVar.zza()), zzgxfVar.zzb().zza(), obj.getClass().getName()));
            case BYTE_STRING:
                if ((obj instanceof zzgwj) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgxfVar.zza()), zzgxfVar.zzb().zza(), obj.getClass().getName()));
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof zzgxv)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgxfVar.zza()), zzgxfVar.zzb().zza(), obj.getClass().getName()));
            case MESSAGE:
                if ((obj instanceof zzgzc) || (obj instanceof zzgym)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgxfVar.zza()), zzgxfVar.zzb().zza(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzgxfVar.zza()), zzgxfVar.zzb().zza(), obj.getClass().getName()));
        }
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzgxg zzgxgVar = new zzgxg();
        int iZzc = this.zza.zzc();
        for (int i = 0; i < iZzc; i++) {
            Map.Entry entryZzg = this.zza.zzg(i);
            zzgxgVar.zzh((zzgxf) ((zzgzz) entryZzg).zza(), entryZzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzd()) {
            zzgxgVar.zzh((zzgxf) entry.getKey(), entry.getValue());
        }
        zzgxgVar.zzd = this.zzd;
        return zzgxgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzgxg) {
            return this.zza.equals(((zzgxg) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzd() {
        int iZzc = this.zza.zzc();
        int iZzl = 0;
        for (int i = 0; i < iZzc; i++) {
            iZzl += zzl(this.zza.zzg(i));
        }
        Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            iZzl += zzl((Map.Entry) it.next());
        }
        return iZzl;
    }

    public final Iterator zzf() {
        if (this.zza.isEmpty()) {
            return Collections.emptyIterator();
        }
        return this.zzd ? new zzgyk(this.zza.entrySet().iterator()) : this.zza.entrySet().iterator();
    }

    public final void zzg() {
        if (this.zzc) {
            return;
        }
        int iZzc = this.zza.zzc();
        for (int i = 0; i < iZzc; i++) {
            Object value = this.zza.zzg(i).getValue();
            if (value instanceof zzgxr) {
                ((zzgxr) value).zzbU();
            }
        }
        Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof zzgxr) {
                ((zzgxr) value2).zzbU();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzh(zzgxf zzgxfVar, Object obj) {
        if (!zzgxfVar.zze()) {
            zzm(zzgxfVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                Object obj2 = list.get(i);
                zzm(zzgxfVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof zzgym) {
            this.zzd = true;
        }
        this.zza.put(zzgxfVar, obj);
    }

    public final boolean zzi() {
        int iZzc = this.zza.zzc();
        for (int i = 0; i < iZzc; i++) {
            if (!zzj(this.zza.zzg(i))) {
                return false;
            }
        }
        Iterator it = this.zza.zzd().iterator();
        while (it.hasNext()) {
            if (!zzj((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private zzgxg(boolean z) {
        zzg();
        zzg();
    }
}
