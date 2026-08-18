package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.work.WorkRequest;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzvk implements zzue, zzacq, zzyq, zzyu, zzvv {
    private static final Map zzb;
    private static final zzab zzc;
    private zzadm zzA;
    private long zzB;
    private boolean zzC;
    private boolean zzE;
    private boolean zzF;
    private boolean zzG;
    private int zzH;
    private boolean zzI;
    private long zzJ;
    private boolean zzL;
    private int zzM;
    private boolean zzN;
    private boolean zzO;
    private final zzyk zzP;
    private final Uri zzd;
    private final zzfy zze;
    private final zzrf zzf;
    private final zzuq zzg;
    private final zzra zzh;
    private final zzvg zzi;
    private final long zzj;
    private final long zzk;
    private final zzuz zzm;

    @Nullable
    private zzud zzr;

    @Nullable
    private zzafr zzs;
    private boolean zzv;
    private boolean zzw;
    private boolean zzx;
    private boolean zzy;
    private zzvj zzz;
    private final zzyy zzl = new zzyy("ProgressiveMediaPeriod");
    private final zzda zzn = new zzda(zzcx.zza);
    private final Runnable zzo = new Runnable() { // from class: com.google.android.gms.internal.ads.zzvb
        @Override // java.lang.Runnable
        public final void run() {
            this.zza.zzU();
        }
    };
    private final Runnable zzp = new Runnable() { // from class: com.google.android.gms.internal.ads.zzvc
        @Override // java.lang.Runnable
        public final void run() {
            this.zza.zzE();
        }
    };
    private final Handler zzq = zzei.zzy(null);
    private zzvi[] zzu = new zzvi[0];
    private zzvx[] zzt = new zzvx[0];
    private long zzK = C.TIME_UNSET;
    private int zzD = 1;

    static {
        HashMap map = new HashMap();
        map.put(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_NAME, "1");
        zzb = Collections.unmodifiableMap(map);
        zzz zzzVar = new zzz();
        zzzVar.zzM("icy");
        zzzVar.zzaa("application/x-icy");
        zzc = zzzVar.zzag();
    }

    public zzvk(Uri uri, zzfy zzfyVar, zzuz zzuzVar, zzrf zzrfVar, zzra zzraVar, zzyo zzyoVar, zzuq zzuqVar, zzvg zzvgVar, zzyk zzykVar, @Nullable String str, int i, boolean z, long j, @Nullable zzzg zzzgVar) {
        this.zzd = uri;
        this.zze = zzfyVar;
        this.zzf = zzrfVar;
        this.zzh = zzraVar;
        this.zzg = zzuqVar;
        this.zzi = zzvgVar;
        this.zzP = zzykVar;
        this.zzj = i;
        this.zzm = zzuzVar;
        this.zzk = j;
    }

    public static /* bridge */ /* synthetic */ void zzC(final zzvk zzvkVar) {
        zzvkVar.zzq.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzva
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzF();
            }
        });
    }

    private final int zzQ() {
        int iZzd = 0;
        for (zzvx zzvxVar : this.zzt) {
            iZzd += zzvxVar.zzd();
        }
        return iZzd;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    private final long zzR(boolean z) {
        int i = 0;
        long jMax = Long.MIN_VALUE;
        while (true) {
            zzvx[] zzvxVarArr = this.zzt;
            if (i >= zzvxVarArr.length) {
                return jMax;
            }
            if (z) {
                jMax = Math.max(jMax, zzvxVarArr[i].zzh());
            } else {
                zzvj zzvjVar = this.zzz;
                zzvjVar.getClass();
                if (zzvjVar.zzc[i]) {
                    jMax = Math.max(jMax, zzvxVarArr[i].zzh());
                }
            }
            i++;
        }
    }

    private final zzadt zzS(zzvi zzviVar) {
        int length = this.zzt.length;
        for (int i = 0; i < length; i++) {
            if (zzviVar.equals(this.zzu[i])) {
                return this.zzt[i];
            }
        }
        if (this.zzv) {
            zzdo.zzf("ProgressiveMediaPeriod", "Extractor added new track (id=" + zzviVar.zza + ") after finishing tracks.");
            return new zzaci();
        }
        zzvx zzvxVar = new zzvx(this.zzP, this.zzf, this.zzh);
        zzvxVar.zzv(this);
        int i2 = length + 1;
        zzvi[] zzviVarArr = (zzvi[]) Arrays.copyOf(this.zzu, i2);
        zzviVarArr[length] = zzviVar;
        int i3 = zzei.zza;
        this.zzu = zzviVarArr;
        zzvx[] zzvxVarArr = (zzvx[]) Arrays.copyOf(this.zzt, i2);
        zzvxVarArr[length] = zzvxVar;
        this.zzt = zzvxVarArr;
        return zzvxVar;
    }

    private final void zzT() {
        zzcw.zzf(this.zzw);
        this.zzz.getClass();
        this.zzA.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzU() {
        int i;
        if (this.zzO || this.zzw || !this.zzv || this.zzA == null) {
            return;
        }
        for (zzvx zzvxVar : this.zzt) {
            if (zzvxVar.zzi() == null) {
                return;
            }
        }
        this.zzn.zzc();
        int length = this.zzt.length;
        zzbr[] zzbrVarArr = new zzbr[length];
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            zzab zzabVarZzi = this.zzt[i2].zzi();
            zzabVarZzi.getClass();
            String str = zzabVarZzi.zzo;
            boolean zZzg = zzbb.zzg(str);
            boolean z = zZzg || zzbb.zzi(str);
            zArr[i2] = z;
            this.zzx = z | this.zzx;
            this.zzy = this.zzk != C.TIME_UNSET && length == 1 && zzbb.zzh(str);
            zzafr zzafrVar = this.zzs;
            if (zzafrVar != null) {
                if (zZzg || this.zzu[i2].zzb) {
                    zzay zzayVar = zzabVarZzi.zzl;
                    zzay zzayVar2 = zzayVar == null ? new zzay(C.TIME_UNSET, zzafrVar) : zzayVar.zzc(zzafrVar);
                    zzz zzzVarZzb = zzabVarZzi.zzb();
                    zzzVarZzb.zzT(zzayVar2);
                    zzabVarZzi = zzzVarZzb.zzag();
                }
                if (zZzg && zzabVarZzi.zzh == -1 && zzabVarZzi.zzi == -1 && (i = zzafrVar.zza) != -1) {
                    zzz zzzVarZzb2 = zzabVarZzi.zzb();
                    zzzVarZzb2.zzy(i);
                    zzabVarZzi = zzzVarZzb2.zzag();
                }
            }
            zzab zzabVarZzc = zzabVarZzi.zzc(this.zzf.zza(zzabVarZzi));
            zzbrVarArr[i2] = new zzbr(Integer.toString(i2), zzabVarZzc);
            this.zzG = zzabVarZzc.zzu | this.zzG;
        }
        this.zzz = new zzvj(new zzwj(zzbrVarArr), zArr);
        if (this.zzy && this.zzB == C.TIME_UNSET) {
            this.zzB = this.zzk;
            this.zzA = new zzve(this, this.zzA);
        }
        this.zzi.zza(this.zzB, this.zzA.zzh(), this.zzC);
        this.zzw = true;
        zzud zzudVar = this.zzr;
        zzudVar.getClass();
        zzudVar.zzi(this);
    }

    private final void zzV(int i) {
        zzT();
        zzvj zzvjVar = this.zzz;
        boolean[] zArr = zzvjVar.zzd;
        if (zArr[i]) {
            return;
        }
        zzab zzabVarZzb = zzvjVar.zza.zzb(i).zzb(0);
        this.zzg.zzd(new zzuc(1, zzbb.zzb(zzabVarZzb.zzo), zzabVarZzb, 0, null, zzei.zzv(this.zzJ), C.TIME_UNSET));
        zArr[i] = true;
    }

    private final void zzW(int i) {
        zzT();
        boolean[] zArr = this.zzz.zzb;
        if (this.zzL && zArr[i] && !this.zzt[i].zzy(false)) {
            this.zzK = 0L;
            this.zzL = false;
            this.zzF = true;
            this.zzJ = 0L;
            this.zzM = 0;
            for (zzvx zzvxVar : this.zzt) {
                zzvxVar.zzq(false);
            }
            zzud zzudVar = this.zzr;
            zzudVar.getClass();
            zzudVar.zzg(this);
        }
    }

    private final void zzX() {
        zzvf zzvfVar = new zzvf(this, this.zzd, this.zze, this.zzm, this, this.zzn);
        if (this.zzw) {
            zzcw.zzf(zzY());
            long j = this.zzB;
            if (j != C.TIME_UNSET && this.zzK > j) {
                this.zzN = true;
                this.zzK = C.TIME_UNSET;
                return;
            }
            zzadm zzadmVar = this.zzA;
            zzadmVar.getClass();
            zzvf.zzf(zzvfVar, zzadmVar.zzg(this.zzK).zza.zzc, this.zzK);
            for (zzvx zzvxVar : this.zzt) {
                zzvxVar.zzu(this.zzK);
            }
            this.zzK = C.TIME_UNSET;
        }
        this.zzM = zzQ();
        long jZza = this.zzl.zza(zzvfVar, this, zzyo.zza(this.zzD));
        this.zzg.zzh(new zztx(zzvfVar.zzb, zzvfVar.zzl, jZza), new zzuc(1, -1, null, 0, null, zzei.zzv(zzvfVar.zzk), zzei.zzv(this.zzB)));
    }

    private final boolean zzY() {
        return this.zzK != C.TIME_UNSET;
    }

    private final boolean zzZ() {
        return this.zzF || zzY();
    }

    public static /* bridge */ /* synthetic */ long zzr(zzvk zzvkVar, boolean z) {
        return zzvkVar.zzR(true);
    }

    @Override // com.google.android.gms.internal.ads.zzacq
    public final void zzD() {
        this.zzv = true;
        this.zzq.post(this.zzo);
    }

    public final /* synthetic */ void zzE() {
        if (this.zzO) {
            return;
        }
        zzud zzudVar = this.zzr;
        zzudVar.getClass();
        zzudVar.zzg(this);
    }

    public final /* synthetic */ void zzF() {
        this.zzI = true;
    }

    public final /* synthetic */ void zzG(zzadm zzadmVar) {
        this.zzA = this.zzs == null ? zzadmVar : new zzadl(C.TIME_UNSET, 0L);
        this.zzB = zzadmVar.zza();
        boolean z = false;
        if (!this.zzI && zzadmVar.zza() == C.TIME_UNSET) {
            z = true;
        }
        this.zzC = z;
        this.zzD = true == z ? 7 : 1;
        if (this.zzw) {
            this.zzi.zza(this.zzB, zzadmVar.zzh(), this.zzC);
        } else {
            zzU();
        }
    }

    public final void zzH() throws IOException {
        this.zzl.zzi(zzyo.zza(this.zzD));
    }

    public final void zzI(int i) throws IOException {
        this.zzt[i].zzn();
        zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzyq
    public final /* bridge */ /* synthetic */ void zzJ(zzyt zzytVar, long j, long j2, boolean z) {
        zzvf zzvfVar = (zzvf) zzytVar;
        zzgx zzgxVar = zzvfVar.zzd;
        zztx zztxVar = new zztx(zzvfVar.zzb, zzvfVar.zzl, zzgxVar.zzh(), zzgxVar.zzi(), j, j2, zzgxVar.zzg());
        long unused = zzvfVar.zzb;
        this.zzg.zze(zztxVar, new zzuc(1, -1, null, 0, null, zzei.zzv(zzvfVar.zzk), zzei.zzv(this.zzB)));
        if (z) {
            return;
        }
        for (zzvx zzvxVar : this.zzt) {
            zzvxVar.zzq(false);
        }
        if (this.zzH > 0) {
            zzud zzudVar = this.zzr;
            zzudVar.getClass();
            zzudVar.zzg(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyq
    public final /* bridge */ /* synthetic */ void zzK(zzyt zzytVar, long j, long j2) {
        zzadm zzadmVar;
        zzvf zzvfVar = (zzvf) zzytVar;
        if (this.zzB == C.TIME_UNSET && (zzadmVar = this.zzA) != null) {
            boolean zZzh = zzadmVar.zzh();
            long jZzR = zzR(true);
            long j3 = jZzR == Long.MIN_VALUE ? 0L : jZzR + WorkRequest.MIN_BACKOFF_MILLIS;
            this.zzB = j3;
            this.zzi.zza(j3, zZzh, this.zzC);
        }
        zzgx zzgxVar = zzvfVar.zzd;
        zztx zztxVar = new zztx(zzvfVar.zzb, zzvfVar.zzl, zzgxVar.zzh(), zzgxVar.zzi(), j, j2, zzgxVar.zzg());
        long unused = zzvfVar.zzb;
        this.zzg.zzf(zztxVar, new zzuc(1, -1, null, 0, null, zzei.zzv(zzvfVar.zzk), zzei.zzv(this.zzB)));
        this.zzN = true;
        zzud zzudVar = this.zzr;
        zzudVar.getClass();
        zzudVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final void zzL() {
        for (zzvx zzvxVar : this.zzt) {
            zzvxVar.zzp();
        }
        this.zzm.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzvv
    public final void zzM(zzab zzabVar) {
        this.zzq.post(this.zzo);
    }

    public final void zzN() {
        if (this.zzw) {
            for (zzvx zzvxVar : this.zzt) {
                zzvxVar.zzo();
            }
        }
        this.zzl.zzj(this);
        this.zzq.removeCallbacksAndMessages(null);
        this.zzr = null;
        this.zzO = true;
    }

    @Override // com.google.android.gms.internal.ads.zzacq
    public final void zzO(final zzadm zzadmVar) {
        this.zzq.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzvd
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzG(zzadmVar);
            }
        });
    }

    public final boolean zzP(int i) {
        return !zzZ() && this.zzt[i].zzy(this.zzN);
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final long zza(long j, zzlp zzlpVar) {
        zzT();
        if (!this.zzA.zzh()) {
            return 0L;
        }
        zzadk zzadkVarZzg = this.zzA.zzg(j);
        zzadn zzadnVar = zzadkVarZzg.zza;
        zzadn zzadnVar2 = zzadkVarZzg.zzb;
        long j2 = zzlpVar.zzc;
        if (j2 == 0) {
            if (zzlpVar.zzd == 0) {
                return j;
            }
            j2 = 0;
        }
        long j3 = zzadnVar.zzb;
        int i = zzei.zza;
        long j4 = j - j2;
        long j5 = zzlpVar.zzd;
        long j6 = j + j5;
        long j7 = j ^ j6;
        long j8 = j5 ^ j6;
        if (((j ^ j2) & (j ^ j4)) < 0) {
            j4 = Long.MIN_VALUE;
        }
        if ((j7 & j8) < 0) {
            j6 = Long.MAX_VALUE;
        }
        boolean z = j4 <= j3 && j3 <= j6;
        long j9 = zzadnVar2.zzb;
        boolean z2 = j4 <= j9 && j9 <= j6;
        if (z && z2) {
            if (Math.abs(j3 - j) > Math.abs(j9 - j)) {
                return j9;
            }
        } else if (!z) {
            return z2 ? j9 : j4;
        }
        return j3;
    }

    @Override // com.google.android.gms.internal.ads.zzue, com.google.android.gms.internal.ads.zzwa
    public final long zzb() {
        long jZzR;
        zzT();
        if (this.zzN || this.zzH == 0) {
            return Long.MIN_VALUE;
        }
        if (zzY()) {
            return this.zzK;
        }
        if (this.zzx) {
            int length = this.zzt.length;
            jZzR = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                zzvj zzvjVar = this.zzz;
                if (zzvjVar.zzb[i] && zzvjVar.zzc[i] && !this.zzt[i].zzx()) {
                    jZzR = Math.min(jZzR, this.zzt[i].zzh());
                }
            }
        } else {
            jZzR = Long.MAX_VALUE;
        }
        if (jZzR == Long.MAX_VALUE) {
            jZzR = zzR(false);
        }
        return jZzR == Long.MIN_VALUE ? this.zzJ : jZzR;
    }

    @Override // com.google.android.gms.internal.ads.zzue, com.google.android.gms.internal.ads.zzwa
    public final long zzc() {
        return zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final long zzd() {
        if (this.zzG) {
            this.zzG = false;
        } else {
            if (!this.zzF) {
                return C.TIME_UNSET;
            }
            if (!this.zzN && zzQ() <= this.zzM) {
                return C.TIME_UNSET;
            }
            this.zzF = false;
        }
        return this.zzJ;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0077  */
    /* JADX WARN: Code duplicated, block: B:37:0x007c A[LOOP:1: B:36:0x007a->B:37:0x007c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x008a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0093 A[LOOP:2: B:40:0x0091->B:41:0x0093, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:35:0x0077, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:39:0x008a, please report this as an issue */
    @Override // com.google.android.gms.internal.ads.zzue
    public final long zze(long j) {
        zzyy zzyyVar;
        int i;
        zzT();
        boolean[] zArr = this.zzz.zzb;
        if (true != this.zzA.zzh()) {
            j = 0;
        }
        this.zzF = false;
        long j2 = this.zzJ;
        this.zzJ = j;
        if (zzY()) {
            this.zzK = j;
            return j;
        }
        if (this.zzD == 7 || !(this.zzN || this.zzl.zzl())) {
            this.zzL = false;
            this.zzK = j;
            this.zzN = false;
            this.zzG = false;
            zzyyVar = this.zzl;
            if (zzyyVar.zzl()) {
                zzyyVar.zzh();
                for (zzvx zzvxVar : this.zzt) {
                    zzvxVar.zzq(false);
                }
                break;
            }
            for (zzvx zzvxVar2 : this.zzt) {
                zzvxVar2.zzk();
            }
            this.zzl.zzg();
            break;
        }
        int length = this.zzt.length;
        for (int i2 = 0; i2 < length; i2++) {
            zzvx zzvxVar3 = this.zzt[i2];
            if (zzvxVar3.zzb() != 0 || j2 != j) {
                if (!(this.zzy ? zzvxVar3.zzz(zzvxVar3.zza()) : zzvxVar3.zzA(j, false)) && (zArr[i2] || !this.zzx)) {
                    this.zzL = false;
                    this.zzK = j;
                    this.zzN = false;
                    this.zzG = false;
                    zzyyVar = this.zzl;
                    if (zzyyVar.zzl()) {
                        zzyyVar.zzh();
                        while (i < r2) {
                            zzvxVar.zzq(false);
                        }
                        break;
                        break;
                    }
                    while (i < r2) {
                        zzvxVar2.zzk();
                    }
                    this.zzl.zzg();
                    break;
                }
            }
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final long zzf(zzxv[] zzxvVarArr, boolean[] zArr, zzvy[] zzvyVarArr, boolean[] zArr2, long j) {
        zzxv zzxvVar;
        zzT();
        zzvj zzvjVar = this.zzz;
        zzwj zzwjVar = zzvjVar.zza;
        boolean[] zArr3 = zzvjVar.zzc;
        int i = this.zzH;
        int i2 = 0;
        for (int i3 = 0; i3 < zzxvVarArr.length; i3++) {
            zzvy zzvyVar = zzvyVarArr[i3];
            if (zzvyVar != null && (zzxvVarArr[i3] == null || !zArr[i3])) {
                int i4 = ((zzvh) zzvyVar).zzb;
                zzcw.zzf(zArr3[i4]);
                this.zzH--;
                zArr3[i4] = false;
                zzvyVarArr[i3] = null;
            }
        }
        boolean z = !this.zzE ? j == 0 || this.zzy : i != 0;
        for (int i5 = 0; i5 < zzxvVarArr.length; i5++) {
            if (zzvyVarArr[i5] == null && (zzxvVar = zzxvVarArr[i5]) != null) {
                zzcw.zzf(zzxvVar.zzd() == 1);
                zzcw.zzf(zzxvVar.zza(0) == 0);
                int iZza = zzwjVar.zza(zzxvVar.zzg());
                zzcw.zzf(!zArr3[iZza]);
                this.zzH++;
                zArr3[iZza] = true;
                this.zzG = zzxvVar.zzf().zzu | this.zzG;
                zzvyVarArr[i5] = new zzvh(this, iZza);
                zArr2[i5] = true;
                if (!z) {
                    zzvx zzvxVar = this.zzt[iZza];
                    z = (zzvxVar.zzb() == 0 || zzvxVar.zzA(j, true)) ? false : true;
                }
            }
        }
        if (this.zzH == 0) {
            this.zzL = false;
            this.zzF = false;
            this.zzG = false;
            if (this.zzl.zzl()) {
                zzvx[] zzvxVarArr = this.zzt;
                int length = zzvxVarArr.length;
                while (i2 < length) {
                    zzvxVarArr[i2].zzk();
                    i2++;
                }
                this.zzl.zzg();
            } else {
                this.zzN = false;
                for (zzvx zzvxVar2 : this.zzt) {
                    zzvxVar2.zzq(false);
                }
            }
        } else if (z) {
            j = zze(j);
            while (i2 < zzvyVarArr.length) {
                if (zzvyVarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.zzE = true;
        return j;
    }

    public final int zzg(int i, zzke zzkeVar, zzhh zzhhVar, int i2) {
        if (zzZ()) {
            return -3;
        }
        zzV(i);
        int iZze = this.zzt[i].zze(zzkeVar, zzhhVar, i2, this.zzN);
        if (iZze == -3) {
            zzW(i);
        }
        return iZze;
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final zzwj zzh() {
        zzT();
        return this.zzz.zza;
    }

    public final int zzi(int i, long j) {
        if (zzZ()) {
            return 0;
        }
        zzV(i);
        zzvx zzvxVar = this.zzt[i];
        int iZzc = zzvxVar.zzc(j, this.zzN);
        zzvxVar.zzw(iZzc);
        if (iZzc != 0) {
            return iZzc;
        }
        zzW(i);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final void zzj(long j, boolean z) {
        if (this.zzy) {
            return;
        }
        zzT();
        if (zzY()) {
            return;
        }
        boolean[] zArr = this.zzz.zzc;
        int length = this.zzt.length;
        for (int i = 0; i < length; i++) {
            this.zzt[i].zzj(j, false, zArr[i]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final void zzk() throws IOException {
        zzH();
        if (this.zzN && !this.zzw) {
            throw zzbc.zza("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzue
    public final void zzl(zzud zzudVar, long j) {
        this.zzr = zzudVar;
        this.zzn.zze();
        zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzue, com.google.android.gms.internal.ads.zzwa
    public final void zzm(long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzue, com.google.android.gms.internal.ads.zzwa
    public final boolean zzo(zzkj zzkjVar) {
        if (this.zzN) {
            return false;
        }
        zzyy zzyyVar = this.zzl;
        if (zzyyVar.zzk() || this.zzL) {
            return false;
        }
        if (this.zzw && this.zzH == 0) {
            return false;
        }
        boolean zZze = this.zzn.zze();
        if (zzyyVar.zzl()) {
            return zZze;
        }
        zzX();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzue, com.google.android.gms.internal.ads.zzwa
    public final boolean zzp() {
        return this.zzl.zzl() && this.zzn.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzyq
    public final /* bridge */ /* synthetic */ zzyr zzu(zzyt zzytVar, long j, long j2, IOException iOException, int i) {
        long jMin;
        zzyr zzyrVarZzb;
        zzadm zzadmVar;
        zzvf zzvfVar = (zzvf) zzytVar;
        zzgx zzgxVar = zzvfVar.zzd;
        zztx zztxVar = new zztx(zzvfVar.zzb, zzvfVar.zzl, zzgxVar.zzh(), zzgxVar.zzi(), j, j2, zzgxVar.zzg());
        long unused = zzvfVar.zzk;
        int i2 = zzei.zza;
        if ((iOException instanceof zzbc) || (iOException instanceof FileNotFoundException) || (iOException instanceof zzgo) || (iOException instanceof zzyw)) {
            jMin = -9223372036854775807L;
            break;
        }
        Throwable cause = iOException;
        while (true) {
            if (cause == null) {
                jMin = Math.min((i - 1) * 1000, 5000);
                break;
            }
            if ((cause instanceof zzfz) && ((zzfz) cause).zza == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
            cause = cause.getCause();
        }
        if (jMin == C.TIME_UNSET) {
            zzyrVarZzb = zzyy.zzb;
        } else {
            int iZzQ = zzQ();
            boolean z = iZzQ > this.zzM;
            if (this.zzI || !((zzadmVar = this.zzA) == null || zzadmVar.zza() == C.TIME_UNSET)) {
                this.zzM = iZzQ;
            } else {
                boolean z2 = this.zzw;
                if (!z2 || zzZ()) {
                    this.zzF = z2;
                    this.zzJ = 0L;
                    this.zzM = 0;
                    for (zzvx zzvxVar : this.zzt) {
                        zzvxVar.zzq(false);
                    }
                    zzvf.zzf(zzvfVar, 0L, 0L);
                } else {
                    this.zzL = true;
                    zzyrVarZzb = zzyy.zza;
                }
            }
            zzyrVarZzb = zzyy.zzb(z, jMin);
        }
        boolean zZzc = true ^ zzyrVarZzb.zzc();
        this.zzg.zzg(zztxVar, new zzuc(1, -1, null, 0, null, zzei.zzv(zzvfVar.zzk), zzei.zzv(this.zzB)), iOException, zZzc);
        if (zZzc) {
            long unused2 = zzvfVar.zzb;
        }
        return zzyrVarZzb;
    }

    public final zzadt zzv() {
        return zzS(new zzvi(0, true));
    }

    @Override // com.google.android.gms.internal.ads.zzacq
    public final zzadt zzw(int i, int i2) {
        return zzS(new zzvi(i, false));
    }
}
