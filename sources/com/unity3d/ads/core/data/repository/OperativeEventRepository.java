package com.unity3d.ads.core.data.repository;

import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4637t60;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BX;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4549s60;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC5024xb;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4221oQ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4286p60;

/* JADX INFO: loaded from: classes4.dex */
public final class OperativeEventRepository {
    private final InterfaceC4221oQ _operativeEvents;
    private final InterfaceC4286p60 operativeEvents;

    public OperativeEventRepository() {
        C4549s60 c4549s60A = AbstractC4637t60.a(10, 10, EnumC5024xb.b);
        this._operativeEvents = c4549s60A;
        this.operativeEvents = new BX(c4549s60A);
    }

    public final void addOperativeEvent(OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest) {
        AbstractC2995aW.q(operativeEventRequest, "operativeEventRequest");
        this._operativeEvents.a(operativeEventRequest);
    }

    public final InterfaceC4286p60 getOperativeEvents() {
        return this.operativeEvents;
    }
}
