package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures;
import androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest;
import com.google.android.gms.ads.MobileAds;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;

/* JADX INFO: loaded from: classes3.dex */
public final class zzecu {
    private final Context zza;

    public zzecu(Context context) {
        this.zza = context;
    }

    public final AI zza(boolean z) {
        try {
            GetTopicsRequest getTopicsRequestBuild = new GetTopicsRequest.Builder().setAdsSdkName(MobileAds.ERROR_DOMAIN).setShouldRecordObservation(z).build();
            TopicsManagerFutures topicsManagerFuturesFrom = TopicsManagerFutures.from(this.zza);
            return topicsManagerFuturesFrom != null ? topicsManagerFuturesFrom.getTopicsAsync(getTopicsRequestBuild) : zzgch.zzg(new IllegalStateException());
        } catch (Exception e) {
            return zzgch.zzg(e);
        }
    }
}
