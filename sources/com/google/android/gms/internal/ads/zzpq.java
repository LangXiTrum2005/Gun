package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import androidx.annotation.Nullable;
import androidx.work.WorkRequest;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
final class zzpq {
    private long zzA;
    private long zzB;
    private long zzC;
    private boolean zzD;
    private long zzE;
    private long zzF;
    private boolean zzG;
    private long zzH;
    private zzcx zzI;
    private final zzpp zza;
    private final long[] zzb;

    @Nullable
    private AudioTrack zzc;
    private int zzd;

    @Nullable
    private zzpo zze;
    private int zzf;
    private boolean zzg;
    private long zzh;
    private float zzi;
    private boolean zzj;
    private long zzk;
    private long zzl;

    @Nullable
    private Method zzm;
    private long zzn;
    private boolean zzo;
    private boolean zzp;
    private long zzq;
    private long zzr;
    private long zzs;
    private long zzt;
    private long zzu;
    private int zzv;
    private int zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    public zzpq(zzpp zzppVar) {
        this.zza = zzppVar;
        try {
            this.zzm = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.zzb = new long[10];
        this.zzI = zzcx.zza;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x009b  */
    private final long zzl() {
        long jZzb = this.zzI.zzb();
        int i = 2;
        if (this.zzx != C.TIME_UNSET) {
            AudioTrack audioTrack = this.zzc;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2) {
                return this.zzz;
            }
            return Math.min(this.zzA, this.zzz + zzei.zzp(zzei.zzq(zzei.zzs(jZzb) - this.zzx, this.zzi), this.zzf));
        }
        if (jZzb - this.zzr >= 5) {
            AudioTrack audioTrack2 = this.zzc;
            audioTrack2.getClass();
            int playState = audioTrack2.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = ((long) audioTrack2.getPlaybackHeadPosition()) & 4294967295L;
                long j = 0;
                if (this.zzg) {
                    if (playState != 2) {
                        i = playState;
                    } else if (playbackHeadPosition == 0) {
                        this.zzu = this.zzs;
                    }
                    playbackHeadPosition += this.zzu;
                    playState = i;
                }
                if (zzei.zza > 29) {
                    if (this.zzs > playbackHeadPosition) {
                        this.zzt++;
                    }
                    this.zzs = playbackHeadPosition;
                } else {
                    if (playbackHeadPosition != 0) {
                        j = playbackHeadPosition;
                    } else if (this.zzs > 0 && playState == 3) {
                        if (this.zzy == C.TIME_UNSET) {
                            this.zzy = jZzb;
                        }
                    }
                    this.zzy = C.TIME_UNSET;
                    playbackHeadPosition = j;
                    if (this.zzs > playbackHeadPosition) {
                        this.zzt++;
                    }
                    this.zzs = playbackHeadPosition;
                }
            }
            this.zzr = jZzb;
        }
        return this.zzs + this.zzH + (this.zzt << 32);
    }

    private final long zzm() {
        return zzei.zzt(zzl(), this.zzf);
    }

