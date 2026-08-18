package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaoe implements zzacn {
    private zzacq zza;
    private zzadt zzb;
    private zzaoc zze;
    private int zzc = 0;
    private long zzd = -1;
    private int zzf = -1;
    private long zzg = -1;

    /* JADX WARN: Code duplicated, block: B:47:0x00eb  */
    @Override // com.google.android.gms.internal.ads.zzacn
    public final int zzb(zzaco zzacoVar, zzadj zzadjVar) throws IOException {
        int iZzn;
        zzcw.zzb(this.zzb);
        int i = zzei.zza;
        int i2 = this.zzc;
        if (i2 == 0) {
            zzcw.zzf(zzacoVar.zzf() == 0);
            int i3 = this.zzf;
            if (i3 != -1) {
                zzacoVar.zzk(i3);
                this.zzc = 4;
            } else {
                if (!zzaoh.zzc(zzacoVar)) {
                    throw zzbc.zza("Unsupported or unrecognized wav file type.", null);
                }
                zzacoVar.zzk((int) (zzacoVar.zze() - zzacoVar.zzf()));
                this.zzc = 1;
            }
            return 0;
        }
        long jZzr = -1;
        if (i2 == 1) {
            zzdy zzdyVar = new zzdy(8);
            zzaog zzaogVarZza = zzaog.zza(zzacoVar, zzdyVar);
            if (zzaogVarZza.zza != 1685272116) {
                zzacoVar.zzj();
            } else {
                zzacoVar.zzg(8);
                zzdyVar.zzL(0);
                zzacoVar.zzh(zzdyVar.zzN(), 0, 8);
                jZzr = zzdyVar.zzr();
                zzacoVar.zzk(((int) zzaogVarZza.zzb) + 8);
            }
            this.zzd = jZzr;
            this.zzc = 2;
            return 0;
        }
        if (i2 == 2) {
            zzaof zzaofVarZzb = zzaoh.zzb(zzacoVar);
            int i4 = zzaofVarZzb.zza;
            if (i4 == 17) {
                this.zze = new zzaob(this.zza, this.zzb, zzaofVarZzb);
            } else if (i4 == 6) {
                this.zze = new zzaod(this.zza, this.zzb, zzaofVarZzb, MimeTypes.AUDIO_ALAW, -1);
            } else if (i4 == 7) {
                this.zze = new zzaod(this.zza, this.zzb, zzaofVarZzb, MimeTypes.AUDIO_MLAW, -1);
            } else {
                int i5 = zzaofVarZzb.zze;
                if (i4 == 1) {
                    iZzn = zzei.zzn(i5);
                } else {
                    if (i4 != 3) {
                        if (i4 == 65534) {
                            iZzn = zzei.zzn(i5);
                        }
                    } else if (i5 == 32) {
                        iZzn = 4;
                    }
                    iZzn = 0;
                }
                if (iZzn == 0) {
                    throw zzbc.zzc("Unsupported WAV format type: " + i4);
                }
                this.zze = new zzaod(this.zza, this.zzb, zzaofVarZzb, MimeTypes.AUDIO_RAW, iZzn);
            }
            this.zzc = 3;
            return 0;
        }
        if (i2 != 3) {
            zzcw.zzf(this.zzg != -1);
            long jZzf = this.zzg - zzacoVar.zzf();
            zzaoc zzaocVar = this.zze;
            zzaocVar.getClass();
            return zzaocVar.zzc(zzacoVar, jZzf) ? -1 : 0;
        }
        Pair pairZza = zzaoh.zza(zzacoVar);
        this.zzf = ((Long) pairZza.first).intValue();
        long jLongValue = ((Long) pairZza.second).longValue();
        long j = this.zzd;
        if (j != -1 && jLongValue == 4294967295L) {
            jLongValue = j;
        }
        long j2 = ((long) this.zzf) + jLongValue;
        this.zzg = j2;
        long jZzd = zzacoVar.zzd();
        if (jZzd != -1 && j2 > jZzd) {
            StringBuilder sbP = DM.p("Data exceeds input length: ", j2, ", ");
            sbP.append(jZzd);
            zzdo.zzf("WavExtractor", sbP.toString());
            this.zzg = jZzd;
            j2 = jZzd;
        }
        zzaoc zzaocVar2 = this.zze;
        zzaocVar2.getClass();
        zzaocVar2.zza(this.zzf, j2);
        this.zzc = 4;
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
        this.zza = zzacqVar;
        this.zzb = zzacqVar.zzw(0, 1);
        zzacqVar.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzf(long j, long j2) {
        this.zzc = j == 0 ? 0 : 4;
        zzaoc zzaocVar = this.zze;
        if (zzaocVar != null) {
            zzaocVar.zzb(j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final boolean zzi(zzaco zzacoVar) throws IOException {
        return zzaoh.zzc(zzacoVar);
    }
}
