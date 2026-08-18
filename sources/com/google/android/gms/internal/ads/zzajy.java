package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzajy implements zzakd {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x005e  */
    @Override // com.google.android.gms.internal.ads.zzakd
    public final int zza(zzab zzabVar) {
        String str = zzabVar.zzo;
        if (str != null) {
            switch (str) {
                case "text/x-ssa":
                case "text/vtt":
                    return 1;
                case "application/x-mp4-vtt":
                    return 2;
                case "application/x-subrip":
                    return 1;
                case "application/x-quicktime-tx3g":
                case "application/pgs":
                case "application/dvbsubs":
                    return 2;
                case "application/ttml+xml":
                    return 1;
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: ".concat(String.valueOf(str)));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    @Override // com.google.android.gms.internal.ads.zzakd
    public final zzakf zzb(zzab zzabVar) {
        String str = zzabVar.zzo;
        if (str != null) {
            switch (str) {
                case "text/x-ssa":
                    return new zzakv(zzabVar.zzr);
                case "text/vtt":
                    return new zzalw();
                case "application/x-mp4-vtt":
                    return new zzall();
                case "application/x-subrip":
                    return new zzakz();
                case "application/x-quicktime-tx3g":
                    return new zzalk(zzabVar.zzr);
                case "application/pgs":
                    return new zzakt();
                case "application/dvbsubs":
                    return new zzakr(zzabVar.zzr);
                case "application/ttml+xml":
                    return new zzalf();
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: ".concat(String.valueOf(str)));
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final boolean zzc(zzab zzabVar) {
        String str = zzabVar.zzo;
        return Objects.equals(str, MimeTypes.TEXT_SSA) || Objects.equals(str, MimeTypes.TEXT_VTT) || Objects.equals(str, MimeTypes.APPLICATION_MP4VTT) || Objects.equals(str, MimeTypes.APPLICATION_SUBRIP) || Objects.equals(str, MimeTypes.APPLICATION_TX3G) || Objects.equals(str, MimeTypes.APPLICATION_PGS) || Objects.equals(str, MimeTypes.APPLICATION_DVBSUBS) || Objects.equals(str, MimeTypes.APPLICATION_TTML);
    }
}
