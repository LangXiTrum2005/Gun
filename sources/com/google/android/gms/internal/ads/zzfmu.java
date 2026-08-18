package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfmu implements zzflv {
    private static final zzfmu zza = new zzfmu();
    private static final Handler zzb = new Handler(Looper.getMainLooper());
    private static Handler zzc = null;
    private static final Runnable zzd = new zzfmq();
    private static final Runnable zze = new zzfmr();
    private int zzg;
    private long zzm;
    private final List zzf = new ArrayList();
    private boolean zzh = false;
    private final List zzi = new ArrayList();
    private final zzfmn zzk = new zzfmn();
    private final zzflx zzj = new zzflx();
    private final zzfmo zzl = new zzfmo(new zzfmx());

    public static zzfmu zzd() {
        return zza;
    }

    public static /* bridge */ /* synthetic */ void zzg(zzfmu zzfmuVar) {
        zzfmuVar.zzg = 0;
        zzfmuVar.zzi.clear();
        zzfmuVar.zzh = false;
        for (zzfkt zzfktVar : zzflk.zza().zzb()) {
        }
        zzfmuVar.zzm = System.nanoTime();
        zzfmuVar.zzk.zzi();
        long jNanoTime = System.nanoTime();
        zzflw zzflwVarZza = zzfmuVar.zzj.zza();
        if (zzfmuVar.zzk.zze().size() > 0) {
            for (String str : zzfmuVar.zzk.zze()) {
                JSONObject jSONObjectZza = zzflwVarZza.zza(null);
                View viewZza = zzfmuVar.zzk.zza(str);
                zzflw zzflwVarZzb = zzfmuVar.zzj.zzb();
                String strZzc = zzfmuVar.zzk.zzc(str);
                if (strZzc != null) {
                    JSONObject jSONObjectZza2 = zzflwVarZzb.zza(viewZza);
                    zzfmg.zzb(jSONObjectZza2, str);
                    try {
                        jSONObjectZza2.put("notVisibleReason", strZzc);
                    } catch (JSONException e) {
                        zzfmh.zza("Error with setting not visible reason", e);
                    }
                    zzfmg.zzc(jSONObjectZza, jSONObjectZza2);
                }
                zzfmg.zzf(jSONObjectZza);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                zzfmuVar.zzl.zzc(jSONObjectZza, hashSet, jNanoTime);
            }
        }
        if (zzfmuVar.zzk.zzf().size() > 0) {
            JSONObject jSONObjectZza3 = zzflwVarZza.zza(null);
            zzfmuVar.zzk(null, zzflwVarZza, jSONObjectZza3, 1, false);
            zzfmg.zzf(jSONObjectZza3);
            zzfmuVar.zzl.zzd(jSONObjectZza3, zzfmuVar.zzk.zzf(), jNanoTime);
        } else {
            zzfmuVar.zzl.zzb();
        }
        zzfmuVar.zzk.zzg();
        long jNanoTime2 = System.nanoTime() - zzfmuVar.zzm;
        if (zzfmuVar.zzf.size() > 0) {
            for (zzfmt zzfmtVar : zzfmuVar.zzf) {
                TimeUnit.NANOSECONDS.toMillis(jNanoTime2);
                zzfmtVar.zzb();
                if (zzfmtVar instanceof zzfms) {
                    ((zzfms) zzfmtVar).zza();
                }
            }
        }
        zzflu.zza().zzc();
    }

    private final void zzk(View view, zzflw zzflwVar, JSONObject jSONObject, int i, boolean z) {
        zzflwVar.zzb(view, jSONObject, this, i == 1, z);
    }

    private static final void zzl() {
        Handler handler = zzc;
        if (handler != null) {
            handler.removeCallbacks(zze);
            zzc = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzflv
    public final void zza(View view, zzflw zzflwVar, JSONObject jSONObject, boolean z) {
        int iZzl;
        boolean z2;
        if (zzfml.zza(view) != null || (iZzl = this.zzk.zzl(view)) == 3) {
            return;
        }
        JSONObject jSONObjectZza = zzflwVar.zza(view);
        zzfmg.zzc(jSONObject, jSONObjectZza);
        String strZzd = this.zzk.zzd(view);
        if (strZzd != null) {
            zzfmg.zzb(jSONObjectZza, strZzd);
            try {
                jSONObjectZza.put("hasWindowFocus", Boolean.valueOf(this.zzk.zzk(view)));
            } catch (JSONException e) {
                zzfmh.zza("Error with setting has window focus", e);
            }
            boolean zZzj = this.zzk.zzj(strZzd);
            Object objValueOf = Boolean.valueOf(zZzj);
            if (zZzj) {
                try {
                    jSONObjectZza.put("isPipActive", objValueOf);
                } catch (JSONException e2) {
                    zzfmh.zza("Error with setting is picture-in-picture active", e2);
                }
            }
            this.zzk.zzh();
        } else {
            zzfmm zzfmmVarZzb = this.zzk.zzb(view);
            if (zzfmmVarZzb != null) {
                zzfln zzflnVarZza = zzfmmVarZzb.zza();
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayListZzb = zzfmmVarZzb.zzb();
                int size = arrayListZzb.size();
                for (int i = 0; i < size; i++) {
                    jSONArray.put((String) arrayListZzb.get(i));
                }
                try {
                    jSONObjectZza.put("isFriendlyObstructionFor", jSONArray);
                    jSONObjectZza.put("friendlyObstructionClass", zzflnVarZza.zzd());
                    jSONObjectZza.put("friendlyObstructionPurpose", zzflnVarZza.zza());
                    jSONObjectZza.put("friendlyObstructionReason", zzflnVarZza.zzc());
                } catch (JSONException e3) {
                    zzfmh.zza("Error with setting friendly obstruction", e3);
                }
                z2 = true;
            } else {
                z2 = false;
            }
            zzk(view, zzflwVar, jSONObjectZza, iZzl, z || z2);
        }
        this.zzg++;
    }

    public final void zzh() {
        zzl();
    }

    public final void zzi() {
        if (zzc == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            zzc = handler;
            handler.post(zzd);
            zzc.postDelayed(zze, 200L);
        }
    }

    public final void zzj() {
        zzl();
        this.zzf.clear();
        zzb.post(new zzfmp(this));
    }
}
