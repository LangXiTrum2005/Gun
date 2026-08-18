package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class zzfz extends IOException {
    public final int zza;

    public zzfz(int i) {
        this.zza = i;
    }

    public zzfz(@Nullable String str, int i) {
        super(str);
        this.zza = i;
    }

    public zzfz(@Nullable String str, @Nullable Throwable th, int i) {
        super(str, th);
        this.zza = i;
    }

    public zzfz(@Nullable Throwable th, int i) {
        super(th);
        this.zza = i;
    }
}
