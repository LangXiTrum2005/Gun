package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdjt {
    private final zzdow zza;
    private final zzdnl zzb;
    private final zzcnr zzc;
    private final zzdin zzd;

    public zzdjt(zzdow zzdowVar, zzdnl zzdnlVar, zzcnr zzcnrVar, zzdin zzdinVar) {
        this.zza = zzdowVar;
        this.zzb = zzdnlVar;
        this.zzc = zzcnrVar;
        this.zzd = zzdinVar;
    }

    public final View zza() throws zzcfj {
        zzcex zzcexVarZza = this.zza.zza(com.google.android.gms.ads.internal.client.zzs.zzc(), null, null);
        zzcexVarZza.zzF().setVisibility(8);
        zzcexVarZza.zzag("/sendMessageToSdk", new zzbjp() { // from class: com.google.android.gms.internal.ads.zzdjn
            @Override // com.google.android.gms.internal.ads.zzbjp
            public final void zza(Object obj, Map map) {
                this.zza.zzb((zzcex) obj, map);
            }
        });
        zzcexVarZza.zzag("/adMuted", new zzbjp() { // from class: com.google.android.gms.internal.ads.zzdjo
            @Override // com.google.android.gms.internal.ads.zzbjp
            public final void zza(Object obj, Map map) {
                this.zza.zzc((zzcex) obj, map);
            }
        });
        this.zzb.zzm(new WeakReference(zzcexVarZza), "/loadHtml", new zzbjp() { // from class: com.google.android.gms.internal.ads.zzdjp
            @Override // com.google.android.gms.internal.ads.zzbjp
            public final void zza(Object obj, final Map map) {
                zzcex zzcexVar = (zzcex) obj;
                zzcgp zzcgpVarZzN = zzcexVar.zzN();
                final zzdjt zzdjtVar = this.zza;
                zzcgpVarZzN.zzC(new zzcgn() { // from class: com.google.android.gms.internal.ads.zzdjs
                    @Override // com.google.android.gms.internal.ads.zzcgn
                    public final void zza(boolean z, int i, String str, String str2) {
                        zzdjtVar.zzd(map, z, i, str, str2);
                    }
                });
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    zzcexVar.loadData(str, "text/html", C.UTF8_NAME);
                } else {
                    zzcexVar.loadDataWithBaseURL(str2, str, "text/html", C.UTF8_NAME, null);
                }
            }
        });
        this.zzb.zzm(new WeakReference(zzcexVarZza), "/showOverlay", new zzbjp() { // from class: com.google.android.gms.internal.ads.zzdjq
            @Override // com.google.android.gms.internal.ads.zzbjp
            public final void zza(Object obj, Map map) {
                this.zza.zze((zzcex) obj, map);
            }
        });
        this.zzb.zzm(new WeakReference(zzcexVarZza), "/hideOverlay", new zzbjp() { // from class: com.google.android.gms.internal.ads.zzdjr
            @Override // com.google.android.gms.internal.ads.zzbjp
            public final void zza(Object obj, Map map) {
                this.zza.zzf((zzcex) obj, map);
            }
        });
        return zzcexVarZza.zzF();
    }

    public final /* synthetic */ void zzb(zzcex zzcexVar, Map map) {
        this.zzb.zzj("sendMessageToNativeJs", map);
    }

    public final /* synthetic */ void zzc(zzcex zzcexVar, Map map) {
        this.zzd.zzh();
    }

    public final /* synthetic */ void zzd(Map map, boolean z, int i, String str, String str2) {
        HashMap mapV = AbstractC3950lJ.v("messageType", "htmlLoaded");
        mapV.put("id", (String) map.get("id"));
        this.zzb.zzj("sendMessageToNativeJs", mapV);
    }

    public final /* synthetic */ void zze(zzcex zzcexVar, Map map) {
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Showing native ads overlay.");
        zzcexVar.zzF().setVisibility(0);
        this.zzc.zze(true);
    }

    public final /* synthetic */ void zzf(zzcex zzcexVar, Map map) {
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Hiding native ads overlay.");
        zzcexVar.zzF().setVisibility(8);
        this.zzc.zze(false);
    }
}
