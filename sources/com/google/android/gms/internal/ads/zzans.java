package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.badlogic.gdx.Input;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class zzans implements zzank {
    final /* synthetic */ zzant zza;
    private final zzdx zzb = new zzdx(new byte[5], 5);
    private final SparseArray zzc = new SparseArray();
    private final SparseIntArray zzd = new SparseIntArray();
    private final int zze;

    public zzans(zzant zzantVar, int i) {
        this.zza = zzantVar;
        this.zze = i;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:22:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:25:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:29:0x00fb  */
    @Override // com.google.android.gms.internal.ads.zzank
    public final void zza(zzdy zzdyVar) {
        zzef zzefVar;
        zzef zzefVar2;
        if (zzdyVar.zzm() != 2) {
            return;
        }
        zzef zzefVar3 = (zzef) this.zza.zzb.get(0);
        if ((zzdyVar.zzm() & 128) != 0) {
            zzdyVar.zzM(1);
            int iZzq = zzdyVar.zzq();
            int i = 3;
            zzdyVar.zzM(3);
            zzdyVar.zzG(this.zzb, 2);
            this.zzb.zzn(3);
            int i2 = 13;
            this.zza.zzr = this.zzb.zzd(13);
            zzdyVar.zzG(this.zzb, 2);
            int i3 = 4;
            this.zzb.zzn(4);
            int i4 = 12;
            zzdyVar.zzM(this.zzb.zzd(12));
            this.zzc.clear();
            this.zzd.clear();
            int iZzb = zzdyVar.zzb();
            while (iZzb > 0) {
                int i5 = 5;
                zzdyVar.zzG(this.zzb, 5);
                zzdx zzdxVar = this.zzb;
                int iZzd = zzdxVar.zzd(8);
                zzdxVar.zzn(i);
                int iZzd2 = this.zzb.zzd(i2);
                this.zzb.zzn(i3);
                int iZzd3 = this.zzb.zzd(i4);
                int iZzd4 = zzdyVar.zzd();
                int i6 = iZzd4 + iZzd3;
                String str = null;
                ArrayList arrayList = null;
                int i7 = -1;
                int iZzm = 0;
                while (zzdyVar.zzd() < i6) {
                    int iZzm2 = zzdyVar.zzm();
                    int iZzd5 = zzdyVar.zzd() + zzdyVar.zzm();
                    if (iZzd5 > i6) {
                        break;
                    }
                    if (iZzm2 == i5) {
                        long jZzu = zzdyVar.zzu();
                        if (jZzu == 1094921523) {
                            zzefVar2 = zzefVar3;
                            i7 = 129;
                        } else if (jZzu == 1161904947) {
                            zzefVar2 = zzefVar3;
                            i7 = 135;
                        } else if (jZzu == 1094921524) {
                            zzefVar2 = zzefVar3;
                            i7 = 172;
                        } else if (jZzu == 1212503619) {
                            zzefVar2 = zzefVar3;
                            i7 = 36;
                        } else {
                            zzefVar2 = zzefVar3;
                        }
                    } else if (iZzm2 == 106) {
                        zzefVar2 = zzefVar3;
                        i7 = 129;
                    } else if (iZzm2 == 122) {
                        zzefVar2 = zzefVar3;
                        i7 = 135;
                    } else if (iZzm2 == 127) {
                        int iZzm3 = zzdyVar.zzm();
                        if (iZzm3 == 21) {
                            zzefVar2 = zzefVar3;
                            i7 = 172;
                        } else if (iZzm3 == 14) {
                            zzefVar2 = zzefVar3;
                            i7 = 136;
                        } else if (iZzm3 == 33) {
                            zzefVar2 = zzefVar3;
                            i7 = Input.Keys.F9;
                        } else {
                            zzefVar2 = zzefVar3;
                        }
                    } else if (iZzm2 == 123) {
                        zzefVar2 = zzefVar3;
                        i7 = 138;
                    } else if (iZzm2 == 10) {
                        String strTrim = zzdyVar.zzB(i, StandardCharsets.UTF_8).trim();
                        iZzm = zzdyVar.zzm();
                        zzefVar2 = zzefVar3;
                        str = strTrim;
                    } else if (iZzm2 == 89) {
                        ArrayList arrayList2 = new ArrayList();
                        while (zzdyVar.zzd() < iZzd5) {
                            String strTrim2 = zzdyVar.zzB(i, StandardCharsets.UTF_8).trim();
                            int iZzm4 = zzdyVar.zzm();
                            zzef zzefVar4 = zzefVar3;
                            byte[] bArr = new byte[i3];
                            zzdyVar.zzH(bArr, 0, i3);
                            arrayList2.add(new zzanu(strTrim2, iZzm4, bArr));
                            zzefVar3 = zzefVar4;
                            i = 3;
                            i3 = 4;
                        }
                        zzefVar2 = zzefVar3;
                        arrayList = arrayList2;
                        i7 = 89;
                    } else {
                        zzefVar2 = zzefVar3;
                        if (iZzm2 == 111) {
                            i7 = 257;
                        }
                    }
                    zzdyVar.zzM(iZzd5 - zzdyVar.zzd());
                    zzefVar3 = zzefVar2;
                    i = 3;
                    i3 = 4;
                    i5 = 5;
                }
                zzef zzefVar5 = zzefVar3;
                zzdyVar.zzL(i6);
                zzanv zzanvVar = new zzanv(i7, str, iZzm, arrayList, Arrays.copyOfRange(zzdyVar.zzN(), iZzd4, i6));
                if (iZzd == 6 || iZzd == 5) {
                    iZzd = zzanvVar.zza;
                }
                iZzb -= iZzd3 + 5;
                if (!this.zza.zzh.get(iZzd2)) {
                    zzany zzanyVarZzb = this.zza.zze.zzb(iZzd, zzanvVar);
                    this.zzd.put(iZzd2, iZzd2);
                    this.zzc.put(iZzd2, zzanyVarZzb);
                }
                zzefVar3 = zzefVar5;
                i = 3;
                i3 = 4;
                i4 = 12;
                i2 = 13;
            }
            zzef zzefVar6 = zzefVar3;
            int size = this.zzd.size();
            int i8 = 0;
            while (i8 < size) {
                SparseIntArray sparseIntArray = this.zzd;
                zzant zzantVar = this.zza;
                int iKeyAt = sparseIntArray.keyAt(i8);
                int iValueAt = sparseIntArray.valueAt(i8);
                zzantVar.zzh.put(iKeyAt, true);
                this.zza.zzi.put(iValueAt, true);
                zzany zzanyVar = (zzany) this.zzc.valueAt(i8);
                if (zzanyVar != null) {
                    zzacq zzacqVar = this.zza.zzl;
                    zzanx zzanxVar = new zzanx(iZzq, iKeyAt, 8192);
                    zzefVar = zzefVar6;
                    zzanyVar.zzb(zzefVar, zzacqVar, zzanxVar);
                    this.zza.zzg.put(iValueAt, zzanyVar);
                } else {
                    zzefVar = zzefVar6;
                }
                i8++;
                zzefVar6 = zzefVar;
            }
            this.zza.zzg.remove(this.zze);
            this.zza.zzm = 0;
            zzant zzantVar2 = this.zza;
            if (zzantVar2.zzm == 0) {
                zzantVar2.zzl.zzD();
                this.zza.zzn = true;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzank
    public final void zzb(zzef zzefVar, zzacq zzacqVar, zzanx zzanxVar) {
    }
}
