package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfq extends zzfr {
    private final AssetManager zza;

    @Nullable
    private Uri zzb;

    @Nullable
    private InputStream zzc;
    private long zzd;
    private boolean zze;

    public zzfq(Context context) {
        super(false);
        this.zza = context.getAssets();
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i, int i2) throws zzfp {
        if (i2 == 0) {
            return 0;
        }
        long j = this.zzd;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new zzfp(e, 2000);
            }
        }
        InputStream inputStream = this.zzc;
        int i3 = zzei.zza;
        int i4 = inputStream.read(bArr, i, i2);
        if (i4 == -1) {
            return -1;
        }
        long j2 = this.zzd;
        if (j2 != -1) {
            this.zzd = j2 - ((long) i4);
        }
        zzg(i4);
        return i4;
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final long zzb(zzgd zzgdVar) throws zzfp {
        try {
            Uri uri = zzgdVar.zza;
            this.zzb = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            zzi(zzgdVar);
            InputStream inputStreamOpen = this.zza.open(path, 1);
            this.zzc = inputStreamOpen;
            if (inputStreamOpen.skip(zzgdVar.zze) < zzgdVar.zze) {
                throw new zzfp(null, 2008);
            }
            long j = zzgdVar.zzf;
            if (j != -1) {
                this.zzd = j;
            } else {
                long jAvailable = this.zzc.available();
                this.zzd = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.zzd = -1L;
                }
            }
            this.zze = true;
            zzj(zzgdVar);
            return this.zzd;
        } catch (zzfp e) {
            throw e;
        } catch (IOException e2) {
            throw new zzfp(e2, true != (e2 instanceof FileNotFoundException) ? 2000 : 2005);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    @Nullable
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final void zzd() throws zzfp {
        this.zzb = null;
        try {
            try {
                InputStream inputStream = this.zzc;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.zzc = null;
                if (this.zze) {
                    this.zze = false;
                    zzh();
                }
            } catch (IOException e) {
                throw new zzfp(e, 2000);
            }
        } catch (Throwable th) {
            this.zzc = null;
            if (this.zze) {
                this.zze = false;
                zzh();
            }
            throw th;
        }
    }
}
