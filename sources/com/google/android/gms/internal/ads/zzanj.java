package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzanj implements zzacn {
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private long zzh;

    @Nullable
    private zzang zzi;
    private zzacq zzj;
    private boolean zzk;
    private final zzef zza = new zzef(0);
    private final zzdy zzc = new zzdy(4096);
    private final SparseArray zzb = new SparseArray();
    private final zzanh zzd = new zzanh();

    /* JADX WARN: Code duplicated, block: B:64:0x0149  */
    @Override // com.google.android.gms.internal.ads.zzacn
    public final int zzb(zzaco zzacoVar, zzadj zzadjVar) throws IOException {
        zzamj zzamlVar;
        zzcw.zzb(this.zzj);
        long jZzd = zzacoVar.zzd();
        if (jZzd != -1) {
            zzanh zzanhVar = this.zzd;
            if (!zzanhVar.zze()) {
                return zzanhVar.zza(zzacoVar, zzadjVar);
            }
        }
        if (!this.zzk) {
            this.zzk = true;
            zzanh zzanhVar2 = this.zzd;
            if (zzanhVar2.zzb() != C.TIME_UNSET) {
                zzang zzangVar = new zzang(zzanhVar2.zzd(), zzanhVar2.zzb(), jZzd);
                this.zzi = zzangVar;
                this.zzj.zzO(zzangVar.zzb());
            } else {
                this.zzj.zzO(new zzadl(zzanhVar2.zzb(), 0L));
            }
        }
        zzang zzangVar2 = this.zzi;
        if (zzangVar2 != null && zzangVar2.zze()) {
            return zzangVar2.zza(zzacoVar, zzadjVar);
        }
        zzacoVar.zzj();
        long jZze = jZzd != -1 ? jZzd - zzacoVar.zze() : -1L;
        if ((jZze != -1 && jZze < 4) || !zzacoVar.zzm(this.zzc.zzN(), 0, 4, true)) {
            return -1;
        }
        this.zzc.zzL(0);
        int iZzg = this.zzc.zzg();
        if (iZzg == 441) {
            return -1;
        }
        if (iZzg == 442) {
            zzacoVar.zzh(this.zzc.zzN(), 0, 10);
            this.zzc.zzL(9);
            zzacoVar.zzk((this.zzc.zzm() & 7) + 14);
            return 0;
        }
        if (iZzg == 443) {
            zzacoVar.zzh(this.zzc.zzN(), 0, 2);
            this.zzc.zzL(0);
            zzacoVar.zzk(this.zzc.zzq() + 6);
            return 0;
        }
        if ((iZzg >> 8) != 1) {
            zzacoVar.zzk(1);
            return 0;
        }
        int i = iZzg & 255;
        zzani zzaniVar = (zzani) this.zzb.get(i);
        if (!this.zze) {
            if (zzaniVar == null) {
                zzamj zzamjVar = null;
                if (i == 189) {
                    zzamlVar = new zzamb(null, 0);
                    this.zzf = true;
                    this.zzh = zzacoVar.zzf();
                } else if ((iZzg & 224) == 192) {
                    zzamlVar = new zzamv(null, 0);
                    this.zzf = true;
                    this.zzh = zzacoVar.zzf();
                } else if ((iZzg & PsExtractor.VIDEO_STREAM_MASK) == 224) {
                    zzamlVar = new zzaml(null);
                    this.zzg = true;
                    this.zzh = zzacoVar.zzf();
                } else if (zzamjVar != null) {
                    zzamjVar.zzb(this.zzj, new zzanx(Integer.MIN_VALUE, i, 256));
                    zzaniVar = new zzani(zzamjVar, this.zza);
                    this.zzb.put(i, zzaniVar);
                }
                zzamjVar = zzamlVar;
                if (zzamjVar != null) {
                    zzamjVar.zzb(this.zzj, new zzanx(Integer.MIN_VALUE, i, 256));
                    zzaniVar = new zzani(zzamjVar, this.zza);
                    this.zzb.put(i, zzaniVar);
                }
            }
            boolean z = this.zzf;
            long j = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            if (z && this.zzg) {
                j = PlaybackStateCompat.ACTION_PLAY_FROM_URI + this.zzh;
            }
            if (zzacoVar.zzf() > j) {
                this.zze = true;
                this.zzj.zzD();
            }
        }
        zzacoVar.zzh(this.zzc.zzN(), 0, 2);
        this.zzc.zzL(0);
        int iZzq = this.zzc.zzq() + 6;
        if (zzaniVar == null) {
            zzacoVar.zzk(iZzq);
        } else {
            this.zzc.zzI(iZzq);
            zzacoVar.zzi(this.zzc.zzN(), 0, iZzq);
            this.zzc.zzL(6);
            zzaniVar.zza(this.zzc);
            zzdy zzdyVar = this.zzc;
            zzdyVar.zzK(zzdyVar.zzc());
        }
        return 0;
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
        this.zzj = zzacqVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzf(long j, long j2) {
        zzef zzefVar = this.zza;
        if (zzefVar.zzf() != C.TIME_UNSET) {
            long jZzd = zzefVar.zzd();
            if (jZzd != C.TIME_UNSET && jZzd != 0 && jZzd != j2) {
                zzefVar.zzi(j2);
            }
        } else {
            zzefVar.zzi(j2);
        }
        zzang zzangVar = this.zzi;
        if (zzangVar != null) {
            zzangVar.zzd(j2);
        }
        for (int i = 0; i < this.zzb.size(); i++) {
            ((zzani) this.zzb.valueAt(i)).zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final boolean zzi(zzaco zzacoVar) throws IOException {
        byte[] bArr = new byte[14];
        zzacc zzaccVar = (zzacc) zzacoVar;
        zzaccVar.zzm(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) != 442 || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        zzaccVar.zzl(bArr[13] & 7, false);
        zzaccVar.zzm(bArr, 0, 3, false);
        return ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1;
    }
}
