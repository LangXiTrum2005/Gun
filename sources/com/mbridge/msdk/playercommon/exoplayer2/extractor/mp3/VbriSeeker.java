package com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.MpegAudioHeader;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekPoint;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes2.dex */
final class VbriSeeker implements Mp3Extractor.Seeker {
    private static final String TAG = "VbriSeeker";
    private final long durationUs;
    private final long[] positions;
    private final long[] timesUs;

    private VbriSeeker(long[] jArr, long[] jArr2, long j) {
        this.timesUs = jArr;
        this.positions = jArr2;
        this.durationUs = j;
    }

    public static VbriSeeker create(long j, long j2, MpegAudioHeader mpegAudioHeader, ParsableByteArray parsableByteArray) {
        Object obj;
        int unsignedByte;
        parsableByteArray.skipBytes(10);
        int i = parsableByteArray.readInt();
        if (i <= 0) {
            return null;
        }
        int i2 = mpegAudioHeader.sampleRate;
        long jScaleLargeTimestamp = Util.scaleLargeTimestamp(i, ((long) (i2 >= 32000 ? 1152 : 576)) * 1000000, i2);
        int unsignedShort = parsableByteArray.readUnsignedShort();
        int unsignedShort2 = parsableByteArray.readUnsignedShort();
        int unsignedShort3 = parsableByteArray.readUnsignedShort();
        parsableByteArray.skipBytes(2);
        long j3 = j2 + ((long) mpegAudioHeader.frameSize);
        long[] jArr = new long[unsignedShort];
        long[] jArr2 = new long[unsignedShort];
        long j4 = j2;
        int i3 = 0;
        while (i3 < unsignedShort) {
            long j5 = j3;
            long j6 = jScaleLargeTimestamp;
            jArr[i3] = (((long) i3) * jScaleLargeTimestamp) / ((long) unsignedShort);
            jArr2[i3] = Math.max(j4, j5);
            if (unsignedShort3 == 1) {
                obj = null;
                unsignedByte = parsableByteArray.readUnsignedByte();
            } else if (unsignedShort3 == 2) {
                obj = null;
                unsignedByte = parsableByteArray.readUnsignedShort();
            } else if (unsignedShort3 == 3) {
                obj = null;
                unsignedByte = parsableByteArray.readUnsignedInt24();
            } else {
                if (unsignedShort3 != 4) {
                    return null;
                }
                obj = null;
                unsignedByte = parsableByteArray.readUnsignedIntToInt();
            }
            j4 += (long) (unsignedByte * unsignedShort2);
            i3++;
            j3 = j5;
            jScaleLargeTimestamp = j6;
        }
        return new VbriSeeker(jArr, jArr2, jScaleLargeTimestamp);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j) {
        int iBinarySearchFloor = Util.binarySearchFloor(this.timesUs, j, true, true);
        SeekPoint seekPoint = new SeekPoint(this.timesUs[iBinarySearchFloor], this.positions[iBinarySearchFloor]);
        if (seekPoint.timeUs >= j || iBinarySearchFloor == this.timesUs.length - 1) {
            return new SeekMap.SeekPoints(seekPoint);
        }
        int i = iBinarySearchFloor + 1;
        return new SeekMap.SeekPoints(seekPoint, new SeekPoint(this.timesUs[i], this.positions[i]));
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3.Mp3Extractor.Seeker
    public long getTimeUs(long j) {
        return this.timesUs[Util.binarySearchFloor(this.positions, j, true, true)];
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }
}
