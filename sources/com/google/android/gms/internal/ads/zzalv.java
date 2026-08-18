package com.google.android.gms.internal.ads;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.umeng.analytics.pro.bc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class zzalv {
    public static final Pattern zza = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    private static final Pattern zzb = Pattern.compile("(\\S+?):(\\S+)");
    private static final Map zzc;
    private static final Map zzd;

    static {
        HashMap map = new HashMap();
        AbstractC3888ke0.n(255, 255, 255, map, "white");
        AbstractC3888ke0.n(0, 255, 0, map, "lime");
        AbstractC3888ke0.n(0, 255, 255, map, "cyan");
        AbstractC3888ke0.n(255, 0, 0, map, "red");
        AbstractC3888ke0.n(255, 255, 0, map, "yellow");
        AbstractC3888ke0.n(255, 0, 255, map, "magenta");
        AbstractC3888ke0.n(0, 0, 255, map, "blue");
        AbstractC3888ke0.n(0, 0, 0, map, "black");
        zzc = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        AbstractC3888ke0.n(255, 255, 255, map2, "bg_white");
        AbstractC3888ke0.n(0, 255, 0, map2, "bg_lime");
        AbstractC3888ke0.n(0, 255, 255, map2, "bg_cyan");
        AbstractC3888ke0.n(255, 0, 0, map2, "bg_red");
        AbstractC3888ke0.n(255, 255, 0, map2, "bg_yellow");
        AbstractC3888ke0.n(255, 0, 255, map2, "bg_magenta");
        AbstractC3888ke0.n(0, 0, 255, map2, "bg_blue");
        AbstractC3888ke0.n(0, 0, 0, map2, "bg_black");
        zzd = Collections.unmodifiableMap(map2);
    }

    /* JADX WARN: Code duplicated, block: B:121:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:76:0x0127  */
    public static SpannedString zza(@Nullable String str, String str2, List list) {
        byte b;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        char c = 0;
        int i = 0;
        while (i < str2.length()) {
            int length = i + 1;
            char cCharAt = str2.charAt(i);
            if (cCharAt == '&') {
                int iIndexOf = str2.indexOf(59, length);
                int iIndexOf2 = str2.indexOf(32, length);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    String strSubstring = str2.substring(length, iIndexOf);
                    int iHashCode = strSubstring.hashCode();
                    if (iHashCode != 3309) {
                        if (iHashCode != 3464) {
                            if (iHashCode != 96708) {
                                if (iHashCode == 3374865 && strSubstring.equals("nbsp")) {
                                    b = 2;
                                } else {
                                    b = -1;
                                }
                            } else if (strSubstring.equals("amp")) {
                                b = 3;
                            } else {
                                b = -1;
                            }
                        } else if (strSubstring.equals("lt")) {
                            b = 0;
                        } else {
                            b = -1;
                        }
                    } else if (strSubstring.equals("gt")) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                    if (b == 0) {
                        spannableStringBuilder.append('<');
                    } else if (b == 1) {
                        spannableStringBuilder.append('>');
                    } else if (b == 2) {
                        spannableStringBuilder.append(' ');
                    } else if (b != 3) {
                        zzdo.zzf("WebvttCueParser", "ignoring unsupported entity: '&" + strSubstring + ";'");
                    } else {
                        spannableStringBuilder.append('&');
                    }
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
                c = 0;
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
            } else if (length < str2.length()) {
                char cCharAt2 = str2.charAt(length);
                int iIndexOf3 = str2.indexOf(62, length);
                length = iIndexOf3 == -1 ? str2.length() : iIndexOf3 + 1;
                int i2 = length - 2;
                boolean z = str2.charAt(i2) == '/';
                int i3 = i + (cCharAt2 == '/' ? 2 : 1);
                if (!z) {
                    i2 = length - 1;
                }
                String strSubstring2 = str2.substring(i3, i2);
                if (!strSubstring2.trim().isEmpty()) {
                    String strTrim = strSubstring2.trim();
                    zzcw.zzd(!strTrim.isEmpty());
                    int i4 = zzei.zza;
                    String str3 = strTrim.split("[ \\.]", 2)[c];
                    switch (str3) {
                        case "b":
                        case "c":
                        case "i":
                        case "lang":
                        case "ruby":
                        case "rt":
                        case "u":
                        case "v":
                            if (cCharAt2 == '/') {
                                while (!arrayDeque.isEmpty()) {
                                    zzalr zzalrVar = (zzalr) arrayDeque.pop();
                                    zzg(str, zzalrVar, arrayList, spannableStringBuilder, list);
                                    if (arrayDeque.isEmpty()) {
                                        arrayList.clear();
                                    } else {
                                        arrayList.add(new zzalq(zzalrVar, spannableStringBuilder.length(), null));
                                    }
                                    if (zzalrVar.zza.equals(str3)) {
                                        break;
                                    }
                                }
                                break;
                            } else {
                                if (!z) {
                                    arrayDeque.push(zzalr.zza(strSubstring2, spannableStringBuilder.length()));
                                }
                                break;
                            }
                            break;
                    }
                }
            }
            i = length;
            c = 0;
        }
        while (!arrayDeque.isEmpty()) {
            zzg(str, (zzalr) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        zzg(str, zzalr.zzb(), Collections.emptyList(), spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    public static zzcm zzb(String str) {
        zzalt zzaltVar = new zzalt();
        zzh(str, zzaltVar);
        return zzaltVar.zza();
    }

    @Nullable
    public static zzalo zzc(zzdy zzdyVar, List list) {
        Charset charset = StandardCharsets.UTF_8;
        String strZzz = zzdyVar.zzz(charset);
        if (strZzz != null) {
            Pattern pattern = zza;
            Matcher matcher = pattern.matcher(strZzz);
            if (matcher.matches()) {
                return zze(null, matcher, zzdyVar, list);
            }
            String strZzz2 = zzdyVar.zzz(charset);
            if (strZzz2 != null) {
                Matcher matcher2 = pattern.matcher(strZzz2);
                if (matcher2.matches()) {
                    return zze(strZzz.trim(), matcher2, zzdyVar, list);
                }
            }
        }
        return null;
    }

    private static int zzd(List list, @Nullable String str, zzalr zzalrVar) {
        List listZzf = zzf(list, str, zzalrVar);
        for (int i = 0; i < listZzf.size(); i++) {
            zzaln zzalnVar = ((zzals) listZzf.get(i)).zzb;
            if (zzalnVar.zze() != -1) {
                return zzalnVar.zze();
            }
        }
        return -1;
    }

    @Nullable
    private static zzalo zze(@Nullable String str, Matcher matcher, zzdy zzdyVar, List list) {
        zzalt zzaltVar = new zzalt();
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            zzaltVar.zza = zzalx.zzb(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            zzaltVar.zzb = zzalx.zzb(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            zzh(strGroup3, zzaltVar);
            StringBuilder sb = new StringBuilder();
            String strZzz = zzdyVar.zzz(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(strZzz)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(strZzz.trim());
                strZzz = zzdyVar.zzz(StandardCharsets.UTF_8);
            }
            zzaltVar.zzc = zza(str, sb.toString(), list);
            return new zzalo(zzaltVar.zza().zzp(), zzaltVar.zza, zzaltVar.zzb);
        } catch (NumberFormatException unused) {
            zzdo.zzf("WebvttCueParser", "Skipping cue with bad header: ".concat(String.valueOf(matcher.group())));
            return null;
        }
    }

    private static List zzf(List list, @Nullable String str, zzalr zzalrVar) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            zzaln zzalnVar = (zzaln) list.get(i);
            int iZzf = zzalnVar.zzf(str, zzalrVar.zza, zzalrVar.zzd, zzalrVar.zzc);
            if (iZzf > 0) {
                arrayList.add(new zzals(iZzf, zzalnVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0087  */
    private static void zzg(@Nullable String str, zzalr zzalrVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        byte b;
        int i = zzalrVar.zzb;
        int length = spannableStringBuilder.length();
        String str2 = zzalrVar.zza;
        int iHashCode = str2.hashCode();
        int i2 = -1;
        if (iHashCode != 0) {
            if (iHashCode != 105) {
                if (iHashCode != 3314158) {
                    if (iHashCode != 3511770) {
                        if (iHashCode != 98) {
                            if (iHashCode != 99) {
                                if (iHashCode != 117) {
                                    if (iHashCode == 118 && str2.equals(bc.aK)) {
                                        b = 5;
                                    } else {
                                        b = -1;
                                    }
                                } else if (str2.equals(bc.aN)) {
                                    b = 3;
                                } else {
                                    b = -1;
                                }
                            } else if (str2.equals(bc.aL)) {
                                b = 4;
                            } else {
                                b = -1;
                            }
                        } else if (str2.equals(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B)) {
                            b = 0;
                        } else {
                            b = -1;
                        }
                    } else if (str2.equals("ruby")) {
                        b = 2;
                    } else {
                        b = -1;
                    }
                } else if (str2.equals("lang")) {
                    b = 6;
                } else {
                    b = -1;
                }
            } else if (str2.equals(bc.aI)) {
                b = 1;
            } else {
                b = -1;
            }
        } else if (str2.equals("")) {
            b = 7;
        } else {
            b = -1;
        }
        switch (b) {
            case 0:
                DM.v(1, spannableStringBuilder, i, length, 33);
                break;
            case 1:
                DM.v(2, spannableStringBuilder, i, length, 33);
                break;
            case 2:
                int iZzd = zzd(list2, str, zzalrVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, zzalq.zza);
                int i3 = zzalrVar.zzb;
                int i4 = 0;
                int length2 = 0;
                while (i4 < arrayList.size()) {
                    if ("rt".equals(((zzalq) arrayList.get(i4)).zzb.zza)) {
                        zzalq zzalqVar = (zzalq) arrayList.get(i4);
                        int iZzd2 = zzd(list2, str, zzalqVar.zzb);
                        if (iZzd2 == i2) {
                            iZzd2 = iZzd != i2 ? iZzd : 1;
                        }
                        int i5 = zzalqVar.zzb.zzb - length2;
                        int i6 = zzalqVar.zzc - length2;
                        CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i5, i6);
                        spannableStringBuilder.delete(i5, i6);
                        spannableStringBuilder.setSpan(new zzcs(charSequenceSubSequence.toString(), iZzd2), i3, i5, 33);
                        length2 = charSequenceSubSequence.length() + length2;
                        i3 = i5;
                    }
                    i4++;
                    i2 = -1;
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                break;
            case 4:
                for (String str3 : zzalrVar.zzd) {
                    Map map = zzc;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i, length, 33);
                    } else {
                        Map map2 = zzd;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i, length, 33);
                        }
                    }
                }
                break;
            case 5:
                spannableStringBuilder.setSpan(new zzcv(zzalrVar.zzc), i, length, 33);
                break;
            case 6:
            case 7:
                break;
            default:
                return;
        }
        List listZzf = zzf(list2, str, zzalrVar);
        for (int i7 = 0; i7 < listZzf.size(); i7++) {
            zzaln zzalnVar = ((zzals) listZzf.get(i7)).zzb;
            if (zzalnVar != null) {
                if (zzalnVar.zzg() != -1) {
                    zzct.zzb(spannableStringBuilder, new StyleSpan(zzalnVar.zzg()), i, length, 33);
                }
                if (zzalnVar.zzz()) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                }
                if (zzalnVar.zzy()) {
                    zzct.zzb(spannableStringBuilder, new ForegroundColorSpan(zzalnVar.zzc()), i, length, 33);
                }
                if (zzalnVar.zzx()) {
                    zzct.zzb(spannableStringBuilder, new BackgroundColorSpan(zzalnVar.zzb()), i, length, 33);
                }
                if (zzalnVar.zzr() != null) {
                    zzct.zzb(spannableStringBuilder, new TypefaceSpan(zzalnVar.zzr()), i, length, 33);
                }
                int iZzd3 = zzalnVar.zzd();
                if (iZzd3 == 1) {
                    zzct.zzb(spannableStringBuilder, new AbsoluteSizeSpan((int) zzalnVar.zza(), true), i, length, 33);
                } else if (iZzd3 == 2) {
                    zzct.zzb(spannableStringBuilder, new RelativeSizeSpan(zzalnVar.zza()), i, length, 33);
                } else if (iZzd3 == 3) {
                    zzct.zzb(spannableStringBuilder, new RelativeSizeSpan(zzalnVar.zza() / 100.0f), i, length, 33);
                }
                if (zzalnVar.zzw()) {
                    spannableStringBuilder.setSpan(new zzcr(), i, length, 33);
                }
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static void zzh(String str, zzalt zzaltVar) {
        Matcher matcher = zzb.matcher(str);
        while (matcher.find()) {
            int i = 1;
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i2 = 2;
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            try {
                byte b = -1;
                if ("line".equals(strGroup)) {
                    int iIndexOf = strGroup2.indexOf(44);
                    if (iIndexOf != -1) {
                        String strSubstring = strGroup2.substring(iIndexOf + 1);
                        switch (strSubstring.hashCode()) {
                            case -1364013995:
                                if (strSubstring.equals(TtmlNode.CENTER)) {
                                    b = 1;
                                }
                                break;
                            case -1074341483:
                                if (strSubstring.equals("middle")) {
                                    b = 2;
                                }
                                break;
                            case 100571:
                                if (strSubstring.equals(TtmlNode.END)) {
                                    b = 3;
                                }
                                break;
                            case 109757538:
                                if (strSubstring.equals("start")) {
                                    b = 0;
                                }
                                break;
                        }
                        if (b == 0) {
                            i2 = 0;
                        } else if (b == 1 || b == 2) {
                            i2 = 1;
                        } else if (b != 3) {
                            zzdo.zzf("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                            i2 = Integer.MIN_VALUE;
                        }
                        zzaltVar.zzg = i2;
                        strGroup2 = strGroup2.substring(0, iIndexOf);
                    }
                    if (strGroup2.endsWith("%")) {
                        zzaltVar.zze = zzalx.zza(strGroup2);
                        zzaltVar.zzf = 0;
                    } else {
                        zzaltVar.zze = Integer.parseInt(strGroup2);
                        zzaltVar.zzf = 1;
                    }
                } else if ("align".equals(strGroup)) {
                    switch (strGroup2.hashCode()) {
                        case -1364013995:
                            if (strGroup2.equals(TtmlNode.CENTER)) {
                                b = 2;
                            }
                            break;
                        case -1074341483:
                            if (strGroup2.equals("middle")) {
                                b = 3;
                            }
                            break;
                        case 100571:
                            if (strGroup2.equals(TtmlNode.END)) {
                                b = 4;
                            }
                            break;
                        case 3317767:
                            if (strGroup2.equals(TtmlNode.LEFT)) {
                                b = 1;
                            }
                            break;
                        case 108511772:
                            if (strGroup2.equals(TtmlNode.RIGHT)) {
                                b = 5;
                            }
                            break;
                        case 109757538:
                            if (strGroup2.equals("start")) {
                                b = 0;
                            }
                            break;
                    }
                    if (b != 0) {
                        if (b == 1) {
                            i = 4;
                        } else if (b == 2 || b == 3) {
                            i = 2;
                        } else if (b == 4) {
                            i = 3;
                        } else if (b != 5) {
                            zzdo.zzf("WebvttCueParser", "Invalid alignment value: ".concat(strGroup2));
                            i = 2;
                        } else {
                            i = 5;
                        }
                    }
                    zzaltVar.zzd = i;
                } else if ("position".equals(strGroup)) {
                    int iIndexOf2 = strGroup2.indexOf(44);
                    if (iIndexOf2 != -1) {
                        String strSubstring2 = strGroup2.substring(iIndexOf2 + 1);
                        switch (strSubstring2.hashCode()) {
                            case -1842484672:
                                if (strSubstring2.equals("line-left")) {
                                    b = 0;
                                }
                                break;
                            case -1364013995:
                                if (strSubstring2.equals(TtmlNode.CENTER)) {
                                    b = 2;
                                }
                                break;
                            case -1276788989:
                                if (strSubstring2.equals("line-right")) {
                                    b = 4;
                                }
                                break;
                            case -1074341483:
                                if (strSubstring2.equals("middle")) {
                                    b = 3;
                                }
                                break;
                            case 100571:
                                if (strSubstring2.equals(TtmlNode.END)) {
                                    b = 5;
                                }
                                break;
                            case 109757538:
                                if (strSubstring2.equals("start")) {
                                    b = 1;
                                }
                                break;
                        }
                        if (b == 0 || b == 1) {
                            i = 0;
                        } else if (b != 2 && b != 3) {
                            if (b == 4 || b == 5) {
                                i = 2;
                            } else {
                                zzdo.zzf("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring2));
                                i = Integer.MIN_VALUE;
                            }
                        }
                        zzaltVar.zzi = i;
                        strGroup2 = strGroup2.substring(0, iIndexOf2);
                    }
                    zzaltVar.zzh = zzalx.zza(strGroup2);
                } else if ("size".equals(strGroup)) {
                    zzaltVar.zzj = zzalx.zza(strGroup2);
                } else if ("vertical".equals(strGroup)) {
                    int iHashCode = strGroup2.hashCode();
                    if (iHashCode != 3462) {
                        if (iHashCode == 3642 && strGroup2.equals("rl")) {
                            b = 0;
                        }
                    } else if (strGroup2.equals("lr")) {
                        b = 1;
                    }
                    if (b != 0) {
                        if (b != 1) {
                            zzdo.zzf("WebvttCueParser", "Invalid 'vertical' value: ".concat(strGroup2));
                            i = Integer.MIN_VALUE;
                        } else {
                            i = 2;
                        }
                    }
                    zzaltVar.zzk = i;
                } else {
                    zzdo.zzf("WebvttCueParser", "Unknown cue setting " + strGroup + ":" + strGroup2);
                }
            } catch (NumberFormatException unused) {
                zzdo.zzf("WebvttCueParser", "Skipping bad cue setting: ".concat(String.valueOf(matcher.group())));
            }
        }
    }
}
