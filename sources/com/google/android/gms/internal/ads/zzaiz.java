package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzaiz {
    private static final zzfvc zza = zzfvc.zzb(zzfty.zzc(':'));
    private static final zzfvc zzb = zzfvc.zzb(zzfty.zzc('*'));
    private final List zzc = new ArrayList();
    private int zzd = 0;
    private int zze;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    public final int zza(zzaco zzacoVar, zzadj zzadjVar, List list) throws IOException {
        byte b;
        char c;
        int i = this.zzd;
        if (i == 0) {
            long jZzd = zzacoVar.zzd();
            zzadjVar.zza = (jZzd == -1 || jZzd < 8) ? 0L : jZzd - 8;
            this.zzd = 1;
            return 1;
        }
        int i2 = 2;
        if (i != 1) {
            short s = 2817;
            short s2 = 2816;
            short s3 = 2192;
            if (i != 2) {
                long jZzf = zzacoVar.zzf();
                int iZzd = (int) ((zzacoVar.zzd() - zzacoVar.zzf()) - ((long) this.zze));
                zzdy zzdyVar = new zzdy(iZzd);
                zzacoVar.zzi(zzdyVar.zzN(), 0, iZzd);
                for (int i3 = 0; i3 < this.zzc.size(); i3++) {
                    zzaiy zzaiyVar = (zzaiy) this.zzc.get(i3);
                    zzdyVar.zzL((int) (zzaiyVar.zza - jZzf));
                    zzdyVar.zzM(4);
                    int iZzi = zzdyVar.zzi();
                    Charset charset = StandardCharsets.UTF_8;
                    switch (zzdyVar.zzB(iZzi, charset)) {
                        case "SlowMotion_Data":
                            b = 0;
                            break;
                        case "Super_SlowMotion_Edit_Data":
                            b = 3;
                            break;
                        case "Super_SlowMotion_Data":
                            b = 1;
                            break;
                        case "Super_SlowMotion_Deflickering_On":
                            b = 4;
                            break;
                        case "Super_SlowMotion_BGM":
                            b = 2;
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    if (b == 0) {
                        c = 2192;
                    } else if (b == 1) {
                        c = 2816;
                    } else if (b == 2) {
                        c = 2817;
                    } else if (b == 3) {
                        c = 2819;
                    } else {
                        if (b != 4) {
                            throw zzbc.zza("Invalid SEF name", null);
                        }
                        c = 2820;
                    }
                    int i4 = zzaiyVar.zzb - (iZzi + 8);
                    if (c == 2192) {
                        ArrayList arrayList = new ArrayList();
                        List listZzf = zzb.zzf(zzdyVar.zzB(i4, charset));
                        for (int i5 = 0; i5 < listZzf.size(); i5++) {
                            List listZzf2 = zza.zzf((CharSequence) listZzf.get(i5));
                            if (listZzf2.size() != 3) {
                                throw zzbc.zza(null, null);
                            }
                            try {
                                arrayList.add(new zzagy(Long.parseLong((String) listZzf2.get(0)), Long.parseLong((String) listZzf2.get(1)), 1 << (Integer.parseInt((String) listZzf2.get(2)) - 1)));
                            } catch (NumberFormatException e) {
                                throw zzbc.zza(null, e);
                            }
                        }
                        list.add(new zzagz(arrayList));
                    } else if (c != 2816 && c != 2817 && c != 2819 && c != 2820) {
                        throw new IllegalStateException();
                    }
                }
                zzadjVar.zza = 0L;
            } else {
                long jZzd2 = zzacoVar.zzd();
                int i6 = this.zze - 20;
                zzdy zzdyVar2 = new zzdy(i6);
                zzacoVar.zzi(zzdyVar2.zzN(), 0, i6);
                int i7 = 0;
                while (i7 < i6 / 12) {
                    zzdyVar2.zzM(i2);
                    short sZzD = zzdyVar2.zzD();
                    if (sZzD == s3 || sZzD == s2 || sZzD == s || sZzD == 2819 || sZzD == 2820) {
                        this.zzc.add(new zzaiy(sZzD, (jZzd2 - ((long) this.zze)) - ((long) zzdyVar2.zzi()), zzdyVar2.zzi()));
                    } else {
                        zzdyVar2.zzM(8);
                    }
                    i7++;
                    i6 = i6;
                    i2 = 2;
                    s = 2817;
                    s2 = 2816;
                    s3 = 2192;
                }
                if (this.zzc.isEmpty()) {
                    zzadjVar.zza = 0L;
                } else {
                    this.zzd = 3;
                    zzadjVar.zza = ((zzaiy) this.zzc.get(0)).zza;
                }
            }
        } else {
            zzdy zzdyVar3 = new zzdy(8);
            zzacoVar.zzi(zzdyVar3.zzN(), 0, 8);
            this.zze = zzdyVar3.zzi() + 8;
            if (zzdyVar3.zzg() != 1397048916) {
                zzadjVar.zza = 0L;
            } else {
                zzadjVar.zza = zzacoVar.zzf() - ((long) (this.zze - 12));
                this.zzd = 2;
            }
        }
        return 1;
    }

    public final void zzb() {
        this.zzc.clear();
        this.zzd = 0;
    }
}
