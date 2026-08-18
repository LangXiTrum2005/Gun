package com.google.android.gms.cloudmessaging;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
final class zzr extends zzp<Bundle> {
    public zzr(int i, int i2, Bundle bundle) {
        super(i, 1, bundle);
    }

    @Override // com.google.android.gms.cloudmessaging.zzp
    public final void zza(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        zzd(bundle2);
    }

    @Override // com.google.android.gms.cloudmessaging.zzp
    public final boolean zzb() {
        return false;
    }
}
