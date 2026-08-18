package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.umeng.ccg.a;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
@Deprecated
public final class zzbda {
    private final List zza = new LinkedList();
    private final Map zzb;
    private final Object zzc;

    public zzbda(boolean z, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        this.zzc = new Object();
        linkedHashMap.put(a.w, "make_wv");
        linkedHashMap.put("ad_format", str2);
    }

    public static final zzbcx zzf() {
        return new zzbcx(com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime(), null, null);
    }

    public final zzbcz zza() {
        zzbcz zzbczVar;
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzbY)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap map = new HashMap();
        synchronized (this.zzc) {
            try {
                for (zzbcx zzbcxVar : this.zza) {
                    long jZza = zzbcxVar.zza();
                    String strZzc = zzbcxVar.zzc();
                    zzbcx zzbcxVarZzb = zzbcxVar.zzb();
                    if (zzbcxVarZzb != null && jZza > 0) {
                        long jZza2 = jZza - zzbcxVarZzb.zza();
                        sb.append(strZzc);
                        sb.append('.');
                        sb.append(jZza2);
                        sb.append(',');
                        if (zBooleanValue) {
                            if (map.containsKey(Long.valueOf(zzbcxVarZzb.zza()))) {
                                StringBuilder sb2 = (StringBuilder) map.get(Long.valueOf(zzbcxVarZzb.zza()));
                                sb2.append('+');
                                sb2.append(strZzc);
                            } else {
                                map.put(Long.valueOf(zzbcxVarZzb.zza()), new StringBuilder(strZzc));
                            }
                        }
                    }
                }
                this.zza.clear();
                String string = null;
                if (!TextUtils.isEmpty(null)) {
                    sb.append((String) null);
                } else if (sb.length() > 0) {
                    sb.setLength(sb.length() - 1);
                }
                StringBuilder sb3 = new StringBuilder();
                if (zBooleanValue) {
                    for (Map.Entry entry : map.entrySet()) {
                        sb3.append((CharSequence) entry.getValue());
                        sb3.append('.');
                        sb3.append(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() + (((Long) entry.getKey()).longValue() - com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime()));
                        sb3.append(',');
                    }
                    if (sb3.length() > 0) {
                        sb3.setLength(sb3.length() - 1);
                    }
                    string = sb3.toString();
                }
                zzbczVar = new zzbcz(sb.toString(), string);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbczVar;
    }

    @VisibleForTesting
    public final Map zzb() {
        Map map;
        synchronized (this.zzc) {
            com.google.android.gms.ads.internal.zzv.zzp().zzg();
            map = this.zzb;
        }
        return map;
    }

    public final void zzc(@Nullable zzbda zzbdaVar) {
        synchronized (this.zzc) {
        }
    }

    public final void zzd(String str, String str2) {
        zzbcq zzbcqVarZzg;
        if (TextUtils.isEmpty(str2) || (zzbcqVarZzg = com.google.android.gms.ads.internal.zzv.zzp().zzg()) == null) {
            return;
        }
        synchronized (this.zzc) {
            zzbcw zzbcwVarZza = zzbcqVarZzg.zza(str);
            Map map = this.zzb;
            map.put(str, zzbcwVarZza.zza((String) map.get(str), str2));
        }
    }

    public final boolean zze(zzbcx zzbcxVar, long j, String... strArr) {
        synchronized (this.zzc) {
            this.zza.add(new zzbcx(j, strArr[0], zzbcxVar));
        }
        return true;
    }
}
