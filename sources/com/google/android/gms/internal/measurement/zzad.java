package com.google.android.gms.internal.measurement;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
final class zzad implements Iterator {
    final /* synthetic */ zzae zza;
    private int zzb = 0;

    public zzad(zzae zzaeVar) {
        this.zza = zzaeVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zza.zzc();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.zzb >= this.zza.zzc()) {
            throw new NoSuchElementException(AbstractC3950lJ.p("Out of bounds index: ", this.zzb));
        }
        zzae zzaeVar = this.zza;
        int i = this.zzb;
        this.zzb = i + 1;
        return zzaeVar.zze(i);
    }
}
