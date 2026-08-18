package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
final class zzcop extends zzcom {
    private final Context zzc;
    private final View zzd;

    @Nullable
    private final zzcex zze;
    private final zzfbp zzf;
    private final zzcqx zzg;
    private final zzdiq zzh;
    private final zzddu zzi;
    private final zzhel zzj;
    private final Executor zzk;
    private com.google.android.gms.ads.internal.client.zzs zzl;

    public zzcop(zzcqy zzcqyVar, Context context, zzfbp zzfbpVar, View view, @Nullable zzcex zzcexVar, zzcqx zzcqxVar, zzdiq zzdiqVar, zzddu zzdduVar, zzhel zzhelVar, Executor executor) {
        super(zzcqyVar);
        this.zzc = context;
        this.zzd = view;
        this.zze = zzcexVar;
        this.zzf = zzfbpVar;
        this.zzg = zzcqxVar;
        this.zzh = zzdiqVar;
        this.zzi = zzdduVar;
        this.zzj = zzhelVar;
        this.zzk = executor;
    }

    public static /* synthetic */ void zzj(zzcop zzcopVar) {
        zzbhh zzbhhVarZze = zzcopVar.zzh.zze();
        if (zzbhhVarZze == null) {
            return;
        }
        try {
            zzbhhVarZze.zze((com.google.android.gms.ads.internal.client.zzby) zzcopVar.zzj.zzb(), ObjectWrapper.wrap(zzcopVar.zzc));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("RemoteException when notifyAdLoad is called", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcom
    public final int zza() {
        return this.zza.zzb.zzb.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcom
    public final int zzc() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzhJ)).booleanValue() && this.zzb.zzag) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzhK)).booleanValue()) {
                return 0;
            }
        }
        return this.zza.zzb.zzb.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcom
    public final View zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcom
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzeb zze() {
        try {
            return this.zzg.zza();
        } catch (zzfcq unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcom
    public final zzfbp zzf() {
        com.google.android.gms.ads.internal.client.zzs zzsVar = this.zzl;
        if (zzsVar != null) {
            return zzfcp.zzb(zzsVar);
        }
        zzfbo zzfboVar = this.zzb;
        if (zzfboVar.zzac) {
            for (String str : zzfboVar.zza) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            View view = this.zzd;
            return new zzfbp(view.getWidth(), view.getHeight(), false);
        }
        return (zzfbp) this.zzb.zzr.get(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcom
    public final zzfbp zzg() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzcom
    public final void zzh() {
        this.zzi.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcom
    public final void zzi(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzcex zzcexVar;
        if (viewGroup == null || (zzcexVar = this.zze) == null) {
            return;
        }
        zzcexVar.zzaj(zzcgr.zzc(zzsVar));
        viewGroup.setMinimumHeight(zzsVar.zzc);
        viewGroup.setMinimumWidth(zzsVar.zzf);
        this.zzl = zzsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcqz
    public final void zzk() {
        this.zzk.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcoo
            @Override // java.lang.Runnable
            public final void run() {
                zzcop.zzj(this.zza);
            }
        });
        super.zzk();
    }
}
