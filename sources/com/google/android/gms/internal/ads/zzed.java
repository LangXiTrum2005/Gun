package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzed implements zzdh {

    @GuardedBy("messagePool")
    private static final List zza = new ArrayList(50);
    private final Handler zzb;

    public zzed(Handler handler) {
        this.zzb = handler;
    }

    public static /* bridge */ /* synthetic */ void zzl(zzeb zzebVar) {
        List list = zza;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(zzebVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static zzeb zzm() {
        zzeb zzebVar;
        List list = zza;
        synchronized (list) {
            try {
                zzebVar = list.isEmpty() ? new zzeb(null) : (zzeb) list.remove(list.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzebVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdh
    public final Looper zza() {
        return this.zzb.getLooper();
    }

    @Override // com.google.android.gms.internal.ads.zzdh
    public final zzdg zzb(int i) {
        Handler handler = this.zzb;
        zzeb zzebVarZzm = zzm();
        zzebVarZzm.zzb(handler.obtainMessage(i), this);
        return zzebVarZzm;
    }

    @Override // com.google.android.gms.internal.ads.zzdh
    public final zzdg zzc(int i, @Nullable Object obj) {
        Handler handler = this.zzb;
        zzeb zzebVarZzm = zzm();
        zzebVarZzm.zzb(handler.obtainMessage(i, obj), this);
        return zzebVarZzm;
    }

    @Override // com.google.android.gms.internal.ads.zzdh
    public final zzdg zzd(int i, int i2, int i3) {
        Handler handler = this.zzb;
        zzeb zzebVarZzm = zzm();
        zzebVarZzm.zzb(handler.obtainMessage(1, i2, i3), this);
        return zzebVarZzm;
    }

    @Override // com.google.android.gms.internal.ads.zzdh
    public final void zze(@Nullable Object obj) {
        this.zzb.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.zzdh
    public final void zzf(int i) {
        this.zzb.removeMessages(i);
    }

    @Override // com.google.android.gms.internal.ads.zzdh
    public final boolean zzg(int i) {
        return this.zzb.hasMessages(1);
    }

    @Override // com.google.android.gms.internal.ads.zzdh
    public final boolean zzh(Runnable runnable) {
        return this.zzb.post(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzdh
    public final boolean zzi(int i) {
        return this.zzb.sendEmptyMessage(i);
    }

    @Override // com.google.android.gms.internal.ads.zzdh
    public final boolean zzj(int i, long j) {
        return this.zzb.sendEmptyMessageAtTime(2, j);
    }

    @Override // com.google.android.gms.internal.ads.zzdh
    public final boolean zzk(zzdg zzdgVar) {
        return ((zzeb) zzdgVar).zzc(this.zzb);
    }
}
