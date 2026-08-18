package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Base64;
import androidx.annotation.NonNull;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzauo {
    public static final String zza(@NonNull Context context, @NonNull String str, boolean z) {
        try {
            zzatf zzatfVarZza = zzatg.zza();
            zzatfVarZza.zzb(str);
            zzatfVarZza.zza("1.671910402");
            zzatfVarZza.zzc(context.getPackageName());
            zzatfVarZza.zzd(System.currentTimeMillis() / 1000);
            try {
                zzatfVarZza.zze(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
                zzatfVarZza.zze(-1L);
            }
            zzatm zzatmVarZza = zzaty.zza(((zzatg) zzatfVarZza.zzbr()).zzaV(), null);
            zzatmVarZza.zzd(5);
            zzatmVarZza.zzc(2);
            return Base64.encodeToString(((zzatn) zzatmVarZza.zzbr()).zzaV(), 11);
        } catch (UnsupportedEncodingException | GeneralSecurityException unused2) {
            return Integer.toString(7);
        }
    }
}
