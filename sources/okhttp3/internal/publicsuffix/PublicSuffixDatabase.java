package okhttp3.internal.publicsuffix;

import androidx.webkit.ProxyConfig;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2340Cl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2853Wf;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3089ba0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4496rb;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5073y40;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2716Qy;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2812Uq;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3648hq;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3887ke;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5104yU;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EX;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3998lq;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4545s40;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class PublicSuffixDatabase {
    public static final byte[] e = {42};
    public static final List f = AbstractC2340Cl.J(ProxyConfig.MATCH_ALL_SCHEMES);
    public static final PublicSuffixDatabase g = new PublicSuffixDatabase();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f5359a = new AtomicBoolean(false);
    public final CountDownLatch b = new CountDownLatch(1);
    public byte[] c;
    public byte[] d;

    public static List c(String str) {
        List listK0 = AbstractC3089ba0.K0(str, new char[]{'.'});
        if (!AbstractC2995aW.i(AbstractC2853Wf.m0(listK0), "")) {
            return listK0;
        }
        List list = listK0;
        int size = listK0.size() - 1;
        return AbstractC2853Wf.s0(size >= 0 ? size : 0, list);
    }

    public final String a(String str) {
        String strH;
        String strH2;
        String strH3;
        List listK0;
        String unicode = IDN.toUnicode(str);
        AbstractC2995aW.p(unicode, "unicodeDomain");
        List listC = c(unicode);
        if (this.f5359a.get() || !this.f5359a.compareAndSet(false, true)) {
            try {
                this.b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z = false;
            while (true) {
                try {
                    try {
                        b();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z = true;
                    } catch (IOException e2) {
                        C5104yU c5104yU = C5104yU.f5278a;
                        C5104yU.f5278a.getClass();
                        C5104yU.i(5, "Failed to read public suffix list", e2);
                        if (z) {
                        }
                    }
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
        if (this.c == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.".toString());
        }
        int size = listC.size();
        byte[][] bArr = new byte[size][];
        for (int i = 0; i < size; i++) {
            String str2 = (String) listC.get(i);
            Charset charset = StandardCharsets.UTF_8;
            AbstractC2995aW.p(charset, "UTF_8");
            byte[] bytes = str2.getBytes(charset);
            AbstractC2995aW.p(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i] = bytes;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                strH = null;
                break;
            }
            int i3 = i2 + 1;
            byte[] bArr2 = this.c;
            if (bArr2 == null) {
                AbstractC2995aW.x0("publicSuffixListBytes");
                throw null;
            }
            strH = C3887ke.h(bArr2, bArr, i2);
            if (strH != null) {
                break;
            }
            i2 = i3;
        }
        if (size <= 1) {
            strH2 = null;
            break;
        }
        byte[][] bArr3 = (byte[][]) bArr.clone();
        int length = bArr3.length - 1;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                strH2 = null;
                break;
            }
            int i5 = i4 + 1;
            bArr3[i4] = e;
            byte[] bArr4 = this.c;
            if (bArr4 == null) {
                AbstractC2995aW.x0("publicSuffixListBytes");
                throw null;
            }
            strH2 = C3887ke.h(bArr4, bArr3, i4);
            if (strH2 != null) {
                break;
            }
            i4 = i5;
        }
        if (strH2 == null) {
            strH3 = null;
            break;
        }
        int i6 = size - 1;
        int i7 = 0;
        while (true) {
            if (i7 >= i6) {
                strH3 = null;
                break;
            }
            int i8 = i7 + 1;
            byte[] bArr5 = this.d;
            if (bArr5 == null) {
                AbstractC2995aW.x0("publicSuffixExceptionListBytes");
                throw null;
            }
            strH3 = C3887ke.h(bArr5, bArr, i7);
            if (strH3 != null) {
                break;
            }
            i7 = i8;
        }
        if (strH3 != null) {
            listK0 = AbstractC3089ba0.K0(AbstractC2995aW.v0(strH3, "!"), new char[]{'.'});
        } else if (strH == null && strH2 == null) {
            listK0 = f;
        } else {
            List listK1 = strH == null ? null : AbstractC3089ba0.K0(strH, new char[]{'.'});
            List list = C2812Uq.f3846a;
            if (listK1 == null) {
                listK1 = list;
            }
            List listK2 = strH2 == null ? null : AbstractC3089ba0.K0(strH2, new char[]{'.'});
            if (listK2 != null) {
                list = listK2;
            }
            listK0 = listK1.size() > list.size() ? listK1 : list;
        }
        if (listC.size() == listK0.size() && ((String) listK0.get(0)).charAt(0) != '!') {
            return null;
        }
        int size2 = ((String) listK0.get(0)).charAt(0) == '!' ? listC.size() - listK0.size() : listC.size() - (listK0.size() + 1);
        InterfaceC4545s40 interfaceC4545s40C0 = AbstractC2853Wf.c0(c(str));
        if (size2 < 0) {
            throw new IllegalArgumentException(AbstractC5044xl.g("Requested element count ", size2, " is less than zero.").toString());
        }
        if (size2 != 0) {
            interfaceC4545s40C0 = interfaceC4545s40C0 instanceof InterfaceC3998lq ? ((InterfaceC3998lq) interfaceC4545s40C0).a(size2) : new C3648hq(interfaceC4545s40C0, size2, 0);
        }
        return AbstractC5073y40.L0(interfaceC4545s40C0, ".", null, 62);
    }

    public final void b() throws IllegalAccessException, IOException, InvocationTargetException {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream == null) {
            return;
        }
        EX exF = AbstractC4496rb.f(new C2716Qy(AbstractC4496rb.x(resourceAsStream)));
        try {
            long j = exF.readInt();
            exF.D(j);
            byte[] bArrQ = exF.b.q(j);
            long j2 = exF.readInt();
            exF.D(j2);
            byte[] bArrQ2 = exF.b.q(j2);
            AbstractC3375el.n(exF, null);
            synchronized (this) {
                this.c = bArrQ;
                this.d = bArrQ2;
            }
            this.b.countDown();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3375el.n(exF, th);
                throw th2;
            }
        }
    }
}
