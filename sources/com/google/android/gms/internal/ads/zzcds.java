package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.IOUtils;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcds extends zzfr {
    private final Context zza;
    private final zzfy zzb;
    private final String zzc;
    private final int zzd;
    private final boolean zze;
    private InputStream zzf;
    private boolean zzg;
    private Uri zzh;
    private volatile zzbav zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private long zzn;
    private AI zzo;
    private final AtomicLong zzp;
    private final zzcec zzq;

    public zzcds(Context context, zzfy zzfyVar, String str, int i, zzgy zzgyVar, zzcec zzcecVar) {
        super(false);
        this.zza = context;
        this.zzb = zzfyVar;
        this.zzq = zzcecVar;
        this.zzc = str;
        this.zzd = i;
        this.zzj = false;
        this.zzk = false;
        this.zzl = false;
        this.zzm = false;
        this.zzn = 0L;
        this.zzp = new AtomicLong(-1L);
        this.zzo = null;
        this.zze = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzbY)).booleanValue();
        zzf(zzgyVar);
    }

    private final boolean zzr() {
        if (!this.zze) {
            return false;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzet)).booleanValue() || this.zzl) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzeu)).booleanValue() && !this.zzm;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        if (!this.zzg) {
            throw new IOException("Attempt to read closed GcacheDataSource.");
        }
        InputStream inputStream = this.zzf;
        int iZza = inputStream != null ? inputStream.read(bArr, i, i2) : this.zzb.zza(bArr, i, i2);
        if (!this.zze || this.zzf != null) {
            zzg(iZza);
        }
        return iZza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.android.gms.internal.ads.zzcef] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzfy
    public final long zzb(zzgd zzgdVar) throws Throwable {
        zzbas zzbasVarZzb;
        Long l;
        boolean z;
        boolean z2;
        long jElapsedRealtime;
        String string = "ms";
        if (this.zzg) {
            throw new IOException("Attempt to open an already open GcacheDataSource.");
        }
        ?? r2 = 1;
        this.zzg = true;
        this.zzh = zzgdVar.zza;
        if (!this.zze) {
            zzj(zzgdVar);
        }
        this.zzi = zzbav.zza(zzgdVar.zza);
        ?? sb = -1;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzeq)).booleanValue()) {
            if (this.zzi != null) {
                this.zzi.zzh = zzgdVar.zze;
                this.zzi.zzi = zzfve.zzc(this.zzc);
                this.zzi.zzj = this.zzd;
                zzbasVarZzb = com.google.android.gms.ads.internal.zzv.zzc().zzb(this.zzi);
            } else {
                zzbasVarZzb = null;
            }
            if (zzbasVarZzb != null && zzbasVarZzb.zze()) {
                this.zzj = zzbasVarZzb.zzd();
                this.zzl = zzbasVarZzb.zzg();
                this.zzm = zzbasVarZzb.zzf();
                this.zzn = zzbasVarZzb.zza();
                this.zzk = true;
                if (!zzr()) {
                    this.zzf = zzbasVarZzb.zzc();
                    if (this.zze) {
                        zzj(zzgdVar);
                    }
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
            long jElapsedRealtime2 = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime();
            com.google.android.gms.ads.internal.zzv.zzd();
            Future futureZza = zzbbg.zza(this.zza, this.zzi);
            try {
                try {
                    zzbbh zzbbhVar = (zzbbh) futureZza.get(jLongValue, TimeUnit.MILLISECONDS);
                    try {
                        this.zzj = zzbbhVar.zzd();
                        this.zzl = zzbbhVar.zzf();
                        this.zzm = zzbbhVar.zze();
                        this.zzn = zzbbhVar.zza();
                        if (!zzr()) {
                            this.zzf = zzbbhVar.zzc();
                            if (this.zze) {
                                zzj(zzgdVar);
                            }
                            long jElapsedRealtime3 = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - jElapsedRealtime2;
                            this.zzq.zza.zzab(true, jElapsedRealtime3);
                            this.zzk = true;
                            com.google.android.gms.ads.internal.util.zze.zza("Cache connection took " + jElapsedRealtime3 + "ms");
                            return -1L;
                        }
                        long jElapsedRealtime4 = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - jElapsedRealtime2;
                        this.zzq.zza.zzab(true, jElapsedRealtime4);
                        this.zzk = true;
                        string = "Cache connection took " + jElapsedRealtime4 + "ms";
                    } catch (InterruptedException unused) {
                        z2 = true;
                        futureZza.cancel(true);
                        Thread.currentThread().interrupt();
                        jElapsedRealtime = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - jElapsedRealtime2;
                        this.zzq.zza.zzab(z2, jElapsedRealtime);
                        this.zzk = z2;
                        sb = new StringBuilder("Cache connection took ");
                        sb.append(jElapsedRealtime);
                        sb.append("ms");
                        string = sb.toString();
                    } catch (ExecutionException | TimeoutException unused2) {
                        z = true;
                        futureZza.cancel(true);
                        jElapsedRealtime = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - jElapsedRealtime2;
                        this.zzq.zza.zzab(z, jElapsedRealtime);
                        this.zzk = z;
                        sb = new StringBuilder("Cache connection took ");
                        sb.append(jElapsedRealtime);
                        sb.append("ms");
                        string = sb.toString();
                    } catch (Throwable th) {
                        th = th;
                        long jElapsedRealtime5 = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - jElapsedRealtime2;
                        this.zzq.zza.zzab(r2, jElapsedRealtime5);
                        this.zzk = r2;
                        com.google.android.gms.ads.internal.util.zze.zza("Cache connection took " + jElapsedRealtime5 + string);
                        throw th;
                    }
                } catch (InterruptedException unused3) {
                    z2 = false;
                } catch (ExecutionException | TimeoutException unused4) {
                    z = false;
                } catch (Throwable th2) {
                    th = th2;
                    r2 = 0;
                }
                com.google.android.gms.ads.internal.util.zze.zza(string);
            } catch (Throwable th3) {
                th = th3;
                r2 = sb;
            }
        }
        this.zzk = false;
        if (this.zzi != null) {
            zzgb zzgbVarZza = zzgdVar.zza();
            zzgbVarZza.zzd(Uri.parse(this.zzi.zza));
            zzgdVar = zzgbVarZza.zze();
        }
        return this.zzb.zzb(zzgdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final Uri zzc() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final void zzd() throws IOException {
        if (!this.zzg) {
            throw new IOException("Attempt to close an already closed GcacheDataSource.");
        }
        this.zzg = false;
        this.zzh = null;
        boolean z = (this.zze && this.zzf == null) ? false : true;
        InputStream inputStream = this.zzf;
        if (inputStream != null) {
            IOUtils.closeQuietly(inputStream);
            this.zzf = null;
        } else {
            this.zzb.zzd();
        }
        if (z) {
            zzh();
        }
    }

    public final long zzk() {
        return this.zzn;
    }

    public final long zzl() {
        if (this.zzi != null) {
            if (this.zzp.get() != -1) {
                return this.zzp.get();
            }
            synchronized (this) {
                try {
                    if (this.zzo == null) {
                        this.zzo = zzbzw.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzcdr
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return this.zza.zzm();
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.zzo.isDone()) {
                try {
                    this.zzp.compareAndSet(-1L, ((Long) this.zzo.get()).longValue());
                    return this.zzp.get();
                } catch (InterruptedException | ExecutionException unused) {
                }
            }
        }
        return -1L;
    }

    public final /* synthetic */ Long zzm() throws Exception {
        return Long.valueOf(com.google.android.gms.ads.internal.zzv.zzc().zza(this.zzi));
    }

    public final boolean zzn() {
        return this.zzj;
    }

    public final boolean zzo() {
        return this.zzm;
    }

    public final boolean zzp() {
        return this.zzl;
    }

    public final boolean zzq() {
        return this.zzk;
    }
}
