package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import androidx.collection.SimpleArrayMap;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zzho {
    private static volatile zzii zza;

    private zzho() {
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0032 A[Catch: all -> 0x001e, TryCatch #6 {all -> 0x001e, blocks: (B:4:0x0005, B:6:0x0009, B:8:0x0015, B:18:0x0032, B:72:0x013a, B:13:0x0021, B:15:0x0029, B:20:0x0039, B:22:0x003f, B:24:0x0045, B:25:0x0049, B:71:0x0135, B:73:0x013d, B:74:0x0140, B:75:0x0141, B:26:0x004d, B:27:0x0050, B:28:0x005d, B:30:0x0063, B:35:0x0074, B:37:0x007a, B:38:0x007e, B:58:0x0106, B:59:0x0109, B:67:0x012a, B:66:0x0115, B:68:0x012b, B:69:0x0130, B:70:0x0131, B:33:0x006b, B:34:0x0070), top: B:90:0x0005, inners: #3 }] */
    public static zzii zza(Context context) {
        zzii zziiVar;
        zzii zziiVarZzc;
        zzii zziiVarZzc2;
        synchronized (zzho.class) {
            try {
                zziiVar = zza;
                if (zziiVar == null) {
                    String str = Build.TYPE;
                    String str2 = Build.TAGS;
                    if (!str.equals("eng") && !str.equals("userdebug")) {
                        zziiVarZzc2 = zzii.zzc();
                    } else if (str2.contains("dev-keys") || str2.contains("test-keys")) {
                        if (zzhb.zzb() && !context.isDeviceProtectedStorage()) {
                            context = context.createDeviceProtectedStorageContext();
                        }
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            StrictMode.allowThreadDiskWrites();
                            try {
                                File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
                                zziiVarZzc = file.exists() ? zzii.zzd(file) : zzii.zzc();
                            } catch (RuntimeException unused) {
                                zziiVarZzc = zzii.zzc();
                            }
                            if (zziiVarZzc.zzb()) {
                                Object objZza = zziiVarZzc.zza();
                                try {
                                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream((File) objZza)));
                                    try {
                                        SimpleArrayMap simpleArrayMap = new SimpleArrayMap();
                                        HashMap map = new HashMap();
                                        while (true) {
                                            String line = bufferedReader.readLine();
                                            if (line == null) {
                                                break;
                                            }
                                            String[] strArrSplit = line.split(" ", 3);
                                            if (strArrSplit.length == 3) {
                                                String str3 = new String(strArrSplit[0]);
                                                String strDecode = Uri.decode(new String(strArrSplit[1]));
                                                String strDecode2 = (String) map.get(strArrSplit[2]);
                                                if (strDecode2 == null) {
                                                    String str4 = new String(strArrSplit[2]);
                                                    strDecode2 = Uri.decode(str4);
                                                    if (strDecode2.length() < 1024 || strDecode2 == str4) {
                                                        map.put(str4, strDecode2);
                                                    }
                                                }
                                                if (!simpleArrayMap.containsKey(str3)) {
                                                    simpleArrayMap.put(str3, new SimpleArrayMap());
                                                }
                                                ((SimpleArrayMap) simpleArrayMap.get(str3)).put(strDecode, strDecode2);
                                            }
                                        }
                                        objZza.toString();
                                        context.getPackageName();
                                        zzhh zzhhVar = new zzhh(simpleArrayMap);
                                        bufferedReader.close();
                                        zziiVarZzc2 = zzii.zzd(zzhhVar);
                                    } catch (Throwable th) {
                                        try {
                                            bufferedReader.close();
                                        } catch (Throwable th2) {
                                            try {
                                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                            } catch (Exception unused2) {
                                            }
                                        }
                                        throw th;
                                    }
                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }
                            } else {
                                zziiVarZzc2 = zzii.zzc();
                            }
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        } catch (Throwable th3) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th3;
                        }
                    } else {
                        zziiVarZzc2 = zzii.zzc();
                    }
                    zziiVar = zziiVarZzc2;
                    zza = zziiVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return zziiVar;
    }
}
