package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes3.dex */
final class zzapz implements zzapl {
    private final Map zza = new HashMap();

    @Nullable
    private final zzaoy zzb;

    @Nullable
    private final BlockingQueue zzc;
    private final zzapd zzd;

    public zzapz(@NonNull zzaoy zzaoyVar, @NonNull BlockingQueue blockingQueue, zzapd zzapdVar) {
        this.zzd = zzapdVar;
        this.zzb = zzaoyVar;
        this.zzc = blockingQueue;
    }

    @Override // com.google.android.gms.internal.ads.zzapl
    public final synchronized void zza(zzapm zzapmVar) {
        try {
            Map map = this.zza;
            String strZzj = zzapmVar.zzj();
            List list = (List) map.remove(strZzj);
            if (list == null || list.isEmpty()) {
                return;
            }
            if (zzapy.zzb) {
                zzapy.zzd("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), strZzj);
            }
            zzapm zzapmVar2 = (zzapm) list.remove(0);
            this.zza.put(strZzj, list);
            zzapmVar2.zzu(this);
            try {
                this.zzc.put(zzapmVar2);
            } catch (InterruptedException e) {
                zzapy.zzb("Couldn't add request to queue. %s", e.toString());
                Thread.currentThread().interrupt();
                this.zzb.zzb();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapl
    public final void zzb(zzapm zzapmVar, zzaps zzapsVar) {
        List list;
        zzaov zzaovVar = zzapsVar.zzb;
        if (zzaovVar == null || zzaovVar.zza(System.currentTimeMillis())) {
            zza(zzapmVar);
            return;
        }
        String strZzj = zzapmVar.zzj();
        synchronized (this) {
            list = (List) this.zza.remove(strZzj);
        }
        if (list != null) {
            if (zzapy.zzb) {
                zzapy.zzd("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), strZzj);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.zzd.zzb((zzapm) it.next(), zzapsVar, null);
            }
        }
    }

    public final synchronized boolean zzc(zzapm zzapmVar) {
        try {
            Map map = this.zza;
            String strZzj = zzapmVar.zzj();
            if (!map.containsKey(strZzj)) {
                this.zza.put(strZzj, null);
                zzapmVar.zzu(this);
                if (zzapy.zzb) {
                    zzapy.zza("new request, sending to network %s", strZzj);
                }
                return false;
            }
            List arrayList = (List) this.zza.get(strZzj);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            zzapmVar.zzm("waiting-for-response");
            arrayList.add(zzapmVar);
            this.zza.put(strZzj, arrayList);
            if (zzapy.zzb) {
                zzapy.zza("Request for cacheKey=%s is in flight, putting on hold.", strZzj);
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }
}
