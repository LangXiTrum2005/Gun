package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.webkit.ProxyConfig;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.mbridge.msdk.MBridgeConstans;
import com.umeng.analytics.pro.bc;
import com.umeng.ccg.a;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbkb implements zzbjp {

    @Nullable
    private final com.google.android.gms.ads.internal.zzb zza;

    @Nullable
    private final zzdrw zzb;

    @Nullable
    private final zzbsc zzd;

    @Nullable
    private final zzebk zze;

    @Nullable
    private final zzcmk zzf;
    private com.google.android.gms.ads.internal.overlay.zzaa zzg = null;
    private final zzgcs zzh = zzbzw.zzg;
    private final com.google.android.gms.ads.internal.util.client.zzu zzc = new com.google.android.gms.ads.internal.util.client.zzu(null);

    public zzbkb(com.google.android.gms.ads.internal.zzb zzbVar, zzbsc zzbscVar, zzebk zzebkVar, zzdrw zzdrwVar, zzcmk zzcmkVar) {
        this.zza = zzbVar;
        this.zzd = zzbscVar;
        this.zze = zzebkVar;
        this.zzb = zzdrwVar;
        this.zzf = zzcmkVar;
    }

    public static int zzb(Map map) {
        String str = (String) map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return 7;
        }
        if ("l".equalsIgnoreCase(str)) {
            return 6;
        }
        return bc.aL.equalsIgnoreCase(str) ? 14 : -1;
    }

    @VisibleForTesting
    public static Uri zzc(Context context, zzava zzavaVar, Uri uri, View view, @Nullable Activity activity, @Nullable zzfcn zzfcnVar) {
        if (zzavaVar == null) {
            return uri;
        }
        try {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzlR)).booleanValue() || zzfcnVar == null) {
                if (zzavaVar.zze(uri)) {
                    uri = zzavaVar.zza(uri, context, view, activity);
                }
            } else if (zzavaVar.zze(uri)) {
                uri = zzfcnVar.zza(uri, context, view, activity);
            }
        } catch (zzavb unused) {
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "OpenGmsgHandler.maybeAddClickSignalsToUri");
        }
        return uri;
    }

    @VisibleForTesting
    public static Uri zzd(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error adding click uptime parameter to url: ".concat(String.valueOf(uri.toString())), e);
        }
        return uri;
    }

    public static boolean zzf(Map map) {
        return "1".equals(map.get("custom_close"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:116:0x02ee  */
    public final void zzh(String str, com.google.android.gms.ads.internal.client.zza zzaVar, Map map, String str2) {
        String str3;
        boolean zZzb;
        HashMap map2;
        boolean z;
        String string;
        zzcex zzcexVar = (zzcex) zzaVar;
        zzfbo zzfboVarZzD = zzcexVar.zzD();
        zzfbr zzfbrVarZzR = zzcexVar.zzR();
        if (zzfboVarZzD == null || zzfbrVarZzR == null) {
            str3 = "";
            zZzb = false;
        } else {
            String str4 = zzfbrVarZzR.zzb;
            zZzb = zzfboVarZzD.zzb();
            str3 = str4;
        }
        boolean z2 = (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkC)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("0")) ? false : true;
        boolean z3 = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzmC)).booleanValue() && map.containsKey("ig_cl") && ((String) map.get("ig_cl")).equals("true");
        if ("expand".equalsIgnoreCase(str2)) {
            if (zzcexVar.zzaF()) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot expand WebView that is already expanded.");
                return;
            } else {
                zzk(false);
                ((zzcgh) zzaVar).zzaL(zzf(map), zzb(map), z2);
                return;
            }
        }
        if ("webapp".equalsIgnoreCase(str2)) {
            zzk(false);
            boolean z4 = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzlM)).booleanValue() && Objects.equals(map.get("is_allowed_for_lock_screen"), "1");
            if (str != null) {
                ((zzcgh) zzaVar).zzaN(zzf(map), zzb(map), str, z2, z4);
                return;
            } else {
                ((zzcgh) zzaVar).zzaM(zzf(map), zzb(map), (String) map.get("html"), (String) map.get("baseurl"), z2);
                return;
            }
        }
        Intent uri = null;
        if ("chrome_custom_tab".equalsIgnoreCase(str2)) {
            Context context = zzcexVar.getContext();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzeI)).booleanValue()) {
                com.google.android.gms.ads.internal.util.zze.zza("User opt out chrome custom tab.");
                zzm(10);
            } else {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzeG)).booleanValue() ? !zzbdm.zzg(context) : CustomTabsClient.getPackageName(context, null) == null) {
                    zzk(true);
                    if (TextUtils.isEmpty(str)) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot open browser with null or empty url");
                        zzm(7);
                        return;
                    }
                    Uri uriZzd = zzd(zzc(zzcexVar.getContext(), zzcexVar.zzI(), Uri.parse(str), zzcexVar.zzF(), zzcexVar.zzi(), zzcexVar.zzS()));
                    if (zZzb && this.zze != null && zzl(zzaVar, zzcexVar.getContext(), uriZzd.toString(), str3)) {
                        return;
                    }
                    this.zzg = new zzbjy(this);
                    ((zzcgh) zzaVar).zzaJ(new com.google.android.gms.ads.internal.overlay.zzc(null, uriZzd.toString(), null, null, null, null, null, null, ObjectWrapper.wrap(this.zzg).asBinder(), true), z2, z3, str3);
                    return;
                }
                zzm(4);
            }
            map.put("use_first_package", "true");
            map.put("use_running_process", "true");
            zzj(zzaVar, map, zZzb, str3, z2, z3);
            return;
        }
        if (MBridgeConstans.DYNAMIC_VIEW_WX_APP.equalsIgnoreCase(str2) && "true".equalsIgnoreCase((String) map.get("system_browser"))) {
            zzj(zzaVar, map, zZzb, str3, z2, z3);
            return;
        }
        if ("open_app".equalsIgnoreCase(str2)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzid)).booleanValue()) {
                zzk(true);
                String str5 = (String) map.get("p");
                if (str5 == null) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Package name missing from open app action.");
                    return;
                }
                if (zZzb && this.zze != null && zzl(zzaVar, zzcexVar.getContext(), str5, str3)) {
                    return;
                }
                PackageManager packageManager = zzcexVar.getContext().getPackageManager();
                if (packageManager == null) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot get package manager from open app action.");
                    return;
                }
                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str5);
                if (launchIntentForPackage != null) {
                    ((zzcgh) zzaVar).zzaJ(new com.google.android.gms.ads.internal.overlay.zzc(launchIntentForPackage, this.zzg), z2, z3, str3);
                    return;
                }
                return;
            }
            return;
        }
        zzk(true);
        String str6 = (String) map.get("intent_url");
        if (!TextUtils.isEmpty(str6)) {
            try {
                uri = Intent.parseUri(str6, 0);
            } catch (URISyntaxException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Error parsing the url: ".concat(String.valueOf(str6)), e);
            }
        }
        Intent intent = uri;
        if (intent != null && intent.getData() != null) {
            Uri data = intent.getData();
            if (!Uri.EMPTY.equals(data)) {
                Uri uriZzd2 = zzd(zzc(zzcexVar.getContext(), zzcexVar.zzI(), data, zzcexVar.zzF(), zzcexVar.zzi(), zzcexVar.zzS()));
                if (TextUtils.isEmpty(intent.getType())) {
                    intent.setData(uriZzd2);
                } else {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzie)).booleanValue()) {
                        intent.setDataAndType(uriZzd2, intent.getType());
                    } else {
                        intent.setData(uriZzd2);
                    }
                }
            }
        }
        boolean z5 = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zziz)).booleanValue() && "intent_async".equalsIgnoreCase(str2) && map.containsKey("event_id");
        HashMap map3 = new HashMap();
        if (z5) {
            map2 = map3;
            this.zzg = new zzbjz(this, z2, zzaVar, map3, map);
            z = false;
        } else {
            map2 = map3;
            z = z2;
        }
        if (intent != null) {
            if (!zZzb || this.zze == null || !zzl(zzaVar, zzcexVar.getContext(), intent.getData().toString(), str3)) {
                ((zzcgh) zzaVar).zzaJ(new com.google.android.gms.ads.internal.overlay.zzc(intent, this.zzg), z, z3, str3);
                return;
            } else {
                if (z5) {
                    map2.put((String) map.get("event_id"), Boolean.TRUE);
                    ((zzbmk) zzaVar).zzd("openIntentAsync", map2);
                    return;
                }
                return;
            }
        }
        boolean z6 = z3;
        if (TextUtils.isEmpty(str)) {
            string = str;
        } else {
            string = zzd(zzc(zzcexVar.getContext(), zzcexVar.zzI(), Uri.parse(str), zzcexVar.zzF(), zzcexVar.zzi(), zzcexVar.zzS())).toString();
        }
        if (!zZzb || this.zze == null || !zzl(zzaVar, zzcexVar.getContext(), string, str3)) {
            ((zzcgh) zzaVar).zzaJ(new com.google.android.gms.ads.internal.overlay.zzc((String) map.get(bc.aI), string, (String) map.get("m"), (String) map.get("p"), (String) map.get(bc.aL), (String) map.get("f"), (String) map.get("e"), this.zzg), z, z6, str3);
        } else if (z5) {
            map2.put((String) map.get(r5), Boolean.TRUE);
            ((zzbmk) zzaVar).zzd("openIntentAsync", map2);
        }
    }

    private final void zzi(Context context, String str, String str2) {
        this.zze.zzc(str);
        zzdrw zzdrwVar = this.zzb;
        if (zzdrwVar != null) {
            zzebv.zzd(context, zzdrwVar, this.zze, str, "dialog_not_shown", zzfxq.zze("dialog_not_shown_reason", str2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x010a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0112  */
    /* JADX WARN: Code duplicated, block: B:46:0x015c A[PHI: r22
  0x015c: PHI (r22v2 java.util.ArrayList) = (r22v1 java.util.ArrayList), (r22v1 java.util.ArrayList), (r22v1 java.util.ArrayList), (r22v3 java.util.ArrayList) binds: [B:32:0x0112, B:33:0x0114, B:35:0x011a, B:66:0x015c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x0160  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v22, types: [android.content.Intent] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    private final void zzj(com.google.android.gms.ads.internal.client.zza zzaVar, Map map, boolean z, String str, boolean z2, boolean z3) {
        ?? r2;
        ArrayList arrayList;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ResolveInfo resolveInfoZzc;
        Intent intentZzb;
        com.google.android.gms.ads.internal.client.zza zzaVar2;
        boolean z4 = true;
        zzk(true);
        zzcex zzcexVar = (zzcex) zzaVar;
        Context context = zzcexVar.getContext();
        zzava zzavaVarZzI = zzcexVar.zzI();
        View viewZzF = zzcexVar.zzF();
        zzfcn zzfcnVarZzS = zzcexVar.zzS();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        String str2 = (String) map.get(bc.aN);
        Object objBuild = null;
        if (TextUtils.isEmpty(str2)) {
            r2 = objBuild;
        } else {
            Uri uriZzd = zzd(zzc(context, zzavaVarZzI, Uri.parse(str2), viewZzF, null, zzfcnVarZzS));
            boolean z5 = Boolean.parseBoolean((String) map.get("use_first_package"));
            boolean z6 = Boolean.parseBoolean((String) map.get("use_running_process"));
            if (!Boolean.parseBoolean((String) map.get("use_custom_tabs"))) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzeC)).booleanValue()) {
                    z4 = false;
                }
            }
            if (ProxyConfig.MATCH_HTTP.equalsIgnoreCase(uriZzd.getScheme())) {
                objBuild = uriZzd.buildUpon().scheme("https").build();
            } else if ("https".equalsIgnoreCase(uriZzd.getScheme())) {
                objBuild = uriZzd.buildUpon().scheme(ProxyConfig.MATCH_HTTP).build();
            }
            ?? r3 = objBuild;
            ArrayList arrayList2 = new ArrayList();
            Intent intentZza = zzbka.zza(uriZzd, context, zzavaVarZzI, viewZzF, zzfcnVarZzS);
            Intent intentZza2 = zzbka.zza(r3, context, zzavaVarZzI, viewZzF, zzfcnVarZzS);
            if (z4) {
                com.google.android.gms.ads.internal.zzv.zzq();
                com.google.android.gms.ads.internal.util.zzs.zzp(context, intentZza);
                com.google.android.gms.ads.internal.zzv.zzq();
                com.google.android.gms.ads.internal.util.zzs.zzp(context, intentZza2);
            }
            ArrayList arrayList3 = arrayList2;
            ResolveInfo resolveInfoZzd = zzbka.zzd(intentZza, arrayList2, context, zzavaVarZzI, viewZzF, zzfcnVarZzS);
            if (resolveInfoZzd != null) {
                objBuild = zzbka.zzb(intentZza, resolveInfoZzd, context, zzavaVarZzI, viewZzF, zzfcnVarZzS);
            } else if (intentZza2 == null || (resolveInfoZzc = zzbka.zzc(intentZza2, context, zzavaVarZzI, viewZzF, zzfcnVarZzS)) == null) {
                r2 = intentZzb;
                if (!arrayList3.isEmpty()) {
                    if (z6 || activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                        arrayList = arrayList3;
                        if (z5) {
                            objBuild = zzbka.zzb(intentZza, (ResolveInfo) arrayList.get(0), context, zzavaVarZzI, viewZzF, zzfcnVarZzS);
                        }
                    } else {
                        int size = arrayList3.size();
                        int i = 0;
                        while (true) {
                            if (i < size) {
                                ArrayList arrayList4 = arrayList3;
                                ResolveInfo resolveInfo = (ResolveInfo) arrayList4.get(i);
                                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                                while (true) {
                                    int i2 = i + 1;
                                    if (!it.hasNext()) {
                                        arrayList3 = arrayList4;
                                        i = i2;
                                    } else if (it.next().processName.equals(resolveInfo.activityInfo.packageName)) {
                                        objBuild = zzbka.zzb(intentZza, resolveInfo, context, zzavaVarZzI, viewZzF, zzfcnVarZzS);
                                    }
                                }
                            } else {
                                arrayList = arrayList3;
                                if (z5) {
                                    objBuild = zzbka.zzb(intentZza, (ResolveInfo) arrayList.get(0), context, zzavaVarZzI, viewZzF, zzfcnVarZzS);
                                }
                            }
                        }
                    }
                }
                r2 = intentZza;
            } else {
                intentZzb = zzbka.zzb(intentZza, resolveInfoZzc, context, zzavaVarZzI, viewZzF, zzfcnVarZzS);
                if (zzbka.zzc(intentZzb, context, zzavaVarZzI, viewZzF, zzfcnVarZzS) == null) {
                    r2 = intentZzb;
                    if (!arrayList3.isEmpty()) {
                        if (z6) {
                            arrayList = arrayList3;
                            if (z5) {
                                objBuild = zzbka.zzb(intentZza, (ResolveInfo) arrayList.get(0), context, zzavaVarZzI, viewZzF, zzfcnVarZzS);
                            }
                        } else {
                            arrayList = arrayList3;
                            if (z5) {
                                objBuild = zzbka.zzb(intentZza, (ResolveInfo) arrayList.get(0), context, zzavaVarZzI, viewZzF, zzfcnVarZzS);
                            }
                        }
                    }
                    r2 = intentZza;
                }
            }
            r2 = objBuild;
        }
        if (!z || this.zze == null || r2 == 0) {
            zzaVar2 = zzaVar;
        } else {
            zzaVar2 = zzaVar;
            if (zzl(zzaVar2, zzcexVar.getContext(), r2.getData().toString(), str)) {
                return;
            }
        }
        try {
            ((zzcgh) zzaVar2).zzaJ(new com.google.android.gms.ads.internal.overlay.zzc(r2, this.zzg), z2, z3, str);
        } catch (ActivityNotFoundException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj(e.getMessage());
        }
    }

    private final void zzk(boolean z) {
        zzbsc zzbscVar = this.zzd;
        if (zzbscVar != null) {
            zzbscVar.zza(z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x005e, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzit)).booleanValue() != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c8, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT < 33 ? ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzio)).booleanValue() : ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzin)).booleanValue()) != false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean zzl(com.google.android.gms.ads.internal.client.zza r9, android.content.Context r10, java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbkb.zzl(com.google.android.gms.ads.internal.client.zza, android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzm(int i) {
        zzdrw zzdrwVar;
        String str;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzeF)).booleanValue() || (zzdrwVar = this.zzb) == null) {
            return;
        }
        zzdrv zzdrvVarZza = zzdrwVar.zza();
        zzdrvVarZza.zzb(a.w, "cct_action");
        switch (i) {
            case 2:
                str = "CONTEXT_NOT_AN_ACTIVITY";
                break;
            case 3:
                str = "CONTEXT_NULL";
                break;
            case 4:
                str = "CCT_NOT_SUPPORTED";
                break;
            case 5:
                str = "CCT_READY_TO_OPEN";
                break;
            case 6:
                str = "ACTIVITY_NOT_FOUND";
                break;
            case 7:
                str = "EMPTY_URL";
                break;
            case 8:
                str = "UNKNOWN";
                break;
            case 9:
                str = "WRONG_EXP_SETUP";
                break;
            default:
                str = "OPT_OUT";
                break;
        }
        zzdrvVarZza.zzb("cct_open_status", str);
        zzdrvVarZza.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        com.google.android.gms.ads.internal.client.zza zzaVar = (com.google.android.gms.ads.internal.client.zza) obj;
        String str = (String) map.get(bc.aN);
        Map map2 = new HashMap();
        zzcex zzcexVar = (zzcex) zzaVar;
        if (zzcexVar.zzD() != null) {
            map2 = zzcexVar.zzD().zzaw;
        }
        String strZzc = zzbyk.zzc(str, zzcexVar.getContext(), true, map2);
        String str2 = (String) map.get("a");
        if (str2 == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Action missing from an open GMSG.");
            return;
        }
        com.google.android.gms.ads.internal.zzb zzbVar = this.zza;
        if (zzbVar == null || zzbVar.zzc()) {
            zzgch.zzr((((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjT)).booleanValue() && this.zzf != null && zzcmk.zzj(strZzc)) ? this.zzf.zzb(strZzc, com.google.android.gms.ads.internal.client.zzbc.zze()) : zzgch.zzh(strZzc), new zzbjx(this, map, zzaVar, str2), this.zzh);
        } else {
            zzbVar.zzb(strZzc);
        }
    }
}
