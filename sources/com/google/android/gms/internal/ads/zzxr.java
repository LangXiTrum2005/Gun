package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzxr extends zzxo {
    private final boolean zze;
    private final zzxh zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final int zzn;
    private final int zzo;
    private final boolean zzp;
    private final int zzq;
    private final int zzr;
    private final boolean zzs;
    private final boolean zzt;
    private final int zzu;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:108:0x015e  */
    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    /* JADX WARN: Code duplicated, block: B:21:0x0036  */
    /* JADX WARN: Code duplicated, block: B:76:0x0105  */
    /* JADX WARN: Code duplicated, block: B:95:0x0143  */
    public zzxr(int i, zzbr zzbrVar, int i2, zzxh zzxhVar, int i3, @Nullable String str, int i4, boolean z) {
        boolean z2;
        boolean z3;
        int i5;
        int iZzc;
        int i6;
        byte b;
        boolean z4;
        zzab zzabVar;
        int i7;
        int i8;
        int i9;
        super(i, zzbrVar, i2);
        this.zzf = zzxhVar;
        int i10 = 1;
        int i11 = true != zzxhVar.zzF ? 16 : 24;
        if (z) {
            zzab zzabVar2 = this.zzd;
            int i12 = zzabVar2.zzv;
            float f = zzabVar2.zzx;
            if (f == -1.0f || f <= 2.1474836E9f) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        this.zze = z2;
        if (!z || (((i7 = (zzabVar = this.zzd).zzv) != -1 && i7 < 0) || ((i8 = zzabVar.zzw) != -1 && i8 < 0))) {
            z3 = false;
        } else {
            float f2 = zzabVar.zzx;
            if ((f2 == -1.0f || f2 >= 0.0f) && ((i9 = zzabVar.zzj) == -1 || i9 >= 0)) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        this.zzg = z3;
        this.zzh = zzlk.zza(i3, false);
        zzab zzabVar3 = this.zzd;
        float f3 = zzabVar3.zzx;
        this.zzi = f3 != -1.0f && f3 >= 10.0f;
        this.zzj = zzabVar3.zzj;
        this.zzk = zzabVar3.zza();
        int i13 = 0;
        while (true) {
            i5 = Integer.MAX_VALUE;
            if (i13 >= zzxhVar.zzm.size()) {
                i13 = Integer.MAX_VALUE;
                iZzc = 0;
                break;
            } else {
                iZzc = zzxt.zzc(this.zzd, (String) zzxhVar.zzm.get(i13), false);
                if (iZzc > 0) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        this.zzm = i13;
        this.zzn = iZzc;
        this.zzo = zzxt.zzb(this.zzd.zzf, 0);
        int i14 = this.zzd.zzf;
        this.zzp = i14 == 0 || (i14 & 1) != 0;
        this.zzq = zzxt.zzc(this.zzd, str, zzxt.zzh(str) == null);
        for (int i15 = 0; i15 < zzxhVar.zzl.size(); i15++) {
            String str2 = this.zzd.zzo;
            if (str2 != null && str2.equals(zzxhVar.zzl.get(i15))) {
                i5 = i15;
                break;
            }
        }
        this.zzl = i5;
        this.zzs = (i3 & 384) == 128;
        this.zzt = (i3 & 64) == 64;
        zzab zzabVar4 = this.zzd;
        String str3 = zzabVar4.zzo;
        if (str3 == null) {
            i6 = 0;
        } else {
            i6 = 4;
            switch (str3) {
                case "video/dolby-vision":
                    b = 0;
                    break;
                case "video/av01":
                    b = 1;
                    break;
                case "video/hevc":
                    b = 2;
                    break;
                case "video/avc":
                    b = 4;
                    break;
                case "video/x-vnd.on2.vp9":
                    b = 3;
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b == 0) {
                i6 = 5;
            } else if (b != 1) {
                if (b == 2) {
                    i6 = 3;
                } else if (b == 3) {
                    i6 = 2;
                } else if (b != 4) {
                    i6 = 0;
                } else {
                    i6 = 1;
                }
            }
        }
        this.zzu = i6;
        if ((zzabVar4.zzf & 16384) != 0) {
            i10 = 0;
        } else {
            zzxh zzxhVar2 = this.zzf;
            if (!zzlk.zza(i3, zzxhVar2.zzO) || (!(z4 = this.zze) && !zzxhVar2.zzD)) {
                i10 = 0;
            } else if (zzlk.zza(i3, false) && this.zzg && z4 && zzabVar4.zzj != -1 && (i11 & i3) != 0) {
                i10 = 2;
            }
        }
        this.zzr = i10;
    }

    public static /* synthetic */ int zza(zzxr zzxrVar, zzxr zzxrVar2) {
        zzfyy zzfyyVarZza = (zzxrVar.zze && zzxrVar.zzh) ? zzxt.zzc : zzxt.zzc.zza();
        zzfxc zzfxcVarZzj = zzfxc.zzj();
        boolean z = zzxrVar.zzf.zzz;
        return zzfxcVarZzj.zzc(Integer.valueOf(zzxrVar.zzk), Integer.valueOf(zzxrVar2.zzk), zzfyyVarZza).zzc(Integer.valueOf(zzxrVar.zzj), Integer.valueOf(zzxrVar2.zzj), zzfyyVarZza).zza();
    }

    public static /* synthetic */ int zzd(zzxr zzxrVar, zzxr zzxrVar2) {
        zzfxc zzfxcVarZzd = zzfxc.zzj().zzd(zzxrVar.zzh, zzxrVar2.zzh).zzc(Integer.valueOf(zzxrVar.zzm), Integer.valueOf(zzxrVar2.zzm), zzfyy.zzc().zza()).zzb(zzxrVar.zzn, zzxrVar2.zzn).zzb(zzxrVar.zzo, zzxrVar2.zzo).zzd(zzxrVar.zzp, zzxrVar2.zzp).zzb(zzxrVar.zzq, zzxrVar2.zzq).zzd(zzxrVar.zzi, zzxrVar2.zzi).zzd(zzxrVar.zze, zzxrVar2.zze).zzd(zzxrVar.zzg, zzxrVar2.zzg).zzc(Integer.valueOf(zzxrVar.zzl), Integer.valueOf(zzxrVar2.zzl), zzfyy.zzc().zza()).zzd(zzxrVar.zzs, zzxrVar2.zzs).zzd(zzxrVar.zzt, zzxrVar2.zzt);
        if (zzxrVar.zzs && zzxrVar.zzt) {
            zzfxcVarZzd = zzfxcVarZzd.zzb(zzxrVar.zzu, zzxrVar2.zzu);
        }
        return zzfxcVarZzd.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzxo
    public final int zzb() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzxo
    public final /* bridge */ /* synthetic */ boolean zzc(zzxo zzxoVar) {
        zzxr zzxrVar = (zzxr) zzxoVar;
        if (!Objects.equals(this.zzd.zzo, zzxrVar.zzd.zzo)) {
            return false;
        }
        boolean z = this.zzf.zzG;
        return this.zzs == zzxrVar.zzs && this.zzt == zzxrVar.zzt;
    }
}
