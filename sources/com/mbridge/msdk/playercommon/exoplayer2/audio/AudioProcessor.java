package com.mbridge.msdk.playercommon.exoplayer2.audio;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
public interface AudioProcessor {
    public static final ByteBuffer EMPTY_BUFFER = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class UnhandledFormatException extends Exception {
        /* JADX WARN: Illegal instructions before constructor call */
        public UnhandledFormatException(int i, int i2, int i3) {
            StringBuilder sbT = AbstractC3950lJ.t("Unhandled format: ", i, " Hz, ", i2, " channels in encoding ");
            sbT.append(i3);
            super(sbT.toString());
        }
    }

    boolean configure(int i, int i2, int i3) throws UnhandledFormatException;

    void flush();

    ByteBuffer getOutput();

    int getOutputChannelCount();

    int getOutputEncoding();

    int getOutputSampleRateHz();

    boolean isActive();

    boolean isEnded();

    void queueEndOfStream();

    void queueInput(ByteBuffer byteBuffer);

    void reset();
}
