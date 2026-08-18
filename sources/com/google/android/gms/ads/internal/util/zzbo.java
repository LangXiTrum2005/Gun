package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.internal.ads.zzaou;
import com.google.android.gms.internal.ads.zzapp;
import com.google.android.gms.internal.ads.zzaqt;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzcab;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
public final class zzbo {
    private static zzapp zza;
    private static final Object zzb = new Object();

    /* JADX WARN: Code duplicated, block: B:16:0x0036 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:7:0x0010, B:9:0x0014, B:11:0x001d, B:13:0x002f, B:17:0x003b, B:16:0x0036, B:18:0x003d), top: B:22:0x0010 }] */
    public zzbo(Context context) {
        zzapp zzappVarZza;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (zzb) {
            try {
                if (zza == null) {
                    zzbcl.zza(context);
                    if (ClientLibraryUtils.isPackageSide()) {
                        zzappVarZza = zzaqt.zza(context, null);
                    } else {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzew)).booleanValue()) {
                            zzappVarZza = zzaz.zzb(context);
                        } else {
                            zzappVarZza = zzaqt.zza(context, null);
                        }
                    }
                    zza = zzappVarZza;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final AI zza(String str) {
        zzcab zzcabVar = new zzcab();
        zza.zza(new zzbm(str, null, zzcabVar));
        return zzcabVar;
    }

    public final AI zzb(int i, String str, @Nullable Map map, @Nullable byte[] bArr) {
        zzbk zzbkVar = new zzbk(null);
        zzbi zzbiVar = new zzbi(this, str, zzbkVar);
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
        zzbj zzbjVar = new zzbj(this, i, str, zzbkVar, zzbiVar, bArr, map, zzlVar);
        if (com.google.android.gms.ads.internal.util.client.zzl.zzk()) {
            try {
                zzlVar.zzd(str, "GET", zzbjVar.zzl(), zzbjVar.zzx());
            } catch (zzaou e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj(e.getMessage());
            }
        }
        zza.zza(zzbjVar);
        return zzbkVar;
    }
}
