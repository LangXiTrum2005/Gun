package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzbru implements com.google.android.gms.ads.internal.overlay.zzr {
    final /* synthetic */ zzbrw zza;

    public zzbru(zzbrw zzbrwVar) {
        this.zza = zzbrwVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdE() {
        com.google.android.gms.ads.internal.util.client.zzo.zze("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdi() {
        com.google.android.gms.ads.internal.util.client.zzo.zze("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
        com.google.android.gms.ads.internal.util.client.zzo.zze("Delay close AdMobCustomTabsAdapter overlay.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
        com.google.android.gms.ads.internal.util.client.zzo.zze("Opening AdMobCustomTabsAdapter overlay.");
        zzbrw zzbrwVar = this.zza;
        zzbrwVar.zzb.onAdOpened(zzbrwVar);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdr() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzds(int i) {
        com.google.android.gms.ads.internal.util.client.zzo.zze("AdMobCustomTabsAdapter overlay is closed.");
        zzbrw zzbrwVar = this.zza;
        zzbrwVar.zzb.onAdClosed(zzbrwVar);
    }
}
