package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class zzamo implements zzamj {
    private static final float[] zza = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    @Nullable
    private final zzaoa zzb;

    @Nullable
    private final zzdy zzc;
    private final boolean[] zzd;
    private final zzamm zze;

    @Nullable
    private final zzanb zzf;
    private zzamn zzg;
    private long zzh;
    private String zzi;
    private zzadt zzj;
    private boolean zzk;
    private long zzl;

    public zzamo() {
        this(null);
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zza(zzdy zzdyVar) {
        int i;
        float f;
        float f2;
        zzcw.zzb(this.zzg);
        zzcw.zzb(this.zzj);
        int iZzd = zzdyVar.zzd();
        int iZze = zzdyVar.zze();
        byte[] bArrZzN = zzdyVar.zzN();
        this.zzh += (long) zzdyVar.zzb();
        this.zzj.zzr(zzdyVar, zzdyVar.zzb());
        while (true) {
            int iZza = zzfk.zza(bArrZzN, iZzd, iZze, this.zzd);
            if (iZza == iZze) {
                break;
            }
            int i2 = iZza + 3;
            int i3 = zzdyVar.zzN()[i2] & 255;
            int i4 = iZza - iZzd;
            if (!this.zzk) {
                if (i4 > 0) {
                    this.zze.zza(bArrZzN, iZzd, iZza);
                }
                if (this.zze.zzc(i3, i4 < 0 ? -i4 : 0)) {
                    zzadt zzadtVar = this.zzj;
                    zzamm zzammVar = this.zze;
                    int i5 = zzammVar.zzb;
                    String str = this.zzi;
                    str.getClass();
                    byte[] bArrCopyOf = Arrays.copyOf(zzammVar.zzc, zzammVar.zza);
                    zzdx zzdxVar = new zzdx(bArrCopyOf, bArrCopyOf.length);
                    zzdxVar.zzo(i5);
                    zzdxVar.zzo(4);
                    zzdxVar.zzm();
                    zzdxVar.zzn(8);
                    if (zzdxVar.zzp()) {
                        zzdxVar.zzn(4);
                        zzdxVar.zzn(3);
                    }
                    int iZzd2 = zzdxVar.zzd(4);
                    if (iZzd2 == 15) {
                        int iZzd3 = zzdxVar.zzd(8);
                        int iZzd4 = zzdxVar.zzd(8);
                        if (iZzd4 == 0) {
                            zzdo.zzf("H263Reader", "Invalid aspect ratio");
                            f2 = 1.0f;
                        } else {
                            f = iZzd3 / iZzd4;
                            f2 = f;
                        }
                    } else if (iZzd2 < 7) {
                        f = zza[iZzd2];
                        f2 = f;
                    } else {
                        zzdo.zzf("H263Reader", "Invalid aspect ratio");
                        f2 = 1.0f;
                    }
                    if (zzdxVar.zzp()) {
                        zzdxVar.zzn(2);
                        zzdxVar.zzn(1);
                        if (zzdxVar.zzp()) {
                            zzdxVar.zzn(15);
                            zzdxVar.zzm();
                            zzdxVar.zzn(15);
                            zzdxVar.zzm();
                            zzdxVar.zzn(15);
                            zzdxVar.zzm();
                            zzdxVar.zzn(3);
                            zzdxVar.zzn(11);
                            zzdxVar.zzm();
                            zzdxVar.zzn(15);
                            zzdxVar.zzm();
                        }
                    }
                    if (zzdxVar.zzd(2) != 0) {
                        zzdo.zzf("H263Reader", "Unhandled video object layer shape");
                    }
                    zzdxVar.zzm();
                    int iZzd5 = zzdxVar.zzd(16);
                    zzdxVar.zzm();
                    if (zzdxVar.zzp()) {
                        if (iZzd5 == 0) {
                            zzdo.zzf("H263Reader", "Invalid vop_increment_time_resolution");
                        } else {
                            int i6 = iZzd5 - 1;
                            int i7 = 0;
                            while (i6 > 0) {
                                i6 >>= 1;
                                i7++;
                            }
                            zzdxVar.zzn(i7);
                        }
                    }
                    zzdxVar.zzm();
                    int iZzd6 = zzdxVar.zzd(13);
                    zzdxVar.zzm();
                    int iZzd7 = zzdxVar.zzd(13);
                    zzdxVar.zzm();
                    zzdxVar.zzm();
                    zzz zzzVar = new zzz();
                    zzzVar.zzM(str);
                    zzzVar.zzaa(MimeTypes.VIDEO_MP4V);
                    zzzVar.zzaf(iZzd6);
                    zzzVar.zzK(iZzd7);
                    zzzVar.zzW(f2);
                    zzzVar.zzN(Collections.singletonList(bArrCopyOf));
                    zzadtVar.zzm(zzzVar.zzag());
                    this.zzk = true;
                }
            }
            this.zzg.zza(bArrZzN, iZzd, iZza);
            zzanb zzanbVar = this.zzf;
            if (zzanbVar != null) {
                if (i4 > 0) {
                    zzanbVar.zza(bArrZzN, iZzd, iZza);
                    i = 0;
                } else {
                    i = -i4;
                }
                if (this.zzf.zzd(i)) {
                    zzanb zzanbVar2 = this.zzf;
                    int iZzb = zzfk.zzb(zzanbVar2.zza, zzanbVar2.zzb);
                    zzdy zzdyVar2 = this.zzc;
                    int i8 = zzei.zza;
                    zzdyVar2.zzJ(this.zzf.zza, iZzb);
                    this.zzb.zza(this.zzl, this.zzc);
                }
                if (i3 == 178) {
                    if (zzdyVar.zzN()[iZza + 2] == 1) {
                        this.zzf.zzc(178);
                    }
                    i3 = 178;
                }
            }
            int i9 = iZze - iZza;
            this.zzg.zzb(this.zzh - ((long) i9), i9, this.zzk);
            this.zzg.zzc(i3, this.zzl);
            iZzd = i2;
        }
        if (!this.zzk) {
            this.zze.zza(bArrZzN, iZzd, iZze);
        }
        this.zzg.zza(bArrZzN, iZzd, iZze);
        zzanb zzanbVar3 = this.zzf;
        if (zzanbVar3 != null) {
            zzanbVar3.zza(bArrZzN, iZzd, iZze);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zzb(zzacq zzacqVar, zzanx zzanxVar) {
        zzanxVar.zzc();
        this.zzi = zzanxVar.zzb();
        zzadt zzadtVarZzw = zzacqVar.zzw(zzanxVar.zza(), 2);
        this.zzj = zzadtVarZzw;
        this.zzg = new zzamn(zzadtVarZzw);
        zzaoa zzaoaVar = this.zzb;
        if (zzaoaVar != null) {
            zzaoaVar.zzb(zzacqVar, zzanxVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zzc(boolean z) {
        zzcw.zzb(this.zzg);
        if (z) {
            this.zzg.zzb(this.zzh, 0, this.zzk);
            this.zzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zzd(long j, int i) {
        this.zzl = j;
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zze() {
        zzfk.zzh(this.zzd);
        this.zze.zzb();
        zzamn zzamnVar = this.zzg;
        if (zzamnVar != null) {
            zzamnVar.zzd();
        }
        zzanb zzanbVar = this.zzf;
        if (zzanbVar != null) {
            zzanbVar.zzb();
        }
        this.zzh = 0L;
        this.zzl = C.TIME_UNSET;
    }

    public zzamo(@Nullable zzaoa zzaoaVar) {
        zzdy zzdyVar;
        this.zzb = zzaoaVar;
        this.zzd = new boolean[4];
        this.zze = new zzamm(128);
        this.zzl = C.TIME_UNSET;
        if (zzaoaVar != null) {
            this.zzf = new zzanb(178, 128);
            zzdyVar = new zzdy();
        } else {
            zzdyVar = null;
            this.zzf = null;
        }
        this.zzc = zzdyVar;
    }
}
