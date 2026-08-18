package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class zzexu extends com.google.android.gms.ads.internal.client.zzbx implements com.google.android.gms.ads.internal.overlay.zzr, zzazx {

    @Nullable
    protected zzcog zza;
    private final zzcgx zzb;
    private final Context zzc;
    private final String zze;
    private final zzexo zzf;
    private final zzexm zzg;
    private final VersionInfoParcel zzh;
    private final zzdrw zzi;

    @Nullable
    private zzcnt zzk;
    private AtomicBoolean zzd = new AtomicBoolean();
    private long zzj = -1;

    public zzexu(zzcgx zzcgxVar, Context context, String str, zzexo zzexoVar, zzexm zzexmVar, VersionInfoParcel versionInfoParcel, zzdrw zzdrwVar) {
        this.zzb = zzcgxVar;
        this.zzc = context;
        this.zze = str;
        this.zzf = zzexoVar;
        this.zzg = zzexmVar;
        this.zzh = versionInfoParcel;
        this.zzi = zzdrwVar;
        zzexmVar.zzm(this);
    }

    private final synchronized void zzq(int i) {
        try {
            if (this.zzd.compareAndSet(false, true)) {
                this.zzg.zzj();
                zzcnt zzcntVar = this.zzk;
                if (zzcntVar != null) {
                    com.google.android.gms.ads.internal.zzv.zzb().zze(zzcntVar);
                }
                if (this.zza != null) {
                    long jElapsedRealtime = -1;
                    if (this.zzj != -1) {
                        jElapsedRealtime = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - this.zzj;
                    }
                    this.zza.zze(jElapsedRealtime, i);
                }
                zzx();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzA() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzB() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzC(com.google.android.gms.ads.internal.client.zzbi zzbiVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzD(com.google.android.gms.ads.internal.client.zzbl zzblVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzE(com.google.android.gms.ads.internal.client.zzcc zzccVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzF(com.google.android.gms.ads.internal.client.zzs zzsVar) {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzG(com.google.android.gms.ads.internal.client.zzcm zzcmVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzH(zzbag zzbagVar) {
        this.zzg.zzo(zzbagVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzI(com.google.android.gms.ads.internal.client.zzy zzyVar) {
        this.zzf.zzl(zzyVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzJ(com.google.android.gms.ads.internal.client.zzct zzctVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzK(com.google.android.gms.ads.internal.client.zzef zzefVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzL(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzM(zzbtn zzbtnVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzN(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzO(zzbdg zzbdgVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzP(com.google.android.gms.ads.internal.client.zzdr zzdrVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzQ(zzbtq zzbtqVar, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzR(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzS(zzbwc zzbwcVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzT(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzU(com.google.android.gms.ads.internal.client.zzga zzgaVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzW(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzX() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized boolean zzY() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized boolean zzZ() {
        return this.zzf.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzazx
    public final void zza() {
        zzq(3);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzaa() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b  */
    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized boolean zzab(com.google.android.gms.ads.internal.client.zzm zzmVar) throws RemoteException {
        boolean z;
        try {
            if (!zzmVar.zzb()) {
                if (((Boolean) zzbej.zzd.zze()).booleanValue()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzla)).booleanValue()) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                if (this.zzh.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzlb)).intValue() || !z) {
                    Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
                }
            }
            com.google.android.gms.ads.internal.zzv.zzq();
            if (com.google.android.gms.ads.internal.util.zzs.zzI(this.zzc) && zzmVar.zzs == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to load the ad because app ID is missing.");
                this.zzg.zzdz(zzfdk.zzd(4, null, null));
                return false;
            }
            if (zzZ()) {
                return false;
            }
            this.zzd = new AtomicBoolean();
            return this.zzf.zzb(zzmVar, this.zze, new zzexs(this), new zzext(this));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzac(com.google.android.gms.ads.internal.client.zzcq zzcqVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final Bundle zzd() {
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdE() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdi() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdp() {
        if (this.zza != null) {
            this.zzj = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime();
            int iZza = this.zza.zza();
            if (iZza > 0) {
                zzcnt zzcntVar = new zzcnt(this.zzb.zzD(), com.google.android.gms.ads.internal.zzv.zzC());
                this.zzk = zzcntVar;
                zzcntVar.zzd(iZza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzexr
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzp();
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdr() {
        zzcog zzcogVar = this.zza;
        if (zzcogVar != null) {
            zzcogVar.zze(com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - this.zzj, 1);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzds(int i) {
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 0) {
            zzq(2);
            return;
        }
        if (i2 == 1) {
            zzq(4);
        } else if (i2 != 2) {
            zzq(6);
        } else {
            zzq(3);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized com.google.android.gms.ads.internal.client.zzs zzg() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.ads.internal.client.zzbl zzi() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.ads.internal.client.zzcm zzj() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized com.google.android.gms.ads.internal.client.zzdy zzk() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized com.google.android.gms.ads.internal.client.zzeb zzl() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final IObjectWrapper zzn() {
        return null;
    }

    public final /* synthetic */ void zzo() {
        zzq(5);
    }

    @VisibleForTesting
    public final void zzp() {
        this.zzb.zzC().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzexq
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzo();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized String zzr() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized String zzs() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized String zzt() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzx() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        zzcog zzcogVar = this.zza;
        if (zzcogVar != null) {
            zzcogVar.zzb();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzy(com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.ads.internal.client.zzbo zzboVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzz() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
    }
}
