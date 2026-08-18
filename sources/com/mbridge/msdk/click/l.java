package com.mbridge.msdk.click;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.URLUtil;
import androidx.webkit.ProxyConfig;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.s0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.net.URI;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes.dex */
public class l extends com.mbridge.msdk.foundation.same.task.a {
    private final Context b;
    private final String c;
    private final String d;
    private final String e;
    private final CampaignEx f;
    private final boolean g;
    private final boolean h;
    private final int i;
    private final boolean j;
    private com.mbridge.msdk.click.entity.a k;
    private JumpLoaderResult l;
    private g m;
    private k n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Semaphore f959a = new Semaphore(0);
    private final o.f o = new a();

    public l(com.mbridge.msdk.click.entity.b bVar) {
        this.b = bVar.c();
        this.c = bVar.e();
        this.d = bVar.b();
        this.e = bVar.d();
        this.f = bVar.a();
        this.g = bVar.g();
        this.h = bVar.i();
        this.i = bVar.f();
        this.j = bVar.h();
    }

    @Override // com.mbridge.msdk.foundation.same.task.a
    public void cancelTask() {
    }

    @Override // com.mbridge.msdk.foundation.same.task.a
    public void pauseTask(boolean z) {
    }

    @Override // com.mbridge.msdk.foundation.same.task.a
    public void runTask() {
        JumpLoaderResult jumpLoaderResult;
        g gVar = this.m;
        if (gVar != null) {
            gVar.b(null);
        }
        JumpLoaderResult jumpLoaderResult2 = new JumpLoaderResult();
        this.l = jumpLoaderResult2;
        jumpLoaderResult2.setUrl(this.c);
        JumpLoaderResult jumpLoaderResultC = c(this.c);
        this.l = jumpLoaderResultC;
        if (jumpLoaderResultC != null && !TextUtils.isEmpty(jumpLoaderResultC.getExceptionMsg())) {
            this.l.setSuccess(true);
        }
        if (this.mState != com.mbridge.msdk.foundation.same.task.a.b.RUNNING) {
            k kVar = this.n;
            if (kVar != null) {
                kVar.a(this.l);
                return;
            }
            return;
        }
        JumpLoaderResult jumpLoaderResult3 = this.l;
        if (jumpLoaderResult3 != null && !jumpLoaderResult3.isSuccess()) {
            k kVar2 = this.n;
            if (kVar2 != null) {
                kVar2.a(this.l);
                return;
            }
            return;
        }
        com.mbridge.msdk.click.entity.a aVar = this.k;
        if (aVar != null && (jumpLoaderResult = this.l) != null) {
            jumpLoaderResult.setStatusCode(aVar.f);
        }
        m.a(this.f, this.l, this.k, this.d, this.e, this.b, this.o, this.n, this.f959a);
    }

    public class a implements o.f {
        public a() {
        }

        @Override // com.mbridge.msdk.click.o.f
        public boolean a(String str) {
            boolean zB = l.this.b(str);
            if (zB) {
                a();
            }
            return zB;
        }

        @Override // com.mbridge.msdk.click.o.f
        public boolean b(String str) {
            return false;
        }

        @Override // com.mbridge.msdk.click.o.f
        public boolean c(String str) {
            boolean zB = l.this.b(str);
            if (zB) {
                a();
            }
            return zB;
        }

        @Override // com.mbridge.msdk.click.o.f
        public void a(String str, boolean z, String str2) {
            l.this.b(str);
            l.this.l.setContent(str2);
            a();
        }

