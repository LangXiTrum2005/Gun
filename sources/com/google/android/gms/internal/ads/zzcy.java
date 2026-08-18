package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.exifinterface.media.ExifInterface;
import com.badlogic.gdx.Input;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"InlinedApi"})
public final class zzcy {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = {0, 0, 0, 1};
    private static final String[] zzc = {"", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C"};
    private static final Pattern zzd = Pattern.compile("^\\D?(\\d+)$");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:131:0x0231  */
    /* JADX WARN: Code duplicated, block: B:15:0x0054  */
    /* JADX WARN: Code duplicated, block: B:57:0x0101  */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v21 int, still in use, count: 1, list:
  (r3v21 int) from 0x005d: IF  (r3v21 int) != (1567 int)  -> B:18:0x005f A[HIDDEN] (LINE:94)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
    	at jadx.core.utils.InsnRemover.removeAllMarked(InsnRemover.java:276)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:354)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v21 int, still in use, count: 1, list:
  (r3v21 int) from 0x005d: IF  (r3v21 int) != (1567 int)  -> B:18:0x005f A[HIDDEN] (LINE:94)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Nullable
    public static Pair zza(zzab zzabVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Integer num;
        Integer num2;
        String str = zzabVar.zzk;
        if (str != null) {
            String[] strArrSplit = str.split("\\.");
            int i6 = 3;
            int i7 = 2;
            int i8 = 1;
            if (!"video/dolby-vision".equals(zzabVar.zzo)) {
                switch (strArrSplit[0]) {
                    case "s263":
                        String str2 = zzabVar.zzk;
                        Pair pair = new Pair(1, 1);
                        if (strArrSplit.length < 3) {
                            AbstractC3888ke0.w(str2, "Ignoring malformed H263 codec string: ", "CodecSpecificDataUtil");
                        } else {
                            try {
                                return new Pair(Integer.valueOf(Integer.parseInt(strArrSplit[1])), Integer.valueOf(Integer.parseInt(strArrSplit[2])));
                            } catch (NumberFormatException unused) {
                                AbstractC3888ke0.w(str2, "Ignoring malformed H263 codec string: ", "CodecSpecificDataUtil");
                            }
                        }
                        return pair;
                    case "avc1":
                    case "avc2":
                        String str3 = zzabVar.zzk;
                        int length = strArrSplit.length;
                        if (length < 2) {
                            AbstractC3888ke0.w(str3, "Ignoring malformed AVC codec string: ", "CodecSpecificDataUtil");
                            break;
                        } else {
                            try {
                                if (strArrSplit[1].length() == 6) {
                                    i = Integer.parseInt(strArrSplit[1].substring(0, 2), 16);
                                    i2 = Integer.parseInt(strArrSplit[1].substring(4), 16);
                                } else if (length < 3) {
                                    zzdo.zzf("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + str3);
                                } else {
                                    i = Integer.parseInt(strArrSplit[1]);
                                    i2 = Integer.parseInt(strArrSplit[2]);
                                }
                                if (i == 66) {
                                    i7 = 1;
                                } else if (i != 77) {
                                    if (i == 88) {
                                        i7 = 4;
                                    } else if (i == 100) {
                                        i7 = 8;
                                    } else if (i == 110) {
                                        i7 = 16;
                                    } else if (i != 122) {
                                        i7 = i != 244 ? -1 : 64;
                                    } else {
                                        i7 = 32;
                                    }
                                }
                                if (i7 == -1) {
                                    AbstractC3888ke0.r("Unknown AVC profile: ", i, "CodecSpecificDataUtil");
                                } else {
                                    switch (i2) {
                                        case 10:
                                            break;
                                        case 11:
                                            i8 = 4;
                                            break;
                                        case 12:
                                            i8 = 8;
                                            break;
                                        case 13:
                                            i8 = 16;
                                            break;
                                        default:
                                            switch (i2) {
                                                case 20:
                                                    i8 = 32;
                                                    break;
                                                case 21:
                                                    i8 = 64;
                                                    break;
                                                case 22:
                                                    i8 = 128;
                                                    break;
                                                default:
                                                    switch (i2) {
                                                        case 30:
                                                            i8 = 256;
                                                            break;
                                                        case 31:
                                                            i8 = 512;
                                                            break;
                                                        case 32:
                                                            i8 = 1024;
                                                            break;
                                                        default:
                                                            switch (i2) {
                                                                case 40:
                                                                    i8 = 2048;
                                                                    break;
                                                                case 41:
                                                                    i8 = 4096;
                                                                    break;
                                                                case 42:
                                                                    i8 = 8192;
                                                                    break;
                                                                default:
                                                                    switch (i2) {
                                                                        case 50:
                                                                            i8 = 16384;
                                                                            break;
                                                                        case 51:
                                                                            i8 = 32768;
                                                                            break;
                                                                        case 52:
                                                                            i8 = 65536;
                                                                            break;
                                                                        default:
                                                                            i8 = -1;
                                                                            break;
                                                                    }
                                                                    break;
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    if (i8 != -1) {
                                        return new Pair(Integer.valueOf(i7), Integer.valueOf(i8));
                                    }
                                    AbstractC3888ke0.r("Unknown AVC level: ", i2, "CodecSpecificDataUtil");
                                }
                            } catch (NumberFormatException unused2) {
                                AbstractC3888ke0.w(str3, "Ignoring malformed AVC codec string: ", "CodecSpecificDataUtil");
                            }
                            break;
                        }
                        break;
                    case "vp09":
                        String str4 = zzabVar.zzk;
                        if (strArrSplit.length < 3) {
                            AbstractC3888ke0.w(str4, "Ignoring malformed VP9 codec string: ", "CodecSpecificDataUtil");
                            break;
                        } else {
                            try {
                                int i9 = Integer.parseInt(strArrSplit[1]);
                                int i10 = Integer.parseInt(strArrSplit[2]);
                                if (i9 == 0) {
                                    i3 = 1;
                                } else if (i9 == 1) {
                                    i3 = 2;
                                } else if (i9 != 2) {
                                    i3 = i9 != 3 ? -1 : 8;
                                } else {
                                    i3 = 4;
                                }
                                if (i3 == -1) {
                                    AbstractC3888ke0.r("Unknown VP9 profile: ", i9, "CodecSpecificDataUtil");
                                } else {
                                    if (i10 != 10) {
                                        if (i10 == 11) {
                                            i8 = 2;
                                        } else if (i10 == 20) {
                                            i8 = 4;
                                        } else if (i10 == 21) {
                                            i8 = 8;
                                        } else if (i10 == 30) {
                                            i8 = 16;
                                        } else if (i10 == 31) {
                                            i8 = 32;
                                        } else if (i10 == 40) {
                                            i8 = 64;
                                        } else if (i10 == 41) {
                                            i8 = 128;
                                        } else if (i10 == 50) {
                                            i8 = 256;
                                        } else if (i10 != 51) {
                                            switch (i10) {
                                                case 60:
                                                    i8 = 2048;
                                                    break;
                                                case Input.Keys.TAB /* 61 */:
                                                    i8 = 4096;
                                                    break;
                                                case Input.Keys.SPACE /* 62 */:
                                                    i8 = 8192;
                                                    break;
                                                default:
                                                    i8 = -1;
                                                    break;
                                            }
                                        } else {
                                            i8 = 512;
                                        }
                                    }
                                    if (i8 != -1) {
                                        return new Pair(Integer.valueOf(i3), Integer.valueOf(i8));
                                    }
                                    AbstractC3888ke0.r("Unknown VP9 level: ", i10, "CodecSpecificDataUtil");
                                }
                            } catch (NumberFormatException unused3) {
                                AbstractC3888ke0.w(str4, "Ignoring malformed VP9 codec string: ", "CodecSpecificDataUtil");
                            }
                            break;
                        }
                        break;
                    case "hev1":
                    case "hvc1":
                        return zzb(zzabVar.zzk, strArrSplit, zzabVar.zzC);
                    case "av01":
                        String str5 = zzabVar.zzk;
                        zzk zzkVar = zzabVar.zzC;
                        if (strArrSplit.length < 4) {
                            AbstractC3888ke0.w(str5, "Ignoring malformed AV1 codec string: ", "CodecSpecificDataUtil");
                            break;
                        } else {
                            try {
                                int i11 = Integer.parseInt(strArrSplit[1]);
                                int i12 = Integer.parseInt(strArrSplit[2].substring(0, 2));
                                int i13 = Integer.parseInt(strArrSplit[3]);
                                if (i11 != 0) {
                                    AbstractC3888ke0.r("Unknown AV1 profile: ", i11, "CodecSpecificDataUtil");
                                } else {
                                    if (i13 == 8) {
                                        i4 = 1;
                                    } else if (i13 != 10) {
                                        AbstractC3888ke0.r("Unknown AV1 bit depth: ", i13, "CodecSpecificDataUtil");
                                    } else {
                                        i4 = (zzkVar == null || !(zzkVar.zze != null || (i5 = zzkVar.zzd) == 7 || i5 == 6)) ? 2 : 4096;
                                    }
                                    switch (i12) {
                                        case 0:
                                            break;
                                        case 1:
                                            i8 = 2;
                                            break;
                                        case 2:
                                            i8 = 4;
                                            break;
                                        case 3:
                                            i8 = 8;
                                            break;
                                        case 4:
                                            i8 = 16;
                                            break;
                                        case 5:
                                            i8 = 32;
                                            break;
                                        case 6:
                                            i8 = 64;
                                            break;
                                        case 7:
                                            i8 = 128;
                                            break;
                                        case 8:
                                            i8 = 256;
                                            break;
                                        case 9:
                                            i8 = 512;
                                            break;
                                        case 10:
                                            i8 = 1024;
                                            break;
                                        case 11:
                                            i8 = 2048;
                                            break;
                                        case 12:
                                            i8 = 4096;
                                            break;
                                        case 13:
                                            i8 = 8192;
                                            break;
                                        case 14:
                                            i8 = 16384;
                                            break;
                                        case 15:
                                            i8 = 32768;
                                            break;
                                        case 16:
                                            i8 = 65536;
                                            break;
                                        case 17:
                                            i8 = 131072;
                                            break;
                                        case 18:
                                            i8 = 262144;
                                            break;
                                        case 19:
                                            i8 = 524288;
                                            break;
                                        case 20:
                                            i8 = 1048576;
                                            break;
                                        case 21:
                                            i8 = 2097152;
                                            break;
                                        case 22:
                                            i8 = 4194304;
                                            break;
                                        case 23:
                                            i8 = 8388608;
                                            break;
                                        default:
                                            i8 = -1;
                                            break;
                                    }
                                    if (i8 != -1) {
                                        return new Pair(Integer.valueOf(i4), Integer.valueOf(i8));
                                    }
                                    AbstractC3888ke0.r("Unknown AV1 level: ", i12, "CodecSpecificDataUtil");
                                }
                            } catch (NumberFormatException unused4) {
                                AbstractC3888ke0.w(str5, "Ignoring malformed AV1 codec string: ", "CodecSpecificDataUtil");
                            }
                            break;
                        }
                        break;
                    case "mp4a":
                        String str6 = zzabVar.zzk;
                        if (strArrSplit.length != 3) {
                            AbstractC3888ke0.w(str6, "Ignoring malformed MP4A codec string: ", "CodecSpecificDataUtil");
                            break;
                        } else {
                            try {
                                if (MimeTypes.AUDIO_AAC.equals(zzbb.zzd(Integer.parseInt(strArrSplit[1], 16)))) {
                                    int i14 = Integer.parseInt(strArrSplit[2]);
                                    if (i14 == 17) {
                                        i6 = 17;
                                    } else if (i14 == 20) {
                                        i6 = 20;
                                    } else if (i14 == 23) {
                                        i6 = 23;
                                    } else if (i14 == 29) {
                                        i6 = 29;
                                    } else if (i14 == 39) {
                                        i6 = 39;
                                    } else if (i14 != 42) {
                                        switch (i14) {
                                            case 1:
                                                i6 = 1;
                                                break;
                                            case 2:
                                                i6 = 2;
                                                break;
                                            case 3:
                                                break;
                                            case 4:
                                                i6 = 4;
                                                break;
                                            case 5:
                                                i6 = 5;
                                                break;
                                            case 6:
                                                i6 = 6;
                                                break;
                                            default:
                                                i6 = -1;
                                                break;
                                        }
                                    } else {
                                        i6 = 42;
                                    }
                                    if (i6 != -1) {
                                        return new Pair(Integer.valueOf(i6), 0);
                                    }
                                }
                            } catch (NumberFormatException unused5) {
                                AbstractC3888ke0.w(str6, "Ignoring malformed MP4A codec string: ", "CodecSpecificDataUtil");
                            }
                            break;
                        }
                        break;
                }
            } else {
                String str7 = zzabVar.zzk;
                if (strArrSplit.length < 3) {
                    AbstractC3888ke0.w(str7, "Ignoring malformed Dolby Vision codec string: ", "CodecSpecificDataUtil");
                } else {
                    Matcher matcher = zzd.matcher(strArrSplit[1]);
                    if (matcher.matches()) {
                        String strGroup = matcher.group(1);
                        if (strGroup != null) {
                            if (strGroup.hashCode() != 1567) {
                                switch (strGroup) {
                                    case "00":
                                        num = 1;
                                        break;
                                    case "01":
                                        num = 2;
                                        break;
                                    case "02":
                                        num = 4;
                                        break;
                                    case "03":
                                        num = 8;
                                        break;
                                    case "04":
                                        num = 16;
                                        break;
                                    case "05":
                                        num = 32;
                                        break;
                                    case "06":
                                        num = 64;
                                        break;
                                    case "07":
                                        num = 128;
                                        break;
                                    case "08":
                                        num = 256;
                                        break;
                                    case "09":
                                        num = 512;
                                        break;
                                    default:
                                        num = null;
                                        break;
                                }
                            } else if (strGroup.equals("10")) {
                                num = 1024;
                            } else {
                                num = null;
                            }
                        } else {
                            num = null;
                        }
                        if (num == null) {
                            AbstractC3888ke0.w(strGroup, "Unknown Dolby Vision profile string: ", "CodecSpecificDataUtil");
                        } else {
                            String str8 = strArrSplit[2];
                            if (str8 != null) {
                                str8.hashCode();
                                switch (str8) {
                                    case "01":
                                        num2 = 1;
                                        break;
                                    case "02":
                                        num2 = 2;
                                        break;
                                    case "03":
                                        num2 = 4;
                                        break;
                                    case "04":
                                        num2 = 8;
                                        break;
                                    case "05":
                                        num2 = 16;
                                        break;
                                    case "06":
                                        num2 = 32;
                                        break;
                                    case "07":
                                        num2 = 64;
                                        break;
                                    case "08":
                                        num2 = 128;
                                        break;
                                    case "09":
                                        num2 = 256;
                                        break;
                                    default:
                                        switch (str8) {
                                            case 1567:
                                                if (!str8.equals("10")) {
                                                    num2 = null;
                                                } else {
                                                    num2 = 512;
                                                }
                                                break;
                                            case 1568:
                                                if (!str8.equals("11")) {
                                                    num2 = null;
                                                } else {
                                                    num2 = 1024;
                                                }
                                                break;
                                            case 1569:
                                                if (!str8.equals("12")) {
                                                    num2 = null;
                                                } else {
                                                    num2 = 2048;
                                                }
                                                break;
                                            case 1570:
                                                if (!str8.equals("13")) {
                                                    num2 = null;
                                                } else {
                                                    num2 = 4096;
                                                }
                                                break;
                                            default:
                                                num2 = null;
                                                break;
                                        }
                                }
                            } else {
                                num2 = null;
                            }
                            if (num2 != null) {
                                return new Pair(num, num2);
                            }
                            AbstractC3888ke0.w(str8, "Unknown Dolby Vision level string: ", "CodecSpecificDataUtil");
                        }
                    } else {
                        AbstractC3888ke0.w(str7, "Ignoring malformed Dolby Vision codec string: ", "CodecSpecificDataUtil");
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:107:0x0188  */
    /* JADX WARN: Code duplicated, block: B:25:0x0053  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Nullable
    public static Pair zzb(String str, String[] strArr, @Nullable zzk zzkVar) {
        int i;
        Integer num;
        if (strArr.length < 4) {
            AbstractC3888ke0.w(str, "Ignoring malformed HEVC codec string: ", "CodecSpecificDataUtil");
            return null;
        }
        Matcher matcher = zzd.matcher(strArr[1]);
        if (!matcher.matches()) {
            AbstractC3888ke0.w(str, "Ignoring malformed HEVC codec string: ", "CodecSpecificDataUtil");
            return null;
        }
        String strGroup = matcher.group(1);
        byte b = 6;
        if ("1".equals(strGroup)) {
            i = 1;
        } else if ("2".equals(strGroup)) {
            i = (zzkVar == null || zzkVar.zzd != 6) ? 2 : 4096;
        } else {
            if (!"6".equals(strGroup)) {
                AbstractC3888ke0.w(strGroup, "Unknown HEVC profile string: ", "CodecSpecificDataUtil");
                return null;
            }
            i = 6;
        }
        String str2 = strArr[3];
        if (str2 != null) {
            switch (str2.hashCode()) {
                case 70821:
                    if (!str2.equals("H30")) {
                        b = -1;
                    } else {
                        b = cw.k;
                    }
                    break;
                case 70914:
                    if (!str2.equals("H60")) {
                        b = -1;
                    } else {
                        b = cw.l;
                    }
                    break;
                case 70917:
                    if (!str2.equals("H63")) {
                        b = -1;
                    } else {
                        b = cw.m;
                    }
                    break;
                case 71007:
                    if (!str2.equals("H90")) {
                        b = -1;
                    } else {
                        b = cw.n;
                    }
                    break;
                case 71010:
                    if (!str2.equals("H93")) {
                        b = -1;
                    } else {
                        b = 17;
                    }
                    break;
                case 74665:
                    if (!str2.equals("L30")) {
                        b = -1;
                    } else {
                        b = 0;
                    }
                    break;
                case 74758:
                    if (!str2.equals("L60")) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                    break;
                case 74761:
                    if (!str2.equals("L63")) {
                        b = -1;
                    } else {
                        b = 2;
                    }
                    break;
                case 74851:
                    if (!str2.equals("L90")) {
                        b = -1;
                    } else {
                        b = 3;
                    }
                    break;
                case 74854:
                    if (!str2.equals("L93")) {
                        b = -1;
                    } else {
                        b = 4;
                    }
                    break;
                case 2193639:
                    if (!str2.equals("H120")) {
                        b = -1;
                    } else {
                        b = 18;
                    }
                    break;
                case 2193642:
                    if (!str2.equals("H123")) {
                        b = -1;
                    } else {
                        b = 19;
                    }
                    break;
                case 2193732:
                    if (!str2.equals("H150")) {
                        b = -1;
                    } else {
                        b = 20;
                    }
                    break;
                case 2193735:
                    if (!str2.equals("H153")) {
                        b = -1;
                    } else {
                        b = 21;
                    }
                    break;
                case 2193738:
                    if (!str2.equals("H156")) {
                        b = -1;
                    } else {
                        b = 22;
                    }
                    break;
                case 2193825:
                    if (!str2.equals("H180")) {
                        b = -1;
                    } else {
                        b = 23;
                    }
                    break;
                case 2193828:
                    if (!str2.equals("H183")) {
                        b = -1;
                    } else {
                        b = 24;
                    }
                    break;
                case 2193831:
                    if (!str2.equals("H186")) {
                        b = -1;
                    } else {
                        b = 25;
                    }
                    break;
                case 2312803:
                    if (!str2.equals("L120")) {
                        b = -1;
                    } else {
                        b = 5;
                    }
                    break;
                case 2312806:
                    if (!str2.equals("L123")) {
                        b = -1;
                    }
                    break;
                case 2312896:
                    if (!str2.equals("L150")) {
                        b = -1;
                    } else {
                        b = 7;
                    }
                    break;
                case 2312899:
                    if (!str2.equals("L153")) {
                        b = -1;
                    } else {
                        b = 8;
                    }
                    break;
                case 2312902:
                    if (!str2.equals("L156")) {
                        b = -1;
                    } else {
                        b = 9;
                    }
                    break;
                case 2312989:
                    if (!str2.equals("L180")) {
                        b = -1;
                    } else {
                        b = 10;
                    }
                    break;
                case 2312992:
                    if (!str2.equals("L183")) {
                        b = -1;
                    } else {
                        b = 11;
                    }
                    break;
                case 2312995:
                    if (!str2.equals("L186")) {
                        b = -1;
                    } else {
                        b = 12;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                    num = 1;
                    break;
                case 1:
                    num = 4;
                    break;
                case 2:
                    num = 16;
                    break;
                case 3:
                    num = 64;
                    break;
                case 4:
                    num = 256;
                    break;
                case 5:
                    num = 1024;
                    break;
                case 6:
                    num = 4096;
                    break;
                case 7:
                    num = 16384;
                    break;
                case 8:
                    num = 65536;
                    break;
                case 9:
                    num = 262144;
                    break;
                case 10:
                    num = 1048576;
                    break;
                case 11:
                    num = 4194304;
                    break;
                case 12:
                    num = 16777216;
                    break;
                case 13:
                    num = 2;
                    break;
                case 14:
                    num = 8;
                    break;
                case 15:
                    num = 32;
                    break;
                case 16:
                    num = 128;
                    break;
                case 17:
                    num = 512;
                    break;
                case 18:
                    num = 2048;
                    break;
                case 19:
                    num = 8192;
                    break;
                case 20:
                    num = 32768;
                    break;
                case 21:
                    num = 131072;
                    break;
                case 22:
                    num = 524288;
                    break;
                case 23:
                    num = 2097152;
                    break;
                case 24:
                    num = 8388608;
                    break;
                case 25:
                    num = 33554432;
                    break;
                default:
                    num = null;
                    break;
            }
        } else {
            num = null;
        }
        if (num != null) {
            return new Pair(Integer.valueOf(i), num);
        }
        AbstractC3888ke0.w(str2, "Unknown HEVC level string: ", "CodecSpecificDataUtil");
        return null;
    }

    public static String zzc(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public static String zzd(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        Object[] objArr = new Object[5];
        objArr[0] = zzc[i];
        objArr[1] = Integer.valueOf(i2);
        objArr[2] = Integer.valueOf(i3);
        objArr[3] = Character.valueOf(true != z ? 'L' : 'H');
        objArr[4] = Integer.valueOf(i4);
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int i5 = 6;
        while (i5 > 0) {
            int i6 = i5 - 1;
            if (iArr[i6] != 0) {
                break;
            }
            i5 = i6;
        }
        for (int i7 = 0; i7 < i5; i7++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i7])));
        }
        return sb.toString();
    }

    public static byte[] zze(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2 + 4];
        System.arraycopy(zzb, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i, bArr2, 4, i2);
        return bArr2;
    }
}
