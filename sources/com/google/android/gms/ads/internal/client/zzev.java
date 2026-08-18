package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.internal.ads.zzblt;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzev extends zzblt {
    final /* synthetic */ zzex zza;

    public /* synthetic */ zzev(zzex zzexVar, zzew zzewVar) {
        this.zza = zzexVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblu
    public final void zzb(List list) throws RemoteException {
        int i;
        ArrayList arrayList;
        synchronized (this.zza.zzc) {
            this.zza.zzf = false;
            this.zza.zzg = true;
            arrayList = new ArrayList(this.zza.zze);
            this.zza.zze.clear();
        }
        InitializationStatus initializationStatusZzA = zzex.zzA(list);
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((OnInitializationCompleteListener) arrayList.get(i)).onInitializationComplete(initializationStatusZzA);
        }
    }
}
