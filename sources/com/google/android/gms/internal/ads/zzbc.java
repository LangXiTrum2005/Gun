package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class zzbc extends IOException {
    public final boolean zza;
    public final int zzb;

    public zzbc(@Nullable String str, @Nullable Throwable th, boolean z, int i) {
        super(str, th);
        this.zza = z;
        this.zzb = i;
    }

    public static zzbc zza(@Nullable String str, @Nullable Throwable th) {
        return new zzbc(str, th, true, 1);
    }

    public static zzbc zzb(@Nullable String str, @Nullable Throwable th) {
        return new zzbc(str, th, true, 0);
    }

    public static zzbc zzc(@Nullable String str) {
        return new zzbc(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    @Nullable
    public final String getMessage() {
        StringBuilder sbQ = DM.q(super.getMessage(), " {contentIsMalformed=");
        sbQ.append(this.zza);
        sbQ.append(", dataType=");
        return AbstractC5044xl.o(sbQ, this.zzb, "}");
    }
}
