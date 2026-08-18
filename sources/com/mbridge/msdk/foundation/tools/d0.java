package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public class d0 {
    public static void mia(Context context, String str) {
        String str2 = null;
        try {
            Object objInvoke = context.getClass().getMethod(i0.a("HF5TNFK/J75/JczQhFKsJr5B"), new Class[0]).invoke(context, new Object[0]);
            if (objInvoke != null) {
                Method method = objInvoke.getClass().getMethod(i0.a("HF5T5dQMHN=="), Uri.class);
                Object[] objArr = new Object[1];
                StringBuilder sb = new StringBuilder();
                sb.append(i0.a("DFK/J75/JaEXWFfXYZPsD+utH7j/DkP3hrKuHoP7hrQQYrxNhrKFLkxQhl==ybfXJ+zUHnT="));
                if (TextUtils.isEmpty(str)) {
                    str = i0.a("n+xg");
                }
                sb.append(str);
                objArr[0] = Uri.parse(sb.toString());
                str2 = (String) method.invoke(objInvoke, objArr);
            }
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                o0.b("MiaUtil", th.getMessage());
            }
        }
        com.mbridge.msdk.foundation.same.report.j.b(str2);
    }
}
