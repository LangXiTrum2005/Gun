package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbrq extends zzbrc {
    private final RtbAdapter zza;
    private MediationInterstitialAd zzb;
    private MediationRewardedAd zzc;
    private MediationAppOpenAd zzd;
    private String zze = "";

    public zzbrq(RtbAdapter rtbAdapter) {
        this.zza = rtbAdapter;
    }

    private final Bundle zzv(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        Bundle bundle;
        Bundle bundle2 = zzmVar.zzm;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.zza.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    private static final Bundle zzw(String str) throws RemoteException {
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str == null) {
                return bundle;
            }
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle2 = new Bundle();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                bundle2.putString(next, jSONObject.getString(next));
            }
            return bundle2;
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
            throw new RemoteException();
        }
    }

    private static final boolean zzx(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        if (zzmVar.zzf) {
            return true;
        }
        com.google.android.gms.ads.internal.client.zzbc.zzb();
        return com.google.android.gms.ads.internal.util.client.zzf.zzr();
    }

    @Nullable
    private static final String zzy(String str, com.google.android.gms.ads.internal.client.zzm zzmVar) {
        String str2 = zzmVar.zzu;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzeb zze() {
        MediationExtrasReceiver mediationExtrasReceiver = this.zza;
        if (mediationExtrasReceiver instanceof com.google.android.gms.ads.mediation.zza) {
            try {
                return ((com.google.android.gms.ads.mediation.zza) mediationExtrasReceiver).getVideoController();
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("", th);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final zzbrs zzf() throws RemoteException {
        return zzbrs.zza(this.zza.getVersionInfo());
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final zzbrs zzg() throws RemoteException {
        return zzbrs.zza(this.zza.getSDKVersionInfo());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zzh(IObjectWrapper iObjectWrapper, String str, Bundle bundle, Bundle bundle2, com.google.android.gms.ads.internal.client.zzs zzsVar, zzbrg zzbrgVar) throws RemoteException {
        AdFormat adFormat;
        try {
            zzbro zzbroVar = new zzbro(this, zzbrgVar);
            RtbAdapter rtbAdapter = this.zza;
            switch (str) {
                case "banner":
                    adFormat = AdFormat.BANNER;
                    MediationConfiguration mediationConfiguration = new MediationConfiguration(adFormat, bundle2);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(mediationConfiguration);
                    rtbAdapter.collectSignals(new RtbSignalData((Context) ObjectWrapper.unwrap(iObjectWrapper), arrayList, bundle, com.google.android.gms.ads.zzc.zzc(zzsVar.zze, zzsVar.zzb, zzsVar.zza)), zzbroVar);
                    return;
                case "interstitial":
                    adFormat = AdFormat.INTERSTITIAL;
                    MediationConfiguration mediationConfiguration2 = new MediationConfiguration(adFormat, bundle2);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(mediationConfiguration2);
                    rtbAdapter.collectSignals(new RtbSignalData((Context) ObjectWrapper.unwrap(iObjectWrapper), arrayList2, bundle, com.google.android.gms.ads.zzc.zzc(zzsVar.zze, zzsVar.zzb, zzsVar.zza)), zzbroVar);
                    return;
                case "rewarded":
                    adFormat = AdFormat.REWARDED;
                    MediationConfiguration mediationConfiguration3 = new MediationConfiguration(adFormat, bundle2);
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(mediationConfiguration3);
                    rtbAdapter.collectSignals(new RtbSignalData((Context) ObjectWrapper.unwrap(iObjectWrapper), arrayList3, bundle, com.google.android.gms.ads.zzc.zzc(zzsVar.zze, zzsVar.zzb, zzsVar.zza)), zzbroVar);
                    return;
                case "rewarded_interstitial":
                    adFormat = AdFormat.REWARDED_INTERSTITIAL;
                    MediationConfiguration mediationConfiguration4 = new MediationConfiguration(adFormat, bundle2);
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.add(mediationConfiguration4);
                    rtbAdapter.collectSignals(new RtbSignalData((Context) ObjectWrapper.unwrap(iObjectWrapper), arrayList4, bundle, com.google.android.gms.ads.zzc.zzc(zzsVar.zze, zzsVar.zzb, zzsVar.zza)), zzbroVar);
                    return;
                case "native":
                    adFormat = AdFormat.NATIVE;
                    MediationConfiguration mediationConfiguration5 = new MediationConfiguration(adFormat, bundle2);
                    ArrayList arrayList5 = new ArrayList();
                    arrayList5.add(mediationConfiguration5);
                    rtbAdapter.collectSignals(new RtbSignalData((Context) ObjectWrapper.unwrap(iObjectWrapper), arrayList5, bundle, com.google.android.gms.ads.zzc.zzc(zzsVar.zze, zzsVar.zzb, zzsVar.zza)), zzbroVar);
                    return;
                case "app_open":
                    adFormat = AdFormat.APP_OPEN_AD;
                    MediationConfiguration mediationConfiguration6 = new MediationConfiguration(adFormat, bundle2);
                    ArrayList arrayList6 = new ArrayList();
                    arrayList6.add(mediationConfiguration6);
                    rtbAdapter.collectSignals(new RtbSignalData((Context) ObjectWrapper.unwrap(iObjectWrapper), arrayList6, bundle, com.google.android.gms.ads.zzc.zzc(zzsVar.zze, zzsVar.zzb, zzsVar.zza)), zzbroVar);
                    return;
                case "app_open_ad":
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzlI)).booleanValue()) {
                        adFormat = AdFormat.APP_OPEN_AD;
                        MediationConfiguration mediationConfiguration7 = new MediationConfiguration(adFormat, bundle2);
                        ArrayList arrayList7 = new ArrayList();
                        arrayList7.add(mediationConfiguration7);
                        rtbAdapter.collectSignals(new RtbSignalData((Context) ObjectWrapper.unwrap(iObjectWrapper), arrayList7, bundle, com.google.android.gms.ads.zzc.zzc(zzsVar.zze, zzsVar.zzb, zzsVar.zza)), zzbroVar);
                        return;
                    }
                default:
                    throw new IllegalArgumentException("Internal Error");
            }
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error generating signals for RTB", th);
            zzbpb.zza(iObjectWrapper, th, "adapter.collectSignals");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zzi(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbqo zzbqoVar, zzbpk zzbpkVar) throws RemoteException {
        try {
            this.zza.loadRtbAppOpenAd(new MediationAppOpenAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzw(str2), zzv(zzmVar), zzx(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzy(str2, zzmVar), this.zze), new zzbrn(this, zzbqoVar, zzbpkVar));
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Adapter failed to render app open ad.", th);
            zzbpb.zza(iObjectWrapper, th, "adapter.loadRtbAppOpenAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zzj(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbqr zzbqrVar, zzbpk zzbpkVar, com.google.android.gms.ads.internal.client.zzs zzsVar) throws RemoteException {
        try {
            this.zza.loadRtbBannerAd(new MediationBannerAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzw(str2), zzv(zzmVar), zzx(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzy(str2, zzmVar), com.google.android.gms.ads.zzc.zzc(zzsVar.zze, zzsVar.zzb, zzsVar.zza), this.zze), new zzbri(this, zzbqrVar, zzbpkVar));
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Adapter failed to render banner ad.", th);
            zzbpb.zza(iObjectWrapper, th, "adapter.loadRtbBannerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zzk(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbqr zzbqrVar, zzbpk zzbpkVar, com.google.android.gms.ads.internal.client.zzs zzsVar) throws RemoteException {
        try {
            this.zza.loadRtbInterscrollerAd(new MediationBannerAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzw(str2), zzv(zzmVar), zzx(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzy(str2, zzmVar), com.google.android.gms.ads.zzc.zzc(zzsVar.zze, zzsVar.zzb, zzsVar.zza), this.zze), new zzbrj(this, zzbqrVar, zzbpkVar));
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Adapter failed to render interscroller ad.", th);
            zzbpb.zza(iObjectWrapper, th, "adapter.loadRtbInterscrollerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zzl(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbqu zzbquVar, zzbpk zzbpkVar) throws RemoteException {
        try {
            this.zza.loadRtbInterstitialAd(new MediationInterstitialAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzw(str2), zzv(zzmVar), zzx(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzy(str2, zzmVar), this.zze), new zzbrk(this, zzbquVar, zzbpkVar));
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Adapter failed to render interstitial ad.", th);
            zzbpb.zza(iObjectWrapper, th, "adapter.loadRtbInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zzm(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbqx zzbqxVar, zzbpk zzbpkVar) throws RemoteException {
        zzn(str, str2, zzmVar, iObjectWrapper, zzbqxVar, zzbpkVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zzn(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbqx zzbqxVar, zzbpk zzbpkVar, zzbfl zzbflVar) throws RemoteException {
        try {
            this.zza.loadRtbNativeAdMapper(new MediationNativeAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzw(str2), zzv(zzmVar), zzx(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzy(str2, zzmVar), this.zze, zzbflVar), new zzbrl(this, zzbqxVar, zzbpkVar));
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Adapter failed to render native ad.", th);
            zzbpb.zza(iObjectWrapper, th, "adapter.loadRtbNativeAdMapper");
            String message = th.getMessage();
            if (TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                throw new RemoteException();
            }
            try {
                this.zza.loadRtbNativeAd(new MediationNativeAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzw(str2), zzv(zzmVar), zzx(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzy(str2, zzmVar), this.zze, zzbflVar), new zzbrm(this, zzbqxVar, zzbpkVar));
            } catch (Throwable th2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Adapter failed to render native ad.", th2);
                zzbpb.zza(iObjectWrapper, th2, "adapter.loadRtbNativeAd");
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zzo(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbra zzbraVar, zzbpk zzbpkVar) throws RemoteException {
        try {
            this.zza.loadRtbRewardedInterstitialAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzw(str2), zzv(zzmVar), zzx(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzy(str2, zzmVar), this.zze), new zzbrp(this, zzbraVar, zzbpkVar));
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Adapter failed to render rewarded interstitial ad.", th);
            zzbpb.zza(iObjectWrapper, th, "adapter.loadRtbRewardedInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zzp(String str, String str2, com.google.android.gms.ads.internal.client.zzm zzmVar, IObjectWrapper iObjectWrapper, zzbra zzbraVar, zzbpk zzbpkVar) throws RemoteException {
        try {
            this.zza.loadRtbRewardedAd(new MediationRewardedAdConfiguration((Context) ObjectWrapper.unwrap(iObjectWrapper), str, zzw(str2), zzv(zzmVar), zzx(zzmVar), zzmVar.zzk, zzmVar.zzg, zzmVar.zzt, zzy(str2, zzmVar), this.zze), new zzbrp(this, zzbraVar, zzbpkVar));
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Adapter failed to render rewarded ad.", th);
            zzbpb.zza(iObjectWrapper, th, "adapter.loadRtbRewardedAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final void zzq(String str) {
        this.zze = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final boolean zzr(IObjectWrapper iObjectWrapper) throws RemoteException {
        MediationAppOpenAd mediationAppOpenAd = this.zzd;
        if (mediationAppOpenAd == null) {
            return false;
        }
        try {
            mediationAppOpenAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
            return true;
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", th);
            zzbpb.zza(iObjectWrapper, th, "adapter.showRtbAppOpenAd");
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final boolean zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        MediationInterstitialAd mediationInterstitialAd = this.zzb;
        if (mediationInterstitialAd == null) {
            return false;
        }
        try {
            mediationInterstitialAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
            return true;
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", th);
            zzbpb.zza(iObjectWrapper, th, "adapter.showRtbInterstitialAd");
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrd
    public final boolean zzt(IObjectWrapper iObjectWrapper) throws RemoteException {
        MediationRewardedAd mediationRewardedAd = this.zzc;
        if (mediationRewardedAd == null) {
            return false;
        }
        try {
            mediationRewardedAd.showAd((Context) ObjectWrapper.unwrap(iObjectWrapper));
            return true;
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", th);
            zzbpb.zza(iObjectWrapper, th, "adapter.showRtbRewardedAd");
            return true;
        }
    }
}
