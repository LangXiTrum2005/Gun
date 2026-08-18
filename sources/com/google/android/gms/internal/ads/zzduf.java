package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.util.Base64;
import com.google.android.gms.common.wrappers.Wrappers;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.ByteArrayOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzduf {
    private final Context zza;
    private final ApplicationInfo zzb;
    private String zze = "";
    private final int zzc = ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzja)).intValue();
    private final int zzd = ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjb)).intValue();

    public zzduf(Context context) {
        this.zza = context;
        this.zzb = context.getApplicationInfo();
    }

    public final JSONObject zza() throws JSONException {
        String strZzq;
        String strEncodeToString;
        JSONObject jSONObject = new JSONObject();
        try {
            Context context = this.zza;
            String str = this.zzb.packageName;
            zzfqw zzfqwVar = com.google.android.gms.ads.internal.util.zzs.zza;
            jSONObject.put("name", Wrappers.packageManager(context).getApplicationLabel(str));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONObject.put(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, this.zzb.packageName);
        com.google.android.gms.ads.internal.zzv.zzq();
        Drawable drawable = null;
        try {
            strZzq = com.google.android.gms.ads.internal.util.zzs.zzq(this.zza);
        } catch (RemoteException unused2) {
            strZzq = null;
        }
        jSONObject.put("adMobAppId", strZzq);
        if (this.zze.isEmpty()) {
            try {
                drawable = Wrappers.packageManager(this.zza).getApplicationLabelAndIcon(this.zzb.packageName).second;
            } catch (PackageManager.NameNotFoundException unused3) {
            }
            if (drawable == null) {
                strEncodeToString = "";
            } else {
                drawable.setBounds(0, 0, this.zzc, this.zzd);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.zzc, this.zzd, Bitmap.Config.ARGB_8888);
                drawable.draw(new Canvas(bitmapCreateBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
            this.zze = strEncodeToString;
        }
        if (!this.zze.isEmpty()) {
            jSONObject.put(RewardPlus.ICON, this.zze);
            jSONObject.put("iconWidthPx", this.zzc);
            jSONObject.put("iconHeightPx", this.zzd);
        }
        return jSONObject;
    }
}
