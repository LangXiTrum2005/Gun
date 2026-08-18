package com.google.android.gms.internal.ads;

import android.text.Layout;
import androidx.annotation.Nullable;
import com.efs.sdk.base.Constants;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.umeng.analytics.pro.bc;
import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class zzalf implements zzakf {
    private final XmlPullParserFactory zzi;
    private static final Pattern zzc = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern zzd = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern zze = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    static final Pattern zza = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final Pattern zzb = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    private static final Pattern zzf = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    private static final Pattern zzg = Pattern.compile("^(\\d+) (\\d+)$");
    private static final zzald zzh = new zzald(30.0f, 1, 1);

    public zzalf() {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.zzi = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00f5  */
    private static long zzc(String str, zzald zzaldVar) throws zzakb {
        double d;
        double d2;
        Matcher matcher = zzc.matcher(str);
        byte b = 2;
        if (matcher.matches()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            long j = Long.parseLong(strGroup) * 3600;
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            long j2 = Long.parseLong(strGroup2) * 60;
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            double d3 = j + j2;
            double d4 = Long.parseLong(strGroup3);
            String strGroup4 = matcher.group(4);
            double d5 = 0.0d;
            double d6 = strGroup4 != null ? Double.parseDouble(strGroup4) : 0.0d;
            double d7 = d3 + d4;
            String strGroup5 = matcher.group(5);
            double d8 = strGroup5 != null ? Long.parseLong(strGroup5) / zzaldVar.zza : 0.0d;
            double d9 = d7 + d6;
            String strGroup6 = matcher.group(6);
            if (strGroup6 != null) {
                d5 = (Long.parseLong(strGroup6) / ((double) zzaldVar.zzb)) / ((double) zzaldVar.zza);
            }
            return (long) ((d9 + d8 + d5) * 1000000.0d);
        }
        Matcher matcher2 = zzd.matcher(str);
        if (!matcher2.matches()) {
            throw new zzakb("Malformed time expression: ".concat(String.valueOf(str)));
        }
        String strGroup7 = matcher2.group(1);
        strGroup7.getClass();
        double d10 = Double.parseDouble(strGroup7);
        String strGroup8 = matcher2.group(2);
        strGroup8.getClass();
        int iHashCode = strGroup8.hashCode();
        if (iHashCode != 102) {
            if (iHashCode != 104) {
                if (iHashCode != 109) {
                    if (iHashCode != 3494) {
                        if (iHashCode != 115) {
                            if (iHashCode == 116 && strGroup8.equals(bc.aO)) {
                                b = 5;
                            } else {
                                b = -1;
                            }
                        } else if (!strGroup8.equals(bc.aH)) {
                            b = -1;
                        }
                    } else if (strGroup8.equals("ms")) {
                        b = 3;
                    } else {
                        b = -1;
                    }
                } else if (strGroup8.equals("m")) {
                    b = 1;
                } else {
                    b = -1;
                }
            } else if (strGroup8.equals(bc.aM)) {
                b = 0;
            } else {
                b = -1;
            }
        } else if (strGroup8.equals("f")) {
            b = 4;
        } else {
            b = -1;
        }
        if (b != 0) {
            if (b != 1) {
                if (b == 3) {
                    d2 = 1000.0d;
                } else if (b == 4) {
                    d2 = zzaldVar.zza;
                } else if (b == 5) {
                    d2 = zzaldVar.zzc;
                }
                d10 /= d2;
            } else {
                d = 60.0d;
            }
            return (long) (d10 * 1000000.0d);
        }
        d = 3600.0d;
        d10 *= d;
        return (long) (d10 * 1000000.0d);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    @Nullable
    private static Layout.Alignment zzd(String str) {
        byte b;
        switch (zzftt.zza(str)) {
            case "center":
                b = 4;
                break;
            case "end":
                b = 3;
                break;
            case "left":
                b = 0;
                break;
            case "right":
                b = 2;
                break;
            case "start":
                b = 1;
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0 || b == 1) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        if (b == 2 || b == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (b != 4) {
            return null;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private static zzali zze(@Nullable zzali zzaliVar) {
        return zzaliVar == null ? new zzali() : zzaliVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:52:0x00c0  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static zzali zzf(XmlPullParser xmlPullParser, zzali zzaliVar) {
        Matcher matcher;
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeValue = xmlPullParser.getAttributeValue(i);
            String attributeName = xmlPullParser.getAttributeName(i);
            byte b = 5;
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_FONT_STYLE)) {
                        b = 6;
                    } else {
                        b = -1;
                    }
                    break;
                case -1224696685:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_FONT_FAMILY)) {
                        b = 3;
                    } else {
                        b = -1;
                    }
                    break;
                case -1065511464:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_TEXT_ALIGN)) {
                        b = 7;
                    } else {
                        b = -1;
                    }
                    break;
                case -879295043:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_TEXT_DECORATION)) {
                        b = 12;
                    } else {
                        b = -1;
                    }
                    break;
                case -734428249:
                    if (!attributeName.equals(TtmlNode.ATTR_TTS_FONT_WEIGHT)) {
                        b = -1;
                    }
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        b = 0;
                    } else {
                        b = -1;
                    }
                    break;
                case 3511770:
                    if (attributeName.equals("ruby")) {
                        b = 10;
                    } else {
                        b = -1;
                    }
                    break;
                case 94842723:
                    if (attributeName.equals("color")) {
                        b = 2;
                    } else {
                        b = -1;
                    }
                    break;
                case 109403361:
                    if (attributeName.equals("shear")) {
                        b = cw.l;
                    } else {
                        b = -1;
                    }
                    break;
                case 110138194:
                    if (attributeName.equals("textCombine")) {
                        b = 9;
                    } else {
                        b = -1;
                    }
                    break;
                case 365601008:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_FONT_SIZE)) {
                        b = 4;
                    } else {
                        b = -1;
                    }
                    break;
                case 921125321:
                    if (attributeName.equals("textEmphasis")) {
                        b = cw.k;
                    } else {
                        b = -1;
                    }
                    break;
                case 1115953443:
                    if (attributeName.equals("rubyPosition")) {
                        b = 11;
                    } else {
                        b = -1;
                    }
                    break;
                case 1287124693:
                    if (attributeName.equals(TtmlNode.ATTR_TTS_BACKGROUND_COLOR)) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                    break;
                case 1754920356:
                    if (attributeName.equals("multiRowAlign")) {
                        b = 8;
                    } else {
                        b = -1;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                    if (TtmlNode.TAG_STYLE.equals(xmlPullParser.getName())) {
                        zzaliVar = zze(zzaliVar);
                        zzaliVar.zzs(attributeValue);
                    }
                    break;
                case 1:
                    zzaliVar = zze(zzaliVar);
                    try {
                        zzaliVar.zzm(zzcz.zzb(attributeValue));
                    } catch (IllegalArgumentException unused) {
                        AbstractC3888ke0.w(attributeValue, "Failed parsing background value: ", "TtmlParser");
                    }
                    break;
                case 2:
                    zzaliVar = zze(zzaliVar);
                    try {
                        zzaliVar.zzo(zzcz.zzb(attributeValue));
                    } catch (IllegalArgumentException unused2) {
                        AbstractC3888ke0.w(attributeValue, "Failed parsing color value: ", "TtmlParser");
                    }
                    break;
                case 3:
                    zzaliVar = zze(zzaliVar);
                    zzaliVar.zzp(attributeValue);
                    break;
                case 4:
                    try {
                        zzaliVar = zze(zzaliVar);
                        int i2 = zzei.zza;
                        String[] strArrSplit = attributeValue.split("\\s+", -1);
                        int length = strArrSplit.length;
                        if (length == 1) {
                            matcher = zze.matcher(attributeValue);
                        } else {
                            if (length != 2) {
                                throw new zzakb("Invalid number of entries for fontSize: " + length + ".");
                            }
                            matcher = zze.matcher(strArrSplit[1]);
                            zzdo.zzf("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
                        }
                        if (!matcher.matches()) {
                            throw new zzakb("Invalid expression for fontSize: '" + attributeValue + "'.");
                        }
                        String strGroup = matcher.group(3);
                        strGroup.getClass();
                        strGroup.hashCode();
                        switch (strGroup) {
                            case "%":
                                zzaliVar.zzr(3);
                                break;
                            case "em":
                                zzaliVar.zzr(2);
                                break;
                            case "px":
                                zzaliVar.zzr(1);
                                break;
                            default:
                                throw new zzakb("Invalid unit for fontSize: '" + strGroup + "'.");
                        }
                        String strGroup2 = matcher.group(1);
                        strGroup2.getClass();
                        zzaliVar.zzq(Float.parseFloat(strGroup2));
                    } catch (zzakb unused3) {
                        AbstractC3888ke0.w(attributeValue, "Failed parsing fontSize value: ", "TtmlParser");
                    }
                    break;
                case 5:
                    zzaliVar = zze(zzaliVar);
                    zzaliVar.zzn(TtmlNode.BOLD.equalsIgnoreCase(attributeValue));
                    break;
                case 6:
                    zzaliVar = zze(zzaliVar);
                    zzaliVar.zzt(TtmlNode.ITALIC.equalsIgnoreCase(attributeValue));
                    break;
                case 7:
                    zzaliVar = zze(zzaliVar);
                    zzaliVar.zzz(zzd(attributeValue));
                    break;
                case 8:
                    zzaliVar = zze(zzaliVar);
                    zzaliVar.zzv(zzd(attributeValue));
                    break;
                case 9:
                    String strZza = zzftt.zza(attributeValue);
                    strZza.hashCode();
                    if (strZza.equals(Constants.CP_NONE)) {
                        zzaliVar = zze(zzaliVar);
                        zzaliVar.zzA(false);
                    } else if (strZza.equals("all")) {
                        zzaliVar = zze(zzaliVar);
                        zzaliVar.zzA(true);
                    }
                    break;
                case 10:
                    String strZza2 = zzftt.zza(attributeValue);
                    strZza2.hashCode();
                    switch (strZza2) {
                        case "baseContainer":
                        case "base":
                            zzaliVar = zze(zzaliVar);
                            zzaliVar.zzx(2);
                            break;
                        case "container":
                            zzaliVar = zze(zzaliVar);
                            zzaliVar.zzx(1);
                            break;
                        case "delimiter":
                            zzaliVar = zze(zzaliVar);
                            zzaliVar.zzx(4);
                            break;
                        case "textContainer":
                        case "text":
                            zzaliVar = zze(zzaliVar);
                            zzaliVar.zzx(3);
                            break;
                    }
                    break;
                case 11:
                    String strZza3 = zzftt.zza(attributeValue);
                    strZza3.hashCode();
                    if (strZza3.equals("after")) {
                        zzaliVar = zze(zzaliVar);
                        zzaliVar.zzw(2);
                    } else if (strZza3.equals("before")) {
                        zzaliVar = zze(zzaliVar);
                        zzaliVar.zzw(1);
                    }
                    break;
                case 12:
                    String strZza4 = zzftt.zza(attributeValue);
                    strZza4.hashCode();
                    switch (strZza4) {
                        case "nounderline":
                            zzaliVar = zze(zzaliVar);
                            zzaliVar.zzC(false);
                            break;
                        case "underline":
                            zzaliVar = zze(zzaliVar);
                            zzaliVar.zzC(true);
                            break;
                        case "nolinethrough":
                            zzaliVar = zze(zzaliVar);
                            zzaliVar.zzu(false);
                            break;
                        case "linethrough":
                            zzaliVar = zze(zzaliVar);
                            zzaliVar.zzu(true);
                            break;
                    }
                    break;
                case 13:
                    zzaliVar = zze(zzaliVar);
                    zzaliVar.zzB(zzalb.zza(attributeValue));
                    break;
                case 14:
                    zzaliVar = zze(zzaliVar);
                    Matcher matcher2 = zza.matcher(attributeValue);
                    float fMin = Float.MAX_VALUE;
                    if (matcher2.matches()) {
                        try {
                            String strGroup3 = matcher2.group(1);
                            strGroup3.getClass();
                            fMin = Math.min(100.0f, Math.max(-100.0f, Float.parseFloat(strGroup3)));
                        } catch (NumberFormatException e) {
                            zzdo.zzg("TtmlParser", "Failed to parse shear: ".concat(String.valueOf(attributeValue)), e);
                        }
                    } else {
                        AbstractC3888ke0.w(attributeValue, "Invalid value for shear: ", "TtmlParser");
                    }
                    zzaliVar.zzy(fMin);
                    break;
            }
        }
        return zzaliVar;
    }

    private static String[] zzg(String str) {
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return new String[0];
        }
        int i = zzei.zza;
        return strTrim.split("\\s+", -1);
    }

    @Override // com.google.android.gms.internal.ads.zzakf
    public final void zza(byte[] bArr, int i, int i2, zzake zzakeVar, zzdb zzdbVar) {
        zzajz.zza(zzb(bArr, i, i2), zzakeVar, zzdbVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:121:0x0286 A[Catch: IOException -> 0x008e, XmlPullParserException -> 0x0092, TryCatch #18 {IOException -> 0x008e, XmlPullParserException -> 0x0092, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x0081, B:16:0x0089, B:22:0x0098, B:25:0x00a4, B:29:0x00b6, B:31:0x00d5, B:33:0x00e3, B:35:0x00ea, B:37:0x00f6, B:39:0x0101, B:69:0x018f, B:87:0x01e9, B:90:0x01f7, B:92:0x01fd, B:94:0x0205, B:96:0x020d, B:98:0x0215, B:100:0x021d, B:102:0x0225, B:104:0x022b, B:106:0x0233, B:108:0x023b, B:110:0x0241, B:112:0x0247, B:114:0x024f, B:116:0x0257, B:119:0x0260, B:391:0x06c8, B:121:0x0286, B:123:0x028c, B:125:0x0295, B:127:0x02a4, B:129:0x02ae, B:131:0x02c2, B:133:0x02c8, B:261:0x04fa, B:136:0x02d3, B:138:0x02db, B:140:0x02e1, B:142:0x02ec, B:144:0x02f4, B:145:0x02fb, B:148:0x0302, B:260:0x04f3, B:152:0x0311, B:154:0x0319, B:158:0x0332, B:160:0x0339, B:162:0x0347, B:178:0x0391, B:180:0x0397, B:183:0x03a6, B:185:0x03ad, B:187:0x03bb, B:202:0x040a, B:204:0x0412, B:224:0x0457, B:226:0x045f, B:252:0x04a7, B:189:0x03c6, B:190:0x03d1, B:193:0x03d9, B:196:0x03e5, B:198:0x03ec, B:200:0x03f8, B:253:0x04b3, B:254:0x04be, B:255:0x04c9, B:165:0x0350, B:166:0x035a, B:169:0x0364, B:172:0x036f, B:174:0x0376, B:176:0x0382, B:256:0x04d0, B:257:0x04db, B:258:0x04e6, B:266:0x0516, B:269:0x0533, B:325:0x05d9, B:303:0x058f, B:306:0x0598, B:366:0x0657, B:313:0x05aa, B:316:0x05b4, B:320:0x05c2, B:323:0x05ca, B:324:0x05d2, B:330:0x05ea, B:334:0x05f6, B:338:0x05ff, B:346:0x0612, B:353:0x0623, B:355:0x0633, B:357:0x0638, B:348:0x0619, B:72:0x0197, B:74:0x01a3, B:77:0x01ae, B:79:0x01b5, B:81:0x01c1, B:83:0x01cb, B:43:0x011b, B:46:0x0129, B:49:0x0132, B:51:0x0139, B:53:0x0140, B:55:0x0147, B:61:0x015d, B:63:0x0164, B:68:0x0187, B:371:0x0677, B:375:0x0688, B:377:0x0692, B:379:0x069f, B:381:0x06a7, B:385:0x06ba, B:389:0x06c2), top: B:433:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x028c A[Catch: IOException -> 0x008e, XmlPullParserException -> 0x0092, LOOP:1: B:123:0x028c->B:264:0x0506, LOOP_START, PHI: r5 r6 r11 r28
  0x028c: PHI (r5v36 java.util.HashMap) = (r5v1 java.util.HashMap), (r5v74 java.util.HashMap) binds: [B:122:0x028a, B:264:0x0506] A[DONT_GENERATE, DONT_INLINE]
  0x028c: PHI (r6v6 java.lang.String) = (r6v3 java.lang.String), (r6v23 java.lang.String) binds: [B:122:0x028a, B:264:0x0506] A[DONT_GENERATE, DONT_INLINE]
  0x028c: PHI (r11v8 com.google.android.gms.internal.ads.zzald) = (r11v5 com.google.android.gms.internal.ads.zzald), (r11v20 com.google.android.gms.internal.ads.zzald) binds: [B:122:0x028a, B:264:0x0506] A[DONT_GENERATE, DONT_INLINE]
  0x028c: PHI (r28v11 java.util.HashMap) = (r28v1 java.util.HashMap), (r28v12 java.util.HashMap) binds: [B:122:0x028a, B:264:0x0506] A[DONT_GENERATE, DONT_INLINE], TryCatch #18 {IOException -> 0x008e, XmlPullParserException -> 0x0092, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x0081, B:16:0x0089, B:22:0x0098, B:25:0x00a4, B:29:0x00b6, B:31:0x00d5, B:33:0x00e3, B:35:0x00ea, B:37:0x00f6, B:39:0x0101, B:69:0x018f, B:87:0x01e9, B:90:0x01f7, B:92:0x01fd, B:94:0x0205, B:96:0x020d, B:98:0x0215, B:100:0x021d, B:102:0x0225, B:104:0x022b, B:106:0x0233, B:108:0x023b, B:110:0x0241, B:112:0x0247, B:114:0x024f, B:116:0x0257, B:119:0x0260, B:391:0x06c8, B:121:0x0286, B:123:0x028c, B:125:0x0295, B:127:0x02a4, B:129:0x02ae, B:131:0x02c2, B:133:0x02c8, B:261:0x04fa, B:136:0x02d3, B:138:0x02db, B:140:0x02e1, B:142:0x02ec, B:144:0x02f4, B:145:0x02fb, B:148:0x0302, B:260:0x04f3, B:152:0x0311, B:154:0x0319, B:158:0x0332, B:160:0x0339, B:162:0x0347, B:178:0x0391, B:180:0x0397, B:183:0x03a6, B:185:0x03ad, B:187:0x03bb, B:202:0x040a, B:204:0x0412, B:224:0x0457, B:226:0x045f, B:252:0x04a7, B:189:0x03c6, B:190:0x03d1, B:193:0x03d9, B:196:0x03e5, B:198:0x03ec, B:200:0x03f8, B:253:0x04b3, B:254:0x04be, B:255:0x04c9, B:165:0x0350, B:166:0x035a, B:169:0x0364, B:172:0x036f, B:174:0x0376, B:176:0x0382, B:256:0x04d0, B:257:0x04db, B:258:0x04e6, B:266:0x0516, B:269:0x0533, B:325:0x05d9, B:303:0x058f, B:306:0x0598, B:366:0x0657, B:313:0x05aa, B:316:0x05b4, B:320:0x05c2, B:323:0x05ca, B:324:0x05d2, B:330:0x05ea, B:334:0x05f6, B:338:0x05ff, B:346:0x0612, B:353:0x0623, B:355:0x0633, B:357:0x0638, B:348:0x0619, B:72:0x0197, B:74:0x01a3, B:77:0x01ae, B:79:0x01b5, B:81:0x01c1, B:83:0x01cb, B:43:0x011b, B:46:0x0129, B:49:0x0132, B:51:0x0139, B:53:0x0140, B:55:0x0147, B:61:0x015d, B:63:0x0164, B:68:0x0187, B:371:0x0677, B:375:0x0688, B:377:0x0692, B:379:0x069f, B:381:0x06a7, B:385:0x06ba, B:389:0x06c2), top: B:433:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x0295 A[Catch: IOException -> 0x008e, XmlPullParserException -> 0x0092, TryCatch #18 {IOException -> 0x008e, XmlPullParserException -> 0x0092, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x0081, B:16:0x0089, B:22:0x0098, B:25:0x00a4, B:29:0x00b6, B:31:0x00d5, B:33:0x00e3, B:35:0x00ea, B:37:0x00f6, B:39:0x0101, B:69:0x018f, B:87:0x01e9, B:90:0x01f7, B:92:0x01fd, B:94:0x0205, B:96:0x020d, B:98:0x0215, B:100:0x021d, B:102:0x0225, B:104:0x022b, B:106:0x0233, B:108:0x023b, B:110:0x0241, B:112:0x0247, B:114:0x024f, B:116:0x0257, B:119:0x0260, B:391:0x06c8, B:121:0x0286, B:123:0x028c, B:125:0x0295, B:127:0x02a4, B:129:0x02ae, B:131:0x02c2, B:133:0x02c8, B:261:0x04fa, B:136:0x02d3, B:138:0x02db, B:140:0x02e1, B:142:0x02ec, B:144:0x02f4, B:145:0x02fb, B:148:0x0302, B:260:0x04f3, B:152:0x0311, B:154:0x0319, B:158:0x0332, B:160:0x0339, B:162:0x0347, B:178:0x0391, B:180:0x0397, B:183:0x03a6, B:185:0x03ad, B:187:0x03bb, B:202:0x040a, B:204:0x0412, B:224:0x0457, B:226:0x045f, B:252:0x04a7, B:189:0x03c6, B:190:0x03d1, B:193:0x03d9, B:196:0x03e5, B:198:0x03ec, B:200:0x03f8, B:253:0x04b3, B:254:0x04be, B:255:0x04c9, B:165:0x0350, B:166:0x035a, B:169:0x0364, B:172:0x036f, B:174:0x0376, B:176:0x0382, B:256:0x04d0, B:257:0x04db, B:258:0x04e6, B:266:0x0516, B:269:0x0533, B:325:0x05d9, B:303:0x058f, B:306:0x0598, B:366:0x0657, B:313:0x05aa, B:316:0x05b4, B:320:0x05c2, B:323:0x05ca, B:324:0x05d2, B:330:0x05ea, B:334:0x05f6, B:338:0x05ff, B:346:0x0612, B:353:0x0623, B:355:0x0633, B:357:0x0638, B:348:0x0619, B:72:0x0197, B:74:0x01a3, B:77:0x01ae, B:79:0x01b5, B:81:0x01c1, B:83:0x01cb, B:43:0x011b, B:46:0x0129, B:49:0x0132, B:51:0x0139, B:53:0x0140, B:55:0x0147, B:61:0x015d, B:63:0x0164, B:68:0x0187, B:371:0x0677, B:375:0x0688, B:377:0x0692, B:379:0x069f, B:381:0x06a7, B:385:0x06ba, B:389:0x06c2), top: B:433:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:127:0x02a4 A[Catch: IOException -> 0x008e, XmlPullParserException -> 0x0092, TryCatch #18 {IOException -> 0x008e, XmlPullParserException -> 0x0092, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x0081, B:16:0x0089, B:22:0x0098, B:25:0x00a4, B:29:0x00b6, B:31:0x00d5, B:33:0x00e3, B:35:0x00ea, B:37:0x00f6, B:39:0x0101, B:69:0x018f, B:87:0x01e9, B:90:0x01f7, B:92:0x01fd, B:94:0x0205, B:96:0x020d, B:98:0x0215, B:100:0x021d, B:102:0x0225, B:104:0x022b, B:106:0x0233, B:108:0x023b, B:110:0x0241, B:112:0x0247, B:114:0x024f, B:116:0x0257, B:119:0x0260, B:391:0x06c8, B:121:0x0286, B:123:0x028c, B:125:0x0295, B:127:0x02a4, B:129:0x02ae, B:131:0x02c2, B:133:0x02c8, B:261:0x04fa, B:136:0x02d3, B:138:0x02db, B:140:0x02e1, B:142:0x02ec, B:144:0x02f4, B:145:0x02fb, B:148:0x0302, B:260:0x04f3, B:152:0x0311, B:154:0x0319, B:158:0x0332, B:160:0x0339, B:162:0x0347, B:178:0x0391, B:180:0x0397, B:183:0x03a6, B:185:0x03ad, B:187:0x03bb, B:202:0x040a, B:204:0x0412, B:224:0x0457, B:226:0x045f, B:252:0x04a7, B:189:0x03c6, B:190:0x03d1, B:193:0x03d9, B:196:0x03e5, B:198:0x03ec, B:200:0x03f8, B:253:0x04b3, B:254:0x04be, B:255:0x04c9, B:165:0x0350, B:166:0x035a, B:169:0x0364, B:172:0x036f, B:174:0x0376, B:176:0x0382, B:256:0x04d0, B:257:0x04db, B:258:0x04e6, B:266:0x0516, B:269:0x0533, B:325:0x05d9, B:303:0x058f, B:306:0x0598, B:366:0x0657, B:313:0x05aa, B:316:0x05b4, B:320:0x05c2, B:323:0x05ca, B:324:0x05d2, B:330:0x05ea, B:334:0x05f6, B:338:0x05ff, B:346:0x0612, B:353:0x0623, B:355:0x0633, B:357:0x0638, B:348:0x0619, B:72:0x0197, B:74:0x01a3, B:77:0x01ae, B:79:0x01b5, B:81:0x01c1, B:83:0x01cb, B:43:0x011b, B:46:0x0129, B:49:0x0132, B:51:0x0139, B:53:0x0140, B:55:0x0147, B:61:0x015d, B:63:0x0164, B:68:0x0187, B:371:0x0677, B:375:0x0688, B:377:0x0692, B:379:0x069f, B:381:0x06a7, B:385:0x06ba, B:389:0x06c2), top: B:433:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x02ae A[Catch: IOException -> 0x008e, XmlPullParserException -> 0x0092, LOOP:2: B:128:0x02ac->B:129:0x02ae, LOOP_END, TryCatch #18 {IOException -> 0x008e, XmlPullParserException -> 0x0092, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x0081, B:16:0x0089, B:22:0x0098, B:25:0x00a4, B:29:0x00b6, B:31:0x00d5, B:33:0x00e3, B:35:0x00ea, B:37:0x00f6, B:39:0x0101, B:69:0x018f, B:87:0x01e9, B:90:0x01f7, B:92:0x01fd, B:94:0x0205, B:96:0x020d, B:98:0x0215, B:100:0x021d, B:102:0x0225, B:104:0x022b, B:106:0x0233, B:108:0x023b, B:110:0x0241, B:112:0x0247, B:114:0x024f, B:116:0x0257, B:119:0x0260, B:391:0x06c8, B:121:0x0286, B:123:0x028c, B:125:0x0295, B:127:0x02a4, B:129:0x02ae, B:131:0x02c2, B:133:0x02c8, B:261:0x04fa, B:136:0x02d3, B:138:0x02db, B:140:0x02e1, B:142:0x02ec, B:144:0x02f4, B:145:0x02fb, B:148:0x0302, B:260:0x04f3, B:152:0x0311, B:154:0x0319, B:158:0x0332, B:160:0x0339, B:162:0x0347, B:178:0x0391, B:180:0x0397, B:183:0x03a6, B:185:0x03ad, B:187:0x03bb, B:202:0x040a, B:204:0x0412, B:224:0x0457, B:226:0x045f, B:252:0x04a7, B:189:0x03c6, B:190:0x03d1, B:193:0x03d9, B:196:0x03e5, B:198:0x03ec, B:200:0x03f8, B:253:0x04b3, B:254:0x04be, B:255:0x04c9, B:165:0x0350, B:166:0x035a, B:169:0x0364, B:172:0x036f, B:174:0x0376, B:176:0x0382, B:256:0x04d0, B:257:0x04db, B:258:0x04e6, B:266:0x0516, B:269:0x0533, B:325:0x05d9, B:303:0x058f, B:306:0x0598, B:366:0x0657, B:313:0x05aa, B:316:0x05b4, B:320:0x05c2, B:323:0x05ca, B:324:0x05d2, B:330:0x05ea, B:334:0x05f6, B:338:0x05ff, B:346:0x0612, B:353:0x0623, B:355:0x0633, B:357:0x0638, B:348:0x0619, B:72:0x0197, B:74:0x01a3, B:77:0x01ae, B:79:0x01b5, B:81:0x01c1, B:83:0x01cb, B:43:0x011b, B:46:0x0129, B:49:0x0132, B:51:0x0139, B:53:0x0140, B:55:0x0147, B:61:0x015d, B:63:0x0164, B:68:0x0187, B:371:0x0677, B:375:0x0688, B:377:0x0692, B:379:0x069f, B:381:0x06a7, B:385:0x06ba, B:389:0x06c2), top: B:433:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:130:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:133:0x02c8 A[Catch: IOException -> 0x008e, XmlPullParserException -> 0x0092, TryCatch #18 {IOException -> 0x008e, XmlPullParserException -> 0x0092, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x0081, B:16:0x0089, B:22:0x0098, B:25:0x00a4, B:29:0x00b6, B:31:0x00d5, B:33:0x00e3, B:35:0x00ea, B:37:0x00f6, B:39:0x0101, B:69:0x018f, B:87:0x01e9, B:90:0x01f7, B:92:0x01fd, B:94:0x0205, B:96:0x020d, B:98:0x0215, B:100:0x021d, B:102:0x0225, B:104:0x022b, B:106:0x0233, B:108:0x023b, B:110:0x0241, B:112:0x0247, B:114:0x024f, B:116:0x0257, B:119:0x0260, B:391:0x06c8, B:121:0x0286, B:123:0x028c, B:125:0x0295, B:127:0x02a4, B:129:0x02ae, B:131:0x02c2, B:133:0x02c8, B:261:0x04fa, B:136:0x02d3, B:138:0x02db, B:140:0x02e1, B:142:0x02ec, B:144:0x02f4, B:145:0x02fb, B:148:0x0302, B:260:0x04f3, B:152:0x0311, B:154:0x0319, B:158:0x0332, B:160:0x0339, B:162:0x0347, B:178:0x0391, B:180:0x0397, B:183:0x03a6, B:185:0x03ad, B:187:0x03bb, B:202:0x040a, B:204:0x0412, B:224:0x0457, B:226:0x045f, B:252:0x04a7, B:189:0x03c6, B:190:0x03d1, B:193:0x03d9, B:196:0x03e5, B:198:0x03ec, B:200:0x03f8, B:253:0x04b3, B:254:0x04be, B:255:0x04c9, B:165:0x0350, B:166:0x035a, B:169:0x0364, B:172:0x036f, B:174:0x0376, B:176:0x0382, B:256:0x04d0, B:257:0x04db, B:258:0x04e6, B:266:0x0516, B:269:0x0533, B:325:0x05d9, B:303:0x058f, B:306:0x0598, B:366:0x0657, B:313:0x05aa, B:316:0x05b4, B:320:0x05c2, B:323:0x05ca, B:324:0x05d2, B:330:0x05ea, B:334:0x05f6, B:338:0x05ff, B:346:0x0612, B:353:0x0623, B:355:0x0633, B:357:0x0638, B:348:0x0619, B:72:0x0197, B:74:0x01a3, B:77:0x01ae, B:79:0x01b5, B:81:0x01c1, B:83:0x01cb, B:43:0x011b, B:46:0x0129, B:49:0x0132, B:51:0x0139, B:53:0x0140, B:55:0x0147, B:61:0x015d, B:63:0x0164, B:68:0x0187, B:371:0x0677, B:375:0x0688, B:377:0x0692, B:379:0x069f, B:381:0x06a7, B:385:0x06ba, B:389:0x06c2), top: B:433:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x02cf A[PHI: r16 r17 r40
  0x02cf: PHI (r16v11 com.google.android.gms.internal.ads.zzald) = (r16v9 com.google.android.gms.internal.ads.zzald), (r16v12 com.google.android.gms.internal.ads.zzald) binds: [B:259:0x04f1, B:134:0x02cb] A[DONT_GENERATE, DONT_INLINE]
  0x02cf: PHI (r17v14 java.lang.String) = (r17v10 java.lang.String), (r17v15 java.lang.String) binds: [B:259:0x04f1, B:134:0x02cb] A[DONT_GENERATE, DONT_INLINE]
  0x02cf: PHI (r40v11 java.util.HashMap) = (r40v7 java.util.HashMap), (r40v12 java.util.HashMap) binds: [B:259:0x04f1, B:134:0x02cb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:136:0x02d3 A[Catch: IOException -> 0x008e, XmlPullParserException -> 0x0092, TryCatch #18 {IOException -> 0x008e, XmlPullParserException -> 0x0092, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x0081, B:16:0x0089, B:22:0x0098, B:25:0x00a4, B:29:0x00b6, B:31:0x00d5, B:33:0x00e3, B:35:0x00ea, B:37:0x00f6, B:39:0x0101, B:69:0x018f, B:87:0x01e9, B:90:0x01f7, B:92:0x01fd, B:94:0x0205, B:96:0x020d, B:98:0x0215, B:100:0x021d, B:102:0x0225, B:104:0x022b, B:106:0x0233, B:108:0x023b, B:110:0x0241, B:112:0x0247, B:114:0x024f, B:116:0x0257, B:119:0x0260, B:391:0x06c8, B:121:0x0286, B:123:0x028c, B:125:0x0295, B:127:0x02a4, B:129:0x02ae, B:131:0x02c2, B:133:0x02c8, B:261:0x04fa, B:136:0x02d3, B:138:0x02db, B:140:0x02e1, B:142:0x02ec, B:144:0x02f4, B:145:0x02fb, B:148:0x0302, B:260:0x04f3, B:152:0x0311, B:154:0x0319, B:158:0x0332, B:160:0x0339, B:162:0x0347, B:178:0x0391, B:180:0x0397, B:183:0x03a6, B:185:0x03ad, B:187:0x03bb, B:202:0x040a, B:204:0x0412, B:224:0x0457, B:226:0x045f, B:252:0x04a7, B:189:0x03c6, B:190:0x03d1, B:193:0x03d9, B:196:0x03e5, B:198:0x03ec, B:200:0x03f8, B:253:0x04b3, B:254:0x04be, B:255:0x04c9, B:165:0x0350, B:166:0x035a, B:169:0x0364, B:172:0x036f, B:174:0x0376, B:176:0x0382, B:256:0x04d0, B:257:0x04db, B:258:0x04e6, B:266:0x0516, B:269:0x0533, B:325:0x05d9, B:303:0x058f, B:306:0x0598, B:366:0x0657, B:313:0x05aa, B:316:0x05b4, B:320:0x05c2, B:323:0x05ca, B:324:0x05d2, B:330:0x05ea, B:334:0x05f6, B:338:0x05ff, B:346:0x0612, B:353:0x0623, B:355:0x0633, B:357:0x0638, B:348:0x0619, B:72:0x0197, B:74:0x01a3, B:77:0x01ae, B:79:0x01b5, B:81:0x01c1, B:83:0x01cb, B:43:0x011b, B:46:0x0129, B:49:0x0132, B:51:0x0139, B:53:0x0140, B:55:0x0147, B:61:0x015d, B:63:0x0164, B:68:0x0187, B:371:0x0677, B:375:0x0688, B:377:0x0692, B:379:0x069f, B:381:0x06a7, B:385:0x06ba, B:389:0x06c2), top: B:433:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:138:0x02db A[Catch: IOException -> 0x008e, XmlPullParserException -> 0x0092, TryCatch #18 {IOException -> 0x008e, XmlPullParserException -> 0x0092, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x0081, B:16:0x0089, B:22:0x0098, B:25:0x00a4, B:29:0x00b6, B:31:0x00d5, B:33:0x00e3, B:35:0x00ea, B:37:0x00f6, B:39:0x0101, B:69:0x018f, B:87:0x01e9, B:90:0x01f7, B:92:0x01fd, B:94:0x0205, B:96:0x020d, B:98:0x0215, B:100:0x021d, B:102:0x0225, B:104:0x022b, B:106:0x0233, B:108:0x023b, B:110:0x0241, B:112:0x0247, B:114:0x024f, B:116:0x0257, B:119:0x0260, B:391:0x06c8, B:121:0x0286, B:123:0x028c, B:125:0x0295, B:127:0x02a4, B:129:0x02ae, B:131:0x02c2, B:133:0x02c8, B:261:0x04fa, B:136:0x02d3, B:138:0x02db, B:140:0x02e1, B:142:0x02ec, B:144:0x02f4, B:145:0x02fb, B:148:0x0302, B:260:0x04f3, B:152:0x0311, B:154:0x0319, B:158:0x0332, B:160:0x0339, B:162:0x0347, B:178:0x0391, B:180:0x0397, B:183:0x03a6, B:185:0x03ad, B:187:0x03bb, B:202:0x040a, B:204:0x0412, B:224:0x0457, B:226:0x045f, B:252:0x04a7, B:189:0x03c6, B:190:0x03d1, B:193:0x03d9, B:196:0x03e5, B:198:0x03ec, B:200:0x03f8, B:253:0x04b3, B:254:0x04be, B:255:0x04c9, B:165:0x0350, B:166:0x035a, B:169:0x0364, B:172:0x036f, B:174:0x0376, B:176:0x0382, B:256:0x04d0, B:257:0x04db, B:258:0x04e6, B:266:0x0516, B:269:0x0533, B:325:0x05d9, B:303:0x058f, B:306:0x0598, B:366:0x0657, B:313:0x05aa, B:316:0x05b4, B:320:0x05c2, B:323:0x05ca, B:324:0x05d2, B:330:0x05ea, B:334:0x05f6, B:338:0x05ff, B:346:0x0612, B:353:0x0623, B:355:0x0633, B:357:0x0638, B:348:0x0619, B:72:0x0197, B:74:0x01a3, B:77:0x01ae, B:79:0x01b5, B:81:0x01c1, B:83:0x01cb, B:43:0x011b, B:46:0x0129, B:49:0x0132, B:51:0x0139, B:53:0x0140, B:55:0x0147, B:61:0x015d, B:63:0x0164, B:68:0x0187, B:371:0x0677, B:375:0x0688, B:377:0x0692, B:379:0x069f, B:381:0x06a7, B:385:0x06ba, B:389:0x06c2), top: B:433:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:140:0x02e1 A[Catch: IOException -> 0x008e, XmlPullParserException -> 0x0092, LOOP:3: B:140:0x02e1->B:439:?, LOOP_START, TryCatch #18 {IOException -> 0x008e, XmlPullParserException -> 0x0092, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x0081, B:16:0x0089, B:22:0x0098, B:25:0x00a4, B:29:0x00b6, B:31:0x00d5, B:33:0x00e3, B:35:0x00ea, B:37:0x00f6, B:39:0x0101, B:69:0x018f, B:87:0x01e9, B:90:0x01f7, B:92:0x01fd, B:94:0x0205, B:96:0x020d, B:98:0x0215, B:100:0x021d, B:102:0x0225, B:104:0x022b, B:106:0x0233, B:108:0x023b, B:110:0x0241, B:112:0x0247, B:114:0x024f, B:116:0x0257, B:119:0x0260, B:391:0x06c8, B:121:0x0286, B:123:0x028c, B:125:0x0295, B:127:0x02a4, B:129:0x02ae, B:131:0x02c2, B:133:0x02c8, B:261:0x04fa, B:136:0x02d3, B:138:0x02db, B:140:0x02e1, B:142:0x02ec, B:144:0x02f4, B:145:0x02fb, B:148:0x0302, B:260:0x04f3, B:152:0x0311, B:154:0x0319, B:158:0x0332, B:160:0x0339, B:162:0x0347, B:178:0x0391, B:180:0x0397, B:183:0x03a6, B:185:0x03ad, B:187:0x03bb, B:202:0x040a, B:204:0x0412, B:224:0x0457, B:226:0x045f, B:252:0x04a7, B:189:0x03c6, B:190:0x03d1, B:193:0x03d9, B:196:0x03e5, B:198:0x03ec, B:200:0x03f8, B:253:0x04b3, B:254:0x04be, B:255:0x04c9, B:165:0x0350, B:166:0x035a, B:169:0x0364, B:172:0x036f, B:174:0x0376, B:176:0x0382, B:256:0x04d0, B:257:0x04db, B:258:0x04e6, B:266:0x0516, B:269:0x0533, B:325:0x05d9, B:303:0x058f, B:306:0x0598, B:366:0x0657, B:313:0x05aa, B:316:0x05b4, B:320:0x05c2, B:323:0x05ca, B:324:0x05d2, B:330:0x05ea, B:334:0x05f6, B:338:0x05ff, B:346:0x0612, B:353:0x0623, B:355:0x0633, B:357:0x0638, B:348:0x0619, B:72:0x0197, B:74:0x01a3, B:77:0x01ae, B:79:0x01b5, B:81:0x01c1, B:83:0x01cb, B:43:0x011b, B:46:0x0129, B:49:0x0132, B:51:0x0139, B:53:0x0140, B:55:0x0147, B:61:0x015d, B:63:0x0164, B:68:0x0187, B:371:0x0677, B:375:0x0688, B:377:0x0692, B:379:0x069f, B:381:0x06a7, B:385:0x06ba, B:389:0x06c2), top: B:433:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:142:0x02ec A[Catch: IOException -> 0x008e, XmlPullParserException -> 0x0092, TryCatch #18 {IOException -> 0x008e, XmlPullParserException -> 0x0092, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x0081, B:16:0x0089, B:22:0x0098, B:25:0x00a4, B:29:0x00b6, B:31:0x00d5, B:33:0x00e3, B:35:0x00ea, B:37:0x00f6, B:39:0x0101, B:69:0x018f, B:87:0x01e9, B:90:0x01f7, B:92:0x01fd, B:94:0x0205, B:96:0x020d, B:98:0x0215, B:100:0x021d, B:102:0x0225, B:104:0x022b, B:106:0x0233, B:108:0x023b, B:110:0x0241, B:112:0x0247, B:114:0x024f, B:116:0x0257, B:119:0x0260, B:391:0x06c8, B:121:0x0286, B:123:0x028c, B:125:0x0295, B:127:0x02a4, B:129:0x02ae, B:131:0x02c2, B:133:0x02c8, B:261:0x04fa, B:136:0x02d3, B:138:0x02db, B:140:0x02e1, B:142:0x02ec, B:144:0x02f4, B:145:0x02fb, B:148:0x0302, B:260:0x04f3, B:152:0x0311, B:154:0x0319, B:158:0x0332, B:160:0x0339, B:162:0x0347, B:178:0x0391, B:180:0x0397, B:183:0x03a6, B:185:0x03ad, B:187:0x03bb, B:202:0x040a, B:204:0x0412, B:224:0x0457, B:226:0x045f, B:252:0x04a7, B:189:0x03c6, B:190:0x03d1, B:193:0x03d9, B:196:0x03e5, B:198:0x03ec, B:200:0x03f8, B:253:0x04b3, B:254:0x04be, B:255:0x04c9, B:165:0x0350, B:166:0x035a, B:169:0x0364, B:172:0x036f, B:174:0x0376, B:176:0x0382, B:256:0x04d0, B:257:0x04db, B:258:0x04e6, B:266:0x0516, B:269:0x0533, B:325:0x05d9, B:303:0x058f, B:306:0x0598, B:366:0x0657, B:313:0x05aa, B:316:0x05b4, B:320:0x05c2, B:323:0x05ca, B:324:0x05d2, B:330:0x05ea, B:334:0x05f6, B:338:0x05ff, B:346:0x0612, B:353:0x0623, B:355:0x0633, B:357:0x0638, B:348:0x0619, B:72:0x0197, B:74:0x01a3, B:77:0x01ae, B:79:0x01b5, B:81:0x01c1, B:83:0x01cb, B:43:0x011b, B:46:0x0129, B:49:0x0132, B:51:0x0139, B:53:0x0140, B:55:0x0147, B:61:0x015d, B:63:0x0164, B:68:0x0187, B:371:0x0677, B:375:0x0688, B:377:0x0692, B:379:0x069f, B:381:0x06a7, B:385:0x06ba, B:389:0x06c2), top: B:433:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:148:0x0302 A[Catch: IOException -> 0x008e, XmlPullParserException -> 0x0092, TryCatch #18 {IOException -> 0x008e, XmlPullParserException -> 0x0092, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x0081, B:16:0x0089, B:22:0x0098, B:25:0x00a4, B:29:0x00b6, B:31:0x00d5, B:33:0x00e3, B:35:0x00ea, B:37:0x00f6, B:39:0x0101, B:69:0x018f, B:87:0x01e9, B:90:0x01f7, B:92:0x01fd, B:94:0x0205, B:96:0x020d, B:98:0x0215, B:100:0x021d, B:102:0x0225, B:104:0x022b, B:106:0x0233, B:108:0x023b, B:110:0x0241, B:112:0x0247, B:114:0x024f, B:116:0x0257, B:119:0x0260, B:391:0x06c8, B:121:0x0286, B:123:0x028c, B:125:0x0295, B:127:0x02a4, B:129:0x02ae, B:131:0x02c2, B:133:0x02c8, B:261:0x04fa, B:136:0x02d3, B:138:0x02db, B:140:0x02e1, B:142:0x02ec, B:144:0x02f4, B:145:0x02fb, B:148:0x0302, B:260:0x04f3, B:152:0x0311, B:154:0x0319, B:158:0x0332, B:160:0x0339, B:162:0x0347, B:178:0x0391, B:180:0x0397, B:183:0x03a6, B:185:0x03ad, B:187:0x03bb, B:202:0x040a, B:204:0x0412, B:224:0x0457, B:226:0x045f, B:252:0x04a7, B:189:0x03c6, B:190:0x03d1, B:193:0x03d9, B:196:0x03e5, B:198:0x03ec, B:200:0x03f8, B:253:0x04b3, B:254:0x04be, B:255:0x04c9, B:165:0x0350, B:166:0x035a, B:169:0x0364, B:172:0x036f, B:174:0x0376, B:176:0x0382, B:256:0x04d0, B:257:0x04db, B:258:0x04e6, B:266:0x0516, B:269:0x0533, B:325:0x05d9, B:303:0x058f, B:306:0x0598, B:366:0x0657, B:313:0x05aa, B:316:0x05b4, B:320:0x05c2, B:323:0x05ca, B:324:0x05d2, B:330:0x05ea, B:334:0x05f6, B:338:0x05ff, B:346:0x0612, B:353:0x0623, B:355:0x0633, B:357:0x0638, B:348:0x0619, B:72:0x0197, B:74:0x01a3, B:77:0x01ae, B:79:0x01b5, B:81:0x01c1, B:83:0x01cb, B:43:0x011b, B:46:0x0129, B:49:0x0132, B:51:0x0139, B:53:0x0140, B:55:0x0147, B:61:0x015d, B:63:0x0164, B:68:0x0187, B:371:0x0677, B:375:0x0688, B:377:0x0692, B:379:0x069f, B:381:0x06a7, B:385:0x06ba, B:389:0x06c2), top: B:433:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:150:0x030a  */
    /* JADX WARN: Code duplicated, block: B:152:0x0311 A[Catch: IOException -> 0x008e, XmlPullParserException -> 0x0092, TryCatch #18 {IOException -> 0x008e, XmlPullParserException -> 0x0092, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x0081, B:16:0x0089, B:22:0x0098, B:25:0x00a4, B:29:0x00b6, B:31:0x00d5, B:33:0x00e3, B:35:0x00ea, B:37:0x00f6, B:39:0x0101, B:69:0x018f, B:87:0x01e9, B:90:0x01f7, B:92:0x01fd, B:94:0x0205, B:96:0x020d, B:98:0x0215, B:100:0x021d, B:102:0x0225, B:104:0x022b, B:106:0x0233, B:108:0x023b, B:110:0x0241, B:112:0x0247, B:114:0x024f, B:116:0x0257, B:119:0x0260, B:391:0x06c8, B:121:0x0286, B:123:0x028c, B:125:0x0295, B:127:0x02a4, B:129:0x02ae, B:131:0x02c2, B:133:0x02c8, B:261:0x04fa, B:136:0x02d3, B:138:0x02db, B:140:0x02e1, B:142:0x02ec, B:144:0x02f4, B:145:0x02fb, B:148:0x0302, B:260:0x04f3, B:152:0x0311, B:154:0x0319, B:158:0x0332, B:160:0x0339, B:162:0x0347, B:178:0x0391, B:180:0x0397, B:183:0x03a6, B:185:0x03ad, B:187:0x03bb, B:202:0x040a, B:204:0x0412, B:224:0x0457, B:226:0x045f, B:252:0x04a7, B:189:0x03c6, B:190:0x03d1, B:193:0x03d9, B:196:0x03e5, B:198:0x03ec, B:200:0x03f8, B:253:0x04b3, B:254:0x04be, B:255:0x04c9, B:165:0x0350, B:166:0x035a, B:169:0x0364, B:172:0x036f, B:174:0x0376, B:176:0x0382, B:256:0x04d0, B:257:0x04db, B:258:0x04e6, B:266:0x0516, B:269:0x0533, B:325:0x05d9, B:303:0x058f, B:306:0x0598, B:366:0x0657, B:313:0x05aa, B:316:0x05b4, B:320:0x05c2, B:323:0x05ca, B:324:0x05d2, B:330:0x05ea, B:334:0x05f6, B:338:0x05ff, B:346:0x0612, B:353:0x0623, B:355:0x0633, B:357:0x0638, B:348:0x0619, B:72:0x0197, B:74:0x01a3, B:77:0x01ae, B:79:0x01b5, B:81:0x01c1, B:83:0x01cb, B:43:0x011b, B:46:0x0129, B:49:0x0132, B:51:0x0139, B:53:0x0140, B:55:0x0147, B:61:0x015d, B:63:0x0164, B:68:0x0187, B:371:0x0677, B:375:0x0688, B:377:0x0692, B:379:0x069f, B:381:0x06a7, B:385:0x06ba, B:389:0x06c2), top: B:433:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:154:0x0319 A[Catch: IOException -> 0x008e, XmlPullParserException -> 0x0092, TRY_LEAVE, TryCatch #18 {IOException -> 0x008e, XmlPullParserException -> 0x0092, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x0081, B:16:0x0089, B:22:0x0098, B:25:0x00a4, B:29:0x00b6, B:31:0x00d5, B:33:0x00e3, B:35:0x00ea, B:37:0x00f6, B:39:0x0101, B:69:0x018f, B:87:0x01e9, B:90:0x01f7, B:92:0x01fd, B:94:0x0205, B:96:0x020d, B:98:0x0215, B:100:0x021d, B:102:0x0225, B:104:0x022b, B:106:0x0233, B:108:0x023b, B:110:0x0241, B:112:0x0247, B:114:0x024f, B:116:0x0257, B:119:0x0260, B:391:0x06c8, B:121:0x0286, B:123:0x028c, B:125:0x0295, B:127:0x02a4, B:129:0x02ae, B:131:0x02c2, B:133:0x02c8, B:261:0x04fa, B:136:0x02d3, B:138:0x02db, B:140:0x02e1, B:142:0x02ec, B:144:0x02f4, B:145:0x02fb, B:148:0x0302, B:260:0x04f3, B:152:0x0311, B:154:0x0319, B:158:0x0332, B:160:0x0339, B:162:0x0347, B:178:0x0391, B:180:0x0397, B:183:0x03a6, B:185:0x03ad, B:187:0x03bb, B:202:0x040a, B:204:0x0412, B:224:0x0457, B:226:0x045f, B:252:0x04a7, B:189:0x03c6, B:190:0x03d1, B:193:0x03d9, B:196:0x03e5, B:198:0x03ec, B:200:0x03f8, B:253:0x04b3, B:254:0x04be, B:255:0x04c9, B:165:0x0350, B:166:0x035a, B:169:0x0364, B:172:0x036f, B:174:0x0376, B:176:0x0382, B:256:0x04d0, B:257:0x04db, B:258:0x04e6, B:266:0x0516, B:269:0x0533, B:325:0x05d9, B:303:0x058f, B:306:0x0598, B:366:0x0657, B:313:0x05aa, B:316:0x05b4, B:320:0x05c2, B:323:0x05ca, B:324:0x05d2, B:330:0x05ea, B:334:0x05f6, B:338:0x05ff, B:346:0x0612, B:353:0x0623, B:355:0x0633, B:357:0x0638, B:348:0x0619, B:72:0x0197, B:74:0x01a3, B:77:0x01ae, B:79:0x01b5, B:81:0x01c1, B:83:0x01cb, B:43:0x011b, B:46:0x0129, B:49:0x0132, B:51:0x0139, B:53:0x0140, B:55:0x0147, B:61:0x015d, B:63:0x0164, B:68:0x0187, B:371:0x0677, B:375:0x0688, B:377:0x0692, B:379:0x069f, B:381:0x06a7, B:385:0x06ba, B:389:0x06c2), top: B:433:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:157:0x032f  */
    /* JADX WARN: Code duplicated, block: B:166:0x035a A[Catch: IOException -> 0x008e, XmlPullParserException -> 0x0092, TryCatch #18 {IOException -> 0x008e, XmlPullParserException -> 0x0092, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x0081, B:16:0x0089, B:22:0x0098, B:25:0x00a4, B:29:0x00b6, B:31:0x00d5, B:33:0x00e3, B:35:0x00ea, B:37:0x00f6, B:39:0x0101, B:69:0x018f, B:87:0x01e9, B:90:0x01f7, B:92:0x01fd, B:94:0x0205, B:96:0x020d, B:98:0x0215, B:100:0x021d, B:102:0x0225, B:104:0x022b, B:106:0x0233, B:108:0x023b, B:110:0x0241, B:112:0x0247, B:114:0x024f, B:116:0x0257, B:119:0x0260, B:391:0x06c8, B:121:0x0286, B:123:0x028c, B:125:0x0295, B:127:0x02a4, B:129:0x02ae, B:131:0x02c2, B:133:0x02c8, B:261:0x04fa, B:136:0x02d3, B:138:0x02db, B:140:0x02e1, B:142:0x02ec, B:144:0x02f4, B:145:0x02fb, B:148:0x0302, B:260:0x04f3, B:152:0x0311, B:154:0x0319, B:158:0x0332, B:160:0x0339, B:162:0x0347, B:178:0x0391, B:180:0x0397, B:183:0x03a6, B:185:0x03ad, B:187:0x03bb, B:202:0x040a, B:204:0x0412, B:224:0x0457, B:226:0x045f, B:252:0x04a7, B:189:0x03c6, B:190:0x03d1, B:193:0x03d9, B:196:0x03e5, B:198:0x03ec, B:200:0x03f8, B:253:0x04b3, B:254:0x04be, B:255:0x04c9, B:165:0x0350, B:166:0x035a, B:169:0x0364, B:172:0x036f, B:174:0x0376, B:176:0x0382, B:256:0x04d0, B:257:0x04db, B:258:0x04e6, B:266:0x0516, B:269:0x0533, B:325:0x05d9, B:303:0x058f, B:306:0x0598, B:366:0x0657, B:313:0x05aa, B:316:0x05b4, B:320:0x05c2, B:323:0x05ca, B:324:0x05d2, B:330:0x05ea, B:334:0x05f6, B:338:0x05ff, B:346:0x0612, B:353:0x0623, B:355:0x0633, B:357:0x0638, B:348:0x0619, B:72:0x0197, B:74:0x01a3, B:77:0x01ae, B:79:0x01b5, B:81:0x01c1, B:83:0x01cb, B:43:0x011b, B:46:0x0129, B:49:0x0132, B:51:0x0139, B:53:0x0140, B:55:0x0147, B:61:0x015d, B:63:0x0164, B:68:0x0187, B:371:0x0677, B:375:0x0688, B:377:0x0692, B:379:0x069f, B:381:0x06a7, B:385:0x06ba, B:389:0x06c2), top: B:433:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:168:0x0362 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:169:0x0364 A[Catch: IOException -> 0x008e, XmlPullParserException -> 0x0092, TRY_LEAVE, TryCatch #18 {IOException -> 0x008e, XmlPullParserException -> 0x0092, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x0081, B:16:0x0089, B:22:0x0098, B:25:0x00a4, B:29:0x00b6, B:31:0x00d5, B:33:0x00e3, B:35:0x00ea, B:37:0x00f6, B:39:0x0101, B:69:0x018f, B:87:0x01e9, B:90:0x01f7, B:92:0x01fd, B:94:0x0205, B:96:0x020d, B:98:0x0215, B:100:0x021d, B:102:0x0225, B:104:0x022b, B:106:0x0233, B:108:0x023b, B:110:0x0241, B:112:0x0247, B:114:0x024f, B:116:0x0257, B:119:0x0260, B:391:0x06c8, B:121:0x0286, B:123:0x028c, B:125:0x0295, B:127:0x02a4, B:129:0x02ae, B:131:0x02c2, B:133:0x02c8, B:261:0x04fa, B:136:0x02d3, B:138:0x02db, B:140:0x02e1, B:142:0x02ec, B:144:0x02f4, B:145:0x02fb, B:148:0x0302, B:260:0x04f3, B:152:0x0311, B:154:0x0319, B:158:0x0332, B:160:0x0339, B:162:0x0347, B:178:0x0391, B:180:0x0397, B:183:0x03a6, B:185:0x03ad, B:187:0x03bb, B:202:0x040a, B:204:0x0412, B:224:0x0457, B:226:0x045f, B:252:0x04a7, B:189:0x03c6, B:190:0x03d1, B:193:0x03d9, B:196:0x03e5, B:198:0x03ec, B:200:0x03f8, B:253:0x04b3, B:254:0x04be, B:255:0x04c9, B:165:0x0350, B:166:0x035a, B:169:0x0364, B:172:0x036f, B:174:0x0376, B:176:0x0382, B:256:0x04d0, B:257:0x04db, B:258:0x04e6, B:266:0x0516, B:269:0x0533, B:325:0x05d9, B:303:0x058f, B:306:0x0598, B:366:0x0657, B:313:0x05aa, B:316:0x05b4, B:320:0x05c2, B:323:0x05ca, B:324:0x05d2, B:330:0x05ea, B:334:0x05f6, B:338:0x05ff, B:346:0x0612, B:353:0x0623, B:355:0x0633, B:357:0x0638, B:348:0x0619, B:72:0x0197, B:74:0x01a3, B:77:0x01ae, B:79:0x01b5, B:81:0x01c1, B:83:0x01cb, B:43:0x011b, B:46:0x0129, B:49:0x0132, B:51:0x0139, B:53:0x0140, B:55:0x0147, B:61:0x015d, B:63:0x0164, B:68:0x0187, B:371:0x0677, B:375:0x0688, B:377:0x0692, B:379:0x069f, B:381:0x06a7, B:385:0x06ba, B:389:0x06c2), top: B:433:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:171:0x036e  */
    /* JADX WARN: Code duplicated, block: B:180:0x0397 A[Catch: IOException -> 0x008e, XmlPullParserException -> 0x0092, TRY_LEAVE, TryCatch #18 {IOException -> 0x008e, XmlPullParserException -> 0x0092, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x0081, B:16:0x0089, B:22:0x0098, B:25:0x00a4, B:29:0x00b6, B:31:0x00d5, B:33:0x00e3, B:35:0x00ea, B:37:0x00f6, B:39:0x0101, B:69:0x018f, B:87:0x01e9, B:90:0x01f7, B:92:0x01fd, B:94:0x0205, B:96:0x020d, B:98:0x0215, B:100:0x021d, B:102:0x0225, B:104:0x022b, B:106:0x0233, B:108:0x023b, B:110:0x0241, B:112:0x0247, B:114:0x024f, B:116:0x0257, B:119:0x0260, B:391:0x06c8, B:121:0x0286, B:123:0x028c, B:125:0x0295, B:127:0x02a4, B:129:0x02ae, B:131:0x02c2, B:133:0x02c8, B:261:0x04fa, B:136:0x02d3, B:138:0x02db, B:140:0x02e1, B:142:0x02ec, B:144:0x02f4, B:145:0x02fb, B:148:0x0302, B:260:0x04f3, B:152:0x0311, B:154:0x0319, B:158:0x0332, B:160:0x0339, B:162:0x0347, B:178:0x0391, B:180:0x0397, B:183:0x03a6, B:185:0x03ad, B:187:0x03bb, B:202:0x040a, B:204:0x0412, B:224:0x0457, B:226:0x045f, B:252:0x04a7, B:189:0x03c6, B:190:0x03d1, B:193:0x03d9, B:196:0x03e5, B:198:0x03ec, B:200:0x03f8, B:253:0x04b3, B:254:0x04be, B:255:0x04c9, B:165:0x0350, B:166:0x035a, B:169:0x0364, B:172:0x036f, B:174:0x0376, B:176:0x0382, B:256:0x04d0, B:257:0x04db, B:258:0x04e6, B:266:0x0516, B:269:0x0533, B:325:0x05d9, B:303:0x058f, B:306:0x0598, B:366:0x0657, B:313:0x05aa, B:316:0x05b4, B:320:0x05c2, B:323:0x05ca, B:324:0x05d2, B:330:0x05ea, B:334:0x05f6, B:338:0x05ff, B:346:0x0612, B:353:0x0623, B:355:0x0633, B:357:0x0638, B:348:0x0619, B:72:0x0197, B:74:0x01a3, B:77:0x01ae, B:79:0x01b5, B:81:0x01c1, B:83:0x01cb, B:43:0x011b, B:46:0x0129, B:49:0x0132, B:51:0x0139, B:53:0x0140, B:55:0x0147, B:61:0x015d, B:63:0x0164, B:68:0x0187, B:371:0x0677, B:375:0x0688, B:377:0x0692, B:379:0x069f, B:381:0x06a7, B:385:0x06ba, B:389:0x06c2), top: B:433:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:182:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:190:0x03d1 A[Catch: IOException -> 0x008e, XmlPullParserException -> 0x0092, TryCatch #18 {IOException -> 0x008e, XmlPullParserException -> 0x0092, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x0081, B:16:0x0089, B:22:0x0098, B:25:0x00a4, B:29:0x00b6, B:31:0x00d5, B:33:0x00e3, B:35:0x00ea, B:37:0x00f6, B:39:0x0101, B:69:0x018f, B:87:0x01e9, B:90:0x01f7, B:92:0x01fd, B:94:0x0205, B:96:0x020d, B:98:0x0215, B:100:0x021d, B:102:0x0225, B:104:0x022b, B:106:0x0233, B:108:0x023b, B:110:0x0241, B:112:0x0247, B:114:0x024f, B:116:0x0257, B:119:0x0260, B:391:0x06c8, B:121:0x0286, B:123:0x028c, B:125:0x0295, B:127:0x02a4, B:129:0x02ae, B:131:0x02c2, B:133:0x02c8, B:261:0x04fa, B:136:0x02d3, B:138:0x02db, B:140:0x02e1, B:142:0x02ec, B:144:0x02f4, B:145:0x02fb, B:148:0x0302, B:260:0x04f3, B:152:0x0311, B:154:0x0319, B:158:0x0332, B:160:0x0339, B:162:0x0347, B:178:0x0391, B:180:0x0397, B:183:0x03a6, B:185:0x03ad, B:187:0x03bb, B:202:0x040a, B:204:0x0412, B:224:0x0457, B:226:0x045f, B:252:0x04a7, B:189:0x03c6, B:190:0x03d1, B:193:0x03d9, B:196:0x03e5, B:198:0x03ec, B:200:0x03f8, B:253:0x04b3, B:254:0x04be, B:255:0x04c9, B:165:0x0350, B:166:0x035a, B:169:0x0364, B:172:0x036f, B:174:0x0376, B:176:0x0382, B:256:0x04d0, B:257:0x04db, B:258:0x04e6, B:266:0x0516, B:269:0x0533, B:325:0x05d9, B:303:0x058f, B:306:0x0598, B:366:0x0657, B:313:0x05aa, B:316:0x05b4, B:320:0x05c2, B:323:0x05ca, B:324:0x05d2, B:330:0x05ea, B:334:0x05f6, B:338:0x05ff, B:346:0x0612, B:353:0x0623, B:355:0x0633, B:357:0x0638, B:348:0x0619, B:72:0x0197, B:74:0x01a3, B:77:0x01ae, B:79:0x01b5, B:81:0x01c1, B:83:0x01cb, B:43:0x011b, B:46:0x0129, B:49:0x0132, B:51:0x0139, B:53:0x0140, B:55:0x0147, B:61:0x015d, B:63:0x0164, B:68:0x0187, B:371:0x0677, B:375:0x0688, B:377:0x0692, B:379:0x069f, B:381:0x06a7, B:385:0x06ba, B:389:0x06c2), top: B:433:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:192:0x03d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:193:0x03d9 A[Catch: IOException -> 0x008e, XmlPullParserException -> 0x0092, TRY_LEAVE, TryCatch #18 {IOException -> 0x008e, XmlPullParserException -> 0x0092, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x0081, B:16:0x0089, B:22:0x0098, B:25:0x00a4, B:29:0x00b6, B:31:0x00d5, B:33:0x00e3, B:35:0x00ea, B:37:0x00f6, B:39:0x0101, B:69:0x018f, B:87:0x01e9, B:90:0x01f7, B:92:0x01fd, B:94:0x0205, B:96:0x020d, B:98:0x0215, B:100:0x021d, B:102:0x0225, B:104:0x022b, B:106:0x0233, B:108:0x023b, B:110:0x0241, B:112:0x0247, B:114:0x024f, B:116:0x0257, B:119:0x0260, B:391:0x06c8, B:121:0x0286, B:123:0x028c, B:125:0x0295, B:127:0x02a4, B:129:0x02ae, B:131:0x02c2, B:133:0x02c8, B:261:0x04fa, B:136:0x02d3, B:138:0x02db, B:140:0x02e1, B:142:0x02ec, B:144:0x02f4, B:145:0x02fb, B:148:0x0302, B:260:0x04f3, B:152:0x0311, B:154:0x0319, B:158:0x0332, B:160:0x0339, B:162:0x0347, B:178:0x0391, B:180:0x0397, B:183:0x03a6, B:185:0x03ad, B:187:0x03bb, B:202:0x040a, B:204:0x0412, B:224:0x0457, B:226:0x045f, B:252:0x04a7, B:189:0x03c6, B:190:0x03d1, B:193:0x03d9, B:196:0x03e5, B:198:0x03ec, B:200:0x03f8, B:253:0x04b3, B:254:0x04be, B:255:0x04c9, B:165:0x0350, B:166:0x035a, B:169:0x0364, B:172:0x036f, B:174:0x0376, B:176:0x0382, B:256:0x04d0, B:257:0x04db, B:258:0x04e6, B:266:0x0516, B:269:0x0533, B:325:0x05d9, B:303:0x058f, B:306:0x0598, B:366:0x0657, B:313:0x05aa, B:316:0x05b4, B:320:0x05c2, B:323:0x05ca, B:324:0x05d2, B:330:0x05ea, B:334:0x05f6, B:338:0x05ff, B:346:0x0612, B:353:0x0623, B:355:0x0633, B:357:0x0638, B:348:0x0619, B:72:0x0197, B:74:0x01a3, B:77:0x01ae, B:79:0x01b5, B:81:0x01c1, B:83:0x01cb, B:43:0x011b, B:46:0x0129, B:49:0x0132, B:51:0x0139, B:53:0x0140, B:55:0x0147, B:61:0x015d, B:63:0x0164, B:68:0x0187, B:371:0x0677, B:375:0x0688, B:377:0x0692, B:379:0x069f, B:381:0x06a7, B:385:0x06ba, B:389:0x06c2), top: B:433:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:195:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:204:0x0412 A[Catch: IOException -> 0x008e, XmlPullParserException -> 0x0092, TRY_LEAVE, TryCatch #18 {IOException -> 0x008e, XmlPullParserException -> 0x0092, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x0081, B:16:0x0089, B:22:0x0098, B:25:0x00a4, B:29:0x00b6, B:31:0x00d5, B:33:0x00e3, B:35:0x00ea, B:37:0x00f6, B:39:0x0101, B:69:0x018f, B:87:0x01e9, B:90:0x01f7, B:92:0x01fd, B:94:0x0205, B:96:0x020d, B:98:0x0215, B:100:0x021d, B:102:0x0225, B:104:0x022b, B:106:0x0233, B:108:0x023b, B:110:0x0241, B:112:0x0247, B:114:0x024f, B:116:0x0257, B:119:0x0260, B:391:0x06c8, B:121:0x0286, B:123:0x028c, B:125:0x0295, B:127:0x02a4, B:129:0x02ae, B:131:0x02c2, B:133:0x02c8, B:261:0x04fa, B:136:0x02d3, B:138:0x02db, B:140:0x02e1, B:142:0x02ec, B:144:0x02f4, B:145:0x02fb, B:148:0x0302, B:260:0x04f3, B:152:0x0311, B:154:0x0319, B:158:0x0332, B:160:0x0339, B:162:0x0347, B:178:0x0391, B:180:0x0397, B:183:0x03a6, B:185:0x03ad, B:187:0x03bb, B:202:0x040a, B:204:0x0412, B:224:0x0457, B:226:0x045f, B:252:0x04a7, B:189:0x03c6, B:190:0x03d1, B:193:0x03d9, B:196:0x03e5, B:198:0x03ec, B:200:0x03f8, B:253:0x04b3, B:254:0x04be, B:255:0x04c9, B:165:0x0350, B:166:0x035a, B:169:0x0364, B:172:0x036f, B:174:0x0376, B:176:0x0382, B:256:0x04d0, B:257:0x04db, B:258:0x04e6, B:266:0x0516, B:269:0x0533, B:325:0x05d9, B:303:0x058f, B:306:0x0598, B:366:0x0657, B:313:0x05aa, B:316:0x05b4, B:320:0x05c2, B:323:0x05ca, B:324:0x05d2, B:330:0x05ea, B:334:0x05f6, B:338:0x05ff, B:346:0x0612, B:353:0x0623, B:355:0x0633, B:357:0x0638, B:348:0x0619, B:72:0x0197, B:74:0x01a3, B:77:0x01ae, B:79:0x01b5, B:81:0x01c1, B:83:0x01cb, B:43:0x011b, B:46:0x0129, B:49:0x0132, B:51:0x0139, B:53:0x0140, B:55:0x0147, B:61:0x015d, B:63:0x0164, B:68:0x0187, B:371:0x0677, B:375:0x0688, B:377:0x0692, B:379:0x069f, B:381:0x06a7, B:385:0x06ba, B:389:0x06c2), top: B:433:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:207:0x041f  */
    /* JADX WARN: Code duplicated, block: B:210:0x0425  */
    /* JADX WARN: Code duplicated, block: B:213:0x042f  */
    /* JADX WARN: Code duplicated, block: B:215:0x0437  */
    /* JADX WARN: Code duplicated, block: B:216:0x0439  */
    /* JADX WARN: Code duplicated, block: B:218:0x043c  */
    /* JADX WARN: Code duplicated, block: B:220:0x043f  */
    /* JADX WARN: Code duplicated, block: B:221:0x0444  */
    /* JADX WARN: Code duplicated, block: B:222:0x044b  */
    /* JADX WARN: Code duplicated, block: B:226:0x045f A[Catch: IOException -> 0x008e, XmlPullParserException -> 0x0092, TRY_LEAVE, TryCatch #18 {IOException -> 0x008e, XmlPullParserException -> 0x0092, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x0081, B:16:0x0089, B:22:0x0098, B:25:0x00a4, B:29:0x00b6, B:31:0x00d5, B:33:0x00e3, B:35:0x00ea, B:37:0x00f6, B:39:0x0101, B:69:0x018f, B:87:0x01e9, B:90:0x01f7, B:92:0x01fd, B:94:0x0205, B:96:0x020d, B:98:0x0215, B:100:0x021d, B:102:0x0225, B:104:0x022b, B:106:0x0233, B:108:0x023b, B:110:0x0241, B:112:0x0247, B:114:0x024f, B:116:0x0257, B:119:0x0260, B:391:0x06c8, B:121:0x0286, B:123:0x028c, B:125:0x0295, B:127:0x02a4, B:129:0x02ae, B:131:0x02c2, B:133:0x02c8, B:261:0x04fa, B:136:0x02d3, B:138:0x02db, B:140:0x02e1, B:142:0x02ec, B:144:0x02f4, B:145:0x02fb, B:148:0x0302, B:260:0x04f3, B:152:0x0311, B:154:0x0319, B:158:0x0332, B:160:0x0339, B:162:0x0347, B:178:0x0391, B:180:0x0397, B:183:0x03a6, B:185:0x03ad, B:187:0x03bb, B:202:0x040a, B:204:0x0412, B:224:0x0457, B:226:0x045f, B:252:0x04a7, B:189:0x03c6, B:190:0x03d1, B:193:0x03d9, B:196:0x03e5, B:198:0x03ec, B:200:0x03f8, B:253:0x04b3, B:254:0x04be, B:255:0x04c9, B:165:0x0350, B:166:0x035a, B:169:0x0364, B:172:0x036f, B:174:0x0376, B:176:0x0382, B:256:0x04d0, B:257:0x04db, B:258:0x04e6, B:266:0x0516, B:269:0x0533, B:325:0x05d9, B:303:0x058f, B:306:0x0598, B:366:0x0657, B:313:0x05aa, B:316:0x05b4, B:320:0x05c2, B:323:0x05ca, B:324:0x05d2, B:330:0x05ea, B:334:0x05f6, B:338:0x05ff, B:346:0x0612, B:353:0x0623, B:355:0x0633, B:357:0x0638, B:348:0x0619, B:72:0x0197, B:74:0x01a3, B:77:0x01ae, B:79:0x01b5, B:81:0x01c1, B:83:0x01cb, B:43:0x011b, B:46:0x0129, B:49:0x0132, B:51:0x0139, B:53:0x0140, B:55:0x0147, B:61:0x015d, B:63:0x0164, B:68:0x0187, B:371:0x0677, B:375:0x0688, B:377:0x0692, B:379:0x069f, B:381:0x06a7, B:385:0x06ba, B:389:0x06c2), top: B:433:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:229:0x046b  */
    /* JADX WARN: Code duplicated, block: B:231:0x0470  */
    /* JADX WARN: Code duplicated, block: B:234:0x0476  */
    /* JADX WARN: Code duplicated, block: B:237:0x0480  */
    /* JADX WARN: Code duplicated, block: B:239:0x0488  */
    /* JADX WARN: Code duplicated, block: B:240:0x048a  */
    /* JADX WARN: Code duplicated, block: B:242:0x0492  */
    /* JADX WARN: Code duplicated, block: B:243:0x0494  */
    /* JADX WARN: Code duplicated, block: B:245:0x0497  */
    /* JADX WARN: Code duplicated, block: B:249:0x049d  */
    /* JADX WARN: Code duplicated, block: B:251:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:254:0x04be A[Catch: IOException -> 0x008e, XmlPullParserException -> 0x0092, TryCatch #18 {IOException -> 0x008e, XmlPullParserException -> 0x0092, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x0081, B:16:0x0089, B:22:0x0098, B:25:0x00a4, B:29:0x00b6, B:31:0x00d5, B:33:0x00e3, B:35:0x00ea, B:37:0x00f6, B:39:0x0101, B:69:0x018f, B:87:0x01e9, B:90:0x01f7, B:92:0x01fd, B:94:0x0205, B:96:0x020d, B:98:0x0215, B:100:0x021d, B:102:0x0225, B:104:0x022b, B:106:0x0233, B:108:0x023b, B:110:0x0241, B:112:0x0247, B:114:0x024f, B:116:0x0257, B:119:0x0260, B:391:0x06c8, B:121:0x0286, B:123:0x028c, B:125:0x0295, B:127:0x02a4, B:129:0x02ae, B:131:0x02c2, B:133:0x02c8, B:261:0x04fa, B:136:0x02d3, B:138:0x02db, B:140:0x02e1, B:142:0x02ec, B:144:0x02f4, B:145:0x02fb, B:148:0x0302, B:260:0x04f3, B:152:0x0311, B:154:0x0319, B:158:0x0332, B:160:0x0339, B:162:0x0347, B:178:0x0391, B:180:0x0397, B:183:0x03a6, B:185:0x03ad, B:187:0x03bb, B:202:0x040a, B:204:0x0412, B:224:0x0457, B:226:0x045f, B:252:0x04a7, B:189:0x03c6, B:190:0x03d1, B:193:0x03d9, B:196:0x03e5, B:198:0x03ec, B:200:0x03f8, B:253:0x04b3, B:254:0x04be, B:255:0x04c9, B:165:0x0350, B:166:0x035a, B:169:0x0364, B:172:0x036f, B:174:0x0376, B:176:0x0382, B:256:0x04d0, B:257:0x04db, B:258:0x04e6, B:266:0x0516, B:269:0x0533, B:325:0x05d9, B:303:0x058f, B:306:0x0598, B:366:0x0657, B:313:0x05aa, B:316:0x05b4, B:320:0x05c2, B:323:0x05ca, B:324:0x05d2, B:330:0x05ea, B:334:0x05f6, B:338:0x05ff, B:346:0x0612, B:353:0x0623, B:355:0x0633, B:357:0x0638, B:348:0x0619, B:72:0x0197, B:74:0x01a3, B:77:0x01ae, B:79:0x01b5, B:81:0x01c1, B:83:0x01cb, B:43:0x011b, B:46:0x0129, B:49:0x0132, B:51:0x0139, B:53:0x0140, B:55:0x0147, B:61:0x015d, B:63:0x0164, B:68:0x0187, B:371:0x0677, B:375:0x0688, B:377:0x0692, B:379:0x069f, B:381:0x06a7, B:385:0x06ba, B:389:0x06c2), top: B:433:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:255:0x04c9 A[Catch: IOException -> 0x008e, XmlPullParserException -> 0x0092, TryCatch #18 {IOException -> 0x008e, XmlPullParserException -> 0x0092, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x0081, B:16:0x0089, B:22:0x0098, B:25:0x00a4, B:29:0x00b6, B:31:0x00d5, B:33:0x00e3, B:35:0x00ea, B:37:0x00f6, B:39:0x0101, B:69:0x018f, B:87:0x01e9, B:90:0x01f7, B:92:0x01fd, B:94:0x0205, B:96:0x020d, B:98:0x0215, B:100:0x021d, B:102:0x0225, B:104:0x022b, B:106:0x0233, B:108:0x023b, B:110:0x0241, B:112:0x0247, B:114:0x024f, B:116:0x0257, B:119:0x0260, B:391:0x06c8, B:121:0x0286, B:123:0x028c, B:125:0x0295, B:127:0x02a4, B:129:0x02ae, B:131:0x02c2, B:133:0x02c8, B:261:0x04fa, B:136:0x02d3, B:138:0x02db, B:140:0x02e1, B:142:0x02ec, B:144:0x02f4, B:145:0x02fb, B:148:0x0302, B:260:0x04f3, B:152:0x0311, B:154:0x0319, B:158:0x0332, B:160:0x0339, B:162:0x0347, B:178:0x0391, B:180:0x0397, B:183:0x03a6, B:185:0x03ad, B:187:0x03bb, B:202:0x040a, B:204:0x0412, B:224:0x0457, B:226:0x045f, B:252:0x04a7, B:189:0x03c6, B:190:0x03d1, B:193:0x03d9, B:196:0x03e5, B:198:0x03ec, B:200:0x03f8, B:253:0x04b3, B:254:0x04be, B:255:0x04c9, B:165:0x0350, B:166:0x035a, B:169:0x0364, B:172:0x036f, B:174:0x0376, B:176:0x0382, B:256:0x04d0, B:257:0x04db, B:258:0x04e6, B:266:0x0516, B:269:0x0533, B:325:0x05d9, B:303:0x058f, B:306:0x0598, B:366:0x0657, B:313:0x05aa, B:316:0x05b4, B:320:0x05c2, B:323:0x05ca, B:324:0x05d2, B:330:0x05ea, B:334:0x05f6, B:338:0x05ff, B:346:0x0612, B:353:0x0623, B:355:0x0633, B:357:0x0638, B:348:0x0619, B:72:0x0197, B:74:0x01a3, B:77:0x01ae, B:79:0x01b5, B:81:0x01c1, B:83:0x01cb, B:43:0x011b, B:46:0x0129, B:49:0x0132, B:51:0x0139, B:53:0x0140, B:55:0x0147, B:61:0x015d, B:63:0x0164, B:68:0x0187, B:371:0x0677, B:375:0x0688, B:377:0x0692, B:379:0x069f, B:381:0x06a7, B:385:0x06ba, B:389:0x06c2), top: B:433:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:257:0x04db A[Catch: IOException -> 0x008e, XmlPullParserException -> 0x0092, TryCatch #18 {IOException -> 0x008e, XmlPullParserException -> 0x0092, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x0081, B:16:0x0089, B:22:0x0098, B:25:0x00a4, B:29:0x00b6, B:31:0x00d5, B:33:0x00e3, B:35:0x00ea, B:37:0x00f6, B:39:0x0101, B:69:0x018f, B:87:0x01e9, B:90:0x01f7, B:92:0x01fd, B:94:0x0205, B:96:0x020d, B:98:0x0215, B:100:0x021d, B:102:0x0225, B:104:0x022b, B:106:0x0233, B:108:0x023b, B:110:0x0241, B:112:0x0247, B:114:0x024f, B:116:0x0257, B:119:0x0260, B:391:0x06c8, B:121:0x0286, B:123:0x028c, B:125:0x0295, B:127:0x02a4, B:129:0x02ae, B:131:0x02c2, B:133:0x02c8, B:261:0x04fa, B:136:0x02d3, B:138:0x02db, B:140:0x02e1, B:142:0x02ec, B:144:0x02f4, B:145:0x02fb, B:148:0x0302, B:260:0x04f3, B:152:0x0311, B:154:0x0319, B:158:0x0332, B:160:0x0339, B:162:0x0347, B:178:0x0391, B:180:0x0397, B:183:0x03a6, B:185:0x03ad, B:187:0x03bb, B:202:0x040a, B:204:0x0412, B:224:0x0457, B:226:0x045f, B:252:0x04a7, B:189:0x03c6, B:190:0x03d1, B:193:0x03d9, B:196:0x03e5, B:198:0x03ec, B:200:0x03f8, B:253:0x04b3, B:254:0x04be, B:255:0x04c9, B:165:0x0350, B:166:0x035a, B:169:0x0364, B:172:0x036f, B:174:0x0376, B:176:0x0382, B:256:0x04d0, B:257:0x04db, B:258:0x04e6, B:266:0x0516, B:269:0x0533, B:325:0x05d9, B:303:0x058f, B:306:0x0598, B:366:0x0657, B:313:0x05aa, B:316:0x05b4, B:320:0x05c2, B:323:0x05ca, B:324:0x05d2, B:330:0x05ea, B:334:0x05f6, B:338:0x05ff, B:346:0x0612, B:353:0x0623, B:355:0x0633, B:357:0x0638, B:348:0x0619, B:72:0x0197, B:74:0x01a3, B:77:0x01ae, B:79:0x01b5, B:81:0x01c1, B:83:0x01cb, B:43:0x011b, B:46:0x0129, B:49:0x0132, B:51:0x0139, B:53:0x0140, B:55:0x0147, B:61:0x015d, B:63:0x0164, B:68:0x0187, B:371:0x0677, B:375:0x0688, B:377:0x0692, B:379:0x069f, B:381:0x06a7, B:385:0x06ba, B:389:0x06c2), top: B:433:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:258:0x04e6 A[Catch: IOException -> 0x008e, XmlPullParserException -> 0x0092, TryCatch #18 {IOException -> 0x008e, XmlPullParserException -> 0x0092, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x0081, B:16:0x0089, B:22:0x0098, B:25:0x00a4, B:29:0x00b6, B:31:0x00d5, B:33:0x00e3, B:35:0x00ea, B:37:0x00f6, B:39:0x0101, B:69:0x018f, B:87:0x01e9, B:90:0x01f7, B:92:0x01fd, B:94:0x0205, B:96:0x020d, B:98:0x0215, B:100:0x021d, B:102:0x0225, B:104:0x022b, B:106:0x0233, B:108:0x023b, B:110:0x0241, B:112:0x0247, B:114:0x024f, B:116:0x0257, B:119:0x0260, B:391:0x06c8, B:121:0x0286, B:123:0x028c, B:125:0x0295, B:127:0x02a4, B:129:0x02ae, B:131:0x02c2, B:133:0x02c8, B:261:0x04fa, B:136:0x02d3, B:138:0x02db, B:140:0x02e1, B:142:0x02ec, B:144:0x02f4, B:145:0x02fb, B:148:0x0302, B:260:0x04f3, B:152:0x0311, B:154:0x0319, B:158:0x0332, B:160:0x0339, B:162:0x0347, B:178:0x0391, B:180:0x0397, B:183:0x03a6, B:185:0x03ad, B:187:0x03bb, B:202:0x040a, B:204:0x0412, B:224:0x0457, B:226:0x045f, B:252:0x04a7, B:189:0x03c6, B:190:0x03d1, B:193:0x03d9, B:196:0x03e5, B:198:0x03ec, B:200:0x03f8, B:253:0x04b3, B:254:0x04be, B:255:0x04c9, B:165:0x0350, B:166:0x035a, B:169:0x0364, B:172:0x036f, B:174:0x0376, B:176:0x0382, B:256:0x04d0, B:257:0x04db, B:258:0x04e6, B:266:0x0516, B:269:0x0533, B:325:0x05d9, B:303:0x058f, B:306:0x0598, B:366:0x0657, B:313:0x05aa, B:316:0x05b4, B:320:0x05c2, B:323:0x05ca, B:324:0x05d2, B:330:0x05ea, B:334:0x05f6, B:338:0x05ff, B:346:0x0612, B:353:0x0623, B:355:0x0633, B:357:0x0638, B:348:0x0619, B:72:0x0197, B:74:0x01a3, B:77:0x01ae, B:79:0x01b5, B:81:0x01c1, B:83:0x01cb, B:43:0x011b, B:46:0x0129, B:49:0x0132, B:51:0x0139, B:53:0x0140, B:55:0x0147, B:61:0x015d, B:63:0x0164, B:68:0x0187, B:371:0x0677, B:375:0x0688, B:377:0x0692, B:379:0x069f, B:381:0x06a7, B:385:0x06ba, B:389:0x06c2), top: B:433:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:260:0x04f3 A[Catch: IOException -> 0x008e, XmlPullParserException -> 0x0092, TryCatch #18 {IOException -> 0x008e, XmlPullParserException -> 0x0092, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x0081, B:16:0x0089, B:22:0x0098, B:25:0x00a4, B:29:0x00b6, B:31:0x00d5, B:33:0x00e3, B:35:0x00ea, B:37:0x00f6, B:39:0x0101, B:69:0x018f, B:87:0x01e9, B:90:0x01f7, B:92:0x01fd, B:94:0x0205, B:96:0x020d, B:98:0x0215, B:100:0x021d, B:102:0x0225, B:104:0x022b, B:106:0x0233, B:108:0x023b, B:110:0x0241, B:112:0x0247, B:114:0x024f, B:116:0x0257, B:119:0x0260, B:391:0x06c8, B:121:0x0286, B:123:0x028c, B:125:0x0295, B:127:0x02a4, B:129:0x02ae, B:131:0x02c2, B:133:0x02c8, B:261:0x04fa, B:136:0x02d3, B:138:0x02db, B:140:0x02e1, B:142:0x02ec, B:144:0x02f4, B:145:0x02fb, B:148:0x0302, B:260:0x04f3, B:152:0x0311, B:154:0x0319, B:158:0x0332, B:160:0x0339, B:162:0x0347, B:178:0x0391, B:180:0x0397, B:183:0x03a6, B:185:0x03ad, B:187:0x03bb, B:202:0x040a, B:204:0x0412, B:224:0x0457, B:226:0x045f, B:252:0x04a7, B:189:0x03c6, B:190:0x03d1, B:193:0x03d9, B:196:0x03e5, B:198:0x03ec, B:200:0x03f8, B:253:0x04b3, B:254:0x04be, B:255:0x04c9, B:165:0x0350, B:166:0x035a, B:169:0x0364, B:172:0x036f, B:174:0x0376, B:176:0x0382, B:256:0x04d0, B:257:0x04db, B:258:0x04e6, B:266:0x0516, B:269:0x0533, B:325:0x05d9, B:303:0x058f, B:306:0x0598, B:366:0x0657, B:313:0x05aa, B:316:0x05b4, B:320:0x05c2, B:323:0x05ca, B:324:0x05d2, B:330:0x05ea, B:334:0x05f6, B:338:0x05ff, B:346:0x0612, B:353:0x0623, B:355:0x0633, B:357:0x0638, B:348:0x0619, B:72:0x0197, B:74:0x01a3, B:77:0x01ae, B:79:0x01b5, B:81:0x01c1, B:83:0x01cb, B:43:0x011b, B:46:0x0129, B:49:0x0132, B:51:0x0139, B:53:0x0140, B:55:0x0147, B:61:0x015d, B:63:0x0164, B:68:0x0187, B:371:0x0677, B:375:0x0688, B:377:0x0692, B:379:0x069f, B:381:0x06a7, B:385:0x06ba, B:389:0x06c2), top: B:433:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:264:0x0506 A[LOOP:1: B:123:0x028c->B:264:0x0506, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:265:0x0510  */
    /* JADX WARN: Code duplicated, block: B:272:0x0543  */
    /* JADX WARN: Code duplicated, block: B:274:0x054b  */
    /* JADX WARN: Code duplicated, block: B:275:0x054d  */
    /* JADX WARN: Code duplicated, block: B:277:0x0553  */
    /* JADX WARN: Code duplicated, block: B:278:0x0555  */
    /* JADX WARN: Code duplicated, block: B:280:0x055d  */
    /* JADX WARN: Code duplicated, block: B:281:0x055f  */
    /* JADX WARN: Code duplicated, block: B:283:0x0567  */
    /* JADX WARN: Code duplicated, block: B:284:0x0569  */
    /* JADX WARN: Code duplicated, block: B:286:0x0571  */
    /* JADX WARN: Code duplicated, block: B:287:0x0573  */
    /* JADX WARN: Code duplicated, block: B:289:0x0579  */
    /* JADX WARN: Code duplicated, block: B:290:0x057b  */
    /* JADX WARN: Code duplicated, block: B:292:0x057e  */
    /* JADX WARN: Code duplicated, block: B:294:0x0581  */
    /* JADX WARN: Code duplicated, block: B:296:0x0584  */
    /* JADX WARN: Code duplicated, block: B:298:0x0587  */
    /* JADX WARN: Code duplicated, block: B:300:0x058a  */
    /* JADX WARN: Code duplicated, block: B:302:0x058d  */
    /* JADX WARN: Code duplicated, block: B:305:0x0597  */
    /* JADX WARN: Code duplicated, block: B:313:0x05aa A[Catch: IOException -> 0x008e, XmlPullParserException -> 0x0092, zzakb -> 0x059f, TryCatch #1 {zzakb -> 0x059f, blocks: (B:306:0x0598, B:313:0x05aa, B:316:0x05b4), top: B:403:0x0598 }] */
    /* JADX WARN: Code duplicated, block: B:315:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:316:0x05b4 A[Catch: IOException -> 0x008e, XmlPullParserException -> 0x0092, zzakb -> 0x059f, TRY_LEAVE, TryCatch #1 {zzakb -> 0x059f, blocks: (B:306:0x0598, B:313:0x05aa, B:316:0x05b4), top: B:403:0x0598 }] */
    /* JADX WARN: Code duplicated, block: B:318:0x05bc  */
    /* JADX WARN: Code duplicated, block: B:319:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:323:0x05ca A[Catch: IOException -> 0x008e, XmlPullParserException -> 0x0092, zzakb -> 0x05c7, TryCatch #7 {zzakb -> 0x05c7, blocks: (B:325:0x05d9, B:320:0x05c2, B:323:0x05ca, B:324:0x05d2, B:330:0x05ea, B:334:0x05f6, B:338:0x05ff, B:346:0x0612, B:348:0x0619), top: B:413:0x05d9 }] */
    /* JADX WARN: Code duplicated, block: B:324:0x05d2 A[Catch: IOException -> 0x008e, XmlPullParserException -> 0x0092, zzakb -> 0x05c7, TryCatch #7 {zzakb -> 0x05c7, blocks: (B:325:0x05d9, B:320:0x05c2, B:323:0x05ca, B:324:0x05d2, B:330:0x05ea, B:334:0x05f6, B:338:0x05ff, B:346:0x0612, B:348:0x0619), top: B:413:0x05d9 }] */
    /* JADX WARN: Code duplicated, block: B:330:0x05ea A[Catch: IOException -> 0x008e, XmlPullParserException -> 0x0092, zzakb -> 0x05c7, TryCatch #7 {zzakb -> 0x05c7, blocks: (B:325:0x05d9, B:320:0x05c2, B:323:0x05ca, B:324:0x05d2, B:330:0x05ea, B:334:0x05f6, B:338:0x05ff, B:346:0x0612, B:348:0x0619), top: B:413:0x05d9 }] */
    /* JADX WARN: Code duplicated, block: B:332:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:334:0x05f6 A[Catch: IOException -> 0x008e, XmlPullParserException -> 0x0092, zzakb -> 0x05c7, TryCatch #7 {zzakb -> 0x05c7, blocks: (B:325:0x05d9, B:320:0x05c2, B:323:0x05ca, B:324:0x05d2, B:330:0x05ea, B:334:0x05f6, B:338:0x05ff, B:346:0x0612, B:348:0x0619), top: B:413:0x05d9 }] */
    /* JADX WARN: Code duplicated, block: B:335:0x05f9  */
    /* JADX WARN: Code duplicated, block: B:338:0x05ff A[Catch: IOException -> 0x008e, XmlPullParserException -> 0x0092, zzakb -> 0x05c7, TryCatch #7 {zzakb -> 0x05c7, blocks: (B:325:0x05d9, B:320:0x05c2, B:323:0x05ca, B:324:0x05d2, B:330:0x05ea, B:334:0x05f6, B:338:0x05ff, B:346:0x0612, B:348:0x0619), top: B:413:0x05d9 }] */
    /* JADX WARN: Code duplicated, block: B:339:0x0601 A[PHI: r28 r30
  0x0601: PHI (r28v6 long) = (r28v3 long), (r28v8 long) binds: [B:331:0x05f0, B:338:0x05ff] A[DONT_GENERATE, DONT_INLINE]
  0x0601: PHI (r30v3 long) = (r30v1 long), (r30v5 long) binds: [B:331:0x05f0, B:338:0x05ff] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:340:0x0603  */
    /* JADX WARN: Code duplicated, block: B:341:0x0607  */
    /* JADX WARN: Code duplicated, block: B:344:0x060e  */
    /* JADX WARN: Code duplicated, block: B:346:0x0612 A[Catch: IOException -> 0x008e, XmlPullParserException -> 0x0092, zzakb -> 0x05c7, TryCatch #7 {zzakb -> 0x05c7, blocks: (B:325:0x05d9, B:320:0x05c2, B:323:0x05ca, B:324:0x05d2, B:330:0x05ea, B:334:0x05f6, B:338:0x05ff, B:346:0x0612, B:348:0x0619), top: B:413:0x05d9 }] */
    /* JADX WARN: Code duplicated, block: B:347:0x0617 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:348:0x0619 A[Catch: IOException -> 0x008e, XmlPullParserException -> 0x0092, zzakb -> 0x05c7, TRY_LEAVE, TryCatch #7 {zzakb -> 0x05c7, blocks: (B:325:0x05d9, B:320:0x05c2, B:323:0x05ca, B:324:0x05d2, B:330:0x05ea, B:334:0x05f6, B:338:0x05ff, B:346:0x0612, B:348:0x0619), top: B:413:0x05d9 }] */
    /* JADX WARN: Code duplicated, block: B:351:0x061f  */
    /* JADX WARN: Code duplicated, block: B:352:0x0621  */
    /* JADX WARN: Code duplicated, block: B:357:0x0638 A[Catch: IOException -> 0x008e, XmlPullParserException -> 0x0092, zzakb -> 0x063c, TRY_LEAVE, TryCatch #16 {zzakb -> 0x063c, blocks: (B:355:0x0633, B:357:0x0638), top: B:429:0x0633 }] */
    /* JADX WARN: Code duplicated, block: B:401:0x0533 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:411:0x058f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:436:0x0500 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0195  */
    /* JADX WARN: Code duplicated, block: B:72:0x0197 A[Catch: IOException -> 0x008e, XmlPullParserException -> 0x0092, TryCatch #18 {IOException -> 0x008e, XmlPullParserException -> 0x0092, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x0081, B:16:0x0089, B:22:0x0098, B:25:0x00a4, B:29:0x00b6, B:31:0x00d5, B:33:0x00e3, B:35:0x00ea, B:37:0x00f6, B:39:0x0101, B:69:0x018f, B:87:0x01e9, B:90:0x01f7, B:92:0x01fd, B:94:0x0205, B:96:0x020d, B:98:0x0215, B:100:0x021d, B:102:0x0225, B:104:0x022b, B:106:0x0233, B:108:0x023b, B:110:0x0241, B:112:0x0247, B:114:0x024f, B:116:0x0257, B:119:0x0260, B:391:0x06c8, B:121:0x0286, B:123:0x028c, B:125:0x0295, B:127:0x02a4, B:129:0x02ae, B:131:0x02c2, B:133:0x02c8, B:261:0x04fa, B:136:0x02d3, B:138:0x02db, B:140:0x02e1, B:142:0x02ec, B:144:0x02f4, B:145:0x02fb, B:148:0x0302, B:260:0x04f3, B:152:0x0311, B:154:0x0319, B:158:0x0332, B:160:0x0339, B:162:0x0347, B:178:0x0391, B:180:0x0397, B:183:0x03a6, B:185:0x03ad, B:187:0x03bb, B:202:0x040a, B:204:0x0412, B:224:0x0457, B:226:0x045f, B:252:0x04a7, B:189:0x03c6, B:190:0x03d1, B:193:0x03d9, B:196:0x03e5, B:198:0x03ec, B:200:0x03f8, B:253:0x04b3, B:254:0x04be, B:255:0x04c9, B:165:0x0350, B:166:0x035a, B:169:0x0364, B:172:0x036f, B:174:0x0376, B:176:0x0382, B:256:0x04d0, B:257:0x04db, B:258:0x04e6, B:266:0x0516, B:269:0x0533, B:325:0x05d9, B:303:0x058f, B:306:0x0598, B:366:0x0657, B:313:0x05aa, B:316:0x05b4, B:320:0x05c2, B:323:0x05ca, B:324:0x05d2, B:330:0x05ea, B:334:0x05f6, B:338:0x05ff, B:346:0x0612, B:353:0x0623, B:355:0x0633, B:357:0x0638, B:348:0x0619, B:72:0x0197, B:74:0x01a3, B:77:0x01ae, B:79:0x01b5, B:81:0x01c1, B:83:0x01cb, B:43:0x011b, B:46:0x0129, B:49:0x0132, B:51:0x0139, B:53:0x0140, B:55:0x0147, B:61:0x015d, B:63:0x0164, B:68:0x0187, B:371:0x0677, B:375:0x0688, B:377:0x0692, B:379:0x069f, B:381:0x06a7, B:385:0x06ba, B:389:0x06c2), top: B:433:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x01a3 A[Catch: IOException -> 0x008e, XmlPullParserException -> 0x0092, TRY_LEAVE, TryCatch #18 {IOException -> 0x008e, XmlPullParserException -> 0x0092, blocks: (B:3:0x0006, B:6:0x0060, B:8:0x006b, B:11:0x0075, B:14:0x0081, B:16:0x0089, B:22:0x0098, B:25:0x00a4, B:29:0x00b6, B:31:0x00d5, B:33:0x00e3, B:35:0x00ea, B:37:0x00f6, B:39:0x0101, B:69:0x018f, B:87:0x01e9, B:90:0x01f7, B:92:0x01fd, B:94:0x0205, B:96:0x020d, B:98:0x0215, B:100:0x021d, B:102:0x0225, B:104:0x022b, B:106:0x0233, B:108:0x023b, B:110:0x0241, B:112:0x0247, B:114:0x024f, B:116:0x0257, B:119:0x0260, B:391:0x06c8, B:121:0x0286, B:123:0x028c, B:125:0x0295, B:127:0x02a4, B:129:0x02ae, B:131:0x02c2, B:133:0x02c8, B:261:0x04fa, B:136:0x02d3, B:138:0x02db, B:140:0x02e1, B:142:0x02ec, B:144:0x02f4, B:145:0x02fb, B:148:0x0302, B:260:0x04f3, B:152:0x0311, B:154:0x0319, B:158:0x0332, B:160:0x0339, B:162:0x0347, B:178:0x0391, B:180:0x0397, B:183:0x03a6, B:185:0x03ad, B:187:0x03bb, B:202:0x040a, B:204:0x0412, B:224:0x0457, B:226:0x045f, B:252:0x04a7, B:189:0x03c6, B:190:0x03d1, B:193:0x03d9, B:196:0x03e5, B:198:0x03ec, B:200:0x03f8, B:253:0x04b3, B:254:0x04be, B:255:0x04c9, B:165:0x0350, B:166:0x035a, B:169:0x0364, B:172:0x036f, B:174:0x0376, B:176:0x0382, B:256:0x04d0, B:257:0x04db, B:258:0x04e6, B:266:0x0516, B:269:0x0533, B:325:0x05d9, B:303:0x058f, B:306:0x0598, B:366:0x0657, B:313:0x05aa, B:316:0x05b4, B:320:0x05c2, B:323:0x05ca, B:324:0x05d2, B:330:0x05ea, B:334:0x05f6, B:338:0x05ff, B:346:0x0612, B:353:0x0623, B:355:0x0633, B:357:0x0638, B:348:0x0619, B:72:0x0197, B:74:0x01a3, B:77:0x01ae, B:79:0x01b5, B:81:0x01c1, B:83:0x01cb, B:43:0x011b, B:46:0x0129, B:49:0x0132, B:51:0x0139, B:53:0x0140, B:55:0x0147, B:61:0x015d, B:63:0x0164, B:68:0x0187, B:371:0x0677, B:375:0x0688, B:377:0x0692, B:379:0x069f, B:381:0x06a7, B:385:0x06ba, B:389:0x06c2), top: B:433:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01ad  */
    public final zzaka zzb(byte[] bArr, int i, int i2) {
        String str;
        String str2;
        HashMap map;
        ArrayDeque arrayDeque;
        zzalj zzaljVar;
        int i3;
        HashMap map2;
        boolean zEquals;
        String str3;
        HashMap map3;
        zzald zzaldVar;
        zzald zzaldVar2;
        zzakb zzakbVar;
        int attributeCount;
        long j;
        String[] strArr;
        String strSubstring;
        long jZzc;
        long jZzc2;
        long jZzc3;
        String str4;
        int i4;
        zzalc zzalcVar;
        zzalc zzalcVar2;
        zzalc zzalcVarZzb;
        long j2;
        long j3;
        String attributeName;
        String attributeValue;
        byte b;
        String[] strArrZzg;
        String strZza;
        String strZza2;
        String str5;
        Pattern pattern;
        Matcher matcher;
        Pattern pattern2;
        Matcher matcher2;
        float f;
        float f2;
        float f3;
        String strZza3;
        Matcher matcher3;
        Matcher matcher4;
        float f4;
        float f5;
        String strZza4;
        float f6;
        int i5;
        String strZza5;
        int i6;
        zzalg zzalgVar;
        String strZza6;
        int iHashCode;
        byte b2;
        String strZza7;
        int iHashCode2;
        byte b3;
        String strZza8;
        String strZza9;
        zzali zzaliVarZzf;
        String strZzE;
        String[] strArrZzg2;
        int length;
        int i7;
        float f7;
        int i8;
        boolean z;
        String strZza10;
        Matcher matcher5;
        String str6 = "";
        String str7 = "http://www.w3.org/ns/ttml#parameter";
        try {
            XmlPullParser xmlPullParserNewPullParser = this.zzi.newPullParser();
            HashMap map4 = new HashMap();
            HashMap map5 = new HashMap();
            HashMap map6 = new HashMap();
            map5.put("", new zzalg("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, i, i2), null);
            ArrayDeque arrayDeque2 = new ArrayDeque();
            int eventType = xmlPullParserNewPullParser.getEventType();
            zzald zzaldVar3 = zzh;
            zzalj zzaljVar2 = null;
            zzale zzaleVar = null;
            int i9 = 0;
            int i10 = 15;
            while (eventType != 1) {
                zzalc zzalcVar3 = (zzalc) arrayDeque2.peek();
                if (i9 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    str = str6;
                    if (eventType == 2) {
                        if (TtmlNode.TAG_TT.equals(name)) {
                            String attributeValue2 = xmlPullParserNewPullParser.getAttributeValue(str7, "frameRate");
                            int i11 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 30;
                            String attributeValue3 = xmlPullParserNewPullParser.getAttributeValue(str7, "frameRateMultiplier");
                            if (attributeValue3 != null) {
                                int i12 = zzei.zza;
                                String[] strArrSplit = attributeValue3.split(" ", -1);
                                zzcw.zze(strArrSplit.length == 2, "frameRateMultiplier doesn't have 2 parts");
                                f7 = Integer.parseInt(strArrSplit[0]) / Integer.parseInt(strArrSplit[1]);
                            } else {
                                f7 = 1.0f;
                            }
                            zzald zzaldVar4 = zzh;
                            int i13 = zzaldVar4.zzb;
                            String attributeValue4 = xmlPullParserNewPullParser.getAttributeValue(str7, "subFrameRate");
                            int i14 = attributeValue4 != null ? Integer.parseInt(attributeValue4) : i13;
                            int i15 = zzaldVar4.zzc;
                            String attributeValue5 = xmlPullParserNewPullParser.getAttributeValue(str7, "tickRate");
                            zzald zzaldVar5 = new zzald(i11 * f7, i14, attributeValue5 != null ? Integer.parseInt(attributeValue5) : i15);
                            String attributeValue6 = xmlPullParserNewPullParser.getAttributeValue(str7, "cellResolution");
                            if (attributeValue6 == null) {
                                str2 = str7;
                                map2 = map5;
                                zzaldVar5 = zzaldVar5;
                                i10 = 15;
                            } else {
                                Matcher matcher6 = zzg.matcher(attributeValue6);
                                if (matcher6.matches()) {
                                    try {
                                        String strGroup = matcher6.group(1);
                                        strGroup.getClass();
                                        int i16 = Integer.parseInt(strGroup);
                                        str2 = str7;
                                        try {
                                            String strGroup2 = matcher6.group(2);
                                            strGroup2.getClass();
                                            int i17 = Integer.parseInt(strGroup2);
                                            if (i16 == 0) {
                                                i8 = i17;
                                                z = false;
                                            } else if (i17 != 0) {
                                                i8 = i17;
                                                z = true;
                                            } else {
                                                z = false;
                                                i8 = 0;
                                            }
                                            try {
                                                StringBuilder sb = new StringBuilder();
                                                map2 = map5;
                                                try {
                                                    sb.append("Invalid cell resolution ");
                                                    sb.append(i16);
                                                    sb.append(" ");
                                                    sb.append(i8);
                                                    zzcw.zze(z, sb.toString());
                                                    i10 = i8;
                                                } catch (NumberFormatException unused) {
                                                    zzdo.zzf("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue6));
                                                    i10 = 15;
                                                }
                                            } catch (NumberFormatException unused2) {
                                                map2 = map5;
                                            }
                                        } catch (NumberFormatException unused3) {
                                            map2 = map5;
                                            zzaldVar5 = zzaldVar5;
                                            zzdo.zzf("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue6));
                                            i10 = 15;
                                            strZza10 = zzej.zza(xmlPullParserNewPullParser, TtmlNode.ATTR_TTS_EXTENT);
                                            if (strZza10 == null) {
                                                zzaleVar = null;
                                            } else {
                                                matcher5 = zzf.matcher(strZza10);
                                                if (matcher5.matches()) {
                                                    try {
                                                        String strGroup3 = matcher5.group(1);
                                                        strGroup3.getClass();
                                                        int i18 = Integer.parseInt(strGroup3);
                                                        String strGroup4 = matcher5.group(2);
                                                        strGroup4.getClass();
                                                        zzaleVar = new zzale(i18, Integer.parseInt(strGroup4));
                                                    } catch (NumberFormatException unused4) {
                                                        zzdo.zzf("TtmlParser", "Ignoring malformed tts extent: ".concat(strZza10));
                                                        zzaleVar = null;
                                                    }
                                                } else {
                                                    zzdo.zzf("TtmlParser", "Ignoring non-pixel tts extent: ".concat(strZza10));
                                                }
                                                zzaleVar = null;
                                            }
                                            zzaldVar3 = zzaldVar5;
                                            i10 = i10;
                                            zEquals = name.equals(TtmlNode.TAG_TT);
                                            str3 = TtmlNode.TAG_METADATA;
                                            if (zEquals) {
                                                if (TtmlNode.TAG_HEAD.equals(name)) {
                                                    while (true) {
                                                        xmlPullParserNewPullParser.next();
                                                        if (zzej.zzc(xmlPullParserNewPullParser, TtmlNode.TAG_STYLE)) {
                                                            strZza9 = zzej.zza(xmlPullParserNewPullParser, TtmlNode.TAG_STYLE);
                                                            zzaliVarZzf = zzf(xmlPullParserNewPullParser, new zzali());
                                                            if (strZza9 != null) {
                                                                strArrZzg2 = zzg(strZza9);
                                                                i7 = 0;
                                                                for (length = strArrZzg2.length; i7 < length; length = length) {
                                                                    zzaliVarZzf.zzl((zzali) map4.get(strArrZzg2[i7]));
                                                                    i7++;
                                                                }
                                                            }
                                                            strZzE = zzaliVarZzf.zzE();
                                                            if (strZzE != null) {
                                                                map4.put(strZzE, zzaliVarZzf);
                                                            }
                                                        } else {
                                                            zzaldVar3 = zzaldVar3;
                                                            if (zzej.zzc(xmlPullParserNewPullParser, TtmlNode.TAG_REGION)) {
                                                                strZza = zzej.zza(xmlPullParserNewPullParser, "id");
                                                                if (strZza == null) {
                                                                    map3 = map4;
                                                                    str5 = str3;
                                                                } else {
                                                                    strZza2 = zzej.zza(xmlPullParserNewPullParser, "origin");
                                                                    if (strZza2 != null) {
                                                                        pattern = zzb;
                                                                        matcher = pattern.matcher(strZza2);
                                                                        pattern2 = zzf;
                                                                        str5 = str3;
                                                                        matcher2 = pattern2.matcher(strZza2);
                                                                        if (matcher.matches()) {
                                                                            map3 = map4;
                                                                            String strGroup5 = matcher.group(1);
                                                                            strGroup5.getClass();
                                                                            f = Float.parseFloat(strGroup5) / 100.0f;
                                                                            String strGroup6 = matcher.group(2);
                                                                            strGroup6.getClass();
                                                                            f2 = Float.parseFloat(strGroup6) / 100.0f;
                                                                            f3 = f;
                                                                            strZza3 = zzej.zza(xmlPullParserNewPullParser, TtmlNode.ATTR_TTS_EXTENT);
                                                                            if (strZza3 != null) {
                                                                                matcher3 = pattern.matcher(strZza3);
                                                                                matcher4 = pattern2.matcher(strZza3);
                                                                                if (matcher3.matches()) {
                                                                                    String strGroup7 = matcher3.group(1);
                                                                                    strGroup7.getClass();
                                                                                    float f8 = Float.parseFloat(strGroup7) / 100.0f;
                                                                                    String strGroup8 = matcher3.group(2);
                                                                                    strGroup8.getClass();
                                                                                    f4 = Float.parseFloat(strGroup8) / 100.0f;
                                                                                    f5 = f8;
                                                                                    strZza4 = zzej.zza(xmlPullParserNewPullParser, TtmlNode.ATTR_TTS_DISPLAY_ALIGN);
                                                                                    if (strZza4 != null) {
                                                                                        strZza7 = zzftt.zza(strZza4);
                                                                                        iHashCode2 = strZza7.hashCode();
                                                                                        if (iHashCode2 != -1364013995) {
                                                                                            if (iHashCode2 != 92734940) {
                                                                                                b3 = -1;
                                                                                            } else {
                                                                                                b3 = 1;
                                                                                            }
                                                                                        } else if (strZza7.equals(TtmlNode.CENTER)) {
                                                                                            b3 = 0;
                                                                                        } else {
                                                                                            b3 = -1;
                                                                                        }
                                                                                        if (b3 != 0) {
                                                                                            f6 = (f4 / 2.0f) + f2;
                                                                                            i5 = 1;
                                                                                        } else if (b3 != 1) {
                                                                                            f6 = f2;
                                                                                            i5 = 0;
                                                                                        } else {
                                                                                            f6 = f2 + f4;
                                                                                            i5 = 2;
                                                                                        }
                                                                                    } else {
                                                                                        f6 = f2;
                                                                                        i5 = 0;
                                                                                    }
                                                                                    float f9 = 1.0f / i10;
                                                                                    strZza5 = zzej.zza(xmlPullParserNewPullParser, "writingMode");
                                                                                    if (strZza5 != null) {
                                                                                        strZza6 = zzftt.zza(strZza5);
                                                                                        iHashCode = strZza6.hashCode();
                                                                                        if (iHashCode != 3694) {
                                                                                            if (iHashCode != 3553396) {
                                                                                                if (iHashCode != 3553576) {
                                                                                                    b2 = -1;
                                                                                                } else {
                                                                                                    b2 = 2;
                                                                                                }
                                                                                            } else if (strZza6.equals("tblr")) {
                                                                                                b2 = 1;
                                                                                            } else {
                                                                                                b2 = -1;
                                                                                            }
                                                                                        } else if (strZza6.equals("tb")) {
                                                                                            b2 = 0;
                                                                                        } else {
                                                                                            b2 = -1;
                                                                                        }
                                                                                        if (b2 != 0) {
                                                                                            i6 = 2;
                                                                                        } else {
                                                                                            i6 = 2;
                                                                                        }
                                                                                    } else {
                                                                                        i6 = Integer.MIN_VALUE;
                                                                                    }
                                                                                    zzalgVar = new zzalg(strZza, f3, f6, 0, i5, f5, f4, 1, f9, i6);
                                                                                } else if (matcher4.matches()) {
                                                                                    zzdo.zzf("TtmlParser", "Ignoring region with unsupported extent: ".concat(strZza2));
                                                                                } else if (zzaleVar == null) {
                                                                                    zzdo.zzf("TtmlParser", "Ignoring region with missing tts:extent: ".concat(strZza2));
                                                                                } else {
                                                                                    String strGroup9 = matcher4.group(1);
                                                                                    strGroup9.getClass();
                                                                                    int i19 = Integer.parseInt(strGroup9);
                                                                                    String strGroup10 = matcher4.group(2);
                                                                                    strGroup10.getClass();
                                                                                    int i20 = Integer.parseInt(strGroup10);
                                                                                    float f10 = i19 / zzaleVar.zza;
                                                                                    f4 = i20 / zzaleVar.zzb;
                                                                                    f5 = f10;
                                                                                    strZza4 = zzej.zza(xmlPullParserNewPullParser, TtmlNode.ATTR_TTS_DISPLAY_ALIGN);
                                                                                    if (strZza4 != null) {
                                                                                        strZza7 = zzftt.zza(strZza4);
                                                                                        iHashCode2 = strZza7.hashCode();
                                                                                        if (iHashCode2 != -1364013995) {
                                                                                            if (iHashCode2 != 92734940) {
                                                                                                b3 = -1;
                                                                                            } else {
                                                                                                b3 = 1;
                                                                                            }
                                                                                        } else if (strZza7.equals(TtmlNode.CENTER)) {
                                                                                            b3 = 0;
                                                                                        } else {
                                                                                            b3 = -1;
                                                                                        }
                                                                                        if (b3 != 0) {
                                                                                            f6 = (f4 / 2.0f) + f2;
                                                                                            i5 = 1;
                                                                                        } else if (b3 != 1) {
                                                                                            f6 = f2;
                                                                                            i5 = 0;
                                                                                        } else {
                                                                                            f6 = f2 + f4;
                                                                                            i5 = 2;
                                                                                        }
                                                                                    } else {
                                                                                        f6 = f2;
                                                                                        i5 = 0;
                                                                                    }
                                                                                    float f11 = 1.0f / i10;
                                                                                    strZza5 = zzej.zza(xmlPullParserNewPullParser, "writingMode");
                                                                                    if (strZza5 != null) {
                                                                                        strZza6 = zzftt.zza(strZza5);
                                                                                        iHashCode = strZza6.hashCode();
                                                                                        if (iHashCode != 3694) {
                                                                                            if (iHashCode != 3553396) {
                                                                                                if (iHashCode != 3553576) {
                                                                                                    b2 = -1;
                                                                                                } else {
                                                                                                    b2 = 2;
                                                                                                }
                                                                                            } else if (strZza6.equals("tblr")) {
                                                                                                b2 = 1;
                                                                                            } else {
                                                                                                b2 = -1;
                                                                                            }
                                                                                        } else if (strZza6.equals("tb")) {
                                                                                            b2 = 0;
                                                                                        } else {
                                                                                            b2 = -1;
                                                                                        }
                                                                                        if (b2 != 0) {
                                                                                            i6 = 2;
                                                                                        } else {
                                                                                            i6 = 2;
                                                                                        }
                                                                                    } else {
                                                                                        i6 = Integer.MIN_VALUE;
                                                                                    }
                                                                                    zzalgVar = new zzalg(strZza, f3, f6, 0, i5, f5, f4, 1, f11, i6);
                                                                                }
                                                                                if (zzalgVar != null) {
                                                                                    map5 = map2;
                                                                                    map5.put(zzalgVar.zza, zzalgVar);
                                                                                } else {
                                                                                    map5 = map2;
                                                                                }
                                                                            } else {
                                                                                zzdo.zzf("TtmlParser", "Ignoring region without an extent");
                                                                            }
                                                                        } else {
                                                                            map3 = map4;
                                                                            if (!matcher2.matches()) {
                                                                                zzdo.zzf("TtmlParser", "Ignoring region with unsupported origin: ".concat(strZza2));
                                                                            } else if (zzaleVar == null) {
                                                                                zzdo.zzf("TtmlParser", "Ignoring region with missing tts:extent: ".concat(strZza2));
                                                                            } else {
                                                                                String strGroup11 = matcher2.group(1);
                                                                                strGroup11.getClass();
                                                                                int i21 = Integer.parseInt(strGroup11);
                                                                                String strGroup12 = matcher2.group(2);
                                                                                strGroup12.getClass();
                                                                                int i22 = Integer.parseInt(strGroup12);
                                                                                f = i21 / zzaleVar.zza;
                                                                                f2 = i22 / zzaleVar.zzb;
                                                                                f3 = f;
                                                                                strZza3 = zzej.zza(xmlPullParserNewPullParser, TtmlNode.ATTR_TTS_EXTENT);
                                                                                if (strZza3 != null) {
                                                                                    matcher3 = pattern.matcher(strZza3);
                                                                                    matcher4 = pattern2.matcher(strZza3);
                                                                                    if (matcher3.matches()) {
                                                                                        String strGroup13 = matcher3.group(1);
                                                                                        strGroup13.getClass();
                                                                                        float f12 = Float.parseFloat(strGroup13) / 100.0f;
                                                                                        String strGroup14 = matcher3.group(2);
                                                                                        strGroup14.getClass();
                                                                                        f4 = Float.parseFloat(strGroup14) / 100.0f;
                                                                                        f5 = f12;
                                                                                        strZza4 = zzej.zza(xmlPullParserNewPullParser, TtmlNode.ATTR_TTS_DISPLAY_ALIGN);
                                                                                        if (strZza4 != null) {
                                                                                            strZza7 = zzftt.zza(strZza4);
                                                                                            iHashCode2 = strZza7.hashCode();
                                                                                            if (iHashCode2 != -1364013995) {
                                                                                                if (iHashCode2 != 92734940) {
                                                                                                    b3 = -1;
                                                                                                } else {
                                                                                                    b3 = 1;
                                                                                                }
                                                                                            } else if (strZza7.equals(TtmlNode.CENTER)) {
                                                                                                b3 = 0;
                                                                                            } else {
                                                                                                b3 = -1;
                                                                                            }
                                                                                            if (b3 != 0) {
                                                                                                f6 = (f4 / 2.0f) + f2;
                                                                                                i5 = 1;
                                                                                            } else if (b3 != 1) {
                                                                                                f6 = f2;
                                                                                                i5 = 0;
                                                                                            } else {
                                                                                                f6 = f2 + f4;
                                                                                                i5 = 2;
                                                                                            }
                                                                                        } else {
                                                                                            f6 = f2;
                                                                                            i5 = 0;
                                                                                        }
                                                                                        float f13 = 1.0f / i10;
                                                                                        strZza5 = zzej.zza(xmlPullParserNewPullParser, "writingMode");
                                                                                        if (strZza5 != null) {
                                                                                            strZza6 = zzftt.zza(strZza5);
                                                                                            iHashCode = strZza6.hashCode();
                                                                                            if (iHashCode != 3694) {
                                                                                                if (iHashCode != 3553396) {
                                                                                                    if (iHashCode != 3553576) {
                                                                                                        b2 = -1;
                                                                                                    } else {
                                                                                                        b2 = 2;
                                                                                                    }
                                                                                                } else if (strZza6.equals("tblr")) {
                                                                                                    b2 = 1;
                                                                                                } else {
                                                                                                    b2 = -1;
                                                                                                }
                                                                                            } else if (strZza6.equals("tb")) {
                                                                                                b2 = 0;
                                                                                            } else {
                                                                                                b2 = -1;
                                                                                            }
                                                                                            if (b2 != 0) {
                                                                                                i6 = 2;
                                                                                            } else {
                                                                                                i6 = 2;
                                                                                            }
                                                                                        } else {
                                                                                            i6 = Integer.MIN_VALUE;
                                                                                        }
                                                                                        zzalgVar = new zzalg(strZza, f3, f6, 0, i5, f5, f4, 1, f13, i6);
                                                                                    } else if (matcher4.matches()) {
                                                                                        zzdo.zzf("TtmlParser", "Ignoring region with unsupported extent: ".concat(strZza2));
                                                                                    } else if (zzaleVar == null) {
                                                                                        zzdo.zzf("TtmlParser", "Ignoring region with missing tts:extent: ".concat(strZza2));
                                                                                    } else {
                                                                                        String strGroup15 = matcher4.group(1);
                                                                                        strGroup15.getClass();
                                                                                        int i110 = Integer.parseInt(strGroup15);
                                                                                        String strGroup16 = matcher4.group(2);
                                                                                        strGroup16.getClass();
                                                                                        int i23 = Integer.parseInt(strGroup16);
                                                                                        float f14 = i110 / zzaleVar.zza;
                                                                                        f4 = i23 / zzaleVar.zzb;
                                                                                        f5 = f14;
                                                                                        strZza4 = zzej.zza(xmlPullParserNewPullParser, TtmlNode.ATTR_TTS_DISPLAY_ALIGN);
                                                                                        if (strZza4 != null) {
                                                                                            strZza7 = zzftt.zza(strZza4);
                                                                                            iHashCode2 = strZza7.hashCode();
                                                                                            if (iHashCode2 != -1364013995) {
                                                                                                if (iHashCode2 != 92734940) {
                                                                                                    b3 = -1;
                                                                                                } else {
                                                                                                    b3 = 1;
                                                                                                }
                                                                                            } else if (strZza7.equals(TtmlNode.CENTER)) {
                                                                                                b3 = 0;
                                                                                            } else {
                                                                                                b3 = -1;
                                                                                            }
                                                                                            if (b3 != 0) {
                                                                                                f6 = (f4 / 2.0f) + f2;
                                                                                                i5 = 1;
                                                                                            } else if (b3 != 1) {
                                                                                                f6 = f2;
                                                                                                i5 = 0;
                                                                                            } else {
                                                                                                f6 = f2 + f4;
                                                                                                i5 = 2;
                                                                                            }
                                                                                        } else {
                                                                                            f6 = f2;
                                                                                            i5 = 0;
                                                                                        }
                                                                                        float f15 = 1.0f / i10;
                                                                                        strZza5 = zzej.zza(xmlPullParserNewPullParser, "writingMode");
                                                                                        if (strZza5 != null) {
                                                                                            strZza6 = zzftt.zza(strZza5);
                                                                                            iHashCode = strZza6.hashCode();
                                                                                            if (iHashCode != 3694) {
                                                                                                if (iHashCode != 3553396) {
                                                                                                    if (iHashCode != 3553576) {
                                                                                                        b2 = -1;
                                                                                                    } else {
                                                                                                        b2 = 2;
                                                                                                    }
                                                                                                } else if (strZza6.equals("tblr")) {
                                                                                                    b2 = 1;
                                                                                                } else {
                                                                                                    b2 = -1;
                                                                                                }
                                                                                            } else if (strZza6.equals("tb")) {
                                                                                                b2 = 0;
                                                                                            } else {
                                                                                                b2 = -1;
                                                                                            }
                                                                                            if (b2 != 0) {
                                                                                                i6 = 2;
                                                                                            } else {
                                                                                                i6 = 2;
                                                                                            }
                                                                                        } else {
                                                                                            i6 = Integer.MIN_VALUE;
                                                                                        }
                                                                                        zzalgVar = new zzalg(strZza, f3, f6, 0, i5, f5, f4, 1, f15, i6);
                                                                                    }
                                                                                    if (zzalgVar != null) {
                                                                                        map5 = map2;
                                                                                        map5.put(zzalgVar.zza, zzalgVar);
                                                                                    } else {
                                                                                        map5 = map2;
                                                                                    }
                                                                                } else {
                                                                                    zzdo.zzf("TtmlParser", "Ignoring region without an extent");
                                                                                }
                                                                            }
                                                                        }
                                                                    } else {
                                                                        map3 = map4;
                                                                        str5 = str3;
                                                                        zzdo.zzf("TtmlParser", "Ignoring region without an origin");
                                                                    }
                                                                }
                                                                zzalgVar = null;
                                                                if (zzalgVar != null) {
                                                                    map5 = map2;
                                                                    map5.put(zzalgVar.zza, zzalgVar);
                                                                } else {
                                                                    map5 = map2;
                                                                }
                                                            } else if (zzej.zzc(xmlPullParserNewPullParser, str3)) {
                                                                do {
                                                                    xmlPullParserNewPullParser.next();
                                                                    if (zzej.zzc(xmlPullParserNewPullParser, "image")) {
                                                                        map6.put(strZza8, xmlPullParserNewPullParser.nextText());
                                                                    }
                                                                } while (!zzej.zzb(xmlPullParserNewPullParser, str3));
                                                            }
                                                            if (zzej.zzb(xmlPullParserNewPullParser, TtmlNode.TAG_HEAD)) {
                                                                zzaldVar2 = zzaldVar3;
                                                                arrayDeque = arrayDeque2;
                                                            } else {
                                                                map2 = map5;
                                                                zzaldVar3 = zzaldVar3;
                                                                str3 = str5;
                                                                map4 = map3;
                                                            }
                                                        }
                                                        map3 = map4;
                                                        str5 = str3;
                                                        map5 = map2;
                                                        if (zzej.zzb(xmlPullParserNewPullParser, TtmlNode.TAG_HEAD)) {
                                                            zzaldVar2 = zzaldVar3;
                                                            arrayDeque = arrayDeque2;
                                                        } else {
                                                            map2 = map5;
                                                            zzaldVar3 = zzaldVar3;
                                                            str3 = str5;
                                                            map4 = map3;
                                                        }
                                                    }
                                                } else {
                                                    map3 = map4;
                                                    zzaldVar = zzaldVar3;
                                                    map5 = map2;
                                                    attributeCount = xmlPullParserNewPullParser.getAttributeCount();
                                                    zzali zzaliVarZzf2 = zzf(xmlPullParserNewPullParser, null);
                                                    j = C.TIME_UNSET;
                                                    strArr = null;
                                                    strSubstring = null;
                                                    jZzc = -9223372036854775807L;
                                                    jZzc2 = -9223372036854775807L;
                                                    jZzc3 = -9223372036854775807L;
                                                    str4 = str;
                                                    i4 = 0;
                                                    while (i4 < attributeCount) {
                                                        attributeName = xmlPullParserNewPullParser.getAttributeName(i4);
                                                        attributeValue = xmlPullParserNewPullParser.getAttributeValue(i4);
                                                        switch (attributeName) {
                                                            case "region":
                                                                b = 4;
                                                                break;
                                                            case "dur":
                                                                b = 2;
                                                                break;
                                                            case "end":
                                                                b = 1;
                                                                break;
                                                            case "begin":
                                                                b = 0;
                                                                break;
                                                            case "style":
                                                                b = 3;
                                                                break;
                                                            case "backgroundImage":
                                                                b = 5;
                                                                break;
                                                            default:
                                                                b = -1;
                                                                break;
                                                        }
                                                        if (b == 0) {
                                                            zzaldVar2 = zzaldVar;
                                                            jZzc2 = zzc(attributeValue, zzaldVar2);
                                                        } else if (b == 1) {
                                                            zzaldVar2 = zzaldVar;
                                                            jZzc = zzc(attributeValue, zzaldVar2);
                                                        } else if (b != 2) {
                                                            if (b == 3) {
                                                                strArrZzg = zzg(attributeValue);
                                                                if (strArrZzg.length > 0) {
                                                                    strArr = strArrZzg;
                                                                }
                                                            } else if (b != 4) {
                                                                if (b == 5) {
                                                                    if (attributeValue.startsWith("#")) {
                                                                        strSubstring = attributeValue.substring(1);
                                                                    }
                                                                }
                                                            } else if (map5.containsKey(attributeValue)) {
                                                                str4 = attributeValue;
                                                            }
                                                            zzaldVar2 = zzaldVar;
                                                        } else {
                                                            zzaldVar2 = zzaldVar;
                                                            jZzc3 = zzc(attributeValue, zzaldVar2);
                                                        }
                                                        i4++;
                                                        zzaldVar = zzaldVar2;
                                                    }
                                                    zzaldVar2 = zzaldVar;
                                                    if (zzalcVar3 != null) {
                                                        zzalcVar = zzalcVar3;
                                                        j3 = zzalcVar.zzd;
                                                        if (j3 == C.TIME_UNSET) {
                                                            zzalcVar2 = zzalcVar;
                                                        } else {
                                                            if (jZzc2 != C.TIME_UNSET) {
                                                                jZzc2 += j3;
                                                            } else {
                                                                jZzc2 = -9223372036854775807L;
                                                            }
                                                            if (jZzc != C.TIME_UNSET) {
                                                                jZzc += j3;
                                                                zzalcVar2 = zzalcVar;
                                                            } else {
                                                                zzalcVar2 = zzalcVar;
                                                                jZzc = -9223372036854775807L;
                                                            }
                                                        }
                                                    } else {
                                                        zzalcVar = zzalcVar3;
                                                        zzalcVar2 = null;
                                                    }
                                                    if (jZzc != C.TIME_UNSET) {
                                                        j = jZzc;
                                                    } else if (jZzc3 != C.TIME_UNSET) {
                                                        j = jZzc2 + jZzc3;
                                                    } else if (zzalcVar2 != null) {
                                                        j2 = zzalcVar2.zze;
                                                        if (j2 != C.TIME_UNSET) {
                                                            j = j2;
                                                        }
                                                    }
                                                    zzalcVarZzb = zzalc.zzb(xmlPullParserNewPullParser.getName(), jZzc2, j, zzaliVarZzf2, strArr, str4, strSubstring, zzalcVar2);
                                                    arrayDeque = arrayDeque2;
                                                    arrayDeque.push(zzalcVarZzb);
                                                    if (zzalcVar != null) {
                                                        zzalcVar.zzf(zzalcVarZzb);
                                                    }
                                                }
                                                i10 = i10;
                                                zzaleVar = zzaleVar;
                                                zzaldVar3 = zzaldVar2;
                                                zzaljVar2 = zzaljVar2;
                                                i9 = i9;
                                                map = map3;
                                            } else {
                                                if (TtmlNode.TAG_HEAD.equals(name)) {
                                                    while (true) {
                                                        xmlPullParserNewPullParser.next();
                                                        if (zzej.zzc(xmlPullParserNewPullParser, TtmlNode.TAG_STYLE)) {
                                                            strZza9 = zzej.zza(xmlPullParserNewPullParser, TtmlNode.TAG_STYLE);
                                                            zzaliVarZzf = zzf(xmlPullParserNewPullParser, new zzali());
                                                            if (strZza9 != null) {
                                                                strArrZzg2 = zzg(strZza9);
                                                                i7 = 0;
                                                                while (i7 < length) {
                                                                    zzaliVarZzf.zzl((zzali) map4.get(strArrZzg2[i7]));
                                                                    i7++;
                                                                }
                                                            }
                                                            strZzE = zzaliVarZzf.zzE();
                                                            if (strZzE != null) {
                                                                map4.put(strZzE, zzaliVarZzf);
                                                            }
                                                        } else {
                                                            zzaldVar3 = zzaldVar3;
                                                            if (zzej.zzc(xmlPullParserNewPullParser, TtmlNode.TAG_REGION)) {
                                                                strZza = zzej.zza(xmlPullParserNewPullParser, "id");
                                                                if (strZza == null) {
                                                                    map3 = map4;
                                                                    str5 = str3;
                                                                } else {
                                                                    strZza2 = zzej.zza(xmlPullParserNewPullParser, "origin");
                                                                    if (strZza2 != null) {
                                                                        pattern = zzb;
                                                                        matcher = pattern.matcher(strZza2);
                                                                        pattern2 = zzf;
                                                                        str5 = str3;
                                                                        matcher2 = pattern2.matcher(strZza2);
                                                                        if (matcher.matches()) {
                                                                            map3 = map4;
                                                                            try {
                                                                                String strGroup17 = matcher.group(1);
                                                                                strGroup17.getClass();
                                                                                f = Float.parseFloat(strGroup17) / 100.0f;
                                                                                String strGroup18 = matcher.group(2);
                                                                                strGroup18.getClass();
                                                                                f2 = Float.parseFloat(strGroup18) / 100.0f;
                                                                                f3 = f;
                                                                                strZza3 = zzej.zza(xmlPullParserNewPullParser, TtmlNode.ATTR_TTS_EXTENT);
                                                                                if (strZza3 != null) {
                                                                                    matcher3 = pattern.matcher(strZza3);
                                                                                    matcher4 = pattern2.matcher(strZza3);
                                                                                    if (matcher3.matches()) {
                                                                                        try {
                                                                                            String strGroup19 = matcher3.group(1);
                                                                                            strGroup19.getClass();
                                                                                            float f16 = Float.parseFloat(strGroup19) / 100.0f;
                                                                                            String strGroup110 = matcher3.group(2);
                                                                                            strGroup110.getClass();
                                                                                            f4 = Float.parseFloat(strGroup110) / 100.0f;
                                                                                            f5 = f16;
                                                                                            strZza4 = zzej.zza(xmlPullParserNewPullParser, TtmlNode.ATTR_TTS_DISPLAY_ALIGN);
                                                                                            if (strZza4 != null) {
                                                                                                strZza7 = zzftt.zza(strZza4);
                                                                                                iHashCode2 = strZza7.hashCode();
                                                                                                if (iHashCode2 != -1364013995) {
                                                                                                    if (iHashCode2 != 92734940) {
                                                                                                        b3 = -1;
                                                                                                    } else {
                                                                                                        b3 = 1;
                                                                                                    }
                                                                                                } else if (strZza7.equals(TtmlNode.CENTER)) {
                                                                                                    b3 = 0;
                                                                                                } else {
                                                                                                    b3 = -1;
                                                                                                }
                                                                                                if (b3 != 0) {
                                                                                                    f6 = (f4 / 2.0f) + f2;
                                                                                                    i5 = 1;
                                                                                                } else if (b3 != 1) {
                                                                                                    f6 = f2;
                                                                                                    i5 = 0;
                                                                                                } else {
                                                                                                    f6 = f2 + f4;
                                                                                                    i5 = 2;
                                                                                                }
                                                                                            } else {
                                                                                                f6 = f2;
                                                                                                i5 = 0;
                                                                                            }
                                                                                            float f17 = 1.0f / i10;
                                                                                            strZza5 = zzej.zza(xmlPullParserNewPullParser, "writingMode");
                                                                                            if (strZza5 != null) {
                                                                                                strZza6 = zzftt.zza(strZza5);
                                                                                                iHashCode = strZza6.hashCode();
                                                                                                if (iHashCode != 3694) {
                                                                                                    if (iHashCode != 3553396) {
                                                                                                        if (iHashCode != 3553576) {
                                                                                                            b2 = -1;
                                                                                                        } else {
                                                                                                            b2 = 2;
                                                                                                        }
                                                                                                    } else if (strZza6.equals("tblr")) {
                                                                                                        b2 = 1;
                                                                                                    } else {
                                                                                                        b2 = -1;
                                                                                                    }
                                                                                                } else if (strZza6.equals("tb")) {
                                                                                                    b2 = 0;
                                                                                                } else {
                                                                                                    b2 = -1;
                                                                                                }
                                                                                                if (b2 != 0) {
                                                                                                    i6 = 2;
                                                                                                } else {
                                                                                                    i6 = 2;
                                                                                                }
                                                                                            } else {
                                                                                                i6 = Integer.MIN_VALUE;
                                                                                            }
                                                                                            zzalgVar = new zzalg(strZza, f3, f6, 0, i5, f5, f4, 1, f17, i6);
                                                                                        } catch (NumberFormatException unused5) {
                                                                                            zzdo.zzf("TtmlParser", "Ignoring region with malformed extent: ".concat(strZza2));
                                                                                            zzalgVar = null;
                                                                                        }
                                                                                    } else if (matcher4.matches()) {
                                                                                        zzdo.zzf("TtmlParser", "Ignoring region with unsupported extent: ".concat(strZza2));
                                                                                    } else if (zzaleVar == null) {
                                                                                        zzdo.zzf("TtmlParser", "Ignoring region with missing tts:extent: ".concat(strZza2));
                                                                                    } else {
                                                                                        try {
                                                                                            String strGroup111 = matcher4.group(1);
                                                                                            strGroup111.getClass();
                                                                                            int i111 = Integer.parseInt(strGroup111);
                                                                                            String strGroup112 = matcher4.group(2);
                                                                                            strGroup112.getClass();
                                                                                            int i24 = Integer.parseInt(strGroup112);
                                                                                            float f18 = i111 / zzaleVar.zza;
                                                                                            f4 = i24 / zzaleVar.zzb;
                                                                                            f5 = f18;
                                                                                            strZza4 = zzej.zza(xmlPullParserNewPullParser, TtmlNode.ATTR_TTS_DISPLAY_ALIGN);
                                                                                            if (strZza4 != null) {
                                                                                                strZza7 = zzftt.zza(strZza4);
                                                                                                iHashCode2 = strZza7.hashCode();
                                                                                                if (iHashCode2 != -1364013995) {
                                                                                                    if (iHashCode2 != 92734940) {
                                                                                                        b3 = -1;
                                                                                                    } else {
                                                                                                        b3 = 1;
                                                                                                    }
                                                                                                } else if (strZza7.equals(TtmlNode.CENTER)) {
                                                                                                    b3 = 0;
                                                                                                } else {
                                                                                                    b3 = -1;
                                                                                                }
                                                                                                if (b3 != 0) {
                                                                                                    f6 = (f4 / 2.0f) + f2;
                                                                                                    i5 = 1;
                                                                                                } else if (b3 != 1) {
                                                                                                    f6 = f2;
                                                                                                    i5 = 0;
                                                                                                } else {
                                                                                                    f6 = f2 + f4;
                                                                                                    i5 = 2;
                                                                                                }
                                                                                            } else {
                                                                                                f6 = f2;
                                                                                                i5 = 0;
                                                                                            }
                                                                                            float f19 = 1.0f / i10;
                                                                                            strZza5 = zzej.zza(xmlPullParserNewPullParser, "writingMode");
                                                                                            if (strZza5 != null) {
                                                                                                strZza6 = zzftt.zza(strZza5);
                                                                                                iHashCode = strZza6.hashCode();
                                                                                                if (iHashCode != 3694) {
                                                                                                    if (iHashCode != 3553396) {
                                                                                                        if (iHashCode != 3553576) {
                                                                                                            b2 = -1;
                                                                                                        } else {
                                                                                                            b2 = 2;
                                                                                                        }
                                                                                                    } else if (strZza6.equals("tblr")) {
                                                                                                        b2 = 1;
                                                                                                    } else {
                                                                                                        b2 = -1;
                                                                                                    }
                                                                                                } else if (strZza6.equals("tb")) {
                                                                                                    b2 = 0;
                                                                                                } else {
                                                                                                    b2 = -1;
                                                                                                }
                                                                                                if (b2 != 0) {
                                                                                                    i6 = 2;
                                                                                                } else {
                                                                                                    i6 = 2;
                                                                                                }
                                                                                            } else {
                                                                                                i6 = Integer.MIN_VALUE;
                                                                                            }
                                                                                            zzalgVar = new zzalg(strZza, f3, f6, 0, i5, f5, f4, 1, f19, i6);
                                                                                        } catch (NumberFormatException unused6) {
                                                                                            zzdo.zzf("TtmlParser", "Ignoring region with malformed extent: ".concat(strZza2));
                                                                                            zzalgVar = null;
                                                                                        }
                                                                                    }
                                                                                    if (zzalgVar != null) {
                                                                                        map5 = map2;
                                                                                        map5.put(zzalgVar.zza, zzalgVar);
                                                                                    } else {
                                                                                        map5 = map2;
                                                                                    }
                                                                                } else {
                                                                                    zzdo.zzf("TtmlParser", "Ignoring region without an extent");
                                                                                }
                                                                            } catch (NumberFormatException unused7) {
                                                                                zzdo.zzf("TtmlParser", "Ignoring region with malformed origin: ".concat(strZza2));
                                                                            }
                                                                        } else {
                                                                            map3 = map4;
                                                                            if (!matcher2.matches()) {
                                                                                zzdo.zzf("TtmlParser", "Ignoring region with unsupported origin: ".concat(strZza2));
                                                                            } else if (zzaleVar == null) {
                                                                                zzdo.zzf("TtmlParser", "Ignoring region with missing tts:extent: ".concat(strZza2));
                                                                            } else {
                                                                                try {
                                                                                    String strGroup113 = matcher2.group(1);
                                                                                    strGroup113.getClass();
                                                                                    int i25 = Integer.parseInt(strGroup113);
                                                                                    String strGroup114 = matcher2.group(2);
                                                                                    strGroup114.getClass();
                                                                                    int i26 = Integer.parseInt(strGroup114);
                                                                                    f = i25 / zzaleVar.zza;
                                                                                    f2 = i26 / zzaleVar.zzb;
                                                                                    f3 = f;
                                                                                    strZza3 = zzej.zza(xmlPullParserNewPullParser, TtmlNode.ATTR_TTS_EXTENT);
                                                                                    if (strZza3 != null) {
                                                                                        matcher3 = pattern.matcher(strZza3);
                                                                                        matcher4 = pattern2.matcher(strZza3);
                                                                                        if (matcher3.matches()) {
                                                                                            String strGroup115 = matcher3.group(1);
                                                                                            strGroup115.getClass();
                                                                                            float f110 = Float.parseFloat(strGroup115) / 100.0f;
                                                                                            String strGroup116 = matcher3.group(2);
                                                                                            strGroup116.getClass();
                                                                                            f4 = Float.parseFloat(strGroup116) / 100.0f;
                                                                                            f5 = f110;
                                                                                            strZza4 = zzej.zza(xmlPullParserNewPullParser, TtmlNode.ATTR_TTS_DISPLAY_ALIGN);
                                                                                            if (strZza4 != null) {
                                                                                                strZza7 = zzftt.zza(strZza4);
                                                                                                iHashCode2 = strZza7.hashCode();
                                                                                                if (iHashCode2 != -1364013995) {
                                                                                                    if (iHashCode2 != 92734940) {
                                                                                                        b3 = -1;
                                                                                                    } else {
                                                                                                        b3 = 1;
                                                                                                    }
                                                                                                } else if (strZza7.equals(TtmlNode.CENTER)) {
                                                                                                    b3 = 0;
                                                                                                } else {
                                                                                                    b3 = -1;
                                                                                                }
                                                                                                if (b3 != 0) {
                                                                                                    f6 = (f4 / 2.0f) + f2;
                                                                                                    i5 = 1;
                                                                                                } else if (b3 != 1) {
                                                                                                    f6 = f2;
                                                                                                    i5 = 0;
                                                                                                } else {
                                                                                                    f6 = f2 + f4;
                                                                                                    i5 = 2;
                                                                                                }
                                                                                            } else {
                                                                                                f6 = f2;
                                                                                                i5 = 0;
                                                                                            }
                                                                                            float f111 = 1.0f / i10;
                                                                                            strZza5 = zzej.zza(xmlPullParserNewPullParser, "writingMode");
                                                                                            if (strZza5 != null) {
                                                                                                strZza6 = zzftt.zza(strZza5);
                                                                                                iHashCode = strZza6.hashCode();
                                                                                                if (iHashCode != 3694) {
                                                                                                    if (iHashCode != 3553396) {
                                                                                                        if (iHashCode != 3553576) {
                                                                                                            b2 = -1;
                                                                                                        } else {
                                                                                                            b2 = 2;
                                                                                                        }
                                                                                                    } else if (strZza6.equals("tblr")) {
                                                                                                        b2 = 1;
                                                                                                    } else {
                                                                                                        b2 = -1;
                                                                                                    }
                                                                                                } else if (strZza6.equals("tb")) {
                                                                                                    b2 = 0;
                                                                                                } else {
                                                                                                    b2 = -1;
                                                                                                }
                                                                                                if (b2 != 0) {
                                                                                                    i6 = 2;
                                                                                                } else {
                                                                                                    i6 = 2;
                                                                                                }
                                                                                            } else {
                                                                                                i6 = Integer.MIN_VALUE;
                                                                                            }
                                                                                            zzalgVar = new zzalg(strZza, f3, f6, 0, i5, f5, f4, 1, f111, i6);
                                                                                        } else if (matcher4.matches()) {
                                                                                            zzdo.zzf("TtmlParser", "Ignoring region with unsupported extent: ".concat(strZza2));
                                                                                        } else if (zzaleVar == null) {
                                                                                            zzdo.zzf("TtmlParser", "Ignoring region with missing tts:extent: ".concat(strZza2));
                                                                                        } else {
                                                                                            String strGroup117 = matcher4.group(1);
                                                                                            strGroup117.getClass();
                                                                                            int i112 = Integer.parseInt(strGroup117);
                                                                                            String strGroup118 = matcher4.group(2);
                                                                                            strGroup118.getClass();
                                                                                            int i27 = Integer.parseInt(strGroup118);
                                                                                            float f112 = i112 / zzaleVar.zza;
                                                                                            f4 = i27 / zzaleVar.zzb;
                                                                                            f5 = f112;
                                                                                            strZza4 = zzej.zza(xmlPullParserNewPullParser, TtmlNode.ATTR_TTS_DISPLAY_ALIGN);
                                                                                            if (strZza4 != null) {
                                                                                                strZza7 = zzftt.zza(strZza4);
                                                                                                iHashCode2 = strZza7.hashCode();
                                                                                                if (iHashCode2 != -1364013995) {
                                                                                                    if (iHashCode2 != 92734940) {
                                                                                                        b3 = -1;
                                                                                                    } else {
                                                                                                        b3 = 1;
                                                                                                    }
                                                                                                } else if (strZza7.equals(TtmlNode.CENTER)) {
                                                                                                    b3 = 0;
                                                                                                } else {
                                                                                                    b3 = -1;
                                                                                                }
                                                                                                if (b3 != 0) {
                                                                                                    f6 = (f4 / 2.0f) + f2;
                                                                                                    i5 = 1;
                                                                                                } else if (b3 != 1) {
                                                                                                    f6 = f2;
                                                                                                    i5 = 0;
                                                                                                } else {
                                                                                                    f6 = f2 + f4;
                                                                                                    i5 = 2;
                                                                                                }
                                                                                            } else {
                                                                                                f6 = f2;
                                                                                                i5 = 0;
                                                                                            }
                                                                                            float f113 = 1.0f / i10;
                                                                                            strZza5 = zzej.zza(xmlPullParserNewPullParser, "writingMode");
                                                                                            if (strZza5 != null) {
                                                                                                strZza6 = zzftt.zza(strZza5);
                                                                                                iHashCode = strZza6.hashCode();
                                                                                                if (iHashCode != 3694) {
                                                                                                    if (iHashCode != 3553396) {
                                                                                                        if (iHashCode != 3553576) {
                                                                                                            b2 = -1;
                                                                                                        } else {
                                                                                                            b2 = 2;
                                                                                                        }
                                                                                                    } else if (strZza6.equals("tblr")) {
                                                                                                        b2 = 1;
                                                                                                    } else {
                                                                                                        b2 = -1;
                                                                                                    }
                                                                                                } else if (strZza6.equals("tb")) {
                                                                                                    b2 = 0;
                                                                                                } else {
                                                                                                    b2 = -1;
                                                                                                }
                                                                                                if (b2 != 0) {
                                                                                                    i6 = 2;
                                                                                                } else {
                                                                                                    i6 = 2;
                                                                                                }
                                                                                            } else {
                                                                                                i6 = Integer.MIN_VALUE;
                                                                                            }
                                                                                            zzalgVar = new zzalg(strZza, f3, f6, 0, i5, f5, f4, 1, f113, i6);
                                                                                        }
                                                                                        if (zzalgVar != null) {
                                                                                            map5 = map2;
                                                                                            map5.put(zzalgVar.zza, zzalgVar);
                                                                                        } else {
                                                                                            map5 = map2;
                                                                                        }
                                                                                    } else {
                                                                                        zzdo.zzf("TtmlParser", "Ignoring region without an extent");
                                                                                    }
                                                                                } catch (NumberFormatException unused8) {
                                                                                    zzdo.zzf("TtmlParser", "Ignoring region with malformed origin: ".concat(strZza2));
                                                                                }
                                                                            }
                                                                        }
                                                                    } else {
                                                                        map3 = map4;
                                                                        str5 = str3;
                                                                        zzdo.zzf("TtmlParser", "Ignoring region without an origin");
                                                                    }
                                                                }
                                                                zzalgVar = null;
                                                                if (zzalgVar != null) {
                                                                    map5 = map2;
                                                                    map5.put(zzalgVar.zza, zzalgVar);
                                                                } else {
                                                                    map5 = map2;
                                                                }
                                                            } else if (zzej.zzc(xmlPullParserNewPullParser, str3)) {
                                                                do {
                                                                    xmlPullParserNewPullParser.next();
                                                                    if (zzej.zzc(xmlPullParserNewPullParser, "image")) {
                                                                        map6.put(strZza8, xmlPullParserNewPullParser.nextText());
                                                                    }
                                                                } while (!zzej.zzb(xmlPullParserNewPullParser, str3));
                                                            }
                                                            if (zzej.zzb(xmlPullParserNewPullParser, TtmlNode.TAG_HEAD)) {
                                                                zzaldVar2 = zzaldVar3;
                                                                arrayDeque = arrayDeque2;
                                                            } else {
                                                                map2 = map5;
                                                                zzaldVar3 = zzaldVar3;
                                                                str3 = str5;
                                                                map4 = map3;
                                                            }
                                                        }
                                                        map3 = map4;
                                                        str5 = str3;
                                                        map5 = map2;
                                                        if (zzej.zzb(xmlPullParserNewPullParser, TtmlNode.TAG_HEAD)) {
                                                            zzaldVar2 = zzaldVar3;
                                                            arrayDeque = arrayDeque2;
                                                        } else {
                                                            map2 = map5;
                                                            zzaldVar3 = zzaldVar3;
                                                            str3 = str5;
                                                            map4 = map3;
                                                        }
                                                    }
                                                } else {
                                                    map3 = map4;
                                                    zzaldVar = zzaldVar3;
                                                    map5 = map2;
                                                    try {
                                                        attributeCount = xmlPullParserNewPullParser.getAttributeCount();
                                                        zzali zzaliVarZzf3 = zzf(xmlPullParserNewPullParser, null);
                                                        j = C.TIME_UNSET;
                                                        strArr = null;
                                                        strSubstring = null;
                                                        jZzc = -9223372036854775807L;
                                                        jZzc2 = -9223372036854775807L;
                                                        jZzc3 = -9223372036854775807L;
                                                        str4 = str;
                                                        i4 = 0;
                                                        while (i4 < attributeCount) {
                                                            try {
                                                                attributeName = xmlPullParserNewPullParser.getAttributeName(i4);
                                                                attributeValue = xmlPullParserNewPullParser.getAttributeValue(i4);
                                                                switch (attributeName) {
                                                                    case -934795532:
                                                                        if (!attributeName.equals(TtmlNode.TAG_REGION)) {
                                                                            b = 4;
                                                                        } else {
                                                                            b = -1;
                                                                        }
                                                                        break;
                                                                    case 99841:
                                                                        if (!attributeName.equals("dur")) {
                                                                            b = 2;
                                                                        } else {
                                                                            b = -1;
                                                                        }
                                                                        break;
                                                                    case 100571:
                                                                        if (!attributeName.equals(TtmlNode.END)) {
                                                                            b = 1;
                                                                        } else {
                                                                            b = -1;
                                                                        }
                                                                        break;
                                                                    case 93616297:
                                                                        if (!attributeName.equals("begin")) {
                                                                            b = 0;
                                                                        } else {
                                                                            b = -1;
                                                                        }
                                                                        break;
                                                                    case 109780401:
                                                                        if (!attributeName.equals(TtmlNode.TAG_STYLE)) {
                                                                            b = 3;
                                                                        } else {
                                                                            b = -1;
                                                                        }
                                                                        break;
                                                                    case 1292595405:
                                                                        if (!attributeName.equals("backgroundImage")) {
                                                                            b = 5;
                                                                        } else {
                                                                            b = -1;
                                                                        }
                                                                        break;
                                                                    default:
                                                                        b = -1;
                                                                        break;
                                                                }
                                                                if (b == 0) {
                                                                    zzaldVar2 = zzaldVar;
                                                                    jZzc2 = zzc(attributeValue, zzaldVar2);
                                                                } else if (b == 1) {
                                                                    zzaldVar2 = zzaldVar;
                                                                    jZzc = zzc(attributeValue, zzaldVar2);
                                                                } else if (b != 2) {
                                                                    if (b == 3) {
                                                                        strArrZzg = zzg(attributeValue);
                                                                        if (strArrZzg.length > 0) {
                                                                            strArr = strArrZzg;
                                                                        }
                                                                    } else if (b != 4) {
                                                                        if (b == 5) {
                                                                            try {
                                                                                if (attributeValue.startsWith("#")) {
                                                                                    try {
                                                                                        strSubstring = attributeValue.substring(1);
                                                                                    } catch (zzakb e) {
                                                                                        e = e;
                                                                                        zzakbVar = e;
                                                                                        zzaldVar2 = zzaldVar;
                                                                                        arrayDeque = arrayDeque2;
                                                                                        zzdo.zzg("TtmlParser", "Suppressing parser error", zzakbVar);
                                                                                        zzaldVar3 = zzaldVar2;
                                                                                        map = map3;
                                                                                        i9 = 1;
                                                                                        xmlPullParserNewPullParser.next();
                                                                                        eventType = xmlPullParserNewPullParser.getEventType();
                                                                                        map4 = map;
                                                                                        arrayDeque2 = arrayDeque;
                                                                                        str6 = str;
                                                                                        str7 = str2;
                                                                                    }
                                                                                }
                                                                            } catch (zzakb e2) {
                                                                                e = e2;
                                                                            }
                                                                        }
                                                                    } else if (map5.containsKey(attributeValue)) {
                                                                        str4 = attributeValue;
                                                                    }
                                                                    zzaldVar2 = zzaldVar;
                                                                } else {
                                                                    zzaldVar2 = zzaldVar;
                                                                    jZzc3 = zzc(attributeValue, zzaldVar2);
                                                                }
                                                                try {
                                                                    i4++;
                                                                    zzaldVar = zzaldVar2;
                                                                } catch (zzakb e3) {
                                                                    e = e3;
                                                                    zzakbVar = e;
                                                                    arrayDeque = arrayDeque2;
                                                                    zzdo.zzg("TtmlParser", "Suppressing parser error", zzakbVar);
                                                                    zzaldVar3 = zzaldVar2;
                                                                    map = map3;
                                                                    i9 = 1;
                                                                    xmlPullParserNewPullParser.next();
                                                                    eventType = xmlPullParserNewPullParser.getEventType();
                                                                    map4 = map;
                                                                    arrayDeque2 = arrayDeque;
                                                                    str6 = str;
                                                                    str7 = str2;
                                                                }
                                                            } catch (zzakb e4) {
                                                                e = e4;
                                                                zzaldVar2 = zzaldVar;
                                                            }
                                                        }
                                                        zzaldVar2 = zzaldVar;
                                                        if (zzalcVar3 != null) {
                                                            zzalcVar = zzalcVar3;
                                                            j3 = zzalcVar.zzd;
                                                            if (j3 == C.TIME_UNSET) {
                                                                zzalcVar2 = zzalcVar;
                                                            } else {
                                                                if (jZzc2 != C.TIME_UNSET) {
                                                                    jZzc2 += j3;
                                                                } else {
                                                                    jZzc2 = -9223372036854775807L;
                                                                }
                                                                if (jZzc != C.TIME_UNSET) {
                                                                    jZzc += j3;
                                                                    zzalcVar2 = zzalcVar;
                                                                } else {
                                                                    zzalcVar2 = zzalcVar;
                                                                    jZzc = -9223372036854775807L;
                                                                }
                                                            }
                                                        } else {
                                                            zzalcVar = zzalcVar3;
                                                            zzalcVar2 = null;
                                                        }
                                                        if (jZzc != C.TIME_UNSET) {
                                                            j = jZzc;
                                                        } else if (jZzc3 != C.TIME_UNSET) {
                                                            j = jZzc2 + jZzc3;
                                                        } else if (zzalcVar2 != null) {
                                                            j2 = zzalcVar2.zze;
                                                            if (j2 != C.TIME_UNSET) {
                                                                j = j2;
                                                            }
                                                        }
                                                        try {
                                                            zzalcVarZzb = zzalc.zzb(xmlPullParserNewPullParser.getName(), jZzc2, j, zzaliVarZzf3, strArr, str4, strSubstring, zzalcVar2);
                                                            arrayDeque = arrayDeque2;
                                                            try {
                                                                arrayDeque.push(zzalcVarZzb);
                                                                if (zzalcVar != null) {
                                                                    zzalcVar.zzf(zzalcVarZzb);
                                                                }
                                                            } catch (zzakb e5) {
                                                                e = e5;
                                                                zzakbVar = e;
                                                                zzdo.zzg("TtmlParser", "Suppressing parser error", zzakbVar);
                                                                zzaldVar3 = zzaldVar2;
                                                                map = map3;
                                                                i9 = 1;
                                                            }
                                                        } catch (zzakb e6) {
                                                            e = e6;
                                                            arrayDeque = arrayDeque2;
                                                        }
                                                    } catch (zzakb e7) {
                                                        e = e7;
                                                        zzaldVar2 = zzaldVar;
                                                        arrayDeque = arrayDeque2;
                                                    }
                                                }
                                                i10 = i10;
                                                zzaleVar = zzaleVar;
                                                zzaldVar3 = zzaldVar2;
                                                zzaljVar2 = zzaljVar2;
                                                i9 = i9;
                                                map = map3;
                                            }
                                            xmlPullParserNewPullParser.next();
                                            eventType = xmlPullParserNewPullParser.getEventType();
                                            map4 = map;
                                            arrayDeque2 = arrayDeque;
                                            str6 = str;
                                            str7 = str2;
                                        }
                                    } catch (NumberFormatException unused9) {
                                        str2 = str7;
                                    }
                                } else {
                                    zzdo.zzf("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue6));
                                    str2 = str7;
                                    map2 = map5;
                                    zzaldVar5 = zzaldVar5;
                                    i10 = 15;
                                }
                            }
                            strZza10 = zzej.zza(xmlPullParserNewPullParser, TtmlNode.ATTR_TTS_EXTENT);
                            if (strZza10 == null) {
                                zzaleVar = null;
                            } else {
                                matcher5 = zzf.matcher(strZza10);
                                if (matcher5.matches()) {
                                    zzdo.zzf("TtmlParser", "Ignoring non-pixel tts extent: ".concat(strZza10));
                                } else {
                                    String strGroup20 = matcher5.group(1);
                                    strGroup20.getClass();
                                    int i113 = Integer.parseInt(strGroup20);
                                    String strGroup21 = matcher5.group(2);
                                    strGroup21.getClass();
                                    zzaleVar = new zzale(i113, Integer.parseInt(strGroup21));
                                }
                                zzaleVar = null;
                            }
                            zzaldVar3 = zzaldVar5;
                        } else {
                            str2 = str7;
                            map2 = map5;
                            arrayDeque2 = arrayDeque2;
                            zzalcVar3 = zzalcVar3;
                            i9 = i9;
                            zzaleVar = zzaleVar;
                        }
                        i10 = i10;
                        zEquals = name.equals(TtmlNode.TAG_TT);
                        str3 = TtmlNode.TAG_METADATA;
                        if (zEquals || name.equals(TtmlNode.TAG_HEAD) || name.equals(TtmlNode.TAG_BODY) || name.equals(TtmlNode.TAG_DIV) || name.equals("p") || name.equals(TtmlNode.TAG_SPAN) || name.equals(TtmlNode.TAG_BR) || name.equals(TtmlNode.TAG_STYLE) || name.equals(TtmlNode.TAG_STYLING) || name.equals(TtmlNode.TAG_LAYOUT) || name.equals(TtmlNode.TAG_REGION) || name.equals(TtmlNode.TAG_METADATA) || name.equals("image") || name.equals("data") || name.equals("information")) {
                            if (TtmlNode.TAG_HEAD.equals(name)) {
                                while (true) {
                                    xmlPullParserNewPullParser.next();
                                    if (zzej.zzc(xmlPullParserNewPullParser, TtmlNode.TAG_STYLE)) {
                                        strZza9 = zzej.zza(xmlPullParserNewPullParser, TtmlNode.TAG_STYLE);
                                        zzaliVarZzf = zzf(xmlPullParserNewPullParser, new zzali());
                                        if (strZza9 != null) {
                                            strArrZzg2 = zzg(strZza9);
                                            i7 = 0;
                                            while (i7 < length) {
                                                zzaliVarZzf.zzl((zzali) map4.get(strArrZzg2[i7]));
                                                i7++;
                                            }
                                        }
                                        strZzE = zzaliVarZzf.zzE();
                                        if (strZzE != null) {
                                            map4.put(strZzE, zzaliVarZzf);
                                        }
                                    } else {
                                        zzaldVar3 = zzaldVar3;
                                        if (zzej.zzc(xmlPullParserNewPullParser, TtmlNode.TAG_REGION)) {
                                            strZza = zzej.zza(xmlPullParserNewPullParser, "id");
                                            if (strZza == null) {
                                                map3 = map4;
                                                str5 = str3;
                                            } else {
                                                strZza2 = zzej.zza(xmlPullParserNewPullParser, "origin");
                                                if (strZza2 != null) {
                                                    pattern = zzb;
                                                    matcher = pattern.matcher(strZza2);
                                                    pattern2 = zzf;
                                                    str5 = str3;
                                                    matcher2 = pattern2.matcher(strZza2);
                                                    if (matcher.matches()) {
                                                        map3 = map4;
                                                        String strGroup119 = matcher.group(1);
                                                        strGroup119.getClass();
                                                        f = Float.parseFloat(strGroup119) / 100.0f;
                                                        String strGroup120 = matcher.group(2);
                                                        strGroup120.getClass();
                                                        f2 = Float.parseFloat(strGroup120) / 100.0f;
                                                        f3 = f;
                                                        strZza3 = zzej.zza(xmlPullParserNewPullParser, TtmlNode.ATTR_TTS_EXTENT);
                                                        if (strZza3 != null) {
                                                            matcher3 = pattern.matcher(strZza3);
                                                            matcher4 = pattern2.matcher(strZza3);
                                                            if (matcher3.matches()) {
                                                                String strGroup1110 = matcher3.group(1);
                                                                strGroup1110.getClass();
                                                                float f114 = Float.parseFloat(strGroup1110) / 100.0f;
                                                                String strGroup1111 = matcher3.group(2);
                                                                strGroup1111.getClass();
                                                                f4 = Float.parseFloat(strGroup1111) / 100.0f;
                                                                f5 = f114;
                                                                strZza4 = zzej.zza(xmlPullParserNewPullParser, TtmlNode.ATTR_TTS_DISPLAY_ALIGN);
                                                                if (strZza4 != null) {
                                                                    strZza7 = zzftt.zza(strZza4);
                                                                    iHashCode2 = strZza7.hashCode();
                                                                    if (iHashCode2 != -1364013995) {
                                                                        if (iHashCode2 != 92734940 && strZza7.equals("after")) {
                                                                            b3 = 1;
                                                                        } else {
                                                                            b3 = -1;
                                                                        }
                                                                    } else if (strZza7.equals(TtmlNode.CENTER)) {
                                                                        b3 = 0;
                                                                    } else {
                                                                        b3 = -1;
                                                                    }
                                                                    if (b3 != 0) {
                                                                        f6 = (f4 / 2.0f) + f2;
                                                                        i5 = 1;
                                                                    } else if (b3 != 1) {
                                                                        f6 = f2;
                                                                        i5 = 0;
                                                                    } else {
                                                                        f6 = f2 + f4;
                                                                        i5 = 2;
                                                                    }
                                                                } else {
                                                                    f6 = f2;
                                                                    i5 = 0;
                                                                }
                                                                float f115 = 1.0f / i10;
                                                                strZza5 = zzej.zza(xmlPullParserNewPullParser, "writingMode");
                                                                if (strZza5 != null) {
                                                                    strZza6 = zzftt.zza(strZza5);
                                                                    iHashCode = strZza6.hashCode();
                                                                    if (iHashCode != 3694) {
                                                                        if (iHashCode != 3553396) {
                                                                            if (iHashCode != 3553576 && strZza6.equals("tbrl")) {
                                                                                b2 = 2;
                                                                            } else {
                                                                                b2 = -1;
                                                                            }
                                                                        } else if (strZza6.equals("tblr")) {
                                                                            b2 = 1;
                                                                        } else {
                                                                            b2 = -1;
                                                                        }
                                                                    } else if (strZza6.equals("tb")) {
                                                                        b2 = 0;
                                                                    } else {
                                                                        b2 = -1;
                                                                    }
                                                                    if (b2 != 0 || b2 == 1) {
                                                                        i6 = 2;
                                                                    } else if (b2 != 2) {
                                                                        i6 = Integer.MIN_VALUE;
                                                                    } else {
                                                                        i6 = 1;
                                                                    }
                                                                } else {
                                                                    i6 = Integer.MIN_VALUE;
                                                                }
                                                                zzalgVar = new zzalg(strZza, f3, f6, 0, i5, f5, f4, 1, f115, i6);
                                                            } else if (matcher4.matches()) {
                                                                zzdo.zzf("TtmlParser", "Ignoring region with unsupported extent: ".concat(strZza2));
                                                            } else if (zzaleVar == null) {
                                                                zzdo.zzf("TtmlParser", "Ignoring region with missing tts:extent: ".concat(strZza2));
                                                            } else {
                                                                String strGroup1112 = matcher4.group(1);
                                                                strGroup1112.getClass();
                                                                int i114 = Integer.parseInt(strGroup1112);
                                                                String strGroup1113 = matcher4.group(2);
                                                                strGroup1113.getClass();
                                                                int i28 = Integer.parseInt(strGroup1113);
                                                                float f116 = i114 / zzaleVar.zza;
                                                                f4 = i28 / zzaleVar.zzb;
                                                                f5 = f116;
                                                                strZza4 = zzej.zza(xmlPullParserNewPullParser, TtmlNode.ATTR_TTS_DISPLAY_ALIGN);
                                                                if (strZza4 != null) {
                                                                    strZza7 = zzftt.zza(strZza4);
                                                                    iHashCode2 = strZza7.hashCode();
                                                                    if (iHashCode2 != -1364013995) {
                                                                        if (iHashCode2 != 92734940) {
                                                                            b3 = -1;
                                                                        } else {
                                                                            b3 = 1;
                                                                        }
                                                                    } else if (strZza7.equals(TtmlNode.CENTER)) {
                                                                        b3 = 0;
                                                                    } else {
                                                                        b3 = -1;
                                                                    }
                                                                    if (b3 != 0) {
                                                                        f6 = (f4 / 2.0f) + f2;
                                                                        i5 = 1;
                                                                    } else if (b3 != 1) {
                                                                        f6 = f2;
                                                                        i5 = 0;
                                                                    } else {
                                                                        f6 = f2 + f4;
                                                                        i5 = 2;
                                                                    }
                                                                } else {
                                                                    f6 = f2;
                                                                    i5 = 0;
                                                                }
                                                                float f117 = 1.0f / i10;
                                                                strZza5 = zzej.zza(xmlPullParserNewPullParser, "writingMode");
                                                                if (strZza5 != null) {
                                                                    strZza6 = zzftt.zza(strZza5);
                                                                    iHashCode = strZza6.hashCode();
                                                                    if (iHashCode != 3694) {
                                                                        if (iHashCode != 3553396) {
                                                                            if (iHashCode != 3553576) {
                                                                                b2 = -1;
                                                                            } else {
                                                                                b2 = 2;
                                                                            }
                                                                        } else if (strZza6.equals("tblr")) {
                                                                            b2 = 1;
                                                                        } else {
                                                                            b2 = -1;
                                                                        }
                                                                    } else if (strZza6.equals("tb")) {
                                                                        b2 = 0;
                                                                    } else {
                                                                        b2 = -1;
                                                                    }
                                                                    if (b2 != 0) {
                                                                        i6 = 2;
                                                                    } else {
                                                                        i6 = 2;
                                                                    }
                                                                } else {
                                                                    i6 = Integer.MIN_VALUE;
                                                                }
                                                                zzalgVar = new zzalg(strZza, f3, f6, 0, i5, f5, f4, 1, f117, i6);
                                                            }
                                                            if (zzalgVar != null) {
                                                                map5 = map2;
                                                                map5.put(zzalgVar.zza, zzalgVar);
                                                            } else {
                                                                map5 = map2;
                                                            }
                                                        } else {
                                                            zzdo.zzf("TtmlParser", "Ignoring region without an extent");
                                                        }
                                                    } else {
                                                        map3 = map4;
                                                        if (!matcher2.matches()) {
                                                            zzdo.zzf("TtmlParser", "Ignoring region with unsupported origin: ".concat(strZza2));
                                                        } else if (zzaleVar == null) {
                                                            zzdo.zzf("TtmlParser", "Ignoring region with missing tts:extent: ".concat(strZza2));
                                                        } else {
                                                            String strGroup1114 = matcher2.group(1);
                                                            strGroup1114.getClass();
                                                            int i29 = Integer.parseInt(strGroup1114);
                                                            String strGroup1115 = matcher2.group(2);
                                                            strGroup1115.getClass();
                                                            int i210 = Integer.parseInt(strGroup1115);
                                                            f = i29 / zzaleVar.zza;
                                                            f2 = i210 / zzaleVar.zzb;
                                                            f3 = f;
                                                            strZza3 = zzej.zza(xmlPullParserNewPullParser, TtmlNode.ATTR_TTS_EXTENT);
                                                            if (strZza3 != null) {
                                                                matcher3 = pattern.matcher(strZza3);
                                                                matcher4 = pattern2.matcher(strZza3);
                                                                if (matcher3.matches()) {
                                                                    String strGroup1116 = matcher3.group(1);
                                                                    strGroup1116.getClass();
                                                                    float f118 = Float.parseFloat(strGroup1116) / 100.0f;
                                                                    String strGroup1117 = matcher3.group(2);
                                                                    strGroup1117.getClass();
                                                                    f4 = Float.parseFloat(strGroup1117) / 100.0f;
                                                                    f5 = f118;
                                                                    strZza4 = zzej.zza(xmlPullParserNewPullParser, TtmlNode.ATTR_TTS_DISPLAY_ALIGN);
                                                                    if (strZza4 != null) {
                                                                        strZza7 = zzftt.zza(strZza4);
                                                                        iHashCode2 = strZza7.hashCode();
                                                                        if (iHashCode2 != -1364013995) {
                                                                            if (iHashCode2 != 92734940) {
                                                                                b3 = -1;
                                                                            } else {
                                                                                b3 = 1;
                                                                            }
                                                                        } else if (strZza7.equals(TtmlNode.CENTER)) {
                                                                            b3 = 0;
                                                                        } else {
                                                                            b3 = -1;
                                                                        }
                                                                        if (b3 != 0) {
                                                                            f6 = (f4 / 2.0f) + f2;
                                                                            i5 = 1;
                                                                        } else if (b3 != 1) {
                                                                            f6 = f2;
                                                                            i5 = 0;
                                                                        } else {
                                                                            f6 = f2 + f4;
                                                                            i5 = 2;
                                                                        }
                                                                    } else {
                                                                        f6 = f2;
                                                                        i5 = 0;
                                                                    }
                                                                    float f119 = 1.0f / i10;
                                                                    strZza5 = zzej.zza(xmlPullParserNewPullParser, "writingMode");
                                                                    if (strZza5 != null) {
                                                                        strZza6 = zzftt.zza(strZza5);
                                                                        iHashCode = strZza6.hashCode();
                                                                        if (iHashCode != 3694) {
                                                                            if (iHashCode != 3553396) {
                                                                                if (iHashCode != 3553576) {
                                                                                    b2 = -1;
                                                                                } else {
                                                                                    b2 = 2;
                                                                                }
                                                                            } else if (strZza6.equals("tblr")) {
                                                                                b2 = 1;
                                                                            } else {
                                                                                b2 = -1;
                                                                            }
                                                                        } else if (strZza6.equals("tb")) {
                                                                            b2 = 0;
                                                                        } else {
                                                                            b2 = -1;
                                                                        }
                                                                        if (b2 != 0) {
                                                                            i6 = 2;
                                                                        } else {
                                                                            i6 = 2;
                                                                        }
                                                                    } else {
                                                                        i6 = Integer.MIN_VALUE;
                                                                    }
                                                                    zzalgVar = new zzalg(strZza, f3, f6, 0, i5, f5, f4, 1, f119, i6);
                                                                } else if (matcher4.matches()) {
                                                                    zzdo.zzf("TtmlParser", "Ignoring region with unsupported extent: ".concat(strZza2));
                                                                } else if (zzaleVar == null) {
                                                                    zzdo.zzf("TtmlParser", "Ignoring region with missing tts:extent: ".concat(strZza2));
                                                                } else {
                                                                    String strGroup1118 = matcher4.group(1);
                                                                    strGroup1118.getClass();
                                                                    int i115 = Integer.parseInt(strGroup1118);
                                                                    String strGroup1119 = matcher4.group(2);
                                                                    strGroup1119.getClass();
                                                                    int i211 = Integer.parseInt(strGroup1119);
                                                                    float f1110 = i115 / zzaleVar.zza;
                                                                    f4 = i211 / zzaleVar.zzb;
                                                                    f5 = f1110;
                                                                    strZza4 = zzej.zza(xmlPullParserNewPullParser, TtmlNode.ATTR_TTS_DISPLAY_ALIGN);
                                                                    if (strZza4 != null) {
                                                                        strZza7 = zzftt.zza(strZza4);
                                                                        iHashCode2 = strZza7.hashCode();
                                                                        if (iHashCode2 != -1364013995) {
                                                                            if (iHashCode2 != 92734940) {
                                                                                b3 = -1;
                                                                            } else {
                                                                                b3 = 1;
                                                                            }
                                                                        } else if (strZza7.equals(TtmlNode.CENTER)) {
                                                                            b3 = 0;
                                                                        } else {
                                                                            b3 = -1;
                                                                        }
                                                                        if (b3 != 0) {
                                                                            f6 = (f4 / 2.0f) + f2;
                                                                            i5 = 1;
                                                                        } else if (b3 != 1) {
                                                                            f6 = f2;
                                                                            i5 = 0;
                                                                        } else {
                                                                            f6 = f2 + f4;
                                                                            i5 = 2;
                                                                        }
                                                                    } else {
                                                                        f6 = f2;
                                                                        i5 = 0;
                                                                    }
                                                                    float f1111 = 1.0f / i10;
                                                                    strZza5 = zzej.zza(xmlPullParserNewPullParser, "writingMode");
                                                                    if (strZza5 != null) {
                                                                        strZza6 = zzftt.zza(strZza5);
                                                                        iHashCode = strZza6.hashCode();
                                                                        if (iHashCode != 3694) {
                                                                            if (iHashCode != 3553396) {
                                                                                if (iHashCode != 3553576) {
                                                                                    b2 = -1;
                                                                                } else {
                                                                                    b2 = 2;
                                                                                }
                                                                            } else if (strZza6.equals("tblr")) {
                                                                                b2 = 1;
                                                                            } else {
                                                                                b2 = -1;
                                                                            }
                                                                        } else if (strZza6.equals("tb")) {
                                                                            b2 = 0;
                                                                        } else {
                                                                            b2 = -1;
                                                                        }
                                                                        if (b2 != 0) {
                                                                            i6 = 2;
                                                                        } else {
                                                                            i6 = 2;
                                                                        }
                                                                    } else {
                                                                        i6 = Integer.MIN_VALUE;
                                                                    }
                                                                    zzalgVar = new zzalg(strZza, f3, f6, 0, i5, f5, f4, 1, f1111, i6);
                                                                }
                                                                if (zzalgVar != null) {
                                                                    map5 = map2;
                                                                    map5.put(zzalgVar.zza, zzalgVar);
                                                                } else {
                                                                    map5 = map2;
                                                                }
                                                            } else {
                                                                zzdo.zzf("TtmlParser", "Ignoring region without an extent");
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    map3 = map4;
                                                    str5 = str3;
                                                    zzdo.zzf("TtmlParser", "Ignoring region without an origin");
                                                }
                                            }
                                            zzalgVar = null;
                                            if (zzalgVar != null) {
                                                map5 = map2;
                                                map5.put(zzalgVar.zza, zzalgVar);
                                            } else {
                                                map5 = map2;
                                            }
                                        } else if (zzej.zzc(xmlPullParserNewPullParser, str3)) {
                                            do {
                                                xmlPullParserNewPullParser.next();
                                                if (zzej.zzc(xmlPullParserNewPullParser, "image") && (strZza8 = zzej.zza(xmlPullParserNewPullParser, "id")) != null) {
                                                    map6.put(strZza8, xmlPullParserNewPullParser.nextText());
                                                }
                                            } while (!zzej.zzb(xmlPullParserNewPullParser, str3));
                                        }
                                        if (zzej.zzb(xmlPullParserNewPullParser, TtmlNode.TAG_HEAD)) {
                                            zzaldVar2 = zzaldVar3;
                                            arrayDeque = arrayDeque2;
                                        } else {
                                            map2 = map5;
                                            zzaldVar3 = zzaldVar3;
                                            str3 = str5;
                                            map4 = map3;
                                        }
                                    }
                                    map3 = map4;
                                    str5 = str3;
                                    map5 = map2;
                                    if (zzej.zzb(xmlPullParserNewPullParser, TtmlNode.TAG_HEAD)) {
                                        zzaldVar2 = zzaldVar3;
                                        arrayDeque = arrayDeque2;
                                    } else {
                                        map2 = map5;
                                        zzaldVar3 = zzaldVar3;
                                        str3 = str5;
                                        map4 = map3;
                                    }
                                }
                            } else {
                                map3 = map4;
                                zzaldVar = zzaldVar3;
                                map5 = map2;
                                attributeCount = xmlPullParserNewPullParser.getAttributeCount();
                                zzali zzaliVarZzf4 = zzf(xmlPullParserNewPullParser, null);
                                j = C.TIME_UNSET;
                                strArr = null;
                                strSubstring = null;
                                jZzc = -9223372036854775807L;
                                jZzc2 = -9223372036854775807L;
                                jZzc3 = -9223372036854775807L;
                                str4 = str;
                                i4 = 0;
                                while (i4 < attributeCount) {
                                    attributeName = xmlPullParserNewPullParser.getAttributeName(i4);
                                    attributeValue = xmlPullParserNewPullParser.getAttributeValue(i4);
                                    switch (attributeName) {
                                        case -934795532:
                                            if (!attributeName.equals(TtmlNode.TAG_REGION)) {
                                                b = 4;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 99841:
                                            if (!attributeName.equals("dur")) {
                                                b = 2;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 100571:
                                            if (!attributeName.equals(TtmlNode.END)) {
                                                b = 1;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 93616297:
                                            if (!attributeName.equals("begin")) {
                                                b = 0;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 109780401:
                                            if (!attributeName.equals(TtmlNode.TAG_STYLE)) {
                                                b = 3;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        case 1292595405:
                                            if (!attributeName.equals("backgroundImage")) {
                                                b = 5;
                                            } else {
                                                b = -1;
                                            }
                                            break;
                                        default:
                                            b = -1;
                                            break;
                                    }
                                    if (b == 0) {
                                        zzaldVar2 = zzaldVar;
                                        jZzc2 = zzc(attributeValue, zzaldVar2);
                                    } else if (b == 1) {
                                        zzaldVar2 = zzaldVar;
                                        jZzc = zzc(attributeValue, zzaldVar2);
                                    } else if (b != 2) {
                                        if (b == 3) {
                                            strArrZzg = zzg(attributeValue);
                                            if (strArrZzg.length > 0) {
                                                strArr = strArrZzg;
                                            }
                                        } else if (b != 4) {
                                            if (b == 5) {
                                                if (attributeValue.startsWith("#")) {
                                                    strSubstring = attributeValue.substring(1);
                                                }
                                            }
                                        } else if (map5.containsKey(attributeValue)) {
                                            str4 = attributeValue;
                                        }
                                        zzaldVar2 = zzaldVar;
                                    } else {
                                        zzaldVar2 = zzaldVar;
                                        jZzc3 = zzc(attributeValue, zzaldVar2);
                                    }
                                    i4++;
                                    zzaldVar = zzaldVar2;
                                }
                                zzaldVar2 = zzaldVar;
                                if (zzalcVar3 != null) {
                                    zzalcVar = zzalcVar3;
                                    j3 = zzalcVar.zzd;
                                    if (j3 == C.TIME_UNSET) {
                                        zzalcVar2 = zzalcVar;
                                    } else {
                                        if (jZzc2 != C.TIME_UNSET) {
                                            jZzc2 += j3;
                                        } else {
                                            jZzc2 = -9223372036854775807L;
                                        }
                                        if (jZzc != C.TIME_UNSET) {
                                            jZzc += j3;
                                            zzalcVar2 = zzalcVar;
                                        } else {
                                            zzalcVar2 = zzalcVar;
                                            jZzc = -9223372036854775807L;
                                        }
                                    }
                                } else {
                                    zzalcVar = zzalcVar3;
                                    zzalcVar2 = null;
                                }
                                if (jZzc != C.TIME_UNSET) {
                                    j = jZzc;
                                } else if (jZzc3 != C.TIME_UNSET) {
                                    j = jZzc2 + jZzc3;
                                } else if (zzalcVar2 != null) {
                                    j2 = zzalcVar2.zze;
                                    if (j2 != C.TIME_UNSET) {
                                        j = j2;
                                    }
                                }
                                zzalcVarZzb = zzalc.zzb(xmlPullParserNewPullParser.getName(), jZzc2, j, zzaliVarZzf4, strArr, str4, strSubstring, zzalcVar2);
                                arrayDeque = arrayDeque2;
                                arrayDeque.push(zzalcVarZzb);
                                if (zzalcVar != null) {
                                    zzalcVar.zzf(zzalcVarZzb);
                                }
                            }
                            i10 = i10;
                            zzaleVar = zzaleVar;
                            zzaldVar3 = zzaldVar2;
                            zzaljVar2 = zzaljVar2;
                            i9 = i9;
                            map = map3;
                        } else {
                            zzdo.zze("TtmlParser", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                            map = map4;
                            arrayDeque = arrayDeque2;
                            map5 = map2;
                        }
                        i9 = 1;
                    } else {
                        str2 = str7;
                        HashMap map7 = map4;
                        arrayDeque = arrayDeque2;
                        zzaljVar = zzaljVar2;
                        i3 = i9;
                        if (eventType == 4) {
                            zzalcVar3.getClass();
                            zzalcVar3.zzf(zzalc.zzc(xmlPullParserNewPullParser.getText()));
                        } else {
                            if (eventType == 3) {
                                if (xmlPullParserNewPullParser.getName().equals(TtmlNode.TAG_TT)) {
                                    zzalc zzalcVar4 = (zzalc) arrayDeque.peek();
                                    zzalcVar4.getClass();
                                    map = map7;
                                    zzaljVar2 = new zzalj(zzalcVar4, map, map5, map6);
                                } else {
                                    map = map7;
                                    zzaljVar2 = zzaljVar;
                                }
                                arrayDeque.pop();
                            }
                            i9 = i3;
                        }
                        map = map7;
                        zzaljVar2 = zzaljVar;
                        i9 = i3;
                    }
                } else {
                    str = str6;
                    str2 = str7;
                    map = map4;
                    arrayDeque = arrayDeque2;
                    zzaljVar = zzaljVar2;
                    i3 = i9;
                    if (eventType == 2) {
                        i9 = i3 + 1;
                    } else {
                        if (eventType == 3) {
                            i9 = i3 - 1;
                        }
                        zzaljVar2 = zzaljVar;
                        i9 = i3;
                    }
                    zzaljVar2 = zzaljVar;
                }
                xmlPullParserNewPullParser.next();
                eventType = xmlPullParserNewPullParser.getEventType();
                map4 = map;
                arrayDeque2 = arrayDeque;
                str6 = str;
                str7 = str2;
            }
            zzalj zzaljVar3 = zzaljVar2;
            zzaljVar3.getClass();
            return zzaljVar3;
        } catch (IOException e8) {
            throw new IllegalStateException("Unexpected error when reading input.", e8);
        } catch (XmlPullParserException e9) {
            throw new IllegalStateException("Unable to decode source", e9);
        }
    }
}
