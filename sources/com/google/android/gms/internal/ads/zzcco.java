package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcco {
    private long zza;

    public final long zza(ByteBuffer byteBuffer) {
        zzarc zzarcVar;
        zzarb zzarbVar;
        long j = this.zza;
        if (j > 0) {
            return j;
        }
        try {
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.flip();
            Iterator it = new zzaqx(new zzccn(byteBufferDuplicate), zzccr.zzb).zzd().iterator();
            while (true) {
                zzarcVar = null;
                if (!it.hasNext()) {
                    zzarbVar = null;
                    break;
                }
                zzaqz zzaqzVar = (zzaqz) it.next();
                if (zzaqzVar instanceof zzarb) {
                    zzarbVar = (zzarb) zzaqzVar;
                    break;
                }
            }
            for (zzaqz zzaqzVar2 : zzarbVar.zzd()) {
                if (zzaqzVar2 instanceof zzarc) {
                    zzarcVar = (zzarc) zzaqzVar2;
                    break;
                }
            }
            long jZzc = (zzarcVar.zzc() * 1000) / zzarcVar.zzd();
            this.zza = jZzc;
            return jZzc;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
