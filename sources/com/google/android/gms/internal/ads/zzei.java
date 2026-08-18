package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.AudioFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.badlogic.gdx.Input;
import com.efs.sdk.base.Constants;
import com.facebook.ads.AdError;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.newreward.player.view.hybrid.util.MRAIDCommunicatorUtil;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.umeng.analytics.pro.bc;
import com.umeng.analytics.pro.cw;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes3.dex */
public final class zzei {
    public static final int zza;
    public static final String zzb;
    public static final String zzc;
    public static final String zzd;
    public static final String zze;
    public static final byte[] zzf;
    private static final Pattern zzg;

    @Nullable
    private static HashMap zzh;
    private static final String[] zzi;
    private static final String[] zzj;
    private static final int[] zzk;
    private static final int[] zzl;
    private static final int[] zzm;

    static {
        int i = Build.VERSION.SDK_INT;
        zza = i;
        String str = Build.DEVICE;
        zzb = str;
        String str2 = Build.MANUFACTURER;
        zzc = str2;
        String str3 = Build.MODEL;
        zzd = str3;
        zze = str + ", " + str3 + ", " + str2 + ", " + i;
        zzf = new byte[0];
        zzg = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        zzi = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, "gre", "el", "fre", "fr", "geo", "ka", "ice", bc.ae, "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", ScarConstants.IN_SIGNAL_KEY, "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        zzj = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        zzk = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        zzl = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        zzm = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, EnumC4719u30.JSON_ENCODE_ERROR_VALUE, EnumC4719u30.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, EnumC4719u30.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, EnumC4719u30.STALE_CACHED_RESPONSE_VALUE, EnumC4719u30.INVALID_GZIP_BID_PAYLOAD_VALUE, EnumC4719u30.INVALID_JSON_BID_PAYLOAD_VALUE, 196, 195, 202, 205, Input.Keys.NUMPAD_0, Input.Keys.NUMPAD_7, Input.Keys.NUMPAD_DOT, Input.Keys.NUMPAD_9, Input.Keys.F10, Input.Keys.F9, 130, 133, 168, 175, 166, Input.Keys.NUMPAD_EQUALS, 180, 179, Input.Keys.F16, 189, 199, 192, 201, 206, EnumC4719u30.MRAID_JS_COPY_FAILED_VALUE, EnumC4719u30.AD_RESPONSE_RETRY_AFTER_VALUE, EnumC4719u30.INVALID_ADUNIT_BID_PAYLOAD_VALUE, EnumC4719u30.AD_NOT_LOADED_VALUE, 255, 248, 241, 246, 227, 228, 237, 234, Input.Keys.F13, 176, Input.Keys.F15, Input.Keys.F20, 171, 172, 165, Input.Keys.NUMPAD_LEFT_PAREN, Input.Keys.NUM_LOCK, 136, 129, 134, Input.Keys.NUMPAD_3, Input.Keys.NUMPAD_4, Input.Keys.NUMPAD_ADD, Input.Keys.NUMPAD_DIVIDE, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, EnumC4719u30.INVALID_METRICS_ENDPOINT_VALUE, 122, 137, Input.Keys.F12, 135, 128, Input.Keys.NUMPAD_5, Input.Keys.NUMPAD_2, Input.Keys.NUMPAD_MULTIPLY, Input.Keys.NUMPAD_SUBTRACT, 177, 182, Input.Keys.F21, Input.Keys.F14, 173, 170, Input.Keys.NUMPAD_RIGHT_PAREN, 164, 249, 254, 247, PsExtractor.VIDEO_STREAM_MASK, 229, 226, 235, 236, Input.Keys.F23, 198, 207, 200, EnumC4719u30.AD_LOAD_FAIL_RETRY_AFTER_VALUE, EnumC4719u30.MRAID_JS_DOES_NOT_EXIST_VALUE, 211, EnumC4719u30.PLACEMENT_SLEEP_VALUE, 105, 110, 103, 96, EnumC4719u30.ASSET_FAILED_STATUS_CODE_VALUE, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, EnumC4719u30.PROTOBUF_SERIALIZATION_ERROR_VALUE, 113, 120, EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, Input.Keys.NUMPAD_ENTER, 167, 178, 181, Input.Keys.F18, Input.Keys.F17, Input.Keys.NUMPAD_6, Input.Keys.NUMPAD_1, Input.Keys.NUMPAD_8, Input.Keys.NUMPAD_COMMA, 138, Input.Keys.F11, 132, 131, EnumC4719u30.INVALID_WATERFALL_PLACEMENT_ID_VALUE, EnumC4719u30.AD_RESPONSE_TIMED_OUT_VALUE, EnumC4719u30.INVALID_BID_PAYLOAD_VALUE, EnumC4719u30.AD_RESPONSE_EMPTY_VALUE, Input.Keys.F24, 197, 204, 203, 230, 225, 232, 239, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 253, 244, Input.Keys.COLON};
    }

