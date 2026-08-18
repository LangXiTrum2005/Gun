package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzgwj implements Iterable<Byte>, Serializable {
    public static final zzgwj zzb = new zzgwg(zzgye.zzb);
    private int zza = 0;

    static {
        int i = zzgvw.zza;
    }

    private static zzgwj zzc(Iterator it, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(AbstractC5044xl.g("length (", i, ") must be >= 1"));
        }
        if (i == 1) {
            return (zzgwj) it.next();
        }
        int i2 = i >>> 1;
        zzgwj zzgwjVarZzc = zzc(it, i2);
        zzgwj zzgwjVarZzc2 = zzc(it, i - i2);
        if (Integer.MAX_VALUE - zzgwjVarZzc.zzd() >= zzgwjVarZzc2.zzd()) {
            return zzgzu.zzC(zzgwjVarZzc, zzgwjVarZzc2);
        }
        throw new IllegalArgumentException(AbstractC3888ke0.h("ByteString would be too long: ", zzgwjVarZzc.zzd(), "+", zzgwjVarZzc2.zzd()));
    }

    public static int zzq(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(AbstractC5044xl.g("Beginning index: ", i, " < 0"));
        }
        if (i2 < i) {
            throw new IndexOutOfBoundsException(AbstractC3888ke0.h("Beginning index larger than ending index: ", i, ", ", i2));
        }
        throw new IndexOutOfBoundsException(AbstractC3888ke0.h("End index: ", i2, " >= ", i3));
    }

    public static zzgwh zzt() {
        return new zzgwh(128);
    }

    public static zzgwj zzu(Iterable iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = ((Collection) iterable).size();
        } else {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? zzb : zzc(iterable.iterator(), size);
    }

    public static zzgwj zzv(byte[] bArr, int i, int i2) {
        zzq(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new zzgwg(bArr2);
    }

    public static zzgwj zzw(String str) {
        return new zzgwg(str.getBytes(zzgye.zza));
    }

    public static void zzy(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i >= 0) {
                throw new ArrayIndexOutOfBoundsException(AbstractC3888ke0.h("Index > length: ", i, ", ", i2));
            }
            throw new ArrayIndexOutOfBoundsException(AbstractC3950lJ.p("Index < 0: ", i));
        }
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iZzi = this.zza;
        if (iZzi == 0) {
            int iZzd = zzd();
            iZzi = zzi(iZzd, 0, iZzd);
            if (iZzi == 0) {
                iZzi = 1;
            }
            this.zza = iZzi;
        }
        return iZzi;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iZzd = zzd();
        String strZza = zzd() <= 50 ? zzhaf.zza(this) : zzhaf.zza(zzk(0, 47)).concat("...");
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(iZzd);
        sb.append(" contents=\"");
        return DM.m(sb, strZza, "\">");
    }

    public final byte[] zzA() {
        int iZzd = zzd();
        if (iZzd == 0) {
            return zzgye.zzb;
        }
        byte[] bArr = new byte[iZzd];
        zze(bArr, 0, 0, iZzd);
        return bArr;
    }

    public abstract byte zza(int i);

    public abstract byte zzb(int i);

    public abstract int zzd();

    public abstract void zze(byte[] bArr, int i, int i2, int i3);

    public abstract int zzf();

    public abstract boolean zzh();

    public abstract int zzi(int i, int i2, int i3);

    public abstract int zzj(int i, int i2, int i3);

    public abstract zzgwj zzk(int i, int i2);

    public abstract zzgwp zzl();

    public abstract String zzm(Charset charset);

    public abstract ByteBuffer zzn();

    public abstract void zzo(zzgwa zzgwaVar) throws IOException;

    public abstract boolean zzp();

    public final int zzr() {
        return this.zza;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: zzs, reason: merged with bridge method [inline-methods] */
    public zzgwe iterator() {
        return new zzgwb(this);
    }

    public final String zzx() {
        return zzd() == 0 ? "" : zzm(zzgye.zza);
    }

    @Deprecated
    public final void zzz(byte[] bArr, int i, int i2, int i3) {
        zzq(0, i3, zzd());
        zzq(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            zze(bArr, 0, i2, i3);
        }
    }
}
