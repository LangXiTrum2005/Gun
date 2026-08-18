package com.google.android.gms.internal.ads;

import android.util.Base64;
import androidx.annotation.VisibleForTesting;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfcy {
    @VisibleForTesting
    public zzfcy() {
        try {
            zzges.zza();
        } catch (GeneralSecurityException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to Configure Aead. ".concat(e.toString()));
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "CryptoUtils.registerAead");
        }
    }

    public static final String zza() {
        byte[] byteArray;
        try {
            zzgeg zzgegVarZzb = zzgeg.zzb(zzgea.zza(zzgmg.zzb().zza("AES128_GCM")));
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                zzgdq.zzb(zzgegVarZzb, zzgdp.zzb(byteArrayOutputStream));
                byteArray = byteArrayOutputStream.toByteArray();
            } catch (IOException unused) {
                throw new GeneralSecurityException("Serialize keyset failed");
            }
        } catch (GeneralSecurityException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to generate key".concat(e.toString()));
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "CryptoUtils.generateKey");
            byteArray = new byte[0];
        }
        return Base64.encodeToString(byteArray, 11);
    }

    @Nullable
    public static final String zzb(byte[] bArr, byte[] bArr2, @Nullable String str, zzdrq zzdrqVar) {
        zzgeg zzgegVarZzc;
        if (str != null && (zzgegVarZzc = zzc(str)) != null) {
            try {
                byte[] bArrZza = ((zzgdn) zzgegVarZzc.zzd(zzgnl.zzd(), zzgdn.class)).zza(bArr, bArr2);
                zzdrqVar.zzb().put("ds", "1");
                return new String(bArrZza, C.UTF8_NAME);
            } catch (UnsupportedEncodingException | UnsupportedOperationException | GeneralSecurityException e) {
                com.google.android.gms.ads.internal.util.zze.zza("Failed to decrypt ".concat(e.toString()));
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "CryptoUtils.decrypt");
                zzdrqVar.zzb().put("dsf", e.toString());
            }
        }
        return null;
    }

    @Nullable
    private static final zzgeg zzc(String str) {
        try {
            try {
                return zzgdq.zza(zzgdo.zzb(Base64.decode(str, 11)));
            } catch (IOException unused) {
                throw new GeneralSecurityException("Parse keyset failed");
            }
        } catch (GeneralSecurityException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to get keysethandle".concat(e.toString()));
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "CryptoUtils.getHandle");
            return null;
        }
    }
}
