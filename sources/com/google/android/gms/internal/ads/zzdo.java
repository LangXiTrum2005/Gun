package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.Size;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdo {
    private static final Object zza = new Object();

    public static String zza(String str, @Nullable Throwable th) {
        String strReplace;
        if (th != null) {
            synchronized (zza) {
                Throwable cause = th;
                while (true) {
                    if (cause == null) {
                        strReplace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                            break;
                        }
                        cause = cause.getCause();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        } else {
            strReplace = null;
        }
        return !TextUtils.isEmpty(strReplace) ? AbstractC3888ke0.j(str, "\n  ", strReplace.replace("\n", "\n  "), "\n") : str;
    }

    public static void zzb(@Size(max = 23) String str, String str2) {
        synchronized (zza) {
            zza(str2, null);
        }
    }

    public static void zzc(@Size(max = 23) String str, String str2) {
        synchronized (zza) {
            zza(str2, null);
        }
    }

    public static void zzd(@Size(max = 23) String str, String str2, @Nullable Throwable th) {
        synchronized (zza) {
            zza(str2, th);
        }
    }

    public static void zze(@Size(max = 23) String str, String str2) {
        synchronized (zza) {
            zza(str2, null);
        }
    }

    public static void zzf(@Size(max = 23) String str, String str2) {
        synchronized (zza) {
            zza(str2, null);
        }
    }

    public static void zzg(@Size(max = 23) String str, String str2, @Nullable Throwable th) {
        synchronized (zza) {
            zza(str2, th);
        }
    }
}
