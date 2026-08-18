package com.bykv.vk.openvk.preload.geckox.utils;

import com.mbridge.msdk.foundation.tools.SameMD5;
import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.io.InputStream;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static char[] f365a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static void a(InputStream inputStream, String str) throws Exception {
        if (str == null) {
            throw new RuntimeException("md5 check failed: md5 == null");
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            try {
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i = inputStream.read(bArr, 0, 4096);
                        if (i == -1) {
                            break;
                        } else {
                            messageDigest.update(bArr, 0, i);
                        }
                        CloseableUtils.close(inputStream);
                        throw th;
                    }
                    CloseableUtils.close(inputStream);
                    try {
                        byte[] bArrDigest = messageDigest.digest();
                        String strA = a(bArrDigest, bArrDigest.length);
                        if (!str.equals(strA)) {
                            throw new RuntimeException(AbstractC5044xl.m("md5 check failed file: local md5:", strA, " expect md5:", str));
                        }
                    } catch (Exception e) {
                        throw new RuntimeException("md5 check failed:" + e.getMessage(), e);
                    }
                } catch (Exception e2) {
                    throw new RuntimeException("md5 check failed:" + e2.getMessage(), e2);
                }
            } catch (Throwable th) {
                CloseableUtils.close(inputStream);
                throw th;
            }
        } catch (Exception e3) {
            throw new RuntimeException("md5 check failed:" + e3.getMessage(), e3);
        }
    }

    private static String a(byte[] bArr, int i) {
        if (bArr != null) {
            if (i <= bArr.length) {
                int i2 = i << 1;
                char[] cArr = new char[i2];
                int i3 = 0;
                for (int i4 = 0; i4 < i; i4++) {
                    byte b = bArr[i4];
                    int i5 = i3 + 1;
                    char[] cArr2 = f365a;
                    cArr[i3] = cArr2[(b & 255) >> 4];
                    i3 += 2;
                    cArr[i5] = cArr2[b & cw.m];
                }
                return new String(cArr, 0, i2);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new NullPointerException("bytes is null");
    }
}
