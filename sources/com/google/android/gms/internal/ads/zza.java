package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.CheckResult;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zza {
    public static final /* synthetic */ int zzi = 0;
    public final long zza;
    public final int zzb;

    @Deprecated
    public final Uri[] zzc;
    public final zzar[] zzd;
    public final int[] zze;
    public final long[] zzf;
    public final long zzg;
    public final boolean zzh;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
    }

    public zza(long j) {
        this(0L, -1, -1, new int[0], new zzar[0], new long[0], 0L, false);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zza.class == obj.getClass()) {
            zza zzaVar = (zza) obj;
            if (this.zzb == zzaVar.zzb && Arrays.equals(this.zzd, zzaVar.zzd) && Arrays.equals(this.zze, zzaVar.zze) && Arrays.equals(this.zzf, zzaVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.zzf) + ((Arrays.hashCode(this.zze) + ((Arrays.hashCode(this.zzd) + (((this.zzb * 31) - 1) * 961)) * 31)) * 31)) * 961;
    }

    public final int zza(@IntRange(from = -1) int i) {
        int i2;
        int i3 = i + 1;
        while (true) {
            int[] iArr = this.zze;
            if (i3 >= iArr.length || (i2 = iArr[i3]) == 0 || i2 == 1) {
                break;
            }
            i3++;
        }
        return i3;
    }

    @CheckResult
    public final zza zzb(int i) {
        int[] iArr = this.zze;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = this.zzf;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, C.TIME_UNSET);
        return new zza(0L, 0, -1, iArrCopyOf, (zzar[]) Arrays.copyOf(this.zzd, 0), jArrCopyOf, 0L, false);
    }

    private zza(long j, int i, int i2, int[] iArr, zzar[] zzarVarArr, long[] jArr, long j2, boolean z) {
        Uri uri;
        int length = iArr.length;
        int length2 = zzarVarArr.length;
        int i3 = 0;
        zzcw.zzd(length == length2);
        this.zza = 0L;
        this.zzb = i;
        this.zze = iArr;
        this.zzd = zzarVarArr;
        this.zzf = jArr;
        this.zzg = 0L;
        this.zzh = false;
        this.zzc = new Uri[length2];
        while (true) {
            Uri[] uriArr = this.zzc;
            if (i3 >= uriArr.length) {
                return;
            }
            zzar zzarVar = zzarVarArr[i3];
            if (zzarVar == null) {
                uri = null;
            } else {
                zzam zzamVar = zzarVar.zzb;
                zzamVar.getClass();
                uri = zzamVar.zza;
            }
            uriArr[i3] = uri;
            i3++;
        }
    }
}
