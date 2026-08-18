package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.Timeline;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class RC implements InterfaceC1280az {
    public static String[] A07 = {"bvkjR0z2JuCPgN2uAbpqPjh1auWjFN2m", "jDmTxi1msFLiyIykemTdf3SyMPUAROGA", "OXoBlYAGv7iOLjHl9567wWnPGXT5zRPb", "Efu31", "aky9HEhQ7EdDCqCiIpT5H8t2NR6VgViF", "iq3qY", "qXUoBaVWj6OuQ8", "Oco5vFKqVajXf16TyX0nMhcG593FlptK"};
    public Looper A00;
    public Timeline A01;
    public RK A02;
    public final ArrayList<InterfaceC1279ay> A05 = new ArrayList<>(1);
    public final HashSet<InterfaceC1279ay> A06 = new HashSet<>(1);
    public final C1288bA A04 = new C1288bA();
    public final TJ A03 = new TJ();

    public abstract void A09();

    public abstract void A0A(InterfaceC1486eN interfaceC1486eN);

    public final RK A00() {
        return (RK) AbstractC1517es.A02(this.A02);
    }

    public final TJ A01(R5 r5) {
        return this.A03.A00(0, r5);
    }

    public final C1288bA A02(R5 r5) {
        return this.A04.A02(0, r5, 0L);
    }

    public void A03() {
    }

    public void A04() {
    }

    public final void A05(Timeline timeline) {
        this.A01 = timeline;
        Iterator<InterfaceC1279ay> it = this.A05.iterator();
        while (it.hasNext()) {
            it.next().AFA(this, timeline);
        }
    }

    public final void A06(InterfaceC1279ay interfaceC1279ay) {
        boolean z = !this.A06.isEmpty();
        this.A06.remove(interfaceC1279ay);
        if (z) {
            boolean wasEnabled = this.A06.isEmpty();
            if (wasEnabled) {
                A03();
            }
        }
    }

    public final void A07(InterfaceC1279ay interfaceC1279ay) {
        AbstractC1517es.A01(this.A00);
        boolean zIsEmpty = this.A06.isEmpty();
        this.A06.add(interfaceC1279ay);
        if (zIsEmpty) {
            A04();
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000c  */
    public final void A08(InterfaceC1279ay interfaceC1279ay, InterfaceC1486eN interfaceC1486eN, RK rk) {
        boolean z;
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.A00;
        if (looper != null) {
            Looper looper2 = this.A00;
            if (looper2 == looperMyLooper) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        AbstractC1517es.A07(z);
        if (A07[7].charAt(29) == 'V') {
            throw new RuntimeException();
        }
        String[] strArr = A07;
        strArr[5] = "50KTM";
        strArr[3] = "Za3v7";
        this.A02 = rk;
        Timeline timeline = this.A01;
        this.A05.add(interfaceC1279ay);
        Looper looper3 = this.A00;
        if (looper3 == null) {
            this.A00 = looperMyLooper;
            this.A06.add(interfaceC1279ay);
            A0A(interfaceC1486eN);
        } else {
            if (timeline == null) {
                return;
            }
            A07(interfaceC1279ay);
            interfaceC1279ay.AFA(this, timeline);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1280az
    public final void A3p(Handler handler, InterfaceC1289bB interfaceC1289bB) {
        AbstractC1517es.A01(handler);
        AbstractC1517es.A01(interfaceC1289bB);
        this.A04.A04(handler, interfaceC1289bB);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1280az
    public final void AGF(InterfaceC1279ay interfaceC1279ay, InterfaceC1486eN interfaceC1486eN) {
        A08(interfaceC1279ay, interfaceC1486eN, RK.A03);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1280az
    public final void AGt(InterfaceC1279ay interfaceC1279ay) {
        this.A05.remove(interfaceC1279ay);
        if (this.A05.isEmpty()) {
            this.A00 = null;
            this.A01 = null;
            this.A02 = null;
            this.A06.clear();
            A09();
            return;
        }
        A06(interfaceC1279ay);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1280az
    public final void AHY(InterfaceC1289bB interfaceC1289bB) {
        this.A04.A0D(interfaceC1289bB);
    }
}
