package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import android.os.Trace;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.gms.ads.AdError;
import com.mbridge.msdk.newreward.player.view.hybrid.util.MRAIDCommunicatorUtil;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.umeng.analytics.pro.cw;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzsn extends zzhr {
    private static final byte[] zzb = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, cw.m, 19, 32, 0, 0, 1, 101, -120, -124, cw.k, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private int zzA;
    private boolean zzB;
    private boolean zzC;
    private boolean zzD;
    private boolean zzE;
    private boolean zzF;
    private boolean zzG;
    private long zzH;
    private long zzI;
    private int zzJ;
    private int zzK;

    @Nullable
    private ByteBuffer zzL;
    private boolean zzM;
    private boolean zzN;
    private boolean zzO;
    private boolean zzP;
    private boolean zzQ;
    private boolean zzR;
    private int zzS;
    private int zzT;
    private int zzU;
    private boolean zzV;
    private boolean zzW;
    private boolean zzX;
    private long zzY;
    private long zzZ;
    protected zzhs zza;
    private boolean zzaa;
    private boolean zzab;
    private boolean zzac;
    private zzsl zzad;
    private long zzae;
    private boolean zzaf;

    @Nullable
    private zzrg zzag;

    @Nullable
    private zzrg zzah;
    private final zzsb zzc;
    private final zzsp zzd;
    private final float zze;
    private final zzhh zzf;
    private final zzhh zzg;
    private final zzhh zzh;
    private final zzru zzi;
    private final MediaCodec.BufferInfo zzj;
    private final ArrayDeque zzk;
    private final zzqt zzl;

    @Nullable
    private zzab zzm;

    @Nullable
    private zzab zzn;

    @Nullable
    private zzli zzo;

    @Nullable
    private MediaCrypto zzp;
    private float zzq;
    private float zzr;

    @Nullable
    private zzsd zzs;

    @Nullable
    private zzab zzt;

    @Nullable
    private MediaFormat zzu;
    private boolean zzv;
    private float zzw;

    @Nullable
    private ArrayDeque zzx;

    @Nullable
    private zzsj zzy;

    @Nullable
    private zzsg zzz;

    public zzsn(int i, zzsb zzsbVar, zzsp zzspVar, boolean z, float f) {
        super(i);
        this.zzc = zzsbVar;
        this.zzd = zzspVar;
        this.zze = f;
        this.zzf = new zzhh(0, 0);
        this.zzg = new zzhh(0, 0);
        this.zzh = new zzhh(2, 0);
        zzru zzruVar = new zzru();
        this.zzi = zzruVar;
        this.zzj = new MediaCodec.BufferInfo();
        this.zzq = 1.0f;
        this.zzr = 1.0f;
        this.zzk = new ArrayDeque();
        this.zzad = zzsl.zza;
        zzruVar.zzj(0);
        zzruVar.zzc.order(ByteOrder.nativeOrder());
        this.zzl = new zzqt();
        this.zzw = -1.0f;
        this.zzA = 0;
        this.zzS = 0;
        this.zzJ = -1;
        this.zzK = -1;
        this.zzI = C.TIME_UNSET;
        this.zzY = C.TIME_UNSET;
        this.zzZ = C.TIME_UNSET;
        this.zzae = C.TIME_UNSET;
        this.zzH = C.TIME_UNSET;
        this.zzT = 0;
        this.zzU = 0;
        this.zza = new zzhs();
    }

    public static boolean zzaP(zzab zzabVar) {
        return zzabVar.zzK == 0;
    }

    private final void zzaQ() {
        this.zzK = -1;
        this.zzL = null;
    }

    private final void zzaR(zzsl zzslVar) {
        this.zzad = zzslVar;
        if (zzslVar.zzd != C.TIME_UNSET) {
            this.zzaf = true;
        }
    }

    @RequiresApi(23)
    private final void zzaS() throws zzib {
        zzrg zzrgVar = this.zzah;
        zzrgVar.getClass();
        this.zzag = zzrgVar;
        this.zzT = 0;
        this.zzU = 0;
    }

    @TargetApi(23)
    private final boolean zzaT() throws zzib {
        if (this.zzV) {
            this.zzT = 1;
            if (this.zzC) {
                this.zzU = 3;
                return false;
            }
            this.zzU = 2;
        } else {
            zzaS();
        }
        return true;
    }

    private final boolean zzaU() {
        return this.zzK >= 0;
    }

    private final boolean zzaV(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        zzab zzabVar = this.zzn;
        return (zzabVar != null && Objects.equals(zzabVar.zzo, MimeTypes.AUDIO_OPUS) && zzadi.zzf(j, j2)) ? false : true;
    }

    private final boolean zzaW(int i) throws zzib {
        zzhh zzhhVar = this.zzf;
        zzke zzkeVarZzk = zzk();
        zzhhVar.zzb();
        int iZzcU = zzcU(zzkeVarZzk, this.zzf, i | 4);
        if (iZzcU == -5) {
            zzac(zzkeVarZzk);
            return true;
        }
        if (iZzcU != -4 || !this.zzf.zzf()) {
            return false;
        }
        this.zzaa = true;
        zzai();
        return false;
    }

    private final boolean zzaX(@Nullable zzab zzabVar) throws zzib {
        if (zzei.zza >= 23 && this.zzs != null && this.zzU != 3 && zzcT() != 0) {
            float f = this.zzr;
            zzabVar.getClass();
            float fZzZ = zzZ(f, zzabVar, zzT());
            float f2 = this.zzw;
            if (f2 != fZzZ) {
                if (fZzZ == -1.0f) {
                    zzae();
                    return false;
                }
                if (f2 != -1.0f || fZzZ > this.zze) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fZzZ);
                    zzsd zzsdVar = this.zzs;
                    zzsdVar.getClass();
                    zzsdVar.zzq(bundle);
                    this.zzw = fZzZ;
                }
            }
        }
        return true;
    }

    private final void zzad() {
        this.zzQ = false;
        this.zzi.zzb();
        this.zzh.zzb();
        this.zzP = false;
        this.zzO = false;
        this.zzl.zzb();
    }

    private final void zzae() throws zzib {
        if (this.zzV) {
            this.zzT = 1;
            this.zzU = 3;
        } else {
            zzaG();
            zzaC();
        }
    }

    private final void zzah() {
        try {
            zzsd zzsdVar = this.zzs;
            zzcw.zzb(zzsdVar);
            zzsdVar.zzj();
        } finally {
            zzaH();
        }
    }

    @TargetApi(23)
    private final void zzai() throws zzib {
        int i = this.zzU;
        if (i == 1) {
            zzah();
            return;
        }
        if (i == 2) {
            zzah();
            zzaS();
        } else if (i != 3) {
            this.zzab = true;
            zzaq();
        } else {
            zzaG();
            zzaC();
        }
    }

    private final void zzao() {
        this.zzJ = -1;
        this.zzg.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public void zzC() {
        try {
            zzad();
            zzaG();
        } finally {
            this.zzah = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        if (r5 >= r1) goto L14;
     */
    @Override // com.google.android.gms.internal.ads.zzhr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void zzF(com.google.android.gms.internal.ads.zzab[] r16, long r17, long r19, com.google.android.gms.internal.ads.zzug r21) throws com.google.android.gms.internal.ads.zzib {
        /*
            r15 = this;
            r0 = r15
            com.google.android.gms.internal.ads.zzsl r1 = r0.zzad
            long r1 = r1.zzd
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L21
            com.google.android.gms.internal.ads.zzsl r1 = new com.google.android.gms.internal.ads.zzsl
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = r1
            r9 = r17
            r11 = r19
            r6.<init>(r7, r9, r11)
            r15.zzaR(r1)
            return
        L21:
            java.util.ArrayDeque r1 = r0.zzk
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L57
            long r1 = r0.zzY
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L39
            long r5 = r0.zzae
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L57
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 < 0) goto L57
        L39:
            com.google.android.gms.internal.ads.zzsl r1 = new com.google.android.gms.internal.ads.zzsl
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = r1
            r11 = r17
            r13 = r19
            r8.<init>(r9, r11, r13)
            r15.zzaR(r1)
            com.google.android.gms.internal.ads.zzsl r1 = r0.zzad
            long r1 = r1.zzd
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L56
            r15.zzap()
        L56:
            return
        L57:
            java.util.ArrayDeque r1 = r0.zzk
            com.google.android.gms.internal.ads.zzsl r9 = new com.google.android.gms.internal.ads.zzsl
            long r3 = r0.zzY
            r2 = r9
            r5 = r17
            r7 = r19
            r2.<init>(r3, r5, r7)
            r1.add(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsn.zzF(com.google.android.gms.internal.ads.zzab[], long, long, com.google.android.gms.internal.ads.zzug):void");
    }

    @Override // com.google.android.gms.internal.ads.zzhr, com.google.android.gms.internal.ads.zzlj
    public void zzM(float f, float f2) throws zzib {
        this.zzq = f;
        this.zzr = f2;
        zzaX(this.zzt);
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 16481. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:99)
        */
    @Override // com.google.android.gms.internal.ads.zzlj
    public void zzV(long r23, long r25) throws com.google.android.gms.internal.ads.zzib {
        /*
            Method dump skipped, instruction units count: 1648
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsn.zzV(long, long):void");
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public boolean zzW() {
        return this.zzab;
    }

    @Override // com.google.android.gms.internal.ads.zzlj
    public boolean zzX() {
        if (this.zzm == null) {
            return false;
        }
        if (zzS() || zzaU()) {
            return true;
        }
        return this.zzI != C.TIME_UNSET && zzi().zzb() < this.zzI;
    }

    @Override // com.google.android.gms.internal.ads.zzlm
    public final int zzY(zzab zzabVar) throws zzib {
        try {
            return zzaa(this.zzd, zzabVar);
        } catch (zzsu e) {
            throw zzcW(e, zzabVar, false, 4002);
        }
    }

    public float zzZ(float f, zzab zzabVar, zzab[] zzabVarArr) {
        throw null;
    }

    public zzsf zzaA(Throwable th, @Nullable zzsg zzsgVar) {
        return new zzsf(th, zzsgVar);
    }

    @Nullable
    public final zzsg zzaB() {
        return this.zzz;
    }

    /* JADX WARN: Code duplicated, block: B:233:0x041f  */
    /* JADX WARN: Code duplicated, block: B:240:0x0434  */
    /* JADX WARN: Code duplicated, block: B:273:0x049b  */
    /* JADX WARN: Code duplicated, block: B:315:0x0550 A[Catch: zzsj -> 0x0553, TryCatch #7 {zzsj -> 0x0553, blocks: (B:313:0x0533, B:315:0x0550, B:319:0x055b, B:322:0x0565, B:323:0x0567, B:318:0x0555, B:324:0x0568, B:326:0x056e, B:327:0x057b), top: B:345:0x009c }] */
    /* JADX WARN: Code duplicated, block: B:318:0x0555 A[Catch: zzsj -> 0x0553, TryCatch #7 {zzsj -> 0x0553, blocks: (B:313:0x0533, B:315:0x0550, B:319:0x055b, B:322:0x0565, B:323:0x0567, B:318:0x0555, B:324:0x0568, B:326:0x056e, B:327:0x057b), top: B:345:0x009c }] */
    /* JADX WARN: Code duplicated, block: B:321:0x0561  */
    /* JADX WARN: Code duplicated, block: B:356:0x0565 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v11, types: [com.google.android.gms.internal.ads.zzsc, com.google.android.gms.internal.ads.zzsk] */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v5, types: [com.google.android.gms.internal.ads.zzsg] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [android.media.MediaCrypto, com.google.android.gms.internal.ads.zzsm] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r1v14, types: [com.google.android.gms.internal.ads.zzsd] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayDeque] */
    /* JADX WARN: Type inference failed for: r21v0, types: [com.google.android.gms.internal.ads.zzhr, com.google.android.gms.internal.ads.zzsn] */
    public final void zzaC() throws zzib {
        zzab zzabVar;
        zzab zzabVar2;
        zzab zzabVar3;
        zzsg zzsgVar;
        ?? r11;
        zzsj zzsjVar;
        zzab zzabVar4;
        zzsj zzsjVar2;
        int i;
        boolean z;
        long j;
        if (this.zzs != null || this.zzO || (zzabVar = this.zzm) == null) {
            return;
        }
        boolean z2 = true;
        if (zzaM(zzabVar)) {
            zzad();
            String str = zzabVar.zzo;
            if (MimeTypes.AUDIO_AAC.equals(str) || MimeTypes.AUDIO_MPEG.equals(str) || MimeTypes.AUDIO_OPUS.equals(str)) {
                this.zzi.zzo(32);
            } else {
                this.zzi.zzo(1);
            }
            this.zzO = true;
            return;
        }
        zzrg zzrgVar = this.zzah;
        this.zzag = zzrgVar;
        if (zzrgVar != null) {
            zzcw.zzf(true);
            zzrg zzrgVar2 = this.zzag;
            boolean z3 = zzrh.zza;
            zzrgVar2.zza();
        }
        try {
            zzab zzabVar5 = this.zzm;
            zzabVar5.getClass();
            ?? r14 = 0;
            if (this.zzx == null) {
                try {
                    List listZzag = zzag(this.zzd, zzabVar5, false);
                    listZzag.isEmpty();
                    this.zzx = new ArrayDeque();
                    if (!listZzag.isEmpty()) {
                        this.zzx.add((zzsg) listZzag.get(0));
                    }
                    this.zzy = null;
                } catch (zzsu e) {
                    throw new zzsj(zzabVar5, (Throwable) e, false, -49998);
                }
            }
            try {
                if (this.zzx.isEmpty()) {
                    throw new zzsj(zzabVar5, (Throwable) null, false, -49999);
                }
                ArrayDeque arrayDeque = this.zzx;
                arrayDeque.getClass();
                while (this.zzs == null) {
                    zzsg zzsgVar2 = (zzsg) arrayDeque.peekFirst();
                    zzsgVar2.getClass();
                    if (!zzaN(zzsgVar2)) {
                        return;
                    }
                    try {
                        zzab zzabVar6 = this.zzm;
                        zzabVar6.getClass();
                        String str2 = zzsgVar2.zza;
                        int i2 = zzei.zza;
                        float fZzZ = i2 < 23 ? -1.0f : zzZ(this.zzr, zzabVar6, zzT());
                        if (fZzZ <= this.zze) {
                            fZzZ = -1.0f;
                        }
                        zzaF(zzabVar6);
                        long jZzb = zzi().zzb();
                        zzsa zzsaVarZzaf = zzaf(zzsgVar2, zzabVar6, r14, fZzZ);
                        ?? zzskVar = z2;
                        if (i2 >= 31) {
                            LogSessionId logSessionIdZza = zzo().zza();
                            if (!logSessionIdZza.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                                zzskVar = z2;
                                zzsaVarZzaf.zzb.setString("log-session-id", logSessionIdZza.getStringId());
                                zzskVar = "log-session-id";
                            }
                        }
                        try {
                            zzskVar = z2;
                            Trace.beginSection("createCodec:" + str2);
                            ?? Zzd = this.zzc.zzd(zzsaVarZzaf);
                            this.zzs = Zzd;
                            zzskVar = new zzsk(this, r14);
                            Zzd.zzs(zzskVar);
                            Trace.endSection();
                            long jZzb2 = zzi().zzb();
                            try {
                                try {
                                    if (zzsgVar2.zze(zzabVar6)) {
                                        zzabVar2 = zzabVar;
                                        zzabVar3 = zzabVar5;
                                        arrayDeque = arrayDeque;
                                    } else {
                                        try {
                                            StringBuilder sb = new StringBuilder();
                                            sb.append("id=");
                                            sb.append(zzabVar6.zza);
                                            sb.append(", mimeType=");
                                            sb.append(zzabVar6.zzo);
                                            if (zzabVar6.zzn != null) {
                                                sb.append(", container=");
                                                sb.append(zzabVar6.zzn);
                                            }
                                            if (zzabVar6.zzj != -1) {
                                                sb.append(", bitrate=");
                                                sb.append(zzabVar6.zzj);
                                            }
                                            if (zzabVar6.zzk != null) {
                                                sb.append(", codecs=");
                                                sb.append(zzabVar6.zzk);
                                            }
                                            if (zzabVar6.zzs != null) {
                                                LinkedHashSet linkedHashSet = new LinkedHashSet();
                                                zzabVar2 = zzabVar;
                                                int i3 = 0;
                                                while (true) {
                                                    try {
                                                        zzu zzuVar = zzabVar6.zzs;
                                                        zzabVar3 = zzabVar5;
                                                        try {
                                                            if (i3 >= zzuVar.zzb) {
                                                                break;
                                                            }
                                                            UUID uuid = zzuVar.zza(i3).zza;
                                                            try {
                                                                if (uuid.equals(zzh.zzb)) {
                                                                    try {
                                                                        linkedHashSet.add(C.CENC_TYPE_cenc);
                                                                    } catch (Exception e2) {
                                                                        e = e2;
                                                                        arrayDeque = arrayDeque;
                                                                        zzsgVar = zzsgVar2;
                                                                        r11 = zzsgVar;
                                                                        zzdo.zzg("MediaCodecRenderer", "Failed to initialize decoder: ".concat(r11.zza), e);
                                                                        arrayDeque.removeFirst();
                                                                        zzabVar4 = zzabVar3;
                                                                        zzsjVar = new zzsj(zzabVar4, (Throwable) e, false, (zzsg) r11);
                                                                        zzak(zzsjVar);
                                                                        zzsjVar2 = this.zzy;
                                                                        if (zzsjVar2 == null) {
                                                                            this.zzy = zzsjVar;
                                                                        } else {
                                                                            this.zzy = zzsj.zza(zzsjVar2, zzsjVar);
                                                                        }
                                                                        if (!arrayDeque.isEmpty()) {
                                                                            throw this.zzy;
                                                                        }
                                                                        zzabVar5 = zzabVar4;
                                                                        zzabVar = zzabVar2;
                                                                        arrayDeque = arrayDeque;
                                                                        z2 = true;
                                                                        r14 = 0;
                                                                    }
                                                                } else if (uuid.equals(zzh.zzc)) {
                                                                    linkedHashSet.add("clearkey");
                                                                } else if (uuid.equals(zzh.zze)) {
                                                                    linkedHashSet.add("playready");
                                                                } else if (uuid.equals(zzh.zzd)) {
                                                                    linkedHashSet.add("widevine");
                                                                } else {
                                                                    if (uuid.equals(zzh.zza)) {
                                                                        linkedHashSet.add(GatewayException.GATEWAY_RESPONSE_DEPTH_UNIVERSAL);
                                                                    } else {
                                                                        String string = uuid.toString();
                                                                        StringBuilder sb2 = new StringBuilder();
                                                                        sb2.append("unknown (");
                                                                        sb2.append(string);
                                                                        sb2.append(")");
                                                                        linkedHashSet.add(sb2.toString());
                                                                    }
                                                                    i3++;
                                                                    zzabVar5 = zzabVar3;
                                                                    arrayDeque = arrayDeque;
                                                                }
                                                                i3++;
                                                                zzabVar5 = zzabVar3;
                                                                arrayDeque = arrayDeque;
                                                            } catch (Exception e3) {
                                                                e = e3;
                                                            }
                                                        } catch (Exception e4) {
                                                            e = e4;
                                                            arrayDeque = arrayDeque;
                                                        }
                                                    } catch (Exception e5) {
                                                        e = e5;
                                                        zzabVar3 = zzabVar5;
                                                        arrayDeque = arrayDeque;
                                                        zzsgVar = zzsgVar2;
                                                        r11 = zzsgVar;
                                                        zzdo.zzg("MediaCodecRenderer", "Failed to initialize decoder: ".concat(r11.zza), e);
                                                        arrayDeque.removeFirst();
                                                        zzabVar4 = zzabVar3;
                                                        zzsjVar = new zzsj(zzabVar4, (Throwable) e, false, (zzsg) r11);
                                                        zzak(zzsjVar);
                                                        zzsjVar2 = this.zzy;
                                                        if (zzsjVar2 == null) {
                                                            this.zzy = zzsjVar;
                                                        } else {
                                                            this.zzy = zzsj.zza(zzsjVar2, zzsjVar);
                                                        }
                                                        if (!arrayDeque.isEmpty()) {
                                                            throw this.zzy;
                                                        }
                                                        zzabVar5 = zzabVar4;
                                                        zzabVar = zzabVar2;
                                                        arrayDeque = arrayDeque;
                                                        z2 = true;
                                                        r14 = 0;
                                                    }
                                                    zzsgVar = zzsgVar2;
                                                    r11 = zzsgVar;
                                                    zzdo.zzg("MediaCodecRenderer", "Failed to initialize decoder: ".concat(r11.zza), e);
                                                    arrayDeque.removeFirst();
                                                    zzabVar4 = zzabVar3;
                                                    zzsjVar = new zzsj(zzabVar4, (Throwable) e, false, (zzsg) r11);
                                                    zzak(zzsjVar);
                                                    zzsjVar2 = this.zzy;
                                                    if (zzsjVar2 == null) {
                                                        this.zzy = zzsjVar;
                                                    } else {
                                                        this.zzy = zzsj.zza(zzsjVar2, zzsjVar);
                                                    }
                                                    if (!arrayDeque.isEmpty()) {
                                                        throw this.zzy;
                                                    }
                                                    zzabVar5 = zzabVar4;
                                                    zzabVar = zzabVar2;
                                                    arrayDeque = arrayDeque;
                                                    z2 = true;
                                                    r14 = 0;
                                                }
                                                arrayDeque = arrayDeque;
                                                sb.append(", drm=[");
                                                zzfuf.zzb(sb, linkedHashSet, ",");
                                                sb.append(']');
                                            } else {
                                                zzabVar2 = zzabVar;
                                                zzabVar3 = zzabVar5;
                                                arrayDeque = arrayDeque;
                                            }
                                            if (zzabVar6.zzv != -1 && zzabVar6.zzw != -1) {
                                                sb.append(", res=");
                                                sb.append(zzabVar6.zzv);
                                                sb.append("x");
                                                sb.append(zzabVar6.zzw);
                                            }
                                            zzk zzkVar = zzabVar6.zzC;
                                            if (zzkVar != null && (zzkVar.zze() || zzkVar.zzf())) {
                                                sb.append(", color=");
                                                sb.append(zzabVar6.zzC.zzd());
                                            }
                                            if (zzabVar6.zzx != -1.0f) {
                                                sb.append(", fps=");
                                                sb.append(zzabVar6.zzx);
                                            }
                                            if (zzabVar6.zzD != -1) {
                                                sb.append(", channels=");
                                                sb.append(zzabVar6.zzD);
                                            }
                                            if (zzabVar6.zzE != -1) {
                                                sb.append(", sample_rate=");
                                                sb.append(zzabVar6.zzE);
                                            }
                                            if (zzabVar6.zzd != null) {
                                                sb.append(", language=");
                                                sb.append(zzabVar6.zzd);
                                            }
                                            if (!zzabVar6.zzc.isEmpty()) {
                                                sb.append(", labels=[");
                                                zzfuf.zzb(sb, zzfyd.zzb(zzabVar6.zzc, new zzfuc() { // from class: com.google.android.gms.internal.ads.zzy
                                                    @Override // com.google.android.gms.internal.ads.zzfuc
                                                    public final Object apply(Object obj) {
                                                        zzad zzadVar = (zzad) obj;
                                                        int i4 = zzab.zzL;
                                                        return DM.i(zzadVar.zza, ": ", zzadVar.zzb);
                                                    }
                                                }), ",");
                                                sb.append("]");
                                            }
                                            if (zzabVar6.zze != 0) {
                                                sb.append(", selectionFlags=[");
                                                int i4 = zzabVar6.zze;
                                                ArrayList arrayList = new ArrayList();
                                                if ((i4 & 1) != 0) {
                                                    arrayList.add(MRAIDCommunicatorUtil.STATES_DEFAULT);
                                                }
                                                if ((i4 & 2) != 0) {
                                                    arrayList.add("forced");
                                                }
                                                zzfuf.zzb(sb, arrayList, ",");
                                                sb.append("]");
                                            }
                                            if (zzabVar6.zzf != 0) {
                                                sb.append(", roleFlags=[");
                                                int i5 = zzabVar6.zzf;
                                                ArrayList arrayList2 = new ArrayList();
                                                if ((i5 & 1) != 0) {
                                                    arrayList2.add("main");
                                                }
                                                if ((i5 & 2) != 0) {
                                                    arrayList2.add("alt");
                                                }
                                                if ((i5 & 4) != 0) {
                                                    arrayList2.add("supplementary");
                                                }
                                                if ((i5 & 8) != 0) {
                                                    arrayList2.add("commentary");
                                                }
                                                if ((i5 & 16) != 0) {
                                                    arrayList2.add("dub");
                                                }
                                                if ((i5 & 32) != 0) {
                                                    arrayList2.add("emergency");
                                                }
                                                if ((i5 & 64) != 0) {
                                                    arrayList2.add("caption");
                                                }
                                                if ((i5 & 128) != 0) {
                                                    arrayList2.add("subtitle");
                                                }
                                                if ((i5 & 256) != 0) {
                                                    arrayList2.add("sign");
                                                }
                                                if ((i5 & 512) != 0) {
                                                    arrayList2.add("describes-video");
                                                }
                                                if ((i5 & 1024) != 0) {
                                                    arrayList2.add("describes-music");
                                                }
                                                if ((i5 & 2048) != 0) {
                                                    arrayList2.add("enhanced-intelligibility");
                                                }
                                                if ((i5 & 4096) != 0) {
                                                    arrayList2.add("transcribes-dialog");
                                                }
                                                if ((i5 & 8192) != 0) {
                                                    arrayList2.add("easy-read");
                                                }
                                                if ((i5 & 16384) != 0) {
                                                    arrayList2.add("trick-play");
                                                }
                                                if ((i5 & 32768) != 0) {
                                                    arrayList2.add("auxiliary");
                                                }
                                                zzfuf.zzb(sb, arrayList2, ",");
                                                sb.append("]");
                                            }
                                            if ((zzabVar6.zzf & 32768) != 0) {
                                                sb.append(", auxiliaryTrackType=");
                                                sb.append(AdError.UNDEFINED_DOMAIN);
                                            }
                                            String string2 = sb.toString();
                                            Locale locale = Locale.US;
                                            zzdo.zzf("MediaCodecRenderer", "Format exceeds selected codec's capabilities [" + string2 + ", " + str2 + "]");
                                        } catch (Exception e6) {
                                            e = e6;
                                            zzabVar2 = zzabVar;
                                        }
                                    }
                                    zzal(str2, zzsaVarZzaf, jZzb2, j);
                                    zzabVar = zzabVar2;
                                    zzabVar5 = zzabVar3;
                                } catch (Exception e7) {
                                    e = e7;
                                    r11 = zzskVar;
                                }
                                this.zza.zza++;
                                j = jZzb2 - jZzb;
                                zzskVar = zzsgVar2;
                            } catch (Exception e8) {
                                e = e8;
                                r11 = zzsgVar2;
                                zzdo.zzg("MediaCodecRenderer", "Failed to initialize decoder: ".concat(r11.zza), e);
                                arrayDeque.removeFirst();
                                zzabVar4 = zzabVar3;
                                zzsjVar = new zzsj(zzabVar4, (Throwable) e, false, (zzsg) r11);
                                zzak(zzsjVar);
                                zzsjVar2 = this.zzy;
                                if (zzsjVar2 == null) {
                                    this.zzy = zzsjVar;
                                } else {
                                    this.zzy = zzsj.zza(zzsjVar2, zzsjVar);
                                }
                                if (!arrayDeque.isEmpty()) {
                                    throw this.zzy;
                                }
                                zzabVar5 = zzabVar4;
                                zzabVar = zzabVar2;
                            }
                            this.zzz = zzsgVar2;
                            this.zzw = fZzZ;
                            this.zzt = zzabVar6;
                            int i6 = zzei.zza;
                            if (i6 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str2)) {
                                String str3 = zzei.zzd;
                                if (str3.startsWith("SM-T585") || str3.startsWith("SM-A510") || str3.startsWith("SM-A520") || str3.startsWith("SM-J700")) {
                                    i = 2;
                                } else if (i6 < 24) {
                                    i = 0;
                                } else {
                                    i = 0;
                                }
                            } else if (i6 < 24 || !("OMX.Nvidia.h264.decode".equals(str2) || "OMX.Nvidia.h264.decode.secure".equals(str2))) {
                                i = 0;
                            } else {
                                String str4 = zzei.zzb;
                                if ("flounder".equals(str4) || "flounder_lte".equals(str4) || "grouper".equals(str4) || "tilapia".equals(str4)) {
                                    i = 1;
                                } else {
                                    i = 0;
                                }
                            }
                            this.zzA = i;
                            this.zzB = i6 == 29 && "c2.android.aac.decoder".equals(str2);
                            this.zzC = i6 <= 23 && "OMX.google.vorbis.decoder".equals(str2);
                            this.zzD = i6 == 21 && "OMX.google.aac.decoder".equals(str2);
                            String str5 = zzsgVar2.zza;
                            if (i6 <= 25 && "OMX.rk.video_decoder.avc".equals(str5)) {
                                z = true;
                            } else if ((i6 > 29 || !("OMX.broadcom.video_decoder.tunnel".equals(str5) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str5) || "OMX.bcm.vdec.avc.tunnel".equals(str5) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str5) || "OMX.bcm.vdec.hevc.tunnel".equals(str5) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str5))) && !("Amazon".equals(zzei.zzc) && "AFTS".equals(zzei.zzd) && zzsgVar2.zzf)) {
                                z = false;
                            } else {
                                z = true;
                            }
                            this.zzG = z;
                            this.zzs.getClass();
                            if (zzcT() == 2) {
                                this.zzI = zzi().zzb() + 1000;
                            }
                            arrayDeque = arrayDeque;
                            z2 = true;
                            r14 = 0;
                        } catch (Throwable th) {
                            zzskVar = zzsgVar2;
                            zzabVar2 = zzabVar;
                            zzabVar3 = zzabVar5;
                            arrayDeque = arrayDeque;
                            Trace.endSection();
                            throw th;
                        }
                    } catch (Exception e9) {
                        e = e9;
                        zzabVar2 = zzabVar;
                        zzabVar3 = zzabVar5;
                    }
                }
                this.zzx = r14;
            } catch (zzsj e10) {
                e = e10;
                throw zzcW(e, zzabVar, false, 4001);
            }
        } catch (zzsj e11) {
            e = e11;
            throw zzcW(e, zzabVar, false, 4001);
        }
    }

    @CallSuper
    public void zzaD(long j) {
        this.zzae = j;
        while (!this.zzk.isEmpty() && j >= ((zzsl) this.zzk.peek()).zzb) {
            zzsl zzslVar = (zzsl) this.zzk.poll();
            zzslVar.getClass();
            zzaR(zzslVar);
            zzap();
        }
    }

    public void zzaE(zzhh zzhhVar) throws zzib {
    }

    public void zzaF(zzab zzabVar) throws zzib {
    }

    public final void zzaG() {
        try {
            zzsd zzsdVar = this.zzs;
            if (zzsdVar != null) {
                zzsdVar.zzm();
                this.zza.zzb++;
                zzsg zzsgVar = this.zzz;
                zzsgVar.getClass();
                zzam(zzsgVar.zza);
            }
        } finally {
            this.zzs = null;
            this.zzp = null;
            this.zzag = null;
            zzaI();
        }
    }

    @CallSuper
    public void zzaH() {
        zzao();
        zzaQ();
        this.zzI = C.TIME_UNSET;
        this.zzW = false;
        this.zzH = C.TIME_UNSET;
        this.zzV = false;
        this.zzE = false;
        this.zzF = false;
        this.zzM = false;
        this.zzN = false;
        this.zzY = C.TIME_UNSET;
        this.zzZ = C.TIME_UNSET;
        this.zzae = C.TIME_UNSET;
        this.zzT = 0;
        this.zzU = 0;
        this.zzS = this.zzR ? 1 : 0;
    }

    @CallSuper
    public final void zzaI() {
        zzaH();
        this.zzx = null;
        this.zzz = null;
        this.zzt = null;
        this.zzu = null;
        this.zzv = false;
        this.zzX = false;
        this.zzw = -1.0f;
        this.zzA = 0;
        this.zzB = false;
        this.zzC = false;
        this.zzD = false;
        this.zzG = false;
        this.zzR = false;
        this.zzS = 0;
    }

    public final boolean zzaJ() throws zzib {
        boolean zZzaK = zzaK();
        if (zZzaK) {
            zzaC();
        }
        return zZzaK;
    }

    public final boolean zzaK() {
        if (this.zzs == null) {
            return false;
        }
        int i = this.zzU;
        if (i == 3 || ((this.zzB && !this.zzX) || (this.zzC && this.zzW))) {
            zzaG();
            return true;
        }
        if (i == 2) {
            int i2 = zzei.zza;
            zzcw.zzf(i2 >= 23);
            if (i2 >= 23) {
                try {
                    zzaS();
                } catch (zzib e) {
                    zzdo.zzg("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
                    zzaG();
                    return true;
                }
            }
        }
        zzah();
        return false;
    }

    public final boolean zzaL() {
        return this.zzO;
    }

    public final boolean zzaM(zzab zzabVar) {
        return this.zzah == null && zzas(zzabVar);
    }

    public boolean zzaN(zzsg zzsgVar) {
        return true;
    }

    public boolean zzaO(zzhh zzhhVar) {
        return false;
    }

    public abstract int zzaa(zzsp zzspVar, zzab zzabVar) throws zzsu;

    public zzht zzab(zzsg zzsgVar, zzab zzabVar, zzab zzabVar2) {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007a  */
    @Nullable
    @CallSuper
    public zzht zzac(zzke zzkeVar) throws zzib {
        int i;
        boolean z = true;
        this.zzac = true;
        zzab zzabVarZzag = zzkeVar.zza;
        zzabVarZzag.getClass();
        String str = zzabVarZzag.zzo;
        if (str == null) {
            throw zzcW(new IllegalArgumentException("Sample MIME type is null."), zzabVarZzag, false, 4005);
        }
        if (str.equals(com.unity3d.services.core.device.MimeTypes.VIDEO_AV1) && !zzabVarZzag.zzr.isEmpty()) {
            zzz zzzVarZzb = zzabVarZzag.zzb();
            zzzVarZzb.zzN(null);
            zzabVarZzag = zzzVarZzb.zzag();
        }
        zzab zzabVar = zzabVarZzag;
        this.zzah = zzkeVar.zzb;
        this.zzm = zzabVar;
        if (this.zzO) {
            this.zzQ = true;
            return null;
        }
        zzsd zzsdVar = this.zzs;
        if (zzsdVar == null) {
            this.zzx = null;
            zzaC();
            return null;
        }
        zzsg zzsgVar = this.zzz;
        zzsgVar.getClass();
        zzab zzabVar2 = this.zzt;
        zzabVar2.getClass();
        zzrg zzrgVar = this.zzag;
        zzrg zzrgVar2 = this.zzah;
        if (zzrgVar != zzrgVar2) {
            zzae();
            return new zzht(zzsgVar.zza, zzabVar2, zzabVar, 0, 128);
        }
        boolean z2 = zzrgVar2 != zzrgVar;
        zzcw.zzf(!z2 || zzei.zza >= 23);
        zzht zzhtVarZzab = zzab(zzsgVar, zzabVar2, zzabVar);
        int i2 = zzhtVarZzab.zzd;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (zzaX(zzabVar)) {
                        this.zzt = zzabVar;
                        if (!z2 || zzaT()) {
                        }
                    } else {
                        i = 16;
                    }
                } else if (zzaX(zzabVar)) {
                    this.zzR = true;
                    this.zzS = 1;
                    int i3 = this.zzA;
                    if (i3 != 2 && (i3 != 1 || zzabVar.zzv != zzabVar2.zzv || zzabVar.zzw != zzabVar2.zzw)) {
                        z = false;
                    }
                    this.zzE = z;
                    this.zzt = zzabVar;
                    if (!z2 || zzaT()) {
                    }
                } else {
                    i = 16;
                }
            } else if (zzaX(zzabVar)) {
                this.zzt = zzabVar;
                if (z2) {
                    if (zzaT()) {
                    }
                } else if (this.zzV) {
                    this.zzT = 1;
                    if (this.zzC) {
                        this.zzU = 3;
                    } else {
                        this.zzU = 1;
                    }
                }
            } else {
                i = 16;
            }
            return (zzhtVarZzab.zzd != 0 || (this.zzs == zzsdVar && this.zzU != 3)) ? zzhtVarZzab : new zzht(zzsgVar.zza, zzabVar2, zzabVar, 0, i);
        }
        zzae();
        i = 0;
        if (zzhtVarZzab.zzd != 0) {
        }
    }

    public abstract zzsa zzaf(zzsg zzsgVar, zzab zzabVar, @Nullable MediaCrypto mediaCrypto, float f);

    public abstract List zzag(zzsp zzspVar, zzab zzabVar, boolean z) throws zzsu;

    public void zzaj(zzhh zzhhVar) throws zzib {
        throw null;
    }

    public void zzak(Exception exc) {
        throw null;
    }

    public void zzal(String str, zzsa zzsaVar, long j, long j2) {
        throw null;
    }

    public void zzam(String str) {
        throw null;
    }

    public void zzan(zzab zzabVar, @Nullable MediaFormat mediaFormat) throws zzib {
        throw null;
    }

    public void zzap() {
    }

    public void zzaq() throws zzib {
    }

    public abstract boolean zzar(long j, long j2, @Nullable zzsd zzsdVar, @Nullable ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, zzab zzabVar) throws zzib;

    public boolean zzas(zzab zzabVar) {
        return false;
    }

    public final float zzat() {
        return this.zzq;
    }

    public int zzau(zzhh zzhhVar) {
        return 0;
    }

    public final long zzav() {
        return this.zzad.zzd;
    }

    public final long zzaw() {
        return this.zzad.zzc;
    }

    @Nullable
    public final zzli zzay() {
        return this.zzo;
    }

    @Nullable
    public final zzsd zzaz() {
        return this.zzs;
    }

    @Override // com.google.android.gms.internal.ads.zzhr, com.google.android.gms.internal.ads.zzlm
    public final int zze() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzhr, com.google.android.gms.internal.ads.zzle
    public void zzu(int i, @Nullable Object obj) throws zzib {
        if (i == 11) {
            this.zzo = (zzli) obj;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public void zzx() {
        this.zzm = null;
        zzaR(zzsl.zza);
        this.zzk.clear();
        zzaK();
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public void zzy(boolean z, boolean z2) throws zzib {
        this.zza = new zzhs();
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    public void zzz(long j, boolean z) throws zzib {
        this.zzaa = false;
        this.zzab = false;
        if (this.zzO) {
            this.zzi.zzb();
            this.zzh.zzb();
            this.zzP = false;
            this.zzl.zzb();
        } else {
            zzaJ();
        }
        zzee zzeeVar = this.zzad.zze;
        if (zzeeVar.zza() > 0) {
            this.zzac = true;
        }
        zzeeVar.zze();
        this.zzk.clear();
    }
}
