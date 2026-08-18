package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.badlogic.gdx.net.HttpRequestHeader;
import com.google.android.gms.ads.impl.R;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbsf extends zzbsi {
    private final Map zza;
    private final Context zzb;

    public zzbsf(zzcex zzcexVar, Map map) {
        super(zzcexVar, "storePicture");
        this.zza = map;
        this.zzb = zzcexVar.zzi();
    }

    public final void zzb() {
        if (this.zzb == null) {
            zzh("Activity context is not available");
            return;
        }
        com.google.android.gms.ads.internal.zzv.zzq();
        if (!new zzbbt(this.zzb).zzc()) {
            zzh("Feature is not supported by the device.");
            return;
        }
        String str = (String) this.zza.get("iurl");
        if (TextUtils.isEmpty(str)) {
            zzh("Image url cannot be empty.");
            return;
        }
        if (!URLUtil.isValidUrl(str)) {
            zzh("Invalid image url: ".concat(String.valueOf(str)));
            return;
        }
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        com.google.android.gms.ads.internal.zzv.zzq();
        if (TextUtils.isEmpty(lastPathSegment) || !lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
            zzh("Image type not recognized: ".concat(String.valueOf(lastPathSegment)));
            return;
        }
        Resources resourcesZze = com.google.android.gms.ads.internal.zzv.zzp().zze();
        com.google.android.gms.ads.internal.zzv.zzq();
        AlertDialog.Builder builderZzL = com.google.android.gms.ads.internal.util.zzs.zzL(this.zzb);
        builderZzL.setTitle(resourcesZze != null ? resourcesZze.getString(R.string.s1) : "Save image");
        builderZzL.setMessage(resourcesZze != null ? resourcesZze.getString(R.string.s2) : "Allow Ad to store image in Picture gallery?");
        builderZzL.setPositiveButton(resourcesZze != null ? resourcesZze.getString(R.string.s3) : HttpRequestHeader.Accept, new zzbsd(this, str, lastPathSegment));
        builderZzL.setNegativeButton(resourcesZze != null ? resourcesZze.getString(R.string.s4) : "Decline", new zzbse(this));
        builderZzL.create().show();
    }
}
