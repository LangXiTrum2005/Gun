package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.os.Trace;
import android.view.Surface;
import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzrv implements zzsb {

    @Nullable
    private final Context zza;

    @Deprecated
    public zzrv() {
        this.zza = null;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0097  */
    @Override // com.google.android.gms.internal.ads.zzsb
    public final zzsd zzd(zzsa zzsaVar) throws Throwable {
        Context context;
        int i = zzei.zza;
        if (i >= 23 && (i >= 31 || ((context = this.zza) != null && i >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen")))) {
            int iZzb = zzbb.zzb(zzsaVar.zzc.zzo);
            zzdo.zze("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(zzei.zzD(iZzb)));
            zzrl zzrlVar = new zzrl(iZzb);
            zzrlVar.zze(true);
            return zzrlVar.zzc(zzsaVar);
        }
        MediaCodec mediaCodec = null;
        try {
            String str = zzsaVar.zza.zza;
            Trace.beginSection("createCodec:".concat(str));
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            Trace.endSection();
            try {
                Trace.beginSection("configureCodec");
                Surface surface = zzsaVar.zzd;
                int i2 = 0;
                if (surface == null && zzsaVar.zza.zzh && i >= 35) {
                    i2 = 8;
                }
                mediaCodecCreateByCodecName.configure(zzsaVar.zzb, surface, (MediaCrypto) null, i2);
                Trace.endSection();
                Trace.beginSection("startCodec");
                mediaCodecCreateByCodecName.start();
                Trace.endSection();
                return new zztc(mediaCodecCreateByCodecName, zzsaVar.zzf, null);
            } catch (IOException e) {
                e = e;
                mediaCodec = mediaCodecCreateByCodecName;
                if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw e;
            } catch (RuntimeException e2) {
                e = e2;
                mediaCodec = mediaCodecCreateByCodecName;
                if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw e;
            }
        } catch (IOException e3) {
            e = e3;
        } catch (RuntimeException e4) {
            e = e4;
        }
    }

    public zzrv(Context context) {
        this.zza = context;
    }
}
