package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgn extends zzfr {

    @Nullable
    private RandomAccessFile zza;

    @Nullable
    private Uri zzb;
    private long zzc;
    private boolean zzd;

    public zzgn() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i, int i2) throws zzgm {
        if (i2 == 0) {
            return 0;
        }
        long j = this.zzc;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.zza;
            int i3 = zzei.zza;
            int i4 = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (i4 > 0) {
                this.zzc -= (long) i4;
                zzg(i4);
            }
            return i4;
        } catch (IOException e) {
            throw new zzgm(e, 2000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final long zzb(zzgd zzgdVar) throws zzgm {
        Uri uri = zzgdVar.zza;
        this.zzb = uri;
        zzi(zzgdVar);
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.zza = randomAccessFile;
            try {
                randomAccessFile.seek(zzgdVar.zze);
                long length = zzgdVar.zzf;
                if (length == -1) {
                    length = this.zza.length() - zzgdVar.zze;
                }
                this.zzc = length;
                if (length < 0) {
                    throw new zzgm(null, null, 2008);
                }
                this.zzd = true;
                zzj(zzgdVar);
                return this.zzc;
            } catch (IOException e) {
                throw new zzgm(e, 2000);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new zzgm(e2, ((e2.getCause() instanceof ErrnoException) && ((ErrnoException) e2.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder sbR = DM.r("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            sbR.append(fragment);
            throw new zzgm(sbR.toString(), e2, 1004);
        } catch (SecurityException e3) {
            throw new zzgm(e3, 2006);
        } catch (RuntimeException e4) {
            throw new zzgm(e4, 2000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    @Nullable
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final void zzd() throws zzgm {
        this.zzb = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.zza;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.zza = null;
                if (this.zzd) {
                    this.zzd = false;
                    zzh();
                }
            } catch (IOException e) {
                throw new zzgm(e, 2000);
            }
        } catch (Throwable th) {
            this.zza = null;
            if (this.zzd) {
                this.zzd = false;
                zzh();
            }
            throw th;
        }
    }
}
