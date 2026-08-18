package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.webkit.ProxyConfig;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzop;
import com.google.android.gms.internal.measurement.zzpz;
import com.google.android.gms.internal.measurement.zzqu;
import com.google.android.gms.internal.measurement.zzrd;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.umeng.analytics.pro.f;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzak extends zzku {
    private static final String[] zza = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    private static final String[] zzb = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    private static final String[] zzc = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;"};
    private static final String[] zzd = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    private static final String[] zze = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    private static final String[] zzg = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzh = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzi = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    private final zzaj zzj;
    private final zzkq zzk;

    public zzak(zzlh zzlhVar) {
        super(zzlhVar);
        this.zzk = new zzkq(this.zzt.zzax());
        this.zzt.zzf();
        this.zzj = new zzaj(this, this.zzt.zzaw(), "google_app_measurement.db");
    }

    @WorkerThread
    public static final void zzV(ContentValues contentValues, String str, Object obj) {
        Preconditions.checkNotEmpty(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        Preconditions.checkNotNull(obj);
        if (obj instanceof String) {
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, (Double) obj);
        }
    }

    @WorkerThread
    private final long zzZ(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = zzh().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j;
            } catch (SQLiteException e) {
                this.zzt.zzaA().zzd().zzc("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    @WorkerThread
    private final long zzaa(String str, String[] strArr, long j) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = zzh().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return j;
                }
                long j2 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j2;
            } catch (SQLiteException e) {
                this.zzt.zzaA().zzd().zzc("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        throw th;
    }

    @WorkerThread
    public final void zzA(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzW();
        try {
            zzh().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            this.zzt.zzaA().zzd().zzd("Error deleting user property. appId", zzet.zzn(str), this.zzt.zzj().zzf(str2), e);
        }
    }

    @WorkerThread
    public final void zzB(String str, List list) {
        Iterator it;
        boolean z;
        String str2 = "app_id=? and audience_id=?";
        Preconditions.checkNotNull(list);
        int i = 0;
        while (i < list.size()) {
            com.google.android.gms.internal.measurement.zzeh zzehVar = (com.google.android.gms.internal.measurement.zzeh) ((com.google.android.gms.internal.measurement.zzei) list.get(i)).zzbB();
            if (zzehVar.zza() != 0) {
                int i2 = 0;
                while (i2 < zzehVar.zza()) {
                    com.google.android.gms.internal.measurement.zzej zzejVar = (com.google.android.gms.internal.measurement.zzej) zzehVar.zze(i2).zzbB();
                    com.google.android.gms.internal.measurement.zzej zzejVar2 = (com.google.android.gms.internal.measurement.zzej) zzejVar.clone();
                    String strZzb = zzhc.zzb(zzejVar.zze());
                    if (strZzb != null) {
                        zzejVar2.zzb(strZzb);
                        z = true;
                    } else {
                        z = false;
                    }
                    int i3 = 0;
                    while (i3 < zzejVar.zza()) {
                        com.google.android.gms.internal.measurement.zzem zzemVarZzd = zzejVar.zzd(i3);
                        com.google.android.gms.internal.measurement.zzej zzejVar3 = zzejVar;
                        String str3 = str2;
                        String strZzb2 = zziq.zzb(zzemVarZzd.zze(), zzhd.zza, zzhd.zzb);
                        if (strZzb2 != null) {
                            com.google.android.gms.internal.measurement.zzel zzelVar = (com.google.android.gms.internal.measurement.zzel) zzemVarZzd.zzbB();
                            zzelVar.zza(strZzb2);
                            zzejVar2.zzc(i3, (com.google.android.gms.internal.measurement.zzem) zzelVar.zzaD());
                            z = true;
                        }
                        i3++;
                        zzejVar = zzejVar3;
                        str2 = str3;
                    }
                    String str4 = str2;
                    if (z) {
                        zzehVar.zzc(i2, zzejVar2);
                        list.set(i, (com.google.android.gms.internal.measurement.zzei) zzehVar.zzaD());
                    }
                    i2++;
                    str2 = str4;
                }
            }
            String str5 = str2;
            if (zzehVar.zzb() != 0) {
                for (int i4 = 0; i4 < zzehVar.zzb(); i4++) {
                    com.google.android.gms.internal.measurement.zzet zzetVarZzf = zzehVar.zzf(i4);
                    String strZzb3 = zziq.zzb(zzetVarZzf.zze(), zzhe.zza, zzhe.zzb);
                    if (strZzb3 != null) {
                        com.google.android.gms.internal.measurement.zzes zzesVar = (com.google.android.gms.internal.measurement.zzes) zzetVarZzf.zzbB();
                        zzesVar.zza(strZzb3);
                        zzehVar.zzd(i4, zzesVar);
                        list.set(i, (com.google.android.gms.internal.measurement.zzei) zzehVar.zzaD());
                    }
                }
            }
            i++;
            str2 = str5;
        }
        String str6 = str2;
        zzW();
        zzg();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        SQLiteDatabase sQLiteDatabaseZzh = zzh();
        sQLiteDatabaseZzh.beginTransaction();
        try {
            zzW();
            zzg();
            Preconditions.checkNotEmpty(str);
            SQLiteDatabase sQLiteDatabaseZzh2 = zzh();
            sQLiteDatabaseZzh2.delete("property_filters", "app_id=?", new String[]{str});
            sQLiteDatabaseZzh2.delete("event_filters", "app_id=?", new String[]{str});
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                com.google.android.gms.internal.measurement.zzei zzeiVar = (com.google.android.gms.internal.measurement.zzei) it2.next();
                zzW();
                zzg();
                Preconditions.checkNotEmpty(str);
                Preconditions.checkNotNull(zzeiVar);
                if (zzeiVar.zzk()) {
                    int iZza = zzeiVar.zza();
                    Iterator it3 = zzeiVar.zzg().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (!((com.google.android.gms.internal.measurement.zzek) it3.next()).zzp()) {
                                this.zzt.zzaA().zzk().zzc("Event filter with no ID. Audience definition ignored. appId, audienceId", zzet.zzn(str), Integer.valueOf(iZza));
                                break;
                            }
                        } else {
                            Iterator it4 = zzeiVar.zzh().iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    Iterator it5 = zzeiVar.zzg().iterator();
                                    while (true) {
                                        if (!it5.hasNext()) {
                                            it = it2;
                                            Iterator it6 = zzeiVar.zzh().iterator();
                                            while (it6.hasNext()) {
                                                com.google.android.gms.internal.measurement.zzet zzetVar = (com.google.android.gms.internal.measurement.zzet) it6.next();
                                                zzW();
                                                zzg();
                                                Preconditions.checkNotEmpty(str);
                                                Preconditions.checkNotNull(zzetVar);
                                                if (zzetVar.zze().isEmpty()) {
                                                    this.zzt.zzaA().zzk().zzd("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", zzet.zzn(str), Integer.valueOf(iZza), String.valueOf(zzetVar.zzj() ? Integer.valueOf(zzetVar.zza()) : null));
                                                } else {
                                                    byte[] bArrZzbx = zzetVar.zzbx();
                                                    ContentValues contentValues = new ContentValues();
                                                    contentValues.put("app_id", str);
                                                    contentValues.put("audience_id", Integer.valueOf(iZza));
                                                    contentValues.put("filter_id", zzetVar.zzj() ? Integer.valueOf(zzetVar.zza()) : null);
                                                    Iterator it7 = it6;
                                                    contentValues.put("property_name", zzetVar.zze());
                                                    contentValues.put("session_scoped", zzetVar.zzk() ? Boolean.valueOf(zzetVar.zzi()) : null);
                                                    contentValues.put("data", bArrZzbx);
                                                    try {
                                                        if (zzh().insertWithOnConflict("property_filters", null, contentValues, 5) == -1) {
                                                            this.zzt.zzaA().zzd().zzb("Failed to insert property filter (got -1). appId", zzet.zzn(str));
                                                        } else {
                                                            it6 = it7;
                                                        }
                                                    } catch (SQLiteException e) {
                                                        this.zzt.zzaA().zzd().zzc("Error storing property filter. appId", zzet.zzn(str), e);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        com.google.android.gms.internal.measurement.zzek zzekVar = (com.google.android.gms.internal.measurement.zzek) it5.next();
                                        zzW();
                                        zzg();
                                        Preconditions.checkNotEmpty(str);
                                        Preconditions.checkNotNull(zzekVar);
                                        if (!zzekVar.zzg().isEmpty()) {
                                            byte[] bArrZzbx2 = zzekVar.zzbx();
                                            it = it2;
                                            ContentValues contentValues2 = new ContentValues();
                                            contentValues2.put("app_id", str);
                                            contentValues2.put("audience_id", Integer.valueOf(iZza));
                                            contentValues2.put("filter_id", zzekVar.zzp() ? Integer.valueOf(zzekVar.zzb()) : null);
                                            contentValues2.put("event_name", zzekVar.zzg());
                                            contentValues2.put("session_scoped", zzekVar.zzq() ? Boolean.valueOf(zzekVar.zzn()) : null);
                                            contentValues2.put("data", bArrZzbx2);
                                            try {
                                                if (zzh().insertWithOnConflict("event_filters", null, contentValues2, 5) == -1) {
                                                    this.zzt.zzaA().zzd().zzb("Failed to insert event filter (got -1). appId", zzet.zzn(str));
                                                }
                                                it2 = it;
                                            } catch (SQLiteException e2) {
                                                this.zzt.zzaA().zzd().zzc("Error storing event filter. appId", zzet.zzn(str), e2);
                                                zzW();
                                                zzg();
                                                Preconditions.checkNotEmpty(str);
                                                SQLiteDatabase sQLiteDatabaseZzh3 = zzh();
                                                String str7 = str6;
                                                sQLiteDatabaseZzh3.delete("property_filters", str7, new String[]{str, String.valueOf(iZza)});
                                                sQLiteDatabaseZzh3.delete("event_filters", str7, new String[]{str, String.valueOf(iZza)});
                                                str6 = str7;
                                                it2 = it;
                                                break;
                                            }
                                        } else {
                                            this.zzt.zzaA().zzk().zzd("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", zzet.zzn(str), Integer.valueOf(iZza), String.valueOf(zzekVar.zzp() ? Integer.valueOf(zzekVar.zzb()) : null));
                                            it = it2;
                                        }
                                        zzW();
                                        zzg();
                                        Preconditions.checkNotEmpty(str);
                                        SQLiteDatabase sQLiteDatabaseZzh4 = zzh();
                                        String str8 = str6;
                                        sQLiteDatabaseZzh4.delete("property_filters", str8, new String[]{str, String.valueOf(iZza)});
                                        sQLiteDatabaseZzh4.delete("event_filters", str8, new String[]{str, String.valueOf(iZza)});
                                        str6 = str8;
                                        break;
                                    }
                                    it2 = it;
                                    break;
                                }
                                if (!((com.google.android.gms.internal.measurement.zzet) it4.next()).zzj()) {
                                    this.zzt.zzaA().zzk().zzc("Property filter with no ID. Audience definition ignored. appId, audienceId", zzet.zzn(str), Integer.valueOf(iZza));
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    this.zzt.zzaA().zzk().zzb("Audience with no ID. appId", zzet.zzn(str));
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                com.google.android.gms.internal.measurement.zzei zzeiVar2 = (com.google.android.gms.internal.measurement.zzei) it8.next();
                arrayList.add(zzeiVar2.zzk() ? Integer.valueOf(zzeiVar2.zza()) : null);
            }
            Preconditions.checkNotEmpty(str);
            zzW();
            zzg();
            SQLiteDatabase sQLiteDatabaseZzh5 = zzh();
            try {
                long jZzZ = zzZ("select count(1) from audience_filter_values where app_id=?", new String[]{str});
                int iMax = Math.max(0, Math.min(2000, this.zzt.zzf().zze(str, zzeg.zzF)));
                if (jZzZ > iMax) {
                    ArrayList arrayList2 = new ArrayList();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= arrayList.size()) {
                            sQLiteDatabaseZzh5.delete("audience_filter_values", "audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in " + ("(" + TextUtils.join(",", arrayList2) + ")") + " order by rowid desc limit -1 offset ?)", new String[]{str, Integer.toString(iMax)});
                            break;
                        }
                        Integer num = (Integer) arrayList.get(i5);
                        if (num == null) {
                            break;
                        }
                        arrayList2.add(Integer.toString(num.intValue()));
                        i5++;
                    }
                }
            } catch (SQLiteException e3) {
                this.zzt.zzaA().zzd().zzc("Database error querying filters. appId", zzet.zzn(str), e3);
            }
            sQLiteDatabaseZzh.setTransactionSuccessful();
            sQLiteDatabaseZzh.endTransaction();
        } catch (Throwable th) {
            sQLiteDatabaseZzh.endTransaction();
            throw th;
        }
    }

    @WorkerThread
    public final void zzC() {
        zzW();
        zzh().setTransactionSuccessful();
    }

    @WorkerThread
    public final void zzD(zzh zzhVar) {
        Preconditions.checkNotNull(zzhVar);
        zzg();
        zzW();
        String strZzv = zzhVar.zzv();
        Preconditions.checkNotNull(strZzv);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", strZzv);
        contentValues.put("app_instance_id", zzhVar.zzw());
        contentValues.put("gmp_app_id", zzhVar.zzA());
        contentValues.put("resettable_device_id_hash", zzhVar.zzC());
        contentValues.put("last_bundle_index", Long.valueOf(zzhVar.zzo()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(zzhVar.zzp()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(zzhVar.zzn()));
        contentValues.put("app_version", zzhVar.zzy());
        contentValues.put("app_store", zzhVar.zzx());
        contentValues.put("gmp_version", Long.valueOf(zzhVar.zzm()));
        contentValues.put("dev_cert_hash", Long.valueOf(zzhVar.zzj()));
        contentValues.put("measurement_enabled", Boolean.valueOf(zzhVar.zzan()));
        contentValues.put("day", Long.valueOf(zzhVar.zzi()));
        contentValues.put("daily_public_events_count", Long.valueOf(zzhVar.zzg()));
        contentValues.put("daily_events_count", Long.valueOf(zzhVar.zzf()));
        contentValues.put("daily_conversions_count", Long.valueOf(zzhVar.zzd()));
        contentValues.put("config_fetched_time", Long.valueOf(zzhVar.zzc()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(zzhVar.zzl()));
        contentValues.put("app_version_int", Long.valueOf(zzhVar.zzb()));
        contentValues.put("firebase_instance_id", zzhVar.zzz());
        contentValues.put("daily_error_events_count", Long.valueOf(zzhVar.zze()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(zzhVar.zzh()));
        contentValues.put("health_monitor_sample", zzhVar.zzB());
        zzhVar.zza();
        contentValues.put("android_id", (Long) 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(zzhVar.zzam()));
        contentValues.put("admob_app_id", zzhVar.zzt());
        contentValues.put("dynamite_version", Long.valueOf(zzhVar.zzk()));
        contentValues.put("session_stitching_token", zzhVar.zzD());
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(zzhVar.zzap()));
        contentValues.put("target_os_version", Long.valueOf(zzhVar.zzr()));
        contentValues.put("session_stitching_token_hash", Long.valueOf(zzhVar.zzq()));
        List listZzE = zzhVar.zzE();
        if (listZzE != null) {
            if (listZzE.isEmpty()) {
                this.zzt.zzaA().zzk().zzb("Safelisted events should not be an empty list. appId", strZzv);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", listZzE));
            }
        }
        zzop.zzc();
        if (this.zzt.zzf().zzs(null, zzeg.zzak) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        try {
            SQLiteDatabase sQLiteDatabaseZzh = zzh();
            if (sQLiteDatabaseZzh.update("apps", contentValues, "app_id = ?", new String[]{strZzv}) == 0 && sQLiteDatabaseZzh.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                this.zzt.zzaA().zzd().zzb("Failed to insert/update app (got -1). appId", zzet.zzn(strZzv));
            }
        } catch (SQLiteException e) {
            this.zzt.zzaA().zzd().zzc("Error storing app. appId", zzet.zzn(strZzv), e);
        }
    }

    @WorkerThread
    public final void zzE(zzaq zzaqVar) {
        Preconditions.checkNotNull(zzaqVar);
        zzg();
        zzW();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzaqVar.zza);
        contentValues.put("name", zzaqVar.zzb);
        contentValues.put("lifetime_count", Long.valueOf(zzaqVar.zzc));
        contentValues.put("current_bundle_count", Long.valueOf(zzaqVar.zzd));
        contentValues.put("last_fire_timestamp", Long.valueOf(zzaqVar.zzf));
        contentValues.put("last_bundled_timestamp", Long.valueOf(zzaqVar.zzg));
        contentValues.put("last_bundled_day", zzaqVar.zzh);
        contentValues.put("last_sampled_complex_event_id", zzaqVar.zzi);
        contentValues.put("last_sampling_rate", zzaqVar.zzj);
        contentValues.put("current_session_count", Long.valueOf(zzaqVar.zze));
        Boolean bool = zzaqVar.zzk;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (zzh().insertWithOnConflict(f.ax, null, contentValues, 5) == -1) {
                this.zzt.zzaA().zzd().zzb("Failed to insert/update event aggregates (got -1). appId", zzet.zzn(zzaqVar.zza));
            }
        } catch (SQLiteException e) {
            this.zzt.zzaA().zzd().zzc("Error storing event aggregates. appId", zzet.zzn(zzaqVar.zza), e);
        }
    }

    public final boolean zzF() {
        return zzZ("select count(1) > 0 from raw_events", null) != 0;
    }

    public final boolean zzG() {
        return zzZ("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    public final boolean zzH() {
        return zzZ("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    @VisibleForTesting
    public final boolean zzI() {
        Context contextZzaw = this.zzt.zzaw();
        this.zzt.zzf();
        return contextZzaw.getDatabasePath("google_app_measurement.db").exists();
    }

    public final boolean zzJ(String str, Long l, long j, com.google.android.gms.internal.measurement.zzft zzftVar) {
        zzg();
        zzW();
        Preconditions.checkNotNull(zzftVar);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(l);
        byte[] bArrZzbx = zzftVar.zzbx();
        this.zzt.zzaA().zzj().zzc("Saving complex main event, appId, data size", this.zzt.zzj().zzd(str), Integer.valueOf(bArrZzbx.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", bArrZzbx);
        try {
            if (zzh().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            this.zzt.zzaA().zzd().zzb("Failed to insert complex main event (got -1). appId", zzet.zzn(str));
            return false;
        } catch (SQLiteException e) {
            this.zzt.zzaA().zzd().zzc("Error storing complex main event. appId", zzet.zzn(str), e);
            return false;
        }
    }

    @WorkerThread
    public final boolean zzK(zzac zzacVar) {
        Preconditions.checkNotNull(zzacVar);
        zzg();
        zzW();
        String str = zzacVar.zza;
        Preconditions.checkNotNull(str);
        if (zzp(str, zzacVar.zzc.zzb) == null) {
            long jZzZ = zzZ("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            this.zzt.zzf();
            if (jZzZ >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", zzacVar.zzb);
        contentValues.put("name", zzacVar.zzc.zzb);
        zzV(contentValues, AppMeasurementSdk.ConditionalUserProperty.VALUE, Preconditions.checkNotNull(zzacVar.zzc.zza()));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.valueOf(zzacVar.zze));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, zzacVar.zzf);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.valueOf(zzacVar.zzh));
        contentValues.put("timed_out_event", this.zzt.zzv().zzap(zzacVar.zzg));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.valueOf(zzacVar.zzd));
        contentValues.put("triggered_event", this.zzt.zzv().zzap(zzacVar.zzi));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.valueOf(zzacVar.zzc.zzc));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.valueOf(zzacVar.zzj));
        contentValues.put("expired_event", this.zzt.zzv().zzap(zzacVar.zzk));
        try {
            if (zzh().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            this.zzt.zzaA().zzd().zzb("Failed to insert/update conditional user property (got -1)", zzet.zzn(str));
            return true;
        } catch (SQLiteException e) {
            this.zzt.zzaA().zzd().zzc("Error storing conditional user property", zzet.zzn(str), e);
            return true;
        }
    }

    @WorkerThread
    public final boolean zzL(zzlm zzlmVar) {
        Preconditions.checkNotNull(zzlmVar);
        zzg();
        zzW();
        if (zzp(zzlmVar.zza, zzlmVar.zzc) == null) {
            if (zzlp.zzak(zzlmVar.zzc)) {
                if (zzZ("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{zzlmVar.zza}) >= this.zzt.zzf().zzf(zzlmVar.zza, zzeg.zzG, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(zzlmVar.zzc)) {
                long jZzZ = zzZ("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{zzlmVar.zza, zzlmVar.zzb});
                this.zzt.zzf();
                if (jZzZ >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzlmVar.zza);
        contentValues.put("origin", zzlmVar.zzb);
        contentValues.put("name", zzlmVar.zzc);
        contentValues.put("set_timestamp", Long.valueOf(zzlmVar.zzd));
        zzV(contentValues, AppMeasurementSdk.ConditionalUserProperty.VALUE, zzlmVar.zze);
        try {
            if (zzh().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            this.zzt.zzaA().zzd().zzb("Failed to insert/update user property (got -1). appId", zzet.zzn(zzlmVar.zza));
            return true;
        } catch (SQLiteException e) {
            this.zzt.zzaA().zzd().zzc("Error storing user property. appId", zzet.zzn(zzlmVar.zza), e);
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:83:0x021b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v2 */
    public final void zzU(String str, long j, long j2, zzle zzleVar) throws Throwable {
        String string;
        char c;
        char c2;
        String[] strArr;
        String str2;
        ?? r3 = "select app_id, metadata_fingerprint from raw_events where ";
        Preconditions.checkNotNull(zzleVar);
        zzg();
        zzW();
        ?? r4 = 0;
        String string2 = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseZzh = zzh();
                try {
                    if (TextUtils.isEmpty(null)) {
                        Cursor cursorRawQuery = sQLiteDatabaseZzh.rawQuery("select app_id, metadata_fingerprint from raw_events where " + (j2 != -1 ? "rowid <= ? and " : "") + "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;", j2 != -1 ? new String[]{String.valueOf(j2), String.valueOf(j)} : new String[]{String.valueOf(j)});
                        if (!cursorRawQuery.moveToFirst()) {
                            cursorRawQuery.close();
                            return;
                        } else {
                            string2 = cursorRawQuery.getString(0);
                            string = cursorRawQuery.getString(1);
                            cursorRawQuery.close();
                        }
                    } else {
                        Cursor cursorRawQuery2 = sQLiteDatabaseZzh.rawQuery("select metadata_fingerprint from raw_events where app_id = ?" + (j2 != -1 ? " and rowid <= ?" : "") + " order by rowid limit 1;", j2 != -1 ? new String[]{null, String.valueOf(j2)} : new String[]{null});
                        if (!cursorRawQuery2.moveToFirst()) {
                            cursorRawQuery2.close();
                            return;
                        } else {
                            string = cursorRawQuery2.getString(0);
                            cursorRawQuery2.close();
                        }
                    }
                    Cursor cursorQuery = sQLiteDatabaseZzh.query("raw_events_metadata", new String[]{TtmlNode.TAG_METADATA}, "app_id = ? and metadata_fingerprint = ?", new String[]{string2, string}, null, null, "rowid", "2");
                    if (!cursorQuery.moveToFirst()) {
                        this.zzt.zzaA().zzd().zzb("Raw event metadata record is missing. appId", zzet.zzn(string2));
                        cursorQuery.close();
                        return;
                    }
                    try {
                        com.google.android.gms.internal.measurement.zzgd zzgdVar = (com.google.android.gms.internal.measurement.zzgd) ((com.google.android.gms.internal.measurement.zzgc) zzlj.zzm(com.google.android.gms.internal.measurement.zzgd.zzu(), cursorQuery.getBlob(0))).zzaD();
                        if (cursorQuery.moveToNext()) {
                            this.zzt.zzaA().zzk().zzb("Get multiple raw event metadata records, expected one. appId", zzet.zzn(string2));
                        }
                        cursorQuery.close();
                        Preconditions.checkNotNull(zzgdVar);
                        zzleVar.zza = zzgdVar;
                        if (j2 != -1) {
                            c2 = 1;
                            c = 2;
                            str2 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                            strArr = new String[]{string2, string, String.valueOf(j2)};
                        } else {
                            c = 2;
                            c2 = 1;
                            strArr = new String[]{string2, string};
                            str2 = "app_id = ? and metadata_fingerprint = ?";
                        }
                        String[] strArr2 = new String[4];
                        strArr2[0] = "rowid";
                        strArr2[c2] = "name";
                        strArr2[c] = "timestamp";
                        strArr2[3] = "data";
                        Cursor cursorQuery2 = sQLiteDatabaseZzh.query("raw_events", strArr2, str2, strArr, null, null, "rowid", null);
                        if (!cursorQuery2.moveToFirst()) {
                            this.zzt.zzaA().zzk().zzb("Raw event data disappeared while in transaction. appId", zzet.zzn(string2));
                            cursorQuery2.close();
                            return;
                        }
                        do {
                            long j3 = cursorQuery2.getLong(0);
                            try {
                                com.google.android.gms.internal.measurement.zzfs zzfsVar = (com.google.android.gms.internal.measurement.zzfs) zzlj.zzm(com.google.android.gms.internal.measurement.zzft.zze(), cursorQuery2.getBlob(3));
                                zzfsVar.zzi(cursorQuery2.getString(1));
                                zzfsVar.zzm(cursorQuery2.getLong(2));
                                if (!zzleVar.zza(j3, (com.google.android.gms.internal.measurement.zzft) zzfsVar.zzaD())) {
                                    cursorQuery2.close();
                                    return;
                                }
                            } catch (IOException e) {
                                this.zzt.zzaA().zzd().zzc("Data loss. Failed to merge raw event. appId", zzet.zzn(string2), e);
                            }
                        } while (cursorQuery2.moveToNext());
                        cursorQuery2.close();
                    } catch (IOException e2) {
                        this.zzt.zzaA().zzd().zzc("Data loss. Failed to merge raw event metadata. appId", zzet.zzn(string2), e2);
                        cursorQuery.close();
                    }
                } catch (SQLiteException e3) {
                    e = e3;
                    this.zzt.zzaA().zzd().zzc("Data loss. Error selecting raw event. appId", zzet.zzn(null), e);
                    if (r3 != 0) {
                        r3.close();
                    }
                }
            } catch (SQLiteException e4) {
                e = e4;
                r3 = 0;
            } catch (Throwable th) {
                th = th;
                if (r4 != 0) {
                    r4.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            r4 = "select app_id, metadata_fingerprint from raw_events where ";
            if (r4 != 0) {
                r4.close();
            }
            throw th;
        }
    }

    @WorkerThread
    public final int zza(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzW();
        try {
            return zzh().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            this.zzt.zzaA().zzd().zzd("Error deleting conditional property", zzet.zzn(str), this.zzt.zzj().zzf(str2), e);
            return 0;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzku
    public final boolean zzb() {
        return false;
    }

    @VisibleForTesting
    @WorkerThread
    public final long zzc(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty("first_open_count");
        zzg();
        zzW();
        SQLiteDatabase sQLiteDatabaseZzh = zzh();
        sQLiteDatabaseZzh.beginTransaction();
        long j = 0;
        try {
            try {
                long jZzaa = zzaa("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
                if (jZzaa == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", (Integer) 0);
                    contentValues.put("previous_install_count", (Integer) 0);
                    if (sQLiteDatabaseZzh.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        this.zzt.zzaA().zzd().zzc("Failed to insert column (got -1). appId", zzet.zzn(str), "first_open_count");
                        return -1L;
                    }
                    jZzaa = 0;
                    this.zzt.zzaA().zzd().zzd("Error inserting column. appId", zzet.zzn(str), "first_open_count", e);
                    return j;
                }
                try {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put("first_open_count", Long.valueOf(1 + jZzaa));
                    if (sQLiteDatabaseZzh.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                        this.zzt.zzaA().zzd().zzc("Failed to update column (got 0). appId", zzet.zzn(str), "first_open_count");
                        return -1L;
                    }
                    sQLiteDatabaseZzh.setTransactionSuccessful();
                    return jZzaa;
                } catch (SQLiteException e) {
                    e = e;
                    j = jZzaa;
                }
            } catch (SQLiteException e2) {
                e = e2;
            }
        } finally {
            sQLiteDatabaseZzh.endTransaction();
        }
    }

    @WorkerThread
    public final long zzd() {
        return zzaa("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    @WorkerThread
    public final long zze() {
        return zzaa("select max(timestamp) from raw_events", null, 0L);
    }

    public final long zzf(String str) {
        Preconditions.checkNotEmpty(str);
        return zzaa("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    @VisibleForTesting
    @WorkerThread
    public final SQLiteDatabase zzh() {
        zzg();
        try {
            return this.zzj.getWritableDatabase();
        } catch (SQLiteException e) {
            this.zzt.zzaA().zzk().zzb("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00dc  */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00bf: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:192), block:B:38:0x00bf */
    public final Bundle zzi(String str) throws Throwable {
        Cursor cursorRawQuery;
        Cursor cursor;
        zzg();
        zzW();
        Cursor cursor2 = null;
        try {
            try {
                cursorRawQuery = zzh().rawQuery("select parameters from default_event_params where app_id=?", new String[]{str});
                try {
                    if (!cursorRawQuery.moveToFirst()) {
                        this.zzt.zzaA().zzj().zza("Default event parameters not found");
                        cursorRawQuery.close();
                        return null;
                    }
                    try {
                        com.google.android.gms.internal.measurement.zzft zzftVar = (com.google.android.gms.internal.measurement.zzft) ((com.google.android.gms.internal.measurement.zzfs) zzlj.zzm(com.google.android.gms.internal.measurement.zzft.zze(), cursorRawQuery.getBlob(0))).zzaD();
                        this.zzf.zzu();
                        List<com.google.android.gms.internal.measurement.zzfx> listZzi = zzftVar.zzi();
                        Bundle bundle = new Bundle();
                        for (com.google.android.gms.internal.measurement.zzfx zzfxVar : listZzi) {
                            String strZzg = zzfxVar.zzg();
                            if (zzfxVar.zzu()) {
                                bundle.putDouble(strZzg, zzfxVar.zza());
                            } else if (zzfxVar.zzv()) {
                                bundle.putFloat(strZzg, zzfxVar.zzb());
                            } else if (zzfxVar.zzy()) {
                                bundle.putString(strZzg, zzfxVar.zzh());
                            } else if (zzfxVar.zzw()) {
                                bundle.putLong(strZzg, zzfxVar.zzd());
                            }
                        }
                        cursorRawQuery.close();
                        return bundle;
                    } catch (IOException e) {
                        this.zzt.zzaA().zzd().zzc("Failed to retrieve default event parameters. appId", zzet.zzn(str), e);
                        cursorRawQuery.close();
                        return null;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    this.zzt.zzaA().zzd().zzb("Error selecting default event parameters", e);
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return null;
                }
            } catch (SQLiteException e3) {
                e = e3;
                cursorRawQuery = null;
            } catch (Throwable th) {
                th = th;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cursor2 = cursor;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x02e0  */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x02bf: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:704), block:B:59:0x02bf */
    @WorkerThread
    public final zzh zzj(String str) {
        Cursor cursorQuery;
        Cursor cursor;
        Preconditions.checkNotEmpty(str);
        zzg();
        zzW();
        Cursor cursor2 = null;
        try {
            try {
                boolean z = false;
                cursorQuery = zzh().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    zzh zzhVar = new zzh(this.zzf.zzp(), str);
                    zzhVar.zzJ(cursorQuery.getString(0));
                    zzhVar.zzY(cursorQuery.getString(1));
                    zzhVar.zzag(cursorQuery.getString(2));
                    zzhVar.zzac(cursorQuery.getLong(3));
                    zzhVar.zzad(cursorQuery.getLong(4));
                    zzhVar.zzab(cursorQuery.getLong(5));
                    zzhVar.zzL(cursorQuery.getString(6));
                    zzhVar.zzK(cursorQuery.getString(7));
                    zzhVar.zzZ(cursorQuery.getLong(8));
                    zzhVar.zzU(cursorQuery.getLong(9));
                    zzhVar.zzae(cursorQuery.isNull(10) || cursorQuery.getInt(10) != 0);
                    zzhVar.zzT(cursorQuery.getLong(11));
                    zzhVar.zzR(cursorQuery.getLong(12));
                    zzhVar.zzQ(cursorQuery.getLong(13));
                    zzhVar.zzO(cursorQuery.getLong(14));
                    zzhVar.zzN(cursorQuery.getLong(15));
                    zzhVar.zzW(cursorQuery.getLong(16));
                    zzhVar.zzM(cursorQuery.isNull(17) ? -2147483648L : cursorQuery.getInt(17));
                    zzhVar.zzX(cursorQuery.getString(18));
                    zzhVar.zzP(cursorQuery.getLong(19));
                    zzhVar.zzS(cursorQuery.getLong(20));
                    zzhVar.zzaa(cursorQuery.getString(21));
                    zzhVar.zzI(cursorQuery.isNull(23) || cursorQuery.getInt(23) != 0);
                    zzhVar.zzH(cursorQuery.getString(24));
                    zzhVar.zzV(cursorQuery.isNull(25) ? 0L : cursorQuery.getLong(25));
                    if (!cursorQuery.isNull(26)) {
                        zzhVar.zzah(Arrays.asList(cursorQuery.getString(26).split(",", -1)));
                    }
                    zzqu.zzc();
                    if (this.zzt.zzf().zzs(str, zzeg.zzao) || this.zzt.zzf().zzs(null, zzeg.zzam)) {
                        zzhVar.zzai(cursorQuery.getString(28));
                    }
                    zzrd.zzc();
                    if (this.zzt.zzf().zzs(null, zzeg.zzaq)) {
                        if (!cursorQuery.isNull(29) && cursorQuery.getInt(29) != 0) {
                            z = true;
                        }
                        zzhVar.zzak(z);
                    }
                    zzpz.zzc();
                    if (this.zzt.zzf().zzs(null, zzeg.zzaE)) {
                        zzhVar.zzal(cursorQuery.getLong(30));
                    }
                    if (this.zzt.zzf().zzs(null, zzeg.zzaH)) {
                        zzhVar.zzaj(cursorQuery.getLong(31));
                    }
                    zzhVar.zzF();
                    if (cursorQuery.moveToNext()) {
                        this.zzt.zzaA().zzd().zzb("Got multiple records for app, expected one. appId", zzet.zzn(str));
                    }
                    cursorQuery.close();
                    return zzhVar;
                } catch (SQLiteException e) {
                    e = e;
                    this.zzt.zzaA().zzd().zzc("Error querying app. appId", zzet.zzn(str), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (SQLiteException e2) {
                e = e2;
                cursorQuery = null;
            } catch (Throwable th) {
                th = th;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cursor2 = cursor;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    @WorkerThread
    public final zzac zzk(String str, String str2) throws Throwable {
        Cursor cursorQuery;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzW();
        Cursor cursor = null;
        try {
            cursorQuery = zzh().query("conditional_properties", new String[]{"origin", AppMeasurementSdk.ConditionalUserProperty.VALUE, AppMeasurementSdk.ConditionalUserProperty.ACTIVE, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, "timed_out_event", AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "triggered_event", AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    String string = cursorQuery.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    String str3 = string;
                    Object objZzq = zzq(cursorQuery, 1);
                    boolean z = cursorQuery.getInt(2) != 0;
                    String string2 = cursorQuery.getString(3);
                    long j = cursorQuery.getLong(4);
                    zzlj zzljVarZzu = this.zzf.zzu();
                    byte[] blob = cursorQuery.getBlob(5);
                    Parcelable.Creator<zzau> creator = zzau.CREATOR;
                    zzac zzacVar = new zzac(str, str3, new zzlk(str2, cursorQuery.getLong(8), objZzq, str3), cursorQuery.getLong(6), z, string2, (zzau) zzljVarZzu.zzi(blob, creator), j, (zzau) this.zzf.zzu().zzi(cursorQuery.getBlob(7), creator), cursorQuery.getLong(9), (zzau) this.zzf.zzu().zzi(cursorQuery.getBlob(10), creator));
                    if (cursorQuery.moveToNext()) {
                        this.zzt.zzaA().zzd().zzc("Got multiple records for conditional property, expected one", zzet.zzn(str), this.zzt.zzj().zzf(str2));
                    }
                    cursorQuery.close();
                    return zzacVar;
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                }
            } catch (SQLiteException e) {
                e = e;
                this.zzt.zzaA().zzd().zzd("Error querying conditional property", zzet.zzn(str), this.zzt.zzj().zzf(str2), e);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return null;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
        }
        th = th;
        cursor = cursorQuery;
        if (cursor != null) {
            cursor.close();
        }
        throw th;
    }

    @WorkerThread
    public final zzai zzl(long j, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return zzm(j, str, 1L, false, false, z3, false, z5);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x013e  */
    @WorkerThread
    public final zzai zzm(long j, String str, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) throws Throwable {
        Cursor cursor;
        Preconditions.checkNotEmpty(str);
        zzg();
        zzW();
        String[] strArr = {str};
        zzai zzaiVar = new zzai();
        try {
            SQLiteDatabase sQLiteDatabaseZzh = zzh();
            Cursor cursorQuery = sQLiteDatabaseZzh.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                if (!cursorQuery.moveToFirst()) {
                    this.zzt.zzaA().zzk().zzb("Not updating daily counts, app is not known. appId", zzet.zzn(str));
                    cursorQuery.close();
                    return zzaiVar;
                }
                if (cursorQuery.getLong(0) == j) {
                    zzaiVar.zzb = cursorQuery.getLong(1);
                    zzaiVar.zza = cursorQuery.getLong(2);
                    zzaiVar.zzc = cursorQuery.getLong(3);
                    zzaiVar.zzd = cursorQuery.getLong(4);
                    zzaiVar.zze = cursorQuery.getLong(5);
                }
                if (z) {
                    zzaiVar.zzb += j2;
                }
                if (z2) {
                    zzaiVar.zza += j2;
                }
                if (z3) {
                    zzaiVar.zzc += j2;
                }
                if (z4) {
                    zzaiVar.zzd += j2;
                }
                if (z5) {
                    zzaiVar.zze += j2;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j));
                contentValues.put("daily_public_events_count", Long.valueOf(zzaiVar.zza));
                contentValues.put("daily_events_count", Long.valueOf(zzaiVar.zzb));
                contentValues.put("daily_conversions_count", Long.valueOf(zzaiVar.zzc));
                contentValues.put("daily_error_events_count", Long.valueOf(zzaiVar.zzd));
                contentValues.put("daily_realtime_events_count", Long.valueOf(zzaiVar.zze));
                sQLiteDatabaseZzh.update("apps", contentValues, "app_id=?", strArr);
                cursorQuery.close();
                return zzaiVar;
            } catch (SQLiteException e) {
                e = e;
                cursor = cursorQuery;
                try {
                    this.zzt.zzaA().zzd().zzc("Error updating daily counts. appId", zzet.zzn(str), e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return zzaiVar;
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0135  */
    /* JADX WARN: Multi-variable type inference failed */
    @WorkerThread
    public final zzaq zzn(String str, String str2) {
        Cursor cursorQuery;
        Boolean boolValueOf;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzW();
        AbstractWindowedCursor abstractWindowedCursor = 0;
        try {
            try {
                cursorQuery = zzh().query(f.ax, (String[]) new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count")).toArray(new String[0]), "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    long j = cursorQuery.getLong(0);
                    long j2 = cursorQuery.getLong(1);
                    long j3 = cursorQuery.getLong(2);
                    long j4 = cursorQuery.isNull(3) ? 0L : cursorQuery.getLong(3);
                    Long lValueOf = cursorQuery.isNull(4) ? null : Long.valueOf(cursorQuery.getLong(4));
                    Long lValueOf2 = cursorQuery.isNull(5) ? null : Long.valueOf(cursorQuery.getLong(5));
                    Long lValueOf3 = cursorQuery.isNull(6) ? null : Long.valueOf(cursorQuery.getLong(6));
                    if (cursorQuery.isNull(7)) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(cursorQuery.getLong(7) == 1);
                    }
                    zzaq zzaqVar = new zzaq(str, str2, j, j2, cursorQuery.isNull(8) ? 0L : cursorQuery.getLong(8), j3, j4, lValueOf, lValueOf2, lValueOf3, boolValueOf);
                    if (cursorQuery.moveToNext()) {
                        this.zzt.zzaA().zzd().zzb("Got multiple records for event aggregates, expected one. appId", zzet.zzn(str));
                    }
                    cursorQuery.close();
                    return zzaqVar;
                } catch (SQLiteException e) {
                    e = e;
                    this.zzt.zzaA().zzd().zzd("Error querying events. appId", zzet.zzn(str), this.zzt.zzj().zzd(str2), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (SQLiteException e2) {
                e = e2;
                cursorQuery = null;
            } catch (Throwable th) {
                th = th;
                if (abstractWindowedCursor != 0) {
                    abstractWindowedCursor.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            abstractWindowedCursor = "current_bundle_count";
            if (abstractWindowedCursor != 0) {
                abstractWindowedCursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a7  */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x007a: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:123), block:B:22:0x007a */
    @WorkerThread
    public final zzlm zzp(String str, String str2) {
        Cursor cursorQuery;
        Cursor cursor;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzW();
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = zzh().query("user_attributes", new String[]{"set_timestamp", AppMeasurementSdk.ConditionalUserProperty.VALUE, "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    long j = cursorQuery.getLong(0);
                    Object objZzq = zzq(cursorQuery, 1);
                    if (objZzq == null) {
                        cursorQuery.close();
                        return null;
                    }
                    zzlm zzlmVar = new zzlm(str, cursorQuery.getString(2), str2, j, objZzq);
                    if (cursorQuery.moveToNext()) {
                        this.zzt.zzaA().zzd().zzb("Got multiple records for user property, expected one. appId", zzet.zzn(str));
                    }
                    cursorQuery.close();
                    return zzlmVar;
                } catch (SQLiteException e) {
                    e = e;
                    this.zzt.zzaA().zzd().zzd("Error querying user property. appId", zzet.zzn(str), this.zzt.zzj().zzf(str2), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (SQLiteException e2) {
                e = e2;
                cursorQuery = null;
            } catch (Throwable th) {
                th = th;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cursor2 = cursor;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    @VisibleForTesting
    @WorkerThread
    public final Object zzq(Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type == 0) {
            DM.w(this.zzt, "Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i));
        }
        if (type == 3) {
            return cursor.getString(i);
        }
        if (type != 4) {
            this.zzt.zzaA().zzd().zzb("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
            return null;
        }
        DM.w(this.zzt, "Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0042  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    @WorkerThread
    public final String zzr() throws Throwable {
        SQLiteException e;
        Cursor cursorRawQuery;
        SQLiteDatabase sQLiteDatabaseZzh = zzh();
        ?? r1 = 0;
        try {
            try {
                cursorRawQuery = sQLiteDatabaseZzh.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
                try {
                    if (!cursorRawQuery.moveToFirst()) {
                        cursorRawQuery.close();
                        return null;
                    }
                    String string = cursorRawQuery.getString(0);
                    cursorRawQuery.close();
                    return string;
                } catch (SQLiteException e2) {
                    e = e2;
                    this.zzt.zzaA().zzd().zzb("Database error getting next bundle app id", e);
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return null;
                }
            } catch (SQLiteException e3) {
                e = e3;
                cursorRawQuery = null;
            } catch (Throwable th) {
                th = th;
                if (r1 != 0) {
                    r1.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            r1 = sQLiteDatabaseZzh;
            th = th2;
            if (r1 != 0) {
                r1.close();
            }
            throw th;
        }
    }

    @WorkerThread
    public final List zzs(String str, String str2, String str3) {
        Preconditions.checkNotEmpty(str);
        zzg();
        zzW();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat(ProxyConfig.MATCH_ALL_SCHEMES));
            sb.append(" and name glob ?");
        }
        return zzt(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0192  */
    public final List zzt(String str, String[] strArr) throws Throwable {
        Cursor cursor;
        int i;
        boolean z;
        zzg();
        zzW();
        ArrayList arrayList = new ArrayList();
        try {
            SQLiteDatabase sQLiteDatabaseZzh = zzh();
            String[] strArr2 = {"app_id", "origin", "name", AppMeasurementSdk.ConditionalUserProperty.VALUE, AppMeasurementSdk.ConditionalUserProperty.ACTIVE, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, "timed_out_event", AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "triggered_event", AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, "expired_event"};
            this.zzt.zzf();
            int i2 = 4;
            Cursor cursorQuery = sQLiteDatabaseZzh.query("conditional_properties", strArr2, str, strArr, null, null, "rowid", "1001");
            try {
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return arrayList;
                }
                while (true) {
                    int size = arrayList.size();
                    this.zzt.zzf();
                    if (size >= 1000) {
                        zzer zzerVarZzd = this.zzt.zzaA().zzd();
                        this.zzt.zzf();
                        zzerVarZzd.zzb("Read more than the max allowed conditional properties, ignoring extra", 1000);
                        break;
                    }
                    String string = cursorQuery.getString(0);
                    String string2 = cursorQuery.getString(1);
                    String string3 = cursorQuery.getString(2);
                    Object objZzq = zzq(cursorQuery, 3);
                    if (cursorQuery.getInt(i2) != 0) {
                        i = 5;
                        z = true;
                    } else {
                        i = 5;
                        z = false;
                    }
                    String string4 = cursorQuery.getString(i);
                    long j = cursorQuery.getLong(6);
                    zzlj zzljVarZzu = this.zzf.zzu();
                    byte[] blob = cursorQuery.getBlob(7);
                    Parcelable.Creator<zzau> creator = zzau.CREATOR;
                    zzau zzauVar = (zzau) zzljVarZzu.zzi(blob, creator);
                    arrayList.add(new zzac(string, string2, new zzlk(string3, cursorQuery.getLong(10), objZzq, string2), cursorQuery.getLong(8), z, string4, zzauVar, j, (zzau) this.zzf.zzu().zzi(cursorQuery.getBlob(9), creator), cursorQuery.getLong(11), (zzau) this.zzf.zzu().zzi(cursorQuery.getBlob(12), creator)));
                    if (!cursorQuery.moveToNext()) {
                        break;
                    }
                    i2 = 4;
                }
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e) {
                e = e;
                cursor = cursorQuery;
                try {
                    this.zzt.zzaA().zzd().zzb("Error querying conditional user property value", e);
                    List listEmptyList = Collections.emptyList();
                    if (cursor != null) {
                        cursor.close();
                    }
                    return listEmptyList;
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b1  */
    @WorkerThread
    public final List zzu(String str) {
        Preconditions.checkNotEmpty(str);
        zzg();
        zzW();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseZzh = zzh();
                String[] strArr = {"name", "origin", "set_timestamp", AppMeasurementSdk.ConditionalUserProperty.VALUE};
                this.zzt.zzf();
                cursorQuery = sQLiteDatabaseZzh.query("user_attributes", strArr, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return arrayList;
                }
                do {
                    String string = cursorQuery.getString(0);
                    String string2 = cursorQuery.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str2 = string2;
                    long j = cursorQuery.getLong(2);
                    Object objZzq = zzq(cursorQuery, 3);
                    if (objZzq == null) {
                        this.zzt.zzaA().zzd().zzb("Read invalid user property value, ignoring it. appId", zzet.zzn(str));
                    } else {
                        arrayList.add(new zzlm(str, str2, string, j, objZzq));
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e) {
                this.zzt.zzaA().zzd().zzc("Error querying user properties. appId", zzet.zzn(str), e);
                List listEmptyList = Collections.emptyList();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return listEmptyList;
            }
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        throw th;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0144  */
    /* JADX WARN: Code duplicated, block: B:51:0x014b  */
    @WorkerThread
    public final List zzv(String str, String str2, String str3) throws Throwable {
        Cursor cursor;
        String string;
        Preconditions.checkNotEmpty(str);
        zzg();
        zzW();
        ArrayList arrayList = new ArrayList();
        try {
            try {
                ArrayList arrayList2 = new ArrayList(3);
                try {
                    arrayList2.add(str);
                    StringBuilder sb = new StringBuilder("app_id=?");
                    if (TextUtils.isEmpty(str2)) {
                        string = str2;
                    } else {
                        string = str2;
                        try {
                            arrayList2.add(string);
                            sb.append(" and origin=?");
                        } catch (SQLiteException e) {
                            e = e;
                            cursor = null;
                            try {
                                this.zzt.zzaA().zzd().zzd("(2)Error querying user properties", zzet.zzn(str), string, e);
                                List listEmptyList = Collections.emptyList();
                                if (cursor != null) {
                                    cursor.close();
                                }
                                return listEmptyList;
                            } catch (Throwable th) {
                                th = th;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        arrayList2.add(str3 + ProxyConfig.MATCH_ALL_SCHEMES);
                        sb.append(" and name glob ?");
                    }
                    String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
                    SQLiteDatabase sQLiteDatabaseZzh = zzh();
                    String[] strArr2 = {"name", "set_timestamp", AppMeasurementSdk.ConditionalUserProperty.VALUE, "origin"};
                    String string2 = sb.toString();
                    this.zzt.zzf();
                    Cursor cursorQuery = sQLiteDatabaseZzh.query("user_attributes", strArr2, string2, strArr, null, null, "rowid", "1001");
                    try {
                        if (!cursorQuery.moveToFirst()) {
                            cursorQuery.close();
                            return arrayList;
                        }
                        do {
                            int size = arrayList.size();
                            this.zzt.zzf();
                            if (size >= 1000) {
                                zzer zzerVarZzd = this.zzt.zzaA().zzd();
                                this.zzt.zzf();
                                zzerVarZzd.zzb("Read more than the max allowed user properties, ignoring excess", 1000);
                                break;
                            }
                            String string3 = cursorQuery.getString(0);
                            long j = cursorQuery.getLong(1);
                            Object objZzq = zzq(cursorQuery, 2);
                            string = cursorQuery.getString(3);
                            if (objZzq == null) {
                                this.zzt.zzaA().zzd().zzd("(2)Read invalid user property value, ignoring it", zzet.zzn(str), string, str3);
                            } else {
                                arrayList.add(new zzlm(str, string, string3, j, objZzq));
                            }
                        } while (cursorQuery.moveToNext());
                        cursorQuery.close();
                        return arrayList;
                    } catch (SQLiteException e2) {
                        e = e2;
                        cursor = cursorQuery;
                        this.zzt.zzaA().zzd().zzd("(2)Error querying user properties", zzet.zzn(str), string, e);
                        List listEmptyList2 = Collections.emptyList();
                        if (cursor != null) {
                            cursor.close();
                        }
                        return listEmptyList2;
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = cursorQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                } catch (SQLiteException e3) {
                    e = e3;
                    string = str2;
                    cursor = null;
                    this.zzt.zzaA().zzd().zzd("(2)Error querying user properties", zzet.zzn(str), string, e);
                    List listEmptyList3 = Collections.emptyList();
                    if (cursor != null) {
                        cursor.close();
                    }
                    return listEmptyList3;
                }
            } catch (Throwable th3) {
                th = th3;
                cursor = null;
            }
        } catch (SQLiteException e4) {
            e = e4;
        }
    }

    @WorkerThread
    public final void zzw() {
        zzW();
        zzh().beginTransaction();
    }

    @WorkerThread
    public final void zzx() {
        zzW();
        zzh().endTransaction();
    }

    @VisibleForTesting
    @WorkerThread
    public final void zzy(List list) {
        zzg();
        zzW();
        Preconditions.checkNotNull(list);
        Preconditions.checkNotZero(list.size());
        if (zzI()) {
            String strB = DM.B("(", TextUtils.join(",", list), ")");
            if (zzZ(DM.B("SELECT COUNT(1) FROM queue WHERE rowid IN ", strB, " AND retry_count =  2147483647 LIMIT 1"), null) > 0) {
                DM.C(this.zzt, "The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                zzh().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + strB + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e) {
                this.zzt.zzaA().zzd().zzb("Error incrementing retry count. error", e);
            }
        }
    }

    @WorkerThread
    public final void zzz() {
        zzg();
        zzW();
        if (zzI()) {
            long jZza = this.zzf.zzs().zza.zza();
            long jElapsedRealtime = this.zzt.zzax().elapsedRealtime();
            long jAbs = Math.abs(jElapsedRealtime - jZza);
            this.zzt.zzf();
            if (jAbs > ((Long) zzeg.zzy.zza(null)).longValue()) {
                this.zzf.zzs().zza.zzb(jElapsedRealtime);
                zzg();
                zzW();
                if (zzI()) {
                    SQLiteDatabase sQLiteDatabaseZzh = zzh();
                    String strValueOf = String.valueOf(this.zzt.zzax().currentTimeMillis());
                    this.zzt.zzf();
                    int iDelete = sQLiteDatabaseZzh.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{strValueOf, String.valueOf(zzag.zzA())});
                    if (iDelete > 0) {
                        this.zzt.zzaA().zzj().zzb("Deleted stale rows. rowsDeleted", Integer.valueOf(iDelete));
                    }
                }
            }
        }
    }
}
