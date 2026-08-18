package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzam {
    public final Uri zza;

    @Nullable
    public final String zzb;

    @Nullable
    public final zzaj zzc;

    @Nullable
    public final zzae zzd;
    public final List zze;

    @Nullable
    public final String zzf;
    public final zzfxn zzg;

    @Nullable
    public final Object zzh;
    public final long zzi;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
    }

    public /* synthetic */ zzam(Uri uri, String str, zzaj zzajVar, zzae zzaeVar, List list, String str2, zzfxn zzfxnVar, Object obj, long j, zzaq zzaqVar) {
        this.zza = uri;
        int i = zzbb.zza;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = list;
        this.zzf = null;
        this.zzg = zzfxnVar;
        zzfxk zzfxkVar = new zzfxk();
        if (zzfxnVar.size() > 0) {
            throw null;
        }
        zzfxkVar.zzi();
        this.zzh = null;
        this.zzi = C.TIME_UNSET;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzam)) {
            return false;
        }
        zzam zzamVar = (zzam) obj;
        if (this.zza.equals(zzamVar.zza) && this.zze.equals(zzamVar.zze) && this.zzg.equals(zzamVar.zzg)) {
            Object objValueOf = Long.valueOf(C.TIME_UNSET);
            if (objValueOf.equals(objValueOf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) ((((long) ((this.zzg.hashCode() + ((this.zze.hashCode() + (this.zza.hashCode() * 923521)) * 961)) * 31)) * 31) + C.TIME_UNSET);
    }
}
