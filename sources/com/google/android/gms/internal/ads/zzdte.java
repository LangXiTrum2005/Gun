package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.JsonReader;
import com.google.android.gms.ads.RequestConfiguration;
import com.umeng.ccg.a;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdte extends zzbkq {
    private final zzdth zza;
    private final zzdtc zzb;
    private final Map zzc = new HashMap();

    public zzdte(zzdth zzdthVar, zzdtc zzdtcVar) {
        this.zza = zzdthVar;
        this.zzb = zzdtcVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:35:0x0081  */
    private static com.google.android.gms.ads.internal.client.zzm zzc(Map map) {
        com.google.android.gms.ads.internal.client.zzn zznVar = new com.google.android.gms.ads.internal.client.zzn();
        String str = (String) map.get("ad_request");
        if (str == null) {
            return zznVar.zza();
        }
        JsonReader jsonReader = new JsonReader(new StringReader(Uri.decode(str)));
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                switch (jsonReader.nextName()) {
                    case "extras":
                        jsonReader.beginObject();
                        Bundle bundle = new Bundle();
                        while (jsonReader.hasNext()) {
                            bundle.putString(jsonReader.nextName(), jsonReader.nextString());
                        }
                        jsonReader.endObject();
                        zznVar.zzb(bundle);
                        break;
                    case "keywords":
                        jsonReader.beginArray();
                        ArrayList arrayList = new ArrayList();
                        while (jsonReader.hasNext()) {
                            arrayList.add(jsonReader.nextString());
                        }
                        jsonReader.endArray();
                        zznVar.zze(arrayList);
                        break;
                    case "isTestDevice":
                        zznVar.zzd(jsonReader.nextBoolean());
                        break;
                    case "tagForChildDirectedTreatment":
                        if (!jsonReader.nextBoolean()) {
                            zznVar.zzh(0);
                            break;
                        } else {
                            zznVar.zzh(1);
                            break;
                        }
                        break;
                    case "tagForUnderAgeOfConsent":
                        if (!jsonReader.nextBoolean()) {
                            zznVar.zzi(0);
                            break;
                        } else {
                            zznVar.zzi(1);
                            break;
                        }
                        break;
                    case "maxAdContentRating":
                        String strNextString = jsonReader.nextString();
                        if (!RequestConfiguration.zza.contains(strNextString)) {
                            break;
                        } else {
                            zznVar.zzf(strNextString);
                            break;
                        }
                        break;
                    case "httpTimeoutMillis":
                        zznVar.zzc(jsonReader.nextInt());
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
        } catch (IOException unused) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("Ad Request json was malformed, parsing ended early.");
        }
        com.google.android.gms.ads.internal.client.zzm zzmVarZza = zznVar.zza();
        Bundle bundle2 = zzmVarZza.zzm.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle2 == null) {
            bundle2 = zzmVarZza.zzc;
            zzmVarZza.zzm.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle2);
        }
        return new com.google.android.gms.ads.internal.client.zzm(zzmVarZza.zza, zzmVarZza.zzb, bundle2, zzmVarZza.zzd, zzmVarZza.zze, zzmVarZza.zzf, zzmVarZza.zzg, zzmVarZza.zzh, zzmVarZza.zzi, zzmVarZza.zzj, zzmVarZza.zzk, zzmVarZza.zzl, zzmVarZza.zzm, zzmVarZza.zzn, zzmVarZza.zzo, zzmVarZza.zzp, zzmVarZza.zzq, zzmVarZza.zzr, zzmVarZza.zzs, zzmVarZza.zzt, zzmVarZza.zzu, zzmVarZza.zzv, zzmVarZza.zzw, zzmVarZza.zzx, zzmVarZza.zzy, zzmVarZza.zzz);
    }

    @Override // com.google.android.gms.internal.ads.zzbkr
    public final void zze() {
        this.zzc.clear();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0065  */
    @Override // com.google.android.gms.internal.ads.zzbkr
    public final void zzf(String str) throws RemoteException {
        byte b;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjN)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zza("Received H5 gmsg: ".concat(String.valueOf(str)));
            Uri uri = Uri.parse(str);
            com.google.android.gms.ads.internal.zzv.zzq();
            Map mapZzP = com.google.android.gms.ads.internal.util.zzs.zzP(uri);
            String str2 = (String) mapZzP.get(a.w);
            if (TextUtils.isEmpty(str2)) {
                com.google.android.gms.ads.internal.util.client.zzo.zze("H5 gmsg did not contain an action");
                return;
            }
            int iHashCode = str2.hashCode();
            if (iHashCode != 579053441) {
                if (iHashCode == 871091088 && str2.equals(MobileAdsBridgeBase.initializeMethodName)) {
                    b = 0;
                } else {
                    b = -1;
                }
            } else if (str2.equals("dispose_all")) {
                b = 1;
            } else {
                b = -1;
            }
            if (b == 0) {
                this.zzc.clear();
                this.zzb.zza();
                return;
            }
            if (b == 1) {
                Iterator it = this.zzc.values().iterator();
                while (it.hasNext()) {
                    ((zzdsx) it.next()).zza();
                }
                this.zzc.clear();
                return;
            }
            String str3 = (String) mapZzP.get("obj_id");
            try {
                Objects.requireNonNull(str3);
                long j = Long.parseLong(str3);
                switch (str2) {
                    case "create_interstitial_ad":
                        if (this.zzc.size() >= ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjO)).intValue()) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not create H5 ad, too many existing objects");
                            this.zzb.zzi(j);
                            break;
                        } else {
                            Map map = this.zzc;
                            Long lValueOf = Long.valueOf(j);
                            if (!map.containsKey(lValueOf)) {
                                String str4 = (String) mapZzP.get("ad_unit");
                                if (!TextUtils.isEmpty(str4)) {
                                    zzdsy zzdsyVarZzb = this.zza.zzb();
                                    zzdsyVarZzb.zzb(j);
                                    zzdsyVarZzb.zza(str4);
                                    this.zzc.put(lValueOf, zzdsyVarZzb.zzc().zza());
                                    this.zzb.zzh(j);
                                    com.google.android.gms.ads.internal.util.zze.zza("Created H5 interstitial #" + j + " with ad unit " + str4);
                                } else {
                                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not create H5 ad, missing ad unit id");
                                    this.zzb.zzi(j);
                                }
                            } else {
                                com.google.android.gms.ads.internal.util.client.zzo.zze("Could not create H5 ad, object ID already exists");
                                this.zzb.zzi(j);
                            }
                            break;
                        }
                        break;
                    case "load_interstitial_ad":
                        zzdsx zzdsxVar = (zzdsx) this.zzc.get(Long.valueOf(j));
                        if (zzdsxVar == null) {
                            com.google.android.gms.ads.internal.util.client.zzo.zze("Could not load H5 ad, object ID does not exist");
                            this.zzb.zzf(j);
                            break;
                        } else {
                            zzdsxVar.zzb(zzc(mapZzP));
                            break;
                        }
                        break;
                    case "show_interstitial_ad":
                        zzdsx zzdsxVar2 = (zzdsx) this.zzc.get(Long.valueOf(j));
                        if (zzdsxVar2 == null) {
                            com.google.android.gms.ads.internal.util.client.zzo.zze("Could not show H5 ad, object ID does not exist");
                            this.zzb.zzf(j);
                            break;
                        } else {
                            zzdsxVar2.zzc();
                            break;
                        }
                        break;
                    case "create_rewarded_ad":
                        if (this.zzc.size() >= ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjO)).intValue()) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not create H5 ad, too many existing objects");
                            this.zzb.zzi(j);
                            break;
                        } else {
                            Map map2 = this.zzc;
                            Long lValueOf2 = Long.valueOf(j);
                            if (!map2.containsKey(lValueOf2)) {
                                String str5 = (String) mapZzP.get("ad_unit");
                                if (!TextUtils.isEmpty(str5)) {
                                    zzdsy zzdsyVarZzb2 = this.zza.zzb();
                                    zzdsyVarZzb2.zzb(j);
                                    zzdsyVarZzb2.zza(str5);
                                    this.zzc.put(lValueOf2, zzdsyVarZzb2.zzc().zzb());
                                    this.zzb.zzh(j);
                                    com.google.android.gms.ads.internal.util.zze.zza("Created H5 rewarded #" + j + " with ad unit " + str5);
                                } else {
                                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not create H5 ad, missing ad unit id");
                                    this.zzb.zzi(j);
                                }
                            } else {
                                com.google.android.gms.ads.internal.util.client.zzo.zze("Could not create H5 ad, object ID already exists");
                                this.zzb.zzi(j);
                            }
                            break;
                        }
                        break;
                    case "load_rewarded_ad":
                        zzdsx zzdsxVar3 = (zzdsx) this.zzc.get(Long.valueOf(j));
                        if (zzdsxVar3 == null) {
                            com.google.android.gms.ads.internal.util.client.zzo.zze("Could not load H5 ad, object ID does not exist");
                            this.zzb.zzq(j);
                            break;
                        } else {
                            zzdsxVar3.zzb(zzc(mapZzP));
                            break;
                        }
                        break;
                    case "show_rewarded_ad":
                        zzdsx zzdsxVar4 = (zzdsx) this.zzc.get(Long.valueOf(j));
                        if (zzdsxVar4 == null) {
                            com.google.android.gms.ads.internal.util.client.zzo.zze("Could not show H5 ad, object ID does not exist");
                            this.zzb.zzq(j);
                            break;
                        } else {
                            zzdsxVar4.zzc();
                            break;
                        }
                        break;
                    case "dispose":
                        Map map3 = this.zzc;
                        Long lValueOf3 = Long.valueOf(j);
                        zzdsx zzdsxVar5 = (zzdsx) map3.get(lValueOf3);
                        if (zzdsxVar5 == null) {
                            com.google.android.gms.ads.internal.util.client.zzo.zze("Could not dispose H5 ad, object ID does not exist");
                            break;
                        } else {
                            zzdsxVar5.zza();
                            this.zzc.remove(lValueOf3);
                            com.google.android.gms.ads.internal.util.zze.zza("Disposed H5 ad #" + j);
                            break;
                        }
                        break;
                    default:
                        com.google.android.gms.ads.internal.util.client.zzo.zze("H5 gmsg contained invalid action: ".concat(str2));
                        break;
                }
            } catch (NullPointerException | NumberFormatException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zze("H5 gmsg did not contain a valid object id: ".concat(String.valueOf(str3)));
            }
        }
    }
}
