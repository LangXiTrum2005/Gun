package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;
import androidx.core.view.PointerIconCompat;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzxh extends zzbw {
    public final boolean zzD;
    public final boolean zzE;
    public final boolean zzF;
    public final boolean zzG;
    public final boolean zzH;
    public final boolean zzI;
    public final boolean zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final boolean zzQ;
    public final boolean zzR;
    private final SparseArray zzS;
    private final SparseBooleanArray zzT;

    static {
        new zzxh(new zzxg());
        Integer.toString(1000, 36);
        Integer.toString(1001, 36);
        Integer.toString(1002, 36);
        Integer.toString(PointerIconCompat.TYPE_HELP, 36);
        Integer.toString(1004, 36);
        Integer.toString(1005, 36);
        Integer.toString(PointerIconCompat.TYPE_CELL, 36);
        Integer.toString(PointerIconCompat.TYPE_CROSSHAIR, 36);
        Integer.toString(PointerIconCompat.TYPE_TEXT, 36);
        Integer.toString(PointerIconCompat.TYPE_VERTICAL_TEXT, 36);
        Integer.toString(1010, 36);
        Integer.toString(1011, 36);
        Integer.toString(1012, 36);
        Integer.toString(PointerIconCompat.TYPE_ALL_SCROLL, 36);
        Integer.toString(PointerIconCompat.TYPE_HORIZONTAL_DOUBLE_ARROW, 36);
        Integer.toString(PointerIconCompat.TYPE_VERTICAL_DOUBLE_ARROW, 36);
        Integer.toString(PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW, 36);
        Integer.toString(PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW, 36);
        Integer.toString(PointerIconCompat.TYPE_ZOOM_IN, 36);
    }

    public static zzxh zzd(Context context) {
        return new zzxh(new zzxg(context));
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzxh.class == obj.getClass()) {
            zzxh zzxhVar = (zzxh) obj;
            if (super.equals(zzxhVar) && this.zzD == zzxhVar.zzD && this.zzF == zzxhVar.zzF && this.zzH == zzxhVar.zzH && this.zzM == zzxhVar.zzM && this.zzN == zzxhVar.zzN && this.zzO == zzxhVar.zzO && this.zzQ == zzxhVar.zzQ) {
                SparseBooleanArray sparseBooleanArray = this.zzT;
                SparseBooleanArray sparseBooleanArray2 = zzxhVar.zzT;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    for (int i = 0; i < size; i++) {
                        if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) >= 0) {
                        }
                    }
                    SparseArray sparseArray = this.zzS;
                    SparseArray sparseArray2 = zzxhVar.zzS;
                    int size2 = sparseArray.size();
                    if (sparseArray2.size() == size2) {
                        for (int i2 = 0; i2 < size2; i2++) {
                            int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                            if (iIndexOfKey >= 0) {
                                Map map = (Map) sparseArray.valueAt(i2);
                                Map map2 = (Map) sparseArray2.valueAt(iIndexOfKey);
                                if (map2.size() == map.size()) {
                                    for (Map.Entry entry : map.entrySet()) {
                                        zzwj zzwjVar = (zzwj) entry.getKey();
                                        if (!map2.containsKey(zzwjVar) || !Objects.equals(entry.getValue(), map2.get(zzwjVar))) {
                                        }
                                    }
                                }
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.zzD ? 1 : 0)) * 961) + (this.zzF ? 1 : 0)) * 961) + (this.zzH ? 1 : 0)) * 28629151) + (this.zzM ? 1 : 0)) * 31) + (this.zzN ? 1 : 0)) * 31) + (this.zzO ? 1 : 0)) * 961) + (this.zzQ ? 1 : 0)) * 31;
    }

    public final zzxg zzc() {
        return new zzxg(this, null);
    }

    @Nullable
    @Deprecated
    public final zzxi zze(int i, zzwj zzwjVar) {
        Map map = (Map) this.zzS.get(i);
        if (map != null) {
            return (zzxi) map.get(zzwjVar);
        }
        return null;
    }

    public final boolean zzf(int i) {
        return this.zzT.get(i);
    }

    @Deprecated
    public final boolean zzg(int i, zzwj zzwjVar) {
        Map map = (Map) this.zzS.get(i);
        return map != null && map.containsKey(zzwjVar);
    }

    private zzxh(zzxg zzxgVar) {
        super(zzxgVar);
        this.zzD = zzxgVar.zza;
        this.zzE = false;
        this.zzF = zzxgVar.zzb;
        this.zzG = false;
        this.zzH = zzxgVar.zzc;
        this.zzI = false;
        this.zzJ = false;
        this.zzK = false;
        this.zzL = false;
        this.zzM = zzxgVar.zzd;
        this.zzN = zzxgVar.zze;
        this.zzO = zzxgVar.zzf;
        this.zzP = false;
        this.zzQ = zzxgVar.zzg;
        this.zzR = false;
        this.zzS = zzxgVar.zzh;
        this.zzT = zzxgVar.zzi;
    }
}
