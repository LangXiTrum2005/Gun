package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import androidx.annotation.VisibleForTesting;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@VisibleForTesting
final class zzazn {

    @VisibleForTesting
    ByteArrayOutputStream zza = new ByteArrayOutputStream(4096);

    @VisibleForTesting
    Base64OutputStream zzb = new Base64OutputStream(this.zza, 10);

    public final String toString() {
        String string;
        try {
            this.zzb.close();
        } catch (IOException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("HashManager: Unable to convert to Base64.", e);
        }
        try {
            try {
                this.zza.close();
                string = this.zza.toString();
            } catch (IOException e2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("HashManager: Unable to convert to Base64.", e2);
                string = "";
            }
            return string;
        } finally {
            this.zza = null;
            this.zzb = null;
        }
    }
}
