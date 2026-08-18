package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G80;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.H80;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JT;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Mc0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class SpliceInsertCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new G80();
    public final boolean autoReturn;
    public final int availNum;
    public final int availsExpected;
    public final long breakDurationUs;
    public final List<H80> componentSpliceList;
    public final boolean outOfNetworkIndicator;
    public final boolean programSpliceFlag;
    public final long programSplicePlaybackPositionUs;
    public final long programSplicePts;
    public final boolean spliceEventCancelIndicator;
    public final long spliceEventId;
    public final boolean spliceImmediateFlag;
    public final int uniqueProgramId;

    public /* synthetic */ SpliceInsertCommand(Parcel parcel, G80 g80) {
        this(parcel);
    }

    public static SpliceInsertCommand b(JT jt, long j, Mc0 mc0) {
        List list;
        int iY;
        boolean z;
        boolean z2;
        long j2;
        boolean z3;
        long j3;
        boolean z4;
        int iT;
        int iT2;
        boolean z5;
        long jU;
        JT jt2 = jt;
        long jU2 = jt.u();
        boolean z6 = (jt.t() & 128) != 0;
        List listEmptyList = Collections.emptyList();
        if (z6) {
            list = listEmptyList;
            iY = 0;
            z = false;
            z2 = false;
            j2 = C.TIME_UNSET;
            z3 = false;
            j3 = C.TIME_UNSET;
            z4 = false;
            iT = 0;
            iT2 = 0;
        } else {
            int iT3 = jt.t();
            boolean z7 = (iT3 & 128) != 0;
            boolean z8 = (iT3 & 64) != 0;
            boolean z9 = (iT3 & 32) != 0;
            boolean z10 = (iT3 & 16) != 0;
            long jC = (!z8 || z10) ? C.TIME_UNSET : TimeSignalCommand.c(j, jt2);
            if (!z8) {
                int iT4 = jt.t();
                ArrayList arrayList = new ArrayList(iT4);
                int i = 0;
                while (i < iT4) {
                    int iT5 = jt.t();
                    long jC2 = !z10 ? TimeSignalCommand.c(j, jt2) : C.TIME_UNSET;
                    arrayList.add(new H80(iT5, jC2, mc0.b(jC2)));
                    i++;
                    jt2 = jt;
                }
                listEmptyList = arrayList;
            }
            if (z9) {
                long jT = jt.t();
                boolean z11 = (128 & jT) != 0;
                jU = ((((jT & 1) << 32) | jt.u()) * 1000) / 90;
                z5 = z11;
            } else {
                z5 = false;
                jU = C.TIME_UNSET;
            }
            iY = jt.y();
            iT = jt.t();
            iT2 = jt.t();
            list = listEmptyList;
            z4 = z8;
            long j4 = jC;
            z3 = z5;
            j3 = jU;
            z2 = z10;
            z = z7;
            j2 = j4;
        }
        return new SpliceInsertCommand(jU2, z6, z, z4, z2, j2, mc0.b(j2), list, z3, j3, iY, iT, iT2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.spliceEventId);
        parcel.writeByte(this.spliceEventCancelIndicator ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.outOfNetworkIndicator ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.programSpliceFlag ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.spliceImmediateFlag ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.programSplicePts);
        parcel.writeLong(this.programSplicePlaybackPositionUs);
        int size = this.componentSpliceList.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            H80 h80 = this.componentSpliceList.get(i2);
            parcel.writeInt(h80.f3158a);
            parcel.writeLong(h80.b);
            parcel.writeLong(h80.c);
        }
        parcel.writeByte(this.autoReturn ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.breakDurationUs);
        parcel.writeInt(this.uniqueProgramId);
        parcel.writeInt(this.availNum);
        parcel.writeInt(this.availsExpected);
    }

    private SpliceInsertCommand(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List<H80> list, boolean z5, long j4, int i, int i2, int i3) {
        this.spliceEventId = j;
        this.spliceEventCancelIndicator = z;
        this.outOfNetworkIndicator = z2;
        this.programSpliceFlag = z3;
        this.spliceImmediateFlag = z4;
        this.programSplicePts = j2;
        this.programSplicePlaybackPositionUs = j3;
        this.componentSpliceList = Collections.unmodifiableList(list);
        this.autoReturn = z5;
        this.breakDurationUs = j4;
        this.uniqueProgramId = i;
        this.availNum = i2;
        this.availsExpected = i3;
    }

    private SpliceInsertCommand(Parcel parcel) {
        this.spliceEventId = parcel.readLong();
        this.spliceEventCancelIndicator = parcel.readByte() == 1;
        this.outOfNetworkIndicator = parcel.readByte() == 1;
        this.programSpliceFlag = parcel.readByte() == 1;
        this.spliceImmediateFlag = parcel.readByte() == 1;
        this.programSplicePts = parcel.readLong();
        this.programSplicePlaybackPositionUs = parcel.readLong();
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new H80(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.componentSpliceList = Collections.unmodifiableList(arrayList);
        this.autoReturn = parcel.readByte() == 1;
        this.breakDurationUs = parcel.readLong();
        this.uniqueProgramId = parcel.readInt();
        this.availNum = parcel.readInt();
        this.availsExpected = parcel.readInt();
    }
}
