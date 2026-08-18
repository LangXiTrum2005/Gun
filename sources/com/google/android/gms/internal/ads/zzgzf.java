package com.google.android.gms.internal.ads;

import com.badlogic.gdx.Input;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
final class zzgzf<T> implements zzgzv<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzhao.zzi();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzgzc zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzhah zzm;
    private final zzgxc zzn;

    private zzgzf(int[] iArr, Object[] objArr, int i, int i2, zzgzc zzgzcVar, boolean z, int[] iArr2, int i3, int i4, zzgzi zzgziVar, zzgyp zzgypVar, zzhah zzhahVar, zzgxc zzgxcVar, zzgyx zzgyxVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzgzcVar instanceof zzgxr;
        boolean z2 = false;
        if (zzgxcVar != null && (zzgzcVar instanceof zzgxn)) {
            z2 = true;
        }
        this.zzh = z2;
        this.zzj = iArr2;
        this.zzk = i3;
        this.zzl = i4;
        this.zzm = zzhahVar;
        this.zzn = zzgxcVar;
        this.zzg = zzgzcVar;
    }

    private final Object zzA(Object obj, int i) {
        zzgzv zzgzvVarZzx = zzx(i);
        int iZzu = zzu(i) & 1048575;
        if (!zzN(obj, i)) {
            return zzgzvVarZzx.zze();
        }
        Object object = zzb.getObject(obj, iZzu);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzgzvVarZzx.zze();
        if (object != null) {
            zzgzvVarZzx.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzB(Object obj, int i, int i2) {
        zzgzv zzgzvVarZzx = zzx(i2);
        if (!zzR(obj, i, i2)) {
            return zzgzvVarZzx.zze();
        }
        Object object = zzb.getObject(obj, zzu(i2) & 1048575);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzgzvVarZzx.zze();
        if (object != null) {
            zzgzvVarZzx.zzg(objZze, object);
        }
        return objZze;
    }

    private static Field zzC(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sbR = DM.r("Field ", str, " for ", name, " not found. Known fields are ");
            sbR.append(string);
            throw new RuntimeException(sbR.toString());
        }
    }

    private static void zzD(Object obj) {
        if (!zzQ(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzE(Object obj, Object obj2, int i) {
        if (zzN(obj2, i)) {
            int iZzu = zzu(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzu;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzgzv zzgzvVarZzx = zzx(i);
            if (!zzN(obj, i)) {
                if (zzQ(object)) {
                    Object objZze = zzgzvVarZzx.zze();
                    zzgzvVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzH(obj, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzQ(object2)) {
                Object objZze2 = zzgzvVarZzx.zze();
                zzgzvVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zzgzvVarZzx.zzg(object2, object);
        }
    }

    private final void zzF(Object obj, Object obj2, int i) {
        int i2 = this.zzc[i];
        if (zzR(obj2, i2, i)) {
            int iZzu = zzu(i) & 1048575;
            Unsafe unsafe = zzb;
            long j = iZzu;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i] + " is present but null: " + obj2.toString());
            }
            zzgzv zzgzvVarZzx = zzx(i);
            if (!zzR(obj, i2, i)) {
                if (zzQ(object)) {
                    Object objZze = zzgzvVarZzx.zze();
                    zzgzvVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j, objZze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                zzI(obj, i2, i);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!zzQ(object2)) {
                Object objZze2 = zzgzvVarZzx.zze();
                zzgzvVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j, objZze2);
                object2 = objZze2;
            }
            zzgzvVarZzx.zzg(object2, object);
        }
    }

    private final void zzG(Object obj, int i, zzgzp zzgzpVar) throws IOException {
        long j = i & 1048575;
        if (zzM(i)) {
            zzhao.zzv(obj, j, zzgzpVar.zzs());
        } else if (this.zzi) {
            zzhao.zzv(obj, j, zzgzpVar.zzr());
        } else {
            zzhao.zzv(obj, j, zzgzpVar.zzp());
        }
    }

    private final void zzH(Object obj, int i) {
        int iZzr = zzr(i);
        long j = 1048575 & iZzr;
        if (j == 1048575) {
            return;
        }
        zzhao.zzt(obj, j, (1 << (iZzr >>> 20)) | zzhao.zzd(obj, j));
    }

    private final void zzI(Object obj, int i, int i2) {
        zzhao.zzt(obj, zzr(i2) & 1048575, i);
    }

    private final void zzJ(Object obj, int i, Object obj2) {
        zzb.putObject(obj, zzu(i) & 1048575, obj2);
        zzH(obj, i);
    }

    private final void zzK(Object obj, int i, int i2, Object obj2) {
        zzb.putObject(obj, zzu(i2) & 1048575, obj2);
        zzI(obj, i, i2);
    }

    private final boolean zzL(Object obj, Object obj2, int i) {
        return zzN(obj, i) == zzN(obj2, i);
    }

    private static boolean zzM(int i) {
        return (i & 536870912) != 0;
    }

    private final boolean zzN(Object obj, int i) {
        int iZzr = zzr(i);
        long j = iZzr & 1048575;
        if (j != 1048575) {
            return (zzhao.zzd(obj, j) & (1 << (iZzr >>> 20))) != 0;
        }
        int iZzu = zzu(i);
        long j2 = iZzu & 1048575;
        switch (zzt(iZzu)) {
            case 0:
                return Double.doubleToRawLongBits(zzhao.zzb(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzhao.zzc(obj, j2)) != 0;
            case 2:
                return zzhao.zzf(obj, j2) != 0;
            case 3:
                return zzhao.zzf(obj, j2) != 0;
            case 4:
                return zzhao.zzd(obj, j2) != 0;
            case 5:
                return zzhao.zzf(obj, j2) != 0;
            case 6:
                return zzhao.zzd(obj, j2) != 0;
            case 7:
                return zzhao.zzz(obj, j2);
            case 8:
                Object objZzh = zzhao.zzh(obj, j2);
                if (objZzh instanceof String) {
                    return !((String) objZzh).isEmpty();
                }
                if (objZzh instanceof zzgwj) {
                    return !zzgwj.zzb.equals(objZzh);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzhao.zzh(obj, j2) != null;
            case 10:
                return !zzgwj.zzb.equals(zzhao.zzh(obj, j2));
            case 11:
                return zzhao.zzd(obj, j2) != 0;
            case 12:
                return zzhao.zzd(obj, j2) != 0;
            case 13:
                return zzhao.zzd(obj, j2) != 0;
            case 14:
                return zzhao.zzf(obj, j2) != 0;
            case 15:
                return zzhao.zzd(obj, j2) != 0;
            case 16:
                return zzhao.zzf(obj, j2) != 0;
            case 17:
                return zzhao.zzh(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzO(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zzN(obj, i);
        }
        return (i3 & i4) != 0;
    }

    private static boolean zzP(Object obj, int i, zzgzv zzgzvVar) {
        return zzgzvVar.zzl(zzhao.zzh(obj, i & 1048575));
    }

    private static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzgxr) {
            return ((zzgxr) obj).zzcd();
        }
        return true;
    }

    private final boolean zzR(Object obj, int i, int i2) {
        return zzhao.zzd(obj, (long) (zzr(i2) & 1048575)) == i;
    }

    private static boolean zzS(Object obj, long j) {
        return ((Boolean) zzhao.zzh(obj, j)).booleanValue();
    }

    private static final void zzT(int i, Object obj, zzhaw zzhawVar) throws IOException {
        if (obj instanceof String) {
            zzhawVar.zzG(i, (String) obj);
        } else {
            zzhawVar.zzd(i, (zzgwj) obj);
        }
    }

    public static zzhai zzd(Object obj) {
        zzgxr zzgxrVar = (zzgxr) obj;
        zzhai zzhaiVar = zzgxrVar.zzt;
        if (zzhaiVar != zzhai.zzc()) {
            return zzhaiVar;
        }
        zzhai zzhaiVarZzf = zzhai.zzf();
        zzgxrVar.zzt = zzhaiVarZzf;
        return zzhaiVarZzf;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0265  */
    /* JADX WARN: Code duplicated, block: B:126:0x0268  */
    /* JADX WARN: Code duplicated, block: B:129:0x027f  */
    /* JADX WARN: Code duplicated, block: B:131:0x0283  */
    /* JADX WARN: Code duplicated, block: B:170:0x0346  */
    /* JADX WARN: Code duplicated, block: B:186:0x0398  */
    /* JADX WARN: Code duplicated, block: B:189:0x03a4  */
    public static zzgzf zzm(Class cls, zzgyz zzgyzVar, zzgzi zzgziVar, zzgyp zzgypVar, zzhah zzhahVar, zzgxc zzgxcVar, zzgyx zzgyxVar) {
        int i;
        int iCharAt;
        int iCharAt2;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        int i7;
        char cCharAt;
        int i8;
        char cCharAt2;
        int i9;
        char cCharAt3;
        int i10;
        char cCharAt4;
        int i11;
        char cCharAt5;
        int i12;
        char cCharAt6;
        int i13;
        char cCharAt7;
        int i14;
        char cCharAt8;
        int i15;
        int i16;
        int i17;
        int i18;
        int iObjectFieldOffset;
        int i19;
        int i20;
        int iObjectFieldOffset2;
        int i21;
        int i22;
        Field fieldZzC;
        int i23;
        char cCharAt9;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        Object obj;
        Field fieldZzC2;
        int i29;
        Object obj2;
        Field fieldZzC3;
        int i30;
        char cCharAt10;
        int i31;
        char cCharAt11;
        int i32;
        char cCharAt12;
        int i33;
        char cCharAt13;
        if (!(zzgyzVar instanceof zzgzo)) {
            throw null;
        }
        zzgzo zzgzoVar = (zzgzo) zzgyzVar;
        String strZzd = zzgzoVar.zzd();
        int length = strZzd.length();
        char c = 55296;
        if (strZzd.charAt(0) >= 55296) {
            int i34 = 1;
            while (true) {
                i = i34 + 1;
                if (strZzd.charAt(i34) < 55296) {
                    break;
                }
                i34 = i;
            }
        } else {
            i = 1;
        }
        int i35 = i + 1;
        int iCharAt3 = strZzd.charAt(i);
        if (iCharAt3 >= 55296) {
            int i36 = iCharAt3 & 8191;
            int i37 = 13;
            while (true) {
                i33 = i35 + 1;
                cCharAt13 = strZzd.charAt(i35);
                if (cCharAt13 < 55296) {
                    break;
                }
                i36 |= (cCharAt13 & 8191) << i37;
                i37 += 13;
                i35 = i33;
            }
            iCharAt3 = i36 | (cCharAt13 << i37);
            i35 = i33;
        }
        if (iCharAt3 == 0) {
            iArr = zza;
            i6 = 0;
            i4 = 0;
            iCharAt = 0;
            iCharAt2 = 0;
            i2 = 0;
            i5 = 0;
            i3 = 0;
        } else {
            int i38 = i35 + 1;
            int iCharAt4 = strZzd.charAt(i35);
            if (iCharAt4 >= 55296) {
                int i39 = iCharAt4 & 8191;
                int i40 = 13;
                while (true) {
                    i14 = i38 + 1;
                    cCharAt8 = strZzd.charAt(i38);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i39 |= (cCharAt8 & 8191) << i40;
                    i40 += 13;
                    i38 = i14;
                }
                iCharAt4 = i39 | (cCharAt8 << i40);
                i38 = i14;
            }
            int i41 = i38 + 1;
            int iCharAt5 = strZzd.charAt(i38);
            if (iCharAt5 >= 55296) {
                int i42 = iCharAt5 & 8191;
                int i43 = 13;
                while (true) {
                    i13 = i41 + 1;
                    cCharAt7 = strZzd.charAt(i41);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i42 |= (cCharAt7 & 8191) << i43;
                    i43 += 13;
                    i41 = i13;
                }
                iCharAt5 = i42 | (cCharAt7 << i43);
                i41 = i13;
            }
            int i44 = i41 + 1;
            int iCharAt6 = strZzd.charAt(i41);
            if (iCharAt6 >= 55296) {
                int i45 = iCharAt6 & 8191;
                int i46 = 13;
                while (true) {
                    i12 = i44 + 1;
                    cCharAt6 = strZzd.charAt(i44);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt6 & 8191) << i46;
                    i46 += 13;
                    i44 = i12;
                }
                iCharAt6 = i45 | (cCharAt6 << i46);
                i44 = i12;
            }
            int i47 = i44 + 1;
            int iCharAt7 = strZzd.charAt(i44);
            if (iCharAt7 >= 55296) {
                int i48 = iCharAt7 & 8191;
                int i49 = 13;
                while (true) {
                    i11 = i47 + 1;
                    cCharAt5 = strZzd.charAt(i47);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt5 & 8191) << i49;
                    i49 += 13;
                    i47 = i11;
                }
                iCharAt7 = i48 | (cCharAt5 << i49);
                i47 = i11;
            }
            int i50 = i47 + 1;
            iCharAt = strZzd.charAt(i47);
            if (iCharAt >= 55296) {
                int i51 = iCharAt & 8191;
                int i52 = 13;
                while (true) {
                    i10 = i50 + 1;
                    cCharAt4 = strZzd.charAt(i50);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt4 & 8191) << i52;
                    i52 += 13;
                    i50 = i10;
                }
                iCharAt = i51 | (cCharAt4 << i52);
                i50 = i10;
            }
            int i53 = i50 + 1;
            iCharAt2 = strZzd.charAt(i50);
            if (iCharAt2 >= 55296) {
                int i54 = iCharAt2 & 8191;
                int i55 = 13;
                while (true) {
                    i9 = i53 + 1;
                    cCharAt3 = strZzd.charAt(i53);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i54 |= (cCharAt3 & 8191) << i55;
                    i55 += 13;
                    i53 = i9;
                }
                iCharAt2 = i54 | (cCharAt3 << i55);
                i53 = i9;
            }
            int i56 = i53 + 1;
            int iCharAt8 = strZzd.charAt(i53);
            if (iCharAt8 >= 55296) {
                int i57 = iCharAt8 & 8191;
                int i58 = 13;
                while (true) {
                    i8 = i56 + 1;
                    cCharAt2 = strZzd.charAt(i56);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i57 |= (cCharAt2 & 8191) << i58;
                    i58 += 13;
                    i56 = i8;
                }
                iCharAt8 = i57 | (cCharAt2 << i58);
                i56 = i8;
            }
            int i59 = i56 + 1;
            int iCharAt9 = strZzd.charAt(i56);
            if (iCharAt9 >= 55296) {
                int i60 = iCharAt9 & 8191;
                int i61 = 13;
                while (true) {
                    i7 = i59 + 1;
                    cCharAt = strZzd.charAt(i59);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i60 |= (cCharAt & 8191) << i61;
                    i61 += 13;
                    i59 = i7;
                }
                iCharAt9 = i60 | (cCharAt << i61);
                i59 = i7;
            }
            int i62 = iCharAt4 + iCharAt4 + iCharAt5;
            int[] iArr2 = new int[iCharAt9 + iCharAt2 + iCharAt8];
            i2 = iCharAt6;
            i3 = iCharAt9;
            i4 = i62;
            iArr = iArr2;
            i5 = iCharAt7;
            i6 = iCharAt4;
            i35 = i59;
        }
        Unsafe unsafe = zzb;
        Object[] objArrZze = zzgzoVar.zze();
        Class<?> cls2 = zzgzoVar.zza().getClass();
        int i63 = i3 + iCharAt2;
        int i64 = iCharAt + iCharAt;
        int[] iArr3 = new int[iCharAt * 3];
        Object[] objArr = new Object[i64];
        int i65 = i3;
        int i66 = i63;
        int i67 = 0;
        int i68 = 0;
        while (i35 < length) {
            int i69 = i35 + 1;
            int iCharAt10 = strZzd.charAt(i35);
            if (iCharAt10 >= c) {
                int i70 = iCharAt10 & 8191;
                int i71 = i69;
                int i72 = 13;
                while (true) {
                    i32 = i71 + 1;
                    cCharAt12 = strZzd.charAt(i71);
                    if (cCharAt12 < c) {
                        break;
                    }
                    i70 |= (cCharAt12 & 8191) << i72;
                    i72 += 13;
                    i71 = i32;
                }
                iCharAt10 = i70 | (cCharAt12 << i72);
                i15 = i32;
            } else {
                i15 = i69;
            }
            int i73 = i15 + 1;
            int iCharAt11 = strZzd.charAt(i15);
            if (iCharAt11 >= c) {
                int i74 = iCharAt11 & 8191;
                int i75 = i73;
                int i76 = 13;
                while (true) {
                    i31 = i75 + 1;
                    cCharAt11 = strZzd.charAt(i75);
                    if (cCharAt11 < c) {
                        break;
                    }
                    i74 |= (cCharAt11 & 8191) << i76;
                    i76 += 13;
                    i75 = i31;
                }
                iCharAt11 = i74 | (cCharAt11 << i76);
                i16 = i31;
            } else {
                i16 = i73;
            }
            if ((iCharAt11 & 1024) != 0) {
                iArr[i67] = i68;
                i67++;
            }
            int i77 = iCharAt11 & 255;
            int i78 = length;
            int i79 = iCharAt11 & 2048;
            int i80 = i5;
            if (i77 >= 51) {
                int i81 = i16 + 1;
                int iCharAt12 = strZzd.charAt(i16);
                if (iCharAt12 >= 55296) {
                    int i82 = iCharAt12 & 8191;
                    int i83 = i81;
                    int i84 = 13;
                    while (true) {
                        i30 = i83 + 1;
                        cCharAt10 = strZzd.charAt(i83);
                        i17 = i2;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i82 |= (cCharAt10 & 8191) << i84;
                        i84 += 13;
                        i83 = i30;
                        i2 = i17;
                    }
                    iCharAt12 = i82 | (cCharAt10 << i84);
                    i26 = i30;
                } else {
                    i17 = i2;
                    i26 = i81;
                }
                int i85 = i77 - 51;
                int i86 = i26;
                if (i85 == 9 || i85 == 17) {
                    i27 = i4 + 1;
                    int i87 = i68 / 3;
                    objArr[i87 + i87 + 1] = objArrZze[i4];
                } else {
                    if (i85 == 12) {
                        if (zzgzoVar.zzc() == 1 || i79 != 0) {
                            i27 = i4 + 1;
                            int i88 = i68 / 3;
                            objArr[i88 + i88 + 1] = objArrZze[i4];
                        } else {
                            i79 = 0;
                        }
                    }
                    i28 = iCharAt12 + iCharAt12;
                    obj = objArrZze[i28];
                    if (obj instanceof Field) {
                        fieldZzC2 = (Field) obj;
                    } else {
                        fieldZzC2 = zzC(cls2, (String) obj);
                        objArrZze[i28] = fieldZzC2;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldZzC2);
                    i29 = i28 + 1;
                    obj2 = objArrZze[i29];
                    int i89 = i79;
                    if (obj2 instanceof Field) {
                        fieldZzC3 = (Field) obj2;
                    } else {
                        fieldZzC3 = zzC(cls2, (String) obj2);
                        objArrZze[i29] = fieldZzC3;
                    }
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzC3);
                    iObjectFieldOffset = iObjectFieldOffset3;
                    i18 = i4;
                    i21 = i89;
                    zzgzoVar = zzgzoVar;
                    cls2 = cls2;
                    i19 = i86;
                    strZzd = strZzd;
                    i20 = 0;
                }
                i4 = i27;
                i28 = iCharAt12 + iCharAt12;
                obj = objArrZze[i28];
                if (obj instanceof Field) {
                    fieldZzC2 = (Field) obj;
                } else {
                    fieldZzC2 = zzC(cls2, (String) obj);
                    objArrZze[i28] = fieldZzC2;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldZzC2);
                i29 = i28 + 1;
                obj2 = objArrZze[i29];
                int i810 = i79;
                if (obj2 instanceof Field) {
                    fieldZzC3 = (Field) obj2;
                } else {
                    fieldZzC3 = zzC(cls2, (String) obj2);
                    objArrZze[i29] = fieldZzC3;
                }
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzC3);
                iObjectFieldOffset = iObjectFieldOffset4;
                i18 = i4;
                i21 = i810;
                zzgzoVar = zzgzoVar;
                cls2 = cls2;
                i19 = i86;
                strZzd = strZzd;
                i20 = 0;
            } else {
                i17 = i2;
                i18 = i4 + 1;
                Field fieldZzC4 = zzC(cls2, (String) objArrZze[i4]);
                if (i77 == 9 || i77 == 17) {
                    int i90 = i68 / 3;
                    objArr[i90 + i90 + 1] = fieldZzC4.getType();
                } else {
                    if (i77 != 27) {
                        if (i77 == 49) {
                            i25 = i4 + 2;
                            i24 = 1;
                        } else if (i77 == 12 || i77 == 30 || i77 == 44) {
                            zzgzoVar = zzgzoVar;
                            if (zzgzoVar.zzc() == 1 || i79 != 0) {
                                i25 = i4 + 2;
                                int i91 = i68 / 3;
                                objArr[i91 + i91 + 1] = objArrZze[i18];
                                i18 = i25;
                            } else {
                                i79 = 0;
                            }
                        } else if (i77 == 50) {
                            int i92 = i4 + 2;
                            int i93 = i65 + 1;
                            iArr[i65] = i68;
                            int i94 = i68 / 3;
                            int i95 = i94 + i94;
                            objArr[i95] = objArrZze[i18];
                            if (i79 != 0) {
                                i18 = i4 + 3;
                                objArr[i95 + 1] = objArrZze[i92];
                                i65 = i93;
                                zzgzoVar = zzgzoVar;
                            } else {
                                i18 = i92;
                                i65 = i93;
                                i79 = 0;
                            }
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC4);
                        if ((iCharAt11 & 4096) != 0 || i77 > 17) {
                            i19 = i16;
                            i20 = 0;
                            iObjectFieldOffset2 = 1048575;
                        } else {
                            int i96 = i16 + 1;
                            int iCharAt13 = strZzd.charAt(i16);
                            if (iCharAt13 >= 55296) {
                                int i97 = iCharAt13 & 8191;
                                int i98 = 13;
                                while (true) {
                                    i23 = i96 + 1;
                                    cCharAt9 = strZzd.charAt(i96);
                                    if (cCharAt9 < 55296) {
                                        break;
                                    }
                                    i97 |= (cCharAt9 & 8191) << i98;
                                    i98 += 13;
                                    i96 = i23;
                                }
                                iCharAt13 = i97 | (cCharAt9 << i98);
                                i22 = i23;
                            } else {
                                i22 = i96;
                            }
                            int i99 = (iCharAt13 / 32) + i6 + i6;
                            Object obj3 = objArrZze[i99];
                            if (obj3 instanceof Field) {
                                fieldZzC = (Field) obj3;
                            } else {
                                fieldZzC = zzC(cls2, (String) obj3);
                                objArrZze[i99] = fieldZzC;
                            }
                            i20 = iCharAt13 % 32;
                            int i100 = i22;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldZzC);
                            i19 = i100;
                        }
                        if (i77 >= 18 && i77 <= 49) {
                            iArr[i66] = iObjectFieldOffset;
                            i66++;
                        }
                        i21 = i79;
                    } else {
                        i24 = 1;
                        i25 = i4 + 2;
                    }
                    int i101 = i68 / 3;
                    objArr[i101 + i101 + i24] = objArrZze[i18];
                    i18 = i25;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC4);
                    if ((iCharAt11 & 4096) != 0) {
                        i19 = i16;
                        i20 = 0;
                        iObjectFieldOffset2 = 1048575;
                    } else {
                        i19 = i16;
                        i20 = 0;
                        iObjectFieldOffset2 = 1048575;
                    }
                    if (i77 >= 18) {
                        iArr[i66] = iObjectFieldOffset;
                        i66++;
                    }
                    i21 = i79;
                }
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldZzC4);
                if ((iCharAt11 & 4096) != 0) {
                    i19 = i16;
                    i20 = 0;
                    iObjectFieldOffset2 = 1048575;
                } else {
                    i19 = i16;
                    i20 = 0;
                    iObjectFieldOffset2 = 1048575;
                }
                if (i77 >= 18) {
                    iArr[i66] = iObjectFieldOffset;
                    i66++;
                }
                i21 = i79;
            }
            int i102 = i68 + 1;
            iArr3[i68] = iCharAt10;
            int i103 = i68 + 2;
            int i104 = i19;
            iArr3[i102] = ((iCharAt11 & 512) != 0 ? 536870912 : 0) | ((iCharAt11 & 256) != 0 ? 268435456 : 0) | (i21 != 0 ? Integer.MIN_VALUE : 0) | (i77 << 20) | iObjectFieldOffset;
            i68 += 3;
            iArr3[i103] = (i20 << 20) | iObjectFieldOffset2;
            strZzd = strZzd;
            cls2 = cls2;
            i4 = i18;
            length = i78;
            i5 = i80;
            i35 = i104;
            zzgzoVar = zzgzoVar;
            i2 = i17;
            c = 55296;
        }
        return new zzgzf(iArr3, objArr, i2, i5, zzgzoVar.zza(), false, iArr, i3, i63, zzgziVar, zzgypVar, zzhahVar, zzgxcVar, zzgyxVar);
    }

    private static double zzn(Object obj, long j) {
        return ((Double) zzhao.zzh(obj, j)).doubleValue();
    }

    private static float zzo(Object obj, long j) {
        return ((Float) zzhao.zzh(obj, j)).floatValue();
    }

    private static int zzp(Object obj, long j) {
        return ((Integer) zzhao.zzh(obj, j)).intValue();
    }

    private final int zzq(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzs(i, 0);
    }

    private final int zzr(int i) {
        return this.zzc[i + 2];
    }

    private final int zzs(int i, int i2) {
        int length = (this.zzc.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzc[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private static int zzt(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzu(int i) {
        return this.zzc[i + 1];
    }

    private static long zzv(Object obj, long j) {
        return ((Long) zzhao.zzh(obj, j)).longValue();
    }

    private final zzgxx zzw(int i) {
        int i2 = i / 3;
        return (zzgxx) this.zzd[i2 + i2 + 1];
    }

    private final zzgzv zzx(int i) {
        Object[] objArr = this.zzd;
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzgzv zzgzvVar = (zzgzv) objArr[i3];
        if (zzgzvVar != null) {
            return zzgzvVar;
        }
        zzgzv zzgzvVarZzb = zzgzm.zza().zzb((Class) objArr[i3 + 1]);
        this.zzd[i3] = zzgzvVarZzb;
        return zzgzvVarZzb;
    }

    private final Object zzy(Object obj, int i, Object obj2, zzhah zzhahVar, Object obj3) {
        int i2 = this.zzc[i];
        Object objZzh = zzhao.zzh(obj, zzu(i) & 1048575);
        if (objZzh == null || zzw(i) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzz(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    /* JADX WARN: Code duplicated, block: B:139:0x0398  */
    /* JADX WARN: Code duplicated, block: B:196:0x04ee  */
    @Override // com.google.android.gms.internal.ads.zzgzv
    public final int zza(Object obj) {
        int i;
        int i2;
        int i3;
        int iZzD;
        int iZzE;
        int iZzD2;
        int iZzd;
        int iZzD3;
        int iZzh;
        int iZzy;
        int iZzD4;
        int size;
        int iZzl;
        int iZzD5;
        int iZzD6;
        int iZzD7;
        int iZzy2;
        Unsafe unsafe = zzb;
        boolean z = false;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        int iC = 0;
        while (i7 < this.zzc.length) {
            int iZzu = zzu(i7);
            int iZzt = zzt(iZzu);
            int[] iArr = this.zzc;
            int i8 = iArr[i7];
            int i9 = iArr[i7 + 2];
            int i10 = i9 & i4;
            if (iZzt <= 17) {
                if (i10 != i5) {
                    i6 = i10 == i4 ? 0 : unsafe.getInt(obj, i10);
                    i5 = i10;
                }
                i = i5;
                i2 = i6;
                i3 = 1 << (i9 >>> 20);
            } else {
                i = i5;
                i2 = i6;
                i3 = 0;
            }
            int i11 = iZzu & i4;
            if (iZzt >= zzgxh.zzJ.zza()) {
                zzgxh.zzW.zza();
            }
            long j = i11;
            switch (iZzt) {
                case 0:
                    if (zzO(obj, i7, i, i2, i3)) {
                        iC = AbstractC3888ke0.c(i8 << 3, 8, iC);
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 1:
                    if (zzO(obj, i7, i, i2, i3)) {
                        iC = AbstractC3888ke0.c(i8 << 3, 4, iC);
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 2:
                    if (zzO(obj, i7, i, i2, i3)) {
                        long j2 = unsafe.getLong(obj, j);
                        iZzD = zzgww.zzD(i8 << 3);
                        iZzE = zzgww.zzE(j2);
                        iC += iZzE + iZzD;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 3:
                    if (zzO(obj, i7, i, i2, i3)) {
                        long j3 = unsafe.getLong(obj, j);
                        iZzD = zzgww.zzD(i8 << 3);
                        iZzE = zzgww.zzE(j3);
                        iC += iZzE + iZzD;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 4:
                    if (zzO(obj, i7, i, i2, i3)) {
                        long j4 = unsafe.getInt(obj, j);
                        iZzD = zzgww.zzD(i8 << 3);
                        iZzE = zzgww.zzE(j4);
                        iC += iZzE + iZzD;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 5:
                    if (zzO(obj, i7, i, i2, i3)) {
                        iC = AbstractC3888ke0.c(i8 << 3, 8, iC);
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 6:
                    if (zzO(obj, i7, i, i2, i3)) {
                        iC = AbstractC3888ke0.c(i8 << 3, 4, iC);
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 7:
                    if (zzO(obj, i7, i, i2, i3)) {
                        iC = AbstractC3888ke0.c(i8 << 3, 1, iC);
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 8:
                    if (zzO(obj, i7, i, i2, i3)) {
                        int i12 = i8 << 3;
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzgwj) {
                            iZzD2 = zzgww.zzD(i12);
                            iZzd = ((zzgwj) object).zzd();
                            iZzD3 = zzgww.zzD(iZzd);
                            iC += iZzD3 + iZzd + iZzD2;
                        } else {
                            iZzD = zzgww.zzD(i12);
                            iZzE = zzgww.zzC((String) object);
                            iC += iZzE + iZzD;
                        }
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 9:
                    if (zzO(obj, i7, i, i2, i3)) {
                        iZzh = zzgzx.zzh(i8, unsafe.getObject(obj, j), zzx(i7));
                        iC += iZzh;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 10:
                    if (zzO(obj, i7, i, i2, i3)) {
                        zzgwj zzgwjVar = (zzgwj) unsafe.getObject(obj, j);
                        iZzD2 = zzgww.zzD(i8 << 3);
                        iZzd = zzgwjVar.zzd();
                        iZzD3 = zzgww.zzD(iZzd);
                        iC += iZzD3 + iZzd + iZzD2;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 11:
                    if (zzO(obj, i7, i, i2, i3)) {
                        iC = AbstractC3888ke0.c(unsafe.getInt(obj, j), zzgww.zzD(i8 << 3), iC);
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 12:
                    if (zzO(obj, i7, i, i2, i3)) {
                        long j5 = unsafe.getInt(obj, j);
                        iZzD = zzgww.zzD(i8 << 3);
                        iZzE = zzgww.zzE(j5);
                        iC += iZzE + iZzD;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 13:
                    if (zzO(obj, i7, i, i2, i3)) {
                        iC = AbstractC3888ke0.c(i8 << 3, 4, iC);
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 14:
                    if (zzO(obj, i7, i, i2, i3)) {
                        iC = AbstractC3888ke0.c(i8 << 3, 8, iC);
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 15:
                    if (zzO(obj, i7, i, i2, i3)) {
                        int i13 = unsafe.getInt(obj, j);
                        iC = AbstractC3888ke0.c((i13 >> 31) ^ (i13 + i13), zzgww.zzD(i8 << 3), iC);
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 16:
                    if (zzO(obj, i7, i, i2, i3)) {
                        long j6 = unsafe.getLong(obj, j);
                        iZzD = zzgww.zzD(i8 << 3);
                        iZzE = zzgww.zzE((j6 >> 63) ^ (j6 + j6));
                        iC += iZzE + iZzD;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 17:
                    if (zzO(obj, i7, i, i2, i3)) {
                        iZzy = zzgww.zzy(i8, (zzgzc) unsafe.getObject(obj, j), zzx(i7));
                        iC += iZzy;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 18:
                    iZzh = zzgzx.zzd(i8, (List) unsafe.getObject(obj, j), z);
                    iC += iZzh;
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 19:
                    iZzh = zzgzx.zzb(i8, (List) unsafe.getObject(obj, j), z);
                    iC += iZzh;
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(obj, j);
                    int i14 = zzgzx.zza;
                    if (list.size() == 0) {
                        iZzD4 = 0;
                    } else {
                        iZzD4 = (zzgww.zzD(i8 << 3) * list.size()) + zzgzx.zzg(list);
                    }
                    iC += iZzD4;
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j);
                    int i15 = zzgzx.zza;
                    size = list2.size();
                    if (size == 0) {
                        iZzD6 = 0;
                    } else {
                        iZzl = zzgzx.zzl(list2);
                        iZzD5 = zzgww.zzD(i8 << 3);
                        iZzD6 = (iZzD5 * size) + iZzl;
                    }
                    iC += iZzD6;
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j);
                    int i16 = zzgzx.zza;
                    size = list3.size();
                    if (size == 0) {
                        iZzD6 = 0;
                    } else {
                        iZzl = zzgzx.zzf(list3);
                        iZzD5 = zzgww.zzD(i8 << 3);
                        iZzD6 = (iZzD5 * size) + iZzl;
                    }
                    iC += iZzD6;
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 23:
                    iZzh = zzgzx.zzd(i8, (List) unsafe.getObject(obj, j), z);
                    iC += iZzh;
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 24:
                    iZzh = zzgzx.zzb(i8, (List) unsafe.getObject(obj, j), z);
                    iC += iZzh;
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j);
                    int i17 = zzgzx.zza;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        iZzD4 = 0;
                    } else {
                        iZzD4 = (zzgww.zzD(i8 << 3) + 1) * size2;
                    }
                    iC += iZzD4;
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(obj, j);
                    int i18 = zzgzx.zza;
                    int size3 = list5.size();
                    if (size3 == 0) {
                        iZzD6 = 0;
                    } else {
                        iZzD6 = zzgww.zzD(i8 << 3) * size3;
                        if (list5 instanceof zzgyo) {
                            zzgyo zzgyoVar = (zzgyo) list5;
                            for (int i19 = 0; i19 < size3; i19++) {
                                Object objZzc = zzgyoVar.zzc();
                                if (objZzc instanceof zzgwj) {
                                    int iZzd2 = ((zzgwj) objZzc).zzd();
                                    iZzD6 = AbstractC3888ke0.c(iZzd2, iZzd2, iZzD6);
                                } else {
                                    iZzD6 = zzgww.zzC((String) objZzc) + iZzD6;
                                }
                            }
                        } else {
                            for (int i20 = 0; i20 < size3; i20++) {
                                Object obj2 = list5.get(i20);
                                if (obj2 instanceof zzgwj) {
                                    int iZzd3 = ((zzgwj) obj2).zzd();
                                    iZzD6 = AbstractC3888ke0.c(iZzd3, iZzd3, iZzD6);
                                } else {
                                    iZzD6 = zzgww.zzC((String) obj2) + iZzD6;
                                }
                            }
                        }
                    }
                    iC += iZzD6;
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(obj, j);
                    zzgzv zzgzvVarZzx = zzx(i7);
                    int i21 = zzgzx.zza;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        iZzD7 = 0;
                    } else {
                        iZzD7 = zzgww.zzD(i8 << 3) * size4;
                        for (int i22 = 0; i22 < size4; i22++) {
                            Object obj3 = list6.get(i22);
                            if (obj3 instanceof zzgyn) {
                                int iZza = ((zzgyn) obj3).zza();
                                iZzD7 = AbstractC3888ke0.c(iZza, iZza, iZzD7);
                            } else {
                                iZzD7 = zzgww.zzA((zzgzc) obj3, zzgzvVarZzx) + iZzD7;
                            }
                        }
                    }
                    iC += iZzD7;
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(obj, j);
                    int i23 = zzgzx.zza;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        iZzD6 = 0;
                    } else {
                        iZzD6 = zzgww.zzD(i8 << 3) * size5;
                        for (int i24 = 0; i24 < list7.size(); i24++) {
                            int iZzd4 = ((zzgwj) list7.get(i24)).zzd();
                            iZzD6 = AbstractC3888ke0.c(iZzd4, iZzd4, iZzD6);
                        }
                    }
                    iC += iZzD6;
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(obj, j);
                    int i25 = zzgzx.zza;
                    size = list8.size();
                    if (size == 0) {
                        iZzD6 = 0;
                    } else {
                        iZzl = zzgzx.zzk(list8);
                        iZzD5 = zzgww.zzD(i8 << 3);
                        iZzD6 = (iZzD5 * size) + iZzl;
                    }
                    iC += iZzD6;
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(obj, j);
                    int i26 = zzgzx.zza;
                    size = list9.size();
                    if (size == 0) {
                        iZzD6 = 0;
                    } else {
                        iZzl = zzgzx.zza(list9);
                        iZzD5 = zzgww.zzD(i8 << 3);
                        iZzD6 = (iZzD5 * size) + iZzl;
                    }
                    iC += iZzD6;
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 31:
                    iZzh = zzgzx.zzb(i8, (List) unsafe.getObject(obj, j), z);
                    iC += iZzh;
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 32:
                    iZzh = zzgzx.zzd(i8, (List) unsafe.getObject(obj, j), z);
                    iC += iZzh;
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(obj, j);
                    int i27 = zzgzx.zza;
                    size = list10.size();
                    if (size == 0) {
                        iZzD6 = 0;
                    } else {
                        iZzl = zzgzx.zzi(list10);
                        iZzD5 = zzgww.zzD(i8 << 3);
                        iZzD6 = (iZzD5 * size) + iZzl;
                    }
                    iC += iZzD6;
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(obj, j);
                    int i28 = zzgzx.zza;
                    size = list11.size();
                    if (size == 0) {
                        iZzD6 = 0;
                    } else {
                        iZzl = zzgzx.zzj(list11);
                        iZzD5 = zzgww.zzD(i8 << 3);
                        iZzD6 = (iZzD5 * size) + iZzl;
                    }
                    iC += iZzD6;
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 35:
                    iZzD2 = zzgzx.zze((List) unsafe.getObject(obj, j));
                    if (iZzD2 > 0) {
                        iZzd = zzgww.zzD(i8 << 3);
                        iZzD3 = zzgww.zzD(iZzD2);
                        iC += iZzD3 + iZzd + iZzD2;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 36:
                    iZzD2 = zzgzx.zzc((List) unsafe.getObject(obj, j));
                    if (iZzD2 > 0) {
                        iZzd = zzgww.zzD(i8 << 3);
                        iZzD3 = zzgww.zzD(iZzD2);
                        iC += iZzD3 + iZzd + iZzD2;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 37:
                    iZzD2 = zzgzx.zzg((List) unsafe.getObject(obj, j));
                    if (iZzD2 > 0) {
                        iZzd = zzgww.zzD(i8 << 3);
                        iZzD3 = zzgww.zzD(iZzD2);
                        iC += iZzD3 + iZzd + iZzD2;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 38:
                    iZzD2 = zzgzx.zzl((List) unsafe.getObject(obj, j));
                    if (iZzD2 > 0) {
                        iZzd = zzgww.zzD(i8 << 3);
                        iZzD3 = zzgww.zzD(iZzD2);
                        iC += iZzD3 + iZzd + iZzD2;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 39:
                    iZzD2 = zzgzx.zzf((List) unsafe.getObject(obj, j));
                    if (iZzD2 > 0) {
                        iZzd = zzgww.zzD(i8 << 3);
                        iZzD3 = zzgww.zzD(iZzD2);
                        iC += iZzD3 + iZzd + iZzD2;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 40:
                    iZzD2 = zzgzx.zze((List) unsafe.getObject(obj, j));
                    if (iZzD2 > 0) {
                        iZzd = zzgww.zzD(i8 << 3);
                        iZzD3 = zzgww.zzD(iZzD2);
                        iC += iZzD3 + iZzd + iZzD2;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 41:
                    iZzD2 = zzgzx.zzc((List) unsafe.getObject(obj, j));
                    if (iZzD2 > 0) {
                        iZzd = zzgww.zzD(i8 << 3);
                        iZzD3 = zzgww.zzD(iZzD2);
                        iC += iZzD3 + iZzd + iZzD2;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 42:
                    List list12 = (List) unsafe.getObject(obj, j);
                    int i29 = zzgzx.zza;
                    iZzD2 = list12.size();
                    if (iZzD2 > 0) {
                        iZzd = zzgww.zzD(i8 << 3);
                        iZzD3 = zzgww.zzD(iZzD2);
                        iC += iZzD3 + iZzd + iZzD2;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 43:
                    iZzD2 = zzgzx.zzk((List) unsafe.getObject(obj, j));
                    if (iZzD2 > 0) {
                        iZzd = zzgww.zzD(i8 << 3);
                        iZzD3 = zzgww.zzD(iZzD2);
                        iC += iZzD3 + iZzd + iZzD2;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 44:
                    iZzD2 = zzgzx.zza((List) unsafe.getObject(obj, j));
                    if (iZzD2 > 0) {
                        iZzd = zzgww.zzD(i8 << 3);
                        iZzD3 = zzgww.zzD(iZzD2);
                        iC += iZzD3 + iZzd + iZzD2;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 45:
                    iZzD2 = zzgzx.zzc((List) unsafe.getObject(obj, j));
                    if (iZzD2 > 0) {
                        iZzd = zzgww.zzD(i8 << 3);
                        iZzD3 = zzgww.zzD(iZzD2);
                        iC += iZzD3 + iZzd + iZzD2;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 46:
                    iZzD2 = zzgzx.zze((List) unsafe.getObject(obj, j));
                    if (iZzD2 > 0) {
                        iZzd = zzgww.zzD(i8 << 3);
                        iZzD3 = zzgww.zzD(iZzD2);
                        iC += iZzD3 + iZzd + iZzD2;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 47:
                    iZzD2 = zzgzx.zzi((List) unsafe.getObject(obj, j));
                    if (iZzD2 > 0) {
                        iZzd = zzgww.zzD(i8 << 3);
                        iZzD3 = zzgww.zzD(iZzD2);
                        iC += iZzD3 + iZzd + iZzD2;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 48:
                    iZzD2 = zzgzx.zzj((List) unsafe.getObject(obj, j));
                    if (iZzD2 > 0) {
                        iZzd = zzgww.zzD(i8 << 3);
                        iZzD3 = zzgww.zzD(iZzD2);
                        iC += iZzD3 + iZzd + iZzD2;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 49:
                    List list13 = (List) unsafe.getObject(obj, j);
                    zzgzv zzgzvVarZzx2 = zzx(i7);
                    int i30 = zzgzx.zza;
                    int size6 = list13.size();
                    if (size6 == 0) {
                        iZzy2 = 0;
                    } else {
                        iZzy2 = 0;
                        for (int i31 = 0; i31 < size6; i31++) {
                            iZzy2 += zzgww.zzy(i8, (zzgzc) list13.get(i31), zzgzvVarZzx2);
                        }
                    }
                    iC += iZzy2;
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 50:
                    zzgyw zzgywVar = (zzgyw) unsafe.getObject(obj, j);
                    if (zzgywVar.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = zzgywVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                case 51:
                    if (zzR(obj, i8, i7)) {
                        iC = AbstractC3888ke0.c(i8 << 3, 8, iC);
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 52:
                    if (zzR(obj, i8, i7)) {
                        iC = AbstractC3888ke0.c(i8 << 3, 4, iC);
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 53:
                    if (zzR(obj, i8, i7)) {
                        long jZzv = zzv(obj, j);
                        iZzD = zzgww.zzD(i8 << 3);
                        iZzE = zzgww.zzE(jZzv);
                        iC += iZzE + iZzD;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 54:
                    if (zzR(obj, i8, i7)) {
                        long jZzv2 = zzv(obj, j);
                        iZzD = zzgww.zzD(i8 << 3);
                        iZzE = zzgww.zzE(jZzv2);
                        iC += iZzE + iZzD;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 55:
                    if (zzR(obj, i8, i7)) {
                        long jZzp = zzp(obj, j);
                        iZzD = zzgww.zzD(i8 << 3);
                        iZzE = zzgww.zzE(jZzp);
                        iC += iZzE + iZzD;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case Input.Keys.PERIOD /* 56 */:
                    if (zzR(obj, i8, i7)) {
                        iC = AbstractC3888ke0.c(i8 << 3, 8, iC);
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case Input.Keys.ALT_LEFT /* 57 */:
                    if (zzR(obj, i8, i7)) {
                        iC = AbstractC3888ke0.c(i8 << 3, 4, iC);
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case Input.Keys.ALT_RIGHT /* 58 */:
                    if (zzR(obj, i8, i7)) {
                        iC = AbstractC3888ke0.c(i8 << 3, 1, iC);
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case Input.Keys.SHIFT_LEFT /* 59 */:
                    if (zzR(obj, i8, i7)) {
                        int i32 = i8 << 3;
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzgwj) {
                            iZzD2 = zzgww.zzD(i32);
                            iZzd = ((zzgwj) object2).zzd();
                            iZzD3 = zzgww.zzD(iZzd);
                            iC += iZzD3 + iZzd + iZzD2;
                        } else {
                            iZzD = zzgww.zzD(i32);
                            iZzE = zzgww.zzC((String) object2);
                            iC += iZzE + iZzD;
                        }
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 60:
                    if (zzR(obj, i8, i7)) {
                        iZzh = zzgzx.zzh(i8, unsafe.getObject(obj, j), zzx(i7));
                        iC += iZzh;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case Input.Keys.TAB /* 61 */:
                    if (zzR(obj, i8, i7)) {
                        zzgwj zzgwjVar2 = (zzgwj) unsafe.getObject(obj, j);
                        iZzD2 = zzgww.zzD(i8 << 3);
                        iZzd = zzgwjVar2.zzd();
                        iZzD3 = zzgww.zzD(iZzd);
                        iC += iZzD3 + iZzd + iZzD2;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case Input.Keys.SPACE /* 62 */:
                    if (zzR(obj, i8, i7)) {
                        iC = AbstractC3888ke0.c(zzp(obj, j), zzgww.zzD(i8 << 3), iC);
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 63:
                    if (zzR(obj, i8, i7)) {
                        long jZzp2 = zzp(obj, j);
                        iZzD = zzgww.zzD(i8 << 3);
                        iZzE = zzgww.zzE(jZzp2);
                        iC += iZzE + iZzD;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 64:
                    if (zzR(obj, i8, i7)) {
                        iC = AbstractC3888ke0.c(i8 << 3, 4, iC);
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 65:
                    if (zzR(obj, i8, i7)) {
                        iC = AbstractC3888ke0.c(i8 << 3, 8, iC);
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 66:
                    if (zzR(obj, i8, i7)) {
                        int iZzp = zzp(obj, j);
                        iC = AbstractC3888ke0.c((iZzp >> 31) ^ (iZzp + iZzp), zzgww.zzD(i8 << 3), iC);
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case 67:
                    if (zzR(obj, i8, i7)) {
                        long jZzv3 = zzv(obj, j);
                        iZzD = zzgww.zzD(i8 << 3);
                        iZzE = zzgww.zzE((jZzv3 >> 63) ^ (jZzv3 + jZzv3));
                        iC += iZzE + iZzD;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                case Input.Keys.GRAVE /* 68 */:
                    if (zzR(obj, i8, i7)) {
                        iZzy = zzgww.zzy(i8, (zzgzc) unsafe.getObject(obj, j), zzx(i7));
                        iC += iZzy;
                    }
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
                default:
                    i7 += 3;
                    i5 = i;
                    i6 = i2;
                    z = false;
                    i4 = 1048575;
                    break;
            }
        }
        int iZza2 = ((zzgxr) obj).zzt.zza() + iC;
        if (!this.zzh) {
            return iZza2;
        }
        zzgxg zzgxgVar = ((zzgxn) obj).zza;
        int iZzc = zzgxgVar.zza.zzc();
        int iZzc2 = 0;
        for (int i33 = 0; i33 < iZzc; i33++) {
            Map.Entry entryZzg = zzgxgVar.zza.zzg(i33);
            iZzc2 += zzgxg.zzc((zzgxf) ((zzgzz) entryZzg).zza(), entryZzg.getValue());
        }
        for (Map.Entry entry2 : zzgxgVar.zza.zzd()) {
            iZzc2 += zzgxg.zzc((zzgxf) entry2.getKey(), entry2.getValue());
        }
        return iZza2 + iZzc2;
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    public final int zzb(Object obj) {
        int i;
        long jDoubleToLongBits;
        int i2;
        int iFloatToIntBits;
        int i3;
        int iZzd;
        int i4;
        int i5 = 0;
        for (int i6 = 0; i6 < this.zzc.length; i6 += 3) {
            int iZzu = zzu(i6);
            int[] iArr = this.zzc;
            int i7 = 1048575 & iZzu;
            int iZzt = zzt(iZzu);
            int i8 = iArr[i6];
            long j = i7;
            int iHashCode = 37;
            switch (iZzt) {
                case 0:
                    i = i5 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zzhao.zzb(obj, j));
                    byte[] bArr = zzgye.zzb;
                    i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 1:
                    i2 = i5 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zzhao.zzc(obj, j));
                    i5 = iFloatToIntBits + i2;
                    break;
                case 2:
                    i = i5 * 53;
                    jDoubleToLongBits = zzhao.zzf(obj, j);
                    byte[] bArr2 = zzgye.zzb;
                    i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 3:
                    i = i5 * 53;
                    jDoubleToLongBits = zzhao.zzf(obj, j);
                    byte[] bArr3 = zzgye.zzb;
                    i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 4:
                    i3 = i5 * 53;
                    iZzd = zzhao.zzd(obj, j);
                    i5 = i3 + iZzd;
                    break;
                case 5:
                    i = i5 * 53;
                    jDoubleToLongBits = zzhao.zzf(obj, j);
                    byte[] bArr4 = zzgye.zzb;
                    i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 6:
                    i3 = i5 * 53;
                    iZzd = zzhao.zzd(obj, j);
                    i5 = i3 + iZzd;
                    break;
                case 7:
                    i2 = i5 * 53;
                    iFloatToIntBits = zzgye.zza(zzhao.zzz(obj, j));
                    i5 = iFloatToIntBits + i2;
                    break;
                case 8:
                    i2 = i5 * 53;
                    iFloatToIntBits = ((String) zzhao.zzh(obj, j)).hashCode();
                    i5 = iFloatToIntBits + i2;
                    break;
                case 9:
                    i4 = i5 * 53;
                    Object objZzh = zzhao.zzh(obj, j);
                    if (objZzh != null) {
                        iHashCode = objZzh.hashCode();
                    }
                    i5 = i4 + iHashCode;
                    break;
                case 10:
                    i2 = i5 * 53;
                    iFloatToIntBits = zzhao.zzh(obj, j).hashCode();
                    i5 = iFloatToIntBits + i2;
                    break;
                case 11:
                    i3 = i5 * 53;
                    iZzd = zzhao.zzd(obj, j);
                    i5 = i3 + iZzd;
                    break;
                case 12:
                    i3 = i5 * 53;
                    iZzd = zzhao.zzd(obj, j);
                    i5 = i3 + iZzd;
                    break;
                case 13:
                    i3 = i5 * 53;
                    iZzd = zzhao.zzd(obj, j);
                    i5 = i3 + iZzd;
                    break;
                case 14:
                    i = i5 * 53;
                    jDoubleToLongBits = zzhao.zzf(obj, j);
                    byte[] bArr5 = zzgye.zzb;
                    i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 15:
                    i3 = i5 * 53;
                    iZzd = zzhao.zzd(obj, j);
                    i5 = i3 + iZzd;
                    break;
                case 16:
                    i = i5 * 53;
                    jDoubleToLongBits = zzhao.zzf(obj, j);
                    byte[] bArr6 = zzgye.zzb;
                    i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 17:
                    i4 = i5 * 53;
                    Object objZzh2 = zzhao.zzh(obj, j);
                    if (objZzh2 != null) {
                        iHashCode = objZzh2.hashCode();
                    }
                    i5 = i4 + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i2 = i5 * 53;
                    iFloatToIntBits = zzhao.zzh(obj, j).hashCode();
                    i5 = iFloatToIntBits + i2;
                    break;
                case 50:
                    i2 = i5 * 53;
                    iFloatToIntBits = zzhao.zzh(obj, j).hashCode();
                    i5 = iFloatToIntBits + i2;
                    break;
                case 51:
                    if (zzR(obj, i8, i6)) {
                        i = i5 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(zzn(obj, j));
                        byte[] bArr7 = zzgye.zzb;
                        i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 52:
                    if (zzR(obj, i8, i6)) {
                        i2 = i5 * 53;
                        iFloatToIntBits = Float.floatToIntBits(zzo(obj, j));
                        i5 = iFloatToIntBits + i2;
                    }
                    break;
                case 53:
                    if (zzR(obj, i8, i6)) {
                        i = i5 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr8 = zzgye.zzb;
                        i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 54:
                    if (zzR(obj, i8, i6)) {
                        i = i5 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr9 = zzgye.zzb;
                        i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 55:
                    if (zzR(obj, i8, i6)) {
                        i3 = i5 * 53;
                        iZzd = zzp(obj, j);
                        i5 = i3 + iZzd;
                    }
                    break;
                case Input.Keys.PERIOD /* 56 */:
                    if (zzR(obj, i8, i6)) {
                        i = i5 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr10 = zzgye.zzb;
                        i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case Input.Keys.ALT_LEFT /* 57 */:
                    if (zzR(obj, i8, i6)) {
                        i3 = i5 * 53;
                        iZzd = zzp(obj, j);
                        i5 = i3 + iZzd;
                    }
                    break;
                case Input.Keys.ALT_RIGHT /* 58 */:
                    if (zzR(obj, i8, i6)) {
                        i2 = i5 * 53;
                        iFloatToIntBits = zzgye.zza(zzS(obj, j));
                        i5 = iFloatToIntBits + i2;
                    }
                    break;
                case Input.Keys.SHIFT_LEFT /* 59 */:
                    if (zzR(obj, i8, i6)) {
                        i2 = i5 * 53;
                        iFloatToIntBits = ((String) zzhao.zzh(obj, j)).hashCode();
                        i5 = iFloatToIntBits + i2;
                    }
                    break;
                case 60:
                    if (zzR(obj, i8, i6)) {
                        i2 = i5 * 53;
                        iFloatToIntBits = zzhao.zzh(obj, j).hashCode();
                        i5 = iFloatToIntBits + i2;
                    }
                    break;
                case Input.Keys.TAB /* 61 */:
                    if (zzR(obj, i8, i6)) {
                        i2 = i5 * 53;
                        iFloatToIntBits = zzhao.zzh(obj, j).hashCode();
                        i5 = iFloatToIntBits + i2;
                    }
                    break;
                case Input.Keys.SPACE /* 62 */:
                    if (zzR(obj, i8, i6)) {
                        i3 = i5 * 53;
                        iZzd = zzp(obj, j);
                        i5 = i3 + iZzd;
                    }
                    break;
                case 63:
                    if (zzR(obj, i8, i6)) {
                        i3 = i5 * 53;
                        iZzd = zzp(obj, j);
                        i5 = i3 + iZzd;
                    }
                    break;
                case 64:
                    if (zzR(obj, i8, i6)) {
                        i3 = i5 * 53;
                        iZzd = zzp(obj, j);
                        i5 = i3 + iZzd;
                    }
                    break;
                case 65:
                    if (zzR(obj, i8, i6)) {
                        i = i5 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr11 = zzgye.zzb;
                        i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 66:
                    if (zzR(obj, i8, i6)) {
                        i3 = i5 * 53;
                        iZzd = zzp(obj, j);
                        i5 = i3 + iZzd;
                    }
                    break;
                case 67:
                    if (zzR(obj, i8, i6)) {
                        i = i5 * 53;
                        jDoubleToLongBits = zzv(obj, j);
                        byte[] bArr12 = zzgye.zzb;
                        i5 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case Input.Keys.GRAVE /* 68 */:
                    if (zzR(obj, i8, i6)) {
                        i2 = i5 * 53;
                        iFloatToIntBits = zzhao.zzh(obj, j).hashCode();
                        i5 = iFloatToIntBits + i2;
                    }
                    break;
            }
        }
        int iHashCode2 = ((zzgxr) obj).zzt.hashCode() + (i5 * 53);
        return this.zzh ? (iHashCode2 * 53) + ((zzgxn) obj).zza.zza.hashCode() : iHashCode2;
    }

    /* JADX WARN: Code duplicated, block: B:497:0x0c5a A[PHI: r2 r4 r6 r10 r13 r14 r22
  0x0c5a: PHI (r2v113 int) = 
  (r2v98 int)
  (r2v99 int)
  (r2v100 int)
  (r2v101 int)
  (r2v102 int)
  (r2v103 int)
  (r2v104 int)
  (r2v106 int)
  (r2v109 int)
  (r2v114 int)
 binds: [B:495:0x0c42, B:492:0x0c1f, B:489:0x0c00, B:486:0x0be2, B:483:0x0bc5, B:480:0x0ba7, B:473:0x0b80, B:471:0x0b72, B:436:0x0a85, B:427:0x0a2a] A[DONT_GENERATE, DONT_INLINE]
  0x0c5a: PHI (r4v107 int) = 
  (r4v83 int)
  (r4v84 int)
  (r4v85 int)
  (r4v86 int)
  (r4v87 int)
  (r4v88 int)
  (r4v89 int)
  (r4v91 int)
  (r4v99 int)
  (r4v108 int)
 binds: [B:495:0x0c42, B:492:0x0c1f, B:489:0x0c00, B:486:0x0be2, B:483:0x0bc5, B:480:0x0ba7, B:473:0x0b80, B:471:0x0b72, B:436:0x0a85, B:427:0x0a2a] A[DONT_GENERATE, DONT_INLINE]
  0x0c5a: PHI (r6v25 com.google.android.gms.internal.ads.zzgzf<T>) = 
  (r6v6 com.google.android.gms.internal.ads.zzgzf<T>)
  (r6v7 com.google.android.gms.internal.ads.zzgzf<T>)
  (r6v8 com.google.android.gms.internal.ads.zzgzf<T>)
  (r6v9 com.google.android.gms.internal.ads.zzgzf<T>)
  (r6v10 com.google.android.gms.internal.ads.zzgzf<T>)
  (r6v11 com.google.android.gms.internal.ads.zzgzf<T>)
  (r6v12 com.google.android.gms.internal.ads.zzgzf<T>)
  (r6v14 com.google.android.gms.internal.ads.zzgzf<T>)
  (r6v19 com.google.android.gms.internal.ads.zzgzf<T>)
  (r6v26 com.google.android.gms.internal.ads.zzgzf<T>)
 binds: [B:495:0x0c42, B:492:0x0c1f, B:489:0x0c00, B:486:0x0be2, B:483:0x0bc5, B:480:0x0ba7, B:473:0x0b80, B:471:0x0b72, B:436:0x0a85, B:427:0x0a2a] A[DONT_GENERATE, DONT_INLINE]
  0x0c5a: PHI (r10v104 com.google.android.gms.internal.ads.zzgvx) = 
  (r10v83 com.google.android.gms.internal.ads.zzgvx)
  (r10v84 com.google.android.gms.internal.ads.zzgvx)
  (r10v85 com.google.android.gms.internal.ads.zzgvx)
  (r10v86 com.google.android.gms.internal.ads.zzgvx)
  (r10v87 com.google.android.gms.internal.ads.zzgvx)
  (r10v88 com.google.android.gms.internal.ads.zzgvx)
  (r10v89 com.google.android.gms.internal.ads.zzgvx)
  (r10v91 com.google.android.gms.internal.ads.zzgvx)
  (r10v96 com.google.android.gms.internal.ads.zzgvx)
  (r10v105 com.google.android.gms.internal.ads.zzgvx)
 binds: [B:495:0x0c42, B:492:0x0c1f, B:489:0x0c00, B:486:0x0be2, B:483:0x0bc5, B:480:0x0ba7, B:473:0x0b80, B:471:0x0b72, B:436:0x0a85, B:427:0x0a2a] A[DONT_GENERATE, DONT_INLINE]
  0x0c5a: PHI (r13v105 int) = 
  (r13v86 int)
  (r13v87 int)
  (r13v88 int)
  (r13v89 int)
  (r13v90 int)
  (r13v91 int)
  (r13v92 int)
  (r13v94 int)
  (r13v99 int)
  (r13v106 int)
 binds: [B:495:0x0c42, B:492:0x0c1f, B:489:0x0c00, B:486:0x0be2, B:483:0x0bc5, B:480:0x0ba7, B:473:0x0b80, B:471:0x0b72, B:436:0x0a85, B:427:0x0a2a] A[DONT_GENERATE, DONT_INLINE]
  0x0c5a: PHI (r14v97 int) = 
  (r14v79 int)
  (r14v80 int)
  (r14v81 int)
  (r14v82 int)
  (r14v83 int)
  (r14v84 int)
  (r14v85 int)
  (r14v87 int)
  (r14v89 int)
  (r14v98 int)
 binds: [B:495:0x0c42, B:492:0x0c1f, B:489:0x0c00, B:486:0x0be2, B:483:0x0bc5, B:480:0x0ba7, B:473:0x0b80, B:471:0x0b72, B:436:0x0a85, B:427:0x0a2a] A[DONT_GENERATE, DONT_INLINE]
  0x0c5a: PHI (r22v21 sun.misc.Unsafe) = 
  (r22v14 sun.misc.Unsafe)
  (r22v14 sun.misc.Unsafe)
  (r22v14 sun.misc.Unsafe)
  (r22v14 sun.misc.Unsafe)
  (r22v14 sun.misc.Unsafe)
  (r22v14 sun.misc.Unsafe)
  (r22v14 sun.misc.Unsafe)
  (r22v16 sun.misc.Unsafe)
  (r22v14 sun.misc.Unsafe)
  (r22v14 sun.misc.Unsafe)
 binds: [B:495:0x0c42, B:492:0x0c1f, B:489:0x0c00, B:486:0x0be2, B:483:0x0bc5, B:480:0x0ba7, B:473:0x0b80, B:471:0x0b72, B:436:0x0a85, B:427:0x0a2a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:514:0x0cb1  */
    /* JADX WARN: Code duplicated, block: B:574:0x09b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:577:0x0c5d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:605:0x09c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:617:0x0c6e A[SYNTHETIC] */
    public final int zzc(Object obj, byte[] bArr, int i, int i2, int i3, zzgvx zzgvxVar) throws IOException {
        Unsafe unsafe;
        int i4;
        zzgvx zzgvxVar2;
        Unsafe unsafe2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int iZzg;
        zzgvx zzgvxVar3;
        int i10;
        int i11;
        Unsafe unsafe3;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int iZzm;
        int i19;
        int i20;
        int i21;
        int i22;
        Unsafe unsafe4;
        int i23;
        int i24;
        int i25;
        Unsafe unsafe5;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int iZzf;
        int iZzh;
        zzgvx zzgvxVar4;
        int i31;
        int iZzj;
        int iZzk;
        int i32;
        int i33;
        int iZza;
        zzgzf<T> zzgzfVar = this;
        Object obj2 = obj;
        int i34 = i2;
        i3 = i3;
        zzgvx zzgvxVar5 = zzgvxVar;
        zzD(obj);
        Unsafe unsafe6 = zzb;
        int i35 = -1;
        int iZzl = i;
        int i36 = -1;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        int i40 = 1048575;
        while (true) {
            if (iZzl < i34) {
                int i41 = iZzl + 1;
                int i42 = bArr[iZzl];
                if (i42 < 0) {
                    int iZzi = zzgvy.zzi(i42, bArr, i41, zzgvxVar5);
                    i4 = zzgvxVar5.zza;
                    i41 = iZzi;
                } else {
                    i4 = i42;
                }
                int i43 = i4 >>> 3;
                int iZzs = i43 > i36 ? (i43 < zzgzfVar.zze || i43 > zzgzfVar.zzf) ? -1 : zzgzfVar.zzs(i43, i37 / 3) : zzgzfVar.zzq(i43);
                if (iZzs == i35) {
                    zzgvxVar2 = zzgvxVar5;
                    unsafe2 = unsafe6;
                    i3 = i3;
                    i5 = i43;
                    iZzl = i41;
                    i6 = i4;
                    i7 = i39;
                    i8 = 0;
                } else {
                    int i44 = i4 & 7;
                    int[] iArr = zzgzfVar.zzc;
                    int i45 = iArr[iZzs + 1];
                    int iZzt = zzt(i45);
                    int i46 = i41;
                    int i47 = i4;
                    long j = i45 & 1048575;
                    if (iZzt <= 17) {
                        int i48 = iArr[iZzs + 2];
                        int i49 = 1 << (i48 >>> 20);
                        int i50 = 1048575;
                        int i51 = i48 & 1048575;
                        if (i51 != i40) {
                            if (i40 != 1048575) {
                                unsafe6.putInt(obj2, i40, i39);
                                i50 = 1048575;
                            }
                            if (i51 == i50) {
                                i51 = i51;
                                i39 = 0;
                            } else {
                                i51 = i51;
                                i39 = unsafe6.getInt(obj2, i51);
                            }
                            i40 = i51;
                        } else {
                            i40 = i40;
                        }
                        switch (iZzt) {
                            case 0:
                                zzgvxVar3 = zzgvxVar5;
                                i10 = iZzs;
                                i11 = i47;
                                unsafe3 = unsafe6;
                                i12 = i43;
                                iZzl = i46;
                                if (i44 == 1) {
                                    i13 = iZzl + 8;
                                    i39 |= i49;
                                    zzhao.zzr(obj2, j, Double.longBitsToDouble(zzgvy.zzn(bArr, iZzl)));
                                    i3 = i3;
                                    iZzl = i13;
                                    i38 = i11;
                                    i34 = i2;
                                    unsafe6 = unsafe3;
                                    zzgvxVar5 = zzgvxVar3;
                                    i40 = i40;
                                    i36 = i12;
                                    i35 = -1;
                                    i37 = i10;
                                } else {
                                    i3 = i3;
                                    i6 = i11;
                                    unsafe2 = unsafe3;
                                    zzgvxVar2 = zzgvxVar3;
                                    i40 = i40;
                                    i5 = i12;
                                    i7 = i39;
                                    i8 = i10;
                                }
                                break;
                            case 1:
                                zzgvxVar3 = zzgvxVar5;
                                i10 = iZzs;
                                i11 = i47;
                                unsafe3 = unsafe6;
                                i12 = i43;
                                iZzl = i46;
                                if (i44 == 5) {
                                    i13 = iZzl + 4;
                                    i39 |= i49;
                                    zzhao.zzs(obj2, j, Float.intBitsToFloat(zzgvy.zzb(bArr, iZzl)));
                                    i3 = i3;
                                    iZzl = i13;
                                    i38 = i11;
                                    i34 = i2;
                                    unsafe6 = unsafe3;
                                    zzgvxVar5 = zzgvxVar3;
                                    i40 = i40;
                                    i36 = i12;
                                    i35 = -1;
                                    i37 = i10;
                                } else {
                                    i3 = i3;
                                    i6 = i11;
                                    unsafe2 = unsafe3;
                                    zzgvxVar2 = zzgvxVar3;
                                    i40 = i40;
                                    i5 = i12;
                                    i7 = i39;
                                    i8 = i10;
                                }
                                break;
                            case 2:
                            case 3:
                                zzgvxVar3 = zzgvxVar5;
                                i14 = i47;
                                i15 = i2;
                                i12 = i43;
                                iZzl = i46;
                                unsafe3 = unsafe6;
                                i16 = iZzs;
                                if (i44 != 0) {
                                    i10 = i16;
                                    i11 = i14;
                                    i3 = i3;
                                    i6 = i11;
                                    unsafe2 = unsafe3;
                                    zzgvxVar2 = zzgvxVar3;
                                    i40 = i40;
                                    i5 = i12;
                                    i7 = i39;
                                    i8 = i10;
                                } else {
                                    i39 |= i49;
                                    iZzl = zzgvy.zzk(bArr, iZzl, zzgvxVar3);
                                    i38 = i14;
                                    unsafe3.putLong(obj, j, zzgvxVar3.zzb);
                                    i3 = i3;
                                    i34 = i15;
                                    unsafe6 = unsafe3;
                                    i37 = i16;
                                    zzgvxVar5 = zzgvxVar3;
                                    i40 = i40;
                                    i36 = i12;
                                }
                                i35 = -1;
                                break;
                            case 4:
                            case 11:
                                zzgvxVar3 = zzgvxVar5;
                                i14 = i47;
                                i15 = i2;
                                i12 = i43;
                                iZzl = i46;
                                unsafe3 = unsafe6;
                                i16 = iZzs;
                                if (i44 == 0) {
                                    i39 |= i49;
                                    iZzl = zzgvy.zzh(bArr, iZzl, zzgvxVar3);
                                    unsafe3.putInt(obj2, j, zzgvxVar3.zza);
                                    i3 = i3;
                                    i38 = i14;
                                    i36 = i12;
                                    i35 = -1;
                                    i34 = i15;
                                    zzgvxVar5 = zzgvxVar3;
                                    Unsafe unsafe7 = unsafe3;
                                    i37 = i16;
                                    unsafe6 = unsafe7;
                                } else {
                                    i10 = i16;
                                    i11 = i14;
                                    i3 = i3;
                                    i6 = i11;
                                    unsafe2 = unsafe3;
                                    zzgvxVar2 = zzgvxVar3;
                                    i40 = i40;
                                    i5 = i12;
                                    i7 = i39;
                                    i8 = i10;
                                }
                                break;
                            case 5:
                            case 14:
                                zzgvxVar3 = zzgvxVar5;
                                i11 = i47;
                                i12 = i43;
                                iZzl = i46;
                                unsafe3 = unsafe6;
                                if (i44 == 1) {
                                    i39 |= i49;
                                    unsafe3.putLong(obj, j, zzgvy.zzn(bArr, iZzl));
                                    i3 = i3;
                                    unsafe6 = unsafe3;
                                    i34 = i2;
                                    i37 = iZzs;
                                    zzgvxVar5 = zzgvxVar3;
                                    i35 = -1;
                                    i38 = i11;
                                    iZzl += 8;
                                    i36 = i12;
                                } else {
                                    i10 = iZzs;
                                    i3 = i3;
                                    i6 = i11;
                                    unsafe2 = unsafe3;
                                    zzgvxVar2 = zzgvxVar3;
                                    i40 = i40;
                                    i5 = i12;
                                    i7 = i39;
                                    i8 = i10;
                                }
                                break;
                            case 6:
                            case 13:
                                i34 = i2;
                                zzgvxVar3 = zzgvxVar5;
                                i11 = i47;
                                i12 = i43;
                                iZzl = i46;
                                unsafe3 = unsafe6;
                                i16 = iZzs;
                                if (i44 == 5) {
                                    i39 |= i49;
                                    unsafe3.putInt(obj2, j, zzgvy.zzb(bArr, iZzl));
                                    iZzl += 4;
                                    i38 = i11;
                                    zzgvxVar5 = zzgvxVar3;
                                    i36 = i12;
                                    i35 = -1;
                                    Unsafe unsafe8 = unsafe3;
                                    i37 = i16;
                                    unsafe6 = unsafe8;
                                } else {
                                    i10 = i16;
                                    i3 = i3;
                                    i6 = i11;
                                    unsafe2 = unsafe3;
                                    zzgvxVar2 = zzgvxVar3;
                                    i40 = i40;
                                    i5 = i12;
                                    i7 = i39;
                                    i8 = i10;
                                }
                                break;
                            case 7:
                                i34 = i2;
                                zzgvxVar3 = zzgvxVar5;
                                i11 = i47;
                                i12 = i43;
                                iZzl = i46;
                                unsafe3 = unsafe6;
                                i16 = iZzs;
                                if (i44 == 0) {
                                    i39 |= i49;
                                    iZzl = zzgvy.zzk(bArr, iZzl, zzgvxVar3);
                                    zzhao.zzp(obj2, j, zzgvxVar3.zzb != 0);
                                    i38 = i11;
                                    zzgvxVar5 = zzgvxVar3;
                                    i36 = i12;
                                    i35 = -1;
                                    Unsafe unsafe9 = unsafe3;
                                    i37 = i16;
                                    unsafe6 = unsafe9;
                                } else {
                                    i10 = i16;
                                    i3 = i3;
                                    i6 = i11;
                                    unsafe2 = unsafe3;
                                    zzgvxVar2 = zzgvxVar3;
                                    i40 = i40;
                                    i5 = i12;
                                    i7 = i39;
                                    i8 = i10;
                                }
                                break;
                            case 8:
                                i34 = i2;
                                zzgvxVar3 = zzgvxVar5;
                                i11 = i47;
                                i12 = i43;
                                iZzl = i46;
                                unsafe3 = unsafe6;
                                i16 = iZzs;
                                if (i44 == 2) {
                                    if (zzM(i45)) {
                                        int iZzh2 = zzgvy.zzh(bArr, iZzl, zzgvxVar3);
                                        int i52 = zzgvxVar3.zza;
                                        if (i52 < 0) {
                                            throw new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                        }
                                        int i53 = i49 | i39;
                                        if (i52 == 0) {
                                            zzgvxVar3.zzc = "";
                                        } else {
                                            zzgvxVar3.zzc = zzhat.zzh(bArr, iZzh2, i52);
                                            iZzh2 += i52;
                                        }
                                        iZzl = iZzh2;
                                        i39 = i53;
                                    } else {
                                        int i54 = i39 | i49;
                                        int iZzh3 = zzgvy.zzh(bArr, iZzl, zzgvxVar3);
                                        int i55 = zzgvxVar3.zza;
                                        if (i55 < 0) {
                                            throw new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                        }
                                        if (i55 == 0) {
                                            zzgvxVar3.zzc = "";
                                        } else {
                                            zzgvxVar3.zzc = new String(bArr, iZzh3, i55, zzgye.zza);
                                            iZzh3 += i55;
                                        }
                                        i39 = i54;
                                        iZzl = iZzh3;
                                    }
                                    unsafe3.putObject(obj2, j, zzgvxVar3.zzc);
                                    i38 = i11;
                                    zzgvxVar5 = zzgvxVar3;
                                    i36 = i12;
                                    i35 = -1;
                                    Unsafe unsafe10 = unsafe3;
                                    i37 = i16;
                                    unsafe6 = unsafe10;
                                } else {
                                    i10 = i16;
                                    i3 = i3;
                                    i6 = i11;
                                    unsafe2 = unsafe3;
                                    zzgvxVar2 = zzgvxVar3;
                                    i40 = i40;
                                    i5 = i12;
                                    i7 = i39;
                                    i8 = i10;
                                }
                                break;
                            case 9:
                                i34 = i2;
                                zzgvxVar3 = zzgvxVar5;
                                i17 = iZzs;
                                i18 = i47;
                                unsafe3 = unsafe6;
                                i12 = i43;
                                iZzl = i46;
                                if (i44 == 2) {
                                    i39 |= i49;
                                    Object objZzA = zzgzfVar.zzA(obj2, i17);
                                    i38 = i18;
                                    iZzm = zzgvy.zzm(objZzA, zzgzfVar.zzx(i17), bArr, iZzl, i2, zzgvxVar);
                                    zzgzfVar.zzJ(obj2, i17, objZzA);
                                    i34 = i34;
                                    unsafe6 = unsafe3;
                                    i37 = i17;
                                    zzgvxVar5 = zzgvxVar3;
                                    i40 = i40;
                                    i36 = i12;
                                    i35 = -1;
                                    iZzl = iZzm;
                                } else {
                                    i10 = i17;
                                    i11 = i18;
                                    i3 = i3;
                                    i6 = i11;
                                    unsafe2 = unsafe3;
                                    zzgvxVar2 = zzgvxVar3;
                                    i40 = i40;
                                    i5 = i12;
                                    i7 = i39;
                                    i8 = i10;
                                }
                                break;
                            case 10:
                                i34 = i2;
                                zzgvxVar3 = zzgvxVar5;
                                i17 = iZzs;
                                i18 = i47;
                                unsafe3 = unsafe6;
                                i12 = i43;
                                iZzl = i46;
                                if (i44 == 2) {
                                    i39 |= i49;
                                    iZzl = zzgvy.zza(bArr, iZzl, zzgvxVar3);
                                    unsafe3.putObject(obj2, j, zzgvxVar3.zzc);
                                    i38 = i18;
                                    i3 = i3;
                                    unsafe6 = unsafe3;
                                    i36 = i12;
                                    i35 = -1;
                                    i37 = i17;
                                    zzgvxVar5 = zzgvxVar3;
                                    i40 = i40;
                                } else {
                                    i10 = i17;
                                    i11 = i18;
                                    i3 = i3;
                                    i6 = i11;
                                    unsafe2 = unsafe3;
                                    zzgvxVar2 = zzgvxVar3;
                                    i40 = i40;
                                    i5 = i12;
                                    i7 = i39;
                                    i8 = i10;
                                }
                                break;
                            case 12:
                                i34 = i2;
                                zzgvxVar3 = zzgvxVar5;
                                i17 = iZzs;
                                i19 = i47;
                                unsafe3 = unsafe6;
                                i12 = i43;
                                iZzl = i46;
                                if (i44 == 0) {
                                    iZzl = zzgvy.zzh(bArr, iZzl, zzgvxVar3);
                                    int i56 = zzgvxVar3.zza;
                                    zzgxx zzgxxVarZzw = zzgzfVar.zzw(i17);
                                    if ((i45 & Integer.MIN_VALUE) == 0 || zzgxxVarZzw == null || zzgxxVarZzw.zza(i56)) {
                                        i20 = i19;
                                        i39 |= i49;
                                        unsafe3.putInt(obj2, j, i56);
                                    } else {
                                        i20 = i19;
                                        zzd(obj).zzj(i20, Long.valueOf(i56));
                                    }
                                    i3 = i3;
                                    i38 = i20;
                                    unsafe6 = unsafe3;
                                    i36 = i12;
                                    i35 = -1;
                                    i37 = i17;
                                    zzgvxVar5 = zzgvxVar3;
                                    i40 = i40;
                                } else {
                                    i10 = i17;
                                    i11 = i19;
                                    i3 = i3;
                                    i6 = i11;
                                    unsafe2 = unsafe3;
                                    zzgvxVar2 = zzgvxVar3;
                                    i40 = i40;
                                    i5 = i12;
                                    i7 = i39;
                                    i8 = i10;
                                }
                                break;
                            case 15:
                                i34 = i2;
                                zzgvxVar3 = zzgvxVar5;
                                i17 = iZzs;
                                i19 = i47;
                                unsafe3 = unsafe6;
                                i12 = i43;
                                iZzl = i46;
                                if (i44 == 0) {
                                    i39 |= i49;
                                    iZzl = zzgvy.zzh(bArr, iZzl, zzgvxVar3);
                                    unsafe3.putInt(obj2, j, zzgwp.zzD(zzgvxVar3.zza));
                                    i3 = i3;
                                    unsafe6 = unsafe3;
                                    i36 = i12;
                                    i38 = i19;
                                    i35 = -1;
                                    i37 = i17;
                                    zzgvxVar5 = zzgvxVar3;
                                    i40 = i40;
                                } else {
                                    i10 = i17;
                                    i11 = i19;
                                    i3 = i3;
                                    i6 = i11;
                                    unsafe2 = unsafe3;
                                    zzgvxVar2 = zzgvxVar3;
                                    i40 = i40;
                                    i5 = i12;
                                    i7 = i39;
                                    i8 = i10;
                                }
                                break;
                            case 16:
                                i19 = i47;
                                if (i44 == 0) {
                                    i39 |= i49;
                                    iZzl = zzgvy.zzk(bArr, i46, zzgvxVar5);
                                    i12 = i43;
                                    unsafe6.putLong(obj, j, zzgwp.zzF(zzgvxVar5.zzb));
                                    unsafe6 = unsafe6;
                                    i34 = i2;
                                    i3 = i3;
                                    zzgvxVar5 = zzgvxVar5;
                                    i38 = i19;
                                    i35 = -1;
                                    i37 = iZzs;
                                    i36 = i12;
                                } else {
                                    zzgvxVar3 = zzgvxVar5;
                                    i12 = i43;
                                    iZzl = i46;
                                    unsafe3 = unsafe6;
                                    i10 = iZzs;
                                    i11 = i19;
                                    i3 = i3;
                                    i6 = i11;
                                    unsafe2 = unsafe3;
                                    zzgvxVar2 = zzgvxVar3;
                                    i40 = i40;
                                    i5 = i12;
                                    i7 = i39;
                                    i8 = i10;
                                }
                                break;
                            default:
                                if (i44 == 3) {
                                    Object objZzA2 = zzgzfVar.zzA(obj2, iZzs);
                                    iZzl = zzgvy.zzl(objZzA2, zzgzfVar.zzx(iZzs), bArr, i46, i2, (i43 << 3) | 4, zzgvxVar);
                                    zzgzfVar.zzJ(obj2, iZzs, objZzA2);
                                    i39 |= i49;
                                    i34 = i2;
                                    i37 = iZzs;
                                    i36 = i43;
                                    i40 = i40;
                                    i38 = i47;
                                    i35 = -1;
                                    i3 = i3;
                                } else {
                                    zzgvxVar3 = zzgvxVar5;
                                    i10 = iZzs;
                                    i11 = i47;
                                    unsafe3 = unsafe6;
                                    i12 = i43;
                                    iZzl = i46;
                                    i3 = i3;
                                    i6 = i11;
                                    unsafe2 = unsafe3;
                                    zzgvxVar2 = zzgvxVar3;
                                    i40 = i40;
                                    i5 = i12;
                                    i7 = i39;
                                    i8 = i10;
                                }
                                break;
                        }
                    } else {
                        int i57 = i40;
                        zzgvxVar2 = zzgvxVar5;
                        Unsafe unsafe11 = unsafe6;
                        if (iZzt != 27) {
                            i7 = i39;
                            Unsafe unsafe12 = unsafe11;
                            if (iZzt <= 49) {
                                i22 = i43;
                                long j2 = i45;
                                Unsafe unsafe13 = zzb;
                                zzgyd zzgydVar = (zzgyd) unsafe13.getObject(obj2, j);
                                if (!zzgydVar.zzc()) {
                                    int size = zzgydVar.size();
                                    zzgyd zzgydVarZzf = zzgydVar.zzf(size + size);
                                    unsafe13.putObject(obj2, j, zzgydVarZzf);
                                    zzgydVar = zzgydVarZzf;
                                }
                                switch (iZzt) {
                                    case 18:
                                    case 35:
                                        i23 = i2;
                                        i24 = i47;
                                        int i58 = i22;
                                        i25 = i46;
                                        unsafe5 = unsafe12;
                                        zzgvxVar2 = zzgvxVar;
                                        i26 = iZzs;
                                        if (i44 == 2) {
                                            zzgwy zzgwyVar = (zzgwy) zzgydVar;
                                            iZzm = zzgvy.zzh(bArr, i25, zzgvxVar2);
                                            int i59 = zzgvxVar2.zza;
                                            int i60 = iZzm + i59;
                                            if (i60 > bArr.length) {
                                                throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zzgwyVar.zzi((i59 / 8) + zzgwyVar.size());
                                            while (iZzm < i60) {
                                                zzgwyVar.zzh(Double.longBitsToDouble(zzgvy.zzn(bArr, iZzm)));
                                                iZzm += 8;
                                                i58 = i58;
                                            }
                                            i22 = i58;
                                            if (iZzm != i60) {
                                                throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        } else {
                                            i22 = i58;
                                            if (i44 == 1) {
                                                iZzm = i25 + 8;
                                                zzgwy zzgwyVar2 = (zzgwy) zzgydVar;
                                                zzgwyVar2.zzh(Double.longBitsToDouble(zzgvy.zzn(bArr, i25)));
                                                while (iZzm < i23) {
                                                    int iZzh4 = zzgvy.zzh(bArr, iZzm, zzgvxVar2);
                                                    if (i24 == zzgvxVar2.zza) {
                                                        zzgwyVar2.zzh(Double.longBitsToDouble(zzgvy.zzn(bArr, iZzh4)));
                                                        iZzm = iZzh4 + 8;
                                                    }
                                                }
                                            } else {
                                                iZzm = i25;
                                            }
                                        }
                                        if (iZzm != i25) {
                                            i24 = i24;
                                            i34 = i23;
                                            zzgvxVar5 = zzgvxVar2;
                                            unsafe6 = unsafe5;
                                            i38 = i24;
                                            i40 = i57;
                                            i39 = i7;
                                            i36 = i22;
                                            i35 = -1;
                                            obj2 = obj;
                                            i37 = i26;
                                            iZzl = iZzm;
                                        } else {
                                            i24 = i24;
                                            obj2 = obj;
                                            i8 = i26;
                                            unsafe2 = unsafe5;
                                            i6 = i24;
                                            i40 = i57;
                                            i5 = i22;
                                            iZzl = iZzm;
                                        }
                                        break;
                                    case 19:
                                    case 36:
                                        i23 = i2;
                                        i24 = i47;
                                        i27 = i22;
                                        i25 = i46;
                                        unsafe5 = unsafe12;
                                        zzgvxVar2 = zzgvxVar;
                                        i26 = iZzs;
                                        if (i44 != 2) {
                                            if (i44 == 5) {
                                                iZzm = i25 + 4;
                                                zzgxi zzgxiVar = (zzgxi) zzgydVar;
                                                zzgxiVar.zzh(Float.intBitsToFloat(zzgvy.zzb(bArr, i25)));
                                                while (iZzm < i23) {
                                                    int iZzh5 = zzgvy.zzh(bArr, iZzm, zzgvxVar2);
                                                    if (i24 == zzgvxVar2.zza) {
                                                        zzgxiVar.zzh(Float.intBitsToFloat(zzgvy.zzb(bArr, iZzh5)));
                                                        iZzm = iZzh5 + 4;
                                                    }
                                                }
                                            }
                                            i22 = i27;
                                            iZzm = i25;
                                            if (iZzm != i25) {
                                                i24 = i24;
                                                i34 = i23;
                                                zzgvxVar5 = zzgvxVar2;
                                                unsafe6 = unsafe5;
                                                i38 = i24;
                                                i40 = i57;
                                                i39 = i7;
                                                i36 = i22;
                                                i35 = -1;
                                                obj2 = obj;
                                                i37 = i26;
                                                iZzl = iZzm;
                                            } else {
                                                i24 = i24;
                                                obj2 = obj;
                                                i8 = i26;
                                                unsafe2 = unsafe5;
                                                i6 = i24;
                                                i40 = i57;
                                                i5 = i22;
                                                iZzl = iZzm;
                                            }
                                        } else {
                                            zzgxi zzgxiVar2 = (zzgxi) zzgydVar;
                                            iZzm = zzgvy.zzh(bArr, i25, zzgvxVar2);
                                            int i61 = zzgvxVar2.zza;
                                            int i62 = iZzm + i61;
                                            if (i62 > bArr.length) {
                                                throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zzgxiVar2.zzi((i61 / 4) + zzgxiVar2.size());
                                            while (iZzm < i62) {
                                                zzgxiVar2.zzh(Float.intBitsToFloat(zzgvy.zzb(bArr, iZzm)));
                                                iZzm += 4;
                                            }
                                            if (iZzm != i62) {
                                                throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        }
                                        i22 = i27;
                                        if (iZzm != i25) {
                                            i24 = i24;
                                            i34 = i23;
                                            zzgvxVar5 = zzgvxVar2;
                                            unsafe6 = unsafe5;
                                            i38 = i24;
                                            i40 = i57;
                                            i39 = i7;
                                            i36 = i22;
                                            i35 = -1;
                                            obj2 = obj;
                                            i37 = i26;
                                            iZzl = iZzm;
                                        } else {
                                            i24 = i24;
                                            obj2 = obj;
                                            i8 = i26;
                                            unsafe2 = unsafe5;
                                            i6 = i24;
                                            i40 = i57;
                                            i5 = i22;
                                            iZzl = iZzm;
                                        }
                                        break;
                                    case 20:
                                    case 21:
                                    case 37:
                                    case 38:
                                        i23 = i2;
                                        i24 = i47;
                                        i27 = i22;
                                        i25 = i46;
                                        unsafe5 = unsafe12;
                                        zzgvxVar2 = zzgvxVar;
                                        i26 = iZzs;
                                        if (i44 != 2) {
                                            if (i44 == 0) {
                                                zzgyr zzgyrVar = (zzgyr) zzgydVar;
                                                iZzm = zzgvy.zzk(bArr, i25, zzgvxVar2);
                                                zzgyrVar.zzg(zzgvxVar2.zzb);
                                                while (iZzm < i23) {
                                                    int iZzh6 = zzgvy.zzh(bArr, iZzm, zzgvxVar2);
                                                    if (i24 == zzgvxVar2.zza) {
                                                        iZzm = zzgvy.zzk(bArr, iZzh6, zzgvxVar2);
                                                        zzgyrVar.zzg(zzgvxVar2.zzb);
                                                    }
                                                }
                                            }
                                            i22 = i27;
                                            iZzm = i25;
                                            if (iZzm != i25) {
                                                i24 = i24;
                                                i34 = i23;
                                                zzgvxVar5 = zzgvxVar2;
                                                unsafe6 = unsafe5;
                                                i38 = i24;
                                                i40 = i57;
                                                i39 = i7;
                                                i36 = i22;
                                                i35 = -1;
                                                obj2 = obj;
                                                i37 = i26;
                                                iZzl = iZzm;
                                            } else {
                                                i24 = i24;
                                                obj2 = obj;
                                                i8 = i26;
                                                unsafe2 = unsafe5;
                                                i6 = i24;
                                                i40 = i57;
                                                i5 = i22;
                                                iZzl = iZzm;
                                            }
                                        } else {
                                            zzgyr zzgyrVar2 = (zzgyr) zzgydVar;
                                            iZzm = zzgvy.zzh(bArr, i25, zzgvxVar2);
                                            int i63 = zzgvxVar2.zza + iZzm;
                                            while (iZzm < i63) {
                                                iZzm = zzgvy.zzk(bArr, iZzm, zzgvxVar2);
                                                zzgyrVar2.zzg(zzgvxVar2.zzb);
                                            }
                                            if (iZzm != i63) {
                                                throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        }
                                        i22 = i27;
                                        if (iZzm != i25) {
                                            i24 = i24;
                                            i34 = i23;
                                            zzgvxVar5 = zzgvxVar2;
                                            unsafe6 = unsafe5;
                                            i38 = i24;
                                            i40 = i57;
                                            i39 = i7;
                                            i36 = i22;
                                            i35 = -1;
                                            obj2 = obj;
                                            i37 = i26;
                                            iZzl = iZzm;
                                        } else {
                                            i24 = i24;
                                            obj2 = obj;
                                            i8 = i26;
                                            unsafe2 = unsafe5;
                                            i6 = i24;
                                            i40 = i57;
                                            i5 = i22;
                                            iZzl = iZzm;
                                        }
                                        break;
                                    case 22:
                                    case 29:
                                    case 39:
                                    case 43:
                                        i23 = i2;
                                        i28 = i22;
                                        unsafe5 = unsafe12;
                                        i26 = iZzs;
                                        i29 = i47;
                                        i30 = i46;
                                        zzgvxVar2 = zzgvxVar;
                                        if (i44 == 2) {
                                            iZzf = zzgvy.zzf(bArr, i30, zzgydVar, zzgvxVar2);
                                            i24 = i29;
                                            iZzm = iZzf;
                                            i25 = i30;
                                            i22 = i28;
                                        } else if (i44 == 0) {
                                            i24 = i29;
                                            i25 = i30;
                                            iZzm = zzgvy.zzj(i29, bArr, i30, i2, zzgydVar, zzgvxVar);
                                            i22 = i28;
                                        } else {
                                            i24 = i29;
                                            i25 = i30;
                                            i22 = i28;
                                            iZzm = i25;
                                        }
                                        if (iZzm != i25) {
                                            i24 = i24;
                                            i34 = i23;
                                            zzgvxVar5 = zzgvxVar2;
                                            unsafe6 = unsafe5;
                                            i38 = i24;
                                            i40 = i57;
                                            i39 = i7;
                                            i36 = i22;
                                            i35 = -1;
                                            obj2 = obj;
                                            i37 = i26;
                                            iZzl = iZzm;
                                        } else {
                                            i24 = i24;
                                            obj2 = obj;
                                            i8 = i26;
                                            unsafe2 = unsafe5;
                                            i6 = i24;
                                            i40 = i57;
                                            i5 = i22;
                                            iZzl = iZzm;
                                        }
                                        break;
                                    case 23:
                                    case 32:
                                    case 40:
                                    case 46:
                                        i23 = i2;
                                        i28 = i22;
                                        unsafe5 = unsafe12;
                                        i26 = iZzs;
                                        i29 = i47;
                                        i30 = i46;
                                        zzgvxVar2 = zzgvxVar;
                                        if (i44 != 2) {
                                            if (i44 == 1) {
                                                iZzf = i30 + 8;
                                                zzgyr zzgyrVar3 = (zzgyr) zzgydVar;
                                                zzgyrVar3.zzg(zzgvy.zzn(bArr, i30));
                                                while (iZzf < i23) {
                                                    int iZzh7 = zzgvy.zzh(bArr, iZzf, zzgvxVar2);
                                                    if (i29 != zzgvxVar2.zza) {
                                                        i24 = i29;
                                                        iZzm = iZzf;
                                                        i25 = i30;
                                                        i22 = i28;
                                                        if (iZzm != i25) {
                                                            i24 = i24;
                                                            i34 = i23;
                                                            zzgvxVar5 = zzgvxVar2;
                                                            unsafe6 = unsafe5;
                                                            i38 = i24;
                                                            i40 = i57;
                                                            i39 = i7;
                                                            i36 = i22;
                                                            i35 = -1;
                                                            obj2 = obj;
                                                            i37 = i26;
                                                            iZzl = iZzm;
                                                        } else {
                                                            i24 = i24;
                                                            obj2 = obj;
                                                            i8 = i26;
                                                            unsafe2 = unsafe5;
                                                            i6 = i24;
                                                            i40 = i57;
                                                            i5 = i22;
                                                            iZzl = iZzm;
                                                        }
                                                    } else {
                                                        zzgyrVar3.zzg(zzgvy.zzn(bArr, iZzh7));
                                                        iZzf = iZzh7 + 8;
                                                    }
                                                    break;
                                                }
                                                i24 = i29;
                                                iZzm = iZzf;
                                                i25 = i30;
                                                i22 = i28;
                                                if (iZzm != i25) {
                                                    i24 = i24;
                                                    i34 = i23;
                                                    zzgvxVar5 = zzgvxVar2;
                                                    unsafe6 = unsafe5;
                                                    i38 = i24;
                                                    i40 = i57;
                                                    i39 = i7;
                                                    i36 = i22;
                                                    i35 = -1;
                                                    obj2 = obj;
                                                    i37 = i26;
                                                    iZzl = iZzm;
                                                } else {
                                                    i24 = i24;
                                                    obj2 = obj;
                                                    i8 = i26;
                                                    unsafe2 = unsafe5;
                                                    i6 = i24;
                                                    i40 = i57;
                                                    i5 = i22;
                                                    iZzl = iZzm;
                                                }
                                            }
                                            i24 = i29;
                                            i25 = i30;
                                            i22 = i28;
                                            iZzm = i25;
                                            if (iZzm != i25) {
                                                i24 = i24;
                                                i34 = i23;
                                                zzgvxVar5 = zzgvxVar2;
                                                unsafe6 = unsafe5;
                                                i38 = i24;
                                                i40 = i57;
                                                i39 = i7;
                                                i36 = i22;
                                                i35 = -1;
                                                obj2 = obj;
                                                i37 = i26;
                                                iZzl = iZzm;
                                            } else {
                                                i24 = i24;
                                                obj2 = obj;
                                                i8 = i26;
                                                unsafe2 = unsafe5;
                                                i6 = i24;
                                                i40 = i57;
                                                i5 = i22;
                                                iZzl = iZzm;
                                            }
                                            break;
                                        } else {
                                            zzgyr zzgyrVar4 = (zzgyr) zzgydVar;
                                            iZzh = zzgvy.zzh(bArr, i30, zzgvxVar2);
                                            int i64 = zzgvxVar2.zza;
                                            int i65 = iZzh + i64;
                                            if (i65 > bArr.length) {
                                                throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zzgyrVar4.zzi((i64 / 8) + zzgyrVar4.size());
                                            while (iZzh < i65) {
                                                zzgyrVar4.zzg(zzgvy.zzn(bArr, iZzh));
                                                iZzh += 8;
                                            }
                                            if (iZzh != i65) {
                                                throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            i24 = i29;
                                            i25 = i30;
                                            iZzm = iZzh;
                                            i22 = i28;
                                            if (iZzm != i25) {
                                                i24 = i24;
                                                i34 = i23;
                                                zzgvxVar5 = zzgvxVar2;
                                                unsafe6 = unsafe5;
                                                i38 = i24;
                                                i40 = i57;
                                                i39 = i7;
                                                i36 = i22;
                                                i35 = -1;
                                                obj2 = obj;
                                                i37 = i26;
                                                iZzl = iZzm;
                                            } else {
                                                i24 = i24;
                                                obj2 = obj;
                                                i8 = i26;
                                                unsafe2 = unsafe5;
                                                i6 = i24;
                                                i40 = i57;
                                                i5 = i22;
                                                iZzl = iZzm;
                                            }
                                        }
                                        break;
                                    case 24:
                                    case 31:
                                    case 41:
                                    case 45:
                                        i23 = i2;
                                        i28 = i22;
                                        unsafe5 = unsafe12;
                                        i26 = iZzs;
                                        i29 = i47;
                                        i30 = i46;
                                        zzgvxVar2 = zzgvxVar;
                                        if (i44 != 2) {
                                            if (i44 == 5) {
                                                iZzf = i30 + 4;
                                                zzgxs zzgxsVar = (zzgxs) zzgydVar;
                                                zzgxsVar.zzi(zzgvy.zzb(bArr, i30));
                                                while (iZzf < i23) {
                                                    int iZzh8 = zzgvy.zzh(bArr, iZzf, zzgvxVar2);
                                                    if (i29 != zzgvxVar2.zza) {
                                                        i24 = i29;
                                                        iZzm = iZzf;
                                                        i25 = i30;
                                                        i22 = i28;
                                                        if (iZzm != i25) {
                                                            i24 = i24;
                                                            i34 = i23;
                                                            zzgvxVar5 = zzgvxVar2;
                                                            unsafe6 = unsafe5;
                                                            i38 = i24;
                                                            i40 = i57;
                                                            i39 = i7;
                                                            i36 = i22;
                                                            i35 = -1;
                                                            obj2 = obj;
                                                            i37 = i26;
                                                            iZzl = iZzm;
                                                        } else {
                                                            i24 = i24;
                                                            obj2 = obj;
                                                            i8 = i26;
                                                            unsafe2 = unsafe5;
                                                            i6 = i24;
                                                            i40 = i57;
                                                            i5 = i22;
                                                            iZzl = iZzm;
                                                        }
                                                    } else {
                                                        zzgxsVar.zzi(zzgvy.zzb(bArr, iZzh8));
                                                        iZzf = iZzh8 + 4;
                                                    }
                                                    break;
                                                }
                                                i24 = i29;
                                                iZzm = iZzf;
                                                i25 = i30;
                                                i22 = i28;
                                                if (iZzm != i25) {
                                                    i24 = i24;
                                                    i34 = i23;
                                                    zzgvxVar5 = zzgvxVar2;
                                                    unsafe6 = unsafe5;
                                                    i38 = i24;
                                                    i40 = i57;
                                                    i39 = i7;
                                                    i36 = i22;
                                                    i35 = -1;
                                                    obj2 = obj;
                                                    i37 = i26;
                                                    iZzl = iZzm;
                                                } else {
                                                    i24 = i24;
                                                    obj2 = obj;
                                                    i8 = i26;
                                                    unsafe2 = unsafe5;
                                                    i6 = i24;
                                                    i40 = i57;
                                                    i5 = i22;
                                                    iZzl = iZzm;
                                                }
                                            }
                                            i24 = i29;
                                            i25 = i30;
                                            i22 = i28;
                                            iZzm = i25;
                                            if (iZzm != i25) {
                                                i24 = i24;
                                                i34 = i23;
                                                zzgvxVar5 = zzgvxVar2;
                                                unsafe6 = unsafe5;
                                                i38 = i24;
                                                i40 = i57;
                                                i39 = i7;
                                                i36 = i22;
                                                i35 = -1;
                                                obj2 = obj;
                                                i37 = i26;
                                                iZzl = iZzm;
                                            } else {
                                                i24 = i24;
                                                obj2 = obj;
                                                i8 = i26;
                                                unsafe2 = unsafe5;
                                                i6 = i24;
                                                i40 = i57;
                                                i5 = i22;
                                                iZzl = iZzm;
                                            }
                                            break;
                                        } else {
                                            zzgxs zzgxsVar2 = (zzgxs) zzgydVar;
                                            iZzh = zzgvy.zzh(bArr, i30, zzgvxVar2);
                                            int i66 = zzgvxVar2.zza;
                                            int i67 = iZzh + i66;
                                            if (i67 > bArr.length) {
                                                throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            zzgxsVar2.zzj((i66 / 4) + zzgxsVar2.size());
                                            while (iZzh < i67) {
                                                zzgxsVar2.zzi(zzgvy.zzb(bArr, iZzh));
                                                iZzh += 4;
                                            }
                                            if (iZzh != i67) {
                                                throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            i24 = i29;
                                            i25 = i30;
                                            iZzm = iZzh;
                                            i22 = i28;
                                            if (iZzm != i25) {
                                                i24 = i24;
                                                i34 = i23;
                                                zzgvxVar5 = zzgvxVar2;
                                                unsafe6 = unsafe5;
                                                i38 = i24;
                                                i40 = i57;
                                                i39 = i7;
                                                i36 = i22;
                                                i35 = -1;
                                                obj2 = obj;
                                                i37 = i26;
                                                iZzl = iZzm;
                                            } else {
                                                i24 = i24;
                                                obj2 = obj;
                                                i8 = i26;
                                                unsafe2 = unsafe5;
                                                i6 = i24;
                                                i40 = i57;
                                                i5 = i22;
                                                iZzl = iZzm;
                                            }
                                        }
                                        break;
                                    case 25:
                                    case 42:
                                        i23 = i2;
                                        i28 = i22;
                                        unsafe5 = unsafe12;
                                        i26 = iZzs;
                                        i29 = i47;
                                        i30 = i46;
                                        zzgvxVar2 = zzgvxVar;
                                        if (i44 != 2) {
                                            if (i44 == 0) {
                                                zzgvz zzgvzVar = (zzgvz) zzgydVar;
                                                iZzf = zzgvy.zzk(bArr, i30, zzgvxVar2);
                                                zzgvzVar.zzg(zzgvxVar2.zzb != 0);
                                                while (iZzf < i23) {
                                                    int iZzh9 = zzgvy.zzh(bArr, iZzf, zzgvxVar2);
                                                    if (i29 != zzgvxVar2.zza) {
                                                        i24 = i29;
                                                        iZzm = iZzf;
                                                        i25 = i30;
                                                        i22 = i28;
                                                        if (iZzm != i25) {
                                                            i24 = i24;
                                                            i34 = i23;
                                                            zzgvxVar5 = zzgvxVar2;
                                                            unsafe6 = unsafe5;
                                                            i38 = i24;
                                                            i40 = i57;
                                                            i39 = i7;
                                                            i36 = i22;
                                                            i35 = -1;
                                                            obj2 = obj;
                                                            i37 = i26;
                                                            iZzl = iZzm;
                                                        } else {
                                                            i24 = i24;
                                                            obj2 = obj;
                                                            i8 = i26;
                                                            unsafe2 = unsafe5;
                                                            i6 = i24;
                                                            i40 = i57;
                                                            i5 = i22;
                                                            iZzl = iZzm;
                                                        }
                                                    } else {
                                                        iZzf = zzgvy.zzk(bArr, iZzh9, zzgvxVar2);
                                                        zzgvzVar.zzg(zzgvxVar2.zzb != 0);
                                                    }
                                                    break;
                                                }
                                                i24 = i29;
                                                iZzm = iZzf;
                                                i25 = i30;
                                                i22 = i28;
                                                if (iZzm != i25) {
                                                    i24 = i24;
                                                    i34 = i23;
                                                    zzgvxVar5 = zzgvxVar2;
                                                    unsafe6 = unsafe5;
                                                    i38 = i24;
                                                    i40 = i57;
                                                    i39 = i7;
                                                    i36 = i22;
                                                    i35 = -1;
                                                    obj2 = obj;
                                                    i37 = i26;
                                                    iZzl = iZzm;
                                                } else {
                                                    i24 = i24;
                                                    obj2 = obj;
                                                    i8 = i26;
                                                    unsafe2 = unsafe5;
                                                    i6 = i24;
                                                    i40 = i57;
                                                    i5 = i22;
                                                    iZzl = iZzm;
                                                }
                                            }
                                            i24 = i29;
                                            i25 = i30;
                                            i22 = i28;
                                            iZzm = i25;
                                            if (iZzm != i25) {
                                                i24 = i24;
                                                i34 = i23;
                                                zzgvxVar5 = zzgvxVar2;
                                                unsafe6 = unsafe5;
                                                i38 = i24;
                                                i40 = i57;
                                                i39 = i7;
                                                i36 = i22;
                                                i35 = -1;
                                                obj2 = obj;
                                                i37 = i26;
                                                iZzl = iZzm;
                                            } else {
                                                i24 = i24;
                                                obj2 = obj;
                                                i8 = i26;
                                                unsafe2 = unsafe5;
                                                i6 = i24;
                                                i40 = i57;
                                                i5 = i22;
                                                iZzl = iZzm;
                                            }
                                            break;
                                        } else {
                                            zzgvz zzgvzVar2 = (zzgvz) zzgydVar;
                                            iZzh = zzgvy.zzh(bArr, i30, zzgvxVar2);
                                            int i68 = zzgvxVar2.zza + iZzh;
                                            while (iZzh < i68) {
                                                iZzh = zzgvy.zzk(bArr, iZzh, zzgvxVar2);
                                                zzgvzVar2.zzg(zzgvxVar2.zzb != 0);
                                            }
                                            if (iZzh != i68) {
                                                throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            i24 = i29;
                                            i25 = i30;
                                            iZzm = iZzh;
                                            i22 = i28;
                                            if (iZzm != i25) {
                                                i24 = i24;
                                                i34 = i23;
                                                zzgvxVar5 = zzgvxVar2;
                                                unsafe6 = unsafe5;
                                                i38 = i24;
                                                i40 = i57;
                                                i39 = i7;
                                                i36 = i22;
                                                i35 = -1;
                                                obj2 = obj;
                                                i37 = i26;
                                                iZzl = iZzm;
                                            } else {
                                                i24 = i24;
                                                obj2 = obj;
                                                i8 = i26;
                                                unsafe2 = unsafe5;
                                                i6 = i24;
                                                i40 = i57;
                                                i5 = i22;
                                                iZzl = iZzm;
                                            }
                                        }
                                        break;
                                    case 26:
                                        i23 = i2;
                                        i28 = i22;
                                        unsafe12 = unsafe12;
                                        i26 = iZzs;
                                        i30 = i46;
                                        zzgvxVar2 = zzgvxVar;
                                        if (i44 != 2) {
                                            i24 = i47;
                                            unsafe5 = unsafe12;
                                            i25 = i30;
                                            i22 = i28;
                                            iZzm = i25;
                                        } else if ((j2 & 536870912) == 0) {
                                            int iZzh10 = zzgvy.zzh(bArr, i30, zzgvxVar2);
                                            int i69 = zzgvxVar2.zza;
                                            if (i69 < 0) {
                                                throw new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i69 == 0) {
                                                zzgydVar.add("");
                                            } else {
                                                zzgydVar.add(new String(bArr, iZzh10, i69, zzgye.zza));
                                                iZzh10 += i69;
                                            }
                                            while (iZzh10 < i23) {
                                                int iZzh11 = zzgvy.zzh(bArr, iZzh10, zzgvxVar2);
                                                if (i47 == zzgvxVar2.zza) {
                                                    iZzh10 = zzgvy.zzh(bArr, iZzh11, zzgvxVar2);
                                                    int i70 = zzgvxVar2.zza;
                                                    if (i70 < 0) {
                                                        throw new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i70 == 0) {
                                                        zzgydVar.add("");
                                                    } else {
                                                        zzgydVar.add(new String(bArr, iZzh10, i70, zzgye.zza));
                                                        iZzh10 += i70;
                                                    }
                                                } else {
                                                    i24 = i47;
                                                    unsafe5 = unsafe12;
                                                    i25 = i30;
                                                    i22 = i28;
                                                    iZzm = iZzh10;
                                                }
                                            }
                                            i24 = i47;
                                            unsafe5 = unsafe12;
                                            i25 = i30;
                                            i22 = i28;
                                            iZzm = iZzh10;
                                        } else {
                                            int iZzh12 = zzgvy.zzh(bArr, i30, zzgvxVar2);
                                            int i71 = zzgvxVar2.zza;
                                            if (i71 < 0) {
                                                throw new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i71 == 0) {
                                                zzgydVar.add("");
                                            } else {
                                                int i72 = iZzh12 + i71;
                                                if (!zzhat.zzi(bArr, iZzh12, i72)) {
                                                    throw new zzgyg("Protocol message had invalid UTF-8.");
                                                }
                                                zzgydVar.add(new String(bArr, iZzh12, i71, zzgye.zza));
                                                iZzh12 = i72;
                                            }
                                            while (iZzh12 < i23) {
                                                int iZzh13 = zzgvy.zzh(bArr, iZzh12, zzgvxVar2);
                                                if (i47 == zzgvxVar2.zza) {
                                                    iZzh12 = zzgvy.zzh(bArr, iZzh13, zzgvxVar2);
                                                    int i73 = zzgvxVar2.zza;
                                                    if (i73 < 0) {
                                                        throw new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i73 == 0) {
                                                        zzgydVar.add("");
                                                    } else {
                                                        int i74 = iZzh12 + i73;
                                                        if (!zzhat.zzi(bArr, iZzh12, i74)) {
                                                            throw new zzgyg("Protocol message had invalid UTF-8.");
                                                        }
                                                        zzgydVar.add(new String(bArr, iZzh12, i73, zzgye.zza));
                                                        iZzh12 = i74;
                                                    }
                                                } else {
                                                    i24 = i47;
                                                    i25 = i30;
                                                    i22 = i28;
                                                    iZzm = iZzh12;
                                                    unsafe5 = unsafe12;
                                                }
                                            }
                                            i24 = i47;
                                            i25 = i30;
                                            i22 = i28;
                                            iZzm = iZzh12;
                                            unsafe5 = unsafe12;
                                        }
                                        if (iZzm != i25) {
                                            i24 = i24;
                                            i34 = i23;
                                            zzgvxVar5 = zzgvxVar2;
                                            unsafe6 = unsafe5;
                                            i38 = i24;
                                            i40 = i57;
                                            i39 = i7;
                                            i36 = i22;
                                            i35 = -1;
                                            obj2 = obj;
                                            i37 = i26;
                                            iZzl = iZzm;
                                        } else {
                                            i24 = i24;
                                            obj2 = obj;
                                            i8 = i26;
                                            unsafe2 = unsafe5;
                                            i6 = i24;
                                            i40 = i57;
                                            i5 = i22;
                                            iZzl = iZzm;
                                        }
                                        break;
                                    case 27:
                                        i23 = i2;
                                        zzgvxVar4 = zzgvxVar;
                                        i31 = iZzs;
                                        i24 = i47;
                                        if (i44 == 2) {
                                            int iZze = zzgvy.zze(zzgzfVar.zzx(i31), i24, bArr, i46, i2, zzgydVar, zzgvxVar);
                                            unsafe5 = unsafe12;
                                            i25 = i46;
                                            i22 = i22;
                                            zzgvxVar2 = zzgvxVar;
                                            iZzm = iZze;
                                            i26 = i31;
                                        } else {
                                            i22 = i22;
                                            i26 = i31;
                                            i25 = i46;
                                            zzgvxVar2 = zzgvxVar4;
                                            unsafe5 = unsafe12;
                                            iZzm = i25;
                                        }
                                        if (iZzm != i25) {
                                            i24 = i24;
                                            i34 = i23;
                                            zzgvxVar5 = zzgvxVar2;
                                            unsafe6 = unsafe5;
                                            i38 = i24;
                                            i40 = i57;
                                            i39 = i7;
                                            i36 = i22;
                                            i35 = -1;
                                            obj2 = obj;
                                            i37 = i26;
                                            iZzl = iZzm;
                                        } else {
                                            i24 = i24;
                                            obj2 = obj;
                                            i8 = i26;
                                            unsafe2 = unsafe5;
                                            i6 = i24;
                                            i40 = i57;
                                            i5 = i22;
                                            iZzl = iZzm;
                                        }
                                        break;
                                    case 28:
                                        i23 = i2;
                                        zzgvxVar4 = zzgvxVar;
                                        i31 = iZzs;
                                        i24 = i47;
                                        if (i44 == 2) {
                                            iZzm = zzgvy.zzh(bArr, i46, zzgvxVar4);
                                            int i75 = zzgvxVar4.zza;
                                            if (i75 < 0) {
                                                throw new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            }
                                            if (i75 > bArr.length - iZzm) {
                                                throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                            if (i75 == 0) {
                                                zzgydVar.add(zzgwj.zzb);
                                            } else {
                                                zzgydVar.add(zzgwj.zzv(bArr, iZzm, i75));
                                                iZzm += i75;
                                            }
                                            while (iZzm < i23) {
                                                int iZzh14 = zzgvy.zzh(bArr, iZzm, zzgvxVar4);
                                                if (i24 != zzgvxVar4.zza) {
                                                    i26 = i31;
                                                    i25 = i46;
                                                    zzgvxVar2 = zzgvxVar4;
                                                    unsafe5 = unsafe12;
                                                    if (iZzm != i25) {
                                                        i24 = i24;
                                                        i34 = i23;
                                                        zzgvxVar5 = zzgvxVar2;
                                                        unsafe6 = unsafe5;
                                                        i38 = i24;
                                                        i40 = i57;
                                                        i39 = i7;
                                                        i36 = i22;
                                                        i35 = -1;
                                                        obj2 = obj;
                                                        i37 = i26;
                                                        iZzl = iZzm;
                                                    } else {
                                                        i24 = i24;
                                                        obj2 = obj;
                                                        i8 = i26;
                                                        unsafe2 = unsafe5;
                                                        i6 = i24;
                                                        i40 = i57;
                                                        i5 = i22;
                                                        iZzl = iZzm;
                                                    }
                                                    break;
                                                } else {
                                                    iZzm = zzgvy.zzh(bArr, iZzh14, zzgvxVar4);
                                                    int i76 = zzgvxVar4.zza;
                                                    if (i76 < 0) {
                                                        throw new zzgyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    }
                                                    if (i76 > bArr.length - iZzm) {
                                                        throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                    }
                                                    if (i76 == 0) {
                                                        zzgydVar.add(zzgwj.zzb);
                                                    } else {
                                                        zzgydVar.add(zzgwj.zzv(bArr, iZzm, i76));
                                                        iZzm += i76;
                                                    }
                                                }
                                            }
                                            i26 = i31;
                                            i25 = i46;
                                            zzgvxVar2 = zzgvxVar4;
                                            unsafe5 = unsafe12;
                                            if (iZzm != i25) {
                                                i24 = i24;
                                                i34 = i23;
                                                zzgvxVar5 = zzgvxVar2;
                                                unsafe6 = unsafe5;
                                                i38 = i24;
                                                i40 = i57;
                                                i39 = i7;
                                                i36 = i22;
                                                i35 = -1;
                                                obj2 = obj;
                                                i37 = i26;
                                                iZzl = iZzm;
                                            } else {
                                                i24 = i24;
                                                obj2 = obj;
                                                i8 = i26;
                                                unsafe2 = unsafe5;
                                                i6 = i24;
                                                i40 = i57;
                                                i5 = i22;
                                                iZzl = iZzm;
                                            }
                                        }
                                        i22 = i22;
                                        i26 = i31;
                                        i25 = i46;
                                        zzgvxVar2 = zzgvxVar4;
                                        unsafe5 = unsafe12;
                                        iZzm = i25;
                                        if (iZzm != i25) {
                                            i24 = i24;
                                            i34 = i23;
                                            zzgvxVar5 = zzgvxVar2;
                                            unsafe6 = unsafe5;
                                            i38 = i24;
                                            i40 = i57;
                                            i39 = i7;
                                            i36 = i22;
                                            i35 = -1;
                                            obj2 = obj;
                                            i37 = i26;
                                            iZzl = iZzm;
                                        } else {
                                            i24 = i24;
                                            obj2 = obj;
                                            i8 = i26;
                                            unsafe2 = unsafe5;
                                            i6 = i24;
                                            i40 = i57;
                                            i5 = i22;
                                            iZzl = iZzm;
                                        }
                                        break;
                                    case 30:
                                    case 44:
                                        i23 = i2;
                                        zzgvxVar4 = zzgvxVar;
                                        i31 = iZzs;
                                        i24 = i47;
                                        if (i44 != 2) {
                                            if (i44 == 0) {
                                                iZzj = zzgvy.zzj(i24, bArr, i46, i2, zzgydVar, zzgvxVar);
                                            }
                                            i22 = i22;
                                            i26 = i31;
                                            i25 = i46;
                                            zzgvxVar2 = zzgvxVar4;
                                            unsafe5 = unsafe12;
                                            iZzm = i25;
                                            if (iZzm != i25) {
                                                i24 = i24;
                                                i34 = i23;
                                                zzgvxVar5 = zzgvxVar2;
                                                unsafe6 = unsafe5;
                                                i38 = i24;
                                                i40 = i57;
                                                i39 = i7;
                                                i36 = i22;
                                                i35 = -1;
                                                obj2 = obj;
                                                i37 = i26;
                                                iZzl = iZzm;
                                            } else {
                                                i24 = i24;
                                                obj2 = obj;
                                                i8 = i26;
                                                unsafe2 = unsafe5;
                                                i6 = i24;
                                                i40 = i57;
                                                i5 = i22;
                                                iZzl = iZzm;
                                            }
                                        } else {
                                            iZzj = zzgvy.zzf(bArr, i46, zzgydVar, zzgvxVar4);
                                        }
                                        int i77 = iZzj;
                                        zzgzx.zzn(obj, i22, zzgydVar, zzgzfVar.zzw(i31), null, zzgzfVar.zzm);
                                        iZzm = i77;
                                        i26 = i31;
                                        i25 = i46;
                                        zzgvxVar2 = zzgvxVar4;
                                        unsafe5 = unsafe12;
                                        if (iZzm != i25) {
                                            i24 = i24;
                                            i34 = i23;
                                            zzgvxVar5 = zzgvxVar2;
                                            unsafe6 = unsafe5;
                                            i38 = i24;
                                            i40 = i57;
                                            i39 = i7;
                                            i36 = i22;
                                            i35 = -1;
                                            obj2 = obj;
                                            i37 = i26;
                                            iZzl = iZzm;
                                        } else {
                                            i24 = i24;
                                            obj2 = obj;
                                            i8 = i26;
                                            unsafe2 = unsafe5;
                                            i6 = i24;
                                            i40 = i57;
                                            i5 = i22;
                                            iZzl = iZzm;
                                        }
                                        break;
                                    case 33:
                                    case 47:
                                        i23 = i2;
                                        zzgvxVar4 = zzgvxVar;
                                        i31 = iZzs;
                                        i24 = i47;
                                        if (i44 != 2) {
                                            if (i44 == 0) {
                                                zzgxs zzgxsVar3 = (zzgxs) zzgydVar;
                                                iZzm = zzgvy.zzh(bArr, i46, zzgvxVar4);
                                                zzgxsVar3.zzi(zzgwp.zzD(zzgvxVar4.zza));
                                                while (iZzm < i23) {
                                                    int iZzh15 = zzgvy.zzh(bArr, iZzm, zzgvxVar4);
                                                    if (i24 == zzgvxVar4.zza) {
                                                        iZzm = zzgvy.zzh(bArr, iZzh15, zzgvxVar4);
                                                        zzgxsVar3.zzi(zzgwp.zzD(zzgvxVar4.zza));
                                                    }
                                                }
                                            }
                                            i22 = i22;
                                            i26 = i31;
                                            i25 = i46;
                                            zzgvxVar2 = zzgvxVar4;
                                            unsafe5 = unsafe12;
                                            iZzm = i25;
                                            if (iZzm != i25) {
                                                i24 = i24;
                                                i34 = i23;
                                                zzgvxVar5 = zzgvxVar2;
                                                unsafe6 = unsafe5;
                                                i38 = i24;
                                                i40 = i57;
                                                i39 = i7;
                                                i36 = i22;
                                                i35 = -1;
                                                obj2 = obj;
                                                i37 = i26;
                                                iZzl = iZzm;
                                            } else {
                                                i24 = i24;
                                                obj2 = obj;
                                                i8 = i26;
                                                unsafe2 = unsafe5;
                                                i6 = i24;
                                                i40 = i57;
                                                i5 = i22;
                                                iZzl = iZzm;
                                            }
                                        } else {
                                            zzgxs zzgxsVar4 = (zzgxs) zzgydVar;
                                            iZzm = zzgvy.zzh(bArr, i46, zzgvxVar4);
                                            int i78 = zzgvxVar4.zza + iZzm;
                                            while (iZzm < i78) {
                                                iZzm = zzgvy.zzh(bArr, iZzm, zzgvxVar4);
                                                zzgxsVar4.zzi(zzgwp.zzD(zzgvxVar4.zza));
                                            }
                                            if (iZzm != i78) {
                                                throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        }
                                        i26 = i31;
                                        i25 = i46;
                                        zzgvxVar2 = zzgvxVar4;
                                        unsafe5 = unsafe12;
                                        if (iZzm != i25) {
                                            i24 = i24;
                                            i34 = i23;
                                            zzgvxVar5 = zzgvxVar2;
                                            unsafe6 = unsafe5;
                                            i38 = i24;
                                            i40 = i57;
                                            i39 = i7;
                                            i36 = i22;
                                            i35 = -1;
                                            obj2 = obj;
                                            i37 = i26;
                                            iZzl = iZzm;
                                        } else {
                                            i24 = i24;
                                            obj2 = obj;
                                            i8 = i26;
                                            unsafe2 = unsafe5;
                                            i6 = i24;
                                            i40 = i57;
                                            i5 = i22;
                                            iZzl = iZzm;
                                        }
                                        break;
                                    case 34:
                                    case 48:
                                        i23 = i2;
                                        zzgvxVar4 = zzgvxVar;
                                        i31 = iZzs;
                                        i24 = i47;
                                        if (i44 != 2) {
                                            if (i44 == 0) {
                                                zzgyr zzgyrVar5 = (zzgyr) zzgydVar;
                                                iZzm = zzgvy.zzk(bArr, i46, zzgvxVar4);
                                                zzgyrVar5.zzg(zzgwp.zzF(zzgvxVar4.zzb));
                                                while (iZzm < i23) {
                                                    int iZzh16 = zzgvy.zzh(bArr, iZzm, zzgvxVar4);
                                                    if (i24 == zzgvxVar4.zza) {
                                                        iZzm = zzgvy.zzk(bArr, iZzh16, zzgvxVar4);
                                                        zzgyrVar5.zzg(zzgwp.zzF(zzgvxVar4.zzb));
                                                    }
                                                }
                                            }
                                            i22 = i22;
                                            i26 = i31;
                                            i25 = i46;
                                            zzgvxVar2 = zzgvxVar4;
                                            unsafe5 = unsafe12;
                                            iZzm = i25;
                                            if (iZzm != i25) {
                                                i24 = i24;
                                                i34 = i23;
                                                zzgvxVar5 = zzgvxVar2;
                                                unsafe6 = unsafe5;
                                                i38 = i24;
                                                i40 = i57;
                                                i39 = i7;
                                                i36 = i22;
                                                i35 = -1;
                                                obj2 = obj;
                                                i37 = i26;
                                                iZzl = iZzm;
                                            } else {
                                                i24 = i24;
                                                obj2 = obj;
                                                i8 = i26;
                                                unsafe2 = unsafe5;
                                                i6 = i24;
                                                i40 = i57;
                                                i5 = i22;
                                                iZzl = iZzm;
                                            }
                                        } else {
                                            zzgyr zzgyrVar6 = (zzgyr) zzgydVar;
                                            iZzm = zzgvy.zzh(bArr, i46, zzgvxVar4);
                                            int i79 = zzgvxVar4.zza + iZzm;
                                            while (iZzm < i79) {
                                                iZzm = zzgvy.zzk(bArr, iZzm, zzgvxVar4);
                                                zzgyrVar6.zzg(zzgwp.zzF(zzgvxVar4.zzb));
                                            }
                                            if (iZzm != i79) {
                                                throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                            }
                                        }
                                        i26 = i31;
                                        i25 = i46;
                                        zzgvxVar2 = zzgvxVar4;
                                        unsafe5 = unsafe12;
                                        if (iZzm != i25) {
                                            i24 = i24;
                                            i34 = i23;
                                            zzgvxVar5 = zzgvxVar2;
                                            unsafe6 = unsafe5;
                                            i38 = i24;
                                            i40 = i57;
                                            i39 = i7;
                                            i36 = i22;
                                            i35 = -1;
                                            obj2 = obj;
                                            i37 = i26;
                                            iZzl = iZzm;
                                        } else {
                                            i24 = i24;
                                            obj2 = obj;
                                            i8 = i26;
                                            unsafe2 = unsafe5;
                                            i6 = i24;
                                            i40 = i57;
                                            i5 = i22;
                                            iZzl = iZzm;
                                        }
                                        break;
                                    default:
                                        if (i44 == 3) {
                                            int i80 = (i47 & (-8)) | 4;
                                            zzgzv zzgzvVarZzx = zzgzfVar.zzx(iZzs);
                                            i31 = iZzs;
                                            i24 = i47;
                                            i23 = i2;
                                            zzgvx zzgvxVar6 = zzgvxVar;
                                            iZzm = zzgvy.zzc(zzgzvVarZzx, bArr, i46, i2, i80, zzgvxVar6);
                                            zzgydVar.add(zzgvxVar6.zzc);
                                            while (iZzm < i23) {
                                                int iZzh17 = zzgvy.zzh(bArr, iZzm, zzgvxVar6);
                                                if (i24 != zzgvxVar6.zza) {
                                                    zzgvxVar4 = zzgvxVar6;
                                                    i26 = i31;
                                                    i25 = i46;
                                                    zzgvxVar2 = zzgvxVar4;
                                                    unsafe5 = unsafe12;
                                                    if (iZzm != i25) {
                                                        i24 = i24;
                                                        i34 = i23;
                                                        zzgvxVar5 = zzgvxVar2;
                                                        unsafe6 = unsafe5;
                                                        i38 = i24;
                                                        i40 = i57;
                                                        i39 = i7;
                                                        i36 = i22;
                                                        i35 = -1;
                                                        obj2 = obj;
                                                        i37 = i26;
                                                        iZzl = iZzm;
                                                    } else {
                                                        i24 = i24;
                                                        obj2 = obj;
                                                        i8 = i26;
                                                        unsafe2 = unsafe5;
                                                        i6 = i24;
                                                        i40 = i57;
                                                        i5 = i22;
                                                        iZzl = iZzm;
                                                    }
                                                } else {
                                                    zzgzv zzgzvVar = zzgzvVarZzx;
                                                    zzgzv zzgzvVar2 = zzgzvVarZzx;
                                                    zzgvx zzgvxVar7 = zzgvxVar6;
                                                    iZzm = zzgvy.zzc(zzgzvVar, bArr, iZzh17, i2, i80, zzgvxVar);
                                                    zzgydVar.add(zzgvxVar7.zzc);
                                                    zzgvxVar6 = zzgvxVar7;
                                                    zzgzvVarZzx = zzgzvVar2;
                                                }
                                                break;
                                            }
                                            zzgvxVar4 = zzgvxVar6;
                                            i26 = i31;
                                            i25 = i46;
                                            zzgvxVar2 = zzgvxVar4;
                                            unsafe5 = unsafe12;
                                            if (iZzm != i25) {
                                                i24 = i24;
                                                i34 = i23;
                                                zzgvxVar5 = zzgvxVar2;
                                                unsafe6 = unsafe5;
                                                i38 = i24;
                                                i40 = i57;
                                                i39 = i7;
                                                i36 = i22;
                                                i35 = -1;
                                                obj2 = obj;
                                                i37 = i26;
                                                iZzl = iZzm;
                                            } else {
                                                i24 = i24;
                                                obj2 = obj;
                                                i8 = i26;
                                                unsafe2 = unsafe5;
                                                i6 = i24;
                                                i40 = i57;
                                                i5 = i22;
                                                iZzl = iZzm;
                                            }
                                        } else {
                                            i23 = i2;
                                            i24 = i47;
                                            i22 = i22;
                                            i25 = i46;
                                            unsafe5 = unsafe12;
                                            zzgvxVar2 = zzgvxVar;
                                            i26 = iZzs;
                                            iZzm = i25;
                                            if (iZzm != i25) {
                                                i24 = i24;
                                                i34 = i23;
                                                zzgvxVar5 = zzgvxVar2;
                                                unsafe6 = unsafe5;
                                                i38 = i24;
                                                i40 = i57;
                                                i39 = i7;
                                                i36 = i22;
                                                i35 = -1;
                                                obj2 = obj;
                                                i37 = i26;
                                                iZzl = iZzm;
                                            } else {
                                                i24 = i24;
                                                obj2 = obj;
                                                i8 = i26;
                                                unsafe2 = unsafe5;
                                                i6 = i24;
                                                i40 = i57;
                                                i5 = i22;
                                                iZzl = iZzm;
                                            }
                                        }
                                        break;
                                }
                            } else {
                                i22 = i43;
                                i22 = i22;
                                unsafe4 = unsafe12;
                                i21 = iZzs;
                                iZzm = i46;
                                if (iZzt != 50) {
                                    obj2 = obj;
                                    unsafe2 = unsafe4;
                                    Unsafe unsafe14 = zzb;
                                    long j3 = iArr[i21 + 2] & 1048575;
                                    switch (iZzt) {
                                        case 51:
                                            zzgvxVar2 = zzgvxVar;
                                            iZzm = iZzm;
                                            i6 = i47;
                                            i8 = i21;
                                            i5 = i22;
                                            zzgzfVar = this;
                                            if (i44 == 1) {
                                                iZzk = iZzm + 8;
                                                unsafe14.putObject(obj2, j, Double.valueOf(Double.longBitsToDouble(zzgvy.zzn(bArr, iZzm))));
                                                unsafe14.putInt(obj2, j3, i5);
                                                iZzl = iZzk;
                                            } else {
                                                iZzl = iZzm;
                                            }
                                            if (iZzl != iZzm) {
                                                i3 = i3;
                                                i36 = i5;
                                                i38 = i6;
                                                zzgvxVar5 = zzgvxVar2;
                                                i37 = i8;
                                                i40 = i57;
                                                i39 = i7;
                                                unsafe6 = unsafe2;
                                                i35 = -1;
                                                i34 = i2;
                                            } else {
                                                i3 = i3;
                                                i40 = i57;
                                            }
                                            break;
                                        case 52:
                                            zzgvxVar2 = zzgvxVar;
                                            iZzm = iZzm;
                                            i6 = i47;
                                            i8 = i21;
                                            i5 = i22;
                                            zzgzfVar = this;
                                            if (i44 == 5) {
                                                iZzk = iZzm + 4;
                                                unsafe14.putObject(obj2, j, Float.valueOf(Float.intBitsToFloat(zzgvy.zzb(bArr, iZzm))));
                                                unsafe14.putInt(obj2, j3, i5);
                                                iZzl = iZzk;
                                            } else {
                                                iZzl = iZzm;
                                            }
                                            if (iZzl != iZzm) {
                                                i3 = i3;
                                                i36 = i5;
                                                i38 = i6;
                                                zzgvxVar5 = zzgvxVar2;
                                                i37 = i8;
                                                i40 = i57;
                                                i39 = i7;
                                                unsafe6 = unsafe2;
                                                i35 = -1;
                                                i34 = i2;
                                            } else {
                                                i3 = i3;
                                                i40 = i57;
                                            }
                                            break;
                                        case 53:
                                        case 54:
                                            zzgvxVar2 = zzgvxVar;
                                            iZzm = iZzm;
                                            i6 = i47;
                                            i8 = i21;
                                            i5 = i22;
                                            zzgzfVar = this;
                                            if (i44 == 0) {
                                                iZzk = zzgvy.zzk(bArr, iZzm, zzgvxVar2);
                                                unsafe14.putObject(obj2, j, Long.valueOf(zzgvxVar2.zzb));
                                                unsafe14.putInt(obj2, j3, i5);
                                                iZzl = iZzk;
                                            } else {
                                                iZzl = iZzm;
                                            }
                                            if (iZzl != iZzm) {
                                                i3 = i3;
                                                i36 = i5;
                                                i38 = i6;
                                                zzgvxVar5 = zzgvxVar2;
                                                i37 = i8;
                                                i40 = i57;
                                                i39 = i7;
                                                unsafe6 = unsafe2;
                                                i35 = -1;
                                                i34 = i2;
                                            } else {
                                                i3 = i3;
                                                i40 = i57;
                                            }
                                            break;
                                        case 55:
                                        case Input.Keys.SPACE /* 62 */:
                                            zzgvxVar2 = zzgvxVar;
                                            iZzm = iZzm;
                                            i6 = i47;
                                            i8 = i21;
                                            i5 = i22;
                                            zzgzfVar = this;
                                            if (i44 == 0) {
                                                iZzk = zzgvy.zzh(bArr, iZzm, zzgvxVar2);
                                                unsafe14.putObject(obj2, j, Integer.valueOf(zzgvxVar2.zza));
                                                unsafe14.putInt(obj2, j3, i5);
                                                iZzl = iZzk;
                                            } else {
                                                iZzl = iZzm;
                                            }
                                            if (iZzl != iZzm) {
                                                i3 = i3;
                                                i36 = i5;
                                                i38 = i6;
                                                zzgvxVar5 = zzgvxVar2;
                                                i37 = i8;
                                                i40 = i57;
                                                i39 = i7;
                                                unsafe6 = unsafe2;
                                                i35 = -1;
                                                i34 = i2;
                                            } else {
                                                i3 = i3;
                                                i40 = i57;
                                            }
                                            break;
                                        case Input.Keys.PERIOD /* 56 */:
                                        case 65:
                                            zzgvxVar2 = zzgvxVar;
                                            iZzm = iZzm;
                                            i6 = i47;
                                            i8 = i21;
                                            i5 = i22;
                                            zzgzfVar = this;
                                            if (i44 == 1) {
                                                iZzk = iZzm + 8;
                                                unsafe14.putObject(obj2, j, Long.valueOf(zzgvy.zzn(bArr, iZzm)));
                                                unsafe14.putInt(obj2, j3, i5);
                                                iZzl = iZzk;
                                            } else {
                                                iZzl = iZzm;
                                            }
                                            if (iZzl != iZzm) {
                                                i3 = i3;
                                                i36 = i5;
                                                i38 = i6;
                                                zzgvxVar5 = zzgvxVar2;
                                                i37 = i8;
                                                i40 = i57;
                                                i39 = i7;
                                                unsafe6 = unsafe2;
                                                i35 = -1;
                                                i34 = i2;
                                            } else {
                                                i3 = i3;
                                                i40 = i57;
                                            }
                                            break;
                                        case Input.Keys.ALT_LEFT /* 57 */:
                                        case 64:
                                            zzgvxVar2 = zzgvxVar;
                                            iZzm = iZzm;
                                            i6 = i47;
                                            i8 = i21;
                                            i5 = i22;
                                            zzgzfVar = this;
                                            if (i44 == 5) {
                                                iZzk = iZzm + 4;
                                                unsafe14.putObject(obj2, j, Integer.valueOf(zzgvy.zzb(bArr, iZzm)));
                                                unsafe14.putInt(obj2, j3, i5);
                                                iZzl = iZzk;
                                            } else {
                                                iZzl = iZzm;
                                            }
                                            if (iZzl != iZzm) {
                                                i3 = i3;
                                                i36 = i5;
                                                i38 = i6;
                                                zzgvxVar5 = zzgvxVar2;
                                                i37 = i8;
                                                i40 = i57;
                                                i39 = i7;
                                                unsafe6 = unsafe2;
                                                i35 = -1;
                                                i34 = i2;
                                            } else {
                                                i3 = i3;
                                                i40 = i57;
                                            }
                                            break;
                                        case Input.Keys.ALT_RIGHT /* 58 */:
                                            zzgvxVar2 = zzgvxVar;
                                            iZzm = iZzm;
                                            i6 = i47;
                                            i8 = i21;
                                            i5 = i22;
                                            zzgzfVar = this;
                                            if (i44 == 0) {
                                                iZzk = zzgvy.zzk(bArr, iZzm, zzgvxVar2);
                                                unsafe14.putObject(obj2, j, Boolean.valueOf(zzgvxVar2.zzb != 0));
                                                unsafe14.putInt(obj2, j3, i5);
                                                iZzl = iZzk;
                                            } else {
                                                iZzl = iZzm;
                                            }
                                            if (iZzl != iZzm) {
                                                i3 = i3;
                                                i36 = i5;
                                                i38 = i6;
                                                zzgvxVar5 = zzgvxVar2;
                                                i37 = i8;
                                                i40 = i57;
                                                i39 = i7;
                                                unsafe6 = unsafe2;
                                                i35 = -1;
                                                i34 = i2;
                                            } else {
                                                i3 = i3;
                                                i40 = i57;
                                            }
                                            break;
                                        case Input.Keys.SHIFT_LEFT /* 59 */:
                                            zzgvxVar2 = zzgvxVar;
                                            iZzm = iZzm;
                                            i6 = i47;
                                            i5 = i22;
                                            zzgzfVar = this;
                                            i8 = i21;
                                            unsafe2 = unsafe2;
                                            if (i44 == 2) {
                                                iZzk = zzgvy.zzh(bArr, iZzm, zzgvxVar2);
                                                int i81 = zzgvxVar2.zza;
                                                if (i81 == 0) {
                                                    unsafe14.putObject(obj2, j, "");
                                                } else {
                                                    int i82 = iZzk + i81;
                                                    if ((i45 & 536870912) != 0 && !zzhat.zzi(bArr, iZzk, i82)) {
                                                        throw new zzgyg("Protocol message had invalid UTF-8.");
                                                    }
                                                    unsafe14.putObject(obj2, j, new String(bArr, iZzk, i81, zzgye.zza));
                                                    iZzk = i82;
                                                }
                                                unsafe14.putInt(obj2, j3, i5);
                                                iZzl = iZzk;
                                                if (iZzl != iZzm) {
                                                    i3 = i3;
                                                    i36 = i5;
                                                    i38 = i6;
                                                    zzgvxVar5 = zzgvxVar2;
                                                    i37 = i8;
                                                    i40 = i57;
                                                    i39 = i7;
                                                    unsafe6 = unsafe2;
                                                    i35 = -1;
                                                    i34 = i2;
                                                } else {
                                                    i3 = i3;
                                                    i40 = i57;
                                                }
                                            } else {
                                                unsafe2 = unsafe2;
                                                iZzl = iZzm;
                                                if (iZzl != iZzm) {
                                                    i3 = i3;
                                                    i36 = i5;
                                                    i38 = i6;
                                                    zzgvxVar5 = zzgvxVar2;
                                                    i37 = i8;
                                                    i40 = i57;
                                                    i39 = i7;
                                                    unsafe6 = unsafe2;
                                                    i35 = -1;
                                                    i34 = i2;
                                                } else {
                                                    i3 = i3;
                                                    i40 = i57;
                                                }
                                            }
                                            break;
                                        case 60:
                                            zzgzfVar = this;
                                            zzgvxVar2 = zzgvxVar;
                                            i32 = i21;
                                            i33 = i22;
                                            if (i44 == 2) {
                                                Object objZzB = zzgzfVar.zzB(obj2, i33, i32);
                                                iZzm = iZzm;
                                                i8 = i32;
                                                int iZzm2 = zzgvy.zzm(objZzB, zzgzfVar.zzx(i32), bArr, iZzm, i2, zzgvxVar);
                                                zzgzfVar.zzK(obj2, i33, i8, objZzB);
                                                iZzl = iZzm2;
                                                i6 = i47;
                                                i5 = i33;
                                            } else {
                                                iZzm = iZzm;
                                                i8 = i32;
                                                int i83 = i33;
                                                i6 = i47;
                                                i5 = i83;
                                                iZzl = iZzm;
                                            }
                                            if (iZzl != iZzm) {
                                                i3 = i3;
                                                i36 = i5;
                                                i38 = i6;
                                                zzgvxVar5 = zzgvxVar2;
                                                i37 = i8;
                                                i40 = i57;
                                                i39 = i7;
                                                unsafe6 = unsafe2;
                                                i35 = -1;
                                                i34 = i2;
                                            } else {
                                                i3 = i3;
                                                i40 = i57;
                                            }
                                            break;
                                        case Input.Keys.TAB /* 61 */:
                                            zzgvxVar2 = zzgvxVar;
                                            i32 = i21;
                                            i33 = i22;
                                            zzgzfVar = this;
                                            if (i44 == 2) {
                                                iZza = zzgvy.zza(bArr, iZzm, zzgvxVar2);
                                                unsafe14.putObject(obj2, j, zzgvxVar2.zzc);
                                                unsafe14.putInt(obj2, j3, i33);
                                                iZzl = iZza;
                                                i8 = i32;
                                                int i84 = i33;
                                                i6 = i47;
                                                i5 = i84;
                                                if (iZzl != iZzm) {
                                                    i3 = i3;
                                                    i36 = i5;
                                                    i38 = i6;
                                                    zzgvxVar5 = zzgvxVar2;
                                                    i37 = i8;
                                                    i40 = i57;
                                                    i39 = i7;
                                                    unsafe6 = unsafe2;
                                                    i35 = -1;
                                                    i34 = i2;
                                                } else {
                                                    i3 = i3;
                                                    i40 = i57;
                                                }
                                            }
                                            iZzm = iZzm;
                                            i8 = i32;
                                            int i85 = i33;
                                            i6 = i47;
                                            i5 = i85;
                                            iZzl = iZzm;
                                            if (iZzl != iZzm) {
                                                i3 = i3;
                                                i36 = i5;
                                                i38 = i6;
                                                zzgvxVar5 = zzgvxVar2;
                                                i37 = i8;
                                                i40 = i57;
                                                i39 = i7;
                                                unsafe6 = unsafe2;
                                                i35 = -1;
                                                i34 = i2;
                                            } else {
                                                i3 = i3;
                                                i40 = i57;
                                            }
                                            break;
                                        case 63:
                                            zzgvxVar2 = zzgvxVar;
                                            i32 = i21;
                                            i33 = i22;
                                            zzgzfVar = this;
                                            if (i44 == 0) {
                                                iZza = zzgvy.zzh(bArr, iZzm, zzgvxVar2);
                                                int i86 = zzgvxVar2.zza;
                                                zzgxx zzgxxVarZzw2 = zzgzfVar.zzw(i32);
                                                if (zzgxxVarZzw2 == null || zzgxxVarZzw2.zza(i86)) {
                                                    unsafe14.putObject(obj2, j, Integer.valueOf(i86));
                                                    unsafe14.putInt(obj2, j3, i33);
                                                } else {
                                                    zzd(obj).zzj(i47, Long.valueOf(i86));
                                                }
                                                iZzl = iZza;
                                                i8 = i32;
                                                int i87 = i33;
                                                i6 = i47;
                                                i5 = i87;
                                                if (iZzl != iZzm) {
                                                    i3 = i3;
                                                    i36 = i5;
                                                    i38 = i6;
                                                    zzgvxVar5 = zzgvxVar2;
                                                    i37 = i8;
                                                    i40 = i57;
                                                    i39 = i7;
                                                    unsafe6 = unsafe2;
                                                    i35 = -1;
                                                    i34 = i2;
                                                } else {
                                                    i3 = i3;
                                                    i40 = i57;
                                                }
                                            }
                                            iZzm = iZzm;
                                            i8 = i32;
                                            int i88 = i33;
                                            i6 = i47;
                                            i5 = i88;
                                            iZzl = iZzm;
                                            if (iZzl != iZzm) {
                                                i3 = i3;
                                                i36 = i5;
                                                i38 = i6;
                                                zzgvxVar5 = zzgvxVar2;
                                                i37 = i8;
                                                i40 = i57;
                                                i39 = i7;
                                                unsafe6 = unsafe2;
                                                i35 = -1;
                                                i34 = i2;
                                            } else {
                                                i3 = i3;
                                                i40 = i57;
                                            }
                                            break;
                                        case 66:
                                            zzgvxVar2 = zzgvxVar;
                                            i32 = i21;
                                            i33 = i22;
                                            zzgzfVar = this;
                                            if (i44 == 0) {
                                                iZza = zzgvy.zzh(bArr, iZzm, zzgvxVar2);
                                                unsafe14.putObject(obj2, j, Integer.valueOf(zzgwp.zzD(zzgvxVar2.zza)));
                                                unsafe14.putInt(obj2, j3, i33);
                                                iZzl = iZza;
                                                i8 = i32;
                                                int i89 = i33;
                                                i6 = i47;
                                                i5 = i89;
                                                if (iZzl != iZzm) {
                                                    i3 = i3;
                                                    i36 = i5;
                                                    i38 = i6;
                                                    zzgvxVar5 = zzgvxVar2;
                                                    i37 = i8;
                                                    i40 = i57;
                                                    i39 = i7;
                                                    unsafe6 = unsafe2;
                                                    i35 = -1;
                                                    i34 = i2;
                                                } else {
                                                    i3 = i3;
                                                    i40 = i57;
                                                }
                                            }
                                            iZzm = iZzm;
                                            i8 = i32;
                                            int i810 = i33;
                                            i6 = i47;
                                            i5 = i810;
                                            iZzl = iZzm;
                                            if (iZzl != iZzm) {
                                                i3 = i3;
                                                i36 = i5;
                                                i38 = i6;
                                                zzgvxVar5 = zzgvxVar2;
                                                i37 = i8;
                                                i40 = i57;
                                                i39 = i7;
                                                unsafe6 = unsafe2;
                                                i35 = -1;
                                                i34 = i2;
                                            } else {
                                                i3 = i3;
                                                i40 = i57;
                                            }
                                            break;
                                        case 67:
                                            zzgvxVar2 = zzgvxVar;
                                            i32 = i21;
                                            i33 = i22;
                                            zzgzfVar = this;
                                            if (i44 == 0) {
                                                iZza = zzgvy.zzk(bArr, iZzm, zzgvxVar2);
                                                unsafe14.putObject(obj2, j, Long.valueOf(zzgwp.zzF(zzgvxVar2.zzb)));
                                                unsafe14.putInt(obj2, j3, i33);
                                                iZzl = iZza;
                                                i8 = i32;
                                                int i811 = i33;
                                                i6 = i47;
                                                i5 = i811;
                                                if (iZzl != iZzm) {
                                                    i3 = i3;
                                                    i36 = i5;
                                                    i38 = i6;
                                                    zzgvxVar5 = zzgvxVar2;
                                                    i37 = i8;
                                                    i40 = i57;
                                                    i39 = i7;
                                                    unsafe6 = unsafe2;
                                                    i35 = -1;
                                                    i34 = i2;
                                                } else {
                                                    i3 = i3;
                                                    i40 = i57;
                                                }
                                            }
                                            iZzm = iZzm;
                                            i8 = i32;
                                            int i812 = i33;
                                            i6 = i47;
                                            i5 = i812;
                                            iZzl = iZzm;
                                            if (iZzl != iZzm) {
                                                i3 = i3;
                                                i36 = i5;
                                                i38 = i6;
                                                zzgvxVar5 = zzgvxVar2;
                                                i37 = i8;
                                                i40 = i57;
                                                i39 = i7;
                                                unsafe6 = unsafe2;
                                                i35 = -1;
                                                i34 = i2;
                                            } else {
                                                i3 = i3;
                                                i40 = i57;
                                            }
                                            break;
                                        case Input.Keys.GRAVE /* 68 */:
                                            if (i44 == 3) {
                                                zzgzfVar = this;
                                                i33 = i22;
                                                Object objZzB2 = zzgzfVar.zzB(obj2, i33, i21);
                                                i32 = i21;
                                                iZzl = zzgvy.zzl(objZzB2, zzgzfVar.zzx(i21), bArr, iZzm, i2, (i47 & (-8)) | 4, zzgvxVar);
                                                zzgzfVar.zzK(obj2, i33, i32, objZzB2);
                                                zzgvxVar2 = zzgvxVar;
                                                i8 = i32;
                                                int i813 = i33;
                                                i6 = i47;
                                                i5 = i813;
                                                if (iZzl != iZzm) {
                                                    i3 = i3;
                                                    i36 = i5;
                                                    i38 = i6;
                                                    zzgvxVar5 = zzgvxVar2;
                                                    i37 = i8;
                                                    i40 = i57;
                                                    i39 = i7;
                                                    unsafe6 = unsafe2;
                                                    i35 = -1;
                                                    i34 = i2;
                                                } else {
                                                    i3 = i3;
                                                    i40 = i57;
                                                }
                                                break;
                                            }
                                        default:
                                            zzgzfVar = this;
                                            zzgvxVar2 = zzgvxVar;
                                            iZzm = iZzm;
                                            i6 = i47;
                                            i8 = i21;
                                            i5 = i22;
                                            iZzl = iZzm;
                                            if (iZzl != iZzm) {
                                                i3 = i3;
                                                i36 = i5;
                                                i38 = i6;
                                                zzgvxVar5 = zzgvxVar2;
                                                i37 = i8;
                                                i40 = i57;
                                                i39 = i7;
                                                unsafe6 = unsafe2;
                                                i35 = -1;
                                                i34 = i2;
                                            } else {
                                                i3 = i3;
                                                i40 = i57;
                                            }
                                            break;
                                    }
                                } else {
                                    if (i44 == 2) {
                                        Unsafe unsafe15 = zzb;
                                        Object objZzz = zzgzfVar.zzz(i21);
                                        Object object = unsafe15.getObject(obj, j);
                                        if (zzgyx.zza(object)) {
                                            zzgyw zzgywVarZzb = zzgyw.zza().zzb();
                                            zzgyx.zzb(zzgywVarZzb, object);
                                            unsafe15.putObject(obj, j, zzgywVarZzb);
                                        }
                                        throw null;
                                    }
                                    obj2 = obj;
                                }
                            }
                        } else {
                            if (i44 == 2) {
                                zzgyd zzgydVarZzf2 = (zzgyd) unsafe11.getObject(obj2, j);
                                if (!zzgydVarZzf2.zzc()) {
                                    int size2 = zzgydVarZzf2.size();
                                    zzgydVarZzf2 = zzgydVarZzf2.zzf(size2 == 0 ? 10 : size2 + size2);
                                    unsafe11.putObject(obj2, j, zzgydVarZzf2);
                                }
                                iZzl = zzgvy.zze(zzgzfVar.zzx(iZzs), i47, bArr, i46, i2, zzgydVarZzf2, zzgvxVar);
                                i37 = iZzs;
                                i38 = i47;
                                unsafe6 = unsafe11;
                                i36 = i43;
                                i40 = i57;
                                i39 = i39;
                                i34 = i2;
                                i3 = i3;
                                zzgvxVar5 = zzgvxVar2;
                            } else {
                                i7 = i39;
                                i21 = iZzs;
                                i22 = i43;
                                unsafe4 = unsafe11;
                                iZzm = i46;
                            }
                            i35 = -1;
                        }
                        i6 = i47;
                        unsafe2 = unsafe4;
                        i8 = i21;
                        i40 = i57;
                        i5 = i22;
                        iZzl = iZzm;
                    }
                }
                if (i6 != i3 || i3 == 0) {
                    if (zzgzfVar.zzh) {
                        zzgxb zzgxbVar = zzgvxVar2.zzd;
                        int i90 = zzgxb.zzb;
                        int i91 = zzgzm.zza;
                        if (zzgxbVar == zzgxb.zza) {
                            i9 = i6;
                            iZzg = zzgvy.zzg(i9, bArr, iZzl, i2, zzd(obj), zzgvxVar);
                        } else {
                            if (zzgxbVar.zzc(zzgzfVar.zzg, i5) != null) {
                                throw null;
                            }
                            i9 = i6;
                            iZzg = zzgvy.zzg(i6, bArr, iZzl, i2, zzd(obj), zzgvxVar);
                        }
                    } else {
                        i9 = i6;
                        iZzg = zzgvy.zzg(i9, bArr, iZzl, i2, zzd(obj), zzgvxVar);
                    }
                    i34 = i2;
                    iZzl = iZzg;
                    i3 = i3;
                    zzgvxVar5 = zzgvxVar2;
                    i36 = i5;
                    i38 = i9;
                    i37 = i8;
                    i39 = i7;
                    unsafe6 = unsafe2;
                    i35 = -1;
                } else {
                    i38 = i6;
                    i39 = i7;
                    unsafe = unsafe2;
                }
            } else {
                unsafe = unsafe6;
                i3 = i3;
            }
        }
        if (i40 != 1048575) {
            unsafe.putInt(obj2, i40, i39);
        }
        for (int i92 = zzgzfVar.zzk; i92 < zzgzfVar.zzl; i92++) {
            zzy(obj, zzgzfVar.zzj[i92], null, zzgzfVar.zzm, obj);
        }
        if (i3 == 0) {
            if (iZzl != i2) {
                throw new zzgyg("Failed to parse the message.");
            }
        } else if (iZzl > i2 || i38 != i3) {
            throw new zzgyg("Failed to parse the message.");
        }
        return iZzl;
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    public final Object zze() {
        return ((zzgxr) this.zzg).zzbj();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x0082 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzgzv
    public final void zzf(Object obj) {
        if (zzQ(obj)) {
            if (obj instanceof zzgxr) {
                zzgxr zzgxrVar = (zzgxr) obj;
                zzgxrVar.zzbT();
                zzgxrVar.zzbS();
                zzgxrVar.zzbV();
            }
            int[] iArr = this.zzc;
            for (int i = 0; i < iArr.length; i += 3) {
                int iZzu = zzu(i);
                int i2 = 1048575 & iZzu;
                int iZzt = zzt(iZzu);
                long j = i2;
                if (iZzt != 9) {
                    if (iZzt != 60 && iZzt != 68) {
                        switch (iZzt) {
                            case 17:
                                if (zzN(obj, i)) {
                                    zzx(i).zzf(zzb.getObject(obj, j));
                                }
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                ((zzgyd) zzhao.zzh(obj, j)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((zzgyw) object).zzc();
                                    unsafe.putObject(obj, j, object);
                                }
                                break;
                        }
                    } else if (zzR(obj, this.zzc[i], i)) {
                        zzx(i).zzf(zzb.getObject(obj, j));
                    }
                } else if (zzN(obj, i)) {
                    zzx(i).zzf(zzb.getObject(obj, j));
                }
            }
            this.zzm.zzi(obj);
            if (this.zzh) {
                this.zzn.zza(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    public final void zzg(Object obj, Object obj2) {
        zzD(obj);
        obj2.getClass();
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzu = zzu(i);
            int i2 = 1048575 & iZzu;
            int[] iArr = this.zzc;
            int iZzt = zzt(iZzu);
            int i3 = iArr[i];
            long j = i2;
            switch (iZzt) {
                case 0:
                    if (zzN(obj2, i)) {
                        zzhao.zzr(obj, j, zzhao.zzb(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 1:
                    if (zzN(obj2, i)) {
                        zzhao.zzs(obj, j, zzhao.zzc(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 2:
                    if (zzN(obj2, i)) {
                        zzhao.zzu(obj, j, zzhao.zzf(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 3:
                    if (zzN(obj2, i)) {
                        zzhao.zzu(obj, j, zzhao.zzf(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 4:
                    if (zzN(obj2, i)) {
                        zzhao.zzt(obj, j, zzhao.zzd(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 5:
                    if (zzN(obj2, i)) {
                        zzhao.zzu(obj, j, zzhao.zzf(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 6:
                    if (zzN(obj2, i)) {
                        zzhao.zzt(obj, j, zzhao.zzd(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 7:
                    if (zzN(obj2, i)) {
                        zzhao.zzp(obj, j, zzhao.zzz(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 8:
                    if (zzN(obj2, i)) {
                        zzhao.zzv(obj, j, zzhao.zzh(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 9:
                    zzE(obj, obj2, i);
                    break;
                case 10:
                    if (zzN(obj2, i)) {
                        zzhao.zzv(obj, j, zzhao.zzh(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 11:
                    if (zzN(obj2, i)) {
                        zzhao.zzt(obj, j, zzhao.zzd(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 12:
                    if (zzN(obj2, i)) {
                        zzhao.zzt(obj, j, zzhao.zzd(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 13:
                    if (zzN(obj2, i)) {
                        zzhao.zzt(obj, j, zzhao.zzd(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 14:
                    if (zzN(obj2, i)) {
                        zzhao.zzu(obj, j, zzhao.zzf(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 15:
                    if (zzN(obj2, i)) {
                        zzhao.zzt(obj, j, zzhao.zzd(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 16:
                    if (zzN(obj2, i)) {
                        zzhao.zzu(obj, j, zzhao.zzf(obj2, j));
                        zzH(obj, i);
                    }
                    break;
                case 17:
                    zzE(obj, obj2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zzgyd zzgydVarZzf = (zzgyd) zzhao.zzh(obj, j);
                    zzgyd zzgydVar = (zzgyd) zzhao.zzh(obj2, j);
                    int size = zzgydVarZzf.size();
                    int size2 = zzgydVar.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzgydVarZzf.zzc()) {
                            zzgydVarZzf = zzgydVarZzf.zzf(size2 + size);
                        }
                        zzgydVarZzf.addAll(zzgydVar);
                    }
                    if (size > 0) {
                        zzgydVar = zzgydVarZzf;
                    }
                    zzhao.zzv(obj, j, zzgydVar);
                    break;
                case 50:
                    int i4 = zzgzx.zza;
                    zzhao.zzv(obj, j, zzgyx.zzb(zzhao.zzh(obj, j), zzhao.zzh(obj2, j)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case Input.Keys.PERIOD /* 56 */:
                case Input.Keys.ALT_LEFT /* 57 */:
                case Input.Keys.ALT_RIGHT /* 58 */:
                case Input.Keys.SHIFT_LEFT /* 59 */:
                    if (zzR(obj2, i3, i)) {
                        zzhao.zzv(obj, j, zzhao.zzh(obj2, j));
                        zzI(obj, i3, i);
                    }
                    break;
                case 60:
                    zzF(obj, obj2, i);
                    break;
                case Input.Keys.TAB /* 61 */:
                case Input.Keys.SPACE /* 62 */:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzR(obj2, i3, i)) {
                        zzhao.zzv(obj, j, zzhao.zzh(obj2, j));
                        zzI(obj, i3, i);
                    }
                    break;
                case Input.Keys.GRAVE /* 68 */:
                    zzF(obj, obj2, i);
                    break;
            }
        }
        zzgzx.zzq(this.zzm, obj, obj2);
        if (this.zzh) {
            zzgzx.zzp(this.zzn, obj, obj2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:142:0x0511 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:321:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzgzv
    public final void zzh(Object obj, zzgzp zzgzpVar, zzgxb zzgxbVar) throws IOException {
        zzgxbVar.getClass();
        zzD(obj);
        zzhah zzhahVar = this.zzm;
        Object objZza = null;
        while (true) {
            try {
                int iZzc = zzgzpVar.zzc();
                int iZzq = zzq(iZzc);
                if (iZzq >= 0) {
                    int iZzu = zzu(iZzq);
                    switch (zzt(iZzu)) {
                        case 0:
                            zzhao.zzr(obj, iZzu & 1048575, zzgzpVar.zza());
                            zzH(obj, iZzq);
                            break;
                        case 1:
                            zzhao.zzs(obj, iZzu & 1048575, zzgzpVar.zzb());
                            zzH(obj, iZzq);
                            break;
                        case 2:
                            zzhao.zzu(obj, iZzu & 1048575, zzgzpVar.zzl());
                            zzH(obj, iZzq);
                            break;
                        case 3:
                            zzhao.zzu(obj, iZzu & 1048575, zzgzpVar.zzo());
                            zzH(obj, iZzq);
                            break;
                        case 4:
                            zzhao.zzt(obj, iZzu & 1048575, zzgzpVar.zzg());
                            zzH(obj, iZzq);
                            break;
                        case 5:
                            zzhao.zzu(obj, iZzu & 1048575, zzgzpVar.zzk());
                            zzH(obj, iZzq);
                            break;
                        case 6:
                            zzhao.zzt(obj, iZzu & 1048575, zzgzpVar.zzf());
                            zzH(obj, iZzq);
                            break;
                        case 7:
                            zzhao.zzp(obj, iZzu & 1048575, zzgzpVar.zzN());
                            zzH(obj, iZzq);
                            break;
                        case 8:
                            zzG(obj, iZzu, zzgzpVar);
                            zzH(obj, iZzq);
                            break;
                        case 9:
                            zzgzc zzgzcVar = (zzgzc) zzA(obj, iZzq);
                            zzgzpVar.zzu(zzgzcVar, zzx(iZzq), zzgxbVar);
                            zzJ(obj, iZzq, zzgzcVar);
                            break;
                        case 10:
                            zzhao.zzv(obj, iZzu & 1048575, zzgzpVar.zzp());
                            zzH(obj, iZzq);
                            break;
                        case 11:
                            zzhao.zzt(obj, iZzu & 1048575, zzgzpVar.zzj());
                            zzH(obj, iZzq);
                            break;
                        case 12:
                            int iZze = zzgzpVar.zze();
                            zzgxx zzgxxVarZzw = zzw(iZzq);
                            if (zzgxxVarZzw == null || zzgxxVarZzw.zza(iZze)) {
                                zzhao.zzt(obj, iZzu & 1048575, iZze);
                                zzH(obj, iZzq);
                            } else {
                                objZza = zzgzx.zzo(obj, iZzc, iZze, objZza, zzhahVar);
                            }
                            break;
                        case 13:
                            zzhao.zzt(obj, iZzu & 1048575, zzgzpVar.zzh());
                            zzH(obj, iZzq);
                            break;
                        case 14:
                            zzhao.zzu(obj, iZzu & 1048575, zzgzpVar.zzm());
                            zzH(obj, iZzq);
                            break;
                        case 15:
                            zzhao.zzt(obj, iZzu & 1048575, zzgzpVar.zzi());
                            zzH(obj, iZzq);
                            break;
                        case 16:
                            zzhao.zzu(obj, iZzu & 1048575, zzgzpVar.zzn());
                            zzH(obj, iZzq);
                            break;
                        case 17:
                            zzgzc zzgzcVar2 = (zzgzc) zzA(obj, iZzq);
                            zzgzpVar.zzt(zzgzcVar2, zzx(iZzq), zzgxbVar);
                            zzJ(obj, iZzq, zzgzcVar2);
                            break;
                        case 18:
                            zzgzpVar.zzx(zzgyp.zza(obj, iZzu & 1048575));
                            break;
                        case 19:
                            zzgzpVar.zzB(zzgyp.zza(obj, iZzu & 1048575));
                            break;
                        case 20:
                            zzgzpVar.zzE(zzgyp.zza(obj, iZzu & 1048575));
                            break;
                        case 21:
                            zzgzpVar.zzM(zzgyp.zza(obj, iZzu & 1048575));
                            break;
                        case 22:
                            zzgzpVar.zzD(zzgyp.zza(obj, iZzu & 1048575));
                            break;
                        case 23:
                            zzgzpVar.zzA(zzgyp.zza(obj, iZzu & 1048575));
                            break;
                        case 24:
                            zzgzpVar.zzz(zzgyp.zza(obj, iZzu & 1048575));
                            break;
                        case 25:
                            zzgzpVar.zzv(zzgyp.zza(obj, iZzu & 1048575));
                            break;
                        case 26:
                            if (zzM(iZzu)) {
                                ((zzgwq) zzgzpVar).zzK(zzgyp.zza(obj, iZzu & 1048575), true);
                            } else {
                                ((zzgwq) zzgzpVar).zzK(zzgyp.zza(obj, iZzu & 1048575), false);
                            }
                            break;
                        case 27:
                            zzgzpVar.zzF(zzgyp.zza(obj, iZzu & 1048575), zzx(iZzq), zzgxbVar);
                            break;
                        case 28:
                            zzgzpVar.zzw(zzgyp.zza(obj, iZzu & 1048575));
                            break;
                        case 29:
                            zzgzpVar.zzL(zzgyp.zza(obj, iZzu & 1048575));
                            break;
                        case 30:
                            List listZza = zzgyp.zza(obj, iZzu & 1048575);
                            zzgzpVar.zzy(listZza);
                            objZza = zzgzx.zzn(obj, iZzc, listZza, zzw(iZzq), objZza, zzhahVar);
                            break;
                        case 31:
                            zzgzpVar.zzG(zzgyp.zza(obj, iZzu & 1048575));
                            break;
                        case 32:
                            zzgzpVar.zzH(zzgyp.zza(obj, iZzu & 1048575));
                            break;
                        case 33:
                            zzgzpVar.zzI(zzgyp.zza(obj, iZzu & 1048575));
                            break;
                        case 34:
                            zzgzpVar.zzJ(zzgyp.zza(obj, iZzu & 1048575));
                            break;
                        case 35:
                            zzgzpVar.zzx(zzgyp.zza(obj, iZzu & 1048575));
                            break;
                        case 36:
                            zzgzpVar.zzB(zzgyp.zza(obj, iZzu & 1048575));
                            break;
                        case 37:
                            zzgzpVar.zzE(zzgyp.zza(obj, iZzu & 1048575));
                            break;
                        case 38:
                            zzgzpVar.zzM(zzgyp.zza(obj, iZzu & 1048575));
                            break;
                        case 39:
                            zzgzpVar.zzD(zzgyp.zza(obj, iZzu & 1048575));
                            break;
                        case 40:
                            zzgzpVar.zzA(zzgyp.zza(obj, iZzu & 1048575));
                            break;
                        case 41:
                            zzgzpVar.zzz(zzgyp.zza(obj, iZzu & 1048575));
                            break;
                        case 42:
                            zzgzpVar.zzv(zzgyp.zza(obj, iZzu & 1048575));
                            break;
                        case 43:
                            zzgzpVar.zzL(zzgyp.zza(obj, iZzu & 1048575));
                            break;
                        case 44:
                            List listZza2 = zzgyp.zza(obj, iZzu & 1048575);
                            zzgzpVar.zzy(listZza2);
                            objZza = zzgzx.zzn(obj, iZzc, listZza2, zzw(iZzq), objZza, zzhahVar);
                            break;
                        case 45:
                            zzgzpVar.zzG(zzgyp.zza(obj, iZzu & 1048575));
                            break;
                        case 46:
                            zzgzpVar.zzH(zzgyp.zza(obj, iZzu & 1048575));
                            break;
                        case 47:
                            zzgzpVar.zzI(zzgyp.zza(obj, iZzu & 1048575));
                            break;
                        case 48:
                            zzgzpVar.zzJ(zzgyp.zza(obj, iZzu & 1048575));
                            break;
                        case 49:
                            zzgzpVar.zzC(zzgyp.zza(obj, iZzu & 1048575), zzx(iZzq), zzgxbVar);
                            break;
                        case 50:
                            Object objZzz = zzz(iZzq);
                            long jZzu = zzu(iZzq) & 1048575;
                            Object objZzh = zzhao.zzh(obj, jZzu);
                            if (objZzh == null) {
                                objZzh = zzgyw.zza().zzb();
                                zzhao.zzv(obj, jZzu, objZzh);
                            } else if (zzgyx.zza(objZzh)) {
                                Object objZzb = zzgyw.zza().zzb();
                                zzgyx.zzb(objZzb, objZzh);
                                zzhao.zzv(obj, jZzu, objZzb);
                                objZzh = objZzb;
                            }
                            throw null;
                        case 51:
                            zzhao.zzv(obj, iZzu & 1048575, Double.valueOf(zzgzpVar.zza()));
                            zzI(obj, iZzc, iZzq);
                            break;
                        case 52:
                            zzhao.zzv(obj, iZzu & 1048575, Float.valueOf(zzgzpVar.zzb()));
                            zzI(obj, iZzc, iZzq);
                            break;
                        case 53:
                            zzhao.zzv(obj, iZzu & 1048575, Long.valueOf(zzgzpVar.zzl()));
                            zzI(obj, iZzc, iZzq);
                            break;
                        case 54:
                            zzhao.zzv(obj, iZzu & 1048575, Long.valueOf(zzgzpVar.zzo()));
                            zzI(obj, iZzc, iZzq);
                            break;
                        case 55:
                            zzhao.zzv(obj, iZzu & 1048575, Integer.valueOf(zzgzpVar.zzg()));
                            zzI(obj, iZzc, iZzq);
                            break;
                        case Input.Keys.PERIOD /* 56 */:
                            zzhao.zzv(obj, iZzu & 1048575, Long.valueOf(zzgzpVar.zzk()));
                            zzI(obj, iZzc, iZzq);
                            break;
                        case Input.Keys.ALT_LEFT /* 57 */:
                            zzhao.zzv(obj, iZzu & 1048575, Integer.valueOf(zzgzpVar.zzf()));
                            zzI(obj, iZzc, iZzq);
                            break;
                        case Input.Keys.ALT_RIGHT /* 58 */:
                            zzhao.zzv(obj, iZzu & 1048575, Boolean.valueOf(zzgzpVar.zzN()));
                            zzI(obj, iZzc, iZzq);
                            break;
                        case Input.Keys.SHIFT_LEFT /* 59 */:
                            zzG(obj, iZzu, zzgzpVar);
                            zzI(obj, iZzc, iZzq);
                            break;
                        case 60:
                            zzgzc zzgzcVar3 = (zzgzc) zzB(obj, iZzc, iZzq);
                            zzgzpVar.zzu(zzgzcVar3, zzx(iZzq), zzgxbVar);
                            zzK(obj, iZzc, iZzq, zzgzcVar3);
                            break;
                        case Input.Keys.TAB /* 61 */:
                            zzhao.zzv(obj, iZzu & 1048575, zzgzpVar.zzp());
                            zzI(obj, iZzc, iZzq);
                            break;
                        case Input.Keys.SPACE /* 62 */:
                            zzhao.zzv(obj, iZzu & 1048575, Integer.valueOf(zzgzpVar.zzj()));
                            zzI(obj, iZzc, iZzq);
                            break;
                        case 63:
                            int iZze2 = zzgzpVar.zze();
                            zzgxx zzgxxVarZzw2 = zzw(iZzq);
                            if (zzgxxVarZzw2 == null || zzgxxVarZzw2.zza(iZze2)) {
                                zzhao.zzv(obj, iZzu & 1048575, Integer.valueOf(iZze2));
                                zzI(obj, iZzc, iZzq);
                            } else {
                                objZza = zzgzx.zzo(obj, iZzc, iZze2, objZza, zzhahVar);
                            }
                            break;
                        case 64:
                            zzhao.zzv(obj, iZzu & 1048575, Integer.valueOf(zzgzpVar.zzh()));
                            zzI(obj, iZzc, iZzq);
                            break;
                        case 65:
                            zzhao.zzv(obj, iZzu & 1048575, Long.valueOf(zzgzpVar.zzm()));
                            zzI(obj, iZzc, iZzq);
                            break;
                        case 66:
                            zzhao.zzv(obj, iZzu & 1048575, Integer.valueOf(zzgzpVar.zzi()));
                            zzI(obj, iZzc, iZzq);
                            break;
                        case 67:
                            zzhao.zzv(obj, iZzu & 1048575, Long.valueOf(zzgzpVar.zzn()));
                            zzI(obj, iZzc, iZzq);
                            break;
                        case Input.Keys.GRAVE /* 68 */:
                            zzgzc zzgzcVar4 = (zzgzc) zzB(obj, iZzc, iZzq);
                            zzgzpVar.zzt(zzgzcVar4, zzx(iZzq), zzgxbVar);
                            zzK(obj, iZzc, iZzq, zzgzcVar4);
                            break;
                        default:
                            if (objZza == null) {
                                objZza = zzhahVar.zza(obj);
                            }
                            if (!zzhahVar.zzk(objZza, zzgzpVar, 0)) {
                                for (int i = this.zzk; i < this.zzl; i++) {
                                    zzy(obj, this.zzj[i], objZza, zzhahVar, obj);
                                }
                            }
                            break;
                    }
                } else if (iZzc == Integer.MAX_VALUE) {
                    for (int i2 = this.zzk; i2 < this.zzl; i2++) {
                        zzy(obj, this.zzj[i2], objZza, zzhahVar, obj);
                    }
                } else {
                    if ((!this.zzh ? null : zzgxbVar.zzc(this.zzg, iZzc)) != null) {
                        throw null;
                    }
                    if (objZza == null) {
                        objZza = zzhahVar.zza(obj);
                    }
                    if (!zzhahVar.zzk(objZza, zzgzpVar, 0)) {
                        for (int i3 = this.zzk; i3 < this.zzl; i3++) {
                            zzy(obj, this.zzj[i3], objZza, zzhahVar, obj);
                        }
                    }
                }
            } catch (zzgyf unused) {
                if (objZza == null) {
                    objZza = zzhahVar.zza(obj);
                }
                if (!zzhahVar.zzk(objZza, zzgzpVar, 0)) {
                }
            } finally {
                for (int i4 = this.zzk; i4 < this.zzl; i4++) {
                    zzy(obj, this.zzj[i4], objZza, zzhahVar, obj);
                }
                if (objZza != null) {
                    zzhahVar.zzj(obj, objZza);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzgvx zzgvxVar) throws IOException {
        zzc(obj, bArr, i, i2, 0, zzgvxVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    @Override // com.google.android.gms.internal.ads.zzgzv
    public final void zzj(Object obj, zzhaw zzhawVar) throws IOException {
        Map.Entry entry;
        Iterator it;
        int i;
        Map.Entry entry2;
        int i2;
        if (this.zzh) {
            zzgxg zzgxgVar = ((zzgxn) obj).zza;
            if (zzgxgVar.zza.isEmpty()) {
                entry = null;
                it = null;
            } else {
                Iterator itZzf = zzgxgVar.zzf();
                entry = (Map.Entry) itZzf.next();
                it = itZzf;
            }
        } else {
            entry = null;
            it = null;
        }
        int[] iArr = this.zzc;
        Unsafe unsafe = zzb;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < iArr.length) {
            int iZzu = zzu(i5);
            int[] iArr2 = this.zzc;
            int iZzt = zzt(iZzu);
            int i6 = iArr2[i5];
            if (iZzt <= 17) {
                int i7 = iArr2[i5 + 2];
                int i8 = i7 & 1048575;
                if (i8 != i3) {
                    i4 = i8 == 1048575 ? 0 : unsafe.getInt(obj, i8);
                    i3 = i8;
                } else {
                    entry = entry;
                }
                i2 = 1 << (i7 >>> 20);
                i = i4;
                entry2 = entry;
            } else {
                i = i4;
                entry2 = entry;
                i2 = 0;
            }
            int i9 = i3;
            while (entry2 != null && ((zzgxo) entry2.getKey()).zza <= i6) {
                this.zzn.zzb(zzhawVar, entry2);
                entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            long j = iZzu & 1048575;
            switch (iZzt) {
                case 0:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i5, i9, i, i2)) {
                        zzhawVar.zzf(i6, zzhao.zzb(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 1:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i5, i9, i, i2)) {
                        zzhawVar.zzo(i6, zzhao.zzc(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 2:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i5, i9, i, i2)) {
                        zzhawVar.zzt(i6, unsafe.getLong(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 3:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i5, i9, i, i2)) {
                        zzhawVar.zzK(i6, unsafe.getLong(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 4:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i5, i9, i, i2)) {
                        zzhawVar.zzr(i6, unsafe.getInt(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 5:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i5, i9, i, i2)) {
                        zzhawVar.zzm(i6, unsafe.getLong(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 6:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i5, i9, i, i2)) {
                        zzhawVar.zzk(i6, unsafe.getInt(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 7:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i5, i9, i, i2)) {
                        zzhawVar.zzb(i6, zzhao.zzz(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 8:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i5, i9, i, i2)) {
                        zzT(i6, unsafe.getObject(obj, j), zzhawVar);
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 9:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i5, i9, i, i2)) {
                        zzhawVar.zzv(i6, unsafe.getObject(obj, j), zzx(i5));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 10:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i5, i9, i, i2)) {
                        zzhawVar.zzd(i6, (zzgwj) unsafe.getObject(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 11:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i5, i9, i, i2)) {
                        zzhawVar.zzI(i6, unsafe.getInt(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 12:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i5, i9, i, i2)) {
                        zzhawVar.zzi(i6, unsafe.getInt(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 13:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i5, i9, i, i2)) {
                        zzhawVar.zzx(i6, unsafe.getInt(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 14:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i5, i9, i, i2)) {
                        zzhawVar.zzz(i6, unsafe.getLong(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 15:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i5, i9, i, i2)) {
                        zzhawVar.zzB(i6, unsafe.getInt(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 16:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i5, i9, i, i2)) {
                        zzhawVar.zzD(i6, unsafe.getLong(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 17:
                    it = it;
                    iArr = iArr;
                    if (zzO(obj, i5, i9, i, i2)) {
                        zzhawVar.zzq(i6, unsafe.getObject(obj, j), zzx(i5));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 18:
                    zzgzx.zzt(this.zzc[i5], (List) unsafe.getObject(obj, j), zzhawVar, false);
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 19:
                    zzgzx.zzx(this.zzc[i5], (List) unsafe.getObject(obj, j), zzhawVar, false);
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 20:
                    zzgzx.zzA(this.zzc[i5], (List) unsafe.getObject(obj, j), zzhawVar, false);
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 21:
                    zzgzx.zzI(this.zzc[i5], (List) unsafe.getObject(obj, j), zzhawVar, false);
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 22:
                    zzgzx.zzz(this.zzc[i5], (List) unsafe.getObject(obj, j), zzhawVar, false);
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 23:
                    zzgzx.zzw(this.zzc[i5], (List) unsafe.getObject(obj, j), zzhawVar, false);
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 24:
                    zzgzx.zzv(this.zzc[i5], (List) unsafe.getObject(obj, j), zzhawVar, false);
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 25:
                    zzgzx.zzr(this.zzc[i5], (List) unsafe.getObject(obj, j), zzhawVar, false);
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 26:
                    zzgzx.zzG(this.zzc[i5], (List) unsafe.getObject(obj, j), zzhawVar);
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 27:
                    zzgzx.zzB(this.zzc[i5], (List) unsafe.getObject(obj, j), zzhawVar, zzx(i5));
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 28:
                    zzgzx.zzs(this.zzc[i5], (List) unsafe.getObject(obj, j), zzhawVar);
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 29:
                    zzgzx.zzH(this.zzc[i5], (List) unsafe.getObject(obj, j), zzhawVar, false);
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 30:
                    zzgzx.zzu(this.zzc[i5], (List) unsafe.getObject(obj, j), zzhawVar, false);
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 31:
                    zzgzx.zzC(this.zzc[i5], (List) unsafe.getObject(obj, j), zzhawVar, false);
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 32:
                    zzgzx.zzD(this.zzc[i5], (List) unsafe.getObject(obj, j), zzhawVar, false);
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 33:
                    zzgzx.zzE(this.zzc[i5], (List) unsafe.getObject(obj, j), zzhawVar, false);
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 34:
                    zzgzx.zzF(this.zzc[i5], (List) unsafe.getObject(obj, j), zzhawVar, false);
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 35:
                    zzgzx.zzt(this.zzc[i5], (List) unsafe.getObject(obj, j), zzhawVar, true);
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 36:
                    zzgzx.zzx(this.zzc[i5], (List) unsafe.getObject(obj, j), zzhawVar, true);
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 37:
                    zzgzx.zzA(this.zzc[i5], (List) unsafe.getObject(obj, j), zzhawVar, true);
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 38:
                    zzgzx.zzI(this.zzc[i5], (List) unsafe.getObject(obj, j), zzhawVar, true);
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 39:
                    zzgzx.zzz(this.zzc[i5], (List) unsafe.getObject(obj, j), zzhawVar, true);
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 40:
                    zzgzx.zzw(this.zzc[i5], (List) unsafe.getObject(obj, j), zzhawVar, true);
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 41:
                    zzgzx.zzv(this.zzc[i5], (List) unsafe.getObject(obj, j), zzhawVar, true);
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 42:
                    zzgzx.zzr(this.zzc[i5], (List) unsafe.getObject(obj, j), zzhawVar, true);
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 43:
                    zzgzx.zzH(this.zzc[i5], (List) unsafe.getObject(obj, j), zzhawVar, true);
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 44:
                    zzgzx.zzu(this.zzc[i5], (List) unsafe.getObject(obj, j), zzhawVar, true);
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 45:
                    zzgzx.zzC(this.zzc[i5], (List) unsafe.getObject(obj, j), zzhawVar, true);
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 46:
                    zzgzx.zzD(this.zzc[i5], (List) unsafe.getObject(obj, j), zzhawVar, true);
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 47:
                    zzgzx.zzE(this.zzc[i5], (List) unsafe.getObject(obj, j), zzhawVar, true);
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 48:
                    zzgzx.zzF(this.zzc[i5], (List) unsafe.getObject(obj, j), zzhawVar, true);
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 49:
                    zzgzx.zzy(this.zzc[i5], (List) unsafe.getObject(obj, j), zzhawVar, zzx(i5));
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        throw null;
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 51:
                    if (zzR(obj, i6, i5)) {
                        zzhawVar.zzf(i6, zzn(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 52:
                    if (zzR(obj, i6, i5)) {
                        zzhawVar.zzo(i6, zzo(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 53:
                    if (zzR(obj, i6, i5)) {
                        zzhawVar.zzt(i6, zzv(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 54:
                    if (zzR(obj, i6, i5)) {
                        zzhawVar.zzK(i6, zzv(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 55:
                    if (zzR(obj, i6, i5)) {
                        zzhawVar.zzr(i6, zzp(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case Input.Keys.PERIOD /* 56 */:
                    if (zzR(obj, i6, i5)) {
                        zzhawVar.zzm(i6, zzv(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case Input.Keys.ALT_LEFT /* 57 */:
                    if (zzR(obj, i6, i5)) {
                        zzhawVar.zzk(i6, zzp(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case Input.Keys.ALT_RIGHT /* 58 */:
                    if (zzR(obj, i6, i5)) {
                        zzhawVar.zzb(i6, zzS(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case Input.Keys.SHIFT_LEFT /* 59 */:
                    if (zzR(obj, i6, i5)) {
                        zzT(i6, unsafe.getObject(obj, j), zzhawVar);
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 60:
                    if (zzR(obj, i6, i5)) {
                        zzhawVar.zzv(i6, unsafe.getObject(obj, j), zzx(i5));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case Input.Keys.TAB /* 61 */:
                    if (zzR(obj, i6, i5)) {
                        zzhawVar.zzd(i6, (zzgwj) unsafe.getObject(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case Input.Keys.SPACE /* 62 */:
                    if (zzR(obj, i6, i5)) {
                        zzhawVar.zzI(i6, zzp(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 63:
                    if (zzR(obj, i6, i5)) {
                        zzhawVar.zzi(i6, zzp(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 64:
                    if (zzR(obj, i6, i5)) {
                        zzhawVar.zzx(i6, zzp(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 65:
                    if (zzR(obj, i6, i5)) {
                        zzhawVar.zzz(i6, zzv(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 66:
                    if (zzR(obj, i6, i5)) {
                        zzhawVar.zzB(i6, zzp(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case 67:
                    if (zzR(obj, i6, i5)) {
                        zzhawVar.zzD(i6, zzv(obj, j));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                case Input.Keys.GRAVE /* 68 */:
                    if (zzR(obj, i6, i5)) {
                        zzhawVar.zzq(i6, unsafe.getObject(obj, j), zzx(i5));
                    }
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
                default:
                    i5 += 3;
                    i3 = i9;
                    entry = entry2;
                    it = it;
                    iArr = iArr;
                    i4 = i;
                    break;
            }
        }
        Iterator it2 = it;
        while (entry != null) {
            this.zzn.zzb(zzhawVar, entry);
            entry = it2.hasNext() ? (Map.Entry) it2.next() : null;
        }
        ((zzgxr) obj).zzt.zzl(zzhawVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    public final boolean zzk(Object obj, Object obj2) {
        boolean zZzJ;
        for (int i = 0; i < this.zzc.length; i += 3) {
            int iZzu = zzu(i);
            long j = iZzu & 1048575;
            switch (zzt(iZzu)) {
                case 0:
                    if (!zzL(obj, obj2, i) || Double.doubleToLongBits(zzhao.zzb(obj, j)) != Double.doubleToLongBits(zzhao.zzb(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 1:
                    if (!zzL(obj, obj2, i) || Float.floatToIntBits(zzhao.zzc(obj, j)) != Float.floatToIntBits(zzhao.zzc(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 2:
                    if (!zzL(obj, obj2, i) || zzhao.zzf(obj, j) != zzhao.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 3:
                    if (!zzL(obj, obj2, i) || zzhao.zzf(obj, j) != zzhao.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 4:
                    if (!zzL(obj, obj2, i) || zzhao.zzd(obj, j) != zzhao.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 5:
                    if (!zzL(obj, obj2, i) || zzhao.zzf(obj, j) != zzhao.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 6:
                    if (!zzL(obj, obj2, i) || zzhao.zzd(obj, j) != zzhao.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 7:
                    if (!zzL(obj, obj2, i) || zzhao.zzz(obj, j) != zzhao.zzz(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 8:
                    if (!zzL(obj, obj2, i) || !zzgzx.zzJ(zzhao.zzh(obj, j), zzhao.zzh(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 9:
                    if (!zzL(obj, obj2, i) || !zzgzx.zzJ(zzhao.zzh(obj, j), zzhao.zzh(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 10:
                    if (!zzL(obj, obj2, i) || !zzgzx.zzJ(zzhao.zzh(obj, j), zzhao.zzh(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 11:
                    if (!zzL(obj, obj2, i) || zzhao.zzd(obj, j) != zzhao.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 12:
                    if (!zzL(obj, obj2, i) || zzhao.zzd(obj, j) != zzhao.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 13:
                    if (!zzL(obj, obj2, i) || zzhao.zzd(obj, j) != zzhao.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 14:
                    if (!zzL(obj, obj2, i) || zzhao.zzf(obj, j) != zzhao.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 15:
                    if (!zzL(obj, obj2, i) || zzhao.zzd(obj, j) != zzhao.zzd(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 16:
                    if (!zzL(obj, obj2, i) || zzhao.zzf(obj, j) != zzhao.zzf(obj2, j)) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 17:
                    if (!zzL(obj, obj2, i) || !zzgzx.zzJ(zzhao.zzh(obj, j), zzhao.zzh(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zZzJ = zzgzx.zzJ(zzhao.zzh(obj, j), zzhao.zzh(obj2, j));
                    break;
                case 50:
                    zZzJ = zzgzx.zzJ(zzhao.zzh(obj, j), zzhao.zzh(obj2, j));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case Input.Keys.PERIOD /* 56 */:
                case Input.Keys.ALT_LEFT /* 57 */:
                case Input.Keys.ALT_RIGHT /* 58 */:
                case Input.Keys.SHIFT_LEFT /* 59 */:
                case 60:
                case Input.Keys.TAB /* 61 */:
                case Input.Keys.SPACE /* 62 */:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case Input.Keys.GRAVE /* 68 */:
                    long jZzr = zzr(i) & 1048575;
                    if (zzhao.zzd(obj, jZzr) != zzhao.zzd(obj2, jZzr) || !zzgzx.zzJ(zzhao.zzh(obj, j), zzhao.zzh(obj2, j))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    continue;
                    break;
            }
            if (!zZzJ) {
                return false;
            }
        }
        if (!((zzgxr) obj).zzt.equals(((zzgxr) obj2).zzt)) {
            return false;
        }
        if (this.zzh) {
            return ((zzgxn) obj).zza.equals(((zzgxn) obj2).zza);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x009d  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c2 A[LOOP:1: B:45:0x00b1->B:50:0x00c2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00df A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzgzv
    public final boolean zzl(Object obj) {
        int i;
        int i2;
        List list;
        zzgzv zzgzvVarZzx;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.zzk) {
            int[] iArr = this.zzj;
            int[] iArr2 = this.zzc;
            int i7 = iArr[i6];
            int i8 = iArr2[i7];
            int iZzu = zzu(i7);
            int i9 = this.zzc[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                if (i10 != 1048575) {
                    i5 = zzb.getInt(obj, i10);
                }
                i2 = i5;
                i = i10;
            } else {
                i = i4;
                i2 = i5;
            }
            if ((268435456 & iZzu) != 0 && !zzO(obj, i7, i, i2, i11)) {
                return false;
            }
            int iZzt = zzt(iZzu);
            if (iZzt == 9 || iZzt == 17) {
                if (zzO(obj, i7, i, i2, i11) && !zzP(obj, iZzu, zzx(i7))) {
                    return false;
                }
            } else if (iZzt == 27) {
                list = (List) zzhao.zzh(obj, iZzu & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzgzvVarZzx = zzx(i7);
                    for (i3 = 0; i3 < list.size(); i3++) {
                        if (!zzgzvVarZzx.zzl(list.get(i3))) {
                            return false;
                        }
                    }
                }
            } else if (iZzt == 60 || iZzt == 68) {
                if (zzR(obj, i8, i7) && !zzP(obj, iZzu, zzx(i7))) {
                    return false;
                }
            } else if (iZzt == 49) {
                list = (List) zzhao.zzh(obj, iZzu & 1048575);
                if (list.isEmpty()) {
                    zzgzvVarZzx = zzx(i7);
                    while (i3 < list.size()) {
                        if (!zzgzvVarZzx.zzl(list.get(i3))) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            } else if (iZzt == 50 && !((zzgyw) zzhao.zzh(obj, iZzu & 1048575)).isEmpty()) {
                throw null;
            }
            i6++;
            i4 = i;
            i5 = i2;
        }
        return !this.zzh || ((zzgxn) obj).zza.zzi();
    }
}
