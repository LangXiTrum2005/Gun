package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
public abstract class zzazl {

    @Nullable
    private static MessageDigest zzb;
    protected final Object zza = new Object();

    @Nullable
    public final MessageDigest zza() {
        synchronized (this.zza) {
            MessageDigest messageDigest = zzb;
            if (messageDigest != null) {
                return messageDigest;
            }
            for (int i = 0; i < 2; i++) {
                try {
                    zzb = MessageDigest.getInstance(SameMD5.TAG);
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return zzb;
        }
    }

    public abstract byte[] zzb(String str);
}
