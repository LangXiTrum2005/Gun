package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.UserManager;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhb {

    @GuardedBy("DirectBootUtils.class")
    private static UserManager zza;
    private static volatile boolean zzb = !zzb();

    private zzhb() {
    }

    /* JADX WARN: Code duplicated, block: B:32:0x004a A[Catch: all -> 0x0015, TryCatch #0 {all -> 0x0015, blocks: (B:9:0x000f, B:11:0x0013, B:18:0x001d, B:20:0x0021, B:21:0x0029, B:34:0x004e, B:35:0x0050, B:24:0x002f, B:26:0x0035, B:32:0x004a, B:30:0x0043), top: B:41:0x000f, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x004e A[Catch: all -> 0x0015, TryCatch #0 {all -> 0x0015, blocks: (B:9:0x000f, B:11:0x0013, B:18:0x001d, B:20:0x0021, B:21:0x0029, B:34:0x004e, B:35:0x0050, B:24:0x002f, B:26:0x0035, B:32:0x004a, B:30:0x0043), top: B:41:0x000f, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0053 A[RETURN] */
    public static boolean zza(Context context) {
        boolean z;
        if (zzb() && !zzb) {
            synchronized (zzhb.class) {
                try {
                    if (!zzb) {
                        int i = 1;
                        while (true) {
                            if (i <= 2) {
                                if (zza == null) {
                                    zza = (UserManager) context.getSystemService(UserManager.class);
                                }
                                UserManager userManager = zza;
                                if (userManager == null) {
                                    z = true;
                                } else {
                                    try {
                                        z = userManager.isUserUnlocked() || !userManager.isUserRunning(Process.myUserHandle());
                                        if (z) {
                                            zza = null;
                                        }
                                    } catch (NullPointerException unused) {
                                        zza = null;
                                        i++;
                                    }
                                }
                                if (z) {
                                    zzb = true;
                                }
                                if (!z) {
                                    return true;
                                }
                            }
                            if (z) {
                                zza = null;
                            }
                            if (z) {
                                zzb = true;
                            }
                            if (!z) {
                                return true;
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return false;
    }

    @ChecksSdkIntAtLeast(api = 24)
    public static boolean zzb() {
        return Build.VERSION.SDK_INT >= 24;
    }
}
