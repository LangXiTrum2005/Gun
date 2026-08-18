package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;

/* JADX INFO: loaded from: classes3.dex */
final class zzaej implements zzaeb {
    public final zzfxn zza;
    private final int zzb;

    private zzaej(int i, zzfxn zzfxnVar) {
        this.zzb = i;
        this.zza = zzfxnVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static zzaej zzc(int i, zzdy zzdyVar) {
        String str;
        zzaeb zzaekVar;
        String str2;
        zzfxk zzfxkVar = new zzfxk();
        int iZze = zzdyVar.zze();
        int i2 = -2;
        while (zzdyVar.zzb() > 8) {
            int iZzi = zzdyVar.zzi();
            int iZzd = zzdyVar.zzd() + zzdyVar.zzi();
            zzdyVar.zzK(iZzd);
            if (iZzi != 1414744396) {
                zzaek zzaekVar2 = null;
                switch (iZzi) {
                    case 1718776947:
                        if (i2 != 2) {
                            if (i2 == 1) {
                                int iZzk = zzdyVar.zzk();
                                if (iZzk == 1) {
                                    str = MimeTypes.AUDIO_RAW;
                                } else if (iZzk == 85) {
                                    str = MimeTypes.AUDIO_MPEG;
                                } else if (iZzk == 255) {
                                    str = MimeTypes.AUDIO_AAC;
                                } else if (iZzk != 8192) {
                                    str = iZzk != 8193 ? null : MimeTypes.AUDIO_DTS;
                                } else {
                                    str = MimeTypes.AUDIO_AC3;
                                }
                                if (str != null) {
                                    int iZzk2 = zzdyVar.zzk();
                                    int iZzi2 = zzdyVar.zzi();
                                    zzdyVar.zzM(6);
                                    int iZzn = zzei.zzn(zzdyVar.zzk());
                                    int iZzk3 = zzdyVar.zzb() > 0 ? zzdyVar.zzk() : 0;
                                    byte[] bArr = new byte[iZzk3];
                                    zzdyVar.zzH(bArr, 0, iZzk3);
                                    zzz zzzVar = new zzz();
                                    zzzVar.zzaa(str);
                                    zzzVar.zzz(iZzk2);
                                    zzzVar.zzab(iZzi2);
                                    if (MimeTypes.AUDIO_RAW.equals(str) && iZzn != 0) {
                                        zzzVar.zzU(iZzn);
                                    }
                                    if (MimeTypes.AUDIO_AAC.equals(str) && iZzk3 > 0) {
                                        zzzVar.zzN(zzfxn.zzo(bArr));
                                    }
                                    zzaekVar = new zzaek(zzzVar.zzag());
                                } else {
                                    AbstractC3888ke0.r("Ignoring track with unsupported format tag ", iZzk, "StreamFormatChunk");
                                }
                            } else {
                                zzdo.zzf("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(zzei.zzD(i2)));
                            }
                            break;
                        } else {
                            zzdyVar.zzM(4);
                            int iZzi3 = zzdyVar.zzi();
                            int iZzi4 = zzdyVar.zzi();
                            zzdyVar.zzM(4);
                            int iZzi5 = zzdyVar.zzi();
                            switch (iZzi5) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = MimeTypes.VIDEO_MP4V;
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 == null) {
                                AbstractC3888ke0.r("Ignoring track with unsupported compression ", iZzi5, "StreamFormatChunk");
                            } else {
                                zzz zzzVar2 = new zzz();
                                zzzVar2.zzaf(iZzi3);
                                zzzVar2.zzK(iZzi4);
                                zzzVar2.zzaa(str2);
                                zzaekVar2 = new zzaek(zzzVar2.zzag());
                            }
                        }
                        zzaekVar = zzaekVar2;
                        break;
                    case 1751742049:
                        zzaekVar = zzaeg.zzb(zzdyVar);
                        break;
                    case 1752331379:
                        zzaekVar = zzaeh.zzb(zzdyVar);
                        break;
                    case 1852994675:
                        zzaekVar = zzael.zzb(zzdyVar);
                        break;
                    default:
                        zzaekVar = zzaekVar2;
                        break;
                }
            } else {
                zzaekVar = zzc(zzdyVar.zzi(), zzdyVar);
            }
            if (zzaekVar != null) {
                if (zzaekVar.zza() == 1752331379) {
                    int i3 = ((zzaeh) zzaekVar).zza;
                    if (i3 == 1935960438) {
                        i2 = 2;
                    } else if (i3 == 1935963489) {
                        i2 = 1;
                    } else if (i3 != 1937012852) {
                        zzdo.zzf("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i3))));
                        i2 = -1;
                    } else {
                        i2 = 3;
                    }
                }
                zzfxkVar.zzf(zzaekVar);
            }
            zzdyVar.zzL(iZzd);
            zzdyVar.zzK(iZze);
        }
        return new zzaej(i, zzfxkVar.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final int zza() {
        return this.zzb;
    }

    @Nullable
    public final zzaeb zzb(Class cls) {
        zzfxn zzfxnVar = this.zza;
        int size = zzfxnVar.size();
        int i = 0;
        while (i < size) {
            zzaeb zzaebVar = (zzaeb) zzfxnVar.get(i);
            i++;
            if (zzaebVar.getClass() == cls) {
                return zzaebVar;
            }
        }
        return null;
    }
}
