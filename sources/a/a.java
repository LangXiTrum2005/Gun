package a;

import com.umeng.analytics.pro.cw;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static ArrayList a() {
        try {
            Class clsC = c();
            byte[] bArr = {-46, -4, 125, 12, 51, -4, 98};
            byte[] bArr2 = {-65, -84, 28, 126, 82, -111, 17, 19};
            int length = bArr.length;
            int length2 = bArr2.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                if (i2 >= length2) {
                    i2 = 0;
                }
                bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
                i++;
                i2++;
            }
            Field declaredField = clsC.getDeclaredField(new String(bArr, StandardCharsets.UTF_8));
            declaredField.setAccessible(true);
            return (ArrayList) declaredField.get(d());
        } catch (Throwable unused) {
            byte[] bArr3 = {-43, -5, 44, -44, -85, -36, -97, 45, -20, -13, 37, -43, -74, -8, -94, 53};
            byte[] bArr4 = {-126, -110, 66, -80, -60, -85, -46, 76};
            int length3 = bArr3.length;
            int length4 = bArr4.length;
            int i3 = 0;
            int i4 = 0;
            while (i3 < length3) {
                if (i4 >= length4) {
                    i4 = 0;
                }
                bArr3[i3] = (byte) (bArr3[i3] ^ bArr4[i4]);
                i3++;
                i4++;
            }
            new String(bArr3, StandardCharsets.UTF_8);
            return new ArrayList();
        }
    }

    public static ArrayList b() {
        try {
            Class clsC = c();
            byte[] bArr = {-27, 10, -21, 17, 79, -53};
            byte[] bArr2 = {-120, 92, -126, 116, 56, -72, 73, -87};
            int length = bArr.length;
            int length2 = bArr2.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                if (i2 >= length2) {
                    i2 = 0;
                }
                bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
                i++;
                i2++;
            }
            Field declaredField = clsC.getDeclaredField(new String(bArr, StandardCharsets.UTF_8));
            declaredField.setAccessible(true);
            return (ArrayList) declaredField.get(d());
        } catch (Throwable unused) {
            byte[] bArr3 = {-92, cw.m, 34, -94, -120, 126, cw.k, -120, -99, 7, 43, -93, -107, 90, 48, -112};
            byte[] bArr4 = {-13, 102, 76, -58, -25, 9, 64, -23};
            int length3 = bArr3.length;
            int length4 = bArr4.length;
            int i3 = 0;
            int i4 = 0;
            while (i3 < length3) {
                if (i4 >= length4) {
                    i4 = 0;
                }
                bArr3[i3] = (byte) (bArr3[i3] ^ bArr4[i4]);
                i3++;
                i4++;
            }
            new String(bArr3, StandardCharsets.UTF_8);
            return new ArrayList();
        }
    }

    public static Class c() {
        try {
            byte[] bArr = {-11, -120, -124, cw.m, -118, -47, 66, -24, -30, -113, -123, 10, -53, -17, 79, -88, -16, -119, -105, 48, -124, -42, 71, -95, -15, -108, -89, 17, -118, -38, 71, -86};
            byte[] bArr2 = {-108, -26, -32, 125, -27, -72, 38, -58};
            int length = bArr.length;
            int length2 = bArr2.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                if (i2 >= length2) {
                    i2 = 0;
                }
                bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
                i++;
                i2++;
            }
            return Class.forName(new String(bArr, StandardCharsets.UTF_8));
        } catch (Throwable unused) {
            byte[] bArr3 = {56, -114, -57, 38, -54, -11, 95, -1, 1, -122, -50, 39, -41, -47, 98, -25};
            byte[] bArr4 = {111, -25, -87, 66, -91, -126, 18, -98};
            int length3 = bArr3.length;
            int length4 = bArr4.length;
            int i3 = 0;
            int i4 = 0;
            while (i3 < length3) {
                if (i4 >= length4) {
                    i4 = 0;
                }
                bArr3[i3] = (byte) (bArr3[i3] ^ bArr4[i4]);
                i3++;
                i4++;
            }
            new String(bArr3, StandardCharsets.UTF_8);
            return null;
        }
    }

    public static Object d() {
        try {
            Class clsC = c();
            byte[] bArr = {-30, -46, 116, 122, -31, -31, -21, -25, -21, -44, 101};
            byte[] bArr2 = {-123, -73, 0, 51, -113, -110, -97, -122};
            int length = bArr.length;
            int length2 = bArr2.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                if (i2 >= length2) {
                    i2 = 0;
                }
                bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
                i++;
                i2++;
            }
            return clsC.getMethod(new String(bArr, StandardCharsets.UTF_8), null).invoke(null, null);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
