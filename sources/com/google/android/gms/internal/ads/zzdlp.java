package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdlp {
    private final Context zza;
    private final zzdkt zzb;
    private final zzava zzc;
    private final VersionInfoParcel zzd;
    private final com.google.android.gms.ads.internal.zza zze;
    private final zzbbj zzf;
    private final Executor zzg;
    private final zzbfl zzh;
    private final zzdmh zzi;
    private final zzdow zzj;
    private final ScheduledExecutorService zzk;
    private final zzdnr zzl;
    private final zzdrw zzm;
    private final zzfja zzn;
    private final zzebk zzo;
    private final zzebv zzp;
    private final zzfcn zzq;

    public zzdlp(Context context, zzdkt zzdktVar, zzava zzavaVar, VersionInfoParcel versionInfoParcel, com.google.android.gms.ads.internal.zza zzaVar, zzbbj zzbbjVar, Executor executor, zzfcj zzfcjVar, zzdmh zzdmhVar, zzdow zzdowVar, ScheduledExecutorService scheduledExecutorService, zzdrw zzdrwVar, zzfja zzfjaVar, zzebk zzebkVar, zzdnr zzdnrVar, zzebv zzebvVar, zzfcn zzfcnVar) {
        this.zza = context;
        this.zzb = zzdktVar;
        this.zzc = zzavaVar;
        this.zzd = versionInfoParcel;
        this.zze = zzaVar;
        this.zzf = zzbbjVar;
        this.zzg = executor;
        this.zzh = zzfcjVar.zzi;
        this.zzi = zzdmhVar;
        this.zzj = zzdowVar;
        this.zzk = scheduledExecutorService;
        this.zzm = zzdrwVar;
        this.zzn = zzfjaVar;
        this.zzo = zzebkVar;
        this.zzl = zzdnrVar;
        this.zzp = zzebvVar;
        this.zzq = zzfcnVar;
    }

    @Nullable
    public static final com.google.android.gms.ads.internal.client.zzez zzi(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(CampaignEx.JSON_NATIVE_VIDEO_MUTE);
        if (jSONObjectOptJSONObject2 == null || (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return zzr(jSONObjectOptJSONObject);
    }

    public static final List zzj(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(CampaignEx.JSON_NATIVE_VIDEO_MUTE);
        if (jSONObjectOptJSONObject == null) {
            return zzfxn.zzn();
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("reasons");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return zzfxn.zzn();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            com.google.android.gms.ads.internal.client.zzez zzezVarZzr = zzr(jSONArrayOptJSONArray.optJSONObject(i));
            if (zzezVarZzr != null) {
                arrayList.add(zzezVarZzr);
            }
        }
        return zzfxn.zzl(arrayList);
    }

    private final com.google.android.gms.ads.internal.client.zzs zzk(int i, int i2) {
        if (i == 0) {
            if (i2 == 0) {
                return com.google.android.gms.ads.internal.client.zzs.zzc();
            }
            i = 0;
        }
        return new com.google.android.gms.ads.internal.client.zzs(this.zza, new AdSize(i, i2));
    }

    private static AI zzl(AI ai, Object obj) {
        final Object obj2 = null;
        return zzgch.zzf(ai, Exception.class, new zzgbo(obj2) { // from class: com.google.android.gms.internal.ads.zzdlk
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final AI zza(Object obj3) {
                com.google.android.gms.ads.internal.util.zze.zzb("Error during loading assets.", (Exception) obj3);
                return zzgch.zzh(null);
            }
        }, zzbzw.zzg);
    }

    private static AI zzm(boolean z, final AI ai, Object obj) {
        return z ? zzgch.zzn(ai, new zzgbo() { // from class: com.google.android.gms.internal.ads.zzdll
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final AI zza(Object obj2) {
                return obj2 != null ? ai : zzgch.zzg(new zzegu(1, "Retrieve required value in native ad response failed."));
            }
        }, zzbzw.zzg) : zzl(ai, null);
    }

    private final AI zzn(@Nullable JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return zzgch.zzh(null);
        }
        final String strOptString = jSONObject.optString("url");
        if (TextUtils.isEmpty(strOptString)) {
            return zzgch.zzh(null);
        }
        final double dOptDouble = jSONObject.optDouble("scale", 1.0d);
        boolean zOptBoolean = jSONObject.optBoolean("is_transparent", true);
        final int iOptInt = jSONObject.optInt("width", -1);
        final int iOptInt2 = jSONObject.optInt("height", -1);
        if (z) {
            return zzgch.zzh(new zzbfj(null, Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2));
        }
        return zzm(jSONObject.optBoolean("require"), zzgch.zzm(this.zzb.zzb(strOptString, dOptDouble, zOptBoolean), new zzfuc() { // from class: com.google.android.gms.internal.ads.zzdld
            @Override // com.google.android.gms.internal.ads.zzfuc
            public final Object apply(Object obj) {
                return new zzbfj(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2);
            }
        }, this.zzg), null);
    }

    private final AI zzo(@Nullable JSONArray jSONArray, boolean z, boolean z2) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return zzgch.zzh(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = z2 ? jSONArray.length() : 1;
        for (int i = 0; i < length; i++) {
            arrayList.add(zzn(jSONArray.optJSONObject(i), z));
        }
        return zzgch.zzm(zzgch.zzd(arrayList), new zzfuc() { // from class: com.google.android.gms.internal.ads.zzdli
            @Override // com.google.android.gms.internal.ads.zzfuc
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (zzbfj zzbfjVar : (List) obj) {
                    if (zzbfjVar != null) {
                        arrayList2.add(zzbfjVar);
                    }
                }
                return arrayList2;
            }
        }, this.zzg);
    }

    private final AI zzp(JSONObject jSONObject, zzfbo zzfboVar, zzfbr zzfbrVar) {
        final AI aiZzb = this.zzi.zzb(jSONObject.optString("base_url"), jSONObject.optString("html"), zzfboVar, zzfbrVar, zzk(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)));
        return zzgch.zzn(aiZzb, new zzgbo() { // from class: com.google.android.gms.internal.ads.zzdlf
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final AI zza(Object obj) throws zzegu {
                zzcex zzcexVar = (zzcex) obj;
                if (zzcexVar == null || zzcexVar.zzq() == null) {
                    throw new zzegu(1, "Retrieve video view in html5 ad response failed.");
                }
                return aiZzb;
            }
        }, zzbzw.zzg);
    }

    @Nullable
    private static Integer zzq(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B)));
        } catch (JSONException unused) {
            return null;
        }
    }

    @Nullable
    private static final com.google.android.gms.ads.internal.client.zzez zzr(@Nullable JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("reason");
        String strOptString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
            return null;
        }
        return new com.google.android.gms.ads.internal.client.zzez(strOptString, strOptString2);
    }

    public final /* synthetic */ zzbfg zza(JSONObject jSONObject, List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String strOptString = jSONObject.optString(MimeTypes.BASE_TYPE_TEXT);
        Integer numZzq = zzq(jSONObject, "bg_color");
        Integer numZzq2 = zzq(jSONObject, "text_color");
        int iOptInt = jSONObject.optInt("text_size", -1);
        boolean zOptBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int iOptInt2 = jSONObject.optInt("animation_ms", 1000);
        return new zzbfg(strOptString, list, numZzq, numZzq2, iOptInt > 0 ? Integer.valueOf(iOptInt) : null, jSONObject.optInt("presentation_ms", 4000) + iOptInt2, this.zzh.zze, zOptBoolean);
    }

    public final /* synthetic */ AI zzb(com.google.android.gms.ads.internal.client.zzs zzsVar, zzfbo zzfboVar, zzfbr zzfbrVar, String str, String str2, Object obj) throws Exception {
        zzcex zzcexVarZza = this.zzj.zza(zzsVar, zzfboVar, zzfbrVar);
        final zzcaa zzcaaVarZza = zzcaa.zza(zzcexVarZza);
        zzdno zzdnoVarZzb = this.zzl.zzb();
        zzcexVarZza.zzN().zzV(zzdnoVarZzb, zzdnoVarZzb, zzdnoVarZzb, zzdnoVarZzb, zzdnoVarZzb, false, null, new com.google.android.gms.ads.internal.zzb(this.zza, null, null), null, null, this.zzo, this.zzn, this.zzm, null, zzdnoVarZzb, null, null, null, null);
        zzcexVarZza.zzag("/getNativeAdViewSignals", zzbjo.zzs);
        zzcexVarZza.zzag("/getNativeClickMeta", zzbjo.zzt);
        zzcexVarZza.zzN().zzF(true);
        zzcexVarZza.zzN().zzC(new zzcgn() { // from class: com.google.android.gms.internal.ads.zzdlm
            @Override // com.google.android.gms.internal.ads.zzcgn
            public final void zza(boolean z, int i, String str3, String str4) {
                zzcaa zzcaaVar = zzcaaVarZza;
                if (z) {
                    zzcaaVar.zzb();
                    return;
                }
                zzcaaVar.zzd(new zzegu(1, "Image Web View failed to load. Error code: " + i + ", Description: " + str3 + ", Failing URL: " + str4));
            }
        });
        zzcexVarZza.zzae(str, str2, null);
        return zzcaaVarZza;
    }

    public final /* synthetic */ AI zzc(String str, Object obj) throws Exception {
        com.google.android.gms.ads.internal.zzv.zzA();
        zzcex zzcexVarZza = zzcfk.zza(this.zza, zzcgr.zza(), "native-omid", false, false, this.zzc, null, this.zzd, null, null, this.zze, this.zzf, null, null, this.zzp, this.zzq);
        final zzcaa zzcaaVarZza = zzcaa.zza(zzcexVarZza);
        zzcexVarZza.zzN().zzC(new zzcgn() { // from class: com.google.android.gms.internal.ads.zzdlc
            @Override // com.google.android.gms.internal.ads.zzcgn
            public final void zza(boolean z, int i, String str2, String str3) {
                zzcaaVarZza.zzb();
            }
        });
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfi)).booleanValue()) {
            zzcexVarZza.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        } else {
            zzcexVarZza.loadData(str, "text/html", C.UTF8_NAME);
        }
        return zzcaaVarZza;
    }

    public final AI zzd(JSONObject jSONObject, String str) {
        final JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("attribution");
        if (jSONObjectOptJSONObject == null) {
            return zzgch.zzh(null);
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("images");
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("image");
        if (jSONArrayOptJSONArray == null && jSONObjectOptJSONObject2 != null) {
            jSONArrayOptJSONArray = new JSONArray();
            jSONArrayOptJSONArray.put(jSONObjectOptJSONObject2);
        }
        return zzm(jSONObjectOptJSONObject.optBoolean("require"), zzgch.zzm(zzo(jSONArrayOptJSONArray, false, true), new zzfuc() { // from class: com.google.android.gms.internal.ads.zzdlj
            @Override // com.google.android.gms.internal.ads.zzfuc
            public final Object apply(Object obj) {
                return this.zza.zza(jSONObjectOptJSONObject, (List) obj);
            }
        }, this.zzg), null);
    }

    public final AI zze(JSONObject jSONObject, String str) {
        return zzn(jSONObject.optJSONObject(str), this.zzh.zzb);
    }

    public final AI zzf(JSONObject jSONObject, String str) {
        zzbfl zzbflVar = this.zzh;
        return zzo(jSONObject.optJSONArray("images"), zzbflVar.zzb, zzbflVar.zzd);
    }

    public final AI zzg(JSONObject jSONObject, String str, final zzfbo zzfboVar, final zzfbr zzfbrVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjS)).booleanValue()) {
            return zzgch.zzh(null);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("images");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return zzgch.zzh(null);
        }
        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0);
        if (jSONObjectOptJSONObject == null) {
            return zzgch.zzh(null);
        }
        final String strOptString = jSONObjectOptJSONObject.optString("base_url");
        final String strOptString2 = jSONObjectOptJSONObject.optString("html");
        final com.google.android.gms.ads.internal.client.zzs zzsVarZzk = zzk(jSONObjectOptJSONObject.optInt("width", 0), jSONObjectOptJSONObject.optInt("height", 0));
        if (TextUtils.isEmpty(strOptString2)) {
            return zzgch.zzh(null);
        }
        final AI aiZzn = zzgch.zzn(zzgch.zzh(null), new zzgbo() { // from class: com.google.android.gms.internal.ads.zzdlg
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final AI zza(Object obj) {
                return this.zza.zzb(zzsVarZzk, zzfboVar, zzfbrVar, strOptString, strOptString2, obj);
            }
        }, zzbzw.zzf);
        return zzgch.zzn(aiZzn, new zzgbo() { // from class: com.google.android.gms.internal.ads.zzdlh
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final AI zza(Object obj) throws zzegu {
                if (((zzcex) obj) != null) {
                    return aiZzn;
                }
                throw new zzegu(1, "Retrieve Web View from image ad response failed.");
            }
        }, zzbzw.zzg);
    }

    public final AI zzh(JSONObject jSONObject, zzfbo zzfboVar, zzfbr zzfbrVar) {
        AI aiZza;
        JSONObject jSONObjectZzh = com.google.android.gms.ads.internal.util.zzbs.zzh(jSONObject, "html_containers", "instream");
        if (jSONObjectZzh != null) {
            return zzp(jSONObjectZzh, zzfboVar, zzfbrVar);
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("video");
        if (jSONObjectOptJSONObject == null) {
            return zzgch.zzh(null);
        }
        String strOptString = jSONObjectOptJSONObject.optString("vast_xml");
        boolean z = false;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjR)).booleanValue() && jSONObjectOptJSONObject.has("html")) {
            z = true;
        }
        if (!TextUtils.isEmpty(strOptString)) {
            if (!z) {
                aiZza = this.zzi.zza(jSONObjectOptJSONObject);
            }
            return zzl(zzgch.zzo(aiZza, ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdS)).intValue(), TimeUnit.SECONDS, this.zzk), null);
        }
        if (!z) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Required field 'vast_xml' or 'html' is missing");
            return zzgch.zzh(null);
        }
        aiZza = zzp(jSONObjectOptJSONObject, zzfboVar, zzfbrVar);
        return zzl(zzgch.zzo(aiZza, ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdS)).intValue(), TimeUnit.SECONDS, this.zzk), null);
    }
}
