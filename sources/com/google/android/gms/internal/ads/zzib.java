package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import androidx.core.view.PointerIconCompat;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzib extends zzbd {
    public final int zzc;

    @Nullable
    public final String zzd;
    public final int zze;

    @Nullable
    public final zzab zzf;
    public final int zzg;

    @Nullable
    public final zzug zzh;
    final boolean zzi;

    static {
        Integer.toString(1001, 36);
        Integer.toString(1002, 36);
        Integer.toString(PointerIconCompat.TYPE_HELP, 36);
        Integer.toString(1004, 36);
        Integer.toString(1005, 36);
        Integer.toString(PointerIconCompat.TYPE_CELL, 36);
    }

    private zzib(int i, Throwable th, int i2) {
        this(i, th, null, i2, null, -1, null, 4, false);
    }

    public static zzib zzb(Throwable th, String str, int i, @Nullable zzab zzabVar, int i2, boolean z, int i3) {
        return new zzib(1, th, null, i3, str, i, zzabVar, zzabVar == null ? 4 : i2, z);
    }

    public static zzib zzc(IOException iOException, int i) {
        return new zzib(0, iOException, i);
    }

    public static zzib zzd(RuntimeException runtimeException, int i) {
        return new zzib(2, runtimeException, i);
    }

    @CheckResult
    public final zzib zza(@Nullable zzug zzugVar) {
        String message = getMessage();
        int i = zzei.zza;
        return new zzib(message, getCause(), this.zza, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, zzugVar, this.zzb, this.zzi);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private zzib(int i, @Nullable Throwable th, @Nullable String str, int i2, @Nullable String str2, int i3, @Nullable zzab zzabVar, int i4, boolean z) {
        String strM;
        String str3;
        if (i == 0) {
            strM = "Source error";
        } else if (i != 1) {
            strM = "Unexpected runtime error";
        } else {
            String strValueOf = String.valueOf(zzabVar);
            int i5 = zzei.zza;
            if (i4 == 0) {
                str3 = "NO";
            } else if (i4 == 1) {
                str3 = "NO_UNSUPPORTED_TYPE";
            } else if (i4 == 2) {
                str3 = "NO_UNSUPPORTED_DRM";
            } else if (i4 == 3) {
                str3 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i4 != 4) {
                    throw new IllegalStateException();
                }
                str3 = "YES";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(" error, index=");
            sb.append(i3);
            sb.append(", format=");
            sb.append(strValueOf);
            strM = DM.m(sb, ", format_supported=", str3);
        }
        this(TextUtils.isEmpty(null) ? strM : strM.concat(": null"), th, i2, i, str2, i3, zzabVar, i4, null, SystemClock.elapsedRealtime(), z);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0022  */
    private zzib(String str, @Nullable Throwable th, int i, int i2, @Nullable String str2, int i3, @Nullable zzab zzabVar, int i4, @Nullable zzug zzugVar, long j, boolean z) {
        int i5;
        boolean z2;
        super(str, th, i, Bundle.EMPTY, j);
        if (z) {
            i5 = i2;
            if (i5 == 1) {
                i5 = 1;
            } else {
                z2 = false;
            }
            zzcw.zzd(z2);
            zzcw.zzd(th != null);
            this.zzc = i5;
            this.zzd = str2;
            this.zze = i3;
            this.zzf = zzabVar;
            this.zzg = i4;
            this.zzh = zzugVar;
            this.zzi = z;
        }
        i5 = i2;
        z2 = true;
        zzcw.zzd(z2);
        zzcw.zzd(th != null);
        this.zzc = i5;
        this.zzd = str2;
        this.zze = i3;
        this.zzf = zzabVar;
        this.zzg = i4;
        this.zzh = zzugVar;
        this.zzi = z;
    }
}
