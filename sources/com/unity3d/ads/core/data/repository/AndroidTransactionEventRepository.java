package com.unity3d.ads.core.data.repository;

import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4637t60;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BX;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4549s60;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC5024xb;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4221oQ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4286p60;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidTransactionEventRepository implements TransactionEventRepository {
    private final InterfaceC4221oQ _transactionEvents;
    private final InterfaceC4286p60 transactionEvents;

    public AndroidTransactionEventRepository() {
        C4549s60 c4549s60A = AbstractC4637t60.a(10, 10, EnumC5024xb.b);
        this._transactionEvents = c4549s60A;
        this.transactionEvents = new BX(c4549s60A);
    }

    @Override // com.unity3d.ads.core.data.repository.TransactionEventRepository
    public void addTransactionEvent(TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest) {
        AbstractC2995aW.q(transactionEventRequest, "transactionEventRequest");
        this._transactionEvents.a(transactionEventRequest);
    }

    @Override // com.unity3d.ads.core.data.repository.TransactionEventRepository
    public InterfaceC4286p60 getTransactionEvents() {
        return this.transactionEvents;
    }
}
