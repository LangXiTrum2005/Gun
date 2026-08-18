package com.google.android.gms.internal.consent_sdk;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4444qw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gg0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Hg0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5040xj;

/* JADX INFO: loaded from: classes3.dex */
final class zzaw implements Hg0, Gg0 {
    private final Hg0 zza;
    private final Gg0 zzb;

    public /* synthetic */ zzaw(Hg0 hg0, Gg0 gg0, zzax zzaxVar) {
        this.zza = hg0;
        this.zzb = gg0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gg0
    public final void onConsentFormLoadFailure(C4444qw c4444qw) {
        this.zzb.onConsentFormLoadFailure(c4444qw);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Hg0
    public final void onConsentFormLoadSuccess(InterfaceC5040xj interfaceC5040xj) {
        this.zza.onConsentFormLoadSuccess(interfaceC5040xj);
    }
}
