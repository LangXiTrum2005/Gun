package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.EOFException;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzahs implements zzacn {
    private final zzdy zza;
    private final zzadf zzb;
    private final zzadb zzc;
    private final zzadd zzd;
    private final zzadt zze;
    private zzacq zzf;
    private zzadt zzg;
    private zzadt zzh;
    private int zzi;

    @Nullable
    private zzay zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private int zzo;
    private zzahu zzp;
    private boolean zzq;

    public zzahs() {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0066  */
    /* JADX WARN: Code duplicated, block: B:26:0x006e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0077  */
    /* JADX WARN: Code duplicated, block: B:29:0x007b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0085  */
    /* JADX WARN: Code duplicated, block: B:36:0x009f  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:53:0x0101  */
    /* JADX WARN: Code duplicated, block: B:56:0x010f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0115  */
    /* JADX WARN: Code duplicated, block: B:60:0x0120  */
    /* JADX WARN: Code duplicated, block: B:62:0x0124  */
    private final int zzg(zzaco zzacoVar) throws IOException {
        int iZzg;
        zzahw zzahwVarZzb;
        zzadb zzadbVar;
        long jZzf;
        long jZzd;
        long jZza;
        long j;
        int i;
        zzahu zzahpVar;
        long j2;
        long j3;
        int i2;
        int i3;
        zzahr zzahrVarZzb;
        long jZzs;
        if (this.zzi == 0) {
            try {
                zzm(zzacoVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.zzp == null) {
            zzdy zzdyVar = new zzdy(this.zzb.zzc);
            zzacoVar.zzh(zzdyVar.zzN(), 0, this.zzb.zzc);
            zzadf zzadfVar = this.zzb;
            int i4 = 21;
            if ((zzadfVar.zza & 1) != 0) {
                if (zzadfVar.zze != 1) {
                    i4 = 36;
                }
            } else if (zzadfVar.zze == 1) {
                i4 = 13;
            }
            if (zzdyVar.zze() >= i4 + 4) {
                zzdyVar.zzL(i4);
                iZzg = zzdyVar.zzg();
                if (iZzg != 1483304551) {
                    if (iZzg == 1231971951) {
                        iZzg = 1231971951;
                    } else if (zzdyVar.zze() >= 40) {
                        zzdyVar.zzL(36);
                        if (zzdyVar.zzg() == 1447187017) {
                            iZzg = 1447187017;
                        } else {
                            iZzg = 0;
                        }
                    } else {
                        iZzg = 0;
                    }
                }
            } else if (zzdyVar.zze() >= 40) {
                zzdyVar.zzL(36);
                if (zzdyVar.zzg() == 1447187017) {
                    iZzg = 1447187017;
                } else {
                    iZzg = 0;
                }
            } else {
                iZzg = 0;
            }
            if (iZzg == 1231971951) {
                zzahwVarZzb = zzahw.zzb(this.zzb, zzdyVar);
                zzadbVar = this.zzc;
                if (!zzadbVar.zza() && (i2 = zzahwVarZzb.zzd) != -1 && (i3 = zzahwVarZzb.zze) != -1) {
                    zzadbVar.zza = i2;
                    zzadbVar.zzb = i3;
                }
                jZzf = zzacoVar.zzf();
                if (zzacoVar.zzd() != -1) {
                    j2 = zzahwVarZzb.zzc;
                    if (j2 != -1) {
                        j3 = j2 + jZzf;
                        if (zzacoVar.zzd() != j3) {
                            StringBuilder sbP = DM.p("Data size mismatch between stream (", zzacoVar.zzd(), ") and Xing frame (");
                            sbP.append(j3);
                            sbP.append("), using Xing value.");
                            zzdo.zze("Mp3Extractor", sbP.toString());
                        }
                    }
                }
                zzacoVar.zzk(this.zzb.zzc);
                if (iZzg == 1483304551) {
                    zzahpVar = zzahx.zzb(zzahwVarZzb, jZzf);
                } else {
                    jZzd = zzacoVar.zzd();
                    jZza = zzahwVarZzb.zza();
                    if (jZza != C.TIME_UNSET) {
                        zzahpVar = null;
                    } else {
                        j = zzahwVarZzb.zzc;
                        if (j != -1) {
                            jZzd = jZzf + j;
                            i = zzahwVarZzb.zza.zzc;
                        } else if (jZzd != -1) {
                            j = jZzd - jZzf;
                            i = zzahwVarZzb.zza.zzc;
                        } else {
                            zzahpVar = null;
                        }
                        long j4 = j - ((long) i);
                        long j5 = jZzd;
                        RoundingMode roundingMode = RoundingMode.HALF_UP;
                        zzahpVar = new zzahp(j5, jZzf + ((long) zzahwVarZzb.zza.zzc), zzgaq.zzb(zzei.zzu(j4, 8000000L, jZza, roundingMode)), zzgaq.zzb(zzgal.zzb(j4, zzahwVarZzb.zzb, roundingMode)), false);
                    }
                }
            } else if (iZzg != 1447187017) {
                if (iZzg != 1483304551) {
                    zzacoVar.zzj();
                } else {
                    zzahwVarZzb = zzahw.zzb(this.zzb, zzdyVar);
                    zzadbVar = this.zzc;
                    if (!zzadbVar.zza()) {
                        zzadbVar.zza = i2;
                        zzadbVar.zzb = i3;
                    }
                    jZzf = zzacoVar.zzf();
                    if (zzacoVar.zzd() != -1) {
                        j2 = zzahwVarZzb.zzc;
                        if (j2 != -1) {
                            j3 = j2 + jZzf;
                            if (zzacoVar.zzd() != j3) {
                                StringBuilder sbP2 = DM.p("Data size mismatch between stream (", zzacoVar.zzd(), ") and Xing frame (");
                                sbP2.append(j3);
                                sbP2.append("), using Xing value.");
                                zzdo.zze("Mp3Extractor", sbP2.toString());
                            }
                        }
                    }
                    zzacoVar.zzk(this.zzb.zzc);
                    if (iZzg == 1483304551) {
                        zzahpVar = zzahx.zzb(zzahwVarZzb, jZzf);
                    } else {
                        jZzd = zzacoVar.zzd();
                        jZza = zzahwVarZzb.zza();
                        if (jZza != C.TIME_UNSET) {
                            j = zzahwVarZzb.zzc;
                            if (j != -1) {
                                jZzd = jZzf + j;
                                i = zzahwVarZzb.zza.zzc;
                            } else if (jZzd != -1) {
                                j = jZzd - jZzf;
                                i = zzahwVarZzb.zza.zzc;
                            }
                            long j6 = j - ((long) i);
                            long j7 = jZzd;
                            RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                            zzahpVar = new zzahp(j7, jZzf + ((long) zzahwVarZzb.zza.zzc), zzgaq.zzb(zzei.zzu(j6, 8000000L, jZza, roundingMode2)), zzgaq.zzb(zzgal.zzb(j6, zzahwVarZzb.zzb, roundingMode2)), false);
                        }
                    }
                }
                zzahpVar = null;
            } else {
                zzahpVar = zzahv.zzb(zzacoVar.zzd(), zzacoVar.zzf(), this.zzb, zzdyVar);
                zzacoVar.zzk(this.zzb.zzc);
            }
            zzay zzayVar = this.zzj;
            long jZzf2 = zzacoVar.zzf();
            if (zzayVar == null) {
                zzahrVarZzb = null;
                break;
            }
            int iZza = zzayVar.zza();
            int i5 = 0;
            while (true) {
                if (i5 >= iZza) {
                    zzahrVarZzb = null;
                    break;
                }
                zzax zzaxVarZzb = zzayVar.zzb(i5);
                if (zzaxVarZzb instanceof zzagm) {
                    zzagm zzagmVar = (zzagm) zzaxVarZzb;
                    int iZza2 = zzayVar.zza();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= iZza2) {
                            jZzs = -9223372036854775807L;
                            break;
                        }
                        zzax zzaxVarZzb2 = zzayVar.zzb(i6);
                        if (zzaxVarZzb2 instanceof zzagq) {
                            zzagq zzagqVar = (zzagq) zzaxVarZzb2;
                            if (zzagqVar.zzf.equals("TLEN")) {
                                jZzs = zzei.zzs(Long.parseLong((String) zzagqVar.zzb.get(0)));
                                break;
                            }
                        }
                        i6++;
                    }
                    zzahrVarZzb = zzahr.zzb(jZzf2, zzagmVar, jZzs);
                    break;
                }
                i5++;
            }
            if (this.zzq) {
                zzahpVar = new zzaht();
            } else {
                if (zzahrVarZzb != null) {
                    zzahpVar = zzahrVarZzb;
                } else if (zzahpVar == null) {
                    zzahpVar = null;
                }
                if (zzahpVar != null) {
                    zzahpVar.zzh();
                } else {
                    zzacoVar.zzh(this.zza.zzN(), 0, 4);
                    this.zza.zzL(0);
                    this.zzb.zza(this.zza.zzg());
                    long jZzd2 = zzacoVar.zzd();
                    long jZzf3 = zzacoVar.zzf();
                    zzadf zzadfVar2 = this.zzb;
                    zzahpVar = new zzahp(jZzd2, jZzf3, zzadfVar2.zzf, zzadfVar2.zzc, false);
                }
            }
            this.zzp = zzahpVar;
            this.zzf.zzO(zzahpVar);
            zzz zzzVar = new zzz();
            zzzVar.zzaa(this.zzb.zzb);
            zzzVar.zzR(4096);
            zzzVar.zzz(this.zzb.zze);
            zzzVar.zzab(this.zzb.zzd);
            zzzVar.zzG(this.zzc.zza);
            zzzVar.zzH(this.zzc.zzb);
            zzzVar.zzT(this.zzj);
            if (this.zzp.zzc() != -2147483647) {
                zzzVar.zzy(this.zzp.zzc());
            }
            this.zzh.zzm(zzzVar.zzag());
            this.zzm = zzacoVar.zzf();
        } else {
            long j8 = this.zzm;
            if (j8 != 0) {
                long jZzf4 = zzacoVar.zzf();
                if (jZzf4 < j8) {
                    zzacoVar.zzk((int) (j8 - jZzf4));
                }
            }
        }
        int i7 = this.zzo;
        if (i7 == 0) {
            zzacoVar.zzj();
            if (!zzl(zzacoVar)) {
                this.zza.zzL(0);
                int iZzg2 = this.zza.zzg();
                if (!zzk(iZzg2, this.zzi) || zzadg.zzb(iZzg2) == -1) {
                    zzacoVar.zzk(1);
                    this.zzi = 0;
                } else {
                    this.zzb.zza(iZzg2);
                    if (this.zzk == C.TIME_UNSET) {
                        this.zzk = this.zzp.zze(zzacoVar.zzf());
                    }
                    zzadf zzadfVar3 = this.zzb;
                    int i8 = zzadfVar3.zzc;
                    this.zzo = i8;
                    this.zzn = zzacoVar.zzf() + ((long) i8);
                    zzahu zzahuVar = this.zzp;
                    if (zzahuVar instanceof zzahq) {
                        zzh(this.zzl + ((long) zzadfVar3.zzg));
                        throw null;
                    }
                    i7 = i8;
                }
                return 0;
            }
            return -1;
        }
        int iZzf = this.zzh.zzf(zzacoVar, i7, true);
        if (iZzf != -1) {
            int i9 = this.zzo - iZzf;
            this.zzo = i9;
            if (i9 <= 0) {
                this.zzh.zzt(zzh(this.zzl), 1, this.zzb.zzc, 0, null);
                this.zzl += (long) this.zzb.zzg;
                this.zzo = 0;
                return 0;
            }
            return 0;
        }
        return -1;
    }

    private final long zzh(long j) {
        zzadf zzadfVar = this.zzb;
        return ((j * 1000000) / ((long) zzadfVar.zzd)) + this.zzk;
    }

    private final void zzj() {
        zzahu zzahuVar = this.zzp;
        if ((zzahuVar instanceof zzahp) && zzahuVar.zzh()) {
            long j = this.zzn;
            if (j == -1 || j == this.zzp.zzd()) {
                return;
            }
            this.zzp = ((zzahp) this.zzp).zzf(this.zzn);
            zzacq zzacqVar = this.zzf;
            zzacqVar.getClass();
            zzacqVar.zzO(this.zzp);
        }
    }

    private static boolean zzk(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    private final boolean zzl(zzaco zzacoVar) throws IOException {
        zzahu zzahuVar = this.zzp;
        if (zzahuVar != null) {
            long jZzd = zzahuVar.zzd();
            if (jZzd != -1 && zzacoVar.zze() > jZzd - 4) {
                return true;
            }
        }
        try {
            return !zzacoVar.zzm(this.zza.zzN(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final boolean zzm(zzaco zzacoVar, boolean z) throws IOException {
        int i;
        int iZze;
        int iZzb;
        zzacoVar.zzj();
        if (zzacoVar.zzf() == 0) {
            zzay zzayVarZza = this.zzd.zza(zzacoVar, null);
            this.zzj = zzayVarZza;
            if (zzayVarZza != null) {
                this.zzc.zzb(zzayVarZza);
            }
            iZze = (int) zzacoVar.zze();
            if (!z) {
                zzacoVar.zzk(iZze);
            }
            i = 0;
        } else {
            i = 0;
            iZze = 0;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (zzl(zzacoVar)) {
                if (i2 > 0) {
                    break;
                }
                zzj();
                throw new EOFException();
            }
            this.zza.zzL(0);
            int iZzg = this.zza.zzg();
            if ((i == 0 || zzk(iZzg, i)) && (iZzb = zzadg.zzb(iZzg)) != -1) {
                i2++;
                if (i2 != 1) {
                    if (i2 == 4) {
                        break;
                    }
                } else {
                    this.zzb.zza(iZzg);
                    i = iZzg;
                }
                zzacoVar.zzg(iZzb - 4);
            } else {
                int i4 = i3 + 1;
                if (i3 == (true != z ? 131072 : 32768)) {
                    if (z) {
                        return false;
                    }
                    zzj();
                    throw new EOFException();
                }
                if (z) {
                    zzacoVar.zzj();
                    zzacoVar.zzg(iZze + i4);
                } else {
                    zzacoVar.zzk(1);
                }
                i3 = i4;
                i = 0;
                i2 = 0;
            }
        }
        if (z) {
            zzacoVar.zzk(iZze + i3);
        } else {
            zzacoVar.zzj();
        }
        this.zzi = i;
        return true;
    }

    public final void zza() {
        this.zzq = true;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final int zzb(zzaco zzacoVar, zzadj zzadjVar) throws IOException {
        zzcw.zzb(this.zzg);
        int i = zzei.zza;
        int iZzg = zzg(zzacoVar);
        if (iZzg == -1 && (this.zzp instanceof zzahq)) {
            if (this.zzp.zza() != zzh(this.zzl)) {
                throw null;
            }
        }
        return iZzg;
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
        zzadt zzadtVarZzw = zzacqVar.zzw(0, 1);
        this.zzg = zzadtVarZzw;
        this.zzh = zzadtVarZzw;
        this.zzf.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzf(long j, long j2) {
        this.zzi = 0;
        this.zzk = C.TIME_UNSET;
        this.zzl = 0L;
        this.zzo = 0;
        zzahu zzahuVar = this.zzp;
        if (zzahuVar instanceof zzahq) {
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final boolean zzi(zzaco zzacoVar) throws IOException {
        return zzm(zzacoVar, true);
    }

    public zzahs(int i) {
        this.zza = new zzdy(10);
        this.zzb = new zzadf();
        this.zzc = new zzadb();
        this.zzk = C.TIME_UNSET;
        this.zzd = new zzadd();
        zzaci zzaciVar = new zzaci();
        this.zze = zzaciVar;
        this.zzh = zzaciVar;
        this.zzn = -1L;
    }
}
