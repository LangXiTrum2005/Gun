package com.unity3d.ads.core.data.repository;

import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4286p60;

/* JADX INFO: loaded from: classes4.dex */
public interface TransactionEventRepository {
    void addTransactionEvent(TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest);

    InterfaceC4286p60 getTransactionEvents();
}
