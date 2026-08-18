package com.google.android.gms.internal.measurement;

import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
final class zziz extends zzja {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzja zzc;

    public zziz(zzja zzjaVar, int i, int i2) {
        this.zzc = zzjaVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzij.zza(i, this.zzb, "index");
        return this.zzc.get(i + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zziw
    @CheckForNull
    public final Object[] zze() {
        return this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.measurement.zzja, java.util.List
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzja subList(int i, int i2) {
        zzij.zzc(i, i2, this.zzb);
        zzja zzjaVar = this.zzc;
        int i3 = this.zza;
        return zzjaVar.subList(i + i3, i2 + i3);
    }
}
