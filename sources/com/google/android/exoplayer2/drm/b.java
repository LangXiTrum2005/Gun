package com.google.android.exoplayer2.drm;

import android.media.ResourceBusyException;
import android.media.UnsupportedSchemeException;
import android.os.Handler;
import android.os.Looper;
import com.facebook.ads.AdError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AC;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4038mJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4147nc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5011xP;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2297Au;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2507Iw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2631Nr;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2756Sm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2782Tm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2863Wp;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3031aq;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3278dg0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3491g4;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3877kY;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3965lY;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4619sw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5086yC;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G7;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.HandlerC2730Rm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2889Xp;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3208cq;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3296dq;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.KC;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.NN;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RunnableC3976le0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ug0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WU;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Wm0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Yf0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements InterfaceC3296dq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f802a;
    public final C2297Au b;
    public final C3877kY c;
    public final HashMap d;
    public final boolean e;
    public final int[] f;
    public final boolean g;
    public final C3491g4 h;
    public final G7 i;
    public final Wm0 j;
    public final long k;
    public final ArrayList l;
    public final Set m;
    public final Set n;
    public int o;
    public e p;
    public a q;
    public a r;
    public Looper s;
    public Handler t;
    public int u;
    public byte[] v;
    public WU w;
    public volatile HandlerC2730Rm x;

    public b(UUID uuid, C2297Au c2297Au, C3877kY c3877kY, HashMap map, boolean z, int[] iArr, boolean z2, G7 g7, long j) {
        uuid.getClass();
        FW.i(!AbstractC4147nc.b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f802a = uuid;
        this.b = c2297Au;
        this.c = c3877kY;
        this.d = map;
        this.e = z;
        this.f = iArr;
        this.g = z2;
        this.i = g7;
        this.h = new C3491g4();
        this.j = new Wm0(this);
        this.u = 0;
        this.l = new ArrayList();
        this.m = Collections.newSetFromMap(new IdentityHashMap());
        this.n = Collections.newSetFromMap(new IdentityHashMap());
        this.k = j;
    }

    public static boolean b(a aVar) {
        if (aVar.o == 1) {
            if (Ug0.f3833a < 19) {
                return true;
            }
            C2863Wp error = aVar.getError();
            error.getClass();
            if (error.getCause() instanceof ResourceBusyException) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList e(DrmInitData drmInitData, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(drmInitData.schemeDataCount);
        for (int i = 0; i < drmInitData.schemeDataCount; i++) {
            DrmInitData.SchemeData schemeDataD = drmInitData.d(i);
            if ((schemeDataD.b(uuid) || (AbstractC4147nc.c.equals(uuid) && schemeDataD.b(AbstractC4147nc.b))) && (schemeDataD.data != null || z)) {
                arrayList.add(schemeDataD);
            }
        }
        return arrayList;
    }

    public final InterfaceC2889Xp a(Looper looper, C3031aq c3031aq, C4619sw c4619sw, boolean z) {
        ArrayList arrayListE;
        if (this.x == null) {
            this.x = new HandlerC2730Rm(this, looper);
        }
        DrmInitData drmInitData = c4619sw.o;
        a aVarD = null;
        if (drmInitData == null) {
            int i = AbstractC5011xP.i(c4619sw.l);
            e eVar = this.p;
            eVar.getClass();
            if (eVar.a() == 2 && C2507Iw.d) {
                return null;
            }
            int[] iArr = this.f;
            for (int i2 = 0; i2 < iArr.length; i2++) {
                if (iArr[i2] == i) {
                    if (i2 == -1 || eVar.a() == 1) {
                        return null;
                    }
                    a aVar = this.q;
                    if (aVar == null) {
                        C5086yC c5086yC = AC.b;
                        a aVarD2 = d(C3965lY.e, true, null, z);
                        this.l.add(aVarD2);
                        this.q = aVarD2;
                    } else {
                        aVar.d(null);
                    }
                    return this.q;
                }
            }
            return null;
        }
        if (this.v == null) {
            arrayListE = e(drmInitData, this.f802a, false);
            if (arrayListE.isEmpty()) {
                C2756Sm c2756Sm = new C2756Sm("Media does not support uuid: " + this.f802a);
                AbstractC4038mJ.d("DRM error", c2756Sm);
                if (c3031aq != null) {
                    c3031aq.e(c2756Sm);
                }
                return new C2631Nr(new C2863Wp(c2756Sm, AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE));
            }
        } else {
            arrayListE = null;
        }
        if (this.e) {
            for (a aVar2 : this.l) {
                if (Ug0.a(aVar2.f801a, arrayListE)) {
                    aVarD = aVar2;
                    break;
                }
            }
        } else {
            aVarD = this.r;
        }
        if (aVarD == null) {
            aVarD = d(arrayListE, false, c3031aq, z);
            if (!this.e) {
                this.r = aVarD;
            }
            this.l.add(aVarD);
        } else {
            aVarD.d(c3031aq);
        }
        return aVarD;
    }

    public final a c(List list, boolean z, C3031aq c3031aq) {
        this.p.getClass();
        boolean z2 = this.g | z;
        e eVar = this.p;
        int i = this.u;
        byte[] bArr = this.v;
        Looper looper = this.s;
        looper.getClass();
        WU wu = this.w;
        wu.getClass();
        a aVar = new a(this.f802a, eVar, this.h, this.j, list, i, z2, z, bArr, this.d, this.c, looper, this.i, wu);
        aVar.d(c3031aq);
        if (this.k != C.TIME_UNSET) {
            aVar.d(null);
        }
        return aVar;
    }

    public final a d(List list, boolean z, C3031aq c3031aq, boolean z2) {
        a aVarC = c(list, z, c3031aq);
        boolean zB = b(aVarC);
        long j = this.k;
        Set set = this.n;
        if (zB && !set.isEmpty()) {
            Yf0 it = KC.j(set).iterator();
            while (it.hasNext()) {
                ((InterfaceC2889Xp) it.next()).b(null);
            }
            aVarC.b(c3031aq);
            if (j != C.TIME_UNSET) {
                aVarC.b(null);
            }
            aVarC = c(list, z, c3031aq);
        }
        if (!b(aVarC) || !z2) {
            return aVarC;
        }
        Set set2 = this.m;
        if (set2.isEmpty()) {
            return aVarC;
        }
        Yf0 it2 = KC.j(set2).iterator();
        while (it2.hasNext()) {
            ((C2782Tm) it2.next()).e();
        }
        if (!set.isEmpty()) {
            Yf0 it3 = KC.j(set).iterator();
            while (it3.hasNext()) {
                ((InterfaceC2889Xp) it3.next()).b(null);
            }
        }
        aVarC.b(c3031aq);
        if (j != C.TIME_UNSET) {
            aVarC.b(null);
        }
        return c(list, z, c3031aq);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3296dq
    public final void f(Looper looper, WU wu) {
        synchronized (this) {
            try {
                Looper looper2 = this.s;
                if (looper2 == null) {
                    this.s = looper;
                    this.t = new Handler(looper);
                } else {
                    FW.s(looper2 == looper);
                    this.t.getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.w = wu;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3296dq
    public final int g(C4619sw c4619sw) {
        String str;
        e eVar = this.p;
        eVar.getClass();
        int iA = eVar.a();
        DrmInitData drmInitData = c4619sw.o;
        if (drmInitData == null) {
            int i = AbstractC5011xP.i(c4619sw.l);
            int i2 = 0;
            while (true) {
                int[] iArr = this.f;
                if (i2 >= iArr.length) {
                    break;
                }
                if (iArr[i2] != i) {
                    i2++;
                } else if (i2 != -1) {
                    return iA;
                }
            }
            return 0;
        }
        if (this.v != null) {
            return iA;
        }
        UUID uuid = this.f802a;
        if (!e(drmInitData, uuid, true).isEmpty()) {
            str = drmInitData.schemeType;
            if (str == null && !C.CENC_TYPE_cenc.equals(str)) {
                if (C.CENC_TYPE_cbcs.equals(str)) {
                    if (Ug0.f3833a >= 25) {
                        return iA;
                    }
                } else if (!C.CENC_TYPE_cbc1.equals(str) && !C.CENC_TYPE_cens.equals(str)) {
                    return iA;
                }
            }
        } else if (drmInitData.schemeDataCount == 1 && drmInitData.d(0).b(AbstractC4147nc.b)) {
            Objects.toString(uuid);
            AbstractC4038mJ.f();
            str = drmInitData.schemeType;
            return str == null ? iA : iA;
        }
        return 1;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3296dq
    public final InterfaceC3208cq h(C3031aq c3031aq, C4619sw c4619sw) {
        FW.s(this.o > 0);
        FW.t(this.s);
        C2782Tm c2782Tm = new C2782Tm(this, c3031aq);
        Handler handler = this.t;
        handler.getClass();
        handler.post(new RunnableC3976le0(13, c2782Tm, c4619sw));
        return c2782Tm;
    }

    public final void i() {
        if (this.p != null && this.o == 0 && this.l.isEmpty() && this.m.isEmpty()) {
            e eVar = this.p;
            eVar.getClass();
            eVar.release();
            this.p = null;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3296dq
    public final InterfaceC2889Xp j(C3031aq c3031aq, C4619sw c4619sw) {
        FW.s(this.o > 0);
        FW.t(this.s);
        return a(this.s, c3031aq, c4619sw, true);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3296dq
    public final void prepare() {
        e dVar;
        int i = this.o;
        this.o = i + 1;
        if (i != 0) {
            return;
        }
        if (this.p == null) {
            UUID uuid = this.f802a;
            this.b.getClass();
            try {
                try {
                    dVar = new f(uuid);
                } catch (UnsupportedSchemeException e) {
                    throw new C3278dg0(e);
                } catch (Exception e2) {
                    throw new C3278dg0(e2);
                }
            } catch (C3278dg0 unused) {
                Objects.toString(uuid);
                AbstractC4038mJ.c();
                dVar = new d();
            }
            this.p = dVar;
            dVar.b(new NN(this));
            return;
        }
        if (this.k == C.TIME_UNSET) {
            return;
        }
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.l;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((a) arrayList.get(i2)).d(null);
            i2++;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3296dq
    public final void release() {
        int i = this.o - 1;
        this.o = i;
        if (i != 0) {
            return;
        }
        if (this.k != C.TIME_UNSET) {
            ArrayList arrayList = new ArrayList(this.l);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((a) arrayList.get(i2)).b(null);
            }
        }
        Yf0 it = KC.j(this.m).iterator();
        while (it.hasNext()) {
            ((C2782Tm) it.next()).e();
        }
        i();
    }
}
