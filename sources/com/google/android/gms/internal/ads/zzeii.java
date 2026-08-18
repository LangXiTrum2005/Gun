package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import com.google.ads.mediation.admob.AdMobAdapter;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeii implements zzecw {
    private final zzecy zza;
    private final zzedc zzb;
    private final zzfgn zzc;
    private final zzgcs zzd;

    public zzeii(zzfgn zzfgnVar, zzgcs zzgcsVar, zzecy zzecyVar, zzedc zzedcVar) {
        this.zzc = zzfgnVar;
        this.zzd = zzgcsVar;
        this.zzb = zzedcVar;
        this.zza = zzecyVar;
    }

    @VisibleForTesting
    public static final String zze(String str, int i) {
        return "Error from: " + str + ", code: " + i;
    }

    @Override // com.google.android.gms.internal.ads.zzecw
    public final AI zza(final zzfca zzfcaVar, final zzfbo zzfboVar) {
        final zzecz zzeczVarZza;
        Iterator it = zzfboVar.zzt.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzeczVarZza = null;
                break;
            }
            try {
                zzeczVarZza = this.zza.zza((String) it.next(), zzfboVar.zzv);
                break;
            } catch (zzfcq unused) {
            }
        }
        if (zzeczVarZza == null) {
            return zzgch.zzg(new zzefy("Unable to instantiate mediation adapter class."));
        }
        zzcab zzcabVar = new zzcab();
        zzeczVarZza.zzc.zza(new zzeih(this, zzeczVarZza, zzcabVar));
        if (zzfboVar.zzM) {
            Bundle bundle = zzfcaVar.zza.zza.zzd.zzm;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        zzfgn zzfgnVar = this.zzc;
        return zzffx.zzd(new zzffs() { // from class: com.google.android.gms.internal.ads.zzeif
            @Override // com.google.android.gms.internal.ads.zzffs
            public final void zza() throws Exception {
                this.zza.zzd(zzfcaVar, zzfboVar, zzeczVarZza);
            }
        }, this.zzd, zzfgh.ADAPTER_LOAD_AD_SYN, zzfgnVar).zzb(zzfgh.ADAPTER_LOAD_AD_ACK).zzd(zzcabVar).zzb(zzfgh.ADAPTER_WRAP_ADAPTER).zze(new zzffr() { // from class: com.google.android.gms.internal.ads.zzeig
            @Override // com.google.android.gms.internal.ads.zzffr
            public final Object zza(Object obj) {
                return this.zza.zzc(zzfcaVar, zzfboVar, zzeczVarZza, (Void) obj);
            }
        }).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzecw
    public final boolean zzb(zzfca zzfcaVar, zzfbo zzfboVar) {
        return !zzfboVar.zzt.isEmpty();
    }

    public final /* synthetic */ Object zzc(zzfca zzfcaVar, zzfbo zzfboVar, zzecz zzeczVar, Void r4) throws Exception {
        return this.zzb.zza(zzfcaVar, zzfboVar, zzeczVar);
    }

    public final /* synthetic */ void zzd(zzfca zzfcaVar, zzfbo zzfboVar, zzecz zzeczVar) throws Exception {
        this.zzb.zzb(zzfcaVar, zzfboVar, zzeczVar);
    }
}
