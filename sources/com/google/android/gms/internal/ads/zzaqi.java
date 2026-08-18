package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaqi implements zzaow {
    private final zzaqh zzc;
    private final Map zza = new LinkedHashMap(16, 0.75f, true);
    private long zzb = 0;
    private final int zzd = 5242880;

    public zzaqi(zzaqh zzaqhVar, int i) {
        this.zzc = zzaqhVar;
    }

    public static int zze(InputStream inputStream) throws IOException {
        return (zzn(inputStream) << 24) | zzn(inputStream) | (zzn(inputStream) << 8) | (zzn(inputStream) << 16);
    }

    public static long zzf(InputStream inputStream) throws IOException {
        return (((long) zzn(inputStream)) & 255) | ((((long) zzn(inputStream)) & 255) << 8) | ((((long) zzn(inputStream)) & 255) << 16) | ((((long) zzn(inputStream)) & 255) << 24) | ((((long) zzn(inputStream)) & 255) << 32) | ((((long) zzn(inputStream)) & 255) << 40) | ((((long) zzn(inputStream)) & 255) << 48) | ((((long) zzn(inputStream)) & 255) << 56);
    }

    public static String zzh(zzaqg zzaqgVar) throws IOException {
        return new String(zzm(zzaqgVar, zzf(zzaqgVar)), C.UTF8_NAME);
    }

    public static void zzj(OutputStream outputStream, int i) throws IOException {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    public static void zzk(OutputStream outputStream, long j) throws IOException {
        outputStream.write((byte) j);
        outputStream.write((byte) (j >>> 8));
        outputStream.write((byte) (j >>> 16));
        outputStream.write((byte) (j >>> 24));
        outputStream.write((byte) (j >>> 32));
        outputStream.write((byte) (j >>> 40));
        outputStream.write((byte) (j >>> 48));
        outputStream.write((byte) (j >>> 56));
    }

    public static void zzl(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes(C.UTF8_NAME);
        int length = bytes.length;
        zzk(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    @VisibleForTesting
    public static byte[] zzm(zzaqg zzaqgVar, long j) throws IOException {
        long jZza = zzaqgVar.zza();
        if (j >= 0 && j <= jZza) {
            int i = (int) j;
            if (i == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(zzaqgVar).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sbP = DM.p("streamToBytes length=", j, ", maxLength=");
        sbP.append(jZza);
        throw new IOException(sbP.toString());
    }

    private static int zzn(InputStream inputStream) throws IOException {
        int i = inputStream.read();
        if (i != -1) {
            return i;
        }
        throw new EOFException();
    }

    private final void zzo(String str, zzaqf zzaqfVar) {
        if (this.zza.containsKey(str)) {
            this.zzb = (zzaqfVar.zza - ((zzaqf) this.zza.get(str)).zza) + this.zzb;
        } else {
            this.zzb += zzaqfVar.zza;
        }
        this.zza.put(str, zzaqfVar);
    }

    private final void zzp(String str) {
        zzaqf zzaqfVar = (zzaqf) this.zza.remove(str);
        if (zzaqfVar != null) {
            this.zzb -= zzaqfVar.zza;
        }
    }

    private static final String zzq(String str) {
        int length = str.length() / 2;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    @Override // com.google.android.gms.internal.ads.zzaow
    public final synchronized zzaov zza(String str) {
        zzaqf zzaqfVar = (zzaqf) this.zza.get(str);
        if (zzaqfVar == null) {
            return null;
        }
        File fileZzg = zzg(str);
        try {
            zzaqg zzaqgVar = new zzaqg(new BufferedInputStream(new FileInputStream(fileZzg)), fileZzg.length());
            try {
                zzaqf zzaqfVarZza = zzaqf.zza(zzaqgVar);
                if (!TextUtils.equals(str, zzaqfVarZza.zzb)) {
                    zzapy.zza("%s: key=%s, found=%s", fileZzg.getAbsolutePath(), str, zzaqfVarZza.zzb);
                    zzp(str);
                    zzaqgVar.close();
                    return null;
                }
                byte[] bArrZzm = zzm(zzaqgVar, zzaqgVar.zza());
                zzaov zzaovVar = new zzaov();
                zzaovVar.zza = bArrZzm;
                zzaovVar.zzb = zzaqfVar.zzc;
                zzaovVar.zzc = zzaqfVar.zzd;
                zzaovVar.zzd = zzaqfVar.zze;
                zzaovVar.zze = zzaqfVar.zzf;
                zzaovVar.zzf = zzaqfVar.zzg;
                List<zzape> list = zzaqfVar.zzh;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (zzape zzapeVar : list) {
                    treeMap.put(zzapeVar.zza(), zzapeVar.zzb());
                }
                zzaovVar.zzg = treeMap;
                zzaovVar.zzh = Collections.unmodifiableList(zzaqfVar.zzh);
                zzaqgVar.close();
                return zzaovVar;
            } catch (Throwable th) {
                zzaqgVar.close();
                throw th;
            }
        } catch (IOException e) {
            zzapy.zza("%s: %s", fileZzg.getAbsolutePath(), e.toString());
            zzi(str);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaow
    public final synchronized void zzb() {
        File fileZza = this.zzc.zza();
        if (fileZza.exists()) {
            File[] fileArrListFiles = fileZza.listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    try {
                        long length = file.length();
                        zzaqg zzaqgVar = new zzaqg(new BufferedInputStream(new FileInputStream(file)), length);
                        try {
                            zzaqf zzaqfVarZza = zzaqf.zza(zzaqgVar);
                            zzaqfVarZza.zza = length;
                            zzo(zzaqfVarZza.zzb, zzaqfVarZza);
                            zzaqgVar.close();
                        } catch (Throwable th) {
                            zzaqgVar.close();
                            throw th;
                        }
                    } catch (IOException unused) {
                        file.delete();
                    }
                }
            }
        } else if (!fileZza.mkdirs()) {
            zzapy.zzb("Unable to create cache dir %s", fileZza.getAbsolutePath());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaow
    public final synchronized void zzc(String str, boolean z) {
        zzaov zzaovVarZza = zza(str);
        if (zzaovVarZza != null) {
            zzaovVarZza.zzf = 0L;
            zzaovVarZza.zze = 0L;
            zzd(str, zzaovVarZza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaow
    public final synchronized void zzd(String str, zzaov zzaovVar) {
        try {
            long j = this.zzb;
            int length = zzaovVar.zza.length;
            long j2 = j + ((long) length);
            int i = this.zzd;
            if (j2 <= i || length <= i * 0.9f) {
                File fileZzg = zzg(str);
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileZzg));
                    zzaqf zzaqfVar = new zzaqf(str, zzaovVar);
                    try {
                        zzj(bufferedOutputStream, 538247942);
                        zzl(bufferedOutputStream, zzaqfVar.zzb);
                        String str2 = zzaqfVar.zzc;
                        if (str2 == null) {
                            str2 = "";
                        }
                        zzl(bufferedOutputStream, str2);
                        zzk(bufferedOutputStream, zzaqfVar.zzd);
                        zzk(bufferedOutputStream, zzaqfVar.zze);
                        zzk(bufferedOutputStream, zzaqfVar.zzf);
                        zzk(bufferedOutputStream, zzaqfVar.zzg);
                        List<zzape> list = zzaqfVar.zzh;
                        if (list != null) {
                            zzj(bufferedOutputStream, list.size());
                            for (zzape zzapeVar : list) {
                                zzl(bufferedOutputStream, zzapeVar.zza());
                                zzl(bufferedOutputStream, zzapeVar.zzb());
                            }
                        } else {
                            zzj(bufferedOutputStream, 0);
                        }
                        bufferedOutputStream.flush();
                        bufferedOutputStream.write(zzaovVar.zza);
                        bufferedOutputStream.close();
                        zzaqfVar.zza = fileZzg.length();
                        zzo(str, zzaqfVar);
                        if (this.zzb >= this.zzd) {
                            if (zzapy.zzb) {
                                zzapy.zzd("Pruning old cache entries.", new Object[0]);
                            }
                            long j3 = this.zzb;
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            Iterator it = this.zza.entrySet().iterator();
                            int i2 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    jElapsedRealtime = jElapsedRealtime;
                                    break;
                                }
                                zzaqf zzaqfVar2 = (zzaqf) ((Map.Entry) it.next()).getValue();
                                if (zzg(zzaqfVar2.zzb).delete()) {
                                    this.zzb -= zzaqfVar2.zza;
                                } else {
                                    String str3 = zzaqfVar2.zzb;
                                    zzapy.zza("Could not delete cache entry for key=%s, filename=%s", str3, zzq(str3));
                                }
                                it.remove();
                                i2++;
                                if (this.zzb < this.zzd * 0.9f) {
                                    break;
                                } else {
                                    jElapsedRealtime = jElapsedRealtime;
                                }
                            }
                            if (zzapy.zzb) {
                                zzapy.zzd("pruned %d files, %d bytes, %d ms", Integer.valueOf(i2), Long.valueOf(this.zzb - j3), Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
                            }
                        }
                    } catch (IOException e) {
                        zzapy.zza("%s", e.toString());
                        bufferedOutputStream.close();
                        zzapy.zza("Failed to write header for %s", fileZzg.getAbsolutePath());
                        throw new IOException();
                    }
                } catch (IOException unused) {
                    if (!fileZzg.delete()) {
                        zzapy.zza("Could not clean up file %s", fileZzg.getAbsolutePath());
                    }
                    if (!this.zzc.zza().exists()) {
                        zzapy.zza("Re-initializing cache after external clearing.", new Object[0]);
                        this.zza.clear();
                        this.zzb = 0L;
                        zzb();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final File zzg(String str) {
        return new File(this.zzc.zza(), zzq(str));
    }

    public final synchronized void zzi(String str) {
        boolean zDelete = zzg(str).delete();
        zzp(str);
        if (zDelete) {
            return;
        }
        zzapy.zza("Could not delete cache entry for key=%s, filename=%s", str, zzq(str));
    }

    public zzaqi(File file, int i) {
        this.zzc = new zzaqe(this, file);
    }
}
