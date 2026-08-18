package com.google.android.gms.internal.ads;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzalk implements zzakf {
    private final zzdy zza = new zzdy();
    private final boolean zzb;
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final float zzf;
    private final int zzg;

    public zzalk(List list) {
        int size = list.size();
        String str = C.SANS_SERIF_NAME;
        if (size != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.zzc = 0;
            this.zzd = -1;
            this.zze = C.SANS_SERIF_NAME;
            this.zzb = false;
            this.zzf = 0.85f;
            this.zzg = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.zzc = bArr[24];
        this.zzd = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.zze = true == "Serif".equals(zzei.zzC(bArr, 43, bArr.length + (-43))) ? C.SERIF_NAME : str;
        int i = bArr[25] * 20;
        this.zzg = i;
        boolean z = (bArr[0] & 32) != 0;
        this.zzb = z;
        if (z) {
            this.zzf = Math.max(0.0f, Math.min(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.95f));
        } else {
            this.zzf = 0.85f;
        }
    }

    private static void zzb(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    private static void zzc(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            int i7 = i & 1;
            int i8 = i & 2;
            boolean z = true;
            if (i7 != 0) {
                if (i8 != 0) {
                    DM.v(3, spannableStringBuilder, i3, i4, i6);
                } else {
                    DM.v(1, spannableStringBuilder, i3, i4, i6);
                    z = false;
                }
            } else if (i8 != 0) {
                DM.v(2, spannableStringBuilder, i3, i4, i6);
            } else {
                z = false;
            }
            if ((i & 4) != 0) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            } else {
                if (i7 != 0 || z) {
                    return;
                }
                DM.v(0, spannableStringBuilder, i3, i4, i6);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzakf
    public final void zza(byte[] bArr, int i, int i2, zzake zzakeVar, zzdb zzdbVar) {
        String strZzB;
        int length;
        this.zza.zzJ(bArr, i + i2);
        this.zza.zzL(i);
        zzdy zzdyVar = this.zza;
        int i3 = 1;
        int i4 = 2;
        zzcw.zzd(zzdyVar.zzb() >= 2);
        int iZzq = zzdyVar.zzq();
        if (iZzq == 0) {
            strZzB = "";
        } else {
            int iZzd = zzdyVar.zzd();
            Charset charsetZzC = zzdyVar.zzC();
            int iZzd2 = zzdyVar.zzd() - iZzd;
            if (charsetZzC == null) {
                charsetZzC = StandardCharsets.UTF_8;
            }
            strZzB = zzdyVar.zzB(iZzq - iZzd2, charsetZzC);
        }
        if (strZzB.isEmpty()) {
            zzdbVar.zza(new zzajx(zzfxn.zzn(), C.TIME_UNSET, C.TIME_UNSET));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strZzB);
        zzc(spannableStringBuilder, this.zzc, 0, 0, spannableStringBuilder.length(), 16711680);
        zzb(spannableStringBuilder, this.zzd, -1, 0, spannableStringBuilder.length(), 16711680);
        String str = this.zze;
        int length2 = spannableStringBuilder.length();
        if (str != C.SANS_SERIF_NAME) {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length2, 16711713);
        }
        float fMax = this.zzf;
        while (true) {
            zzdy zzdyVar2 = this.zza;
            if (zzdyVar2.zzb() < 8) {
                zzcm zzcmVar = new zzcm();
                zzcmVar.zzl(spannableStringBuilder);
                zzcmVar.zze(fMax, 0);
                zzcmVar.zzf(0);
                zzdbVar.zza(new zzajx(zzfxn.zzo(zzcmVar.zzp()), C.TIME_UNSET, C.TIME_UNSET));
                return;
            }
            int iZzd3 = zzdyVar2.zzd();
            int iZzg = zzdyVar2.zzg();
            int iZzg2 = this.zza.zzg();
            if (iZzg2 == 1937013100) {
                zzcw.zzd(this.zza.zzb() >= i4);
                int iZzq2 = this.zza.zzq();
                int i5 = 0;
                while (i5 < iZzq2) {
                    zzdy zzdyVar3 = this.zza;
                    zzcw.zzd(zzdyVar3.zzb() >= 12);
                    int iZzq3 = zzdyVar3.zzq();
                    int iZzq4 = zzdyVar3.zzq();
                    zzdyVar3.zzM(i4);
                    int iZzm = zzdyVar3.zzm();
                    zzdyVar3.zzM(i3);
                    int iZzg3 = zzdyVar3.zzg();
                    if (iZzq4 > spannableStringBuilder.length()) {
                        zzdo.zzf("Tx3gParser", AbstractC3950lJ.q("Truncating styl end (", iZzq4, ") to cueText.length() (", spannableStringBuilder.length(), ")."));
                        length = spannableStringBuilder.length();
                    } else {
                        length = iZzq4;
                    }
                    if (iZzq3 >= length) {
                        zzdo.zzf("Tx3gParser", AbstractC3950lJ.q("Ignoring styl with start (", iZzq3, ") >= end (", length, ")."));
                    } else {
                        int i6 = length;
                        zzc(spannableStringBuilder, iZzm, this.zzc, iZzq3, i6, 0);
                        zzb(spannableStringBuilder, iZzg3, this.zzd, iZzq3, i6, 0);
                    }
                    i5++;
                    iZzq2 = iZzq2;
                    i3 = 1;
                    i4 = 2;
                }
            } else {
                if (iZzg2 == 1952608120 && this.zzb) {
                    zzcw.zzd(this.zza.zzb() >= 2);
                    fMax = Math.max(0.0f, Math.min(this.zza.zzq() / this.zzg, 0.95f));
                }
                this.zza.zzL(iZzd3 + iZzg);
                i3 = 1;
                i4 = 2;
            }
            this.zza.zzL(iZzd3 + iZzg);
            i3 = 1;
            i4 = 2;
        }
    }
}
