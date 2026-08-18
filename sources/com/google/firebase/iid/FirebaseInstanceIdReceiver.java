package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import com.google.android.gms.tasks.Tasks;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2478Ht;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes3.dex */
public final class FirebaseInstanceIdReceiver extends CloudMessagingReceiver {
    @Override // com.google.android.gms.cloudmessaging.CloudMessagingReceiver
    public final int onMessageReceive(Context context, CloudMessage cloudMessage) {
        try {
            return ((Integer) Tasks.await(new C2478Ht(context).b(cloudMessage.getIntent()))).intValue();
        } catch (InterruptedException | ExecutionException unused) {
            return 500;
        }
    }

    @Override // com.google.android.gms.cloudmessaging.CloudMessagingReceiver
    public final void onNotificationDismissed(Context context, Bundle bundle) {
        Intent intentPutExtras = new Intent(CloudMessagingReceiver.IntentActionKeys.NOTIFICATION_DISMISS).putExtras(bundle);
        if (AbstractC2995aW.t0(intentPutExtras)) {
            AbstractC2995aW.a0(intentPutExtras.getExtras(), "_nd");
        }
    }
}
