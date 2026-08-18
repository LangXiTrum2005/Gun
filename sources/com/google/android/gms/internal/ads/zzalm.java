package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
final class zzalm {
    private static final Pattern zza = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    private static final Pattern zzb = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    private final zzdy zzc = new zzdy();
    private final StringBuilder zzd = new StringBuilder();

    @Nullable
    public static String zza(zzdy zzdyVar, StringBuilder sb) {
        zzc(zzdyVar);
        if (zzdyVar.zzb() == 0) {
            return null;
        }
        String strZzd = zzd(zzdyVar, sb);
        if (!"".equals(strZzd)) {
            return strZzd;
        }
        char cZzm = (char) zzdyVar.zzm();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cZzm);
        return sb2.toString();
    }

    public static void zzc(zzdy zzdyVar) {
        while (true) {
            for (boolean z = true; zzdyVar.zzb() > 0 && z; z = false) {
                char c = (char) zzdyVar.zzN()[zzdyVar.zzd()];
                if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
                    zzdyVar.zzM(1);
                } else {
                    int iZzd = zzdyVar.zzd();
                    int iZze = zzdyVar.zze();
                    byte[] bArrZzN = zzdyVar.zzN();
                    if (iZzd + 2 <= iZze) {
                        int i = iZzd + 1;
                        if (bArrZzN[iZzd] == 47) {
                            int i2 = iZzd + 2;
                            if (bArrZzN[i] == 42) {
                                while (true) {
                                    int i3 = i2 + 1;
                                    if (i3 >= iZze) {
                                        break;
                                    }
                                    if (((char) bArrZzN[i2]) == '*' && ((char) bArrZzN[i3]) == '/') {
                                        iZze = i2 + 2;
                                        i2 = iZze;
                                    } else {
                                        i2 = i3;
                                    }
                                }
                                zzdyVar.zzM(iZze - zzdyVar.zzd());
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return;
        }
    }

    private static String zzd(zzdy zzdyVar, StringBuilder sb) {
        char c;
        sb.setLength(0);
        int iZzd = zzdyVar.zzd();
        int iZze = zzdyVar.zze();
        loop0: while (true) {
            boolean z = false;
            while (true) {
                if (iZzd < iZze && !z) {
                    c = (char) zzdyVar.zzN()[iZzd];
                    if ((c >= 'A' && c <= 'Z') || ((c >= 'a' && c <= 'z') || ((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                        break;
                    }
                    z = true;
                } else {
                    break loop0;
                }
            }
            sb.append(c);
            iZzd++;
        }
        zzdyVar.zzM(iZzd - zzdyVar.zzd());
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:102:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:103:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:105:0x0207  */
    /* JADX WARN: Code duplicated, block: B:106:0x020c  */
    /* JADX WARN: Code duplicated, block: B:108:0x0214  */
    /* JADX WARN: Code duplicated, block: B:112:0x0224  */
    /* JADX WARN: Code duplicated, block: B:115:0x022c  */
    /* JADX WARN: Code duplicated, block: B:117:0x0234  */
    /* JADX WARN: Code duplicated, block: B:119:0x023c  */
    /* JADX WARN: Code duplicated, block: B:120:0x0241  */
    /* JADX WARN: Code duplicated, block: B:122:0x0249  */
    /* JADX WARN: Code duplicated, block: B:123:0x024e  */
    /* JADX WARN: Code duplicated, block: B:125:0x0256  */
    /* JADX WARN: Code duplicated, block: B:127:0x025e  */
    /* JADX WARN: Code duplicated, block: B:128:0x0263  */
    /* JADX WARN: Code duplicated, block: B:130:0x026b  */
    /* JADX WARN: Code duplicated, block: B:132:0x0273  */
    /* JADX WARN: Code duplicated, block: B:133:0x0278  */
    /* JADX WARN: Code duplicated, block: B:135:0x0280  */
    /* JADX WARN: Code duplicated, block: B:137:0x0290  */
    /* JADX WARN: Code duplicated, block: B:138:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:140:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:142:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:148:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:150:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:151:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:153:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:154:0x02df  */
    /* JADX WARN: Code duplicated, block: B:156:0x02e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:157:0x02e4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:158:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:161:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:162:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:174:0x02eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x0306 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x0306 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x0306 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x0306 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x0306 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0044  */
    /* JADX WARN: Code duplicated, block: B:94:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:95:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:97:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:98:0x01e9  */
    /* JADX WARN: Instruction removed from duplicated block: B:137:0x0290, please report this as an issue */
    public final List zzb(zzdy zzdyVar) {
        String strTrim;
        String string;
        Matcher matcher;
        String strGroup;
        int iHashCode;
        byte b;
        boolean z;
        int i = 0;
        this.zzd.setLength(0);
        int iZzd = zzdyVar.zzd();
        while (!TextUtils.isEmpty(zzdyVar.zzz(StandardCharsets.UTF_8))) {
        }
        this.zzc.zzJ(zzdyVar.zzN(), zzdyVar.zzd());
        this.zzc.zzL(iZzd);
        ArrayList arrayList = new ArrayList();
        while (true) {
            zzdy zzdyVar2 = this.zzc;
            StringBuilder sb = this.zzd;
            zzc(zzdyVar2);
            if (zzdyVar2.zzb() >= 5 && "::cue".equals(zzdyVar2.zzB(5, StandardCharsets.UTF_8))) {
                int iZzd2 = zzdyVar2.zzd();
                String strZza = zza(zzdyVar2, sb);
                if (strZza == null) {
                    strTrim = null;
                } else if ("{".equals(strZza)) {
                    zzdyVar2.zzL(iZzd2);
                    strTrim = "";
                } else {
                    if ("(".equals(strZza)) {
                        int iZzd3 = zzdyVar2.zzd();
                        int iZze = zzdyVar2.zze();
                        boolean z2 = false;
                        while (iZzd3 < iZze && !z2) {
                            int i2 = iZzd3 + 1;
                            z2 = ((char) zzdyVar2.zzN()[iZzd3]) == ')';
                            iZzd3 = i2;
                        }
                        strTrim = zzdyVar2.zzB((iZzd3 - 1) - zzdyVar2.zzd(), StandardCharsets.UTF_8).trim();
                    } else {
                        strTrim = null;
                    }
                    if (!")".equals(zza(zzdyVar2, sb))) {
                        strTrim = null;
                    }
                }
            } else {
                strTrim = null;
            }
            if (strTrim == null || !"{".equals(zza(this.zzc, this.zzd))) {
                break;
            }
            zzaln zzalnVar = new zzaln();
            if (!"".equals(strTrim)) {
                int iIndexOf = strTrim.indexOf(91);
                if (iIndexOf != -1) {
                    Matcher matcher2 = zza.matcher(strTrim.substring(iIndexOf));
                    if (matcher2.matches()) {
                        String strGroup2 = matcher2.group(1);
                        strGroup2.getClass();
                        zzalnVar.zzv(strGroup2);
                    }
                    strTrim = strTrim.substring(i, iIndexOf);
                }
                int i3 = zzei.zza;
                String[] strArrSplit = strTrim.split("\\.", -1);
                String str = strArrSplit[i];
                int iIndexOf2 = str.indexOf(35);
                if (iIndexOf2 != -1) {
                    zzalnVar.zzu(str.substring(i, iIndexOf2));
                    zzalnVar.zzt(str.substring(iIndexOf2 + 1));
                } else {
                    zzalnVar.zzu(str);
                }
                int length = strArrSplit.length;
                if (length > 1) {
                    zzalnVar.zzs((String[]) Arrays.copyOfRange(strArrSplit, 1, length));
                }
            }
            boolean z3 = false;
            String strZza2 = null;
            while (!z3) {
                zzdy zzdyVar3 = this.zzc;
                StringBuilder sb2 = this.zzd;
                int iZzd4 = zzdyVar3.zzd();
                strZza2 = zza(zzdyVar3, sb2);
                z3 = strZza2 == null || "}".equals(strZza2);
                if (!z3) {
                    this.zzc.zzL(iZzd4);
                    zzdy zzdyVar4 = this.zzc;
                    StringBuilder sb3 = this.zzd;
                    zzc(zzdyVar4);
                    String strZzd = zzd(zzdyVar4, sb3);
                    if (!"".equals(strZzd) && ":".equals(zza(zzdyVar4, sb3))) {
                        zzc(zzdyVar4);
                        StringBuilder sb4 = new StringBuilder();
                        boolean z4 = false;
                        while (true) {
                            if (z4) {
                                string = sb4.toString();
                                break;
                            }
                            int iZzd5 = zzdyVar4.zzd();
                            String strZza3 = zza(zzdyVar4, sb3);
                            if (strZza3 == null) {
                                string = null;
                                break;
                            }
                            if ("}".equals(strZza3) || ";".equals(strZza3)) {
                                zzdyVar4.zzL(iZzd5);
                                z4 = true;
                            } else {
                                sb4.append(strZza3);
                            }
                        }
                        if (string != null && !"".equals(string)) {
                            int iZzd6 = zzdyVar4.zzd();
                            String strZza4 = zza(zzdyVar4, sb3);
                            if (";".equals(strZza4)) {
                                if ("color".equals(strZzd)) {
                                    zzalnVar.zzk(zzcz.zza(string));
                                } else if ("background-color".equals(strZzd)) {
                                    zzalnVar.zzh(zzcz.zza(string));
                                } else if ("ruby-position".equals(strZzd)) {
                                    if ("over".equals(string)) {
                                        zzalnVar.zzp(1);
                                    } else if ("under".equals(string)) {
                                        zzalnVar.zzp(2);
                                    }
                                } else if ("text-combine-upright".equals(strZzd)) {
                                    if ("all".equals(string)) {
                                        z = true;
                                    } else {
                                        z = true;
                                    }
                                    zzalnVar.zzj(z);
                                } else if ("text-decoration".equals(strZzd)) {
                                    if (TtmlNode.UNDERLINE.equals(string)) {
                                        zzalnVar.zzq(true);
                                    }
                                } else if ("font-family".equals(strZzd)) {
                                    zzalnVar.zzl(string);
                                } else if ("font-weight".equals(strZzd)) {
                                    if (TtmlNode.BOLD.equals(string)) {
                                        zzalnVar.zzi(true);
                                    }
                                } else if ("font-style".equals(strZzd)) {
                                    if (TtmlNode.ITALIC.equals(string)) {
                                        zzalnVar.zzo(true);
                                    }
                                } else if ("font-size".equals(strZzd)) {
                                    matcher = zzb.matcher(zzftt.zza(string));
                                    if (matcher.matches()) {
                                        strGroup = matcher.group(2);
                                        strGroup.getClass();
                                        iHashCode = strGroup.hashCode();
                                        if (iHashCode != 37) {
                                            if (iHashCode != 3240) {
                                                if (iHashCode != 3592) {
                                                    b = -1;
                                                } else {
                                                    b = 0;
                                                }
                                            } else if (strGroup.equals("em")) {
                                                b = 1;
                                            } else {
                                                b = -1;
                                            }
                                        } else if (strGroup.equals("%")) {
                                            b = 2;
                                        } else {
                                            b = -1;
                                        }
                                        if (b != 0) {
                                            zzalnVar.zzn(1);
                                        } else if (b != 1) {
                                            zzalnVar.zzn(2);
                                        } else {
                                            if (b == 2) {
                                                throw new IllegalStateException();
                                            }
                                            zzalnVar.zzn(3);
                                        }
                                        String strGroup3 = matcher.group(1);
                                        strGroup3.getClass();
                                        zzalnVar.zzm(Float.parseFloat(strGroup3));
                                    } else {
                                        zzdo.zzf("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                    }
                                } else {
                                    continue;
                                }
                            } else if ("}".equals(strZza4)) {
                                zzdyVar4.zzL(iZzd6);
                                if ("color".equals(strZzd)) {
                                    zzalnVar.zzk(zzcz.zza(string));
                                } else if ("background-color".equals(strZzd)) {
                                    zzalnVar.zzh(zzcz.zza(string));
                                } else if ("ruby-position".equals(strZzd)) {
                                    if ("over".equals(string)) {
                                        zzalnVar.zzp(1);
                                    } else if ("under".equals(string)) {
                                        zzalnVar.zzp(2);
                                    }
                                } else if ("text-combine-upright".equals(strZzd)) {
                                    if ("all".equals(string) || string.startsWith("digits")) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    zzalnVar.zzj(z);
                                } else if ("text-decoration".equals(strZzd)) {
                                    if (TtmlNode.UNDERLINE.equals(string)) {
                                        zzalnVar.zzq(true);
                                    }
                                } else if ("font-family".equals(strZzd)) {
                                    zzalnVar.zzl(string);
                                } else if ("font-weight".equals(strZzd)) {
                                    if (TtmlNode.BOLD.equals(string)) {
                                        zzalnVar.zzi(true);
                                    }
                                } else if ("font-style".equals(strZzd)) {
                                    if (TtmlNode.ITALIC.equals(string)) {
                                        zzalnVar.zzo(true);
                                    }
                                } else if ("font-size".equals(strZzd)) {
                                    matcher = zzb.matcher(zzftt.zza(string));
                                    if (matcher.matches()) {
                                        zzdo.zzf("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                    } else {
                                        strGroup = matcher.group(2);
                                        strGroup.getClass();
                                        iHashCode = strGroup.hashCode();
                                        if (iHashCode != 37) {
                                            if (iHashCode != 3240) {
                                                if (iHashCode != 3592 && strGroup.equals("px")) {
                                                    b = 0;
                                                } else {
                                                    b = -1;
                                                }
                                            } else if (strGroup.equals("em")) {
                                                b = 1;
                                            } else {
                                                b = -1;
                                            }
                                        } else if (strGroup.equals("%")) {
                                            b = 2;
                                        } else {
                                            b = -1;
                                        }
                                        if (b != 0) {
                                            zzalnVar.zzn(1);
                                        } else if (b != 1) {
                                            zzalnVar.zzn(2);
                                        } else {
                                            if (b == 2) {
                                                throw new IllegalStateException();
                                            }
                                            zzalnVar.zzn(3);
                                        }
                                        String strGroup4 = matcher.group(1);
                                        strGroup4.getClass();
                                        zzalnVar.zzm(Float.parseFloat(strGroup4));
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
            }
            if ("}".equals(strZza2)) {
                arrayList.add(zzalnVar);
            }
            i = 0;
        }
        return arrayList;
    }
}
