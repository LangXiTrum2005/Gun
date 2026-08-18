package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzsg {
    public final String zza;
    public final String zzb;
    public final String zzc;

    @Nullable
    public final MediaCodecInfo.CodecCapabilities zzd;
    public final boolean zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    private final boolean zzi;

    @VisibleForTesting
    public zzsg(String str, String str2, String str3, @Nullable MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        str.getClass();
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = codecCapabilities;
        this.zzg = z;
        this.zze = z4;
        this.zzf = z6;
        this.zzh = z7;
        this.zzi = zzbb.zzi(str2);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003c  */
    public static zzsg zzc(String str, String str2, String str3, @Nullable MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        if (codecCapabilities != null && codecCapabilities.isFeatureSupported("adaptive-playback")) {
            if (zzei.zza <= 22) {
                String str4 = zzei.zzd;
                z6 = (("ODROID-XU3".equals(str4) || "Nexus 10".equals(str4)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) ? false : true;
            }
        }
        return new zzsg(str, str2, str3, codecCapabilities, z, z2, z3, z6, codecCapabilities != null && codecCapabilities.isFeatureSupported("tunneled-playback"), z5 || (codecCapabilities != null && codecCapabilities.isFeatureSupported("secure-playback")), zzei.zza >= 35 && codecCapabilities != null && codecCapabilities.isFeatureSupported("detached-surface"));
    }

    private static Point zzi(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i3 = zzei.zza;
        return new Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i2 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    private final void zzj(String str) {
        String str2 = zzei.zze;
        StringBuilder sbU = AbstractC3950lJ.u("NoSupport [", str, "] [");
        sbU.append(this.zza);
        sbU.append(", ");
        zzdo.zzb(com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecInfo.TAG, DM.n(sbU, this.zzb, "] [", str2, "]"));
    }

    private static boolean zzk(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point pointZzi = zzi(videoCapabilities, i, i2);
        int i3 = pointZzi.x;
        int i4 = pointZzi.y;
        return (d == -1.0d || d < 1.0d) ? videoCapabilities.isSizeSupported(i3, i4) : videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:57:0x00df  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:73:0x010e  */
    private final boolean zzl(zzab zzabVar, boolean z) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrZzh;
        int i;
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        int iIntValue;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i2 = zzta.zza;
        Pair pairZza = zzcy.zza(zzabVar);
        String str = zzabVar.zzo;
        if (str != null && str.equals("video/mv-hevc") && this.zzc.equals("video/hevc")) {
            String strZzg = zzfk.zzg(zzabVar.zzr);
            if (strZzg == null) {
                pairZza = null;
            } else {
                String strTrim = strZzg.trim();
                int i3 = zzei.zza;
                pairZza = zzcy.zzb(strZzg, strTrim.split("\\.", -1), zzabVar.zzC);
            }
        }
        if (pairZza != null) {
            int iIntValue2 = ((Integer) pairZza.first).intValue();
            int iIntValue3 = ((Integer) pairZza.second).intValue();
            int i4 = 8;
            if ("video/dolby-vision".equals(zzabVar.zzo)) {
                if ("video/avc".equals(this.zzb)) {
                    iIntValue3 = 0;
                    iIntValue2 = 8;
                } else if ("video/hevc".equals(this.zzb)) {
                    iIntValue3 = 0;
                    iIntValue2 = 2;
                }
            }
            if (this.zzi) {
                codecProfileLevelArrZzh = zzh();
                if (zzei.zza <= 23 && MimeTypes.VIDEO_VP9.equals(this.zzb) && codecProfileLevelArrZzh.length == 0) {
                    codecCapabilities = this.zzd;
                    if (codecCapabilities != null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                        iIntValue = 0;
                    } else {
                        iIntValue = ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
                    }
                    if (iIntValue >= 180000000) {
                        i4 = 1024;
                    } else if (iIntValue >= 120000000) {
                        i4 = 512;
                    } else if (iIntValue >= 60000000) {
                        i4 = 256;
                    } else if (iIntValue >= 30000000) {
                        i4 = 128;
                    } else if (iIntValue >= 18000000) {
                        i4 = 64;
                    } else if (iIntValue >= 12000000) {
                        i4 = 32;
                    } else if (iIntValue >= 7200000) {
                        i4 = 16;
                    } else if (iIntValue < 3600000) {
                        if (iIntValue >= 1800000) {
                            i4 = 4;
                        } else if (iIntValue >= 800000) {
                            i4 = 2;
                        } else {
                            i4 = 1;
                        }
                    }
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel.profile = 1;
                    codecProfileLevel.level = i4;
                    codecProfileLevelArrZzh = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
                }
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArrZzh) {
                    if (codecProfileLevel2.profile != iIntValue2 && (codecProfileLevel2.level >= iIntValue3 || !z)) {
                        if ("video/hevc".equals(this.zzb) && iIntValue2 == 2) {
                            String str2 = zzei.zzb;
                            if ("sailfish".equals(str2) || "marlin".equals(str2)) {
                            }
                        }
                    }
                }
                zzj(AbstractC5044xl.m("codec.profileLevel, ", zzabVar.zzk, ", ", this.zzc));
                return false;
            }
            if (iIntValue2 == 42) {
                iIntValue2 = 42;
                codecProfileLevelArrZzh = zzh();
                if (zzei.zza <= 23) {
                    codecCapabilities = this.zzd;
                    if (codecCapabilities != null) {
                        iIntValue = 0;
                    } else {
                        iIntValue = 0;
                    }
                    if (iIntValue >= 180000000) {
                        i4 = 1024;
                    } else if (iIntValue >= 120000000) {
                        i4 = 512;
                    } else if (iIntValue >= 60000000) {
                        i4 = 256;
                    } else if (iIntValue >= 30000000) {
                        i4 = 128;
                    } else if (iIntValue >= 18000000) {
                        i4 = 64;
                    } else if (iIntValue >= 12000000) {
                        i4 = 32;
                    } else if (iIntValue >= 7200000) {
                        i4 = 16;
                    } else if (iIntValue < 3600000) {
                        if (iIntValue >= 1800000) {
                            i4 = 4;
                        } else if (iIntValue >= 800000) {
                            i4 = 2;
                        } else {
                            i4 = 1;
                        }
                    }
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel3 = new MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel3.profile = 1;
                    codecProfileLevel3.level = i4;
                    codecProfileLevelArrZzh = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel3};
                }
                while (i < r6) {
                    if (codecProfileLevel2.profile != iIntValue2) {
                    }
                }
                zzj(AbstractC5044xl.m("codec.profileLevel, ", zzabVar.zzk, ", ", this.zzc));
                return false;
            }
        }
        return true;
    }

    private final boolean zzm(zzab zzabVar) {
        return this.zzb.equals(zzabVar.zzo) || this.zzb.equals(zzta.zzb(zzabVar));
    }

    public final String toString() {
        return this.zza;
    }

    @Nullable
    public final Point zza(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return zzi(videoCapabilities, i, i2);
    }

    public final zzht zzb(zzab zzabVar, zzab zzabVar2) {
        int i = true != Objects.equals(zzabVar.zzo, zzabVar2.zzo) ? 8 : 0;
        if (this.zzi) {
            if (zzabVar.zzy != zzabVar2.zzy) {
                i |= 1024;
            }
            if (!this.zze && (zzabVar.zzv != zzabVar2.zzv || zzabVar.zzw != zzabVar2.zzw)) {
                i |= 512;
            }
            if ((!zzk.zzg(zzabVar.zzC) || !zzk.zzg(zzabVar2.zzC)) && !Objects.equals(zzabVar.zzC, zzabVar2.zzC)) {
                i |= 2048;
            }
            String str = this.zza;
            if (zzei.zzd.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !zzabVar.zzd(zzabVar2)) {
                i |= 2;
            }
            if (i == 0) {
                return new zzht(this.zza, zzabVar, zzabVar2, true != zzabVar.zzd(zzabVar2) ? 2 : 3, 0);
            }
        } else {
            if (zzabVar.zzD != zzabVar2.zzD) {
                i |= 4096;
            }
            if (zzabVar.zzE != zzabVar2.zzE) {
                i |= 8192;
            }
            if (zzabVar.zzF != zzabVar2.zzF) {
                i |= 16384;
            }
            if (i == 0 && MimeTypes.AUDIO_AAC.equals(this.zzb)) {
                int i2 = zzta.zza;
                Pair pairZza = zzcy.zza(zzabVar);
                Pair pairZza2 = zzcy.zza(zzabVar2);
                if (pairZza != null && pairZza2 != null) {
                    int iIntValue = ((Integer) pairZza.first).intValue();
                    int iIntValue2 = ((Integer) pairZza2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new zzht(this.zza, zzabVar, zzabVar2, 3, 0);
                    }
                }
            }
            if (!zzabVar.zzd(zzabVar2)) {
                i |= 32;
            }
            if (MimeTypes.AUDIO_OPUS.equals(this.zzb)) {
                i |= 2;
            }
            if (i == 0) {
                return new zzht(this.zza, zzabVar, zzabVar2, 1, 0);
            }
        }
        return new zzht(this.zza, zzabVar, zzabVar2, 0, i);
    }

    public final boolean zzd(zzab zzabVar) {
        return zzm(zzabVar) && zzl(zzabVar, false);
    }

    public final boolean zze(zzab zzabVar) throws zzsu {
        int i;
        int i2;
        if (!zzm(zzabVar) || !zzl(zzabVar, true)) {
            return false;
        }
        if (this.zzi) {
            int i3 = zzabVar.zzv;
            if (i3 <= 0 || (i2 = zzabVar.zzw) <= 0) {
                return true;
            }
            return zzg(i3, i2, zzabVar.zzx);
        }
        int i4 = zzabVar.zzE;
        if (i4 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
            if (codecCapabilities == null) {
                zzj("sampleRate.caps");
                return false;
            }
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                zzj("sampleRate.aCaps");
                return false;
            }
            if (!audioCapabilities.isSampleRateSupported(i4)) {
                zzj(AbstractC3950lJ.p("sampleRate.support, ", i4));
                return false;
            }
        }
        int i5 = zzabVar.zzD;
        if (i5 == -1) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.zzd;
        if (codecCapabilities2 == null) {
            zzj("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
        if (audioCapabilities2 == null) {
            zzj("channelCount.aCaps");
            return false;
        }
        String str = this.zza;
        String str2 = this.zzb;
        int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
        if (maxInputChannelCount <= 1 && ((zzei.zza < 26 || maxInputChannelCount <= 0) && !MimeTypes.AUDIO_MPEG.equals(str2) && !MimeTypes.AUDIO_AMR_NB.equals(str2) && !MimeTypes.AUDIO_AMR_WB.equals(str2) && !MimeTypes.AUDIO_AAC.equals(str2) && !MimeTypes.AUDIO_VORBIS.equals(str2) && !MimeTypes.AUDIO_OPUS.equals(str2) && !MimeTypes.AUDIO_RAW.equals(str2) && !MimeTypes.AUDIO_FLAC.equals(str2) && !MimeTypes.AUDIO_ALAW.equals(str2) && !MimeTypes.AUDIO_MLAW.equals(str2) && !MimeTypes.AUDIO_MSGSM.equals(str2))) {
            if (MimeTypes.AUDIO_AC3.equals(str2)) {
                i = 6;
            } else {
                i = MimeTypes.AUDIO_E_AC3.equals(str2) ? 16 : 30;
            }
            zzdo.zzf(com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecInfo.TAG, "AssumedMaxChannelAdjustment: " + str + ", [" + maxInputChannelCount + " to " + i + "]");
            maxInputChannelCount = i;
        }
        if (maxInputChannelCount >= i5) {
            return true;
        }
        zzj(AbstractC3950lJ.p("channelCount.support, ", i5));
        return false;
    }

    public final boolean zzf(zzab zzabVar) {
        if (this.zzi) {
            return this.zze;
        }
        int i = zzta.zza;
        Pair pairZza = zzcy.zza(zzabVar);
        return pairZza != null && ((Integer) pairZza.first).intValue() == 42;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0045  */
    public final boolean zzg(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null) {
            zzj("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            zzj("sizeAndRate.vCaps");
            return false;
        }
        if (zzei.zza >= 29) {
            int iZza = zzsi.zza(videoCapabilities, i, i2, d);
            if (iZza != 2) {
                if (iZza == 1) {
                    StringBuilder sbT = AbstractC3950lJ.t("sizeAndRate.cover, ", i, "x", i2, "@");
                    sbT.append(d);
                    zzj(sbT.toString());
                    return false;
                }
                if (!zzk(videoCapabilities, i, i2, d)) {
                    if (i < i2) {
                    }
                    StringBuilder sbT2 = AbstractC3950lJ.t("sizeAndRate.support, ", i, "x", i2, "@");
                    sbT2.append(d);
                    zzj(sbT2.toString());
                    return false;
                }
            }
        } else if (!zzk(videoCapabilities, i, i2, d)) {
            if (i < i2 || (("OMX.MTK.VIDEO.DECODER.HEVC".equals(this.zza) && "mcv5a".equals(zzei.zzb)) || !zzk(videoCapabilities, i2, i, d))) {
                StringBuilder sbT3 = AbstractC3950lJ.t("sizeAndRate.support, ", i, "x", i2, "@");
                sbT3.append(d);
                zzj(sbT3.toString());
                return false;
            }
            StringBuilder sbT4 = AbstractC3950lJ.t("sizeAndRate.rotated, ", i, "x", i2, "@");
            sbT4.append(d);
            String string = sbT4.toString();
            String str = this.zza;
            zzdo.zzb(com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecInfo.TAG, DM.n(DM.r("AssumedSupport [", string, "] [", str, ", "), this.zzb, "] [", zzei.zze, "]"));
        }
        return true;
    }

    public final MediaCodecInfo.CodecProfileLevel[] zzh() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }
}
