package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Clock;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfiv {
    private final zzegq zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final Context zze;
    private final zzfcb zzf;
    private final zzfcc zzg;
    private final Clock zzh;
    private final zzava zzi;

    public zzfiv(zzegq zzegqVar, VersionInfoParcel versionInfoParcel, String str, String str2, Context context, @Nullable zzfcb zzfcbVar, @Nullable zzfcc zzfccVar, Clock clock, zzava zzavaVar) {
        this.zza = zzegqVar;
        this.zzb = versionInfoParcel.afmaVersion;
        this.zzc = str;
        this.zzd = str2;
        this.zze = context;
        this.zzf = zzfcbVar;
        this.zzg = zzfccVar;
        this.zzh = clock;
        this.zzi = zzavaVar;
    }

    public static final List zzf(int i, int i2, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zzj((String) it.next(), "@gw_mpe@", AbstractC3950lJ.p("2.", i2)));
        }
        return arrayList;
    }

    public static final List zzg(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zzj((String) it.next(), "@gw_adnetstatus@", str));
        }
        return arrayList;
    }

    public static final List zzh(List list, long j) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zzj((String) it.next(), "@gw_ttr@", Long.toString(j, 10)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public static String zzi(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return com.google.android.gms.ads.internal.util.client.zzl.zzk() ? "fakeForAdDebugLog" : str;
    }

    private static String zzj(String str, String str2, @Nullable String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    public final List zzc(zzfca zzfcaVar, @Nullable zzfbo zzfboVar, List list) {
        return zzd(zzfcaVar, zzfboVar, false, "", "", list);
    }

    public final List zzd(zzfca zzfcaVar, @Nullable zzfbo zzfboVar, boolean z, @Nullable String str, @Nullable String str2, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            boolean z2 = true;
            String strZzj = zzj(zzj(zzj((String) it.next(), "@gw_adlocid@", zzfcaVar.zza.zza.zzf), "@gw_adnetrefresh@", true != z ? "0" : "1"), "@gw_sdkver@", this.zzb);
            if (zzfboVar != null) {
                strZzj = zzbyk.zzc(zzj(zzj(zzj(strZzj, "@gw_qdata@", zzfboVar.zzy), "@gw_adnetid@", zzfboVar.zzx), "@gw_allocid@", zzfboVar.zzw), this.zze, zzfboVar.zzW, zzfboVar.zzaw);
            }
            String strZzj2 = zzj(zzj(zzj(zzj(strZzj, "@gw_adnetstatus@", this.zza.zzg()), "@gw_ttr@", Long.toString(this.zza.zza(), 10)), "@gw_seqnum@", this.zzc), "@gw_sessid@", this.zzd);
            boolean z3 = false;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdE)).booleanValue() && !TextUtils.isEmpty(str)) {
                z3 = true;
            }
            boolean z4 = !TextUtils.isEmpty(str2);
            if (z3) {
                z2 = z4;
            } else {
                if (z4) {
                }
                arrayList.add(strZzj2);
            }
            if (this.zzi.zzf(Uri.parse(strZzj2))) {
                Uri.Builder builderBuildUpon = Uri.parse(strZzj2).buildUpon();
                if (z3) {
                    builderBuildUpon = builderBuildUpon.appendQueryParameter("ms", str);
                }
                if (z2) {
                    builderBuildUpon = builderBuildUpon.appendQueryParameter("attok", str2);
                }
                strZzj2 = builderBuildUpon.build().toString();
            }
            arrayList.add(strZzj2);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0066 A[LOOP:0: B:13:0x0060->B:15:0x0066, LOOP_END] */
    public final List zze(zzfbo zzfboVar, List list, zzbvw zzbvwVar) {
        zzfcb zzfcbVar;
        zzful zzfulVarZzd;
        String str;
        String str2;
        Iterator it;
        ArrayList arrayList = new ArrayList();
        long jCurrentTimeMillis = this.zzh.currentTimeMillis();
        try {
            String strZzc = zzbvwVar.zzc();
            String string = Integer.toString(zzbvwVar.zzb());
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdF)).booleanValue()) {
                zzfcc zzfccVar = this.zzg;
                if (zzfccVar == null) {
                    zzfulVarZzd = zzful.zzc();
                } else {
                    zzfcbVar = zzfccVar.zza;
                }
                str = (String) zzfulVarZzd.zza(new zzfuc() { // from class: com.google.android.gms.internal.ads.zzfit
                    @Override // com.google.android.gms.internal.ads.zzfuc
                    public final Object apply(Object obj) {
                        return zzfiv.zzi(((zzfcb) obj).zza);
                    }
                }).zzb("");
                str2 = (String) zzfulVarZzd.zza(new zzfuc() { // from class: com.google.android.gms.internal.ads.zzfiu
                    @Override // com.google.android.gms.internal.ads.zzfuc
                    public final Object apply(Object obj) {
                        return zzfiv.zzi(((zzfcb) obj).zzb);
                    }
                }).zzb("");
                it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(zzbyk.zzc(zzj(zzj(zzj(zzj(zzj(zzj((String) it.next(), "@gw_rwd_userid@", Uri.encode(str)), "@gw_rwd_custom_data@", Uri.encode(str2)), "@gw_tmstmp@", Long.toString(jCurrentTimeMillis)), "@gw_rwd_itm@", Uri.encode(strZzc)), "@gw_rwd_amt@", string), "@gw_sdkver@", this.zzb), this.zze, zzfboVar.zzW, zzfboVar.zzaw));
                }
                return arrayList;
            }
            zzfcbVar = this.zzf;
            zzfulVarZzd = zzful.zzd(zzfcbVar);
            str = (String) zzfulVarZzd.zza(new zzfuc() { // from class: com.google.android.gms.internal.ads.zzfit
                @Override // com.google.android.gms.internal.ads.zzfuc
                public final Object apply(Object obj) {
                    return zzfiv.zzi(((zzfcb) obj).zza);
                }
            }).zzb("");
            str2 = (String) zzfulVarZzd.zza(new zzfuc() { // from class: com.google.android.gms.internal.ads.zzfiu
                @Override // com.google.android.gms.internal.ads.zzfuc
                public final Object apply(Object obj) {
                    return zzfiv.zzi(((zzfcb) obj).zzb);
                }
            }).zzb("");
            it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(zzbyk.zzc(zzj(zzj(zzj(zzj(zzj(zzj((String) it.next(), "@gw_rwd_userid@", Uri.encode(str)), "@gw_rwd_custom_data@", Uri.encode(str2)), "@gw_tmstmp@", Long.toString(jCurrentTimeMillis)), "@gw_rwd_itm@", Uri.encode(strZzc)), "@gw_rwd_amt@", string), "@gw_sdkver@", this.zzb), this.zze, zzfboVar.zzW, zzfboVar.zzaw));
            }
            return arrayList;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to determine award type and amount.", e);
            return arrayList;
        }
    }
}
