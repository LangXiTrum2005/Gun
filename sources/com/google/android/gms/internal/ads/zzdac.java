package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdac implements AppEventListener, OnAdMetadataChangedListener, zzcvt, com.google.android.gms.ads.internal.client.zza, zzcye, zzcwn, zzcxs, com.google.android.gms.ads.internal.overlay.zzr, zzcwj, zzdds {
    private final zzczz zza = new zzczz(this, null);

    @Nullable
    private zzekn zzb;

    @Nullable
    private zzekr zzc;

    @Nullable
    private zzexm zzd;

    @Nullable
    private zzfar zze;

    private static void zzn(Object obj, zzdaa zzdaaVar) {
        if (obj != null) {
            zzdaaVar.zza(obj);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzn(this.zzb, new zzdaa() { // from class: com.google.android.gms.internal.ads.zzcys
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(Object obj) {
                ((zzekn) obj).onAdClicked();
            }
        });
        zzn(this.zzc, new zzdaa() { // from class: com.google.android.gms.internal.ads.zzcyt
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(Object obj) {
                ((zzekr) obj).onAdClicked();
            }
        });
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        zzn(this.zze, new zzdaa() { // from class: com.google.android.gms.internal.ads.zzcyy
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(Object obj) {
                ((zzfar) obj).onAdMetadataChanged();
            }
        });
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(final String str, final String str2) {
        zzn(this.zzb, new zzdaa() { // from class: com.google.android.gms.internal.ads.zzcze
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(Object obj) {
                ((zzekn) obj).onAppEvent(str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zza() {
        zzn(this.zzb, new zzdaa() { // from class: com.google.android.gms.internal.ads.zzczx
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(Object obj) {
                ((zzekn) obj).zza();
            }
        });
        zzn(this.zze, new zzdaa() { // from class: com.google.android.gms.internal.ads.zzczy
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(Object obj) {
                ((zzfar) obj).zza();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzb() {
        zzn(this.zzb, new zzdaa() { // from class: com.google.android.gms.internal.ads.zzczq
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(Object obj) {
                ((zzekn) obj).zzb();
            }
        });
        zzn(this.zze, new zzdaa() { // from class: com.google.android.gms.internal.ads.zzczr
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(Object obj) {
                ((zzfar) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzc() {
        zzn(this.zzb, new zzdaa() { // from class: com.google.android.gms.internal.ads.zzcyz
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(Object obj) {
                ((zzekn) obj).zzc();
            }
        });
        zzn(this.zze, new zzdaa() { // from class: com.google.android.gms.internal.ads.zzcza
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(Object obj) {
                ((zzfar) obj).zzc();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdE() {
        zzn(this.zzd, new zzdaa() { // from class: com.google.android.gms.internal.ads.zzczl
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzdd() {
        zzn(this.zzb, new zzdaa() { // from class: com.google.android.gms.internal.ads.zzczn
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(Object obj) {
                ((zzekn) obj).zzdd();
            }
        });
        zzn(this.zzc, new zzdaa() { // from class: com.google.android.gms.internal.ads.zzczs
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(Object obj) {
                ((zzekr) obj).zzdd();
            }
        });
        zzn(this.zze, new zzdaa() { // from class: com.google.android.gms.internal.ads.zzczt
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(Object obj) {
                ((zzfar) obj).zzdd();
            }
        });
        zzn(this.zzd, new zzdaa() { // from class: com.google.android.gms.internal.ads.zzczu
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(Object obj) {
                ((zzexm) obj).zzdd();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdi() {
        zzn(this.zzd, new zzdaa() { // from class: com.google.android.gms.internal.ads.zzcyx
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
        zzn(this.zzd, new zzdaa() { // from class: com.google.android.gms.internal.ads.zzczk
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(Object obj) {
                ((zzexm) obj).zzdo();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
        zzn(this.zzd, new zzdaa() { // from class: com.google.android.gms.internal.ads.zzczg
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(Object obj) {
                ((zzexm) obj).zzdp();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzdq(final zzbvw zzbvwVar, final String str, final String str2) {
        zzn(this.zzb, new zzdaa(zzbvwVar, str, str2) { // from class: com.google.android.gms.internal.ads.zzczb
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(Object obj) {
            }
        });
        zzn(this.zze, new zzdaa() { // from class: com.google.android.gms.internal.ads.zzczd
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(Object obj) {
                ((zzfar) obj).zzdq(zzbvwVar, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdr() {
        zzn(this.zzd, new zzdaa() { // from class: com.google.android.gms.internal.ads.zzczm
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(Object obj) {
                ((zzexm) obj).zzdr();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzds(final int i) {
        zzn(this.zzd, new zzdaa() { // from class: com.google.android.gms.internal.ads.zzczo
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(Object obj) {
                ((zzexm) obj).zzds(i);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zze() {
        zzn(this.zzb, new zzdaa() { // from class: com.google.android.gms.internal.ads.zzcyr
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(Object obj) {
            }
        });
        zzn(this.zze, new zzdaa() { // from class: com.google.android.gms.internal.ads.zzczc
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(Object obj) {
                ((zzfar) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzf() {
        zzn(this.zzb, new zzdaa() { // from class: com.google.android.gms.internal.ads.zzcyu
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(Object obj) {
            }
        });
        zzn(this.zze, new zzdaa() { // from class: com.google.android.gms.internal.ads.zzcyv
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(Object obj) {
                ((zzfar) obj).zzf();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcxs
    public final void zzg() {
        zzn(this.zzd, new zzdaa() { // from class: com.google.android.gms.internal.ads.zzczp
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(Object obj) {
                ((zzexm) obj).zzg();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcye
    public final void zzh(final com.google.android.gms.ads.internal.client.zzu zzuVar) {
        zzn(this.zzb, new zzdaa() { // from class: com.google.android.gms.internal.ads.zzczh
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(Object obj) {
                ((zzekn) obj).zzh(zzuVar);
            }
        });
        zzn(this.zze, new zzdaa() { // from class: com.google.android.gms.internal.ads.zzczi
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(Object obj) {
                ((zzfar) obj).zzh(zzuVar);
            }
        });
        zzn(this.zzd, new zzdaa() { // from class: com.google.android.gms.internal.ads.zzczj
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(Object obj) {
                ((zzexm) obj).zzh(zzuVar);
            }
        });
    }

    public final zzczz zzi() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcwj
    public final void zzq(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzn(this.zze, new zzdaa() { // from class: com.google.android.gms.internal.ads.zzczv
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(Object obj) {
                ((zzfar) obj).zzq(zzeVar);
            }
        });
        zzn(this.zzb, new zzdaa() { // from class: com.google.android.gms.internal.ads.zzczw
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(Object obj) {
                ((zzekn) obj).zzq(zzeVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final void zzr() {
        zzn(this.zzb, new zzdaa() { // from class: com.google.android.gms.internal.ads.zzcyw
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(Object obj) {
                ((zzekn) obj).zzr();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzu() {
        zzn(this.zzb, new zzdaa() { // from class: com.google.android.gms.internal.ads.zzczf
            @Override // com.google.android.gms.internal.ads.zzdaa
            public final void zza(Object obj) {
                ((zzekn) obj).zzu();
            }
        });
    }
}
