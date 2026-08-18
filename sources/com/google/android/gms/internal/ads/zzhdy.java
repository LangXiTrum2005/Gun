package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzhdy implements zzaqz {
    private static final zzhej zzg = zzhej.zzb(zzhdy.class);
    protected final String zza;
    long zzd;
    zzhed zzf;
    private ByteBuffer zzh;
    long zze = -1;
    boolean zzc = true;
    boolean zzb = true;

    public zzhdy(String str) {
        this.zza = str;
    }

    private final synchronized void zzc() {
        try {
            if (this.zzc) {
                return;
            }
            try {
                zzhej zzhejVar = zzg;
                String str = this.zza;
                zzhejVar.zza(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
                this.zzh = this.zzf.zzd(this.zzd, this.zze);
                this.zzc = true;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqz
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaqz
    public final void zzb(zzhed zzhedVar, ByteBuffer byteBuffer, long j, zzaqw zzaqwVar) throws IOException {
        this.zzd = zzhedVar.zzb();
        byteBuffer.remaining();
        this.zze = j;
        this.zzf = zzhedVar;
        zzhedVar.zze(zzhedVar.zzb() + j);
        this.zzc = false;
        this.zzb = false;
        zzf();
    }

    public abstract void zze(ByteBuffer byteBuffer);

    public final synchronized void zzf() {
        try {
            zzc();
            zzhej zzhejVar = zzg;
            String str = this.zza;
            zzhejVar.zza(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
            ByteBuffer byteBuffer = this.zzh;
            if (byteBuffer != null) {
                this.zzb = true;
                byteBuffer.rewind();
                zze(byteBuffer);
                if (byteBuffer.remaining() > 0) {
                    byteBuffer.slice();
                }
                this.zzh = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
