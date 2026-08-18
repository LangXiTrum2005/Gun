package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzafb implements zzacn {
    private zzacq zzb;
    private int zzc;
    private int zzd;
    private int zze;

    @Nullable
    private zzagv zzg;
    private zzaco zzh;
    private zzafe zzi;

    @Nullable
    private zzaiv zzj;
    private final zzdy zza = new zzdy(6);
    private long zzf = -1;

    private final int zza(zzaco zzacoVar) throws IOException {
        this.zza.zzI(2);
        ((zzacc) zzacoVar).zzm(this.zza.zzN(), 0, 2, false);
        return this.zza.zzq();
    }

    private final void zzg() {
        zzacq zzacqVar = this.zzb;
        zzacqVar.getClass();
        zzacqVar.zzD();
        this.zzb.zzO(new zzadl(C.TIME_UNSET, 0L));
        this.zzc = 6;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x010b  */
    @Override // com.google.android.gms.internal.ads.zzacn
    public final int zzb(zzaco zzacoVar, zzadj zzadjVar) throws IOException {
        String strZzy;
        zzafd zzafdVarZza;
        zzagv zzagvVar;
        long j;
        int i = this.zzc;
        long j2 = -1;
        if (i == 0) {
            this.zza.zzI(2);
            zzacoVar.zzi(this.zza.zzN(), 0, 2);
            int iZzq = this.zza.zzq();
            this.zzd = iZzq;
            if (iZzq == 65498) {
                if (this.zzf != -1) {
                    this.zzc = 4;
                    return 0;
                }
                zzg();
                return 0;
            }
            if ((iZzq >= 65488 && iZzq <= 65497) || iZzq == 65281) {
                return 0;
            }
            this.zzc = 1;
            return 0;
        }
        if (i == 1) {
            this.zza.zzI(2);
            zzacoVar.zzi(this.zza.zzN(), 0, 2);
            this.zze = this.zza.zzq() - 2;
            this.zzc = 2;
            return 0;
        }
        if (i != 2) {
            if (i != 4) {
                if (i != 5) {
                    if (i == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.zzi == null || zzacoVar != this.zzh) {
                    this.zzh = zzacoVar;
                    this.zzi = new zzafe(zzacoVar, this.zzf);
                }
                zzaiv zzaivVar = this.zzj;
                zzaivVar.getClass();
                int iZzb = zzaivVar.zzb(this.zzi, zzadjVar);
                if (iZzb == 1) {
                    zzadjVar.zza += this.zzf;
                }
                return iZzb;
            }
            long jZzf = zzacoVar.zzf();
            long j3 = this.zzf;
            if (jZzf != j3) {
                zzadjVar.zza = j3;
                return 1;
            }
            if (zzacoVar.zzm(this.zza.zzN(), 0, 1, true)) {
                zzacoVar.zzj();
                if (this.zzj == null) {
                    this.zzj = new zzaiv(zzakd.zza, 8);
                }
                zzafe zzafeVar = new zzafe(zzacoVar, this.zzf);
                this.zzi = zzafeVar;
                if (this.zzj.zzi(zzafeVar)) {
                    zzaiv zzaivVar2 = this.zzj;
                    long j4 = this.zzf;
                    zzacq zzacqVar = this.zzb;
                    zzacqVar.getClass();
                    zzaivVar2.zze(new zzafg(j4, zzacqVar));
                    zzagv zzagvVar2 = this.zzg;
                    zzagvVar2.getClass();
                    zzacq zzacqVar2 = this.zzb;
                    zzacqVar2.getClass();
                    zzadt zzadtVarZzw = zzacqVar2.zzw(1024, 4);
                    zzz zzzVar = new zzz();
                    zzzVar.zzC("image/jpeg");
                    zzzVar.zzT(new zzay(C.TIME_UNSET, zzagvVar2));
                    zzadtVarZzw.zzm(zzzVar.zzag());
                    this.zzc = 5;
                } else {
                    zzg();
                }
            } else {
                zzg();
            }
            return 0;
        }
        if (this.zzd == 65505) {
            zzdy zzdyVar = new zzdy(this.zze);
            zzacoVar.zzi(zzdyVar.zzN(), 0, this.zze);
            if (this.zzg == null && "http://ns.adobe.com/xap/1.0/".equals(zzdyVar.zzy((char) 0)) && (strZzy = zzdyVar.zzy((char) 0)) != null) {
                long jZzd = zzacoVar.zzd();
                if (jZzd == -1 || (zzafdVarZza = zzafh.zza(strZzy)) == null || zzafdVarZza.zzb.size() < 2) {
                    zzagvVar = null;
                } else {
                    int size = zzafdVarZza.zzb.size() - 1;
                    long j5 = -1;
                    long j6 = -1;
                    long j7 = -1;
                    long j8 = -1;
                    boolean z = false;
                    while (size >= 0) {
                        zzafc zzafcVar = (zzafc) zzafdVarZza.zzb.get(size);
                        boolean zEquals = MimeTypes.VIDEO_MP4.equals(zzafcVar.zza) | z;
                        if (size == 0) {
                            jZzd -= zzafcVar.zzc;
                            j = 0;
                        } else {
                            j = jZzd - zzafcVar.zzb;
                        }
                        long j9 = jZzd;
                        jZzd = j;
                        if (!zEquals || jZzd == j9) {
                            z = zEquals;
                        } else {
                            j8 = j9 - jZzd;
                            j7 = jZzd;
                            z = false;
                        }
                        if (size == 0) {
                            j6 = j9;
                        }
                        if (size == 0) {
                            j5 = jZzd;
                        }
                        size--;
                        j2 = -1;
                    }
                    long j10 = j2;
                    if (j7 == j10 || j8 == j10 || j5 == j10 || j6 == j10) {
                        zzagvVar = null;
                    } else {
                        zzagvVar = new zzagv(j5, j6, zzafdVarZza.zza, j7, j8);
                    }
                }
                this.zzg = zzagvVar;
                if (zzagvVar != null) {
                    this.zzf = zzagvVar.zzd;
                }
            }
        } else {
            zzacoVar.zzk(this.zze);
        }
        this.zzc = 0;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final /* synthetic */ zzacn zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final /* synthetic */ List zzd() {
        return zzfxn.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zze(zzacq zzacqVar) {
        this.zzb = zzacqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzf(long j, long j2) {
        if (j == 0) {
            this.zzc = 0;
            this.zzj = null;
        } else if (this.zzc == 5) {
            zzaiv zzaivVar = this.zzj;
            zzaivVar.getClass();
            zzaivVar.zzf(j, j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final boolean zzi(zzaco zzacoVar) throws IOException {
        if (zza(zzacoVar) != 65496) {
            return false;
        }
        int iZza = zza(zzacoVar);
        this.zzd = iZza;
        if (iZza == 65504) {
            this.zza.zzI(2);
            zzacc zzaccVar = (zzacc) zzacoVar;
            zzaccVar.zzm(this.zza.zzN(), 0, 2, false);
            zzaccVar.zzl(this.zza.zzq() - 2, false);
            iZza = zza(zzacoVar);
            this.zzd = iZza;
        }
        if (iZza == 65505) {
            zzacc zzaccVar2 = (zzacc) zzacoVar;
            zzaccVar2.zzl(2, false);
            this.zza.zzI(6);
            zzaccVar2.zzm(this.zza.zzN(), 0, 6, false);
            if (this.zza.zzu() == 1165519206 && this.zza.zzq() == 0) {
                return true;
            }
        }
        return false;
    }
}
