package com.mbridge.msdk.tracker.network.toolbox;

import com.mbridge.msdk.system.NoProGuard;
import com.mbridge.msdk.thrid.okhttp.u;
import com.mbridge.msdk.thrid.okhttp.w;
import com.mbridge.msdk.thrid.okhttp.y;
import com.mbridge.msdk.tracker.network.q;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class OKHTTPEventListener extends com.mbridge.msdk.thrid.okhttp.n implements NoProGuard {
    private static String TAG = "OKHTTPEventListener";
    private final q monitor;

    public OKHTTPEventListener(q qVar) {
        this.monitor = qVar;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.n
    public void callEnd(com.mbridge.msdk.thrid.okhttp.d dVar) {
        q qVar = this.monitor;
        if (qVar == null) {
            return;
        }
        qVar.a((IOException) null);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.n
    public void callFailed(com.mbridge.msdk.thrid.okhttp.d dVar, IOException iOException) {
        q qVar = this.monitor;
        if (qVar == null) {
            return;
        }
        qVar.a(iOException);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.n
    public void callStart(com.mbridge.msdk.thrid.okhttp.d dVar) {
        q qVar = this.monitor;
        if (qVar == null) {
            return;
        }
        qVar.a(dVar);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.n
    public void connectEnd(com.mbridge.msdk.thrid.okhttp.d dVar, InetSocketAddress inetSocketAddress, Proxy proxy, u uVar) {
        q qVar = this.monitor;
        if (qVar == null) {
            return;
        }
        qVar.d("connection_end");
        this.monitor.a(uVar, (IOException) null);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.n
    public void connectFailed(com.mbridge.msdk.thrid.okhttp.d dVar, InetSocketAddress inetSocketAddress, Proxy proxy, u uVar, IOException iOException) {
        q qVar = this.monitor;
        if (qVar == null) {
            return;
        }
        qVar.a(uVar, iOException);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.n
    public void connectStart(com.mbridge.msdk.thrid.okhttp.d dVar, InetSocketAddress inetSocketAddress, Proxy proxy) {
        q qVar = this.monitor;
        if (qVar == null) {
            return;
        }
        qVar.d("connection_start");
        this.monitor.a(inetSocketAddress, proxy);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.n
    public void connectionAcquired(com.mbridge.msdk.thrid.okhttp.d dVar, com.mbridge.msdk.thrid.okhttp.g gVar) {
        q qVar = this.monitor;
        if (qVar == null) {
            return;
        }
        qVar.a(gVar);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.n
    public void connectionReleased(com.mbridge.msdk.thrid.okhttp.d dVar, com.mbridge.msdk.thrid.okhttp.g gVar) {
        q qVar = this.monitor;
        if (qVar == null) {
            return;
        }
        qVar.b(gVar);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.n
    public void dnsEnd(com.mbridge.msdk.thrid.okhttp.d dVar, String str, List<InetAddress> list) {
        q qVar = this.monitor;
        if (qVar == null) {
            return;
        }
        qVar.d("dns_end");
        this.monitor.a(list);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.n
    public void dnsStart(com.mbridge.msdk.thrid.okhttp.d dVar, String str) {
        q qVar = this.monitor;
        if (qVar == null) {
            return;
        }
        qVar.d("dns_start");
        this.monitor.a();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.n
    public void requestBodyEnd(com.mbridge.msdk.thrid.okhttp.d dVar, long j) {
        q qVar = this.monitor;
        if (qVar == null) {
            return;
        }
        qVar.d("request_body_end");
        this.monitor.b(j);
        this.monitor.d("transmission_start");
    }

    @Override // com.mbridge.msdk.thrid.okhttp.n
    public void requestBodyStart(com.mbridge.msdk.thrid.okhttp.d dVar) {
        q qVar = this.monitor;
        if (qVar == null) {
            return;
        }
        qVar.d("request_body_start");
        this.monitor.R();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.n
    public void requestHeadersEnd(com.mbridge.msdk.thrid.okhttp.d dVar, w wVar) {
        q qVar = this.monitor;
        if (qVar == null) {
            return;
        }
        qVar.d("request_header_end");
        this.monitor.a(wVar);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.n
    public void requestHeadersStart(com.mbridge.msdk.thrid.okhttp.d dVar) {
        q qVar = this.monitor;
        if (qVar == null) {
            return;
        }
        qVar.d("request_header_start");
        this.monitor.S();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.n
    public void responseBodyEnd(com.mbridge.msdk.thrid.okhttp.d dVar, long j) {
        q qVar = this.monitor;
        if (qVar == null) {
            return;
        }
        qVar.d("response_body_end");
        this.monitor.h(j);
        this.monitor.d(j);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.n
    public void responseBodyStart(com.mbridge.msdk.thrid.okhttp.d dVar) {
        q qVar = this.monitor;
        if (qVar == null) {
            return;
        }
        qVar.d("response_body_start");
        this.monitor.U();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.n
    public void responseHeadersEnd(com.mbridge.msdk.thrid.okhttp.d dVar, y yVar) {
        q qVar = this.monitor;
        if (qVar == null) {
            return;
        }
        qVar.d("response_header_end");
        this.monitor.a(yVar);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.n
    public void responseHeadersStart(com.mbridge.msdk.thrid.okhttp.d dVar) {
        q qVar = this.monitor;
        if (qVar == null) {
            return;
        }
        qVar.d("response_header_start");
        this.monitor.V();
        this.monitor.d("transmission_end");
    }

    @Override // com.mbridge.msdk.thrid.okhttp.n
    public void secureConnectEnd(com.mbridge.msdk.thrid.okhttp.d dVar, com.mbridge.msdk.thrid.okhttp.o oVar) {
        q qVar = this.monitor;
        if (qVar == null) {
            return;
        }
        qVar.d("secure_connect_end");
        this.monitor.a(oVar);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.n
    public void secureConnectStart(com.mbridge.msdk.thrid.okhttp.d dVar) {
        q qVar = this.monitor;
        if (qVar == null) {
            return;
        }
        qVar.d("secure_connect_start");
        this.monitor.W();
    }
}
