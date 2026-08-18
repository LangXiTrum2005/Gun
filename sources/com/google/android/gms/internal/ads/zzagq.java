package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzagq extends zzagh {
    public static final Parcelable.Creator<zzagq> CREATOR = new zzagp();

    @Nullable
    public final String zza;
    public final zzfxn zzb;

    public zzagq(String str, @Nullable String str2, List list) {
        super(str);
        zzcw.zzd(!list.isEmpty());
        this.zza = str2;
        zzfxn zzfxnVarZzl = zzfxn.zzl(list);
        this.zzb = zzfxnVarZzl;
    }

    private static List zzb(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagq.class == obj.getClass()) {
            zzagq zzagqVar = (zzagq) obj;
            if (Objects.equals(this.zzf, zzagqVar.zzf) && Objects.equals(this.zza, zzagqVar.zza) && this.zzb.equals(zzagqVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzf.hashCode() + 527;
        String str = this.zza;
        return this.zzb.hashCode() + (((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final String toString() {
        String strValueOf = String.valueOf(this.zzb);
        StringBuilder sb = new StringBuilder();
        sb.append(this.zzf);
        sb.append(": description=");
        return AbstractC5044xl.p(sb, this.zza, ": values=", strValueOf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzf);
        parcel.writeString(this.zza);
        parcel.writeStringArray((String[]) this.zzb.toArray(new String[0]));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:74:0x0115  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.zzagh, com.google.android.gms.internal.ads.zzax
    public final void zza(zzat zzatVar) {
        byte b;
        String str = this.zzf;
        switch (str.hashCode()) {
            case 82815:
                if (!str.equals("TAL")) {
                    b = -1;
                } else {
                    b = 6;
                }
                break;
            case 82878:
                if (!str.equals("TCM")) {
                    b = -1;
                } else {
                    b = cw.n;
                }
                break;
            case 82897:
                if (!str.equals("TDA")) {
                    b = -1;
                } else {
                    b = 12;
                }
                break;
            case 83253:
                if (!str.equals("TP1")) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case 83254:
                if (!str.equals("TP2")) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            case 83255:
                if (!str.equals("TP3")) {
                    b = -1;
                } else {
                    b = 18;
                }
                break;
            case 83341:
                if (!str.equals("TRK")) {
                    b = -1;
                } else {
                    b = 8;
                }
                break;
            case 83378:
                if (!str.equals("TT2")) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case 83536:
                if (!str.equals("TXT")) {
                    b = -1;
                } else {
                    b = 20;
                }
                break;
            case 83552:
                if (!str.equals("TYE")) {
                    b = -1;
                } else {
                    b = 10;
                }
                break;
            case 2567331:
                if (!str.equals("TALB")) {
                    b = -1;
                } else {
                    b = 7;
                }
                break;
            case 2569357:
                if (!str.equals("TCOM")) {
                    b = -1;
                } else {
                    b = 17;
                }
                break;
            case 2569358:
                if (!str.equals("TCON")) {
                    b = -1;
                } else {
                    b = 22;
                }
                break;
            case 2569891:
                if (!str.equals("TDAT")) {
                    b = -1;
                } else {
                    b = cw.k;
                }
                break;
            case 2570401:
                if (!str.equals("TDRC")) {
                    b = -1;
                } else {
                    b = cw.l;
                }
                break;
            case 2570410:
                if (!str.equals("TDRL")) {
                    b = -1;
                } else {
                    b = cw.m;
                }
                break;
            case 2571565:
                if (!str.equals("TEXT")) {
                    b = -1;
                } else {
                    b = 21;
                }
                break;
            case 2575251:
                if (!str.equals("TIT2")) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case 2581512:
                if (!str.equals("TPE1")) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case 2581513:
                if (!str.equals("TPE2")) {
                    b = -1;
                } else {
                    b = 5;
                }
                break;
            case 2581514:
                if (!str.equals("TPE3")) {
                    b = -1;
                } else {
                    b = 19;
                }
                break;
            case 2583398:
                if (!str.equals("TRCK")) {
                    b = -1;
                } else {
                    b = 9;
                }
                break;
            case 2590194:
                if (!str.equals("TYER")) {
                    b = -1;
                } else {
                    b = 11;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
            case 1:
                zzatVar.zzq((CharSequence) this.zzb.get(0));
                break;
            case 2:
            case 3:
                zzatVar.zze((CharSequence) this.zzb.get(0));
                break;
            case 4:
            case 5:
                zzatVar.zzc((CharSequence) this.zzb.get(0));
                break;
            case 6:
            case 7:
                zzatVar.zzd((CharSequence) this.zzb.get(0));
                break;
            case 8:
            case 9:
                String str2 = (String) this.zzb.get(0);
                int i = zzei.zza;
                String[] strArrSplit = str2.split("/", -1);
                try {
                    int i2 = Integer.parseInt(strArrSplit[0]);
                    Integer numValueOf = strArrSplit.length > 1 ? Integer.valueOf(Integer.parseInt(strArrSplit[1])) : null;
                    zzatVar.zzs(Integer.valueOf(i2));
                    zzatVar.zzr(numValueOf);
                } catch (NumberFormatException unused) {
                    return;
                }
                break;
            case 10:
            case 11:
                try {
                    zzatVar.zzl(Integer.valueOf(Integer.parseInt((String) this.zzb.get(0))));
                } catch (NumberFormatException unused2) {
                    return;
                }
                break;
            case 12:
            case 13:
                try {
                    String str3 = (String) this.zzb.get(0);
                    int i3 = Integer.parseInt(str3.substring(2, 4));
                    int i4 = Integer.parseInt(str3.substring(0, 2));
                    zzatVar.zzk(Integer.valueOf(i3));
                    zzatVar.zzj(Integer.valueOf(i4));
                } catch (NumberFormatException | StringIndexOutOfBoundsException unused3) {
                    return;
                }
                break;
            case 14:
                List listZzb = zzb((String) this.zzb.get(0));
                int size = listZzb.size();
                if (size != 1) {
                    if (size != 2) {
                        if (size == 3) {
                            zzatVar.zzj((Integer) listZzb.get(2));
                        }
                    }
                    zzatVar.zzk((Integer) listZzb.get(1));
                }
                zzatVar.zzl((Integer) listZzb.get(0));
                break;
            case 15:
                List listZzb2 = zzb((String) this.zzb.get(0));
                int size2 = listZzb2.size();
                if (size2 != 1) {
                    if (size2 != 2) {
                        if (size2 == 3) {
                            zzatVar.zzm((Integer) listZzb2.get(2));
                        }
                    }
                    zzatVar.zzn((Integer) listZzb2.get(1));
                }
                zzatVar.zzo((Integer) listZzb2.get(0));
                break;
            case 16:
            case 17:
                zzatVar.zzf((CharSequence) this.zzb.get(0));
                break;
            case 18:
            case 19:
                zzatVar.zzg((CharSequence) this.zzb.get(0));
                break;
            case 20:
            case 21:
                zzatVar.zzt((CharSequence) this.zzb.get(0));
                break;
            case 22:
                Integer numZzf = zzgaq.zzf((String) this.zzb.get(0), 10);
                if (numZzf != null) {
                    String strZza = zzagi.zza(numZzf.intValue());
                    if (strZza != null) {
                        zzatVar.zzi(strZza);
                    }
                } else {
                    zzatVar.zzi((CharSequence) this.zzb.get(0));
                }
                break;
        }
    }
}
