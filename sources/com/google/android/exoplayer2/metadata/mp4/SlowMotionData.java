package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3867kO;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4619sw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.FW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.P70;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ug0;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class SlowMotionData implements Metadata.Entry {
    public static final Parcelable.Creator<SlowMotionData> CREATOR = new a();
    public final List<Segment> segments;

    public static final class Segment implements Parcelable {
        public static final Comparator<Segment> BY_START_THEN_END_THEN_DIVISOR = new P70(0);
        public static final Parcelable.Creator<Segment> CREATOR = new b();
        public final long endTimeMs;
        public final int speedDivisor;
        public final long startTimeMs;

        public Segment(long j, long j2, int i) {
            FW.h(j < j2);
            this.startTimeMs = j;
            this.endTimeMs = j2;
            this.speedDivisor = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Segment.class != obj.getClass()) {
                return false;
            }
            Segment segment = (Segment) obj;
            return this.startTimeMs == segment.startTimeMs && this.endTimeMs == segment.endTimeMs && this.speedDivisor == segment.speedDivisor;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Long.valueOf(this.startTimeMs), Long.valueOf(this.endTimeMs), Integer.valueOf(this.speedDivisor)});
        }

        public final String toString() {
            long j = this.startTimeMs;
            long j2 = this.endTimeMs;
            int i = this.speedDivisor;
            int i2 = Ug0.f3833a;
            Locale locale = Locale.US;
            StringBuilder sbP = DM.p("Segment: startTimeMs=", j, ", endTimeMs=");
            sbP.append(j2);
            sbP.append(", speedDivisor=");
            sbP.append(i);
            return sbP.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.startTimeMs);
            parcel.writeLong(this.endTimeMs);
            parcel.writeInt(this.speedDivisor);
        }
    }

    public SlowMotionData(List<Segment> list) {
        this.segments = list;
        boolean z = false;
        if (!list.isEmpty()) {
            long j = list.get(0).endTimeMs;
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i).startTimeMs < j) {
                    z = true;
                    break;
                }
                j = list.get(i).endTimeMs;
            }
        }
        FW.h(!z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SlowMotionData.class != obj.getClass()) {
            return false;
        }
        return this.segments.equals(((SlowMotionData) obj).segments);
    }

    public final int hashCode() {
        return this.segments.hashCode();
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
        return "SlowMotion: segments=" + this.segments;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.segments);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ void a(C3867kO c3867kO) {
    }
}
