package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzgxd extends zzgxc {
    @Override // com.google.android.gms.internal.ads.zzgxc
    public final void zza(Object obj) {
        ((zzgxn) obj).zza.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzgxc
    public final void zzb(zzhaw zzhawVar, Map.Entry entry) throws IOException {
        zzgxo zzgxoVar = (zzgxo) entry.getKey();
        if (!zzgxoVar.zzc) {
            zzhau zzhauVar = zzhau.zza;
            switch (zzgxoVar.zzb.ordinal()) {
                case 0:
                    zzhawVar.zzf(zzgxoVar.zza, ((Double) entry.getValue()).doubleValue());
                    break;
                case 1:
                    zzhawVar.zzo(zzgxoVar.zza, ((Float) entry.getValue()).floatValue());
                    break;
                case 2:
                    zzhawVar.zzt(zzgxoVar.zza, ((Long) entry.getValue()).longValue());
                    break;
                case 3:
                    zzhawVar.zzK(zzgxoVar.zza, ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    zzhawVar.zzr(zzgxoVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case 5:
                    zzhawVar.zzm(zzgxoVar.zza, ((Long) entry.getValue()).longValue());
                    break;
                case 6:
                    zzhawVar.zzk(zzgxoVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case 7:
                    zzhawVar.zzb(zzgxoVar.zza, ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 8:
                    zzhawVar.zzG(zzgxoVar.zza, (String) entry.getValue());
                    break;
                case 9:
                    zzhawVar.zzq(zzgxoVar.zza, entry.getValue(), zzgzm.zza().zzb(entry.getValue().getClass()));
                    break;
                case 10:
                    zzhawVar.zzv(zzgxoVar.zza, entry.getValue(), zzgzm.zza().zzb(entry.getValue().getClass()));
                    break;
                case 11:
                    zzhawVar.zzd(zzgxoVar.zza, (zzgwj) entry.getValue());
                    break;
                case 12:
                    zzhawVar.zzI(zzgxoVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    zzhawVar.zzr(zzgxoVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case 14:
                    zzhawVar.zzx(zzgxoVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    zzhawVar.zzz(zzgxoVar.zza, ((Long) entry.getValue()).longValue());
                    break;
                case 16:
                    zzhawVar.zzB(zzgxoVar.zza, ((Integer) entry.getValue()).intValue());
                    break;
                case 17:
                    zzhawVar.zzD(zzgxoVar.zza, ((Long) entry.getValue()).longValue());
                    break;
            }
        }
        zzhau zzhauVar2 = zzhau.zza;
        switch (zzgxoVar.zzb.ordinal()) {
            case 0:
                zzgzx.zzt(zzgxoVar.zza, (List) entry.getValue(), zzhawVar, zzgxoVar.zzd);
                break;
            case 1:
                zzgzx.zzx(zzgxoVar.zza, (List) entry.getValue(), zzhawVar, zzgxoVar.zzd);
                break;
            case 2:
                zzgzx.zzA(zzgxoVar.zza, (List) entry.getValue(), zzhawVar, zzgxoVar.zzd);
                break;
            case 3:
                zzgzx.zzI(zzgxoVar.zza, (List) entry.getValue(), zzhawVar, zzgxoVar.zzd);
                break;
            case 4:
                zzgzx.zzz(zzgxoVar.zza, (List) entry.getValue(), zzhawVar, zzgxoVar.zzd);
                break;
            case 5:
                zzgzx.zzw(zzgxoVar.zza, (List) entry.getValue(), zzhawVar, zzgxoVar.zzd);
                break;
            case 6:
                zzgzx.zzv(zzgxoVar.zza, (List) entry.getValue(), zzhawVar, zzgxoVar.zzd);
                break;
            case 7:
                zzgzx.zzr(zzgxoVar.zza, (List) entry.getValue(), zzhawVar, zzgxoVar.zzd);
                break;
            case 8:
                zzgzx.zzG(zzgxoVar.zza, (List) entry.getValue(), zzhawVar);
                break;
            case 9:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    zzgzx.zzy(zzgxoVar.zza, (List) entry.getValue(), zzhawVar, zzgzm.zza().zzb(list.get(0).getClass()));
                    break;
                }
                break;
            case 10:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    zzgzx.zzB(zzgxoVar.zza, (List) entry.getValue(), zzhawVar, zzgzm.zza().zzb(list2.get(0).getClass()));
                    break;
                }
                break;
            case 11:
                zzgzx.zzs(zzgxoVar.zza, (List) entry.getValue(), zzhawVar);
                break;
            case 12:
                zzgzx.zzH(zzgxoVar.zza, (List) entry.getValue(), zzhawVar, zzgxoVar.zzd);
                break;
            case 13:
                zzgzx.zzz(zzgxoVar.zza, (List) entry.getValue(), zzhawVar, zzgxoVar.zzd);
                break;
            case 14:
                zzgzx.zzC(zzgxoVar.zza, (List) entry.getValue(), zzhawVar, zzgxoVar.zzd);
                break;
            case 15:
                zzgzx.zzD(zzgxoVar.zza, (List) entry.getValue(), zzhawVar, zzgxoVar.zzd);
                break;
            case 16:
                zzgzx.zzE(zzgxoVar.zza, (List) entry.getValue(), zzhawVar, zzgxoVar.zzd);
                break;
            case 17:
                zzgzx.zzF(zzgxoVar.zza, (List) entry.getValue(), zzhawVar, zzgxoVar.zzd);
                break;
        }
    }
}
