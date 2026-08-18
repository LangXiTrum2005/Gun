package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.badlogic.gdx.net.HttpRequestHeader;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdzs implements zzffr {
    private static final Pattern zza = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);
    private final String zzb;
    private final zzfgw zzc;
    private final zzfhh zzd;

    public zzdzs(String str, zzfhh zzfhhVar, zzfgw zzfgwVar) {
        this.zzb = str;
        this.zzd = zzfhhVar;
        this.zzc = zzfgwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzffr
    public final /* bridge */ /* synthetic */ Object zza(Object obj) throws Exception {
        zzdvy zzdvyVar;
        JSONObject jSONObject;
        String strConcat;
        zzdzr zzdzrVar = (zzdzr) obj;
        int iOptInt = zzdzrVar.zza.optInt("http_timeout_millis", MBridgeCommon.DEFAULT_LOAD_TIMEOUT);
        zzbvm zzbvmVar = zzdzrVar.zzb;
        String strJoin = "";
        if (zzbvmVar.zza() != -2) {
            if (zzbvmVar.zza() == 1) {
                if (zzbvmVar.zzh() != null) {
                    strJoin = TextUtils.join(", ", zzbvmVar.zzh());
                    com.google.android.gms.ads.internal.util.client.zzo.zzg(strJoin);
                }
                zzdvyVar = new zzdvy(2, "Error building request URL: ".concat(String.valueOf(strJoin)));
            } else {
                zzdvyVar = new zzdvy(1);
            }
            zzfhh zzfhhVar = this.zzd;
            zzfgw zzfgwVar = this.zzc;
            zzfgwVar.zzh(zzdvyVar);
            zzfgwVar.zzg(false);
            zzfhhVar.zza(zzfgwVar);
            throw zzdvyVar;
        }
        HashMap map = new HashMap();
        if (zzdzrVar.zzb.zzj() && !TextUtils.isEmpty(this.zzb)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzaZ)).booleanValue()) {
                String str = this.zzb;
                if (TextUtils.isEmpty(str)) {
                    strConcat = "";
                } else {
                    Matcher matcher = zza.matcher(str);
                    strConcat = "";
                    while (matcher.find()) {
                        String strGroup = matcher.group(1);
                        if (strGroup != null) {
                            Locale locale = Locale.ROOT;
                            if (strGroup.toLowerCase(locale).startsWith("id=") || strGroup.toLowerCase(locale).startsWith("ide=")) {
                                if (!TextUtils.isEmpty(strConcat)) {
                                    strConcat = strConcat.concat("; ");
                                }
                                strConcat = strConcat.concat(strGroup);
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(strConcat)) {
                    map.put(HttpRequestHeader.Cookie, strConcat);
                }
            } else {
                map.put(HttpRequestHeader.Cookie, this.zzb);
            }
        }
        if (zzdzrVar.zzb.zzk() && (jSONObject = zzdzrVar.zza) != null) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("pii");
            if (jSONObjectOptJSONObject != null) {
                if (!TextUtils.isEmpty(jSONObjectOptJSONObject.optString("doritos", ""))) {
                    map.put("x-afma-drt-cookie", jSONObjectOptJSONObject.optString("doritos", ""));
                }
                if (!TextUtils.isEmpty(jSONObjectOptJSONObject.optString("doritos_v2", ""))) {
                    map.put("x-afma-drt-v2-cookie", jSONObjectOptJSONObject.optString("doritos_v2", ""));
                }
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("DSID signal does not exist.");
            }
        }
        if (zzdzrVar.zzb != null && !TextUtils.isEmpty(zzdzrVar.zzb.zzf())) {
            strJoin = zzdzrVar.zzb.zzf();
        }
        zzfhh zzfhhVar2 = this.zzd;
        zzfgw zzfgwVar2 = this.zzc;
        zzfgwVar2.zzg(true);
        zzfhhVar2.zza(zzfgwVar2);
        return new zzdzn(zzdzrVar.zzb.zzg(), iOptInt, map, strJoin.getBytes(StandardCharsets.UTF_8), "", zzdzrVar.zzb.zzk());
    }
}
