package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzgwx implements zzhaw {
    private final zzgww zza;

    private zzgwx(zzgww zzgwwVar) {
        zzgye.zzc(zzgwwVar, "output");
        this.zza = zzgwwVar;
        zzgwwVar.zze = this;
    }

    public static zzgwx zza(zzgww zzgwwVar) {
        zzgwx zzgwxVar = zzgwwVar.zze;
        return zzgwxVar != null ? zzgwxVar : new zzgwx(zzgwwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzA(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzgyr)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzj(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            this.zza.zzu(i3);
            while (i2 < list.size()) {
                this.zza.zzk(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzgyr zzgyrVar = (zzgyr) list;
        if (!z) {
            while (i2 < zzgyrVar.size()) {
                this.zza.zzj(i, zzgyrVar.zza(i2));
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzgyrVar.size(); i6++) {
            zzgyrVar.zza(i6);
            i5 += 8;
        }
        this.zza.zzu(i5);
        while (i2 < zzgyrVar.size()) {
            this.zza.zzk(zzgyrVar.zza(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzB(int i, int i2) throws IOException {
        this.zza.zzt(i, (i2 >> 31) ^ (i2 + i2));
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzC(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzgxs)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzgww zzgwwVar = this.zza;
                    int iIntValue = ((Integer) list.get(i2)).intValue();
                    zzgwwVar.zzt(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i2++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int iZzD = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int iIntValue2 = ((Integer) list.get(i3)).intValue();
                iZzD += zzgww.zzD((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            this.zza.zzu(iZzD);
            while (i2 < list.size()) {
                zzgww zzgwwVar2 = this.zza;
                int iIntValue3 = ((Integer) list.get(i2)).intValue();
                zzgwwVar2.zzu((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i2++;
            }
            return;
        }
        zzgxs zzgxsVar = (zzgxs) list;
        if (!z) {
            while (i2 < zzgxsVar.size()) {
                zzgww zzgwwVar3 = this.zza;
                int iZzd = zzgxsVar.zzd(i2);
                zzgwwVar3.zzt(i, (iZzd >> 31) ^ (iZzd + iZzd));
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int iZzD2 = 0;
        for (int i4 = 0; i4 < zzgxsVar.size(); i4++) {
            int iZzd2 = zzgxsVar.zzd(i4);
            iZzD2 += zzgww.zzD((iZzd2 >> 31) ^ (iZzd2 + iZzd2));
        }
        this.zza.zzu(iZzD2);
        while (i2 < zzgxsVar.size()) {
            zzgww zzgwwVar4 = this.zza;
            int iZzd3 = zzgxsVar.zzd(i2);
            zzgwwVar4.zzu((iZzd3 >> 31) ^ (iZzd3 + iZzd3));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzD(int i, long j) throws IOException {
        this.zza.zzv(i, (j >> 63) ^ (j + j));
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzE(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzgyr)) {
            if (!z) {
                while (i2 < list.size()) {
                    zzgww zzgwwVar = this.zza;
                    long jLongValue = ((Long) list.get(i2)).longValue();
                    zzgwwVar.zzv(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i2++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int iZzE = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                long jLongValue2 = ((Long) list.get(i3)).longValue();
                iZzE += zzgww.zzE((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            this.zza.zzu(iZzE);
            while (i2 < list.size()) {
                zzgww zzgwwVar2 = this.zza;
                long jLongValue3 = ((Long) list.get(i2)).longValue();
                zzgwwVar2.zzw((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i2++;
            }
            return;
        }
        zzgyr zzgyrVar = (zzgyr) list;
        if (!z) {
            while (i2 < zzgyrVar.size()) {
                zzgww zzgwwVar3 = this.zza;
                long jZza = zzgyrVar.zza(i2);
                zzgwwVar3.zzv(i, (jZza >> 63) ^ (jZza + jZza));
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int iZzE2 = 0;
        for (int i4 = 0; i4 < zzgyrVar.size(); i4++) {
            long jZza2 = zzgyrVar.zza(i4);
            iZzE2 += zzgww.zzE((jZza2 >> 63) ^ (jZza2 + jZza2));
        }
        this.zza.zzu(iZzE2);
        while (i2 < zzgyrVar.size()) {
            zzgww zzgwwVar4 = this.zza;
            long jZza3 = zzgyrVar.zza(i2);
            zzgwwVar4.zzw((jZza3 >> 63) ^ (jZza3 + jZza3));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    @Deprecated
    public final void zzF(int i) throws IOException {
        this.zza.zzs(i, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzG(int i, String str) throws IOException {
        this.zza.zzq(i, str);
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzH(int i, List list) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzgyo)) {
            while (i2 < list.size()) {
                this.zza.zzq(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        zzgyo zzgyoVar = (zzgyo) list;
        while (i2 < list.size()) {
            Object objZzc = zzgyoVar.zzc();
            if (objZzc instanceof String) {
                this.zza.zzq(i, (String) objZzc);
            } else {
                this.zza.zzN(i, (zzgwj) objZzc);
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzI(int i, int i2) throws IOException {
        this.zza.zzt(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzJ(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzgxs)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzt(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int iZzD = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzD += zzgww.zzD(((Integer) list.get(i3)).intValue());
            }
            this.zza.zzu(iZzD);
            while (i2 < list.size()) {
                this.zza.zzu(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzgxs zzgxsVar = (zzgxs) list;
        if (!z) {
            while (i2 < zzgxsVar.size()) {
                this.zza.zzt(i, zzgxsVar.zzd(i2));
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int iZzD2 = 0;
        for (int i4 = 0; i4 < zzgxsVar.size(); i4++) {
            iZzD2 += zzgww.zzD(zzgxsVar.zzd(i4));
        }
        this.zza.zzu(iZzD2);
        while (i2 < zzgxsVar.size()) {
            this.zza.zzu(zzgxsVar.zzd(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzK(int i, long j) throws IOException {
        this.zza.zzv(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzL(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzgyr)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzv(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int iZzE = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzE += zzgww.zzE(((Long) list.get(i3)).longValue());
            }
            this.zza.zzu(iZzE);
            while (i2 < list.size()) {
                this.zza.zzw(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzgyr zzgyrVar = (zzgyr) list;
        if (!z) {
            while (i2 < zzgyrVar.size()) {
                this.zza.zzv(i, zzgyrVar.zza(i2));
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int iZzE2 = 0;
        for (int i4 = 0; i4 < zzgyrVar.size(); i4++) {
            iZzE2 += zzgww.zzE(zzgyrVar.zza(i4));
        }
        this.zza.zzu(iZzE2);
        while (i2 < zzgyrVar.size()) {
            this.zza.zzw(zzgyrVar.zza(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzb(int i, boolean z) throws IOException {
        this.zza.zzM(i, z);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzc(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzgvz)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzM(i, ((Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).getClass();
                i3++;
            }
            this.zza.zzu(i3);
            while (i2 < list.size()) {
                this.zza.zzL(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        zzgvz zzgvzVar = (zzgvz) list;
        if (!z) {
            while (i2 < zzgvzVar.size()) {
                this.zza.zzM(i, zzgvzVar.zzh(i2));
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzgvzVar.size(); i6++) {
            zzgvzVar.zzh(i6);
            i5++;
        }
        this.zza.zzu(i5);
        while (i2 < zzgvzVar.size()) {
            this.zza.zzL(zzgvzVar.zzh(i2) ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzd(int i, zzgwj zzgwjVar) throws IOException {
        this.zza.zzN(i, zzgwjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zze(int i, List list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zza.zzN(i, (zzgwj) list.get(i2));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzf(int i, double d) throws IOException {
        this.zza.zzj(i, Double.doubleToRawLongBits(d));
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzg(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzgwy)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzj(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).getClass();
                i3 += 8;
            }
            this.zza.zzu(i3);
            while (i2 < list.size()) {
                this.zza.zzk(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        zzgwy zzgwyVar = (zzgwy) list;
        if (!z) {
            while (i2 < zzgwyVar.size()) {
                this.zza.zzj(i, Double.doubleToRawLongBits(zzgwyVar.zzd(i2)));
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzgwyVar.size(); i6++) {
            zzgwyVar.zzd(i6);
            i5 += 8;
        }
        this.zza.zzu(i5);
        while (i2 < zzgwyVar.size()) {
            this.zza.zzk(Double.doubleToRawLongBits(zzgwyVar.zzd(i2)));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    @Deprecated
    public final void zzh(int i) throws IOException {
        this.zza.zzs(i, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzi(int i, int i2) throws IOException {
        this.zza.zzl(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzj(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzgxs)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzl(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int iZzE = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzE += zzgww.zzE(((Integer) list.get(i3)).intValue());
            }
            this.zza.zzu(iZzE);
            while (i2 < list.size()) {
                this.zza.zzm(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzgxs zzgxsVar = (zzgxs) list;
        if (!z) {
            while (i2 < zzgxsVar.size()) {
                this.zza.zzl(i, zzgxsVar.zzd(i2));
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int iZzE2 = 0;
        for (int i4 = 0; i4 < zzgxsVar.size(); i4++) {
            iZzE2 += zzgww.zzE(zzgxsVar.zzd(i4));
        }
        this.zza.zzu(iZzE2);
        while (i2 < zzgxsVar.size()) {
            this.zza.zzm(zzgxsVar.zzd(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzk(int i, int i2) throws IOException {
        this.zza.zzh(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzl(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzgxs)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzh(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            this.zza.zzu(i3);
            while (i2 < list.size()) {
                this.zza.zzi(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzgxs zzgxsVar = (zzgxs) list;
        if (!z) {
            while (i2 < zzgxsVar.size()) {
                this.zza.zzh(i, zzgxsVar.zzd(i2));
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzgxsVar.size(); i6++) {
            zzgxsVar.zzd(i6);
            i5 += 4;
        }
        this.zza.zzu(i5);
        while (i2 < zzgxsVar.size()) {
            this.zza.zzi(zzgxsVar.zzd(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzm(int i, long j) throws IOException {
        this.zza.zzj(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzn(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzgyr)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzj(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            this.zza.zzu(i3);
            while (i2 < list.size()) {
                this.zza.zzk(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzgyr zzgyrVar = (zzgyr) list;
        if (!z) {
            while (i2 < zzgyrVar.size()) {
                this.zza.zzj(i, zzgyrVar.zza(i2));
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzgyrVar.size(); i6++) {
            zzgyrVar.zza(i6);
            i5 += 8;
        }
        this.zza.zzu(i5);
        while (i2 < zzgyrVar.size()) {
            this.zza.zzk(zzgyrVar.zza(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzo(int i, float f) throws IOException {
        this.zza.zzh(i, Float.floatToRawIntBits(f));
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzp(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzgxi)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzh(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).getClass();
                i3 += 4;
            }
            this.zza.zzu(i3);
            while (i2 < list.size()) {
                this.zza.zzi(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        zzgxi zzgxiVar = (zzgxi) list;
        if (!z) {
            while (i2 < zzgxiVar.size()) {
                this.zza.zzh(i, Float.floatToRawIntBits(zzgxiVar.zzd(i2)));
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzgxiVar.size(); i6++) {
            zzgxiVar.zzd(i6);
            i5 += 4;
        }
        this.zza.zzu(i5);
        while (i2 < zzgxiVar.size()) {
            this.zza.zzi(Float.floatToRawIntBits(zzgxiVar.zzd(i2)));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzq(int i, Object obj, zzgzv zzgzvVar) throws IOException {
        zzgww zzgwwVar = this.zza;
        zzgwwVar.zzs(i, 3);
        zzgzvVar.zzj((zzgzc) obj, zzgwwVar.zze);
        zzgwwVar.zzs(i, 4);
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzr(int i, int i2) throws IOException {
        this.zza.zzl(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzs(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzgxs)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzl(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int iZzE = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzE += zzgww.zzE(((Integer) list.get(i3)).intValue());
            }
            this.zza.zzu(iZzE);
            while (i2 < list.size()) {
                this.zza.zzm(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzgxs zzgxsVar = (zzgxs) list;
        if (!z) {
            while (i2 < zzgxsVar.size()) {
                this.zza.zzl(i, zzgxsVar.zzd(i2));
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int iZzE2 = 0;
        for (int i4 = 0; i4 < zzgxsVar.size(); i4++) {
            iZzE2 += zzgww.zzE(zzgxsVar.zzd(i4));
        }
        this.zza.zzu(iZzE2);
        while (i2 < zzgxsVar.size()) {
            this.zza.zzm(zzgxsVar.zzd(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzt(int i, long j) throws IOException {
        this.zza.zzv(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzu(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzgyr)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzv(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int iZzE = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iZzE += zzgww.zzE(((Long) list.get(i3)).longValue());
            }
            this.zza.zzu(iZzE);
            while (i2 < list.size()) {
                this.zza.zzw(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzgyr zzgyrVar = (zzgyr) list;
        if (!z) {
            while (i2 < zzgyrVar.size()) {
                this.zza.zzv(i, zzgyrVar.zza(i2));
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int iZzE2 = 0;
        for (int i4 = 0; i4 < zzgyrVar.size(); i4++) {
            iZzE2 += zzgww.zzE(zzgyrVar.zza(i4));
        }
        this.zza.zzu(iZzE2);
        while (i2 < zzgyrVar.size()) {
            this.zza.zzw(zzgyrVar.zza(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzv(int i, Object obj, zzgzv zzgzvVar) throws IOException {
        this.zza.zzn(i, (zzgzc) obj, zzgzvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzw(int i, Object obj) throws IOException {
        if (obj instanceof zzgwj) {
            this.zza.zzp(i, (zzgwj) obj);
        } else {
            this.zza.zzo(i, (zzgzc) obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzx(int i, int i2) throws IOException {
        this.zza.zzh(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzy(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzgxs)) {
            if (!z) {
                while (i2 < list.size()) {
                    this.zza.zzh(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            this.zza.zzs(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            this.zza.zzu(i3);
            while (i2 < list.size()) {
                this.zza.zzi(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzgxs zzgxsVar = (zzgxs) list;
        if (!z) {
            while (i2 < zzgxsVar.size()) {
                this.zza.zzh(i, zzgxsVar.zzd(i2));
                i2++;
            }
            return;
        }
        this.zza.zzs(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < zzgxsVar.size(); i6++) {
            zzgxsVar.zzd(i6);
            i5 += 4;
        }
        this.zza.zzu(i5);
        while (i2 < zzgxsVar.size()) {
            this.zza.zzi(zzgxsVar.zzd(i2));
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhaw
    public final void zzz(int i, long j) throws IOException {
        this.zza.zzj(i, j);
    }
}
