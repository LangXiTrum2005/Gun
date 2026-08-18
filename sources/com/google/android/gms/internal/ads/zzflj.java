package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.view.View;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class zzflj extends zzflm {

    @SuppressLint({"StaticFieldLeak"})
    private static final zzflj zzb = new zzflj();

    private zzflj() {
    }

    public static zzflj zza() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzflm
    public final void zzb(boolean z) {
        Iterator it = zzflk.zza().zzc().iterator();
        while (it.hasNext()) {
            ((zzfkt) it.next()).zzg().zzk(z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzflm
    public final boolean zzc() {
        Iterator it = zzflk.zza().zzb().iterator();
        while (it.hasNext()) {
            View viewZzf = ((zzfkt) it.next()).zzf();
            if (viewZzf != null && viewZzf.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
