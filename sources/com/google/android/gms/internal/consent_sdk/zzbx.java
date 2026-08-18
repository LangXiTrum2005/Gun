package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.UiThread;
import androidx.core.app.NotificationCompat;
import com.umeng.ccg.a;
import java.io.ByteArrayOutputStream;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
final class zzbx implements zzd {
    private final Application zza;
    private final zzbt zzb;
    private final Handler zzc;
    private final Executor zzd;
    private final zze zze;
    private final zzak zzf;
    private final zzay zzg;
    private final zzam zzh;

    public zzbx(Application application, zzbt zzbtVar, Handler handler, Executor executor, zze zzeVar, zzak zzakVar, zzay zzayVar, zzam zzamVar) {
        this.zza = application;
        this.zzb = zzbtVar;
        this.zzc = handler;
        this.zzd = executor;
        this.zze = zzeVar;
        this.zzf = zzakVar;
        this.zzg = zzayVar;
        this.zzh = zzamVar;
    }

    @UiThread
    private final void zzg(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("url");
        TextUtils.isEmpty(strOptString);
        Uri uri = Uri.parse(strOptString);
        if (uri.getScheme() == null) {
            "Action[browser]: empty scheme: ".concat(String.valueOf(strOptString));
        }
        try {
            this.zzb.startActivity(new Intent("android.intent.action.VIEW", uri));
        } catch (ActivityNotFoundException unused) {
            "Action[browser]: can not open url: ".concat(String.valueOf(strOptString));
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzd
    public final Executor zza() {
        final Handler handler = this.zzc;
        Objects.requireNonNull(handler);
        return new Executor() { // from class: com.google.android.gms.internal.consent_sdk.zzbv
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.consent_sdk.zzd
    @UiThread
    public final boolean zzb(String str, JSONObject jSONObject) {
        byte b;
        byte b2 = -1;
        switch (str) {
            case "load_complete":
                b = 0;
                break;
            case "configure_app_assets":
                b = 3;
                break;
            case "browser":
                b = 2;
                break;
            case "dismiss":
                b = 1;
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            this.zzg.zzi();
            return true;
        }
        if (b != 1) {
            if (b == 2) {
                zzg(jSONObject);
                return true;
            }
            if (b != 3) {
                return false;
            }
            zzc();
            return true;
        }
        String strOptString = jSONObject.optString(NotificationCompat.CATEGORY_STATUS);
        switch (strOptString.hashCode()) {
            case -954325659:
                if (strOptString.equals("CONSENT_SIGNAL_NON_PERSONALIZED_ADS")) {
                    b2 = 3;
                }
                break;
            case -258041904:
                if (strOptString.equals("personalized")) {
                    b2 = 0;
                }
                break;
            case 429411856:
                if (strOptString.equals("CONSENT_SIGNAL_SUFFICIENT")) {
                    b2 = 4;
                }
                break;
            case 467888915:
                if (strOptString.equals("CONSENT_SIGNAL_PERSONALIZED_ADS")) {
                    b2 = 1;
                }
                break;
            case 1666911234:
                if (strOptString.equals("non_personalized")) {
                    b2 = 2;
                }
                break;
        }
        if (b2 == 0 || b2 == 1 || b2 == 2 || b2 == 3 || b2 == 4) {
            this.zzg.zzg(3);
        } else {
            this.zzg.zzh(new zzg(1, "We are getting something wrong with the webview."));
        }
        return true;
    }

    @UiThread
    public final void zzc() {
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbw
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd();
            }
        });
    }

    public final /* synthetic */ void zzd() {
        String strConcat;
        JSONObject jSONObject = new JSONObject();
        Application application = this.zza;
        try {
            jSONObject.put("app_name", application.getPackageManager().getApplicationLabel(application.getApplicationInfo()).toString());
            Drawable applicationIcon = application.getPackageManager().getApplicationIcon(application.getApplicationInfo());
            if (applicationIcon == null) {
                strConcat = null;
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                applicationIcon.draw(canvas);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                strConcat = "data:image/png;base64,".concat(String.valueOf(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2)));
            }
            jSONObject.put("app_icon", strConcat);
            JSONObject jSONObject2 = new JSONObject();
            for (String str : this.zzh.zzc().keySet()) {
                jSONObject2.put(str, this.zzh.zzc().get(str));
            }
            jSONObject.put("stored_infos_map", jSONObject2);
        } catch (JSONException unused) {
        }
        this.zzg.zzc().zzd("UMP_configureFormWithAppAssets", jSONObject.toString());
    }

    public final void zze(String str) {
        "Receive consent action: ".concat(String.valueOf(str));
        Uri uri = Uri.parse(str);
        this.zze.zzb(uri.getQueryParameter(a.w), uri.getQueryParameter("args"), this, this.zzf);
    }

    public final void zzf(int i, String str, String str2) {
        Locale locale = Locale.US;
        this.zzg.zzj(new zzg(2, "WebResourceError(" + i + ", " + str2 + "): " + str));
    }
}
