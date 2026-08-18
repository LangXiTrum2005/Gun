package com.google.protobuf;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Jg0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Kg0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Mg0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ng0;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class V0 extends Kg0 {
    public static boolean isAvailable() {
        return U0.hasUnsafeArrayOperations() && U0.hasUnsafeByteBufferOperations();
    }

    private static int unsafeEstimateConsecutiveAscii(byte[] bArr, long j, int i) {
        int i2 = 0;
        if (i < 16) {
            return 0;
        }
        int i3 = 8 - (((int) j) & 7);
        while (i2 < i3) {
            long j2 = 1 + j;
            if (U0.getByte(bArr, j) < 0) {
                return i2;
            }
            i2++;
            j = j2;
        }
        while (true) {
            int i4 = i2 + 8;
            if (i4 > i || (U0.getLong((Object) bArr, U0.BYTE_ARRAY_BASE_OFFSET + j) & (-9187201950435737472L)) != 0) {
                break;
            }
            j += 8;
            i2 = i4;
        }
        while (i2 < i) {
            long j3 = j + 1;
            if (U0.getByte(bArr, j) < 0) {
                return i2;
            }
            i2++;
            j = j3;
        }
        return i;
    }

    private static int unsafeIncompleteStateFor(byte[] bArr, int i, long j, int i2) {
        if (i2 == 0) {
            return Ng0.incompleteStateFor(i);
        }
        if (i2 == 1) {
            return Ng0.incompleteStateFor(i, U0.getByte(bArr, j));
        }
        if (i2 == 2) {
            return Ng0.incompleteStateFor(i, U0.getByte(bArr, j), U0.getByte(bArr, j + 1));
        }
        throw new AssertionError();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Kg0
    public String decodeUtf8(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
        Charset charset = Internal.UTF_8;
        String str = new String(bArr, i, i2, charset);
        if (str.contains("�") && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i2 + i))) {
            throw InvalidProtocolBufferException.invalidUtf8();
        }
        return str;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Kg0
    public String decodeUtf8Direct(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
        if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        long jAddressOffset = U0.addressOffset(byteBuffer) + ((long) i);
        long j = ((long) i2) + jAddressOffset;
        char[] cArr = new char[i2];
        int i3 = 0;
        while (jAddressOffset < j) {
            byte b = U0.getByte(jAddressOffset);
            if (!Jg0.isOneByte(b)) {
                break;
            }
            jAddressOffset++;
            Jg0.handleOneByte(b, cArr, i3);
            i3++;
        }
        while (jAddressOffset < j) {
            long j2 = jAddressOffset + 1;
            byte b2 = U0.getByte(jAddressOffset);
            if (Jg0.isOneByte(b2)) {
                int i4 = i3 + 1;
                Jg0.handleOneByte(b2, cArr, i3);
                while (j2 < j) {
                    byte b3 = U0.getByte(j2);
                    if (!Jg0.isOneByte(b3)) {
                        break;
                    }
                    j2++;
                    Jg0.handleOneByte(b3, cArr, i4);
                    i4++;
                }
                i3 = i4;
                jAddressOffset = j2;
            } else if (Jg0.isTwoBytes(b2)) {
                if (j2 >= j) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                jAddressOffset += 2;
                Jg0.handleTwoBytes(b2, U0.getByte(j2), cArr, i3);
                i3++;
            } else if (Jg0.isThreeBytes(b2)) {
                if (j2 >= j - 1) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                long j3 = 2 + jAddressOffset;
                jAddressOffset += 3;
                Jg0.handleThreeBytes(b2, U0.getByte(j2), U0.getByte(j3), cArr, i3);
                i3++;
            } else {
                if (j2 >= j - 2) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                byte b4 = U0.getByte(j2);
                long j4 = jAddressOffset + 3;
                byte b5 = U0.getByte(2 + jAddressOffset);
                jAddressOffset += 4;
                Jg0.handleFourBytes(b2, b4, b5, U0.getByte(j4), cArr, i3);
                i3 += 2;
            }
        }
        return new String(cArr, 0, i3);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Kg0
    public int encodeUtf8(CharSequence charSequence, byte[] bArr, int i, int i2) {
        long j;
        String str;
        String str2;
        int i3;
        long j2;
        char cCharAt;
        long j3 = i;
        long j4 = ((long) i2) + j3;
        int length = charSequence.length();
        String str3 = " at index ";
        String str4 = "Failed writing ";
        if (length > i2 || bArr.length - i2 < i) {
            throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i + i2));
        }
        int i4 = 0;
        while (true) {
            j = 1;
            if (i4 >= length || (cCharAt = charSequence.charAt(i4)) >= 128) {
                break;
            }
            U0.putByte(bArr, j3, (byte) cCharAt);
            i4++;
            j3 = 1 + j3;
        }
        if (i4 == length) {
            return (int) j3;
        }
        while (i4 < length) {
            char cCharAt2 = charSequence.charAt(i4);
            if (cCharAt2 >= 128 || j3 >= j4) {
                if (cCharAt2 >= 2048 || j3 > j4 - 2) {
                    str = str3;
                    str2 = str4;
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j3 > j4 - 3) {
                        if (j3 > j4 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i3)))) {
                                throw new Mg0(i4, length);
                            }
                            throw new ArrayIndexOutOfBoundsException(str2 + cCharAt2 + str + j3);
                        }
                        int i5 = i4 + 1;
                        if (i5 != length) {
                            char cCharAt3 = charSequence.charAt(i5);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                j2 = 1;
                                U0.putByte(bArr, j3, (byte) ((codePoint >>> 18) | PsExtractor.VIDEO_STREAM_MASK));
                                U0.putByte(bArr, j3 + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j5 = j3 + 3;
                                U0.putByte(bArr, j3 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                j3 += 4;
                                U0.putByte(bArr, j5, (byte) ((codePoint & 63) | 128));
                                i4 = i5;
                            } else {
                                i4 = i5;
                            }
                        }
                        throw new Mg0(i4 - 1, length);
                    }
                    U0.putByte(bArr, j3, (byte) ((cCharAt2 >>> '\f') | 480));
                    long j6 = j3 + 2;
                    U0.putByte(bArr, j3 + 1, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    j3 += 3;
                    U0.putByte(bArr, j6, (byte) ((cCharAt2 & '?') | 128));
                } else {
                    str = str3;
                    str2 = str4;
                    long j7 = j3 + j;
                    U0.putByte(bArr, j3, (byte) ((cCharAt2 >>> 6) | 960));
                    j3 += 2;
                    U0.putByte(bArr, j7, (byte) ((cCharAt2 & '?') | 128));
                }
                j2 = 1;
            } else {
                U0.putByte(bArr, j3, (byte) cCharAt2);
                str2 = str4;
                j2 = j;
                j3 += j;
                str = str3;
            }
            i4++;
            str3 = str;
            str4 = str2;
            j = j2;
            j4 = j4;
        }
        return (int) j3;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Kg0
    public void encodeUtf8Direct(CharSequence charSequence, ByteBuffer byteBuffer) {
        long j;
        char c;
        int i;
        char cCharAt;
        long jAddressOffset = U0.addressOffset(byteBuffer);
        long jPosition = ((long) byteBuffer.position()) + jAddressOffset;
        long jLimit = ((long) byteBuffer.limit()) + jAddressOffset;
        int length = charSequence.length();
        if (length > jLimit - jPosition) {
            throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + byteBuffer.limit());
        }
        int i2 = 0;
        while (true) {
            j = 1;
            c = 128;
            if (i2 >= length || (cCharAt = charSequence.charAt(i2)) >= 128) {
                break;
            }
            U0.putByte(jPosition, (byte) cCharAt);
            i2++;
            jPosition = 1 + jPosition;
        }
        if (i2 == length) {
            return;
        }
        while (i2 < length) {
            char cCharAt2 = charSequence.charAt(i2);
            if (cCharAt2 >= c || jPosition >= jLimit) {
                if (cCharAt2 >= 2048 || jPosition > jLimit - 2) {
                    jAddressOffset = jAddressOffset;
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || jPosition > jLimit - 3) {
                        if (jPosition > jLimit - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i = i2 + 1) == length || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i)))) {
                                throw new Mg0(i2, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + jPosition);
                        }
                        i2++;
                        if (i2 != length) {
                            char cCharAt3 = charSequence.charAt(i2);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                j = 1;
                                U0.putByte(jPosition, (byte) ((codePoint >>> 18) | PsExtractor.VIDEO_STREAM_MASK));
                                jLimit = jLimit;
                                U0.putByte(jPosition + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j2 = jPosition + 3;
                                U0.putByte(jPosition + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                jPosition += 4;
                                U0.putByte(j2, (byte) ((codePoint & 63) | 128));
                            } else {
                                i2 = i2;
                            }
                        }
                        throw new Mg0(i2 - 1, length);
                    }
                    long j3 = jPosition + j;
                    U0.putByte(jPosition, (byte) ((cCharAt2 >>> '\f') | 480));
                    long j4 = jPosition + 2;
                    U0.putByte(j3, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    jPosition += 3;
                    U0.putByte(j4, (byte) ((cCharAt2 & '?') | 128));
                    jLimit = jLimit;
                    i2 = i2;
                    j = 1;
                } else {
                    long j5 = jPosition + j;
                    U0.putByte(jPosition, (byte) ((cCharAt2 >>> 6) | 960));
                    jPosition += 2;
                    U0.putByte(j5, (byte) ((cCharAt2 & '?') | 128));
                }
                i2++;
                jAddressOffset = jAddressOffset;
                j = j;
                jLimit = jLimit;
                c = 128;
            } else {
                U0.putByte(jPosition, (byte) cCharAt2);
                jPosition += j;
            }
            i2++;
            jAddressOffset = jAddressOffset;
            j = j;
            jLimit = jLimit;
            c = 128;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0059, code lost:
    
        if (com.google.protobuf.U0.getByte(r13, r1) > (-65)) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x009e, code lost:
    
        if (com.google.protobuf.U0.getByte(r13, r1) > (-65)) goto L59;
     */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Kg0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int partialIsValidUtf8(int r12, byte[] r13, int r14, int r15) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.V0.partialIsValidUtf8(int, byte[], int, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        if (com.google.protobuf.U0.getByte(r1) > (-65)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0062, code lost:
    
        if (com.google.protobuf.U0.getByte(r1) > (-65)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a3, code lost:
    
        if (com.google.protobuf.U0.getByte(r1) > (-65)) goto L57;
     */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Kg0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int partialIsValidUtf8Direct(int r11, java.nio.ByteBuffer r12, int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.V0.partialIsValidUtf8Direct(int, java.nio.ByteBuffer, int, int):int");
    }

    private static int unsafeEstimateConsecutiveAscii(long j, int i) {
        if (i < 16) {
            return 0;
        }
        int i2 = (int) ((-j) & 7);
        int i3 = i2;
        while (i3 > 0) {
            long j2 = 1 + j;
            if (U0.getByte(j) < 0) {
                return i2 - i3;
            }
            i3--;
            j = j2;
        }
        int i4 = i - i2;
        while (i4 >= 8 && (U0.getLong(j) & (-9187201950435737472L)) == 0) {
            j += 8;
            i4 -= 8;
        }
        return i - i4;
    }

    private static int unsafeIncompleteStateFor(long j, int i, int i2) {
        if (i2 == 0) {
            return Ng0.incompleteStateFor(i);
        }
        if (i2 == 1) {
            return Ng0.incompleteStateFor(i, U0.getByte(j));
        }
        if (i2 == 2) {
            return Ng0.incompleteStateFor(i, U0.getByte(j), U0.getByte(j + 1));
        }
        throw new AssertionError();
    }

    private static int partialIsValidUtf8(byte[] bArr, long j, int i) {
        int iUnsafeEstimateConsecutiveAscii = unsafeEstimateConsecutiveAscii(bArr, j, i);
        int i2 = i - iUnsafeEstimateConsecutiveAscii;
        long j2 = j + ((long) iUnsafeEstimateConsecutiveAscii);
        while (true) {
            byte b = 0;
            while (i2 > 0) {
                long j3 = j2 + 1;
                b = U0.getByte(bArr, j2);
                if (b < 0) {
                    j2 = j3;
                    break;
                }
                i2--;
                j2 = j3;
            }
            if (i2 == 0) {
                return 0;
            }
            int i3 = i2 - 1;
            if (b < -32) {
                if (i3 == 0) {
                    return b;
                }
                i2 -= 2;
                if (b >= -62) {
                    long j4 = 1 + j2;
                    if (U0.getByte(bArr, j2) <= -65) {
                        j2 = j4;
                    }
                }
                return -1;
            }
            if (b < -16) {
                if (i3 < 2) {
                    return unsafeIncompleteStateFor(bArr, b, j2, i3);
                }
                i2 -= 3;
                long j5 = 1 + j2;
                byte b2 = U0.getByte(bArr, j2);
                if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                    j2 += 2;
                    if (U0.getByte(bArr, j5) > -65) {
                    }
                }
                return -1;
            }
            if (i3 < 3) {
                return unsafeIncompleteStateFor(bArr, b, j2, i3);
            }
            i2 -= 4;
            long j6 = 1 + j2;
            byte b3 = U0.getByte(bArr, j2);
            if (b3 <= -65) {
                if ((((b3 + 112) + (b << 28)) >> 30) == 0) {
                    long j7 = 2 + j2;
                    if (U0.getByte(bArr, j6) <= -65) {
                        j2 += 3;
                        if (U0.getByte(bArr, j7) > -65) {
                        }
                    }
                }
            }
            return -1;
        }
    }

    private static int partialIsValidUtf8(long j, int i) {
        int iUnsafeEstimateConsecutiveAscii = unsafeEstimateConsecutiveAscii(j, i);
        long j2 = j + ((long) iUnsafeEstimateConsecutiveAscii);
        int i2 = i - iUnsafeEstimateConsecutiveAscii;
        while (true) {
            byte b = 0;
            while (i2 > 0) {
                long j3 = j2 + 1;
                b = U0.getByte(j2);
                if (b < 0) {
                    j2 = j3;
                    break;
                }
                i2--;
                j2 = j3;
            }
            if (i2 == 0) {
                return 0;
            }
            int i3 = i2 - 1;
            if (b < -32) {
                if (i3 == 0) {
                    return b;
                }
                i2 -= 2;
                if (b >= -62) {
                    long j4 = 1 + j2;
                    if (U0.getByte(j2) <= -65) {
                        j2 = j4;
                    }
                }
                return -1;
            }
            if (b < -16) {
                if (i3 < 2) {
                    return unsafeIncompleteStateFor(j2, b, i3);
                }
                i2 -= 3;
                long j5 = 1 + j2;
                byte b2 = U0.getByte(j2);
                if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                    j2 += 2;
                    if (U0.getByte(j5) > -65) {
                    }
                }
                return -1;
            }
            if (i3 < 3) {
                return unsafeIncompleteStateFor(j2, b, i3);
            }
            i2 -= 4;
            long j6 = 1 + j2;
            byte b3 = U0.getByte(j2);
            if (b3 <= -65) {
                if ((((b3 + 112) + (b << 28)) >> 30) == 0) {
                    long j7 = 2 + j2;
                    if (U0.getByte(j6) <= -65) {
                        j2 += 3;
                        if (U0.getByte(j7) > -65) {
                        }
                    }
                }
            }
            return -1;
        }
    }
}
