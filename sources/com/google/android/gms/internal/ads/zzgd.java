package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgd {
    public static final /* synthetic */ int zzh = 0;
    public final Uri zza;
    public final int zzb;

    @Nullable
    public final byte[] zzc;
    public final Map zzd;
    public final long zze;
    public final long zzf;
    public final int zzg;

    static {
        zzas.zzb("media3.datasource");
    }

    public final String toString() {
        StringBuilder sbU = AbstractC3950lJ.u("DataSpec[GET ", this.zza.toString(), ", ");
        sbU.append(this.zze);
        sbU.append(", ");
        sbU.append(this.zzf);
        sbU.append(", null, ");
        return AbstractC5044xl.o(sbU, this.zzg, "]");
    }

    public final zzgb zza() {
        return new zzgb(this, null);
    }

    public final boolean zzb(int i) {
        return (this.zzg & i) == i;
    }

    private zzgd(Uri uri, long j, int i, @Nullable byte[] bArr, Map map, long j2, long j3, @Nullable String str, int i2, @Nullable Object obj) {
        boolean z = false;
        boolean z2 = j2 >= 0;
        zzcw.zzd(z2);
        zzcw.zzd(z2);
        if (j3 > 0) {
            z = true;
        } else if (j3 == -1) {
            j3 = -1;
            z = true;
        }
        zzcw.zzd(z);
        uri.getClass();
        this.zza = uri;
        this.zzb = 1;
        this.zzc = null;
        this.zzd = Collections.unmodifiableMap(new HashMap(map));
        this.zze = j2;
        this.zzf = j3;
        this.zzg = i2;
    }

    @Deprecated
    public zzgd(Uri uri, long j, long j2, @Nullable String str) {
        this(uri, 0L, 1, null, Collections.emptyMap(), j, j2, null, 0, null);
    }
}
