package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.umeng.analytics.pro.bc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbjo {
    public static final zzbjp zza = new zzbjp() { // from class: com.google.android.gms.internal.ads.zzbim
        @Override // com.google.android.gms.internal.ads.zzbjp
        public final void zza(Object obj, Map map) {
            zzcge zzcgeVar = (zzcge) obj;
            zzbjp zzbjpVar = zzbjo.zza;
            String str = (String) map.get("urls");
            if (TextUtils.isEmpty(str)) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String[] strArrSplit = str.split(",");
            HashMap map2 = new HashMap();
            PackageManager packageManager = zzcgeVar.getContext().getPackageManager();
            for (String str2 : strArrSplit) {
                String[] strArrSplit2 = str2.split(";", 2);
                boolean z = true;
                if (packageManager.resolveActivity(new Intent(strArrSplit2.length > 1 ? strArrSplit2[1].trim() : "android.intent.action.VIEW", Uri.parse(strArrSplit2[0].trim())), 65536) == null) {
                    z = false;
                }
                Boolean boolValueOf = Boolean.valueOf(z);
                map2.put(str2, boolValueOf);
                com.google.android.gms.ads.internal.util.zze.zza("/canOpenURLs;" + str2 + ";" + boolValueOf);
            }
            ((zzbmk) zzcgeVar).zzd("openableURLs", map2);
        }
    };
    public static final zzbjp zzb = new zzbjp() { // from class: com.google.android.gms.internal.ads.zzbio
        @Override // com.google.android.gms.internal.ads.zzbjp
        public final void zza(Object obj, Map map) {
            zzcge zzcgeVar = (zzcge) obj;
            zzbjp zzbjpVar = zzbjo.zza;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzid)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("canOpenAppGmsgHandler disabled.");
                return;
            }
            String str = (String) map.get("package_name");
            if (TextUtils.isEmpty(str)) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Package name missing in canOpenApp GMSG.");
                return;
            }
            HashMap map2 = new HashMap();
            Boolean boolValueOf = Boolean.valueOf(zzcgeVar.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
            map2.put(str, boolValueOf);
            com.google.android.gms.ads.internal.util.zze.zza("/canOpenApp;" + str + ";" + boolValueOf);
            ((zzbmk) zzcgeVar).zzd("openableApp", map2);
        }
    };
    public static final zzbjp zzc = new zzbjp() { // from class: com.google.android.gms.internal.ads.zzbir
        @Override // com.google.android.gms.internal.ads.zzbjp
        public final void zza(Object obj, Map map) {
            zzbjo.zzb((zzcge) obj, map);
        }
    };
    public static final zzbjp zzd = new zzbjg();
    public static final zzbjp zze = new zzbjh();
    public static final zzbjp zzf = new zzbjp() { // from class: com.google.android.gms.internal.ads.zzbis
        @Override // com.google.android.gms.internal.ads.zzbjp
        public final void zza(Object obj, Map map) {
            zzcge zzcgeVar = (zzcge) obj;
            zzbjp zzbjpVar = zzbjo.zza;
            String str = (String) map.get(bc.aN);
            if (str == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("URL missing from httpTrack GMSG.");
            } else {
                zzceo zzceoVar = (zzceo) zzcgeVar;
                new com.google.android.gms.ads.internal.util.zzbw(zzcgeVar.getContext(), ((zzcgl) zzcgeVar).zzn().afmaVersion, str, null, zzceoVar.zzD() != null ? zzceoVar.zzD().zzax : null).zzb();
            }
        }
    };
    public static final zzbjp zzg = new zzbji();
    public static final zzbjp zzh = new zzbjj();
    public static final zzbjp zzi = new zzbjp() { // from class: com.google.android.gms.internal.ads.zzbip
        @Override // com.google.android.gms.internal.ads.zzbjp
        public final void zza(Object obj, Map map) {
            zzcgk zzcgkVar = (zzcgk) obj;
            zzbjp zzbjpVar = zzbjo.zza;
            String str = (String) map.get("tx");
            String str2 = (String) map.get("ty");
            String str3 = (String) map.get("td");
            try {
                int i = Integer.parseInt(str);
                int i2 = Integer.parseInt(str2);
                int i3 = Integer.parseInt(str3);
                zzava zzavaVarZzI = zzcgkVar.zzI();
                if (zzavaVarZzI != null) {
                    zzavaVarZzI.zzc().zzl(i, i2, i3);
                }
            } catch (NumberFormatException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not parse touch parameters from gmsg.");
            }
        }
    };
    public static final zzbjp zzj = new zzbjk();
    public static final zzbjp zzk = new zzbjl();
    public static final zzbjp zzl = new zzccs();
    public static final zzbjp zzm = new zzcct();
    public static final zzbjp zzn = new zzbii();
    public static final zzbkf zzo = new zzbkf();
    public static final zzbjp zzp = new zzbjm();
    public static final zzbjp zzq = new zzbjn();
    public static final zzbjp zzr = new zzbit();
    public static final zzbjp zzs = new zzbiu();
    public static final zzbjp zzt = new zzbiv();
    public static final zzbjp zzu = new zzbiw();
    public static final zzbjp zzv = new zzbix();
    public static final zzbjp zzw = new zzbiy();
    public static final zzbjp zzx = new zzbiz();
    public static final zzbjp zzy = new zzbja();
    public static final zzbjp zzz = new zzbjb();
    public static final zzbjp zzA = new zzbjc();
    public static final zzbjp zzB = new zzbje();
    public static final zzbjp zzC = new zzbjf();

    public static AI zza(zzcex zzcexVar, String str) {
        Uri uriZza = Uri.parse(str);
        try {
            zzava zzavaVarZzI = zzcexVar.zzI();
            zzfcn zzfcnVarZzS = zzcexVar.zzS();
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzlR)).booleanValue() || zzfcnVarZzS == null) {
                if (zzavaVarZzI != null && zzavaVarZzI.zzf(uriZza)) {
                    uriZza = zzavaVarZzI.zza(uriZza, zzcexVar.getContext(), zzcexVar.zzF(), zzcexVar.zzi());
                }
            } else if (zzavaVarZzI != null && zzavaVarZzI.zzf(uriZza)) {
                uriZza = zzfcnVarZzS.zza(uriZza, zzcexVar.getContext(), zzcexVar.zzF(), zzcexVar.zzi());
            }
        } catch (zzavb unused) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Unable to append parameter to URL: ".concat(str));
        }
        Map map = new HashMap();
        if (zzcexVar.zzD() != null) {
            map = zzcexVar.zzD().zzaw;
        }
        final String strZzb = zzbyk.zzb(uriZza, zzcexVar.getContext(), map);
        long jLongValue = ((Long) zzbek.zze.zze()).longValue();
        if (jLongValue <= 0 || jLongValue > 244410203) {
            return zzgch.zzh(strZzb);
        }
        zzgby zzgbyVarZzu = zzgby.zzu(zzcexVar.zzT());
        zzfuc zzfucVar = new zzfuc() { // from class: com.google.android.gms.internal.ads.zzbij
            @Override // com.google.android.gms.internal.ads.zzfuc
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                zzbjp zzbjpVar = zzbjo.zza;
                if (!((Boolean) zzbek.zzi.zze()).booleanValue()) {
                    return "failure_click_attok";
                }
                com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "prepareClickUrl.attestation1");
                return "failure_click_attok";
            }
        };
        zzgcs zzgcsVar = zzbzw.zzg;
        return (zzgby) zzgch.zze((zzgby) zzgch.zzm((zzgby) zzgch.zze(zzgbyVarZzu, Throwable.class, zzfucVar, zzgcsVar), new zzfuc() { // from class: com.google.android.gms.internal.ads.zzbik
            /* JADX WARN: Code duplicated, block: B:16:0x004f  */
            /* JADX WARN: Code duplicated, block: B:19:0x0059  */
            /* JADX WARN: Code duplicated, block: B:21:0x0067  */
            @Override // com.google.android.gms.internal.ads.zzfuc
            public final Object apply(Object obj) {
                String str2;
                String str3;
                Uri uri;
                String str4 = (String) obj;
                zzbjp zzbjpVar = zzbjo.zza;
                String strReplace = strZzb;
                if (str4 != null) {
                    if (((Boolean) zzbek.zzf.zze()).booleanValue()) {
                        String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                        String host = Uri.parse(strReplace).getHost();
                        for (int i = 0; i < 3; i++) {
                            if (host.endsWith(strArr[i])) {
                                str2 = (String) zzbek.zza.zze();
                                str3 = (String) zzbek.zzb.zze();
                                if (!TextUtils.isEmpty(str2)) {
                                    strReplace = strReplace.replace(str2, str4);
                                }
                                if (!TextUtils.isEmpty(str3)) {
                                    uri = Uri.parse(strReplace);
                                    if (!TextUtils.isEmpty(uri.getQueryParameter(str3))) {
                                        break;
                                    }
                                    return uri.buildUpon().appendQueryParameter(str3, str4).toString();
                                }
                                break;
                            }
                        }
                    } else {
                        str2 = (String) zzbek.zza.zze();
                        str3 = (String) zzbek.zzb.zze();
                        if (!TextUtils.isEmpty(str2)) {
                            strReplace = strReplace.replace(str2, str4);
                        }
                        if (!TextUtils.isEmpty(str3)) {
                            uri = Uri.parse(strReplace);
                            if (!TextUtils.isEmpty(uri.getQueryParameter(str3))) {
                                return uri.buildUpon().appendQueryParameter(str3, str4).toString();
                            }
                        }
                    }
                }
                return strReplace;
            }
        }, zzgcsVar), Throwable.class, new zzfuc() { // from class: com.google.android.gms.internal.ads.zzbil
            @Override // com.google.android.gms.internal.ads.zzfuc
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                zzbjp zzbjpVar = zzbjo.zza;
                if (((Boolean) zzbek.zzi.zze()).booleanValue()) {
                    com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "prepareClickUrl.attestation2");
                }
                return strZzb;
            }
        }, zzgcsVar);
    }

    public static /* synthetic */ void zzb(zzcge zzcgeVar, Map map) {
        Intent uri;
        PackageManager packageManager = zzcgeVar.getContext().getPackageManager();
        try {
            try {
                JSONArray jSONArray = new JSONObject((String) map.get("data")).getJSONArray("intents");
                JSONObject jSONObject = new JSONObject();
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        String strOptString = jSONObject2.optString("id");
                        String strOptString2 = jSONObject2.optString(bc.aN);
                        String strOptString3 = jSONObject2.optString(bc.aI);
                        String strOptString4 = jSONObject2.optString("m");
                        String strOptString5 = jSONObject2.optString("p");
                        String strOptString6 = jSONObject2.optString(bc.aL);
                        String strOptString7 = jSONObject2.optString("intent_url");
                        ResolveInfo resolveInfoResolveActivity = null;
                        if (TextUtils.isEmpty(strOptString7)) {
                            uri = null;
                        } else {
                            try {
                                uri = Intent.parseUri(strOptString7, 0);
                            } catch (URISyntaxException e) {
                                com.google.android.gms.ads.internal.util.client.zzo.zzh("Error parsing the url: ".concat(String.valueOf(strOptString7)), e);
                                uri = null;
                            }
                        }
                        if (uri == null) {
                            uri = new Intent();
                            if (!TextUtils.isEmpty(strOptString2)) {
                                uri.setData(Uri.parse(strOptString2));
                            }
                            if (!TextUtils.isEmpty(strOptString3)) {
                                uri.setAction(strOptString3);
                            }
                            if (!TextUtils.isEmpty(strOptString4)) {
                                uri.setType(strOptString4);
                            }
                            if (!TextUtils.isEmpty(strOptString5)) {
                                uri.setPackage(strOptString5);
                            }
                            if (!TextUtils.isEmpty(strOptString6)) {
                                String[] strArrSplit = strOptString6.split("/", 2);
                                if (strArrSplit.length == 2) {
                                    uri.setComponent(new ComponentName(strArrSplit[0], strArrSplit[1]));
                                }
                            }
                        }
                        Intent intent = uri;
                        try {
                            resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
                        } catch (NullPointerException e2) {
                            com.google.android.gms.ads.internal.zzv.zzp().zzw(e2, intent.toString());
                        }
                        try {
                            jSONObject.put(strOptString, resolveInfoResolveActivity != null);
                        } catch (JSONException e3) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error constructing openable urls response.", e3);
                        }
                    } catch (JSONException e4) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("Error parsing the intent data.", e4);
                    }
                }
                ((zzbmk) zzcgeVar).zze("openableIntents", jSONObject);
            } catch (JSONException unused) {
                ((zzbmk) zzcgeVar).zze("openableIntents", new JSONObject());
            }
        } catch (JSONException unused2) {
            ((zzbmk) zzcgeVar).zze("openableIntents", new JSONObject());
        }
    }

    public static void zzc(Map map, zzdds zzddsVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkD)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && zzddsVar != null) {
            zzddsVar.zzdd();
        }
    }
}
