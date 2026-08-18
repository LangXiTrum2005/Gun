package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
public final class zzbns {
    private final Context zzb;
    private final String zzc;
    private final VersionInfoParcel zzd;

    @Nullable
    private final zzfhk zze;
    private final com.google.android.gms.ads.internal.util.zzbd zzf;
    private final com.google.android.gms.ads.internal.util.zzbd zzg;

    @Nullable
    private zzbnr zzh;
    private final Object zza = new Object();
    private int zzi = 1;

    public zzbns(Context context, VersionInfoParcel versionInfoParcel, String str, com.google.android.gms.ads.internal.util.zzbd zzbdVar, com.google.android.gms.ads.internal.util.zzbd zzbdVar2, @Nullable zzfhk zzfhkVar) {
        this.zzc = str;
        this.zzb = context.getApplicationContext();
        this.zzd = versionInfoParcel;
        this.zze = zzfhkVar;
        this.zzf = zzbdVar;
        this.zzg = zzbdVar2;
    }

    public final zzbnm zzb(@Nullable zzava zzavaVar) {
        com.google.android.gms.ads.internal.util.zze.zza("getEngine: Trying to acquire lock");
        synchronized (this.zza) {
            try {
                com.google.android.gms.ads.internal.util.zze.zza("getEngine: Lock acquired");
                com.google.android.gms.ads.internal.util.zze.zza("refreshIfDestroyed: Trying to acquire lock");
                synchronized (this.zza) {
                    try {
                        com.google.android.gms.ads.internal.util.zze.zza("refreshIfDestroyed: Lock acquired");
                        zzbnr zzbnrVar = this.zzh;
                        if (zzbnrVar != null && this.zzi == 0) {
                            zzbnrVar.zzj(new zzcaf() { // from class: com.google.android.gms.internal.ads.zzbna
                                @Override // com.google.android.gms.internal.ads.zzcaf
                                public final void zza(Object obj) {
                                    this.zza.zzk((zzbmn) obj);
                                }
                            }, new zzcad() { // from class: com.google.android.gms.internal.ads.zzbnb
                                @Override // com.google.android.gms.internal.ads.zzcad
                                public final void zza() {
                                }
                            });
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                com.google.android.gms.ads.internal.util.zze.zza("refreshIfDestroyed: Lock released");
                zzbnr zzbnrVar2 = this.zzh;
                if (zzbnrVar2 != null && zzbnrVar2.zze() != -1) {
                    int i = this.zzi;
                    if (i == 0) {
                        com.google.android.gms.ads.internal.util.zze.zza("getEngine (NO_UPDATE): Lock released");
                        return this.zzh.zza();
                    }
                    if (i != 1) {
                        com.google.android.gms.ads.internal.util.zze.zza("getEngine (UPDATING): Lock released");
                        return this.zzh.zza();
                    }
                    this.zzi = 2;
                    zzd(null);
                    com.google.android.gms.ads.internal.util.zze.zza("getEngine (PENDING_UPDATE): Lock released");
                    return this.zzh.zza();
                }
                this.zzi = 2;
                this.zzh = zzd(null);
                com.google.android.gms.ads.internal.util.zze.zza("getEngine (NULL or REJECTED): Lock released");
                return this.zzh.zza();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final zzbnr zzd(@Nullable zzava zzavaVar) {
        zzfgw zzfgwVarZza = zzfgv.zza(this.zzb, 6);
        zzfgwVarZza.zzi();
        final zzbnr zzbnrVar = new zzbnr(this.zzg);
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before UI_THREAD_EXECUTOR");
        final zzava zzavaVar2 = null;
        zzbzw.zzf.execute(new Runnable(zzavaVar2, zzbnrVar) { // from class: com.google.android.gms.internal.ads.zzbnc
            public final /* synthetic */ zzbnr zzb;

            {
                this.zzb = zzbnrVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzi(null, this.zzb);
            }
        });
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine: Promise created");
        zzbnrVar.zzj(new zzbnh(this, zzbnrVar, zzfgwVarZza), new zzbni(this, zzbnrVar, zzfgwVarZza));
        return zzbnrVar;
    }

    public final /* synthetic */ void zzi(zzava zzavaVar, zzbnr zzbnrVar) {
        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        try {
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before createJavascriptEngine");
            zzbmv zzbmvVar = new zzbmv(this.zzb, this.zzd, null, null);
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After createJavascriptEngine");
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before setting new engine loaded listener");
            zzbmvVar.zzk(new zzbmy(this, arrayList, jCurrentTimeMillis, zzbnrVar, zzbmvVar));
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before registering GmsgHandler for /jsLoaded");
            zzbmvVar.zzq("/jsLoaded", new zzbnd(this, jCurrentTimeMillis, zzbnrVar, zzbmvVar));
            com.google.android.gms.ads.internal.util.zzby zzbyVar = new com.google.android.gms.ads.internal.util.zzby();
            zzbne zzbneVar = new zzbne(this, null, zzbmvVar, zzbyVar);
            zzbyVar.zzb(zzbneVar);
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before registering GmsgHandler for /requestReload");
            zzbmvVar.zzq("/requestReload", zzbneVar);
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > javascriptPath: ".concat(String.valueOf(this.zzc)));
            if (this.zzc.endsWith(".js")) {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before newEngine.loadJavascript");
                zzbmvVar.zzh(this.zzc);
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After newEngine.loadJavascript");
            } else if (this.zzc.startsWith("<html>")) {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before newEngine.loadHtml");
                zzbmvVar.zzf(this.zzc);
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After newEngine.loadHtml");
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before newEngine.loadHtmlWrapper");
                zzbmvVar.zzg(this.zzc);
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After newEngine.loadHtmlWrapper");
            }
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before calling ADMOB_UI_HANDLER.postDelayed");
            com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new zzbng(this, zzbnrVar, zzbmvVar, arrayList, jCurrentTimeMillis), ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzc)).intValue());
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error creating webview.", th);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzhB)).booleanValue()) {
                zzbnrVar.zzh(th, "SdkJavascriptFactory.loadJavascriptEngine.createJavascriptEngine");
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzhD)).booleanValue()) {
                com.google.android.gms.ads.internal.zzv.zzp().zzv(th, "SdkJavascriptFactory.loadJavascriptEngine");
                zzbnrVar.zzg();
            } else {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "SdkJavascriptFactory.loadJavascriptEngine");
                zzbnrVar.zzg();
            }
        }
    }

    public final /* synthetic */ void zzj(zzbnr zzbnrVar, final zzbmn zzbmnVar, ArrayList arrayList, long j) {
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Trying to acquire lock");
        synchronized (this.zza) {
            try {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock acquired");
                if (zzbnrVar.zze() != -1 && zzbnrVar.zze() != 1) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzhB)).booleanValue()) {
                        zzbnrVar.zzh(new TimeoutException("Unable to receive /jsLoaded GMSG."), "SdkJavascriptFactory.loadJavascriptEngine.setLoadedListener");
                    } else {
                        zzbnrVar.zzg();
                    }
                    zzgcs zzgcsVar = zzbzw.zzf;
                    Objects.requireNonNull(zzbmnVar);
                    zzgcsVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbmx
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzbmnVar.zzc();
                        }
                    });
                    com.google.android.gms.ads.internal.util.zze.zza("Could not receive /jsLoaded in " + String.valueOf(com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzb)) + " ms. JS engine session reference status(onEngLoadedTimeout) is " + zzbnrVar.zze() + ". Update status(onEngLoadedTimeout) is " + this.zzi + ". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is " + String.valueOf(arrayList.get(0)) + " ms. Total latency(onEngLoadedTimeout) is " + (com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() - j) + " ms. Rejecting.");
                    com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released");
                    return;
                }
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released, the promise is already settled");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void zzk(zzbmn zzbmnVar) {
        if (zzbmnVar.zzi()) {
            this.zzi = 1;
        }
    }
}
