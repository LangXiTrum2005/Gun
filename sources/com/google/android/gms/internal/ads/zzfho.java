package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfho extends zzgxr implements zzgzd {
    private static final zzfho zza;
    private static volatile zzgzk zzb;
    private int zzA;
    private int zzE;
    private int zzF;
    private int zzG;
    private long zzH;
    private int zzI;
    private int zzP;
    private int zzQ;
    private int zzS;
    private long zzab;
    private int zzad;
    private int zzae;
    private int zzaf;
    private zzfim zzag;
    private int zzah;
    private zzfij zzai;
    private zzfhw zzaj;
    private zzfic zzak;
    private zzfhz zzal;
    private int zzc;
    private int zzd;
    private int zze;
    private long zzg;
    private long zzh;
    private long zzi;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private int zzp;
    private String zzf = "";
    private zzgxz zzj = zzgxr.zzbG();
    private String zzu = "";
    private String zzv = "";
    private String zzw = "";
    private String zzx = "";
    private String zzy = "";
    private String zzz = "";
    private String zzB = "";
    private String zzC = "";
    private zzgyc zzD = zzgxr.zzbI();
    private String zzJ = "";
    private String zzK = "";
    private String zzL = "";
    private String zzM = "";
    private String zzN = "";
    private String zzO = "";
    private String zzR = "";
    private String zzT = "";
    private String zzU = "";
    private String zzV = "";
    private String zzW = "";
    private String zzX = "";
    private String zzY = "";
    private String zzZ = "";
    private String zzaa = "";
    private String zzac = "";

    static {
        zzfho zzfhoVar = new zzfho();
        zza = zzfhoVar;
        zzgxr.zzbZ(zzfho.class, zzfhoVar);
    }

    private zzfho() {
    }

    public static zzfhl zza() {
        return (zzfhl) zza.zzaZ();
    }

    public static /* synthetic */ void zzc(zzfho zzfhoVar, Iterable iterable) {
        zzgyc zzgycVar = zzfhoVar.zzD;
        if (!zzgycVar.zzc()) {
            zzfhoVar.zzD = zzgxr.zzbJ(zzgycVar);
        }
        zzgvs.zzaQ(iterable, zzfhoVar.zzD);
    }

    public static /* synthetic */ void zzd(zzfho zzfhoVar, String str) {
        str.getClass();
        zzfhoVar.zzx = str;
    }

    public static /* synthetic */ void zzf(zzfho zzfhoVar, String str) {
        str.getClass();
        zzfhoVar.zzJ = str;
    }

    public static /* synthetic */ void zzg(zzfho zzfhoVar, String str) {
        str.getClass();
        zzfhoVar.zzaa = str;
    }

    public static /* synthetic */ void zzi(zzfho zzfhoVar, String str) {
        str.getClass();
        zzfhoVar.zzK = str;
    }

    public static /* synthetic */ void zzk(zzfho zzfhoVar, String str) {
        str.getClass();
        zzfhoVar.zzV = str;
    }

    public static /* synthetic */ void zzn(zzfho zzfhoVar, String str) {
        str.getClass();
        zzfhoVar.zzz = str;
    }

    public static /* synthetic */ void zzo(zzfho zzfhoVar, String str) {
        str.getClass();
        zzfhoVar.zzX = str;
    }

    public static /* synthetic */ void zzq(zzfho zzfhoVar, String str) {
        str.getClass();
        zzfhoVar.zzu = str;
    }

    public static /* synthetic */ void zzr(zzfho zzfhoVar, String str) {
        str.getClass();
        zzfhoVar.zzZ = str;
    }

    public static /* synthetic */ void zzv(zzfho zzfhoVar, String str) {
        str.getClass();
        zzfhoVar.zzY = str;
    }

    public static /* synthetic */ void zzw(zzfho zzfhoVar, int i) {
        if (i == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        zzfhoVar.zzI = i - 2;
    }

    public static /* synthetic */ void zzy(zzfho zzfhoVar, int i) {
        if (i == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        zzfhoVar.zzE = i - 2;
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    public final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
        int iOrdinal = zzgxqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zzgxr.zzbQ(zza, "\u00049\u0000\u0001\u000199\u0000\u0002\u0000\u0001\f\u0002\u0007\u0003\u0002\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0004\t\f\n\u0004\u000b\u0002\f\f\rȈ\u000eȈ\u000fȈ\u0010Ȉ\u0011Ȉ\u0012Ȉ\u0013Ȉ\u0014Ȉ\u0015Ȉ\u0016Ȉ\u0017Ȉ\u0018Ȉ\u0019%\u001aȈ\u001bȈ\u001cȈ\u001d\u0002\u001eȈ\u001f\u0002 \u0002!\u0002\"\u0002#\u0002$\u0002%,&\f'\f(\f)ဉ\u0001*ဉ\u0002+\u0004,Ȉ-Ȉ.Ȉ/\f0\u00041\u00042Ȉ3Ȉ4ဉ\u00035\f6ဉ\u00047Ȉ8\u00049ဉ\u0000", new Object[]{"zzc", "zzd", "zzk", "zzl", "zzp", "zzu", "zzx", "zzz", "zzA", "zzE", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzV", "zzW", "zzX", "zzY", "zzZ", "zzaa", "zzv", "zzw", "zzB", "zzC", "zzD", "zzL", "zzM", "zzU", "zzab", "zzf", "zzg", "zzh", "zzi", "zzm", "zzn", "zzo", "zzj", "zzae", "zzaf", "zze", "zzai", "zzaj", "zzP", "zzR", "zzO", "zzN", "zzah", "zzQ", "zzS", "zzT", "zzy", "zzak", "zzF", "zzal", "zzac", "zzad", "zzag"});
        }
        if (iOrdinal == 3) {
            return new zzfho();
        }
        zzfhn zzfhnVar = null;
        if (iOrdinal == 4) {
            return new zzfhl(zzfhnVar);
        }
        if (iOrdinal == 5) {
            return zza;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzgzk zzgxmVar = zzb;
        if (zzgxmVar == null) {
            synchronized (zzfho.class) {
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
}