    public static zzab zzA(int i, int i2, int i3) {
        zzz zzzVar = new zzz();
        zzzVar.zzaa(MimeTypes.AUDIO_RAW);
        zzzVar.zzz(i2);
        zzzVar.zzab(i3);
        zzzVar.zzU(i);
        return zzzVar.zzag();
    }

    public static String zzB(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public static String zzC(byte[] bArr, int i, int i2) {
        return new String(bArr, i, i2, StandardCharsets.UTF_8);
    }

    public static String zzD(int i) {
        switch (i) {
            case -2:
                return Constants.CP_NONE;
            case -1:
                return "unknown";
            case 0:
                return MRAIDCommunicatorUtil.STATES_DEFAULT;
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return MimeTypes.BASE_TYPE_TEXT;
            case 4:
                return "image";
            case 5:
                return TtmlNode.TAG_METADATA;
            default:
                return "camera motion";
        }
    }

    public static String zzE(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals(C.LANGUAGE_UNDETERMINED)) {
            str = strReplace;
        }
        String strZza = zzftt.zza(str);
        int i = 0;
        String str2 = strZza.split("-", 2)[0];
        if (zzh == null) {
            zzh = zzR();
        }
        String str3 = (String) zzh.get(str2);
        if (str3 != null) {
            strZza = str3.concat(String.valueOf(strZza.substring(str2.length())));
            str2 = str3;
        }
        if (!"no".equals(str2) && !bc.aI.equals(str2) && !"zh".equals(str2)) {
            return strZza;
        }
        while (true) {
            String[] strArr = zzj;
            int length = strArr.length;
            if (i >= 18) {
                return strZza;
            }
            if (strZza.startsWith(strArr[i])) {
                return String.valueOf(strArr[i + 1]).concat(String.valueOf(strZza.substring(strArr[i].length())));
            }
            i += 2;
        }
    }

