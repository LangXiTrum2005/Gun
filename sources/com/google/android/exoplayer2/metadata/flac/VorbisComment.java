package com.google.android.exoplayer2.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3516gN;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3867kO;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4619sw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ug0;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class VorbisComment implements Metadata.Entry {
    public static final Parcelable.Creator<VorbisComment> CREATOR = new C3516gN(11);
    public final String key;
    public final String value;

    public VorbisComment(String str, String str2) {
        this.key = str;
        this.value = str2;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final void a(C3867kO c3867kO) {
        String str = this.key;
        str.getClass();
        switch (str) {
            case "ALBUM":
                c3867kO.c = this.value;
                break;
            case "TITLE":
                c3867kO.f4596a = this.value;
                break;
            case "DESCRIPTION":
                c3867kO.g = this.value;
                break;
            case "ALBUMARTIST":
                c3867kO.d = this.value;
                break;
            case "ARTIST":
                c3867kO.b = this.value;
                break;
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
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VorbisComment vorbisComment = (VorbisComment) obj;
        return this.key.equals(vorbisComment.key) && this.value.equals(vorbisComment.value);
    }

    public final int hashCode() {
        return this.value.hashCode() + DM.d(this.key, 527, 31);
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
        return "VC: " + this.key + "=" + this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.key);
        parcel.writeString(this.value);
    }

    public VorbisComment(Parcel parcel) {
        String string = parcel.readString();
        int i = Ug0.f3833a;
        this.key = string;
        this.value = parcel.readString();
    }
}
