package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfmf {
    private static UiModeManager zza;

    public static zzfkv zza() {
        UiModeManager uiModeManager = zza;
        if (uiModeManager == null) {
            return zzfkv.OTHER;
        }
        int currentModeType = uiModeManager.getCurrentModeType();
        if (currentModeType != 1) {
            return currentModeType != 4 ? zzfkv.OTHER : zzfkv.CTV;
        }
        return zzfkv.MOBILE;
    }

    public static void zzb(Context context) {
        if (context != null) {
            zza = (UiModeManager) context.getSystemService("uimode");
        }
    }
}
