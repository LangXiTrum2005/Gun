package com.apm.insight.i;

import android.annotation.SuppressLint;
import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import com.apm.insight.runtime.q;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile UUID f108a = null;
    private static String b = "";

    @SuppressLint({"MissingPermission", "HardwareIds"})
    private a(Context context) {
        String string;
        if (f108a == null) {
            synchronized (a.class) {
                if (f108a == null) {
                    String strC = q.a().c();
                    if (strC != null) {
                        f108a = UUID.fromString(strC);
                    } else {
                        try {
                            string = Settings.Secure.getString(context.getContentResolver(), "android_id");
                        } catch (Throwable unused) {
                            string = null;
                        }
                        try {
                            if (string != null) {
                                f108a = UUID.nameUUIDFromBytes(string.getBytes("utf8"));
                            } else {
                                f108a = UUID.randomUUID();
                            }
                        } catch (Throwable unused2) {
                        }
                        try {
                            q.a().b(f108a.toString());
                        } catch (Throwable unused3) {
                        }
                    }
                }
            }
        }
    }

    public static synchronized String a(Context context) {
        try {
            if (TextUtils.isEmpty(b)) {
                new a(context);
                UUID uuid = f108a;
                if (uuid != null) {
                    b = uuid.toString();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return b;
    }
}
