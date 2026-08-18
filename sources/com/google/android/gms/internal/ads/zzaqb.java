package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.badlogic.gdx.net.HttpRequestHeader;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes3.dex */
public class zzaqb implements zzapf {
    protected final zzaqd zza;
    private final zzaqa zzb;

    public zzaqb(zzaqa zzaqaVar) {
        zzaqd zzaqdVar = new zzaqd(4096);
        this.zzb = zzaqaVar;
        this.zza = zzaqdVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:102:0x01e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:105:0x0206  */
    /* JADX WARN: Code duplicated, block: B:120:0x0248  */
    /* JADX WARN: Code duplicated, block: B:147:0x02ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:0x02a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x01d2  */
    @Override // com.google.android.gms.internal.ads.zzapf
    public zzapi zza(zzapm zzapmVar) throws Throwable {
        zzaqk zzaqkVarZza;
        byte[] bArr;
        int iZzb;
        zzaqo zzaqoVar;
        zzaqo zzaqoVar2;
        zzapi zzapiVar;
        int iZzb2;
        Map mapEmptyMap;
        byte[] bArr2;
        byte[] bArrZzb;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            Collections.emptyList();
            try {
                zzaov zzaovVarZzd = zzapmVar.zzd();
                if (zzaovVarZzd == null) {
                    mapEmptyMap = Collections.emptyMap();
                } else {
                    HashMap map = new HashMap();
                    String str = zzaovVarZzd.zzb;
                    if (str != null) {
                        map.put(HttpRequestHeader.IfNoneMatch, str);
                    }
                    long j = zzaovVarZzd.zzd;
                    if (j > 0) {
                        map.put(HttpRequestHeader.IfModifiedSince, zzaqj.zzc(j));
                    }
                    mapEmptyMap = map;
                }
                zzaqkVarZza = this.zzb.zza(zzapmVar, mapEmptyMap);
                try {
                    int iZzb3 = zzaqkVarZza.zzb();
                    List listZzd = zzaqkVarZza.zzd();
                    if (iZzb3 == 304) {
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                        zzaov zzaovVarZzd2 = zzapmVar.zzd();
                        if (zzaovVarZzd2 == null) {
                            return new zzapi(304, (byte[]) null, true, jElapsedRealtime2, listZzd);
                        }
                        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                        if (!listZzd.isEmpty()) {
                            Iterator it = listZzd.iterator();
                            while (it.hasNext()) {
                                treeSet.add(((zzape) it.next()).zza());
                            }
                        }
                        ArrayList arrayList = new ArrayList(listZzd);
                        List list = zzaovVarZzd2.zzh;
                        if (list != null) {
                            if (!list.isEmpty()) {
                                for (zzape zzapeVar : zzaovVarZzd2.zzh) {
                                    if (!treeSet.contains(zzapeVar.zza())) {
                                        arrayList.add(zzapeVar);
                                    }
                                }
                            }
                        } else if (!zzaovVarZzd2.zzg.isEmpty()) {
                            for (Map.Entry entry : zzaovVarZzd2.zzg.entrySet()) {
                                if (!treeSet.contains(entry.getKey())) {
                                    arrayList.add(new zzape((String) entry.getKey(), (String) entry.getValue()));
                                }
                            }
                        }
                        return new zzapi(304, zzaovVarZzd2.zza, true, jElapsedRealtime2, (List) arrayList);
                    }
                    InputStream inputStreamZzc = zzaqkVarZza.zzc();
                    if (inputStreamZzc != null) {
                        int iZza = zzaqkVarZza.zza();
                        zzaqd zzaqdVar = this.zza;
                        zzaqq zzaqqVar = new zzaqq(zzaqdVar, iZza);
                        try {
                            bArrZzb = zzaqdVar.zzb(1024);
                            while (true) {
                                try {
                                    int i = inputStreamZzc.read(bArrZzb);
                                    if (i == -1) {
                                        break;
                                    }
                                    zzaqqVar.write(bArrZzb, 0, i);
                                } catch (Throwable th) {
                                    th = th;
                                    try {
                                        inputStreamZzc.close();
                                    } catch (IOException unused) {
                                        zzapy.zzd("Error occurred when closing InputStream", new Object[0]);
                                    }
                                    zzaqdVar.zza(bArrZzb);
                                    zzaqqVar.close();
                                    throw th;
                                }
                            }
                            byte[] byteArray = zzaqqVar.toByteArray();
                            try {
                                inputStreamZzc.close();
                            } catch (IOException unused2) {
                                zzapy.zzd("Error occurred when closing InputStream", new Object[0]);
                            }
                            zzaqdVar.zza(bArrZzb);
                            zzaqqVar.close();
                            bArr2 = byteArray;
                        } catch (Throwable th2) {
                            th = th2;
                            bArrZzb = null;
                        }
                    } else {
                        bArr2 = new byte[0];
                    }
                    try {
                        long jElapsedRealtime3 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                        if (zzapy.zzb || jElapsedRealtime3 > 3000) {
                            Object[] objArr = new Object[5];
                            objArr[0] = zzapmVar;
                            objArr[1] = Long.valueOf(jElapsedRealtime3);
                            objArr[2] = bArr2 != null ? Integer.valueOf(bArr2.length) : "null";
                            objArr[3] = Integer.valueOf(iZzb3);
                            objArr[4] = Integer.valueOf(zzapmVar.zzy().zza());
                            zzapy.zza("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", objArr);
                        }
                        if (iZzb3 < 200 || iZzb3 > 299) {
                            throw new IOException();
                        }
                        return new zzapi(iZzb3, bArr2, false, SystemClock.elapsedRealtime() - jElapsedRealtime, listZzd);
                    } catch (IOException e) {
                        e = e;
                        bArr = bArr2;
                        if (e instanceof SocketTimeoutException) {
                            zzaqoVar2 = new zzaqo("socket", new zzapu(), null);
                        } else {
                            if (!(e instanceof MalformedURLException)) {
                                throw new RuntimeException("Bad URL ".concat(String.valueOf(zzapmVar.zzk())), e);
                            }
                            if (zzaqkVarZza != null) {
                                throw new zzapj(e);
                            }
                            iZzb = zzaqkVarZza.zzb();
                            zzapy.zzb("Unexpected response code %d for %s", Integer.valueOf(iZzb), zzapmVar.zzk());
                            if (bArr != null) {
                                zzapiVar = new zzapi(iZzb, bArr, false, SystemClock.elapsedRealtime() - jElapsedRealtime, zzaqkVarZza.zzd());
                                if (iZzb == 401 && iZzb != 403) {
                                    if (iZzb < 400 || iZzb > 499) {
                                        throw new zzapt(zzapiVar);
                                    }
                                    throw new zzaoz(zzapiVar);
                                }
                                zzaqoVar = new zzaqo("auth", new zzaou(zzapiVar), null);
                            } else {
                                zzaqoVar = new zzaqo("network", new zzaph(), null);
                            }
                            zzaqoVar2 = zzaqoVar;
                        }
                        zzapa zzapaVarZzy = zzapmVar.zzy();
                        iZzb2 = zzapmVar.zzb();
                        try {
                            zzapaVarZzy.zzc(zzaqoVar2.zzb);
                            zzapmVar.zzm(zzaqoVar2.zza + "-retry [timeout=" + iZzb2 + "]");
                        } catch (zzapv e2) {
                            zzapmVar.zzm(zzaqoVar2.zza + "-timeout-giveup [timeout=" + iZzb2 + "]");
                            throw e2;
                        }
                    }
                } catch (IOException e3) {
                    e = e3;
                    bArr = null;
                    if (e instanceof SocketTimeoutException) {
                        zzaqoVar2 = new zzaqo("socket", new zzapu(), null);
                    } else {
                        if (!(e instanceof MalformedURLException)) {
                            throw new RuntimeException("Bad URL ".concat(String.valueOf(zzapmVar.zzk())), e);
                        }
                        if (zzaqkVarZza != null) {
                            throw new zzapj(e);
                        }
                        iZzb = zzaqkVarZza.zzb();
                        zzapy.zzb("Unexpected response code %d for %s", Integer.valueOf(iZzb), zzapmVar.zzk());
                        if (bArr != null) {
                            zzapiVar = new zzapi(iZzb, bArr, false, SystemClock.elapsedRealtime() - jElapsedRealtime, zzaqkVarZza.zzd());
                            if (iZzb == 401) {
                            }
                            zzaqoVar = new zzaqo("auth", new zzaou(zzapiVar), null);
                        } else {
                            zzaqoVar = new zzaqo("network", new zzaph(), null);
                        }
                        zzaqoVar2 = zzaqoVar;
                    }
                    zzapa zzapaVarZzy2 = zzapmVar.zzy();
                    iZzb2 = zzapmVar.zzb();
                    zzapaVarZzy2.zzc(zzaqoVar2.zzb);
                    zzapmVar.zzm(zzaqoVar2.zza + "-retry [timeout=" + iZzb2 + "]");
                }
            } catch (IOException e4) {
                e = e4;
                zzaqkVarZza = null;
            }
            zzapmVar.zzm(zzaqoVar2.zza + "-retry [timeout=" + iZzb2 + "]");
        }
    }
}