        private void a() {
            synchronized (this) {
                try {
                    l.this.l.setSuccess(true);
                    if (l.this.n != null) {
                        l.this.n.a(l.this.l);
                    }
                    l.this.a();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.mbridge.msdk.click.o.f
        public void a(int i, String str, String str2, String str3) {
            if (!TextUtils.isEmpty(str2)) {
                l.this.l.setExceptionMsg(str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                l.this.l.setContent(str3);
            }
            l.this.b(str);
            a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(String str) {
        return m.a(str, this.f, this.l);
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0151 A[LOOP:0: B:15:0x003e->B:65:0x0151, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:81:0x014a A[SYNTHETIC] */
    private JumpLoaderResult c(String str) {
        String scheme;
        String str2;
        int i;
        String strA = a(str);
        JumpLoaderResult jumpLoaderResult = new JumpLoaderResult();
        n nVar = new n();
        i iVar = new i();
        String host = "";
        try {
            if (URLUtil.isNetworkUrl(strA)) {
                URI uriCreate = URI.create(strA);
                scheme = uriCreate.getScheme();
                try {
                    host = uriCreate.getHost();
                } catch (Exception e) {
                    e = e;
                    o0.b("SocketRequestTask", e.getMessage());
                }
                str2 = host;
                host = scheme;
            } else {
                str2 = "";
            }
        } catch (Exception e2) {
            e = e2;
            scheme = "";
        }
        String strA2 = strA;
        for (int i2 = 0; i2 < 10; i2++) {
            if (this.mState != com.mbridge.msdk.foundation.same.task.a.b.RUNNING) {
                return null;
            }
            if (strA2.startsWith("tcp")) {
                this.k = nVar.a(strA2, this.f, this.g, this.h);
                i = 3;
            } else {
                this.k = iVar.a(strA2, this.g, this.h, this.f);
                i = 1;
            }
            com.mbridge.msdk.click.entity.a aVar = this.k;
            if (aVar == null) {
                jumpLoaderResult.setUrl(strA2);
                jumpLoaderResult.setSuccess(false);
                break;
            }
            if (!TextUtils.isEmpty(aVar.h)) {
                jumpLoaderResult.setUrl(strA2);
                jumpLoaderResult.setExceptionMsg(this.k.h);
                jumpLoaderResult.setType(i);
                jumpLoaderResult.setHeader(this.k.a());
                jumpLoaderResult.setSuccess(false);
                if (i2 != 0) {
                    break;
                }
                com.mbridge.msdk.click.retry.a.b().a(strA2, this.k.h, this.f, this.e, this.g, this.h, this.i);
                break;
            }
            int i3 = this.k.f;
            if (i3 == 200) {
                jumpLoaderResult.setjumpDone(true);
                jumpLoaderResult.setUrl(strA2);
                jumpLoaderResult.setSuccess(true);
                String str3 = this.k.g;
                jumpLoaderResult.setContent(str3 != null ? str3 : null);
                break;
            }
            if (i3 != 301 && i3 != 302 && i3 != 307) {
                jumpLoaderResult.setjumpDone(false);
                jumpLoaderResult.setUrl(strA2);
                if (i2 != 0) {
                    break;
                }
                com.mbridge.msdk.click.retry.a.b().a(strA2, this.k.h, this.f, this.e, this.g, this.h, this.i);
                break;
            }
            jumpLoaderResult.setSuccess(true);
            jumpLoaderResult.setIs302Jump(true);
            if (TextUtils.isEmpty(this.k.f954a)) {
                jumpLoaderResult.setjumpDone(true);
                jumpLoaderResult.setUrl(strA2);
                break;
            }
            String strJ = this.k.f954a;
            if (strJ.startsWith(ProxyConfig.MATCH_HTTP)) {
                if (s0.a.b(strJ)) {
                    jumpLoaderResult.setjumpDone(true);
                    jumpLoaderResult.setUrl(strJ);
                    break;
                }
                strA2 = a(strJ);
            } else {
                if (!strJ.startsWith("/") || TextUtils.isEmpty(host) || TextUtils.isEmpty(str2)) {
                    jumpLoaderResult.setjumpDone(true);
                    jumpLoaderResult.setUrl(strJ);
                    break;
                }
                strJ = AbstractC3888ke0.j(host, "://", str2, strJ);
                host = null;
                str2 = null;
                if (s0.a.b(strJ)) {
                    jumpLoaderResult.setjumpDone(true);
                    jumpLoaderResult.setUrl(strJ);
                    break;
                }
                strA2 = a(strJ);
            }
        }
        return jumpLoaderResult;
    }

    public void a(g gVar) {
        this.m = gVar;
    }

    public void a(k kVar) {
        this.n = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.f959a.release();
    }

    private String a(String str) {
        if (this.j) {
            String strA = com.mbridge.msdk.setting.b.a(this.b, str);
            if (!TextUtils.isEmpty(strA)) {
                str = DM.h(str, strA);
            }
        }
        return com.mbridge.msdk.util.b.a() ? m.a(this.f, str) : str;
    }
}
