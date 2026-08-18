package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class zzflo {
    private static final Pattern zza = Pattern.compile("^[a-zA-Z0-9 ]+$");
    private final List zzb = new ArrayList();

    public final List zza() {
        return this.zzb;
    }

    public final void zzb(View view, zzfkw zzfkwVar, @Nullable String str) {
        zzfln zzflnVar;
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
        if (!zza.matcher("Ad overlay").matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
        Iterator it = this.zzb.iterator();
        do {
            if (!it.hasNext()) {
                zzflnVar = null;
                break;
            }
            zzflnVar = (zzfln) it.next();
        } while (zzflnVar.zzb().get() != view);
        if (zzflnVar == null) {
            this.zzb.add(new zzfln(view, zzfkwVar, "Ad overlay"));
        }
    }

    public final void zzc() {
        this.zzb.clear();
    }
}
