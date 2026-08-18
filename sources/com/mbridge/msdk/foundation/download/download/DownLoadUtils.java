package com.mbridge.msdk.foundation.download.download;

import android.webkit.URLUtil;
import com.badlogic.gdx.graphics.GL30;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.net.MBridgeHostnameVerifier;
import com.mbridge.msdk.foundation.same.task.a;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.y0;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes2.dex */
public class DownLoadUtils {
    private static final int DOWNLOAD_CONNECTION_TIME_OUT = 20000;
    private static final int DOWNLOAD_READ_TIME_OUT = 30000;
    public static final String END_TAG = "<mbridgeloadend></mbridgeloadend>";
    private static final String TAG = "DownLoadUtils";

    public static void getSourceCodeFromNetUrl(final String str, final H5DownLoadManager.IOnDownLoadH5Source iOnDownLoadH5Source, final boolean z) {
        try {
            if (!y0.a(str) && URLUtil.isNetworkUrl(str)) {
                DownloadTask.getInstance().runTask(new a() { // from class: com.mbridge.msdk.foundation.download.download.DownLoadUtils.1
                    @Override // com.mbridge.msdk.foundation.same.task.a
                    public void cancelTask() {
                    }

                    @Override // com.mbridge.msdk.foundation.same.task.a
                    public void pauseTask(boolean z2) {
                    }

                    /* JADX WARN: Code duplicated, block: B:105:0x0178 A[DONT_INVERT] */
                    /* JADX WARN: Code duplicated, block: B:106:0x017a A[Catch: Exception -> 0x0176, TRY_LEAVE, TryCatch #3 {Exception -> 0x0176, blocks: (B:102:0x0172, B:106:0x017a), top: B:116:0x0172 }] */
                    /* JADX WARN: Code duplicated, block: B:116:0x0172 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:122:0x00f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:126:0x010b A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Code duplicated, block: B:62:0x00fb A[DONT_INVERT] */
                    /* JADX WARN: Code duplicated, block: B:63:0x00fd A[Catch: Exception -> 0x00f9, TRY_LEAVE, TryCatch #10 {Exception -> 0x00f9, blocks: (B:59:0x00f5, B:63:0x00fd), top: B:122:0x00f5 }] */
                    /* JADX WARN: Code duplicated, block: B:70:0x010f A[ADDED_TO_REGION] */
                    /* JADX WARN: Code duplicated, block: B:76:0x011e  */
                    /* JADX WARN: Code duplicated, block: B:77:0x0120 A[Catch: all -> 0x011c, TryCatch #13 {all -> 0x011c, blocks: (B:68:0x010b, B:71:0x0111, B:73:0x0114, B:77:0x0120, B:79:0x0126, B:81:0x012c, B:83:0x0134, B:85:0x0138, B:86:0x013e, B:88:0x0142), top: B:126:0x010b }] */
                    /* JADX WARN: Code duplicated, block: B:86:0x013e A[Catch: all -> 0x011c, TryCatch #13 {all -> 0x011c, blocks: (B:68:0x010b, B:71:0x0111, B:73:0x0114, B:77:0x0120, B:79:0x0126, B:81:0x012c, B:83:0x0134, B:85:0x0138, B:86:0x013e, B:88:0x0142), top: B:126:0x010b }] */
                    /* JADX WARN: Code duplicated, block: B:88:0x0142 A[Catch: all -> 0x011c, TRY_LEAVE, TryCatch #13 {all -> 0x011c, blocks: (B:68:0x010b, B:71:0x0111, B:73:0x0114, B:77:0x0120, B:79:0x0126, B:81:0x012c, B:83:0x0134, B:85:0x0138, B:86:0x013e, B:88:0x0142), top: B:126:0x010b }] */
                    /* JADX WARN: Instruction removed from duplicated block: B:88:0x0142, please report this as an issue */
                    @Override // com.mbridge.msdk.foundation.same.task.a
                    public void runTask() throws Throwable {
                        ByteArrayOutputStream byteArrayOutputStream;
                        InputStream inputStream;
                        byte[] bArr;
                        String str2;
                        InputStream inputStream2;
                        Exception e;
                        String message;
                        byte[] byteArray;
                        H5DownLoadManager.IOnDownLoadH5Source iOnDownLoadH5Source2;
                        boolean z2;
                        InputStream inputStream3 = null;
                        boolean z3 = false;
                        try {
                            H5DownLoadManager.IOnDownLoadH5Source iOnDownLoadH5Source3 = iOnDownLoadH5Source;
                            if (iOnDownLoadH5Source3 != null) {
                                iOnDownLoadH5Source3.onStart();
                            }
                            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(str).openConnection();
                            httpsURLConnection.setHostnameVerifier(new MBridgeHostnameVerifier(str));
                            httpsURLConnection.setReadTimeout(30000);
                            httpsURLConnection.setConnectTimeout(20000);
                            int responseCode = httpsURLConnection.getResponseCode();
                            o0.a(DownLoadUtils.TAG, "response code " + responseCode);
                            try {
                                try {
                                    if (responseCode == 200) {
                                        inputStream2 = httpsURLConnection.getInputStream();
                                        try {
                                            byte[] bArr2 = new byte[GL30.GL_COLOR];
                                            byteArrayOutputStream = new ByteArrayOutputStream();
                                            while (true) {
                                                try {
                                                    try {
                                                        int i = inputStream2.read(bArr2);
                                                        if (i == -1) {
                                                            break;
                                                        } else {
                                                            byteArrayOutputStream.write(bArr2, 0, i);
                                                        }
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        if (inputStream2 != null) {
                                                            try {
                                                                inputStream2.close();
                                                                if (byteArrayOutputStream != null) {
                                                                    byteArrayOutputStream.close();
                                                                }
                                                            } catch (Exception e2) {
                                                                e2.printStackTrace();
                                                                e2.getMessage();
                                                                throw th;
                                                            }
                                                        } else if (byteArrayOutputStream != null) {
                                                            byteArrayOutputStream.close();
                                                        }
                                                        throw th;
                                                    }
                                                } catch (Exception e3) {
                                                    e = e3;
                                                    bArr = null;
                                                }
                                                str2 = null;
                                                message = e.getMessage();
                                                o0.b(DownLoadUtils.TAG, "getStringFromUrl failed " + e.getLocalizedMessage());
                                                if (inputStream2 != null) {
                                                    try {
                                                        inputStream2.close();
                                                        if (byteArrayOutputStream != null) {
                                                            byteArrayOutputStream.close();
                                                        }
                                                    } catch (Exception e4) {
                                                        e4.printStackTrace();
                                                        message = e4.getMessage();
                                                    }
                                                } else if (byteArrayOutputStream != null) {
                                                    byteArrayOutputStream.close();
                                                }
                                                byteArray = bArr;
                                                if (z3) {
                                                    try {
                                                        if (!z && byteArray != null && byteArray.length > 0) {
                                                            iOnDownLoadH5Source.onSuccess(null, byteArray, str);
                                                        } else if (z3 || !y0.b(str2) || str2.length() <= 0 || !str2.contains(DownLoadUtils.END_TAG)) {
                                                            iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                                                            if (iOnDownLoadH5Source2 != null) {
                                                                iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                                                            }
                                                        } else {
                                                            H5DownLoadManager.IOnDownLoadH5Source iOnDownLoadH5Source4 = iOnDownLoadH5Source;
                                                            if (iOnDownLoadH5Source4 != null) {
                                                                iOnDownLoadH5Source4.onSuccess(str2, byteArray, str);
                                                            }
                                                        }
                                                    } catch (Throwable th2) {
                                                        if (MBridgeConstans.DEBUG) {
                                                            th2.printStackTrace();
                                                        }
                                                        H5DownLoadManager.IOnDownLoadH5Source iOnDownLoadH5Source5 = iOnDownLoadH5Source;
                                                        if (iOnDownLoadH5Source5 != null) {
                                                            try {
                                                                iOnDownLoadH5Source5.onFailed(th2.getMessage());
                                                                return;
                                                            } catch (Exception e5) {
                                                                e5.printStackTrace();
                                                                return;
                                                            }
                                                        }
                                                        return;
                                                    }
                                                } else if (z3) {
                                                    iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                                                    if (iOnDownLoadH5Source2 != null) {
                                                        iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                                                    }
                                                } else {
                                                    iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                                                    if (iOnDownLoadH5Source2 != null) {
                                                        iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                                                    }
                                                }
                                            }
                                            if (byteArrayOutputStream.toByteArray() != null) {
                                                byteArray = byteArrayOutputStream.toByteArray();
                                                try {
                                                    str2 = !z ? new String(byteArray) : null;
                                                } catch (Exception e6) {
                                                    bArr = byteArray;
                                                    e = e6;
                                                    str2 = null;
                                                    message = e.getMessage();
                                                    o0.b(DownLoadUtils.TAG, "getStringFromUrl failed " + e.getLocalizedMessage());
                                                    if (inputStream2 != null) {
                                                        inputStream2.close();
                                                        if (byteArrayOutputStream != null) {
                                                            byteArrayOutputStream.close();
                                                        }
                                                    } else if (byteArrayOutputStream != null) {
                                                        byteArrayOutputStream.close();
                                                    }
                                                    byteArray = bArr;
                                                }
                                            } else {
                                                byteArray = null;
                                                str2 = null;
                                            }
                                            message = "";
                                            z2 = true;
                                        } catch (Exception e7) {
                                            bArr = null;
                                            byteArrayOutputStream = null;
                                            str2 = null;
                                            inputStream = inputStream2;
                                            e = e7;
                                            InputStream inputStream4 = inputStream;
                                            e = e;
                                            inputStream2 = inputStream4;
                                            message = e.getMessage();
                                            o0.b(DownLoadUtils.TAG, "getStringFromUrl failed " + e.getLocalizedMessage());
                                            if (inputStream2 != null) {
                                                inputStream2.close();
                                                if (byteArrayOutputStream != null) {
                                                    byteArrayOutputStream.close();
                                                }
                                            } else if (byteArrayOutputStream != null) {
                                                byteArrayOutputStream.close();
                                            }
                                            byteArray = bArr;
                                            if (z3) {
                                                if (!z) {
                                                    if (z3) {
                                                        iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                                                        if (iOnDownLoadH5Source2 != null) {
                                                            iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                                                        }
                                                    } else {
                                                        iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                                                        if (iOnDownLoadH5Source2 != null) {
                                                            iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                                                        }
                                                    }
                                                } else if (z3) {
                                                    iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                                                    if (iOnDownLoadH5Source2 != null) {
                                                        iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                                                    }
                                                } else {
                                                    iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                                                    if (iOnDownLoadH5Source2 != null) {
                                                        iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                                                    }
                                                }
                                            } else if (z3) {
                                                iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                                                if (iOnDownLoadH5Source2 != null) {
                                                    iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                                                }
                                            } else {
                                                iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                                                if (iOnDownLoadH5Source2 != null) {
                                                    iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            byteArrayOutputStream = null;
                                            inputStream3 = inputStream2;
                                            inputStream2 = inputStream3;
                                            if (inputStream2 != null) {
                                                inputStream2.close();
                                                if (byteArrayOutputStream != null) {
                                                    byteArrayOutputStream.close();
                                                }
                                            } else if (byteArrayOutputStream != null) {
                                                byteArrayOutputStream.close();
                                            }
                                            throw th;
                                        }
                                    } else {
                                        message = "responseCode is " + responseCode;
                                        inputStream2 = null;
                                        byteArray = null;
                                        byteArrayOutputStream = null;
                                        str2 = null;
                                        z2 = false;
                                    }
                                    httpsURLConnection.disconnect();
                                    if (inputStream2 != null) {
                                        try {
                                            inputStream2.close();
                                        } catch (Exception e8) {
                                            e8.printStackTrace();
                                            message = e8.getMessage();
                                        }
                                    }
                                    if (byteArrayOutputStream != null) {
                                        byteArrayOutputStream.close();
                                    }
                                    z3 = z2;
                                } catch (Throwable th4) {
                                    th = th4;
                                    inputStream3 = inputStream2;
                                    inputStream2 = inputStream3;
                                    if (inputStream2 != null) {
                                        inputStream2.close();
                                        if (byteArrayOutputStream != null) {
                                            byteArrayOutputStream.close();
                                        }
                                    } else if (byteArrayOutputStream != null) {
                                        byteArrayOutputStream.close();
                                    }
                                    throw th;
                                }
                            } catch (Exception e9) {
                                byte[] bArr3 = byteArray;
                                inputStream = inputStream2;
                                e = e9;
                                bArr = bArr3;
                                InputStream inputStream5 = inputStream;
                                e = e;
                                inputStream2 = inputStream5;
                                message = e.getMessage();
                                o0.b(DownLoadUtils.TAG, "getStringFromUrl failed " + e.getLocalizedMessage());
                                if (inputStream2 != null) {
                                    inputStream2.close();
                                    if (byteArrayOutputStream != null) {
                                        byteArrayOutputStream.close();
                                    }
                                } else if (byteArrayOutputStream != null) {
                                    byteArrayOutputStream.close();
                                }
                                byteArray = bArr;
                            }
                        } catch (Exception e10) {
                            e = e10;
                            inputStream = null;
                            bArr = null;
                            byteArrayOutputStream = null;
                            str2 = null;
                        } catch (Throwable th5) {
                            th = th5;
                            byteArrayOutputStream = null;
                            inputStream2 = inputStream3;
                            if (inputStream2 != null) {
                                inputStream2.close();
                                if (byteArrayOutputStream != null) {
                                    byteArrayOutputStream.close();
                                }
                            } else if (byteArrayOutputStream != null) {
                                byteArrayOutputStream.close();
                            }
                            throw th;
                        }
                        if (z3) {
                            if (!z) {
                                if (z3) {
                                    iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                                    if (iOnDownLoadH5Source2 != null) {
                                        iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                                    }
                                } else {
                                    iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                                    if (iOnDownLoadH5Source2 != null) {
                                        iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                                    }
                                }
                            } else if (z3) {
                                iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                                if (iOnDownLoadH5Source2 != null) {
                                    iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                                }
                            } else {
                                iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                                if (iOnDownLoadH5Source2 != null) {
                                    iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                                }
                            }
                        } else if (z3) {
                            iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                            if (iOnDownLoadH5Source2 != null) {
                                iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                            }
                        } else {
                            iOnDownLoadH5Source2 = iOnDownLoadH5Source;
                            if (iOnDownLoadH5Source2 != null) {
                                iOnDownLoadH5Source2.onFailed("content write failed:" + message);
                            }
                        }
                    }
                });
                return;
            }
            if (iOnDownLoadH5Source != null) {
                iOnDownLoadH5Source.onFailed("url is error");
            }
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                th.printStackTrace();
            }
        }
    }
}
