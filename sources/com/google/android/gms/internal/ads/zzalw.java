package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class zzalw implements zzakf {
    private final zzdy zza = new zzdy();
    private final zzalm zzb = new zzalm();

    @Override // com.google.android.gms.internal.ads.zzakf
    public final void zza(byte[] bArr, int i, int i2, zzake zzakeVar, zzdb zzdbVar) {
        this.zza.zzJ(bArr, i2 + i);
        this.zza.zzL(i);
        ArrayList arrayList = new ArrayList();
        try {
            zzdy zzdyVar = this.zza;
            int iZzd = zzdyVar.zzd();
            Charset charset = StandardCharsets.UTF_8;
            String strZzz = zzdyVar.zzz(charset);
            if (strZzz == null || !strZzz.startsWith("WEBVTT")) {
                zzdyVar.zzL(iZzd);
                throw zzbc.zza("Expected WEBVTT. Got ".concat(String.valueOf(zzdyVar.zzz(charset))), null);
            }
            while (!TextUtils.isEmpty(this.zza.zzz(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                zzdy zzdyVar2 = this.zza;
                byte b = -1;
                int iZzd2 = 0;
                while (b == -1) {
                    iZzd2 = zzdyVar2.zzd();
                    String strZzz2 = zzdyVar2.zzz(StandardCharsets.UTF_8);
                    if (strZzz2 == null) {
                        b = 0;
                    } else if ("STYLE".equals(strZzz2)) {
                        b = 2;
                    } else {
                        b = strZzz2.startsWith("NOTE") ? (byte) 1 : (byte) 3;
                    }
                }
                zzdyVar2.zzL(iZzd2);
                if (b == 0) {
                    zzajz.zza(new zzalz(arrayList2), zzakeVar, zzdbVar);
                    return;
                }
                if (b == 1) {
                    while (!TextUtils.isEmpty(this.zza.zzz(StandardCharsets.UTF_8))) {
                    }
                } else if (b != 2) {
                    zzalo zzaloVarZzc = zzalv.zzc(this.zza, arrayList);
                    if (zzaloVarZzc != null) {
                        arrayList2.add(zzaloVarZzc);
                    }
                } else {
                    if (!arrayList2.isEmpty()) {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                    this.zza.zzz(StandardCharsets.UTF_8);
                    arrayList.addAll(this.zzb.zzb(this.zza));
                }
            }
        } catch (zzbc e) {
            throw new IllegalArgumentException(e);
        }
    }
}
