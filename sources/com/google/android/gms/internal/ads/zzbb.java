package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.badlogic.gdx.Input;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbb {
    public static final /* synthetic */ int zza = 0;
    private static final ArrayList zzb = new ArrayList();
    private static final Pattern zzc = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:41:0x008f  */
    public static int zza(String str, @Nullable String str2) {
        zzba zzbaVarZzc;
        switch (str) {
            case "audio/mpeg":
                return 9;
            case "audio/mp4a-latm":
                if (str2 == null || (zzbaVarZzc = zzc(str2)) == null) {
                    return 0;
                }
                return zzbaVarZzc.zza();
            case "audio/ac3":
                return 5;
            case "audio/eac3":
                return 6;
            case "audio/eac3-joc":
                return 18;
            case "audio/ac4":
                return 17;
            case "audio/vnd.dts":
                return 7;
            case "audio/vnd.dts.hd":
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts.uhd;profile=p2":
                return 30;
            case "audio/true-hd":
                return 14;
            case "audio/opus":
                return 20;
            default:
                return 0;
        }
    }

    public static int zzb(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (zzg(str)) {
            return 1;
        }
        if (zzi(str)) {
            return 2;
        }
        if (MimeTypes.BASE_TYPE_TEXT.equals(zzj(str)) || "application/x-media3-cues".equals(str) || MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str) || MimeTypes.APPLICATION_MP4CEA608.equals(str) || MimeTypes.APPLICATION_SUBRIP.equals(str) || MimeTypes.APPLICATION_TTML.equals(str) || MimeTypes.APPLICATION_TX3G.equals(str) || MimeTypes.APPLICATION_MP4VTT.equals(str) || MimeTypes.APPLICATION_RAWCC.equals(str) || MimeTypes.APPLICATION_VOBSUB.equals(str) || MimeTypes.APPLICATION_PGS.equals(str) || MimeTypes.APPLICATION_DVBSUBS.equals(str)) {
            return 3;
        }
        if (zzh(str)) {
            return 4;
        }
        if (MimeTypes.APPLICATION_ID3.equals(str) || MimeTypes.APPLICATION_EMSG.equals(str) || MimeTypes.APPLICATION_SCTE35.equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str)) {
            return 5;
        }
        if (MimeTypes.APPLICATION_CAMERA_MOTION.equals(str)) {
            return 6;
        }
        int size = zzb.size();
        for (int i = 0; i < size; i++) {
            String str2 = ((zzaz) zzb.get(i)).zza;
            if (str.equals(null)) {
                return 0;
            }
        }
        return -1;
    }

    @Nullable
    @VisibleForTesting
    public static zzba zzc(String str) {
        Matcher matcher = zzc.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        try {
            return new zzba(Integer.parseInt(strGroup, 16), strGroup2 != null ? Integer.parseInt(strGroup2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @Nullable
    public static String zzd(int i) {
        if (i == 32) {
            return MimeTypes.VIDEO_MP4V;
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return MimeTypes.AUDIO_AAC;
        }
        if (i == 163) {
            return MimeTypes.VIDEO_VC1;
        }
        if (i == 177) {
            return MimeTypes.VIDEO_VP9;
        }
        if (i == 221) {
            return MimeTypes.AUDIO_VORBIS;
        }
        if (i == 165) {
            return MimeTypes.AUDIO_AC3;
        }
        if (i == 166) {
            return MimeTypes.AUDIO_E_AC3;
        }
        switch (i) {
            case Input.Keys.BUTTON_A /* 96 */:
            case Input.Keys.BUTTON_B /* 97 */:
            case Input.Keys.BUTTON_C /* 98 */:
            case Input.Keys.BUTTON_X /* 99 */:
            case 100:
            case 101:
                return MimeTypes.VIDEO_MPEG2;
            case 102:
            case 103:
            case 104:
                return MimeTypes.AUDIO_AAC;
            case 105:
            case 107:
                return MimeTypes.AUDIO_MPEG;
            case 106:
                return MimeTypes.VIDEO_MPEG;
            case 108:
                return "image/jpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return MimeTypes.AUDIO_DTS;
                    case 170:
                    case 171:
                        return MimeTypes.AUDIO_DTS_HD;
                    case 173:
                        return MimeTypes.AUDIO_OPUS;
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    public static String zze(String str) {
        byte b;
        if (str == null) {
            return null;
        }
        String strZza = zzftt.zza(str);
        switch (strZza) {
            case "audio/x-flac":
                b = 0;
                break;
            case "application/x-mpegurl":
                b = 3;
                break;
            case "audio/x-wav":
                b = 2;
                break;
            case "audio/mpeg-l1":
                b = 4;
                break;
            case "audio/mpeg-l2":
                b = 5;
                break;
            case "audio/mp3":
                b = 1;
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            return MimeTypes.AUDIO_FLAC;
        }
        if (b == 1) {
            return MimeTypes.AUDIO_MPEG;
        }
        if (b == 2) {
            return "audio/wav";
        }
        if (b == 3) {
            return MimeTypes.APPLICATION_M3U8;
        }
        if (b != 4) {
            return b != 5 ? strZza : MimeTypes.AUDIO_MPEG_L2;
        }
        return MimeTypes.AUDIO_MPEG_L1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:41:0x0080  */
    public static boolean zzf(@Nullable String str, @Nullable String str2) {
        zzba zzbaVarZzc;
        int iZza;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/mpeg":
            case "audio/mpeg-L1":
            case "audio/mpeg-L2":
            case "audio/raw":
            case "audio/g711-alaw":
            case "audio/g711-mlaw":
            case "audio/flac":
            case "audio/ac3":
            case "audio/eac3":
            case "audio/eac3-joc":
                return true;
            case "audio/mp4a-latm":
                return (str2 == null || (zzbaVarZzc = zzc(str2)) == null || (iZza = zzbaVarZzc.zza()) == 0 || iZza == 16) ? false : true;
            default:
                return false;
        }
    }

    public static boolean zzg(@Nullable String str) {
        return "audio".equals(zzj(str));
    }

    public static boolean zzh(@Nullable String str) {
        return "image".equals(zzj(str)) || "application/x-image-uri".equals(str);
    }

    public static boolean zzi(@Nullable String str) {
        return "video".equals(zzj(str));
    }

    @Nullable
    private static String zzj(@Nullable String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }
}
