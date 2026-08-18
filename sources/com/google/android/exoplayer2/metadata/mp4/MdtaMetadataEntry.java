package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3867kO;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4619sw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.QM;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ug0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class MdtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<MdtaMetadataEntry> CREATOR = new QM();
    public static final String KEY_ANDROID_CAPTURE_FPS = "com.android.capture.fps";
    public final String key;
    public final int localeIndicator;
    public final int typeIndicator;
    public final byte[] value;

    public /* synthetic */ MdtaMetadataEntry(Parcel parcel, QM qm) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MdtaMetadataEntry.class != obj.getClass()) {
            return false;
        }
        MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) obj;
        return this.key.equals(mdtaMetadataEntry.key) && Arrays.equals(this.value, mdtaMetadataEntry.value) && this.localeIndicator == mdtaMetadataEntry.localeIndicator && this.typeIndicator == mdtaMetadataEntry.typeIndicator;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.value) + DM.d(this.key, 527, 31)) * 31) + this.localeIndicator) * 31) + this.typeIndicator;
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
        return "mdta: key=" + this.key;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.key);
        parcel.writeByteArray(this.value);
        parcel.writeInt(this.localeIndicator);
        parcel.writeInt(this.typeIndicator);
    }

    public MdtaMetadataEntry(String str, byte[] bArr, int i, int i2) {
        this.key = str;
        this.value = bArr;
        this.localeIndicator = i;
        this.typeIndicator = i2;
    }

    private MdtaMetadataEntry(Parcel parcel) {
        String string = parcel.readString();
        int i = Ug0.f3833a;
        this.key = string;
        this.value = parcel.createByteArray();
        this.localeIndicator = parcel.readInt();
        this.typeIndicator = parcel.readInt();
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ void a(C3867kO c3867kO) {
    }
}
