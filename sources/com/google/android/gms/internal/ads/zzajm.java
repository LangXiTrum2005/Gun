package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.OggPageHeader;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class zzajm {
    private final zzajn zza = new zzajn();
    private final zzdy zzb = new zzdy(new byte[OggPageHeader.MAX_PAGE_PAYLOAD], 0);
    private int zzc = -1;
    private int zzd;
    private boolean zze;

    private final int zzf(int i) {
        int i2;
        int i3 = 0;
        this.zzd = 0;
        do {
            int i4 = this.zzd;
            int i5 = i + i4;
            zzajn zzajnVar = this.zza;
            if (i5 >= zzajnVar.zzc) {
                break;
            }
            this.zzd = i4 + 1;
            i2 = zzajnVar.zzf[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public final zzdy zza() {
        return this.zzb;
    }

    public final zzajn zzb() {
        return this.zza;
    }

    public final void zzc() {
        this.zza.zza();
        this.zzb.zzI(0);
        this.zzc = -1;
        this.zze = false;
    }

    public final void zzd() {
        zzdy zzdyVar = this.zzb;
        if (zzdyVar.zzN().length == 65025) {
            return;
        }
        zzdyVar.zzJ(Arrays.copyOf(zzdyVar.zzN(), Math.max(OggPageHeader.MAX_PAGE_PAYLOAD, zzdyVar.zze())), this.zzb.zze());
    }

    public final boolean zze(zzaco zzacoVar) throws IOException {
        if (this.zze) {
            this.zze = false;
            this.zzb.zzI(0);
        }
        while (true) {
            if (this.zze) {
                return true;
            }
            int i = this.zzc;
            if (i < 0) {
                if (!this.zza.zzc(zzacoVar, -1L) || !this.zza.zzb(zzacoVar, true)) {
                    return false;
                }
                zzajn zzajnVar = this.zza;
                int iZzf = zzajnVar.zzd;
                if ((zzajnVar.zza & 1) == 1 && this.zzb.zze() == 0) {
                    iZzf += zzf(0);
                    i = this.zzd;
                } else {
                    i = 0;
                }
                if (!zzacr.zze(zzacoVar, iZzf)) {
                    return false;
                }
                this.zzc = i;
            }
            int iZzf2 = zzf(i);
            int i2 = this.zzc + this.zzd;
            if (iZzf2 > 0) {
                zzdy zzdyVar = this.zzb;
                zzdyVar.zzF(zzdyVar.zze() + iZzf2);
                zzdy zzdyVar2 = this.zzb;
                if (!zzacr.zzd(zzacoVar, zzdyVar2.zzN(), zzdyVar2.zze(), iZzf2)) {
                    return false;
                }
                zzdy zzdyVar3 = this.zzb;
                zzdyVar3.zzK(zzdyVar3.zze() + iZzf2);
                this.zze = this.zza.zzf[i2 + (-1)] != 255;
            }
            if (i2 == this.zza.zzc) {
                i2 = -1;
            }
            this.zzc = i2;
        }
    }
}
