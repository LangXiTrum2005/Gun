package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.badlogic.gdx.Input;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;

/* JADX INFO: loaded from: classes3.dex */
public final class zzadf {
    public int zza;

    @Nullable
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;

    public zzadf() {
    }

    public zzadf(zzadf zzadfVar) {
        this.zza = zzadfVar.zza;
        this.zzb = zzadfVar.zzb;
        this.zzc = zzadfVar.zzc;
        this.zzd = zzadfVar.zzd;
        this.zze = zzadfVar.zze;
        this.zzf = zzadfVar.zzf;
        this.zzg = zzadfVar.zzg;
    }

    public final boolean zza(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (!zzadg.zzm(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        int i6 = i4 - 1;
        this.zza = i2;
        this.zzb = zzadg.zza[3 - i3];
        int i7 = zzadg.zzb[i5];
        this.zzd = i7;
        if (i2 == 2) {
            i7 /= 2;
            this.zzd = i7;
        } else if (i2 == 0) {
            i7 /= 4;
            this.zzd = i7;
        }
        int i8 = (i >>> 9) & 1;
        this.zzg = zzadg.zzl(i2, i3);
        if (i3 == 3) {
            int i9 = i2 == 3 ? zzadg.zzc[i6] : zzadg.zzd[i6];
            this.zzf = i9;
            this.zzc = (((i9 * 12) / i7) + i8) * 4;
        } else {
            int i10 = Input.Keys.NUMPAD_0;
            if (i2 == 3) {
                int i11 = i3 == 2 ? zzadg.zze[i6] : zzadg.zzf[i6];
                this.zzf = i11;
                this.zzc = AbstractC3950lJ.D(i11, Input.Keys.NUMPAD_0, i7, i8);
            } else {
                int i12 = zzadg.zzg[i6];
                this.zzf = i12;
                if (i3 == 1) {
                    i10 = 72;
                }
                this.zzc = AbstractC3950lJ.D(i10, i12, i7, i8);
            }
        }
        this.zze = ((i >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
