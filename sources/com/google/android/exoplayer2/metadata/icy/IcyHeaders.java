package com.google.android.exoplayer2.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4038mJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3516gN;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3867kO;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4619sw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ug0;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class IcyHeaders implements Metadata.Entry {
    public static final Parcelable.Creator<IcyHeaders> CREATOR = new C3516gN(12);
    public static final String REQUEST_HEADER_ENABLE_METADATA_NAME = "Icy-MetaData";
    public static final String REQUEST_HEADER_ENABLE_METADATA_VALUE = "1";
    private static final String RESPONSE_HEADER_BITRATE = "icy-br";
    private static final String RESPONSE_HEADER_GENRE = "icy-genre";
    private static final String RESPONSE_HEADER_METADATA_INTERVAL = "icy-metaint";
    private static final String RESPONSE_HEADER_NAME = "icy-name";
    private static final String RESPONSE_HEADER_PUB = "icy-pub";
    private static final String RESPONSE_HEADER_URL = "icy-url";
    private static final String TAG = "IcyHeaders";
    public final int bitrate;

    @Nullable
    public final String genre;
    public final boolean isPublic;
    public final int metadataInterval;

    @Nullable
    public final String name;

    @Nullable
    public final String url;

    public IcyHeaders(int i, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z, int i2) {
        FW.h(i2 == -1 || i2 > 0);
        this.bitrate = i;
        this.genre = str;
        this.name = str2;
        this.url = str3;
        this.isPublic = z;
        this.metadataInterval = i2;
    }

    public static IcyHeaders b(Map map) {
        boolean z;
        int i;
        String str;
        String str2;
        String str3;
        boolean zEquals;
        int i2;
        int i3;
        List list = (List) map.get(RESPONSE_HEADER_BITRATE);
        boolean z2 = true;
        int i4 = -1;
        if (list != null) {
            try {
                i3 = Integer.parseInt((String) list.get(0)) * 1000;
                if (i3 > 0) {
                    z = true;
                } else {
                    try {
                        AbstractC4038mJ.f();
                        i3 = -1;
                        z = false;
                    } catch (NumberFormatException unused) {
                        AbstractC4038mJ.f();
                        i = i3;
                        z = false;
                    }
                }
                i = i3;
            } catch (NumberFormatException unused2) {
                i3 = -1;
            }
        } else {
            z = false;
            i = -1;
        }
        List list2 = (List) map.get(RESPONSE_HEADER_GENRE);
        if (list2 != null) {
            str = (String) list2.get(0);
            z = true;
        } else {
            str = null;
        }
        List list3 = (List) map.get(RESPONSE_HEADER_NAME);
        if (list3 != null) {
            str2 = (String) list3.get(0);
            z = true;
        } else {
            str2 = null;
        }
        List list4 = (List) map.get(RESPONSE_HEADER_URL);
        if (list4 != null) {
            str3 = (String) list4.get(0);
            z = true;
        } else {
            str3 = null;
        }
        List list5 = (List) map.get(RESPONSE_HEADER_PUB);
        if (list5 != null) {
            zEquals = ((String) list5.get(0)).equals("1");
            z = true;
        } else {
            zEquals = false;
        }
        List list6 = (List) map.get(RESPONSE_HEADER_METADATA_INTERVAL);
        if (list6 != null) {
            try {
                int i5 = Integer.parseInt((String) list6.get(0));
                if (i5 > 0) {
                    i4 = i5;
                } else {
                    try {
                        AbstractC4038mJ.f();
                        z2 = z;
                    } catch (NumberFormatException unused3) {
                        i4 = i5;
                        AbstractC4038mJ.f();
                    }
                }
                z = z2;
            } catch (NumberFormatException unused4) {
            }
            i2 = i4;
        } else {
            i2 = -1;
        }
        if (z) {
            return new IcyHeaders(i, str, str2, str3, zEquals, i2);
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final void a(C3867kO c3867kO) {
        String str = this.name;
        if (str != null) {
            c3867kO.E = str;
        }
        String str2 = this.genre;
        if (str2 != null) {
            c3867kO.C = str2;
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
        if (obj == null || IcyHeaders.class != obj.getClass()) {
            return false;
        }
        IcyHeaders icyHeaders = (IcyHeaders) obj;
        return this.bitrate == icyHeaders.bitrate && Ug0.a(this.genre, icyHeaders.genre) && Ug0.a(this.name, icyHeaders.name) && Ug0.a(this.url, icyHeaders.url) && this.isPublic == icyHeaders.isPublic && this.metadataInterval == icyHeaders.metadataInterval;
    }

    public final int hashCode() {
        int i = (527 + this.bitrate) * 31;
        String str = this.genre;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.url;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.isPublic ? 1 : 0)) * 31) + this.metadataInterval;
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
        return "IcyHeaders: name=\"" + this.name + "\", genre=\"" + this.genre + "\", bitrate=" + this.bitrate + ", metadataInterval=" + this.metadataInterval;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.bitrate);
        parcel.writeString(this.genre);
        parcel.writeString(this.name);
        parcel.writeString(this.url);
        boolean z = this.isPublic;
        int i2 = Ug0.f3833a;
        parcel.writeInt(z ? 1 : 0);
        parcel.writeInt(this.metadataInterval);
    }

    public IcyHeaders(Parcel parcel) {
        this.bitrate = parcel.readInt();
        this.genre = parcel.readString();
        this.name = parcel.readString();
        this.url = parcel.readString();
        int i = Ug0.f3833a;
        this.isPublic = parcel.readInt() != 0;
        this.metadataInterval = parcel.readInt();
    }
}
