package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Pair;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaos {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r2v29 */
    public static X509Certificate[][] zza(String str) throws Throwable {
        ?? r2;
        String str2 = "end > capacity: ";
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            Pair pairZzc = zzaot.zzc(randomAccessFile);
            try {
                if (pairZzc == null) {
                    throw new zzaoo("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes");
                }
                ByteBuffer byteBuffer = (ByteBuffer) pairZzc.first;
                long jLongValue = ((Long) pairZzc.second).longValue();
                long j = (-20) + jLongValue;
                if (j >= 0) {
                    randomAccessFile.seek(j);
                    if (randomAccessFile.readInt() == 1347094023) {
                        throw new zzaoo("ZIP64 APK not supported");
                    }
                }
                long jZza = zzaot.zza(byteBuffer);
                if (jZza >= jLongValue) {
                    throw new zzaoo("ZIP Central Directory offset out of range: " + jZza + ". ZIP End of Central Directory offset: " + jLongValue);
                }
                if (jZza + zzaot.zzb(byteBuffer) != jLongValue) {
                    throw new zzaoo("ZIP Central Directory is not immediately followed by End of Central Directory");
                }
                if (jZza < 32) {
                    throw new zzaoo("APK too small for APK Signing Block. ZIP Central Directory offset: " + jZza);
                }
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                byteBufferAllocate.order(byteOrder);
                long j2 = jLongValue;
                randomAccessFile.seek(jZza - ((long) byteBufferAllocate.capacity()));
                randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
                if (byteBufferAllocate.getLong(8) != 2334950737559900225L || byteBufferAllocate.getLong(16) != 3617552046287187010L) {
                    throw new zzaoo("No APK Signing Block before ZIP Central Directory");
                }
                long j3 = byteBufferAllocate.getLong(0);
                if (j3 < byteBufferAllocate.capacity() || j3 > 2147483639) {
                    throw new zzaoo("APK Signing Block size out of range: " + j3);
                }
                ?? r1 = (int) (8 + j3);
                long j4 = jZza - ((long) r1);
                try {
                    if (j4 < 0) {
                        throw new zzaoo("APK Signing Block offset out of range: " + j4);
                    }
                    try {
                        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(r1);
                        byteBufferAllocate2.order(byteOrder);
                        r1 = randomAccessFile;
                        r1.seek(j4);
                        r1.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
                        long j5 = jZza;
                        long j6 = byteBufferAllocate2.getLong(0);
                        if (j6 != j3) {
                            throw new zzaoo("APK Signing Block sizes in header and footer do not match: " + j6 + " vs " + j3);
                        }
                        Pair pairCreate = Pair.create(byteBufferAllocate2, Long.valueOf(j4));
                        ByteBuffer byteBuffer2 = (ByteBuffer) pairCreate.first;
                        long jLongValue2 = ((Long) pairCreate.second).longValue();
                        if (byteBuffer2.order() != byteOrder) {
                            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                        }
                        int iCapacity = byteBuffer2.capacity() - 24;
                        if (iCapacity < 8) {
                            throw new IllegalArgumentException("end < start: " + iCapacity + " < 8");
                        }
                        int iCapacity2 = byteBuffer2.capacity();
                        if (iCapacity > byteBuffer2.capacity()) {
                            throw new IllegalArgumentException("end > capacity: " + iCapacity + " > " + iCapacity2);
                        }
                        int iLimit = byteBuffer2.limit();
                        int iPosition = byteBuffer2.position();
                        try {
                            byteBuffer2.position(0);
                            byteBuffer2.limit(iCapacity);
                            byteBuffer2.position(8);
                            ByteBuffer byteBufferSlice = byteBuffer2.slice();
                            byteBufferSlice.order(byteBuffer2.order());
                            byteBuffer2.position(0);
                            byteBuffer2.limit(iLimit);
                            byteBuffer2.position(iPosition);
                            int i = 0;
                            while (byteBufferSlice.hasRemaining()) {
                                i++;
                                if (byteBufferSlice.remaining() < 8) {
                                    throw new zzaoo("Insufficient data to read size of APK Signing Block entry #" + i);
                                }
                                long j7 = byteBufferSlice.getLong();
                                if (j7 < 4 || j7 > 2147483647L) {
                                    throw new zzaoo("APK Signing Block entry #" + i + " size out of range: " + j7);
                                }
                                int i2 = (int) j7;
                                int iPosition2 = byteBufferSlice.position() + i2;
                                if (i2 > byteBufferSlice.remaining()) {
                                    throw new zzaoo("APK Signing Block entry #" + i + " size out of range: " + i2 + ", available: " + byteBufferSlice.remaining());
                                }
                                if (byteBufferSlice.getInt() == 1896449818) {
                                    X509Certificate[][] x509CertificateArrZzl = zzl(r1.getChannel(), new zzaon(zze(byteBufferSlice, i2 - 4), jLongValue2, j5, j2, byteBuffer, null));
                                    r1.close();
                                    try {
                                        r1.close();
                                    } catch (IOException unused) {
                                    }
                                    return x509CertificateArrZzl;
                                }
                                long j8 = j2;
                                long j9 = j5;
                                byteBufferSlice.position(iPosition2);
                                j5 = j9;
                                j2 = j8;
                            }
                            throw new zzaoo("No APK Signature Scheme v2 block in APK Signing Block");
                        } catch (Throwable th) {
                            byteBuffer2.position(0);
                            byteBuffer2.limit(iLimit);
                            byteBuffer2.position(iPosition);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        r1 = randomAccessFile;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
                r2 = r1;
            } catch (Throwable th4) {
                th = th4;
                r2 = str2;
            }
        } catch (Throwable th5) {
            th = th5;
            r2 = randomAccessFile;
        }
        try {
            r2.close();
        } catch (IOException unused2) {
        }
        throw th;
    }

    private static int zzb(int i) {
        if (i == 1) {
            return 32;
        }
        if (i == 2) {
            return 64;
        }
        throw new IllegalArgumentException(AbstractC3950lJ.p("Unknown content digest algorthm: ", i));
    }

    private static int zzc(int i) {
        if (i == 513) {
            return 1;
        }
        if (i == 514) {
            return 2;
        }
        if (i == 769) {
            return 1;
        }
        switch (i) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
        }
    }

    private static String zzd(int i) {
        if (i == 1) {
            return "SHA-256";
        }
        if (i == 2) {
            return "SHA-512";
        }
        throw new IllegalArgumentException(AbstractC3950lJ.p("Unknown content digest algorthm: ", i));
    }

    private static ByteBuffer zze(ByteBuffer byteBuffer, int i) throws BufferUnderflowException {
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i2 = i + iPosition;
        if (i2 < iPosition || i2 > iLimit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i2);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i2);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    private static ByteBuffer zzf(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() < 4) {
            throw new IOException(AbstractC3950lJ.p("Remaining buffer too short to contain length of length-prefixed field. Remaining: ", byteBuffer.remaining()));
        }
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i <= byteBuffer.remaining()) {
            return zze(byteBuffer, i);
        }
        throw new IOException(AbstractC3888ke0.h("Length-prefixed field longer than remaining buffer. Field length: ", i, ", remaining: ", byteBuffer.remaining()));
    }

    private static void zzg(int i, byte[] bArr, int i2) {
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((i >>> 8) & 255);
        bArr[3] = (byte) ((i >>> 16) & 255);
        bArr[4] = (byte) (i >> 24);
    }

    private static void zzh(Map map, FileChannel fileChannel, long j, long j2, long j3, ByteBuffer byteBuffer) throws SecurityException {
        if (map.isEmpty()) {
            throw new SecurityException("No digests provided");
        }
        zzaom zzaomVar = new zzaom(fileChannel, 0L, j);
        zzaom zzaomVar2 = new zzaom(fileChannel, j2, j3 - j2);
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
        zzaot.zzd(byteBufferDuplicate, j);
        zzaok zzaokVar = new zzaok(byteBufferDuplicate);
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it = map.keySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Integer) it.next()).intValue();
            i++;
        }
        try {
            byte[][] bArrZzk = zzk(iArr, new zzaol[]{zzaomVar, zzaomVar2, zzaokVar});
            for (int i2 = 0; i2 < size; i2++) {
                int i3 = iArr[i2];
                if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i3)), bArrZzk[i2])) {
                    throw new SecurityException(zzd(i3).concat(" digest of contents did not verify"));
                }
            }
        } catch (DigestException e) {
            throw new SecurityException("Failed to compute digest(s) of contents", e);
        }
    }

    private static byte[] zzi(ByteBuffer byteBuffer) throws IOException {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IOException("Negative length");
        }
        if (i > byteBuffer.remaining()) {
            throw new IOException(AbstractC3888ke0.h("Underflow while reading length-prefixed value. Length: ", i, ", available: ", byteBuffer.remaining()));
        }
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return bArr;
    }

    private static X509Certificate[] zzj(ByteBuffer byteBuffer, Map map, CertificateFactory certificateFactory) throws IOException, SecurityException {
        String str;
        Pair pairCreate;
        ByteBuffer byteBufferZzf = zzf(byteBuffer);
        ByteBuffer byteBufferZzf2 = zzf(byteBuffer);
        byte[] bArrZzi = zzi(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArrZzi2 = null;
        byte[] bArrZzi3 = null;
        int i = -1;
        int i2 = 0;
        while (byteBufferZzf2.hasRemaining()) {
            i2++;
            try {
                ByteBuffer byteBufferZzf3 = zzf(byteBufferZzf2);
                if (byteBufferZzf3.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i3 = byteBufferZzf3.getInt();
                arrayList.add(Integer.valueOf(i3));
                if (i3 != 513 && i3 != 514 && i3 != 769) {
                    switch (i3) {
                        case 257:
                        case 258:
                        case 259:
                        case 260:
                            break;
                        default:
                            continue;
                    }
                }
                if (i != -1) {
                    int iZzc = zzc(i3);
                    int iZzc2 = zzc(i);
                    if (iZzc != 1 && iZzc2 == 1) {
                    }
                }
                bArrZzi3 = zzi(byteBufferZzf3);
                i = i3;
            } catch (IOException e) {
                e = e;
                throw new SecurityException(AbstractC3950lJ.p("Failed to parse signature record #", i2), e);
            } catch (BufferUnderflowException e2) {
                e = e2;
                throw new SecurityException(AbstractC3950lJ.p("Failed to parse signature record #", i2), e);
            }
        }
        if (i == -1) {
            if (i2 == 0) {
                throw new SecurityException("No signatures found");
            }
            throw new SecurityException("No supported signatures found");
        }
        if (i == 513 || i == 514) {
            str = "EC";
        } else if (i != 769) {
            switch (i) {
                case 257:
                case 258:
                case 259:
                case 260:
                    str = "RSA";
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
            }
        } else {
            str = "DSA";
        }
        if (i == 513) {
            pairCreate = Pair.create("SHA256withECDSA", null);
        } else if (i == 514) {
            pairCreate = Pair.create("SHA512withECDSA", null);
        } else if (i != 769) {
            switch (i) {
                case 257:
                    pairCreate = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                    break;
                case 258:
                    pairCreate = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                    break;
                case 259:
                    pairCreate = Pair.create("SHA256withRSA", null);
                    break;
                case 260:
                    pairCreate = Pair.create("SHA512withRSA", null);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
            }
        } else {
            pairCreate = Pair.create("SHA256withDSA", null);
        }
        String str2 = (String) pairCreate.first;
        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) pairCreate.second;
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArrZzi));
            Signature signature = Signature.getInstance(str2);
            signature.initVerify(publicKeyGeneratePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(byteBufferZzf);
            if (!signature.verify(bArrZzi3)) {
                throw new SecurityException(String.valueOf(str2).concat(" signature did not verify"));
            }
            byteBufferZzf.clear();
            ByteBuffer byteBufferZzf4 = zzf(byteBufferZzf);
            ArrayList arrayList2 = new ArrayList();
            int i4 = 0;
            while (byteBufferZzf4.hasRemaining()) {
                i4++;
                try {
                    ByteBuffer byteBufferZzf5 = zzf(byteBufferZzf4);
                    if (byteBufferZzf5.remaining() < 8) {
                        throw new IOException("Record too short");
                    }
                    int i5 = byteBufferZzf5.getInt();
                    arrayList2.add(Integer.valueOf(i5));
                    if (i5 == i) {
                        bArrZzi2 = zzi(byteBufferZzf5);
                    }
                } catch (IOException e3) {
                    e = e3;
                    throw new IOException(AbstractC3950lJ.p("Failed to parse digest record #", i4), e);
                } catch (BufferUnderflowException e4) {
                    e = e4;
                    throw new IOException(AbstractC3950lJ.p("Failed to parse digest record #", i4), e);
                }
            }
            if (!arrayList.equals(arrayList2)) {
                throw new SecurityException("Signature algorithms don't match between digests and signatures records");
            }
            int iZzc3 = zzc(i);
            byte[] bArr = (byte[]) map.put(Integer.valueOf(iZzc3), bArrZzi2);
            if (bArr != null && !MessageDigest.isEqual(bArr, bArrZzi2)) {
                throw new SecurityException(zzd(iZzc3).concat(" contents digest does not match the digest specified by a preceding signer"));
            }
            ByteBuffer byteBufferZzf6 = zzf(byteBufferZzf);
            ArrayList arrayList3 = new ArrayList();
            int i6 = 0;
            while (byteBufferZzf6.hasRemaining()) {
                i6++;
                byte[] bArrZzi4 = zzi(byteBufferZzf6);
                try {
                    arrayList3.add(new zzaop((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrZzi4)), bArrZzi4));
                } catch (CertificateException e5) {
                    throw new SecurityException(AbstractC3950lJ.p("Failed to decode certificate #", i6), e5);
                }
            }
            if (arrayList3.isEmpty()) {
                throw new SecurityException("No certificates listed");
            }
            if (Arrays.equals(bArrZzi, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
            }
            throw new SecurityException("Public key mismatch between certificate and signature record");
        } catch (InvalidAlgorithmParameterException e6) {
            e = e6;
            throw new SecurityException(DM.B("Failed to verify ", str2, " signature"), e);
        } catch (InvalidKeyException e7) {
            e = e7;
            throw new SecurityException(DM.B("Failed to verify ", str2, " signature"), e);
        } catch (NoSuchAlgorithmException e8) {
            e = e8;
            throw new SecurityException(DM.B("Failed to verify ", str2, " signature"), e);
        } catch (SignatureException e9) {
            e = e9;
            throw new SecurityException(DM.B("Failed to verify ", str2, " signature"), e);
        } catch (InvalidKeySpecException e10) {
            e = e10;
            throw new SecurityException(DM.B("Failed to verify ", str2, " signature"), e);
        }
    }

    private static byte[][] zzk(int[] iArr, zzaol[] zzaolVarArr) throws DigestException {
        long j;
        int i;
        int length;
        int i2 = 0;
        long j2 = 0;
        long jZza = 0;
        int i3 = 0;
        while (true) {
            j = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            if (i3 >= 3) {
                break;
            }
            jZza += (zzaolVarArr[i3].zza() + 1048575) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            i3++;
        }
        if (jZza >= 2097151) {
            throw new DigestException(AbstractC5044xl.h("Too many chunks: ", jZza));
        }
        byte[][] bArr = new byte[iArr.length][];
        int i4 = 0;
        while (true) {
            length = iArr.length;
            if (i4 >= length) {
                break;
            }
            int i5 = (int) jZza;
            byte[] bArr2 = new byte[(zzb(iArr[i4]) * i5) + 5];
            bArr2[0] = 90;
            zzg(i5, bArr2, 1);
            bArr[i4] = bArr2;
            i4++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        for (int i6 = 0; i6 < iArr.length; i6++) {
            String strZzd = zzd(iArr[i6]);
            try {
                messageDigestArr[i6] = MessageDigest.getInstance(strZzd);
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(strZzd.concat(" digest not supported"), e);
            }
        }
        int i7 = 0;
        int i8 = 0;
        for (i = 3; i7 < i; i = 3) {
            zzaol zzaolVar = zzaolVarArr[i7];
            long j3 = j2;
            long jZza2 = zzaolVar.zza();
            while (jZza2 > j2) {
                int iMin = (int) Math.min(jZza2, j);
                zzg(iMin, bArr3, 1);
                for (int i9 = 0; i9 < length; i9++) {
                    messageDigestArr[i9].update(bArr3);
                }
                long j4 = j3;
                try {
                    zzaolVar.zzb(messageDigestArr, j4, iMin);
                    byte[] bArr4 = bArr3;
                    int i10 = 0;
                    while (i10 < iArr.length) {
                        int i11 = iArr[i10];
                        zzaol zzaolVar2 = zzaolVar;
                        byte[] bArr5 = bArr[i10];
                        int iZzb = zzb(i11);
                        int i12 = length;
                        MessageDigest messageDigest = messageDigestArr[i10];
                        MessageDigest[] messageDigestArr2 = messageDigestArr;
                        int iDigest = messageDigest.digest(bArr5, (i8 * iZzb) + 5, iZzb);
                        if (iDigest != iZzb) {
                            throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + iDigest);
                        }
                        i10++;
                        zzaolVar = zzaolVar2;
                        length = i12;
                        messageDigestArr = messageDigestArr2;
                    }
                    long j5 = iMin;
                    long j6 = j4 + j5;
                    jZza2 -= j5;
                    i8++;
                    j2 = 0;
                    j = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
                    bArr3 = bArr4;
                    j3 = j6;
                    messageDigestArr = messageDigestArr;
                } catch (IOException e2) {
                    throw new DigestException(AbstractC3888ke0.h("Failed to digest chunk #", i8, " of section #", i2), e2);
                }
            }
            i2++;
            i7++;
            j2 = 0;
            j = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        }
        byte[][] bArr6 = new byte[iArr.length][];
        for (int i13 = 0; i13 < iArr.length; i13++) {
            int i14 = iArr[i13];
            byte[] bArr7 = bArr[i13];
            String strZzd2 = zzd(i14);
            try {
                bArr6[i13] = MessageDigest.getInstance(strZzd2).digest(bArr7);
            } catch (NoSuchAlgorithmException e3) {
                throw new RuntimeException(strZzd2.concat(" digest not supported"), e3);
            }
        }
        return bArr6;
    }

    private static X509Certificate[][] zzl(FileChannel fileChannel, zzaon zzaonVar) throws SecurityException {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509);
            try {
                ByteBuffer byteBufferZzf = zzf(zzaonVar.zza);
                int i = 0;
                while (byteBufferZzf.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(zzj(zzf(byteBufferZzf), map, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e) {
                        throw new SecurityException(AbstractC5044xl.g("Failed to parse/verify signer #", i, " block"), e);
                    }
                }
                if (i <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (map.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                zzh(map, fileChannel, zzaonVar.zzb, zzaonVar.zzc, zzaonVar.zzd, zzaonVar.zze);
                return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
            } catch (IOException e2) {
                throw new SecurityException("Failed to read list of signers", e2);
            }
        } catch (CertificateException e3) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e3);
        }
    }
}
