package com.unity3d.services.core.network.core;

import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;

/* JADX INFO: loaded from: classes4.dex */
public interface HttpClient {
    Object execute(HttpRequest httpRequest, InterfaceC2857Wj interfaceC2857Wj);

    HttpResponse executeBlocking(HttpRequest httpRequest) throws Exception;
}
