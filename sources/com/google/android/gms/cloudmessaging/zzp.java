package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzp<T> {
    final int zza;
    final TaskCompletionSource<T> zzb = new TaskCompletionSource<>();
    final int zzc;
    final Bundle zzd;

    public zzp(int i, int i2, Bundle bundle) {
        this.zza = i;
        this.zzc = i2;
        this.zzd = bundle;
    }

    public final String toString() {
        int i = this.zzc;
        int i2 = this.zza;
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i);
        sb.append(" id=");
        sb.append(i2);
        sb.append(" oneWay=");
        sb.append(zzb());
        sb.append("}");
        return sb.toString();
    }

    public abstract void zza(Bundle bundle);

    public abstract boolean zzb();

    public final void zzc(zzq zzqVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(this);
            String strValueOf2 = String.valueOf(zzqVar);
            new StringBuilder(strValueOf.length() + 14 + strValueOf2.length());
        }
        this.zzb.setException(zzqVar);
    }

    public final void zzd(T t) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(this);
            String strValueOf2 = String.valueOf(t);
            new StringBuilder(strValueOf.length() + 16 + strValueOf2.length());
        }
        this.zzb.setResult(t);
    }
}
