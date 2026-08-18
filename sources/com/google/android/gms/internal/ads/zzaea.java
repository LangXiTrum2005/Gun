package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaea implements zzacn {
    private static final int[] zza = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final int[] zzb = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    private static final byte[] zzc;
    private static final byte[] zzd;
    private final byte[] zze;
    private final zzadt zzf;
    private boolean zzg;
    private long zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private zzacq zzn;
    private zzadt zzo;
    private zzadt zzp;
    private zzadm zzq;
    private long zzr;
    private boolean zzs;

    static {
        int i = zzei.zza;
        Charset charset = StandardCharsets.UTF_8;
        zzc = "#!AMR\n".getBytes(charset);
        zzd = "#!AMR-WB\n".getBytes(charset);
    }

    public zzaea() {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Code duplicated, block: B:31:0x005e  */
    private final int zza(zzaco zzacoVar) throws IOException {
        int i = this.zzj;
        if (i == 0) {
            try {
                zzacoVar.zzj();
                zzacoVar.zzh(this.zze, 0, 1);
                byte b = this.zze[0];
                if ((b & 131) > 0) {
                    throw zzbc.zza("Invalid padding bits for frame header " + ((int) b), null);
                }
                int i2 = b >> 3;
                boolean z = this.zzg;
                int i3 = i2 & 15;
                if (!z) {
                    if (!z) {
                        if (i3 >= 12 && i3 <= 14) {
                        }
                    }
                    throw zzbc.zza("Illegal AMR " + (true != z ? "NB" : "WB") + " frame type " + i3, null);
                }
                if (i3 >= 10 && i3 <= 13) {
                    if (!z) {
                        if (i3 >= 12) {
                        }
                    }
                    if (true != z) {
                    }
                    throw zzbc.zza("Illegal AMR " + (true != z ? "NB" : "WB") + " frame type " + i3, null);
                }
                i = z ? zzb[i3] : zza[i3];
                this.zzi = i;
                this.zzj = i;
                int i4 = this.zzk;
                if (i4 == -1) {
                    this.zzk = i;
                    i4 = i;
                }
                if (i4 == i) {
                    this.zzl++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int iZzf = this.zzp.zzf(zzacoVar, i, true);
        if (iZzf == -1) {
            return -1;
        }
        int i5 = this.zzj - iZzf;
        this.zzj = i5;
        if (i5 > 0) {
            return 0;
        }
        this.zzp.zzt(this.zzh, 1, this.zzi, 0, null);
        this.zzh += 20000;
        return 0;
    }

    private static boolean zzg(zzaco zzacoVar, byte[] bArr) throws IOException {
        zzacoVar.zzj();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        zzacoVar.zzh(bArr2, 0, length);
        return Arrays.equals(bArr2, bArr);
    }

    private final boolean zzh(zzaco zzacoVar) throws IOException {
        byte[] bArr = zzc;
        if (zzg(zzacoVar, bArr)) {
            this.zzg = false;
            zzacoVar.zzk(bArr.length);
            return true;
        }
        byte[] bArr2 = zzd;
        if (!zzg(zzacoVar, bArr2)) {
            return false;
        }
        this.zzg = true;
        zzacoVar.zzk(bArr2.length);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final int zzb(zzaco zzacoVar, zzadj zzadjVar) throws IOException {
        zzcw.zzb(this.zzo);
        int i = zzei.zza;
        if (zzacoVar.zzf() == 0 && !zzh(zzacoVar)) {
            throw zzbc.zza("Could not find AMR header.", null);
        }
        if (!this.zzs) {
            this.zzs = true;
            boolean z = this.zzg;
            String str = true != z ? MimeTypes.AUDIO_AMR_NB : MimeTypes.AUDIO_AMR_WB;
            int i2 = true != z ? 8000 : 16000;
            int i3 = z ? zzb[8] : zza[7];
            zzadt zzadtVar = this.zzp;
            zzz zzzVar = new zzz();
            zzzVar.zzaa(str);
            zzzVar.zzR(i3);
            zzzVar.zzz(1);
            zzzVar.zzab(i2);
            zzadtVar.zzm(zzzVar.zzag());
        }
        int iZza = zza(zzacoVar);
        if (this.zzq == null) {
            zzadl zzadlVar = new zzadl(C.TIME_UNSET, 0L);
            this.zzq = zzadlVar;
            this.zzn.zzO(zzadlVar);
        }
        return iZza == -1 ? -1 : 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final /* synthetic */ zzacn zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final /* synthetic */ List zzd() {
        return zzfxn.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zze(zzacq zzacqVar) {
        this.zzn = zzacqVar;
        zzadt zzadtVarZzw = zzacqVar.zzw(0, 1);
        this.zzo = zzadtVarZzw;
        this.zzp = zzadtVarZzw;
        zzacqVar.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzf(long j, long j2) {
        this.zzh = 0L;
        this.zzi = 0;
        this.zzj = 0;
        this.zzr = j2;
        this.zzm = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final boolean zzi(zzaco zzacoVar) throws IOException {
        return zzh(zzacoVar);
    }

    public zzaea(int i) {
        this.zze = new byte[1];
        this.zzk = -1;
        zzaci zzaciVar = new zzaci();
        this.zzf = zzaciVar;
        this.zzp = zzaciVar;
    }
}
