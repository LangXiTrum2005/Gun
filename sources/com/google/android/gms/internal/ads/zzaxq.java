package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaxq {
    private final zzawd zza;
    private final String zzb;
    private final String zzc;
    private final Class[] zze;
    private volatile Method zzd = null;
    private final CountDownLatch zzf = new CountDownLatch(1);

    public zzaxq(zzawd zzawdVar, String str, String str2, Class... clsArr) {
        this.zza = zzawdVar;
        this.zzb = str;
        this.zzc = str2;
        this.zze = clsArr;
        zzawdVar.zzk().submit(new zzaxp(this));
    }

    public static /* bridge */ /* synthetic */ void zzb(zzaxq zzaxqVar) {
        try {
            zzawd zzawdVar = zzaxqVar.zza;
            Class<?> clsLoadClass = zzawdVar.zzi().loadClass(zzaxqVar.zzc(zzawdVar.zzu(), zzaxqVar.zzb));
            if (clsLoadClass != null) {
                zzaxqVar.zzd = clsLoadClass.getMethod(zzaxqVar.zzc(zzaxqVar.zza.zzu(), zzaxqVar.zzc), zzaxqVar.zze);
            }
        } catch (zzavh | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused) {
        } finally {
            zzaxqVar.zzf.countDown();
        }
    }

    private final String zzc(byte[] bArr, String str) throws zzavh, UnsupportedEncodingException {
        return new String(this.zza.zze().zzb(bArr, str), C.UTF8_NAME);
    }

    public final Method zza() {
        if (this.zzd != null) {
            return this.zzd;
        }
        try {
            if (this.zzf.await(2L, TimeUnit.SECONDS)) {
                return this.zzd;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
