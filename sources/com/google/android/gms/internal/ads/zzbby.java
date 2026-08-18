package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
final class zzbby extends zzbcc {
    public zzbby(int i, String str, Long l, Long l2) {
        super(1, str, l, l2, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbcc
    public final /* bridge */ /* synthetic */ Object zza(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.optLong(zzl(), ((Long) zzk()).longValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzbcc
    public final /* bridge */ /* synthetic */ Object zzb(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(zzl())) ? Long.valueOf(bundle.getLong("com.google.android.gms.ads.flag.".concat(zzl()))) : (Long) zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzbcc
    public final /* bridge */ /* synthetic */ Object zzc(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(zzl(), ((Long) zzk()).longValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzbcc
    public final /* bridge */ /* synthetic */ void zzd(SharedPreferences.Editor editor, Object obj) {
        editor.putLong(zzl(), ((Long) obj).longValue());
    }
}
