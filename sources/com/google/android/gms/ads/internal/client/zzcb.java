package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.ads.zzayb;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzcb extends zzayb implements zzcc {
    public static zzcc zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
        return iInterfaceQueryLocalInterface instanceof zzcc ? (zzcc) iInterfaceQueryLocalInterface : new zzca(iBinder);
    }
}
