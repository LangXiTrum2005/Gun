package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import androidx.annotation.Nullable;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2312Bj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4288p70;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4444qw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC2286Aj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5128yj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5216zj;

/* JADX INFO: loaded from: classes3.dex */
public final class zzj {
    private final zzam zza;
    private final zzu zzb;
    private final zzbk zzc;
    private final Object zzd = new Object();
    private final Object zze = new Object();
    private boolean zzf = false;
    private boolean zzg = false;
    private C2312Bj zzh = new C2312Bj(new C4288p70(6));

    public zzj(zzam zzamVar, zzu zzuVar, zzbk zzbkVar) {
        this.zza = zzamVar;
        this.zzb = zzuVar;
        this.zzc = zzbkVar;
    }

    public final boolean canRequestAds() {
        if (!this.zza.zzk()) {
            int iZza = !zzc() ? 0 : this.zza.zza();
            if (iZza != 1 && iZza != 3) {
                return false;
            }
        }
        return true;
    }

    public final int getConsentStatus() {
        if (zzc()) {
            return this.zza.zza();
        }
        return 0;
    }

    public final EnumC2286Aj getPrivacyOptionsRequirementStatus() {
        return !zzc() ? EnumC2286Aj.f2830a : this.zza.zzb();
    }

    public final boolean isConsentFormAvailable() {
        return this.zzc.zzf();
    }

    public final void requestConsentInfoUpdate(@Nullable Activity activity, C2312Bj c2312Bj, InterfaceC5216zj interfaceC5216zj, InterfaceC5128yj interfaceC5128yj) {
        synchronized (this.zzd) {
            this.zzf = true;
        }
        this.zzh = c2312Bj;
        this.zzb.zzc(activity, c2312Bj, interfaceC5216zj, interfaceC5128yj);
    }

    public final void reset() {
        this.zzc.zzd(null);
        this.zza.zze();
        synchronized (this.zzd) {
            this.zzf = false;
        }
    }

    public final void zza(@Nullable Activity activity) {
        if (!zzc() || zzd()) {
            zzc();
            zzd();
        } else {
            zzb(true);
            this.zzb.zzc(activity, this.zzh, new InterfaceC5216zj() { // from class: com.google.android.gms.internal.consent_sdk.zzh
                @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5216zj
                public final void onConsentInfoUpdateSuccess() {
                    this.zza.zzb(false);
                }
            }, new InterfaceC5128yj() { // from class: com.google.android.gms.internal.consent_sdk.zzi
                @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5128yj
                public final void onConsentInfoUpdateFailure(C4444qw c4444qw) {
                    this.zza.zzb(false);
                }
            });
        }
    }

    public final void zzb(boolean z) {
        synchronized (this.zze) {
            this.zzg = z;
        }
    }

    public final boolean zzc() {
        boolean z;
        synchronized (this.zzd) {
            z = this.zzf;
        }
        return z;
    }

    public final boolean zzd() {
        boolean z;
        synchronized (this.zze) {
            z = this.zzg;
        }
        return z;
    }
}
