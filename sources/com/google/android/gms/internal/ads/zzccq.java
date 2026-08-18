package com.google.android.gms.internal.ads;

import com.umeng.ccg.a;
import java.util.Map;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes3.dex */
public final class zzccq implements zzbjp {
    private final Consumer zza;

    public zzccq(Consumer consumer) {
        this.zza = consumer;
    }

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        String str = (String) map.get(a.w);
        if (str == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Action missing from video GMSG.");
            return;
        }
        if (str.equals("src")) {
            String str2 = (String) map.get("src");
            if (str2 == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("src missing from video GMSG.");
            } else {
                this.zza.accept(str2);
            }
        }
    }
}
