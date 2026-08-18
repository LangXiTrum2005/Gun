package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfkt extends zzfkp {
    private final zzfkr zza;
    private zzfnb zzc;
    private zzfma zzd;
    private final String zzg;
    private final zzflo zzb = new zzflo();
    private boolean zze = false;
    private boolean zzf = false;

    public zzfkt(zzfkq zzfkqVar, zzfkr zzfkrVar, String str) {
        this.zza = zzfkrVar;
        this.zzg = str;
        zzk(null);
        if (zzfkrVar.zzd() == zzfks.HTML || zzfkrVar.zzd() == zzfks.JAVASCRIPT) {
            this.zzd = new zzfmb(str, zzfkrVar.zza());
        } else {
            this.zzd = new zzfme(str, zzfkrVar.zzi(), null);
        }
        this.zzd.zzo();
        zzflk.zza().zzd(this);
        this.zzd.zzf(zzfkqVar);
    }

    private final void zzk(@Nullable View view) {
        this.zzc = new zzfnb(view);
    }

    @Override // com.google.android.gms.internal.ads.zzfkp
    public final void zzb(View view, zzfkw zzfkwVar, @Nullable String str) {
        if (this.zzf) {
            return;
        }
        this.zzb.zzb(view, zzfkwVar, "Ad overlay");
    }

    @Override // com.google.android.gms.internal.ads.zzfkp
    public final void zzc() {
        if (this.zzf) {
            return;
        }
        this.zzc.clear();
        if (!this.zzf) {
            this.zzb.zzc();
        }
        this.zzf = true;
        this.zzd.zze();
        zzflk.zza().zze(this);
        this.zzd.zzc();
        this.zzd = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfkp
    public final void zzd(@Nullable View view) {
        if (this.zzf || zzf() == view) {
            return;
        }
        zzk(view);
        this.zzd.zzb();
        Collection<zzfkt> collectionZzc = zzflk.zza().zzc();
        if (collectionZzc == null || collectionZzc.isEmpty()) {
            return;
        }
        for (zzfkt zzfktVar : collectionZzc) {
            if (zzfktVar != this && zzfktVar.zzf() == view) {
                zzfktVar.zzc.clear();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfkp
    public final void zze() {
        if (this.zze || this.zzd == null) {
            return;
        }
        this.zze = true;
        zzflk.zza().zzf(this);
        this.zzd.zzl(zzfls.zzb().zza());
        this.zzd.zzg(zzfli.zza().zzb());
        this.zzd.zzi(this, this.zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View zzf() {
        return (View) this.zzc.get();
    }

    public final zzfma zzg() {
        return this.zzd;
    }

    public final String zzh() {
        return this.zzg;
    }

    public final List zzi() {
        return this.zzb.zza();
    }

    public final boolean zzj() {
        return this.zze && !this.zzf;
    }
}
