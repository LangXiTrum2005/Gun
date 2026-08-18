package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzecl implements zzecm {
    public static /* synthetic */ zzecr zzc(String str, String str2, String str3, zzecn zzecnVar, String str4, WebView webView, String str5, String str6, zzeco zzecoVar) {
        zzflc zzflcVarZza = zzflc.zza("Google", str2);
        zzflb zzflbVarZzp = zzp("javascript");
        zzfku zzfkuVarZzn = zzn(zzecnVar.toString());
        zzflb zzflbVar = zzflb.NONE;
        if (zzflbVarZzp == zzflbVar) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzfkuVarZzn == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Omid html session error; Unable to parse creative type: ".concat(String.valueOf(zzecnVar)));
            return null;
        }
        zzflb zzflbVarZzp2 = zzp(str4);
        if (zzfkuVarZzn == zzfku.VIDEO && zzflbVarZzp2 == zzflbVar) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Omid html session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
            return null;
        }
        zzfkr zzfkrVarZzb = zzfkr.zzb(zzflcVarZza, webView, str5, "");
        return new zzecr(zzfkp.zza(zzfkq.zza(zzfkuVarZzn, zzo(zzecoVar.toString()), zzflbVarZzp, zzflbVarZzp2, true), zzfkrVarZzb), zzfkrVarZzb);
    }

    public static /* synthetic */ zzecr zzd(String str, String str2, String str3, String str4, zzecn zzecnVar, WebView webView, String str5, String str6, zzeco zzecoVar) {
        zzflc zzflcVarZza = zzflc.zza(str, str2);
        zzflb zzflbVarZzp = zzp("javascript");
        zzflb zzflbVarZzp2 = zzp(str4);
        zzfku zzfkuVarZzn = zzn(zzecnVar.toString());
        zzflb zzflbVar = zzflb.NONE;
        if (zzflbVarZzp == zzflbVar) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzfkuVarZzn == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Omid js session error; Unable to parse creative type: ".concat(String.valueOf(zzecnVar)));
            return null;
        }
        if (zzfkuVarZzn == zzfku.VIDEO && zzflbVarZzp2 == zzflbVar) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Omid js session error; Video events owner unknown for video creative: ".concat(String.valueOf(str4)));
            return null;
        }
        zzfkr zzfkrVarZzc = zzfkr.zzc(zzflcVarZza, webView, str5, "");
        return new zzecr(zzfkp.zza(zzfkq.zza(zzfkuVarZzn, zzo(zzecoVar.toString()), zzflbVarZzp, zzflbVarZzp2, true), zzfkrVarZzc), zzfkrVarZzc);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0034  */
    @Nullable
    private static zzfku zzn(String str) {
        byte b;
        int iHashCode = str.hashCode();
        if (iHashCode != -382745961) {
            if (iHashCode != 112202875) {
                if (iHashCode == 714893483 && str.equals("nativeDisplay")) {
                    b = 1;
                } else {
                    b = -1;
                }
            } else if (str.equals("video")) {
                b = 2;
            } else {
                b = -1;
            }
        } else if (str.equals("htmlDisplay")) {
            b = 0;
        } else {
            b = -1;
        }
        if (b == 0) {
            return zzfku.HTML_DISPLAY;
        }
        if (b == 1) {
            return zzfku.NATIVE_DISPLAY;
        }
        if (b != 2) {
            return null;
        }
        return zzfku.VIDEO;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0034  */
    private static zzfkx zzo(String str) {
        byte b;
        int iHashCode = str.hashCode();
        if (iHashCode != -1104128070) {
            if (iHashCode != 1318088141) {
                if (iHashCode == 1988248512 && str.equals("onePixel")) {
                    b = 2;
                } else {
                    b = -1;
                }
            } else if (str.equals("definedByJavascript")) {
                b = 1;
            } else {
                b = -1;
            }
        } else if (str.equals("beginToRender")) {
            b = 0;
        } else {
            b = -1;
        }
        if (b == 0) {
            return zzfkx.BEGIN_TO_RENDER;
        }
        if (b != 1) {
            return b != 2 ? zzfkx.UNSPECIFIED : zzfkx.ONE_PIXEL;
        }
        return zzfkx.DEFINED_BY_JAVASCRIPT;
    }

    private static zzflb zzp(@Nullable String str) {
        if ("native".equals(str)) {
            return zzflb.NATIVE;
        }
        return "javascript".equals(str) ? zzflb.JAVASCRIPT : zzflb.NONE;
    }

    @Nullable
    private static final Object zzq(zzeck zzeckVar) {
        try {
            return zzeckVar.zza();
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.zzv.zzp().zzv(e, "omid exception");
            return null;
        }
    }

    private static final void zzr(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.zzv.zzp().zzv(e, "omid exception");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzecm
    @Nullable
    public final zzecr zza(final String str, final WebView webView, String str2, String str3, @Nullable final String str4, final zzeco zzecoVar, final zzecn zzecnVar, @Nullable final String str5) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfc)).booleanValue() || !zzfkn.zzb()) {
            return null;
        }
        final String str6 = "javascript";
        final String str7 = "Google";
        final String str8 = "";
        return (zzecr) zzq(new zzeck(str7, str, str6, zzecnVar, str4, webView, str5, str8, zzecoVar) { // from class: com.google.android.gms.internal.ads.zzeca
            public final /* synthetic */ String zzb;
            public final /* synthetic */ zzecn zzd;
            public final /* synthetic */ String zze;
            public final /* synthetic */ WebView zzf;
            public final /* synthetic */ String zzg;
            public final /* synthetic */ zzeco zzi;
            public final /* synthetic */ String zza = "Google";
            public final /* synthetic */ String zzc = "javascript";
            public final /* synthetic */ String zzh = "";

            {
                this.zzb = str;
                this.zzd = zzecnVar;
                this.zze = str4;
                this.zzf = webView;
                this.zzg = str5;
                this.zzi = zzecoVar;
            }

            @Override // com.google.android.gms.internal.ads.zzeck
            public final Object zza() {
                return zzecl.zzc(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzecm
    @Nullable
    public final zzecr zzb(final String str, final WebView webView, String str2, String str3, @Nullable final String str4, final String str5, final zzeco zzecoVar, final zzecn zzecnVar, @Nullable final String str6) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfc)).booleanValue() || !zzfkn.zzb()) {
            return null;
        }
        final String str7 = "";
        final String str8 = "javascript";
        return (zzecr) zzq(new zzeck(str5, str, str8, str4, zzecnVar, webView, str6, str7, zzecoVar) { // from class: com.google.android.gms.internal.ads.zzecd
            public final /* synthetic */ String zza;
            public final /* synthetic */ String zzb;
            public final /* synthetic */ String zzd;
            public final /* synthetic */ zzecn zze;
            public final /* synthetic */ WebView zzf;
            public final /* synthetic */ String zzg;
            public final /* synthetic */ zzeco zzi;
            public final /* synthetic */ String zzc = "javascript";
            public final /* synthetic */ String zzh = "";

            {
                this.zzd = str4;
                this.zze = zzecnVar;
                this.zzf = webView;
                this.zzg = str6;
                this.zzi = zzecoVar;
            }

            @Override // com.google.android.gms.internal.ads.zzeck
            public final Object zza() {
                return zzecl.zzd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzecm
    @Nullable
    public final zzfla zze(final VersionInfoParcel versionInfoParcel, final WebView webView, boolean z) {
        final boolean z2 = true;
        return (zzfla) zzq(new zzeck(webView, z2) { // from class: com.google.android.gms.internal.ads.zzeci
            public final /* synthetic */ WebView zzb;

            @Override // com.google.android.gms.internal.ads.zzeck
            public final Object zza() {
                VersionInfoParcel versionInfoParcel2 = this.zza;
                return zzfla.zzb(zzflc.zza("Google", versionInfoParcel2.buddyApkVersion + "." + versionInfoParcel2.clientJarVersion), this.zzb, true);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzecm
    @Nullable
    public final String zzf(Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfc)).booleanValue()) {
            return (String) zzq(new zzeck() { // from class: com.google.android.gms.internal.ads.zzecg
                @Override // com.google.android.gms.internal.ads.zzeck
                public final Object zza() {
                    return "a.1.5.2-google_20241009";
                }
            });
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzecm
    public final void zzg(final zzfkp zzfkpVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzebz
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfc)).booleanValue() && zzfkn.zzb()) {
                    zzfkpVar.zzb(view, zzfkw.NOT_VISIBLE, "Ad overlay");
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzecm
    public final void zzh(final zzfla zzflaVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzecf
            @Override // java.lang.Runnable
            public final void run() {
                zzflaVar.zzf(view, zzfkw.NOT_VISIBLE, "Ad overlay");
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzecm
    public final void zzi(final zzfkp zzfkpVar) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzecj
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfc)).booleanValue() && zzfkn.zzb()) {
                    zzfkpVar.zzc();
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzecm
    public final void zzj(final zzfkp zzfkpVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzecb
            @Override // java.lang.Runnable
            public final void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfc)).booleanValue() && zzfkn.zzb()) {
                    zzfkpVar.zzd(view);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzecm
    public final void zzk(final zzfkp zzfkpVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfc)).booleanValue() && zzfkn.zzb()) {
            Objects.requireNonNull(zzfkpVar);
            zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzecc
                @Override // java.lang.Runnable
                public final void run() {
                    zzfkpVar.zze();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzecm
    public final boolean zzl(final Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfc)).booleanValue()) {
            Boolean bool = (Boolean) zzq(new zzeck() { // from class: com.google.android.gms.internal.ads.zzece
                @Override // com.google.android.gms.internal.ads.zzeck
                public final Object zza() {
                    if (zzfkn.zzb()) {
                        return Boolean.TRUE;
                    }
                    zzfkn.zza(context);
                    return Boolean.valueOf(zzfkn.zzb());
                }
            });
            return bool != null && bool.booleanValue();
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Omid flag is disabled");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzecm
    public final void zzm(final zzfla zzflaVar, final zzcfo zzcfoVar) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzech
            @Override // java.lang.Runnable
            public final void run() {
                zzflaVar.zzg(zzcfoVar);
            }
        });
    }
}
