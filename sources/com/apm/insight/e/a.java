package com.apm.insight.e;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.apm.insight.e;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile a f86a;
    private com.apm.insight.e.a.b b;
    private SQLiteDatabase c;

    private a() {
    }

    public static a a() {
        if (f86a == null) {
            synchronized (a.class) {
                try {
                    if (f86a == null) {
                        f86a = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f86a;
    }

    private void b() {
        if (this.b == null) {
            a(e.g());
        }
    }

    public final synchronized void a(Context context) {
        try {
            this.c = new b(context).getWritableDatabase();
        } catch (Throwable th) {
            com.apm.insight.a.b(th);
        }
        this.b = new com.apm.insight.e.a.b();
    }

    public final synchronized void a(com.apm.insight.d.a aVar) {
        b();
        com.apm.insight.e.a.b bVar = this.b;
        if (bVar != null) {
            bVar.a(this.c, aVar);
        }
    }

    public final synchronized boolean a(String str) {
        b();
        com.apm.insight.e.a.b bVar = this.b;
        if (bVar == null) {
            return false;
        }
        return bVar.a(this.c, str);
    }
}
