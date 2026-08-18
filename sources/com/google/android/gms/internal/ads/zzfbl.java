package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfbl extends zzbvy {
    private final zzfbb zza;
    private final zzfar zzb;
    private final zzfcb zzc;

    @Nullable
    private zzdoa zzd;
    private boolean zze = false;

    public zzfbl(zzfbb zzfbbVar, zzfar zzfarVar, zzfcb zzfcbVar) {
        this.zza = zzfbbVar;
        this.zzb = zzfarVar;
        this.zzc = zzfcbVar;
    }

    private final synchronized boolean zzy() {
        zzdoa zzdoaVar = this.zzd;
        return (zzdoaVar == null || zzdoaVar.zze()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final Bundle zzb() {
        Preconditions.checkMainThread("getAdMetadata can only be called from the UI thread.");
        zzdoa zzdoaVar = this.zzd;
        return zzdoaVar != null ? zzdoaVar.zza() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    @Nullable
    public final synchronized com.google.android.gms.ads.internal.client.zzdy zzc() throws RemoteException {
        zzdoa zzdoaVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgC)).booleanValue() && (zzdoaVar = this.zzd) != null) {
            return zzdoaVar.zzm();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    @Nullable
    public final synchronized String zzd() throws RemoteException {
        zzdoa zzdoaVar = this.zzd;
        if (zzdoaVar == null || zzdoaVar.zzm() == null) {
            return null;
        }
        return zzdoaVar.zzm().zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final void zze() throws RemoteException {
        zzf(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final synchronized void zzf(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        Context context = null;
        this.zzb.zzg(null);
        if (this.zzd != null) {
            if (iObjectWrapper != null) {
                context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
            }
            this.zzd.zzn().zza(context);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzft)).booleanValue() == false) goto L18;
     */
    @Override // com.google.android.gms.internal.ads.zzbvz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzg(com.google.android.gms.internal.ads.zzbwd r5) throws android.os.RemoteException {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.String r0 = r5.zzb     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzbcc r1 = com.google.android.gms.internal.ads.zzbcl.zzfr     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzbcj r2 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L20
            java.lang.Object r1 = r2.zza(r1)     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L2c
            if (r0 != 0) goto L19
            goto L2c
        L19:
            boolean r0 = java.util.regex.Pattern.matches(r1, r0)     // Catch: java.lang.Throwable -> L20 java.lang.RuntimeException -> L22
            if (r0 == 0) goto L2c
            goto L44
        L20:
            r5 = move-exception
            goto L64
        L22:
            r0 = move-exception
            java.lang.String r1 = "NonagonUtil.isPatternMatched"
            com.google.android.gms.internal.ads.zzbzm r2 = com.google.android.gms.ads.internal.zzv.zzp()     // Catch: java.lang.Throwable -> L20
            r2.zzw(r0, r1)     // Catch: java.lang.Throwable -> L20
        L2c:
            boolean r0 = r4.zzy()     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L46
            com.google.android.gms.internal.ads.zzbcc r0 = com.google.android.gms.internal.ads.zzbcl.zzft     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzbcj r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Throwable -> L20
            java.lang.Object r0 = r1.zza(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L20
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L20
            if (r0 != 0) goto L46
        L44:
            monitor-exit(r4)
            return
        L46:
            com.google.android.gms.internal.ads.zzfat r0 = new com.google.android.gms.internal.ads.zzfat     // Catch: java.lang.Throwable -> L20
            r1 = 0
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L20
            r4.zzd = r1     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzfbb r1 = r4.zza     // Catch: java.lang.Throwable -> L20
            r2 = 1
            r1.zzj(r2)     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzfbb r1 = r4.zza     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.ads.internal.client.zzm r2 = r5.zza     // Catch: java.lang.Throwable -> L20
            java.lang.String r5 = r5.zzb     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.ads.zzfbj r3 = new com.google.android.gms.internal.ads.zzfbj     // Catch: java.lang.Throwable -> L20
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L20
            r1.zzb(r2, r5, r0, r3)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r4)
            return
        L64:
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfbl.zzg(com.google.android.gms.internal.ads.zzbwd):void");
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final void zzh() {
        zzi(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final synchronized void zzi(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzn().zzb(iObjectWrapper == null ? null : (Context) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final void zzj() {
        zzk(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final synchronized void zzk(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzn().zzc(iObjectWrapper == null ? null : (Context) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final void zzl(com.google.android.gms.ads.internal.client.zzcc zzccVar) {
        Preconditions.checkMainThread("setAdMetadataListener can only be called from the UI thread.");
        if (zzccVar == null) {
            this.zzb.zzg(null);
        } else {
            this.zzb.zzg(new zzfbk(this, zzccVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final synchronized void zzm(String str) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setCustomData");
        this.zzc.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final synchronized void zzn(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zze = z;
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final void zzo(zzbwc zzbwcVar) throws RemoteException {
        Preconditions.checkMainThread("setRewardedVideoAdListener can only be called from the UI thread.");
        this.zzb.zzm(zzbwcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final synchronized void zzp(String str) throws RemoteException {
        Preconditions.checkMainThread("setUserId must be called on the main UI thread.");
        this.zzc.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final synchronized void zzq() throws RemoteException {
        zzr(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final synchronized void zzr(@Nullable IObjectWrapper iObjectWrapper) throws RemoteException {
        try {
            Preconditions.checkMainThread("showAd must be called on the main UI thread.");
            if (this.zzd != null) {
                Activity activity = null;
                if (iObjectWrapper != null) {
                    Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
                    if (objUnwrap instanceof Activity) {
                        activity = (Activity) objUnwrap;
                    }
                }
                this.zzd.zzh(this.zze, activity);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final boolean zzs() throws RemoteException {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final boolean zzt() {
        zzdoa zzdoaVar = this.zzd;
        return zzdoaVar != null && zzdoaVar.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbvz
    public final void zzu(zzbvx zzbvxVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.zzb.zzn(zzbvxVar);
    }
}
