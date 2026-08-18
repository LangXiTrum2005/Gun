package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.InputEvent;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcmk {

    @VisibleForTesting
    zzbuj zza;

    @VisibleForTesting
    zzbuj zzb;
    private final Context zzc;
    private final com.google.android.gms.ads.internal.util.zzg zzd;
    private final zzecs zze;
    private final zzdpb zzf;
    private final zzgcs zzg;
    private final Executor zzh;
    private final ScheduledExecutorService zzi;

    public zzcmk(Context context, com.google.android.gms.ads.internal.util.zzg zzgVar, zzecs zzecsVar, zzdpb zzdpbVar, zzgcs zzgcsVar, zzgcs zzgcsVar2, ScheduledExecutorService scheduledExecutorService) {
        this.zzc = context;
        this.zzd = zzgVar;
        this.zze = zzecsVar;
        this.zzf = zzdpbVar;
        this.zzg = zzgcsVar;
        this.zzh = zzgcsVar2;
        this.zzi = scheduledExecutorService;
    }

    public static boolean zzj(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzka));
    }

    private final AI zzk(final String str, @Nullable final InputEvent inputEvent, Random random) {
        try {
            if (!str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzka)) || this.zzd.zzN()) {
                return zzgch.zzh(str);
            }
            final Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
            builderBuildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkb), String.valueOf(random.nextInt(Integer.MAX_VALUE)));
            if (inputEvent != null) {
                return (zzgby) zzgch.zzf((zzgby) zzgch.zzn(zzgby.zzu(this.zze.zza()), new zzgbo() { // from class: com.google.android.gms.internal.ads.zzcme
                    @Override // com.google.android.gms.internal.ads.zzgbo
                    public final AI zza(Object obj) {
                        return this.zza.zzd(builderBuildUpon, str, inputEvent, (Integer) obj);
                    }
                }, this.zzh), Throwable.class, new zzgbo() { // from class: com.google.android.gms.internal.ads.zzcmf
                    @Override // com.google.android.gms.internal.ads.zzgbo
                    public final AI zza(Object obj) {
                        return this.zza.zze(builderBuildUpon, (Throwable) obj);
                    }
                }, this.zzg);
            }
            builderBuildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkc), "11");
            return zzgch.zzh(builderBuildUpon.toString());
        } catch (Exception e) {
            return zzgch.zzg(e);
        }
    }

    public final AI zzb(final String str, Random random) {
        return TextUtils.isEmpty(str) ? zzgch.zzh(str) : zzgch.zzf(zzk(str, this.zzf.zza(), random), Throwable.class, new zzgbo() { // from class: com.google.android.gms.internal.ads.zzcmb
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final AI zza(Object obj) {
                return this.zza.zzc(str, (Throwable) obj);
            }
        }, this.zzg);
    }

    public final /* synthetic */ AI zzc(String str, final Throwable th) throws Exception {
        this.zzg.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmd
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzg(th);
            }
        });
        return zzgch.zzh(str);
    }

    public final /* synthetic */ AI zzd(final Uri.Builder builder, String str, InputEvent inputEvent, Integer num) throws Exception {
        if (num.intValue() != 1) {
            builder.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkc), "10");
            return zzgch.zzh(builder.toString());
        }
        Uri.Builder builderBuildUpon = builder.build().buildUpon();
        builderBuildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkd), "1");
        builderBuildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkc), "12");
        if (str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzke))) {
            builderBuildUpon.authority((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkf));
        }
        return (zzgby) zzgch.zzn(zzgby.zzu(this.zze.zzb(builderBuildUpon.build(), inputEvent)), new zzgbo() { // from class: com.google.android.gms.internal.ads.zzcmg
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final AI zza(Object obj) {
                String str2 = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkc);
                Uri.Builder builder2 = builder;
                builder2.appendQueryParameter(str2, "12");
                return zzgch.zzh(builder2.toString());
            }
        }, this.zzh);
    }

    public final /* synthetic */ AI zze(Uri.Builder builder, final Throwable th) throws Exception {
        this.zzg.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmc
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzh(th);
            }
        });
        builder.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkc), "9");
        return zzgch.zzh(builder.toString());
    }

    public final /* synthetic */ void zzg(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkh)).booleanValue()) {
            zzbuj zzbujVarZzc = zzbuh.zzc(this.zzc);
            this.zzb = zzbujVarZzc;
            zzbujVarZzc.zzh(th, "AttributionReporting.getUpdatedUrlAndRegisterSource");
        } else {
            zzbuj zzbujVarZza = zzbuh.zza(this.zzc);
            this.zza = zzbujVarZza;
            zzbujVarZza.zzh(th, "AttributionReportingSampled.getUpdatedUrlAndRegisterSource");
        }
    }

    public final /* synthetic */ void zzh(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkh)).booleanValue()) {
            zzbuj zzbujVarZzc = zzbuh.zzc(this.zzc);
            this.zzb = zzbujVarZzc;
            zzbujVarZzc.zzh(th, "AttributionReporting");
        } else {
            zzbuj zzbujVarZza = zzbuh.zza(this.zzc);
            this.zza = zzbujVarZza;
            zzbujVarZza.zzh(th, "AttributionReportingSampled");
        }
    }

    public final void zzi(String str, zzfja zzfjaVar, Random random, @Nullable com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zzgch.zzr(zzgch.zzo(zzk(str, this.zzf.zza(), random), ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkg)).intValue(), TimeUnit.MILLISECONDS, this.zzi), new zzcmj(this, zzfjaVar, str, zzvVar), this.zzg);
    }
}
