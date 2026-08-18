package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzduu;
import com.google.android.gms.internal.ads.zzduv;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzay {
    private zzduv zzg;
    private final Object zzb = new Object();
    private String zzc = "";
    private String zzd = "";
    private boolean zze = false;
    private boolean zzf = false;

    @VisibleForTesting
    protected String zza = "";

    @Nullable
    @VisibleForTesting
    public static final String zzo(Context context, String str, String str2) {
        HashMap map = new HashMap();
        map.put("User-Agent", com.google.android.gms.ads.internal.zzv.zzq().zzc(context, str2));
        AI aiZzb = new zzbo(context).zzb(0, str, map, null);
        try {
            return (String) aiZzb.get(((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzeO)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Interrupted while retrieving a response from: ".concat(String.valueOf(str)), e);
            aiZzb.cancel(true);
            return null;
        } catch (TimeoutException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Timeout while retrieving a response from: ".concat(String.valueOf(str)), e2);
            aiZzb.cancel(true);
            return null;
        } catch (Exception e3) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error retrieving a response from: ".concat(String.valueOf(str)), e3);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0066 A[Catch: all -> 0x0029, TryCatch #1 {, blocks: (B:4:0x000b, B:6:0x0013, B:7:0x0018, B:12:0x0032, B:14:0x003a, B:16:0x004f, B:19:0x0061, B:11:0x002b, B:20:0x0066, B:21:0x0068), top: B:28:0x000b, inners: #0, #2 }] */
    private final Uri zzp(Context context, String str, String str2, String str3) {
        String str4;
        String str5;
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        synchronized (this.zzb) {
            if (TextUtils.isEmpty(this.zzc)) {
                com.google.android.gms.ads.internal.zzv.zzq();
                try {
                    str5 = new String(IOUtils.readInputStreamFully(context.openFileInput("debug_signals_id.txt"), true), C.UTF8_NAME);
                } catch (IOException unused) {
                    com.google.android.gms.ads.internal.util.client.zzo.zze("Error reading from internal storage.");
                    str5 = "";
                }
                this.zzc = str5;
                if (TextUtils.isEmpty(str5)) {
                    com.google.android.gms.ads.internal.zzv.zzq();
                    this.zzc = UUID.randomUUID().toString();
                    com.google.android.gms.ads.internal.zzv.zzq();
                    String str6 = this.zzc;
                    try {
                        FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("debug_signals_id.txt", 0);
                        fileOutputStreamOpenFileOutput.write(str6.getBytes(C.UTF8_NAME));
                        fileOutputStreamOpenFileOutput.close();
                    } catch (Exception e) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("Error writing to file in internal storage.", e);
                    }
                    str4 = this.zzc;
                } else {
                    str4 = this.zzc;
                }
            } else {
                str4 = this.zzc;
            }
            throw th;
        }
        builderBuildUpon.appendQueryParameter("linkedDeviceId", str4);
        builderBuildUpon.appendQueryParameter("adSlotPath", str2);
        builderBuildUpon.appendQueryParameter("afmaVersion", str3);
        return builderBuildUpon.build();
    }

    public final zzduv zza() {
        return this.zzg;
    }

    public final String zzb() {
        String str;
        synchronized (this.zzb) {
            str = this.zzd;
        }
        return str;
    }

    public final void zzc(Context context) {
        zzduv zzduvVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjc)).booleanValue() || (zzduvVar = this.zzg) == null) {
            return;
        }
        zzduvVar.zzh(new zzav(this, context), zzduu.DEBUG_MENU);
    }

    public final void zzd(Context context, String str, String str2) {
        com.google.android.gms.ads.internal.zzv.zzq();
        zzs.zzU(context, zzp(context, (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzeK), str, str2));
    }

    public final void zze(Context context, String str, String str2, String str3) {
        Uri.Builder builderBuildUpon = zzp(context, (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzeN), str3, str).buildUpon();
        builderBuildUpon.appendQueryParameter("debugData", str2);
        com.google.android.gms.ads.internal.zzv.zzq();
        zzs.zzM(context, str, builderBuildUpon.build().toString());
    }

    public final void zzf(boolean z) {
        synchronized (this.zzb) {
            try {
                this.zzf = z;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjc)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzv.zzp().zzi().zzx(z);
                    zzduv zzduvVar = this.zzg;
                    if (zzduvVar != null) {
                        zzduvVar.zzl(z);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzg(zzduv zzduvVar) {
        this.zzg = zzduvVar;
    }

    public final void zzh(boolean z) {
        synchronized (this.zzb) {
            this.zze = z;
        }
    }

    @VisibleForTesting
    public final void zzi(Context context, String str, boolean z, boolean z2) {
        if (context instanceof Activity) {
            zzs.zza.post(new zzax(this, context, str, z, z2));
        } else {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Can not create dialog without Activity Context");
        }
    }

    public final boolean zzj(Context context, String str, String str2) {
        String strZzo = zzo(context, zzp(context, (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzeM), str, str2).toString(), str2);
        if (TextUtils.isEmpty(strZzo)) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("Not linked for debug signals.");
            return false;
        }
        try {
            boolean zEquals = "1".equals(new JSONObject(strZzo.trim()).optString("debug_mode"));
            zzf(zEquals);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjc)).booleanValue()) {
                zzg zzgVarZzi = com.google.android.gms.ads.internal.zzv.zzp().zzi();
                if (true != zEquals) {
                    str = "";
                }
                zzgVarZzi.zzw(str);
            }
            return zEquals;
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Fail to get debug mode response json.", e);
            return false;
        }
    }

    @VisibleForTesting
    public final boolean zzk(Context context, String str, String str2) {
        String strZzo = zzo(context, zzp(context, (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzeL), str, str2).toString(), str2);
        if (TextUtils.isEmpty(strZzo)) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("Not linked for in app preview.");
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(strZzo.trim());
            String strOptString = jSONObject.optString("gct");
            this.zza = jSONObject.optString(NotificationCompat.CATEGORY_STATUS);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjc)).booleanValue()) {
                boolean z = "0".equals(this.zza) || "2".equals(this.zza);
                zzf(z);
                zzg zzgVarZzi = com.google.android.gms.ads.internal.zzv.zzp().zzi();
                if (!z) {
                    str = "";
                }
                zzgVarZzi.zzw(str);
            }
            synchronized (this.zzb) {
                this.zzd = strOptString;
            }
            return true;
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Fail to get in app preview response json.", e);
            return false;
        }
    }

    public final boolean zzl() {
        boolean z;
        synchronized (this.zzb) {
            z = this.zzf;
        }
        return z;
    }

    public final boolean zzm() {
        boolean z;
        synchronized (this.zzb) {
            z = this.zze;
        }
        return z;
    }

    public final boolean zzn(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !zzm()) {
            return false;
        }
        com.google.android.gms.ads.internal.util.client.zzo.zze("Sending troubleshooting signals to the server.");
        zze(context, str, str2, str3);
        return true;
    }
}
