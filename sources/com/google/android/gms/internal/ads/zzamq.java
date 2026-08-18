package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzamq implements zzamj {
    private final zzann zza;
    private long zze;
    private String zzg;
    private zzadt zzh;
    private zzamp zzi;
    private boolean zzj;
    private boolean zzl;
    private final boolean[] zzf = new boolean[3];
    private final zzanb zzb = new zzanb(7, 128);
    private final zzanb zzc = new zzanb(8, 128);
    private final zzanb zzd = new zzanb(6, 128);
    private long zzk = C.TIME_UNSET;
    private final zzdy zzm = new zzdy();

    public zzamq(zzann zzannVar, boolean z, boolean z2) {
        this.zza = zzannVar;
    }

    private final void zzf(byte[] bArr, int i, int i2) {
        if (!this.zzj) {
            this.zzb.zza(bArr, i, i2);
            this.zzc.zza(bArr, i, i2);
        }
        this.zzd.zza(bArr, i, i2);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0052  */
    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zza(zzdy zzdyVar) {
        int i;
        int i2;
        zzcw.zzb(this.zzh);
        int i3 = zzei.zza;
        int iZzd = zzdyVar.zzd();
        int iZze = zzdyVar.zze();
        byte[] bArrZzN = zzdyVar.zzN();
        this.zze += (long) zzdyVar.zzb();
        this.zzh.zzr(zzdyVar, zzdyVar.zzb());
        while (true) {
            int iZza = zzfk.zza(bArrZzN, iZzd, iZze, this.zzf);
            if (iZza == iZze) {
                zzf(bArrZzN, iZzd, iZze);
                return;
            }
            int i4 = iZza + 3;
            int i5 = bArrZzN[i4] & 31;
            int i6 = iZza - iZzd;
            if (i6 > 0) {
                zzf(bArrZzN, iZzd, iZza);
            }
            int i7 = iZze - iZza;
            long j = this.zze - ((long) i7);
            int i8 = i6 < 0 ? -i6 : 0;
            long j2 = this.zzk;
            if (this.zzj) {
                i = iZze;
                i2 = i4;
            } else {
                this.zzb.zzd(i8);
                this.zzc.zzd(i8);
                if (this.zzj) {
                    i = iZze;
                    i2 = i4;
                    zzanb zzanbVar = this.zzb;
                    if (zzanbVar.zze()) {
                        zzfj zzfjVarZzf = zzfk.zzf(zzanbVar.zza, 4, zzanbVar.zzb);
                        this.zza.zze(zzfjVarZzf.zzm);
                        this.zzi.zzc(zzfjVarZzf);
                        this.zzb.zzb();
                    } else {
                        zzanb zzanbVar2 = this.zzc;
                        if (zzanbVar2.zze()) {
                            this.zzi.zzb(zzfk.zze(zzanbVar2.zza, 4, zzanbVar2.zzb));
                            this.zzc.zzb();
                        }
                    }
                } else if (this.zzb.zze() && this.zzc.zze()) {
                    ArrayList arrayList = new ArrayList();
                    zzanb zzanbVar3 = this.zzb;
                    arrayList.add(Arrays.copyOf(zzanbVar3.zza, zzanbVar3.zzb));
                    zzanb zzanbVar4 = this.zzc;
                    arrayList.add(Arrays.copyOf(zzanbVar4.zza, zzanbVar4.zzb));
                    zzanb zzanbVar5 = this.zzb;
                    zzfj zzfjVarZzf2 = zzfk.zzf(zzanbVar5.zza, 4, zzanbVar5.zzb);
                    zzanb zzanbVar6 = this.zzc;
                    zzfi zzfiVarZze = zzfk.zze(zzanbVar6.zza, 4, zzanbVar6.zzb);
                    i2 = i4;
                    String strZzc = zzcy.zzc(zzfjVarZzf2.zza, zzfjVarZzf2.zzb, zzfjVarZzf2.zzc);
                    zzadt zzadtVar = this.zzh;
                    zzz zzzVar = new zzz();
                    i = iZze;
                    zzzVar.zzM(this.zzg);
                    zzzVar.zzaa("video/avc");
                    zzzVar.zzA(strZzc);
                    zzzVar.zzaf(zzfjVarZzf2.zze);
                    zzzVar.zzK(zzfjVarZzf2.zzf);
                    zzi zziVar = new zzi();
                    zziVar.zzc(zzfjVarZzf2.zzj);
                    zziVar.zzb(zzfjVarZzf2.zzk);
                    zziVar.zzd(zzfjVarZzf2.zzl);
                    zziVar.zzf(zzfjVarZzf2.zzh + 8);
                    zziVar.zza(zzfjVarZzf2.zzi + 8);
                    zzzVar.zzB(zziVar.zzg());
                    zzzVar.zzW(zzfjVarZzf2.zzg);
                    zzzVar.zzN(arrayList);
                    zzzVar.zzS(zzfjVarZzf2.zzm);
                    zzadtVar.zzm(zzzVar.zzag());
                    this.zzj = true;
                    this.zzi.zzc(zzfjVarZzf2);
                    this.zzi.zzb(zzfiVarZze);
                    this.zzb.zzb();
                    this.zzc.zzb();
                } else {
                    i = iZze;
                    i2 = i4;
                }
            }
            if (this.zzd.zzd(i8)) {
                zzanb zzanbVar7 = this.zzd;
                this.zzm.zzJ(this.zzd.zza, zzfk.zzb(zzanbVar7.zza, zzanbVar7.zzb));
                this.zzm.zzL(4);
                this.zza.zza(j2, this.zzm);
            }
            if (this.zzi.zzf(j, i7, this.zzj)) {
                this.zzl = false;
            }
            long j3 = this.zzk;
            if (!this.zzj) {
                this.zzb.zzc(i5);
                this.zzc.zzc(i5);
            }
            this.zzd.zzc(i5);
            this.zzi.zze(j, i5, j3, this.zzl);
            iZzd = i2;
            iZze = i;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zzb(zzacq zzacqVar, zzanx zzanxVar) {
        zzanxVar.zzc();
        this.zzg = zzanxVar.zzb();
        zzadt zzadtVarZzw = zzacqVar.zzw(zzanxVar.zza(), 2);
        this.zzh = zzadtVarZzw;
        this.zzi = new zzamp(zzadtVarZzw, false, false);
        this.zza.zzb(zzacqVar, zzanxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zzc(boolean z) {
        zzcw.zzb(this.zzh);
        int i = zzei.zza;
        if (z) {
            this.zza.zzc();
            this.zzi.zza(this.zze);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zzd(long j, int i) {
        this.zzk = j;
        int i2 = i & 2;
        this.zzl = (i2 != 0) | this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zze() {
        this.zze = 0L;
        this.zzl = false;
        this.zzk = C.TIME_UNSET;
        zzfk.zzh(this.zzf);
        this.zzb.zzb();
        this.zzc.zzb();
        this.zzd.zzb();
        this.zza.zzc();
        zzamp zzampVar = this.zzi;
        if (zzampVar != null) {
            zzampVar.zzd();
        }
    }
}
