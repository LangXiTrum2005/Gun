package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.MainThread;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfk implements ServiceConnection {
    final /* synthetic */ zzfl zza;
    private final String zzb;

    public zzfk(zzfl zzflVar, String str) {
        this.zza = zzflVar;
        this.zzb = str;
    }

    @Override // android.content.ServiceConnection
    @MainThread
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            DM.C(this.zza.zza, "Install Referrer connection returned with null binder");
            return;
        }
        try {
            com.google.android.gms.internal.measurement.zzbr zzbrVarZzb = com.google.android.gms.internal.measurement.zzbq.zzb(iBinder);
            if (zzbrVarZzb == null) {
                this.zza.zza.zzaA().zzk().zza("Install Referrer Service implementation was not found");
            } else {
                this.zza.zza.zzaA().zzj().zza("Install Referrer Service connected");
                this.zza.zza.zzaB().zzp(new zzfj(this, zzbrVarZzb, this));
            }
        } catch (RuntimeException e) {
            this.zza.zza.zzaA().zzk().zzb("Exception occurred while calling Install Referrer API", e);
        }
    }

    @Override // android.content.ServiceConnection
    @MainThread
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC3888ke0.p(this.zza.zza, "Install Referrer Service disconnected");
    }
}
