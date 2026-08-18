package androidx.browser.trusted;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.TB;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.UB;

/* JADX INFO: loaded from: classes.dex */
public class TrustedWebActivityCallbackRemote {
    private final UB mCallbackBinder;

    private TrustedWebActivityCallbackRemote(@NonNull UB ub) {
        this.mCallbackBinder = ub;
    }

    @Nullable
    public static TrustedWebActivityCallbackRemote fromBinder(@Nullable IBinder iBinder) {
        UB ubAsInterface = iBinder == null ? null : TB.asInterface(iBinder);
        if (ubAsInterface == null) {
            return null;
        }
        return new TrustedWebActivityCallbackRemote(ubAsInterface);
    }

    public void runExtraCallback(@NonNull String str, @NonNull Bundle bundle) throws RemoteException {
        this.mCallbackBinder.onExtraCallback(str, bundle);
    }
}
