package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbhu extends UnifiedNativeAd {
    private final zzbht zza;
    private final zzbfx zzc;
    private final List zzb = new ArrayList();
    private final VideoController zzd = new VideoController();
    private final List zze = new ArrayList();

    public zzbhu(zzbht zzbhtVar) {
        zzbfw zzbfuVar;
        IBinder iBinder;
        this.zza = zzbhtVar;
        zzbfx zzbfxVar = null;
        try {
            List listZzu = zzbhtVar.zzu();
            if (listZzu != null) {
                for (Object obj : listZzu) {
                    if (!(obj instanceof IBinder) || (iBinder = (IBinder) obj) == null) {
                        zzbfuVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        zzbfuVar = iInterfaceQueryLocalInterface instanceof zzbfw ? (zzbfw) iInterfaceQueryLocalInterface : new zzbfu(iBinder);
                    }
                    if (zzbfuVar != null) {
                        this.zzb.add(new zzbfx(zzbfuVar));
                    }
                }
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
        }
        try {
            List listZzv = this.zza.zzv();
            if (listZzv != null) {
                for (Object obj2 : listZzv) {
                    com.google.android.gms.ads.internal.client.zzdh zzdhVarZzb = obj2 instanceof IBinder ? com.google.android.gms.ads.internal.client.zzdg.zzb((IBinder) obj2) : null;
                    if (zzdhVarZzb != null) {
                        this.zze.add(new com.google.android.gms.ads.internal.client.zzdi(zzdhVarZzb));
                    }
                }
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e2);
        }
        try {
            zzbfw zzbfwVarZzk = this.zza.zzk();
            if (zzbfwVarZzk != null) {
                zzbfxVar = new zzbfx(zzbfwVarZzk);
            }
        } catch (RemoteException e3) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e3);
        }
        this.zzc = zzbfxVar;
        try {
            if (this.zza.zzi() != null) {
                new zzbfq(this.zza.zzi());
            }
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e4);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void performClick(Bundle bundle) {
        try {
            this.zza.zzz(bundle);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.zza.zzJ(bundle);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.zza.zzC(bundle);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final VideoController zza() {
        try {
            if (this.zza.zzh() != null) {
                this.zzd.zzb(this.zza.zzh());
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Exception occurred while getting video controller", e);
        }
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final NativeAd.Image zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    @Nullable
    public final Double zzc() {
        try {
            double dZze = this.zza.zze();
            if (dZze == -1.0d) {
                return null;
            }
            return Double.valueOf(dZze);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    @Nullable
    public final Object zzd() {
        try {
            IObjectWrapper iObjectWrapperZzl = this.zza.zzl();
            if (iObjectWrapperZzl != null) {
                return ObjectWrapper.unwrap(iObjectWrapperZzl);
            }
            return null;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    @Nullable
    public final String zze() {
        try {
            return this.zza.zzn();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    @Nullable
    public final String zzf() {
        try {
            return this.zza.zzo();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    @Nullable
    public final String zzg() {
        try {
            return this.zza.zzp();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    @Nullable
    public final String zzh() {
        try {
            return this.zza.zzq();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    @Nullable
    public final String zzi() {
        try {
            return this.zza.zzs();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    @Nullable
    public final String zzj() {
        try {
            return this.zza.zzt();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final List zzk() {
        return this.zzb;
    }
}
