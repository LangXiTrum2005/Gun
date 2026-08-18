package com.unity3d.services.core.device.reader.pii;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.HZ;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public enum NonBehavioralFlag {
    UNKNOWN,
    TRUE,
    FALSE;

    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
            this();
        }

        public final NonBehavioralFlag fromString(String str) {
            Object objV;
            AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
            try {
                String upperCase = str.toUpperCase(Locale.ROOT);
                AbstractC2995aW.p(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                objV = NonBehavioralFlag.valueOf(upperCase);
            } catch (Throwable th) {
                objV = AbstractC3375el.v(th);
            }
            Object obj = NonBehavioralFlag.UNKNOWN;
            if (objV instanceof HZ) {
                objV = obj;
            }
            return (NonBehavioralFlag) objV;
        }
    }
}
