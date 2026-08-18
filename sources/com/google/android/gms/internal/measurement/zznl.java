package com.google.android.gms.internal.measurement;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zznl {
    private static final zznl zza = new zznl(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zznl(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static zznl zzc() {
        return zza;
    }

    public static zznl zze(zznl zznlVar, zznl zznlVar2) {
        int i = zznlVar.zzb + zznlVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zznlVar.zzc, i);
        System.arraycopy(zznlVar2.zzc, 0, iArrCopyOf, zznlVar.zzb, zznlVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zznlVar.zzd, i);
        System.arraycopy(zznlVar2.zzd, 0, objArrCopyOf, zznlVar.zzb, zznlVar2.zzb);
        return new zznl(i, iArrCopyOf, objArrCopyOf, true);
    }

    public static zznl zzf() {
        return new zznl(0, new int[8], new Object[8], true);
    }

    private final void zzl(int i) {
        int[] iArr = this.zzc;
        if (i > iArr.length) {
            int i2 = this.zzb;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i);
            this.zzd = Arrays.copyOf(this.zzd, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zznl)) {
            return false;
        }
        zznl zznlVar = (zznl) obj;
        int i = this.zzb;
        if (i == zznlVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zznlVar.zzc;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.zzd;
            Object[] objArr2 = zznlVar.zzd;
            int i3 = this.zzb;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        int i2 = i + 527;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 * 31) + i3;
        Object[] objArr = this.zzd;
        int i6 = this.zzb;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return (i5 * 31) + iHashCode;
    }

    public final int zza() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int iV = 0;
        for (int i2 = 0; i2 < this.zzb; i2++) {
            int i3 = this.zzc[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 == 0) {
                iV = AbstractC3888ke0.v(i4 << 3, zzki.zzy(((Long) this.zzd[i2]).longValue()), iV);
            } else if (i5 == 1) {
                ((Long) this.zzd[i2]).getClass();
                iV = AbstractC3888ke0.v(i4 << 3, 8, iV);
            } else if (i5 == 2) {
                zzka zzkaVar = (zzka) this.zzd[i2];
                int i6 = zzki.zzb;
                int iZzd = zzkaVar.zzd();
                iV = AbstractC3888ke0.v(i4 << 3, zzki.zzx(iZzd) + iZzd, iV);
            } else if (i5 == 3) {
                int i7 = i4 << 3;
                int i8 = zzki.zzb;
                int iZza = ((zznl) this.zzd[i2]).zza();
                int iZzx = zzki.zzx(i7);
                iV = iZzx + iZzx + iZza + iV;
            } else {
                if (i5 != 5) {
                    throw new IllegalStateException(zzll.zza());
                }
                ((Integer) this.zzd[i2]).getClass();
                iV = AbstractC3888ke0.v(i4 << 3, 4, iV);
            }
        }
        this.zze = iV;
        return iV;
    }

    public final int zzb() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int iD = 0;
        for (int i2 = 0; i2 < this.zzb; i2++) {
            int i3 = this.zzc[i2] >>> 3;
            zzka zzkaVar = (zzka) this.zzd[i2];
            int i4 = zzki.zzb;
            int iZzd = zzkaVar.zzd();
            int iZzx = zzki.zzx(iZzd) + iZzd;
            int iZzx2 = zzki.zzx(16);
            int iZzx3 = zzki.zzx(i3);
            int iZzx4 = zzki.zzx(8);
            iD = AbstractC3888ke0.d(24, iZzx, iZzx2 + iZzx3 + iZzx4 + iZzx4, iD);
        }
        this.zze = iD;
        return iD;
    }

    public final zznl zzd(zznl zznlVar) {
        if (zznlVar.equals(zza)) {
            return this;
        }
        zzg();
        int i = this.zzb + zznlVar.zzb;
        zzl(i);
        System.arraycopy(zznlVar.zzc, 0, this.zzc, this.zzb, zznlVar.zzb);
        System.arraycopy(zznlVar.zzd, 0, this.zzd, this.zzb, zznlVar.zzb);
        this.zzb = i;
        return this;
    }

    public final void zzg() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    public final void zzi(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzmk.zzb(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }

    public final void zzj(int i, Object obj) {
        zzg();
        zzl(this.zzb + 1);
        int[] iArr = this.zzc;
        int i2 = this.zzb;
        iArr[i2] = i;
        this.zzd[i2] = obj;
        this.zzb = i2 + 1;
    }

    public final void zzk(zzoc zzocVar) throws IOException {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i2 = this.zzc[i];
                Object obj = this.zzd[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    zzocVar.zzt(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    zzocVar.zzm(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    zzocVar.zzd(i4, (zzka) obj);
                } else if (i3 == 3) {
                    zzocVar.zzE(i4);
                    ((zznl) obj).zzk(zzocVar);
                    zzocVar.zzh(i4);
                } else {
                    if (i3 != 5) {
                        throw new RuntimeException(zzll.zza());
                    }
                    zzocVar.zzk(i4, ((Integer) obj).intValue());
                }
            }
        }
    }

    private zznl() {
        this(0, new int[8], new Object[8], true);
    }
}
