package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzejt extends com.google.android.gms.ads.internal.client.zzbx implements zzcyf {
    private final Context zza;
    private final zzeya zzb;
    private final String zzc;
    private final zzekn zzd;
    private com.google.android.gms.ads.internal.client.zzs zze;
    private final zzfch zzf;
    private final VersionInfoParcel zzg;
    private final zzdrw zzh;

    @Nullable
    private zzcom zzi;

    public zzejt(Context context, com.google.android.gms.ads.internal.client.zzs zzsVar, String str, zzeya zzeyaVar, zzekn zzeknVar, VersionInfoParcel versionInfoParcel, zzdrw zzdrwVar) {
        this.zza = context;
        this.zzb = zzeyaVar;
        this.zze = zzsVar;
        this.zzc = str;
        this.zzd = zzeknVar;
        this.zzf = zzeyaVar.zzf();
        this.zzg = versionInfoParcel;
        this.zzh = zzdrwVar;
        zzeyaVar.zzo(this);
    }

    private final synchronized void zzf(com.google.android.gms.ads.internal.client.zzs zzsVar) {
        this.zzf.zzs(zzsVar);
        this.zzf.zzy(this.zze.zzn);
    }

    private final synchronized boolean zzh(com.google.android.gms.ads.internal.client.zzm zzmVar) throws RemoteException {
        try {
            if (zzm()) {
                Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
            }
            com.google.android.gms.ads.internal.zzv.zzq();
            if (!com.google.android.gms.ads.internal.util.zzs.zzI(this.zza) || zzmVar.zzs != null) {
                zzfdg.zza(this.zza, zzmVar.zzf);
                return this.zzb.zzb(zzmVar, this.zzc, null, new zzejs(this));
            }
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to load the ad because app ID is missing.");
            zzekn zzeknVar = this.zzd;
            if (zzeknVar != null) {
                zzeknVar.zzdz(zzfdk.zzd(4, null, null));
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0024  */
    private final boolean zzm() {
        boolean z;
        if (((Boolean) zzbej.zzf.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzla)).booleanValue()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        return this.zzg.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzlb)).intValue() || !z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzA() {
        Preconditions.checkMainThread("recordManualImpression must be called on the main UI thread.");
        zzcom zzcomVar = this.zzi;
        if (zzcomVar != null) {
            zzcomVar.zzh();
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003a A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003f, B:15:0x0043, B:12:0x003a), top: B:22:0x0001 }] */
    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzB() {
        try {
            if (((Boolean) zzbej.zzh.zze()).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkW)).booleanValue()) {
                    if (this.zzg.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzlc)).intValue()) {
                        Preconditions.checkMainThread("resume must be called on the main UI thread.");
                    }
                } else {
                    Preconditions.checkMainThread("resume must be called on the main UI thread.");
                }
            } else {
                Preconditions.checkMainThread("resume must be called on the main UI thread.");
            }
            zzcom zzcomVar = this.zzi;
            if (zzcomVar != null) {
                zzcomVar.zzn().zzc(null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzC(com.google.android.gms.ads.internal.client.zzbi zzbiVar) {
        if (zzm()) {
            Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        }
        this.zzb.zzn(zzbiVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzD(com.google.android.gms.ads.internal.client.zzbl zzblVar) {
        if (zzm()) {
            Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        }
        this.zzd.zzj(zzblVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzE(com.google.android.gms.ads.internal.client.zzcc zzccVar) {
        Preconditions.checkMainThread("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzF(com.google.android.gms.ads.internal.client.zzs zzsVar) {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
        this.zzf.zzs(zzsVar);
        this.zze = zzsVar;
        zzcom zzcomVar = this.zzi;
        if (zzcomVar != null) {
            zzcomVar.zzi(this.zzb.zzc(), zzsVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzG(com.google.android.gms.ads.internal.client.zzcm zzcmVar) {
        if (zzm()) {
            Preconditions.checkMainThread("setAppEventListener must be called on the main UI thread.");
        }
        this.zzd.zzm(zzcmVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzH(zzbag zzbagVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzI(com.google.android.gms.ads.internal.client.zzy zzyVar) {
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
        try {
            if (zzm()) {
                Preconditions.checkMainThread("setManualImpressionsEnabled must be called from the main thread.");
            }
            this.zzf.zzB(z);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzO(zzbdg zzbdgVar) {
        Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzb.zzp(zzbdgVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzP(com.google.android.gms.ads.internal.client.zzdr zzdrVar) {
        if (zzm()) {
            Preconditions.checkMainThread("setPaidEventListener must be called on the main UI thread.");
        }
        try {
            if (!zzdrVar.zzf()) {
                this.zzh.zze();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Error in making CSI ping for reporting paid event callback", e);
        }
        this.zzd.zzl(zzdrVar);
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
        try {
            if (zzm()) {
                Preconditions.checkMainThread("setVideoOptions must be called on the main UI thread.");
            }
            this.zzf.zzI(zzgaVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzW(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzX() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized boolean zzY() {
        zzcom zzcomVar = this.zzi;
        return zzcomVar != null && zzcomVar.zzs();
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized boolean zzZ() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcyf
    public final synchronized void zza() {
        try {
            if (!this.zzb.zzs()) {
                this.zzb.zzl();
                return;
            }
            com.google.android.gms.ads.internal.client.zzs zzsVarZzh = this.zzf.zzh();
            zzcom zzcomVar = this.zzi;
            if (zzcomVar != null && zzcomVar.zzg() != null && this.zzf.zzT()) {
                zzsVarZzh = zzfcp.zza(this.zza, Collections.singletonList(this.zzi.zzg()));
            }
            zzf(zzsVarZzh);
            this.zzf.zzx(true);
            try {
                zzh(this.zzf.zzf());
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to refresh the banner ad.");
            }
            this.zzf.zzx(false);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzaa() {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized boolean zzab(com.google.android.gms.ads.internal.client.zzm zzmVar) throws RemoteException {
        zzf(this.zze);
        return zzh(zzmVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzac(com.google.android.gms.ads.internal.client.zzcq zzcqVar) {
        Preconditions.checkMainThread("setCorrelationIdProvider must be called on the main UI thread");
        this.zzf.zzV(zzcqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcyf
    public final synchronized void zzb() throws ExecutionException, InterruptedException {
        if (this.zzb.zzs()) {
            this.zzb.zzq();
        } else {
            this.zzb.zzm();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final Bundle zzd() {
        Preconditions.checkMainThread("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized com.google.android.gms.ads.internal.client.zzs zzg() {
        Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        zzcom zzcomVar = this.zzi;
        if (zzcomVar != null) {
            return zzfcp.zza(this.zza, Collections.singletonList(zzcomVar.zzf()));
        }
        return this.zzf.zzh();
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.ads.internal.client.zzbl zzi() {
        return this.zzd.zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final com.google.android.gms.ads.internal.client.zzcm zzj() {
        return this.zzd.zzi();
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    @Nullable
    public final synchronized com.google.android.gms.ads.internal.client.zzdy zzk() {
        zzcom zzcomVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgC)).booleanValue() && (zzcomVar = this.zzi) != null) {
            return zzcomVar.zzm();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    @Nullable
    public final synchronized com.google.android.gms.ads.internal.client.zzeb zzl() {
        Preconditions.checkMainThread("getVideoController must be called from the main thread.");
        zzcom zzcomVar = this.zzi;
        if (zzcomVar == null) {
            return null;
        }
        return zzcomVar.zze();
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final IObjectWrapper zzn() {
        if (zzm()) {
            Preconditions.checkMainThread("getAdFrame must be called on the main UI thread.");
        }
        return ObjectWrapper.wrap(this.zzb.zzc());
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized String zzr() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    @Nullable
    public final synchronized String zzs() {
        zzcom zzcomVar = this.zzi;
        if (zzcomVar == null || zzcomVar.zzm() == null) {
            return null;
        }
        return zzcomVar.zzm().zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    @Nullable
    public final synchronized String zzt() {
        zzcom zzcomVar = this.zzi;
        if (zzcomVar == null || zzcomVar.zzm() == null) {
            return null;
        }
        return zzcomVar.zzm().zzg();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003a A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003f, B:15:0x0043, B:12:0x003a), top: B:22:0x0001 }] */
    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzx() {
        try {
            if (((Boolean) zzbej.zze.zze()).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkX)).booleanValue()) {
                    if (this.zzg.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzlc)).intValue()) {
                        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
                    }
                } else {
                    Preconditions.checkMainThread("destroy must be called on the main UI thread.");
                }
            } else {
                Preconditions.checkMainThread("destroy must be called on the main UI thread.");
            }
            zzcom zzcomVar = this.zzi;
            if (zzcomVar != null) {
                zzcomVar.zzb();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzy(com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.ads.internal.client.zzbo zzboVar) {
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003a A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003f, B:15:0x0043, B:12:0x003a), top: B:22:0x0001 }] */
    @Override // com.google.android.gms.ads.internal.client.zzby
    public final synchronized void zzz() {
        try {
            if (((Boolean) zzbej.zzg.zze()).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkY)).booleanValue()) {
                    if (this.zzg.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzlc)).intValue()) {
                        Preconditions.checkMainThread("pause must be called on the main UI thread.");
                    }
                } else {
                    Preconditions.checkMainThread("pause must be called on the main UI thread.");
                }
            } else {
                Preconditions.checkMainThread("pause must be called on the main UI thread.");
            }
            zzcom zzcomVar = this.zzi;
            if (zzcomVar != null) {
                zzcomVar.zzn().zzb(null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
