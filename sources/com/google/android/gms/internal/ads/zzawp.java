package com.google.android.gms.internal.ads;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzawp extends zzaxr {
    public zzawp(zzawd zzawdVar, String str, String str2, zzasc zzascVar, int i, int i2) {
        super(zzawdVar, "IuqhWQe4tlbVfr7yvxlVNsd5e/l7lVHvlqpkvK+6tt5EoeON2tkyyhuv1x7KBAeM", "CXimWsgId9Q4NJ7Th/z0oZbD0fgxUqQs1m5HYkmnDaE=", zzascVar, i, 49);
    }

    @Override // com.google.android.gms.internal.ads.zzaxr
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zzd.zzaa(3);
        try {
            int i = 1;
            boolean zBooleanValue = ((Boolean) this.zze.invoke(null, this.zza.zzb())).booleanValue();
            zzasc zzascVar = this.zzd;
            if (true == zBooleanValue) {
                i = 2;
            }
            zzascVar.zzaa(i);
        } catch (InvocationTargetException e) {
            if (!(e.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e;
            }
        }
    }
}
