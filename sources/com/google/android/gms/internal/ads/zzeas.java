package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeas implements zzfgo {
    private final zzeag zza;
    private final zzeak zzb;

    public zzeas(zzeag zzeagVar, zzeak zzeakVar) {
        this.zza = zzeagVar;
        this.zzb = zzeakVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfgo
    public final void zzd(zzfgh zzfghVar, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgb)).booleanValue() && zzfgh.RENDERER == zzfghVar && this.zza.zzc() != 0) {
            this.zza.zzf(com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - this.zza.zzc());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgo
    public final void zzdA(zzfgh zzfghVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfgo
    public final void zzdB(zzfgh zzfghVar, String str, Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgb)).booleanValue() && zzfgh.RENDERER == zzfghVar && this.zza.zzc() != 0) {
            this.zza.zzf(com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - this.zza.zzc());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgo
    public final void zzdC(zzfgh zzfghVar, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgb)).booleanValue()) {
            if (zzfgh.RENDERER == zzfghVar) {
                this.zza.zzg(com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime());
                return;
            }
            if (zzfgh.PRELOADED_LOADER == zzfghVar || zzfgh.SERVER_TRANSACTION == zzfghVar) {
                this.zza.zzh(com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime());
                final zzeak zzeakVar = this.zzb;
                final long jZzd = this.zza.zzd();
                zzeakVar.zza.zza(new zzffr() { // from class: com.google.android.gms.internal.ads.zzeaj
                    @Override // com.google.android.gms.internal.ads.zzffr
                    public final Object zza(Object obj) {
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                        if (zzeakVar.zzf()) {
                            return null;
                        }
                        long j = jZzd;
                        zzbbq.zzaf.zza.C0138zza c0138zzaZzn = zzbbq.zzaf.zza.zzn();
                        c0138zzaZzn.zzP(j);
                        byte[] bArrZzaV = c0138zzaZzn.zzbr().zzaV();
                        zzear.zzf(sQLiteDatabase, false, false);
                        zzear.zzc(sQLiteDatabase, j, bArrZzaV);
                        return null;
                    }
                });
            }
        }
    }
}
