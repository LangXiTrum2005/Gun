package com.unity3d.ads.core.extensions;

import com.unity3d.services.SDKErrorHandler;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3089ba0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5073y40;
import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes4.dex */
public final class ExceptionExtensionsKt {
    public static final String getShortenedStackTrace(Throwable th, int i) {
        AbstractC2995aW.q(th, "<this>");
        try {
            StringWriter stringWriter = new StringWriter();
            try {
                PrintWriter printWriter = new PrintWriter(stringWriter);
                try {
                    th.printStackTrace(printWriter);
                    String string = stringWriter.toString();
                    AbstractC2995aW.p(string, "stringWriter.toString()");
                    String strL0 = AbstractC5073y40.L0(AbstractC5073y40.O0(AbstractC3089ba0.y0(AbstractC3089ba0.V0(string).toString()), i), "\n", null, 62);
                    AbstractC3375el.n(printWriter, null);
                    AbstractC3375el.n(stringWriter, null);
                    return strL0;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        AbstractC3375el.n(printWriter, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    AbstractC3375el.n(stringWriter, th4);
                    throw th5;
                }
            }
        } catch (Throwable unused) {
            return "";
        }
    }

    public static /* synthetic */ String getShortenedStackTrace$default(Throwable th, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 15;
        }
        return getShortenedStackTrace(th, i);
    }

    public static final String retrieveUnityCrashValue(Throwable th) {
        StackTraceElement stackTraceElement;
        String className;
        AbstractC2995aW.q(th, "<this>");
        StackTraceElement[] stackTrace = th.getStackTrace();
        AbstractC2995aW.p(stackTrace, "this.stackTrace");
        int length = stackTrace.length;
        int i = 0;
        while (true) {
            if (i < length) {
                stackTraceElement = stackTrace[i];
                if (stackTraceElement != null && (className = stackTraceElement.getClassName()) != null && AbstractC3089ba0.l0(className, SDKErrorHandler.UNITY_PACKAGE)) {
                    break;
                }
                i++;
            } else {
                stackTraceElement = null;
                break;
            }
        }
        if (stackTraceElement == null) {
            return "unknown";
        }
        String fileName = stackTraceElement.getFileName();
        if (fileName == null) {
            fileName = "unknown";
        }
        String str = fileName + '_' + stackTraceElement.getLineNumber();
        return str != null ? str : "unknown";
    }
}
