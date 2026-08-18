package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.umeng.analytics.pro.cw;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzach implements zzacs {
    private static final int[] zza = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    private static final zzacg zzb = new zzacg(new zzacf() { // from class: com.google.android.gms.internal.ads.zzacd
        @Override // com.google.android.gms.internal.ads.zzacf
        public final Constructor zza() {
            if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(zzacn.class).getConstructor(Integer.TYPE);
            }
            return null;
        }
    });
    private static final zzacg zzc = new zzacg(new zzacf() { // from class: com.google.android.gms.internal.ads.zzace
        @Override // com.google.android.gms.internal.ads.zzacf
        public final Constructor zza() {
            return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(zzacn.class).getConstructor(new Class[0]);
        }
    });

    @Nullable
    private zzfxn zzd;
    private final zzakd zze = new zzajy();

    private final void zzb(int i, List list) {
        switch (i) {
            case 0:
                list.add(new zzama());
                break;
            case 1:
                list.add(new zzamc());
                break;
            case 2:
                list.add(new zzame(0));
                break;
            case 3:
                list.add(new zzaea(0));
                break;
            case 4:
                zzacn zzacnVarZza = zzb.zza(0);
                if (zzacnVarZza == null) {
                    list.add(new zzaes(0));
                } else {
                    list.add(zzacnVarZza);
                }
                break;
            case 5:
                list.add(new zzaeu());
                break;
            case 6:
                list.add(new zzahm(this.zze, 0));
                break;
            case 7:
                list.add(new zzahs(0));
                break;
            case 8:
                list.add(new zzaiq(this.zze, 0, null, null, zzfxn.zzn(), null));
                list.add(new zzaiv(this.zze, 0));
                break;
            case 9:
                list.add(new zzajl());
                break;
            case 10:
                list.add(new zzanj());
                break;
            case 11:
                if (this.zzd == null) {
                    this.zzd = zzfxn.zzn();
                }
                list.add(new zzant(1, 0, this.zze, new zzef(0L), new zzamg(0, this.zzd), 112800));
                break;
            case 12:
                list.add(new zzaoe());
                break;
            case 14:
                list.add(new zzafa(0));
                break;
            case 15:
                zzacn zzacnVarZza2 = zzc.zza(new Object[0]);
                if (zzacnVarZza2 != null) {
                    list.add(zzacnVarZza2);
                }
                break;
            case 16:
                list.add(new zzaef(0, this.zze));
                break;
            case 17:
                list.add(new zzajw());
                break;
            case 18:
                list.add(new zzaoj());
                break;
            case 19:
                list.add(new zzaen());
                break;
            case 20:
                list.add(new zzaez());
                break;
            case 21:
                list.add(new zzaem());
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:142:0x0210  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.zzacs
    public final synchronized zzacn[] zza(Uri uri, Map map) {
        ArrayList arrayList;
        byte b;
        int i;
        int i2;
        try {
            arrayList = new ArrayList(21);
            List list = (List) map.get("Content-Type");
            String str = (list == null || list.isEmpty()) ? null : (String) list.get(0);
            if (str != null) {
                String strZze = zzbb.zze(str);
                switch (strZze.hashCode()) {
                    case -2123537834:
                        if (strZze.equals(MimeTypes.AUDIO_E_AC3_JOC)) {
                            b = 2;
                        } else {
                            b = -1;
                        }
                        break;
                    case -1662384011:
                        if (strZze.equals("video/mp2p")) {
                            b = 20;
                        } else {
                            b = -1;
                        }
                        break;
                    case -1662384007:
                        if (strZze.equals("video/mp2t")) {
                            b = 21;
                        } else {
                            b = -1;
                        }
                        break;
                    case -1662095187:
                        if (strZze.equals("video/webm")) {
                            b = 12;
                        } else {
                            b = -1;
                        }
                        break;
                    case -1606874997:
                        if (strZze.equals(MimeTypes.AUDIO_AMR_WB)) {
                            b = 6;
                        } else {
                            b = -1;
                        }
                        break;
                    case -1487656890:
                        if (strZze.equals("image/avif")) {
                            b = 31;
                        } else {
                            b = -1;
                        }
                        break;
                    case -1487464693:
                        if (strZze.equals("image/heic")) {
                            b = 30;
                        } else {
                            b = -1;
                        }
                        break;
                    case -1487464690:
                        if (strZze.equals("image/heif")) {
                            b = 29;
                        } else {
                            b = -1;
                        }
                        break;
                    case -1487394660:
                        if (strZze.equals("image/jpeg")) {
                            b = 24;
                        } else {
                            b = -1;
                        }
                        break;
                    case -1487018032:
                        if (strZze.equals("image/webp")) {
                            b = 27;
                        } else {
                            b = -1;
                        }
                        break;
                    case -1248337486:
                        if (strZze.equals(MimeTypes.APPLICATION_MP4)) {
                            b = 18;
                        } else {
                            b = -1;
                        }
                        break;
                    case -1079884372:
                        if (strZze.equals("video/x-msvideo")) {
                            b = 25;
                        } else {
                            b = -1;
                        }
                        break;
                    case -1004728940:
                        if (strZze.equals(MimeTypes.TEXT_VTT)) {
                            b = 23;
                        } else {
                            b = -1;
                        }
                        break;
                    case -879272239:
                        if (strZze.equals("image/bmp")) {
                            b = 28;
                        } else {
                            b = -1;
                        }
                        break;
                    case -879258763:
                        if (strZze.equals("image/png")) {
                            b = 26;
                        } else {
                            b = -1;
                        }
                        break;
                    case -387023398:
                        if (strZze.equals("audio/x-matroska")) {
                            b = 11;
                        } else {
                            b = -1;
                        }
                        break;
                    case -43467528:
                        if (strZze.equals(MimeTypes.APPLICATION_WEBM)) {
                            b = cw.l;
                        } else {
                            b = -1;
                        }
                        break;
                    case 13915911:
                        if (strZze.equals("video/x-flv")) {
                            b = 8;
                        } else {
                            b = -1;
                        }
                        break;
                    case 187078296:
                        if (strZze.equals(MimeTypes.AUDIO_AC3)) {
                            b = 0;
                        } else {
                            b = -1;
                        }
                        break;
                    case 187078297:
                        if (strZze.equals("audio/ac4")) {
                            b = 3;
                        } else {
                            b = -1;
                        }
                        break;
                    case 187078669:
                        if (strZze.equals("audio/amr")) {
                            b = 4;
                        } else {
                            b = -1;
                        }
                        break;
                    case 187090232:
                        if (strZze.equals(MimeTypes.AUDIO_MP4)) {
                            b = 17;
                        } else {
                            b = -1;
                        }
                        break;
                    case 187091926:
                        if (strZze.equals("audio/ogg")) {
                            b = 19;
                        } else {
                            b = -1;
                        }
                        break;
                    case 187099443:
                        if (strZze.equals("audio/wav")) {
                            b = 22;
                        } else {
                            b = -1;
                        }
                        break;
                    case 1331848029:
                        if (strZze.equals(MimeTypes.VIDEO_MP4)) {
                            b = cw.n;
                        } else {
                            b = -1;
                        }
                        break;
                    case 1503095341:
                        if (strZze.equals(MimeTypes.AUDIO_AMR_NB)) {
                            b = 5;
                        } else {
                            b = -1;
                        }
                        break;
                    case 1504578661:
                        if (strZze.equals(MimeTypes.AUDIO_E_AC3)) {
                            b = 1;
                        } else {
                            b = -1;
                        }
                        break;
                    case 1504619009:
                        if (strZze.equals(MimeTypes.AUDIO_FLAC)) {
                            b = 7;
                        } else {
                            b = -1;
                        }
                        break;
                    case 1504824762:
                        if (strZze.equals("audio/midi")) {
                            b = 9;
                        } else {
                            b = -1;
                        }
                        break;
                    case 1504831518:
                        if (strZze.equals(MimeTypes.AUDIO_MPEG)) {
                            b = cw.m;
                        } else {
                            b = -1;
                        }
                        break;
                    case 1505118770:
                        if (strZze.equals(MimeTypes.AUDIO_WEBM)) {
                            b = cw.k;
                        } else {
                            b = -1;
                        }
                        break;
                    case 2039520277:
                        if (strZze.equals("video/x-matroska")) {
                            b = 10;
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
                    case 1:
                    case 2:
                        i = 0;
                        break;
                    case 3:
                        i = 1;
                        break;
                    case 4:
                    case 5:
                    case 6:
                        i = 3;
                        break;
                    case 7:
                        i = 4;
                        break;
                    case 8:
                        i = 5;
                        break;
                    case 9:
                        i = 15;
                        break;
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                        i = 6;
                        break;
                    case 15:
                        i = 7;
                        break;
                    case 16:
                    case 17:
                    case 18:
                        i = 8;
                        break;
                    case 19:
                        i = 9;
                        break;
                    case 20:
                        i = 10;
                        break;
                    case 21:
                        i = 11;
                        break;
                    case 22:
                        i = 12;
                        break;
                    case 23:
                        i = 13;
                        break;
                    case 24:
                        i = 14;
                        break;
                    case 25:
                        i = 16;
                        break;
                    case 26:
                        i = 17;
                        break;
                    case 27:
                        i = 18;
                        break;
                    case 28:
                        i = 19;
                        break;
                    case 29:
                    case 30:
                        i = 20;
                        break;
                    case 31:
                        i = 21;
                        break;
                    default:
                        i = -1;
                        break;
                }
            } else {
                i = -1;
            }
            if (i != -1) {
                zzb(i, arrayList);
            }
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment == null) {
                i2 = -1;
            } else if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
                i2 = 0;
            } else if (lastPathSegment.endsWith(".ac4")) {
                i2 = 1;
            } else if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
                i2 = 2;
            } else if (lastPathSegment.endsWith(".amr")) {
                i2 = 3;
            } else if (lastPathSegment.endsWith(".flac")) {
                i2 = 4;
            } else if (lastPathSegment.endsWith(".flv")) {
                i2 = 5;
            } else if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
                i2 = 15;
            } else if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
                i2 = 6;
            } else if (lastPathSegment.endsWith(".mp3")) {
                i2 = 7;
            } else if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
                i2 = 8;
            } else if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
                i2 = 9;
            } else if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
                i2 = 10;
            } else if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
                i2 = 11;
            } else if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
                i2 = 12;
            } else if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
                i2 = 13;
            } else if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
                i2 = 14;
            } else if (lastPathSegment.endsWith(".avi")) {
                i2 = 16;
            } else if (lastPathSegment.endsWith(".png")) {
                i2 = 17;
            } else if (lastPathSegment.endsWith(".webp")) {
                i2 = 18;
            } else if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
                i2 = 19;
            } else if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
                i2 = 20;
            } else if (lastPathSegment.endsWith(".avif")) {
                i2 = 21;
            } else {
                i2 = -1;
            }
            if (i2 != -1 && i2 != i) {
                zzb(i2, arrayList);
            }
            int[] iArr = zza;
            for (int i3 = 0; i3 < 21; i3++) {
                int i4 = iArr[i3];
                if (i4 != i && i4 != i2) {
                    zzb(i4, arrayList);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (zzacn[]) arrayList.toArray(new zzacn[arrayList.size()]);
    }
}
