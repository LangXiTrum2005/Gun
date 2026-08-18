package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Surface;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
final class zzaab implements zzabh, zzaac {
    final /* synthetic */ zzaah zza;
    private final int zzb;
    private final ArrayList zzc;
    private final zzaaj zzd;

    @Nullable
    private zzab zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private boolean zzj;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private long zzn;
    private zzabe zzo;
    private Executor zzp;

    public zzaab(zzaah zzaahVar, Context context) {
        this.zza = zzaahVar;
        this.zzb = true != zzei.zzK(context) ? 5 : 1;
        this.zzc = new ArrayList();
        this.zzd = new zzaaj();
        this.zzk = C.TIME_UNSET;
        this.zzo = zzabe.zzb;
        this.zzp = zzaah.zza;
    }

    private final void zzB() {
        if (this.zze == null) {
            return;
        }
        new ArrayList(this.zzc);
        zzab zzabVar = this.zze;
        zzabVar.getClass();
        zzz zzzVarZzb = zzabVar.zzb();
        zzzVarZzb.zzB(zzaah.zzw(zzabVar.zzC));
        zzzVarZzb.zzag();
        zzcw.zzb(null);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzaac
    public final void zzA(zzaah zzaahVar, final zzcd zzcdVar) {
        final zzabe zzabeVar = this.zzo;
        this.zzp.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzy
            @Override // java.lang.Runnable
            public final void run() {
                zzabeVar.zzc(this.zza, zzcdVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final Surface zza() {
        zzcw.zzf(false);
        zzcw.zzb(null);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzb() {
        this.zza.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzc() {
        this.zza.zzh.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzd(boolean z) {
        this.zzl = false;
        this.zzk = C.TIME_UNSET;
        zzaah.zzl(this.zza, z);
        this.zzn = C.TIME_UNSET;
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zze(zzab zzabVar) throws zzabg {
        zzaah.zzc(this.zza, zzabVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzf(boolean z) {
        this.zza.zzh.zzf(z);
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzg(int i, zzab zzabVar) {
        zzcw.zzf(false);
        this.zze = zzabVar;
        if (this.zzl) {
            zzcw.zzf(this.zzk != C.TIME_UNSET);
            this.zzm = true;
            this.zzn = this.zzk;
        } else {
            zzB();
            this.zzl = true;
            this.zzm = false;
            this.zzn = C.TIME_UNSET;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzh() {
        this.zza.zzh.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzi(boolean z) {
        this.zza.zzh.zzi(z);
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzj() {
        this.zza.zzh.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzk() {
        this.zza.zzh.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzl() {
        this.zza.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzm(long j, long j2) throws zzabg {
        this.zza.zzh.zzm(j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzn(int i) {
        this.zza.zzh.zzn(i);
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzo(zzabe zzabeVar, Executor executor) {
        this.zzo = zzabeVar;
        this.zzp = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzp(Surface surface, zzdz zzdzVar) {
        this.zza.zzt(surface, zzdzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzq(@FloatRange(from = 0.0d, fromInclusive = false) float f) {
        this.zza.zzh.zzq(f);
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzr(long j, long j2, long j3, long j4) {
        boolean z = this.zzj;
        boolean z2 = true;
        if (this.zzg == j2 && this.zzh == j3) {
            z2 = false;
        }
        this.zzj = z | z2;
        this.zzf = j;
        this.zzg = j2;
        this.zzh = j3;
        this.zzi = j4;
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzs(List list) {
        if (this.zzc.equals(list)) {
            return;
        }
        this.zzc.clear();
        this.zzc.addAll(list);
        this.zzc.addAll(this.zza.zzg);
        zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final void zzt(zzaai zzaaiVar) {
        this.zza.zzk = zzaaiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final boolean zzu(long j, boolean z, long j2, long j3, zzabf zzabfVar) throws zzabg {
        zzcw.zzf(false);
        long j4 = j - this.zzh;
        try {
            if (this.zza.zzd.zza(j4, j2, j3, this.zzf, z, this.zzd) != 4) {
                if (j4 < this.zzi && !z) {
                    zzzm zzzmVar = (zzzm) zzabfVar;
                    zzzmVar.zzd.zzaQ(zzzmVar.zza, zzzmVar.zzb, zzzmVar.zzc);
                    return true;
                }
                this.zza.zzh.zzm(j2, j3);
                if (this.zzm) {
                    long j5 = this.zzn;
                    if (j5 == C.TIME_UNSET || zzaah.zzu(this.zza, j5)) {
                        zzB();
                        this.zzm = false;
                        this.zzn = C.TIME_UNSET;
                    }
                }
                zzcw.zzb(null);
                throw null;
            }
            return false;
        } catch (zzib e) {
            zzab zzabVar = this.zze;
            zzcw.zzb(zzabVar);
            throw new zzabg(e, zzabVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final boolean zzv() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final boolean zzw() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzabh
    public final boolean zzx(boolean z) {
        return this.zza.zzh.zzx(false);
    }

    @Override // com.google.android.gms.internal.ads.zzaac
    public final void zzy(zzaah zzaahVar) {
        final zzabe zzabeVar = this.zzo;
        this.zzp.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzz
            @Override // java.lang.Runnable
            public final void run() {
                zzabeVar.zza(this.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzaac
    public final void zzz(zzaah zzaahVar) {
        final zzabe zzabeVar = this.zzo;
        this.zzp.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaaa
            @Override // java.lang.Runnable
            public final void run() {
                zzabeVar.zzb(this.zza);
            }
        });
    }
}
