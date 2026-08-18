package com.unity3d.services.core.domain;

import com.unity3d.services.core.domain.task.InitializationException;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IZ;

/* JADX INFO: loaded from: classes4.dex */
public final class ResultExtensionsKt {
    public static final <E extends Exception> E getCustomExceptionOrNull(Object obj) {
        IZ.a(obj);
        AbstractC2995aW.w0();
        throw null;
    }

    public static final <E extends Exception> E getCustomExceptionOrThrow(Object obj) {
        IZ.a(obj);
        AbstractC2995aW.w0();
        throw null;
    }

    public static final InitializationException getInitializationExceptionOrNull(Object obj) {
        Throwable thA = IZ.a(obj);
        if (thA instanceof InitializationException) {
            return (InitializationException) thA;
        }
        return null;
    }

    public static final InitializationException getInitializationExceptionOrThrow(Object obj) {
        Throwable thA = IZ.a(obj);
        if (thA instanceof InitializationException) {
            return (InitializationException) thA;
        }
        throw new IllegalArgumentException("Wrong Exception type found");
    }
}
