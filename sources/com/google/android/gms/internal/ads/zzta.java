package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.annotation.CheckResult;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"InlinedApi"})
public final class zzta {
    public static final /* synthetic */ int zza = 0;

    @GuardedBy("MediaCodecUtil.class")
    private static final HashMap zzb = new HashMap();

    @Nullable
    public static zzsg zza() throws zzsu {
        List listZzd = zzd(MimeTypes.AUDIO_RAW, false, false);
        if (listZzd.isEmpty()) {
            return null;
        }
        return (zzsg) listZzd.get(0);
    }

    @Nullable
    public static String zzb(zzab zzabVar) {
        Pair pairZza;
        if (MimeTypes.AUDIO_E_AC3_JOC.equals(zzabVar.zzo)) {
            return MimeTypes.AUDIO_E_AC3;
        }
        if ("video/dolby-vision".equals(zzabVar.zzo) && (pairZza = zzcy.zza(zzabVar)) != null) {
            int iIntValue = ((Integer) pairZza.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return "video/hevc";
            }
            if (iIntValue == 512) {
                return "video/avc";
            }
            if (iIntValue == 1024) {
                return com.unity3d.services.core.device.MimeTypes.VIDEO_AV1;
            }
        }
        if ("video/mv-hevc".equals(zzabVar.zzo)) {
            return "video/hevc";
        }
        return null;
    }

    public static List zzc(zzsp zzspVar, zzab zzabVar, boolean z, boolean z2) throws zzsu {
        String strZzb = zzb(zzabVar);
        return strZzb == null ? zzfxn.zzn() : zzspVar.zza(strZzb, z, z2);
    }

