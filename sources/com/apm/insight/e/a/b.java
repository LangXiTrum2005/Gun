package com.apm.insight.e.a;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a<com.apm.insight.d.a> {
    public b() {
        super("duplicatelog");
    }

    @Override // com.apm.insight.e.a.a
    public final /* synthetic */ ContentValues a(com.apm.insight.d.a aVar) {
        com.apm.insight.d.a aVar2 = aVar;
        ContentValues contentValues = new ContentValues();
        contentValues.put(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, aVar2.f83a);
        contentValues.put("insert_time", Long.valueOf(aVar2.b));
        return contentValues;
    }

    public final boolean a(SQLiteDatabase sQLiteDatabase, String str) {
        int count;
        if (sQLiteDatabase != null && !TextUtils.isEmpty(str)) {
            try {
                Cursor cursorQuery = sQLiteDatabase.query(this.f87a, null, "path=?", new String[]{str}, null, null, null);
                count = cursorQuery.getCount();
                try {
                    cursorQuery.close();
                } catch (Throwable th) {
                    th = th;
                    com.apm.insight.a.b(th);
                }
            } catch (Throwable th2) {
                th = th2;
                count = 0;
            }
            if (count > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.apm.insight.e.a.a
    public final void a(SQLiteDatabase sQLiteDatabase, com.apm.insight.d.a aVar) {
        if (aVar == null || a(sQLiteDatabase, aVar.f83a)) {
            return;
        }
        super.a(sQLiteDatabase, aVar);
        try {
            sQLiteDatabase.execSQL("delete from " + this.f87a + " where _id in (select _id from " + this.f87a + " order by insert_time desc limit 1000 offset 500)");
        } catch (Exception e) {
            com.apm.insight.a.b((Throwable) e);
        }
    }

    @Override // com.apm.insight.e.a.a
    public final HashMap<String, String> a() {
        HashMap<String, String> map = new HashMap<>();
        map.put(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, "TEXT");
        map.put("insert_time", "INTEGER");
        map.put("ext1", "TEXT");
        map.put("ext2", "TEXT");
        return map;
    }
}
