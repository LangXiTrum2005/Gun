package com.mbridge.msdk.foundation.same.task;

import android.annotation.SuppressLint;
import android.content.Context;
import com.mbridge.msdk.foundation.tools.q0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ThreadPoolExecutor f1249a;
    HashMap<Long, com.mbridge.msdk.foundation.same.task.a> b;
    WeakReference<Context> c;

    public class a implements com.mbridge.msdk.foundation.same.task.a.InterfaceC0174a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.foundation.same.task.a f1250a;
        final /* synthetic */ com.mbridge.msdk.foundation.same.task.a.InterfaceC0174a b;

        public a(com.mbridge.msdk.foundation.same.task.a aVar, com.mbridge.msdk.foundation.same.task.a.InterfaceC0174a interfaceC0174a) {
            this.f1250a = aVar;
            this.b = interfaceC0174a;
        }

        @Override // com.mbridge.msdk.foundation.same.task.a.InterfaceC0174a
        public void a(com.mbridge.msdk.foundation.same.task.a.b bVar) {
            if (bVar == com.mbridge.msdk.foundation.same.task.a.b.CANCEL || bVar == com.mbridge.msdk.foundation.same.task.a.b.FINISH) {
                b.this.b.remove(Long.valueOf(this.f1250a.getId()));
            } else if (bVar == com.mbridge.msdk.foundation.same.task.a.b.RUNNING && b.this.c.get() == null) {
                b.this.a();
            }
            com.mbridge.msdk.foundation.same.task.a.InterfaceC0174a interfaceC0174a = this.b;
            if (interfaceC0174a != null) {
                interfaceC0174a.a(bVar);
            }
        }
    }

    @SuppressLint({"UseSparseArrays"})
    public b(Context context, int i) {
        if (q0.a().a("c_t_l_t_p", true)) {
            this.f1249a = c.b();
        } else {
            if (i == 0) {
                this.f1249a = new ThreadPoolExecutor(1, 5, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            } else {
                this.f1249a = new ThreadPoolExecutor(i, (i * 2) + 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            }
            this.f1249a.allowCoreThreadTimeOut(true);
        }
        this.b = new HashMap<>();
        this.c = new WeakReference<>(context);
    }

    public void a(com.mbridge.msdk.foundation.same.task.a aVar) {
        a(aVar, null);
        this.f1249a.execute(aVar);
    }

    public void b(com.mbridge.msdk.foundation.same.task.a aVar, com.mbridge.msdk.foundation.same.task.a.InterfaceC0174a interfaceC0174a) {
        a(aVar, interfaceC0174a);
        this.f1249a.execute(aVar);
    }

    private synchronized void a(com.mbridge.msdk.foundation.same.task.a aVar, com.mbridge.msdk.foundation.same.task.a.InterfaceC0174a interfaceC0174a) {
        this.b.put(Long.valueOf(aVar.getId()), aVar);
        aVar.setOnStateChangeListener(new a(aVar, interfaceC0174a));
    }

    public synchronized void a() {
        try {
            Iterator<Map.Entry<Long, com.mbridge.msdk.foundation.same.task.a>> it = this.b.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().cancel();
            }
            this.b.clear();
        } catch (Exception unused) {
        } catch (Throwable th) {
            throw th;
        }
    }

    @SuppressLint({"UseSparseArrays"})
    public b(Context context) {
        if (q0.a().a("c_t_l_t_p", true)) {
            this.f1249a = c.b();
        } else {
            if (q0.a().a("c_t_p_t_l", true)) {
                int iAvailableProcessors = (Runtime.getRuntime().availableProcessors() * 2) + 1;
                this.f1249a = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            } else {
                this.f1249a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadPoolExecutor.DiscardPolicy());
            }
            this.f1249a.allowCoreThreadTimeOut(true);
        }
        this.b = new HashMap<>();
        this.c = new WeakReference<>(context);
    }
}
