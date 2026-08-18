package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;

/* JADX INFO: loaded from: classes3.dex */
final class zzawb implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ zzawd zzb;

    public zzawb(zzawd zzawdVar, int i, boolean z) {
        this.zza = i;
        this.zzb = zzawdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzasy zzasyVarZza;
        int i = this.zza;
        zzawd zzawdVar = this.zzb;
        if (i > 0) {
            try {
                Thread.sleep(i * 1000);
            } catch (InterruptedException unused) {
            }
        }
        try {
            PackageInfo packageInfo = zzawdVar.zza.getPackageManager().getPackageInfo(zzawdVar.zza.getPackageName(), 0);
            Context context = zzawdVar.zza;
            zzasyVarZza = zzfnq.zza(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
        } catch (Throwable unused2) {
            zzasyVarZza = null;
        }
        this.zzb.zzm = zzasyVarZza;
        if (this.zza < 4) {
            if (zzasyVarZza != null && zzasyVarZza.zzaj() && !zzasyVarZza.zzh().equals("0000000000000000000000000000000000000000000000000000000000000000") && zzasyVarZza.zzak() && zzasyVarZza.zzf().zzg() && zzasyVarZza.zzf().zza() != -2) {
                return;
            }
            this.zzb.zzo(this.zza + 1, true);
        }
    }
}
