package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.content.Context;
import com.google.android.gms.internal.ads.zzbcl;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
@TargetApi(30)
public final class zzy extends zzx {
    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final int zzm(Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zziy)).booleanValue()) {
            return 0;
        }
        return super.zzm(context);
    }
}
