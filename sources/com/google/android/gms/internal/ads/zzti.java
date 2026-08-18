package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzti implements zzuz {
    private final zzacs zza;

    @Nullable
    private zzacn zzb;

    @Nullable
    private zzaco zzc;

    public zzti(zzacs zzacsVar) {
        this.zza = zzacsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final int zza(zzadj zzadjVar) throws IOException {
        zzacn zzacnVar = this.zzb;
        zzacnVar.getClass();
        zzaco zzacoVar = this.zzc;
        zzacoVar.getClass();
        return zzacnVar.zzb(zzacoVar, zzadjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final long zzb() {
        zzaco zzacoVar = this.zzc;
        if (zzacoVar != null) {
            return zzacoVar.zzf();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final void zzc() {
        zzacn zzacnVar = this.zzb;
        if (zzacnVar != null && (zzacnVar instanceof zzahs)) {
            ((zzahs) zzacnVar).zza();
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004f  */
    @Override // com.google.android.gms.internal.ads.zzuz
    public final void zzd(zzl zzlVar, Uri uri, Map map, long j, long j2, zzacq zzacqVar) throws IOException {
        zzacc zzaccVar = new zzacc(zzlVar, j, j2);
        this.zzc = zzaccVar;
        if (this.zzb != null) {
            return;
        }
        zzacn[] zzacnVarArrZza = this.zza.zza(uri, map);
        int length = zzacnVarArrZza.length;
        zzfxk zzfxkVarZzi = zzfxn.zzi(length);
        if (length == 1) {
            this.zzb = zzacnVarArrZza[0];
        } else {
            for (zzacn zzacnVar : zzacnVarArrZza) {
                try {
                    if (zzacnVar.zzi(zzaccVar)) {
                        this.zzb = zzacnVar;
                        zzcw.zzf(true);
                        zzaccVar.zzj();
                        break;
                    } else {
                        zzfxkVarZzi.zzh(zzacnVar.zzd());
                        boolean z = this.zzb != null || zzaccVar.zzf() == j;
                        zzcw.zzf(z);
                        zzaccVar.zzj();
                    }
                } catch (EOFException unused) {
                    if (this.zzb != null || zzaccVar.zzf() == j) {
                    }
                } catch (Throwable th) {
                    zzcw.zzf(this.zzb != null || zzaccVar.zzf() == j);
                    zzaccVar.zzj();
                    throw th;
                }
                zzcw.zzf(z);
                zzaccVar.zzj();
            }
            if (this.zzb == null) {
                Iterator it = zzfyd.zzb(zzfxn.zzm(zzacnVarArrZza), new zzfuc() { // from class: com.google.android.gms.internal.ads.zzth
                    @Override // com.google.android.gms.internal.ads.zzfuc
                    public final Object apply(Object obj) {
                        zzacn zzacnVar2 = (zzacn) obj;
                        zzacnVar2.zzc();
                        return zzacnVar2.getClass().getSimpleName();
                    }
                }).iterator();
                StringBuilder sb = new StringBuilder();
                zzfuf.zzc(sb, it, ", ");
                throw new zzwk(DM.B("None of the available extractors (", sb.toString(), ") could read the stream."), uri, zzfxkVarZzi.zzi());
            }
        }
        this.zzb.zze(zzacqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final void zze() {
        if (this.zzb != null) {
            this.zzb = null;
        }
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final void zzf(long j, long j2) {
        zzacn zzacnVar = this.zzb;
        zzacnVar.getClass();
        zzacnVar.zzf(j, j2);
    }
}
