package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.newreward.function.common.MBridgeError;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class m0 extends u {

    public class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
                if (gVarD == null) {
                    gVarD = com.mbridge.msdk.setting.h.b().a();
                }
                m0.b(com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_RES_MANAGER_DIR), gVarD.N());
                m0.a(System.currentTimeMillis() - ((long) (gVarD.e() * 1000)));
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        }
    }

    public class b implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    m0.b(com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_VC));
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        }
    }

    public class c implements FileFilter {
        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return !file.isHidden() || file.isDirectory();
        }
    }

    public class d implements Comparator<File> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(File file, File file2) {
            long jLastModified = file.lastModified() - file2.lastModified();
            if (jLastModified > 0) {
                return 1;
            }
            return jLastModified == 0 ? 0 : -1;
        }

        @Override // java.util.Comparator
        public boolean equals(Object obj) {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str, int i) {
        try {
            if (d(new File(str)) > i * 1048576) {
                f(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable unused) {
            o0.b("SameFileTool", "clean memory failed");
        }
    }

    public static File[] c(String str) {
        try {
            File file = new File(str);
            if (file.exists()) {
                return file.listFiles();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static String d(String str) {
        return !TextUtils.isEmpty(str) ? SameMD5.getMD5(z0.b(str.trim())) : "";
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    public static String e(File file) throws Throwable {
        IOException e;
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            if (file == 0) {
                return null;
            }
            try {
                bufferedReader = new BufferedReader(new FileReader(file));
                try {
                    try {
                        file = new StringBuffer();
                        while (true) {
                            try {
                                String line = bufferedReader.readLine();
                                if (line == null) {
                                    break;
                                }
                                file.append(line + "\n");
                            } catch (IOException e2) {
                                e = e2;
                                try {
                                    e.printStackTrace();
                                    if (bufferedReader != null) {
                                        bufferedReader.close();
                                        file = file;
                                    }
                                    if (file != 0) {
                                        return file.toString();
                                    }
                                    return null;
                                } catch (Throwable th) {
                                    th = th;
                                    bufferedReader2 = bufferedReader;
                                    bufferedReader = bufferedReader2;
                                    if (bufferedReader != null) {
                                        try {
                                            bufferedReader.close();
                                        } catch (IOException unused) {
                                        }
                                    }
                                    throw th;
                                }
                            }
                        }
                        bufferedReader.close();
                        file = file;
                    } catch (Throwable th2) {
                        th = th2;
                        if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        throw th;
                    }
                } catch (IOException e3) {
                    e = e3;
                    file = 0;
                }
            } catch (IOException e4) {
                e = e4;
                file = 0;
                bufferedReader = null;
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = bufferedReader2;
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                throw th;
            }
        } catch (IOException unused2) {
        }
        if (file != 0) {
            return file.toString();
        }
        return null;
    }

    public static void f(String str) {
        try {
            ArrayList<File> arrayListB = b(new File(str));
            Collections.sort(arrayListB, new d());
            int size = (arrayListB.size() - 1) / 2;
            for (int i = 0; i < size; i++) {
                File file = arrayListB.get(i);
                if (file.exists() && file.isFile()) {
                    file.delete();
                }
            }
        } catch (Exception unused) {
            o0.b("SameFileTool", "del memory failed");
        }
    }

    public static void a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
            if (gVarD == null) {
                gVarD = com.mbridge.msdk.setting.h.b().a();
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - ((long) (gVarD.e() * 1000));
            File file = new File(str);
            if (file.exists() && file.isDirectory()) {
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null) {
                    for (File file2 : fileArrListFiles) {
                        if (file2.lastModified() + jCurrentTimeMillis < jCurrentTimeMillis2) {
                            a(file2);
                            try {
                                File file3 = new File(str + ".zip");
                                if (file3.exists() && file3.isFile()) {
                                    a(file3);
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            }
        } catch (Exception unused2) {
        }
    }

    private static long c(File file) throws Exception {
        FileInputStream fileInputStream;
        long jAvailable = 0;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                try {
                    if (file.exists()) {
                        fileInputStream = new FileInputStream(file);
                        try {
                            jAvailable = fileInputStream.available();
                            fileInputStream2 = fileInputStream;
                        } catch (Exception e) {
                            e = e;
                            fileInputStream2 = fileInputStream;
                            e.printStackTrace();
                            if (fileInputStream2 != null) {
                                fileInputStream2.close();
                            }
                            return jAvailable;
                        } catch (Throwable th) {
                            th = th;
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (Exception e2) {
                                    e2.printStackTrace();
                                }
                            }
                            throw th;
                        }
                    } else {
                        file.createNewFile();
                        o0.b("获取文件大小", "文件不存在!");
                    }
                    if (fileInputStream2 != null) {
                        fileInputStream2.close();
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            } catch (Exception e4) {
                e4.printStackTrace();
            }
            return jAvailable;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
    }

    private static long d(File file) throws Exception {
        long jC;
        File[] fileArrListFiles = file.listFiles();
        long j = 0;
        if (fileArrListFiles != null) {
            for (int i = 0; i < fileArrListFiles.length; i++) {
                if (fileArrListFiles[i].isDirectory()) {
                    jC = d(fileArrListFiles[i]);
                } else {
                    jC = c(fileArrListFiles[i]);
                }
                j += jC;
            }
        }
        return j;
    }

    public static void b() {
        new Thread(new b()).start();
    }

    public static void b(String str) {
        try {
            File file = new File(str);
            if (file.exists() && file.isDirectory()) {
                for (File file2 : c(str)) {
                    if (file2.exists() && file2.isFile()) {
                        file2.delete();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean e(String str) {
        if (com.mbridge.msdk.foundation.same.image.e.a(str)) {
            return false;
        }
        File file = new File(str);
        return file.exists() && file.isFile();
    }

    private static ArrayList<File> b(File file) {
        ArrayList<File> arrayList = new ArrayList<>();
        for (File file2 : file.listFiles(new c())) {
            if (!file2.isDirectory()) {
                arrayList.add(file2);
            } else {
                arrayList.addAll(b(file2));
            }
        }
        return arrayList;
    }

    public static void a() {
        a aVar = new a();
        if (com.mbridge.msdk.foundation.controller.d.a().e()) {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(aVar);
        } else {
            aVar.run();
        }
    }

    public static void a(long j) {
        try {
            for (File file : b(new File(com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_RES_MANAGER_DIR)))) {
                if (file.lastModified() < j && file.exists() && file.isFile()) {
                    file.delete();
                }
            }
        } catch (Throwable th) {
            o0.b("SameFileTool", th.getMessage(), th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0149 A[Catch: all -> 0x014d, TryCatch #6 {all -> 0x014d, blocks: (B:115:0x0145, B:117:0x0149, B:120:0x0152), top: B:157:0x0145 }] */
    /* JADX WARN: Code duplicated, block: B:155:0x0170 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x0162 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x017a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:175:0x0158 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:? A[SYNTHETIC] */
    public static String b(String str, String str2) throws Throwable {
        Throwable th;
        InputStream inputStream;
        IOException iOException;
        InputStream inputStream2;
        FileOutputStream fileOutputStream;
        IOException e;
        Throwable th2;
        if (str != null && str2 != null) {
            if (!str2.endsWith("/")) {
                str2 = str2.concat("/");
            }
            File file = new File(str);
            if (!file.exists()) {
                return "unzip file not exists";
            }
            FileOutputStream fileOutputStream2 = null;
            InputStream inputStream3 = null;
            FileOutputStream fileOutputStream3 = null;
            try {
                ZipFile zipFile = new ZipFile(file);
                Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                FileOutputStream fileOutputStream4 = null;
                while (true) {
                    try {
                        try {
                            String canonicalPath = "";
                            if (enumerationEntries.hasMoreElements()) {
                                ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                                if (zipEntryNextElement == null) {
                                    if (inputStream3 != null) {
                                        try {
                                            inputStream3.close();
                                        } catch (IOException e2) {
                                            o0.b("SameFileTool", MBridgeError.ERROR_MESSAGE_DOWNLOAD_UN_ZIP_ERROR, e2);
                                        }
                                    }
                                    if (fileOutputStream4 != null) {
                                        try {
                                            fileOutputStream4.close();
                                        } catch (IOException e3) {
                                            o0.b("SameFileTool", MBridgeError.ERROR_MESSAGE_DOWNLOAD_UN_ZIP_ERROR, e3);
                                        }
                                    }
                                    return "unzip zipEntry is null";
                                }
                                String name = zipEntryNextElement.getName();
                                if (!TextUtils.isEmpty(name) && !name.startsWith("..") && !name.startsWith("../")) {
                                    File file2 = new File(str2 + name);
                                    try {
                                        canonicalPath = file2.getCanonicalPath();
                                    } catch (IOException unused) {
                                    }
                                    if (!TextUtils.isEmpty(canonicalPath) && canonicalPath.startsWith(str2) && !canonicalPath.startsWith("..") && !canonicalPath.startsWith("../")) {
                                        if (zipEntryNextElement.isDirectory()) {
                                            file2.mkdirs();
                                        } else {
                                            if (file2.getParentFile() != null && !file2.getParentFile().exists()) {
                                                file2.getParentFile().mkdirs();
                                            }
                                            fileOutputStream = new FileOutputStream(file2);
                                            try {
                                                inputStream3 = zipFile.getInputStream(zipEntryNextElement);
                                                byte[] bArr = new byte[1024];
                                                while (true) {
                                                    int i = inputStream3.read(bArr, 0, 1024);
                                                    if (i == -1) {
                                                        break;
                                                    }
                                                    fileOutputStream.write(bArr, 0, i);
                                                    fileOutputStream.flush();
                                                }
                                                fileOutputStream4 = fileOutputStream;
                                            } catch (IOException e4) {
                                                e = e4;
                                                try {
                                                    if (MBridgeConstans.DEBUG) {
                                                        o0.b("SameFileTool", MBridgeError.ERROR_MESSAGE_DOWNLOAD_UN_ZIP_ERROR, e);
                                                    }
                                                    String message = e.getMessage();
                                                    if (inputStream3 != null) {
                                                        try {
                                                            inputStream3.close();
                                                        } catch (IOException e5) {
                                                            o0.b("SameFileTool", MBridgeError.ERROR_MESSAGE_DOWNLOAD_UN_ZIP_ERROR, e5);
                                                        }
                                                    }
                                                    if (fileOutputStream != null) {
                                                        try {
                                                            fileOutputStream.close();
                                                        } catch (IOException e6) {
                                                            o0.b("SameFileTool", MBridgeError.ERROR_MESSAGE_DOWNLOAD_UN_ZIP_ERROR, e6);
                                                        }
                                                    }
                                                    return message;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    inputStream = inputStream3;
                                                    fileOutputStream2 = fileOutputStream;
                                                    fileOutputStream = fileOutputStream2;
                                                    inputStream3 = inputStream;
                                                    th2 = th;
                                                    if (inputStream3 != null) {
                                                        try {
                                                            inputStream3.close();
                                                        } catch (IOException e7) {
                                                            o0.b("SameFileTool", MBridgeError.ERROR_MESSAGE_DOWNLOAD_UN_ZIP_ERROR, e7);
                                                        }
                                                    }
                                                    if (fileOutputStream != null) {
                                                        try {
                                                            fileOutputStream.close();
                                                            throw th2;
                                                        } catch (IOException e8) {
                                                            o0.b("SameFileTool", MBridgeError.ERROR_MESSAGE_DOWNLOAD_UN_ZIP_ERROR, e8);
                                                            throw th2;
                                                        }
                                                    }
                                                    throw th2;
                                                }
                                            } catch (Throwable th4) {
                                                th2 = th4;
                                            }
                                        }
                                    }
                                    if (inputStream3 != null) {
                                        try {
                                            inputStream3.close();
                                        } catch (IOException e9) {
                                            o0.b("SameFileTool", MBridgeError.ERROR_MESSAGE_DOWNLOAD_UN_ZIP_ERROR, e9);
                                        }
                                    }
                                    if (fileOutputStream4 != null) {
                                        try {
                                            fileOutputStream4.close();
                                        } catch (IOException e10) {
                                            o0.b("SameFileTool", MBridgeError.ERROR_MESSAGE_DOWNLOAD_UN_ZIP_ERROR, e10);
                                        }
                                    }
                                    return "unzip zipEntry canonicalPath is not available";
                                }
                                if (inputStream3 != null) {
                                    try {
                                        inputStream3.close();
                                    } catch (IOException e11) {
                                        o0.b("SameFileTool", MBridgeError.ERROR_MESSAGE_DOWNLOAD_UN_ZIP_ERROR, e11);
                                    }
                                }
                                if (fileOutputStream4 != null) {
                                    try {
                                        fileOutputStream4.close();
                                    } catch (IOException e12) {
                                        o0.b("SameFileTool", MBridgeError.ERROR_MESSAGE_DOWNLOAD_UN_ZIP_ERROR, e12);
                                    }
                                }
                                return "unzip zipEntry name is not available";
                            }
                            zipFile.close();
                            if (inputStream3 != null) {
                                try {
                                    inputStream3.close();
                                } catch (IOException e13) {
                                    o0.b("SameFileTool", MBridgeError.ERROR_MESSAGE_DOWNLOAD_UN_ZIP_ERROR, e13);
                                }
                            }
                            if (fileOutputStream4 != null) {
                                try {
                                    fileOutputStream4.close();
                                } catch (IOException e14) {
                                    o0.b("SameFileTool", MBridgeError.ERROR_MESSAGE_DOWNLOAD_UN_ZIP_ERROR, e14);
                                }
                            }
                            return "";
                        } catch (IOException e15) {
                            iOException = e15;
                            inputStream2 = inputStream3;
                            fileOutputStream3 = fileOutputStream4;
                            fileOutputStream = fileOutputStream3;
                            inputStream3 = inputStream2;
                            e = iOException;
                            if (MBridgeConstans.DEBUG) {
                                o0.b("SameFileTool", MBridgeError.ERROR_MESSAGE_DOWNLOAD_UN_ZIP_ERROR, e);
                            }
                            String message2 = e.getMessage();
                            if (inputStream3 != null) {
                                inputStream3.close();
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            return message2;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        inputStream = inputStream3;
                        fileOutputStream2 = fileOutputStream4;
                        fileOutputStream = fileOutputStream2;
                        inputStream3 = inputStream;
                        th2 = th;
                    }
                    if (inputStream3 != null) {
                        inputStream3.close();
                    }
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                        throw th2;
                    }
                    throw th2;
                }
            } catch (IOException e16) {
                iOException = e16;
                inputStream2 = null;
            } catch (Throwable th6) {
                th = th6;
                inputStream = null;
            }
        } else {
            return "unzip srcFile or destDir is null ";
        }
    }

    public static String a(File file) {
        try {
            if (file.isFile()) {
                file.delete();
                return "";
            }
            if (!file.isDirectory()) {
                return "";
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                for (File file2 : fileArrListFiles) {
                    a(file2);
                }
                file.delete();
                return "";
            }
            file.delete();
            return "";
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    public static List<String> a(String str, String str2) throws Throwable {
        ArrayList arrayList = new ArrayList();
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                File file = new File(str + File.separator + "template_config.json");
                if (file.isFile() && file.exists()) {
                    String strE = e(file);
                    if (TextUtils.isEmpty(strE)) {
                        return arrayList;
                    }
                    try {
                        JSONArray jSONArray = new JSONArray(strE);
                        for (int i = 0; i < jSONArray.length(); i++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            if (jSONObject != null && str2.equals(jSONObject.optString("xml_type"))) {
                                arrayList.add(str + File.separator + jSONObject.optString("name"));
                                if (jSONObject.has("ext_template")) {
                                    jSONObject.put("folder_dir", str);
                                    arrayList.add(jSONObject.toString());
                                } else {
                                    continue;
                                }
                            }
                        }
                    } catch (JSONException e) {
                        o0.b("SameFileTool", e.getMessage());
                        return arrayList;
                    }
                    return arrayList;
                }
                arrayList.add(str);
            }
            return arrayList;
        } catch (Exception e2) {
            o0.b("SameFileTool", e2.getMessage());
        }
    }

    public static boolean a(byte[] bArr, File file) throws Throwable {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                if (file.getParentFile() != null && !file.exists()) {
                    file.getParentFile().mkdirs();
                }
                fileOutputStream = new FileOutputStream(file);
                try {
                    fileOutputStream.write(bArr);
                    try {
                        fileOutputStream.close();
                        return true;
                    } catch (IOException e) {
                        e.printStackTrace();
                        return true;
                    }
                } catch (Exception e2) {
                    e = e2;
                    fileOutputStream2 = fileOutputStream;
                    e.printStackTrace();
                    if (fileOutputStream2 == null) {
                        return false;
                    }
                    try {
                        fileOutputStream2.close();
                        return false;
                    } catch (IOException e3) {
                        e3.printStackTrace();
                        return false;
                    }
                } catch (Throwable th) {
                    th = th;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Exception e5) {
                e = e5;
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
        }
    }
}
