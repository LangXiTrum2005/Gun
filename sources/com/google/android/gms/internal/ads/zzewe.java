package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzewe implements zzher {
    public static zzetu zza(Context context, zzbza zzbzaVar, zzbzb zzbzbVar, Object obj, zzeux zzeuxVar, zzevr zzevrVar, zzhel zzhelVar, zzhel zzhelVar2, zzhel zzhelVar3, zzhel zzhelVar4, zzhel zzhelVar5, zzhel zzhelVar6, zzhel zzhelVar7, Executor executor, zzfhh zzfhhVar, zzdrw zzdrwVar) {
        HashSet hashSet = new HashSet();
        hashSet.add((zzevk) obj);
        hashSet.add(zzeuxVar);
        hashSet.add(zzevrVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfH)).booleanValue()) {
            hashSet.add((zzetr) zzhelVar.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfI)).booleanValue()) {
            hashSet.add((zzetr) zzhelVar2.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfK)).booleanValue()) {
            hashSet.add((zzetr) zzhelVar4.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfL)).booleanValue()) {
            hashSet.add((zzetr) zzhelVar5.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdd)).booleanValue()) {
            hashSet.add((zzetr) zzhelVar7.zzb());
        }
        return new zzetu(context, executor, hashSet, zzfhhVar, zzdrwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ Object zzb() {
        throw null;
    }
}
