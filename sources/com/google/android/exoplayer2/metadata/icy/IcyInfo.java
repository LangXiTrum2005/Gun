package com.google.android.exoplayer2.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3516gN;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3867kO;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4619sw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class IcyInfo implements Metadata.Entry {
    public static final Parcelable.Creator<IcyInfo> CREATOR = new C3516gN(13);
    public final byte[] rawMetadata;

    @Nullable
    public final String title;

    @Nullable
    public final String url;

    public IcyInfo(byte[] bArr, @Nullable String str, @Nullable String str2) {
        this.rawMetadata = bArr;
        this.title = str;
        this.url = str2;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final void a(C3867kO c3867kO) {
        String str = this.title;
        if (str != null) {
            c3867kO.f4596a = str;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IcyInfo.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.rawMetadata, ((IcyInfo) obj).rawMetadata);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.rawMetadata);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ C4619sw k() {
        return null;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ byte[] n() {
        return null;
    }

    public final String toString() {
        String str = this.title;
        String str2 = this.url;
        return AbstractC5044xl.o(DM.r("ICY: title=\"", str, "\", url=\"", str2, "\", rawMetadata.length=\""), this.rawMetadata.length, "\"");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.rawMetadata);
        parcel.writeString(this.title);
        parcel.writeString(this.url);
    }

    public IcyInfo(Parcel parcel) {
        byte[] bArrCreateByteArray = parcel.createByteArray();
        bArrCreateByteArray.getClass();
        this.rawMetadata = bArrCreateByteArray;
        this.title = parcel.readString();
        this.url = parcel.readString();
    }
}
