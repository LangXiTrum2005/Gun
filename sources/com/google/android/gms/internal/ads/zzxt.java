package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class zzxt extends zzxy implements zzll {
    public static final /* synthetic */ int zzb = 0;
    private static final zzfyy zzc = zzfyy.zzb(new Comparator() { // from class: com.google.android.gms.internal.ads.zzwt
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Integer num = (Integer) obj;
            Integer num2 = (Integer) obj2;
            int i = zzxt.zzb;
            if (num.intValue() == -1) {
                return num2.intValue() == -1 ? 0 : -1;
            }
            if (num2.intValue() == -1) {
                return 1;
            }
            return num.intValue() - num2.intValue();
        }
    });

    @Nullable
    public final Context zza;
    private final Object zzd;
    private final boolean zze;

    @GuardedBy("lock")
    private zzxh zzf;

    @Nullable
    @GuardedBy("lock")
    private zzxl zzg;

    @GuardedBy("lock")
    private zze zzh;
    private final zzwp zzi;

    public zzxt(Context context) {
        zzwp zzwpVar = new zzwp();
        zzxh zzxhVarZzd = zzxh.zzd(context);
        this.zzd = new Object();
        this.zza = context != null ? context.getApplicationContext() : null;
        this.zzi = zzwpVar;
        this.zzf = zzxhVarZzd;
        this.zzh = zze.zza;
        boolean z = false;
        if (context != null && zzei.zzM(context)) {
            z = true;
        }
        this.zze = z;
        if (!z && context != null && zzei.zza >= 32) {
            this.zzg = zzxl.zza(context);
        }
        if (this.zzf.zzN && context == null) {
            zzdo.zzf("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static /* bridge */ /* synthetic */ int zzb(int i, int i2) {
        if (i == 0 || i != i2) {
            return Integer.bitCount(i & i2);
        }
        return Integer.MAX_VALUE;
    }

    public static int zzc(zzab zzabVar, @Nullable String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(zzabVar.zzd)) {
            return 4;
        }
        String strZzh = zzh(str);
        String strZzh2 = zzh(zzabVar.zzd);
        if (strZzh2 == null || strZzh == null) {
            return (z && strZzh2 == null) ? 1 : 0;
        }
        if (strZzh2.startsWith(strZzh) || strZzh.startsWith(strZzh2)) {
            return 3;
        }
        int i = zzei.zza;
        return strZzh2.split("-", 2)[0].equals(strZzh.split("-", 2)[0]) ? 2 : 0;
    }

    @Nullable
    public static String zzh(@Nullable String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, C.LANGUAGE_UNDETERMINED)) {
            return null;
        }
        return str;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static /* synthetic */ boolean zzm(zzxt zzxtVar, zzab zzabVar) {
        boolean z;
        zzxl zzxlVar;
        zzxl zzxlVar2;
        synchronized (zzxtVar.zzd) {
            try {
                z = true;
                if (zzxtVar.zzf.zzN && !zzxtVar.zze) {
                    int i = zzabVar.zzD;
                    byte b = -1;
                    if (i != -1 && i > 2) {
                        String str = zzabVar.zzo;
                        if (str != null) {
                            switch (str.hashCode()) {
                                case -2123537834:
                                    if (str.equals(MimeTypes.AUDIO_E_AC3_JOC)) {
                                        b = 2;
                                    }
                                    break;
                                case 187078296:
                                    if (str.equals(MimeTypes.AUDIO_AC3)) {
                                        b = 0;
                                    }
                                    break;
                                case 187078297:
                                    if (str.equals("audio/ac4")) {
                                        b = 3;
                                    }
                                    break;
                                case 1504578661:
                                    if (str.equals(MimeTypes.AUDIO_E_AC3)) {
                                        b = 1;
                                    }
                                    break;
                            }
                            if ((b != 0 && b != 1 && b != 2 && b != 3) || (zzei.zza >= 32 && (zzxlVar = zzxtVar.zzg) != null && zzxlVar.zzg())) {
                            }
                        }
                        if (zzei.zza < 32 || (zzxlVar2 = zzxtVar.zzg) == null || !zzxlVar2.zzg() || !zzxlVar2.zze() || !zzxtVar.zzg.zzf() || !zzxtVar.zzg.zzd(zzxtVar.zzh, zzabVar)) {
                            z = false;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    private static void zzt(zzwj zzwjVar, zzbw zzbwVar, Map map) {
        for (int i = 0; i < zzwjVar.zzb; i++) {
            if (((zzbs) zzbwVar.zzB.get(zzwjVar.zzb(i))) != null) {
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzu() {
        boolean z;
        zzxl zzxlVar;
        synchronized (this.zzd) {
            try {
                z = false;
                if (this.zzf.zzN && !this.zze && zzei.zza >= 32 && (zzxlVar = this.zzg) != null && zzxlVar.zzg()) {
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            zzs();
        }
    }

    @Nullable
    private static final Pair zzv(int i, zzxx zzxxVar, int[][][] iArr, zzxn zzxnVar, Comparator comparator) {
        RandomAccess randomAccessZzo;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 2; i2++) {
            if (i == zzxxVar.zzc(i2)) {
                zzwj zzwjVarZzd = zzxxVar.zzd(i2);
                for (int i3 = 0; i3 < zzwjVarZzd.zzb; i3++) {
                    zzbr zzbrVarZzb = zzwjVarZzd.zzb(i3);
                    List listZza = zzxnVar.zza(i2, zzbrVarZzb, iArr[i2][i3]);
                    boolean[] zArr = new boolean[zzbrVarZzb.zza];
                    int i4 = 0;
                    while (i4 < zzbrVarZzb.zza) {
                        int i5 = i4 + 1;
                        zzxo zzxoVar = (zzxo) listZza.get(i4);
                        int iZzb = zzxoVar.zzb();
                        if (!zArr[i4] && iZzb != 0) {
                            if (iZzb == 1) {
                                randomAccessZzo = zzfxn.zzo(zzxoVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(zzxoVar);
                                for (int i6 = i5; i6 < zzbrVarZzb.zza; i6++) {
                                    zzxo zzxoVar2 = (zzxo) listZza.get(i6);
                                    if (zzxoVar2.zzb() == 2 && zzxoVar.zzc(zzxoVar2)) {
                                        arrayList2.add(zzxoVar2);
                                        zArr[i6] = true;
                                    }
                                }
                                randomAccessZzo = arrayList2;
                            }
                            arrayList.add(randomAccessZzo);
                        }
                        i4 = i5;
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i7 = 0; i7 < list.size(); i7++) {
            iArr2[i7] = ((zzxo) list.get(i7)).zzc;
        }
        zzxo zzxoVar3 = (zzxo) list.get(0);
        return Pair.create(new zzxu(zzxoVar3.zzb, iArr2, 0), Integer.valueOf(zzxoVar3.zza));
    }

    @Override // com.google.android.gms.internal.ads.zzll
    public final void zza(zzlj zzljVar) {
        synchronized (this.zzd) {
            boolean z = this.zzf.zzR;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxy
    public final Pair zzd(zzxx zzxxVar, int[][][] iArr, final int[] iArr2, zzug zzugVar, zzbq zzbqVar) throws zzib {
        final zzxh zzxhVar;
        int i;
        final boolean z;
        final String str;
        int[] iArr3;
        int length;
        zzxl zzxlVar;
        synchronized (this.zzd) {
            try {
                zzxhVar = this.zzf;
                if (zzxhVar.zzN && zzei.zza >= 32 && (zzxlVar = this.zzg) != null) {
                    Looper looperMyLooper = Looper.myLooper();
                    zzcw.zzb(looperMyLooper);
                    zzxlVar.zzb(this, looperMyLooper);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int i2 = 2;
        zzxu[] zzxuVarArr = new zzxu[2];
        int i3 = 0;
        while (true) {
            i = 1;
            if (i3 >= 2) {
                z = false;
                break;
            }
            if (zzxxVar.zzc(i3) == 2 && zzxxVar.zzd(i3).zzb > 0) {
                z = true;
                break;
            }
            i3++;
        }
        Pair pairZzv = zzv(1, zzxxVar, iArr, new zzxn() { // from class: com.google.android.gms.internal.ads.zzwy
            @Override // com.google.android.gms.internal.ads.zzxn
            public final List zza(int i4, zzbr zzbrVar, int[] iArr4) {
                final zzxt zzxtVar = this.zza;
                zzfuo zzfuoVar = new zzfuo() { // from class: com.google.android.gms.internal.ads.zzxa
                    @Override // com.google.android.gms.internal.ads.zzfuo
                    public final boolean zza(Object obj) {
                        return zzxt.zzm(zzxtVar, (zzab) obj);
                    }
                };
                int i5 = iArr2[i4];
                zzfxk zzfxkVar = new zzfxk();
                for (int i6 = 0; i6 < zzbrVar.zza; i6++) {
                    int i7 = i6;
                    zzfxkVar.zzf(new zzxd(i4, zzbrVar, i7, zzxhVar, iArr4[i6], z, zzfuoVar, i5));
                }
                return zzfxkVar.zzi();
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzwz
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((zzxd) Collections.max((List) obj)).zza((zzxd) Collections.max((List) obj2));
            }
        });
        if (pairZzv != null) {
            zzxuVarArr[((Integer) pairZzv.second).intValue()] = (zzxu) pairZzv.first;
        }
        if (pairZzv == null) {
            str = null;
        } else {
            Object obj = pairZzv.first;
            str = ((zzxu) obj).zza.zzb(((zzxu) obj).zzb[0]).zzd;
        }
        Pair pairZzv2 = zzv(2, zzxxVar, iArr, new zzxn() { // from class: com.google.android.gms.internal.ads.zzww
            /* JADX WARN: Code duplicated, block: B:22:0x0043  */
            @Override // com.google.android.gms.internal.ads.zzxn
            public final List zza(int i4, zzbr zzbrVar, int[] iArr4) {
                int i5;
                int i6;
                int i7;
                int i8;
                Point point;
                zzww zzwwVar = this;
                int i9 = zzxt.zzb;
                zzxh zzxhVar2 = zzxhVar;
                int i10 = iArr2[i4];
                int i11 = zzxhVar2.zzi;
                int i12 = zzxhVar2.zzj;
                boolean z2 = zzxhVar2.zzk;
                if (i11 == Integer.MAX_VALUE || i12 == Integer.MAX_VALUE) {
                    i5 = Integer.MAX_VALUE;
                } else {
                    int i13 = Integer.MAX_VALUE;
                    for (int i14 = 0; i14 < zzbrVar.zza; i14++) {
                        zzab zzabVarZzb = zzbrVar.zzb(i14);
                        int i15 = zzabVarZzb.zzv;
                        if (i15 > 0 && (i6 = zzabVarZzb.zzw) > 0) {
                            if (!z2) {
                                i7 = i11;
                                i8 = i12;
                            } else if ((i15 > i6) != (i11 > i12)) {
                                i8 = i11;
                                i7 = i12;
                            } else {
                                i7 = i11;
                                i8 = i12;
                            }
                            int i16 = i15 * i8;
                            int i17 = i6 * i7;
                            if (i16 >= i17) {
                                int i18 = zzei.zza;
                                point = new Point(i7, ((i17 + i15) - 1) / i15);
                            } else {
                                int i19 = zzei.zza;
                                point = new Point(((i16 + i6) - 1) / i6, i8);
                            }
                            int i20 = zzabVarZzb.zzv;
                            int i21 = zzabVarZzb.zzw;
                            int i22 = i20 * i21;
                            if (i20 >= ((int) (point.x * 0.98f)) && i21 >= ((int) (point.y * 0.98f)) && i22 < i13) {
                                i13 = i22;
                            }
                        }
                    }
                    i5 = i13;
                }
                zzfxk zzfxkVar = new zzfxk();
                int i23 = 0;
                while (i23 < zzbrVar.zza) {
                    int iZza = zzbrVar.zzb(i23).zza();
                    zzfxkVar.zzf(new zzxr(i4, zzbrVar, i23, zzxhVar2, iArr4[i23], str, i10, i5 == Integer.MAX_VALUE || (iZza != -1 && iZza <= i5)));
                    i23++;
                    zzwwVar = this;
                }
                return zzfxkVar.zzi();
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzwx
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                List list = (List) obj2;
                List list2 = (List) obj3;
                return zzfxc.zzj().zzc((zzxr) Collections.max(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzxp
                    @Override // java.util.Comparator
                    public final int compare(Object obj4, Object obj5) {
                        return zzxr.zzd((zzxr) obj4, (zzxr) obj5);
                    }
                }), (zzxr) Collections.max(list2, new Comparator() { // from class: com.google.android.gms.internal.ads.zzxp
                    @Override // java.util.Comparator
                    public final int compare(Object obj4, Object obj5) {
                        return zzxr.zzd((zzxr) obj4, (zzxr) obj5);
                    }
                }), new Comparator() { // from class: com.google.android.gms.internal.ads.zzxp
                    @Override // java.util.Comparator
                    public final int compare(Object obj4, Object obj5) {
                        return zzxr.zzd((zzxr) obj4, (zzxr) obj5);
                    }
                }).zzb(list.size(), list2.size()).zzc((zzxr) Collections.max(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzxq
                    @Override // java.util.Comparator
                    public final int compare(Object obj4, Object obj5) {
                        return zzxr.zza((zzxr) obj4, (zzxr) obj5);
                    }
                }), (zzxr) Collections.max(list2, new Comparator() { // from class: com.google.android.gms.internal.ads.zzxq
                    @Override // java.util.Comparator
                    public final int compare(Object obj4, Object obj5) {
                        return zzxr.zza((zzxr) obj4, (zzxr) obj5);
                    }
                }), new Comparator() { // from class: com.google.android.gms.internal.ads.zzxq
                    @Override // java.util.Comparator
                    public final int compare(Object obj4, Object obj5) {
                        return zzxr.zza((zzxr) obj4, (zzxr) obj5);
                    }
                }).zza();
            }
        });
        int i4 = 4;
        Pair pairZzv3 = pairZzv2 == null ? zzv(4, zzxxVar, iArr, new zzxn() { // from class: com.google.android.gms.internal.ads.zzwu
            @Override // com.google.android.gms.internal.ads.zzxn
            public final List zza(int i5, zzbr zzbrVar, int[] iArr4) {
                int i6 = zzxt.zzb;
                zzfxk zzfxkVar = new zzfxk();
                for (int i7 = 0; i7 < zzbrVar.zza; i7++) {
                    zzfxkVar.zzf(new zzxe(i5, zzbrVar, i7, zzxhVar, iArr4[i7]));
                }
                return zzfxkVar.zzi();
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzwv
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return ((zzxe) ((List) obj2).get(0)).compareTo((zzxe) ((List) obj3).get(0));
            }
        }) : null;
        if (pairZzv3 != null) {
            zzxuVarArr[((Integer) pairZzv3.second).intValue()] = (zzxu) pairZzv3.first;
        } else if (pairZzv2 != null) {
            zzxuVarArr[((Integer) pairZzv2.second).intValue()] = (zzxu) pairZzv2.first;
        }
        int i5 = 3;
        Pair pairZzv4 = zzv(3, zzxxVar, iArr, new zzxn() { // from class: com.google.android.gms.internal.ads.zzxb
            @Override // com.google.android.gms.internal.ads.zzxn
            public final List zza(int i6, zzbr zzbrVar, int[] iArr4) {
                int i7 = zzxt.zzb;
                zzfxk zzfxkVar = new zzfxk();
                for (int i8 = 0; i8 < zzbrVar.zza; i8++) {
                    int i9 = i8;
                    zzfxkVar.zzf(new zzxm(i6, zzbrVar, i9, zzxhVar, iArr4[i8], str));
                }
                return zzfxkVar.zzi();
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzxc
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return ((zzxm) ((List) obj2).get(0)).zza((zzxm) ((List) obj3).get(0));
            }
        });
        if (pairZzv4 != null) {
            zzxuVarArr[((Integer) pairZzv4.second).intValue()] = (zzxu) pairZzv4.first;
        }
        int i6 = 0;
        while (i6 < i2) {
            int iZzc = zzxxVar.zzc(i6);
            if (iZzc != i2 && iZzc != i && iZzc != i5 && iZzc != i4) {
                zzwj zzwjVarZzd = zzxxVar.zzd(i6);
                int[][] iArr4 = iArr[i6];
                int i7 = 0;
                zzbr zzbrVar = null;
                int i8 = 0;
                zzxf zzxfVar = null;
                while (i7 < zzwjVarZzd.zzb) {
                    zzbr zzbrVarZzb = zzwjVarZzd.zzb(i7);
                    int[] iArr5 = iArr4[i7];
                    zzxf zzxfVar2 = zzxfVar;
                    for (int i9 = 0; i9 < zzbrVarZzb.zza; i9++) {
                        if (zzlk.zza(iArr5[i9], zzxhVar.zzO)) {
                            zzxf zzxfVar3 = new zzxf(zzbrVarZzb.zzb(i9), iArr5[i9]);
                            if (zzxfVar2 == null || zzxfVar3.compareTo(zzxfVar2) > 0) {
                                i8 = i9;
                                zzxfVar2 = zzxfVar3;
                                zzbrVar = zzbrVarZzb;
                            }
                        }
                    }
                    i7++;
                    zzxfVar = zzxfVar2;
                }
                zzxuVarArr[i6] = zzbrVar == null ? null : new zzxu(zzbrVar, new int[]{i8}, 0);
            }
            i6++;
            i2 = 2;
            i = 1;
            i4 = 4;
            i5 = 3;
        }
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < 2; i10++) {
            zzt(zzxxVar.zzd(i10), zzxhVar, map);
        }
        zzt(zzxxVar.zze(), zzxhVar, map);
        for (int i11 = 0; i11 < 2; i11++) {
            if (((zzbs) map.get(Integer.valueOf(zzxxVar.zzc(i11)))) != null) {
                throw null;
            }
        }
        int i12 = 0;
        for (int i13 = 2; i12 < i13; i13 = 2) {
            zzwj zzwjVarZzd2 = zzxxVar.zzd(i12);
            if (zzxhVar.zzg(i12, zzwjVarZzd2)) {
                if (zzxhVar.zze(i12, zzwjVarZzd2) != null) {
                    throw null;
                }
                zzxuVarArr[i12] = null;
            }
            i12++;
        }
        int i14 = 0;
        for (int i15 = 2; i14 < i15; i15 = 2) {
            int iZzc2 = zzxxVar.zzc(i14);
            if (zzxhVar.zzf(i14) || zzxhVar.zzC.contains(Integer.valueOf(iZzc2))) {
                zzxuVarArr[i14] = null;
            }
            i14++;
        }
        zzwp zzwpVar = this.zzi;
        zzyj zzyjVarZzq = zzq();
        zzfxn zzfxnVarZzh = zzwq.zzh(zzxuVarArr);
        int i16 = 2;
        zzxv[] zzxvVarArr = new zzxv[2];
        int i17 = 0;
        while (i17 < i16) {
            zzxu zzxuVar = zzxuVarArr[i17];
            if (zzxuVar == null || (length = (iArr3 = zzxuVar.zzb).length) == 0) {
                i17 = i17;
            } else {
                zzxvVarArr[i17] = length == 1 ? new zzxw(zzxuVar.zza, iArr3[0], 0, 0, null) : zzwpVar.zza(zzxuVar.zza, iArr3, 0, zzyjVarZzq, (zzfxn) zzfxnVarZzh.get(i17));
            }
            i17++;
            i16 = 2;
        }
        zzln[] zzlnVarArr = new zzln[i16];
        for (int i18 = 0; i18 < i16; i18++) {
            zzlnVarArr[i18] = (zzxhVar.zzf(i18) || zzxhVar.zzC.contains(Integer.valueOf(zzxxVar.zzc(i18))) || (zzxxVar.zzc(i18) != -2 && zzxvVarArr[i18] == null)) ? null : zzln.zza;
        }
        return Pair.create(zzlnVarArr, zzxvVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzyb
    @Nullable
    public final zzll zze() {
        return this;
    }

    public final zzxh zzf() {
        zzxh zzxhVar;
        synchronized (this.zzd) {
            zzxhVar = this.zzf;
        }
        return zzxhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyb
    public final void zzj() {
        zzxl zzxlVar;
        synchronized (this.zzd) {
            try {
                if (zzei.zza >= 32 && (zzxlVar = this.zzg) != null) {
                    zzxlVar.zzc();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        super.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzyb
    public final void zzk(zze zzeVar) {
        boolean z;
        synchronized (this.zzd) {
            z = !this.zzh.equals(zzeVar);
            this.zzh = zzeVar;
        }
        if (z) {
            zzu();
        }
    }

    public final void zzl(zzxg zzxgVar) {
        boolean z;
        zzxh zzxhVar = new zzxh(zzxgVar);
        synchronized (this.zzd) {
            z = !this.zzf.equals(zzxhVar);
            this.zzf = zzxhVar;
        }
        if (z) {
            if (zzxhVar.zzN && this.zza == null) {
                zzdo.zzf("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
            }
            zzs();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyb
    public final boolean zzn() {
        return true;
    }
}
