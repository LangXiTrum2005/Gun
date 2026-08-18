package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhch extends zzgxr implements zzgzd {
    private static final zzhch zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private zzhcg zzd;
    private zzgwj zzf;
    private zzgwj zzg;
    private int zzh;
    private zzgwj zzi;
    private byte zzj = 2;
    private zzgyd zze = zzgxr.zzbK();

    static {
        zzhch zzhchVar = new zzhch();
        zza = zzhchVar;
        zzgxr.zzbZ(zzhch.class, zzhchVar);
    }

    private zzhch() {
        zzgwj zzgwjVar = zzgwj.zzb;
        this.zzf = zzgwjVar;
        this.zzg = zzgwjVar;
        this.zzi = zzgwjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    public final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
        zzhdx zzhdxVar = null;
        switch (zzgxqVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzj);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzj = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgxr.zzbQ(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zzc", "zzd", "zze", zzhbz.class, "zzf", "zzg", "zzh", "zzi"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhch();
            case NEW_BUILDER:
                return new zzhce(zzhdxVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzgzk zzgxmVar = zzb;
                if (zzgxmVar == null) {
                    synchronized (zzhch.class) {
                        try {
                            zzgxmVar = zzb;
                            if (zzgxmVar == null) {
                                zzgxmVar = new zzgxm(zza);
                                zzb = zzgxmVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return zzgxmVar;
            default:
                throw null;
        }
    }
}
