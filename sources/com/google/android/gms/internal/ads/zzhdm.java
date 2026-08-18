package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhdm extends zzgxr implements zzgzd {
    private static final zzhdm zza;
    private static volatile zzgzk zzb;
    private zzhdi zzC;
    private zzhbt zzE;
    private zzhbl zzG;
    private zzhcm zzI;
    private int zzJ;
    private long zzM;
    private zzhdl zzN;
    private zzhcr zzO;
    private int zzc;
    private int zzd;
    private int zze;
    private zzhbp zzi;
    private zzhcx zzm;
    private boolean zzn;
    private boolean zzu;
    private boolean zzv;
    private zzhde zzx;
    private boolean zzy;
    private byte zzQ = 2;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private zzgyd zzj = zzgxr.zzbK();
    private zzgyd zzk = zzgxr.zzbK();
    private String zzl = "";
    private zzgyd zzo = zzgxr.zzbK();
    private String zzp = "";
    private zzgwj zzw = zzgwj.zzb;
    private String zzz = "";
    private zzgyd zzA = zzgxr.zzbK();
    private zzgyd zzB = zzgxr.zzbK();
    private zzgyd zzD = zzgxr.zzbK();
    private String zzF = "";
    private zzgyd zzH = zzgxr.zzbK();
    private zzgyd zzK = zzgxr.zzbK();
    private zzgyd zzL = zzgxr.zzbK();
    private String zzP = "";

    static {
        zzhdm zzhdmVar = new zzhdm();
        zza = zzhdmVar;
        zzgxr.zzbZ(zzhdm.class, zzhdmVar);
    }

    private zzhdm() {
    }

    public static zzhbn zzc() {
        return (zzhbn) zza.zzaZ();
    }

    public static /* synthetic */ void zzi(zzhdm zzhdmVar, Iterable iterable) {
        zzgyd zzgydVar = zzhdmVar.zzA;
        if (!zzgydVar.zzc()) {
            zzhdmVar.zzA = zzgxr.zzbL(zzgydVar);
        }
        zzgvs.zzaQ(iterable, zzhdmVar.zzA);
    }

    public static /* synthetic */ void zzj(zzhdm zzhdmVar, Iterable iterable) {
        zzgyd zzgydVar = zzhdmVar.zzB;
        if (!zzgydVar.zzc()) {
            zzhdmVar.zzB = zzgxr.zzbL(zzgydVar);
        }
        zzgvs.zzaQ(iterable, zzhdmVar.zzB);
    }

    public static /* synthetic */ void zzk(zzhdm zzhdmVar, zzhdc zzhdcVar) {
        zzhdcVar.getClass();
        zzgyd zzgydVar = zzhdmVar.zzj;
        if (!zzgydVar.zzc()) {
            zzhdmVar.zzj = zzgxr.zzbL(zzgydVar);
        }
        zzhdmVar.zzj.add(zzhdcVar);
    }

    public static /* synthetic */ void zzl(zzhdm zzhdmVar) {
        zzhdmVar.zzc &= -65;
        zzhdmVar.zzl = zza.zzl;
    }

    public static /* synthetic */ void zzm(zzhdm zzhdmVar, String str) {
        zzhdmVar.zzc |= 64;
        zzhdmVar.zzl = str;
    }

    public static /* synthetic */ void zzn(zzhdm zzhdmVar, zzhde zzhdeVar) {
        zzhdeVar.getClass();
        zzhdmVar.zzx = zzhdeVar;
        zzhdmVar.zzc |= 8192;
    }

    public static /* synthetic */ void zzo(zzhdm zzhdmVar, zzhbp zzhbpVar) {
        zzhbpVar.getClass();
        zzhdmVar.zzi = zzhbpVar;
        zzhdmVar.zzc |= 32;
    }

    public static /* synthetic */ void zzp(zzhdm zzhdmVar, String str) {
        str.getClass();
        zzhdmVar.zzc |= 8;
        zzhdmVar.zzg = str;
    }

    public static /* synthetic */ void zzq(zzhdm zzhdmVar, zzhcx zzhcxVar) {
        zzhcxVar.getClass();
        zzhdmVar.zzm = zzhcxVar;
        zzhdmVar.zzc |= 128;
    }

    public static /* synthetic */ void zzr(zzhdm zzhdmVar, String str) {
        str.getClass();
        zzhdmVar.zzc |= 4;
        zzhdmVar.zzf = str;
    }

    public static /* synthetic */ void zzs(zzhdm zzhdmVar, int i) {
        zzhdmVar.zzd = i - 1;
        zzhdmVar.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    public final Object zzdc(zzgxq zzgxqVar, Object obj, Object obj2) {
        zzhdx zzhdxVar = null;
        switch (zzgxqVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzQ);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzQ = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return zzgxr.zzbQ(zza, "\u0001#\u0000\u0001\u0001##\u0000\t\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\n᠌\u0000\u000b᠌\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013\u001b\u001b\u001cဉ\u0014\u001d᠌\u0015\u001e\u001b\u001f\u001b ဂ\u0016!ဉ\u0017\"ဉ\u0018#ဈ\u0019", new Object[]{"zzc", "zzf", "zzg", "zzh", "zzj", zzhdc.class, "zzn", "zzo", "zzp", "zzu", "zzv", "zzd", zzhcy.zza, "zze", zzhbm.zza, "zzi", "zzl", "zzm", "zzw", "zzk", zzhdq.class, "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", zzhdw.class, "zzE", "zzF", "zzG", "zzH", zzhbx.class, "zzI", "zzJ", zzhdg.zza, "zzK", zzhcp.class, "zzL", zzhcu.class, "zzM", "zzN", "zzO", "zzP"});
            case NEW_MUTABLE_INSTANCE:
                return new zzhdm();
            case NEW_BUILDER:
                return new zzhbn(zzhdxVar);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                zzgzk zzgxmVar = zzb;
                if (zzgxmVar == null) {
                    synchronized (zzhdm.class) {
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

    public final String zzf() {
        return this.zzl;
    }

    public final String zzg() {
        return this.zzf;
    }

    public final List zzh() {
        return this.zzj;
    }
}
