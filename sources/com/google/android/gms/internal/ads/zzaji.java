package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class zzaji implements zzajo {
    private final zzajn zza;
    private final long zzb;
    private final long zzc;
    private final zzajt zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    public zzaji(zzajt zzajtVar, long j, long j2, long j3, long j4, boolean z) {
        zzcw.zzd(j >= 0 && j2 > j);
        this.zzd = zzajtVar;
        this.zzb = j;
        this.zzc = j2;
        if (j3 == j2 - j || z) {
            this.zzf = j4;
            this.zze = 4;
        } else {
            this.zze = 0;
        }
        this.zza = new zzajn();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001e  */
    @Override // com.google.android.gms.internal.ads.zzajo
    public final long zzd(zzaco zzacoVar) throws IOException {
        long jMax;
        int i = this.zze;
        if (i == 0) {
            long jZzf = zzacoVar.zzf();
            this.zzg = jZzf;
            this.zze = 1;
            long j = this.zzc - 65307;
            if (j > jZzf) {
                return j;
            }
        } else if (i != 1) {
            if (i == 2) {
                long j2 = this.zzi;
                long j3 = this.zzj;
                if (j2 == j3) {
                    jMax = -1;
                } else {
                    long jZzf2 = zzacoVar.zzf();
                    if (this.zza.zzc(zzacoVar, j3)) {
                        this.zza.zzb(zzacoVar, false);
                        zzacoVar.zzj();
                        long j4 = this.zzh;
                        zzajn zzajnVar = this.zza;
                        long j5 = zzajnVar.zzb;
                        long j6 = j4 - j5;
                        int i2 = zzajnVar.zzd + zzajnVar.zze;
                        if (j6 < 0 || j6 >= 72000) {
                            if (j6 < 0) {
                                this.zzj = jZzf2;
                                this.zzl = j5;
                            } else {
                                this.zzi = ((long) i2) + zzacoVar.zzf();
                                this.zzk = j5;
                            }
                            long j7 = this.zzj;
                            long j8 = this.zzi;
                            long j9 = j7 - j8;
                            if (j9 < 100000) {
                                this.zzj = j8;
                                jMax = j8;
                            } else {
                                jMax = Math.max(j8, Math.min(((j6 * j9) / (this.zzl - this.zzk)) + (zzacoVar.zzf() - (((long) i2) * (j6 <= 0 ? 2L : 1L))), j7 - 1));
                            }
                        } else {
                            jMax = -1;
                        }
                    } else {
                        jMax = this.zzi;
                        if (jMax == jZzf2) {
                            throw new IOException("No ogg page can be found.");
                        }
                    }
                }
                if (jMax != -1) {
                    return jMax;
                }
                this.zze = 3;
            } else if (i != 3) {
                return -1L;
            }
            while (true) {
                this.zza.zzc(zzacoVar, -1L);
                this.zza.zzb(zzacoVar, false);
                zzajn zzajnVar2 = this.zza;
                if (zzajnVar2.zzb > this.zzh) {
                    zzacoVar.zzj();
                    this.zze = 4;
                    return -(this.zzk + 2);
                }
                zzacoVar.zzk(zzajnVar2.zzd + zzajnVar2.zze);
                this.zzi = zzacoVar.zzf();
                this.zzk = this.zza.zzb;
            }
        }
        this.zza.zza();
        if (!this.zza.zzc(zzacoVar, -1L)) {
            throw new EOFException();
        }
        this.zza.zzb(zzacoVar, false);
        zzajn zzajnVar3 = this.zza;
        zzacoVar.zzk(zzajnVar3.zzd + zzajnVar3.zze);
        long j10 = this.zza.zzb;
        while (true) {
            zzajn zzajnVar4 = this.zza;
            if ((zzajnVar4.zza & 4) == 4 || !zzajnVar4.zzc(zzacoVar, -1L) || zzacoVar.zzf() >= this.zzc || !this.zza.zzb(zzacoVar, true)) {
                break;
            }
            zzajn zzajnVar5 = this.zza;
            if (!zzacr.zze(zzacoVar, zzajnVar5.zzd + zzajnVar5.zze)) {
                break;
            }
            j10 = this.zza.zzb;
        }
        this.zzf = j10;
        this.zze = 4;
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzajo
    @Nullable
    public final /* bridge */ /* synthetic */ zzadm zze() {
        zzajh zzajhVar = null;
        if (this.zzf != 0) {
            return new zzajg(this, zzajhVar);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzajo
    public final void zzg(long j) {
        this.zzh = Math.max(0L, Math.min(j, this.zzf - 1));
        this.zze = 2;
        this.zzi = this.zzb;
        this.zzj = this.zzc;
        this.zzk = 0L;
        this.zzl = this.zzf;
    }
}
