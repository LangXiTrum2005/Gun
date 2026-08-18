package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzbit implements zzbjp {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzbjp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcex zzcexVar = (zzcex) obj;
        WindowManager windowManager = (WindowManager) zzcexVar.getContext().getSystemService("window");
        com.google.android.gms.ads.internal.zzv.zzq();
        DisplayMetrics displayMetricsZzu = com.google.android.gms.ads.internal.util.zzs.zzu(windowManager);
        int i = displayMetricsZzu.widthPixels;
        int i2 = displayMetricsZzu.heightPixels;
        int[] iArr = new int[2];
        HashMap map2 = new HashMap();
        ((View) zzcexVar).getLocationInWindow(iArr);
        map2.put("xInPixels", Integer.valueOf(iArr[0]));
        AbstractC3950lJ.y(iArr[1], map2, "yInPixels", i, "windowWidthInPixels");
        map2.put("windowHeightInPixels", Integer.valueOf(i2));
        zzcexVar.zzd("locationReady", map2);
        com.google.android.gms.ads.internal.util.client.zzo.zzj("GET LOCATION COMPILED");
    }
}
