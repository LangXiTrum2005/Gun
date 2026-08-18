package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbzw;
import com.google.android.gms.internal.ads.zzdrq;
import com.google.android.gms.internal.ads.zzdsb;
import com.umeng.ccg.a;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzv {
    private final zzdsb zzh;
    private Map zzi;
    private final ArrayDeque zzf = new ArrayDeque();
    private final ArrayDeque zzg = new ArrayDeque();
    private final int zza = ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgK)).intValue();
    private final long zzb = ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgL)).longValue();
    private final boolean zzc = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgP)).booleanValue();
    private final boolean zzd = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgO)).booleanValue();
    private final Map zze = Collections.synchronizedMap(new zzt(this));

    public zzv(zzdsb zzdsbVar) {
        this.zzh = zzdsbVar;
    }

    private final synchronized void zzi(final zzdrq zzdrqVar) {
        if (this.zzc) {
            ArrayDeque arrayDeque = this.zzg;
            final ArrayDeque arrayDequeClone = arrayDeque.clone();
            arrayDeque.clear();
            ArrayDeque arrayDeque2 = this.zzf;
            final ArrayDeque arrayDequeClone2 = arrayDeque2.clone();
            arrayDeque2.clear();
            zzbzw.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzs
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zze(zzdrqVar, arrayDequeClone, arrayDequeClone2);
                }
            });
        }
    }

    private final void zzj(zzdrq zzdrqVar, ArrayDeque arrayDeque, String str) {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(zzdrqVar.zzb());
            this.zzi = concurrentHashMap;
            concurrentHashMap.put(a.w, "ev");
            this.zzi.put("e_r", str);
            this.zzi.put("e_id", (String) pair2.first);
            if (this.zzd) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(zzaa.zzb(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair("", "");
                }
                zzl(this.zzi, "e_type", (String) pair.first);
                zzl(this.zzi, "e_agent", (String) pair.second);
            }
            this.zzh.zzg(this.zzi);
        }
    }

    private final synchronized void zzk() {
        try {
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
            try {
                Iterator it = this.zze.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (jCurrentTimeMillis - ((zzu) entry.getValue()).zza.longValue() <= this.zzb) {
                        break;
                    }
                    this.zzg.add(new Pair((String) entry.getKey(), ((zzu) entry.getValue()).zzb));
                    it.remove();
                    throw th;
                }
            } catch (ConcurrentModificationException e) {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "QueryJsonMap.removeExpiredEntries");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private static final void zzl(Map map, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }

    @Nullable
    public final synchronized String zzb(String str, zzdrq zzdrqVar) {
        zzu zzuVar = (zzu) this.zze.get(str);
        zzdrqVar.zzb().put("request_id", str);
        if (zzuVar == null) {
            zzdrqVar.zzb().put("mhit", "false");
            return null;
        }
        zzdrqVar.zzb().put("mhit", "true");
        return zzuVar.zzb;
    }

    public final synchronized void zzd(String str, String str2, zzdrq zzdrqVar) {
        this.zze.put(str, new zzu(Long.valueOf(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis()), str2, new HashSet()));
        zzk();
        zzi(zzdrqVar);
    }

    public final /* synthetic */ void zze(zzdrq zzdrqVar, ArrayDeque arrayDeque, ArrayDeque arrayDeque2) {
        zzj(zzdrqVar, arrayDeque, TypedValues.TransitionType.S_TO);
        zzj(zzdrqVar, arrayDeque2, "of");
    }

    public final synchronized void zzf(String str) {
        this.zze.remove(str);
    }

    public final synchronized boolean zzg(String str, String str2, int i) {
        zzu zzuVar = (zzu) this.zze.get(str);
        if (zzuVar == null) {
            return false;
        }
        zzuVar.zzc.add(str2);
        return zzuVar.zzc.size() < i;
    }

    public final synchronized boolean zzh(String str, String str2) {
        zzu zzuVar = (zzu) this.zze.get(str);
        return zzuVar != null && zzuVar.zzc.contains(str2);
    }
}
