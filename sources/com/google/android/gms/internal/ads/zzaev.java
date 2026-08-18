package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzaev extends zzaex {
    private long zzb;
    private long[] zzc;
    private long[] zzd;

    public zzaev() {
        super(new zzaci());
        this.zzb = C.TIME_UNSET;
        this.zzc = new long[0];
        this.zzd = new long[0];
    }

    private static Double zzg(zzdy zzdyVar) {
        return Double.valueOf(Double.longBitsToDouble(zzdyVar.zzt()));
    }

    @Nullable
    private static Object zzh(zzdy zzdyVar, int i) {
        if (i == 0) {
            return zzg(zzdyVar);
        }
        if (i == 1) {
            return Boolean.valueOf(zzdyVar.zzm() == 1);
        }
        if (i == 2) {
            return zzi(zzdyVar);
        }
        if (i != 3) {
            if (i == 8) {
                return zzj(zzdyVar);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) zzg(zzdyVar).doubleValue());
                zzdyVar.zzM(2);
                return date;
            }
            int iZzp = zzdyVar.zzp();
            ArrayList arrayList = new ArrayList(iZzp);
            for (int i2 = 0; i2 < iZzp; i2++) {
                Object objZzh = zzh(zzdyVar, zzdyVar.zzm());
                if (objZzh != null) {
                    arrayList.add(objZzh);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strZzi = zzi(zzdyVar);
            int iZzm = zzdyVar.zzm();
            if (iZzm == 9) {
                return map;
            }
            Object objZzh2 = zzh(zzdyVar, iZzm);
            if (objZzh2 != null) {
                map.put(strZzi, objZzh2);
            }
        }
    }

    private static String zzi(zzdy zzdyVar) {
        int iZzq = zzdyVar.zzq();
        int iZzd = zzdyVar.zzd();
        zzdyVar.zzM(iZzq);
        return new String(zzdyVar.zzN(), iZzd, iZzq);
    }

    private static HashMap zzj(zzdy zzdyVar) {
        int iZzp = zzdyVar.zzp();
        HashMap map = new HashMap(iZzp);
        for (int i = 0; i < iZzp; i++) {
            String strZzi = zzi(zzdyVar);
            Object objZzh = zzh(zzdyVar, zzdyVar.zzm());
            if (objZzh != null) {
                map.put(strZzi, objZzh);
            }
        }
        return map;
    }

    @Override // com.google.android.gms.internal.ads.zzaex
    public final boolean zza(zzdy zzdyVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaex
    public final boolean zzb(zzdy zzdyVar, long j) {
        if (zzdyVar.zzm() == 2 && "onMetaData".equals(zzi(zzdyVar)) && zzdyVar.zzb() != 0 && zzdyVar.zzm() == 8) {
            HashMap mapZzj = zzj(zzdyVar);
            Object obj = mapZzj.get("duration");
            if (obj instanceof Double) {
                double dDoubleValue = ((Double) obj).doubleValue();
                if (dDoubleValue > 0.0d) {
                    this.zzb = (long) (dDoubleValue * 1000000.0d);
                }
            }
            Object obj2 = mapZzj.get("keyframes");
            if (obj2 instanceof Map) {
                Map map = (Map) obj2;
                Object obj3 = map.get("filepositions");
                Object obj4 = map.get("times");
                if ((obj3 instanceof List) && (obj4 instanceof List)) {
                    List list = (List) obj3;
                    List list2 = (List) obj4;
                    int size = list2.size();
                    this.zzc = new long[size];
                    this.zzd = new long[size];
                    for (int i = 0; i < size; i++) {
                        Object obj5 = list.get(i);
                        Object obj6 = list2.get(i);
                        if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                            this.zzc = new long[0];
                            this.zzd = new long[0];
                            break;
                        }
                        this.zzc[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.zzd[i] = ((Double) obj5).longValue();
                    }
                }
            }
        }
        return false;
    }

    public final long zzc() {
        return this.zzb;
    }

    public final long[] zzd() {
        return this.zzd;
    }

    public final long[] zze() {
        return this.zzc;
    }
}
