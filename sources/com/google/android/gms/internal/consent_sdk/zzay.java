package com.google.android.gms.internal.consent_sdk;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import androidx.annotation.UiThread;
import androidx.core.view.WindowCompat;
import androidx.work.WorkRequest;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gg0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Hg0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4952wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5040xj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Q0;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
@UiThread
public final class zzay implements InterfaceC5040xj {
    private final Application zzb;
    private final zzbt zzc;
    private final zzam zzd;
    private final zzbm zze;
    private final zzdp zzf;
    private Dialog zzg;
    private zzbr zzh;
    private final AtomicBoolean zzi = new AtomicBoolean();
    private final AtomicReference zzj = new AtomicReference();
    private final AtomicReference zzk = new AtomicReference();
    private final AtomicReference zzl = new AtomicReference();
    boolean zza = false;

    public zzay(Application application, zzab zzabVar, zzbt zzbtVar, zzam zzamVar, zzbm zzbmVar, zzdp zzdpVar) {
        this.zzb = application;
        this.zzc = zzbtVar;
        this.zzd = zzamVar;
        this.zze = zzbmVar;
        this.zzf = zzdpVar;
    }

    private final void zzk() {
        Dialog dialog = this.zzg;
        if (dialog != null) {
            dialog.dismiss();
            this.zzg = null;
        }
        this.zzc.zza(null);
        zzav zzavVar = (zzav) this.zzl.getAndSet(null);
        if (zzavVar != null) {
            zzavVar.zzb();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5040xj
    public final void show(Activity activity, InterfaceC4952wj interfaceC4952wj) {
        zzco.zza();
        if (!this.zzi.compareAndSet(false, true)) {
            new zzg(3, true != this.zza ? "ConsentForm#show can only be invoked once." : "Privacy options form is being loading. Please try again later.").zza();
            ((Q0) interfaceC4952wj).a();
            return;
        }
        this.zzh.zzc();
        zzav zzavVar = new zzav(this, activity);
        this.zzb.registerActivityLifecycleCallbacks(zzavVar);
        this.zzl.set(zzavVar);
        this.zzc.zza(activity);
        Dialog dialog = new Dialog(activity, R.style.Theme.Translucent.NoTitleBar);
        dialog.setContentView(this.zzh);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        if (window == null) {
            new zzg(3, "Activity with null windows is passed in.").zza();
            ((Q0) interfaceC4952wj).a();
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setFlags(16777216, 16777216);
        WindowCompat.setDecorFitsSystemWindows(window, false);
        this.zzk.set(interfaceC4952wj);
        dialog.show();
        this.zzg = dialog;
        this.zzh.zzd("UMP_messagePresented", "");
    }

    public final zzbr zzc() {
        return this.zzh;
    }

    public final void zzf(Hg0 hg0, Gg0 gg0) {
        zzbr zzbrVarZzb = ((zzbs) this.zzf).zza();
        this.zzh = zzbrVarZzb;
        zzbrVarZzb.setBackgroundColor(0);
        zzbrVarZzb.getSettings().setJavaScriptEnabled(true);
        zzbrVarZzb.setWebViewClient(new zzbp(zzbrVarZzb, null));
        this.zzj.set(new zzaw(hg0, gg0, 0 == true ? 1 : 0));
        zzbr zzbrVar = this.zzh;
        zzbm zzbmVar = this.zze;
        zzbrVar.loadDataWithBaseURL(zzbmVar.zza(), zzbmVar.zzb(), "text/html", C.UTF8_NAME, null);
        zzco.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzau
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzj(new zzg(4, "Web view timed out."));
            }
        }, WorkRequest.MIN_BACKOFF_MILLIS);
    }

    public final void zzg(int i) {
        zzk();
        InterfaceC4952wj interfaceC4952wj = (InterfaceC4952wj) this.zzk.getAndSet(null);
        if (interfaceC4952wj == null) {
            return;
        }
        this.zzd.zzg(3);
        ((Q0) interfaceC4952wj).a();
    }

    public final void zzh(zzg zzgVar) {
        zzk();
        InterfaceC4952wj interfaceC4952wj = (InterfaceC4952wj) this.zzk.getAndSet(null);
        if (interfaceC4952wj == null) {
            return;
        }
        zzgVar.zza();
        ((Q0) interfaceC4952wj).a();
    }

    public final void zzi() {
        zzaw zzawVar = (zzaw) this.zzj.getAndSet(null);
        if (zzawVar == null) {
            return;
        }
        zzawVar.onConsentFormLoadSuccess(this);
    }

    public final void zzj(zzg zzgVar) {
        zzaw zzawVar = (zzaw) this.zzj.getAndSet(null);
        if (zzawVar == null) {
            return;
        }
        zzawVar.onConsentFormLoadFailure(zzgVar.zza());
    }
}
