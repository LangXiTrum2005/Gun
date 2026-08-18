package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzgxk implements zzgza {
    private static final zzgxk zza = new zzgxk();

    private zzgxk() {
    }

    public static zzgxk zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public final zzgyz zzb(Class cls) {
        if (!zzgxr.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (zzgyz) zzgxr.zzbh(cls.asSubclass(zzgxr.class)).zzbO();
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgza
    public final boolean zzc(Class cls) {
        return zzgxr.class.isAssignableFrom(cls);
    }
}
