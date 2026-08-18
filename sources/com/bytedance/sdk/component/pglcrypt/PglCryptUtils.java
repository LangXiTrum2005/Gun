package com.bytedance.sdk.component.pglcrypt;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class PglCryptUtils {
    public static final int BASE64_FAILED = 504;
    public static final int COMPRESS_FAILED = 503;
    public static final int CRYPT_OK = 0;
    public static final int CYPHER_VERSION = 4;
    public static final int DECRYPT_FAILED = 506;
    public static final int ENCRYPT_FAILED = 505;
    public static final int INPUT_INVALID = 502;
    public static final String KEY_CYPHER = "cypher";
    public static final String KEY_MESSAGE = "message";
    private static volatile boolean LD = true;
    public static final int LOAD_SO_FAILED = 501;
    private static volatile PglCryptUtils Lxb;

    private PglCryptUtils() {
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x0059 A[Catch: Exception -> 0x0055, TRY_LEAVE, TryCatch #5 {Exception -> 0x0055, blocks: (B:33:0x0051, B:37:0x0059), top: B:45:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0051 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private static byte[] Lxb(String str) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream;
        GZIPOutputStream gZIPOutputStream2 = null;
        if (str != null) {
            try {
                if (str.length() != 0) {
                    try {
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                            try {
                                try {
                                    gZIPOutputStream.write(str.getBytes("utf-8"));
                                    gZIPOutputStream.close();
                                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                                    byteArrayOutputStream.close();
                                    return byteArray;
                                } catch (Throwable th) {
                                    th = th;
                                    gZIPOutputStream2 = gZIPOutputStream;
                                    if (gZIPOutputStream2 != null) {
                                        try {
                                            gZIPOutputStream2.close();
                                            if (byteArrayOutputStream != null) {
                                                byteArrayOutputStream.toByteArray();
                                                byteArrayOutputStream.close();
                                            }
                                        } catch (Exception e) {
                                            e.toString();
                                            throw th;
                                        }
                                    } else if (byteArrayOutputStream != null) {
                                        byteArrayOutputStream.toByteArray();
                                        byteArrayOutputStream.close();
                                    }
                                    throw th;
                                }
                            } catch (Exception e2) {
                                e = e2;
                                e.toString();
                                if (gZIPOutputStream != null) {
                                    gZIPOutputStream.close();
                                }
                                if (byteArrayOutputStream == null) {
                                    return null;
                                }
                                byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                                return byteArray2;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            gZIPOutputStream = null;
                        } catch (Throwable th2) {
                            th = th2;
                            if (gZIPOutputStream2 != null) {
                                gZIPOutputStream2.close();
                                if (byteArrayOutputStream != null) {
                                    byteArrayOutputStream.toByteArray();
                                    byteArrayOutputStream.close();
                                }
                            } else if (byteArrayOutputStream != null) {
                                byteArrayOutputStream.toByteArray();
                                byteArrayOutputStream.close();
                            }
                            throw th;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        byteArrayOutputStream = null;
                        gZIPOutputStream = null;
                    } catch (Throwable th3) {
                        th = th3;
                        byteArrayOutputStream = null;
                    }
                }
            } catch (Exception e5) {
                e5.toString();
                return null;
            }
        }
        return null;
    }

    public static native byte[] bc(int i, byte[] bArr);

    public static PglCryptUtils getInstance() {
        if (Lxb == null) {
            synchronized (PglCryptUtils.class) {
                try {
                    if (Lxb == null) {
                        try {
                            System.loadLibrary("pglarmor");
                        } catch (Throwable unused) {
                            LD = false;
                        }
                        Lxb = new PglCryptUtils();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Lxb;
    }

    public Pair<Integer, String> cypher4Decrypt(String str) throws Throwable {
        byte[] bArrBc;
        if (!LD) {
            return new Pair<>(501, null);
        }
        if (str == null || str.length() == 0) {
            return new Pair<>(502, null);
        }
        byte[] bArrDecode = Base64.decode(str, 0);
        if (bArrDecode == null || bArrDecode.length == 0) {
            return new Pair<>(504, null);
        }
        try {
            bArrBc = bc(1011, bArrDecode);
        } catch (Throwable th) {
            th.toString();
            bArrBc = null;
        }
        if (bArrBc == null || bArrBc.length == 0) {
            return new Pair<>(506, null);
        }
        String strLxb = Lxb(bArrBc);
        return TextUtils.isEmpty(strLxb) ? new Pair<>(503, null) : new Pair<>(0, strLxb);
    }

    public Pair<Integer, JSONObject> cypher4Encrypt(JSONObject jSONObject) throws Throwable {
        byte[] bArrBc;
        if (!LD) {
            return new Pair<>(501, null);
        }
        if (jSONObject == null) {
            return new Pair<>(502, null);
        }
        byte[] bArrLxb = Lxb(jSONObject.toString());
        if (bArrLxb == null || bArrLxb.length == 0) {
            return new Pair<>(503, null);
        }
        try {
            bArrBc = bc(1010, bArrLxb);
        } catch (Throwable th) {
            th.toString();
            bArrBc = null;
        }
        if (bArrBc == null || bArrBc.length == 0) {
            return new Pair<>(505, null);
        }
        String strEncodeToString = Base64.encodeToString(bArrBc, 0);
        JSONObject jSONObject2 = new JSONObject();
        if (TextUtils.isEmpty(strEncodeToString)) {
            return new Pair<>(504, null);
        }
        jSONObject2.put(KEY_MESSAGE, strEncodeToString);
        jSONObject2.put("cypher", 4);
        return new Pair<>(0, jSONObject2);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0062 A[Catch: Exception -> 0x005e, TRY_LEAVE, TryCatch #1 {Exception -> 0x005e, blocks: (B:33:0x005a, B:37:0x0062), top: B:54:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0075 A[Catch: Exception -> 0x0071, TRY_LEAVE, TryCatch #7 {Exception -> 0x0071, blocks: (B:43:0x006d, B:47:0x0075), top: B:61:0x006d }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.zip.GZIPInputStream] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r7v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Exception, java.lang.Object] */
    private static String Lxb(byte[] bArr) throws Throwable {
        ?? r2;
        Throwable th;
        ?? r7;
        ?? e;
        Exception exc;
        String str;
        String string = null;
        string = null;
        gZIPInputStream = null;
        GZIPInputStream gZIPInputStream = null;
        if (bArr != 0) {
            try {
                if (bArr.length != 0) {
                    try {
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            GZIPInputStream gZIPInputStream2 = new GZIPInputStream(byteArrayInputStream);
                            try {
                                byte[] bArr2 = new byte[1024];
                                while (true) {
                                    int i = gZIPInputStream2.read(bArr2);
                                    if (i == -1) {
                                        break;
                                    }
                                    byteArrayOutputStream.write(bArr2, 0, i);
                                }
                                string = byteArrayOutputStream.toString("utf-8");
                                byteArrayInputStream.close();
                                try {
                                    gZIPInputStream2.close();
                                    byteArrayOutputStream.close();
                                    bArr = byteArrayOutputStream;
                                } catch (Exception e2) {
                                    e2.toString();
                                    bArr = e2;
                                }
                            } catch (Exception e3) {
                                str = string;
                                gZIPInputStream = gZIPInputStream2;
                                exc = e3;
                                e = byteArrayOutputStream;
                                exc.toString();
                                if (gZIPInputStream != null) {
                                    try {
                                        gZIPInputStream.close();
                                        if (e != 0) {
                                            e.close();
                                        }
                                    } catch (Exception e4) {
                                        e = e4;
                                        e.toString();
                                        string = str;
                                        bArr = e;
                                        return string;
                                    }
                                } else if (e != 0) {
                                    e.close();
                                }
                                string = str;
                                bArr = e;
                            } catch (Throwable th2) {
                                th = th2;
                                r2 = gZIPInputStream2;
                                r7 = byteArrayOutputStream;
                                if (r2 != 0) {
                                    try {
                                        r2.close();
                                        if (r7 != 0) {
                                            r7.close();
                                        }
                                    } catch (Exception e5) {
                                        e5.toString();
                                        throw th;
                                    }
                                } else if (r7 != 0) {
                                    r7.close();
                                }
                                throw th;
                            }
                        } catch (Exception e6) {
                            exc = e6;
                            str = null;
                            e = byteArrayOutputStream;
                        }
                    } catch (Exception e7) {
                        e = 0;
                        exc = e7;
                        str = null;
                    } catch (Throwable th3) {
                        r2 = 0;
                        th = th3;
                        r7 = 0;
                    }
                    return string;
                }
            } catch (Throwable th4) {
                r2 = string;
                th = th4;
                r7 = bArr;
            }
        }
        return null;
    }

    public Pair<Integer, byte[]> cypher4Encrypt(byte[] bArr) {
        byte[] bArrBc;
        if (!LD) {
            return new Pair<>(501, null);
        }
        if (bArr != null && bArr.length != 0) {
            try {
                bArrBc = bc(1010, bArr);
            } catch (Throwable th) {
                th.toString();
                bArrBc = null;
            }
            if (bArrBc != null && bArrBc.length != 0) {
                return new Pair<>(0, bArrBc);
            }
            return new Pair<>(505, null);
        }
        return new Pair<>(502, null);
    }
}
