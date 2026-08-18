package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes3.dex */
final class zzafh {
    private static final String[] zza = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String[] zzb = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final String[] zzc = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    @Nullable
    public static zzafd zza(String str) throws IOException {
        long j;
        try {
            XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
            xmlPullParserNewPullParser.setInput(new StringReader(str));
            xmlPullParserNewPullParser.next();
            if (!zzej.zzc(xmlPullParserNewPullParser, "x:xmpmeta")) {
                throw zzbc.zza("Couldn't find xmp metadata", null);
            }
            zzfxn zzfxnVarZzn = zzfxn.zzn();
            long j2 = -9223372036854775807L;
            do {
                xmlPullParserNewPullParser.next();
                if (zzej.zzc(xmlPullParserNewPullParser, "rdf:Description")) {
                    String[] strArr = zza;
                    int i = 0;
                    for (int i2 = 0; i2 < 4; i2++) {
                        String strZza = zzej.zza(xmlPullParserNewPullParser, strArr[i2]);
                        if (strZza != null) {
                            if (Integer.parseInt(strZza) != 1) {
                                return null;
                            }
                            String[] strArr2 = zzb;
                            int i3 = 0;
                            while (true) {
                                if (i3 < 4) {
                                    String strZza2 = zzej.zza(xmlPullParserNewPullParser, strArr2[i3]);
                                    if (strZza2 != null) {
                                        j = Long.parseLong(strZza2);
                                        if (j != -1) {
                                            break;
                                        }
                                        break;
                                    }
                                    i3++;
                                }
                                j = -9223372036854775807L;
                                break;
                            }
                            String[] strArr3 = zzc;
                            while (true) {
                                if (i >= 2) {
                                    zzfxnVarZzn = zzfxn.zzn();
                                    break;
                                }
                                String strZza3 = zzej.zza(xmlPullParserNewPullParser, strArr3[i]);
                                if (strZza3 != null) {
                                    zzfxnVarZzn = zzfxn.zzp(new zzafc("image/jpeg", "Primary", 0L, 0L), new zzafc(MimeTypes.VIDEO_MP4, "MotionPhoto", Long.parseLong(strZza3), 0L));
                                    break;
                                }
                                i++;
                            }
                            j2 = j;
                        }
                    }
                    return null;
                }
                if (zzej.zzc(xmlPullParserNewPullParser, "Container:Directory")) {
                    zzfxnVarZzn = zzb(xmlPullParserNewPullParser, "Container", "Item");
                } else if (zzej.zzc(xmlPullParserNewPullParser, "GContainer:Directory")) {
                    zzfxnVarZzn = zzb(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
                }
            } while (!zzej.zzb(xmlPullParserNewPullParser, "x:xmpmeta"));
            if (zzfxnVarZzn.isEmpty()) {
                return null;
            }
            return new zzafd(j2, zzfxnVarZzn);
        } catch (zzbc | NumberFormatException | XmlPullParserException unused) {
            zzdo.zzf("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static zzfxn zzb(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        zzfxk zzfxkVar = new zzfxk();
        do {
            String strConcat = str.concat(":Item");
            xmlPullParser.next();
            if (zzej.zzc(xmlPullParser, strConcat)) {
                String strConcat2 = str2.concat(":Mime");
                String strConcat3 = str2.concat(":Semantic");
                String strConcat4 = str2.concat(":Length");
                String strConcat5 = str2.concat(":Padding");
                String strZza = zzej.zza(xmlPullParser, strConcat2);
                String strZza2 = zzej.zza(xmlPullParser, strConcat3);
                String strZza3 = zzej.zza(xmlPullParser, strConcat4);
                String strZza4 = zzej.zza(xmlPullParser, strConcat5);
                if (strZza == null || strZza2 == null) {
                    return zzfxn.zzn();
                }
                zzfxkVar.zzf(new zzafc(strZza, strZza2, strZza3 != null ? Long.parseLong(strZza3) : 0L, strZza4 != null ? Long.parseLong(strZza4) : 0L));
            }
        } while (!zzej.zzb(xmlPullParser, str.concat(":Directory")));
        return zzfxkVar.zzi();
    }
}
