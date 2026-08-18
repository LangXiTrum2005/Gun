package com.mbridge.msdk.tracker.network.toolbox;

import android.os.SystemClock;
import android.text.TextUtils;
import com.mbridge.msdk.tracker.network.d0;
import com.mbridge.msdk.tracker.network.q;
import com.mbridge.msdk.tracker.network.r;
import com.mbridge.msdk.tracker.network.u;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class b implements com.mbridge.msdk.tracker.network.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f2051a;
    protected final c b;

    public b(a aVar) {
        this(aVar, new c(4096));
    }

    private static q b(u<?> uVar) {
        if (uVar == null) {
            return null;
        }
        try {
            if (!uVar.a() || TextUtils.isEmpty(uVar.t())) {
                return null;
            }
            q qVar = new q(uVar.p(), uVar.g() == 0 ? "GET" : "POST");
            qVar.d("queue");
            qVar.e(uVar.d("local_id"));
            qVar.a(uVar.d("ad_type"));
            qVar.i(uVar.r());
            uVar.a(qVar);
            return qVar;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.mbridge.msdk.tracker.network.n
    public r a(u<?> uVar) throws d0 {
        IOException iOException;
        g gVarA;
        byte[] bArr;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        q qVarB = b(uVar);
        while (true) {
            Collections.emptyList();
            try {
                gVarA = this.f2051a.a(uVar, f.a(uVar.d()));
                try {
                    int iD = gVarA.d();
                    a(qVarB, iD);
                    List<com.mbridge.msdk.tracker.network.h> listC = gVarA.c();
                    if (iD == 304) {
                        return k.a(uVar, SystemClock.elapsedRealtime() - jElapsedRealtime, listC);
                    }
                    InputStream inputStreamA = gVarA.a();
                    byte[] bArrA = inputStreamA != null ? k.a(inputStreamA, gVarA.b(), this.b, qVarB) : new byte[0];
                    try {
                        k.a(SystemClock.elapsedRealtime() - jElapsedRealtime, uVar, bArrA, iD);
                        if (iD < 200 || iD > 299) {
                            throw new IOException();
                        }
                        a(qVarB, 1, null);
                        return new r(iD, bArrA, false, SystemClock.elapsedRealtime() - jElapsedRealtime, listC);
                    } catch (IOException e) {
                        e = e;
                        bArr = bArrA;
                        iOException = e;
                        a(qVarB, TextUtils.equals(iOException.getMessage(), "timeout") ? 3 : 2, iOException);
                        k.a(uVar, k.a(uVar, iOException, jElapsedRealtime, gVarA, bArr));
                    }
                } catch (IOException e2) {
                    e = e2;
                    bArr = null;
                }
            } catch (IOException e3) {
                iOException = e3;
                gVarA = null;
                bArr = null;
            }
            a(qVarB, TextUtils.equals(iOException.getMessage(), "timeout") ? 3 : 2, iOException);
            k.a(uVar, k.a(uVar, iOException, jElapsedRealtime, gVarA, bArr));
        }
    }

    public b(a aVar, c cVar) {
        this.f2051a = aVar;
        this.b = cVar;
    }

    private static void a(q qVar, int i, Exception exc) {
        if (qVar != null) {
            try {
                qVar.a(exc);
                qVar.a(i);
            } catch (Exception unused) {
            }
        }
    }

    private static void a(q qVar, int i) {
        if (qVar != null) {
            try {
                qVar.b(i);
            } catch (Exception unused) {
            }
        }
    }
}
