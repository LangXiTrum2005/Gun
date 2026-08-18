package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgha implements zzgdn {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = new byte[0];
    private static final Set zzc;
    private final String zzd;
    private final zzgdn zze;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzc = Collections.unmodifiableSet(hashSet);
    }

    @Deprecated
    public zzgha(zzgsp zzgspVar, zzgdn zzgdnVar) throws GeneralSecurityException {
        if (!zzc.contains(zzgspVar.zzi())) {
            throw new IllegalArgumentException(DM.B("Unsupported DEK key type: ", zzgspVar.zzi(), ". Only Tink AEAD key types are supported."));
        }
        this.zzd = zzgspVar.zzi();
        zzgsn zzgsnVarZzb = zzgsp.zzb(zzgspVar);
        zzgsnVarZzb.zza(zzgtp.RAW);
        zzgeq.zza(((zzgsp) zzgsnVarZzb.zzbr()).zzaV());
        this.zze = zzgdnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgdn
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i = byteBufferWrap.getInt();
            if (i <= 0 || i > 4096 || i > bArr.length - 4) {
                throw new GeneralSecurityException("length of encrypted DEK too large");
            }
            byte[] bArr3 = new byte[i];
            byteBufferWrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
            byte[] bArrZza = this.zze.zza(bArr3, zzb);
            String str = this.zzd;
            zzgwj zzgwjVar = zzgwj.zzb;
            return ((zzgdn) zzgmh.zza().zzc(zzgmk.zzc().zza(zzgnh.zza(str, zzgwj.zzv(bArrZza, 0, bArrZza.length), zzgsj.SYMMETRIC, zzgtp.RAW, null), zzgdw.zza()), zzgdn.class)).zza(bArr4, bArr2);
        } catch (IndexOutOfBoundsException e) {
            e = e;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e2) {
            e = e2;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e3) {
            e = e3;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
