package com.google.android.exoplayer2.metadata.vorbis;

import android.os.Parcel;
import android.os.Parcelable;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3516gN;

/* JADX INFO: loaded from: classes2.dex */
public final class VorbisComment extends com.google.android.exoplayer2.metadata.flac.VorbisComment {
    public static final Parcelable.Creator<VorbisComment> CREATOR = new C3516gN(25);

    public VorbisComment(String str, String str2) {
        super(str, str2);
    }

    public VorbisComment(Parcel parcel) {
        super(parcel);
    }
}
