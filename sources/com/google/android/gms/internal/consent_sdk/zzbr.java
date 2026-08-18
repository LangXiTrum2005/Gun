package com.google.android.gms.internal.consent_sdk;

import android.os.Handler;
import android.webkit.WebView;
import androidx.annotation.UiThread;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@UiThread
public final class zzbr extends WebView {
    private final Handler zza;
    private final zzbx zzb;
    private boolean zzc;

    public zzbr(zzbt zzbtVar, Handler handler, zzbx zzbxVar) {
        super(zzbtVar);
        this.zzc = false;
        this.zza = handler;
        this.zzb = zzbxVar;
    }

    public static /* bridge */ /* synthetic */ boolean zzf(zzbr zzbrVar, String str) {
        return str != null && str.startsWith("consent://");
    }

    public final void zzc() {
        final zzbx zzbxVar = this.zzb;
        Objects.requireNonNull(zzbxVar);
        this.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbo
            @Override // java.lang.Runnable
            public final void run() {
                zzbxVar.zzc();
            }
        });
    }

    public final void zzd(String str, String str2) {
        final String strJ = AbstractC3888ke0.j(str, "(", str2, ");");
        this.zza.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbn
            @Override // java.lang.Runnable
            public final void run() {
                zzcp.zza(this.zza, strJ);
            }
        });
    }
}
