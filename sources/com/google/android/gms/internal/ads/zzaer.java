package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzaer extends zzaby {
    public zzaer(final zzacy zzacyVar, int i, long j, long j2) {
        long j3;
        Objects.requireNonNull(zzacyVar);
        zzabv zzabvVar = new zzabv() { // from class: com.google.android.gms.internal.ads.zzaeo
            @Override // com.google.android.gms.internal.ads.zzabv
            public final long zza(long j4) {
                return zzacyVar.zzb(j4);
            }
        };
        zzaep zzaepVar = new zzaep(zzacyVar, i, null);
        long jZza = zzacyVar.zza();
        long j4 = zzacyVar.zzj;
        int i2 = zzacyVar.zzd;
        if (i2 > 0) {
            j3 = ((((long) i2) + ((long) zzacyVar.zzc)) / 2) + 1;
        } else {
            int i3 = zzacyVar.zza;
            int i4 = zzacyVar.zzb;
            long j5 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
            if (i3 == i4 && i3 > 0) {
                j5 = i3;
            }
            j3 = (((j5 * ((long) zzacyVar.zzg)) * ((long) zzacyVar.zzh)) / 8) + 64;
        }
        super(zzabvVar, zzaepVar, jZza, 0L, j4, j, j2, j3, Math.max(6, zzacyVar.zzc));
    }
}