    private final void zzn() {
        this.zzk = 0L;
        this.zzw = 0;
        this.zzv = 0;
        this.zzl = 0L;
        this.zzC = 0L;
        this.zzF = 0L;
        this.zzj = false;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0068  */
    /* JADX WARN: Code duplicated, block: B:20:0x0076  */
    /* JADX WARN: Code duplicated, block: B:21:0x0078  */
    /* JADX WARN: Code duplicated, block: B:23:0x008e  */
    /* JADX WARN: Code duplicated, block: B:24:0x009d  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:27:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f7 A[Catch: Exception -> 0x00ff, TRY_LEAVE, TryCatch #0 {Exception -> 0x00ff, blocks: (B:34:0x00d2, B:36:0x00d7, B:38:0x00f7), top: B:64:0x00d2 }] */
    public final long zza(boolean z) {
        long jZzm;
        zzpo zzpoVar;
        long jZzb;
        long jZza;
        long jZzm2;
        int i;
        Method method;
        long jMax;
        AudioTrack audioTrack = this.zzc;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 3) {
            long jZzc = this.zzI.zzc() / 1000;
            if (jZzc - this.zzl >= WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                long jZzm3 = zzm();
                if (jZzm3 != 0) {
                    this.zzb[this.zzv] = zzei.zzr(jZzm3, this.zzi) - jZzc;
                    this.zzv = (this.zzv + 1) % 10;
                    int i2 = this.zzw;
                    if (i2 < 10) {
                        this.zzw = i2 + 1;
                    }
                    this.zzl = jZzc;
                    this.zzk = 0L;
                    int i3 = 0;
                    while (true) {
                        int i4 = this.zzw;
                        if (i3 >= i4) {
                            break;
                        }
                        this.zzk = (this.zzb[i3] / ((long) i4)) + this.zzk;
                        i3++;
                    }
                    if (!this.zzg) {
                        zzpoVar = this.zze;
                        zzpoVar.getClass();
                        if (zzpoVar.zzg(jZzc)) {
                            jZzb = zzpoVar.zzb();
                            jZza = zzpoVar.zza();
                            jZzm2 = zzm();
                            if (Math.abs(jZzb - jZzc) > 5000000) {
                                i = 0;
                                this.zza.zzd(jZza, jZzb, jZzc, jZzm2);
                                zzpoVar.zzd();
                            } else {
                                i = 0;
                                if (Math.abs(zzei.zzt(jZza, this.zzf) - jZzm2) > 5000000) {
                                    this.zza.zzc(jZza, jZzb, jZzc, jZzm2);
                                    zzpoVar.zzd();
                                } else {
                                    zzpoVar.zzc();
                                }
                            }
                        } else {
                            i = 0;
                        }
                        if (this.zzp && (method = this.zzm) != null && jZzc - this.zzq >= 500000) {
                            try {
                                AudioTrack audioTrack2 = this.zzc;
                                audioTrack2.getClass();
                                Integer num = (Integer) method.invoke(audioTrack2, new Object[i]);
                                int i5 = zzei.zza;
                                long jIntValue = (((long) num.intValue()) * 1000) - this.zzh;
                                this.zzn = jIntValue;
                                jMax = Math.max(jIntValue, 0L);
                                this.zzn = jMax;
                                if (jMax > 5000000) {
                                    this.zza.zza(jMax);
                                    this.zzn = 0L;
                                }
                            } catch (Exception unused) {
                                this.zzm = null;
                            }
                            this.zzq = jZzc;
                        }
                    }
                }
            } else if (!this.zzg) {
                zzpoVar = this.zze;
                zzpoVar.getClass();
                if (zzpoVar.zzg(jZzc)) {
                    i = 0;
                } else {
                    jZzb = zzpoVar.zzb();
                    jZza = zzpoVar.zza();
                    jZzm2 = zzm();
                    if (Math.abs(jZzb - jZzc) > 5000000) {
                        i = 0;
                        this.zza.zzd(jZza, jZzb, jZzc, jZzm2);
                        zzpoVar.zzd();
                    } else {
                        i = 0;
                        if (Math.abs(zzei.zzt(jZza, this.zzf) - jZzm2) > 5000000) {
                            this.zza.zzc(jZza, jZzb, jZzc, jZzm2);
                            zzpoVar.zzd();
                        } else {
                            zzpoVar.zzc();
                        }
                    }
                }
                if (this.zzp) {
                    AudioTrack audioTrack3 = this.zzc;
                    audioTrack3.getClass();
                    Integer num2 = (Integer) method.invoke(audioTrack3, new Object[i]);
                    int i6 = zzei.zza;
                    long jIntValue2 = (((long) num2.intValue()) * 1000) - this.zzh;
                    this.zzn = jIntValue2;
                    jMax = Math.max(jIntValue2, 0L);
                    this.zzn = jMax;
                    if (jMax > 5000000) {
                        this.zza.zza(jMax);
                        this.zzn = 0L;
                    }
                    this.zzq = jZzc;
                }
            }
        }
        long jZzc2 = this.zzI.zzc() / 1000;
        zzpo zzpoVar2 = this.zze;
        zzpoVar2.getClass();
        boolean zZzf = zzpoVar2.zzf();
        if (zZzf) {
            jZzm = zzei.zzq(jZzc2 - zzpoVar2.zzb(), this.zzi) + zzei.zzt(zzpoVar2.zza(), this.zzf);
        } else {
            jZzm = this.zzw == 0 ? zzm() : zzei.zzq(this.zzk + jZzc2, this.zzi);
            if (!z) {
                jZzm = Math.max(0L, jZzm - this.zzn);
            }
        }
        if (this.zzD != zZzf) {
            this.zzF = this.zzC;
            this.zzE = this.zzB;
        }
        long j = jZzc2 - this.zzF;
        if (j < 1000000) {
            long jZzq = zzei.zzq(j, this.zzi) + this.zzE;
            long j2 = (j * 1000) / 1000000;
            jZzm = (((1000 - j2) * jZzq) + (jZzm * j2)) / 1000;
        }
        if (!this.zzj) {
            long j3 = this.zzB;
            if (jZzm > j3) {
                this.zzj = true;
                int i7 = zzei.zza;
                this.zza.zzb(this.zzI.zza() - zzei.zzv(zzei.zzr(zzei.zzv(jZzm - j3), this.zzi)));
            }
        }
        this.zzC = jZzc2;
        this.zzB = jZzm;
        this.zzD = zZzf;
        return jZzm;
    }

