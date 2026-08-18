package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: loaded from: classes3.dex */
final class zzuu implements zzue, zzud {
    private final zzue[] zza;

    @Nullable
    private zzud zze;

    @Nullable
    private zzwj zzf;
    private final ArrayList zzc = new ArrayList();
    private final HashMap zzd = new HashMap();
    private zzwa zzh = new zztq(zzfxn.zzn(), zzfxn.zzn());
    private final IdentityHashMap zzb = new IdentityHashMap();
    private zzue[] zzg = new zzue[0];

    public zzuu(zztr zztrVar, long[] jArr, zzue... zzueVarArr) {
        this.zza = zzueVarArr;
        for (int i = 0; i < zzueVarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.zza[i] = new zzwg(zzueVarArr[i], j);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final long zza(long j, zzlp zzlpVar) {
        zzue[] zzueVarArr = this.zzg;
        return (zzueVarArr.length > 0 ? zzueVarArr[0] : this.zza[0]).zza(j, zzlpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzue, com.google.android.gms.internal.ads.zzwa
    public final long zzb() {
        return this.zzh.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzue, com.google.android.gms.internal.ads.zzwa
    public final long zzc() {
        return this.zzh.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final long zzd() {
        long j = -9223372036854775807L;
        for (zzue zzueVar : this.zzg) {
            long jZzd = zzueVar.zzd();
            if (jZzd == C.TIME_UNSET) {
                if (j != C.TIME_UNSET && zzueVar.zze(j) != j) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j == C.TIME_UNSET) {
                for (zzue zzueVar2 : this.zzg) {
                    if (zzueVar2 == zzueVar) {
                        break;
                    }
                    if (zzueVar2.zze(jZzd) != jZzd) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j = jZzd;
            } else if (jZzd != j) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final long zze(long j) {
        long jZze = this.zzg[0].zze(j);
        int i = 1;
        while (true) {
            zzue[] zzueVarArr = this.zzg;
            if (i >= zzueVarArr.length) {
                return jZze;
            }
            if (zzueVarArr[i].zze(jZze) != jZze) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final long zzf(zzxv[] zzxvVarArr, boolean[] zArr, zzvy[] zzvyVarArr, boolean[] zArr2, long j) {
        int length;
        int length2 = zzxvVarArr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i = 0;
        while (true) {
            length = zzxvVarArr.length;
            if (i >= length) {
                break;
            }
            zzvy zzvyVar = zzvyVarArr[i];
            Integer num = zzvyVar != null ? (Integer) this.zzb.get(zzvyVar) : null;
            iArr[i] = num == null ? -1 : num.intValue();
            zzxv zzxvVar = zzxvVarArr[i];
            if (zzxvVar != null) {
                String str = zzxvVar.zzg().zzb;
                iArr2[i] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i] = -1;
            }
            i++;
        }
        this.zzb.clear();
        zzvy[] zzvyVarArr2 = new zzvy[length];
        zzvy[] zzvyVarArr3 = new zzvy[length];
        zzxv[] zzxvVarArr2 = new zzxv[length];
        ArrayList arrayList = new ArrayList(this.zza.length);
        long j2 = j;
        int i2 = 0;
        while (i2 < this.zza.length) {
            for (int i3 = 0; i3 < zzxvVarArr.length; i3++) {
                zzvyVarArr3[i3] = iArr[i3] == i2 ? zzvyVarArr[i3] : null;
                if (iArr2[i3] == i2) {
                    zzxv zzxvVar2 = zzxvVarArr[i3];
                    zzxvVar2.getClass();
                    zzbr zzbrVar = (zzbr) this.zzd.get(zzxvVar2.zzg());
                    zzbrVar.getClass();
                    zzxvVarArr2[i3] = new zzut(zzxvVar2, zzbrVar);
                } else {
                    zzxvVarArr2[i3] = null;
                }
            }
            ArrayList arrayList2 = arrayList;
            zzxv[] zzxvVarArr3 = zzxvVarArr2;
            zzvy[] zzvyVarArr4 = zzvyVarArr3;
            long jZzf = this.zza[i2].zzf(zzxvVarArr2, zArr, zzvyVarArr3, zArr2, j2);
            if (i2 == 0) {
                j2 = jZzf;
            } else if (jZzf != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i4 = 0; i4 < zzxvVarArr.length; i4++) {
                if (iArr2[i4] == i2) {
                    zzvy zzvyVar2 = zzvyVarArr4[i4];
                    zzvyVar2.getClass();
                    zzvyVarArr2[i4] = zzvyVar2;
                    this.zzb.put(zzvyVar2, Integer.valueOf(i2));
                    z = true;
                } else if (iArr[i4] == i2) {
                    zzcw.zzf(zzvyVarArr4[i4] == null);
                }
            }
            if (z) {
                arrayList2.add(this.zza[i2]);
            }
            i2++;
            arrayList = arrayList2;
            zzxvVarArr2 = zzxvVarArr3;
            zzvyVarArr3 = zzvyVarArr4;
        }
        ArrayList arrayList3 = arrayList;
        System.arraycopy(zzvyVarArr2, 0, zzvyVarArr, 0, length);
        this.zzg = (zzue[]) arrayList3.toArray(new zzue[0]);
        this.zzh = new zztq(arrayList3, zzfyd.zzb(arrayList3, new zzfuc() { // from class: com.google.android.gms.internal.ads.zzus
            @Override // com.google.android.gms.internal.ads.zzfuc
            public final Object apply(Object obj) {
                return ((zzue) obj).zzh().zzc();
            }
        }));
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzvz
    public final /* bridge */ /* synthetic */ void zzg(zzwa zzwaVar) {
        zzud zzudVar = this.zze;
        zzudVar.getClass();
        zzudVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final zzwj zzh() {
        zzwj zzwjVar = this.zzf;
        zzwjVar.getClass();
        return zzwjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzud
    public final void zzi(zzue zzueVar) {
        this.zzc.remove(zzueVar);
        if (!this.zzc.isEmpty()) {
            return;
        }
        int i = 0;
        for (zzue zzueVar2 : this.zza) {
            i += zzueVar2.zzh().zzb;
        }
        zzbr[] zzbrVarArr = new zzbr[i];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            zzue[] zzueVarArr = this.zza;
            if (i2 >= zzueVarArr.length) {
                this.zzf = new zzwj(zzbrVarArr);
                zzud zzudVar = this.zze;
                zzudVar.getClass();
                zzudVar.zzi(this);
                return;
            }
            zzwj zzwjVarZzh = zzueVarArr[i2].zzh();
            int i4 = zzwjVarZzh.zzb;
            int i5 = 0;
            while (i5 < i4) {
                zzbr zzbrVarZzb = zzwjVarZzh.zzb(i5);
                zzab[] zzabVarArr = new zzab[zzbrVarZzb.zza];
                for (int i6 = 0; i6 < zzbrVarZzb.zza; i6++) {
                    zzab zzabVarZzb = zzbrVarZzb.zzb(i6);
                    zzz zzzVarZzb = zzabVarZzb.zzb();
                    String str = zzabVarZzb.zza;
                    if (str == null) {
                        str = "";
                    }
                    zzzVarZzb.zzM(i2 + ":" + str);
                    zzabVarArr[i6] = zzzVarZzb.zzag();
                }
                zzbr zzbrVar = new zzbr(i2 + ":" + zzbrVarZzb.zzb, zzabVarArr);
                this.zzd.put(zzbrVar, zzbrVarZzb);
                zzbrVarArr[i3] = zzbrVar;
                i5++;
                i3++;
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final void zzj(long j, boolean z) {
        for (zzue zzueVar : this.zzg) {
            zzueVar.zzj(j, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final void zzk() throws IOException {
        int i = 0;
        while (true) {
            zzue[] zzueVarArr = this.zza;
            if (i >= zzueVarArr.length) {
                return;
            }
            zzueVarArr[i].zzk();
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final void zzl(zzud zzudVar, long j) {
        this.zze = zzudVar;
        Collections.addAll(this.zzc, this.zza);
        int i = 0;
        while (true) {
            zzue[] zzueVarArr = this.zza;
            if (i >= zzueVarArr.length) {
                return;
            }
            zzueVarArr[i].zzl(this, j);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzue, com.google.android.gms.internal.ads.zzwa
    public final void zzm(long j) {
        this.zzh.zzm(j);
    }

    public final zzue zzn(int i) {
        zzue zzueVar = this.zza[i];
        return zzueVar instanceof zzwg ? ((zzwg) zzueVar).zzn() : zzueVar;
    }

    @Override // com.google.android.gms.internal.ads.zzue, com.google.android.gms.internal.ads.zzwa
    public final boolean zzo(zzkj zzkjVar) {
        if (this.zzc.isEmpty()) {
            return this.zzh.zzo(zzkjVar);
        }
        int size = this.zzc.size();
        for (int i = 0; i < size; i++) {
            ((zzue) this.zzc.get(i)).zzo(zzkjVar);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzue, com.google.android.gms.internal.ads.zzwa
    public final boolean zzp() {
        return this.zzh.zzp();
    }
}
