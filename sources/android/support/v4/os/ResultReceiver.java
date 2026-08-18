package android.support.v4.os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3516gN;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.KZ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.LZ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.PB;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.QB;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new C3516gN(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8a;
    public final Handler b;
    public QB c;

    public ResultReceiver(Handler handler) {
        this.f8a = true;
        this.b = handler;
    }

    public void b(int i, Bundle bundle) {
    }

    public final void c(int i, Bundle bundle) {
        if (this.f8a) {
            Handler handler = this.b;
            if (handler != null) {
                handler.post(new LZ(this, i, bundle));
                return;
            } else {
                b(i, bundle);
                return;
            }
        }
        QB qb = this.c;
        if (qb != null) {
            try {
                qb.b(i, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            try {
                if (this.c == null) {
                    this.c = new KZ(this);
                }
                parcel.writeStrongBinder(this.c.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ResultReceiver(Parcel parcel) {
        this.f8a = false;
        QB qb = null;
        this.b = null;
        IBinder strongBinder = parcel.readStrongBinder();
        int i = KZ.b;
        if (strongBinder != null) {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(QB.m1);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof QB)) {
                qb = (QB) iInterfaceQueryLocalInterface;
            } else {
                PB pb = new PB();
                pb.f3542a = strongBinder;
                qb = pb;
            }
        }
        this.c = qb;
    }
}
