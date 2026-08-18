package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcql extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    private final Context zza;
    private View zzb;

    private zzcql(Context context) {
        super(context);
        this.zza = context;
    }

    public static zzcql zza(Context context, View view, zzfbo zzfboVar) {
        Resources resources;
        DisplayMetrics displayMetrics;
        zzcql zzcqlVar = new zzcql(context);
        if (!zzfboVar.zzu.isEmpty() && (resources = zzcqlVar.zza.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            zzfbp zzfbpVar = (zzfbp) zzfboVar.zzu.get(0);
            float f = zzfbpVar.zza;
            float f2 = displayMetrics.density;
            zzcqlVar.setLayoutParams(new FrameLayout.LayoutParams((int) (f * f2), (int) (zzfbpVar.zzb * f2)));
        }
        zzcqlVar.zzb = view;
        zzcqlVar.addView(view);
        com.google.android.gms.ads.internal.zzv.zzy();
        zzcaj.zzb(zzcqlVar, zzcqlVar);
        com.google.android.gms.ads.internal.zzv.zzy();
        zzcaj.zza(zzcqlVar, zzcqlVar);
        JSONObject jSONObject = zzfboVar.zzah;
        RelativeLayout relativeLayout = new RelativeLayout(zzcqlVar.zza);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("header");
        if (jSONObjectOptJSONObject != null) {
            zzcqlVar.zzc(jSONObjectOptJSONObject, relativeLayout, 10);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("footer");
        if (jSONObjectOptJSONObject2 != null) {
            zzcqlVar.zzc(jSONObjectOptJSONObject2, relativeLayout, 12);
        }
        zzcqlVar.addView(relativeLayout);
        return zzcqlVar;
    }

    private final int zzb(double d) {
        com.google.android.gms.ads.internal.client.zzbc.zzb();
        return com.google.android.gms.ads.internal.util.client.zzf.zzx(this.zza, (int) d);
    }

    private final void zzc(JSONObject jSONObject, RelativeLayout relativeLayout, int i) {
        TextView textView = new TextView(this.zza);
        textView.setTextColor(-1);
        textView.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        textView.setGravity(17);
        textView.setText(jSONObject.optString(MimeTypes.BASE_TYPE_TEXT, ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int iZzb = zzb(jSONObject.optDouble("padding", 0.0d));
        textView.setPadding(0, iZzb, 0, iZzb);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, zzb(jSONObject.optDouble("height", 15.0d)));
        layoutParams.addRule(i);
        relativeLayout.addView(textView, layoutParams);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.zzb.setY(-iArr[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.zzb.setY(-iArr[1]);
    }
}
