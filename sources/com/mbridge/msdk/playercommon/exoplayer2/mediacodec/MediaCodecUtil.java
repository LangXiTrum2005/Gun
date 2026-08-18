package com.mbridge.msdk.playercommon.exoplayer2.mediacodec;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseIntArray;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"InlinedApi"})
@TargetApi(16)
public final class MediaCodecUtil {
    private static final SparseIntArray AVC_LEVEL_NUMBER_TO_CONST;
    private static final SparseIntArray AVC_PROFILE_NUMBER_TO_CONST;
    private static final String CODEC_ID_AVC1 = "avc1";
    private static final String CODEC_ID_AVC2 = "avc2";
    private static final String CODEC_ID_HEV1 = "hev1";
    private static final String CODEC_ID_HVC1 = "hvc1";
    private static final Map<String, Integer> HEVC_CODEC_STRING_TO_PROFILE_LEVEL;
    private static final String MTK_RAW_DECODER_NAME = "OMX.MTK.AUDIO.DECODER.RAW";
    private static final String TAG = "MediaCodecUtil";
    private static final String GOOGLE_RAW_DECODER_NAME = "OMX.google.raw.decoder";
    private static final MediaCodecInfo PASSTHROUGH_DECODER_INFO = MediaCodecInfo.newPassthroughInstance(GOOGLE_RAW_DECODER_NAME);
    private static final Pattern PROFILE_PATTERN = Pattern.compile("^\\D?(\\d+)$");
    private static final HashMap<CodecKey, List<MediaCodecInfo>> decoderInfosCache = new HashMap<>();
    private static int maxH264DecodableFrameSize = -1;

    public static final class CodecKey {
        public final String mimeType;
        public final boolean secure;

        public CodecKey(String str, boolean z) {
            this.mimeType = str;
            this.secure = z;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != CodecKey.class) {
                return false;
            }
            CodecKey codecKey = (CodecKey) obj;
            return TextUtils.equals(this.mimeType, codecKey.mimeType) && this.secure == codecKey.secure;
        }

