package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
class zzfrd {
    static final String zza = new UUID(0, 0).toString();
    final zzfrc zzb;
    final zzfrb zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;
    private final String zzh;

    public zzfrd(Context context, String str, String str2, String str3) {
        this.zzb = zzfrc.zzb(context);
        this.zzc = zzfrb.zza(context);
        this.zzd = str;
        this.zze = str.concat("_3p");
        this.zzf = str2;
        this.zzg = str2.concat("_3p");
        this.zzh = str3;
    }

    private final String zzh(String str, String str2, String str3) {
        if (str2 != null && str3 != null) {
            return UUID.nameUUIDFromBytes(DM.i(str, str2, str3).getBytes(StandardCharsets.UTF_8)).toString();
        }
        StringBuilder sbQ = DM.q(this.zzh, ": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ");
        sbQ.append(str2 == null ? "null" : "not null");
        sbQ.append(", hashKey is ");
        sbQ.append(str3 == null ? "null" : "not null");
        throw new IllegalArgumentException(sbQ.toString());
    }

    public final long zza(boolean z) {
        return this.zzb.zza(z ? this.zzg : this.zzf, -1L);
    }

    public final zzfra zzb(@Nullable String str, @Nullable String str2, long j, boolean z) throws IOException {
        if (str != null) {
            try {
                UUID.fromString(str);
                if (!str.equals(zza)) {
                    String strZze = zze(true);
                    String strZzc = this.zzb.zzc("paid_3p_hash_key", null);
                    if (strZze != null && strZzc != null && !strZze.equals(zzh(str, str2, strZzc))) {
                        return zzc(str, str2);
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            return new zzfra();
        }
        boolean z2 = str != null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            throw new IllegalStateException(this.zzh.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        long jZza = zza(z2);
        if (jZza != -1) {
            if (jCurrentTimeMillis < jZza) {
                this.zzb.zzd(z2 ? this.zzg : this.zzf, Long.valueOf(jCurrentTimeMillis));
            } else if (jCurrentTimeMillis >= jZza + j) {
                return zzc(str, str2);
            }
        }
        String strZze2 = zze(z2);
        return (strZze2 != null || z) ? new zzfra(strZze2, zza(z2)) : zzc(str, str2);
    }

    public final zzfra zzc(String str, String str2) throws IOException {
        if (str == null) {
            return zzd(UUID.randomUUID().toString(), false);
        }
        String string = UUID.randomUUID().toString();
        this.zzb.zzd("paid_3p_hash_key", string);
        return zzd(zzh(str, str2, string), true);
    }

    public final zzfra zzd(String str, boolean z) throws IOException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            throw new IllegalStateException(this.zzh.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        this.zzb.zzd(z ? this.zzg : this.zzf, Long.valueOf(jCurrentTimeMillis));
        this.zzb.zzd(z ? this.zze : this.zzd, str);
        return new zzfra(str, jCurrentTimeMillis);
    }

    public final String zze(boolean z) {
        return this.zzb.zzc(z ? this.zze : this.zzd, null);
    }

    public final void zzf(boolean z) throws IOException {
        this.zzb.zze(z ? this.zzg : this.zzf);
        this.zzb.zze(z ? this.zze : this.zzd);
    }

    public final boolean zzg(boolean z) {
        return this.zzb.zzg(this.zzd);
    }
}
