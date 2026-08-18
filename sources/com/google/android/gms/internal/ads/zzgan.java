package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgan {
    public static char zza(long j) {
        char c = (char) j;
        zzfun.zzh(((long) c) == j, "Out of range: %s", j);
        return c;
    }

    public static char zzb(byte b, byte b2) {
        return (char) ((b << 8) | (b2 & 255));
    }
}
