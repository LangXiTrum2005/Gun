package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhbz extends zzgxr implements zzgzd {
    private static final zzhbz zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private zzgwj zzd;
    private zzgwj zze;
    private byte zzf = 2;

    static {
        zzhbz zzhbzVar = new zzhbz();
        zza = zzhbzVar;
        zzgxr.zzbZ(zzhbz.class, zzhbzVar);
    }

    private zzhbz() {
        zzgwj zzgwjVar = zzgwj.zzb;
        this.zzd = zzgwjVar;
        this.zze = zzgwjVar;
    }

    public static zzhby zzc() {
        return (zzhby) zza.zzaZ();
    }

    public static /* synthetic */ void zzf(zzhbz zzhbzVar, zzgwj zzgwjVar) {
        zzhbzVar.zzc |= 1;
        zzhbzVar.zzd = zzgwjVar;
    }

    public static /* synthetic */ void zzg(zzhbz zzhbzVar, zzgwj zzgwjVar) {
        zzhbzVar.zzc |= 2;
        zzhbzVar.zze = zzgwjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    public final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
        zzhdx zzhdxVar = null;
        switch (zzgxqVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzf);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzf = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgxr.zzbQ(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zzc", "zzd", "zze"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhbz();
            case NEW_BUILDER:
                return new zzhby(zzhdxVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzgzk zzgxmVar = zzb;
                if (zzgxmVar == null) {
                    synchronized (zzhbz.class) {
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
