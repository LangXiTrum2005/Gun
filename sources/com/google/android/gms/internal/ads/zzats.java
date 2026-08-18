package com.google.android.gms.internal.ads;

import androidx.exifinterface.media.ExifInterface;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zzats extends zzatq {
    public String zza;
    public long zzb;
    public String zzc;
    public String zzd;
    public String zze;

    public zzats() {
        this.zza = ExifInterface.LONGITUDE_EAST;
        this.zzb = -1L;
        this.zzc = ExifInterface.LONGITUDE_EAST;
        this.zzd = ExifInterface.LONGITUDE_EAST;
        this.zze = ExifInterface.LONGITUDE_EAST;
    }

    @Override // com.google.android.gms.internal.ads.zzatq
    public final HashMap zzb() {
        HashMap map = new HashMap();
        map.put(0, this.zza);
        map.put(4, this.zze);
        map.put(3, this.zzd);
        map.put(2, this.zzc);
        map.put(1, Long.valueOf(this.zzb));
        return map;
    }

    public zzats(String str) {
        String str2 = ExifInterface.LONGITUDE_EAST;
        this.zza = ExifInterface.LONGITUDE_EAST;
        this.zzb = -1L;
        this.zzc = ExifInterface.LONGITUDE_EAST;
        this.zzd = ExifInterface.LONGITUDE_EAST;
        this.zze = ExifInterface.LONGITUDE_EAST;
        HashMap mapZza = zzatq.zza(str);
        if (mapZza != null) {
            this.zza = mapZza.get(0) == null ? ExifInterface.LONGITUDE_EAST : (String) mapZza.get(0);
            this.zzb = mapZza.get(1) != null ? ((Long) mapZza.get(1)).longValue() : -1L;
            this.zzc = mapZza.get(2) == null ? ExifInterface.LONGITUDE_EAST : (String) mapZza.get(2);
            this.zzd = mapZza.get(3) == null ? ExifInterface.LONGITUDE_EAST : (String) mapZza.get(3);
            this.zze = mapZza.get(4) != null ? (String) mapZza.get(4) : str2;
        }
    }
}
