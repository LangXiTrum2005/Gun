package com.google.android.gms.internal.ads;

import android.util.Log;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class zzapy {
    public static final String zza = "Volley";
    public static final boolean zzb = Log.isLoggable(zza, 2);
    private static final String zzc = zzapy.class.getName();

    public static void zza(String str, Object... objArr) {
        zze(str, objArr);
    }

    public static void zzb(String str, Object... objArr) {
        zze(str, objArr);
    }

    public static void zzc(Throwable th, String str, Object... objArr) {
        zze(str, objArr);
    }

    public static void zzd(String str, Object... objArr) {
        if (zzb) {
            zze(str, objArr);
        }
    }

    private static String zze(String str, Object... objArr) {
        String strI;
        String str2 = String.format(Locale.US, str, objArr);
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        for (int i = 2; i < stackTrace.length; i++) {
            if (!stackTrace[i].getClassName().equals(zzc)) {
                String className = stackTrace[i].getClassName();
                String strSubstring = className.substring(className.lastIndexOf(46) + 1);
                strI = DM.i(strSubstring.substring(strSubstring.lastIndexOf(36) + 1), ".", stackTrace[i].getMethodName());
                Locale locale = Locale.US;
                long id = Thread.currentThread().getId();
                StringBuilder sb = new StringBuilder("[");
                sb.append(id);
                sb.append("] ");
                sb.append(strI);
                return DM.m(sb, ": ", str2);
            }
        }
        strI = "<unknown>";
        Locale locale2 = Locale.US;
        long id2 = Thread.currentThread().getId();
        StringBuilder sb2 = new StringBuilder("[");
        sb2.append(id2);
        sb2.append("] ");
        sb2.append(strI);
        return DM.m(sb2, ": ", str2);
    }
}
