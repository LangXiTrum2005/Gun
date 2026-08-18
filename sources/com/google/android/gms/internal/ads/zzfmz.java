package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfmz extends zzfmv {
    public zzfmz(zzfmo zzfmoVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(zzfmoVar, hashSet, jSONObject, j);
    }

    private final void zzc(String str) {
        zzflk zzflkVarZza = zzflk.zza();
        if (zzflkVarZza != null) {
            for (zzfkt zzfktVar : zzflkVarZza.zzc()) {
                if (((zzfmv) this).zza.contains(zzfktVar.zzh())) {
                    zzfktVar.zzg().zzd(str, this.zzc);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfmw, android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        zzc(str);
        super.onPostExecute(str);
    }

    @Override // com.google.android.gms.internal.ads.zzfmw
    /* JADX INFO: renamed from: zza */
    public final void onPostExecute(String str) {
        zzc(str);
        super.onPostExecute(str);
    }
}
