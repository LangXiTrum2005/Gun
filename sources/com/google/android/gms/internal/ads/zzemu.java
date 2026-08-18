package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzemu implements zzetr {
    private final Context zza;
    private final zzgcs zzb;

    public zzemu(zzgcs zzgcsVar, Context context) {
        this.zzb = zzgcsVar;
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 61;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final AI zzb() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzmJ)).booleanValue()) {
            return zzgch.zzh(new zzemv(null, false));
        }
        final ContentResolver contentResolver = this.zza.getContentResolver();
        return contentResolver == null ? zzgch.zzh(new zzemv(null, false)) : this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzemt
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ContentResolver contentResolver2 = contentResolver;
                return new zzemv(Settings.Secure.getString(contentResolver2, "advertising_id"), Settings.Secure.getInt(contentResolver2, "limit_ad_tracking", 0) == 1);
            }
        });
    }
}
