package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.measurement.zzra;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes3.dex */
final class zzfj implements Runnable {
    final /* synthetic */ com.google.android.gms.internal.measurement.zzbr zza;
    final /* synthetic */ ServiceConnection zzb;
    final /* synthetic */ zzfk zzc;

    public zzfj(zzfk zzfkVar, com.google.android.gms.internal.measurement.zzbr zzbrVar, ServiceConnection serviceConnection) {
        this.zzc = zzfkVar;
        this.zza = zzbrVar;
        this.zzb = serviceConnection;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0103  */
    /* JADX WARN: Code duplicated, block: B:38:0x0112  */
    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundleZzd;
        zzfk zzfkVar = this.zzc;
        zzfl zzflVar = zzfkVar.zza;
        String str = zzfkVar.zzb;
        com.google.android.gms.internal.measurement.zzbr zzbrVar = this.zza;
        ServiceConnection serviceConnection = this.zzb;
        zzflVar.zza.zzaB().zzg();
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        try {
            bundleZzd = zzbrVar.zzd(bundle);
            if (bundleZzd == null) {
                zzflVar.zza.zzaA().zzd().zza("Install Referrer Service returned a null response");
                bundleZzd = null;
            }
        } catch (Exception e) {
            zzflVar.zza.zzaA().zzd().zzb("Exception occurred while retrieving the Install Referrer", e.getMessage());
        }
        zzflVar.zza.zzaB().zzg();
        zzgd.zzO();
        if (bundleZzd != null) {
            long j = bundleZzd.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j == 0) {
                DM.C(zzflVar.zza, "Service response is missing Install Referrer install timestamp");
            } else {
                String string = bundleZzd.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    DM.w(zzflVar.zza, "No referrer defined in Install Referrer response");
                } else {
                    zzflVar.zza.zzaA().zzj().zzb("InstallReferrer API result", string);
                    zzlp zzlpVarZzv = zzflVar.zza.zzv();
                    Uri uri = Uri.parse("?".concat(string));
                    zzra.zzc();
                    Bundle bundleZzs = zzlpVarZzv.zzs(uri, zzflVar.zza.zzf().zzs(null, zzeg.zzaw));
                    if (bundleZzs == null) {
                        DM.w(zzflVar.zza, "No campaign params defined in Install Referrer result");
                    } else {
                        String string2 = bundleZzs.getString("medium");
                        if (string2 == null || "(not set)".equalsIgnoreCase(string2) || "organic".equalsIgnoreCase(string2)) {
                            if (j == zzflVar.zza.zzm().zzd.zza()) {
                                AbstractC3888ke0.p(zzflVar.zza, "Logging Install Referrer campaign from module while it may have already been logged.");
                            }
                            if (zzflVar.zza.zzJ()) {
                                zzflVar.zza.zzm().zzd.zzb(j);
                                zzflVar.zza.zzaA().zzj().zzb("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                                bundleZzs.putString("_cis", "referrer API v2");
                                zzflVar.zza.zzq().zzF("auto", "_cmp", bundleZzs, str);
                            }
                        } else {
                            long j2 = bundleZzd.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                            if (j2 == 0) {
                                DM.w(zzflVar.zza, "Install Referrer is missing click timestamp for ad campaign");
                            } else {
                                bundleZzs.putLong("click_timestamp", j2);
                                if (j == zzflVar.zza.zzm().zzd.zza()) {
                                    AbstractC3888ke0.p(zzflVar.zza, "Logging Install Referrer campaign from module while it may have already been logged.");
                                }
                                if (zzflVar.zza.zzJ()) {
                                    zzflVar.zza.zzm().zzd.zzb(j);
                                    zzflVar.zza.zzaA().zzj().zzb("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                                    bundleZzs.putString("_cis", "referrer API v2");
                                    zzflVar.zza.zzq().zzF("auto", "_cmp", bundleZzs, str);
                                }
                            }
                        }
                    }
                }
            }
        }
        ConnectionTracker.getInstance().unbindService(zzflVar.zza.zzaw(), serviceConnection);
    }
}
