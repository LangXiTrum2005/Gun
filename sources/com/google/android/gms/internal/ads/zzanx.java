package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;

/* JADX INFO: loaded from: classes3.dex */
public final class zzanx {
    private final String zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private String zze;

    public zzanx(int i, int i2, int i3) {
        this.zza = i != Integer.MIN_VALUE ? AbstractC3950lJ.n(i, "/") : "";
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = Integer.MIN_VALUE;
        this.zze = "";
    }

    private final void zzd() {
        if (this.zzd == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public final int zza() {
        zzd();
        return this.zzd;
    }

    public final String zzb() {
        zzd();
        return this.zze;
    }

    public final void zzc() {
        int i = this.zzd;
        int i2 = i == Integer.MIN_VALUE ? this.zzb : i + this.zzc;
        this.zzd = i2;
        this.zze = this.zza + i2;
    }
}
