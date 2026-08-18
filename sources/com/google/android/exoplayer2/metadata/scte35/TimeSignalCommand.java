package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ac0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JT;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Mc0;

/* JADX INFO: loaded from: classes2.dex */
public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new Ac0();
    public final long playbackPositionUs;
    public final long ptsTime;

    public /* synthetic */ TimeSignalCommand(long j, long j2, Ac0 ac0) {
        this(j, j2);
    }

    public static TimeSignalCommand b(JT jt, long j, Mc0 mc0) {
        long jC = c(j, jt);
        return new TimeSignalCommand(jC, mc0.b(jC));
    }

    public static long c(long j, JT jt) {
        long jT = jt.t();
        return (128 & jT) != 0 ? 8589934591L & ((((jT & 1) << 32) | jt.u()) + j) : C.TIME_UNSET;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.ptsTime);
        parcel.writeLong(this.playbackPositionUs);
    }

    private TimeSignalCommand(long j, long j2) {
        this.ptsTime = j;
        this.playbackPositionUs = j2;
    }
}