    public static void zzF(long[] jArr, long j, long j2) {
        int i = 0;
        RoundingMode roundingMode = RoundingMode.DOWN;
        if (j2 >= 1000000 && j2 % 1000000 == 0) {
            long jZzb = zzgal.zzb(j2, 1000000L, RoundingMode.UNNECESSARY);
            while (i < jArr.length) {
                jArr[i] = zzgal.zzb(jArr[i], jZzb, roundingMode);
                i++;
            }
            return;
        }
        if (j2 < 1000000 && 1000000 % j2 == 0) {
            long jZzb2 = zzgal.zzb(1000000L, j2, RoundingMode.UNNECESSARY);
            while (i < jArr.length) {
                jArr[i] = zzgal.zzd(jArr[i], jZzb2);
                i++;
            }
            return;
        }
        for (int i2 = 0; i2 < jArr.length; i2++) {
            long j3 = jArr[i2];
            if (j3 != 0) {
                if (j2 >= j3 && j2 % j3 == 0) {
                    jArr[i2] = zzgal.zzb(1000000L, zzgal.zzb(j2, j3, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j2 >= j3 || j3 % j2 != 0) {
                    jArr[i2] = zzP(j3, 1000000L, j2, roundingMode);
                } else {
                    jArr[i2] = zzgal.zzd(1000000L, zzgal.zzb(j3, j2, RoundingMode.UNNECESSARY));
                }
            }
        }
    }

    public static boolean zzG(SparseArray sparseArray, int i) {
        return sparseArray.indexOfKey(i) >= 0;
    }

    public static boolean zzH(zzdy zzdyVar, zzdy zzdyVar2, @Nullable Inflater inflater) {
        boolean z = false;
        if (zzdyVar.zzb() <= 0) {
            return false;
        }
        if (zzdyVar2.zzc() < zzdyVar.zzb()) {
            int iZzb = zzdyVar.zzb();
            zzdyVar2.zzF(iZzb + iZzb);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(zzdyVar.zzN(), zzdyVar.zzd(), zzdyVar.zzb());
        int iInflate = 0;
        while (true) {
            try {
                iInflate += inflater.inflate(zzdyVar2.zzN(), iInflate, zzdyVar2.zzc() - iInflate);
                if (!inflater.finished()) {
                    if (inflater.needsDictionary() || inflater.needsInput()) {
                        break;
                        break;
                    }
                    if (iInflate == zzdyVar2.zzc()) {
                        int iZzc = zzdyVar2.zzc();
                        zzdyVar2.zzF(iZzc + iZzc);
                    }
                } else {
                    zzdyVar2.zzK(iInflate);
                    z = true;
                    break;
                }
            } catch (DataFormatException unused) {
            } catch (Throwable th) {
                inflater.reset();
                throw th;
            }
        }
        inflater.reset();
        return z;
    }

    public static boolean zzI(Context context) {
        return zza >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    public static boolean zzJ(int i) {
        return i == 3 || i == 2 || i == 268435456 || i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4;
    }

    public static boolean zzK(Context context) {
        int i = zza;
        if (i < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        if (i == 30) {
            String str = zzd;
            if (zzftt.zzc(str, "moto g(20)") || zzftt.zzc(str, "rmx3231")) {
                return true;
            }
        }
        return i == 34 && zzftt.zzc(zzd, "sm-x200");
    }

    public static boolean zzL(int i) {
        return i == 10 || i == 13;
    }

    public static boolean zzM(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static Object[] zzN(Object[] objArr, int i) {
        zzcw.zzd(i <= objArr.length);
        return Arrays.copyOf(objArr, i);
    }

    private static int zzO(int i, int i2) {
        return (char) (zzl[i ^ (i2 >> 12)] ^ ((char) (i2 << 4)));
    }

    private static long zzP(long j, long j2, long j3, RoundingMode roundingMode) {
        long jZzd = zzgal.zzd(j, j2);
        if (jZzd != Long.MAX_VALUE && jZzd != Long.MIN_VALUE) {
            return zzgal.zzb(jZzd, j3, roundingMode);
        }
        long jZzc = zzgal.zzc(Math.abs(j2), Math.abs(j3));
        RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
        long jZzb = zzgal.zzb(j2, jZzc, roundingMode2);
        long jZzb2 = zzgal.zzb(j3, jZzc, roundingMode2);
        long jZzc2 = zzgal.zzc(Math.abs(j), Math.abs(jZzb2));
        long jZzb3 = zzgal.zzb(j, jZzc2, roundingMode2);
        long jZzb4 = zzgal.zzb(jZzb2, jZzc2, roundingMode2);
        long jZzd2 = zzgal.zzd(jZzb3, jZzb);
        if (jZzd2 != Long.MAX_VALUE && jZzd2 != Long.MIN_VALUE) {
            return zzgal.zzb(jZzd2, jZzb4, roundingMode);
        }
        double d = (jZzb / jZzb4) * jZzb3;
        if (d > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        return zzgag.zzb(d, roundingMode);
    }

    @Nullable
    private static String zzQ(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e) {
            zzdo.zzd("Util", "Failed to read system property ".concat(str), e);
            return null;
        }
    }

    private static HashMap zzR() {
        String[] iSOLanguages = Locale.getISOLanguages();
        int length = iSOLanguages.length;
        int length2 = zzi.length;
        HashMap map = new HashMap(length + 88);
        int i = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    map.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = zzi;
            int length3 = strArr.length;
            if (i >= 88) {
                return map;
            }
            map.put(strArr[i], strArr[i + 1]);
            i += 2;
        }
    }

    public static int zza(long[] jArr, long j, boolean z, boolean z2) {
        int i;
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        if (iBinarySearch < 0) {
            return ~iBinarySearch;
        }
        while (true) {
            i = iBinarySearch + 1;
            if (i >= jArr.length || jArr[i] != j) {
                break;
            }
            iBinarySearch = i;
        }
        return !z ? i : iBinarySearch;
    }

    public static int zzb(zzdp zzdpVar, long j, boolean z, boolean z2) {
        int iZza = zzdpVar.zza() - 1;
        int i = 0;
        while (i <= iZza) {
            int i2 = (i + iZza) >>> 1;
            if (zzdpVar.zzb(i2) < j) {
                i = i2 + 1;
            } else {
                iZza = i2 - 1;
            }
        }
        int i3 = iZza + 1;
        if (i3 < zzdpVar.zza() && zzdpVar.zzb(i3) == j) {
            return i3;
        }
        if (iZza == -1) {
            return 0;
        }
        return iZza;
    }

    public static int zzc(int[] iArr, int i, boolean z, boolean z2) {
        int i2;
        int i3;
        int iBinarySearch = Arrays.binarySearch(iArr, i);
        if (iBinarySearch < 0) {
            i3 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i2 = iBinarySearch - 1;
                if (i2 < 0 || iArr[i2] != i) {
                    break;
                }
                iBinarySearch = i2;
            }
            i3 = z ? iBinarySearch : i2;
        }
        return z2 ? Math.max(0, i3) : i3;
    }

    public static int zzd(long[] jArr, long j, boolean z, boolean z2) {
        int i;
        int iBinarySearch = Arrays.binarySearch(jArr, j);
        if (iBinarySearch < 0) {
            i = -(iBinarySearch + 2);
        } else {
            while (true) {
                int i2 = iBinarySearch - 1;
                if (i2 < 0 || jArr[i2] != j) {
                    break;
                }
                iBinarySearch = i2;
            }
            i = iBinarySearch;
        }
        return z2 ? Math.max(0, i) : i;
    }

    public static int zze(byte[] bArr, int i, int i2, int i3) {
        int iZzO = 65535;
        for (int i4 = 0; i4 < i2; i4++) {
            byte b = bArr[i4];
            iZzO = zzO(b & cw.m, zzO((b & 255) >> 4, iZzO));
        }
        return iZzO;
    }

    public static int zzf(byte[] bArr, int i, int i2, int i3) {
        while (i < i2) {
            i3 = zzk[(i3 >>> 24) ^ (bArr[i] & 255)] ^ (i3 << 8);
            i++;
        }
        return i3;
    }

    public static int zzg(byte[] bArr, int i, int i2, int i3) {
        int i4 = 0;
        while (i < i2) {
            i4 = zzm[i4 ^ (bArr[i] & 255)];
            i++;
        }
        return i4;
    }

    public static int zzh(int i) {
        if (i == 20) {
            return 30;
        }
        if (i == 22) {
            return 31;
        }
        if (i == 30) {
            return 34;
        }
        switch (i) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
                return 28;
            default:
                switch (i) {
                    case 14:
                        return 25;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        return 28;
                    default:
                        return Integer.MAX_VALUE;
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:12:0x0015 A[RETURN] */
    @SuppressLint({"InlinedApi"})
    public static int zzi(int i) {
        switch (i) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return EnumC4719u30.AD_RESPONSE_RETRY_AFTER_VALUE;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                return 6396;
            case 9:
            case 11:
            default:
                return 0;
            case 10:
                if (zza >= 32) {
                    return 737532;
                }
                return 6396;
            case 12:
                return 743676;
        }
    }

    public static int zzj(ByteBuffer byteBuffer, int i) {
        int i2 = byteBuffer.getInt(i);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i2 : Integer.reverseBytes(i2);
    }

    public static int zzk(int i) {
        if (i != 2) {
            if (i == 3) {
                return 1;
            }
            if (i != 4) {
                if (i != 21) {
                    if (i != 22) {
                        if (i != 268435456) {
                            if (i != 1342177280) {
                                if (i != 1610612736) {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    }
                }
                return 3;
            }
            return 4;
        }
        return 2;
    }

    public static int zzl(int i) {
        if (i == 2 || i == 4) {
            return 6005;
        }
        if (i == 10) {
            return 6004;
        }
        if (i == 7) {
            return 6005;
        }
        if (i == 8) {
            return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
        }
        switch (i) {
            case 15:
                return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return AdError.ICONVIEW_MISSING_ERROR_CODE;
                    default:
                        return 6006;
                }
        }
    }

    public static int zzm(@Nullable String str) {
        String[] strArrSplit;
        int length;
        int i = 0;
        if (str == null || (length = (strArrSplit = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = strArrSplit[length - 1];
        boolean z = length >= 3 && "neg".equals(strArrSplit[length + (-2)]);
        str2.getClass();
        try {
            i = Integer.parseInt(str2);
            if (z) {
                return -i;
            }
        } catch (NumberFormatException unused) {
        }
        return i;
    }

    public static int zzn(int i) {
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 2;
        }
        if (i != 24) {
            return i != 32 ? 0 : 22;
        }
        return 21;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x005d  */
    public static int zzo(Uri uri) {
        byte b;
        int i;
        String scheme = uri.getScheme();
        if (scheme != null && zzftt.zzc("rtsp", scheme)) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int iLastIndexOf = lastPathSegment.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            switch (zzftt.zza(lastPathSegment.substring(iLastIndexOf + 1))) {
                case "ism":
                    b = 2;
                    break;
                case "mpd":
                    b = 0;
                    break;
                case "isml":
                    b = 3;
                    break;
                case "m3u8":
                    b = 1;
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b == 0) {
                i = 0;
            } else if (b != 1) {
                i = (b == 2 || b == 3) ? 1 : 4;
            } else {
                i = 2;
            }
            if (i != 4) {
                return i;
            }
        }
        Pattern pattern = zzg;
        String path = uri.getPath();
        path.getClass();
        Matcher matcher = pattern.matcher(path);
        if (!matcher.matches()) {
            return 4;
        }
        String strGroup = matcher.group(2);
        if (strGroup != null) {
            if (strGroup.contains("format=mpd-time-csf")) {
                return 0;
            }
            if (strGroup.contains("format=m3u8-aapl")) {
                return 2;
            }
        }
        return 1;
    }

    public static long zzp(long j, int i) {
        return zzu(j, i, 1000000L, RoundingMode.UP);
    }

    public static long zzq(long j, float f) {
        return f == 1.0f ? j : Math.round(j * ((double) f));
    }

    public static long zzr(long j, float f) {
        return f == 1.0f ? j : Math.round(j / ((double) f));
    }

    public static long zzs(long j) {
        return (j == C.TIME_UNSET || j == Long.MIN_VALUE) ? j : j * 1000;
    }

    public static long zzt(long j, int i) {
        return zzu(j, 1000000L, i, RoundingMode.DOWN);
    }

    public static long zzu(long j, long j2, long j3, RoundingMode roundingMode) {
        if (j == 0 || j2 == 0) {
            return 0L;
        }
        if (j3 >= j2 && j3 % j2 == 0) {
            return zzgal.zzb(j, zzgal.zzb(j3, j2, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (j3 < j2 && j2 % j3 == 0) {
            return zzgal.zzd(j, zzgal.zzb(j2, j3, RoundingMode.UNNECESSARY));
        }
        if (j3 < j || j3 % j != 0) {
            return (j3 >= j || j % j3 != 0) ? zzP(j, j2, j3, roundingMode) : zzgal.zzd(j2, zzgal.zzb(j, j3, RoundingMode.UNNECESSARY));
        }
        return zzgal.zzb(j2, zzgal.zzb(j3, j, RoundingMode.UNNECESSARY), roundingMode);
    }

    public static long zzv(long j) {
        return (j == C.TIME_UNSET || j == Long.MIN_VALUE) ? j : j / 1000;
    }

    public static Point zzw(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && zzM(context)) {
            String strZzQ = zza < 28 ? zzQ("sys.display-size") : zzQ("vendor.display-size");
            if (!TextUtils.isEmpty(strZzQ)) {
                try {
                    String[] strArrSplit = strZzQ.trim().split("x", -1);
                    if (strArrSplit.length == 2) {
                        int i = Integer.parseInt(strArrSplit[0]);
                        int i2 = Integer.parseInt(strArrSplit[1]);
                        if (i > 0 && i2 > 0) {
                            return new Point(i, i2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                zzdo.zzc("Util", "Invalid display size: ".concat(String.valueOf(strZzQ)));
            }
            if ("Sony".equals(zzc) && zzd.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        if (zza < 23) {
            display.getRealSize(point);
            return point;
        }
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
        return point;
    }

    public static AudioFormat zzx(int i, int i2, int i3) {
        return new AudioFormat.Builder().setSampleRate(i).setChannelMask(i2).setEncoding(i3).build();
    }

    public static Handler zzy(@Nullable Handler.Callback callback) {
        Looper looperMyLooper = Looper.myLooper();
        zzcw.zzb(looperMyLooper);
        return new Handler(looperMyLooper, null);
    }

    public static Looper zzz() {
        Looper looperMyLooper = Looper.myLooper();
        return looperMyLooper != null ? looperMyLooper : Looper.getMainLooper();
    }
}
