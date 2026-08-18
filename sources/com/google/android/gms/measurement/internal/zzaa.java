package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzoy;
import com.umeng.analytics.pro.f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class zzaa extends zzku {
    private String zza;
    private Set zzb;
    private Map zzc;
    private Long zzd;
    private Long zze;

    public zzaa(zzlh zzlhVar) {
        super(zzlhVar);
    }

    private final zzu zzd(Integer num) {
        if (this.zzc.containsKey(num)) {
            return (zzu) this.zzc.get(num);
        }
        zzu zzuVar = new zzu(this, this.zza, null);
        this.zzc.put(num, zzuVar);
        return zzuVar;
    }

    private final boolean zzf(int i, int i2) {
        zzu zzuVar = (zzu) this.zzc.get(Integer.valueOf(i));
        if (zzuVar == null) {
            return false;
        }
        return zzuVar.zze.get(i2);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0292 A[Catch: all -> 0x02ad, SQLiteException -> 0x02b0, LOOP:11: B:102:0x0292->B:501:?, LOOP_START, TryCatch #9 {all -> 0x02ad, blocks: (B:100:0x028c, B:102:0x0292, B:104:0x02a3, B:110:0x02b2, B:113:0x02c7, B:121:0x02d4), top: B:433:0x0282 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x02a3 A[Catch: all -> 0x02ad, SQLiteException -> 0x02b0, TryCatch #9 {all -> 0x02ad, blocks: (B:100:0x028c, B:102:0x0292, B:104:0x02a3, B:110:0x02b2, B:113:0x02c7, B:121:0x02d4), top: B:433:0x0282 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x02c7 A[Catch: all -> 0x02ad, SQLiteException -> 0x02b0, TRY_ENTER, TRY_LEAVE, TryCatch #9 {all -> 0x02ad, blocks: (B:100:0x028c, B:102:0x0292, B:104:0x02a3, B:110:0x02b2, B:113:0x02c7, B:121:0x02d4), top: B:433:0x0282 }] */
    /* JADX WARN: Code duplicated, block: B:127:0x0303  */
    /* JADX WARN: Code duplicated, block: B:130:0x0311  */
    /* JADX WARN: Code duplicated, block: B:132:0x0328  */
    /* JADX WARN: Code duplicated, block: B:156:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:158:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:162:0x040a  */
    /* JADX WARN: Code duplicated, block: B:164:0x042b  */
    /* JADX WARN: Code duplicated, block: B:170:0x0440  */
    /* JADX WARN: Code duplicated, block: B:174:0x045a  */
    /* JADX WARN: Code duplicated, block: B:175:0x0463  */
    /* JADX WARN: Code duplicated, block: B:179:0x046f  */
    /* JADX WARN: Code duplicated, block: B:185:0x0486  */
    /* JADX WARN: Code duplicated, block: B:191:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:194:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:196:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:198:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:199:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:204:0x050d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:229:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:232:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:236:0x05e6  */
    /* JADX WARN: Code duplicated, block: B:237:0x0625  */
    /* JADX WARN: Code duplicated, block: B:240:0x0671  */
    /* JADX WARN: Code duplicated, block: B:250:0x06bb  */
    /* JADX WARN: Code duplicated, block: B:257:0x06e3  */
    /* JADX WARN: Code duplicated, block: B:263:0x06f2  */
    /* JADX WARN: Code duplicated, block: B:272:0x071d A[LOOP:8: B:251:0x06bd->B:272:0x071d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:273:0x0720  */
    /* JADX WARN: Code duplicated, block: B:295:0x0764  */
    /* JADX WARN: Code duplicated, block: B:299:0x076e  */
    /* JADX WARN: Code duplicated, block: B:301:0x0772  */
    /* JADX WARN: Code duplicated, block: B:305:0x0788  */
    /* JADX WARN: Code duplicated, block: B:311:0x07b9  */
    /* JADX WARN: Code duplicated, block: B:313:0x07e6 A[LOOP:10: B:309:0x07b3->B:313:0x07e6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:317:0x07fa  */
    /* JADX WARN: Code duplicated, block: B:323:0x0813  */
    /* JADX WARN: Code duplicated, block: B:326:0x0822  */
    /* JADX WARN: Code duplicated, block: B:328:0x0835  */
    /* JADX WARN: Code duplicated, block: B:332:0x0875 A[Catch: all -> 0x08a4, SQLiteException -> 0x08ac, LOOP:3: B:332:0x0875->B:475:?, LOOP_START, TRY_LEAVE, TryCatch #1 {all -> 0x08a4, blocks: (B:330:0x086f, B:332:0x0875, B:333:0x087a, B:335:0x088b, B:337:0x089b, B:342:0x08a8, B:347:0x08c4, B:360:0x08e2, B:346:0x08b0, B:351:0x08d0), top: B:422:0x086f }] */
    /* JADX WARN: Code duplicated, block: B:337:0x089b A[Catch: all -> 0x08a4, SQLiteException -> 0x08a6, TryCatch #1 {all -> 0x08a4, blocks: (B:330:0x086f, B:332:0x0875, B:333:0x087a, B:335:0x088b, B:337:0x089b, B:342:0x08a8, B:347:0x08c4, B:360:0x08e2, B:346:0x08b0, B:351:0x08d0), top: B:422:0x086f }] */
    /* JADX WARN: Code duplicated, block: B:350:0x08cf  */
    /* JADX WARN: Code duplicated, block: B:367:0x0904  */
    /* JADX WARN: Code duplicated, block: B:371:0x0913  */
    /* JADX WARN: Code duplicated, block: B:374:0x0934  */
    /* JADX WARN: Code duplicated, block: B:377:0x0945  */
    /* JADX WARN: Code duplicated, block: B:379:0x095c  */
    /* JADX WARN: Code duplicated, block: B:381:0x096c  */
    /* JADX WARN: Code duplicated, block: B:382:0x0975  */
    /* JADX WARN: Code duplicated, block: B:386:0x09a8  */
    /* JADX WARN: Code duplicated, block: B:395:0x09f0  */
    /* JADX WARN: Code duplicated, block: B:396:0x09f9  */
    /* JADX WARN: Code duplicated, block: B:399:0x0a06  */
    /* JADX WARN: Code duplicated, block: B:404:0x0a28  */
    /* JADX WARN: Code duplicated, block: B:409:0x0a86 A[Catch: SQLiteException -> 0x0a9e, TRY_LEAVE, TryCatch #12 {SQLiteException -> 0x0a9e, blocks: (B:407:0x0a7c, B:409:0x0a86), top: B:438:0x0a7c }] */
    /* JADX WARN: Code duplicated, block: B:470:0x0925 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:477:0x0a0b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:478:0x09da A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:481:0x0a04 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:484:0x0a99 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:487:0x05d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:489:0x05bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:491:0x0718 A[EDGE_INSN: B:491:0x0718->B:271:0x0718 BREAK  A[LOOP:8: B:251:0x06bd->B:272:0x071d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:493:0x07a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:494:0x079a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:498:0x07f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:499:0x07f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:503:0x056b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:510:0x044c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:512:0x043a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:515:0x0492 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:518:0x0480 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:530:0x032e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:544:0x0217 A[EDGE_INSN: B:544:0x0217->B:78:0x0217 BREAK  A[LOOP:20: B:69:0x01cf->B:79:0x021d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x017c  */
    /* JADX WARN: Code duplicated, block: B:62:0x01b7 A[Catch: all -> 0x01c3, SQLiteException -> 0x01c5, TRY_LEAVE, TryCatch #25 {all -> 0x01c3, blocks: (B:60:0x01b1, B:62:0x01b7, B:68:0x01ca, B:69:0x01cf, B:70:0x01d9, B:71:0x01e9, B:76:0x0211, B:73:0x01f6, B:75:0x020a, B:89:0x0232), top: B:454:0x01b1 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x01ca A[Catch: all -> 0x01c3, SQLiteException -> 0x01c5, TRY_ENTER, TryCatch #25 {all -> 0x01c3, blocks: (B:60:0x01b1, B:62:0x01b7, B:68:0x01ca, B:69:0x01cf, B:70:0x01d9, B:71:0x01e9, B:76:0x0211, B:73:0x01f6, B:75:0x020a, B:89:0x0232), top: B:454:0x01b1 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x021d A[LOOP:20: B:69:0x01cf->B:79:0x021d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:95:0x0255  */
    /* JADX WARN: Code duplicated, block: B:96:0x025b  */
    /* JADX WARN: Code duplicated, block: B:98:0x0266  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v55, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v64 */
    /* JADX WARN: Type inference failed for: r5v65 */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @WorkerThread
    public final List zza(String str, List list, List list2, Long l, Long l2) throws Throwable {
        int i;
        int i2;
        boolean z;
        String str2;
        Map map;
        Cursor cursor;
        Cursor cursorQuery;
        Map map2;
        String str3;
        Map map3;
        String str4;
        String str5;
        com.google.android.gms.internal.measurement.zzgi zzgiVar;
        BitSet bitSet;
        BitSet bitSet2;
        ArrayMap arrayMap;
        List<com.google.android.gms.internal.measurement.zzek> list3;
        int i3;
        String str6;
        Iterator it;
        com.google.android.gms.internal.measurement.zzgk zzgkVar;
        Long lValueOf;
        String str7;
        Map arrayMap2;
        SQLiteDatabase sQLiteDatabaseZzh;
        ?? r5;
        Cursor cursorRawQuery;
        ArrayMap arrayMap3;
        Iterator it2;
        Integer num;
        com.google.android.gms.internal.measurement.zzgi zzgiVar2;
        List list4;
        Map map4;
        String str8;
        Integer numValueOf;
        List arrayList;
        zzw zzwVar;
        ArrayMap arrayMap4;
        Iterator it3;
        com.google.android.gms.internal.measurement.zzft zzftVar;
        com.google.android.gms.internal.measurement.zzft zzftVarZza;
        zzak zzakVarZzh;
        String str9;
        String strZzh;
        zzaq zzaqVarZzn;
        zzaq zzaqVar;
        long j;
        String strZzh2;
        Map mapEmptyMap;
        String str10;
        int iIntValue;
        Iterator it4;
        boolean zZzd;
        Map map5;
        zzx zzxVar;
        String str11;
        ArrayMap arrayMap5;
        Cursor cursor2;
        String str12;
        Cursor cursorQuery2;
        Integer numValueOf2;
        List list5;
        List arrayList2;
        String str13;
        ArrayList arrayList3;
        zzak zzakVarZzh2;
        String str14;
        ContentValues contentValues;
        ArrayMap arrayMap6;
        Iterator it5;
        String strZzf;
        Map mapEmptyMap2;
        Iterator it6;
        boolean zZzd2;
        com.google.android.gms.internal.measurement.zzet zzetVar;
        Integer numValueOf3;
        zzz zzzVar;
        Integer numValueOf4;
        zzak zzakVarZzh3;
        String str15;
        ArrayMap arrayMap7;
        Cursor cursor3;
        Cursor cursorQuery3;
        Integer numValueOf5;
        List arrayList4;
        ArrayMap arrayMap8;
        int i4;
        ?? r6;
        Cursor cursorQuery4;
        List arrayList5;
        String str16 = "current_results";
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        Preconditions.checkNotNull(list2);
        this.zza = str;
        this.zzb = new HashSet();
        this.zzc = new ArrayMap();
        this.zzd = l;
        this.zze = l2;
        Iterator it7 = list.iterator();
        while (true) {
            i = 0;
            i2 = 1;
            if (!it7.hasNext()) {
                z = false;
                break;
            }
            if ("_s".equals(((com.google.android.gms.internal.measurement.zzft) it7.next()).zzh())) {
                z = true;
                break;
            }
        }
        zzoy.zzc();
        boolean zZzs = this.zzt.zzf().zzs(this.zza, zzeg.zzY);
        zzoy.zzc();
        boolean zZzs2 = this.zzt.zzf().zzs(this.zza, zzeg.zzX);
        if (z) {
            zzak zzakVarZzh4 = this.zzf.zzh();
            String str17 = this.zza;
            zzakVarZzh4.zzW();
            zzakVarZzh4.zzg();
            Preconditions.checkNotEmpty(str17);
            ContentValues contentValues2 = new ContentValues();
            String str18 = "current_session_count";
            contentValues2.put("current_session_count", (Integer) 0);
            try {
                SQLiteDatabase sQLiteDatabaseZzh2 = zzakVarZzh4.zzh();
                str18 = f.ax;
                sQLiteDatabaseZzh2.update(f.ax, contentValues2, "app_id = ?", new String[]{str17});
                str2 = f.ax;
            } catch (SQLiteException e) {
                zzakVarZzh4.zzt.zzaA().zzd().zzc("Error resetting session-scoped event counts. appId", zzet.zzn(str17), e);
                str2 = str18;
            }
        }
        Map mapEmptyMap3 = Collections.emptyMap();
        String str19 = "Failed to merge filter. appId";
        String str20 = "Database error querying filters. appId";
        String str21 = "audience_id";
        if (zZzs2 && zZzs) {
            zzak zzakVarZzh5 = this.zzf.zzh();
            String str22 = this.zza;
            Preconditions.checkNotEmpty(str22);
            ArrayMap arrayMap9 = new ArrayMap();
            try {
                try {
                    cursorQuery4 = zzakVarZzh5.zzh().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str22}, null, null, null);
                    try {
                        if (cursorQuery4.moveToFirst()) {
                            while (true) {
                                try {
                                    com.google.android.gms.internal.measurement.zzek zzekVar = (com.google.android.gms.internal.measurement.zzek) ((com.google.android.gms.internal.measurement.zzej) zzlj.zzm(com.google.android.gms.internal.measurement.zzek.zzc(), cursorQuery4.getBlob(i2))).zzaD();
                                    if (zzekVar.zzo()) {
                                        Integer numValueOf6 = Integer.valueOf(cursorQuery4.getInt(i));
                                        List list6 = (List) arrayMap9.get(numValueOf6);
                                        if (list6 == null) {
                                            arrayList5 = new ArrayList();
                                            arrayMap9.put(numValueOf6, arrayList5);
                                        } else {
                                            arrayList5 = list6;
                                        }
                                        arrayList5.add(zzekVar);
                                    }
                                } catch (IOException e2) {
                                    zzakVarZzh5.zzt.zzaA().zzd().zzc("Failed to merge filter. appId", zzet.zzn(str22), e2);
                                }
                                if (!cursorQuery4.moveToNext()) {
                                    break;
                                }
                                i = 0;
                                i2 = 1;
                            }
                            cursorQuery4.close();
                            map = arrayMap9;
                        } else {
                            mapEmptyMap3 = Collections.emptyMap();
                            cursorQuery4.close();
                            map = mapEmptyMap3;
                        }
                    } catch (SQLiteException e3) {
                        e = e3;
                        zzakVarZzh5.zzt.zzaA().zzd().zzc("Database error querying filters. appId", zzet.zzn(str22), e);
                        mapEmptyMap3 = Collections.emptyMap();
                        if (cursorQuery4 != null) {
                        }
                        map = mapEmptyMap3;
                        zzak zzakVarZzh6 = this.zzf.zzh();
                        String str23 = this.zza;
                        zzakVarZzh6.zzW();
                        zzakVarZzh6.zzg();
                        Preconditions.checkNotEmpty(str23);
                        cursorQuery = zzakVarZzh6.zzh().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str23}, null, null, null);
                        try {
                            if (cursorQuery.moveToFirst()) {
                                arrayMap8 = new ArrayMap();
                                while (true) {
                                    i4 = cursorQuery.getInt(0);
                                    try {
                                        arrayMap8.put(Integer.valueOf(i4), (com.google.android.gms.internal.measurement.zzgi) ((com.google.android.gms.internal.measurement.zzgh) zzlj.zzm(com.google.android.gms.internal.measurement.zzgi.zze(), cursorQuery.getBlob(1))).zzaD());
                                    } catch (IOException e4) {
                                        zzakVarZzh6.zzt.zzaA().zzd().zzd("Failed to merge filter results. appId, audienceId, error", zzet.zzn(str23), Integer.valueOf(i4), e4);
                                    }
                                    try {
                                        if (!cursorQuery.moveToNext()) {
                                            break;
                                        }
                                        arrayMap8 = arrayMap8;
                                        str21 = str21;
                                    } catch (SQLiteException e5) {
                                        e = e5;
                                        zzakVarZzh6.zzt.zzaA().zzd().zzc("Database error querying filter results. appId", zzet.zzn(str23), e);
                                        Map mapEmptyMap4 = Collections.emptyMap();
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        map2 = mapEmptyMap4;
                                    }
                                }
                                cursorQuery.close();
                                map2 = arrayMap8;
                            } else {
                                Map mapEmptyMap5 = Collections.emptyMap();
                                cursorQuery.close();
                                map2 = mapEmptyMap5;
                                str21 = "audience_id";
                            }
                        } catch (SQLiteException e6) {
                            e = e6;
                            str21 = "audience_id";
                        }
                        if (map2.isEmpty()) {
                            str5 = "Database error querying filters. appId";
                            str4 = "Failed to merge filter. appId";
                        } else {
                            HashSet<Integer> hashSet = new HashSet(map2.keySet());
                            if (z) {
                                String str24 = this.zza;
                                zzak zzakVarZzh7 = this.zzf.zzh();
                                str7 = this.zza;
                                zzakVarZzh7.zzW();
                                zzakVarZzh7.zzg();
                                Preconditions.checkNotEmpty(str7);
                                arrayMap2 = new ArrayMap();
                                sQLiteDatabaseZzh = zzakVarZzh7.zzh();
                                try {
                                    try {
                                        cursorRawQuery = sQLiteDatabaseZzh.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str7, str7});
                                        try {
                                            if (cursorRawQuery.moveToFirst()) {
                                                do {
                                                    numValueOf = Integer.valueOf(cursorRawQuery.getInt(0));
                                                    arrayList = (List) arrayMap2.get(numValueOf);
                                                    if (arrayList == null) {
                                                        arrayList = new ArrayList();
                                                        arrayMap2.put(numValueOf, arrayList);
                                                    }
                                                    arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                } while (cursorRawQuery.moveToNext());
                                            } else {
                                                arrayMap2 = Collections.emptyMap();
                                            }
                                        } catch (SQLiteException e7) {
                                            e = e7;
                                            zzakVarZzh7.zzt.zzaA().zzd().zzc("Database error querying scoped filters. appId", zzet.zzn(str7), e);
                                            arrayMap2 = Collections.emptyMap();
                                            if (cursorRawQuery != null) {
                                            }
                                            Preconditions.checkNotEmpty(str24);
                                            Preconditions.checkNotNull(map2);
                                            arrayMap3 = new ArrayMap();
                                            if (!map2.isEmpty()) {
                                                it2 = map2.keySet().iterator();
                                                while (it2.hasNext()) {
                                                    num = (Integer) it2.next();
                                                    num.intValue();
                                                    zzgiVar2 = (com.google.android.gms.internal.measurement.zzgi) map2.get(num);
                                                    list4 = (List) arrayMap2.get(num);
                                                    if (list4 != null) {
                                                    }
                                                    map4 = arrayMap2;
                                                    str8 = str20;
                                                    arrayMap3.put(num, zzgiVar2);
                                                    arrayMap2 = map4;
                                                    it2 = it2;
                                                    str20 = str8;
                                                }
                                            }
                                            str3 = str20;
                                            map3 = arrayMap3;
                                            for (Integer num2 : hashSet) {
                                                num2.intValue();
                                                zzgiVar = (com.google.android.gms.internal.measurement.zzgi) map3.get(num2);
                                                bitSet = new BitSet();
                                                bitSet2 = new BitSet();
                                                arrayMap = new ArrayMap();
                                                if (zzgiVar != null) {
                                                    for (com.google.android.gms.internal.measurement.zzfr zzfrVar : zzgiVar.zzh()) {
                                                        if (zzfrVar.zzh()) {
                                                            Integer numValueOf7 = Integer.valueOf(zzfrVar.zza());
                                                            if (zzfrVar.zzg()) {
                                                                lValueOf = Long.valueOf(zzfrVar.zzb());
                                                            } else {
                                                                lValueOf = null;
                                                            }
                                                            arrayMap.put(numValueOf7, lValueOf);
                                                        }
                                                    }
                                                }
                                                ArrayMap arrayMap10 = new ArrayMap();
                                                if (zzgiVar != null) {
                                                    it = zzgiVar.zzj().iterator();
                                                    while (it.hasNext()) {
                                                        zzgkVar = (com.google.android.gms.internal.measurement.zzgk) it.next();
                                                        if (!zzgkVar.zzi()) {
                                                        }
                                                    }
                                                }
                                                Map map6 = map3;
                                                if (zzgiVar != null) {
                                                    i3 = 0;
                                                    while (i3 < zzgiVar.zzd() * 64) {
                                                        if (zzlj.zzw(zzgiVar.zzk(), i3)) {
                                                            str6 = str19;
                                                            this.zzt.zzaA().zzj().zzc("Filter already evaluated. audience ID, filter ID", num2, Integer.valueOf(i3));
                                                            bitSet2.set(i3);
                                                            if (zzlj.zzw(zzgiVar.zzi(), i3)) {
                                                                bitSet.set(i3);
                                                            }
                                                            i3++;
                                                            str19 = str6;
                                                        } else {
                                                            str6 = str19;
                                                        }
                                                        arrayMap.remove(Integer.valueOf(i3));
                                                        i3++;
                                                        str19 = str6;
                                                    }
                                                }
                                                String str25 = str19;
                                                com.google.android.gms.internal.measurement.zzgi zzgiVar3 = (com.google.android.gms.internal.measurement.zzgi) map2.get(num2);
                                                if (!zZzs2) {
                                                }
                                                this.zzc.put(num2, new zzu(this, this.zza, zzgiVar3, bitSet, bitSet2, arrayMap, arrayMap10, null));
                                                str19 = str25;
                                                map = map;
                                                zZzs = zZzs;
                                                map3 = map6;
                                                map2 = map2;
                                            }
                                            str4 = str19;
                                            str5 = str3;
                                            if (!list.isEmpty()) {
                                                zzwVar = new zzw(this, null);
                                                arrayMap4 = new ArrayMap();
                                                it3 = list.iterator();
                                                while (it3.hasNext()) {
                                                    zzftVar = (com.google.android.gms.internal.measurement.zzft) it3.next();
                                                    zzftVarZza = zzwVar.zza(this.zza, zzftVar);
                                                    if (zzftVarZza != null) {
                                                        zzakVarZzh = this.zzf.zzh();
                                                        str9 = this.zza;
                                                        strZzh = zzftVarZza.zzh();
                                                        zzaqVarZzn = zzakVarZzh.zzn(str9, zzftVar.zzh());
                                                        if (zzaqVarZzn == null) {
                                                            zzakVarZzh.zzt.zzaA().zzk().zzc("Event aggregate wasn't created during raw event logging. appId, event", zzet.zzn(str9), zzakVarZzh.zzt.zzj().zzd(strZzh));
                                                            zzaqVar = new zzaq(str9, zzftVar.zzh(), 1L, 1L, 1L, zzftVar.zzd(), 0L, null, null, null, null);
                                                        } else {
                                                            zzaqVar = new zzaq(zzaqVarZzn.zza, zzaqVarZzn.zzb, zzaqVarZzn.zzc + 1, zzaqVarZzn.zzd + 1, zzaqVarZzn.zze + 1, zzaqVarZzn.zzf, zzaqVarZzn.zzg, zzaqVarZzn.zzh, zzaqVarZzn.zzi, zzaqVarZzn.zzj, zzaqVarZzn.zzk);
                                                        }
                                                        this.zzf.zzh().zzE(zzaqVar);
                                                        j = zzaqVar.zzc;
                                                        strZzh2 = zzftVarZza.zzh();
                                                        mapEmptyMap = (Map) arrayMap4.get(strZzh2);
                                                        if (mapEmptyMap == null) {
                                                            zzak zzakVarZzh8 = this.zzf.zzh();
                                                            str11 = this.zza;
                                                            zzakVarZzh8.zzW();
                                                            zzakVarZzh8.zzg();
                                                            Preconditions.checkNotEmpty(str11);
                                                            Preconditions.checkNotEmpty(strZzh2);
                                                            arrayMap5 = new ArrayMap();
                                                            SQLiteDatabase sQLiteDatabaseZzh3 = zzakVarZzh8.zzh();
                                                            try {
                                                                try {
                                                                    String[] strArr = new String[2];
                                                                    str12 = str21;
                                                                    try {
                                                                        strArr[0] = str12;
                                                                        strArr[1] = "data";
                                                                        str10 = str16;
                                                                        try {
                                                                            cursorQuery2 = sQLiteDatabaseZzh3.query("event_filters", strArr, "app_id=? AND event_name=?", new String[]{str11, strZzh2}, null, null, null);
                                                                            try {
                                                                                try {
                                                                                    if (cursorQuery2.moveToFirst()) {
                                                                                        str21 = str12;
                                                                                        while (true) {
                                                                                            try {
                                                                                                try {
                                                                                                    com.google.android.gms.internal.measurement.zzek zzekVar2 = (com.google.android.gms.internal.measurement.zzek) ((com.google.android.gms.internal.measurement.zzej) zzlj.zzm(com.google.android.gms.internal.measurement.zzek.zzc(), cursorQuery2.getBlob(1))).zzaD();
                                                                                                    numValueOf2 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                                    list5 = (List) arrayMap5.get(numValueOf2);
                                                                                                    if (list5 == null) {
                                                                                                        zzaqVar = zzaqVar;
                                                                                                        try {
                                                                                                            arrayList2 = new ArrayList();
                                                                                                            arrayMap5.put(numValueOf2, arrayList2);
                                                                                                        } catch (SQLiteException e8) {
                                                                                                            e = e8;
                                                                                                            cursor2 = cursorQuery2;
                                                                                                            try {
                                                                                                                zzakVarZzh8.zzt.zzaA().zzd().zzc(str5, zzet.zzn(str11), e);
                                                                                                                mapEmptyMap = Collections.emptyMap();
                                                                                                                if (cursor2 != null) {
                                                                                                                    cursor2.close();
                                                                                                                }
                                                                                                            } catch (Throwable th) {
                                                                                                                th = th;
                                                                                                                if (cursor2 != null) {
                                                                                                                    cursor2.close();
                                                                                                                }
                                                                                                                throw th;
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        zzaqVar = zzaqVar;
                                                                                                        arrayList2 = list5;
                                                                                                    }
                                                                                                    arrayList2.add(zzekVar2);
                                                                                                } catch (IOException e9) {
                                                                                                    zzaqVar = zzaqVar;
                                                                                                    zzakVarZzh8.zzt.zzaA().zzd().zzc(str4, zzet.zzn(str11), e9);
                                                                                                }
                                                                                                if (!cursorQuery2.moveToNext()) {
                                                                                                    break;
                                                                                                }
                                                                                                zzaqVar = zzaqVar;
                                                                                            } catch (SQLiteException e10) {
                                                                                                e = e10;
                                                                                                zzaqVar = zzaqVar;
                                                                                                cursor2 = cursorQuery2;
                                                                                                zzakVarZzh8.zzt.zzaA().zzd().zzc(str5, zzet.zzn(str11), e);
                                                                                                mapEmptyMap = Collections.emptyMap();
                                                                                                if (cursor2 != null) {
                                                                                                    cursor2.close();
                                                                                                }
                                                                                                arrayMap4.put(strZzh2, mapEmptyMap);
                                                                                                for (Integer num3 : mapEmptyMap.keySet()) {
                                                                                                    iIntValue = num3.intValue();
                                                                                                    if (this.zzb.contains(num3)) {
                                                                                                        this.zzt.zzaA().zzj().zzb("Skipping failed audience ID", num3);
                                                                                                    } else {
                                                                                                        it4 = ((List) mapEmptyMap.get(num3)).iterator();
                                                                                                        zZzd = true;
                                                                                                        while (true) {
                                                                                                            if (it4.hasNext()) {
                                                                                                                map5 = mapEmptyMap;
                                                                                                                break;
                                                                                                            }
                                                                                                            com.google.android.gms.internal.measurement.zzek zzekVar3 = (com.google.android.gms.internal.measurement.zzek) it4.next();
                                                                                                            zzxVar = new zzx(this, this.zza, iIntValue, zzekVar3);
                                                                                                            map5 = mapEmptyMap;
                                                                                                            zZzd = zzxVar.zzd(this.zzd, this.zze, zzftVarZza, j, zzaqVar, zzf(iIntValue, zzekVar3.zzb()));
                                                                                                            if (zZzd) {
                                                                                                                this.zzb.add(num3);
                                                                                                                break;
                                                                                                            }
                                                                                                            zzd(num3).zzc(zzxVar);
                                                                                                            mapEmptyMap = map5;
                                                                                                        }
                                                                                                        if (!zZzd) {
                                                                                                            this.zzb.add(num3);
                                                                                                        }
                                                                                                        mapEmptyMap = map5;
                                                                                                    }
                                                                                                }
                                                                                                zzwVar = zzwVar;
                                                                                                it3 = it3;
                                                                                                str16 = str10;
                                                                                            }
                                                                                        }
                                                                                        cursorQuery2.close();
                                                                                        mapEmptyMap = arrayMap5;
                                                                                    } else {
                                                                                        str21 = str12;
                                                                                        zzaqVar = zzaqVar;
                                                                                        mapEmptyMap = Collections.emptyMap();
                                                                                        cursorQuery2.close();
                                                                                    }
                                                                                } catch (SQLiteException e11) {
                                                                                    e = e11;
                                                                                    str21 = str12;
                                                                                }
                                                                                arrayMap4.put(strZzh2, mapEmptyMap);
                                                                            } catch (Throwable th2) {
                                                                                th = th2;
                                                                                cursor2 = cursorQuery2;
                                                                                if (cursor2 != null) {
                                                                                    cursor2.close();
                                                                                }
                                                                                throw th;
                                                                            }
                                                                        } catch (SQLiteException e12) {
                                                                            e = e12;
                                                                            str21 = str12;
                                                                            cursor2 = null;
                                                                            zzakVarZzh8.zzt.zzaA().zzd().zzc(str5, zzet.zzn(str11), e);
                                                                            mapEmptyMap = Collections.emptyMap();
                                                                            if (cursor2 != null) {
                                                                                cursor2.close();
                                                                            }
                                                                            arrayMap4.put(strZzh2, mapEmptyMap);
                                                                            while (r2.hasNext()) {
                                                                                iIntValue = num3.intValue();
                                                                                if (this.zzb.contains(num3)) {
                                                                                    this.zzt.zzaA().zzj().zzb("Skipping failed audience ID", num3);
                                                                                } else {
                                                                                    it4 = ((List) mapEmptyMap.get(num3)).iterator();
                                                                                    zZzd = true;
                                                                                    while (true) {
                                                                                        if (it4.hasNext()) {
                                                                                            map5 = mapEmptyMap;
                                                                                            break;
                                                                                        }
                                                                                        com.google.android.gms.internal.measurement.zzek zzekVar4 = (com.google.android.gms.internal.measurement.zzek) it4.next();
                                                                                        zzxVar = new zzx(this, this.zza, iIntValue, zzekVar4);
                                                                                        map5 = mapEmptyMap;
                                                                                        zZzd = zzxVar.zzd(this.zzd, this.zze, zzftVarZza, j, zzaqVar, zzf(iIntValue, zzekVar4.zzb()));
                                                                                        if (zZzd) {
                                                                                            this.zzb.add(num3);
                                                                                            break;
                                                                                        }
                                                                                        zzd(num3).zzc(zzxVar);
                                                                                        mapEmptyMap = map5;
                                                                                    }
                                                                                    if (!zZzd) {
                                                                                        this.zzb.add(num3);
                                                                                    }
                                                                                    mapEmptyMap = map5;
                                                                                }
                                                                            }
                                                                            zzwVar = zzwVar;
                                                                            it3 = it3;
                                                                            str16 = str10;
                                                                        }
                                                                    } catch (SQLiteException e13) {
                                                                        e = e13;
                                                                        str21 = str12;
                                                                        str10 = str16;
                                                                        cursor2 = null;
                                                                        zzakVarZzh8.zzt.zzaA().zzd().zzc(str5, zzet.zzn(str11), e);
                                                                        mapEmptyMap = Collections.emptyMap();
                                                                        if (cursor2 != null) {
                                                                            cursor2.close();
                                                                        }
                                                                        arrayMap4.put(strZzh2, mapEmptyMap);
                                                                        while (r2.hasNext()) {
                                                                            iIntValue = num3.intValue();
                                                                            if (this.zzb.contains(num3)) {
                                                                                this.zzt.zzaA().zzj().zzb("Skipping failed audience ID", num3);
                                                                            } else {
                                                                                it4 = ((List) mapEmptyMap.get(num3)).iterator();
                                                                                zZzd = true;
                                                                                while (true) {
                                                                                    if (it4.hasNext()) {
                                                                                        map5 = mapEmptyMap;
                                                                                        break;
                                                                                    }
                                                                                    com.google.android.gms.internal.measurement.zzek zzekVar5 = (com.google.android.gms.internal.measurement.zzek) it4.next();
                                                                                    zzxVar = new zzx(this, this.zza, iIntValue, zzekVar5);
                                                                                    map5 = mapEmptyMap;
                                                                                    zZzd = zzxVar.zzd(this.zzd, this.zze, zzftVarZza, j, zzaqVar, zzf(iIntValue, zzekVar5.zzb()));
                                                                                    if (zZzd) {
                                                                                        this.zzb.add(num3);
                                                                                        break;
                                                                                    }
                                                                                    zzd(num3).zzc(zzxVar);
                                                                                    mapEmptyMap = map5;
                                                                                }
                                                                                if (!zZzd) {
                                                                                    this.zzb.add(num3);
                                                                                }
                                                                                mapEmptyMap = map5;
                                                                            }
                                                                        }
                                                                        zzwVar = zzwVar;
                                                                        it3 = it3;
                                                                        str16 = str10;
                                                                    }
                                                                } catch (SQLiteException e14) {
                                                                    e = e14;
                                                                }
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                                cursor2 = null;
                                                            }
                                                        } else {
                                                            zzaqVar = zzaqVar;
                                                            str10 = str16;
                                                        }
                                                        while (r2.hasNext()) {
                                                            iIntValue = num3.intValue();
                                                            if (this.zzb.contains(num3)) {
                                                                this.zzt.zzaA().zzj().zzb("Skipping failed audience ID", num3);
                                                            } else {
                                                                it4 = ((List) mapEmptyMap.get(num3)).iterator();
                                                                zZzd = true;
                                                                while (true) {
                                                                    if (it4.hasNext()) {
                                                                        map5 = mapEmptyMap;
                                                                        break;
                                                                    }
                                                                    com.google.android.gms.internal.measurement.zzek zzekVar6 = (com.google.android.gms.internal.measurement.zzek) it4.next();
                                                                    zzxVar = new zzx(this, this.zza, iIntValue, zzekVar6);
                                                                    map5 = mapEmptyMap;
                                                                    zZzd = zzxVar.zzd(this.zzd, this.zze, zzftVarZza, j, zzaqVar, zzf(iIntValue, zzekVar6.zzb()));
                                                                    if (zZzd) {
                                                                        this.zzb.add(num3);
                                                                        break;
                                                                    }
                                                                    zzd(num3).zzc(zzxVar);
                                                                    mapEmptyMap = map5;
                                                                }
                                                                if (!zZzd) {
                                                                    this.zzb.add(num3);
                                                                }
                                                                mapEmptyMap = map5;
                                                            }
                                                        }
                                                        zzwVar = zzwVar;
                                                        it3 = it3;
                                                        str16 = str10;
                                                    }
                                                }
                                            }
                                            str13 = str16;
                                            if (!list2.isEmpty()) {
                                                arrayMap6 = new ArrayMap();
                                                it5 = list2.iterator();
                                                while (it5.hasNext()) {
                                                    com.google.android.gms.internal.measurement.zzgm zzgmVar = (com.google.android.gms.internal.measurement.zzgm) it5.next();
                                                    strZzf = zzgmVar.zzf();
                                                    mapEmptyMap2 = (Map) arrayMap6.get(strZzf);
                                                    if (mapEmptyMap2 == null) {
                                                        zzakVarZzh3 = this.zzf.zzh();
                                                        str15 = this.zza;
                                                        zzakVarZzh3.zzW();
                                                        zzakVarZzh3.zzg();
                                                        Preconditions.checkNotEmpty(str15);
                                                        Preconditions.checkNotEmpty(strZzf);
                                                        arrayMap7 = new ArrayMap();
                                                        try {
                                                            cursorQuery3 = zzakVarZzh3.zzh().query("property_filters", new String[]{str21, "data"}, "app_id=? AND property_name=?", new String[]{str15, strZzf}, null, null, null);
                                                            try {
                                                                try {
                                                                    if (cursorQuery3.moveToFirst()) {
                                                                        do {
                                                                            try {
                                                                                com.google.android.gms.internal.measurement.zzet zzetVar2 = (com.google.android.gms.internal.measurement.zzet) ((com.google.android.gms.internal.measurement.zzes) zzlj.zzm(com.google.android.gms.internal.measurement.zzet.zzc(), cursorQuery3.getBlob(1))).zzaD();
                                                                                try {
                                                                                    numValueOf5 = Integer.valueOf(cursorQuery3.getInt(0));
                                                                                    arrayList4 = (List) arrayMap7.get(numValueOf5);
                                                                                    if (arrayList4 == null) {
                                                                                        arrayList4 = new ArrayList();
                                                                                        arrayMap7.put(numValueOf5, arrayList4);
                                                                                    }
                                                                                    arrayList4.add(zzetVar2);
                                                                                } catch (SQLiteException e15) {
                                                                                    e = e15;
                                                                                    zzakVarZzh3.zzt.zzaA().zzd().zzc(str5, zzet.zzn(str15), e);
                                                                                    mapEmptyMap2 = Collections.emptyMap();
                                                                                    if (cursorQuery3 != null) {
                                                                                        cursorQuery3.close();
                                                                                    }
                                                                                }
                                                                            } catch (IOException e16) {
                                                                                zzakVarZzh3.zzt.zzaA().zzd().zzc("Failed to merge filter", zzet.zzn(str15), e16);
                                                                            }
                                                                        } while (cursorQuery3.moveToNext());
                                                                        cursorQuery3.close();
                                                                        mapEmptyMap2 = arrayMap7;
                                                                    } else {
                                                                        mapEmptyMap2 = Collections.emptyMap();
                                                                        cursorQuery3.close();
                                                                    }
                                                                } catch (SQLiteException e17) {
                                                                    e = e17;
                                                                }
                                                                arrayMap6.put(strZzf, mapEmptyMap2);
                                                            } catch (Throwable th4) {
                                                                th = th4;
                                                                cursor3 = cursorQuery3;
                                                                if (cursor3 != null) {
                                                                    cursor3.close();
                                                                }
                                                                throw th;
                                                            }
                                                        } catch (SQLiteException e18) {
                                                            e = e18;
                                                            cursorQuery3 = null;
                                                        } catch (Throwable th5) {
                                                            th = th5;
                                                            cursor3 = null;
                                                        }
                                                    }
                                                    for (Integer num4 : mapEmptyMap2.keySet()) {
                                                        int iIntValue2 = num4.intValue();
                                                        if (this.zzb.contains(num4)) {
                                                            this.zzt.zzaA().zzj().zzb("Skipping failed audience ID", num4);
                                                            break;
                                                        }
                                                        it6 = ((List) mapEmptyMap2.get(num4)).iterator();
                                                        zZzd2 = true;
                                                        while (true) {
                                                            if (it6.hasNext()) {
                                                                zzetVar = (com.google.android.gms.internal.measurement.zzet) it6.next();
                                                                if (Log.isLoggable(this.zzt.zzaA().zzr(), 2)) {
                                                                    zzer zzerVarZzj = this.zzt.zzaA().zzj();
                                                                    if (zzetVar.zzj()) {
                                                                        numValueOf4 = Integer.valueOf(zzetVar.zza());
                                                                    } else {
                                                                        numValueOf4 = null;
                                                                    }
                                                                    zzerVarZzj.zzd("Evaluating filter. audience, filter, property", num4, numValueOf4, this.zzt.zzj().zzf(zzetVar.zze()));
                                                                    this.zzt.zzaA().zzj().zzb("Filter definition", this.zzf.zzu().zzq(zzetVar));
                                                                }
                                                                if (zzetVar.zzj()) {
                                                                }
                                                                zzer zzerVarZzk = this.zzt.zzaA().zzk();
                                                                Object objZzn = zzet.zzn(this.zza);
                                                                if (zzetVar.zzj()) {
                                                                    numValueOf3 = Integer.valueOf(zzetVar.zza());
                                                                } else {
                                                                    numValueOf3 = null;
                                                                }
                                                                zzerVarZzk.zzc("Invalid property filter ID. appId, id", objZzn, String.valueOf(numValueOf3));
                                                                this.zzb.add(num4);
                                                            }
                                                            if (!zZzd2) {
                                                                this.zzb.add(num4);
                                                            }
                                                            zzd(num4).zzc(zzzVar);
                                                        }
                                                    }
                                                }
                                            }
                                            arrayList3 = new ArrayList();
                                            Set<Integer> setKeySet = this.zzc.keySet();
                                            setKeySet.removeAll(this.zzb);
                                            for (Integer num5 : setKeySet) {
                                                int iIntValue3 = num5.intValue();
                                                zzu zzuVar = (zzu) this.zzc.get(num5);
                                                Preconditions.checkNotNull(zzuVar);
                                                com.google.android.gms.internal.measurement.zzfp zzfpVarZza = zzuVar.zza(iIntValue3);
                                                arrayList3.add(zzfpVarZza);
                                                zzakVarZzh2 = this.zzf.zzh();
                                                str14 = this.zza;
                                                com.google.android.gms.internal.measurement.zzgi zzgiVarZzd = zzfpVarZza.zzd();
                                                zzakVarZzh2.zzW();
                                                zzakVarZzh2.zzg();
                                                Preconditions.checkNotEmpty(str14);
                                                Preconditions.checkNotNull(zzgiVarZzd);
                                                byte[] bArrZzbx = zzgiVarZzd.zzbx();
                                                contentValues = new ContentValues();
                                                contentValues.put("app_id", str14);
                                                String str26 = str21;
                                                contentValues.put(str26, num5);
                                                String str27 = str13;
                                                contentValues.put(str27, bArrZzbx);
                                                try {
                                                    try {
                                                        if (zzakVarZzh2.zzh().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                            zzakVarZzh2.zzt.zzaA().zzd().zzb("Failed to insert filter results (got -1). appId", zzet.zzn(str14));
                                                        }
                                                    } catch (SQLiteException e19) {
                                                        e = e19;
                                                        zzakVarZzh2.zzt.zzaA().zzd().zzc("Error storing filter results. appId", zzet.zzn(str14), e);
                                                    }
                                                } catch (SQLiteException e20) {
                                                    e = e20;
                                                }
                                                str21 = str26;
                                                str13 = str27;
                                            }
                                            return arrayList3;
                                        }
                                    } catch (SQLiteException e21) {
                                        e = e21;
                                        cursorRawQuery = null;
                                    } catch (Throwable th6) {
                                        th = th6;
                                        r5 = 0;
                                        if (r5 != 0) {
                                            r5.close();
                                        }
                                        throw th;
                                    }
                                    cursorRawQuery.close();
                                    Preconditions.checkNotEmpty(str24);
                                    Preconditions.checkNotNull(map2);
                                    arrayMap3 = new ArrayMap();
                                    if (!map2.isEmpty()) {
                                        it2 = map2.keySet().iterator();
                                        while (it2.hasNext()) {
                                            num = (Integer) it2.next();
                                            num.intValue();
                                            zzgiVar2 = (com.google.android.gms.internal.measurement.zzgi) map2.get(num);
                                            list4 = (List) arrayMap2.get(num);
                                            if (list4 != null) {
                                            }
                                            map4 = arrayMap2;
                                            str8 = str20;
                                            arrayMap3.put(num, zzgiVar2);
                                            arrayMap2 = map4;
                                            it2 = it2;
                                            str20 = str8;
                                        }
                                    }
                                    str3 = str20;
                                    map3 = arrayMap3;
                                } catch (Throwable th7) {
                                    th = th7;
                                    r5 = sQLiteDatabaseZzh;
                                    if (r5 != 0) {
                                        r5.close();
                                    }
                                    throw th;
                                }
                            } else {
                                str3 = "Database error querying filters. appId";
                                map3 = map2;
                            }
                            while (r17.hasNext()) {
                                num2.intValue();
                                zzgiVar = (com.google.android.gms.internal.measurement.zzgi) map3.get(num2);
                                bitSet = new BitSet();
                                bitSet2 = new BitSet();
                                arrayMap = new ArrayMap();
                                if (zzgiVar != null) {
                                    while (r2.hasNext()) {
                                        if (zzfrVar.zzh()) {
                                            Integer numValueOf8 = Integer.valueOf(zzfrVar.zza());
                                            if (zzfrVar.zzg()) {
                                                lValueOf = Long.valueOf(zzfrVar.zzb());
                                            } else {
                                                lValueOf = null;
                                            }
                                            arrayMap.put(numValueOf8, lValueOf);
                                        }
                                    }
                                }
                                ArrayMap arrayMap11 = new ArrayMap();
                                if (zzgiVar != null) {
                                    it = zzgiVar.zzj().iterator();
                                    while (it.hasNext()) {
                                        zzgkVar = (com.google.android.gms.internal.measurement.zzgk) it.next();
                                        if (!zzgkVar.zzi()) {
                                        }
                                    }
                                }
                                Map map7 = map3;
                                if (zzgiVar != null) {
                                    i3 = 0;
                                    while (i3 < zzgiVar.zzd() * 64) {
                                        if (zzlj.zzw(zzgiVar.zzk(), i3)) {
                                            str6 = str19;
                                            this.zzt.zzaA().zzj().zzc("Filter already evaluated. audience ID, filter ID", num2, Integer.valueOf(i3));
                                            bitSet2.set(i3);
                                            if (zzlj.zzw(zzgiVar.zzi(), i3)) {
                                                bitSet.set(i3);
                                            }
                                            i3++;
                                            str19 = str6;
                                        } else {
                                            str6 = str19;
                                        }
                                        arrayMap.remove(Integer.valueOf(i3));
                                        i3++;
                                        str19 = str6;
                                    }
                                }
                                String str28 = str19;
                                com.google.android.gms.internal.measurement.zzgi zzgiVar4 = (com.google.android.gms.internal.measurement.zzgi) map2.get(num2);
                                if (!zZzs2) {
                                }
                                this.zzc.put(num2, new zzu(this, this.zza, zzgiVar4, bitSet, bitSet2, arrayMap, arrayMap11, null));
                                str19 = str28;
                                map = map;
                                zZzs = zZzs;
                                map3 = map7;
                                map2 = map2;
                            }
                            str4 = str19;
                            str5 = str3;
                        }
                        if (!list.isEmpty()) {
                            zzwVar = new zzw(this, null);
                            arrayMap4 = new ArrayMap();
                            it3 = list.iterator();
                            while (it3.hasNext()) {
                                zzftVar = (com.google.android.gms.internal.measurement.zzft) it3.next();
                                zzftVarZza = zzwVar.zza(this.zza, zzftVar);
                                if (zzftVarZza != null) {
                                    zzakVarZzh = this.zzf.zzh();
                                    str9 = this.zza;
                                    strZzh = zzftVarZza.zzh();
                                    zzaqVarZzn = zzakVarZzh.zzn(str9, zzftVar.zzh());
                                    if (zzaqVarZzn == null) {
                                        zzakVarZzh.zzt.zzaA().zzk().zzc("Event aggregate wasn't created during raw event logging. appId, event", zzet.zzn(str9), zzakVarZzh.zzt.zzj().zzd(strZzh));
                                        zzaqVar = new zzaq(str9, zzftVar.zzh(), 1L, 1L, 1L, zzftVar.zzd(), 0L, null, null, null, null);
                                    } else {
                                        zzaqVar = new zzaq(zzaqVarZzn.zza, zzaqVarZzn.zzb, zzaqVarZzn.zzc + 1, zzaqVarZzn.zzd + 1, zzaqVarZzn.zze + 1, zzaqVarZzn.zzf, zzaqVarZzn.zzg, zzaqVarZzn.zzh, zzaqVarZzn.zzi, zzaqVarZzn.zzj, zzaqVarZzn.zzk);
                                    }
                                    this.zzf.zzh().zzE(zzaqVar);
                                    j = zzaqVar.zzc;
                                    strZzh2 = zzftVarZza.zzh();
                                    mapEmptyMap = (Map) arrayMap4.get(strZzh2);
                                    if (mapEmptyMap == null) {
                                        zzak zzakVarZzh9 = this.zzf.zzh();
                                        str11 = this.zza;
                                        zzakVarZzh9.zzW();
                                        zzakVarZzh9.zzg();
                                        Preconditions.checkNotEmpty(str11);
                                        Preconditions.checkNotEmpty(strZzh2);
                                        arrayMap5 = new ArrayMap();
                                        SQLiteDatabase sQLiteDatabaseZzh4 = zzakVarZzh9.zzh();
                                        String[] strArr2 = new String[2];
                                        str12 = str21;
                                        strArr2[0] = str12;
                                        strArr2[1] = "data";
                                        str10 = str16;
                                        cursorQuery2 = sQLiteDatabaseZzh4.query("event_filters", strArr2, "app_id=? AND event_name=?", new String[]{str11, strZzh2}, null, null, null);
                                        if (cursorQuery2.moveToFirst()) {
                                            str21 = str12;
                                            while (true) {
                                                com.google.android.gms.internal.measurement.zzek zzekVar7 = (com.google.android.gms.internal.measurement.zzek) ((com.google.android.gms.internal.measurement.zzej) zzlj.zzm(com.google.android.gms.internal.measurement.zzek.zzc(), cursorQuery2.getBlob(1))).zzaD();
                                                numValueOf2 = Integer.valueOf(cursorQuery2.getInt(0));
                                                list5 = (List) arrayMap5.get(numValueOf2);
                                                if (list5 == null) {
                                                    zzaqVar = zzaqVar;
                                                    arrayList2 = new ArrayList();
                                                    arrayMap5.put(numValueOf2, arrayList2);
                                                } else {
                                                    zzaqVar = zzaqVar;
                                                    arrayList2 = list5;
                                                }
                                                arrayList2.add(zzekVar7);
                                                if (!cursorQuery2.moveToNext()) {
                                                    break;
                                                    break;
                                                }
                                                zzaqVar = zzaqVar;
                                            }
                                            cursorQuery2.close();
                                            mapEmptyMap = arrayMap5;
                                        } else {
                                            str21 = str12;
                                            zzaqVar = zzaqVar;
                                            mapEmptyMap = Collections.emptyMap();
                                            cursorQuery2.close();
                                        }
                                        arrayMap4.put(strZzh2, mapEmptyMap);
                                    } else {
                                        zzaqVar = zzaqVar;
                                        str10 = str16;
                                    }
                                    while (r2.hasNext()) {
                                        iIntValue = num3.intValue();
                                        if (this.zzb.contains(num3)) {
                                            this.zzt.zzaA().zzj().zzb("Skipping failed audience ID", num3);
                                        } else {
                                            it4 = ((List) mapEmptyMap.get(num3)).iterator();
                                            zZzd = true;
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    map5 = mapEmptyMap;
                                                    break;
                                                }
                                                com.google.android.gms.internal.measurement.zzek zzekVar8 = (com.google.android.gms.internal.measurement.zzek) it4.next();
                                                zzxVar = new zzx(this, this.zza, iIntValue, zzekVar8);
                                                map5 = mapEmptyMap;
                                                zZzd = zzxVar.zzd(this.zzd, this.zze, zzftVarZza, j, zzaqVar, zzf(iIntValue, zzekVar8.zzb()));
                                                if (zZzd) {
                                                    this.zzb.add(num3);
                                                    break;
                                                }
                                                zzd(num3).zzc(zzxVar);
                                                mapEmptyMap = map5;
                                            }
                                            if (!zZzd) {
                                                this.zzb.add(num3);
                                            }
                                            mapEmptyMap = map5;
                                        }
                                    }
                                    zzwVar = zzwVar;
                                    it3 = it3;
                                    str16 = str10;
                                }
                            }
                        }
                        str13 = str16;
                        if (!list2.isEmpty()) {
                            arrayMap6 = new ArrayMap();
                            it5 = list2.iterator();
                            while (it5.hasNext()) {
                                com.google.android.gms.internal.measurement.zzgm zzgmVar2 = (com.google.android.gms.internal.measurement.zzgm) it5.next();
                                strZzf = zzgmVar2.zzf();
                                mapEmptyMap2 = (Map) arrayMap6.get(strZzf);
                                if (mapEmptyMap2 == null) {
                                    zzakVarZzh3 = this.zzf.zzh();
                                    str15 = this.zza;
                                    zzakVarZzh3.zzW();
                                    zzakVarZzh3.zzg();
                                    Preconditions.checkNotEmpty(str15);
                                    Preconditions.checkNotEmpty(strZzf);
                                    arrayMap7 = new ArrayMap();
                                    cursorQuery3 = zzakVarZzh3.zzh().query("property_filters", new String[]{str21, "data"}, "app_id=? AND property_name=?", new String[]{str15, strZzf}, null, null, null);
                                    if (cursorQuery3.moveToFirst()) {
                                        do {
                                            com.google.android.gms.internal.measurement.zzet zzetVar3 = (com.google.android.gms.internal.measurement.zzet) ((com.google.android.gms.internal.measurement.zzes) zzlj.zzm(com.google.android.gms.internal.measurement.zzet.zzc(), cursorQuery3.getBlob(1))).zzaD();
                                            numValueOf5 = Integer.valueOf(cursorQuery3.getInt(0));
                                            arrayList4 = (List) arrayMap7.get(numValueOf5);
                                            if (arrayList4 == null) {
                                                arrayList4 = new ArrayList();
                                                arrayMap7.put(numValueOf5, arrayList4);
                                            }
                                            arrayList4.add(zzetVar3);
                                        } while (cursorQuery3.moveToNext());
                                        cursorQuery3.close();
                                        mapEmptyMap2 = arrayMap7;
                                    } else {
                                        mapEmptyMap2 = Collections.emptyMap();
                                        cursorQuery3.close();
                                    }
                                    arrayMap6.put(strZzf, mapEmptyMap2);
                                }
                                while (r5.hasNext()) {
                                    int iIntValue4 = num4.intValue();
                                    if (this.zzb.contains(num4)) {
                                        this.zzt.zzaA().zzj().zzb("Skipping failed audience ID", num4);
                                        break;
                                        break;
                                    }
                                    it6 = ((List) mapEmptyMap2.get(num4)).iterator();
                                    zZzd2 = true;
                                    while (true) {
                                        if (it6.hasNext()) {
                                            zzetVar = (com.google.android.gms.internal.measurement.zzet) it6.next();
                                            if (Log.isLoggable(this.zzt.zzaA().zzr(), 2)) {
                                                zzer zzerVarZzj2 = this.zzt.zzaA().zzj();
                                                if (zzetVar.zzj()) {
                                                    numValueOf4 = Integer.valueOf(zzetVar.zza());
                                                } else {
                                                    numValueOf4 = null;
                                                }
                                                zzerVarZzj2.zzd("Evaluating filter. audience, filter, property", num4, numValueOf4, this.zzt.zzj().zzf(zzetVar.zze()));
                                                this.zzt.zzaA().zzj().zzb("Filter definition", this.zzf.zzu().zzq(zzetVar));
                                            }
                                            if (zzetVar.zzj()) {
                                            }
                                            zzer zzerVarZzk2 = this.zzt.zzaA().zzk();
                                            Object objZzn2 = zzet.zzn(this.zza);
                                            if (zzetVar.zzj()) {
                                                numValueOf3 = Integer.valueOf(zzetVar.zza());
                                            } else {
                                                numValueOf3 = null;
                                            }
                                            zzerVarZzk2.zzc("Invalid property filter ID. appId, id", objZzn2, String.valueOf(numValueOf3));
                                            this.zzb.add(num4);
                                        }
                                        if (!zZzd2) {
                                            this.zzb.add(num4);
                                        }
                                        zzd(num4).zzc(zzzVar);
                                    }
                                }
                            }
                        }
                        arrayList3 = new ArrayList();
                        Set<Integer> setKeySet2 = this.zzc.keySet();
                        setKeySet2.removeAll(this.zzb);
                        while (r2.hasNext()) {
                            int iIntValue5 = num5.intValue();
                            zzu zzuVar2 = (zzu) this.zzc.get(num5);
                            Preconditions.checkNotNull(zzuVar2);
                            com.google.android.gms.internal.measurement.zzfp zzfpVarZza2 = zzuVar2.zza(iIntValue5);
                            arrayList3.add(zzfpVarZza2);
                            zzakVarZzh2 = this.zzf.zzh();
                            str14 = this.zza;
                            com.google.android.gms.internal.measurement.zzgi zzgiVarZzd2 = zzfpVarZza2.zzd();
                            zzakVarZzh2.zzW();
                            zzakVarZzh2.zzg();
                            Preconditions.checkNotEmpty(str14);
                            Preconditions.checkNotNull(zzgiVarZzd2);
                            byte[] bArrZzbx2 = zzgiVarZzd2.zzbx();
                            contentValues = new ContentValues();
                            contentValues.put("app_id", str14);
                            String str29 = str21;
                            contentValues.put(str29, num5);
                            String str210 = str13;
                            contentValues.put(str210, bArrZzbx2);
                            if (zzakVarZzh2.zzh().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                zzakVarZzh2.zzt.zzaA().zzd().zzb("Failed to insert filter results (got -1). appId", zzet.zzn(str14));
                            }
                            str21 = str29;
                            str13 = str210;
                        }
                        return arrayList3;
                    }
                } catch (SQLiteException e22) {
                    e = e22;
                    cursorQuery4 = null;
                } catch (Throwable th8) {
                    th = th8;
                    r6 = 0;
                    if (r6 != 0) {
                        r6.close();
                    }
                    throw th;
                }
            } catch (Throwable th9) {
                th = th9;
                r6 = str2;
                if (r6 != 0) {
                    r6.close();
                }
                throw th;
            }
        } else {
            map = mapEmptyMap3;
        }
        zzak zzakVarZzh10 = this.zzf.zzh();
        String str211 = this.zza;
        zzakVarZzh10.zzW();
        zzakVarZzh10.zzg();
        Preconditions.checkNotEmpty(str211);
        try {
            cursorQuery = zzakVarZzh10.zzh().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str211}, null, null, null);
            try {
                if (cursorQuery.moveToFirst()) {
                    Map mapEmptyMap6 = Collections.emptyMap();
                    cursorQuery.close();
                    map2 = mapEmptyMap6;
                    str21 = "audience_id";
                } else {
                    arrayMap8 = new ArrayMap();
                    while (true) {
                        i4 = cursorQuery.getInt(0);
                        arrayMap8.put(Integer.valueOf(i4), (com.google.android.gms.internal.measurement.zzgi) ((com.google.android.gms.internal.measurement.zzgh) zzlj.zzm(com.google.android.gms.internal.measurement.zzgi.zze(), cursorQuery.getBlob(1))).zzaD());
                        if (!cursorQuery.moveToNext()) {
                            break;
                            break;
                        }
                        arrayMap8 = arrayMap8;
                        str21 = str21;
                    }
                    cursorQuery.close();
                    map2 = arrayMap8;
                }
                if (map2.isEmpty()) {
                    str5 = "Database error querying filters. appId";
                    str4 = "Failed to merge filter. appId";
                } else {
                    HashSet<Integer> hashSet2 = new HashSet(map2.keySet());
                    if (z) {
                        String str212 = this.zza;
                        zzak zzakVarZzh11 = this.zzf.zzh();
                        str7 = this.zza;
                        zzakVarZzh11.zzW();
                        zzakVarZzh11.zzg();
                        Preconditions.checkNotEmpty(str7);
                        arrayMap2 = new ArrayMap();
                        sQLiteDatabaseZzh = zzakVarZzh11.zzh();
                        cursorRawQuery = sQLiteDatabaseZzh.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str7, str7});
                        if (cursorRawQuery.moveToFirst()) {
                            do {
                                numValueOf = Integer.valueOf(cursorRawQuery.getInt(0));
                                arrayList = (List) arrayMap2.get(numValueOf);
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                    arrayMap2.put(numValueOf, arrayList);
                                }
                                arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                            } while (cursorRawQuery.moveToNext());
                        } else {
                            arrayMap2 = Collections.emptyMap();
                        }
                        cursorRawQuery.close();
                        Preconditions.checkNotEmpty(str212);
                        Preconditions.checkNotNull(map2);
                        arrayMap3 = new ArrayMap();
                        if (!map2.isEmpty()) {
                            it2 = map2.keySet().iterator();
                            while (it2.hasNext()) {
                                num = (Integer) it2.next();
                                num.intValue();
                                zzgiVar2 = (com.google.android.gms.internal.measurement.zzgi) map2.get(num);
                                list4 = (List) arrayMap2.get(num);
                                if (list4 != null || list4.isEmpty()) {
                                    map4 = arrayMap2;
                                    str8 = str20;
                                    arrayMap3.put(num, zzgiVar2);
                                    arrayMap2 = map4;
                                    it2 = it2;
                                    str20 = str8;
                                } else {
                                    map4 = arrayMap2;
                                    List listZzr = this.zzf.zzu().zzr(zzgiVar2.zzi(), list4);
                                    if (listZzr.isEmpty()) {
                                        arrayMap2 = map4;
                                    } else {
                                        com.google.android.gms.internal.measurement.zzgh zzghVar = (com.google.android.gms.internal.measurement.zzgh) zzgiVar2.zzbB();
                                        zzghVar.zzf();
                                        zzghVar.zzb(listZzr);
                                        List listZzr2 = this.zzf.zzu().zzr(zzgiVar2.zzk(), list4);
                                        zzghVar.zzh();
                                        zzghVar.zzd(listZzr2);
                                        ArrayList arrayList6 = new ArrayList();
                                        Iterator it8 = zzgiVar2.zzh().iterator();
                                        while (it8.hasNext()) {
                                            Iterator it9 = it8;
                                            com.google.android.gms.internal.measurement.zzfr zzfrVar2 = (com.google.android.gms.internal.measurement.zzfr) it8.next();
                                            String str30 = str20;
                                            if (!list4.contains(Integer.valueOf(zzfrVar2.zza()))) {
                                                arrayList6.add(zzfrVar2);
                                            }
                                            it8 = it9;
                                            str20 = str30;
                                        }
                                        str8 = str20;
                                        zzghVar.zze();
                                        zzghVar.zza(arrayList6);
                                        ArrayList arrayList7 = new ArrayList();
                                        for (com.google.android.gms.internal.measurement.zzgk zzgkVar2 : zzgiVar2.zzj()) {
                                            if (!list4.contains(Integer.valueOf(zzgkVar2.zzb()))) {
                                                arrayList7.add(zzgkVar2);
                                            }
                                        }
                                        zzghVar.zzg();
                                        zzghVar.zzc(arrayList7);
                                        arrayMap3.put(num, (com.google.android.gms.internal.measurement.zzgi) zzghVar.zzaD());
                                        arrayMap2 = map4;
                                        it2 = it2;
                                        str20 = str8;
                                    }
                                }
                            }
                        }
                        str3 = str20;
                        map3 = arrayMap3;
                    } else {
                        str3 = "Database error querying filters. appId";
                        map3 = map2;
                    }
                    while (r17.hasNext()) {
                        num2.intValue();
                        zzgiVar = (com.google.android.gms.internal.measurement.zzgi) map3.get(num2);
                        bitSet = new BitSet();
                        bitSet2 = new BitSet();
                        arrayMap = new ArrayMap();
                        if (zzgiVar != null && zzgiVar.zza() != 0) {
                            while (r2.hasNext()) {
                                if (zzfrVar.zzh()) {
                                    Integer numValueOf9 = Integer.valueOf(zzfrVar.zza());
                                    if (zzfrVar.zzg()) {
                                        lValueOf = Long.valueOf(zzfrVar.zzb());
                                    } else {
                                        lValueOf = null;
                                    }
                                    arrayMap.put(numValueOf9, lValueOf);
                                }
                            }
                        }
                        ArrayMap arrayMap12 = new ArrayMap();
                        if (zzgiVar != null && zzgiVar.zzc() != 0) {
                            it = zzgiVar.zzj().iterator();
                            while (it.hasNext()) {
                                zzgkVar = (com.google.android.gms.internal.measurement.zzgk) it.next();
                                if (!zzgkVar.zzi() && zzgkVar.zza() > 0) {
                                    arrayMap12.put(Integer.valueOf(zzgkVar.zzb()), Long.valueOf(zzgkVar.zzc(zzgkVar.zza() - 1)));
                                    map3 = map3;
                                    it = it;
                                }
                            }
                        }
                        Map map8 = map3;
                        if (zzgiVar != null) {
                            i3 = 0;
                            while (i3 < zzgiVar.zzd() * 64) {
                                if (zzlj.zzw(zzgiVar.zzk(), i3)) {
                                    str6 = str19;
                                    this.zzt.zzaA().zzj().zzc("Filter already evaluated. audience ID, filter ID", num2, Integer.valueOf(i3));
                                    bitSet2.set(i3);
                                    if (zzlj.zzw(zzgiVar.zzi(), i3)) {
                                        bitSet.set(i3);
                                    }
                                    i3++;
                                    str19 = str6;
                                } else {
                                    str6 = str19;
                                }
                                arrayMap.remove(Integer.valueOf(i3));
                                i3++;
                                str19 = str6;
                            }
                        }
                        String str213 = str19;
                        com.google.android.gms.internal.measurement.zzgi zzgiVar5 = (com.google.android.gms.internal.measurement.zzgi) map2.get(num2);
                        if (!zZzs2 && zZzs && (list3 = (List) map.get(num2)) != null && this.zze != null && this.zzd != null) {
                            for (com.google.android.gms.internal.measurement.zzek zzekVar9 : list3) {
                                int iZzb = zzekVar9.zzb();
                                long jLongValue = this.zze.longValue() / 1000;
                                if (zzekVar9.zzm()) {
                                    jLongValue = this.zzd.longValue() / 1000;
                                }
                                Integer numValueOf10 = Integer.valueOf(iZzb);
                                if (arrayMap.containsKey(numValueOf10)) {
                                    arrayMap.put(numValueOf10, Long.valueOf(jLongValue));
                                }
                                if (arrayMap12.containsKey(numValueOf10)) {
                                    arrayMap12.put(numValueOf10, Long.valueOf(jLongValue));
                                }
                            }
                        }
                        this.zzc.put(num2, new zzu(this, this.zza, zzgiVar5, bitSet, bitSet2, arrayMap, arrayMap12, null));
                        str19 = str213;
                        map = map;
                        zZzs = zZzs;
                        map3 = map8;
                        map2 = map2;
                    }
                    str4 = str19;
                    str5 = str3;
                }
                if (!list.isEmpty()) {
                    zzwVar = new zzw(this, null);
                    arrayMap4 = new ArrayMap();
                    it3 = list.iterator();
                    while (it3.hasNext()) {
                        zzftVar = (com.google.android.gms.internal.measurement.zzft) it3.next();
                        zzftVarZza = zzwVar.zza(this.zza, zzftVar);
                        if (zzftVarZza != null) {
                            zzakVarZzh = this.zzf.zzh();
                            str9 = this.zza;
                            strZzh = zzftVarZza.zzh();
                            zzaqVarZzn = zzakVarZzh.zzn(str9, zzftVar.zzh());
                            if (zzaqVarZzn == null) {
                                zzakVarZzh.zzt.zzaA().zzk().zzc("Event aggregate wasn't created during raw event logging. appId, event", zzet.zzn(str9), zzakVarZzh.zzt.zzj().zzd(strZzh));
                                zzaqVar = new zzaq(str9, zzftVar.zzh(), 1L, 1L, 1L, zzftVar.zzd(), 0L, null, null, null, null);
                            } else {
                                zzaqVar = new zzaq(zzaqVarZzn.zza, zzaqVarZzn.zzb, zzaqVarZzn.zzc + 1, zzaqVarZzn.zzd + 1, zzaqVarZzn.zze + 1, zzaqVarZzn.zzf, zzaqVarZzn.zzg, zzaqVarZzn.zzh, zzaqVarZzn.zzi, zzaqVarZzn.zzj, zzaqVarZzn.zzk);
                            }
                            this.zzf.zzh().zzE(zzaqVar);
                            j = zzaqVar.zzc;
                            strZzh2 = zzftVarZza.zzh();
                            mapEmptyMap = (Map) arrayMap4.get(strZzh2);
                            if (mapEmptyMap == null) {
                                zzak zzakVarZzh12 = this.zzf.zzh();
                                str11 = this.zza;
                                zzakVarZzh12.zzW();
                                zzakVarZzh12.zzg();
                                Preconditions.checkNotEmpty(str11);
                                Preconditions.checkNotEmpty(strZzh2);
                                arrayMap5 = new ArrayMap();
                                SQLiteDatabase sQLiteDatabaseZzh5 = zzakVarZzh12.zzh();
                                String[] strArr3 = new String[2];
                                str12 = str21;
                                strArr3[0] = str12;
                                strArr3[1] = "data";
                                str10 = str16;
                                cursorQuery2 = sQLiteDatabaseZzh5.query("event_filters", strArr3, "app_id=? AND event_name=?", new String[]{str11, strZzh2}, null, null, null);
                                if (cursorQuery2.moveToFirst()) {
                                    str21 = str12;
                                    while (true) {
                                        com.google.android.gms.internal.measurement.zzek zzekVar10 = (com.google.android.gms.internal.measurement.zzek) ((com.google.android.gms.internal.measurement.zzej) zzlj.zzm(com.google.android.gms.internal.measurement.zzek.zzc(), cursorQuery2.getBlob(1))).zzaD();
                                        numValueOf2 = Integer.valueOf(cursorQuery2.getInt(0));
                                        list5 = (List) arrayMap5.get(numValueOf2);
                                        if (list5 == null) {
                                            zzaqVar = zzaqVar;
                                            arrayList2 = new ArrayList();
                                            arrayMap5.put(numValueOf2, arrayList2);
                                        } else {
                                            zzaqVar = zzaqVar;
                                            arrayList2 = list5;
                                        }
                                        arrayList2.add(zzekVar10);
                                        if (!cursorQuery2.moveToNext()) {
                                            break;
                                            break;
                                        }
                                        zzaqVar = zzaqVar;
                                    }
                                    cursorQuery2.close();
                                    mapEmptyMap = arrayMap5;
                                } else {
                                    str21 = str12;
                                    zzaqVar = zzaqVar;
                                    mapEmptyMap = Collections.emptyMap();
                                    cursorQuery2.close();
                                }
                                arrayMap4.put(strZzh2, mapEmptyMap);
                            } else {
                                zzaqVar = zzaqVar;
                                str10 = str16;
                            }
                            while (r2.hasNext()) {
                                iIntValue = num3.intValue();
                                if (this.zzb.contains(num3)) {
                                    this.zzt.zzaA().zzj().zzb("Skipping failed audience ID", num3);
                                } else {
                                    it4 = ((List) mapEmptyMap.get(num3)).iterator();
                                    zZzd = true;
                                    while (true) {
                                        if (it4.hasNext()) {
                                            map5 = mapEmptyMap;
                                            break;
                                        }
                                        com.google.android.gms.internal.measurement.zzek zzekVar11 = (com.google.android.gms.internal.measurement.zzek) it4.next();
                                        zzxVar = new zzx(this, this.zza, iIntValue, zzekVar11);
                                        map5 = mapEmptyMap;
                                        zZzd = zzxVar.zzd(this.zzd, this.zze, zzftVarZza, j, zzaqVar, zzf(iIntValue, zzekVar11.zzb()));
                                        if (zZzd) {
                                            this.zzb.add(num3);
                                            break;
                                        }
                                        zzd(num3).zzc(zzxVar);
                                        mapEmptyMap = map5;
                                    }
                                    if (!zZzd) {
                                        this.zzb.add(num3);
                                    }
                                    mapEmptyMap = map5;
                                }
                            }
                            zzwVar = zzwVar;
                            it3 = it3;
                            str16 = str10;
                        }
                    }
                }
                str13 = str16;
                if (!list2.isEmpty()) {
                    arrayMap6 = new ArrayMap();
                    it5 = list2.iterator();
                    while (it5.hasNext()) {
                        com.google.android.gms.internal.measurement.zzgm zzgmVar3 = (com.google.android.gms.internal.measurement.zzgm) it5.next();
                        strZzf = zzgmVar3.zzf();
                        mapEmptyMap2 = (Map) arrayMap6.get(strZzf);
                        if (mapEmptyMap2 == null) {
                            zzakVarZzh3 = this.zzf.zzh();
                            str15 = this.zza;
                            zzakVarZzh3.zzW();
                            zzakVarZzh3.zzg();
                            Preconditions.checkNotEmpty(str15);
                            Preconditions.checkNotEmpty(strZzf);
                            arrayMap7 = new ArrayMap();
                            cursorQuery3 = zzakVarZzh3.zzh().query("property_filters", new String[]{str21, "data"}, "app_id=? AND property_name=?", new String[]{str15, strZzf}, null, null, null);
                            if (cursorQuery3.moveToFirst()) {
                                do {
                                    com.google.android.gms.internal.measurement.zzet zzetVar4 = (com.google.android.gms.internal.measurement.zzet) ((com.google.android.gms.internal.measurement.zzes) zzlj.zzm(com.google.android.gms.internal.measurement.zzet.zzc(), cursorQuery3.getBlob(1))).zzaD();
                                    numValueOf5 = Integer.valueOf(cursorQuery3.getInt(0));
                                    arrayList4 = (List) arrayMap7.get(numValueOf5);
                                    if (arrayList4 == null) {
                                        arrayList4 = new ArrayList();
                                        arrayMap7.put(numValueOf5, arrayList4);
                                    }
                                    arrayList4.add(zzetVar4);
                                } while (cursorQuery3.moveToNext());
                                cursorQuery3.close();
                                mapEmptyMap2 = arrayMap7;
                            } else {
                                mapEmptyMap2 = Collections.emptyMap();
                                cursorQuery3.close();
                            }
                            arrayMap6.put(strZzf, mapEmptyMap2);
                        }
                        while (r5.hasNext()) {
                            int iIntValue6 = num4.intValue();
                            if (this.zzb.contains(num4)) {
                                this.zzt.zzaA().zzj().zzb("Skipping failed audience ID", num4);
                                break;
                                break;
                            }
                            it6 = ((List) mapEmptyMap2.get(num4)).iterator();
                            zZzd2 = true;
                            while (true) {
                                if (it6.hasNext()) {
                                    zzetVar = (com.google.android.gms.internal.measurement.zzet) it6.next();
                                    if (Log.isLoggable(this.zzt.zzaA().zzr(), 2)) {
                                        zzer zzerVarZzj3 = this.zzt.zzaA().zzj();
                                        if (zzetVar.zzj()) {
                                            numValueOf4 = Integer.valueOf(zzetVar.zza());
                                        } else {
                                            numValueOf4 = null;
                                        }
                                        zzerVarZzj3.zzd("Evaluating filter. audience, filter, property", num4, numValueOf4, this.zzt.zzj().zzf(zzetVar.zze()));
                                        this.zzt.zzaA().zzj().zzb("Filter definition", this.zzf.zzu().zzq(zzetVar));
                                    }
                                    if (zzetVar.zzj() || zzetVar.zza() > 256) {
                                        zzer zzerVarZzk3 = this.zzt.zzaA().zzk();
                                        Object objZzn3 = zzet.zzn(this.zza);
                                        if (zzetVar.zzj()) {
                                            numValueOf3 = Integer.valueOf(zzetVar.zza());
                                        } else {
                                            numValueOf3 = null;
                                        }
                                        zzerVarZzk3.zzc("Invalid property filter ID. appId, id", objZzn3, String.valueOf(numValueOf3));
                                        this.zzb.add(num4);
                                    } else {
                                        zzzVar = new zzz(this, this.zza, iIntValue6, zzetVar);
                                        zZzd2 = zzzVar.zzd(this.zzd, this.zze, zzgmVar3, zzf(iIntValue6, zzetVar.zza()));
                                        if (zZzd2) {
                                            zzd(num4).zzc(zzzVar);
                                        } else {
                                            this.zzb.add(num4);
                                        }
                                    }
                                }
                                if (!zZzd2) {
                                    this.zzb.add(num4);
                                }
                            }
                        }
                    }
                }
                arrayList3 = new ArrayList();
                Set<Integer> setKeySet3 = this.zzc.keySet();
                setKeySet3.removeAll(this.zzb);
                while (r2.hasNext()) {
                    int iIntValue7 = num5.intValue();
                    zzu zzuVar3 = (zzu) this.zzc.get(num5);
                    Preconditions.checkNotNull(zzuVar3);
                    com.google.android.gms.internal.measurement.zzfp zzfpVarZza3 = zzuVar3.zza(iIntValue7);
                    arrayList3.add(zzfpVarZza3);
                    zzakVarZzh2 = this.zzf.zzh();
                    str14 = this.zza;
                    com.google.android.gms.internal.measurement.zzgi zzgiVarZzd3 = zzfpVarZza3.zzd();
                    zzakVarZzh2.zzW();
                    zzakVarZzh2.zzg();
                    Preconditions.checkNotEmpty(str14);
                    Preconditions.checkNotNull(zzgiVarZzd3);
                    byte[] bArrZzbx3 = zzgiVarZzd3.zzbx();
                    contentValues = new ContentValues();
                    contentValues.put("app_id", str14);
                    String str214 = str21;
                    contentValues.put(str214, num5);
                    String str215 = str13;
                    contentValues.put(str215, bArrZzbx3);
                    if (zzakVarZzh2.zzh().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                        zzakVarZzh2.zzt.zzaA().zzd().zzb("Failed to insert filter results (got -1). appId", zzet.zzn(str14));
                    }
                    str21 = str214;
                    str13 = str215;
                }
                return arrayList3;
            } catch (Throwable th10) {
                th = th10;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e23) {
            e = e23;
            str21 = "audience_id";
            cursorQuery = null;
        } catch (Throwable th11) {
            th = th11;
            cursor = null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzku
    public final boolean zzb() {
        return false;
    }
}
