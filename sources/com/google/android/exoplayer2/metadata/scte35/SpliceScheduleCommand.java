package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.I80;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.J80;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JT;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.K80;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new I80();
    public final List<K80> events;

    public /* synthetic */ SpliceScheduleCommand(Parcel parcel, I80 i80) {
        this(parcel);
    }

    public static SpliceScheduleCommand b(JT jt) {
        int i;
        ArrayList arrayList;
        boolean z;
        boolean z2;
        long j;
        boolean z3;
        long j2;
        int iY;
        int iT;
        int iT2;
        boolean z4;
        boolean z5;
        long jU;
        int iT3 = jt.t();
        ArrayList arrayList2 = new ArrayList(iT3);
        int i2 = 0;
        while (i2 < iT3) {
            long jU2 = jt.u();
            boolean z6 = (jt.t() & 128) != 0;
            ArrayList arrayList3 = new ArrayList();
            if (z6) {
                i = iT3;
                arrayList = arrayList3;
                z = false;
                z2 = false;
                j = C.TIME_UNSET;
                z3 = false;
                j2 = C.TIME_UNSET;
                iY = 0;
                iT = 0;
                iT2 = 0;
            } else {
                int iT4 = jt.t();
                boolean z7 = (iT4 & 128) != 0;
                boolean z8 = (iT4 & 64) != 0;
                boolean z9 = (iT4 & 32) != 0;
                long jU3 = z8 ? jt.u() : C.TIME_UNSET;
                if (z8) {
                    i = iT3;
                    z2 = z7;
                    z4 = z8;
                } else {
                    int iT5 = jt.t();
                    ArrayList arrayList4 = new ArrayList(iT5);
                    int i3 = 0;
                    while (i3 < iT5) {
                        arrayList4.add(new J80(jt.t(), jt.u()));
                        i3++;
                        z7 = z7;
                        z8 = z8;
                        iT3 = iT3;
                    }
                    i = iT3;
                    z2 = z7;
                    z4 = z8;
                    arrayList3 = arrayList4;
                }
                if (z9) {
                    long jT = jt.t();
                    z5 = (jT & 128) != 0;
                    jU = ((((jT & 1) << 32) | jt.u()) * 1000) / 90;
                } else {
                    z5 = false;
                    jU = C.TIME_UNSET;
                }
                iY = jt.y();
                arrayList = arrayList3;
                z3 = z5;
                j = jU3;
                j2 = jU;
                iT = jt.t();
                iT2 = jt.t();
                z = z4;
            }
            arrayList2.add(new K80(jU2, z6, z2, z, arrayList, j, z3, j2, iY, iT, iT2));
            i2++;
            iT3 = i;
        }
        return new SpliceScheduleCommand(arrayList2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int size = this.events.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            K80 k80 = this.events.get(i2);
            parcel.writeLong(k80.f3303a);
            parcel.writeByte(k80.b ? (byte) 1 : (byte) 0);
            parcel.writeByte(k80.c ? (byte) 1 : (byte) 0);
            parcel.writeByte(k80.d ? (byte) 1 : (byte) 0);
            List list = k80.f;
            int size2 = list.size();
            parcel.writeInt(size2);
            for (int i3 = 0; i3 < size2; i3++) {
                J80 j80 = (J80) list.get(i3);
                parcel.writeInt(j80.f3256a);
                parcel.writeLong(j80.b);
            }
            parcel.writeLong(k80.e);
            parcel.writeByte(k80.g ? (byte) 1 : (byte) 0);
            parcel.writeLong(k80.h);
            parcel.writeInt(k80.i);
            parcel.writeInt(k80.j);
            parcel.writeInt(k80.k);
        }
    }

    private SpliceScheduleCommand(List<K80> list) {
        this.events = Collections.unmodifiableList(list);
    }

    private SpliceScheduleCommand(Parcel parcel) {
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new K80(parcel));
        }
        this.events = Collections.unmodifiableList(arrayList);
    }
}
