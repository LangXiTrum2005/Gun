package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
final class zzc extends ResultReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f841a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzc(b bVar, Handler handler, TaskCompletionSource taskCompletionSource) {
        super(handler);
        this.f841a = taskCompletionSource;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        this.f841a.trySetResult(null);
    }
}
