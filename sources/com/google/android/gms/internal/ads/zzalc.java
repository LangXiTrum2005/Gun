package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Base64;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes3.dex */
final class zzalc {

    @Nullable
    public final String zza;

    @Nullable
    public final String zzb;
    public final boolean zzc;
    public final long zzd;
    public final long zze;

    @Nullable
    public final zzali zzf;
    public final String zzg;

    @Nullable
    public final String zzh;

    @Nullable
    public final zzalc zzi;

    @Nullable
    private final String[] zzj;
    private final HashMap zzk;
    private final HashMap zzl;
    private List zzm;

    private zzalc(@Nullable String str, @Nullable String str2, long j, long j2, @Nullable zzali zzaliVar, @Nullable String[] strArr, String str3, @Nullable String str4, @Nullable zzalc zzalcVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzh = str4;
        this.zzf = zzaliVar;
        this.zzj = strArr;
        this.zzc = str2 != null;
        this.zzd = j;
        this.zze = j2;
        str3.getClass();
        this.zzg = str3;
        this.zzi = zzalcVar;
        this.zzk = new HashMap();
        this.zzl = new HashMap();
    }

    public static zzalc zzb(@Nullable String str, long j, long j2, @Nullable zzali zzaliVar, @Nullable String[] strArr, String str2, @Nullable String str3, @Nullable zzalc zzalcVar) {
        return new zzalc(str, null, j, j2, zzaliVar, strArr, str2, str3, zzalcVar);
    }

