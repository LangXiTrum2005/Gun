package com.mbridge.msdk.tracker;

import android.database.Cursor;
import android.text.TextUtils;
import androidx.work.PeriodicWorkRequest;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
class y {
    public static long a(int i, long j, long j2) {
        if (i <= 0 || j == 0 || i <= 10) {
            return j2;
        }
        if (i <= 20) {
            return ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
        }
        if (i <= 30) {
            return UnityAdsConstants.Timeout.INIT_TIMEOUT_MS;
        }
        if (i <= 40) {
            return 180000L;
        }
        if (i <= 50) {
            return 240000L;
        }
        return PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS;
    }

    public static boolean b(Object obj) {
        return obj == null;
    }

    public static boolean a(Object obj) {
        return obj != null;
    }

    public static boolean b(List<?> list) {
        return list == null || list.isEmpty();
    }

    public static boolean a(List<i> list) {
        if (b((List<?>) list)) {
            return false;
        }
        for (i iVar : list) {
            if (!b(iVar)) {
                e eVarA = iVar.a();
                if (!b(eVarA) && eVarA.c() == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static List<i> b(Cursor cursor) {
        int i;
        int i2;
        int i3;
        ArrayList arrayList = new ArrayList();
        try {
            int columnIndex = cursor.getColumnIndex("name");
            int columnIndex2 = cursor.getColumnIndex("type");
            int columnIndex3 = cursor.getColumnIndex("time_stamp");
            int columnIndex4 = cursor.getColumnIndex("properties");
            int columnIndex5 = cursor.getColumnIndex(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
            int columnIndex6 = cursor.getColumnIndex("uuid");
            int columnIndex7 = cursor.getColumnIndex("duration");
            int columnIndex8 = cursor.getColumnIndex("state");
            int columnIndex9 = cursor.getColumnIndex("report_count");
            int columnIndex10 = cursor.getColumnIndex("ignore_max_timeout");
            int columnIndex11 = cursor.getColumnIndex("ignore_max_retry_times");
            int columnIndex12 = cursor.getColumnIndex("invalid_time");
            int columnIndex13 = cursor.getColumnIndex("report_error_message");
            while (cursor.moveToNext()) {
                try {
                    i = columnIndex;
                    try {
                        e eVar = new e(cursor.getString(columnIndex));
                        eVar.b(cursor.getInt(columnIndex2));
                        int i4 = columnIndex13;
                        try {
                            eVar.c(cursor.getLong(columnIndex3));
                            eVar.a(new JSONObject(cursor.getString(columnIndex4)));
                            eVar.a(cursor.getInt(columnIndex5));
                            eVar.a(cursor.getString(columnIndex6));
                            eVar.a(cursor.getLong(columnIndex7));
                            i iVar = new i(eVar);
                            iVar.b(cursor.getInt(columnIndex8));
                            iVar.a(cursor.getInt(columnIndex9));
                            iVar.b(cursor.getInt(columnIndex10) == 0);
                            iVar.a(cursor.getInt(columnIndex11) == 0);
                            i2 = columnIndex2;
                            try {
                                iVar.a(cursor.getLong(columnIndex12));
                                i3 = i4;
                                try {
                                    String string = cursor.getString(i3);
                                    if (TextUtils.isEmpty(string)) {
                                        string = "";
                                    }
                                    iVar.a(string);
                                    arrayList.add(iVar);
                                } catch (JSONException unused) {
                                }
                            } catch (JSONException unused2) {
                                i3 = i4;
                                columnIndex13 = i3;
                                columnIndex2 = i2;
                                columnIndex = i;
                            }
                        } catch (JSONException unused3) {
                            i2 = columnIndex2;
                        }
                    } catch (JSONException unused4) {
                        i2 = columnIndex2;
                        i3 = columnIndex13;
                        columnIndex13 = i3;
                        columnIndex2 = i2;
                        columnIndex = i;
                    }
                } catch (JSONException unused5) {
                    i = columnIndex;
                }
                columnIndex13 = i3;
                columnIndex2 = i2;
                columnIndex = i;
            }
        } catch (Exception unused6) {
        }
        return arrayList;
    }

    public static boolean a(e eVar) {
        return a((Object) eVar) && eVar.c() == 1;
    }

    public static void a(Cursor cursor) {
        try {
            if (!a((Object) cursor) || cursor.isClosed()) {
                return;
            }
            cursor.close();
        } catch (Exception unused) {
        }
    }
}
