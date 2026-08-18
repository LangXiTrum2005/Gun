package com.google.android.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4147nc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3516gN;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ug0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = new C3516gN(6);
    private int hashCode;
    public final int schemeDataCount;
    private final SchemeData[] schemeDatas;

    @Nullable
    public final String schemeType;

    public static final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = new c();

        @Nullable
        public final byte[] data;
        private int hashCode;

        @Nullable
        public final String licenseServerUrl;
        public final String mimeType;
        public final UUID uuid;

        public SchemeData(UUID uuid, String str, @Nullable byte[] bArr) {
            this(uuid, null, str, bArr);
        }

        public final boolean b(UUID uuid) {
            return AbstractC4147nc.f4750a.equals(this.uuid) || uuid.equals(this.uuid);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof SchemeData)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            SchemeData schemeData = (SchemeData) obj;
            return Ug0.a(this.licenseServerUrl, schemeData.licenseServerUrl) && Ug0.a(this.mimeType, schemeData.mimeType) && Ug0.a(this.uuid, schemeData.uuid) && Arrays.equals(this.data, schemeData.data);
        }

        public final int hashCode() {
            if (this.hashCode == 0) {
                int iHashCode = this.uuid.hashCode() * 31;
                String str = this.licenseServerUrl;
                this.hashCode = Arrays.hashCode(this.data) + DM.d(this.mimeType, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
            }
            return this.hashCode;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.uuid.getMostSignificantBits());
            parcel.writeLong(this.uuid.getLeastSignificantBits());
            parcel.writeString(this.licenseServerUrl);
            parcel.writeString(this.mimeType);
            parcel.writeByteArray(this.data);
        }

        public SchemeData(UUID uuid, @Nullable String str, String str2, @Nullable byte[] bArr) {
            uuid.getClass();
            this.uuid = uuid;
            this.licenseServerUrl = str;
            str2.getClass();
            this.mimeType = str2;
            this.data = bArr;
        }

        public SchemeData(Parcel parcel) {
            this.uuid = new UUID(parcel.readLong(), parcel.readLong());
            this.licenseServerUrl = parcel.readString();
            String string = parcel.readString();
            int i = Ug0.f3833a;
            this.mimeType = string;
            this.data = parcel.createByteArray();
        }
    }

    public DrmInitData(List<SchemeData> list) {
        this(null, false, (SchemeData[]) list.toArray(new SchemeData[0]));
    }

    public static DrmInitData c(DrmInitData drmInitData, DrmInitData drmInitData2) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (drmInitData != null) {
            str = drmInitData.schemeType;
            for (SchemeData schemeData : drmInitData.schemeDatas) {
                if (schemeData.data != null) {
                    arrayList.add(schemeData);
                }
            }
        } else {
            str = null;
        }
        if (drmInitData2 != null) {
            if (str == null) {
                str = drmInitData2.schemeType;
            }
            int size = arrayList.size();
            for (SchemeData schemeData2 : drmInitData2.schemeDatas) {
                if (schemeData2.data != null) {
                    UUID uuid = schemeData2.uuid;
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            arrayList.add(schemeData2);
                            break;
                        }
                        if (((SchemeData) arrayList.get(i)).uuid.equals(uuid)) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new DrmInitData(str, arrayList);
    }

    public final DrmInitData b(String str) {
        return Ug0.a(this.schemeType, str) ? this : new DrmInitData(str, false, this.schemeDatas);
    }

    @Override // java.util.Comparator
    public final int compare(SchemeData schemeData, SchemeData schemeData2) {
        SchemeData schemeData3 = schemeData;
        SchemeData schemeData4 = schemeData2;
        UUID uuid = AbstractC4147nc.f4750a;
        if (uuid.equals(schemeData3.uuid)) {
            return uuid.equals(schemeData4.uuid) ? 0 : 1;
        }
        return schemeData3.uuid.compareTo(schemeData4.uuid);
    }

    public final SchemeData d(int i) {
        return this.schemeDatas[i];
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final DrmInitData e(DrmInitData drmInitData) {
        String str;
        String str2 = this.schemeType;
        FW.s(str2 == null || (str = drmInitData.schemeType) == null || TextUtils.equals(str2, str));
        String str3 = this.schemeType;
        if (str3 == null) {
            str3 = drmInitData.schemeType;
        }
        SchemeData[] schemeDataArr = this.schemeDatas;
        SchemeData[] schemeDataArr2 = drmInitData.schemeDatas;
        int i = Ug0.f3833a;
        Object[] objArrCopyOf = Arrays.copyOf(schemeDataArr, schemeDataArr.length + schemeDataArr2.length);
        System.arraycopy(schemeDataArr2, 0, objArrCopyOf, schemeDataArr.length, schemeDataArr2.length);
        return new DrmInitData(str3, (SchemeData[]) objArrCopyOf);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DrmInitData.class != obj.getClass()) {
            return false;
        }
        DrmInitData drmInitData = (DrmInitData) obj;
        return Ug0.a(this.schemeType, drmInitData.schemeType) && Arrays.equals(this.schemeDatas, drmInitData.schemeDatas);
    }

    public final int hashCode() {
        if (this.hashCode == 0) {
            String str = this.schemeType;
            this.hashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.schemeDatas);
        }
        return this.hashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.schemeType);
        parcel.writeTypedArray(this.schemeDatas, 0);
    }

    public DrmInitData(@Nullable String str, List<SchemeData> list) {
        this(str, false, (SchemeData[]) list.toArray(new SchemeData[0]));
    }

    public DrmInitData(SchemeData... schemeDataArr) {
        this((String) null, schemeDataArr);
    }

    public DrmInitData(@Nullable String str, SchemeData... schemeDataArr) {
        this(str, true, schemeDataArr);
    }

    private DrmInitData(@Nullable String str, boolean z, SchemeData... schemeDataArr) {
        this.schemeType = str;
        schemeDataArr = z ? (SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        this.schemeDatas = schemeDataArr;
        this.schemeDataCount = schemeDataArr.length;
        Arrays.sort(schemeDataArr, this);
    }

    public DrmInitData(Parcel parcel) {
        this.schemeType = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR);
        int i = Ug0.f3833a;
        this.schemeDatas = schemeDataArr;
        this.schemeDataCount = schemeDataArr.length;
    }
}
