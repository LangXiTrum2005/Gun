package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeoa implements zzetr {
    private final zzgcs zza;
    private final Context zzb;

    public zzeoa(zzgcs zzgcsVar, Context context) {
        this.zza = zzgcsVar;
        this.zzb = context;
    }

    @SuppressLint({"UnprotectedReceiver"})
    private final Intent zzd() {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        return (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkR)).booleanValue() || Build.VERSION.SDK_INT < 33) ? this.zzb.registerReceiver(null, intentFilter) : this.zzb.registerReceiver(null, intentFilter, 4);
    }

    private static final boolean zze(Intent intent) {
        if (intent == null) {
            return false;
        }
        int intExtra = intent.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
        return intExtra == 2 || intExtra == 5;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 14;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    @SuppressLint({"UnprotectedReceiver"})
    public final AI zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzenz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        });
    }

    public final /* synthetic */ zzeob zzc() throws Exception {
        double intExtra;
        boolean zZze;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzlS)).booleanValue()) {
            BatteryManager batteryManager = (BatteryManager) this.zzb.getSystemService("batterymanager");
            intExtra = batteryManager != null ? ((double) batteryManager.getIntProperty(4)) / 100.0d : -1.0d;
            zZze = (Build.VERSION.SDK_INT < 23 || batteryManager == null) ? zze(zzd()) : batteryManager.isCharging();
        } else {
            Intent intentZzd = zzd();
            boolean zZze2 = zze(intentZzd);
            intExtra = intentZzd != null ? ((double) intentZzd.getIntExtra("level", -1)) / ((double) intentZzd.getIntExtra("scale", -1)) : -1.0d;
            zZze = zZze2;
        }
        return new zzeob(intExtra, zZze);
    }
}
