package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.badlogic.gdx.Input;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class zzgzu extends zzgwj {
    static final int[] zza = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, Input.Keys.NUMPAD_0, 233, 377, TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private final int zzc;
    private final zzgwj zzd;
    private final zzgwj zze;
    private final int zzf;
    private final int zzg;

    public static zzgwj zzC(zzgwj zzgwjVar, zzgwj zzgwjVar2) {
        if (zzgwjVar2.zzd() == 0) {
            return zzgwjVar;
        }
        if (zzgwjVar.zzd() == 0) {
            return zzgwjVar2;
        }
        int iZzd = zzgwjVar2.zzd() + zzgwjVar.zzd();
        if (iZzd < 128) {
            return zzD(zzgwjVar, zzgwjVar2);
        }
        if (zzgwjVar instanceof zzgzu) {
            zzgzu zzgzuVar = (zzgzu) zzgwjVar;
            if (zzgwjVar2.zzd() + zzgzuVar.zze.zzd() < 128) {
                return new zzgzu(zzgzuVar.zzd, zzD(zzgzuVar.zze, zzgwjVar2));
            }
            if (zzgzuVar.zzd.zzf() > zzgzuVar.zze.zzf() && zzgzuVar.zzg > zzgwjVar2.zzf()) {
                return new zzgzu(zzgzuVar.zzd, new zzgzu(zzgzuVar.zze, zzgwjVar2));
            }
        }
        return iZzd >= zzc(Math.max(zzgwjVar.zzf(), zzgwjVar2.zzf()) + 1) ? new zzgzu(zzgwjVar, zzgwjVar2) : zzgzr.zza(new zzgzr(null), zzgwjVar, zzgwjVar2);
    }

    private static zzgwj zzD(zzgwj zzgwjVar, zzgwj zzgwjVar2) {
        int iZzd = zzgwjVar.zzd();
        int iZzd2 = zzgwjVar2.zzd();
        byte[] bArr = new byte[iZzd + iZzd2];
        zzgwjVar.zzz(bArr, 0, 0, iZzd);
        zzgwjVar2.zzz(bArr, 0, iZzd, iZzd2);
        return new zzgwg(bArr);
    }

    public static int zzc(int i) {
        int[] iArr = zza;
        int length = iArr.length;
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgwj)) {
            return false;
        }
        zzgwj zzgwjVar = (zzgwj) obj;
        if (this.zzc != zzgwjVar.zzd()) {
            return false;
        }
        if (this.zzc == 0) {
            return true;
        }
        int iZzr = zzr();
        int iZzr2 = zzgwjVar.zzr();
        if (iZzr != 0 && iZzr2 != 0 && iZzr != iZzr2) {
            return false;
        }
        zzgzt zzgztVar = null;
        zzgzs zzgzsVar = new zzgzs(this, zzgztVar);
        zzgwf zzgwfVarZza = zzgzsVar.next();
        zzgzs zzgzsVar2 = new zzgzs(zzgwjVar, zzgztVar);
        zzgwf zzgwfVarZza2 = zzgzsVar2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int iZzd = zzgwfVarZza.zzd() - i;
            int iZzd2 = zzgwfVarZza2.zzd() - i2;
            int iMin = Math.min(iZzd, iZzd2);
            if (!(i == 0 ? zzgwfVarZza.zzg(zzgwfVarZza2, i2, iMin) : zzgwfVarZza2.zzg(zzgwfVarZza, i, iMin))) {
                return false;
            }
            i3 += iMin;
            int i4 = this.zzc;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == iZzd) {
                zzgwfVarZza = zzgzsVar.next();
                i = 0;
            } else {
                i += iMin;
            }
            if (iMin == iZzd2) {
                zzgwfVarZza = zzgwfVarZza;
                zzgwfVarZza2 = zzgzsVar2.next();
                i2 = 0;
            } else {
                zzgwfVarZza = zzgwfVarZza;
                i2 += iMin;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgwj, java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new zzgzq(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public final byte zza(int i) {
        zzgwj.zzy(i, this.zzc);
        return zzb(i);
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public final byte zzb(int i) {
        int i2 = this.zzf;
        return i < i2 ? this.zzd.zzb(i) : this.zze.zzb(i - i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public final void zze(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.zzf;
        if (i4 <= i5) {
            this.zzd.zze(bArr, i, i2, i3);
        } else {
            if (i >= i5) {
                this.zze.zze(bArr, i - i5, i2, i3);
                return;
            }
            int i6 = i5 - i;
            this.zzd.zze(bArr, i, i2, i6);
            this.zze.zze(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public final int zzf() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public final boolean zzh() {
        return this.zzc >= zzc(this.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public final int zzi(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.zzf;
        if (i4 <= i5) {
            return this.zzd.zzi(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.zze.zzi(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.zze.zzi(this.zzd.zzi(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public final int zzj(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.zzf;
        if (i4 <= i5) {
            return this.zzd.zzj(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.zze.zzj(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.zze.zzj(this.zzd.zzj(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public final zzgwj zzk(int i, int i2) {
        int iZzq = zzgwj.zzq(i, i2, this.zzc);
        if (iZzq == 0) {
            return zzgwj.zzb;
        }
        if (iZzq == this.zzc) {
            return this;
        }
        int i3 = this.zzf;
        if (i2 <= i3) {
            return this.zzd.zzk(i, i2);
        }
        if (i >= i3) {
            return this.zze.zzk(i - i3, i2 - i3);
        }
        zzgwj zzgwjVar = this.zzd;
        return new zzgzu(zzgwjVar.zzk(i, zzgwjVar.zzd()), this.zze.zzk(0, i2 - this.zzf));
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public final zzgwp zzl() {
        ArrayList<ByteBuffer> arrayList = new ArrayList();
        byte b = 0;
        zzgzs zzgzsVar = new zzgzs(this, null);
        while (zzgzsVar.hasNext()) {
            arrayList.add(zzgzsVar.next().zzn());
        }
        int i = 0;
        int iRemaining = 0;
        for (ByteBuffer byteBuffer : arrayList) {
            iRemaining += byteBuffer.remaining();
            i = byteBuffer.hasArray() ? i | 1 : byteBuffer.isDirect() ? i | 2 : i | 4;
        }
        return i == 2 ? new zzgwl(arrayList, iRemaining, true, b == true ? 1 : 0) : zzgwp.zzG(new zzgyh(arrayList), 4096);
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public final String zzm(Charset charset) {
        return new String(zzA(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public final ByteBuffer zzn() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public final void zzo(zzgwa zzgwaVar) throws IOException {
        this.zzd.zzo(zzgwaVar);
        this.zze.zzo(zzgwaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public final boolean zzp() {
        zzgwj zzgwjVar = this.zzd;
        zzgwj zzgwjVar2 = this.zze;
        return zzgwjVar2.zzj(zzgwjVar.zzj(0, 0, this.zzf), 0, zzgwjVar2.zzd()) == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    /* JADX INFO: renamed from: zzs */
    public final zzgwe iterator() {
        return new zzgzq(this);
    }

    private zzgzu(zzgwj zzgwjVar, zzgwj zzgwjVar2) {
        this.zzd = zzgwjVar;
        this.zze = zzgwjVar2;
        int iZzd = zzgwjVar.zzd();
        this.zzf = iZzd;
        this.zzc = zzgwjVar2.zzd() + iZzd;
        this.zzg = Math.max(zzgwjVar.zzf(), zzgwjVar2.zzf()) + 1;
    }
}
