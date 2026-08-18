package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class zzvr {
    private final zzdy zza = new zzdy(32);
    private zzvq zzb;
    private zzvq zzc;
    private zzvq zzd;
    private long zze;
    private final zzyk zzf;

    public zzvr(zzyk zzykVar) {
        this.zzf = zzykVar;
        zzvq zzvqVar = new zzvq(0L, 65536);
        this.zzb = zzvqVar;
        this.zzc = zzvqVar;
        this.zzd = zzvqVar;
    }

    private final int zzi(int i) {
        zzvq zzvqVar = this.zzd;
        if (zzvqVar.zzc == null) {
            zzyd zzydVarZzb = this.zzf.zzb();
            zzvq zzvqVar2 = new zzvq(this.zzd.zzb, 65536);
            zzvqVar.zzc = zzydVarZzb;
            zzvqVar.zzd = zzvqVar2;
        }
        return Math.min(i, (int) (this.zzd.zzb - this.zze));
    }

    private static zzvq zzj(zzvq zzvqVar, long j) {
        while (j >= zzvqVar.zzb) {
            zzvqVar = zzvqVar.zzd;
        }
        return zzvqVar;
    }

    private static zzvq zzk(zzvq zzvqVar, long j, ByteBuffer byteBuffer, int i) {
        zzvq zzvqVarZzj = zzj(zzvqVar, j);
        while (i > 0) {
            int iMin = Math.min(i, (int) (zzvqVarZzj.zzb - j));
            byteBuffer.put(zzvqVarZzj.zzc.zza, zzvqVarZzj.zza(j), iMin);
            i -= iMin;
            j += (long) iMin;
            if (j == zzvqVarZzj.zzb) {
                zzvqVarZzj = zzvqVarZzj.zzd;
            }
        }
        return zzvqVarZzj;
    }

    private static zzvq zzl(zzvq zzvqVar, long j, byte[] bArr, int i) {
        zzvq zzvqVarZzj = zzj(zzvqVar, j);
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (zzvqVarZzj.zzb - j));
            System.arraycopy(zzvqVarZzj.zzc.zza, zzvqVarZzj.zza(j), bArr, i - i2, iMin);
            i2 -= iMin;
            j += (long) iMin;
            if (j == zzvqVarZzj.zzb) {
                zzvqVarZzj = zzvqVarZzj.zzd;
            }
        }
        return zzvqVarZzj;
    }

    private static zzvq zzm(zzvq zzvqVar, zzhh zzhhVar, zzvt zzvtVar, zzdy zzdyVar) {
        zzvq zzvqVarZzl;
        int iZzq;
        if (zzhhVar.zzl()) {
            long j = zzvtVar.zzb;
            zzdyVar.zzI(1);
            zzvq zzvqVarZzl2 = zzl(zzvqVar, j, zzdyVar.zzN(), 1);
            long j2 = j + 1;
            byte b = zzdyVar.zzN()[0];
            int i = b & 128;
            int i2 = b & 127;
            zzhe zzheVar = zzhhVar.zzb;
            byte[] bArr = zzheVar.zza;
            if (bArr == null) {
                zzheVar.zza = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z = i != 0;
            zzvqVarZzl = zzl(zzvqVarZzl2, j2, zzheVar.zza, i2);
            long j3 = j2 + ((long) i2);
            if (z) {
                zzdyVar.zzI(2);
                zzvqVarZzl = zzl(zzvqVarZzl, j3, zzdyVar.zzN(), 2);
                j3 += 2;
                iZzq = zzdyVar.zzq();
            } else {
                iZzq = 1;
            }
            int[] iArr = zzheVar.zzd;
            if (iArr == null || iArr.length < iZzq) {
                iArr = new int[iZzq];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zzheVar.zze;
            if (iArr3 == null || iArr3.length < iZzq) {
                iArr3 = new int[iZzq];
            }
            int[] iArr4 = iArr3;
            if (z) {
                int i3 = iZzq * 6;
                zzdyVar.zzI(i3);
                zzvqVarZzl = zzl(zzvqVarZzl, j3, zzdyVar.zzN(), i3);
                j3 += (long) i3;
                zzdyVar.zzL(0);
                for (int i4 = 0; i4 < iZzq; i4++) {
                    iArr2[i4] = zzdyVar.zzq();
                    iArr4[i4] = zzdyVar.zzp();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = zzvtVar.zza - ((int) (j3 - zzvtVar.zzb));
            }
            zzads zzadsVar = zzvtVar.zzc;
            int i5 = zzei.zza;
            zzheVar.zzc(iZzq, iArr2, iArr4, zzadsVar.zzb, zzheVar.zza, zzadsVar.zza, zzadsVar.zzc, zzadsVar.zzd);
            long j4 = zzvtVar.zzb;
            int i6 = (int) (j3 - j4);
            zzvtVar.zzb = j4 + ((long) i6);
            zzvtVar.zza -= i6;
        } else {
            zzvqVarZzl = zzvqVar;
        }
        if (!zzhhVar.zze()) {
            zzhhVar.zzj(zzvtVar.zza);
            return zzk(zzvqVarZzl, zzvtVar.zzb, zzhhVar.zzc, zzvtVar.zza);
        }
        zzdyVar.zzI(4);
        zzvq zzvqVarZzl3 = zzl(zzvqVarZzl, zzvtVar.zzb, zzdyVar.zzN(), 4);
        int iZzp = zzdyVar.zzp();
        zzvtVar.zzb += 4;
        zzvtVar.zza -= 4;
        zzhhVar.zzj(iZzp);
        zzvq zzvqVarZzk = zzk(zzvqVarZzl3, zzvtVar.zzb, zzhhVar.zzc, iZzp);
        zzvtVar.zzb += (long) iZzp;
        int i7 = zzvtVar.zza - iZzp;
        zzvtVar.zza = i7;
        ByteBuffer byteBuffer = zzhhVar.zzf;
        if (byteBuffer == null || byteBuffer.capacity() < i7) {
            zzhhVar.zzf = ByteBuffer.allocate(i7);
        } else {
            zzhhVar.zzf.clear();
        }
        return zzk(zzvqVarZzk, zzvtVar.zzb, zzhhVar.zzf, zzvtVar.zza);
    }

    private final void zzn(int i) {
        long j = this.zze + ((long) i);
        this.zze = j;
        zzvq zzvqVar = this.zzd;
        if (j == zzvqVar.zzb) {
            this.zzd = zzvqVar.zzd;
        }
    }

    public final int zza(zzl zzlVar, int i, boolean z) throws IOException {
        int iZzi = zzi(i);
        zzvq zzvqVar = this.zzd;
        int iZza = zzlVar.zza(zzvqVar.zzc.zza, zzvqVar.zza(this.zze), iZzi);
        if (iZza != -1) {
            zzn(iZza);
            return iZza;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    public final long zzb() {
        return this.zze;
    }

    public final void zzc(long j) {
        zzvq zzvqVar;
        if (j != -1) {
            while (true) {
                zzvqVar = this.zzb;
                if (j < zzvqVar.zzb) {
                    break;
                }
                this.zzf.zzc(zzvqVar.zzc);
                this.zzb = this.zzb.zzb();
            }
            if (this.zzc.zza < zzvqVar.zza) {
                this.zzc = zzvqVar;
            }
        }
    }

    public final void zzd(zzhh zzhhVar, zzvt zzvtVar) {
        zzm(this.zzc, zzhhVar, zzvtVar, this.zza);
    }

    public final void zze(zzhh zzhhVar, zzvt zzvtVar) {
        this.zzc = zzm(this.zzc, zzhhVar, zzvtVar, this.zza);
    }

    public final void zzf() {
        zzvq zzvqVar = this.zzb;
        if (zzvqVar.zzc != null) {
            this.zzf.zzd(zzvqVar);
            zzvqVar.zzb();
        }
        this.zzb.zze(0L, 65536);
        zzvq zzvqVar2 = this.zzb;
        this.zzc = zzvqVar2;
        this.zzd = zzvqVar2;
        this.zze = 0L;
        this.zzf.zzg();
    }

    public final void zzg() {
        this.zzc = this.zzb;
    }

    public final void zzh(zzdy zzdyVar, int i) {
        while (i > 0) {
            int iZzi = zzi(i);
            zzvq zzvqVar = this.zzd;
            zzdyVar.zzH(zzvqVar.zzc.zza, zzvqVar.zza(this.zze), iZzi);
            i -= iZzi;
            zzn(iZzi);
        }
    }
}
