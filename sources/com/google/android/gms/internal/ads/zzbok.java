package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
public final class zzbok implements zzbnw {
    private final zzbny zza;
    private final zzbnz zzb;
    private final zzbns zzc;
    private final String zzd;

    public zzbok(zzbns zzbnsVar, String str, zzbnz zzbnzVar, zzbny zzbnyVar) {
        this.zzc = zzbnsVar;
        this.zzd = str;
        this.zzb = zzbnzVar;
        this.zza = zzbnyVar;
    }

    public static /* bridge */ /* synthetic */ void zzd(zzbok zzbokVar, zzbnm zzbnmVar, zzbnt zzbntVar, Object obj, zzcab zzcabVar) {
        try {
            com.google.android.gms.ads.internal.zzv.zzq();
            String string = UUID.randomUUID().toString();
            zzbjo.zzo.zzc(string, new zzboj(zzbokVar, zzbnmVar, zzcabVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", string);
            jSONObject.put("args", zzbokVar.zzb.zzb(obj));
            zzbntVar.zzl(zzbokVar.zzd, jSONObject);
        } catch (Exception e) {
            try {
                zzcabVar.zzd(e);
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to invokeJavascript", e);
            } finally {
                zzbnmVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgbo
    public final AI zza(@Nullable Object obj) throws Exception {
        return zzb(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzbnw
    public final AI zzb(Object obj) {
        zzcab zzcabVar = new zzcab();
        zzbnm zzbnmVarZzb = this.zzc.zzb(null);
        com.google.android.gms.ads.internal.util.zze.zza("callJs > getEngine: Promise created");
        zzbnmVarZzb.zzj(new zzboh(this, zzbnmVarZzb, obj, zzcabVar), new zzboi(this, zzcabVar, zzbnmVarZzb));
        return zzcabVar;
    }
}
