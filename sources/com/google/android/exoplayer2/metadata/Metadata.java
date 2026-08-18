package com.google.android.exoplayer2.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2340Cl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3516gN;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3867kO;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4619sw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ug0;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class Metadata implements Parcelable {
    public static final Parcelable.Creator<Metadata> CREATOR = new C3516gN(7);
    private final Entry[] entries;
    public final long presentationTimeUs;

    public interface Entry extends Parcelable {
        void a(C3867kO c3867kO);

        C4619sw k();

        byte[] n();
    }

    public Metadata(Entry... entryArr) {
        this(C.TIME_UNSET, entryArr);
    }

    public final Metadata b(Entry... entryArr) {
        if (entryArr.length == 0) {
            return this;
        }
        long j = this.presentationTimeUs;
        Entry[] entryArr2 = this.entries;
        int i = Ug0.f3833a;
        Object[] objArrCopyOf = Arrays.copyOf(entryArr2, entryArr2.length + entryArr.length);
        System.arraycopy(entryArr, 0, objArrCopyOf, entryArr2.length, entryArr.length);
        return new Metadata(j, (Entry[]) objArrCopyOf);
    }

    public final Metadata c(Metadata metadata) {
        return metadata == null ? this : b(metadata.entries);
    }

    public final Metadata d(long j) {
        return this.presentationTimeUs == j ? this : new Metadata(j, this.entries);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Entry e(int i) {
        return this.entries[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Metadata.class != obj.getClass()) {
            return false;
        }
        Metadata metadata = (Metadata) obj;
        return Arrays.equals(this.entries, metadata.entries) && this.presentationTimeUs == metadata.presentationTimeUs;
    }

    public final int f() {
        return this.entries.length;
    }

    public final int hashCode() {
        return AbstractC2340Cl.C(this.presentationTimeUs) + (Arrays.hashCode(this.entries) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.entries));
        if (this.presentationTimeUs == C.TIME_UNSET) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + this.presentationTimeUs;
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.entries.length);
        for (Entry entry : this.entries) {
            parcel.writeParcelable(entry, 0);
        }
        parcel.writeLong(this.presentationTimeUs);
    }

    public Metadata(long j, Entry... entryArr) {
        this.presentationTimeUs = j;
        this.entries = entryArr;
    }

    public Metadata(List<? extends Entry> list) {
        this((Entry[]) list.toArray(new Entry[0]));
    }

    public Metadata(long j, List<? extends Entry> list) {
        this(j, (Entry[]) list.toArray(new Entry[0]));
    }

    public Metadata(Parcel parcel) {
        this.entries = new Entry[parcel.readInt()];
        int i = 0;
        while (true) {
            Entry[] entryArr = this.entries;
            if (i < entryArr.length) {
                entryArr[i] = (Entry) parcel.readParcelable(Entry.class.getClassLoader());
                i++;
            } else {
                this.presentationTimeUs = parcel.readLong();
                return;
            }
        }
    }
}
