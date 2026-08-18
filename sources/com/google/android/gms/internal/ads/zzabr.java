package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzabr {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final float zzk;

    @Nullable
    public final String zzl;

    private zzabr(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, @Nullable String str) {
        this.zza = list;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = i5;
        this.zzg = i6;
        this.zzh = i7;
        this.zzi = i8;
        this.zzj = i9;
        this.zzk = f;
        this.zzl = str;
    }

    public static zzabr zza(zzdy zzdyVar) throws zzbc {
        String strZzc;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        float f;
        try {
            zzdyVar.zzM(4);
            int iZzm = zzdyVar.zzm() & 3;
            int i9 = iZzm + 1;
            if (i9 == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iZzm2 = zzdyVar.zzm() & 31;
            for (int i10 = 0; i10 < iZzm2; i10++) {
                arrayList.add(zzb(zzdyVar));
            }
            int iZzm3 = zzdyVar.zzm();
            for (int i11 = 0; i11 < iZzm3; i11++) {
                arrayList.add(zzb(zzdyVar));
            }
            if (iZzm2 > 0) {
                zzfj zzfjVarZzf = zzfk.zzf((byte[]) arrayList.get(0), iZzm + 2, ((byte[]) arrayList.get(0)).length);
                int i12 = zzfjVarZzf.zze;
                int i13 = zzfjVarZzf.zzf;
                int i14 = zzfjVarZzf.zzh + 8;
                int i15 = zzfjVarZzf.zzi + 8;
                int i16 = zzfjVarZzf.zzj;
                int i17 = zzfjVarZzf.zzk;
                int i18 = zzfjVarZzf.zzl;
                int i19 = zzfjVarZzf.zzm;
                float f2 = zzfjVarZzf.zzg;
                strZzc = zzcy.zzc(zzfjVarZzf.zza, zzfjVarZzf.zzb, zzfjVarZzf.zzc);
                i7 = i18;
                i8 = i19;
                f = f2;
                i4 = i15;
                i5 = i16;
                i6 = i17;
                i = i12;
                i2 = i13;
                i3 = i14;
            } else {
                strZzc = null;
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = -1;
                i7 = -1;
                i8 = 16;
                f = 1.0f;
            }
            return new zzabr(arrayList, i9, i, i2, i3, i4, i5, i6, i7, i8, f, strZzc);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw zzbc.zza("Error parsing AVC config", e);
        }
    }

    private static byte[] zzb(zzdy zzdyVar) {
        int iZzq = zzdyVar.zzq();
        int iZzd = zzdyVar.zzd();
        zzdyVar.zzM(iZzq);
        return zzcy.zze(zzdyVar.zzN(), iZzd, iZzq);
    }
}
