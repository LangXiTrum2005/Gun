package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4922wO;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3516gN;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RN;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.SN;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class MediaDescriptionCompat implements Parcelable {
    public static final long BT_FOLDER_TYPE_ALBUMS = 2;
    public static final long BT_FOLDER_TYPE_ARTISTS = 3;
    public static final long BT_FOLDER_TYPE_GENRES = 4;
    public static final long BT_FOLDER_TYPE_MIXED = 0;
    public static final long BT_FOLDER_TYPE_PLAYLISTS = 5;
    public static final long BT_FOLDER_TYPE_TITLES = 1;
    public static final long BT_FOLDER_TYPE_YEARS = 6;
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new C3516gN(1);

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String DESCRIPTION_KEY_MEDIA_URI = "android.support.v4.media.description.MEDIA_URI";

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String DESCRIPTION_KEY_NULL_BUNDLE_FLAG = "android.support.v4.media.description.NULL_BUNDLE_FLAG";
    public static final String EXTRA_BT_FOLDER_TYPE = "android.media.extra.BT_FOLDER_TYPE";
    public static final String EXTRA_DOWNLOAD_STATUS = "android.media.extra.DOWNLOAD_STATUS";
    public static final long STATUS_DOWNLOADED = 2;
    public static final long STATUS_DOWNLOADING = 1;
    public static final long STATUS_NOT_DOWNLOADED = 0;
    private static final String TAG = "MediaDescriptionCompat";
    private final CharSequence mDescription;
    private MediaDescription mDescriptionFwk;
    private final Bundle mExtras;
    private final Bitmap mIcon;
    private final Uri mIconUri;
    private final String mMediaId;
    private final Uri mMediaUri;
    private final CharSequence mSubtitle;
    private final CharSequence mTitle;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.mMediaId = str;
        this.mTitle = charSequence;
        this.mSubtitle = charSequence2;
        this.mDescription = charSequence3;
        this.mIcon = bitmap;
        this.mIconUri = uri;
        this.mExtras = bundle;
        this.mMediaUri = uri2;
    }

    public static MediaDescriptionCompat b(Object obj) {
        Bundle bundle;
        if (obj == null) {
            return null;
        }
        int i = Build.VERSION.SDK_INT;
        MediaDescription mediaDescription = (MediaDescription) obj;
        String strG = RN.g(mediaDescription);
        CharSequence charSequenceI = RN.i(mediaDescription);
        CharSequence charSequenceH = RN.h(mediaDescription);
        CharSequence charSequenceC = RN.c(mediaDescription);
        Bitmap bitmapE = RN.e(mediaDescription);
        Uri uriF = RN.f(mediaDescription);
        Bundle bundleD = RN.d(mediaDescription);
        if (bundleD != null) {
            AbstractC4922wO.a(bundleD);
            try {
                bundleD.isEmpty();
            } catch (BadParcelableException unused) {
                bundleD = null;
            }
        }
        Uri uriA = bundleD != null ? (Uri) bundleD.getParcelable(DESCRIPTION_KEY_MEDIA_URI) : null;
        if (uriA == null) {
            bundle = bundleD;
        } else if (bundleD.containsKey(DESCRIPTION_KEY_NULL_BUNDLE_FLAG) && bundleD.size() == 2) {
            bundle = null;
        } else {
            bundleD.remove(DESCRIPTION_KEY_MEDIA_URI);
            bundleD.remove(DESCRIPTION_KEY_NULL_BUNDLE_FLAG);
            bundle = bundleD;
        }
        if (uriA == null) {
            uriA = i >= 23 ? SN.a(mediaDescription) : null;
        }
        MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(strG, charSequenceI, charSequenceH, charSequenceC, bitmapE, uriF, bundle, uriA);
        mediaDescriptionCompat.mDescriptionFwk = mediaDescription;
        return mediaDescriptionCompat;
    }

    public final String c() {
        return this.mMediaId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.mTitle) + ", " + ((Object) this.mSubtitle) + ", " + ((Object) this.mDescription);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle;
        int i2 = Build.VERSION.SDK_INT;
        MediaDescription mediaDescriptionA = this.mDescriptionFwk;
        if (mediaDescriptionA == null) {
            MediaDescription.Builder builderB = RN.b();
            RN.n(builderB, this.mMediaId);
            RN.p(builderB, this.mTitle);
            RN.o(builderB, this.mSubtitle);
            RN.j(builderB, this.mDescription);
            RN.l(builderB, this.mIcon);
            RN.m(builderB, this.mIconUri);
            if (i2 >= 23 || this.mMediaUri == null) {
                RN.k(builderB, this.mExtras);
            } else {
                if (this.mExtras == null) {
                    bundle = new Bundle();
                    bundle.putBoolean(DESCRIPTION_KEY_NULL_BUNDLE_FLAG, true);
                } else {
                    bundle = new Bundle(this.mExtras);
                }
                bundle.putParcelable(DESCRIPTION_KEY_MEDIA_URI, this.mMediaUri);
                RN.k(builderB, bundle);
            }
            if (i2 >= 23) {
                SN.b(builderB, this.mMediaUri);
            }
            mediaDescriptionA = RN.a(builderB);
            this.mDescriptionFwk = mediaDescriptionA;
        }
        mediaDescriptionA.writeToParcel(parcel, i);
    }

    public MediaDescriptionCompat(Parcel parcel) {
        this.mMediaId = parcel.readString();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.mTitle = (CharSequence) creator.createFromParcel(parcel);
        this.mSubtitle = (CharSequence) creator.createFromParcel(parcel);
        this.mDescription = (CharSequence) creator.createFromParcel(parcel);
        ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
        this.mIcon = (Bitmap) parcel.readParcelable(classLoader);
        this.mIconUri = (Uri) parcel.readParcelable(classLoader);
        this.mExtras = parcel.readBundle(classLoader);
        this.mMediaUri = (Uri) parcel.readParcelable(classLoader);
    }
}
