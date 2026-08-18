package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaf {

    @Nullable
    private String zza;

    @Nullable
    private Uri zzb;
    private final zzag zzc = new zzag();
    private final List zzd;
    private final zzfxn zze;
    private final zzak zzf;
    private final zzao zzg;

    public zzaf() {
        zzfxn.zzn();
        this.zzd = Collections.emptyList();
        this.zze = zzfxn.zzn();
        this.zzf = new zzak();
        this.zzg = zzao.zza;
    }

    public final zzaf zza(String str) {
        this.zza = str;
        return this;
    }

    public final zzaf zzb(@Nullable Uri uri) {
        this.zzb = uri;
        return this;
    }

    public final zzar zzc() {
        zzam zzamVar;
        Uri uri = this.zzb;
        if (uri != null) {
            zzamVar = new zzam(uri, null, null, null, this.zzd, null, this.zze, null, C.TIME_UNSET, null);
        } else {
            zzamVar = null;
        }
        String str = this.zza;
        if (str == null) {
            str = "";
        }
        return new zzar(str, new zzai(this.zzc, null), zzamVar, new zzal(this.zzf, null), zzav.zza, this.zzg, null);
    }
}
