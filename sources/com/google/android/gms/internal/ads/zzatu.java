package com.google.android.gms.internal.ads;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3611hU;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzatu implements PackageManager.OnChecksumsReadyListener {
    final zzgdb zza = zzgdb.zze();

    @Override // android.content.pm.PackageManager.OnChecksumsReadyListener
    public final void onChecksumsReady(List list) {
        if (list == null) {
            this.zza.zzc("");
            return;
        }
        try {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ApkChecksum apkChecksumE = AbstractC3611hU.e(list.get(i));
                if (apkChecksumE.getType() == 8) {
                    zzgdb zzgdbVar = this.zza;
                    zzgaa zzgaaVarZzf = zzgaa.zzi().zzf();
                    byte[] value = apkChecksumE.getValue();
                    zzgdbVar.zzc(zzgaaVarZzf.zzj(value, 0, value.length));
                    return;
                }
            }
        } catch (Throwable unused) {
        }
        this.zza.zzc("");
    }
}
