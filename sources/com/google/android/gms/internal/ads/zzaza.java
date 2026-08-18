package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
public final class zzaza {

    @VisibleForTesting
    int zza;
    private final Object zzb = new Object();
    private final List zzc = new LinkedList();

    public final void zza(zzayz zzayzVar) {
        synchronized (this.zzb) {
            try {
                if (this.zzc.size() >= 10) {
                    com.google.android.gms.ads.internal.util.client.zzo.zze("Queue is full, current size = " + this.zzc.size());
                    this.zzc.remove(0);
                }
                int i = this.zza;
                this.zza = i + 1;
                zzayzVar.zzg(i);
                zzayzVar.zzk();
                this.zzc.add(zzayzVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzb(zzayz zzayzVar) {
        synchronized (this.zzb) {
            try {
                Iterator it = this.zzc.iterator();
                while (it.hasNext()) {
                    zzayz zzayzVar2 = (zzayz) it.next();
                    if (com.google.android.gms.ads.internal.zzv.zzp().zzi().zzK()) {
                        if (!com.google.android.gms.ads.internal.zzv.zzp().zzi().zzL() && !zzayzVar.equals(zzayzVar2) && zzayzVar2.zzd().equals(zzayzVar.zzd())) {
                            it.remove();
                            return true;
                        }
                    } else if (!zzayzVar.equals(zzayzVar2) && zzayzVar2.zzc().equals(zzayzVar.zzc())) {
                        it.remove();
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzc(zzayz zzayzVar) {
        synchronized (this.zzb) {
            try {
                return this.zzc.contains(zzayzVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
