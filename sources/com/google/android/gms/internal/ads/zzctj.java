package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzctj implements zzcyq, zzdee {
    private zzbve zza;
    private final Context zzc;
    private final zzfhk zzd;
    private final VersionInfoParcel zze;
    private final Executor zzf;
    private boolean zzg = false;
    private boolean zzh = false;
    private final AtomicBoolean zzb = new AtomicBoolean();

    public zzctj(Context context, zzfhk zzfhkVar, VersionInfoParcel versionInfoParcel, Executor executor) {
        this.zzc = context;
        this.zzd = zzfhkVar;
        this.zze = versionInfoParcel;
        this.zzf = executor;
    }

    public final /* synthetic */ void zzc() {
        zzbbv.zze(this.zzc);
        this.zzh = true;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003a  */
    public final void zzd() {
        zzbve zzbveVar;
        int i;
        zzbog zzbogVarZza;
        if (!this.zzb.getAndSet(true)) {
            if (((Boolean) zzbel.zzj.zze()).booleanValue()) {
                i = 2;
            } else {
                i = 3;
                if (!((Boolean) zzbel.zzk.zze()).booleanValue()) {
                    if (((Boolean) zzbel.zzi.zze()).booleanValue()) {
                        try {
                            String strOptString = new JSONObject(com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg().zzc()).optString("local_flag_write");
                            if (TextUtils.equals(strOptString, "client")) {
                                i = 2;
                            } else if (!TextUtils.equals(strOptString, NotificationCompat.CATEGORY_SERVICE)) {
                                i = 1;
                            }
                        } catch (JSONException unused) {
                        }
                    } else {
                        i = 1;
                    }
                }
            }
            int i2 = i - 1;
            if (i2 == 1) {
                zzbogVarZza = com.google.android.gms.ads.internal.zzv.zzg().zza(this.zzc, VersionInfoParcel.forPackage(), this.zzd);
            } else if (i2 == 2) {
                zzbogVarZza = com.google.android.gms.ads.internal.zzv.zzg().zzb(this.zzc, VersionInfoParcel.forPackage(), this.zzd);
            }
            zzboa zzboaVar = zzbod.zza;
            this.zza = new zzbvg(this.zzc, zzbogVarZza.zza("google.afma.sdkConstants.getSdkConstants", zzboaVar, zzboaVar), this.zze);
            this.zzg = true;
        }
        if (this.zzg && (zzbveVar = this.zza) != null) {
            AI aiZza = zzbveVar.zza();
            if (!this.zzh && ((Boolean) zzbed.zzi.zze()).booleanValue()) {
                aiZza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcti
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzc();
                    }
                }, this.zzf);
            }
            zzbzz.zza(aiZza, "persistFlagsClient");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzdl(zzbvk zzbvkVar) {
        zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcyq
    public final void zzdm(zzfca zzfcaVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdee
    public final void zze(@Nullable com.google.android.gms.ads.nonagon.signalgeneration.zzbk zzbkVar) {
        zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzdee
    public final void zzf(@Nullable String str) {
        zzd();
    }
}
