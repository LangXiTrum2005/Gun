package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.io.IOException;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzesl implements zzetr {
    private final Context zza;
    private final zzgcs zzb;
    private final zzfcj zzc;
    private final VersionInfoParcel zzd;

    public zzesl(Context context, zzgcs zzgcsVar, zzfcj zzfcjVar, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = zzgcsVar;
        this.zzc = zzfcjVar;
        this.zzd = versionInfoParcel;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 53;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final AI zzb() {
        return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzesk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0045 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x0047 A[Catch: IOException -> 0x002e, TryCatch #0 {IOException -> 0x002e, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:10:0x0033, B:15:0x0059, B:16:0x007d, B:18:0x008f, B:20:0x00a5, B:22:0x00ae, B:27:0x00d4, B:29:0x00f2, B:30:0x0116, B:32:0x0121, B:25:0x00c2, B:13:0x0047), top: B:36:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:15:0x0059 A[Catch: IOException -> 0x002e, TryCatch #0 {IOException -> 0x002e, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:10:0x0033, B:15:0x0059, B:16:0x007d, B:18:0x008f, B:20:0x00a5, B:22:0x00ae, B:27:0x00d4, B:29:0x00f2, B:30:0x0116, B:32:0x0121, B:25:0x00c2, B:13:0x0047), top: B:36:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x00c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x00c2 A[Catch: IOException -> 0x002e, TryCatch #0 {IOException -> 0x002e, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:10:0x0033, B:15:0x0059, B:16:0x007d, B:18:0x008f, B:20:0x00a5, B:22:0x00ae, B:27:0x00d4, B:29:0x00f2, B:30:0x0116, B:32:0x0121, B:25:0x00c2, B:13:0x0047), top: B:36:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x00d4 A[Catch: IOException -> 0x002e, TryCatch #0 {IOException -> 0x002e, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:10:0x0033, B:15:0x0059, B:16:0x007d, B:18:0x008f, B:20:0x00a5, B:22:0x00ae, B:27:0x00d4, B:29:0x00f2, B:30:0x0116, B:32:0x0121, B:25:0x00c2, B:13:0x0047), top: B:36:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00f2 A[Catch: IOException -> 0x002e, TryCatch #0 {IOException -> 0x002e, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:10:0x0033, B:15:0x0059, B:16:0x007d, B:18:0x008f, B:20:0x00a5, B:22:0x00ae, B:27:0x00d4, B:29:0x00f2, B:30:0x0116, B:32:0x0121, B:25:0x00c2, B:13:0x0047), top: B:36:0x0000 }] */
    public final /* synthetic */ zzesm zzc() throws Exception {
        zzfra zzfraVar;
        boolean z;
        boolean zZze;
        zzfrf zzfrfVarZzi;
        zzfrb zzfrbVarZza;
        try {
            Context context = this.zza;
            boolean zZzb = this.zzc.zzb();
            zzfra zzfraVar2 = new zzfra();
            zzfra zzfraVar3 = new zzfra();
            boolean zZzd = true;
            if (zZzb) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdi)).booleanValue()) {
                    return new zzesm(true);
                }
            }
            if (!zZzb) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzde)).booleanValue()) {
                    zzfraVar2 = zzfre.zzj(context).zzh(((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdp)).longValue(), com.google.android.gms.ads.internal.zzv.zzp().zzi().zzN());
                } else if (zZzb) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdg)).booleanValue()) {
                        zzfraVar2 = zzfre.zzj(context).zzh(((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdp)).longValue(), com.google.android.gms.ads.internal.zzv.zzp().zzi().zzN());
                    }
                }
            } else if (zZzb) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdg)).booleanValue()) {
                    zzfraVar2 = zzfre.zzj(context).zzh(((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdp)).longValue(), com.google.android.gms.ads.internal.zzv.zzp().zzi().zzN());
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdm)).booleanValue()) {
                if (this.zzd.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdl)).intValue()) {
                    zzfrf.zzi(context).zzj();
                }
            }
            if (zZzb) {
                if (zZzb) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdh)).booleanValue()) {
                        zzfrfVarZzi = zzfrf.zzi(context);
                        zzfrbVarZza = zzfrb.zza(context);
                        if (this.zzd.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdl)).intValue()) {
                            zzfraVar3 = zzfrfVarZzi.zzh(((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdq)).longValue(), com.google.android.gms.ads.internal.zzv.zzp().zzi().zzN());
                            zZzd = zzfrbVarZza.zzd();
                        }
                        zZze = zzfrbVarZza.zze();
                        zzfraVar = zzfraVar3;
                        z = zZzd;
                    }
                }
                zzfraVar = zzfraVar3;
                z = true;
                zZze = true;
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdf)).booleanValue()) {
                    zzfrfVarZzi = zzfrf.zzi(context);
                    zzfrbVarZza = zzfrb.zza(context);
                    if (this.zzd.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdl)).intValue()) {
                        zzfraVar3 = zzfrfVarZzi.zzh(((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdq)).longValue(), com.google.android.gms.ads.internal.zzv.zzp().zzi().zzN());
                        zZzd = zzfrbVarZza.zzd();
                    }
                    zZze = zzfrbVarZza.zze();
                    zzfraVar = zzfraVar3;
                    z = zZzd;
                } else {
                    if (zZzb) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdh)).booleanValue()) {
                            zzfrfVarZzi = zzfrf.zzi(context);
                            zzfrbVarZza = zzfrb.zza(context);
                            if (this.zzd.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdl)).intValue()) {
                                zzfraVar3 = zzfrfVarZzi.zzh(((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdq)).longValue(), com.google.android.gms.ads.internal.zzv.zzp().zzi().zzN());
                                zZzd = zzfrbVarZza.zzd();
                            }
                            zZze = zzfrbVarZza.zze();
                            zzfraVar = zzfraVar3;
                            z = zZzd;
                        }
                    }
                    zzfraVar = zzfraVar3;
                    z = true;
                    zZze = true;
                }
            }
            return new zzesm(zzfraVar2, zzfraVar, z, zZze, zZzb);
        } catch (IOException e) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "PerAppIdSignal");
            return new zzesm(this.zzc.zzb());
        }
    }
}
