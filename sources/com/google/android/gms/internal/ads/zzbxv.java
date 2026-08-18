package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbxv implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final Context zza;
    private final SharedPreferences zzb;
    private final com.google.android.gms.ads.internal.util.zzg zzc;
    private String zzd = "-1";
    private int zze = -1;

    public zzbxv(Context context, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzb = PreferenceManager.getDefaultSharedPreferences(context);
        this.zzc = zzgVar;
        this.zza = context;
    }

    private final void zzb() {
        this.zzc.zzD(true);
        com.google.android.gms.ads.internal.util.zzad.zzc(this.zza);
    }

    private final void zzc(String str, int i) {
        Context context;
        boolean z = true;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzaJ)).booleanValue() ? !(str.isEmpty() || str.charAt(0) != '1') : !(i == 0 || str.isEmpty() || (str.charAt(0) != '1' && !str.equals("-1")))) {
            z = false;
        }
        this.zzc.zzD(z);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgb)).booleanValue() && z && (context = this.zza) != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0085  */
    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        byte b;
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzaL)).booleanValue()) {
                if (Objects.equals(str, "gad_has_consent_for_cookies")) {
                    int i = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
                    if (i != this.zzc.zzb()) {
                        zzb();
                    }
                    this.zzc.zzA(i);
                    return;
                }
                if (Objects.equals(str, AndroidTcfDataSource.TCF_TCSTRING_KEY)) {
                    String string = sharedPreferences.getString(str, "-1");
                    if (!Objects.equals(string, this.zzc.zzm())) {
                        zzb();
                    }
                    this.zzc.zzJ(string);
                    return;
                }
                return;
            }
            String string2 = sharedPreferences.getString("IABTCF_PurposeConsents", "-1");
            int i2 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
            String strValueOf = String.valueOf(str);
            int iHashCode = strValueOf.hashCode();
            if (iHashCode != -2004976699) {
                if (iHashCode == -527267622 && strValueOf.equals("gad_has_consent_for_cookies")) {
                    b = 1;
                } else {
                    b = -1;
                }
            } else if (strValueOf.equals("IABTCF_PurposeConsents")) {
                b = 0;
            } else {
                b = -1;
            }
            if (b == 0) {
                if (string2.equals("-1") || this.zzd.equals(string2)) {
                    return;
                }
                this.zzd = string2;
                zzc(string2, i2);
                return;
            }
            if (b != 1) {
                return;
            }
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzaJ)).booleanValue() || i2 == -1 || this.zze == i2) {
                return;
            }
            this.zze = i2;
            zzc(string2, i2);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "AdMobPlusIdlessListener.onSharedPreferenceChanged");
            com.google.android.gms.ads.internal.util.zze.zzb("onSharedPreferenceChanged, errorMessage = ", th);
        }
    }

    public final void zza() {
        this.zzb.registerOnSharedPreferenceChangeListener(this);
        onSharedPreferenceChanged(this.zzb, "gad_has_consent_for_cookies");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzaL)).booleanValue()) {
            onSharedPreferenceChanged(this.zzb, AndroidTcfDataSource.TCF_TCSTRING_KEY);
        } else {
            onSharedPreferenceChanged(this.zzb, "IABTCF_PurposeConsents");
        }
    }
}
