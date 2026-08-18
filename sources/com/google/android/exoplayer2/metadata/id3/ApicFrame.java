package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3516gN;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3867kO;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ug0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class ApicFrame extends Id3Frame {
    public static final Parcelable.Creator<ApicFrame> CREATOR = new C3516gN(14);
    public static final String ID = "APIC";

    @Nullable
    public final String description;
    public final String mimeType;
    public final byte[] pictureData;
    public final int pictureType;

    public ApicFrame(String str, @Nullable String str2, int i, byte[] bArr) {
        super("APIC");
        this.mimeType = str;
        this.description = str2;
        this.pictureType = i;
        this.pictureData = bArr;
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, com.google.android.exoplayer2.metadata.Metadata.Entry
    public final void a(C3867kO c3867kO) {
        c3867kO.a(this.pictureType, this.pictureData);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ApicFrame.class != obj.getClass()) {
            return false;
        }
        ApicFrame apicFrame = (ApicFrame) obj;
        return this.pictureType == apicFrame.pictureType && Ug0.a(this.mimeType, apicFrame.mimeType) && Ug0.a(this.description, apicFrame.description) && Arrays.equals(this.pictureData, apicFrame.pictureData);
    }

    public final int hashCode() {
        int i = (527 + this.pictureType) * 31;
        String str = this.mimeType;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.description;
        return Arrays.hashCode(this.pictureData) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        return this.id + ": mimeType=" + this.mimeType + ", description=" + this.description;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mimeType);
        parcel.writeString(this.description);
        parcel.writeInt(this.pictureType);
        parcel.writeByteArray(this.pictureData);
    }

    public ApicFrame(Parcel parcel) {
        super("APIC");
        String string = parcel.readString();
        int i = Ug0.f3833a;
        this.mimeType = string;
        this.description = parcel.readString();
        this.pictureType = parcel.readInt();
        this.pictureData = parcel.createByteArray();
    }
}
