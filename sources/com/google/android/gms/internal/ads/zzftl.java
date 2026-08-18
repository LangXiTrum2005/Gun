package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class zzftl implements ServiceConnection {
    final /* synthetic */ zzftn zza;

    public /* synthetic */ zzftl(zzftn zzftnVar, zzftm zzftmVar) {
        this.zza = zzftnVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        this.zza.zzc.zzc("LmdServiceConnectionManager.onServiceConnected(%s)", componentName);
        this.zza.zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzftj
            @Override // java.lang.Runnable
            public final void run() {
                zzfrn zzfrnVarZzb = zzfrm.zzb(iBinder);
                zzftl zzftlVar = this.zza;
                zzftlVar.zza.zzj = zzfrnVarZzb;
                zzftlVar.zza.zzc.zzc("linkToDeath", new Object[0]);
                try {
                    IInterface iInterface = zzftlVar.zza.zzj;
                    iInterface.getClass();
                    iInterface.asBinder().linkToDeath(zzftlVar.zza.zzh, 0);
                } catch (RemoteException e) {
                    zzftlVar.zza.zzc.zzb(e, "linkToDeath failed", new Object[0]);
                }
                zzftlVar.zza.zzf = false;
                synchronized (zzftlVar.zza.zze) {
                    try {
                        Iterator it = zzftlVar.zza.zze.iterator();
                        while (it.hasNext()) {
                            ((Runnable) it.next()).run();
                        }
                        zzftlVar.zza.zze.clear();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.zza.zzc.zzc("LmdServiceConnectionManager.onServiceDisconnected(%s)", componentName);
        this.zza.zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzftk
            @Override // java.lang.Runnable
            public final void run() {
                zzftl zzftlVar = this.zza;
                zzftlVar.zza.zzc.zzc("unlinkToDeath", new Object[0]);
                IInterface iInterface = zzftlVar.zza.zzj;
                iInterface.getClass();
                iInterface.asBinder().unlinkToDeath(zzftlVar.zza.zzh, 0);
                zzftlVar.zza.zzj = null;
                zzftlVar.zza.zzf = false;
            }
        });
    }
}
