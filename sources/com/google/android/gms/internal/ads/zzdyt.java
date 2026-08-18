package com.google.android.gms.internal.ads;

import android.os.Binder;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdyt {
    private final zzgcs zza;
    private final zzdxy zzb;
    private final zzhel zzc;

    public zzdyt(zzgcs zzgcsVar, zzdxy zzdxyVar, zzhel zzhelVar) {
        this.zza = zzgcsVar;
        this.zzb = zzdxyVar;
        this.zzc = zzhelVar;
    }

    private final AI zzg(final zzbvk zzbvkVar, zzdys zzdysVar, final zzdys zzdysVar2, final zzgbo zzgboVar) {
        String str = zzbvkVar.zzd;
        com.google.android.gms.ads.internal.zzv.zzq();
        return (zzgby) zzgch.zzf((zzgby) zzgch.zzn((zzgby) zzgch.zzn(zzgby.zzu(com.google.android.gms.ads.internal.util.zzs.zzD(str) ? zzgch.zzg(new zzdyh(1)) : zzgch.zzf(zzdysVar.zza(zzbvkVar), ExecutionException.class, new zzgbo() { // from class: com.google.android.gms.internal.ads.zzdyr
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final AI zza(Object obj) {
                Throwable cause = (ExecutionException) obj;
                if (cause.getCause() != null) {
                    cause = cause.getCause();
                }
                return zzgch.zzg(cause);
            }
        }, this.zza)), new zzgbo() { // from class: com.google.android.gms.internal.ads.zzdyp
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final AI zza(Object obj) {
                return zzgch.zzh(((zzdyi) obj).zzb());
            }
        }, this.zza), zzgboVar, this.zza), zzdyh.class, new zzgbo() { // from class: com.google.android.gms.internal.ads.zzdyq
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final AI zza(Object obj) {
                return this.zza.zzb(zzdysVar2, zzbvkVar, zzgboVar, (zzdyh) obj);
            }
        }, this.zza);
    }

    public final AI zza(final zzbvk zzbvkVar) {
        zzgbo zzgboVar = new zzgbo() { // from class: com.google.android.gms.internal.ads.zzdym
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final AI zza(Object obj) {
                String str = new String(zzgad.zzb((InputStream) obj), StandardCharsets.UTF_8);
                zzbvk zzbvkVar2 = zzbvkVar;
                zzbvkVar2.zzj = str;
                return zzgch.zzh(zzbvkVar2);
            }
        };
        final zzdxy zzdxyVar = this.zzb;
        Objects.requireNonNull(zzdxyVar);
        return zzg(zzbvkVar, new zzdys() { // from class: com.google.android.gms.internal.ads.zzdyn
            @Override // com.google.android.gms.internal.ads.zzdys
            public final AI zza(zzbvk zzbvkVar2) {
                return zzdxyVar.zza(zzbvkVar2);
            }
        }, new zzdys() { // from class: com.google.android.gms.internal.ads.zzdyo
            @Override // com.google.android.gms.internal.ads.zzdys
            public final AI zza(zzbvk zzbvkVar2) {
                return this.zza.zzc(zzbvkVar2);
            }
        }, zzgboVar);
    }

    public final /* synthetic */ AI zzb(zzdys zzdysVar, zzbvk zzbvkVar, zzgbo zzgboVar, zzdyh zzdyhVar) throws Exception {
        return zzgch.zzn(zzdysVar.zza(zzbvkVar), zzgboVar, this.zza);
    }

    public final /* synthetic */ AI zzc(zzbvk zzbvkVar) {
        return ((zzdzl) this.zzc.zzb()).zzb(zzbvkVar, Binder.getCallingUid());
    }

    public final /* synthetic */ AI zzd(zzbvk zzbvkVar) {
        return this.zzb.zzd(zzbvkVar.zzh);
    }

    public final /* synthetic */ AI zze(zzbvk zzbvkVar) {
        return ((zzdzl) this.zzc.zzb()).zzj(zzbvkVar.zzh);
    }

    public final AI zzf(zzbvk zzbvkVar) {
        return zzg(zzbvkVar, new zzdys() { // from class: com.google.android.gms.internal.ads.zzdyk
            @Override // com.google.android.gms.internal.ads.zzdys
            public final AI zza(zzbvk zzbvkVar2) {
                return this.zza.zzd(zzbvkVar2);
            }
        }, new zzdys() { // from class: com.google.android.gms.internal.ads.zzdyl
            @Override // com.google.android.gms.internal.ads.zzdys
            public final AI zza(zzbvk zzbvkVar2) {
                return this.zza.zze(zzbvkVar2);
            }
        }, new zzgbo() { // from class: com.google.android.gms.internal.ads.zzdyj
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final AI zza(Object obj) {
                return zzgch.zzh(null);
            }
        });
    }
}
