package com.google.android.gms.internal.ads;

import androidx.exifinterface.media.ExifInterface;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaxe extends zzaxr {
    private static volatile String zzh;
    private static final Object zzi = new Object();

    public zzaxe(zzawd zzawdVar, String str, String str2, zzasc zzascVar, int i, int i2) {
        super(zzawdVar, "IDxTpItZJ7MAk3i5HMuj4prUf4vKa3D9/OjYTr4UdlN9pm9gEn8oAVH4br8ui6F4", "/bkPoQedf8H6er/z22s5Ugb2zQK/aJlVqqMiarhu0YY=", zzascVar, i, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzaxr
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zzd.zzB(ExifInterface.LONGITUDE_EAST);
        if (zzh == null) {
            synchronized (zzi) {
                try {
                    if (zzh == null) {
                        zzh = (String) this.zze.invoke(null, new Object[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        synchronized (this.zzd) {
            this.zzd.zzB(zzh);
        }
    }
}
