package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2390Ej;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzean implements zzgcd {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzeao zzb;

    public zzean(zzeao zzeaoVar, boolean z) {
        this.zza = z;
        this.zzb = zzeaoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to get signals bundle");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x005d  */
    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0076  */
    /* JADX WARN: Code duplicated, block: B:28:0x0078  */
    /* JADX WARN: Code duplicated, block: B:30:0x0080  */
    /* JADX WARN: Code duplicated, block: B:31:0x0082  */
    /* JADX WARN: Code duplicated, block: B:33:0x008a  */
    /* JADX WARN: Code duplicated, block: B:34:0x008c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0094  */
    /* JADX WARN: Code duplicated, block: B:37:0x0096  */
    /* JADX WARN: Code duplicated, block: B:39:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x009b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x009f  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ab  */
    @Override // com.google.android.gms.internal.ads.zzgcd
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List listEmptyList;
        List listAsList;
        final ArrayList arrayList;
        Iterator it;
        byte b;
        zzbbq.zzd.zza zzaVar;
        zzcuv zzcuvVar = (zzcuv) obj;
        if (this.zzb.zzf()) {
            return;
        }
        Bundle bundle = zzcuvVar.zza;
        Object obj2 = bundle.get("ad_types");
        if (!(obj2 instanceof List)) {
            if (obj2 instanceof String[]) {
                listAsList = Arrays.asList((String[]) obj2);
            } else {
                listEmptyList = Collections.emptyList();
            }
            arrayList = new ArrayList();
            it = listEmptyList.iterator();
            while (it.hasNext()) {
                switch ((String) it.next()) {
                    case "banner":
                        b = 0;
                        break;
                    case "native":
                        b = 2;
                        break;
                    case "rewarded":
                        b = 3;
                        break;
                    case "interstitial":
                        b = 1;
                        break;
                    default:
                        b = -1;
                        break;
                }
                if (b != 0) {
                    zzaVar = zzbbq.zzd.zza.BANNER;
                } else if (b != 1) {
                    zzaVar = zzbbq.zzd.zza.INTERSTITIAL;
                } else if (b != 2) {
                    zzaVar = zzbbq.zzd.zza.NATIVE_APP_INSTALL;
                } else if (b != 3) {
                    zzaVar = zzbbq.zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
                } else {
                    zzaVar = zzbbq.zzd.zza.REWARD_BASED_VIDEO_AD;
                }
                arrayList.add(zzaVar);
            }
            final zzbbq.zzaf.zzd zzdVarZzb = zzeao.zzb(this.zzb, bundle);
            final zzbbq.zzab zzabVarZza = zzeao.zza(this.zzb, bundle);
            zzeao zzeaoVar = this.zzb;
            final boolean z = this.zza;
            zzeaoVar.zza.zza(new zzffr() { // from class: com.google.android.gms.internal.ads.zzeam
                @Override // com.google.android.gms.internal.ads.zzffr
                public final Object zza(Object obj3) {
                    zzean zzeanVar = this.zza;
                    SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj3;
                    if (zzeanVar.zzb.zzf()) {
                        return null;
                    }
                    zzbbq.zzaf.zzd zzdVar = zzdVarZzb;
                    zzbbq.zzab zzabVar = zzabVarZza;
                    ArrayList arrayList2 = arrayList;
                    boolean z2 = z;
                    byte[] bArrZze = zzeao.zze(zzeanVar.zzb, z2, arrayList2, zzabVar, zzdVar);
                    zzear.zzf(sQLiteDatabase, z2, true);
                    zzear.zzc(sQLiteDatabase, zzeanVar.zzb.zzf.zzd(), bArrZze);
                    return null;
                }
            });
        }
        listAsList = (List) obj2;
        ArrayList arrayList2 = new ArrayList(listAsList.size());
        for (Object obj3 : listAsList) {
            if (obj3 instanceof String) {
                arrayList2.add((String) obj3);
            }
        }
        listEmptyList = Collections.unmodifiableList(arrayList2);
        arrayList = new ArrayList();
        it = listEmptyList.iterator();
        while (it.hasNext()) {
            switch ((String) it.next()) {
                case -1396342996:
                    if (!r1.equals("banner")) {
                        b = 0;
                    } else {
                        b = -1;
                    }
                    break;
                case -1052618729:
                    if (!r1.equals("native")) {
                        b = 2;
                    } else {
                        b = -1;
                    }
                    break;
                case -239580146:
                    if (!r1.equals(C2390Ej.PLACEMENT_TYPE_REWARDED)) {
                        b = 3;
                    } else {
                        b = -1;
                    }
                    break;
                case 604727084:
                    if (!r1.equals(C2390Ej.PLACEMENT_TYPE_INTERSTITIAL)) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b != 0) {
                zzaVar = zzbbq.zzd.zza.BANNER;
            } else if (b != 1) {
                zzaVar = zzbbq.zzd.zza.INTERSTITIAL;
            } else if (b != 2) {
                zzaVar = zzbbq.zzd.zza.NATIVE_APP_INSTALL;
            } else if (b != 3) {
                zzaVar = zzbbq.zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
            } else {
                zzaVar = zzbbq.zzd.zza.REWARD_BASED_VIDEO_AD;
            }
            arrayList.add(zzaVar);
        }
        final zzbbq.zzaf.zzd zzdVarZzb2 = zzeao.zzb(this.zzb, bundle);
        final zzbbq.zzab zzabVarZza2 = zzeao.zza(this.zzb, bundle);
        zzeao zzeaoVar2 = this.zzb;
        final boolean z2 = this.zza;
        zzeaoVar2.zza.zza(new zzffr() { // from class: com.google.android.gms.internal.ads.zzeam
            @Override // com.google.android.gms.internal.ads.zzffr
            public final Object zza(Object obj4) {
                zzean zzeanVar = this.zza;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj4;
                if (zzeanVar.zzb.zzf()) {
                    return null;
                }
                zzbbq.zzaf.zzd zzdVar = zzdVarZzb2;
                zzbbq.zzab zzabVar = zzabVarZza2;
                ArrayList arrayList3 = arrayList;
                boolean z3 = z2;
                byte[] bArrZze = zzeao.zze(zzeanVar.zzb, z3, arrayList3, zzabVar, zzdVar);
                zzear.zzf(sQLiteDatabase, z3, true);
                zzear.zzc(sQLiteDatabase, zzeanVar.zzb.zzf.zzd(), bArrZze);
                return null;
            }
        });
    }
}
