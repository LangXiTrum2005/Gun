package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.os.StrictMode;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
public final class zzcfk {
    public static final zzcex zza(final Context context, final zzcgr zzcgrVar, final String str, final boolean z, final boolean z2, @Nullable final zzava zzavaVar, @Nullable final zzbds zzbdsVar, final VersionInfoParcel versionInfoParcel, @Nullable zzbda zzbdaVar, @Nullable final com.google.android.gms.ads.internal.zzn zznVar, @Nullable final com.google.android.gms.ads.internal.zza zzaVar, final zzbbj zzbbjVar, @Nullable final zzfbo zzfboVar, @Nullable final zzfbr zzfbrVar, @Nullable final zzebv zzebvVar, @Nullable final zzfcn zzfcnVar) throws zzcfj {
        zzbcl.zza(context);
        try {
            final zzbda zzbdaVar2 = null;
            zzfvf zzfvfVar = new zzfvf(context, zzcgrVar, str, z, z2, zzavaVar, zzbdsVar, versionInfoParcel, zzbdaVar2, zznVar, zzaVar, zzbbjVar, zzfboVar, zzfbrVar, zzfcnVar, zzebvVar) { // from class: com.google.android.gms.internal.ads.zzcfg
                public final /* synthetic */ Context zza;
                public final /* synthetic */ zzcgr zzb;
                public final /* synthetic */ String zzc;
                public final /* synthetic */ boolean zzd;
                public final /* synthetic */ boolean zze;
                public final /* synthetic */ zzava zzf;
                public final /* synthetic */ zzbds zzg;
                public final /* synthetic */ VersionInfoParcel zzh;
                public final /* synthetic */ com.google.android.gms.ads.internal.zzn zzi;
                public final /* synthetic */ com.google.android.gms.ads.internal.zza zzj;
                public final /* synthetic */ zzbbj zzk;
                public final /* synthetic */ zzfbo zzl;
                public final /* synthetic */ zzfbr zzm;
                public final /* synthetic */ zzfcn zzn;
                public final /* synthetic */ zzebv zzo;

                {
                    this.zzi = zznVar;
                    this.zzj = zzaVar;
                    this.zzk = zzbbjVar;
                    this.zzl = zzfboVar;
                    this.zzm = zzfbrVar;
                    this.zzn = zzfcnVar;
                    this.zzo = zzebvVar;
                }

                @Override // com.google.android.gms.internal.ads.zzfvf
                public final Object zza() {
                    zzcgr zzcgrVar2 = this.zzb;
                    String str2 = this.zzc;
                    boolean z3 = this.zzd;
                    zzbbj zzbbjVar2 = this.zzk;
                    boolean z4 = this.zze;
                    zzava zzavaVar2 = this.zzf;
                    zzfbo zzfboVar2 = this.zzl;
                    zzbds zzbdsVar2 = this.zzg;
                    com.google.android.gms.ads.internal.zzn zznVar2 = this.zzi;
                    zzfbr zzfbrVar2 = this.zzm;
                    Context context2 = this.zza;
                    VersionInfoParcel versionInfoParcel2 = this.zzh;
                    com.google.android.gms.ads.internal.zza zzaVar2 = this.zzj;
                    zzfcn zzfcnVar2 = this.zzn;
                    zzebv zzebvVar2 = this.zzo;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i = zzcfw.zza;
                        zzcfp zzcfpVar = new zzcfp(new zzcfw(new zzcgq(context2), zzcgrVar2, str2, z3, z4, zzavaVar2, zzbdsVar2, versionInfoParcel2, null, zznVar2, zzaVar2, zzbbjVar2, zzfboVar2, zzfbrVar2, zzfcnVar2));
                        zzcfpVar.setWebViewClient(com.google.android.gms.ads.internal.zzv.zzr().zzc(zzcfpVar, zzbbjVar2, z4, zzebvVar2));
                        zzcfpVar.setWebChromeClient(new zzcew(zzcfpVar));
                        return zzcfpVar;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return (zzcex) zzfvfVar.zza();
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th) {
            throw new zzcfj("Webview initialization failed.", th);
        }
    }
}
