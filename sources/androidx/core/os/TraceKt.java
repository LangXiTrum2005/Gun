package androidx.core.os;

import android.os.Trace;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw;

/* JADX INFO: loaded from: classes.dex */
public final class TraceKt {
    public static final <T> T trace(String str, InterfaceC2714Qw interfaceC2714Qw) {
        Trace.beginSection(str);
        try {
            return (T) interfaceC2714Qw.invoke();
        } finally {
            Trace.endSection();
        }
    }
}
