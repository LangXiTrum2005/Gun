package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzt extends LinkedHashMap {
    final /* synthetic */ zzv zza;

    public zzt(zzv zzvVar) {
        this.zza = zzvVar;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        synchronized (this.zza) {
            try {
                int size = size();
                zzv zzvVar = this.zza;
                if (size <= zzvVar.zza) {
                    return false;
                }
                zzvVar.zzf.add(new Pair((String) entry.getKey(), ((zzu) entry.getValue()).zzb));
                return size() > this.zza.zza;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
