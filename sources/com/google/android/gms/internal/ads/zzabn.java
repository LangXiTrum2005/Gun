package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.badlogic.gdx.Input;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class zzabn {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 3, 6};
    private static final int[] zzc = {48000, 44100, 32000};
    private static final int[] zzd = {24000, 22050, 16000};
    private static final int[] zze = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] zzf = {32, 40, 48, 56, 64, 80, 96, 112, 128, Input.Keys.NUMPAD_ENTER, 192, 224, 256, EnumC4719u30.WEBVIEW_ERROR_VALUE, 384, 448, 512, 576, 640};
    private static final int[] zzg = {69, 87, 104, 121, Input.Keys.F9, 174, EnumC4719u30.INVALID_BID_PAYLOAD_VALUE, Input.Keys.COLON, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int zza(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return zzb[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static int zzb(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) <= 10) {
            byte b = bArr[4];
            return zzf((b & 192) >> 6, b & 63);
        }
        int i = bArr[2] & 7;
        int i2 = ((bArr[3] & 255) | (i << 8)) + 1;
        return i2 + i2;
    }

    public static zzab zzc(zzdy zzdyVar, String str, String str2, @Nullable zzu zzuVar) {
        zzdx zzdxVar = new zzdx();
        zzdxVar.zzj(zzdyVar);
        int i = zzc[zzdxVar.zzd(2)];
        zzdxVar.zzn(8);
        int i2 = zze[zzdxVar.zzd(3)];
        if (zzdxVar.zzd(1) != 0) {
            i2++;
        }
        int i3 = zzf[zzdxVar.zzd(5)] * 1000;
        zzdxVar.zzf();
        zzdyVar.zzL(zzdxVar.zzb());
        zzz zzzVar = new zzz();
        zzzVar.zzM(str);
        zzzVar.zzaa(MimeTypes.AUDIO_AC3);
        zzzVar.zzz(i2);
        zzzVar.zzab(i);
        zzzVar.zzF(zzuVar);
        zzzVar.zzQ(str2);
        zzzVar.zzy(i3);
        zzzVar.zzV(i3);
        return zzzVar.zzag();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0062  */
    public static zzab zzd(zzdy zzdyVar, String str, String str2, @Nullable zzu zzuVar) {
        String str3;
        zzdx zzdxVar = new zzdx();
        zzdxVar.zzj(zzdyVar);
        int iZzd = zzdxVar.zzd(13) * 1000;
        zzdxVar.zzn(3);
        int i = zzc[zzdxVar.zzd(2)];
        zzdxVar.zzn(10);
        int i2 = zze[zzdxVar.zzd(3)];
        if (zzdxVar.zzd(1) != 0) {
            i2++;
        }
        zzdxVar.zzn(3);
        int iZzd2 = zzdxVar.zzd(4);
        zzdxVar.zzn(1);
        if (iZzd2 > 0) {
            zzdxVar.zzn(6);
            if (zzdxVar.zzd(1) != 0) {
                i2 += 2;
            }
            zzdxVar.zzn(1);
        }
        if (zzdxVar.zza() > 7) {
            zzdxVar.zzn(7);
            if (zzdxVar.zzd(1) != 0) {
                str3 = MimeTypes.AUDIO_E_AC3_JOC;
            } else {
                str3 = MimeTypes.AUDIO_E_AC3;
            }
        } else {
            str3 = MimeTypes.AUDIO_E_AC3;
        }
        zzdxVar.zzf();
        zzdyVar.zzL(zzdxVar.zzb());
        zzz zzzVar = new zzz();
        zzzVar.zzM(str);
        zzzVar.zzaa(str3);
        zzzVar.zzz(i2);
        zzzVar.zzab(i);
        zzzVar.zzF(zzuVar);
        zzzVar.zzQ(str2);
        zzzVar.zzV(iZzd);
        return zzzVar.zzag();
    }

    public static zzabl zze(zzdx zzdxVar) {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int iZzc = zzdxVar.zzc();
        zzdxVar.zzn(40);
        int iZzd = zzdxVar.zzd(5);
        zzdxVar.zzl(iZzc);
        int i12 = -1;
        if (iZzd > 10) {
            zzdxVar.zzn(16);
            int iZzd2 = zzdxVar.zzd(2);
            if (iZzd2 == 0) {
                i12 = 0;
            } else if (iZzd2 == 1) {
                i12 = 1;
            } else if (iZzd2 == 2) {
                i12 = 2;
            }
            zzdxVar.zzn(3);
            int iZzd3 = zzdxVar.zzd(11) + 1;
            int iZzd4 = zzdxVar.zzd(2);
            if (iZzd4 == 3) {
                i8 = zzd[zzdxVar.zzd(2)];
                i7 = 3;
                i9 = 6;
            } else {
                int iZzd5 = zzdxVar.zzd(2);
                int i13 = zzb[iZzd5];
                i7 = iZzd5;
                i8 = zzc[iZzd4];
                i9 = i13;
            }
            int i14 = iZzd3 + iZzd3;
            int i15 = (i14 * i8) / (i9 * 32);
            int iZzd6 = zzdxVar.zzd(3);
            boolean zZzp = zzdxVar.zzp();
            int i16 = zze[iZzd6] + (zZzp ? 1 : 0);
            zzdxVar.zzn(10);
            if (zzdxVar.zzp()) {
                zzdxVar.zzn(8);
            }
            if (iZzd6 == 0) {
                zzdxVar.zzn(5);
                if (zzdxVar.zzp()) {
                    zzdxVar.zzn(8);
                }
                i10 = 0;
                iZzd6 = 0;
            } else {
                i10 = iZzd6;
            }
            if (i12 == 1) {
                if (zzdxVar.zzp()) {
                    zzdxVar.zzn(16);
                }
                i11 = 1;
            } else {
                i11 = i12;
            }
            if (zzdxVar.zzp()) {
                if (i10 > 2) {
                    zzdxVar.zzn(2);
                }
                if ((i10 & 1) != 0 && i10 > 2) {
                    zzdxVar.zzn(6);
                }
                if ((i10 & 4) != 0) {
                    zzdxVar.zzn(6);
                }
                if (zZzp && zzdxVar.zzp()) {
                    zzdxVar.zzn(5);
                }
                if (i11 == 0) {
                    if (zzdxVar.zzp()) {
                        zzdxVar.zzn(6);
                    }
                    if (i10 == 0 && zzdxVar.zzp()) {
                        zzdxVar.zzn(6);
                    }
                    if (zzdxVar.zzp()) {
                        zzdxVar.zzn(6);
                    }
                    int iZzd7 = zzdxVar.zzd(2);
                    if (iZzd7 == 1) {
                        zzdxVar.zzn(5);
                    } else if (iZzd7 == 2) {
                        zzdxVar.zzn(12);
                    } else if (iZzd7 == 3) {
                        int iZzd8 = zzdxVar.zzd(5);
                        if (zzdxVar.zzp()) {
                            zzdxVar.zzn(5);
                            if (zzdxVar.zzp()) {
                                zzdxVar.zzn(4);
                            }
                            if (zzdxVar.zzp()) {
                                zzdxVar.zzn(4);
                            }
                            if (zzdxVar.zzp()) {
                                zzdxVar.zzn(4);
                            }
                            if (zzdxVar.zzp()) {
                                zzdxVar.zzn(4);
                            }
                            if (zzdxVar.zzp()) {
                                zzdxVar.zzn(4);
                            }
                            if (zzdxVar.zzp()) {
                                zzdxVar.zzn(4);
                            }
                            if (zzdxVar.zzp()) {
                                zzdxVar.zzn(4);
                            }
                            if (zzdxVar.zzp()) {
                                if (zzdxVar.zzp()) {
                                    zzdxVar.zzn(4);
                                }
                                if (zzdxVar.zzp()) {
                                    zzdxVar.zzn(4);
                                }
                            }
                        }
                        if (zzdxVar.zzp()) {
                            zzdxVar.zzn(5);
                            if (zzdxVar.zzp()) {
                                zzdxVar.zzn(7);
                                if (zzdxVar.zzp()) {
                                    zzdxVar.zzn(8);
                                }
                            }
                        }
                        zzdxVar.zzn((iZzd8 + 2) * 8);
                        zzdxVar.zzf();
                    }
                    if (i10 < 2) {
                        if (zzdxVar.zzp()) {
                            zzdxVar.zzn(14);
                        }
                        if (iZzd6 == 0 && zzdxVar.zzp()) {
                            zzdxVar.zzn(14);
                        }
                    }
                    if (!zzdxVar.zzp()) {
                        i11 = 0;
                    } else if (i7 == 0) {
                        zzdxVar.zzn(5);
                        i11 = 0;
                        i7 = 0;
                    } else {
                        for (int i17 = 0; i17 < i9; i17++) {
                            if (zzdxVar.zzp()) {
                                zzdxVar.zzn(5);
                            }
                        }
                        i11 = 0;
                    }
                }
            }
            if (zzdxVar.zzp()) {
                zzdxVar.zzn(5);
                if (i10 == 2) {
                    zzdxVar.zzn(4);
                    i10 = 2;
                }
                if (i10 >= 6) {
                    zzdxVar.zzn(2);
                }
                if (zzdxVar.zzp()) {
                    zzdxVar.zzn(8);
                }
                if (i10 == 0 && zzdxVar.zzp()) {
                    zzdxVar.zzn(8);
                }
                if (iZzd4 < 3) {
                    zzdxVar.zzm();
                }
            }
            if (i11 == 0 && i7 != 3) {
                zzdxVar.zzm();
            }
            if (i11 == 2 && (i7 == 3 || zzdxVar.zzp())) {
                zzdxVar.zzn(6);
            }
            str = (zzdxVar.zzp() && zzdxVar.zzd(6) == 1 && zzdxVar.zzd(8) == 1) ? MimeTypes.AUDIO_E_AC3_JOC : MimeTypes.AUDIO_E_AC3;
            i5 = i12;
            i2 = i14;
            i3 = i8;
            i6 = i9 * 256;
            i = i15;
            i4 = i16;
        } else {
            zzdxVar.zzn(32);
            int iZzd9 = zzdxVar.zzd(2);
            String str2 = iZzd9 == 3 ? null : MimeTypes.AUDIO_AC3;
            int iZzd10 = zzdxVar.zzd(6);
            int i18 = zzf[iZzd10 / 2] * 1000;
            int iZzf = zzf(iZzd9, iZzd10);
            zzdxVar.zzn(8);
            int iZzd11 = zzdxVar.zzd(3);
            if ((iZzd11 & 1) != 0 && iZzd11 != 1) {
                zzdxVar.zzn(2);
            }
            if ((iZzd11 & 4) != 0) {
                zzdxVar.zzn(2);
            }
            if (iZzd11 == 2) {
                zzdxVar.zzn(2);
            }
            str = str2;
            i = i18;
            i2 = iZzf;
            i3 = iZzd9 < 3 ? zzc[iZzd9] : -1;
            i4 = zze[iZzd11] + (zzdxVar.zzp() ? 1 : 0);
            i5 = -1;
            i6 = 1536;
        }
        return new zzabl(str, i5, i4, i3, i2, i6, i, null);
    }

    private static int zzf(int i, int i2) {
        int i3;
        if (i < 0 || i >= 3 || i2 < 0 || (i3 = i2 >> 1) >= 19) {
            return -1;
        }
        int i4 = zzc[i];
        if (i4 == 44100) {
            int i5 = zzg[i3] + (i2 & 1);
            return i5 + i5;
        }
        int i6 = zzf[i3];
        return i4 == 32000 ? i6 * 6 : i6 * 4;
    }
}
