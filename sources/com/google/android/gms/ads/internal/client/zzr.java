package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzr {
    public static final zzr zza = new zzr();

    @VisibleForTesting
    public zzr() {
    }

    public final zzm zza(Context context, zzei zzeiVar) {
        String strZzq;
        String strZzk = zzeiVar.zzk();
        Set setZzp = zzeiVar.zzp();
        List listUnmodifiableList = !setZzp.isEmpty() ? Collections.unmodifiableList(new ArrayList(setZzp)) : null;
        boolean zZzs = zzeiVar.zzs(context);
        Bundle bundleZzf = zzeiVar.zzf(AdMobAdapter.class);
        String strZzl = zzeiVar.zzl();
        SearchAdRequest searchAdRequestZzi = zzeiVar.zzi();
        zzfx zzfxVar = searchAdRequestZzi != null ? new zzfx(searchAdRequestZzi) : null;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            zzbc.zzb();
            strZzq = com.google.android.gms.ads.internal.util.client.zzf.zzq(Thread.currentThread().getStackTrace(), packageName);
        } else {
            strZzq = null;
        }
        boolean zZzr = zzeiVar.zzr();
        RequestConfiguration requestConfigurationZzc = zzex.zzf().zzc();
        return new zzm(8, -1L, bundleZzf, -1, listUnmodifiableList, zZzs, Math.max(zzeiVar.zzb(), requestConfigurationZzc.getTagForChildDirectedTreatment()), false, strZzl, zzfxVar, null, strZzk, zzeiVar.zzg(), zzeiVar.zze(), Collections.unmodifiableList(new ArrayList(zzeiVar.zzo())), zzeiVar.zzm(), strZzq, zZzr, null, requestConfigurationZzc.getTagForUnderAgeOfConsent(), (String) Collections.max(Arrays.asList(null, requestConfigurationZzc.getMaxAdContentRating()), new Comparator() { // from class: com.google.android.gms.ads.internal.client.zzp
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                List list = RequestConfiguration.zza;
                return list.indexOf((String) obj) - list.indexOf((String) obj2);
            }
        }), zzeiVar.zzn(), zzeiVar.zza(), zzeiVar.zzj(), requestConfigurationZzc.getPublisherPrivacyPersonalizationState().getValue(), zzeiVar.zzc());
    }
}
