package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.wrappers.Wrappers;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
public final class zzbcj implements SharedPreferences.OnSharedPreferenceChangeListener {
    private Context zzg;
    private final Object zzb = new Object();
    private final ConditionVariable zzc = new ConditionVariable();
    private volatile boolean zzd = false;

    @VisibleForTesting
    volatile boolean zza = false;

    @Nullable
    private SharedPreferences zze = null;
    private Bundle zzf = new Bundle();
    private JSONObject zzh = new JSONObject();
    private boolean zzi = false;
    private boolean zzj = false;

    private final void zzg(final SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return;
        }
        try {
            this.zzh = new JSONObject((String) zzbcn.zza(new zzfvf() { // from class: com.google.android.gms.internal.ads.zzbcg
                @Override // com.google.android.gms.internal.ads.zzfvf
                public final Object zza() {
                    return sharedPreferences.getString("flag_configuration", "{}");
                }
            }));
        } catch (JSONException unused) {
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            zzg(sharedPreferences);
        }
    }

    public final Object zza(final zzbcc zzbccVar) {
        if (!this.zzc.block(5000L)) {
            synchronized (this.zzb) {
                try {
                    if (!this.zza) {
                        throw new IllegalStateException("Flags.initialize() was not called!");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (!this.zzd || this.zze == null || this.zzj) {
            synchronized (this.zzb) {
                if (this.zzd && this.zze != null && !this.zzj) {
                }
                return zzbccVar.zzk();
            }
        }
        if (zzbccVar.zze() != 2) {
            return (zzbccVar.zze() == 1 && this.zzh.has(zzbccVar.zzl())) ? zzbccVar.zza(this.zzh) : zzbcn.zza(new zzfvf() { // from class: com.google.android.gms.internal.ads.zzbch
                @Override // com.google.android.gms.internal.ads.zzfvf
                public final Object zza() {
                    return this.zza.zzc(zzbccVar);
                }
            });
        }
        Bundle bundle = this.zzf;
        return bundle == null ? zzbccVar.zzk() : zzbccVar.zzb(bundle);
    }

    public final Object zzb(zzbcc zzbccVar) {
        return (this.zzd || this.zza) ? zza(zzbccVar) : zzbccVar.zzk();
    }

    public final /* synthetic */ Object zzc(zzbcc zzbccVar) {
        return zzbccVar.zzc(this.zze);
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0122 A[Catch: all -> 0x000e, TRY_ENTER, TryCatch #2 {all -> 0x000e, blocks: (B:7:0x0008, B:9:0x000c, B:13:0x0011, B:15:0x0016, B:16:0x0018, B:18:0x002a, B:19:0x002e, B:20:0x0030, B:42:0x009e, B:43:0x00a5, B:52:0x00d4, B:53:0x00db, B:69:0x0122, B:70:0x0129, B:78:0x0150, B:79:0x0157, B:81:0x0159, B:82:0x0160, B:22:0x0045, B:25:0x004f, B:31:0x005c, B:34:0x0067, B:35:0x006f, B:37:0x0075, B:39:0x0085, B:41:0x009a, B:45:0x00a7, B:47:0x00ab, B:49:0x00bb, B:51:0x00d0, B:55:0x00dd, B:65:0x011c, B:72:0x012b, B:74:0x0142, B:76:0x0146, B:77:0x0149, B:58:0x00ee, B:60:0x00fc, B:62:0x0104, B:63:0x010f), top: B:89:0x0008, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x012b A[Catch: all -> 0x0057, TRY_ENTER, TryCatch #0 {all -> 0x0057, blocks: (B:22:0x0045, B:25:0x004f, B:31:0x005c, B:34:0x0067, B:35:0x006f, B:37:0x0075, B:39:0x0085, B:41:0x009a, B:45:0x00a7, B:47:0x00ab, B:49:0x00bb, B:51:0x00d0, B:55:0x00dd, B:65:0x011c, B:72:0x012b, B:74:0x0142, B:76:0x0146, B:77:0x0149, B:58:0x00ee, B:60:0x00fc, B:62:0x0104, B:63:0x010f), top: B:86:0x0045, outer: #2 }] */
    public final void zzd(Context context) {
        SharedPreferences sharedPreferencesZza;
        final SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        if (this.zzd) {
            return;
        }
        synchronized (this.zzb) {
            try {
                if (this.zzd) {
                    return;
                }
                if (!this.zza) {
                    this.zza = true;
                }
                this.zzi = TextUtils.equals(context.getPackageName(), "com.google.android.gms");
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.zzg = context;
                try {
                    this.zzf = Wrappers.packageManager(context).getApplicationInfo(this.zzg.getPackageName(), 128).metaData;
                } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                }
                try {
                    Context context2 = this.zzg;
                    Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context2);
                    if (remoteContext != null || context2 == null || (remoteContext = context2.getApplicationContext()) != null) {
                        context2 = remoteContext;
                    }
                    if (context2 != null) {
                        com.google.android.gms.ads.internal.client.zzbe.zzb();
                        sharedPreferencesZza = zzbce.zza(context2);
                    } else {
                        sharedPreferencesZza = null;
                    }
                    if (sharedPreferencesZza != null) {
                        zzbfc.zzc(new zzbci(this, sharedPreferencesZza));
                    }
                    if (!this.zzi) {
                        zzbdv zzbdvVar = zzbed.zzd;
                        if (((Long) zzbdvVar.zze()).longValue() > 0 && zzbbv.zza(this.zzg) >= ((Long) zzbdvVar.zze()).longValue()) {
                            this.zzj = true;
                            this.zzd = true;
                            this.zza = false;
                            this.zzc.open();
                            return;
                        }
                    }
                    if (!this.zzi) {
                        zzbdv zzbdvVar2 = zzbed.zzf;
                        if (((Long) zzbdvVar2.zze()).longValue() > 0 && zzbbv.zzb(this.zzg) >= ((Long) zzbdvVar2.zze()).longValue()) {
                            this.zzj = true;
                            this.zzd = true;
                            this.zza = false;
                            this.zzc.open();
                            return;
                        }
                    }
                    Context context3 = this.zzg;
                    if (!((Boolean) zzbel.zzg.zze()).booleanValue()) {
                        if (((Boolean) zzbel.zzh.zze()).booleanValue() && (sharedPreferences = context3.getSharedPreferences("admob", 0)) != null) {
                            try {
                                if (new JSONObject((String) zzbcn.zza(new zzfvf() { // from class: com.google.android.gms.internal.ads.zzbcf
                                    @Override // com.google.android.gms.internal.ads.zzfvf
                                    public final Object zza() {
                                        return sharedPreferences.getString("app_settings_json", "{}");
                                    }
                                })).optBoolean("local_flags_enabled")) {
                                }
                            } catch (JSONException unused2) {
                            }
                        }
                        if (context2 == null) {
                            this.zza = false;
                            this.zzc.open();
                            return;
                        }
                        com.google.android.gms.ads.internal.client.zzbe.zzb();
                        this.zze = zzbce.zza(context2);
                        if (!((Boolean) zzbel.zza.zze()).booleanValue() && (sharedPreferences2 = this.zze) != null) {
                            sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                        }
                        zzg(this.zze);
                        this.zzd = true;
                        this.zza = false;
                        this.zzc.open();
                    }
                    context2 = this.zzg;
                    if (context2 == null) {
                        this.zza = false;
                        this.zzc.open();
                        return;
                    }
                    com.google.android.gms.ads.internal.client.zzbe.zzb();
                    this.zze = zzbce.zza(context2);
                    if (!((Boolean) zzbel.zza.zze()).booleanValue()) {
                        sharedPreferences2.registerOnSharedPreferenceChangeListener(this);
                    }
                    zzg(this.zze);
                    this.zzd = true;
                    this.zza = false;
                    this.zzc.open();
                } catch (Throwable th) {
                    this.zza = false;
                    this.zzc.open();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean zze() {
        return this.zzj;
    }

    public final boolean zzf() {
        return this.zzi;
    }
}
