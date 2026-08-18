package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
final class zzgws extends zzgww {
    private final byte[] zza;
    private final int zzb;
    private int zzc;

    public zzgws(byte[] bArr, int i, int i2) {
        super(null);
        int length = bArr.length;
        if (((length - i2) | i2) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(AbstractC3888ke0.h("Array range is invalid. Buffer.length=", length, ", offset=0, length=", i2));
        }
        this.zza = bArr;
        this.zzc = 0;
        this.zzb = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final void zzK() {
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final void zzL(byte b) throws IOException {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i = this.zzc;
        try {
            int i2 = i + 1;
            try {
                this.zza[i] = b;
                this.zzc = i2;
            } catch (IndexOutOfBoundsException e) {
                indexOutOfBoundsException = e;
                i = i2;
                throw new zzgwt(i, this.zzb, 1, indexOutOfBoundsException);
            }
        } catch (IndexOutOfBoundsException e2) {
            indexOutOfBoundsException = e2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final void zzM(int i, boolean z) throws IOException {
        zzu(i << 3);
        zzL(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final void zzN(int i, zzgwj zzgwjVar) throws IOException {
        zzu((i << 3) | 2);
        zzu(zzgwjVar.zzd());
        zzgwjVar.zzo(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgww, com.google.android.gms.internal.ads.zzgwa
    public final void zza(byte[] bArr, int i, int i2) throws IOException {
        zze(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final int zzb() {
        return this.zzb - this.zzc;
    }

    public final void zze(byte[] bArr, int i, int i2) throws IOException {
        try {
            System.arraycopy(bArr, i, this.zza, this.zzc, i2);
            this.zzc += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zzgwt(this.zzc, this.zzb, i2, e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final void zzh(int i, int i2) throws IOException {
        zzu((i << 3) | 5);
        zzi(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final void zzi(int i) throws IOException {
        int i2 = this.zzc;
        try {
            byte[] bArr = this.zza;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.zzc = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new zzgwt(i2, this.zzb, 4, e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final void zzj(int i, long j) throws IOException {
        zzu((i << 3) | 1);
        zzk(j);
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final void zzk(long j) throws IOException {
        int i = this.zzc;
        try {
            byte[] bArr = this.zza;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.zzc = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new zzgwt(i, this.zzb, 8, e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final void zzl(int i, int i2) throws IOException {
        zzu(i << 3);
        zzm(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final void zzm(int i) throws IOException {
        if (i >= 0) {
            zzu(i);
        } else {
            zzw(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final void zzn(int i, zzgzc zzgzcVar, zzgzv zzgzvVar) throws IOException {
        zzu((i << 3) | 2);
        zzu(((zzgvs) zzgzcVar).zzaM(zzgzvVar));
        zzgzvVar.zzj(zzgzcVar, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final void zzo(int i, zzgzc zzgzcVar) throws IOException {
        zzu(11);
        zzt(2, i);
        zzu(26);
        zzu(zzgzcVar.zzaY());
        zzgzcVar.zzcY(this);
        zzu(12);
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final void zzp(int i, zzgwj zzgwjVar) throws IOException {
        zzu(11);
        zzt(2, i);
        zzN(3, zzgwjVar);
        zzu(12);
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final void zzq(int i, String str) throws IOException {
        zzu((i << 3) | 2);
        zzr(str);
    }

    public final void zzr(String str) throws IOException {
        int i = this.zzc;
        try {
            int iZzD = zzgww.zzD(str.length() * 3);
            int iZzD2 = zzgww.zzD(str.length());
            if (iZzD2 != iZzD) {
                zzu(zzhat.zze(str));
                byte[] bArr = this.zza;
                int i2 = this.zzc;
                this.zzc = zzhat.zzd(str, bArr, i2, this.zzb - i2);
                return;
            }
            int i3 = i + iZzD2;
            this.zzc = i3;
            int iZzd = zzhat.zzd(str, this.zza, i3, this.zzb - i3);
            this.zzc = i;
            zzu((iZzd - i) - iZzD2);
            this.zzc = iZzd;
        } catch (zzhas e) {
            this.zzc = i;
            zzG(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new zzgwt(e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final void zzs(int i, int i2) throws IOException {
        zzu((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final void zzt(int i, int i2) throws IOException {
        zzu(i << 3);
        zzu(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final void zzu(int i) throws IOException {
        int i2;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i3 = this.zzc;
        while ((i & (-128)) != 0) {
            try {
                i2 = i3 + 1;
                try {
                    this.zza[i3] = (byte) (i | 128);
                    i >>>= 7;
                    i3 = i2;
                } catch (IndexOutOfBoundsException e) {
                    indexOutOfBoundsException = e;
                    i3 = i2;
                    throw new zzgwt(i3, this.zzb, 1, indexOutOfBoundsException);
                }
            } catch (IndexOutOfBoundsException e2) {
                indexOutOfBoundsException = e2;
                throw new zzgwt(i3, this.zzb, 1, indexOutOfBoundsException);
            }
        }
        i2 = i3 + 1;
        this.zza[i3] = (byte) i;
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final void zzv(int i, long j) throws IOException {
        zzu(i << 3);
        zzw(j);
    }

    @Override // com.google.android.gms.internal.ads.zzgww
    public final void zzw(long j) throws IOException {
        int i;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i2 = this.zzc;
        if (!zzgww.zzb || this.zzb - i2 < 10) {
            while ((j & (-128)) != 0) {
                try {
                    int i3 = i2 + 1;
                    try {
                        this.zza[i2] = (byte) (((int) j) | 128);
                        j >>>= 7;
                        i2 = i3;
                    } catch (IndexOutOfBoundsException e) {
                        e = e;
                        i2 = i3;
                        indexOutOfBoundsException = e;
                        throw new zzgwt(i2, this.zzb, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e2) {
                    e = e2;
                }
            }
            i = i2 + 1;
            try {
                this.zza[i2] = (byte) j;
            } catch (IndexOutOfBoundsException e3) {
                indexOutOfBoundsException = e3;
                i2 = i;
                throw new zzgwt(i2, this.zzb, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j & (-128)) != 0) {
                zzhao.zzq(this.zza, i2, (byte) (((int) j) | 128));
                j >>>= 7;
                i2++;
            }
            i = i2 + 1;
            zzhao.zzq(this.zza, i2, (byte) j);
        }
        this.zzc = i;
    }
}
