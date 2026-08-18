package com.mbridge.msdk.tracker.network.toolbox;

import android.text.TextUtils;
import com.mbridge.msdk.tracker.network.u;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes2.dex */
public class d {
    public static String a(String str, u<?> uVar) {
        if (TextUtils.isEmpty(str) || uVar == null) {
            return "";
        }
        byte[] bArrB = uVar.b();
        if (bArrB == null || bArrB.length == 0) {
            return str;
        }
        if (str.endsWith("?")) {
            return str.concat(new String(bArrB));
        }
        StringBuilder sbQ = DM.q(str, "?");
        sbQ.append(new String(bArrB));
        return sbQ.toString();
    }
}
