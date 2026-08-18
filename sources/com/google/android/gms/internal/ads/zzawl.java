package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;

/* JADX INFO: loaded from: classes3.dex */
final class zzawl implements AppOpsManager.OnOpActiveChangedListener {
    final /* synthetic */ zzawm zza;

    public zzawl(zzawm zzawmVar) {
        this.zza = zzawmVar;
    }

    @Override // android.app.AppOpsManager.OnOpActiveChangedListener
    public final void onOpActiveChanged(String str, int i, String str2, boolean z) {
        if (z) {
            this.zza.zzb = System.currentTimeMillis();
            this.zza.zze = true;
            return;
        }
        zzawm zzawmVar = this.zza;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (zzawmVar.zzc > 0) {
            zzawm zzawmVar2 = this.zza;
            if (jCurrentTimeMillis >= zzawmVar2.zzc) {
                zzawmVar2.zzd = jCurrentTimeMillis - zzawmVar2.zzc;
            }
        }
        this.zza.zze = false;
    }
}
