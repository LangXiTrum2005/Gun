package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfna extends zzfmv {
    public zzfna(zzfmo zzfmoVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(zzfmoVar, hashSet, jSONObject, j);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (zzfmg.zzg(this.zzb, this.zzd.zza())) {
            return null;
        }
        this.zzd.zze(this.zzb);
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfmw, android.os.AsyncTask
    /* JADX INFO: renamed from: zza */
    public final void onPostExecute(String str) {
        zzflk zzflkVarZza;
        if (!TextUtils.isEmpty(str) && (zzflkVarZza = zzflk.zza()) != null) {
            for (zzfkt zzfktVar : zzflkVarZza.zzc()) {
                if (((zzfmv) this).zza.contains(zzfktVar.zzh())) {
                    zzfktVar.zzg().zzh(str, this.zzc);
                }
            }
        }
        super.onPostExecute(str);
    }
}
