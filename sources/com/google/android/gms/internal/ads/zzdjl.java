package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdjl implements View.OnClickListener {

    @Nullable
    @VisibleForTesting
    String zza;

    @Nullable
    @VisibleForTesting
    Long zzb;

    @Nullable
    @VisibleForTesting
    WeakReference zzc;
    private final zzdnl zzd;
    private final Clock zze;

    @Nullable
    private zzbhq zzf;

    @Nullable
    private zzbjp zzg;

    public zzdjl(zzdnl zzdnlVar, Clock clock) {
        this.zzd = zzdnlVar;
        this.zze = clock;
    }

    private final void zzd() {
        View view;
        this.zza = null;
        this.zzb = null;
        WeakReference weakReference = this.zzc;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        view.setClickable(false);
        view.setOnClickListener(null);
        this.zzc = null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WeakReference weakReference = this.zzc;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.zza != null && this.zzb != null) {
            HashMap map = new HashMap();
            map.put("id", this.zza);
            map.put("time_interval", String.valueOf(this.zze.currentTimeMillis() - this.zzb.longValue()));
            map.put("messageType", "onePointFiveClick");
            this.zzd.zzj("sendMessageToNativeJs", map);
        }
        zzd();
    }

    @Nullable
    public final zzbhq zza() {
        return this.zzf;
    }

    public final void zzb() {
        if (this.zzf == null || this.zzb == null) {
            return;
        }
        zzd();
        try {
            this.zzf.zze();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzc(final zzbhq zzbhqVar) {
        this.zzf = zzbhqVar;
        zzbjp zzbjpVar = this.zzg;
        if (zzbjpVar != null) {
            this.zzd.zzn("/unconfirmedClick", zzbjpVar);
        }
        zzbjp zzbjpVar2 = new zzbjp() { // from class: com.google.android.gms.internal.ads.zzdjk
            @Override // com.google.android.gms.internal.ads.zzbjp
            public final void zza(Object obj, Map map) {
                zzdjl zzdjlVar = this.zza;
                try {
                    zzdjlVar.zzb = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
                } catch (NumberFormatException unused) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to call parse unconfirmedClickTimestamp.");
                }
                zzbhq zzbhqVar2 = zzbhqVar;
                zzdjlVar.zza = (String) map.get("id");
                String str = (String) map.get("asset_id");
                if (zzbhqVar2 == null) {
                    com.google.android.gms.ads.internal.util.client.zzo.zze("Received unconfirmed click but UnconfirmedClickListener is null.");
                    return;
                }
                try {
                    zzbhqVar2.zzf(str);
                } catch (RemoteException e) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
                }
            }
        };
        this.zzg = zzbjpVar2;
        this.zzd.zzl("/unconfirmedClick", zzbjpVar2);
    }
}
