package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzged {
    private final List zza = new ArrayList();
    private final zzglo zzb = zzglo.zza;
    private boolean zzc = false;

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzgeb) it.next()).zza = false;
        }
    }

    public final zzged zza(zzgeb zzgebVar) {
        if (zzgebVar.zzf != null) {
            throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
        }
        if (zzgebVar.zza) {
            zzd();
        }
        zzgebVar.zzf = this;
        this.zza.add(zzgebVar);
        return this;
    }

    public final zzgeg zzb() throws GeneralSecurityException {
        int i;
        int i2;
        if (this.zzc) {
            throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        char c = 1;
        this.zzc = true;
        List list = this.zza;
        zzgst zzgstVarZzc = zzgsx.zzc();
        ArrayList arrayList = new ArrayList(list.size());
        List list2 = this.zza;
        char c2 = 0;
        int i3 = 0;
        while (i3 < list2.size() - 1) {
            int i4 = i3 + 1;
            if (((zzgeb) list2.get(i3)).zze == zzgec.zza && ((zzgeb) list2.get(i4)).zze != zzgec.zza) {
                throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
            }
            i3 = i4;
        }
        HashSet hashSet = new HashSet();
        Integer num = null;
        for (zzgeb zzgebVar : this.zza) {
            zzgdz unused = zzgebVar.zzb;
            if (zzgebVar.zze == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            int i5 = 4;
            if (zzgebVar.zze == zzgec.zza) {
                i = 0;
                while (true) {
                    if (i != 0 && !hashSet.contains(Integer.valueOf(i))) {
                        break;
                    }
                    SecureRandom secureRandom = new SecureRandom();
                    byte[] bArr = new byte[i5];
                    int i6 = 0;
                    while (i6 == 0) {
                        secureRandom.nextBytes(bArr);
                        i6 = ((bArr[2] & 255) << 8) | ((bArr[c2] & 255) << 24) | ((bArr[c] & 255) << 16) | (bArr[3] & 255);
                        c2 = 0;
                        i5 = 4;
                    }
                    i = i6;
                }
            } else {
                zzgec unused2 = zzgebVar.zze;
                i = 0;
            }
            Integer numValueOf = Integer.valueOf(i);
            if (hashSet.contains(numValueOf)) {
                throw new GeneralSecurityException(AbstractC5044xl.g("Id ", i, " is used twice in the keyset"));
            }
            hashSet.add(numValueOf);
            zzgeb.zza(zzgebVar);
            zzgdx zzgdxVarZza = zzgma.zzb().zza(zzgebVar.zzd, c != zzgebVar.zzd.zza() ? null : numValueOf);
            zzgee zzgeeVar = new zzgee(zzgdxVarZza, zzgebVar.zzb, i, zzgebVar.zza, null);
            zzgdz zzgdzVar = zzgebVar.zzb;
            zzgnh zzgnhVar = (zzgnh) zzgmk.zzc().zzd(zzgdxVarZza, zzgnh.class, zzgeo.zza());
            Integer numZzf = zzgnhVar.zzf();
            if (numZzf != null && numZzf.intValue() != i) {
                throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
            }
            zzgdz zzgdzVar2 = zzgdz.zza;
            if (zzgdzVar2.equals(zzgdzVar)) {
                i2 = 3;
            } else if (zzgdz.zzb.equals(zzgdzVar)) {
                i2 = 4;
            } else {
                if (!zzgdz.zzc.equals(zzgdzVar)) {
                    throw new IllegalStateException("Unknown key status");
                }
                i2 = 5;
            }
            zzgsu zzgsuVarZzc = zzgsv.zzc();
            zzgsi zzgsiVarZza = zzgsl.zza();
            zzgsiVarZza.zzb(zzgnhVar.zzg());
            zzgsiVarZza.zzc(zzgnhVar.zze());
            zzgsiVarZza.zza(zzgnhVar.zzb());
            zzgsuVarZzc.zza(zzgsiVarZza);
            zzgsuVarZzc.zzd(i2);
            zzgsuVarZzc.zzb(i);
            zzgsuVarZzc.zzc(zzgnhVar.zzc());
            zzgstVarZzc.zza((zzgsv) zzgsuVarZzc.zzbr());
            if (zzgebVar.zza) {
                if (num != null) {
                    throw new GeneralSecurityException("Two primaries were set");
                }
                if (zzgebVar.zzb != zzgdzVar2) {
                    throw new GeneralSecurityException("Primary key is not enabled");
                }
                num = numValueOf;
            }
            arrayList.add(zzgeeVar);
            c = 1;
            c2 = 0;
        }
        if (num == null) {
            throw new GeneralSecurityException("No primary was set");
        }
        zzgstVarZzc.zzb(num.intValue());
        zzgsx zzgsxVar = (zzgsx) zzgstVarZzc.zzbr();
        zzgeg.zzh(zzgsxVar);
        return new zzgeg(zzgsxVar, arrayList, this.zzb, null);
    }
}
