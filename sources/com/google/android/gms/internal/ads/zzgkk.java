package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgkk implements zzgdn {
    private final byte[] zza;
    private final byte[] zzb;

    private zzgkk(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!zzgks.zza(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (!zzc()) {
            throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
        }
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.zza = bArr;
        this.zzb = bArr2;
    }

    public static zzgdn zzb(zzgil zzgilVar) throws GeneralSecurityException {
        return new zzgkk(zzgilVar.zzd().zzd(zzgdw.zza()), zzgilVar.zzc().zzc());
    }

    public static boolean zzc() {
        return zzgjp.zzc() != null;
    }

    @Override // com.google.android.gms.internal.ads.zzgdn
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        byte[] bArr3 = this.zzb;
        int length = bArr.length;
        if (length < bArr3.length + 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!zzgnu.zzc(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = new byte[24];
        System.arraycopy(bArr, this.zzb.length, bArr4, 0, 24);
        int[] iArrZzd = zzgjv.zzd(zzgjv.zze(this.zza), zzgjv.zze(bArr4));
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(iArrZzd.length * 4).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrZzd);
        SecretKeySpec secretKeySpec = new SecretKeySpec(byteBufferOrder.array(), "ChaCha20");
        byte[] bArr5 = new byte[12];
        System.arraycopy(bArr4, 16, bArr5, 4, 8);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr5);
        Cipher cipherZzc = zzgjp.zzc();
        cipherZzc.init(2, secretKeySpec, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipherZzc.updateAAD(bArr2);
        }
        int length2 = this.zzb.length;
        return cipherZzc.doFinal(bArr, length2 + 24, (length - length2) - 24);
    }
}
