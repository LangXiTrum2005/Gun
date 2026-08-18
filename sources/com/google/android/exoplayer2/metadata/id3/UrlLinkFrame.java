package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3516gN;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ug0;

/* JADX INFO: loaded from: classes2.dex */
public final class UrlLinkFrame extends Id3Frame {
    public static final Parcelable.Creator<UrlLinkFrame> CREATOR = new C3516gN(23);

    @Nullable
    public final String description;
    public final String url;

    public UrlLinkFrame(String str, @Nullable String str2, String str3) {
        super(str);
        this.description = str2;
        this.url = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || UrlLinkFrame.class != obj.getClass()) {
            return false;
        }
        UrlLinkFrame urlLinkFrame = (UrlLinkFrame) obj;
        return this.id.equals(urlLinkFrame.id) && Ug0.a(this.description, urlLinkFrame.description) && Ug0.a(this.url, urlLinkFrame.url);
    }

    public final int hashCode() {
        int iD = DM.d(this.id, 527, 31);
        String str = this.description;
        int iHashCode = (iD + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.url;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        return this.id + ": url=" + this.url;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.description);
        parcel.writeString(this.url);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public UrlLinkFrame(Parcel parcel) {
        String string = parcel.readString();
        int i = Ug0.f3833a;
        super(string);
        this.description = parcel.readString();
        this.url = parcel.readString();
    }
}
