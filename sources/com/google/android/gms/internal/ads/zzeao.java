package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeao extends zzeap {
    private static final SparseArray zzb;
    private final Context zzc;
    private final zzcuw zzd;
    private final TelephonyManager zze;
    private final zzeag zzf;
    private zzbbq.zzq zzg;

    static {
        SparseArray sparseArray = new SparseArray();
        zzb = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), zzbbq.zzaf.zzd.CONNECTED);
        int iOrdinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        zzbbq.zzaf.zzd zzdVar = zzbbq.zzaf.zzd.CONNECTING;
        sparseArray.put(iOrdinal, zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), zzbbq.zzaf.zzd.DISCONNECTING);
        int iOrdinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        zzbbq.zzaf.zzd zzdVar2 = zzbbq.zzaf.zzd.DISCONNECTED;
        sparseArray.put(iOrdinal2, zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), zzbbq.zzaf.zzd.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), zzdVar);
    }

    public zzeao(Context context, zzcuw zzcuwVar, zzeag zzeagVar, zzeac zzeacVar, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        super(zzeacVar, zzgVar);
        this.zzc = context;
        this.zzd = zzcuwVar;
        this.zzf = zzeagVar;
        this.zze = (TelephonyManager) context.getSystemService("phone");
    }

    public static /* bridge */ /* synthetic */ zzbbq.zzab zza(zzeao zzeaoVar, Bundle bundle) {
        zzbbq.zzab.zzb zzbVar;
        zzbbq.zzab.zza zzaVarZza = zzbbq.zzab.zza();
        int i = bundle.getInt("cnt", -2);
        int i2 = bundle.getInt("gnt", 0);
        if (i == -1) {
            zzeaoVar.zzg = zzbbq.zzq.ENUM_TRUE;
        } else {
            zzeaoVar.zzg = zzbbq.zzq.ENUM_FALSE;
            if (i == 0) {
                zzaVarZza.zzd(zzbbq.zzab.zzc.CELL);
            } else if (i != 1) {
                zzaVarZza.zzd(zzbbq.zzab.zzc.NETWORKTYPE_UNSPECIFIED);
            } else {
                zzaVarZza.zzd(zzbbq.zzab.zzc.WIFI);
            }
            switch (i2) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    zzbVar = zzbbq.zzab.zzb.TWO_G;
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    zzbVar = zzbbq.zzab.zzb.THREE_G;
                    break;
                case 13:
                    zzbVar = zzbbq.zzab.zzb.LTE;
                    break;
                default:
                    zzbVar = zzbbq.zzab.zzb.CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                    break;
            }
            zzaVarZza.zzc(zzbVar);
        }
        return zzaVarZza.zzbr();
    }

    public static /* bridge */ /* synthetic */ zzbbq.zzaf.zzd zzb(zzeao zzeaoVar, Bundle bundle) {
        return (zzbbq.zzaf.zzd) zzb.get(zzfcx.zza(zzfcx.zza(bundle, "device"), "network").getInt("active_network_state", -1), zzbbq.zzaf.zzd.UNSPECIFIED);
    }

    public static /* bridge */ /* synthetic */ byte[] zze(zzeao zzeaoVar, boolean z, ArrayList arrayList, zzbbq.zzab zzabVar, zzbbq.zzaf.zzd zzdVar) {
        zzbbq.zzaf.zza.C0138zza c0138zzaZzn = zzbbq.zzaf.zza.zzn();
        c0138zzaZzn.zzn(arrayList);
        c0138zzaZzn.zzD(zzg(Settings.Global.getInt(zzeaoVar.zzc.getContentResolver(), "airplane_mode_on", 0) != 0));
        c0138zzaZzn.zzE(com.google.android.gms.ads.internal.zzv.zzr().zzg(zzeaoVar.zzc, zzeaoVar.zze));
        c0138zzaZzn.zzM(zzeaoVar.zzf.zze());
        c0138zzaZzn.zzL(zzeaoVar.zzf.zzb());
        c0138zzaZzn.zzG(zzeaoVar.zzf.zza());
        c0138zzaZzn.zzH(zzdVar);
        c0138zzaZzn.zzJ(zzabVar);
        c0138zzaZzn.zzK(zzeaoVar.zzg);
        c0138zzaZzn.zzN(zzg(z));
        c0138zzaZzn.zzP(zzeaoVar.zzf.zzd());
        c0138zzaZzn.zzO(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis());
        c0138zzaZzn.zzQ(zzg(Settings.Global.getInt(zzeaoVar.zzc.getContentResolver(), "wifi_on", 0) != 0));
        return c0138zzaZzn.zzbr().zzaV();
    }

    private static final zzbbq.zzq zzg(boolean z) {
        return z ? zzbbq.zzq.ENUM_TRUE : zzbbq.zzq.ENUM_FALSE;
    }

    public final void zzd(boolean z) {
        zzgch.zzr(this.zzd.zzb(new Bundle()), new zzean(this, z), zzbzw.zzg);
    }
}
