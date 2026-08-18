package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzaqv implements zzaqw {
    private static final Logger zzb = Logger.getLogger(zzaqv.class.getName());
    final ThreadLocal zza = new zzaqu(this);

    public abstract zzaqz zza(String str, byte[] bArr, String str2);

    @Override // com.google.android.gms.internal.ads.zzaqw
    public final zzaqz zzb(zzhed zzhedVar, zzara zzaraVar) throws IOException {
        int iZza;
        long jZzc;
        long jZzb = zzhedVar.zzb();
        ((ByteBuffer) this.zza.get()).rewind().limit(8);
        do {
            iZza = zzhedVar.zza((ByteBuffer) this.zza.get());
            if (iZza == 8) {
                ((ByteBuffer) this.zza.get()).rewind();
                long jZze = zzaqy.zze((ByteBuffer) this.zza.get());
                byte[] bArr = null;
                if (jZze < 8 && jZze > 1) {
                    Logger logger = zzb;
                    Level level = Level.SEVERE;
                    StringBuilder sb = new StringBuilder(80);
                    sb.append("Plausibility check failed: size < 8 (size = ");
                    sb.append(jZze);
                    sb.append("). Stop parsing!");
                    logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                    return null;
                }
                byte[] bArr2 = new byte[4];
                ((ByteBuffer) this.zza.get()).get(bArr2);
                try {
                    String str = new String(bArr2, "ISO-8859-1");
                    if (jZze == 1) {
                        ((ByteBuffer) this.zza.get()).limit(16);
                        zzhedVar.zza((ByteBuffer) this.zza.get());
                        ((ByteBuffer) this.zza.get()).position(8);
                        jZzc = zzaqy.zzf((ByteBuffer) this.zza.get()) - 16;
                    } else {
                        jZzc = jZze == 0 ? zzhedVar.zzc() - zzhedVar.zzb() : jZze - 8;
                    }
                    if ("uuid".equals(str)) {
                        ((ByteBuffer) this.zza.get()).limit(((ByteBuffer) this.zza.get()).limit() + 16);
                        zzhedVar.zza((ByteBuffer) this.zza.get());
                        bArr = new byte[16];
                        for (int iPosition = ((ByteBuffer) this.zza.get()).position() - 16; iPosition < ((ByteBuffer) this.zza.get()).position(); iPosition++) {
                            bArr[iPosition - (((ByteBuffer) this.zza.get()).position() - 16)] = ((ByteBuffer) this.zza.get()).get(iPosition);
                        }
                        jZzc -= 16;
                    }
                    long j = jZzc;
                    zzaqz zzaqzVarZza = zza(str, bArr, zzaraVar instanceof zzaqz ? ((zzaqz) zzaraVar).zza() : "");
                    ((ByteBuffer) this.zza.get()).rewind();
                    zzaqzVarZza.zzb(zzhedVar, (ByteBuffer) this.zza.get(), j, this);
                    return zzaqzVarZza;
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException(e);
                }
            }
        } while (iZza >= 0);
        zzhedVar.zze(jZzb);
        throw new EOFException();
    }
}
