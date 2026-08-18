package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.RemoteException;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfhk implements Runnable {

    @GuardedBy("enabledLock")
    @VisibleForTesting
    public static Boolean zzb;
    private final Context zze;
    private final VersionInfoParcel zzf;
    private int zzi;
    private final zzdpj zzj;
    private final List zzk;
    private final zzbvs zzm;

    @VisibleForTesting
    public static final Object zza = new Object();
    private static final Object zzc = new Object();
    private static final Object zzd = new Object();

    @GuardedBy("protoLock")
    private final zzfhp zzg = zzfht.zzb();
    private String zzh = "";

    @GuardedBy("initLock")
    private boolean zzl = false;

    public zzfhk(Context context, VersionInfoParcel versionInfoParcel, zzdpj zzdpjVar, zzdzq zzdzqVar, zzbvs zzbvsVar) {
        this.zze = context;
        this.zzf = versionInfoParcel;
        this.zzj = zzdpjVar;
        this.zzm = zzbvsVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zziJ)).booleanValue()) {
            this.zzk = com.google.android.gms.ads.internal.util.zzs.zzd();
        } else {
            this.zzk = zzfxn.zzn();
        }
    }

    public static boolean zza() {
        boolean zBooleanValue;
        synchronized (zza) {
            try {
                if (zzb == null) {
                    if (((Boolean) zzbee.zzb.zze()).booleanValue()) {
                        zzb = Boolean.valueOf(Math.random() < ((Double) zzbee.zza.zze()).doubleValue());
                    } else {
                        zzb = Boolean.FALSE;
                    }
                }
                zBooleanValue = zzb.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArrZzaV;
        if (zza()) {
            Object obj = zzc;
            synchronized (obj) {
                try {
                    if (this.zzg.zza() == 0) {
                        return;
                    }
                    try {
                        synchronized (obj) {
                            bArrZzaV = ((zzfht) this.zzg.zzbr()).zzaV();
                            this.zzg.zzc();
                        }
                        new zzdzp(this.zze, this.zzf.afmaVersion, this.zzm, Binder.getCallingUid()).zza(new zzdzn((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zziD), MBridgeCommon.DEFAULT_LOAD_TIMEOUT, new HashMap(), bArrZzaV, CommonGatewayClient.HEADER_PROTOBUF, false));
                    } catch (Exception e) {
                        if ((e instanceof zzdvy) && ((zzdvy) e).zza() == 3) {
                            return;
                        }
                        com.google.android.gms.ads.internal.zzv.zzp().zzv(e, "CuiMonitor.sendCuiPing");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void zzb(@Nullable final zzfha zzfhaVar) {
        zzbzw.zza.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfhj
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzc(zzfhaVar);
            }
        });
    }

    public final /* synthetic */ void zzc(zzfha zzfhaVar) {
        synchronized (zzd) {
            try {
                if (!this.zzl) {
                    this.zzl = true;
                    if (zza()) {
                        try {
                            com.google.android.gms.ads.internal.zzv.zzq();
                            this.zzh = com.google.android.gms.ads.internal.util.zzs.zzq(this.zze);
                        } catch (RemoteException | RuntimeException e) {
                            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "CuiMonitor.gettingAppIdFromManifest");
                        }
                        this.zzi = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zze);
                        int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zziE)).intValue();
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzlK)).booleanValue()) {
                            long j = iIntValue;
                            zzbzw.zzd.scheduleWithFixedDelay(this, j, j, TimeUnit.MILLISECONDS);
                        } else {
                            long j2 = iIntValue;
                            zzbzw.zzd.scheduleAtFixedRate(this, j2, j2, TimeUnit.MILLISECONDS);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zza() && zzfhaVar != null) {
            synchronized (zzc) {
                try {
                    if (this.zzg.zza() >= ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zziF)).intValue()) {
                        return;
                    }
                    zzfhl zzfhlVarZza = zzfho.zza();
                    zzfhlVarZza.zzu(zzfhaVar.zzm());
                    zzfhlVarZza.zzq(zzfhaVar.zzl());
                    zzfhlVarZza.zzg(zzfhaVar.zzb());
                    zzfhlVarZza.zzw(3);
                    zzfhlVarZza.zzn(this.zzf.afmaVersion);
                    zzfhlVarZza.zzb(this.zzh);
                    zzfhlVarZza.zzk(Build.VERSION.RELEASE);
                    zzfhlVarZza.zzr(Build.VERSION.SDK_INT);
                    zzfhlVarZza.zzv(zzfhaVar.zzo());
                    zzfhlVarZza.zzj(zzfhaVar.zza());
                    zzfhlVarZza.zze(this.zzi);
                    zzfhlVarZza.zzt(zzfhaVar.zzn());
                    zzfhlVarZza.zzc(zzfhaVar.zze());
                    zzfhlVarZza.zzf(zzfhaVar.zzg());
                    zzfhlVarZza.zzh(zzfhaVar.zzh());
                    zzfhlVarZza.zzi(this.zzj.zzb(zzfhaVar.zzh()));
                    zzfhlVarZza.zzl(zzfhaVar.zzi());
                    zzfhlVarZza.zzm(zzfhaVar.zzd());
                    zzfhlVarZza.zzd(zzfhaVar.zzf());
                    zzfhlVarZza.zzs(zzfhaVar.zzk());
                    zzfhlVarZza.zzo(zzfhaVar.zzj());
                    zzfhlVarZza.zzp(zzfhaVar.zzc());
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zziJ)).booleanValue()) {
                        zzfhlVarZza.zza(this.zzk);
                    }
                    zzfhp zzfhpVar = this.zzg;
                    zzfhq zzfhqVarZza = zzfhr.zza();
                    zzfhqVarZza.zza(zzfhlVarZza);
                    zzfhpVar.zzb(zzfhqVarZza);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
