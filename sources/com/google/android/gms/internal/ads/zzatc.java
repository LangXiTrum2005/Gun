package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzatc extends zzgxr implements zzgzd {
    private static final zzatc zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private zzgwj zzd;
    private zzgwj zze;
    private zzgwj zzf;
    private zzgwj zzg;

    static {
        zzatc zzatcVar = new zzatc();
        zza = zzatcVar;
        zzgxr.zzbZ(zzatc.class, zzatcVar);
    }

    private zzatc() {
        zzgwj zzgwjVar = zzgwj.zzb;
        this.zzd = zzgwjVar;
        this.zze = zzgwjVar;
        this.zzf = zzgwjVar;
        this.zzg = zzgwjVar;
    }

    public static zzatb zza() {
        return (zzatb) zza.zzaZ();
    }

    public static zzatc zzc(byte[] bArr, zzgxb zzgxbVar) throws zzgyg {
        return (zzatc) zzgxr.zzbx(zza, bArr, zzgxbVar);
    }

    public static /* synthetic */ void zzi(zzatc zzatcVar, zzgwj zzgwjVar) {
        zzatcVar.zzc |= 1;
        zzatcVar.zzd = zzgwjVar;
    }

    public static /* synthetic */ void zzj(zzatc zzatcVar, zzgwj zzgwjVar) {
        zzatcVar.zzc |= 2;
        zzatcVar.zze = zzgwjVar;
    }

    public static /* synthetic */ void zzk(zzatc zzatcVar, zzgwj zzgwjVar) {
        zzatcVar.zzc |= 8;
        zzatcVar.zzg = zzgwjVar;
    }

    public static /* synthetic */ void zzl(zzatc zzatcVar, zzgwj zzgwjVar) {
        zzatcVar.zzc |= 4;
        zzatcVar.zzf = zzgwjVar;
    }

    public final zzgwj zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    public final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxr.zzbQ(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
        }
        if (iOrdinal == 3) {
            return new zzatc();
        }
        zzato zzatoVar = null;
        if (iOrdinal == 4) {
            return new zzatb(zzatoVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (zzatc.class) {
                try {
                    zzgxmVar = zzb;
                    if (zzgxmVar == null) {
                        zzgxmVar = new zzgxm(zza);
                        zzb = zzgxmVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zzgxmVar;
    }

    public final zzgwj zzf() {
        return this.zze;
    }

    public final zzgwj zzg() {
        return this.zzg;
    }

    public final zzgwj zzh() {
        return this.zzf;
    }
}
