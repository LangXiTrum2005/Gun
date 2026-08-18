package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfpg {
    private static final HashMap zza = new HashMap();
    private final Context zzb;
    private final zzfph zzc;
    private final zzfni zzd;
    private final zzfnd zze;

    @Nullable
    private zzfov zzf;
    private final Object zzg = new Object();

    public zzfpg(@NonNull Context context, @NonNull zzfph zzfphVar, @NonNull zzfni zzfniVar, @NonNull zzfnd zzfndVar) {
        this.zzb = context;
        this.zzc = zzfphVar;
        this.zzd = zzfniVar;
        this.zze = zzfndVar;
    }

    private final synchronized Class zzd(@NonNull zzfow zzfowVar) throws zzfpf {
        try {
            String strZzk = zzfowVar.zza().zzk();
            HashMap map = zza;
            Class cls = (Class) map.get(strZzk);
            if (cls != null) {
                return cls;
            }
            try {
                if (!this.zze.zza(zzfowVar.zzc())) {
                    throw new zzfpf(2026, "VM did not pass signature verification");
                }
                try {
                    File fileZzb = zzfowVar.zzb();
                    if (!fileZzb.exists()) {
                        fileZzb.mkdirs();
                    }
                    Class<?> clsLoadClass = new DexClassLoader(zzfowVar.zzc().getAbsolutePath(), fileZzb.getAbsolutePath(), null, this.zzb.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                    map.put(strZzk, clsLoadClass);
                    return clsLoadClass;
                } catch (ClassNotFoundException e) {
                    e = e;
                    throw new zzfpf(2008, e);
                } catch (IllegalArgumentException e2) {
                    e = e2;
                    throw new zzfpf(2008, e);
                } catch (SecurityException e3) {
                    e = e3;
                    throw new zzfpf(2008, e);
                }
            } catch (GeneralSecurityException e4) {
                throw new zzfpf(2026, e4);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Nullable
    public final zzfnl zza() {
        zzfov zzfovVar;
        synchronized (this.zzg) {
            zzfovVar = this.zzf;
        }
        return zzfovVar;
    }

    @Nullable
    public final zzfow zzb() {
        synchronized (this.zzg) {
            try {
                zzfov zzfovVar = this.zzf;
                if (zzfovVar == null) {
                    return null;
                }
                return zzfovVar.zzf();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzc(@NonNull zzfow zzfowVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                zzfov zzfovVar = new zzfov(zzd(zzfowVar).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.zzb, "msa-r", zzfowVar.zze(), null, new Bundle(), 2), zzfowVar, this.zzc, this.zzd);
                if (!zzfovVar.zzh()) {
                    throw new zzfpf(4000, "init failed");
                }
                int iZze = zzfovVar.zze();
                if (iZze != 0) {
                    throw new zzfpf(4001, "ci: " + iZze);
                }
                synchronized (this.zzg) {
                    zzfov zzfovVar2 = this.zzf;
                    if (zzfovVar2 != null) {
                        try {
                            zzfovVar2.zzg();
                        } catch (zzfpf e) {
                            this.zzd.zzc(e.zza(), -1L, e);
                        }
                        this.zzf = zzfovVar;
                    } else {
                        this.zzf = zzfovVar;
                    }
                    throw th;
                }
                this.zzd.zzd(PathInterpolatorCompat.MAX_NUM_POINTS, System.currentTimeMillis() - jCurrentTimeMillis);
                return true;
            } catch (Exception e2) {
                throw new zzfpf(2004, e2);
            }
        } catch (zzfpf e3) {
            this.zzd.zzc(e3.zza(), System.currentTimeMillis() - jCurrentTimeMillis, e3);
            return false;
        } catch (Exception e4) {
            this.zzd.zzc(4010, System.currentTimeMillis() - jCurrentTimeMillis, e4);
            return false;
        }
    }
}
