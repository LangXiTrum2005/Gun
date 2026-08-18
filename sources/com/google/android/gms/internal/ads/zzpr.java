package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
final class zzpr extends zzci {

    @Nullable
    private int[] zzd;

    @Nullable
    private int[] zze;

    @Override // com.google.android.gms.internal.ads.zzch
    public final void zze(ByteBuffer byteBuffer) {
        int[] iArr = this.zze;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferZzj = zzj(((iLimit - iPosition) / this.zzb.zze) * this.zzc.zze);
        while (iPosition < iLimit) {
            for (int i : iArr) {
                byteBufferZzj.putShort(byteBuffer.getShort(i + i + iPosition));
            }
            iPosition += this.zzb.zze;
        }
        byteBuffer.position(iLimit);
        byteBufferZzj.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final zzcf zzi(zzcf zzcfVar) throws zzcg {
        int[] iArr = this.zzd;
        if (iArr == null) {
            return zzcf.zza;
        }
        if (zzcfVar.zzd != 2) {
            throw new zzcg("Unhandled input format:", zzcfVar);
        }
        boolean z = zzcfVar.zzc != iArr.length;
        int i = 0;
        while (true) {
            int length = iArr.length;
            if (i >= length) {
                return z ? new zzcf(zzcfVar.zzb, length, 2) : zzcf.zza;
            }
            int i2 = iArr[i];
            if (i2 >= zzcfVar.zzc) {
                throw new zzcg("Unhandled input format:", zzcfVar);
            }
            z |= i2 != i;
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final void zzk() {
        this.zze = this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final void zzm() {
        this.zze = null;
        this.zzd = null;
    }

    public final void zzo(@Nullable int[] iArr) {
        this.zzd = iArr;
    }
}
