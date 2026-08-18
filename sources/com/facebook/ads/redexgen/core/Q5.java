package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class Q5 implements InterfaceC1424dM {
    public int A00;
    public int A01;
    public int A02;
    public C1422dK[] A03;
    public final int A04;
    public final boolean A05;
    public final byte[] A06;

    public Q5(boolean z, int i) {
        this(z, i, 0);
    }

    public Q5(boolean z, int i, int i2) {
        AbstractC1517es.A07(i > 0);
        AbstractC1517es.A07(i2 >= 0);
        this.A05 = z;
        this.A04 = i;
        this.A01 = i2;
        this.A03 = new C1422dK[i2 + 100];
        if (i2 > 0) {
            this.A06 = new byte[i2 * i];
            for (int i3 = 0; i3 < i2; i3++) {
                this.A03[i3] = new C1422dK(this.A06, i3 * i);
            }
            return;
        }
        this.A06 = null;
    }

    public final synchronized int A00() {
        return this.A00 * this.A04;
    }

    public final synchronized void A01() {
        if (this.A05) {
            A02(0);
        }
    }

    public final synchronized void A02(int i) {
        boolean targetBufferSizeReduced = i < this.A02;
        this.A02 = i;
        if (targetBufferSizeReduced) {
            AJY();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1424dM
    public final synchronized C1422dK A3z() {
        C1422dK c1422dK;
        this.A00++;
        if (this.A01 > 0) {
            C1422dK[] c1422dKArr = this.A03;
            int i = this.A01 - 1;
            this.A01 = i;
            c1422dK = (C1422dK) AbstractC1517es.A01(c1422dKArr[i]);
            this.A03[this.A01] = null;
        } else {
            c1422dK = new C1422dK(new byte[this.A04], 0);
            if (this.A00 > this.A03.length) {
                this.A03 = (C1422dK[]) Arrays.copyOf(this.A03, this.A03.length * 2);
            }
        }
        return c1422dK;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1424dM
    public final int A88() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1424dM
    public final synchronized void AGl(C1422dK c1422dK) {
        C1422dK[] c1422dKArr = this.A03;
        int i = this.A01;
        this.A01 = i + 1;
        c1422dKArr[i] = c1422dK;
        this.A00--;
        notifyAll();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1424dM
    public final synchronized void AGm(InterfaceC1423dL interfaceC1423dL) {
        while (interfaceC1423dL != null) {
            C1422dK[] c1422dKArr = this.A03;
            int i = this.A01;
            this.A01 = i + 1;
            c1422dKArr[i] = interfaceC1423dL.A6k();
            this.A00--;
            interfaceC1423dL = interfaceC1423dL.ABx();
        }
        notifyAll();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1424dM
    public final synchronized void AJY() {
        int iA05 = AbstractC1600gE.A05(this.A02, this.A04);
        int targetAllocationCount = this.A00;
        int iMax = Math.max(0, iA05 - targetAllocationCount);
        int targetAllocationCount2 = this.A01;
        if (iMax >= targetAllocationCount2) {
            return;
        }
        if (this.A06 != null) {
            int lowIndex = 0;
            int targetAllocationCount3 = this.A01;
            int highIndex = targetAllocationCount3 - 1;
            while (lowIndex <= highIndex) {
                C1422dK highAllocation = (C1422dK) AbstractC1517es.A01(this.A03[lowIndex]);
                if (highAllocation.A01 == this.A06) {
                    lowIndex++;
                } else {
                    C1422dK lowAllocation = (C1422dK) AbstractC1517es.A01(this.A03[highIndex]);
                    if (lowAllocation.A01 != this.A06) {
                        highIndex--;
                    } else {
                        this.A03[lowIndex] = lowAllocation;
                        int targetAllocationCount4 = highIndex - 1;
                        this.A03[highIndex] = highAllocation;
                        highIndex = targetAllocationCount4;
                        lowIndex++;
                    }
                }
            }
            iMax = Math.max(iMax, lowIndex);
            int targetAllocationCount5 = this.A01;
            if (iMax >= targetAllocationCount5) {
                return;
            }
        }
        C1422dK[] c1422dKArr = this.A03;
        int targetAvailableCount = this.A01;
        Arrays.fill(c1422dKArr, iMax, targetAvailableCount, (Object) null);
        this.A01 = iMax;
    }
}
