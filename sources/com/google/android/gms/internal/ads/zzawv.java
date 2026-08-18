package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class zzawv extends zzaxr {
    public zzawv(zzawd zzawdVar, String str, String str2, zzasc zzascVar, int i, int i2) {
        super(zzawdVar, "mYdY7l5D+eRA2n+1DSS0l4Onm7QwkKst2ndSMEehloNd2MnZiOwv+qpmI2KWHSFP", "85J7Wr+LLVwpDfypFtzN1eoOiAfuTMa63SuSJgN9bwE=", zzascVar, i, 24);
    }

    private final void zzc() {
        AdvertisingIdClient advertisingIdClientZzh = this.zza.zzh();
        if (advertisingIdClientZzh == null) {
            return;
        }
        try {
            AdvertisingIdClient.Info info = advertisingIdClientZzh.getInfo();
            String id = info.getId();
            int i = zzawg.zza;
            if (id != null && id.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
                UUID uuidFromString = UUID.fromString(id);
                byte[] bArr = new byte[16];
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                byteBufferWrap.putLong(uuidFromString.getMostSignificantBits());
                byteBufferWrap.putLong(uuidFromString.getLeastSignificantBits());
                id = zzatr.zza(bArr, true);
            }
            if (id != null) {
                synchronized (this.zzd) {
                    this.zzd.zzs(id);
                    this.zzd.zzr(info.isLimitAdTrackingEnabled());
                    this.zzd.zzab(6);
                }
            }
        } catch (IOException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxr, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzk();
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaxr
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zza.zzq()) {
            zzc();
            return;
        }
        synchronized (this.zzd) {
            this.zzd.zzs((String) this.zze.invoke(null, this.zza.zzb()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxr
    public final Void zzk() throws Exception {
        if (this.zza.zzr()) {
            super.zzk();
            return null;
        }
        if (this.zza.zzq()) {
            zzc();
        }
        return null;
    }
}
