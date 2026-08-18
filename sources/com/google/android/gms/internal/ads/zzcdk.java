package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.common.util.Clock;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcdk extends zzcde implements zzgy {
    private static final AtomicInteger zzd = new AtomicInteger(0);
    private String zze;
    private final zzcbr zzf;
    private boolean zzg;
    private final zzcdj zzh;
    private final zzcco zzi;
    private ByteBuffer zzj;
    private boolean zzk;
    private final Object zzl;
    private final String zzm;
    private final int zzn;
    private boolean zzo;

    public zzcdk(zzcbs zzcbsVar, zzcbr zzcbrVar) {
        super(zzcbsVar);
        this.zzf = zzcbrVar;
        this.zzh = new zzcdj();
        this.zzi = new zzcco();
        this.zzl = new Object();
        this.zzm = (String) zzful.zzd(zzcbsVar != null ? zzcbsVar.zzr() : null).zzb("");
        this.zzn = zzcbsVar != null ? zzcbsVar.zzf() : 0;
        zzd.incrementAndGet();
    }

    public static int zzi() {
        return zzd.get();
    }

    public static final String zzv(String str) {
        return "cache:".concat(String.valueOf(com.google.android.gms.ads.internal.util.client.zzf.zzf(str)));
    }

    private final void zzx() {
        int iZza = (int) this.zzh.zza();
        int iZza2 = (int) this.zzi.zza(this.zzj);
        int iPosition = this.zzj.position();
        int iRound = Math.round((iPosition / iZza) * iZza2);
        int iZzs = zzcbj.zzs();
        int iZzu = zzcbj.zzu();
        String str = this.zze;
        zzn(str, zzv(str), iPosition, iZza, iRound, iZza2, iRound > 0, iZzs, iZzu);
    }

    @Override // com.google.android.gms.internal.ads.zzcde, com.google.android.gms.common.api.Releasable
    public final void release() {
        zzd.decrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.zzgy
    public final void zza(zzfy zzfyVar, zzgd zzgdVar, boolean z, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzgy
    public final void zzb(zzfy zzfyVar, zzgd zzgdVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzgy
    public final void zzc(zzfy zzfyVar, zzgd zzgdVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzgy
    public final void zzd(zzfy zzfyVar, zzgd zzgdVar, boolean z) {
        if (zzfyVar instanceof zzgl) {
            this.zzh.zzb((zzgl) zzfyVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final void zzf() {
        this.zzg = true;
    }

    public final String zzk() {
        return this.zze;
    }

    public final ByteBuffer zzl() {
        synchronized (this.zzl) {
            try {
                ByteBuffer byteBuffer = this.zzj;
                if (byteBuffer != null && !this.zzk) {
                    byteBuffer.flip();
                    this.zzk = true;
                }
                this.zzg = true;
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.zzj;
    }

    public final boolean zzm() {
        return this.zzo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:? -> B:23:0x00d6). Please report as a decompilation issue!!! */
    @Override // com.google.android.gms.internal.ads.zzcde
    public final boolean zzt(String str) throws Throwable {
        String str2;
        this.zze = str;
        String str3 = "error";
        String strZzv = zzv(str);
        int i = 0;
        try {
            zzgg zzggVar = new zzgg();
            zzggVar.zzf(this.zzb);
            zzggVar.zzc(this.zzf.zzd);
            zzggVar.zzd(this.zzf.zze);
            zzggVar.zzb(true);
            zzggVar.zze(this);
            zzfy zzfyVarZza = zzggVar.zza();
            if (this.zzf.zzi) {
                zzfyVarZza = new zzccm(this.zza, zzfyVarZza, this.zzm, this.zzn, null, null);
            }
            zzfyVarZza.zzb(new zzgd(Uri.parse(str), 0L, -1L, null));
            zzcbs zzcbsVar = (zzcbs) this.zzc.get();
            if (zzcbsVar != null) {
                zzcbsVar.zzt(strZzv, this);
            }
            Clock clockZzC = com.google.android.gms.ads.internal.zzv.zzC();
            long jCurrentTimeMillis = clockZzC.currentTimeMillis();
            long jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzL)).longValue();
            long jLongValue2 = ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzK)).longValue();
            this.zzj = ByteBuffer.allocate(this.zzf.zzc);
            int i2 = 8192;
            byte[] bArr = new byte[8192];
            long j = jCurrentTimeMillis;
            while (true) {
                int iZza = zzfyVarZza.zza(bArr, i, Math.min(this.zzj.remaining(), i2));
                if (iZza == -1) {
                    this.zzo = true;
                    zzj(str, strZzv, (int) this.zzi.zza(this.zzj));
                    break;
                }
                synchronized (this.zzl) {
                    try {
                        if (!this.zzg) {
                            try {
                                this.zzj.put(bArr, 0, iZza);
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        }
                        try {
                            if (this.zzj.remaining() <= 0) {
                                zzx();
                                break;
                            }
                            str2 = 1;
                            try {
                                if (this.zzg) {
                                    throw new IOException("Precache abort at " + this.zzj.limit() + " bytes");
                                }
                                long jCurrentTimeMillis2 = clockZzC.currentTimeMillis();
                                if (jCurrentTimeMillis2 - j >= jLongValue) {
                                    zzx();
                                    j = jCurrentTimeMillis2;
                                }
                                if (jCurrentTimeMillis2 - jCurrentTimeMillis > 1000 * jLongValue2) {
                                    throw new IOException("Timeout exceeded. Limit: " + jLongValue2 + " sec");
                                }
                                str3 = str3;
                                i = 0;
                                i2 = 8192;
                            } catch (Exception e) {
                                e = e;
                                String strI = DM.i(e.getClass().getCanonicalName(), ":", e.getMessage());
                                com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to preload url " + str + " Exception: " + strI);
                                zzg(str, strZzv, str2, strI);
                                return false;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            str2 = str3;
                            String strI2 = DM.i(e.getClass().getCanonicalName(), ":", e.getMessage());
                            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to preload url " + str + " Exception: " + strI2);
                            zzg(str, strZzv, str2, strI2);
                            return false;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
            }
            return true;
        } catch (Exception e3) {
            e = e3;
            str3 = str3;
        }
    }
}
