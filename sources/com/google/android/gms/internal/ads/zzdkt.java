package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import com.google.android.gms.common.util.Clock;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdkt {
    private final com.google.android.gms.ads.internal.util.zzbo zza;
    private final Clock zzb;
    private final Executor zzc;

    public zzdkt(com.google.android.gms.ads.internal.util.zzbo zzboVar, Clock clock, Executor executor) {
        this.zza = zzboVar;
        this.zzb = clock;
        this.zzc = executor;
    }

    private final Bitmap zzc(byte[] bArr, BitmapFactory.Options options) {
        long jElapsedRealtime = this.zzb.elapsedRealtime();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long jElapsedRealtime2 = this.zzb.elapsedRealtime();
        if (bitmapDecodeByteArray != null) {
            long j = jElapsedRealtime2 - jElapsedRealtime;
            int width = bitmapDecodeByteArray.getWidth();
            int height = bitmapDecodeByteArray.getHeight();
            int allocationByteCount = bitmapDecodeByteArray.getAllocationByteCount();
            boolean z = Looper.getMainLooper().getThread() == Thread.currentThread();
            StringBuilder sbT = AbstractC3950lJ.t("Decoded image w: ", width, " h:", height, " bytes: ");
            sbT.append(allocationByteCount);
            sbT.append(" time: ");
            sbT.append(j);
            sbT.append(" on ui thread: ");
            sbT.append(z);
            com.google.android.gms.ads.internal.util.zze.zza(sbT.toString());
        }
        return bitmapDecodeByteArray;
    }

    public final /* synthetic */ Bitmap zza(double d, boolean z, zzapi zzapiVar) {
        byte[] bArr = zzapiVar.zzb;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d * 160.0d);
        if (!z) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfY)).booleanValue()) {
            options.inJustDecodeBounds = true;
            zzc(bArr, options);
            options.inJustDecodeBounds = false;
            int i = options.outWidth * options.outHeight;
            if (i > 0) {
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i - 1) / ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfZ)).intValue())) / 2);
            }
        }
        return zzc(bArr, options);
    }

    public final AI zzb(String str, final double d, final boolean z) {
        return zzgch.zzm(this.zza.zza(str), new zzfuc() { // from class: com.google.android.gms.internal.ads.zzdks
            @Override // com.google.android.gms.internal.ads.zzfuc
            public final Object apply(Object obj) {
                return this.zza.zza(d, z, (zzapi) obj);
            }
        }, this.zzc);
    }
}
