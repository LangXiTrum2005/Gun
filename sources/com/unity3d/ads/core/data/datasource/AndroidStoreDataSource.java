package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.umeng.analytics.pro.f;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2853Wf;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidStoreDataSource implements StoreDataSource {
    private final Context context;

    public AndroidStoreDataSource(Context context) {
        AbstractC2995aW.q(context, f.X);
        this.context = context;
    }

    @Override // com.unity3d.ads.core.data.datasource.StoreDataSource
    public List<String> fetchStores(List<String> list) {
        AbstractC2995aW.q(list, "additionalStores");
        AndroidKnownStore[] androidKnownStoreArrValues = AndroidKnownStore.values();
        ArrayList arrayList = new ArrayList(androidKnownStoreArrValues.length);
        for (AndroidKnownStore androidKnownStore : androidKnownStoreArrValues) {
            arrayList.add(androidKnownStore.getPackageName());
        }
        List listU0 = AbstractC2853Wf.u0(AbstractC2853Wf.w0(AbstractC2853Wf.p0(list, arrayList)));
        PackageManager packageManager = this.context.getPackageManager();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listU0) {
            String str = (String) obj;
            try {
                if ((Build.VERSION.SDK_INT >= 33 ? packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of(0L)) : packageManager.getPackageInfo(str, 0)) != null) {
                    arrayList2.add(obj);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return arrayList2;
    }
}
