package com.google.android.exoplayer2.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.metadata.Metadata;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3516gN;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3867kO;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4531rw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4619sw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ug0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class EventMessage implements Metadata.Entry {
    public static final Parcelable.Creator<EventMessage> CREATOR;
    private static final C4619sw ID3_FORMAT;

    @VisibleForTesting
    public static final String ID3_SCHEME_ID_AOM = "https://aomedia.org/emsg/ID3";
    private static final String ID3_SCHEME_ID_APPLE = "https://developer.apple.com/streaming/emsg-id3";
    private static final C4619sw SCTE35_FORMAT;

    @VisibleForTesting
    public static final String SCTE35_SCHEME_ID = "urn:scte:scte35:2014:bin";
    public final long durationMs;
    private int hashCode;
    public final long id;
    public final byte[] messageData;
    public final String schemeIdUri;
    public final String value;

    static {
        C4531rw c4531rw = new C4531rw();
        c4531rw.k = MimeTypes.APPLICATION_ID3;
        ID3_FORMAT = c4531rw.a();
        C4531rw c4531rw2 = new C4531rw();
        c4531rw2.k = MimeTypes.APPLICATION_SCTE35;
        SCTE35_FORMAT = c4531rw2.a();
        CREATOR = new C3516gN(9);
    }

    public EventMessage(String str, String str2, long j, long j2, byte[] bArr) {
        this.schemeIdUri = str;
        this.value = str2;
        this.durationMs = j;
        this.id = j2;
        this.messageData = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || EventMessage.class != obj.getClass()) {
            return false;
        }
        EventMessage eventMessage = (EventMessage) obj;
        return this.durationMs == eventMessage.durationMs && this.id == eventMessage.id && Ug0.a(this.schemeIdUri, eventMessage.schemeIdUri) && Ug0.a(this.value, eventMessage.value) && Arrays.equals(this.messageData, eventMessage.messageData);
    }

    public final int hashCode() {
        if (this.hashCode == 0) {
            String str = this.schemeIdUri;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.value;
            int iHashCode2 = str2 != null ? str2.hashCode() : 0;
            long j = this.durationMs;
            int i = (((iHashCode + iHashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.id;
            this.hashCode = Arrays.hashCode(this.messageData) + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31);
        }
        return this.hashCode;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final C4619sw k() {
        String str = this.schemeIdUri;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return SCTE35_FORMAT;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return ID3_FORMAT;
            default:
                return null;
        }
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final byte[] n() {
        if (k() != null) {
            return this.messageData;
        }
        return null;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.schemeIdUri + ", id=" + this.id + ", durationMs=" + this.durationMs + ", value=" + this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.schemeIdUri);
        parcel.writeString(this.value);
        parcel.writeLong(this.durationMs);
        parcel.writeLong(this.id);
        parcel.writeByteArray(this.messageData);
    }

    public EventMessage(Parcel parcel) {
        String string = parcel.readString();
        int i = Ug0.f3833a;
        this.schemeIdUri = string;
        this.value = parcel.readString();
        this.durationMs = parcel.readLong();
        this.id = parcel.readLong();
        this.messageData = parcel.createByteArray();
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ void a(C3867kO c3867kO) {
    }
}
