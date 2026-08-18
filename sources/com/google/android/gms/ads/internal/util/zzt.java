package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbbj;
import com.google.android.gms.internal.ads.zzcex;
import com.google.android.gms.internal.ads.zzcff;
import com.google.android.gms.internal.ads.zzcgg;
import com.google.android.gms.internal.ads.zzebv;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@TargetApi(21)
public class zzt extends zzaa {
    public zzt() {
        super(null);
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    @Nullable
    public final CookieManager zza(Context context) {
        com.google.android.gms.ads.internal.zzv.zzq();
        if (zzs.zzG()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Failed to obtain CookieManager.", th);
            com.google.android.gms.ads.internal.zzv.zzp().zzv(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final WebResourceResponse zzb(String str, String str2, int i, String str3, Map map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i, str3, map, inputStream);
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final zzcff zzc(zzcex zzcexVar, zzbbj zzbbjVar, boolean z, @Nullable zzebv zzebvVar) {
        return new zzcgg(zzcexVar, zzbbjVar, z, zzebvVar);
    }
}
