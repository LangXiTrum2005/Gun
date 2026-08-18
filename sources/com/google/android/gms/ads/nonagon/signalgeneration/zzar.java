package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzgcd;
import java.util.ArrayList;
import javax.annotation.Nonnull;

/* JADX INFO: loaded from: classes2.dex */
final class zzar implements zzgcd {
    final /* synthetic */ zzbtt zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzau zzc;

    public zzar(zzau zzauVar, zzbtt zzbttVar, boolean z) {
        this.zza = zzbttVar;
        this.zzb = z;
        this.zzc = zzauVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable th) {
        try {
            this.zza.zze("Internal error: " + th.getMessage());
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final /* bridge */ /* synthetic */ void zzb(@Nonnull Object obj) {
        ArrayList<Uri> arrayList = (ArrayList) obj;
        try {
            this.zza.zzf(arrayList);
            if (!this.zzc.zzr && !this.zzb) {
                return;
            }
            for (Uri uri : arrayList) {
                if (this.zzc.zzP(uri)) {
                    this.zzc.zzq.zzd(zzau.zzZ(uri, this.zzc.zzA, "1").toString(), null, null);
                } else {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzhm)).booleanValue()) {
                        this.zzc.zzq.zzd(uri.toString(), null, null);
                    }
                }
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
        }
    }
}
