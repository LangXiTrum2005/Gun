package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzalz implements zzaka {
    private final List zza;
    private final long[] zzb;
    private final long[] zzc;

    public zzalz(List list) {
        this.zza = Collections.unmodifiableList(new ArrayList(list));
        int size = list.size();
        this.zzb = new long[size + size];
        for (int i = 0; i < list.size(); i++) {
            zzalo zzaloVar = (zzalo) list.get(i);
            long[] jArr = this.zzb;
            int i2 = i + i;
            jArr[i2] = zzaloVar.zzb;
            jArr[i2 + 1] = zzaloVar.zzc;
        }
        long[] jArr2 = this.zzb;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.zzc = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // com.google.android.gms.internal.ads.zzaka
    public final int zza() {
        return this.zzc.length;
    }

    @Override // com.google.android.gms.internal.ads.zzaka
    public final long zzb(int i) {
        zzcw.zzd(i >= 0);
        zzcw.zzd(i < this.zzc.length);
        return this.zzc[i];
    }

    @Override // com.google.android.gms.internal.ads.zzaka
    public final List zzc(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < this.zza.size(); i++) {
            long[] jArr = this.zzb;
            int i2 = i + i;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                zzalo zzaloVar = (zzalo) this.zza.get(i);
                zzco zzcoVar = zzaloVar.zza;
                if (zzcoVar.zze == -3.4028235E38f) {
                    arrayList2.add(zzaloVar);
                } else {
                    arrayList.add(zzcoVar);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: com.google.android.gms.internal.ads.zzaly
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((zzalo) obj).zzb, ((zzalo) obj2).zzb);
            }
        });
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            zzcm zzcmVarZzb = ((zzalo) arrayList2.get(i3)).zza.zzb();
            zzcmVarZzb.zze((-1) - i3, 1);
            arrayList.add(zzcmVarZzb.zzp());
        }
        return arrayList;
    }
}
