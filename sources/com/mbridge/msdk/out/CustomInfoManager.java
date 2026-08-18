package com.mbridge.msdk.out;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.mbridge.msdk.system.NoProGuard;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class CustomInfoManager implements NoProGuard {
    private static CustomInfoManager INSTANCE = null;
    private static String TAG = "CustomInfoManager";
    public static final int TYPE_BID = 6;
    public static final int TYPE_BIDLOAD = 7;
    public static final int TYPE_LOAD = 8;
    private ConcurrentHashMap<String, String> infoMap = new ConcurrentHashMap<>();

    private CustomInfoManager() {
    }

    public static synchronized CustomInfoManager getInstance() {
        try {
            if (INSTANCE == null) {
                synchronized (CustomInfoManager.class) {
                    try {
                        if (INSTANCE == null) {
                            INSTANCE = new CustomInfoManager();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return INSTANCE;
    }

    public String getCustomInfoByType(String str, int i) {
        return TextUtils.isEmpty(str) ? "" : getCustomInfoByUnitId(str, i);
    }

    public String getCustomInfoByUnitId(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        try {
            Uri uri = Uri.parse(str2);
            if (uri != null) {
                String host = uri.getHost();
                String path = uri.getPath();
                if (!TextUtils.isEmpty(host) && host.contains(CampaignEx.JSON_KEY_HB) && !TextUtils.isEmpty(path) && path.contains(BidResponsed.KEY_BID_ID)) {
                    return getCustomInfoByUnitId(str, 6);
                }
                if (!TextUtils.isEmpty(host) && host.contains(CampaignEx.JSON_KEY_HB) && !TextUtils.isEmpty(path) && path.contains("load")) {
                    return getCustomInfoByUnitId(str, 7);
                }
                if (!TextUtils.isEmpty(path) && path.contains("v3")) {
                    return getCustomInfoByUnitId(str, 8);
                }
            }
        } catch (Throwable th) {
            o0.b(TAG, "Exception", th);
        }
        return "";
    }

    public void setCustomInfo(String str, int i, String str2) {
        if (TextUtils.isEmpty(str) || str2 == null) {
            return;
        }
        String strB = i0.b(str2);
        if (i == 6) {
            this.infoMap.put(str + "_bid", strB);
            return;
        }
        if (i != 7) {
            if (i != 8) {
                return;
            }
            this.infoMap.put(str, strB);
        } else {
            this.infoMap.put(str + "_bidload", strB);
        }
    }

    public String getCustomInfoByUnitId(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (i == 6) {
            return this.infoMap.get(str + "_bid");
        }
        if (i != 7) {
            return i != 8 ? "" : this.infoMap.get(str);
        }
        return this.infoMap.get(str + "_bidload");
    }
}
