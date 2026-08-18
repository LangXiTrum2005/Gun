package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbbq;
import com.google.android.gms.internal.ads.zzbcl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.fp0;

/* JADX INFO: loaded from: classes2.dex */
@TargetApi(26)
public class zzv extends zzu {
    @Override // com.google.android.gms.ads.internal.util.zzaa
    @Nullable
    public final Intent zzf(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", activity.getPackageName());
        return intent;
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final zzbbq.zzq zzg(Context context, TelephonyManager telephonyManager) {
        com.google.android.gms.ads.internal.zzv.zzq();
        if (zzs.zzB(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return telephonyManager.isDataEnabled() ? zzbbq.zzq.ENUM_TRUE : zzbbq.zzq.ENUM_FALSE;
        }
        return zzbbq.zzq.ENUM_FALSE;
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final void zzh(Context context, String str, String str2) {
        fp0.f();
        NotificationChannel notificationChannelB = fp0.b(((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzir)).intValue());
        notificationChannelB.setShowBadge(false);
        ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannelB);
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final boolean zzi(Context context, String str) {
        NotificationChannel notificationChannel = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationChannel("offline_notification_channel");
        return notificationChannel != null && notificationChannel.getImportance() == 0;
    }
}
