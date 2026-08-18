package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzgwp {
    public static final /* synthetic */ int zzd = 0;
    private static volatile int zze = 100;
    int zza;
    final int zzb = zze;
    zzgwq zzc;

    private zzgwp() {
    }

    public static int zzD(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static int zzE(int i, InputStream inputStream) throws IOException {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE;
        int i3 = 7;
        while (i3 < 32) {
            int i4 = inputStream.read();
            if (i4 == -1) {
                throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            i2 |= (i4 & EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE) << i3;
            if ((i4 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        while (i3 < 64) {
            int i5 = inputStream.read();
            if (i5 == -1) {
                throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if ((i5 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        throw new zzgyg("CodedInputStream encountered a malformed varint.");
    }

    public static long zzF(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public static zzgwp zzG(InputStream inputStream, int i) {
        if (inputStream != null) {
            return new zzgwm(inputStream, 4096, null);
        }
        byte[] bArr = zzgye.zzb;
        int length = bArr.length;
        return zzH(bArr, 0, 0, false);
    }

    public static zzgwp zzH(byte[] bArr, int i, int i2, boolean z) {
        zzgwk zzgwkVar = new zzgwk(bArr, i, i2, z, null);
        try {
            zzgwkVar.zzd(i2);
            return zzgwkVar;
        } catch (zzgyg e) {
            throw new IllegalArgumentException(e);
        }
    }

    public abstract boolean zzA() throws IOException;

    public abstract boolean zzB() throws IOException;

    public abstract double zza() throws IOException;

    public abstract float zzb() throws IOException;

    public abstract int zzc();

    public abstract int zzd(int i) throws zzgyg;

    public abstract int zze() throws IOException;

    public abstract int zzf() throws IOException;

    public abstract int zzg() throws IOException;

    public abstract int zzj() throws IOException;

    public abstract int zzk() throws IOException;

    public abstract int zzl() throws IOException;

    public abstract int zzm() throws IOException;

    public abstract long zzn() throws IOException;

    public abstract long zzo() throws IOException;

    public abstract long zzs() throws IOException;

    public abstract long zzt() throws IOException;

    public abstract long zzu() throws IOException;

    public abstract zzgwj zzv() throws IOException;

    public abstract String zzw() throws IOException;

    public abstract String zzx() throws IOException;

    public abstract void zzy(int i) throws zzgyg;

    public abstract void zzz(int i);

    public /* synthetic */ zzgwp(zzgwo zzgwoVar) {
    }
}
