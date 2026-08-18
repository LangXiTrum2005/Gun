package com.google.android.gms.internal.ads;

import androidx.annotation.GuardedBy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzduq {
    private final zzdua zza;
    private final zzdpj zzb;
    private final Object zzc = new Object();

    @GuardedBy("lock")
    private final List zzd = new ArrayList();

    @GuardedBy("lock")
    private boolean zze;

    public zzduq(zzdua zzduaVar, zzdpj zzdpjVar) {
        this.zza = zzduaVar;
        this.zzb = zzdpjVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd(List list) {
        zzdpi zzdpiVarZza;
        zzdpi zzdpiVarZza2;
        zzbrs zzbrsVar;
        synchronized (this.zzc) {
            try {
                if (this.zze) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    zzbln zzblnVar = (zzbln) it.next();
                    String string = (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjj)).booleanValue() || (zzdpiVarZza2 = this.zzb.zza(zzblnVar.zza)) == null || (zzbrsVar = zzdpiVarZza2.zzc) == null) ? "" : zzbrsVar.toString();
                    String str = string;
                    boolean z = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjk)).booleanValue() && (zzdpiVarZza = this.zzb.zza(zzblnVar.zza)) != null && zzdpiVarZza.zzd;
                    List list2 = this.zzd;
                    String str2 = zzblnVar.zza;
                    list2.add(new zzdup(str2, str, this.zzb.zzb(str2), zzblnVar.zzb ? 1 : 0, zzblnVar.zzd, zzblnVar.zzc, z));
                }
                this.zze = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0031 A[Catch: all -> 0x001e, LOOP:0: B:15:0x002b->B:17:0x0031, LOOP_END, TryCatch #0 {all -> 0x001e, blocks: (B:4:0x0008, B:6:0x000c, B:8:0x0014, B:11:0x0020, B:12:0x0023, B:14:0x0025, B:15:0x002b, B:17:0x0031, B:18:0x003f), top: B:22:0x0008 }] */
    public final JSONArray zza() throws JSONException {
        Iterator it;
        JSONArray jSONArray = new JSONArray();
        synchronized (this.zzc) {
            try {
                if (this.zze) {
                    it = this.zzd.iterator();
                    while (it.hasNext()) {
                        jSONArray.put(((zzdup) it.next()).zza());
                    }
                } else if (this.zza.zzt()) {
                    zzd(this.zza.zzg());
                    it = this.zzd.iterator();
                    while (it.hasNext()) {
                        jSONArray.put(((zzdup) it.next()).zza());
                    }
                } else {
                    zzc();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jSONArray;
    }

    public final void zzc() {
        this.zza.zzs(new zzduo(this));
    }
}
