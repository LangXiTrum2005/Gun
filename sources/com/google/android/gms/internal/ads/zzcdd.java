package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.umeng.analytics.pro.bc;
import com.umeng.commonsdk.framework.UMModuleRegister;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
final class zzcdd implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzcde zze;

    public zzcdd(zzcde zzcdeVar, String str, String str2, String str3, String str4) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = zzcdeVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:44:0x00a7  */
    @Override // java.lang.Runnable
    public final void run() {
        byte b;
        HashMap mapV = AbstractC3950lJ.v(NotificationCompat.CATEGORY_EVENT, "precacheCanceled");
        mapV.put("src", this.zza);
        if (!TextUtils.isEmpty(this.zzb)) {
            mapV.put("cachedSrc", this.zzb);
        }
        switch (this.zzc) {
            case "interrupted":
                b = 3;
                break;
            case "badUrl":
                b = 8;
                break;
            case "inProgress":
                b = 2;
                break;
            case "downloadTimeout":
                b = 9;
                break;
            case "contentLengthMissing":
                b = 0;
                break;
            case "playerFailed":
                b = 5;
                break;
            case "sizeExceeded":
                b = 11;
                break;
            case "externalAbort":
                b = 10;
                break;
            case "noop":
                b = 4;
                break;
            case "error":
                b = 1;
                break;
            case "expireFailed":
                b = 6;
                break;
            case "noCacheDir":
                b = 7;
                break;
            default:
                b = -1;
                break;
        }
        String str = UMModuleRegister.INNER;
        switch (b) {
            case 6:
            case 7:
                str = "io";
                break;
            case 8:
            case 9:
                str = "network";
                break;
            case 10:
            case 11:
                str = bc.by;
                break;
        }
        mapV.put("type", str);
        mapV.put("reason", this.zzc);
        if (!TextUtils.isEmpty(this.zzd)) {
            mapV.put(PglCryptUtils.KEY_MESSAGE, this.zzd);
        }
        zzcde.zze(this.zze, "onPrecacheEvent", mapV);
    }
}
