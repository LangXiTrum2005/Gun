package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class zzaah implements zzcc {
    private static final Executor zza = new Executor() { // from class: com.google.android.gms.internal.ads.zzzu
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
        }
    };
    private final Context zzb;
    private final zzaab zzc;
    private final zzaal zzd;
    private final zzaaq zze;
    private final zzbl zzf;
    private final List zzg;
    private final zzabh zzh;
    private final zzcx zzi;
    private final CopyOnWriteArraySet zzj;
    private zzaai zzk;
    private zzdh zzl;

    @Nullable
    private Pair zzm;
    private int zzn;
    private int zzo;

    public /* synthetic */ zzaah(zzzw zzzwVar, zzaag zzaagVar) {
        Context context = zzzwVar.zza;
        this.zzb = context;
        zzaab zzaabVar = new zzaab(this, context);
        this.zzc = zzaabVar;
        zzcx zzcxVar = zzzwVar.zzf;
        this.zzi = zzcxVar;
        zzaal zzaalVar = zzzwVar.zzb;
        this.zzd = zzaalVar;
        zzaalVar.zzk(zzcxVar);
        zzaaq zzaaqVar = new zzaaq(new zzzx(this, null), zzaalVar);
        this.zze = zzaaqVar;
        zzbl zzblVar = zzzwVar.zzd;
        zzcw.zzb(zzblVar);
        this.zzf = zzblVar;
        this.zzg = zzzwVar.zze;
        this.zzh = new zzzh(zzaalVar, zzaaqVar);
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.zzj = copyOnWriteArraySet;
        this.zzo = 0;
        new zzz().zzag();
        copyOnWriteArraySet.add(zzaabVar);
    }

    public static /* bridge */ /* synthetic */ zzcb zzc(zzaah zzaahVar, zzab zzabVar) throws zzabg {
        zzcw.zzf(zzaahVar.zzo == 0);
        zzk zzkVarZzw = zzw(zzabVar.zzC);
        if (zzkVarZzw.zzd == 7 && zzei.zza < 34) {
            zzi zziVarZzc = zzkVarZzw.zzc();
            zziVarZzc.zzd(6);
            zzkVarZzw = zziVarZzc.zzg();
        }
        zzk zzkVar = zzkVarZzw;
        zzcx zzcxVar = zzaahVar.zzi;
        Looper looperMyLooper = Looper.myLooper();
        zzcw.zzb(looperMyLooper);
        final zzdh zzdhVarZzd = zzcxVar.zzd(looperMyLooper, null);
        zzaahVar.zzl = zzdhVarZzd;
        try {
            zzbl zzblVar = zzaahVar.zzf;
            Context context = zzaahVar.zzb;
            zzn zznVar = zzn.zza;
            Objects.requireNonNull(zzdhVarZzd);
            zzblVar.zza(context, zzkVar, zznVar, zzaahVar, new Executor() { // from class: com.google.android.gms.internal.ads.zzzv
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    zzdhVarZzd.zzh(runnable);
                }
            }, zzfxn.zzn(), 0L);
            Pair pair = zzaahVar.zzm;
            if (pair == null) {
                throw null;
            }
            zzdz zzdzVar = (zzdz) pair.second;
            zzdzVar.zzb();
            zzdzVar.zza();
            throw null;
        } catch (zzbz e) {
            throw new zzabg(e, zzabVar);
        }
    }

    public static /* bridge */ /* synthetic */ void zzl(final zzaah zzaahVar, boolean z) {
        if (zzaahVar.zzo == 1) {
            zzaahVar.zzn++;
            zzaahVar.zzh.zzd(z);
            zzdh zzdhVar = zzaahVar.zzl;
            zzcw.zzb(zzdhVar);
            zzdhVar.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzzt
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzr();
                }
            });
        }
    }

    public static /* bridge */ /* synthetic */ boolean zzu(zzaah zzaahVar, long j) {
        return zzaahVar.zzn == 0 && zzaahVar.zze.zze(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzk zzw(@Nullable zzk zzkVar) {
        return (zzkVar == null || !zzkVar.zzf()) ? zzk.zza : zzkVar;
    }

    public final zzabh zzh() {
        return this.zzc;
    }

    public final void zzq() {
        zzdz zzdzVar = zzdz.zza;
        zzdzVar.zzb();
        zzdzVar.zza();
        this.zzm = null;
    }

    public final /* synthetic */ void zzr() {
        this.zzn--;
    }

    public final void zzs() {
        if (this.zzo == 2) {
            return;
        }
        zzdh zzdhVar = this.zzl;
        if (zzdhVar != null) {
            zzdhVar.zze(null);
        }
        this.zzm = null;
        this.zzo = 2;
    }

    public final void zzt(Surface surface, zzdz zzdzVar) {
        Pair pair = this.zzm;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((zzdz) this.zzm.second).equals(zzdzVar)) {
            return;
        }
        this.zzm = Pair.create(surface, zzdzVar);
        zzdzVar.zzb();
        zzdzVar.zza();
    }
}
