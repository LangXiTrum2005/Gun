package com.google.android.gms.ads.internal.overlay;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.ads.zzbcl;
import com.mbridge.msdk.newreward.player.view.hybrid.util.MRAIDCommunicatorUtil;

/* JADX INFO: loaded from: classes2.dex */
public final class zzu extends FrameLayout implements View.OnClickListener {
    private final ImageButton zza;
    private final zzag zzb;

    public zzu(Context context, zzt zztVar, @Nullable zzag zzagVar) {
        super(context);
        this.zzb = zzagVar;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.zza = imageButton;
        zzc();
        imageButton.setBackgroundColor(0);
        imageButton.setOnClickListener(this);
        zzbc.zzb();
        int iZzx = com.google.android.gms.ads.internal.util.client.zzf.zzx(context, zztVar.zza);
        zzbc.zzb();
        int iZzx2 = com.google.android.gms.ads.internal.util.client.zzf.zzx(context, 0);
        zzbc.zzb();
        int iZzx3 = com.google.android.gms.ads.internal.util.client.zzf.zzx(context, zztVar.zzb);
        zzbc.zzb();
        imageButton.setPadding(iZzx, iZzx2, iZzx3, com.google.android.gms.ads.internal.util.client.zzf.zzx(context, zztVar.zzc));
        imageButton.setContentDescription("Interstitial close button");
        zzbc.zzb();
        int iZzx4 = com.google.android.gms.ads.internal.util.client.zzf.zzx(context, zztVar.zzd + zztVar.zza + zztVar.zzb);
        zzbc.zzb();
        addView(imageButton, new FrameLayout.LayoutParams(iZzx4, com.google.android.gms.ads.internal.util.client.zzf.zzx(context, zztVar.zzd + zztVar.zzc), 17));
        long jLongValue = ((Long) zzbe.zzc().zza(zzbcl.zzbl)).longValue();
        if (jLongValue <= 0) {
            return;
        }
        zzs zzsVar = ((Boolean) zzbe.zzc().zza(zzbcl.zzbm)).booleanValue() ? new zzs(this) : null;
        imageButton.setAlpha(0.0f);
        imageButton.animate().alpha(1.0f).setDuration(jLongValue).setListener(zzsVar);
    }

    private final void zzc() {
        String str = (String) zzbe.zzc().zza(zzbcl.zzbk);
        if (!PlatformVersion.isAtLeastLollipop() || TextUtils.isEmpty(str) || MRAIDCommunicatorUtil.STATES_DEFAULT.equals(str)) {
            this.zza.setImageResource(R.drawable.btn_dialog);
            return;
        }
        Resources resourcesZze = com.google.android.gms.ads.internal.zzv.zzp().zze();
        if (resourcesZze == null) {
            this.zza.setImageResource(R.drawable.btn_dialog);
            return;
        }
        Drawable drawable = null;
        try {
            if ("white".equals(str)) {
                drawable = resourcesZze.getDrawable(com.google.android.gms.ads.impl.R.drawable.admob_close_button_white_circle_black_cross);
            } else if ("black".equals(str)) {
                drawable = resourcesZze.getDrawable(com.google.android.gms.ads.impl.R.drawable.admob_close_button_black_circle_white_cross);
            }
        } catch (Resources.NotFoundException unused) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("Close button resource not found, falling back to default.");
        }
        if (drawable == null) {
            this.zza.setImageResource(R.drawable.btn_dialog);
        } else {
            this.zza.setImageDrawable(drawable);
            this.zza.setScaleType(ImageView.ScaleType.CENTER);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zzag zzagVar = this.zzb;
        if (zzagVar != null) {
            zzagVar.zzj();
        }
    }

    public final void zzb(boolean z) {
        if (!z) {
            this.zza.setVisibility(0);
            return;
        }
        this.zza.setVisibility(8);
        if (((Long) zzbe.zzc().zza(zzbcl.zzbl)).longValue() > 0) {
            this.zza.animate().cancel();
            this.zza.clearAnimation();
        }
    }
}
