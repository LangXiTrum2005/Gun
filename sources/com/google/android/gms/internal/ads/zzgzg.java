package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzgzg implements zzgzv {
    private final zzgzc zza;
    private final zzhah zzb;
    private final boolean zzc;
    private final zzgxc zzd;

    private zzgzg(zzhah zzhahVar, zzgxc zzgxcVar, zzgzc zzgzcVar) {
        this.zzb = zzhahVar;
        this.zzc = zzgzcVar instanceof zzgxn;
        this.zzd = zzgxcVar;
        this.zza = zzgzcVar;
    }

    public static zzgzg zzc(zzhah zzhahVar, zzgxc zzgxcVar, zzgzc zzgzcVar) {
        return new zzgzg(zzhahVar, zzgxcVar, zzgzcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    public final int zza(Object obj) {
        int iZzb = ((zzgxr) obj).zzt.zzb();
        return this.zzc ? iZzb + ((zzgxn) obj).zza.zzd() : iZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    public final int zzb(Object obj) {
        int iHashCode = ((zzgxr) obj).zzt.hashCode();
        return this.zzc ? (iHashCode * 53) + ((zzgxn) obj).zza.zza.hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    public final Object zze() {
        zzgzc zzgzcVar = this.zza;
        return zzgzcVar instanceof zzgxr ? ((zzgxr) zzgzcVar).zzbj() : zzgzcVar.zzcX().zzbs();
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    public final void zzf(Object obj) {
        this.zzb.zzi(obj);
        this.zzd.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    public final void zzg(Object obj, Object obj2) {
        zzgzx.zzq(this.zzb, obj, obj2);
        if (this.zzc) {
            zzgzx.zzp(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    public final void zzh(Object obj, zzgzp zzgzpVar, zzgxb zzgxbVar) throws IOException {
        this.zzb.zza(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzgvx zzgvxVar) throws IOException {
        zzgxr zzgxrVar = (zzgxr) obj;
        if (zzgxrVar.zzt == zzhai.zzc()) {
            zzgxrVar.zzt = zzhai.zzf();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    public final void zzj(Object obj, zzhaw zzhawVar) throws IOException {
        Iterator itZzf = ((zzgxn) obj).zza.zzf();
        while (itZzf.hasNext()) {
            Map.Entry entry = (Map.Entry) itZzf.next();
            zzgxf zzgxfVar = (zzgxf) entry.getKey();
            if (zzgxfVar.zzc() != zzhav.MESSAGE || zzgxfVar.zze() || zzgxfVar.zzd()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof zzgyj) {
                zzhawVar.zzw(zzgxfVar.zza(), ((zzgyj) entry).zza().zzb());
            } else {
                zzhawVar.zzw(zzgxfVar.zza(), entry.getValue());
            }
        }
        ((zzgxr) obj).zzt.zzk(zzhawVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    public final boolean zzk(Object obj, Object obj2) {
        if (!((zzgxr) obj).zzt.equals(((zzgxr) obj2).zzt)) {
            return false;
        }
        if (this.zzc) {
            return ((zzgxn) obj).zza.equals(((zzgxn) obj2).zza);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    public final boolean zzl(Object obj) {
        return ((zzgxn) obj).zza.zzi();
    }
}
