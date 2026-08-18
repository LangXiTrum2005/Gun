package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
final class zzfze extends zzfxq {
    static final zzfxq zza = new zzfze(null, new Object[0], 0);
    final transient Object[] zzb;

    @CheckForNull
    private final transient Object zzc;
    private final transient int zzd;

    private zzfze(@CheckForNull Object obj, Object[] objArr, int i) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x0185  */
    /* JADX WARN: Code duplicated, block: B:75:0x018d  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v6 */
    public static zzfze zzj(int i, Object[] objArr, zzfxp zzfxpVar) {
        short[] sArr;
        char c;
        char c2;
        Object[] objArr2;
        ?? r8;
        ?? r9;
        boolean z;
        ?? r10;
        Object[] objArr3;
        zzfxo zzfxoVar;
        int i2 = i;
        Object[] objArrCopyOf = objArr;
        byte b = -1;
        if (i2 == 0) {
            return (zzfze) zza;
        }
        zzfxo zzfxoVar2 = null;
        ?? r11 = 0;
        zzfxo zzfxoVar3 = null;
        if (i2 == 1) {
            Object obj = objArrCopyOf[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArrCopyOf[1];
            Objects.requireNonNull(obj2);
            zzfwk.zzb(obj, obj2);
            return new zzfze(null, objArrCopyOf, 1);
        }
        zzfun.zzb(i2, objArrCopyOf.length >> 1, "index");
        int iZzh = zzfxs.zzh(i);
        if (i2 != 1) {
            int i3 = iZzh - 1;
            if (iZzh <= 128) {
                byte[] bArr = new byte[iZzh];
                Arrays.fill(bArr, (byte) -1);
                int i4 = 0;
                for (int i5 = 0; i5 < i2; i5++) {
                    int i6 = i4 + i4;
                    int i7 = i5 + i5;
                    Object obj3 = objArrCopyOf[i7];
                    Objects.requireNonNull(obj3);
                    Object obj4 = objArrCopyOf[i7 ^ 1];
                    Objects.requireNonNull(obj4);
                    zzfwk.zzb(obj3, obj4);
                    int iZza = zzfxf.zza(obj3.hashCode());
                    while (true) {
                        int i8 = iZza & i3;
                        int i9 = bArr[i8] & 255;
                        if (i9 == 255) {
                            bArr[i8] = (byte) i6;
                            if (i4 < i5) {
                                objArrCopyOf[i6] = obj3;
                                objArrCopyOf[i6 ^ 1] = obj4;
                            }
                            i4++;
                            break;
                        }
                        if (obj3.equals(objArrCopyOf[i9 == true ? 1 : 0])) {
                            int i10 = ~i9;
                            Object obj5 = objArrCopyOf[i10 == true ? 1 : 0];
                            Objects.requireNonNull(obj5);
                            zzfxo zzfxoVar4 = new zzfxo(obj3, obj4, obj5);
                            objArrCopyOf[i10 == true ? 1 : 0] = obj4;
                            zzfxoVar3 = zzfxoVar4;
                            break;
                        }
                        iZza = i8 + 1;
                    }
                }
                if (i4 == i2) {
                    r11 = bArr;
                } else {
                    c2 = 2;
                    objArr2 = new Object[]{bArr, Integer.valueOf(i4), zzfxoVar3};
                    r8 = objArr2;
                    c = 0;
                    r9 = r8;
                }
            } else {
                if (iZzh <= 32768) {
                    sArr = new short[iZzh];
                    Arrays.fill(sArr, (short) -1);
                    int i11 = 0;
                    for (int i12 = 0; i12 < i2; i12++) {
                        int i13 = i11 + i11;
                        int i14 = i12 + i12;
                        Object obj6 = objArrCopyOf[i14];
                        Objects.requireNonNull(obj6);
                        Object obj7 = objArrCopyOf[i14 ^ 1];
                        Objects.requireNonNull(obj7);
                        zzfwk.zzb(obj6, obj7);
                        int iZza2 = zzfxf.zza(obj6.hashCode());
                        while (true) {
                            int i15 = iZza2 & i3;
                            char c3 = (char) sArr[i15];
                            if (c3 == 65535) {
                                sArr[i15] = (short) i13;
                                if (i11 < i12) {
                                    objArrCopyOf[i13] = obj6;
                                    objArrCopyOf[i13 ^ 1] = obj7;
                                }
                                i11++;
                                break;
                            }
                            if (obj6.equals(objArrCopyOf[c3])) {
                                int i16 = c3 ^ 1;
                                Object obj8 = objArrCopyOf[i16 == true ? 1 : 0];
                                Objects.requireNonNull(obj8);
                                zzfxo zzfxoVar5 = new zzfxo(obj6, obj7, obj8);
                                objArrCopyOf[i16 == true ? 1 : 0] = obj7;
                                zzfxoVar2 = zzfxoVar5;
                                break;
                            }
                            iZza2 = i15 + 1;
                        }
                    }
                    if (i11 != i2) {
                        c2 = 2;
                        objArr2 = new Object[]{sArr, Integer.valueOf(i11), zzfxoVar2};
                        r8 = objArr2;
                        c = 0;
                        r9 = r8;
                    }
                } else {
                    sArr = new int[iZzh];
                    Arrays.fill((int[]) sArr, -1);
                    zzfxo zzfxoVar6 = null;
                    int i17 = 0;
                    int i18 = 0;
                    while (i17 < i2) {
                        int i19 = i18 + i18;
                        int i20 = i17 + i17;
                        Object obj9 = objArrCopyOf[i20];
                        Objects.requireNonNull(obj9);
                        Object obj10 = objArrCopyOf[i20 ^ 1];
                        Objects.requireNonNull(obj10);
                        zzfwk.zzb(obj9, obj10);
                        int iZza3 = zzfxf.zza(obj9.hashCode());
                        while (true) {
                            int i21 = iZza3 & i3;
                            ?? r15 = sArr[i21];
                            if (r15 == b) {
                                sArr[i21] = i19;
                                if (i18 < i17) {
                                    objArrCopyOf[i19] = obj9;
                                    objArrCopyOf[i19 ^ 1] = obj10;
                                }
                                i18++;
                                break;
                            }
                            if (obj9.equals(objArrCopyOf[r15])) {
                                int i22 = r15 ^ 1;
                                Object obj11 = objArrCopyOf[i22 == true ? 1 : 0];
                                Objects.requireNonNull(obj11);
                                zzfxoVar6 = new zzfxo(obj9, obj10, obj11);
                                objArrCopyOf[i22 == true ? 1 : 0] = obj10;
                                break;
                            }
                            iZza3 = i21 + 1;
                            b = -1;
                        }
                        i17++;
                        b = -1;
                    }
                    if (i18 != i2) {
                        c = 0;
                        c2 = 2;
                        r9 = new Object[]{sArr, Integer.valueOf(i18), zzfxoVar6};
                    }
                }
                r11 = sArr;
            }
            z = r9 instanceof Object[];
            r10 = r9;
            if (z) {
                objArr3 = (Object[]) r9;
                zzfxoVar = (zzfxo) objArr3[c2];
                if (zzfxpVar != null) {
                    throw zzfxoVar.zza();
                }
                zzfxpVar.zzc = zzfxoVar;
                Object obj12 = objArr3[c];
                int iIntValue = ((Integer) objArr3[1]).intValue();
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
                r10 = obj12;
                i2 = iIntValue;
            }
            return new zzfze(r10, objArrCopyOf, i2);
        }
        Object obj13 = objArrCopyOf[0];
        Objects.requireNonNull(obj13);
        Object obj14 = objArrCopyOf[1];
        Objects.requireNonNull(obj14);
        zzfwk.zzb(obj13, obj14);
        i2 = 1;
        c2 = 2;
        r8 = r11;
        c = 0;
        r9 = r8;
        z = r9 instanceof Object[];
        r10 = r9;
        if (z) {
            objArr3 = (Object[]) r9;
            zzfxoVar = (zzfxo) objArr3[c2];
            if (zzfxpVar != null) {
                throw zzfxoVar.zza();
            }
            zzfxpVar.zzc = zzfxoVar;
            Object obj15 = objArr3[c];
            int iIntValue2 = ((Integer) objArr3[1]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue2 + iIntValue2);
            r10 = obj15;
            i2 = iIntValue2;
        }
        return new zzfze(r10, objArrCopyOf, i2);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // com.google.android.gms.internal.ads.zzfxq, java.util.Map
    @CheckForNull
    public final Object get(@CheckForNull Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            int i = this.zzd;
            Object[] objArr = this.zzb;
            if (i == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                } else {
                    obj2 = null;
                }
            } else {
                Object obj4 = this.zzc;
                if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length - 1;
                    int iZza = zzfxf.zza(obj.hashCode());
                    while (true) {
                        int i2 = iZza & length;
                        int i3 = bArr[i2] & 255;
                        if (i3 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i3])) {
                            obj2 = objArr[i3 ^ 1];
                        } else {
                            iZza = i2 + 1;
                        }
                    }
                    obj2 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length - 1;
                    int iZza2 = zzfxf.zza(obj.hashCode());
                    while (true) {
                        int i4 = iZza2 & length2;
                        char c = (char) sArr[i4];
                        if (c == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[c])) {
                            obj2 = objArr[c ^ 1];
                        } else {
                            iZza2 = i4 + 1;
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length - 1;
                    int iZza3 = zzfxf.zza(obj.hashCode());
                    while (true) {
                        int i5 = iZza3 & length3;
                        int i6 = iArr[i5];
                        if (i6 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i6])) {
                            obj2 = objArr[i6 ^ 1];
                        } else {
                            iZza3 = i5 + 1;
                        }
                    }
                    obj2 = null;
                }
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfxq
    public final zzfxi zza() {
        return new zzfzd(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzfxq
    public final zzfxs zzf() {
        return new zzfzb(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzfxq
    public final zzfxs zzg() {
        return new zzfzc(this, new zzfzd(this.zzb, 0, this.zzd));
    }
}
