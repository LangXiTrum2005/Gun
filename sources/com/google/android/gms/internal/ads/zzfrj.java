package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfrj {
    public static AI zza(Task task, CancellationTokenSource cancellationTokenSource) {
        final zzfri zzfriVar = new zzfri(task, null);
        task.addOnCompleteListener(zzgcz.zzc(), new OnCompleteListener() { // from class: com.google.android.gms.internal.ads.zzfrh
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                zzfri zzfriVar2 = zzfriVar;
                if (task2.isCanceled()) {
                    zzfriVar2.cancel(false);
                    return;
                }
                if (task2.isSuccessful()) {
                    zzfriVar2.zzc(task2.getResult());
                    return;
                }
                Exception exception = task2.getException();
                if (exception == null) {
                    throw new IllegalStateException();
                }
                zzfriVar2.zzd(exception);
            }
        });
        return zzfriVar;
    }
}
