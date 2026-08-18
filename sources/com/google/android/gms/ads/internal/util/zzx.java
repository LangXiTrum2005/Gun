package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Rect;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.zzbcl;
import java.util.Locale;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
@TargetApi(28)
public class zzx extends zzv {
    public static final /* synthetic */ WindowInsets zzl(Activity activity, View view, WindowInsets windowInsets) {
        if (com.google.android.gms.ads.internal.zzv.zzp().zzi().zzj() == null) {
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            String strConcat = "";
            if (displayCutout != null) {
                zzg zzgVarZzi = com.google.android.gms.ads.internal.zzv.zzp().zzi();
                for (Rect rect : displayCutout.getBoundingRects()) {
                    Locale locale = Locale.US;
                    String str = rect.left + "," + rect.top + "," + rect.right + "," + rect.bottom;
                    if (!TextUtils.isEmpty(strConcat)) {
                        strConcat = strConcat.concat("|");
                    }
                    strConcat = strConcat.concat(str);
                }
                zzgVarZzi.zzy(strConcat);
            } else {
                com.google.android.gms.ads.internal.zzv.zzp().zzi().zzy("");
            }
        }
        zzn(false, activity);
        return view.onApplyWindowInsets(windowInsets);
    }

    private static final void zzn(boolean z, Activity activity) {
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        int i = attributes.layoutInDisplayCutoutMode;
        int i2 = true != z ? 2 : 1;
        if (i2 != i) {
            attributes.layoutInDisplayCutoutMode = i2;
            window.setAttributes(attributes);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final int zzj(AudioManager audioManager) {
        return audioManager.getStreamMinVolume(3);
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final void zzk(final Activity activity) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzbo)).booleanValue() && com.google.android.gms.ads.internal.zzv.zzp().zzi().zzj() == null && !activity.isInMultiWindowMode()) {
            zzn(true, activity);
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener(this) { // from class: com.google.android.gms.ads.internal.util.zzw
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return zzx.zzl(activity, view, windowInsets);
                }
            });
        }
    }
}
