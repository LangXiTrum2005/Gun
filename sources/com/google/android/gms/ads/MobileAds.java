package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsSession;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.internal.client.zzex;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.preload.PreloadCallback;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbtv;
import com.google.android.gms.internal.ads.zzbyu;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class MobileAds {

    @NonNull
    public static final String ERROR_DOMAIN = "com.google.android.gms.ads";

    private MobileAds() {
    }

    public static void disableMediationAdapterInitialization(@NonNull Context context) {
        zzex.zzf().zzn(context);
    }

    @Nullable
    public static InitializationStatus getInitializationStatus() {
        return zzex.zzf().zze();
    }

    @KeepForSdk
    private static String getInternalVersion() {
        return zzex.zzf().zzi();
    }

    @NonNull
    public static RequestConfiguration getRequestConfiguration() {
        return zzex.zzf().zzc();
    }

    @NonNull
    public static VersionInfo getVersion() {
        zzex.zzf();
        String[] strArrSplit = TextUtils.split("23.6.0", "\\.");
        if (strArrSplit.length != 3) {
            return new VersionInfo(0, 0, 0);
        }
        try {
            return new VersionInfo(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]));
        } catch (NumberFormatException unused) {
            return new VersionInfo(0, 0, 0);
        }
    }

    @RequiresPermission("android.permission.INTERNET")
    public static void initialize(@NonNull Context context) {
        zzex.zzf().zzo(context, null, null);
    }

    public static void openAdInspector(@NonNull Context context, @NonNull OnAdInspectorClosedListener onAdInspectorClosedListener) {
        zzex.zzf().zzr(context, onAdInspectorClosedListener);
    }

    public static void openDebugMenu(@NonNull Context context, @NonNull String str) {
        zzex.zzf().zzs(context, str);
    }

    public static boolean putPublisherFirstPartyIdEnabled(boolean z) {
        return zzex.zzf().zzz(z);
    }

    @Nullable
    public static CustomTabsSession registerCustomTabsSession(@NonNull Context context, @NonNull CustomTabsClient customTabsClient, @NonNull String str, @Nullable CustomTabsCallback customTabsCallback) {
        zzex.zzf();
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbyu zzbyuVarZza = zzbtv.zza(context);
        if (zzbyuVarZza == null) {
            zzo.zzg("Internal error, query info generator is null.");
            return null;
        }
        try {
            return (CustomTabsSession) ObjectWrapper.unwrap(zzbyuVarZza.zze(ObjectWrapper.wrap(context), ObjectWrapper.wrap(customTabsClient), str, ObjectWrapper.wrap(customTabsCallback)));
        } catch (RemoteException | IllegalArgumentException e) {
            zzo.zzh("Unable to register custom tabs session. Error: ", e);
            return null;
        }
    }

    @KeepForSdk
    public static void registerRtbAdapter(@NonNull Class<? extends RtbAdapter> cls) {
        zzex.zzf().zzt(cls);
    }

    public static void registerWebView(@NonNull WebView webView) {
        zzex.zzf();
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (webView == null) {
            zzo.zzg("The webview to be registered cannot be null.");
            return;
        }
        zzbyu zzbyuVarZza = zzbtv.zza(webView.getContext());
        if (zzbyuVarZza == null) {
            zzo.zzg("Internal error, query info generator is null.");
            return;
        }
        try {
            zzbyuVarZza.zzj(ObjectWrapper.wrap(webView));
        } catch (RemoteException e) {
            zzo.zzh("", e);
        }
    }

    public static void setAppMuted(boolean z) {
        zzex.zzf().zzu(z);
    }

    public static void setAppVolume(float f) {
        zzex.zzf().zzv(f);
    }

    @KeepForSdk
    private static void setPlugin(String str) {
        zzex.zzf().zzw(str);
    }

    public static void setRequestConfiguration(@NonNull RequestConfiguration requestConfiguration) {
        zzex.zzf().zzx(requestConfiguration);
    }

    public static void startPreload(@NonNull Context context, @NonNull List<PreloadConfiguration> list, @NonNull PreloadCallback preloadCallback) {
        zzex.zzf().zzg(context, list, preloadCallback);
    }

    public static void initialize(@NonNull Context context, @NonNull OnInitializationCompleteListener onInitializationCompleteListener) {
        zzex.zzf().zzo(context, null, onInitializationCompleteListener);
    }
}