        public int hashCode() {
            String str = this.mimeType;
            return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (this.secure ? 1231 : 1237);
        }
    }

    public static class DecoderQueryException extends Exception {
        private DecoderQueryException(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    public interface MediaCodecListCompat {
        int getCodecCount();

        android.media.MediaCodecInfo getCodecInfoAt(int i);

        boolean isSecurePlaybackSupported(String str, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean secureDecodersExplicit();
    }

    public static final class MediaCodecListCompatV16 implements MediaCodecListCompat {
        private MediaCodecListCompatV16() {
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public int getCodecCount() {
            return MediaCodecList.getCodecCount();
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public android.media.MediaCodecInfo getCodecInfoAt(int i) {
            return MediaCodecList.getCodecInfoAt(i);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean isSecurePlaybackSupported(String str, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "video/avc".equals(str);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean secureDecodersExplicit() {
            return false;
        }
    }

    @TargetApi(21)
    public static final class MediaCodecListCompatV21 implements MediaCodecListCompat {
        private final int codecKind;
        private android.media.MediaCodecInfo[] mediaCodecInfos;

        public MediaCodecListCompatV21(boolean z) {
            this.codecKind = z ? 1 : 0;
        }

        private void ensureMediaCodecInfosInitialized() {
            if (this.mediaCodecInfos == null) {
                this.mediaCodecInfos = new MediaCodecList(this.codecKind).getCodecInfos();
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public int getCodecCount() {
            ensureMediaCodecInfosInitialized();
            return this.mediaCodecInfos.length;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public android.media.MediaCodecInfo getCodecInfoAt(int i) {
            ensureMediaCodecInfosInitialized();
            return this.mediaCodecInfos[i];
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean isSecurePlaybackSupported(String str, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported("secure-playback");
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecUtil.MediaCodecListCompat
        public boolean secureDecodersExplicit() {
            return true;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        AVC_PROFILE_NUMBER_TO_CONST = sparseIntArray;
        sparseIntArray.put(66, 1);
        sparseIntArray.put(77, 2);
        sparseIntArray.put(88, 4);
        sparseIntArray.put(100, 8);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        AVC_LEVEL_NUMBER_TO_CONST = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        sparseIntArray2.put(11, 4);
        sparseIntArray2.put(12, 8);
        sparseIntArray2.put(13, 16);
        sparseIntArray2.put(20, 32);
        sparseIntArray2.put(21, 64);
        sparseIntArray2.put(22, 128);
        sparseIntArray2.put(30, 256);
        sparseIntArray2.put(31, 512);
        sparseIntArray2.put(32, 1024);
        sparseIntArray2.put(40, 2048);
        sparseIntArray2.put(41, 4096);
        sparseIntArray2.put(42, 8192);
        sparseIntArray2.put(50, 16384);
        sparseIntArray2.put(51, 32768);
        sparseIntArray2.put(52, 65536);
        HashMap map = new HashMap();
        HEVC_CODEC_STRING_TO_PROFILE_LEVEL = map;
        AbstractC3950lJ.y(1, map, "L30", 4, "L60");
        AbstractC3950lJ.y(16, map, "L63", 64, "L90");
        AbstractC3950lJ.y(256, map, "L93", 1024, "L120");
        AbstractC3950lJ.y(4096, map, "L123", 16384, "L150");
        AbstractC3950lJ.y(65536, map, "L153", 262144, "L156");
        AbstractC3950lJ.y(1048576, map, "L180", 4194304, "L183");
        AbstractC3950lJ.y(16777216, map, "L186", 2, "H30");
        AbstractC3950lJ.y(8, map, "H60", 32, "H63");
        AbstractC3950lJ.y(128, map, "H90", 512, "H93");
        AbstractC3950lJ.y(2048, map, "H120", 8192, "H123");
        AbstractC3950lJ.y(32768, map, "H150", 131072, "H153");
        AbstractC3950lJ.y(524288, map, "H156", 2097152, "H180");
        AbstractC3950lJ.y(8388608, map, "H183", 33554432, "H186");
    }

    private MediaCodecUtil() {
    }

    private static void applyWorkarounds(List<MediaCodecInfo> list) {
        if (Util.SDK_INT < 26) {
            if (list.size() <= 1 || !MTK_RAW_DECODER_NAME.equals(list.get(0).name)) {
                return;
            }
            for (int i = 1; i < list.size(); i++) {
                MediaCodecInfo mediaCodecInfo = list.get(i);
                if (GOOGLE_RAW_DECODER_NAME.equals(mediaCodecInfo.name)) {
                    list.remove(i);
                    list.add(0, mediaCodecInfo);
                    return;
                }
            }
        }
    }

    private static int avcLevelToMaxFrameSize(int i) {
        if (i == 1 || i == 2) {
            return 25344;
        }
        switch (i) {
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case 256:
                return 414720;
            case 512:
                return 921600;
            case 1024:
                return 1310720;
            case 2048:
            case 4096:
                return 2097152;
            case 8192:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
            case 65536:
                return 9437184;
            default:
                return -1;
        }
    }

    private static boolean codecNeedsDisableAdaptationWorkaround(String str) {
        if (Util.SDK_INT <= 22) {
            String str2 = Util.MODEL;
            if (("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                return true;
            }
        }
        return false;
    }

    private static Pair<Integer, Integer> getAvcProfileAndLevel(String str, String[] strArr) {
        Integer numValueOf;
        Integer numValueOf2;
        int i;
        if (strArr.length < 2) {
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                numValueOf = Integer.valueOf(Integer.parseInt(strArr[1].substring(0, 2), 16));
                numValueOf2 = Integer.valueOf(Integer.parseInt(strArr[1].substring(4), 16));
            } else {
                if (strArr.length < 3) {
                    return null;
                }
                numValueOf = Integer.valueOf(Integer.parseInt(strArr[1]));
                numValueOf2 = Integer.valueOf(Integer.parseInt(strArr[2]));
            }
            int i2 = AVC_PROFILE_NUMBER_TO_CONST.get(numValueOf.intValue(), -1);
            if (i2 == -1 || (i = AVC_LEVEL_NUMBER_TO_CONST.get(numValueOf2.intValue(), -1)) == -1) {
                return null;
            }
            return new Pair<>(Integer.valueOf(i2), Integer.valueOf(i));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public static Pair<Integer, Integer> getCodecProfileAndLevel(String str) {
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("\\.");
        byte b = 0;
        String str2 = strArrSplit[0];
        str2.getClass();
        switch (str2.hashCode()) {
            case 3006243:
                if (!str2.equals(CODEC_ID_AVC1)) {
                    b = -1;
                }
                break;
            case 3006244:
                if (!str2.equals(CODEC_ID_AVC2)) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case 3199032:
                if (!str2.equals(CODEC_ID_HEV1)) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case 3214780:
                if (!str2.equals(CODEC_ID_HVC1)) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
            case 1:
                return getAvcProfileAndLevel(str, strArrSplit);
            case 2:
            case 3:
                return getHevcProfileAndLevel(str, strArrSplit);
            default:
                return null;
        }
    }

    @Nullable
    public static MediaCodecInfo getDecoderInfo(String str, boolean z) throws DecoderQueryException {
        List<MediaCodecInfo> decoderInfos = getDecoderInfos(str, z);
        if (decoderInfos.isEmpty()) {
            return null;
        }
        return decoderInfos.get(0);
    }

    public static synchronized List<MediaCodecInfo> getDecoderInfos(String str, boolean z) throws DecoderQueryException {
        try {
            CodecKey codecKey = new CodecKey(str, z);
            HashMap<CodecKey, List<MediaCodecInfo>> map = decoderInfosCache;
            List<MediaCodecInfo> list = map.get(codecKey);
            if (list != null) {
                return list;
            }
            int i = Util.SDK_INT;
            MediaCodecListCompat mediaCodecListCompatV21 = i >= 21 ? new MediaCodecListCompatV21(z) : new MediaCodecListCompatV16();
            ArrayList<MediaCodecInfo> decoderInfosInternal = getDecoderInfosInternal(codecKey, mediaCodecListCompatV21, str);
            if (z && decoderInfosInternal.isEmpty() && 21 <= i && i <= 23) {
                mediaCodecListCompatV21 = new MediaCodecListCompatV16();
                decoderInfosInternal = getDecoderInfosInternal(codecKey, mediaCodecListCompatV21, str);
                if (!decoderInfosInternal.isEmpty()) {
                    String str2 = decoderInfosInternal.get(0).name;
                }
            }
            if (MimeTypes.AUDIO_E_AC3_JOC.equals(str)) {
                decoderInfosInternal.addAll(getDecoderInfosInternal(new CodecKey(MimeTypes.AUDIO_E_AC3, codecKey.secure), mediaCodecListCompatV21, str));
            }
            applyWorkarounds(decoderInfosInternal);
            List<MediaCodecInfo> listUnmodifiableList = Collections.unmodifiableList(decoderInfosInternal);
            map.put(codecKey, listUnmodifiableList);
            return listUnmodifiableList;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0049  */
    private static ArrayList<MediaCodecInfo> getDecoderInfosInternal(CodecKey codecKey, MediaCodecListCompat mediaCodecListCompat, String str) throws DecoderQueryException {
        try {
            ArrayList<MediaCodecInfo> arrayList = new ArrayList<>();
            String str2 = codecKey.mimeType;
            int codecCount = mediaCodecListCompat.getCodecCount();
            boolean zSecureDecodersExplicit = mediaCodecListCompat.secureDecodersExplicit();
            for (int i = 0; i < codecCount; i++) {
                android.media.MediaCodecInfo codecInfoAt = mediaCodecListCompat.getCodecInfoAt(i);
                String name = codecInfoAt.getName();
                if (isCodecUsableDecoder(codecInfoAt, name, zSecureDecodersExplicit, str)) {
                    String[] supportedTypes = codecInfoAt.getSupportedTypes();
                    int length = supportedTypes.length;
                    int i2 = 0;
                    while (i2 < length) {
                        String str3 = supportedTypes[i2];
                        if (str3.equalsIgnoreCase(str2)) {
                            try {
                                android.media.MediaCodecInfo.CodecCapabilities capabilitiesForType = codecInfoAt.getCapabilitiesForType(str3);
                                boolean zIsSecurePlaybackSupported = mediaCodecListCompat.isSecurePlaybackSupported(str2, capabilitiesForType);
                                boolean zCodecNeedsDisableAdaptationWorkaround = codecNeedsDisableAdaptationWorkaround(name);
                                if (zSecureDecodersExplicit && codecKey.secure == zIsSecurePlaybackSupported) {
                                    arrayList.add(MediaCodecInfo.newInstance(name, str2, capabilitiesForType, zCodecNeedsDisableAdaptationWorkaround, false));
                                } else {
                                    if (!zSecureDecodersExplicit) {
                                        try {
                                            if (!codecKey.secure) {
                                                arrayList.add(MediaCodecInfo.newInstance(name, str2, capabilitiesForType, zCodecNeedsDisableAdaptationWorkaround, false));
                                            }
                                        } catch (Exception e) {
                                            e = e;
                                            if (Util.SDK_INT <= 23) {
                                            }
                                            throw e;
                                        }
                                    }
                                    if (!zSecureDecodersExplicit && zIsSecurePlaybackSupported) {
                                        arrayList.add(MediaCodecInfo.newInstance(name + ".secure", str2, capabilitiesForType, zCodecNeedsDisableAdaptationWorkaround, true));
                                        return arrayList;
                                    }
                                    if (Util.SDK_INT <= 23 || arrayList.isEmpty()) {
                                        throw e;
                                    }
                                }
                            } catch (Exception e2) {
                                e = e2;
                            }
                        }
                        i2++;
                        mediaCodecListCompat = mediaCodecListCompat;
                    }
                }
            }
            return arrayList;
        } catch (Exception e3) {
            throw new DecoderQueryException(e3);
        }
    }

    private static Pair<Integer, Integer> getHevcProfileAndLevel(String str, String[] strArr) {
        int i;
        if (strArr.length < 4) {
            return null;
        }
        Matcher matcher = PROFILE_PATTERN.matcher(strArr[1]);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        if ("1".equals(strGroup)) {
            i = 1;
        } else {
            if (!"2".equals(strGroup)) {
                return null;
            }
            i = 2;
        }
        Integer num = HEVC_CODEC_STRING_TO_PROFILE_LEVEL.get(strArr[3]);
        if (num != null) {
            return new Pair<>(Integer.valueOf(i), num);
        }
        matcher.group(1);
        return null;
    }

    public static MediaCodecInfo getPassthroughDecoderInfo() {
        return PASSTHROUGH_DECODER_INFO;
    }

    private static boolean isCodecUsableDecoder(android.media.MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        int i = Util.SDK_INT;
        if (i < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i < 18 && "OMX.SEC.MP3.Decoder".equals(str)) {
            return false;
        }
        if (i < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = Util.DEVICE;
            if ("a70".equals(str3) || ("Xiaomi".equals(Util.MANUFACTURER) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = Util.DEVICE;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = Util.DEVICE;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(Util.MANUFACTURER))) {
            String str6 = Util.DEVICE;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(Util.MANUFACTURER)) {
            String str7 = Util.DEVICE;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i <= 19 && Util.DEVICE.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return (MimeTypes.AUDIO_E_AC3_JOC.equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    public static int maxH264DecodableFrameSize() throws DecoderQueryException {
        if (maxH264DecodableFrameSize == -1) {
            int iMax = 0;
            MediaCodecInfo decoderInfo = getDecoderInfo("video/avc", false);
            if (decoderInfo != null) {
                android.media.MediaCodecInfo.CodecProfileLevel[] profileLevels = decoderInfo.getProfileLevels();
                int length = profileLevels.length;
                int iMax2 = 0;
                while (iMax < length) {
                    iMax2 = Math.max(avcLevelToMaxFrameSize(profileLevels[iMax].level), iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, Util.SDK_INT >= 21 ? 345600 : 172800);
            }
            maxH264DecodableFrameSize = iMax;
        }
        return maxH264DecodableFrameSize;
    }

    public static void warmDecoderInfoCache(String str, boolean z) {
        try {
            getDecoderInfos(str, z);
        } catch (DecoderQueryException unused) {
        }
    }
}
