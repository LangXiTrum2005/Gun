package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
final class zacz extends com.google.android.gms.internal.base.zaq {
    final /* synthetic */ zada zaa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zacz(zada zadaVar, Looper looper) {
        super(looper);
        this.zaa = zadaVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 0) {
            if (i != 1) {
                return;
            }
            RuntimeException runtimeException = (RuntimeException) message.obj;
            String strValueOf = String.valueOf(runtimeException.getMessage());
            if (strValueOf.length() == 0) {
                throw runtimeException;
            }
            "Runtime exception on the transformation worker thread: ".concat(strValueOf);
            throw runtimeException;
        }
        PendingResult<?> pendingResult = (PendingResult) message.obj;
        synchronized (this.zaa.zae) {
            try {
                zada zadaVar = (zada) Preconditions.checkNotNull(this.zaa.zab);
                if (pendingResult == null) {
                    zadaVar.zaj(new Status(13, "Transform returned null"));
                } else if (pendingResult instanceof zacp) {
                    zadaVar.zaj(((zacp) pendingResult).zaa());
                } else {
                    zadaVar.zai(pendingResult);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
