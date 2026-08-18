package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class zzhh extends zzhb {

    @Nullable
    public zzab zza;
    public final zzhe zzb = new zzhe();

    @Nullable
    public ByteBuffer zzc;
    public boolean zzd;
    public long zze;

    @Nullable
    public ByteBuffer zzf;
    private final int zzg;

    static {
        zzas.zzb("media3.decoder");
    }

    public zzhh(int i, int i2) {
        this.zzg = i;
    }

    private final ByteBuffer zzm(int i) {
        int i2 = this.zzg;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.zzc;
        throw new zzhg(byteBuffer == null ? 0 : byteBuffer.capacity(), i);
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public void zzb() {
        super.zzb();
        ByteBuffer byteBuffer = this.zzc;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.zzf;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.zzd = false;
    }

    public final void zzj(int i) {
        ByteBuffer byteBuffer = this.zzc;
        if (byteBuffer == null) {
            this.zzc = zzm(i);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i2 = i + iPosition;
        if (iCapacity >= i2) {
            this.zzc = byteBuffer;
            return;
        }
        ByteBuffer byteBufferZzm = zzm(i2);
        byteBufferZzm.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferZzm.put(byteBuffer);
        }
        this.zzc = byteBufferZzm;
    }

    public final void zzk() {
        ByteBuffer byteBuffer = this.zzc;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.zzf;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean zzl() {
        return zzd(1073741824);
    }
}
