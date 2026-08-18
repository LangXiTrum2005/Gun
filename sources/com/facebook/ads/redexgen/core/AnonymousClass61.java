package com.facebook.ads.redexgen.core;

import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Deque;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.61, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass61 implements TQ {
    public int A00;
    public boolean A01;
    public final C1140Wt A02 = new C1140Wt();
    public final C05598s A03 = new C05598s();
    public final Deque<AbstractC05578q> A04 = new ArrayDeque();

    public AnonymousClass61() {
        for (int i = 0; i < 2; i++) {
            this.A04.addFirst(new AbstractC05578q() { // from class: com.facebook.ads.redexgen.X.0w
                @Override // com.facebook.ads.redexgen.core.AbstractC05578q, com.facebook.ads.redexgen.core.AbstractC1141Wu
                public final void A0B() {
                    this.A00.A03(this);
                }
            });
        }
        this.A00 = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1037Sl
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C05598s A5h() throws TP {
        AbstractC1517es.A08(!this.A01);
        if (this.A00 != 0) {
            return null;
        }
        this.A00 = 1;
        return this.A03;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1037Sl
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final AbstractC05578q A5j() throws TP {
        AbstractC1517es.A08(!this.A01);
        if (this.A00 != 2 || this.A04.isEmpty()) {
            return null;
        }
        AbstractC05578q abstractC05578qRemoveFirst = this.A04.removeFirst();
        if (this.A03.A05()) {
            abstractC05578qRemoveFirst.A00(4);
        } else {
            abstractC05578qRemoveFirst.A0C(this.A03.A01, new C0979Qe(this.A03.A01, this.A02.A02(((ByteBuffer) AbstractC1517es.A01(this.A03.A02)).array())), 0L);
        }
        this.A03.A0A();
        this.A00 = 0;
        return abstractC05578qRemoveFirst;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1037Sl
    /* JADX INFO: renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void AGR(C05598s c05598s) throws TP {
        AbstractC1517es.A08(!this.A01);
        AbstractC1517es.A08(this.A00 == 1);
        AbstractC1517es.A07(this.A03 == c05598s);
        this.A00 = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(AbstractC05578q abstractC05578q) {
        AbstractC1517es.A08(this.A04.size() < 2);
        AbstractC1517es.A07(!this.A04.contains(abstractC05578q));
        abstractC05578q.A0A();
        this.A04.addFirst(abstractC05578q);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1037Sl
    public final void AGj() {
        this.A01 = true;
    }

    @Override // com.facebook.ads.redexgen.core.TQ
    public final void AIn(long j) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1037Sl
    public final void flush() {
        AbstractC1517es.A08(!this.A01);
        this.A03.A0A();
        this.A00 = 0;
    }
}
