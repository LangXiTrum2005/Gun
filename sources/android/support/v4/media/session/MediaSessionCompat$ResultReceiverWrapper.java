package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class MediaSessionCompat$ResultReceiverWrapper implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$ResultReceiverWrapper> CREATOR = new b(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ResultReceiver f4a;

    public MediaSessionCompat$ResultReceiverWrapper(@NonNull ResultReceiver resultReceiver) {
        this.f4a = resultReceiver;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f4a.writeToParcel(parcel, i);
    }

    public MediaSessionCompat$ResultReceiverWrapper(Parcel parcel) {
        this.f4a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
    }
}
