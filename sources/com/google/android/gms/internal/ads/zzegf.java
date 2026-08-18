package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzegf implements zzecw {
    private static Bundle zzd(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzecw
    public final AI zza(zzfca zzfcaVar, zzfbo zzfboVar) {
        String strOptString = zzfboVar.zzv.optString("pubid", "");
        zzfcj zzfcjVar = zzfcaVar.zza.zza;
        zzfch zzfchVar = new zzfch();
        zzfchVar.zzq(zzfcjVar);
        zzfchVar.zzt(strOptString);
        Bundle bundleZzd = zzd(zzfcjVar.zzd.zzm);
        Bundle bundleZzd2 = zzd(bundleZzd.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        bundleZzd2.putInt("gw", 1);
        String strOptString2 = zzfboVar.zzv.optString("mad_hac", null);
        if (strOptString2 != null) {
            bundleZzd2.putString("mad_hac", strOptString2);
        }
        String strOptString3 = zzfboVar.zzv.optString("adJson", null);
        if (strOptString3 != null) {
            bundleZzd2.putString("_ad", strOptString3);
        }
        bundleZzd2.putBoolean("_noRefresh", true);
        Iterator<String> itKeys = zzfboVar.zzD.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString4 = zzfboVar.zzD.optString(next, null);
            if (next != null) {
                bundleZzd2.putString(next, strOptString4);
            }
        }
        bundleZzd.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundleZzd2);
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzfcjVar.zzd;
        zzfchVar.zzH(new com.google.android.gms.ads.internal.client.zzm(zzmVar.zza, zzmVar.zzb, bundleZzd2, zzmVar.zzd, zzmVar.zze, zzmVar.zzf, zzmVar.zzg, zzmVar.zzh, zzmVar.zzi, zzmVar.zzj, zzmVar.zzk, zzmVar.zzl, bundleZzd, zzmVar.zzn, zzmVar.zzo, zzmVar.zzp, zzmVar.zzq, zzmVar.zzr, zzmVar.zzs, zzmVar.zzt, zzmVar.zzu, zzmVar.zzv, zzmVar.zzw, zzmVar.zzx, zzmVar.zzy, zzmVar.zzz));
        zzfcj zzfcjVarZzJ = zzfchVar.zzJ();
        Bundle bundle = new Bundle();
        zzfbr zzfbrVar = zzfcaVar.zzb.zzb;
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("nofill_urls", new ArrayList<>(zzfbrVar.zza));
        bundle2.putInt("refresh_interval", zzfbrVar.zzc);
        bundle2.putString("gws_query_id", zzfbrVar.zzb);
        bundle.putBundle("parent_common_config", bundle2);
        zzfcj zzfcjVar2 = zzfcaVar.zza.zza;
        Bundle bundle3 = new Bundle();
        bundle3.putString("initial_ad_unit_id", zzfcjVar2.zzf);
        bundle3.putString("allocation_id", zzfboVar.zzw);
        bundle3.putString("ad_source_name", zzfboVar.zzF);
        bundle3.putStringArrayList("click_urls", new ArrayList<>(zzfboVar.zzc));
        bundle3.putStringArrayList("imp_urls", new ArrayList<>(zzfboVar.zzd));
        bundle3.putStringArrayList("manual_tracking_urls", new ArrayList<>(zzfboVar.zzp));
        bundle3.putStringArrayList("fill_urls", new ArrayList<>(zzfboVar.zzm));
        bundle3.putStringArrayList("video_start_urls", new ArrayList<>(zzfboVar.zzg));
        bundle3.putStringArrayList("video_reward_urls", new ArrayList<>(zzfboVar.zzh));
        bundle3.putStringArrayList("video_complete_urls", new ArrayList<>(zzfboVar.zzi));
        bundle3.putString("transaction_id", zzfboVar.zzj);
        bundle3.putString("valid_from_timestamp", zzfboVar.zzk);
        bundle3.putBoolean("is_closable_area_disabled", zzfboVar.zzP);
        bundle3.putString("recursive_server_response_data", zzfboVar.zzao);
        bundle3.putBoolean("is_analytics_logging_enabled", zzfboVar.zzW);
        if (zzfboVar.zzl != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt("rb_amount", zzfboVar.zzl.zzb);
            bundle4.putString("rb_type", zzfboVar.zzl.zza);
            bundle3.putParcelableArray("rewards", new Bundle[]{bundle4});
        }
        bundle.putBundle("parent_ad_config", bundle3);
        return zzc(zzfcjVarZzJ, bundle, zzfboVar, zzfcaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzecw
    public final boolean zzb(zzfca zzfcaVar, zzfbo zzfboVar) {
        return !TextUtils.isEmpty(zzfboVar.zzv.optString("pubid", ""));
    }

    public abstract AI zzc(zzfcj zzfcjVar, Bundle bundle, zzfbo zzfboVar, zzfca zzfcaVar);
}
