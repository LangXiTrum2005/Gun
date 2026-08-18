package com.mbridge.msdk.thrid.okhttp;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
final class v implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final t f1992a;
    final com.mbridge.msdk.thrid.okhttp.internal.http.j b;
    final com.mbridge.msdk.thrid.okio.a c;

    @Nullable
    private n d;
    final w e;
    final boolean f;
    private boolean g;

    public class a extends com.mbridge.msdk.thrid.okio.a {
        public a() {
        }

        @Override // com.mbridge.msdk.thrid.okio.a
        public void j() {
            v.this.cancel();
        }
    }

    public final class b extends com.mbridge.msdk.thrid.okhttp.internal.b {
        static final /* synthetic */ boolean c = true;
        final /* synthetic */ v b;

        public void a(ExecutorService executorService) {
            if (!c && Thread.holdsLock(this.b.f1992a.j())) {
                throw new AssertionError();
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e);
                    this.b.d.callFailed(this.b, interruptedIOException);
                    throw null;
                }
            } catch (Throwable th) {
                this.b.f1992a.j().a(this);
                throw th;
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.b
        public void b() {
            Throwable th;
            boolean z;
            this.b.c.h();
            try {
                try {
                    this.b.c();
                    try {
                        throw null;
                    } catch (Throwable th2) {
                        th = th2;
                        z = true;
                        this.b.cancel();
                        if (z) {
                            throw th;
                        }
                        new IOException("canceled due to " + th);
                        throw null;
                    }
                } catch (IOException e) {
                    this.b.d.callFailed(this.b, this.b.a(e));
                    throw null;
                } catch (Throwable th3) {
                    th = th3;
                    z = false;
                }
            } catch (Throwable th4) {
                this.b.f1992a.j().a(this);
                throw th4;
            }
        }

        public v c() {
            return this.b;
        }

        public String d() {
            return this.b.e.g().g();
        }
    }

    private v(t tVar, w wVar, boolean z) {
        this.f1992a = tVar;
        this.e = wVar;
        this.f = z;
        this.b = new com.mbridge.msdk.thrid.okhttp.internal.http.j(tVar, z);
        a aVar = new a();
        this.c = aVar;
        aVar.a(tVar.b(), TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public v clone() {
        return a(this.f1992a, this.e, this.f);
    }

    public y c() throws IOException {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f1992a.p());
        arrayList.add(this.b);
        arrayList.add(new com.mbridge.msdk.thrid.okhttp.internal.http.a(this.f1992a.i()));
        this.f1992a.q();
        arrayList.add(new com.mbridge.msdk.thrid.okhttp.internal.cache.a(null));
        arrayList.add(new com.mbridge.msdk.thrid.okhttp.internal.connection.a(this.f1992a));
        if (!this.f) {
            arrayList.addAll(this.f1992a.r());
        }
        arrayList.add(new com.mbridge.msdk.thrid.okhttp.internal.http.b(this.f));
        y yVarA = new com.mbridge.msdk.thrid.okhttp.internal.http.g(arrayList, null, null, null, 0, this.e, this, this.d, this.f1992a.e(), this.f1992a.y(), this.f1992a.C()).a(this.e);
        if (!this.b.b()) {
            return yVarA;
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(yVarA);
        throw new IOException("Canceled");
    }

    @Override // com.mbridge.msdk.thrid.okhttp.d
    public void cancel() {
        this.b.a();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.d
    public y d() throws IOException {
        synchronized (this) {
            if (this.g) {
                throw new IllegalStateException("Already Executed");
            }
            this.g = true;
        }
        a();
        this.c.h();
        this.d.callStart(this);
        try {
            try {
                this.f1992a.j().a(this);
                y yVarC = c();
                if (yVarC == null) {
                    throw new IOException("Canceled");
                }
                this.f1992a.j().b(this);
                return yVarC;
            } catch (IOException e) {
                IOException iOExceptionA = a(e);
                this.d.callFailed(this, iOExceptionA);
                throw iOExceptionA;
            }
        } catch (Throwable th) {
            this.f1992a.j().b(this);
            throw th;
        }
        this.f1992a.j().b(this);
        throw th;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.d
    public boolean h() {
        return this.b.b();
    }

    public static v a(t tVar, w wVar, boolean z) {
        v vVar = new v(tVar, wVar, z);
        vVar.d = tVar.l().a(vVar);
        return vVar;
    }

    @Nullable
    public IOException a(@Nullable IOException iOException) {
        if (!this.c.i()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    private void a() {
        this.b.a(com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a("response.body().close()"));
    }
}
