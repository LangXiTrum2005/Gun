package com.mbridge.msdk.dycreator.utils;

import android.text.TextUtils;
import android.view.View;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.umeng.analytics.pro.bc;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public class d {
    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(View view, com.mbridge.msdk.dycreator.viewdata.base.a aVar) {
        String[] strArrSplit;
        if (view == 0) {
            return true;
        }
        try {
            if (!(view instanceof InterBase) || aVar == null) {
                return true;
            }
            String actionDes = ((InterBase) view).getActionDes();
            if (TextUtils.isEmpty(actionDes) || (strArrSplit = actionDes.split("\\|")) == null || strArrSplit.length < 2 || TextUtils.isEmpty(strArrSplit[0]) || !strArrSplit[0].startsWith(CampaignEx.JSON_NATIVE_VIDEO_CLICK) || TextUtils.isEmpty(strArrSplit[1]) || !strArrSplit[1].equals("alecfc") || aVar.getEffectData() == null) {
                return true;
            }
            return aVar.getEffectData().isClickScreen();
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    public static void a(String str, View view, boolean z) {
        if (view == null || !(view instanceof InterBase) || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String[] strArrSplit = str.split("\\|");
            if (strArrSplit == null || strArrSplit.length < 2 || TextUtils.isEmpty(strArrSplit[0]) || !strArrSplit[0].startsWith("visible") || TextUtils.isEmpty(strArrSplit[1]) || !strArrSplit[1].equals("parent") || !z) {
                return;
            }
            view.setVisibility(8);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Object a(Object obj, String str) {
        Method method;
        try {
            try {
                method = obj.getClass().getMethod(str, new Class[0]);
                if (method != null) {
                    try {
                        return method.invoke(obj, new Object[0]);
                    } catch (NoSuchMethodException unused) {
                        if (obj instanceof com.mbridge.msdk.dycreator.viewdata.base.a) {
                            method = ((com.mbridge.msdk.dycreator.viewdata.base.a) obj).getBindData().getClass().getMethod(str, new Class[0]);
                        }
                        if (method != null) {
                            return method.invoke(((com.mbridge.msdk.dycreator.viewdata.base.a) obj).getBindData(), new Object[0]);
                        }
                        return null;
                    }
                }
            } catch (NoSuchMethodException unused2) {
                method = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String a(boolean z, int i, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        if (TextUtils.isEmpty(str2) || !str2.contains("zh")) {
            return str + " " + i + bc.aH;
        }
        if (z) {
            return str + i + bc.aH;
        }
        return i + "s " + str;
    }
}