    public static zzalc zzc(String str) {
        return new zzalc(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), C.TIME_UNSET, C.TIME_UNSET, null, null, "", null, null);
    }

    private static SpannableStringBuilder zzi(String str, Map map) {
        if (!map.containsKey(str)) {
            zzcm zzcmVar = new zzcm();
            zzcmVar.zzl(new SpannableStringBuilder());
            map.put(str, zzcmVar);
        }
        CharSequence charSequenceZzq = ((zzcm) map.get(str)).zzq();
        charSequenceZzq.getClass();
        return (SpannableStringBuilder) charSequenceZzq;
    }

    private final void zzj(TreeSet treeSet, boolean z) {
        String str = this.zza;
        boolean zEquals = "p".equals(str);
        boolean zEquals2 = TtmlNode.TAG_DIV.equals(str);
        if (z || zEquals || (zEquals2 && this.zzh != null)) {
            long j = this.zzd;
            if (j != C.TIME_UNSET) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.zze;
            if (j2 != C.TIME_UNSET) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.zzm != null) {
            for (int i = 0; i < this.zzm.size(); i++) {
                zzalc zzalcVar = (zzalc) this.zzm.get(i);
                boolean z2 = true;
                if (!z && !zEquals) {
                    z2 = false;
                }
                zzalcVar.zzj(treeSet, z2);
            }
        }
    }

    private final void zzk(long j, String str, List list) {
        String str2;
        if (!"".equals(this.zzg)) {
            str = this.zzg;
        }
        if (zzg(j) && TtmlNode.TAG_DIV.equals(this.zza) && (str2 = this.zzh) != null) {
            list.add(new Pair(str, str2));
            return;
        }
        for (int i = 0; i < zza(); i++) {
            zzd(i).zzk(j, str, list);
        }
    }

    private final void zzl(long j, Map map, Map map2, String str, Map map3) {
        zzalc zzalcVar;
        zzali zzaliVarZza;
        int i;
        if (zzg(j)) {
            String str2 = !"".equals(this.zzg) ? this.zzg : str;
            Iterator it = this.zzl.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str3 = (String) entry.getKey();
                int iIntValue = this.zzk.containsKey(str3) ? ((Integer) this.zzk.get(str3)).intValue() : 0;
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    zzcm zzcmVar = (zzcm) map3.get(str3);
                    zzcmVar.getClass();
                    zzalg zzalgVar = (zzalg) map2.get(str2);
                    zzalgVar.getClass();
                    int i2 = zzalgVar.zzj;
                    zzali zzaliVarZza2 = zzalh.zza(this.zzf, this.zzj, map);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) zzcmVar.zzq();
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        zzcmVar.zzl(spannableStringBuilder);
                    }
                    if (zzaliVarZza2 != null) {
                        zzalc zzalcVar2 = this.zzi;
                        if (zzaliVarZza2.zzh() != -1) {
                            spannableStringBuilder.setSpan(new StyleSpan(zzaliVarZza2.zzh()), iIntValue, iIntValue2, 33);
                        }
                        if (zzaliVarZza2.zzI()) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), iIntValue, iIntValue2, 33);
                        }
                        if (zzaliVarZza2.zzJ()) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), iIntValue, iIntValue2, 33);
                        }
                        if (zzaliVarZza2.zzH()) {
                            zzct.zzb(spannableStringBuilder, new ForegroundColorSpan(zzaliVarZza2.zzd()), iIntValue, iIntValue2, 33);
                        }
                        if (zzaliVarZza2.zzG()) {
                            zzct.zzb(spannableStringBuilder, new BackgroundColorSpan(zzaliVarZza2.zzc()), iIntValue, iIntValue2, 33);
                        }
                        if (zzaliVarZza2.zzD() != null) {
                            zzct.zzb(spannableStringBuilder, new TypefaceSpan(zzaliVarZza2.zzD()), iIntValue, iIntValue2, 33);
                        }
                        if (zzaliVarZza2.zzk() != null) {
                            zzalb zzalbVarZzk = zzaliVarZza2.zzk();
                            zzalbVarZzk.getClass();
                            int i3 = zzalbVarZzk.zza;
                            if (i3 == -1) {
                                i3 = (i2 == 2 || i2 == 1) ? 3 : 1;
                                i = 1;
                            } else {
                                i = zzalbVarZzk.zzb;
                            }
                            int i4 = zzalbVarZzk.zzc;
                            if (i4 == -2) {
                                i4 = 1;
                            }
                            zzct.zzb(spannableStringBuilder, new zzcu(i3, i, i4), iIntValue, iIntValue2, 33);
                        }
                        int iZzg = zzaliVarZza2.zzg();
                        if (iZzg == 2) {
                            while (true) {
                                if (zzalcVar2 == null) {
                                    zzalcVar2 = null;
                                    break;
                                }
                                zzali zzaliVarZza3 = zzalh.zza(zzalcVar2.zzf, zzalcVar2.zzj, map);
                                if (zzaliVarZza3 != null && zzaliVarZza3.zzg() == 1) {
                                    break;
                                } else {
                                    zzalcVar2 = zzalcVar2.zzi;
                                }
                            }
                            if (zzalcVar2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(zzalcVar2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        zzalcVar = null;
                                        break;
                                    }
                                    zzalc zzalcVar3 = (zzalc) arrayDeque.pop();
                                    zzali zzaliVarZza4 = zzalh.zza(zzalcVar3.zzf, zzalcVar3.zzj, map);
                                    if (zzaliVarZza4 != null && zzaliVarZza4.zzg() == 3) {
                                        zzalcVar = zzalcVar3;
                                        break;
                                    }
                                    for (int iZza = zzalcVar3.zza() - 1; iZza >= 0; iZza--) {
                                        arrayDeque.push(zzalcVar3.zzd(iZza));
                                    }
                                }
                                if (zzalcVar != null) {
                                    if (zzalcVar.zza() != 1 || zzalcVar.zzd(0).zzb == null) {
                                        zzdo.zze("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                    } else {
                                        String str4 = zzalcVar.zzd(0).zzb;
                                        int i5 = zzei.zza;
                                        zzali zzaliVarZza5 = zzalh.zza(zzalcVar.zzf, zzalcVar.zzj, map);
                                        int iZzf = zzaliVarZza5 != null ? zzaliVarZza5.zzf() : -1;
                                        if (iZzf == -1 && (zzaliVarZza = zzalh.zza(zzalcVar2.zzf, zzalcVar2.zzj, map)) != null) {
                                            iZzf = zzaliVarZza.zzf();
                                        }
                                        spannableStringBuilder.setSpan(new zzcs(str4, iZzf), iIntValue, iIntValue2, 33);
                                    }
                                }
                            }
                        } else if (iZzg == 3 || iZzg == 4) {
                            spannableStringBuilder.setSpan(new zzala(), iIntValue, iIntValue2, 33);
                        }
                        if (zzaliVarZza2.zzF()) {
                            zzct.zzb(spannableStringBuilder, new zzcr(), iIntValue, iIntValue2, 33);
                        }
                        int iZze = zzaliVarZza2.zze();
                        if (iZze == 1) {
                            zzct.zzb(spannableStringBuilder, new AbsoluteSizeSpan((int) zzaliVarZza2.zza(), true), iIntValue, iIntValue2, 33);
                        } else if (iZze == 2) {
                            zzct.zzb(spannableStringBuilder, new RelativeSizeSpan(zzaliVarZza2.zza()), iIntValue, iIntValue2, 33);
                        } else if (iZze == 3) {
                            zzct.zza(spannableStringBuilder, zzaliVarZza2.zza() / 100.0f, iIntValue, iIntValue2, 33);
                        }
                        if ("p".equals(this.zza)) {
                            if (zzaliVarZza2.zzb() != Float.MAX_VALUE) {
                                zzcmVar.zzj((zzaliVarZza2.zzb() * (-90.0f)) / 100.0f);
                            }
                            if (zzaliVarZza2.zzj() != null) {
                                zzcmVar.zzm(zzaliVarZza2.zzj());
                            }
                            if (zzaliVarZza2.zzi() != null) {
                                zzcmVar.zzg(zzaliVarZza2.zzi());
                            }
                        }
                        it = it;
                    }
                }
            }
            for (int i6 = 0; i6 < zza(); i6++) {
                zzd(i6).zzl(j, map, map2, str2, map3);
            }
        }
    }

    private final void zzm(long j, boolean z, String str, Map map) {
        this.zzk.clear();
        this.zzl.clear();
        if (TtmlNode.TAG_METADATA.equals(this.zza)) {
            return;
        }
        if (!"".equals(this.zzg)) {
            str = this.zzg;
        }
        if (this.zzc && z) {
            SpannableStringBuilder spannableStringBuilderZzi = zzi(str, map);
            String str2 = this.zzb;
            str2.getClass();
            spannableStringBuilderZzi.append((CharSequence) str2);
            return;
        }
        if (TtmlNode.TAG_BR.equals(this.zza) && z) {
            zzi(str, map).append('\n');
            return;
        }
        if (zzg(j)) {
            for (Map.Entry entry : map.entrySet()) {
                HashMap map2 = this.zzk;
                String str3 = (String) entry.getKey();
                CharSequence charSequenceZzq = ((zzcm) entry.getValue()).zzq();
                charSequenceZzq.getClass();
                map2.put(str3, Integer.valueOf(charSequenceZzq.length()));
            }
            boolean zEquals = "p".equals(this.zza);
            for (int i = 0; i < zza(); i++) {
                zzd(i).zzm(j, z || zEquals, str, map);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderZzi2 = zzi(str, map);
                int length = spannableStringBuilderZzi2.length();
                do {
                    length--;
                    if (length < 0) {
                        break;
                    }
                } while (spannableStringBuilderZzi2.charAt(length) == ' ');
                if (length >= 0 && spannableStringBuilderZzi2.charAt(length) != '\n') {
                    spannableStringBuilderZzi2.append('\n');
                }
            }
            for (Map.Entry entry2 : map.entrySet()) {
                HashMap map3 = this.zzl;
                String str4 = (String) entry2.getKey();
                CharSequence charSequenceZzq2 = ((zzcm) entry2.getValue()).zzq();
                charSequenceZzq2.getClass();
                map3.put(str4, Integer.valueOf(charSequenceZzq2.length()));
            }
        }
    }

    public final int zza() {
        List list = this.zzm;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final zzalc zzd(int i) {
        List list = this.zzm;
        if (list != null) {
            return (zzalc) list.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final List zze(long j, Map map, Map map2, Map map3) {
        ArrayList arrayList = new ArrayList();
        zzk(j, this.zzg, arrayList);
        TreeMap treeMap = new TreeMap();
        zzm(j, false, this.zzg, treeMap);
        zzl(j, map, map2, this.zzg, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) arrayList.get(i);
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                zzalg zzalgVar = (zzalg) map2.get(pair.first);
                zzalgVar.getClass();
                zzcm zzcmVar = new zzcm();
                zzcmVar.zzc(bitmapDecodeByteArray);
                zzcmVar.zzh(zzalgVar.zzb);
                zzcmVar.zzi(0);
                zzcmVar.zze(zzalgVar.zzc, 0);
                zzcmVar.zzf(zzalgVar.zze);
                zzcmVar.zzk(zzalgVar.zzf);
                zzcmVar.zzd(zzalgVar.zzg);
                zzcmVar.zzo(zzalgVar.zzj);
                arrayList2.add(zzcmVar.zzp());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            zzalg zzalgVar2 = (zzalg) map2.get(entry.getKey());
            zzalgVar2.getClass();
            zzcm zzcmVar2 = (zzcm) entry.getValue();
            CharSequence charSequenceZzq = zzcmVar2.zzq();
            charSequenceZzq.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequenceZzq;
            for (zzala zzalaVar : (zzala[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), zzala.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(zzalaVar), spannableStringBuilder.getSpanEnd(zzalaVar), (CharSequence) "");
            }
            int i2 = 0;
            while (i2 < spannableStringBuilder.length()) {
                int i3 = i2 + 1;
                if (spannableStringBuilder.charAt(i2) == ' ') {
                    int i4 = i3;
                    while (i4 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i4) == ' ') {
                        i4++;
                    }
                    int i5 = i4 - i3;
                    if (i5 > 0) {
                        spannableStringBuilder.delete(i2, i5 + i2);
                    }
                }
                i2 = i3;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            int i6 = 0;
            while (i6 < spannableStringBuilder.length() - 1) {
                int i7 = i6 + 1;
                if (spannableStringBuilder.charAt(i6) == '\n' && spannableStringBuilder.charAt(i7) == ' ') {
                    spannableStringBuilder.delete(i7, i6 + 2);
                }
                i6 = i7;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            int i8 = 0;
            while (i8 < spannableStringBuilder.length() - 1) {
                int i9 = i8 + 1;
                if (spannableStringBuilder.charAt(i8) == ' ' && spannableStringBuilder.charAt(i9) == '\n') {
                    spannableStringBuilder.delete(i8, i9);
                }
                i8 = i9;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            zzcmVar2.zze(zzalgVar2.zzc, zzalgVar2.zzd);
            zzcmVar2.zzf(zzalgVar2.zze);
            zzcmVar2.zzh(zzalgVar2.zzb);
            zzcmVar2.zzk(zzalgVar2.zzf);
            zzcmVar2.zzn(zzalgVar2.zzi, zzalgVar2.zzh);
            zzcmVar2.zzo(zzalgVar2.zzj);
            arrayList2.add(zzcmVar2.zzp());
        }
        return arrayList2;
    }

    public final void zzf(zzalc zzalcVar) {
        if (this.zzm == null) {
            this.zzm = new ArrayList();
        }
        this.zzm.add(zzalcVar);
    }

    public final boolean zzg(long j) {
        long j2 = this.zzd;
        if (j2 == C.TIME_UNSET) {
            if (this.zze == C.TIME_UNSET) {
                return true;
            }
            j2 = -9223372036854775807L;
        }
        if (j2 <= j && this.zze == C.TIME_UNSET) {
            return true;
        }
        if (j2 != C.TIME_UNSET || j >= this.zze) {
            return j2 <= j && j < this.zze;
        }
        return true;
    }

    public final long[] zzh() {
        TreeSet treeSet = new TreeSet();
        int i = 0;
        zzj(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        return jArr;
    }
}
