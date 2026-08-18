package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzamg implements zzanw {
    private final List zza;

    public zzamg(int i, List list) {
        this.zza = list;
    }

    private final zzann zzc(zzanv zzanvVar) {
        return new zzann(zze(zzanvVar));
    }

    private final zzaoa zzd(zzanv zzanvVar) {
        return new zzaoa(zze(zzanvVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4 */
    private final List zze(zzanv zzanvVar) {
        String str;
        int i;
        List listSingletonList;
        zzdy zzdyVar = new zzdy(zzanvVar.zze);
        ArrayList arrayList = this.zza;
        while (zzdyVar.zzb() > 0) {
            int iZzm = zzdyVar.zzm();
            int iZzd = zzdyVar.zzd() + zzdyVar.zzm();
            if (iZzm == 134) {
                arrayList = new ArrayList();
                int iZzm2 = zzdyVar.zzm() & 31;
                for (int i2 = 0; i2 < iZzm2; i2++) {
                    String strZzB = zzdyVar.zzB(3, StandardCharsets.UTF_8);
                    int iZzm3 = zzdyVar.zzm();
                    boolean z = (iZzm3 & 128) != 0;
                    if (z) {
                        i = iZzm3 & 63;
                        str = MimeTypes.APPLICATION_CEA708;
                    } else {
                        str = MimeTypes.APPLICATION_CEA608;
                        i = 1;
                    }
                    byte bZzm = (byte) zzdyVar.zzm();
                    zzdyVar.zzM(1);
                    if (z) {
                        int i3 = bZzm & 64;
                        int i4 = zzcy.zza;
                        listSingletonList = Collections.singletonList(i3 != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    zzz zzzVar = new zzz();
                    zzzVar.zzaa(str);
                    zzzVar.zzQ(strZzB);
                    zzzVar.zzx(i);
                    zzzVar.zzN(listSingletonList);
                    arrayList.add(zzzVar.zzag());
                }
            }
            zzdyVar.zzL(iZzd);
            arrayList = arrayList;
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzanw
    public final SparseArray zza() {
        return new SparseArray();
    }

    @Override // com.google.android.gms.internal.ads.zzanw
    @Nullable
    public final zzany zzb(int i, zzanv zzanvVar) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new zzand(new zzamv(zzanvVar.zzb, zzanvVar.zza()));
            }
            if (i == 21) {
                return new zzand(new zzamt());
            }
            if (i == 27) {
                return new zzand(new zzamq(zzc(zzanvVar), false, false));
            }
            if (i == 36) {
                return new zzand(new zzams(zzc(zzanvVar)));
            }
            if (i == 45) {
                return new zzand(new zzamw());
            }
            if (i == 89) {
                return new zzand(new zzami(zzanvVar.zzd));
            }
            if (i == 172) {
                return new zzand(new zzamd(zzanvVar.zzb, zzanvVar.zza()));
            }
            if (i == 257) {
                return new zzanl(new zzanc("application/vnd.dvb.ait"));
            }
            if (i != 128) {
                if (i != 129) {
                    if (i != 138) {
                        if (i == 139) {
                            return new zzand(new zzamh(zzanvVar.zzb, zzanvVar.zza(), 5408));
                        }
                        switch (i) {
                            case 15:
                                return new zzand(new zzamf(false, zzanvVar.zzb, zzanvVar.zza()));
                            case 16:
                                return new zzand(new zzamo(zzd(zzanvVar)));
                            case 17:
                                return new zzand(new zzamu(zzanvVar.zzb, zzanvVar.zza()));
                            default:
                                switch (i) {
                                    case 134:
                                        return new zzanl(new zzanc(MimeTypes.APPLICATION_SCTE35));
                                    case 135:
                                        break;
                                    case 136:
                                        break;
                                    default:
                                        return null;
                                }
                                break;
                        }
                    }
                    return new zzand(new zzamh(zzanvVar.zzb, zzanvVar.zza(), 4096));
                }
                return new zzand(new zzamb(zzanvVar.zzb, zzanvVar.zza()));
            }
        }
        return new zzand(new zzaml(zzd(zzanvVar)));
    }

    public zzamg() {
        this(0);
    }

    public zzamg(int i) {
        this.zza = zzfxn.zzn();
    }
}