    public final void zzb(long j) {
        this.zzz = zzl();
        this.zzx = zzei.zzs(this.zzI.zzb());
        this.zzA = j;
    }

    public final void zzc() {
        zzn();
        this.zzc = null;
        this.zze = null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    public final void zzd(AudioTrack audioTrack, boolean z, int i, int i2, int i3) {
        boolean z2;
        this.zzc = audioTrack;
        this.zzd = i3;
        this.zze = new zzpo(audioTrack);
        this.zzf = audioTrack.getSampleRate();
        if (!z || zzei.zza >= 23) {
            z2 = false;
        } else {
            z2 = true;
            if (i != 5) {
                if (i == 6) {
                    i = 6;
                } else {
                    z2 = false;
                }
            }
        }
        this.zzg = z2;
        boolean zZzJ = zzei.zzJ(i);
        this.zzp = zZzJ;
        this.zzh = zZzJ ? zzei.zzt(i3 / i2, this.zzf) : -9223372036854775807L;
        this.zzs = 0L;
        this.zzt = 0L;
        this.zzG = false;
        this.zzH = 0L;
        this.zzu = 0L;
        this.zzo = false;
        this.zzx = C.TIME_UNSET;
        this.zzy = C.TIME_UNSET;
        this.zzq = 0L;
        this.zzn = 0L;
        this.zzi = 1.0f;
    }

    public final void zze(zzcx zzcxVar) {
        this.zzI = zzcxVar;
    }

    public final void zzf() {
        if (this.zzx != C.TIME_UNSET) {
            this.zzx = zzei.zzs(this.zzI.zzb());
        }
        zzpo zzpoVar = this.zze;
        zzpoVar.getClass();
        zzpoVar.zze();
    }

    public final boolean zzg(long j) {
        if (j > zzei.zzp(zza(false), this.zzf)) {
            return true;
        }
        if (this.zzg) {
            AudioTrack audioTrack = this.zzc;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2 && zzl() == 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzh() {
        AudioTrack audioTrack = this.zzc;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 3;
    }

    public final boolean zzi(long j) {
        return this.zzy != C.TIME_UNSET && j > 0 && this.zzI.zzb() - this.zzy >= 200;
    }

    public final boolean zzj(long j) {
        AudioTrack audioTrack = this.zzc;
        audioTrack.getClass();
        int playState = audioTrack.getPlayState();
        if (this.zzg) {
            if (playState == 2) {
                this.zzo = false;
                return false;
            }
            if (playState == 1) {
                if (zzl() == 0) {
                    return false;
                }
                playState = 1;
            }
        }
        boolean z = this.zzo;
        boolean zZzg = zzg(j);
        this.zzo = zZzg;
        if (z && !zZzg && playState != 1) {
            this.zza.zze(this.zzd, zzei.zzv(this.zzh));
        }
        return true;
    }

    public final boolean zzk() {
        zzn();
        if (this.zzx != C.TIME_UNSET) {
            this.zzz = zzl();
            return false;
        }
        zzpo zzpoVar = this.zze;
        zzpoVar.getClass();
        zzpoVar.zze();
        return true;
    }
}
