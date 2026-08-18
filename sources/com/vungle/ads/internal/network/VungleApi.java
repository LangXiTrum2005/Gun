package com.vungle.ads.internal.network;

import androidx.annotation.Keep;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2543Kg;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2435Gc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.NY;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.XA;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public interface VungleApi {
    InterfaceC2435Gc ads(String str, String str2, C2543Kg c2543Kg);

    InterfaceC2435Gc config(String str, String str2, C2543Kg c2543Kg);

    InterfaceC2435Gc pingTPAT(String str, String str2, XA xa, Map<String, String> map, NY ny);

    InterfaceC2435Gc ri(String str, String str2, C2543Kg c2543Kg);

    InterfaceC2435Gc sendAdMarkup(String str, NY ny);

    InterfaceC2435Gc sendErrors(String str, String str2, NY ny);

    InterfaceC2435Gc sendMetrics(String str, String str2, NY ny);

    void setAppId(String str);
}
