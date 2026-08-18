package androidx.browser.customtabs;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractBinderC4557sB;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4645tB;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
final class EngagementSignalsCallbackRemote implements EngagementSignalsCallback {
    private static final String TAG = "EngagementSigsCallbkRmt";
    private final InterfaceC4645tB mCallbackBinder;

    private EngagementSignalsCallbackRemote(@NonNull InterfaceC4645tB interfaceC4645tB) {
        this.mCallbackBinder = interfaceC4645tB;
    }

    @NonNull
    public static EngagementSignalsCallbackRemote fromBinder(@NonNull IBinder iBinder) {
        return new EngagementSignalsCallbackRemote(AbstractBinderC4557sB.asInterface(iBinder));
    }

    @Override // androidx.browser.customtabs.EngagementSignalsCallback
    public void onGreatestScrollPercentageIncreased(@IntRange(from = 1, to = 100) int i, @NonNull Bundle bundle) {
        try {
            this.mCallbackBinder.onGreatestScrollPercentageIncreased(i, bundle);
        } catch (RemoteException unused) {
        }
    }

    @Override // androidx.browser.customtabs.EngagementSignalsCallback
    public void onSessionEnded(boolean z, @NonNull Bundle bundle) {
        try {
            this.mCallbackBinder.onSessionEnded(z, bundle);
        } catch (RemoteException unused) {
        }
    }

    @Override // androidx.browser.customtabs.EngagementSignalsCallback
    public void onVerticalScrollEvent(boolean z, @NonNull Bundle bundle) {
        try {
            this.mCallbackBinder.onVerticalScrollEvent(z, bundle);
        } catch (RemoteException unused) {
        }
    }
}
