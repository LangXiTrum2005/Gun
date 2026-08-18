package com.google.android.gms.ads.internal.util.client;

import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.internal.ads.zzfvc;

/* JADX INFO: loaded from: classes2.dex */
public class zzo {
    protected static final zzfvc zza = zzfvc.zza(4000);

    @VisibleForTesting
    public static String zzd(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length < 4) {
            return str;
        }
        return str + " @" + stackTrace[3].getLineNumber();
    }

    public static void zze(String str) {
        if (!zzm(3) || str.length() <= 4000) {
            return;
        }
        for (String str2 : zza.zzd(str)) {
        }
    }

    public static void zzf(String str, Throwable th) {
        zzm(3);
    }

    public static void zzg(String str) {
        if (!zzm(6) || str == null || str.length() <= 4000) {
            return;
        }
        for (String str2 : zza.zzd(str)) {
        }
    }

    public static void zzh(String str, Throwable th) {
        zzm(6);
    }

    public static void zzi(String str) {
        if (!zzm(4) || str == null || str.length() <= 4000) {
            return;
        }
        for (String str2 : zza.zzd(str)) {
        }
    }

    public static void zzj(String str) {
        if (!zzm(5) || str == null || str.length() <= 4000) {
            return;
        }
        for (String str2 : zza.zzd(str)) {
        }
    }

    public static void zzk(String str, Throwable th) {
        zzm(5);
    }

    public static void zzl(String str, @Nullable Throwable th) {
        if (zzm(5)) {
            if (th != null) {
                zzk(zzd(str), th);
            } else {
                zzj(zzd(str));
            }
        }
    }

    public static boolean zzm(int i) {
        return i >= 5 || Log.isLoggable("Ads", i);
    }
}
