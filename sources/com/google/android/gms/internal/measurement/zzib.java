package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzib {
    public static final /* synthetic */ int zzc = 0;

    @Nullable
    private static volatile zzhz zze = null;
    private static volatile boolean zzf = false;
    final zzhy zza;
    final String zzb;
    private final Object zzj;
    private volatile int zzk = -1;
    private volatile Object zzl;
    private static final Object zzd = new Object();
    private static final AtomicReference zzg = new AtomicReference();
    private static final zzid zzh = new zzid(zzht.zza);
    private static final AtomicInteger zzi = new AtomicInteger();

    public /* synthetic */ zzib(zzhy zzhyVar, String str, Object obj, boolean z, zzia zziaVar) {
        if (zzhyVar.zza == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.zza = zzhyVar;
        this.zzb = str;
        this.zzj = obj;
    }

    public static void zzc() {
        zzi.incrementAndGet();
    }

    public static void zzd(final Context context) {
        if (zze != null || context == null) {
            return;
        }
        Object obj = zzd;
        synchronized (obj) {
            try {
                if (zze == null) {
                    synchronized (obj) {
                        try {
                            zzhz zzhzVar = zze;
                            Context applicationContext = context.getApplicationContext();
                            if (applicationContext != null) {
                                context = applicationContext;
                            }
                            if (zzhzVar == null || zzhzVar.zza() != context) {
                                zzhf.zze();
                                zzic.zzc();
                                zzhn.zze();
                                zze = new zzhc(context, zzir.zza(new zzim() { // from class: com.google.android.gms.internal.measurement.zzhs
                                    @Override // com.google.android.gms.internal.measurement.zzim
                                    public final Object zza() {
                                        Context context2 = context;
                                        int i = zzib.zzc;
                                        return zzho.zza(context2);
                                    }
                                }));
                                zzi.incrementAndGet();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract Object zza(Object obj);

    /* JADX WARN: Code duplicated, block: B:14:0x003e A[PHI: r2
  0x003e: PHI (r2v1 com.google.android.gms.internal.measurement.zzii) = (r2v0 com.google.android.gms.internal.measurement.zzii), (r2v5 com.google.android.gms.internal.measurement.zzii) binds: [B:8:0x0016, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    public final Object zzb() {
        String strZza;
        zzhk zzhkVarZza;
        Object objZzb;
        int i = zzi.get();
        if (this.zzk < i) {
            synchronized (this) {
                try {
                    if (this.zzk < i) {
                        zzhz zzhzVar = zze;
                        zzii zziiVarZzc = zzii.zzc();
                        Object objZza = null;
                        if (zzhzVar != null) {
                            zziiVarZzc = (zzii) zzhzVar.zzb().zza();
                            if (zziiVarZzc.zzb()) {
                                zzhh zzhhVar = (zzhh) zziiVarZzc.zza();
                                zzhy zzhyVar = this.zza;
                                strZza = zzhhVar.zza(zzhyVar.zza, null, zzhyVar.zzc, this.zzb);
                            } else {
                                strZza = null;
                            }
                        } else {
                            strZza = null;
                        }
                        if (zzhzVar == null) {
                            throw new IllegalStateException("Must call PhenotypeFlag.init() first");
                        }
                        Uri uri = this.zza.zza;
                        if (uri != null) {
                            zzhkVarZza = zzhp.zza(zzhzVar.zza(), uri) ? zzhf.zza(zzhzVar.zza().getContentResolver(), this.zza.zza, new Runnable() { // from class: com.google.android.gms.internal.measurement.zzhr
                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzib.zzc();
                                }
                            }) : null;
                        } else {
                            zzhkVarZza = zzic.zza(zzhzVar.zza(), null, new Runnable() { // from class: com.google.android.gms.internal.measurement.zzhr
                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzib.zzc();
                                }
                            });
                        }
                        Object objZza2 = (zzhkVarZza == null || (objZzb = zzhkVarZza.zzb(this.zzb)) == null) ? null : zza(objZzb);
                        if (objZza2 == null) {
                            if (!this.zza.zzd) {
                                String strZzc = zzhn.zza(zzhzVar.zza()).zzb(this.zza.zzd ? null : this.zzb);
                                if (strZzc != null) {
                                    objZza = zza(strZzc);
                                }
                            }
                            objZza2 = objZza == null ? this.zzj : objZza;
                        }
                        if (zziiVarZzc.zzb()) {
                            objZza2 = strZza == null ? this.zzj : zza(strZza);
                        }
                        this.zzl = objZza2;
                        this.zzk = i;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.zzl;
    }
}
