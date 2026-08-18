package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
final class zzhal extends zzhan {
    public zzhal(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.ads.zzhan
    public final byte zza(long j) {
        return Memory.peekByte((int) j);
    }

    @Override // com.google.android.gms.internal.ads.zzhan
    public final double zzb(Object obj, long j) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j));
    }

    @Override // com.google.android.gms.internal.ads.zzhan
    public final float zzc(Object obj, long j) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j));
    }

    @Override // com.google.android.gms.internal.ads.zzhan
    public final void zzd(long j, byte[] bArr, long j2, long j3) {
        Memory.peekByteArray((int) j, bArr, (int) j2, (int) j3);
    }

    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.ads.zzhao.zzk(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.ads.zzhao.zzl(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z' boolean)' in method call: com.google.android.gms.internal.ads.zzhao.zzk(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r5v0 'z' boolean)' in method call: com.google.android.gms.internal.ads.zzhao.zzl(java.lang.Object, long, boolean):void */
    @Override // com.google.android.gms.internal.ads.zzhan
    public final void zze(Object obj, long j, boolean z) {
        if (zzhao.zzb) {
            zzhao.zzk(obj, j, z);
        } else {
            zzhao.zzl(obj, j, z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhan
    public final void zzf(Object obj, long j, byte b) {
        if (zzhao.zzb) {
            zzhao.zzG(obj, j, b);
        } else {
            zzhao.zzH(obj, j, b);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhan
    public final void zzg(Object obj, long j, double d) {
        this.zza.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // com.google.android.gms.internal.ads.zzhan
    public final void zzh(Object obj, long j, float f) {
        this.zza.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.google.android.gms.internal.ads.zzhan
    public final boolean zzi(Object obj, long j) {
        return zzhao.zzb ? zzhao.zzw(obj, j) : zzhao.zzx(obj, j);
    }
}
