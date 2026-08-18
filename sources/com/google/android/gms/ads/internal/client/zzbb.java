package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbeu;
import com.umeng.ccg.a;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzbb {

    @Nullable
    private static final zzcp zza;

    static {
        zzcp zzcnVar = null;
        try {
            Object objNewInstance = zzba.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            if (objNewInstance instanceof IBinder) {
                IBinder iBinder = (IBinder) objNewInstance;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    zzcnVar = iInterfaceQueryLocalInterface instanceof zzcp ? (zzcp) iInterfaceQueryLocalInterface : new zzcn(iBinder);
                }
            } else {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("ClientApi class is not an instance of IBinder.");
            }
        } catch (Exception unused) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to instantiate ClientApi class.");
        }
        zza = zzcnVar;
    }

    @Nullable
    private final Object zze() {
        zzcp zzcpVar = zza;
        if (zzcpVar == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("ClientApi class cannot be loaded.");
            return null;
        }
        try {
            return zzb(zzcpVar);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Cannot invoke local loader using ClientApi class.", e);
            return null;
        }
    }

    @Nullable
    private final Object zzf() {
        try {
            return zzc();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Cannot invoke remote loader.", e);
            return null;
        }
    }

    @NonNull
    public abstract Object zza();

    @Nullable
    public abstract Object zzb(zzcp zzcpVar) throws RemoteException;

    @Nullable
    public abstract Object zzc() throws RemoteException;

    public final Object zzd(Context context, boolean z) {
        boolean z2;
        Object objZze;
        if (!z) {
            zzbc.zzb();
            if (!com.google.android.gms.ads.internal.util.client.zzf.zzs(context, 12451000)) {
                com.google.android.gms.ads.internal.util.client.zzo.zze("Google Play Services is not available.");
                z = true;
            }
        }
        boolean z3 = false;
        boolean z4 = !(DynamiteModule.getLocalVersion(context, ModuleDescriptor.MODULE_ID) <= DynamiteModule.getRemoteVersion(context, ModuleDescriptor.MODULE_ID));
        zzbcl.zza(context);
        if (((Boolean) zzbeg.zza.zze()).booleanValue()) {
            z2 = false;
        } else if (((Boolean) zzbeg.zzb.zze()).booleanValue()) {
            z2 = true;
            z3 = true;
        } else {
            z3 = z | z4;
            z2 = false;
        }
        if (z3) {
            objZze = zze();
            if (objZze == null && !z2) {
                objZze = zzf();
            }
        } else {
            Object objZzf = zzf();
            if (objZzf == null) {
                if (zzbc.zze().nextInt(((Long) zzbeu.zza.zze()).intValue()) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString(a.w, "dynamite_load");
                    bundle.putInt("is_missing", 1);
                    zzbc.zzb().zzn(context, zzbc.zzc().afmaVersion, "gmob-apps", bundle, true);
                }
            }
            objZze = objZzf == null ? zze() : objZzf;
        }
        return objZze == null ? zza() : objZze;
    }
}
