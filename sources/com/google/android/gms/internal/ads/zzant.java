package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.badlogic.gdx.Input;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzant implements zzacn {
    private final int zza;
    private final List zzb;
    private final zzdy zzc;
    private final SparseIntArray zzd;
    private final zzanw zze;
    private final zzakd zzf;
    private final SparseArray zzg;
    private final SparseBooleanArray zzh;
    private final SparseBooleanArray zzi;
    private final zzanq zzj;
    private zzanp zzk;
    private zzacq zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;

    @Deprecated
    public zzant() {
        this(1, 1, zzakd.zza, new zzef(0L), new zzamg(0), 112800);
    }

    /* JADX WARN: Code duplicated, block: B:97:0x01bd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    @Override // com.google.android.gms.internal.ads.zzacn
    public final int zzb(zzaco zzacoVar, zzadj zzadjVar) throws IOException {
        ?? r3;
        long j;
        boolean z;
        long jZzd = zzacoVar.zzd();
        if (this.zzn) {
            if (jZzd != -1) {
                zzanq zzanqVar = this.zzj;
                if (!zzanqVar.zzd()) {
                    return zzanqVar.zza(zzacoVar, zzadjVar, this.zzr);
                }
            }
            if (this.zzo) {
                j = 0;
            } else {
                this.zzo = true;
                zzanq zzanqVar2 = this.zzj;
                if (zzanqVar2.zzb() != C.TIME_UNSET) {
                    j = 0;
                    zzanp zzanpVar = new zzanp(zzanqVar2.zzc(), zzanqVar2.zzb(), jZzd, this.zzr, 112800);
                    this.zzk = zzanpVar;
                    this.zzl.zzO(zzanpVar.zzb());
                } else {
                    j = 0;
                    this.zzl.zzO(new zzadl(zzanqVar2.zzb(), 0L));
                }
            }
            if (this.zzp) {
                z = false;
                this.zzp = false;
                zzf(j, j);
                if (zzacoVar.zzf() != j) {
                    zzadjVar.zza = j;
                    return 1;
                }
            } else {
                z = false;
            }
            zzanp zzanpVar2 = this.zzk;
            r3 = z;
            if (zzanpVar2 != null && zzanpVar2.zze()) {
                r3 = z;
                return zzanpVar2.zza(zzacoVar, zzadjVar);
            }
        } else {
            r3 = 0;
        }
        r3 = z;
        zzdy zzdyVar = this.zzc;
        byte[] bArrZzN = zzdyVar.zzN();
        if (9400 - zzdyVar.zzd() < 188) {
            int iZzb = zzdyVar.zzb();
            if (iZzb > 0) {
                System.arraycopy(bArrZzN, zzdyVar.zzd(), bArrZzN, r3, iZzb);
            }
            this.zzc.zzJ(bArrZzN, iZzb);
        }
        while (true) {
            zzdy zzdyVar2 = this.zzc;
            if (zzdyVar2.zzb() >= 188) {
                int iZzd = zzdyVar2.zzd();
                int iZze = zzdyVar2.zze();
                int iZza = zzanz.zza(zzdyVar2.zzN(), iZzd, iZze);
                this.zzc.zzL(iZza);
                int i = iZza + Input.Keys.F18;
                if (i > iZze) {
                    this.zzq = (iZza - iZzd) + this.zzq;
                } else {
                    this.zzq = r3;
                }
                zzdy zzdyVar3 = this.zzc;
                int iZze2 = zzdyVar3.zze();
                if (i > iZze2) {
                    return r3;
                }
                int iZzg = zzdyVar3.zzg();
                if ((8388608 & iZzg) != 0) {
                    this.zzc.zzL(i);
                    return r3;
                }
                int i2 = (4194304 & iZzg) != 0 ? 1 : 0;
                int i3 = iZzg & 32;
                int i4 = (iZzg >> 8) & 8191;
                zzany zzanyVar = (iZzg & 16) != 0 ? (zzany) this.zzg.get(i4) : null;
                if (zzanyVar == null) {
                    this.zzc.zzL(i);
                    return r3;
                }
                int i5 = iZzg & 15;
                int i6 = this.zzd.get(i4, i5 - 1);
                this.zzd.put(i4, i5);
                if (i6 == i5) {
                    this.zzc.zzL(i);
                    return r3;
                }
                if (i5 != ((i6 + 1) & 15)) {
                    zzanyVar.zzc();
                }
                if (i3 != 0) {
                    zzdy zzdyVar4 = this.zzc;
                    int iZzm = zzdyVar4.zzm();
                    i2 |= (zzdyVar4.zzm() & 64) != 0 ? 2 : 0;
                    this.zzc.zzM(iZzm - 1);
                }
                boolean z2 = this.zzn;
                if (z2 || !this.zzi.get(i4, r3)) {
                    this.zzc.zzK(i);
                    zzanyVar.zza(this.zzc, i2);
                    this.zzc.zzK(iZze2);
                    if (!z2) {
                        if (this.zzn && jZzd != -1) {
                            this.zzp = true;
                        }
                    }
                } else if (this.zzn) {
                    this.zzp = true;
                }
                this.zzc.zzL(i);
                return r3;
            }
            int iZze3 = zzdyVar2.zze();
            int iZza2 = zzacoVar.zza(bArrZzN, iZze3, 9400 - iZze3);
            if (iZza2 == -1) {
                for (int i7 = 0; i7 < this.zzg.size(); i7++) {
                    zzany zzanyVar2 = (zzany) this.zzg.valueAt(i7);
                    if (zzanyVar2 instanceof zzand) {
                        zzand zzandVar = (zzand) zzanyVar2;
                        if (zzandVar.zzd(r3)) {
                            zzandVar.zza(new zzdy(), 1);
                        }
                    }
                }
                return -1;
            }
            this.zzc.zzK(iZze3 + iZza2);
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
        if (this.zza == 0) {
            zzacqVar = new zzakg(zzacqVar, this.zzf);
        }
        this.zzl = zzacqVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0031  */
    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzf(long j, long j2) {
        zzanp zzanpVar;
        int size = this.zzb.size();
        for (int i = 0; i < size; i++) {
            zzef zzefVar = (zzef) this.zzb.get(i);
            if (zzefVar.zzf() != C.TIME_UNSET) {
                long jZzd = zzefVar.zzd();
                if (jZzd != C.TIME_UNSET && jZzd != 0 && jZzd != j2) {
                    zzefVar.zzi(j2);
                }
            } else {
                zzefVar.zzi(j2);
            }
        }
        if (j2 != 0 && (zzanpVar = this.zzk) != null) {
            zzanpVar.zzd(j2);
        }
        this.zzc.zzI(0);
        this.zzd.clear();
        for (int i2 = 0; i2 < this.zzg.size(); i2++) {
            ((zzany) this.zzg.valueAt(i2)).zzc();
        }
        this.zzq = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final boolean zzi(zzaco zzacoVar) throws IOException {
        byte[] bArrZzN = this.zzc.zzN();
        zzacc zzaccVar = (zzacc) zzacoVar;
        zzaccVar.zzm(bArrZzN, 0, 940, false);
        for (int i = 0; i < 188; i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    zzaccVar.zzo(i, false);
                    return true;
                }
                if (bArrZzN[(i2 * Input.Keys.F18) + i] != 71) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public zzant(int i, int i2, zzakd zzakdVar, zzef zzefVar, zzanw zzanwVar, int i3) {
        this.zze = zzanwVar;
        this.zza = i2;
        this.zzf = zzakdVar;
        this.zzb = Collections.singletonList(zzefVar);
        this.zzc = new zzdy(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.zzh = sparseBooleanArray;
        this.zzi = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.zzg = sparseArray;
        this.zzd = new SparseIntArray();
        this.zzj = new zzanq(112800);
        this.zzl = zzacq.zza;
        this.zzr = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArrayZza = zzanwVar.zza();
        int size = sparseArrayZza.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.zzg.put(sparseArrayZza.keyAt(i4), (zzany) sparseArrayZza.valueAt(i4));
        }
        this.zzg.put(0, new zzanl(new zzanr(this)));
    }
}
