package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzgwq implements zzgzp {
    private final zzgwp zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzgwq(zzgwp zzgwpVar) {
        zzgye.zzc(zzgwpVar, "input");
        this.zza = zzgwpVar;
        zzgwpVar.zzc = this;
    }

    private final void zzO(Object obj, zzgzv zzgzvVar, zzgxb zzgxbVar) throws IOException {
        int i = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzgzvVar.zzh(obj, this, zzgxbVar);
            if (this.zzb != this.zzc) {
                throw new zzgyg("Failed to parse the message.");
            }
            this.zzc = i;
        } catch (Throwable th) {
            this.zzc = i;
            throw th;
        }
    }

    private final void zzP(Object obj, zzgzv zzgzvVar, zzgxb zzgxbVar) throws IOException {
        zzgwp zzgwpVar = this.zza;
        int iZzm = zzgwpVar.zzm();
        if (zzgwpVar.zza >= zzgwpVar.zzb) {
            throw new zzgyg("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iZzd = zzgwpVar.zzd(iZzm);
        this.zza.zza++;
        zzgzvVar.zzh(obj, this, zzgxbVar);
        this.zza.zzy(0);
        zzgwp zzgwpVar2 = this.zza;
        zzgwpVar2.zza--;
        zzgwpVar2.zzz(iZzd);
    }

    private final void zzQ(int i) throws IOException {
        if (this.zza.zzc() != i) {
            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private final void zzR(int i) throws IOException {
        if ((this.zzb & 7) != i) {
            throw new zzgyf("Protocol message tag had invalid wire type.");
        }
    }

    private static final void zzS(int i) throws IOException {
        if ((i & 3) != 0) {
            throw new zzgyg("Failed to parse the message.");
        }
    }

    private static final void zzT(int i) throws IOException {
        if ((i & 7) != 0) {
            throw new zzgyg("Failed to parse the message.");
        }
    }

    public static zzgwq zzq(zzgwp zzgwpVar) {
        zzgwq zzgwqVar = zzgwpVar.zzc;
        return zzgwqVar != null ? zzgwqVar : new zzgwq(zzgwpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzA(List list) throws IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof zzgyr) {
            zzgyr zzgyrVar = (zzgyr) list;
            int i = this.zzb & 7;
            if (i != 1) {
                if (i != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                int iZzm = this.zza.zzm();
                zzT(iZzm);
                int iZzc = iZzm + this.zza.zzc();
                do {
                    zzgyrVar.zzg(this.zza.zzn());
                } while (this.zza.zzc() < iZzc);
                return;
            }
            do {
                zzgyrVar.zzg(this.zza.zzn());
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl2 = this.zza.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                int iZzm2 = this.zza.zzm();
                zzT(iZzm2);
                int iZzc2 = iZzm2 + this.zza.zzc();
                do {
                    list.add(Long.valueOf(this.zza.zzn()));
                } while (this.zza.zzc() < iZzc2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzn()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl = this.zza.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzB(List list) throws IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof zzgxi) {
            zzgxi zzgxiVar = (zzgxi) list;
            int i = this.zzb & 7;
            if (i == 2) {
                int iZzm = this.zza.zzm();
                zzS(iZzm);
                int iZzc = this.zza.zzc() + iZzm;
                do {
                    zzgxiVar.zzh(this.zza.zzb());
                } while (this.zza.zzc() < iZzc);
                return;
            }
            if (i != 5) {
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
            do {
                zzgxiVar.zzh(this.zza.zzb());
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl2 = this.zza.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 == 2) {
                int iZzm2 = this.zza.zzm();
                zzS(iZzm2);
                int iZzc2 = this.zza.zzc() + iZzm2;
                do {
                    list.add(Float.valueOf(this.zza.zzb()));
                } while (this.zza.zzc() < iZzc2);
                return;
            }
            if (i2 != 5) {
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Float.valueOf(this.zza.zzb()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl = this.zza.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    @Deprecated
    public final void zzC(List list, zzgzv zzgzvVar, zzgxb zzgxbVar) throws IOException {
        int iZzl;
        int i = this.zzb;
        if ((i & 7) != 3) {
            throw new zzgyf("Protocol message tag had invalid wire type.");
        }
        do {
            Object objZze = zzgzvVar.zze();
            zzO(objZze, zzgzvVar, zzgxbVar);
            zzgzvVar.zzf(objZze);
            list.add(objZze);
            if (this.zza.zzA() || this.zzd != 0) {
                return;
            } else {
                iZzl = this.zza.zzl();
            }
        } while (iZzl == i);
        this.zzd = iZzl;
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzD(List list) throws IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof zzgxs) {
            zzgxs zzgxsVar = (zzgxs) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                zzgwp zzgwpVar = this.zza;
                int iZzc = zzgwpVar.zzc() + zzgwpVar.zzm();
                do {
                    zzgxsVar.zzi(this.zza.zzg());
                } while (this.zza.zzc() < iZzc);
                zzQ(iZzc);
                return;
            }
            do {
                zzgxsVar.zzi(this.zza.zzg());
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl2 = this.zza.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                zzgwp zzgwpVar2 = this.zza;
                int iZzc2 = zzgwpVar2.zzc() + zzgwpVar2.zzm();
                do {
                    list.add(Integer.valueOf(this.zza.zzg()));
                } while (this.zza.zzc() < iZzc2);
                zzQ(iZzc2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzg()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl = this.zza.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzE(List list) throws IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof zzgyr) {
            zzgyr zzgyrVar = (zzgyr) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                zzgwp zzgwpVar = this.zza;
                int iZzc = zzgwpVar.zzc() + zzgwpVar.zzm();
                do {
                    zzgyrVar.zzg(this.zza.zzo());
                } while (this.zza.zzc() < iZzc);
                zzQ(iZzc);
                return;
            }
            do {
                zzgyrVar.zzg(this.zza.zzo());
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl2 = this.zza.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                zzgwp zzgwpVar2 = this.zza;
                int iZzc2 = zzgwpVar2.zzc() + zzgwpVar2.zzm();
                do {
                    list.add(Long.valueOf(this.zza.zzo()));
                } while (this.zza.zzc() < iZzc2);
                zzQ(iZzc2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzo()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl = this.zza.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzF(List list, zzgzv zzgzvVar, zzgxb zzgxbVar) throws IOException {
        int iZzl;
        int i = this.zzb;
        if ((i & 7) != 2) {
            throw new zzgyf("Protocol message tag had invalid wire type.");
        }
        do {
            Object objZze = zzgzvVar.zze();
            zzP(objZze, zzgzvVar, zzgxbVar);
            zzgzvVar.zzf(objZze);
            list.add(objZze);
            if (this.zza.zzA() || this.zzd != 0) {
                return;
            } else {
                iZzl = this.zza.zzl();
            }
        } while (iZzl == i);
        this.zzd = iZzl;
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzG(List list) throws IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof zzgxs) {
            zzgxs zzgxsVar = (zzgxs) list;
            int i = this.zzb & 7;
            if (i == 2) {
                int iZzm = this.zza.zzm();
                zzS(iZzm);
                int iZzc = this.zza.zzc() + iZzm;
                do {
                    zzgxsVar.zzi(this.zza.zzj());
                } while (this.zza.zzc() < iZzc);
                return;
            }
            if (i != 5) {
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
            do {
                zzgxsVar.zzi(this.zza.zzj());
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl2 = this.zza.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 == 2) {
                int iZzm2 = this.zza.zzm();
                zzS(iZzm2);
                int iZzc2 = this.zza.zzc() + iZzm2;
                do {
                    list.add(Integer.valueOf(this.zza.zzj()));
                } while (this.zza.zzc() < iZzc2);
                return;
            }
            if (i2 != 5) {
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Integer.valueOf(this.zza.zzj()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl = this.zza.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzH(List list) throws IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof zzgyr) {
            zzgyr zzgyrVar = (zzgyr) list;
            int i = this.zzb & 7;
            if (i != 1) {
                if (i != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                int iZzm = this.zza.zzm();
                zzT(iZzm);
                int iZzc = iZzm + this.zza.zzc();
                do {
                    zzgyrVar.zzg(this.zza.zzs());
                } while (this.zza.zzc() < iZzc);
                return;
            }
            do {
                zzgyrVar.zzg(this.zza.zzs());
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl2 = this.zza.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                int iZzm2 = this.zza.zzm();
                zzT(iZzm2);
                int iZzc2 = iZzm2 + this.zza.zzc();
                do {
                    list.add(Long.valueOf(this.zza.zzs()));
                } while (this.zza.zzc() < iZzc2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzs()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl = this.zza.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzI(List list) throws IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof zzgxs) {
            zzgxs zzgxsVar = (zzgxs) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                zzgwp zzgwpVar = this.zza;
                int iZzc = zzgwpVar.zzc() + zzgwpVar.zzm();
                do {
                    zzgxsVar.zzi(this.zza.zzk());
                } while (this.zza.zzc() < iZzc);
                zzQ(iZzc);
                return;
            }
            do {
                zzgxsVar.zzi(this.zza.zzk());
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl2 = this.zza.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                zzgwp zzgwpVar2 = this.zza;
                int iZzc2 = zzgwpVar2.zzc() + zzgwpVar2.zzm();
                do {
                    list.add(Integer.valueOf(this.zza.zzk()));
                } while (this.zza.zzc() < iZzc2);
                zzQ(iZzc2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzk()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl = this.zza.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzJ(List list) throws IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof zzgyr) {
            zzgyr zzgyrVar = (zzgyr) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                zzgwp zzgwpVar = this.zza;
                int iZzc = zzgwpVar.zzc() + zzgwpVar.zzm();
                do {
                    zzgyrVar.zzg(this.zza.zzt());
                } while (this.zza.zzc() < iZzc);
                zzQ(iZzc);
                return;
            }
            do {
                zzgyrVar.zzg(this.zza.zzt());
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl2 = this.zza.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                zzgwp zzgwpVar2 = this.zza;
                int iZzc2 = zzgwpVar2.zzc() + zzgwpVar2.zzm();
                do {
                    list.add(Long.valueOf(this.zza.zzt()));
                } while (this.zza.zzc() < iZzc2);
                zzQ(iZzc2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzt()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl = this.zza.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    public final void zzK(List list, boolean z) throws IOException {
        int iZzl;
        int iZzl2;
        if ((this.zzb & 7) != 2) {
            throw new zzgyf("Protocol message tag had invalid wire type.");
        }
        if ((list instanceof zzgyo) && !z) {
            zzgyo zzgyoVar = (zzgyo) list;
            do {
                zzp();
                zzgyoVar.zzb();
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl2 = this.zza.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            do {
                list.add(z ? zzs() : zzr());
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl = this.zza.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzL(List list) throws IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof zzgxs) {
            zzgxs zzgxsVar = (zzgxs) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                zzgwp zzgwpVar = this.zza;
                int iZzc = zzgwpVar.zzc() + zzgwpVar.zzm();
                do {
                    zzgxsVar.zzi(this.zza.zzm());
                } while (this.zza.zzc() < iZzc);
                zzQ(iZzc);
                return;
            }
            do {
                zzgxsVar.zzi(this.zza.zzm());
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl2 = this.zza.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                zzgwp zzgwpVar2 = this.zza;
                int iZzc2 = zzgwpVar2.zzc() + zzgwpVar2.zzm();
                do {
                    list.add(Integer.valueOf(this.zza.zzm()));
                } while (this.zza.zzc() < iZzc2);
                zzQ(iZzc2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zzm()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl = this.zza.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzM(List list) throws IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof zzgyr) {
            zzgyr zzgyrVar = (zzgyr) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                zzgwp zzgwpVar = this.zza;
                int iZzc = zzgwpVar.zzc() + zzgwpVar.zzm();
                do {
                    zzgyrVar.zzg(this.zza.zzu());
                } while (this.zza.zzc() < iZzc);
                zzQ(iZzc);
                return;
            }
            do {
                zzgyrVar.zzg(this.zza.zzu());
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl2 = this.zza.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                zzgwp zzgwpVar2 = this.zza;
                int iZzc2 = zzgwpVar2.zzc() + zzgwpVar2.zzm();
                do {
                    list.add(Long.valueOf(this.zza.zzu()));
                } while (this.zza.zzc() < iZzc2);
                zzQ(iZzc2);
                return;
            }
            do {
                list.add(Long.valueOf(this.zza.zzu()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl = this.zza.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final boolean zzN() throws IOException {
        zzR(0);
        return this.zza.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final double zza() throws IOException {
        zzR(1);
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final float zzb() throws IOException {
        zzR(5);
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final int zzc() throws IOException {
        int iZzl = this.zzd;
        if (iZzl != 0) {
            this.zzb = iZzl;
            this.zzd = 0;
        } else {
            iZzl = this.zza.zzl();
            this.zzb = iZzl;
        }
        if (iZzl == 0 || iZzl == this.zzc) {
            return Integer.MAX_VALUE;
        }
        return iZzl >>> 3;
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final int zze() throws IOException {
        zzR(0);
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final int zzf() throws IOException {
        zzR(5);
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final int zzg() throws IOException {
        zzR(0);
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final int zzh() throws IOException {
        zzR(5);
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final int zzi() throws IOException {
        zzR(0);
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final int zzj() throws IOException {
        zzR(0);
        return this.zza.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final long zzk() throws IOException {
        zzR(1);
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final long zzl() throws IOException {
        zzR(0);
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final long zzm() throws IOException {
        zzR(1);
        return this.zza.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final long zzn() throws IOException {
        zzR(0);
        return this.zza.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final long zzo() throws IOException {
        zzR(0);
        return this.zza.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final zzgwj zzp() throws IOException {
        zzR(2);
        return this.zza.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final String zzr() throws IOException {
        zzR(2);
        return this.zza.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final String zzs() throws IOException {
        zzR(2);
        return this.zza.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzt(Object obj, zzgzv zzgzvVar, zzgxb zzgxbVar) throws IOException {
        zzR(3);
        zzO(obj, zzgzvVar, zzgxbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzu(Object obj, zzgzv zzgzvVar, zzgxb zzgxbVar) throws IOException {
        zzR(2);
        zzP(obj, zzgzvVar, zzgxbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzv(List list) throws IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof zzgvz) {
            zzgvz zzgvzVar = (zzgvz) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                zzgwp zzgwpVar = this.zza;
                int iZzc = zzgwpVar.zzc() + zzgwpVar.zzm();
                do {
                    zzgvzVar.zzg(this.zza.zzB());
                } while (this.zza.zzc() < iZzc);
                zzQ(iZzc);
                return;
            }
            do {
                zzgvzVar.zzg(this.zza.zzB());
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl2 = this.zza.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                zzgwp zzgwpVar2 = this.zza;
                int iZzc2 = zzgwpVar2.zzc() + zzgwpVar2.zzm();
                do {
                    list.add(Boolean.valueOf(this.zza.zzB()));
                } while (this.zza.zzc() < iZzc2);
                zzQ(iZzc2);
                return;
            }
            do {
                list.add(Boolean.valueOf(this.zza.zzB()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl = this.zza.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzw(List list) throws IOException {
        int iZzl;
        if ((this.zzb & 7) != 2) {
            throw new zzgyf("Protocol message tag had invalid wire type.");
        }
        do {
            list.add(zzp());
            if (this.zza.zzA()) {
                return;
            } else {
                iZzl = this.zza.zzl();
            }
        } while (iZzl == this.zzb);
        this.zzd = iZzl;
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzx(List list) throws IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof zzgwy) {
            zzgwy zzgwyVar = (zzgwy) list;
            int i = this.zzb & 7;
            if (i != 1) {
                if (i != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                int iZzm = this.zza.zzm();
                zzT(iZzm);
                int iZzc = iZzm + this.zza.zzc();
                do {
                    zzgwyVar.zzh(this.zza.zza());
                } while (this.zza.zzc() < iZzc);
                return;
            }
            do {
                zzgwyVar.zzh(this.zza.zza());
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl2 = this.zza.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                int iZzm2 = this.zza.zzm();
                zzT(iZzm2);
                int iZzc2 = iZzm2 + this.zza.zzc();
                do {
                    list.add(Double.valueOf(this.zza.zza()));
                } while (this.zza.zzc() < iZzc2);
                return;
            }
            do {
                list.add(Double.valueOf(this.zza.zza()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl = this.zza.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzy(List list) throws IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof zzgxs) {
            zzgxs zzgxsVar = (zzgxs) list;
            int i = this.zzb & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                zzgwp zzgwpVar = this.zza;
                int iZzc = zzgwpVar.zzc() + zzgwpVar.zzm();
                do {
                    zzgxsVar.zzi(this.zza.zze());
                } while (this.zza.zzc() < iZzc);
                zzQ(iZzc);
                return;
            }
            do {
                zzgxsVar.zzi(this.zza.zze());
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl2 = this.zza.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                zzgwp zzgwpVar2 = this.zza;
                int iZzc2 = zzgwpVar2.zzc() + zzgwpVar2.zzm();
                do {
                    list.add(Integer.valueOf(this.zza.zze()));
                } while (this.zza.zzc() < iZzc2);
                zzQ(iZzc2);
                return;
            }
            do {
                list.add(Integer.valueOf(this.zza.zze()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl = this.zza.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }

    @Override // com.google.android.gms.internal.ads.zzgzp
    public final void zzz(List list) throws IOException {
        int iZzl;
        int iZzl2;
        if (list instanceof zzgxs) {
            zzgxs zzgxsVar = (zzgxs) list;
            int i = this.zzb & 7;
            if (i == 2) {
                int iZzm = this.zza.zzm();
                zzS(iZzm);
                int iZzc = this.zza.zzc() + iZzm;
                do {
                    zzgxsVar.zzi(this.zza.zzf());
                } while (this.zza.zzc() < iZzc);
                return;
            }
            if (i != 5) {
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
            do {
                zzgxsVar.zzi(this.zza.zzf());
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl2 = this.zza.zzl();
                }
            } while (iZzl2 == this.zzb);
        } else {
            int i2 = this.zzb & 7;
            if (i2 == 2) {
                int iZzm2 = this.zza.zzm();
                zzS(iZzm2);
                int iZzc2 = this.zza.zzc() + iZzm2;
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                } while (this.zza.zzc() < iZzc2);
                return;
            }
            if (i2 != 5) {
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Integer.valueOf(this.zza.zzf()));
                if (this.zza.zzA()) {
                    return;
                } else {
                    iZzl = this.zza.zzl();
                }
            } while (iZzl == this.zzb);
            iZzl2 = iZzl;
        }
        this.zzd = iZzl2;
    }
}
