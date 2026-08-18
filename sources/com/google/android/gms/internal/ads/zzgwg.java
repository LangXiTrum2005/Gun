package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
class zzgwg extends zzgwf {
    protected final byte[] zza;

    public zzgwg(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgwj) || zzd() != ((zzgwj) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzgwg)) {
            return obj.equals(this);
        }
        zzgwg zzgwgVar = (zzgwg) obj;
        int iZzr = zzr();
        int iZzr2 = zzgwgVar.zzr();
        if (iZzr == 0 || iZzr2 == 0 || iZzr == iZzr2) {
            return zzg(zzgwgVar, 0, zzd());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public byte zza(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public byte zzb(int i) {
        return this.zza[i];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zza, i, bArr, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzgwf
    public final boolean zzg(zzgwj zzgwjVar, int i, int i2) {
        if (i2 > zzgwjVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + i2 + zzd());
        }
        int i3 = i + i2;
        if (i3 > zzgwjVar.zzd()) {
            int iZzd = zzgwjVar.zzd();
            StringBuilder sbT = AbstractC3950lJ.t("Ran off end of other: ", i, ", ", i2, ", ");
            sbT.append(iZzd);
            throw new IllegalArgumentException(sbT.toString());
        }
        if (!(zzgwjVar instanceof zzgwg)) {
            return zzgwjVar.zzk(i, i3).equals(zzk(0, i2));
        }
        zzgwg zzgwgVar = (zzgwg) zzgwjVar;
        byte[] bArr = this.zza;
        byte[] bArr2 = zzgwgVar.zza;
        int iZzc = zzc() + i2;
        int iZzc2 = zzc();
        int iZzc3 = zzgwgVar.zzc() + i;
        while (iZzc2 < iZzc) {
            if (bArr[iZzc2] != bArr2[iZzc3]) {
                return false;
            }
            iZzc2++;
            iZzc3++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public final int zzi(int i, int i2, int i3) {
        return zzgye.zzb(i, this.zza, zzc() + i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public final int zzj(int i, int i2, int i3) {
        int iZzc = zzc() + i2;
        return zzhat.zzf(i, this.zza, iZzc, i3 + iZzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public final zzgwj zzk(int i, int i2) {
        int iZzq = zzgwj.zzq(i, i2, zzd());
        return iZzq == 0 ? zzgwj.zzb : new zzgwd(this.zza, zzc() + i, iZzq);
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public final zzgwp zzl() {
        return zzgwp.zzH(this.zza, zzc(), zzd(), true);
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public final String zzm(Charset charset) {
        return new String(this.zza, zzc(), zzd(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public final ByteBuffer zzn() {
        return ByteBuffer.wrap(this.zza, zzc(), zzd()).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public final void zzo(zzgwa zzgwaVar) throws IOException {
        zzgwaVar.zza(this.zza, zzc(), zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzgwj
    public final boolean zzp() {
        int iZzc = zzc();
        return zzhat.zzi(this.zza, iZzc, zzd() + iZzc);
    }
}
