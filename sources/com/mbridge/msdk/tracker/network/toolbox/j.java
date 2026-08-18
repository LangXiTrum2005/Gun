package com.mbridge.msdk.tracker.network.toolbox;

import androidx.annotation.NonNull;
import com.mbridge.msdk.tracker.network.q;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class j implements com.mbridge.msdk.thrid.okhttp.m {
    private final String b;
    private final String c;
    private final q d;

    public j(String str, String str2, q qVar) {
        this.b = str;
        this.c = str2;
        this.d = qVar;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.m
    @NonNull
    public List<InetAddress> a(@NonNull String str) throws UnknownHostException {
        try {
            List<InetAddress> listA = com.mbridge.msdk.thrid.okhttp.m.f1982a.a(str);
            return (listA.isEmpty() && i.b().c(this.b, this.c, str)) ? a(str, new UnknownHostException("DNS result is empty")) : listA;
        } catch (UnknownHostException e) {
            if (i.b().c(this.b, this.c, str)) {
                return a(str, new UnknownHostException(e.getMessage()));
            }
            throw e;
        }
    }

    private List<InetAddress> a(String str, UnknownHostException unknownHostException) throws UnknownHostException {
        q qVar = this.d;
        if (qVar != null) {
            qVar.c("local");
        }
        return i.b().a(str, unknownHostException);
    }
}
