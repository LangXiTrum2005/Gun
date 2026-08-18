package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f7a) {
            case 0:
                return new MediaSessionCompat$ResultReceiverWrapper(parcel);
            case 1:
                return new MediaSessionCompat$QueueItem(parcel);
            case 2:
                return new MediaSessionCompat$Token(parcel.readParcelable(null));
            case 3:
                return new ParcelableVolumeInfo(parcel);
            default:
                return new PlaybackStateCompat(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f7a) {
            case 0:
                return new MediaSessionCompat$ResultReceiverWrapper[i];
            case 1:
                return new MediaSessionCompat$QueueItem[i];
            case 2:
                return new MediaSessionCompat$Token[i];
            case 3:
                return new ParcelableVolumeInfo[i];
            default:
                return new PlaybackStateCompat[i];
        }
    }
}
