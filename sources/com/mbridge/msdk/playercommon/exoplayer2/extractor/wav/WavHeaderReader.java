package com.mbridge.msdk.playercommon.exoplayer2.extractor.wav;

import com.mbridge.msdk.playercommon.exoplayer2.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
final class WavHeaderReader {
    private static final String TAG = "WavHeaderReader";
    private static final int TYPE_FLOAT = 3;
    private static final int TYPE_PCM = 1;
    private static final int TYPE_WAVE_FORMAT_EXTENSIBLE = 65534;

    public static final class ChunkHeader {
        public static final int SIZE_IN_BYTES = 8;
        public final int id;
        public final long size;

        private ChunkHeader(int i, long j) {
            this.id = i;
            this.size = j;
        }

        public static ChunkHeader peek(ExtractorInput extractorInput, ParsableByteArray parsableByteArray) throws InterruptedException, IOException {
            extractorInput.peekFully(parsableByteArray.data, 0, 8);
            parsableByteArray.setPosition(0);
            return new ChunkHeader(parsableByteArray.readInt(), parsableByteArray.readLittleEndianUnsignedInt());
        }
    }

    private WavHeaderReader() {
    }

    public static WavHeader peek(ExtractorInput extractorInput) throws InterruptedException, IOException {
        int pcmEncoding;
        Assertions.checkNotNull(extractorInput);
        ParsableByteArray parsableByteArray = new ParsableByteArray(16);
        if (ChunkHeader.peek(extractorInput, parsableByteArray).id != Util.getIntegerCodeForString("RIFF")) {
            return null;
        }
        extractorInput.peekFully(parsableByteArray.data, 0, 4);
        parsableByteArray.setPosition(0);
        if (parsableByteArray.readInt() != Util.getIntegerCodeForString("WAVE")) {
            return null;
        }
        ChunkHeader chunkHeaderPeek = ChunkHeader.peek(extractorInput, parsableByteArray);
        while (chunkHeaderPeek.id != Util.getIntegerCodeForString("fmt ")) {
            extractorInput.advancePeekPosition((int) chunkHeaderPeek.size);
            chunkHeaderPeek = ChunkHeader.peek(extractorInput, parsableByteArray);
        }
        Assertions.checkState(chunkHeaderPeek.size >= 16);
        extractorInput.peekFully(parsableByteArray.data, 0, 16);
        parsableByteArray.setPosition(0);
        int littleEndianUnsignedShort = parsableByteArray.readLittleEndianUnsignedShort();
        int littleEndianUnsignedShort2 = parsableByteArray.readLittleEndianUnsignedShort();
        int littleEndianUnsignedIntToInt = parsableByteArray.readLittleEndianUnsignedIntToInt();
        int littleEndianUnsignedIntToInt2 = parsableByteArray.readLittleEndianUnsignedIntToInt();
        int littleEndianUnsignedShort3 = parsableByteArray.readLittleEndianUnsignedShort();
        int littleEndianUnsignedShort4 = parsableByteArray.readLittleEndianUnsignedShort();
        int i = (littleEndianUnsignedShort2 * littleEndianUnsignedShort4) / 8;
        if (littleEndianUnsignedShort3 != i) {
            throw new ParserException(AbstractC3888ke0.h("Expected block alignment: ", i, "; got: ", littleEndianUnsignedShort3));
        }
        if (littleEndianUnsignedShort == 1) {
            pcmEncoding = Util.getPcmEncoding(littleEndianUnsignedShort4);
        } else if (littleEndianUnsignedShort != 3) {
            if (littleEndianUnsignedShort != TYPE_WAVE_FORMAT_EXTENSIBLE) {
                return null;
            }
            pcmEncoding = Util.getPcmEncoding(littleEndianUnsignedShort4);
        } else {
            pcmEncoding = littleEndianUnsignedShort4 == 32 ? 4 : 0;
        }
        if (pcmEncoding == 0) {
            return null;
        }
        extractorInput.advancePeekPosition(((int) chunkHeaderPeek.size) - 16);
        return new WavHeader(littleEndianUnsignedShort2, littleEndianUnsignedIntToInt, littleEndianUnsignedIntToInt2, littleEndianUnsignedShort3, littleEndianUnsignedShort4, pcmEncoding);
    }

    public static void skipToData(ExtractorInput extractorInput, WavHeader wavHeader) throws InterruptedException, IOException {
        Assertions.checkNotNull(extractorInput);
        Assertions.checkNotNull(wavHeader);
        extractorInput.resetPeekPosition();
        ParsableByteArray parsableByteArray = new ParsableByteArray(8);
        ChunkHeader chunkHeaderPeek = ChunkHeader.peek(extractorInput, parsableByteArray);
        while (chunkHeaderPeek.id != Util.getIntegerCodeForString("data")) {
            int i = chunkHeaderPeek.id;
            long j = chunkHeaderPeek.size + 8;
            if (i == Util.getIntegerCodeForString("RIFF")) {
                j = 12;
            }
            if (j > 2147483647L) {
                throw new ParserException("Chunk is too large (~2GB+) to skip; id: " + chunkHeaderPeek.id);
            }
            extractorInput.skipFully((int) j);
            chunkHeaderPeek = ChunkHeader.peek(extractorInput, parsableByteArray);
        }
        extractorInput.skipFully(8);
        wavHeader.setDataBounds(extractorInput.getPosition(), chunkHeaderPeek.size);
    }
}
