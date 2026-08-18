package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzw {
    final /* synthetic */ zzaa zza;
    private com.google.android.gms.internal.measurement.zzft zzb;
    private Long zzc;
    private long zzd;

    /* JADX WARN: Code duplicated, block: B:45:0x0106  */
    /* JADX WARN: Code duplicated, block: B:71:0x01e3  */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x00e7: MOVE (r5 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]) (LINE:232), block:B:34:0x00e7 */
    public final com.google.android.gms.internal.measurement.zzft zza(String str, com.google.android.gms.internal.measurement.zzft zzftVar) {
        Cursor cursor;
        Cursor cursorRawQuery;
        Cursor cursor2;
        Pair pairCreate;
        Object obj;
        String strZzh = zzftVar.zzh();
        List listZzi = zzftVar.zzi();
        this.zza.zzf.zzu();
        Long l = (Long) zzlj.zzD(zzftVar, "_eid");
        if (l != null) {
            if (strZzh.equals("_ep")) {
                Preconditions.checkNotNull(l);
                this.zza.zzf.zzu();
                String str2 = (String) zzlj.zzD(zzftVar, "_en");
                if (TextUtils.isEmpty(str2)) {
                    this.zza.zzt.zzaA().zzh().zzb("Extra parameter without an event name. eventId", l);
                    return null;
                }
                if (this.zzb == null || this.zzc == null || l.longValue() != this.zzc.longValue()) {
                    zzak zzakVarZzh = this.zza.zzf.zzh();
                    zzakVarZzh.zzg();
                    zzakVarZzh.zzW();
                    try {
                        try {
                            cursorRawQuery = zzakVarZzh.zzh().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l.toString()});
                            try {
                                if (cursorRawQuery.moveToFirst()) {
                                    try {
                                        pairCreate = Pair.create((com.google.android.gms.internal.measurement.zzft) ((com.google.android.gms.internal.measurement.zzfs) zzlj.zzm(com.google.android.gms.internal.measurement.zzft.zze(), cursorRawQuery.getBlob(0))).zzaD(), Long.valueOf(cursorRawQuery.getLong(1)));
                                        cursorRawQuery.close();
                                    } catch (IOException e) {
                                        zzakVarZzh.zzt.zzaA().zzd().zzd("Failed to merge main event. appId, eventId", zzet.zzn(str), l, e);
                                        cursorRawQuery.close();
                                        pairCreate = null;
                                    }
                                    if (pairCreate != null || (obj = pairCreate.first) == null) {
                                        this.zza.zzt.zzaA().zzh().zzc("Extra parameter without existing main event. eventName, eventId", str2, l);
                                        return null;
                                    }
                                    this.zzb = (com.google.android.gms.internal.measurement.zzft) obj;
                                    this.zzd = ((Long) pairCreate.second).longValue();
                                    this.zza.zzf.zzu();
                                    this.zzc = (Long) zzlj.zzD(this.zzb, "_eid");
                                } else {
                                    zzakVarZzh.zzt.zzaA().zzj().zza("Main event not found");
                                }
                            } catch (SQLiteException e2) {
                                e = e2;
                                zzakVarZzh.zzt.zzaA().zzd().zzb("Error selecting main event", e);
                                if (cursorRawQuery != null) {
                                }
                                pairCreate = null;
                                if (pairCreate != null) {
                                }
                                this.zza.zzt.zzaA().zzh().zzc("Extra parameter without existing main event. eventName, eventId", str2, l);
                                return null;
                            }
                        } catch (SQLiteException e3) {
                            e = e3;
                            cursorRawQuery = null;
                        } catch (Throwable th) {
                            th = th;
                            cursor = null;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                        cursorRawQuery.close();
                        pairCreate = null;
                        if (pairCreate != null) {
                        }
                        this.zza.zzt.zzaA().zzh().zzc("Extra parameter without existing main event. eventName, eventId", str2, l);
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = cursor2;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                long j = this.zzd - 1;
                this.zzd = j;
                if (j <= 0) {
                    zzak zzakVarZzh2 = this.zza.zzf.zzh();
                    zzakVarZzh2.zzg();
                    zzakVarZzh2.zzt.zzaA().zzj().zzb("Clearing complex main event info. appId", str);
                    try {
                        zzakVarZzh2.zzh().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                    } catch (SQLiteException e4) {
                        zzakVarZzh2.zzt.zzaA().zzd().zzb("Error clearing complex main event", e4);
                    }
                } else {
                    this.zza.zzf.zzh().zzJ(str, l, this.zzd, this.zzb);
                }
                ArrayList arrayList = new ArrayList();
                for (com.google.android.gms.internal.measurement.zzfx zzfxVar : this.zzb.zzi()) {
                    this.zza.zzf.zzu();
                    if (zzlj.zzC(zzftVar, zzfxVar.zzg()) == null) {
                        arrayList.add(zzfxVar);
                    }
                }
                if (arrayList.isEmpty()) {
                    this.zza.zzt.zzaA().zzh().zzb("No unique parameters in main event. eventName", str2);
                } else {
                    arrayList.addAll(listZzi);
                    listZzi = arrayList;
                }
                strZzh = str2;
            } else {
                this.zzc = l;
                this.zzb = zzftVar;
                this.zza.zzf.zzu();
                Object objZzD = zzlj.zzD(zzftVar, "_epc");
                long jLongValue = ((Long) (objZzD != null ? objZzD : 0L)).longValue();
                this.zzd = jLongValue;
                if (jLongValue <= 0) {
                    this.zza.zzt.zzaA().zzh().zzb("Complex event with zero extra param count. eventName", strZzh);
                } else {
                    this.zza.zzf.zzh().zzJ(str, (Long) Preconditions.checkNotNull(l), this.zzd, zzftVar);
                }
            }
        }
        com.google.android.gms.internal.measurement.zzfs zzfsVar = (com.google.android.gms.internal.measurement.zzfs) zzftVar.zzbB();
        zzfsVar.zzi(strZzh);
        zzfsVar.zzg();
        zzfsVar.zzd(listZzi);
        return (com.google.android.gms.internal.measurement.zzft) zzfsVar.zzaD();
    }
}
