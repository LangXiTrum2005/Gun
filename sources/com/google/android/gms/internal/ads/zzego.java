package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MobileAds;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
final class zzego implements zzgcd {
    final /* synthetic */ long zza;
    final /* synthetic */ zzfbr zzb;
    final /* synthetic */ zzfbo zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzfiv zze;
    final /* synthetic */ zzfca zzf;
    final /* synthetic */ zzegq zzg;

    public zzego(zzegq zzegqVar, long j, zzfbr zzfbrVar, zzfbo zzfboVar, String str, zzfiv zzfivVar, zzfca zzfcaVar) {
        this.zza = j;
        this.zzb = zzfbrVar;
        this.zzc = zzfboVar;
        this.zzd = str;
        this.zze = zzfivVar;
        this.zzf = zzfcaVar;
        this.zzg = zzegqVar;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0072 A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:32:0x006a, B:34:0x0072, B:36:0x007e, B:40:0x0086, B:41:0x008e, B:43:0x00a0, B:44:0x00b9, B:46:0x00c1, B:48:0x00c3, B:56:0x0101, B:57:0x010c, B:51:0x00e6, B:53:0x00ea, B:55:0x00f4), top: B:61:0x006a }] */
    /* JADX WARN: Code duplicated, block: B:36:0x007e A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:32:0x006a, B:34:0x0072, B:36:0x007e, B:40:0x0086, B:41:0x008e, B:43:0x00a0, B:44:0x00b9, B:46:0x00c1, B:48:0x00c3, B:56:0x0101, B:57:0x010c, B:51:0x00e6, B:53:0x00ea, B:55:0x00f4), top: B:61:0x006a }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00a0 A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:32:0x006a, B:34:0x0072, B:36:0x007e, B:40:0x0086, B:41:0x008e, B:43:0x00a0, B:44:0x00b9, B:46:0x00c1, B:48:0x00c3, B:56:0x0101, B:57:0x010c, B:51:0x00e6, B:53:0x00ea, B:55:0x00f4), top: B:61:0x006a }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c1 A[Catch: all -> 0x0083, DONT_GENERATE, TryCatch #0 {all -> 0x0083, blocks: (B:32:0x006a, B:34:0x0072, B:36:0x007e, B:40:0x0086, B:41:0x008e, B:43:0x00a0, B:44:0x00b9, B:46:0x00c1, B:48:0x00c3, B:56:0x0101, B:57:0x010c, B:51:0x00e6, B:53:0x00ea, B:55:0x00f4), top: B:61:0x006a }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00c3 A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:32:0x006a, B:34:0x0072, B:36:0x007e, B:40:0x0086, B:41:0x008e, B:43:0x00a0, B:44:0x00b9, B:46:0x00c1, B:48:0x00c3, B:56:0x0101, B:57:0x010c, B:51:0x00e6, B:53:0x00ea, B:55:0x00f4), top: B:61:0x006a }] */
    /* JADX WARN: Code duplicated, block: B:61:0x006a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable th) {
        Integer numValueOf;
        int i;
        com.google.android.gms.ads.internal.client.zze zzeVarZzb;
        zzegq zzegqVar;
        zzegq zzegqVar2;
        com.google.android.gms.ads.internal.client.zze zzeVarZza;
        int i2;
        com.google.android.gms.ads.internal.client.zze zzeVar;
        long jElapsedRealtime = this.zzg.zza.elapsedRealtime() - this.zza;
        if (!(th instanceof TimeoutException)) {
            if (th instanceof zzefy) {
                numValueOf = null;
                i = 3;
            } else if (th instanceof CancellationException) {
                i = 4;
            } else if (th instanceof zzfcq) {
                i = 5;
            } else {
                if (th instanceof zzdvy) {
                    int i3 = zzfdk.zza(th).zza == 3 ? 1 : 6;
                    numValueOf = (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzbK)).booleanValue() && (th instanceof zzeda) && (zzeVarZzb = ((zzeda) th).zzb()) != null) ? Integer.valueOf(zzeVarZzb.zza) : null;
                    i = i3;
                } else {
                    numValueOf = null;
                    i = 6;
                }
            }
            synchronized (this.zzg) {
                try {
                    zzegqVar = this.zzg;
                    if (zzegqVar.zze) {
                        zzegqVar.zzb.zza(this.zzb, this.zzc, i, th instanceof zzeda ? (zzeda) th : null, jElapsedRealtime);
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzij)).booleanValue()) {
                        zzfja zzfjaVar = this.zzg.zzc;
                        zzfiv zzfivVar = this.zze;
                        zzfca zzfcaVar = this.zzf;
                        zzfbo zzfboVar = this.zzc;
                        zzfjaVar.zze(zzfivVar.zzc(zzfcaVar, zzfboVar, zzfboVar.zzn), this.zzc.zzax);
                    }
                    zzegqVar2 = this.zzg;
                    if (zzegqVar2.zzg) {
                        return;
                    }
                    LinkedHashMap linkedHashMap = zzegqVar2.zzd;
                    zzfbo zzfboVar2 = this.zzc;
                    linkedHashMap.put(zzfboVar2, new zzegp(this.zzd, zzfboVar2.zzaf, i, jElapsedRealtime, numValueOf));
                    zzeVarZza = zzfdk.zza(th);
                    i2 = zzeVarZza.zza;
                    if ((i2 != 3 || i2 == 0) && (zzeVar = zzeVarZza.zzd) != null && !zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                    }
                    this.zzg.zzf.zzf(this.zzc, jElapsedRealtime, zzeVarZza);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        i = 2;
        numValueOf = null;
        synchronized (this.zzg) {
            zzegqVar = this.zzg;
            if (zzegqVar.zze) {
                zzegqVar.zzb.zza(this.zzb, this.zzc, i, th instanceof zzeda ? (zzeda) th : null, jElapsedRealtime);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzij)).booleanValue()) {
                zzfja zzfjaVar2 = this.zzg.zzc;
                zzfiv zzfivVar2 = this.zze;
                zzfca zzfcaVar2 = this.zzf;
                zzfbo zzfboVar3 = this.zzc;
                zzfjaVar2.zze(zzfivVar2.zzc(zzfcaVar2, zzfboVar3, zzfboVar3.zzn), this.zzc.zzax);
            }
            zzegqVar2 = this.zzg;
            if (zzegqVar2.zzg) {
                return;
            }
            LinkedHashMap linkedHashMap2 = zzegqVar2.zzd;
            zzfbo zzfboVar4 = this.zzc;
            linkedHashMap2.put(zzfboVar4, new zzegp(this.zzd, zzfboVar4.zzaf, i, jElapsedRealtime, numValueOf));
            zzeVarZza = zzfdk.zza(th);
            i2 = zzeVarZza.zza;
            zzeVarZza = i2 != 3 ? zzfdk.zza(new zzeda(13, zzeVarZza.zzd)) : zzfdk.zza(new zzeda(13, zzeVarZza.zzd));
            this.zzg.zzf.zzf(this.zzc, jElapsedRealtime, zzeVarZza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zzb(Object obj) {
        long jElapsedRealtime = this.zzg.zza.elapsedRealtime() - this.zza;
        synchronized (this.zzg) {
            try {
                zzegq zzegqVar = this.zzg;
                if (zzegqVar.zze) {
                    zzegqVar.zzb.zza(this.zzb, this.zzc, 0, null, jElapsedRealtime);
                }
                zzegq zzegqVar2 = this.zzg;
                if (zzegqVar2.zzg) {
                    return;
                }
                if (zzegqVar2.zzq(this.zzc)) {
                    ((zzegp) this.zzg.zzd.get(this.zzc)).zzd = jElapsedRealtime;
                } else {
                    LinkedHashMap linkedHashMap = this.zzg.zzd;
                    zzfbo zzfboVar = this.zzc;
                    linkedHashMap.put(zzfboVar, new zzegp(this.zzd, zzfboVar.zzaf, 0, jElapsedRealtime, null));
                }
                this.zzg.zzf.zzg(this.zzc, jElapsedRealtime, null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
