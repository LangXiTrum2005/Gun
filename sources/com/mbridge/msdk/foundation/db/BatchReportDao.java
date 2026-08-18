package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.mbridge.msdk.foundation.same.report.BatchReportMessage;
import com.mbridge.msdk.system.NoProGuard;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class BatchReportDao extends a<BatchReportMessage> implements Serializable, NoProGuard {
    private static volatile BatchReportDao instance;
    private final Object lock;

    public BatchReportDao(f fVar) {
        super(fVar);
        this.lock = new Object();
    }

    public static BatchReportDao getInstance(f fVar) {
        if (instance == null) {
            synchronized (BatchReportDao.class) {
                try {
                    if (instance == null) {
                        instance = new BatchReportDao(fVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }

    public void addReportMessage(String str, int i) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        if (com.mbridge.msdk.util.d.a(writableDatabase)) {
            try {
                synchronized (this.lock) {
                    try {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("report_message", str);
                        contentValues.put("time", Long.valueOf(System.currentTimeMillis()));
                        contentValues.put("uuid", UUID.randomUUID().toString().replace("-", ""));
                        contentValues.put("report_state", (Integer) 0);
                        contentValues.put("type", Integer.valueOf(i));
                        writableDatabase.insert("batch_report", null, contentValues);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void deleteBatchReportMessagesByTimestamp(long j) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        if (com.mbridge.msdk.util.d.a(writableDatabase)) {
            try {
                synchronized (this.lock) {
                    writableDatabase.execSQL("delete from batch_report where time <= ?", new Object[]{Long.valueOf(j)});
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public ArrayList<BatchReportMessage> getBatchReportMessages(long j, int i) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        Cursor cursor = null;
        if (!com.mbridge.msdk.util.d.a(writableDatabase)) {
            return null;
        }
        ArrayList<BatchReportMessage> arrayList = new ArrayList<>();
        synchronized (this.lock) {
            try {
                try {
                    Cursor cursorRawQuery = writableDatabase.rawQuery("SELECT * FROM batch_report WHERE time <= ? AND report_state = 0 AND type = ? ORDER BY time ASC ", new String[]{String.valueOf(j), String.valueOf(i)});
                    if (cursorRawQuery != null) {
                        while (cursorRawQuery.moveToNext()) {
                            try {
                                arrayList.add(new BatchReportMessage(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("uuid")), cursorRawQuery.getString(cursorRawQuery.getColumnIndex("report_message")), cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("time"))));
                            } catch (Throwable th) {
                                th = th;
                                cursor = cursorRawQuery;
                                if (cursor != null) {
                                    try {
                                        cursor.close();
                                    } catch (Exception unused) {
                                    }
                                }
                                throw th;
                            }
                        }
                    }
                    if (cursorRawQuery != null) {
                        try {
                            cursorRawQuery.close();
                        } catch (Exception unused2) {
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("report_state", (Integer) 1);
                writableDatabase.update("batch_report", contentValues, "time <= ?", new String[]{String.valueOf(j)});
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return arrayList;
    }

    public void updateMessagesReportState(ArrayList<BatchReportMessage> arrayList) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        if (arrayList == null || arrayList.size() == 0 || !com.mbridge.msdk.util.d.a(writableDatabase)) {
            return;
        }
        for (BatchReportMessage batchReportMessage : arrayList) {
            try {
                synchronized (this.lock) {
                    try {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("report_state", (Integer) 0);
                        writableDatabase.update("batch_report", contentValues, "uuid = ?", new String[]{batchReportMessage.getUuid()});
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static BatchReportDao getInstance(Context context) {
        if (instance == null) {
            synchronized (BatchReportDao.class) {
                try {
                    if (instance == null) {
                        instance = new BatchReportDao(g.a(context));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }
}
