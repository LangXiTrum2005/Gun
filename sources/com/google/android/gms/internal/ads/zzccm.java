package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class zzccm implements zzfy {
    private final Context zza;
    private final zzfy zzb;
    private final String zzc;
    private final int zzd;
    private final boolean zze;
    private InputStream zzf;
    private boolean zzg;
    private Uri zzh;
    private volatile zzbav zzi;
    private boolean zzj = false;
    private boolean zzk = false;
    private zzgd zzl;

    public zzccm(Context context, zzfy zzfyVar, String str, int i, zzgy zzgyVar, zzccl zzcclVar) {
        this.zza = context;
        this.zzb = zzfyVar;
        this.zzc = str;
        this.zzd = i;
        new AtomicLong(-1L);
        this.zze = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzbY)).booleanValue();
    }

    private final boolean zzg() {
        if (!this.zze) {
            return false;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzet)).booleanValue() || this.zzj) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzeu)).booleanValue() && !this.zzk;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        if (!this.zzg) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        }
        InputStream inputStream = this.zzf;
        return inputStream != null ? inputStream.read(bArr, i, i2) : this.zzb.zza(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final long zzb(zzgd zzgdVar) throws IOException {
        Long l;
        if (this.zzg) {
            throw new IOException("Attempt to open an already open CacheDataSource.");
        }
        this.zzg = true;
        Uri uri = zzgdVar.zza;
        this.zzh = uri;
        this.zzl = zzgdVar;
        this.zzi = zzbav.zza(uri);
        zzbas zzbasVarZzb = null;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzeq)).booleanValue()) {
            if (this.zzi != null) {
                this.zzi.zzh = zzgdVar.zze;
                this.zzi.zzi = zzfve.zzc(this.zzc);
                this.zzi.zzj = this.zzd;
                zzbasVarZzb = com.google.android.gms.ads.internal.zzv.zzc().zzb(this.zzi);
            }
            if (zzbasVarZzb != null && zzbasVarZzb.zze()) {
                this.zzj = zzbasVarZzb.zzg();
                this.zzk = zzbasVarZzb.zzf();
                if (!zzg()) {
                    this.zzf = zzbasVarZzb.zzc();
                    return -1L;
                }
            }
        } else if (this.zzi != null) {
            this.zzi.zzh = zzgdVar.zze;
            this.zzi.zzi = zzfve.zzc(this.zzc);
            this.zzi.zzj = this.zzd;
            if (this.zzi.zzg) {
                l = (Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzes);
            } else {
                l = (Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzer);
            }
            long jLongValue = l.longValue();
            com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime();
            com.google.android.gms.ads.internal.zzv.zzd();
            Future futureZza = zzbbg.zza(this.zza, this.zzi);
            try {
                try {
                    zzbbh zzbbhVar = (zzbbh) futureZza.get(jLongValue, TimeUnit.MILLISECONDS);
                    zzbbhVar.zzd();
                    this.zzj = zzbbhVar.zzf();
                    this.zzk = zzbbhVar.zze();
                    zzbbhVar.zza();
                    if (!zzg()) {
                        this.zzf = zzbbhVar.zzc();
                    }
                } catch (InterruptedException unused) {
                    futureZza.cancel(false);
                    Thread.currentThread().interrupt();
                } catch (ExecutionException | TimeoutException unused2) {
                    futureZza.cancel(false);
                }
            } catch (Throwable unused3) {
            }
            com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime();
            throw null;
        }
        if (this.zzi != null) {
            zzgb zzgbVarZza = zzgdVar.zza();
            zzgbVarZza.zzd(Uri.parse(this.zzi.zza));
            this.zzl = zzgbVarZza.zze();
        }
        return this.zzb.zzb(this.zzl);
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final Uri zzc() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final void zzd() throws IOException {
        if (!this.zzg) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.zzg = false;
        this.zzh = null;
        InputStream inputStream = this.zzf;
        if (inputStream == null) {
            this.zzb.zzd();
        } else {
            IOUtils.closeQuietly(inputStream);
            this.zzf = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final /* synthetic */ Map zze() {
        return Collections.emptyMap();
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final void zzf(zzgy zzgyVar) {
    }
}
