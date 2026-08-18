package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JT;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.SV;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ug0;

/* JADX INFO: loaded from: classes2.dex */
public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator<PrivateCommand> CREATOR = new SV();
    public final byte[] commandBytes;
    public final long identifier;
    public final long ptsAdjustment;

    public /* synthetic */ PrivateCommand(Parcel parcel, SV sv) {
        this(parcel);
    }

    public static PrivateCommand b(JT jt, int i, long j) {
        long jU = jt.u();
        int i2 = i - 4;
        byte[] bArr = new byte[i2];
        jt.d(bArr, 0, i2);
        return new PrivateCommand(jU, bArr, j);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.ptsAdjustment);
        parcel.writeLong(this.identifier);
        parcel.writeByteArray(this.commandBytes);
    }

    private PrivateCommand(long j, byte[] bArr, long j2) {
        this.ptsAdjustment = j2;
        this.identifier = j;
        this.commandBytes = bArr;
    }

    private PrivateCommand(Parcel parcel) {
        this.ptsAdjustment = parcel.readLong();
        this.identifier = parcel.readLong();
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i = Ug0.f3833a;
        this.commandBytes = bArrCreateByteArray;
    }
}
