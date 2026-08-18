package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaef implements zzacn {
    private final zzdy zza;
    private final zzaed zzb;
    private final boolean zzc;
    private final zzakd zzd;
    private int zze;
    private zzacq zzf;
    private zzaeg zzg;
    private long zzh;
    private zzaei[] zzi;
    private long zzj;

    @Nullable
    private zzaei zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private int zzo;
    private boolean zzp;

    @Deprecated
    public zzaef() {
        this(1, zzakd.zza);
    }

    @Nullable
    private final zzaei zzg(int i) {
        for (zzaei zzaeiVar : this.zzi) {
            if (zzaeiVar.zzf(i)) {
                return zzaeiVar;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:135:0x02ff  */
    @Override // com.google.android.gms.internal.ads.zzacn
    public final int zzb(zzaco zzacoVar, zzadj zzadjVar) throws IOException {
        boolean z;
        int i;
        int i2;
        zzaei zzaeiVar;
        long j;
        long j2 = this.zzj;
        int i3 = 0;
        if (j2 != -1) {
            long jZzf = zzacoVar.zzf();
            if (j2 < jZzf || j2 > PlaybackStateCompat.ACTION_SET_REPEAT_MODE + jZzf) {
                zzadjVar.zza = j2;
                z = true;
            } else {
                zzacoVar.zzk((int) (j2 - jZzf));
                z = false;
            }
        } else {
            z = false;
        }
        this.zzj = -1L;
        if (z) {
            return 1;
        }
        int i4 = this.zze;
        zzaei zzaeiVar2 = null;
        if (i4 == 0) {
            if (!zzi(zzacoVar)) {
                throw zzbc.zza("AVI Header List not found", null);
            }
            zzacoVar.zzk(12);
            this.zze = 1;
            return 0;
        }
        if (i4 == 1) {
            zzacoVar.zzi(this.zza.zzN(), 0, 12);
            this.zza.zzL(0);
            zzaed zzaedVar = this.zzb;
            zzdy zzdyVar = this.zza;
            zzaedVar.zza(zzdyVar);
            int i5 = zzaedVar.zza;
            if (i5 != 1414744396) {
                throw zzbc.zza("LIST expected, found: " + i5, null);
            }
            zzaedVar.zzc = zzdyVar.zzi();
            zzaed zzaedVar2 = this.zzb;
            int i6 = zzaedVar2.zzc;
            if (i6 == 1819436136) {
                this.zzl = zzaedVar2.zzb;
                this.zze = 2;
                return 0;
            }
            throw zzbc.zza("hdrl expected, found: " + i6, null);
        }
        if (i4 == 2) {
            int i7 = this.zzl - 4;
            zzdy zzdyVar2 = new zzdy(i7);
            zzacoVar.zzi(zzdyVar2.zzN(), 0, i7);
            zzaej zzaejVarZzc = zzaej.zzc(1819436136, zzdyVar2);
            if (zzaejVarZzc.zza() != 1819436136) {
                throw zzbc.zza("Unexpected header list type " + zzaejVarZzc.zza(), null);
            }
            zzaeg zzaegVar = (zzaeg) zzaejVarZzc.zzb(zzaeg.class);
            if (zzaegVar == null) {
                throw zzbc.zza("AviHeader not found", null);
            }
            this.zzg = zzaegVar;
            this.zzh = ((long) zzaegVar.zzc) * ((long) zzaegVar.zza);
            ArrayList arrayList = new ArrayList();
            zzfxn zzfxnVar = zzaejVarZzc.zza;
            int size = zzfxnVar.size();
            int i8 = 0;
            int i9 = 0;
            while (i8 < size) {
                zzaeb zzaebVar = (zzaeb) zzfxnVar.get(i8);
                if (zzaebVar.zza() == 1819440243) {
                    zzaej zzaejVar = (zzaej) zzaebVar;
                    int i10 = i9 + 1;
                    zzaeh zzaehVar = (zzaeh) zzaejVar.zzb(zzaeh.class);
                    zzaek zzaekVar = (zzaek) zzaejVar.zzb(zzaek.class);
                    if (zzaehVar == null) {
                        zzdo.zzf("AviExtractor", "Missing Stream Header");
                    } else {
                        if (zzaekVar == null) {
                            zzdo.zzf("AviExtractor", "Missing Stream Format");
                        } else {
                            int i11 = zzaehVar.zzd;
                            int i12 = zzaehVar.zzb;
                            int i13 = zzaehVar.zzc;
                            zzab zzabVar = zzaekVar.zza;
                            i = i8;
                            long jZzu = zzei.zzu(i11, ((long) i12) * 1000000, i13, RoundingMode.DOWN);
                            zzz zzzVarZzb = zzabVar.zzb();
                            zzzVarZzb.zzL(i9);
                            int i14 = zzaehVar.zze;
                            if (i14 != 0) {
                                zzzVarZzb.zzR(i14);
                            }
                            zzael zzaelVar = (zzael) zzaejVar.zzb(zzael.class);
                            if (zzaelVar != null) {
                                zzzVarZzb.zzO(zzaelVar.zza);
                            }
                            int iZzb = zzbb.zzb(zzabVar.zzo);
                            if (iZzb == 1) {
                                i2 = iZzb;
                            } else if (iZzb == 2) {
                                i2 = 2;
                            } else {
                                zzaeiVar = null;
                            }
                            zzadt zzadtVarZzw = this.zzf.zzw(i9, i2);
                            zzadtVarZzw.zzm(zzzVarZzb.zzag());
                            zzaeiVar = new zzaei(i9, i2, jZzu, zzaehVar.zzd, zzadtVarZzw);
                            this.zzh = Math.max(this.zzh, jZzu);
                        }
                        if (zzaeiVar != null) {
                            arrayList.add(zzaeiVar);
                        }
                        i9 = i10;
                    }
                    i = i8;
                    zzaeiVar = zzaeiVar2;
                    if (zzaeiVar != null) {
                        arrayList.add(zzaeiVar);
                    }
                    i9 = i10;
                } else {
                    i = i8;
                }
                i8 = i + 1;
                i3 = 0;
                zzaeiVar2 = null;
            }
            this.zzi = (zzaei[]) arrayList.toArray(new zzaei[i3]);
            this.zzf.zzD();
            this.zze = 3;
            return i3;
        }
        if (i4 == 3) {
            long j3 = this.zzm;
            if (j3 != -1 && zzacoVar.zzf() != j3) {
                this.zzj = j3;
                return 0;
            }
            zzacoVar.zzh(this.zza.zzN(), 0, 12);
            zzacoVar.zzj();
            this.zza.zzL(0);
            this.zzb.zza(this.zza);
            zzdy zzdyVar3 = this.zza;
            zzaed zzaedVar3 = this.zzb;
            int iZzi = zzdyVar3.zzi();
            int i15 = zzaedVar3.zza;
            if (i15 == 1179011410) {
                zzacoVar.zzk(12);
                return 0;
            }
            if (i15 != 1414744396 || iZzi != 1769369453) {
                this.zzj = zzacoVar.zzf() + ((long) this.zzb.zzb) + 8;
                return 0;
            }
            long jZzf2 = zzacoVar.zzf();
            this.zzm = jZzf2;
            long j4 = jZzf2 + ((long) this.zzb.zzb) + 8;
            this.zzn = j4;
            if (!this.zzp) {
                zzaeg zzaegVar2 = this.zzg;
                zzaegVar2.getClass();
                if ((zzaegVar2.zzb & 16) == 16) {
                    this.zze = 4;
                    this.zzj = j4;
                    return 0;
                }
                this.zzf.zzO(new zzadl(this.zzh, 0L));
                this.zzp = true;
            }
            this.zzj = zzacoVar.zzf() + 12;
            this.zze = 6;
            return 0;
        }
        if (i4 == 4) {
            zzacoVar.zzi(this.zza.zzN(), 0, 8);
            this.zza.zzL(0);
            zzdy zzdyVar4 = this.zza;
            int iZzi2 = zzdyVar4.zzi();
            int iZzi3 = zzdyVar4.zzi();
            if (iZzi2 == 829973609) {
                this.zze = 5;
                this.zzo = iZzi3;
            } else {
                this.zzj = zzacoVar.zzf() + ((long) iZzi3);
            }
            return 0;
        }
        if (i4 == 5) {
            zzdy zzdyVar5 = new zzdy(this.zzo);
            zzacoVar.zzi(zzdyVar5.zzN(), 0, this.zzo);
            if (zzdyVar5.zzb() < 16) {
                j = 0;
            } else {
                int iZzd = zzdyVar5.zzd();
                zzdyVar5.zzM(8);
                long jZzi = zzdyVar5.zzi();
                long j5 = this.zzm;
                j = jZzi > j5 ? 0L : j5 + 8;
                zzdyVar5.zzL(iZzd);
            }
            while (zzdyVar5.zzb() >= 16) {
                int iZzi4 = zzdyVar5.zzi();
                int iZzi5 = zzdyVar5.zzi();
                long jZzi2 = ((long) zzdyVar5.zzi()) + j;
                zzdyVar5.zzi();
                zzaei zzaeiVarZzg = zzg(iZzi4);
                if (zzaeiVarZzg != null) {
                    zzaeiVarZzg.zzb(jZzi2, (iZzi5 & 16) == 16);
                }
            }
            for (zzaei zzaeiVar3 : this.zzi) {
                zzaeiVar3.zzc();
            }
            this.zzp = true;
            this.zzf.zzO(new zzaec(this, this.zzh));
            this.zze = 6;
            this.zzj = this.zzm;
            return 0;
        }
        if (zzacoVar.zzf() >= this.zzn) {
            return -1;
        }
        zzaei zzaeiVar4 = this.zzk;
        if (zzaeiVar4 != null) {
            if (!zzaeiVar4.zzg(zzacoVar)) {
                return 0;
            }
            this.zzk = null;
            return 0;
        }
        if ((zzacoVar.zzf() & 1) == 1) {
            zzacoVar.zzk(1);
        }
        zzacoVar.zzh(this.zza.zzN(), 0, 12);
        this.zza.zzL(0);
        int iZzi6 = this.zza.zzi();
        if (iZzi6 == 1414744396) {
            this.zza.zzL(8);
            zzacoVar.zzk(this.zza.zzi() != 1769369453 ? 8 : 12);
            zzacoVar.zzj();
            return 0;
        }
        int iZzi7 = this.zza.zzi();
        if (iZzi6 == 1263424842) {
            this.zzj = zzacoVar.zzf() + ((long) iZzi7) + 8;
            return 0;
        }
        zzacoVar.zzk(8);
        zzacoVar.zzj();
        zzaei zzaeiVarZzg2 = zzg(iZzi6);
        if (zzaeiVarZzg2 == null) {
            this.zzj = zzacoVar.zzf() + ((long) iZzi7);
            return 0;
        }
        zzaeiVarZzg2.zzd(iZzi7);
        this.zzk = zzaeiVarZzg2;
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
        this.zze = 0;
        if (this.zzc) {
            zzacqVar = new zzakg(zzacqVar, this.zzd);
        }
        this.zzf = zzacqVar;
        this.zzj = -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzf(long j, long j2) {
        this.zzj = -1L;
        this.zzk = null;
        for (zzaei zzaeiVar : this.zzi) {
            zzaeiVar.zze(j);
        }
        if (j == 0) {
            this.zze = this.zzi.length != 0 ? 3 : 0;
        } else {
            this.zze = 6;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final boolean zzi(zzaco zzacoVar) throws IOException {
        zzacoVar.zzh(this.zza.zzN(), 0, 12);
        this.zza.zzL(0);
        if (this.zza.zzi() != 1179011410) {
            return false;
        }
        this.zza.zzM(4);
        return this.zza.zzi() == 541677121;
    }

    public zzaef(int i, zzakd zzakdVar) {
        this.zzd = zzakdVar;
        this.zzc = 1 == (i ^ 1);
        this.zza = new zzdy(12);
        this.zzb = new zzaed(null);
        this.zzf = new zzadh();
        this.zzi = new zzaei[0];
        this.zzm = -1L;
        this.zzn = -1L;
        this.zzl = -1;
        this.zzh = C.TIME_UNSET;
    }
}
