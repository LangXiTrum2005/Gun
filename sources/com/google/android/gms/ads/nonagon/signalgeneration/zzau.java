package com.google.android.gms.ads.nonagon.signalgeneration;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzbv;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzava;
import com.google.android.gms.internal.ads.zzavb;
import com.google.android.gms.internal.ads.zzbcc;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbdq;
import com.google.android.gms.internal.ads.zzbee;
import com.google.android.gms.internal.ads.zzbeq;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzbuc;
import com.google.android.gms.internal.ads.zzbyr;
import com.google.android.gms.internal.ads.zzbyt;
import com.google.android.gms.internal.ads.zzbyy;
import com.google.android.gms.internal.ads.zzbzw;
import com.google.android.gms.internal.ads.zzcgx;
import com.google.android.gms.internal.ads.zzcva;
import com.google.android.gms.internal.ads.zzdbk;
import com.google.android.gms.internal.ads.zzdnl;
import com.google.android.gms.internal.ads.zzdre;
import com.google.android.gms.internal.ads.zzdsb;
import com.google.android.gms.internal.ads.zzfch;
import com.google.android.gms.internal.ads.zzfcn;
import com.google.android.gms.internal.ads.zzfdi;
import com.google.android.gms.internal.ads.zzfgv;
import com.google.android.gms.internal.ads.zzfgw;
import com.google.android.gms.internal.ads.zzfhh;
import com.google.android.gms.internal.ads.zzfhk;
import com.google.android.gms.internal.ads.zzfja;
import com.google.android.gms.internal.ads.zzfuc;
import com.google.android.gms.internal.ads.zzfve;
import com.google.android.gms.internal.ads.zzgbn;
import com.google.android.gms.internal.ads.zzgbo;
import com.google.android.gms.internal.ads.zzgby;
import com.google.android.gms.internal.ads.zzgch;
import com.google.android.gms.internal.ads.zzgcs;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzau extends zzbyt {
    protected static final List zza = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));
    protected static final List zzb = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));
    protected static final List zzc = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));
    protected static final List zzd = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));
    public static final /* synthetic */ int zze = 0;
    private final List zzB;
    private final List zzC;
    private final List zzD;
    private final List zzE;
    private final zzbdq zzI;
    private final zzo zzJ;
    private final zzf zzK;
    private final zzcgx zzf;
    private Context zzg;
    private final zzava zzh;
    private final zzfcn zzi;
    private final zzfdi zzj;
    private final zzgcs zzk;
    private final ScheduledExecutorService zzl;

    @Nullable
    private zzbuc zzm;
    private final zzdsb zzp;
    private final zzfja zzq;
    private final VersionInfoParcel zzy;
    private String zzz;
    private Point zzn = new Point();
    private Point zzo = new Point();
    private final AtomicInteger zzx = new AtomicInteger(0);
    private final AtomicBoolean zzF = new AtomicBoolean(false);
    private final AtomicBoolean zzG = new AtomicBoolean(false);
    private final AtomicInteger zzH = new AtomicInteger(0);
    private final boolean zzr = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzha)).booleanValue();
    private final boolean zzs = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgZ)).booleanValue();
    private final boolean zzt = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzhc)).booleanValue();
    private final boolean zzu = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzhe)).booleanValue();
    private final String zzv = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzhd);
    private final String zzw = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzhf);
    private final String zzA = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzhg);

    public zzau(zzcgx zzcgxVar, Context context, zzava zzavaVar, zzfdi zzfdiVar, zzgcs zzgcsVar, ScheduledExecutorService scheduledExecutorService, zzdsb zzdsbVar, zzfja zzfjaVar, VersionInfoParcel versionInfoParcel, zzbdq zzbdqVar, zzfcn zzfcnVar, zzo zzoVar, zzf zzfVar) {
        List listZzaa;
        this.zzf = zzcgxVar;
        this.zzg = context;
        this.zzh = zzavaVar;
        this.zzi = zzfcnVar;
        this.zzj = zzfdiVar;
        this.zzk = zzgcsVar;
        this.zzl = scheduledExecutorService;
        this.zzp = zzdsbVar;
        this.zzq = zzfjaVar;
        this.zzy = versionInfoParcel;
        this.zzI = zzbdqVar;
        this.zzJ = zzoVar;
        this.zzK = zzfVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzhh)).booleanValue()) {
            this.zzB = zzaa((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzhi));
            this.zzC = zzaa((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzhj));
            this.zzD = zzaa((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzhk));
            listZzaa = zzaa((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzhl));
        } else {
            this.zzB = zza;
            this.zzC = zzb;
            this.zzD = zzc;
            listZzaa = zzd;
        }
        this.zzE = listZzaa;
    }

    public static /* bridge */ /* synthetic */ void zzH(zzau zzauVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (zzauVar.zzO((Uri) it.next())) {
                zzauVar.zzx.getAndIncrement();
                return;
            }
        }
    }

    public static final /* synthetic */ Uri zzQ(Uri uri, String str) {
        return !TextUtils.isEmpty(str) ? zzZ(uri, "nas", str) : uri;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:37:0x008d  */
    private final zzac zzR(Context context, String str, String str2, com.google.android.gms.ads.internal.client.zzs zzsVar, com.google.android.gms.ads.internal.client.zzm zzmVar, int i, @Nullable String str3, Bundle bundle, @Nullable zzbyy zzbyyVar) {
        com.google.android.gms.ads.internal.client.zzs zzsVar2;
        byte b;
        zzfch zzfchVar = new zzfch();
        if ("REWARDED".equals(str2)) {
            zzfchVar.zzp().zza(2);
        } else if ("REWARDED_INTERSTITIAL".equals(str2)) {
            zzfchVar.zzp().zza(3);
        }
        zzab zzabVarZzp = this.zzf.zzp();
        zzcva zzcvaVar = new zzcva();
        zzcvaVar.zzf(context);
        zzfchVar.zzt(str == null ? HandleInvocationsFromAdViewer.KEY_AD_UNIT_ID : str);
        zzfchVar.zzH(zzmVar == null ? new com.google.android.gms.ads.internal.client.zzn().zza() : zzmVar);
        if (zzsVar == null) {
            switch (str2) {
                case "NATIVE":
                    b = 3;
                    break;
                case "APP_OPEN_AD":
                    b = 4;
                    break;
                case "REWARDED":
                    b = 1;
                    break;
                case "REWARDED_INTERSTITIAL":
                    b = 2;
                    break;
                case "BANNER":
                    b = 0;
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b == 0) {
                zzsVar2 = new com.google.android.gms.ads.internal.client.zzs(context, AdSize.BANNER);
            } else if (b == 1 || b == 2) {
                zzsVar2 = com.google.android.gms.ads.internal.client.zzs.zzd();
            } else if (b != 3) {
                zzsVar2 = b != 4 ? new com.google.android.gms.ads.internal.client.zzs() : com.google.android.gms.ads.internal.client.zzs.zzb();
            } else {
                zzsVar2 = com.google.android.gms.ads.internal.client.zzs.zzc();
            }
        } else {
            zzsVar2 = zzsVar;
        }
        zzfchVar.zzs(zzsVar2);
        zzfchVar.zzz(true);
        zzfchVar.zzA(bundle);
        zzcvaVar.zzk(zzfchVar.zzJ());
        zzcvaVar.zzi(i);
        zzabVarZzp.zza(zzcvaVar.zzl());
        zzax zzaxVar = new zzax();
        zzaxVar.zzb(str2);
        zzaxVar.zzc(str3);
        zzaxVar.zzd(zzbyyVar);
        zzabVarZzp.zzb(new zzaz(zzaxVar, null));
        new zzdbk();
        return zzabVarZzp.zzc();
    }

    private final AI zzS(final String str) {
        final zzdnl[] zzdnlVarArr = new zzdnl[1];
        AI aiZzn = zzgch.zzn(this.zzj.zza(), new zzgbo() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaf
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final AI zza(Object obj) {
                return this.zza.zzv(zzdnlVarArr, str, (zzdnl) obj);
            }
        }, this.zzk);
        aiZzn.addListener(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzag
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzJ(zzdnlVarArr);
            }
        }, this.zzk);
        return (zzgby) zzgch.zze((zzgby) zzgch.zzm((zzgby) zzgch.zzo(zzgby.zzu(aiZzn), ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzhy)).intValue(), TimeUnit.MILLISECONDS, this.zzl), new zzfuc() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzam
            @Override // com.google.android.gms.internal.ads.zzfuc
            public final Object apply(Object obj) {
                int i = zzau.zze;
                return ((JSONObject) obj).optString("nas");
            }
        }, this.zzk), Exception.class, new zzfuc() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzan
            @Override // com.google.android.gms.internal.ads.zzfuc
            public final Object apply(Object obj) {
                int i = zzau.zze;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("", (Exception) obj);
                return null;
            }
        }, this.zzk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzT() {
        if (((Boolean) zzbeq.zzc.zze()).booleanValue()) {
            this.zzJ.zzb();
        } else {
            zzgch.zzr(((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkV)).booleanValue() ? zzgch.zzk(new zzgbn() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzad
                @Override // com.google.android.gms.internal.ads.zzgbn
                public final AI zza() {
                    return this.zza.zzu();
                }
            }, zzbzw.zza) : zzR(this.zzg, null, AdFormat.BANNER.name(), null, null, 0, null, new Bundle(), null).zzb(), new zzat(this), this.zzf.zzC());
        }
    }

    private final void zzU() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzju)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjx)).booleanValue()) {
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjB)).booleanValue() && this.zzF.getAndSet(true)) {
                return;
            }
            zzT();
        }
    }

    private final void zzV(List list, final IObjectWrapper iObjectWrapper, zzbtt zzbttVar, boolean z) {
        AI aiZzb;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzhx)).booleanValue()) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("The updating URL feature is not enabled.");
            try {
                zzbttVar.zze("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
                return;
            }
        }
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (zzO((Uri) it.next())) {
                i++;
            }
        }
        if (i > 1) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Multiple google urls found: ".concat(String.valueOf(list)));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            final Uri uri = (Uri) it2.next();
            if (zzO(uri)) {
                aiZzb = this.zzk.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzah
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.zza.zzn(uri, iObjectWrapper);
                    }
                });
                if (zzY()) {
                    aiZzb = zzgch.zzn(aiZzb, new zzgbo() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzai
                        @Override // com.google.android.gms.internal.ads.zzgbo
                        public final AI zza(Object obj) {
                            zzau zzauVar = this.zza;
                            return zzgch.zzm(zzauVar.zzS("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new zzfuc(zzauVar, (Uri) obj) { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaj
                                public final /* synthetic */ Uri zza;

                                {
                                    this.zza = uri;
                                }

                                @Override // com.google.android.gms.internal.ads.zzfuc
                                public final Object apply(Object obj2) {
                                    return zzau.zzQ(this.zza, (String) obj2);
                                }
                            }, zzauVar.zzk);
                        }
                    }, this.zzk);
                } else {
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Asset view map is empty.");
                }
            } else {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Not a Google URL: ".concat(String.valueOf(uri)));
                aiZzb = zzgch.zzh(uri);
            }
            arrayList.add(aiZzb);
        }
        zzgch.zzr(zzgch.zzd(arrayList), new zzas(this, zzbttVar, z), this.zzf.zzC());
    }

    private final void zzW(final List list, final IObjectWrapper iObjectWrapper, zzbtt zzbttVar, boolean z) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzhx)).booleanValue()) {
            try {
                zzbttVar.zze("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
                return;
            }
        }
        AI aiZzb = this.zzk.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzao
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzC(list, iObjectWrapper);
            }
        });
        if (zzY()) {
            aiZzb = zzgch.zzn(aiZzb, new zzgbo() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzap
                @Override // com.google.android.gms.internal.ads.zzgbo
                public final AI zza(Object obj) {
                    return this.zza.zzw((ArrayList) obj);
                }
            }, this.zzk);
        } else {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Asset view map is empty.");
        }
        zzgch.zzr(aiZzb, new zzar(this, zzbttVar, z), this.zzf.zzC());
    }

    private static boolean zzX(@NonNull Uri uri, List list, List list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (path.contains((String) it.next())) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith((String) it2.next())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private final boolean zzY() {
        Map map;
        zzbuc zzbucVar = this.zzm;
        return (zzbucVar == null || (map = zzbucVar.zzb) == null || map.isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Uri zzZ(Uri uri, String str, String str2) {
        String string = uri.toString();
        int iIndexOf = string.indexOf("&adurl=");
        if (iIndexOf == -1) {
            iIndexOf = string.indexOf("?adurl=");
        }
        if (iIndexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i = iIndexOf + 1;
        StringBuilder sb = new StringBuilder(string.substring(0, i));
        AbstractC5044xl.t(sb, str, "=", str2, "&");
        sb.append(string.substring(i));
        return Uri.parse(sb.toString());
    }

    private static final List zzaa(String str) {
        String[] strArrSplit = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrSplit) {
            if (!zzfve.zzd(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    public static /* bridge */ /* synthetic */ zzfhh zzr(AI ai, zzbyy zzbyyVar) {
        if (!zzfhk.zza() || !((Boolean) zzbee.zze.zze()).booleanValue()) {
            return null;
        }
        try {
            zzfhh zzfhhVarZza = ((zzac) zzgch.zzp(ai)).zza();
            zzfhhVarZza.zzd(new ArrayList(Collections.singletonList(zzbyyVar.zzb)));
            com.google.android.gms.ads.internal.client.zzm zzmVar = zzbyyVar.zzd;
            zzfhhVarZza.zzb(zzmVar == null ? "" : zzmVar.zzp);
            zzfhhVarZza.zzf(zzbyyVar.zzd.zzm);
            return zzfhhVarZza;
        } catch (ExecutionException e) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "SignalGeneratorImpl.getConfiguredCriticalUserJourney");
            return null;
        }
    }

    public final /* synthetic */ ArrayList zzB(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (!zzP(uri) || TextUtils.isEmpty(str)) {
                arrayList.add(uri);
            } else {
                arrayList.add(zzZ(uri, "nas", str));
            }
        }
        return arrayList;
    }

    public final /* synthetic */ ArrayList zzC(List list, IObjectWrapper iObjectWrapper) throws Exception {
        String strZzh = this.zzh.zzc() != null ? this.zzh.zzc().zzh(this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null) : "";
        if (TextUtils.isEmpty(strZzh)) {
            throw new Exception("Failed to get view signals.");
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (zzP(uri)) {
                arrayList.add(zzZ(uri, "ms", strZzh));
            } else {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Not a Google URL: ".concat(String.valueOf(uri)));
                arrayList.add(uri);
            }
        }
        if (arrayList.isEmpty()) {
            throw new Exception("Empty impression URLs result.");
        }
        return arrayList;
    }

    public final /* synthetic */ void zzJ(zzdnl[] zzdnlVarArr) {
        zzdnl zzdnlVar = zzdnlVarArr[0];
        if (zzdnlVar != null) {
            this.zzj.zzb(zzgch.zzh(zzdnlVar));
        }
    }

    @VisibleForTesting
    public final boolean zzO(@NonNull Uri uri) {
        return zzX(uri, this.zzB, this.zzC);
    }

    @VisibleForTesting
    public final boolean zzP(@NonNull Uri uri) {
        return zzX(uri, this.zzD, this.zzE);
    }

    @Override // com.google.android.gms.internal.ads.zzbyu
    public final IObjectWrapper zze(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, String str, IObjectWrapper iObjectWrapper3) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjH)).booleanValue()) {
            return ObjectWrapper.wrap(null);
        }
        this.zzI.zzg((Context) ObjectWrapper.unwrap(iObjectWrapper), (CustomTabsClient) ObjectWrapper.unwrap(iObjectWrapper2), str, (CustomTabsCallback) ObjectWrapper.unwrap(iObjectWrapper3));
        if (((Boolean) zzbeq.zzc.zze()).booleanValue()) {
            this.zzJ.zzb();
        }
        if (((Boolean) zzbeq.zza.zze()).booleanValue()) {
            this.zzK.zzb();
        }
        return ObjectWrapper.wrap(this.zzI.zzb());
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:27:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:29:0x00f7  */
    @Override // com.google.android.gms.internal.ads.zzbyu
    public final void zzf(IObjectWrapper iObjectWrapper, final zzbyy zzbyyVar, @Nullable zzbyr zzbyrVar) {
        final int i;
        AI aiZzh;
        AI aiZzb;
        AI aiZzg;
        final Bundle bundle = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzck)).booleanValue()) {
            bundle.putLong(zzdre.PUBLIC_API_CALL.zza(), zzbyyVar.zzd.zzz);
            AbstractC3888ke0.o(bundle, zzdre.DYNAMITE_ENTER.zza());
        }
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        this.zzg = context;
        zzfgw zzfgwVarZza = zzfgv.zza(context, 22);
        zzfgwVarZza.zzi();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzhq)).booleanValue() && zzbyyVar.zzd.zzc.getBoolean("optimize_for_app_start", false) && Objects.equals(zzaa.zzc(zzbyyVar.zzd), "requester_type_8")) {
            i = zzbyyVar.zze == 2 ? 2 : 1;
        } else {
            i = 0;
        }
        if ("UNKNOWN".equals(zzbyyVar.zzb)) {
            List arrayList = new ArrayList();
            zzbcc zzbccVar = zzbcl.zzhp;
            if (!((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbccVar)).isEmpty()) {
                arrayList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbccVar)).split(","));
            }
            if (arrayList.contains(zzaa.zzc(zzbyyVar.zzd))) {
                aiZzg = zzgch.zzg(new IllegalArgumentException("Unknown format is no longer supported."));
                aiZzb = zzgch.zzg(new IllegalArgumentException("Unknown format is no longer supported."));
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkV)).booleanValue()) {
                    zzgcs zzgcsVar = zzbzw.zza;
                    aiZzh = zzgcsVar.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzak
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return this.zza.zzq(zzbyyVar, i, bundle);
                        }
                    });
                    aiZzb = zzgch.zzn(aiZzh, new zzgbo() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzal
                        @Override // com.google.android.gms.internal.ads.zzgbo
                        public final AI zza(Object obj) {
                            return ((zzac) obj).zzb();
                        }
                    }, zzgcsVar);
                } else {
                    zzac zzacVarZzR = zzR(this.zzg, zzbyyVar.zza, zzbyyVar.zzb, zzbyyVar.zzc, zzbyyVar.zzd, i, zzbyyVar.zzf, bundle, zzbyyVar);
                    aiZzh = zzgch.zzh(zzacVarZzR);
                    aiZzb = zzacVarZzR.zzb();
                }
                aiZzg = aiZzh;
            }
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkV)).booleanValue()) {
                zzgcs zzgcsVar2 = zzbzw.zza;
                aiZzh = zzgcsVar2.zzb(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzak
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.zza.zzq(zzbyyVar, i, bundle);
                    }
                });
                aiZzb = zzgch.zzn(aiZzh, new zzgbo() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzal
                    @Override // com.google.android.gms.internal.ads.zzgbo
                    public final AI zza(Object obj) {
                        return ((zzac) obj).zzb();
                    }
                }, zzgcsVar2);
            } else {
                zzac zzacVarZzR2 = zzR(this.zzg, zzbyyVar.zza, zzbyyVar.zzb, zzbyyVar.zzc, zzbyyVar.zzd, i, zzbyyVar.zzf, bundle, zzbyyVar);
                aiZzh = zzgch.zzh(zzacVarZzR2);
                aiZzb = zzacVarZzR2.zzb();
            }
            aiZzg = aiZzh;
        }
        zzgch.zzr(aiZzb, new zzaq(this, aiZzg, zzbyyVar, zzbyrVar, zzfgwVarZza), this.zzf.zzC());
    }

    @Override // com.google.android.gms.internal.ads.zzbyu
    public final void zzg(zzbuc zzbucVar) {
        this.zzm = zzbucVar;
        this.zzj.zzc(1);
    }

    @Override // com.google.android.gms.internal.ads.zzbyu
    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbtt zzbttVar) {
        zzV(list, iObjectWrapper, zzbttVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzbyu
    public final void zzi(List list, IObjectWrapper iObjectWrapper, zzbtt zzbttVar) {
        zzW(list, iObjectWrapper, zzbttVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzbyu
    @SuppressLint({"AddJavascriptInterface"})
    public final void zzj(IObjectWrapper iObjectWrapper) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjt)).booleanValue()) {
            zzbcc zzbccVar = zzbcl.zzho;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbccVar)).booleanValue()) {
                zzU();
            }
            WebView webView = (WebView) ObjectWrapper.unwrap(iObjectWrapper);
            if (webView == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("The webView cannot be null.");
                return;
            }
            final zzj zzjVar = new zzj(webView, this.zzK, zzbzw.zzf);
            webView.addJavascriptInterface(new TaggingLibraryJsInterface(webView, this.zzh, this.zzp, this.zzq, this.zzi, this.zzJ, this.zzK, zzjVar), "gmaSdk");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjD)).booleanValue()) {
                com.google.android.gms.ads.internal.zzv.zzp().zzs();
            }
            if (((Boolean) zzbeq.zza.zze()).booleanValue()) {
                this.zzK.zzb();
                if (((Boolean) zzbeq.zzb.zze()).booleanValue()) {
                    zzbzw.zzd.scheduleWithFixedDelay(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzi
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzjVar.zzb();
                        }
                    }, 0L, ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjE)).intValue(), TimeUnit.MILLISECONDS);
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbccVar)).booleanValue()) {
                zzU();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyu
    public final void zzk(IObjectWrapper iObjectWrapper) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzhx)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) ObjectWrapper.unwrap(iObjectWrapper);
            zzbuc zzbucVar = this.zzm;
            this.zzn = zzbv.zza(motionEvent, zzbucVar == null ? null : zzbucVar.zza);
            if (motionEvent.getAction() == 0) {
                this.zzo = this.zzn;
            }
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            Point point = this.zzn;
            motionEventObtain.setLocation(point.x, point.y);
            this.zzh.zzd(motionEventObtain);
            motionEventObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyu
    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbtt zzbttVar) {
        zzV(list, iObjectWrapper, zzbttVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbyu
    public final void zzm(List list, IObjectWrapper iObjectWrapper, zzbtt zzbttVar) {
        zzW(list, iObjectWrapper, zzbttVar, false);
    }

    public final /* synthetic */ Uri zzn(Uri uri, IObjectWrapper iObjectWrapper) throws Exception {
        zzfcn zzfcnVar;
        try {
            uri = (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzlR)).booleanValue() || (zzfcnVar = this.zzi) == null) ? this.zzh.zza(uri, this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null) : zzfcnVar.zza(uri, this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null);
        } catch (zzavb e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("", e);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    public final /* synthetic */ zzac zzq(zzbyy zzbyyVar, int i, Bundle bundle) throws Exception {
        return zzR(this.zzg, zzbyyVar.zza, zzbyyVar.zzb, zzbyyVar.zzc, zzbyyVar.zzd, i, zzbyyVar.zzf, bundle, zzbyyVar);
    }

    public final /* synthetic */ AI zzu() throws Exception {
        return zzR(this.zzg, null, AdFormat.BANNER.name(), null, null, 0, null, new Bundle(), null).zzb();
    }

    public final /* synthetic */ AI zzv(zzdnl[] zzdnlVarArr, String str, zzdnl zzdnlVar) throws Exception {
        zzdnlVarArr[0] = zzdnlVar;
        Context context = this.zzg;
        zzbuc zzbucVar = this.zzm;
        Map map = zzbucVar.zzb;
        JSONObject jSONObjectZzd = zzbv.zzd(context, map, map, zzbucVar.zza, null);
        JSONObject jSONObjectZzg = zzbv.zzg(this.zzg, this.zzm.zza);
        JSONObject jSONObjectZzf = zzbv.zzf(this.zzm.zza);
        JSONObject jSONObjectZze = zzbv.zze(this.zzg, this.zzm.zza);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", jSONObjectZzd);
        jSONObject.put("ad_view_signal", jSONObjectZzg);
        jSONObject.put("scroll_view_signal", jSONObjectZzf);
        jSONObject.put("lock_screen_signal", jSONObjectZze);
        if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str)) {
            jSONObject.put("click_signal", zzbv.zzc(null, this.zzg, this.zzo, this.zzn));
        }
        return zzdnlVar.zzg(str, jSONObject);
    }

    public final /* synthetic */ AI zzw(final ArrayList arrayList) throws Exception {
        return zzgch.zzm(zzS("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new zzfuc() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzae
            @Override // com.google.android.gms.internal.ads.zzfuc
            public final Object apply(Object obj) {
                return this.zza.zzB(arrayList, (String) obj);
            }
        }, this.zzk);
    }
}
