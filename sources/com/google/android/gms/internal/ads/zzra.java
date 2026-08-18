package com.google.android.gms.internal.ads;

import android.os.Handler;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class zzra {
    public final int zza;

    @Nullable
    public final zzug zzb;
    private final CopyOnWriteArrayList zzc;

    private zzra(CopyOnWriteArrayList copyOnWriteArrayList, int i, @Nullable zzug zzugVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zzugVar;
    }

    @CheckResult
    public final zzra zza(int i, @Nullable zzug zzugVar) {
        return new zzra(this.zzc, 0, zzugVar);
    }

    public final void zzb(Handler handler, zzrb zzrbVar) {
        this.zzc.add(new zzqz(handler, zzrbVar));
    }

    public final void zzc(zzrb zzrbVar) {
        for (zzqz zzqzVar : this.zzc) {
            if (zzqzVar.zza == zzrbVar) {
                this.zzc.remove(zzqzVar);
            }
        }
    }

    public zzra() {
        this(new CopyOnWriteArrayList(), 0, null);
    }
}
