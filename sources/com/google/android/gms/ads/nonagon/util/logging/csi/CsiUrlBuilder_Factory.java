package com.google.android.gms.ads.nonagon.util.logging.csi;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.ads.zzher;

/* JADX INFO: loaded from: classes2.dex */
public final class CsiUrlBuilder_Factory implements zzher<CsiUrlBuilder> {
    @NonNull
    public static CsiUrlBuilder_Factory create() {
        return zza.zza;
    }

    @NonNull
    public static CsiUrlBuilder newInstance() {
        return new CsiUrlBuilder();
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    @NonNull
    /* JADX INFO: renamed from: get, reason: merged with bridge method [inline-methods] */
    public CsiUrlBuilder zzb() {
        return newInstance();
    }
}
