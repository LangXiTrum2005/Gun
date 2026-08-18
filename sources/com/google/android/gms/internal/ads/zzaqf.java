package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@VisibleForTesting
final class zzaqf {
    long zza;
    final String zzb;
    final String zzc;
    final long zzd;
    final long zze;
    final long zzf;
    final long zzg;
    final List zzh;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.List] */
    public zzaqf(String str, zzaov zzaovVar) {
        String str2 = zzaovVar.zzb;
        long j = zzaovVar.zzc;
        long j2 = zzaovVar.zzd;
        long j3 = zzaovVar.zze;
        long j4 = zzaovVar.zzf;
        ?? arrayList = zzaovVar.zzh;
        if (arrayList == 0) {
            Map map = zzaovVar.zzg;
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new zzape((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        this(str, str2, j, j2, j3, j4, arrayList);
    }

    public static zzaqf zza(zzaqg zzaqgVar) throws IOException {
        if (zzaqi.zze(zzaqgVar) != 538247942) {
            throw new IOException();
        }
        String strZzh = zzaqi.zzh(zzaqgVar);
        String strZzh2 = zzaqi.zzh(zzaqgVar);
        long jZzf = zzaqi.zzf(zzaqgVar);
        long jZzf2 = zzaqi.zzf(zzaqgVar);
        long jZzf3 = zzaqi.zzf(zzaqgVar);
        long jZzf4 = zzaqi.zzf(zzaqgVar);
        int iZze = zzaqi.zze(zzaqgVar);
        if (iZze < 0) {
            throw new IOException(AbstractC3950lJ.p("readHeaderList size=", iZze));
        }
        List listEmptyList = iZze == 0 ? Collections.emptyList() : new ArrayList();
        for (int i = 0; i < iZze; i++) {
            listEmptyList.add(new zzape(zzaqi.zzh(zzaqgVar).intern(), zzaqi.zzh(zzaqgVar).intern()));
        }
        return new zzaqf(strZzh, strZzh2, jZzf, jZzf2, jZzf3, jZzf4, listEmptyList);
    }

    private zzaqf(String str, String str2, long j, long j2, long j3, long j4, List list) {
        this.zzb = str;
        this.zzc = true == "".equals(str2) ? null : str2;
        this.zzd = j;
        this.zze = j2;
        this.zzf = j3;
        this.zzg = j4;
        this.zzh = list;
    }
}
