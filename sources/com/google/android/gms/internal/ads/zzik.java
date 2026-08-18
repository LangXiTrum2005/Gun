package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public final class zzik {
    final Context zza;
    zzcx zzb;
    zzfvf zzc;
    zzfvf zzd;
    zzfvf zze;
    zzfvf zzf;
    zzfvf zzg;
    zzfuc zzh;
    Looper zzi;
    int zzj;
    zze zzk;
    int zzl;
    boolean zzm;
    zzlp zzn;
    long zzo;
    long zzp;
    boolean zzq;
    boolean zzr;
    String zzs;
    zzhv zzt;

    public zzik(final Context context, zzced zzcedVar) {
        zzid zzidVar = new zzid(zzcedVar);
        zzie zzieVar = new zzie(context);
        zzfvf zzfvfVar = new zzfvf() { // from class: com.google.android.gms.internal.ads.zzif
            @Override // com.google.android.gms.internal.ads.zzfvf
            public final Object zza() {
                return new zzxt(context);
            }
        };
        zzfvf zzfvfVar2 = new zzfvf() { // from class: com.google.android.gms.internal.ads.zzig
            @Override // com.google.android.gms.internal.ads.zzfvf
            public final Object zza() {
                return new zzhy();
            }
        };
        zzih zzihVar = new zzih(context);
        zzfuc zzfucVar = new zzfuc() { // from class: com.google.android.gms.internal.ads.zzii
            @Override // com.google.android.gms.internal.ads.zzfuc
            public final Object apply(Object obj) {
                return new zznx((zzcx) obj);
            }
        };
        context.getClass();
        this.zza = context;
        this.zzc = zzidVar;
        this.zzd = zzieVar;
        this.zze = zzfvfVar;
        this.zzf = zzfvfVar2;
        this.zzg = zzihVar;
        this.zzh = zzfucVar;
        this.zzi = zzei.zzz();
        this.zzk = zze.zza;
        this.zzl = 1;
        this.zzm = true;
        this.zzn = zzlp.zzb;
        this.zzt = new zzhv(0.97f, 1.03f, 1000L, 1.0E-7f, zzei.zzs(20L), zzei.zzs(500L), 0.999f, null);
        this.zzb = zzcx.zza;
        this.zzo = 500L;
        this.zzp = 2000L;
        this.zzq = true;
        this.zzs = "";
        this.zzj = -1000;
    }

    public static /* synthetic */ zzuf zza(Context context) {
        return new zztt(context, new zzach());
    }
}
