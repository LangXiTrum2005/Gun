package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.ItemTouchHelper;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaeu implements zzacn {
    private zzacq zzf;
    private boolean zzh;
    private long zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private boolean zzn;
    private zzaet zzo;
    private zzaey zzp;
    private final zzdy zza = new zzdy(4);
    private final zzdy zzb = new zzdy(9);
    private final zzdy zzc = new zzdy(11);
    private final zzdy zzd = new zzdy();
    private final zzaev zze = new zzaev();
    private int zzg = 1;

    private final zzdy zza(zzaco zzacoVar) throws IOException {
        if (this.zzl > this.zzd.zzc()) {
            zzdy zzdyVar = this.zzd;
            int iZzc = zzdyVar.zzc();
            zzdyVar.zzJ(new byte[Math.max(iZzc + iZzc, this.zzl)], 0);
        } else {
            this.zzd.zzL(0);
        }
        this.zzd.zzK(this.zzl);
        zzacoVar.zzi(this.zzd.zzN(), 0, this.zzl);
        return this.zzd;
    }

    private final void zzg() {
        if (this.zzn) {
            return;
        }
        this.zzf.zzO(new zzadl(C.TIME_UNSET, 0L));
        this.zzn = true;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0098  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0009 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzacn
    public final int zzb(zzaco zzacoVar, zzadj zzadjVar) throws IOException {
        long j;
        boolean zZzf;
        boolean z;
        long j2;
        zzcw.zzb(this.zzf);
        while (true) {
            int i = this.zzg;
            int i2 = 8;
            if (i != 1) {
                if (i == 2) {
                    zzacoVar.zzk(this.zzj);
                    this.zzj = 0;
                    this.zzg = 3;
                } else if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException();
                    }
                    if (this.zzh) {
                        j = this.zzi + this.zzm;
                    } else {
                        j = this.zze.zzc() == C.TIME_UNSET ? 0L : this.zzm;
                    }
                    int i3 = this.zzk;
                    if (i3 == 8) {
                        if (this.zzo != null) {
                            zzg();
                            zZzf = this.zzo.zzf(zza(zzacoVar), j);
                        }
                        z = true;
                        if (!this.zzh && zZzf) {
                            this.zzh = true;
                            if (this.zze.zzc() == C.TIME_UNSET) {
                                j2 = -this.zzm;
                            } else {
                                j2 = 0;
                            }
                            this.zzi = j2;
                        }
                        this.zzj = 4;
                        this.zzg = 2;
                        if (z) {
                            return 0;
                        }
                    } else {
                        i2 = i3;
                    }
                    if (i2 == 9) {
                        if (this.zzp != null) {
                            zzg();
                            zZzf = this.zzp.zzf(zza(zzacoVar), j);
                            z = true;
                        } else {
                            zzacoVar.zzk(this.zzl);
                            zZzf = false;
                            z = false;
                        }
                    } else if (i2 != 18 || this.zzn) {
                        zzacoVar.zzk(this.zzl);
                        zZzf = false;
                        z = false;
                    } else {
                        zZzf = this.zze.zzf(zza(zzacoVar), j);
                        zzaev zzaevVar = this.zze;
                        long jZzc = zzaevVar.zzc();
                        if (jZzc != C.TIME_UNSET) {
                            this.zzf.zzO(new zzade(zzaevVar.zzd(), zzaevVar.zze(), jZzc));
                            this.zzn = true;
                        }
                        z = true;
                    }
                    if (!this.zzh) {
                        this.zzh = true;
                        if (this.zze.zzc() == C.TIME_UNSET) {
                            j2 = -this.zzm;
                        } else {
                            j2 = 0;
                        }
                        this.zzi = j2;
                    }
                    this.zzj = 4;
                    this.zzg = 2;
                    if (z) {
                        return 0;
                    }
                } else {
                    if (!zzacoVar.zzn(this.zzc.zzN(), 0, 11, true)) {
                        return -1;
                    }
                    this.zzc.zzL(0);
                    this.zzk = this.zzc.zzm();
                    this.zzl = this.zzc.zzo();
                    this.zzm = this.zzc.zzo();
                    this.zzm = (((long) (this.zzc.zzm() << 24)) | this.zzm) * 1000;
                    this.zzc.zzM(3);
                    this.zzg = 4;
                }
            } else {
                if (!zzacoVar.zzn(this.zzb.zzN(), 0, 9, true)) {
                    return -1;
                }
                this.zzb.zzL(0);
                this.zzb.zzM(4);
                int iZzm = this.zzb.zzm();
                int i4 = iZzm & 4;
                int i5 = iZzm & 1;
                if (i4 != 0 && this.zzo == null) {
                    this.zzo = new zzaet(this.zzf.zzw(8, 1));
                }
                if (i5 != 0 && this.zzp == null) {
                    this.zzp = new zzaey(this.zzf.zzw(9, 2));
                }
                this.zzf.zzD();
                this.zzj = this.zzb.zzg() - 5;
                this.zzg = 2;
            }
        }
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
        this.zzf = zzacqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzf(long j, long j2) {
        if (j == 0) {
            this.zzg = 1;
            this.zzh = false;
        } else {
            this.zzg = 3;
        }
        this.zzj = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final boolean zzi(zzaco zzacoVar) throws IOException {
        zzacc zzaccVar = (zzacc) zzacoVar;
        zzaccVar.zzm(this.zza.zzN(), 0, 3, false);
        this.zza.zzL(0);
        if (this.zza.zzo() != 4607062) {
            return false;
        }
        zzaccVar.zzm(this.zza.zzN(), 0, 2, false);
        this.zza.zzL(0);
        if ((this.zza.zzq() & ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION) != 0) {
            return false;
        }
        zzaccVar.zzm(this.zza.zzN(), 0, 4, false);
        this.zza.zzL(0);
        int iZzg = this.zza.zzg();
        zzacoVar.zzj();
        zzacc zzaccVar2 = (zzacc) zzacoVar;
        zzaccVar2.zzl(iZzg, false);
        zzaccVar2.zzm(this.zza.zzN(), 0, 4, false);
        this.zza.zzL(0);
        return this.zza.zzg() == 0;
    }
}
