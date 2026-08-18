package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;

/* JADX INFO: loaded from: classes3.dex */
public final class zzand implements zzany {
    private final zzamj zza;
    private final zzdx zzb = new zzdx(new byte[10], 10);
    private int zzc = 0;
    private int zzd;
    private zzef zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    public zzand(zzamj zzamjVar) {
        this.zza = zzamjVar;
    }

    private final void zze(int i) {
        this.zzc = i;
        this.zzd = 0;
    }

    private final boolean zzf(zzdy zzdyVar, @Nullable byte[] bArr, int i) {
        int iMin = Math.min(zzdyVar.zzb(), i - this.zzd);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            zzdyVar.zzM(iMin);
        } else {
            zzdyVar.zzH(bArr, this.zzd, iMin);
        }
        int i2 = this.zzd + iMin;
        this.zzd = i2;
        return i2 == i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzany
    public final void zza(zzdy zzdyVar, int i) throws zzbc {
        int i2;
        long jZzb;
        zzcw.zzb(this.zze);
        int i3 = -1;
        int i4 = 2;
        ?? r6 = 0;
        int i5 = 1;
        if ((i & 1) != 0) {
            int i6 = this.zzc;
            if (i6 != 0 && i6 != 1) {
                if (i6 != 2) {
                    int i7 = this.zzj;
                    if (i7 != -1) {
                        zzdo.zzf("PesReader", "Unexpected start indicator: expected " + i7 + " more bytes");
                    }
                    this.zza.zzc(zzdyVar.zze() == 0);
                } else {
                    zzdo.zzf("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            zze(1);
        }
        int i8 = i;
        while (zzdyVar.zzb() > 0) {
            int i9 = this.zzc;
            if (i9 == 0) {
                zzdyVar.zzM(zzdyVar.zzb());
            } else if (i9 != i5) {
                if (i9 != i4) {
                    int iZzb = zzdyVar.zzb();
                    int i10 = this.zzj;
                    int i11 = i10 == i3 ? 0 : iZzb - i10;
                    if (i11 > 0) {
                        iZzb -= i11;
                        zzdyVar.zzK(zzdyVar.zzd() + iZzb);
                    }
                    this.zza.zza(zzdyVar);
                    int i12 = this.zzj;
                    if (i12 != i3) {
                        int i13 = i12 - iZzb;
                        this.zzj = i13;
                        if (i13 == 0) {
                            this.zza.zzc(r6);
                            zze(i5);
                        }
                    }
                } else {
                    if (zzf(zzdyVar, this.zzb.zza, Math.min(10, this.zzi)) && zzf(zzdyVar, null, this.zzi)) {
                        this.zzb.zzl(r6);
                        if (this.zzf) {
                            this.zzb.zzn(4);
                            long jZzd = this.zzb.zzd(3);
                            this.zzb.zzn(i5);
                            int iZzd = this.zzb.zzd(15) << 15;
                            this.zzb.zzn(i5);
                            long jZzd2 = this.zzb.zzd(15);
                            this.zzb.zzn(i5);
                            if (!this.zzh && this.zzg) {
                                this.zzb.zzn(4);
                                long jZzd3 = ((long) this.zzb.zzd(3)) << 30;
                                this.zzb.zzn(i5);
                                int iZzd2 = this.zzb.zzd(15) << 15;
                                this.zzb.zzn(i5);
                                long jZzd4 = this.zzb.zzd(15);
                                this.zzb.zzn(i5);
                                this.zze.zzb(jZzd3 | ((long) iZzd2) | jZzd4);
                                this.zzh = true;
                            }
                            jZzb = this.zze.zzb((jZzd << 30) | ((long) iZzd) | jZzd2);
                        } else {
                            jZzb = C.TIME_UNSET;
                        }
                        i8 |= true != this.zzk ? 0 : 4;
                        this.zza.zzd(jZzb, i8);
                        zze(3);
                    }
                }
            } else if (zzf(zzdyVar, this.zzb.zza, 9)) {
                this.zzb.zzl(0);
                int iZzd3 = this.zzb.zzd(24);
                if (iZzd3 != 1) {
                    AbstractC3888ke0.r("Unexpected start code prefix: ", iZzd3, "PesReader");
                    this.zzj = -1;
                    i2 = 0;
                } else {
                    this.zzb.zzn(8);
                    zzdx zzdxVar = this.zzb;
                    int iZzd4 = zzdxVar.zzd(16);
                    zzdxVar.zzn(5);
                    this.zzk = this.zzb.zzp();
                    this.zzb.zzn(2);
                    this.zzf = this.zzb.zzp();
                    this.zzg = this.zzb.zzp();
                    this.zzb.zzn(6);
                    int iZzd5 = this.zzb.zzd(8);
                    this.zzi = iZzd5;
                    if (iZzd4 == 0) {
                        this.zzj = -1;
                    } else {
                        int i14 = (iZzd4 - 3) - iZzd5;
                        this.zzj = i14;
                        if (i14 < 0) {
                            AbstractC3888ke0.r("Found negative packet payload size: ", i14, "PesReader");
                            this.zzj = -1;
                        }
                    }
                    i2 = 2;
                }
                zze(i2);
            }
            i3 = -1;
            i4 = 2;
            r6 = 0;
            i5 = 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzany
    public final void zzb(zzef zzefVar, zzacq zzacqVar, zzanx zzanxVar) {
        this.zze = zzefVar;
        this.zza.zzb(zzacqVar, zzanxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzany
    public final void zzc() {
        this.zzc = 0;
        this.zzd = 0;
        this.zzh = false;
        this.zza.zze();
    }

    public final boolean zzd(boolean z) {
        return this.zzc == 3 && this.zzj == -1;
    }
}
