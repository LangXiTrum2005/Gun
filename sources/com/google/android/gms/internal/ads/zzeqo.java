package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeqo implements zzetr {
    private final Context zza;
    private final zzgcs zzb;

    public zzeqo(Context context, zzgcs zzgcsVar) {
        this.zza = context;
        this.zzb = zzgcsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 18;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final AI zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeql
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        });
    }

    public final /* synthetic */ zzeqm zzc() throws Exception {
        Bundle bundle;
        com.google.android.gms.ads.internal.zzv.zzq();
        String string = !((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfU)).booleanValue() ? "" : this.zza.getSharedPreferences("mobileads_consent", 0).getString("consent_string", "");
        String string2 = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfW)).booleanValue() ? this.zza.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", "") : "";
        com.google.android.gms.ads.internal.zzv.zzq();
        Context context = this.zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfV)).booleanValue()) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            bundle = new Bundle();
            if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
                bundle.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
            }
            String[] strArr = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
            for (int i = 0; i < 4; i++) {
                String str = strArr[i];
                if (defaultSharedPreferences.contains(str)) {
                    bundle.putString(str, defaultSharedPreferences.getString(str, null));
                }
            }
        } else {
            bundle = null;
        }
        return new zzeqm(string, string2, bundle, null);
    }
}