    public static synchronized List zzd(String str, boolean z, boolean z2) throws zzsu {
        try {
            zzst zzstVar = new zzst(str, z, z2);
            HashMap map = zzb;
            List list = (List) map.get(zzstVar);
            if (list != null) {
                return list;
            }
            ArrayList arrayListZzg = zzg(zzstVar, new zzsx(z, z2));
            if (z && arrayListZzg.isEmpty() && zzei.zza <= 23) {
                arrayListZzg = zzg(zzstVar, new zzsw(null));
                if (!arrayListZzg.isEmpty()) {
                    zzdo.zzf("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((zzsg) arrayListZzg.get(0)).zza);
                }
            }
            if (MimeTypes.AUDIO_RAW.equals(str)) {
                if (zzei.zza < 26 && zzei.zzb.equals("R9") && arrayListZzg.size() == 1 && ((zzsg) arrayListZzg.get(0)).zza.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    arrayListZzg.add(zzsg.zzc("OMX.google.raw.decoder", MimeTypes.AUDIO_RAW, MimeTypes.AUDIO_RAW, null, false, true, false, false, false));
                }
                zzh(arrayListZzg, new zzsy() { // from class: com.google.android.gms.internal.ads.zzsr
                    @Override // com.google.android.gms.internal.ads.zzsy
                    public final int zza(Object obj) {
                        int i = zzta.zza;
                        String str2 = ((zzsg) obj).zza;
                        if (str2.startsWith("OMX.google") || str2.startsWith("c2.android")) {
                            return 1;
                        }
                        return (zzei.zza >= 26 || !str2.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
                    }
                });
            }
            if (zzei.zza < 32 && arrayListZzg.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((zzsg) arrayListZzg.get(0)).zza)) {
                arrayListZzg.add((zzsg) arrayListZzg.remove(0));
            }
            zzfxn zzfxnVarZzl = zzfxn.zzl(arrayListZzg);
            map.put(zzstVar, zzfxnVarZzl);
            return zzfxnVarZzl;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static List zze(zzsp zzspVar, zzab zzabVar, boolean z, boolean z2) throws zzsu {
        List listZza = zzspVar.zza(zzabVar.zzo, z, z2);
        List listZzc = zzc(zzspVar, zzabVar, z, z2);
        zzfxk zzfxkVar = new zzfxk();
        zzfxkVar.zzh(listZza);
        zzfxkVar.zzh(listZzc);
        return zzfxkVar.zzi();
    }

    @CheckResult
    public static List zzf(List list, final zzab zzabVar) {
        ArrayList arrayList = new ArrayList(list);
        zzh(arrayList, new zzsy() { // from class: com.google.android.gms.internal.ads.zzss
            @Override // com.google.android.gms.internal.ads.zzsy
            public final int zza(Object obj) {
                int i = zzta.zza;
                return ((zzsg) obj).zzd(zzabVar) ? 1 : 0;
            }
        });
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x017a A[Catch: Exception -> 0x017f, TryCatch #0 {Exception -> 0x017f, blocks: (B:87:0x0149, B:93:0x0160, B:99:0x0174, B:101:0x017a, B:108:0x0191, B:110:0x0199, B:120:0x01c3, B:111:0x019e, B:113:0x01ae, B:115:0x01b6, B:104:0x0188), top: B:156:0x0149 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x0188 A[Catch: Exception -> 0x017f, TryCatch #0 {Exception -> 0x017f, blocks: (B:87:0x0149, B:93:0x0160, B:99:0x0174, B:101:0x017a, B:108:0x0191, B:110:0x0199, B:120:0x01c3, B:111:0x019e, B:113:0x01ae, B:115:0x01b6, B:104:0x0188), top: B:156:0x0149 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x018e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0190  */
    /* JADX WARN: Code duplicated, block: B:110:0x0199 A[Catch: Exception -> 0x017f, TryCatch #0 {Exception -> 0x017f, blocks: (B:87:0x0149, B:93:0x0160, B:99:0x0174, B:101:0x017a, B:108:0x0191, B:110:0x0199, B:120:0x01c3, B:111:0x019e, B:113:0x01ae, B:115:0x01b6, B:104:0x0188), top: B:156:0x0149 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x019e A[Catch: Exception -> 0x017f, TryCatch #0 {Exception -> 0x017f, blocks: (B:87:0x0149, B:93:0x0160, B:99:0x0174, B:101:0x017a, B:108:0x0191, B:110:0x0199, B:120:0x01c3, B:111:0x019e, B:113:0x01ae, B:115:0x01b6, B:104:0x0188), top: B:156:0x0149 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x01ae A[Catch: Exception -> 0x017f, TryCatch #0 {Exception -> 0x017f, blocks: (B:87:0x0149, B:93:0x0160, B:99:0x0174, B:101:0x017a, B:108:0x0191, B:110:0x0199, B:120:0x01c3, B:111:0x019e, B:113:0x01ae, B:115:0x01b6, B:104:0x0188), top: B:156:0x0149 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:120:0x01c3 A[Catch: Exception -> 0x017f, TRY_LEAVE, TryCatch #0 {Exception -> 0x017f, blocks: (B:87:0x0149, B:93:0x0160, B:99:0x0174, B:101:0x017a, B:108:0x0191, B:110:0x0199, B:120:0x01c3, B:111:0x019e, B:113:0x01ae, B:115:0x01b6, B:104:0x0188), top: B:156:0x0149 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x01c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:125:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:133:0x0200 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:147:0x0232 A[Catch: Exception -> 0x0033, TRY_ENTER, TryCatch #5 {Exception -> 0x0033, blocks: (B:3:0x0008, B:5:0x001c, B:7:0x0026, B:12:0x0036, B:16:0x0044, B:20:0x004e, B:22:0x0056, B:24:0x005e, B:26:0x0068, B:28:0x0072, B:30:0x007a, B:32:0x0082, B:34:0x008a, B:36:0x0092, B:38:0x009a, B:40:0x00a2, B:44:0x00ae, B:46:0x00b6, B:48:0x00be, B:50:0x00c6, B:144:0x022a, B:147:0x0232, B:149:0x0238, B:150:0x0252, B:151:0x0273, B:53:0x00d0, B:54:0x00d3, B:56:0x00db, B:59:0x00e6, B:61:0x00ee, B:66:0x00fc, B:68:0x0104, B:71:0x010f, B:73:0x0117, B:76:0x0122, B:78:0x012a, B:81:0x0135, B:83:0x013d), top: B:166:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:156:0x0149 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x01c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x0252 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x0274 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:48:0x00be A[Catch: Exception -> 0x0033, TryCatch #5 {Exception -> 0x0033, blocks: (B:3:0x0008, B:5:0x001c, B:7:0x0026, B:12:0x0036, B:16:0x0044, B:20:0x004e, B:22:0x0056, B:24:0x005e, B:26:0x0068, B:28:0x0072, B:30:0x007a, B:32:0x0082, B:34:0x008a, B:36:0x0092, B:38:0x009a, B:40:0x00a2, B:44:0x00ae, B:46:0x00b6, B:48:0x00be, B:50:0x00c6, B:144:0x022a, B:147:0x0232, B:149:0x0238, B:150:0x0252, B:151:0x0273, B:53:0x00d0, B:54:0x00d3, B:56:0x00db, B:59:0x00e6, B:61:0x00ee, B:66:0x00fc, B:68:0x0104, B:71:0x010f, B:73:0x0117, B:76:0x0122, B:78:0x012a, B:81:0x0135, B:83:0x013d), top: B:166:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00c6 A[Catch: Exception -> 0x0033, TryCatch #5 {Exception -> 0x0033, blocks: (B:3:0x0008, B:5:0x001c, B:7:0x0026, B:12:0x0036, B:16:0x0044, B:20:0x004e, B:22:0x0056, B:24:0x005e, B:26:0x0068, B:28:0x0072, B:30:0x007a, B:32:0x0082, B:34:0x008a, B:36:0x0092, B:38:0x009a, B:40:0x00a2, B:44:0x00ae, B:46:0x00b6, B:48:0x00be, B:50:0x00c6, B:144:0x022a, B:147:0x0232, B:149:0x0238, B:150:0x0252, B:151:0x0273, B:53:0x00d0, B:54:0x00d3, B:56:0x00db, B:59:0x00e6, B:61:0x00ee, B:66:0x00fc, B:68:0x0104, B:71:0x010f, B:73:0x0117, B:76:0x0122, B:78:0x012a, B:81:0x0135, B:83:0x013d), top: B:166:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00d0 A[Catch: Exception -> 0x0033, LOOP:1: B:49:0x00c4->B:53:0x00d0, LOOP_END, TryCatch #5 {Exception -> 0x0033, blocks: (B:3:0x0008, B:5:0x001c, B:7:0x0026, B:12:0x0036, B:16:0x0044, B:20:0x004e, B:22:0x0056, B:24:0x005e, B:26:0x0068, B:28:0x0072, B:30:0x007a, B:32:0x0082, B:34:0x008a, B:36:0x0092, B:38:0x009a, B:40:0x00a2, B:44:0x00ae, B:46:0x00b6, B:48:0x00be, B:50:0x00c6, B:144:0x022a, B:147:0x0232, B:149:0x0238, B:150:0x0252, B:151:0x0273, B:53:0x00d0, B:54:0x00d3, B:56:0x00db, B:59:0x00e6, B:61:0x00ee, B:66:0x00fc, B:68:0x0104, B:71:0x010f, B:73:0x0117, B:76:0x0122, B:78:0x012a, B:81:0x0135, B:83:0x013d), top: B:166:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00db A[Catch: Exception -> 0x0033, TryCatch #5 {Exception -> 0x0033, blocks: (B:3:0x0008, B:5:0x001c, B:7:0x0026, B:12:0x0036, B:16:0x0044, B:20:0x004e, B:22:0x0056, B:24:0x005e, B:26:0x0068, B:28:0x0072, B:30:0x007a, B:32:0x0082, B:34:0x008a, B:36:0x0092, B:38:0x009a, B:40:0x00a2, B:44:0x00ae, B:46:0x00b6, B:48:0x00be, B:50:0x00c6, B:144:0x022a, B:147:0x0232, B:149:0x0238, B:150:0x0252, B:151:0x0273, B:53:0x00d0, B:54:0x00d3, B:56:0x00db, B:59:0x00e6, B:61:0x00ee, B:66:0x00fc, B:68:0x0104, B:71:0x010f, B:73:0x0117, B:76:0x0122, B:78:0x012a, B:81:0x0135, B:83:0x013d), top: B:166:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00e3 A[EDGE_INSN: B:58:0x00e3->B:86:0x0147 BREAK  A[LOOP:1: B:49:0x00c4->B:53:0x00d0]] */
    /* JADX WARN: Code duplicated, block: B:59:0x00e6 A[Catch: Exception -> 0x0033, TryCatch #5 {Exception -> 0x0033, blocks: (B:3:0x0008, B:5:0x001c, B:7:0x0026, B:12:0x0036, B:16:0x0044, B:20:0x004e, B:22:0x0056, B:24:0x005e, B:26:0x0068, B:28:0x0072, B:30:0x007a, B:32:0x0082, B:34:0x008a, B:36:0x0092, B:38:0x009a, B:40:0x00a2, B:44:0x00ae, B:46:0x00b6, B:48:0x00be, B:50:0x00c6, B:144:0x022a, B:147:0x0232, B:149:0x0238, B:150:0x0252, B:151:0x0273, B:53:0x00d0, B:54:0x00d3, B:56:0x00db, B:59:0x00e6, B:61:0x00ee, B:66:0x00fc, B:68:0x0104, B:71:0x010f, B:73:0x0117, B:76:0x0122, B:78:0x012a, B:81:0x0135, B:83:0x013d), top: B:166:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ee A[Catch: Exception -> 0x0033, TryCatch #5 {Exception -> 0x0033, blocks: (B:3:0x0008, B:5:0x001c, B:7:0x0026, B:12:0x0036, B:16:0x0044, B:20:0x004e, B:22:0x0056, B:24:0x005e, B:26:0x0068, B:28:0x0072, B:30:0x007a, B:32:0x0082, B:34:0x008a, B:36:0x0092, B:38:0x009a, B:40:0x00a2, B:44:0x00ae, B:46:0x00b6, B:48:0x00be, B:50:0x00c6, B:144:0x022a, B:147:0x0232, B:149:0x0238, B:150:0x0252, B:151:0x0273, B:53:0x00d0, B:54:0x00d3, B:56:0x00db, B:59:0x00e6, B:61:0x00ee, B:66:0x00fc, B:68:0x0104, B:71:0x010f, B:73:0x0117, B:76:0x0122, B:78:0x012a, B:81:0x0135, B:83:0x013d), top: B:166:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00f7 A[EDGE_INSN: B:64:0x00f7->B:86:0x0147 BREAK  A[LOOP:1: B:49:0x00c4->B:53:0x00d0]] */
    /* JADX WARN: Code duplicated, block: B:66:0x00fc A[Catch: Exception -> 0x0033, TryCatch #5 {Exception -> 0x0033, blocks: (B:3:0x0008, B:5:0x001c, B:7:0x0026, B:12:0x0036, B:16:0x0044, B:20:0x004e, B:22:0x0056, B:24:0x005e, B:26:0x0068, B:28:0x0072, B:30:0x007a, B:32:0x0082, B:34:0x008a, B:36:0x0092, B:38:0x009a, B:40:0x00a2, B:44:0x00ae, B:46:0x00b6, B:48:0x00be, B:50:0x00c6, B:144:0x022a, B:147:0x0232, B:149:0x0238, B:150:0x0252, B:151:0x0273, B:53:0x00d0, B:54:0x00d3, B:56:0x00db, B:59:0x00e6, B:61:0x00ee, B:66:0x00fc, B:68:0x0104, B:71:0x010f, B:73:0x0117, B:76:0x0122, B:78:0x012a, B:81:0x0135, B:83:0x013d), top: B:166:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0104 A[Catch: Exception -> 0x0033, TryCatch #5 {Exception -> 0x0033, blocks: (B:3:0x0008, B:5:0x001c, B:7:0x0026, B:12:0x0036, B:16:0x0044, B:20:0x004e, B:22:0x0056, B:24:0x005e, B:26:0x0068, B:28:0x0072, B:30:0x007a, B:32:0x0082, B:34:0x008a, B:36:0x0092, B:38:0x009a, B:40:0x00a2, B:44:0x00ae, B:46:0x00b6, B:48:0x00be, B:50:0x00c6, B:144:0x022a, B:147:0x0232, B:149:0x0238, B:150:0x0252, B:151:0x0273, B:53:0x00d0, B:54:0x00d3, B:56:0x00db, B:59:0x00e6, B:61:0x00ee, B:66:0x00fc, B:68:0x0104, B:71:0x010f, B:73:0x0117, B:76:0x0122, B:78:0x012a, B:81:0x0135, B:83:0x013d), top: B:166:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x010c A[EDGE_INSN: B:70:0x010c->B:86:0x0147 BREAK  A[LOOP:1: B:49:0x00c4->B:53:0x00d0]] */
    /* JADX WARN: Code duplicated, block: B:71:0x010f A[Catch: Exception -> 0x0033, TryCatch #5 {Exception -> 0x0033, blocks: (B:3:0x0008, B:5:0x001c, B:7:0x0026, B:12:0x0036, B:16:0x0044, B:20:0x004e, B:22:0x0056, B:24:0x005e, B:26:0x0068, B:28:0x0072, B:30:0x007a, B:32:0x0082, B:34:0x008a, B:36:0x0092, B:38:0x009a, B:40:0x00a2, B:44:0x00ae, B:46:0x00b6, B:48:0x00be, B:50:0x00c6, B:144:0x022a, B:147:0x0232, B:149:0x0238, B:150:0x0252, B:151:0x0273, B:53:0x00d0, B:54:0x00d3, B:56:0x00db, B:59:0x00e6, B:61:0x00ee, B:66:0x00fc, B:68:0x0104, B:71:0x010f, B:73:0x0117, B:76:0x0122, B:78:0x012a, B:81:0x0135, B:83:0x013d), top: B:166:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0117 A[Catch: Exception -> 0x0033, TryCatch #5 {Exception -> 0x0033, blocks: (B:3:0x0008, B:5:0x001c, B:7:0x0026, B:12:0x0036, B:16:0x0044, B:20:0x004e, B:22:0x0056, B:24:0x005e, B:26:0x0068, B:28:0x0072, B:30:0x007a, B:32:0x0082, B:34:0x008a, B:36:0x0092, B:38:0x009a, B:40:0x00a2, B:44:0x00ae, B:46:0x00b6, B:48:0x00be, B:50:0x00c6, B:144:0x022a, B:147:0x0232, B:149:0x0238, B:150:0x0252, B:151:0x0273, B:53:0x00d0, B:54:0x00d3, B:56:0x00db, B:59:0x00e6, B:61:0x00ee, B:66:0x00fc, B:68:0x0104, B:71:0x010f, B:73:0x0117, B:76:0x0122, B:78:0x012a, B:81:0x0135, B:83:0x013d), top: B:166:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0122 A[Catch: Exception -> 0x0033, TryCatch #5 {Exception -> 0x0033, blocks: (B:3:0x0008, B:5:0x001c, B:7:0x0026, B:12:0x0036, B:16:0x0044, B:20:0x004e, B:22:0x0056, B:24:0x005e, B:26:0x0068, B:28:0x0072, B:30:0x007a, B:32:0x0082, B:34:0x008a, B:36:0x0092, B:38:0x009a, B:40:0x00a2, B:44:0x00ae, B:46:0x00b6, B:48:0x00be, B:50:0x00c6, B:144:0x022a, B:147:0x0232, B:149:0x0238, B:150:0x0252, B:151:0x0273, B:53:0x00d0, B:54:0x00d3, B:56:0x00db, B:59:0x00e6, B:61:0x00ee, B:66:0x00fc, B:68:0x0104, B:71:0x010f, B:73:0x0117, B:76:0x0122, B:78:0x012a, B:81:0x0135, B:83:0x013d), top: B:166:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x012a A[Catch: Exception -> 0x0033, TryCatch #5 {Exception -> 0x0033, blocks: (B:3:0x0008, B:5:0x001c, B:7:0x0026, B:12:0x0036, B:16:0x0044, B:20:0x004e, B:22:0x0056, B:24:0x005e, B:26:0x0068, B:28:0x0072, B:30:0x007a, B:32:0x0082, B:34:0x008a, B:36:0x0092, B:38:0x009a, B:40:0x00a2, B:44:0x00ae, B:46:0x00b6, B:48:0x00be, B:50:0x00c6, B:144:0x022a, B:147:0x0232, B:149:0x0238, B:150:0x0252, B:151:0x0273, B:53:0x00d0, B:54:0x00d3, B:56:0x00db, B:59:0x00e6, B:61:0x00ee, B:66:0x00fc, B:68:0x0104, B:71:0x010f, B:73:0x0117, B:76:0x0122, B:78:0x012a, B:81:0x0135, B:83:0x013d), top: B:166:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0135 A[Catch: Exception -> 0x0033, TryCatch #5 {Exception -> 0x0033, blocks: (B:3:0x0008, B:5:0x001c, B:7:0x0026, B:12:0x0036, B:16:0x0044, B:20:0x004e, B:22:0x0056, B:24:0x005e, B:26:0x0068, B:28:0x0072, B:30:0x007a, B:32:0x0082, B:34:0x008a, B:36:0x0092, B:38:0x009a, B:40:0x00a2, B:44:0x00ae, B:46:0x00b6, B:48:0x00be, B:50:0x00c6, B:144:0x022a, B:147:0x0232, B:149:0x0238, B:150:0x0252, B:151:0x0273, B:53:0x00d0, B:54:0x00d3, B:56:0x00db, B:59:0x00e6, B:61:0x00ee, B:66:0x00fc, B:68:0x0104, B:71:0x010f, B:73:0x0117, B:76:0x0122, B:78:0x012a, B:81:0x0135, B:83:0x013d), top: B:166:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x013d A[Catch: Exception -> 0x0033, TryCatch #5 {Exception -> 0x0033, blocks: (B:3:0x0008, B:5:0x001c, B:7:0x0026, B:12:0x0036, B:16:0x0044, B:20:0x004e, B:22:0x0056, B:24:0x005e, B:26:0x0068, B:28:0x0072, B:30:0x007a, B:32:0x0082, B:34:0x008a, B:36:0x0092, B:38:0x009a, B:40:0x00a2, B:44:0x00ae, B:46:0x00b6, B:48:0x00be, B:50:0x00c6, B:144:0x022a, B:147:0x0232, B:149:0x0238, B:150:0x0252, B:151:0x0273, B:53:0x00d0, B:54:0x00d3, B:56:0x00db, B:59:0x00e6, B:61:0x00ee, B:66:0x00fc, B:68:0x0104, B:71:0x010f, B:73:0x0117, B:76:0x0122, B:78:0x012a, B:81:0x0135, B:83:0x013d), top: B:166:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0159 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x015b  */
    /* JADX WARN: Code duplicated, block: B:91:0x015c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x015e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0160 A[Catch: Exception -> 0x017f, TryCatch #0 {Exception -> 0x017f, blocks: (B:87:0x0149, B:93:0x0160, B:99:0x0174, B:101:0x017a, B:108:0x0191, B:110:0x0199, B:120:0x01c3, B:111:0x019e, B:113:0x01ae, B:115:0x01b6, B:104:0x0188), top: B:156:0x0149 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x016e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x0170  */
    /* JADX WARN: Code duplicated, block: B:97:0x0171 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x0173  */
    /* JADX WARN: Code duplicated, block: B:9:0x002c  */
    private static ArrayList zzg(zzst zzstVar, zzsv zzsvVar) throws zzsu {
        String[] supportedTypes;
        int length;
        int i;
        String str;
        String str2;
        int i2;
        int i3;
        String str3;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        boolean zZzd;
        boolean zZzc;
        boolean zZzd2;
        boolean zZzc2;
        int i4;
        boolean zIsHardwareAccelerated;
        boolean zZzi;
        String strZza;
        boolean zIsVendor;
        String str4;
        zzst zzstVar2 = zzstVar;
        try {
            ArrayList arrayList = new ArrayList();
            String str5 = zzstVar2.zza;
            boolean zZze = zzsvVar.zze();
            int i5 = 0;
            for (int iZza = zzsvVar.zza(); i5 < iZza; iZza = i3) {
                MediaCodecInfo mediaCodecInfoZzb = zzsvVar.zzb(i5);
                int i6 = zzei.zza;
                if (i6 < 29 || !mediaCodecInfoZzb.isAlias()) {
                    String name = mediaCodecInfoZzb.getName();
                    if (mediaCodecInfoZzb.isEncoder() || (!zZze && name.endsWith(".secure"))) {
                        i2 = i5;
                        i3 = iZza;
                        str3 = str5;
                    } else if (i6 < 24 && (("OMX.SEC.aac.dec".equals(name) || "OMX.Exynos.AAC.Decoder".equals(name)) && "samsung".equals(zzei.zzc))) {
                        String str6 = zzei.zzb;
                        if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                            i2 = i5;
                            i3 = iZza;
                            str3 = str5;
                        } else if (i6 > 23) {
                            supportedTypes = mediaCodecInfoZzb.getSupportedTypes();
                            length = supportedTypes.length;
                            i = 0;
                            while (true) {
                                if (i >= length) {
                                    if (!str5.equals("video/dolby-vision")) {
                                        if (!str5.equals("video/mv-hevc")) {
                                            if (!str5.equals(MimeTypes.AUDIO_ALAC)) {
                                                if (!str5.equals(MimeTypes.AUDIO_FLAC)) {
                                                    if (!str5.equals(MimeTypes.AUDIO_AC3)) {
                                                        str = null;
                                                        break;
                                                    }
                                                    str = null;
                                                    break;
                                                }
                                                if (!str5.equals(MimeTypes.AUDIO_AC3)) {
                                                    str = null;
                                                    break;
                                                }
                                                str = null;
                                                break;
                                            }
                                            if (!str5.equals(MimeTypes.AUDIO_FLAC)) {
                                                if (!str5.equals(MimeTypes.AUDIO_AC3)) {
                                                    str = null;
                                                    break;
                                                }
                                                str = null;
                                                break;
                                            }
                                            if (!str5.equals(MimeTypes.AUDIO_AC3)) {
                                                str = null;
                                                break;
                                            }
                                            str = null;
                                            break;
                                        }
                                        if (!"c2.qti.mvhevc.decoder".equals(name)) {
                                            str = null;
                                            break;
                                        }
                                        str = "video/x-mvhevc";
                                        break;
                                    }
                                    if (!"OMX.MS.HEVCDV.Decoder".equals(name)) {
                                        if ("OMX.RTK.video.decoder".equals(name)) {
                                        }
                                        str = "video/dv_hevc";
                                        break;
                                    }
                                    str = "video/hevcdv";
                                    break;
                                }
                                str = supportedTypes[i];
                                if (str.equalsIgnoreCase(str5)) {
                                    break;
                                    break;
                                }
                                i++;
                            }
                            if (str != null) {
                                capabilitiesForType = mediaCodecInfoZzb.getCapabilitiesForType(str);
                                zZzd = zzsvVar.zzd("tunneled-playback", str, capabilitiesForType);
                                zZzc = zzsvVar.zzc("tunneled-playback", str, capabilitiesForType);
                                if (zzstVar2.zzc) {
                                    if (zZzd) {
                                        zZzd2 = zzsvVar.zzd("secure-playback", str, capabilitiesForType);
                                        zZzc2 = zzsvVar.zzc("secure-playback", str, capabilitiesForType);
                                        if (zzstVar2.zzb) {
                                            if (zZzd2) {
                                                zZzd2 = true;
                                                i4 = zzei.zza;
                                                if (i4 >= 29) {
                                                    zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                                } else if (zzi(mediaCodecInfoZzb, str5)) {
                                                    zIsHardwareAccelerated = false;
                                                } else {
                                                    zIsHardwareAccelerated = true;
                                                }
                                                zZzi = zzi(mediaCodecInfoZzb, str5);
                                                if (i4 >= 29) {
                                                    zIsVendor = mediaCodecInfoZzb.isVendor();
                                                } else {
                                                    strZza = zzftt.zza(mediaCodecInfoZzb.getName());
                                                    if (strZza.startsWith("omx.google.")) {
                                                        zIsVendor = false;
                                                    } else {
                                                        zIsVendor = false;
                                                    }
                                                }
                                                if (zZze) {
                                                    if (!zZze) {
                                                        if (!zzstVar2.zzb) {
                                                            str4 = name;
                                                            i2 = i5;
                                                            i3 = iZza;
                                                            str3 = str5;
                                                            arrayList.add(zzsg.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                        }
                                                    }
                                                    str4 = name;
                                                    i2 = i5;
                                                    i3 = iZza;
                                                    str3 = str5;
                                                    if (zZze) {
                                                        continue;
                                                    }
                                                } else {
                                                    if (!zZze) {
                                                        if (!zzstVar2.zzb) {
                                                            str4 = name;
                                                            i2 = i5;
                                                            i3 = iZza;
                                                            str3 = str5;
                                                            arrayList.add(zzsg.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                        }
                                                    }
                                                    str4 = name;
                                                    i2 = i5;
                                                    i3 = iZza;
                                                    str3 = str5;
                                                    if (zZze) {
                                                        continue;
                                                    }
                                                }
                                            }
                                        } else if (!zZzc2) {
                                            i4 = zzei.zza;
                                            if (i4 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                            } else if (zzi(mediaCodecInfoZzb, str5)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                            zZzi = zzi(mediaCodecInfoZzb, str5);
                                            if (i4 >= 29) {
                                                zIsVendor = mediaCodecInfoZzb.isVendor();
                                            } else {
                                                strZza = zzftt.zza(mediaCodecInfoZzb.getName());
                                                if (strZza.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (zZze) {
                                                if (!zZze) {
                                                    if (!zzstVar2.zzb) {
                                                        str4 = name;
                                                        i2 = i5;
                                                        i3 = iZza;
                                                        str3 = str5;
                                                        arrayList.add(zzsg.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                    }
                                                }
                                                str4 = name;
                                                i2 = i5;
                                                i3 = iZza;
                                                str3 = str5;
                                                if (zZze) {
                                                    continue;
                                                }
                                            } else {
                                                if (!zZze) {
                                                    if (!zzstVar2.zzb) {
                                                        str4 = name;
                                                        i2 = i5;
                                                        i3 = iZza;
                                                        str3 = str5;
                                                        arrayList.add(zzsg.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                    }
                                                }
                                                str4 = name;
                                                i2 = i5;
                                                i3 = iZza;
                                                str3 = str5;
                                                if (zZze) {
                                                    continue;
                                                }
                                            }
                                        }
                                    }
                                } else if (!zZzc) {
                                    zZzd2 = zzsvVar.zzd("secure-playback", str, capabilitiesForType);
                                    zZzc2 = zzsvVar.zzc("secure-playback", str, capabilitiesForType);
                                    if (zzstVar2.zzb) {
                                        if (!zZzc2) {
                                            i4 = zzei.zza;
                                            if (i4 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                            } else if (zzi(mediaCodecInfoZzb, str5)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                            zZzi = zzi(mediaCodecInfoZzb, str5);
                                            if (i4 >= 29) {
                                                zIsVendor = mediaCodecInfoZzb.isVendor();
                                            } else {
                                                strZza = zzftt.zza(mediaCodecInfoZzb.getName());
                                                if (strZza.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (zZze) {
                                                if (!zZze) {
                                                    if (!zzstVar2.zzb) {
                                                        str4 = name;
                                                        i2 = i5;
                                                        i3 = iZza;
                                                        str3 = str5;
                                                        arrayList.add(zzsg.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                    }
                                                }
                                                str4 = name;
                                                i2 = i5;
                                                i3 = iZza;
                                                str3 = str5;
                                                if (zZze) {
                                                    continue;
                                                }
                                            } else {
                                                if (!zZze) {
                                                    if (!zzstVar2.zzb) {
                                                        str4 = name;
                                                        i2 = i5;
                                                        i3 = iZza;
                                                        str3 = str5;
                                                        arrayList.add(zzsg.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                    }
                                                }
                                                str4 = name;
                                                i2 = i5;
                                                i3 = iZza;
                                                str3 = str5;
                                                if (zZze) {
                                                    continue;
                                                }
                                            }
                                        }
                                    } else if (zZzd2) {
                                        zZzd2 = true;
                                        i4 = zzei.zza;
                                        if (i4 >= 29) {
                                            zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                        } else if (zzi(mediaCodecInfoZzb, str5)) {
                                            zIsHardwareAccelerated = true;
                                        } else {
                                            zIsHardwareAccelerated = false;
                                        }
                                        zZzi = zzi(mediaCodecInfoZzb, str5);
                                        if (i4 >= 29) {
                                            zIsVendor = mediaCodecInfoZzb.isVendor();
                                        } else {
                                            strZza = zzftt.zza(mediaCodecInfoZzb.getName());
                                            if (strZza.startsWith("omx.google.")) {
                                                zIsVendor = false;
                                            } else {
                                                zIsVendor = false;
                                            }
                                        }
                                        if (zZze) {
                                            if (!zZze) {
                                                if (!zzstVar2.zzb) {
                                                    str4 = name;
                                                    i2 = i5;
                                                    i3 = iZza;
                                                    str3 = str5;
                                                    arrayList.add(zzsg.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                }
                                            }
                                            str4 = name;
                                            i2 = i5;
                                            i3 = iZza;
                                            str3 = str5;
                                            if (zZze) {
                                                continue;
                                            }
                                        } else {
                                            if (!zZze) {
                                                if (!zzstVar2.zzb) {
                                                    str4 = name;
                                                    i2 = i5;
                                                    i3 = iZza;
                                                    str3 = str5;
                                                    arrayList.add(zzsg.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                }
                                            }
                                            str4 = name;
                                            i2 = i5;
                                            i3 = iZza;
                                            str3 = str5;
                                            if (zZze) {
                                                continue;
                                            }
                                        }
                                    }
                                }
                                i2 = i5;
                                i3 = iZza;
                                str3 = str5;
                            } else {
                                i2 = i5;
                                i3 = iZza;
                                str3 = str5;
                            }
                        } else {
                            supportedTypes = mediaCodecInfoZzb.getSupportedTypes();
                            length = supportedTypes.length;
                            i = 0;
                            while (true) {
                                if (i >= length) {
                                    if (!str5.equals("video/dolby-vision")) {
                                        if (!str5.equals("video/mv-hevc")) {
                                            if (!str5.equals(MimeTypes.AUDIO_ALAC)) {
                                                if (!str5.equals(MimeTypes.AUDIO_FLAC)) {
                                                    if (!str5.equals(MimeTypes.AUDIO_AC3)) {
                                                        str = null;
                                                        break;
                                                    }
                                                    str = null;
                                                    break;
                                                }
                                                if (!str5.equals(MimeTypes.AUDIO_AC3)) {
                                                    str = null;
                                                    break;
                                                }
                                                str = null;
                                                break;
                                            }
                                            if (!str5.equals(MimeTypes.AUDIO_FLAC)) {
                                                if (!str5.equals(MimeTypes.AUDIO_AC3)) {
                                                    str = null;
                                                    break;
                                                }
                                                str = null;
                                                break;
                                            }
                                            if (!str5.equals(MimeTypes.AUDIO_AC3)) {
                                                str = null;
                                                break;
                                            }
                                            str = null;
                                            break;
                                        }
                                        if (!"c2.qti.mvhevc.decoder".equals(name)) {
                                            str = null;
                                            break;
                                        }
                                        str = "video/x-mvhevc";
                                        break;
                                    }
                                    if (!"OMX.MS.HEVCDV.Decoder".equals(name)) {
                                        if ("OMX.RTK.video.decoder".equals(name)) {
                                        }
                                        str = "video/dv_hevc";
                                        break;
                                    }
                                    str = "video/hevcdv";
                                    break;
                                }
                                str = supportedTypes[i];
                                if (str.equalsIgnoreCase(str5)) {
                                    break;
                                    break;
                                }
                                i++;
                            }
                            if (str != null) {
                                capabilitiesForType = mediaCodecInfoZzb.getCapabilitiesForType(str);
                                zZzd = zzsvVar.zzd("tunneled-playback", str, capabilitiesForType);
                                zZzc = zzsvVar.zzc("tunneled-playback", str, capabilitiesForType);
                                if (zzstVar2.zzc) {
                                    if (!zZzc) {
                                        zZzd2 = zzsvVar.zzd("secure-playback", str, capabilitiesForType);
                                        zZzc2 = zzsvVar.zzc("secure-playback", str, capabilitiesForType);
                                        if (zzstVar2.zzb) {
                                            if (!zZzc2) {
                                                i4 = zzei.zza;
                                                if (i4 >= 29) {
                                                    zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                                } else if (zzi(mediaCodecInfoZzb, str5)) {
                                                    zIsHardwareAccelerated = true;
                                                } else {
                                                    zIsHardwareAccelerated = false;
                                                }
                                                zZzi = zzi(mediaCodecInfoZzb, str5);
                                                if (i4 >= 29) {
                                                    zIsVendor = mediaCodecInfoZzb.isVendor();
                                                } else {
                                                    strZza = zzftt.zza(mediaCodecInfoZzb.getName());
                                                    if (strZza.startsWith("omx.google.")) {
                                                        zIsVendor = false;
                                                    } else {
                                                        zIsVendor = false;
                                                    }
                                                }
                                                if (zZze) {
                                                    if (!zZze) {
                                                        if (!zzstVar2.zzb) {
                                                            str4 = name;
                                                            i2 = i5;
                                                            i3 = iZza;
                                                            str3 = str5;
                                                            arrayList.add(zzsg.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                        }
                                                    }
                                                    str4 = name;
                                                    i2 = i5;
                                                    i3 = iZza;
                                                    str3 = str5;
                                                    if (zZze) {
                                                        continue;
                                                    }
                                                } else {
                                                    if (!zZze) {
                                                        if (!zzstVar2.zzb) {
                                                            str4 = name;
                                                            i2 = i5;
                                                            i3 = iZza;
                                                            str3 = str5;
                                                            arrayList.add(zzsg.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                        }
                                                    }
                                                    str4 = name;
                                                    i2 = i5;
                                                    i3 = iZza;
                                                    str3 = str5;
                                                    if (zZze) {
                                                        continue;
                                                    }
                                                }
                                            }
                                        } else if (zZzd2) {
                                            zZzd2 = true;
                                            i4 = zzei.zza;
                                            if (i4 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                            } else if (zzi(mediaCodecInfoZzb, str5)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                            zZzi = zzi(mediaCodecInfoZzb, str5);
                                            if (i4 >= 29) {
                                                zIsVendor = mediaCodecInfoZzb.isVendor();
                                            } else {
                                                strZza = zzftt.zza(mediaCodecInfoZzb.getName());
                                                if (strZza.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (zZze) {
                                                if (!zZze) {
                                                    if (!zzstVar2.zzb) {
                                                        str4 = name;
                                                        i2 = i5;
                                                        i3 = iZza;
                                                        str3 = str5;
                                                        arrayList.add(zzsg.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                    }
                                                }
                                                str4 = name;
                                                i2 = i5;
                                                i3 = iZza;
                                                str3 = str5;
                                                if (zZze) {
                                                    continue;
                                                }
                                            } else {
                                                if (!zZze) {
                                                    if (!zzstVar2.zzb) {
                                                        str4 = name;
                                                        i2 = i5;
                                                        i3 = iZza;
                                                        str3 = str5;
                                                        arrayList.add(zzsg.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                    }
                                                }
                                                str4 = name;
                                                i2 = i5;
                                                i3 = iZza;
                                                str3 = str5;
                                                if (zZze) {
                                                    continue;
                                                }
                                            }
                                        }
                                    }
                                } else if (zZzd) {
                                    zZzd2 = zzsvVar.zzd("secure-playback", str, capabilitiesForType);
                                    zZzc2 = zzsvVar.zzc("secure-playback", str, capabilitiesForType);
                                    if (zzstVar2.zzb) {
                                        if (!zZzc2) {
                                            i4 = zzei.zza;
                                            if (i4 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                            } else if (zzi(mediaCodecInfoZzb, str5)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                            zZzi = zzi(mediaCodecInfoZzb, str5);
                                            if (i4 >= 29) {
                                                zIsVendor = mediaCodecInfoZzb.isVendor();
                                            } else {
                                                strZza = zzftt.zza(mediaCodecInfoZzb.getName());
                                                if (strZza.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (zZze) {
                                                if (!zZze) {
                                                    if (!zzstVar2.zzb) {
                                                        str4 = name;
                                                        i2 = i5;
                                                        i3 = iZza;
                                                        str3 = str5;
                                                        arrayList.add(zzsg.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                    }
                                                }
                                                str4 = name;
                                                i2 = i5;
                                                i3 = iZza;
                                                str3 = str5;
                                                if (zZze) {
                                                    continue;
                                                }
                                            } else {
                                                if (!zZze) {
                                                    if (!zzstVar2.zzb) {
                                                        str4 = name;
                                                        i2 = i5;
                                                        i3 = iZza;
                                                        str3 = str5;
                                                        arrayList.add(zzsg.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                    }
                                                }
                                                str4 = name;
                                                i2 = i5;
                                                i3 = iZza;
                                                str3 = str5;
                                                if (zZze) {
                                                    continue;
                                                }
                                            }
                                        }
                                    } else if (zZzd2) {
                                        zZzd2 = true;
                                        i4 = zzei.zza;
                                        if (i4 >= 29) {
                                            zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                        } else if (zzi(mediaCodecInfoZzb, str5)) {
                                            zIsHardwareAccelerated = true;
                                        } else {
                                            zIsHardwareAccelerated = false;
                                        }
                                        zZzi = zzi(mediaCodecInfoZzb, str5);
                                        if (i4 >= 29) {
                                            zIsVendor = mediaCodecInfoZzb.isVendor();
                                        } else {
                                            strZza = zzftt.zza(mediaCodecInfoZzb.getName());
                                            if (strZza.startsWith("omx.google.")) {
                                                zIsVendor = false;
                                            } else {
                                                zIsVendor = false;
                                            }
                                        }
                                        if (zZze) {
                                            if (!zZze) {
                                                if (!zzstVar2.zzb) {
                                                    str4 = name;
                                                    i2 = i5;
                                                    i3 = iZza;
                                                    str3 = str5;
                                                    arrayList.add(zzsg.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                }
                                            }
                                            str4 = name;
                                            i2 = i5;
                                            i3 = iZza;
                                            str3 = str5;
                                            if (zZze) {
                                                continue;
                                            }
                                        } else {
                                            if (!zZze) {
                                                if (!zzstVar2.zzb) {
                                                    str4 = name;
                                                    i2 = i5;
                                                    i3 = iZza;
                                                    str3 = str5;
                                                    arrayList.add(zzsg.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                }
                                            }
                                            str4 = name;
                                            i2 = i5;
                                            i3 = iZza;
                                            str3 = str5;
                                            if (zZze) {
                                                continue;
                                            }
                                        }
                                    }
                                }
                                i2 = i5;
                                i3 = iZza;
                                str3 = str5;
                            } else {
                                i2 = i5;
                                i3 = iZza;
                                str3 = str5;
                            }
                        }
                    } else if (i6 > 23 && MimeTypes.AUDIO_E_AC3_JOC.equals(str5) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(name)) {
                        i2 = i5;
                        i3 = iZza;
                        str3 = str5;
                    } else {
                        supportedTypes = mediaCodecInfoZzb.getSupportedTypes();
                        length = supportedTypes.length;
                        i = 0;
                        while (true) {
                            if (i >= length) {
                                if (!str5.equals("video/dolby-vision")) {
                                    if (!str5.equals("video/mv-hevc")) {
                                        if (!str5.equals(MimeTypes.AUDIO_ALAC) && "OMX.lge.alac.decoder".equals(name)) {
                                            str = "audio/x-lg-alac";
                                            break;
                                        }
                                        if (!str5.equals(MimeTypes.AUDIO_FLAC) && "OMX.lge.flac.decoder".equals(name)) {
                                            str = "audio/x-lg-flac";
                                            break;
                                        }
                                        if (!str5.equals(MimeTypes.AUDIO_AC3) && "OMX.lge.ac3.decoder".equals(name)) {
                                            str = "audio/lg-ac3";
                                            break;
                                        }
                                        str = null;
                                        break;
                                    }
                                    if (!"c2.qti.mvhevc.decoder".equals(name)) {
                                        str = null;
                                        break;
                                    }
                                    str = "video/x-mvhevc";
                                    break;
                                }
                                if (!"OMX.MS.HEVCDV.Decoder".equals(name)) {
                                    if ("OMX.RTK.video.decoder".equals(name) && !"OMX.realtek.video.decoder.tunneled".equals(name)) {
                                        str = null;
                                        break;
                                    }
                                    str = "video/dv_hevc";
                                    break;
                                }
                                str = "video/hevcdv";
                                break;
                            }
                            str = supportedTypes[i];
                            if (str.equalsIgnoreCase(str5)) {
                                break;
                            }
                            i++;
                        }
                        if (str != null) {
                            try {
                                capabilitiesForType = mediaCodecInfoZzb.getCapabilitiesForType(str);
                                zZzd = zzsvVar.zzd("tunneled-playback", str, capabilitiesForType);
                                zZzc = zzsvVar.zzc("tunneled-playback", str, capabilitiesForType);
                                if (zzstVar2.zzc) {
                                    if (!zZzc) {
                                        zZzd2 = zzsvVar.zzd("secure-playback", str, capabilitiesForType);
                                        zZzc2 = zzsvVar.zzc("secure-playback", str, capabilitiesForType);
                                        if (zzstVar2.zzb) {
                                            if (!zZzc2) {
                                                i4 = zzei.zza;
                                                if (i4 >= 29) {
                                                    zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                                } else if (zzi(mediaCodecInfoZzb, str5)) {
                                                    zIsHardwareAccelerated = true;
                                                } else {
                                                    zIsHardwareAccelerated = false;
                                                }
                                                zZzi = zzi(mediaCodecInfoZzb, str5);
                                                if (i4 >= 29) {
                                                    zIsVendor = mediaCodecInfoZzb.isVendor();
                                                } else {
                                                    strZza = zzftt.zza(mediaCodecInfoZzb.getName());
                                                    if (strZza.startsWith("omx.google.") || strZza.startsWith("c2.android.") || strZza.startsWith("c2.google.")) {
                                                        zIsVendor = false;
                                                    } else {
                                                        zIsVendor = true;
                                                    }
                                                }
                                                if (zZze || zzstVar2.zzb != zZzd2) {
                                                    if (!zZze) {
                                                        try {
                                                            if (!zzstVar2.zzb) {
                                                                str4 = name;
                                                                i2 = i5;
                                                                i3 = iZza;
                                                                str3 = str5;
                                                                try {
                                                                    arrayList.add(zzsg.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                                } catch (Exception e) {
                                                                    e = e;
                                                                    str2 = str4;
                                                                    if (zzei.zza <= 23 || arrayList.isEmpty()) {
                                                                        zzdo.zzc("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                                        throw e;
                                                                    }
                                                                    zzdo.zzc("MediaCodecUtil", "Skipping codec " + str2 + " (failed to query capabilities)");
                                                                }
                                                            }
                                                        } catch (Exception e2) {
                                                            e = e2;
                                                            str4 = name;
                                                            i2 = i5;
                                                            i3 = iZza;
                                                            str3 = str5;
                                                            str2 = str4;
                                                            if (zzei.zza <= 23) {
                                                            }
                                                            zzdo.zzc("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                            throw e;
                                                        }
                                                    }
                                                    str4 = name;
                                                    i2 = i5;
                                                    i3 = iZza;
                                                    str3 = str5;
                                                    if (zZze && zZzd2) {
                                                        StringBuilder sb = new StringBuilder();
                                                        try {
                                                            sb.append(str4);
                                                            sb.append(".secure");
                                                            str2 = str4;
                                                            try {
                                                                arrayList.add(zzsg.zzc(sb.toString(), str3, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, true));
                                                                break;
                                                            } catch (Exception e3) {
                                                                e = e3;
                                                                if (zzei.zza <= 23) {
                                                                }
                                                                zzdo.zzc("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                                throw e;
                                                            }
                                                        } catch (Exception e4) {
                                                            e = e4;
                                                            str2 = str4;
                                                        }
                                                    }
                                                } else {
                                                    str4 = name;
                                                    i2 = i5;
                                                    i3 = iZza;
                                                    str3 = str5;
                                                    arrayList.add(zzsg.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                }
                                            }
                                        } else if (zZzd2) {
                                            zZzd2 = true;
                                            i4 = zzei.zza;
                                            if (i4 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                            } else if (zzi(mediaCodecInfoZzb, str5)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                            zZzi = zzi(mediaCodecInfoZzb, str5);
                                            if (i4 >= 29) {
                                                zIsVendor = mediaCodecInfoZzb.isVendor();
                                            } else {
                                                strZza = zzftt.zza(mediaCodecInfoZzb.getName());
                                                if (strZza.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (zZze) {
                                                if (!zZze) {
                                                    if (!zzstVar2.zzb) {
                                                        str4 = name;
                                                        i2 = i5;
                                                        i3 = iZza;
                                                        str3 = str5;
                                                        arrayList.add(zzsg.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                    }
                                                }
                                                str4 = name;
                                                i2 = i5;
                                                i3 = iZza;
                                                str3 = str5;
                                                if (zZze) {
                                                    continue;
                                                }
                                            } else {
                                                if (!zZze) {
                                                    if (!zzstVar2.zzb) {
                                                        str4 = name;
                                                        i2 = i5;
                                                        i3 = iZza;
                                                        str3 = str5;
                                                        arrayList.add(zzsg.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                    }
                                                }
                                                str4 = name;
                                                i2 = i5;
                                                i3 = iZza;
                                                str3 = str5;
                                                if (zZze) {
                                                    continue;
                                                }
                                            }
                                        }
                                    }
                                } else if (zZzd) {
                                    zZzd2 = zzsvVar.zzd("secure-playback", str, capabilitiesForType);
                                    zZzc2 = zzsvVar.zzc("secure-playback", str, capabilitiesForType);
                                    if (zzstVar2.zzb) {
                                        if (!zZzc2) {
                                            i4 = zzei.zza;
                                            if (i4 >= 29) {
                                                zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                            } else if (zzi(mediaCodecInfoZzb, str5)) {
                                                zIsHardwareAccelerated = true;
                                            } else {
                                                zIsHardwareAccelerated = false;
                                            }
                                            zZzi = zzi(mediaCodecInfoZzb, str5);
                                            if (i4 >= 29) {
                                                zIsVendor = mediaCodecInfoZzb.isVendor();
                                            } else {
                                                strZza = zzftt.zza(mediaCodecInfoZzb.getName());
                                                if (strZza.startsWith("omx.google.")) {
                                                    zIsVendor = false;
                                                } else {
                                                    zIsVendor = false;
                                                }
                                            }
                                            if (zZze) {
                                                if (!zZze) {
                                                    if (!zzstVar2.zzb) {
                                                        str4 = name;
                                                        i2 = i5;
                                                        i3 = iZza;
                                                        str3 = str5;
                                                        arrayList.add(zzsg.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                    }
                                                }
                                                str4 = name;
                                                i2 = i5;
                                                i3 = iZza;
                                                str3 = str5;
                                                if (zZze) {
                                                    continue;
                                                }
                                            } else {
                                                if (!zZze) {
                                                    if (!zzstVar2.zzb) {
                                                        str4 = name;
                                                        i2 = i5;
                                                        i3 = iZza;
                                                        str3 = str5;
                                                        arrayList.add(zzsg.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                    }
                                                }
                                                str4 = name;
                                                i2 = i5;
                                                i3 = iZza;
                                                str3 = str5;
                                                if (zZze) {
                                                    continue;
                                                }
                                            }
                                        }
                                    } else if (zZzd2) {
                                        zZzd2 = true;
                                        i4 = zzei.zza;
                                        if (i4 >= 29) {
                                            zIsHardwareAccelerated = mediaCodecInfoZzb.isHardwareAccelerated();
                                        } else if (zzi(mediaCodecInfoZzb, str5)) {
                                            zIsHardwareAccelerated = true;
                                        } else {
                                            zIsHardwareAccelerated = false;
                                        }
                                        zZzi = zzi(mediaCodecInfoZzb, str5);
                                        if (i4 >= 29) {
                                            zIsVendor = mediaCodecInfoZzb.isVendor();
                                        } else {
                                            strZza = zzftt.zza(mediaCodecInfoZzb.getName());
                                            if (strZza.startsWith("omx.google.")) {
                                                zIsVendor = false;
                                            } else {
                                                zIsVendor = false;
                                            }
                                        }
                                        if (zZze) {
                                            if (!zZze) {
                                                if (!zzstVar2.zzb) {
                                                    str4 = name;
                                                    i2 = i5;
                                                    i3 = iZza;
                                                    str3 = str5;
                                                    arrayList.add(zzsg.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                }
                                            }
                                            str4 = name;
                                            i2 = i5;
                                            i3 = iZza;
                                            str3 = str5;
                                            if (zZze) {
                                                continue;
                                            }
                                        } else {
                                            if (!zZze) {
                                                if (!zzstVar2.zzb) {
                                                    str4 = name;
                                                    i2 = i5;
                                                    i3 = iZza;
                                                    str3 = str5;
                                                    arrayList.add(zzsg.zzc(name, str5, str, capabilitiesForType, zIsHardwareAccelerated, zZzi, zIsVendor, false, false));
                                                }
                                            }
                                            str4 = name;
                                            i2 = i5;
                                            i3 = iZza;
                                            str3 = str5;
                                            if (zZze) {
                                                continue;
                                            }
                                        }
                                    }
                                }
                                i2 = i5;
                                i3 = iZza;
                                str3 = str5;
                            } catch (Exception e5) {
                                e = e5;
                                str2 = name;
                                i2 = i5;
                                i3 = iZza;
                                str3 = str5;
                            }
                        } else {
                            i2 = i5;
                            i3 = iZza;
                            str3 = str5;
                        }
                    }
                } else {
                    i2 = i5;
                    i3 = iZza;
                    str3 = str5;
                }
                i5 = i2 + 1;
                zzstVar2 = zzstVar;
                str5 = str3;
            }
            return arrayList;
        } catch (Exception e6) {
            throw new zzsu(e6, null);
        }
    }

    private static void zzh(List list, final zzsy zzsyVar) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzsq
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int i = zzta.zza;
                zzsy zzsyVar2 = zzsyVar;
                return zzsyVar2.zza(obj2) - zzsyVar2.zza(obj);
            }
        });
    }

    private static boolean zzi(MediaCodecInfo mediaCodecInfo, String str) {
        if (zzei.zza >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (zzbb.zzg(str)) {
            return true;
        }
        String strZza = zzftt.zza(mediaCodecInfo.getName());
        if (strZza.startsWith("arc.")) {
            return false;
        }
        if (strZza.startsWith("omx.google.") || strZza.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strZza.startsWith("omx.sec.") && strZza.contains(".sw.")) || strZza.equals("omx.qcom.video.decoder.hevcswvdec") || strZza.startsWith("c2.android.") || strZza.startsWith("c2.google.")) {
            return true;
        }
        return (strZza.startsWith("omx.") || strZza.startsWith("c2.")) ? false : true;
    }
}
