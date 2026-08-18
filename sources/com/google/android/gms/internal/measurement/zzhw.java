package com.google.android.gms.internal.measurement;

import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
final class zzhw extends zzib {
    public zzhw(zzhy zzhyVar, String str, Double d, boolean z) {
        super(zzhyVar, "measurement.test.double_flag", d, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzib
    @Nullable
    public final /* synthetic */ Object zza(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
