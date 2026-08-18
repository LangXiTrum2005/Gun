package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes3.dex */
final class zzmo {
    private static final zzmn zza;
    private static final zzmn zzb;

    static {
        zzmn zzmnVar;
        try {
            zzmnVar = (zzmn) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzmnVar = null;
        }
        zza = zzmnVar;
        zzb = new zzmn();
    }

    public static zzmn zza() {
        return zza;
    }

    public static zzmn zzb() {
        return zzb;
    }
}
