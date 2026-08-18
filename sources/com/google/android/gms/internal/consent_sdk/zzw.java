package com.google.android.gms.internal.consent_sdk;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC2286Aj;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
final class zzw {
    private final zzx zza;
    private final zzch zzb;
    private int zzc = 0;
    private EnumC2286Aj zzd = EnumC2286Aj.f2830a;

    public zzw(zzx zzxVar, zzch zzchVar) {
        this.zza = zzxVar;
        this.zzb = zzchVar;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00b0  */
    public final zzz zza() throws zzg {
        String str;
        int i = this.zzb.zzf;
        this.zza.zzc.zzh(i == 8);
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        switch (i2) {
            case 1:
            case 2:
            case 3:
                this.zzc = 3;
                break;
            case 4:
                this.zzc = 2;
                break;
            case 5:
                this.zzc = 1;
                break;
            case 6:
                throw new zzg(1, "Invalid response from server: ".concat(String.valueOf(this.zzb.zzc)));
            case 7:
                throw new zzg(3, "Publisher misconfiguration: ".concat(String.valueOf(this.zzb.zzc)));
            default:
                throw new zzg(1, "Invalid response from server.");
        }
        zzch zzchVar = this.zzb;
        int i3 = zzchVar.zzg;
        int i4 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        if (i4 == 1) {
            this.zzd = EnumC2286Aj.c;
        } else {
            if (i4 != 2) {
                throw new zzg(1, "Invalid response from server.");
            }
            this.zzd = EnumC2286Aj.b;
        }
        String str2 = zzchVar.zza;
        zzbm zzbmVar = str2 == null ? null : new zzbm(zzchVar.zzb, str2);
        this.zza.zzc.zzj(new HashSet(zzchVar.zzd));
        for (zzcg zzcgVar : this.zzb.zze) {
            int i5 = zzcgVar.zzb;
            int i6 = i5 - 1;
            if (i5 == 0) {
                throw null;
            }
            if (i6 == 0) {
                str = null;
            } else if (i6 == 1) {
                str = "write";
            } else if (i6 != 2) {
                str = null;
            } else {
                str = "clear";
            }
            if (str != null) {
                zzx zzxVar = this.zza;
                zzxVar.zza.zzb(str, zzcgVar.zza, zzxVar.zzb);
            }
        }
        return new zzz(this.zzc, this.zzd, zzbmVar, null);
    }
}
