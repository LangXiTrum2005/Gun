package com.google.android.gms.internal.ads;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.io.UnsupportedEncodingException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class zzaqr extends zzapm {
    private final Object zza;

    @Nullable
    @GuardedBy("mLock")
    private final zzapr zzb;

    public zzaqr(int i, String str, zzapr zzaprVar, @Nullable zzapq zzapqVar) {
        super(i, str, zzapqVar);
        this.zza = new Object();
        this.zzb = zzaprVar;
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    public final zzaps zzh(zzapi zzapiVar) {
        String str;
        String str2;
        try {
            byte[] bArr = zzapiVar.zzb;
            Map map = zzapiVar.zzc;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
                String[] strArrSplit = str2.split(";", 0);
                for (int i = 1; i < strArrSplit.length; i++) {
                    String[] strArrSplit2 = strArrSplit[i].trim().split("=", 0);
                    if (strArrSplit2.length == 2 && strArrSplit2[0].equals("charset")) {
                        str3 = strArrSplit2[1];
                        break;
                    }
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(zzapiVar.zzb);
        }
        return zzaps.zzb(str, zzaqj.zzb(zzapiVar));
    }

    @Override // com.google.android.gms.internal.ads.zzapm
    /* JADX INFO: renamed from: zzz, reason: merged with bridge method [inline-methods] */
    public void zzo(String str) {
        zzapr zzaprVar;
        synchronized (this.zza) {
            zzaprVar = this.zzb;
        }
        zzaprVar.zza(str);
    }
}
