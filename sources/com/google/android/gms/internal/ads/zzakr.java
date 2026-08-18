package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzakr implements zzakf {
    private static final byte[] zza = {0, 7, 8, cw.m};
    private static final byte[] zzb = {0, 119, -120, -1};
    private static final byte[] zzc = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    private final Paint zzd;
    private final Paint zze;
    private final Canvas zzf;
    private final zzakk zzg;
    private final zzakj zzh;
    private final zzakq zzi;
    private Bitmap zzj;

    public zzakr(List list) {
        zzdy zzdyVar = new zzdy((byte[]) list.get(0));
        int iZzq = zzdyVar.zzq();
        int iZzq2 = zzdyVar.zzq();
        Paint paint = new Paint();
        this.zzd = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.zze = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.zzf = new Canvas();
        this.zzg = new zzakk(719, 575, 0, 719, 0, 575);
        this.zzh = new zzakj(0, zzg(), zzh(), zzi());
        this.zzi = new zzakq(iZzq, iZzq2);
    }

    private static int zzb(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    private static zzakj zzc(zzdx zzdxVar, int i) {
        int[] iArr;
        int iZzd;
        int iZzd2;
        int iZzd3;
        int iZzd4;
        int i2 = 8;
        int iZzd5 = zzdxVar.zzd(8);
        zzdxVar.zzn(8);
        int[] iArrZzg = zzg();
        int[] iArrZzh = zzh();
        int[] iArrZzi = zzi();
        int i3 = i - 2;
        while (i3 > 0) {
            int iZzd6 = zzdxVar.zzd(i2);
            int iZzd7 = zzdxVar.zzd(i2);
            if ((iZzd7 & 128) != 0) {
                iArr = iArrZzg;
            } else {
                iArr = (iZzd7 & 64) != 0 ? iArrZzh : iArrZzi;
            }
            if ((iZzd7 & 1) != 0) {
                iZzd3 = zzdxVar.zzd(i2);
                iZzd4 = zzdxVar.zzd(i2);
                iZzd = zzdxVar.zzd(i2);
                iZzd2 = zzdxVar.zzd(i2);
                i3 -= 6;
            } else {
                int iZzd8 = zzdxVar.zzd(6) << 2;
                int iZzd9 = zzdxVar.zzd(4) << 4;
                i3 -= 4;
                iZzd = zzdxVar.zzd(4) << 4;
                iZzd2 = zzdxVar.zzd(2) << 6;
                iZzd3 = iZzd8;
                iZzd4 = iZzd9;
            }
            if (iZzd3 == 0) {
                iZzd2 = 255;
            }
            if (iZzd3 == 0) {
                iZzd = 0;
            }
            if (iZzd3 == 0) {
                iZzd4 = 0;
            }
            double d = iZzd3;
            double d2 = iZzd4 - 128;
            double d3 = iZzd - 128;
            iArr[iZzd6] = zzb((byte) (255 - (iZzd2 & 255)), Math.max(0, Math.min((int) ((1.402d * d2) + d), 255)), Math.max(0, Math.min((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 255)), Math.max(0, Math.min((int) ((d3 * 1.772d) + d), 255)));
            iZzd5 = iZzd5;
            i2 = 8;
        }
        return new zzakj(iZzd5, iArrZzg, iArrZzh, iArrZzi);
    }

    private static zzakl zzd(zzdx zzdxVar) {
        byte[] bArr;
        int iZzd = zzdxVar.zzd(16);
        zzdxVar.zzn(4);
        int iZzd2 = zzdxVar.zzd(2);
        boolean zZzp = zzdxVar.zzp();
        zzdxVar.zzn(1);
        byte[] bArr2 = zzei.zzf;
        if (iZzd2 != 1) {
            if (iZzd2 == 0) {
                int iZzd3 = zzdxVar.zzd(16);
                int iZzd4 = zzdxVar.zzd(16);
                if (iZzd3 > 0) {
                    bArr2 = new byte[iZzd3];
                    zzdxVar.zzi(bArr2, 0, iZzd3);
                }
                if (iZzd4 > 0) {
                    bArr = new byte[iZzd4];
                    zzdxVar.zzi(bArr, 0, iZzd4);
                }
            }
            return new zzakl(iZzd, zZzp, bArr2, bArr);
        }
        zzdxVar.zzn(zzdxVar.zzd(8) * 16);
        bArr = bArr2;
        return new zzakl(iZzd, zZzp, bArr2, bArr);
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0215  */
    /* JADX WARN: Code duplicated, block: B:118:0x0224 A[LOOP:3: B:88:0x016c->B:118:0x0224, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:141:0x0142 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x021e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x013b  */
    /* JADX WARN: Code duplicated, block: B:75:0x0148 A[LOOP:2: B:40:0x00ac->B:75:0x0148, LOOP_END] */
    private static void zze(byte[] bArr, int[] iArr, int i, int i2, int i3, @Nullable Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        int iZzd;
        int i4;
        int iZzd2;
        int iZzd3;
        boolean z;
        int iZzd4;
        zzdx zzdxVar = new zzdx(bArr, bArr.length);
        int i5 = i2;
        int i6 = i3;
        byte[] bArrZzf = null;
        byte[] bArrZzf2 = null;
        byte[] bArrZzf3 = null;
        while (zzdxVar.zza() != 0) {
            int i7 = 8;
            int iZzd5 = zzdxVar.zzd(8);
            if (iZzd5 != 240) {
                int i8 = 4;
                int i9 = 2;
                switch (iZzd5) {
                    case 16:
                        int i10 = 1;
                        if (i == 3) {
                            if (bArrZzf == null) {
                                bArr3 = zzb;
                                bArr2 = bArr3;
                            } else {
                                bArr2 = bArrZzf;
                            }
                        } else if (i != 2) {
                            bArr2 = null;
                        } else if (bArrZzf3 == null) {
                            bArr3 = zza;
                            bArr2 = bArr3;
                        } else {
                            bArr2 = bArrZzf3;
                        }
                        int i11 = i5;
                        boolean z2 = false;
                        while (true) {
                            int iZzd6 = zzdxVar.zzd(2);
                            if (iZzd6 == 0) {
                                if (zzdxVar.zzp()) {
                                    iZzd = zzdxVar.zzd(3) + 3;
                                    iZzd6 = zzdxVar.zzd(2);
                                    z2 = z2;
                                } else if (zzdxVar.zzp()) {
                                    iZzd6 = 0;
                                } else {
                                    int iZzd7 = zzdxVar.zzd(2);
                                    if (iZzd7 == 0) {
                                        iZzd6 = 0;
                                        iZzd = 0;
                                        z2 = true;
                                    } else if (iZzd7 == i10) {
                                        z2 = z2;
                                        iZzd6 = 0;
                                        iZzd = 2;
                                    } else if (iZzd7 == 2) {
                                        iZzd = zzdxVar.zzd(4) + 12;
                                        iZzd6 = zzdxVar.zzd(2);
                                        z2 = z2;
                                    } else if (iZzd7 != 3) {
                                        z2 = z2;
                                        iZzd6 = 0;
                                        iZzd = 0;
                                    } else {
                                        iZzd = zzdxVar.zzd(8) + 29;
                                        iZzd6 = zzdxVar.zzd(2);
                                        z2 = z2;
                                    }
                                }
                                if (iZzd == 0 && paint != null) {
                                    int i12 = i6 + 1;
                                    float f = i6;
                                    if (bArr2 != 0) {
                                        iZzd6 = bArr2[iZzd6];
                                    }
                                    paint.setColor(iArr[iZzd6]);
                                    canvas.drawRect(i11, f, i11 + iZzd, i12, paint);
                                }
                                i11 += iZzd;
                                if (z2) {
                                    zzdxVar.zzf();
                                    i5 = i11;
                                } else {
                                    z2 = z2;
                                    i10 = 1;
                                }
                                break;
                            }
                            iZzd = 1;
                            if (iZzd == 0) {
                            }
                            i11 += iZzd;
                            if (z2) {
                                zzdxVar.zzf();
                                i5 = i11;
                            } else {
                                z2 = z2;
                                i10 = 1;
                            }
                            break;
                        }
                        break;
                    case 17:
                        byte[] bArr4 = i == 3 ? bArrZzf2 == null ? zzc : bArrZzf2 : null;
                        int i13 = i5;
                        boolean z3 = false;
                        while (true) {
                            int iZzd8 = zzdxVar.zzd(i8);
                            if (iZzd8 == 0) {
                                if (zzdxVar.zzp()) {
                                    if (zzdxVar.zzp()) {
                                        int iZzd9 = zzdxVar.zzd(i9);
                                        if (iZzd9 == 0) {
                                            iZzd8 = 0;
                                        } else if (iZzd9 == 1) {
                                            z3 = z3;
                                            iZzd8 = 0;
                                            i4 = 2;
                                        } else if (iZzd9 == i9) {
                                            iZzd2 = zzdxVar.zzd(i8) + 9;
                                            iZzd3 = zzdxVar.zzd(i8);
                                        } else if (iZzd9 != 3) {
                                            z3 = z3;
                                            iZzd8 = 0;
                                            i4 = 0;
                                        } else {
                                            iZzd2 = zzdxVar.zzd(i7) + 25;
                                            iZzd3 = zzdxVar.zzd(i8);
                                        }
                                    } else {
                                        iZzd2 = zzdxVar.zzd(i9) + i8;
                                        iZzd3 = zzdxVar.zzd(i8);
                                    }
                                    z3 = z3;
                                    i4 = iZzd2;
                                    iZzd8 = iZzd3;
                                } else {
                                    int iZzd10 = zzdxVar.zzd(3);
                                    if (iZzd10 != 0) {
                                        z3 = z3;
                                        i4 = iZzd10 + 2;
                                        iZzd8 = 0;
                                    } else {
                                        iZzd8 = 0;
                                        z3 = true;
                                        i4 = 0;
                                    }
                                }
                                if (i4 == 0 && paint != null) {
                                    int i14 = i6 + 1;
                                    float f2 = i6;
                                    if (bArr4 != 0) {
                                        iZzd8 = bArr4[iZzd8];
                                    }
                                    paint.setColor(iArr[iZzd8]);
                                    canvas.drawRect(i13, f2, i13 + i4, i14, paint);
                                }
                                i13 += i4;
                                if (z3) {
                                    zzdxVar.zzf();
                                    i5 = i13;
                                } else {
                                    z3 = z3;
                                    i9 = 2;
                                    i8 = 4;
                                    i7 = 8;
                                }
                                break;
                            }
                            i4 = 1;
                            if (i4 == 0) {
                            }
                            i13 += i4;
                            if (z3) {
                                zzdxVar.zzf();
                                i5 = i13;
                            } else {
                                z3 = z3;
                                i9 = 2;
                                i8 = 4;
                                i7 = 8;
                            }
                            break;
                        }
                        break;
                    case 18:
                        int i15 = i5;
                        boolean z4 = false;
                        while (true) {
                            int iZzd11 = zzdxVar.zzd(8);
                            if (iZzd11 != 0) {
                                z = z4;
                                iZzd4 = 1;
                            } else if (zzdxVar.zzp()) {
                                z = z4;
                                iZzd4 = zzdxVar.zzd(7);
                                iZzd11 = zzdxVar.zzd(8);
                            } else {
                                int iZzd12 = zzdxVar.zzd(7);
                                if (iZzd12 != 0) {
                                    z = z4;
                                    iZzd4 = iZzd12;
                                    iZzd11 = 0;
                                } else {
                                    iZzd11 = 0;
                                    z = true;
                                    iZzd4 = 0;
                                }
                            }
                            if (iZzd4 != 0 && paint != null) {
                                paint.setColor(iArr[iZzd11]);
                                canvas.drawRect(i15, i6, i15 + iZzd4, i6 + 1, paint);
                            }
                            i15 += iZzd4;
                            if (z) {
                                i5 = i15;
                            } else {
                                z4 = z;
                            }
                            break;
                        }
                        break;
                    default:
                        switch (iZzd5) {
                            case 32:
                                bArrZzf3 = zzf(4, 4, zzdxVar);
                                break;
                            case 33:
                                bArrZzf = zzf(4, 8, zzdxVar);
                                break;
                            case 34:
                                bArrZzf2 = zzf(16, 8, zzdxVar);
                                break;
                        }
                        break;
                }
            } else {
                i6 += 2;
                i5 = i2;
            }
        }
    }

    private static byte[] zzf(int i, int i2, zzdx zzdxVar) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) zzdxVar.zzd(i2);
        }
        return bArr;
    }

    private static int[] zzg() {
        return new int[]{0, -1, ViewCompat.MEASURED_STATE_MASK, -8421505};
    }

    private static int[] zzh() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            int i2 = i & 4;
            int i3 = i & 2;
            int i4 = i & 1;
            if (i < 8) {
                iArr[i] = zzb(255, 1 != i4 ? 0 : 255, i3 != 0 ? 255 : 0, i2 != 0 ? 255 : 0);
            } else {
                int i5 = EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE;
                int i6 = 1 != i4 ? 0 : EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE;
                int i7 = i3 != 0 ? EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE : 0;
                if (i2 == 0) {
                    i5 = 0;
                }
                iArr[i] = zzb(255, i6, i7, i5);
            }
        }
        return iArr;
    }

    private static int[] zzi() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            if (i < 8) {
                iArr[i] = zzb(63, 1 != (i & 1) ? 0 : 255, (i & 2) != 0 ? 255 : 0, (i & 4) == 0 ? 0 : 255);
            } else {
                int i2 = i & 136;
                if (i2 == 0) {
                    iArr[i] = zzb(255, (1 != (i & 1) ? 0 : 85) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 8) {
                    iArr[i] = zzb(EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, (1 != (i & 1) ? 0 : 85) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 128) {
                    iArr[i] = zzb(255, (1 != (i & 1) ? 0 : 43) + EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE + ((i & 64) == 0 ? 0 : 85));
                } else if (i2 == 136) {
                    iArr[i] = zzb(255, (1 != (i & 1) ? 0 : 43) + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + ((i & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    @Override // com.google.android.gms.internal.ads.zzakf
    public final void zza(byte[] bArr, int i, int i2, zzake zzakeVar, zzdb zzdbVar) {
        zzajx zzajxVar;
        zzako zzakoVar;
        int i3;
        int iZzd;
        int iZzd2;
        int iZzd3;
        int iZzd4;
        int i4;
        int iZzd5;
        zzdx zzdxVar = new zzdx(bArr, i + i2);
        zzdxVar.zzl(i);
        while (zzdxVar.zza() >= 48 && zzdxVar.zzd(8) == 15) {
            zzakq zzakqVar = this.zzi;
            int iZzd6 = zzdxVar.zzd(8);
            int iZzd7 = zzdxVar.zzd(16);
            int iZzd8 = zzdxVar.zzd(16);
            int iZzb = zzdxVar.zzb() + iZzd8;
            if (iZzd8 * 8 > zzdxVar.zza()) {
                zzdo.zzf("DvbParser", "Data field length exceeds limit");
                zzdxVar.zzn(zzdxVar.zza());
            } else {
                switch (iZzd6) {
                    case 16:
                        if (iZzd7 == zzakqVar.zza) {
                            zzakm zzakmVar = zzakqVar.zzi;
                            int iZzd9 = zzdxVar.zzd(8);
                            int iZzd10 = zzdxVar.zzd(4);
                            int iZzd11 = zzdxVar.zzd(2);
                            zzdxVar.zzn(2);
                            SparseArray sparseArray = new SparseArray();
                            for (int i5 = iZzd8 - 2; i5 > 0; i5 -= 6) {
                                int iZzd12 = zzdxVar.zzd(8);
                                zzdxVar.zzn(8);
                                sparseArray.put(iZzd12, new zzakn(zzdxVar.zzd(16), zzdxVar.zzd(16)));
                            }
                            zzakm zzakmVar2 = new zzakm(iZzd9, iZzd10, iZzd11, sparseArray);
                            if (zzakmVar2.zzb != 0) {
                                zzakqVar.zzi = zzakmVar2;
                                zzakqVar.zzc.clear();
                                zzakqVar.zzd.clear();
                                zzakqVar.zze.clear();
                            } else if (zzakmVar != null) {
                                if (zzakmVar.zza != zzakmVar2.zza) {
                                    zzakqVar.zzi = zzakmVar2;
                                }
                            }
                        }
                        break;
                    case 17:
                        zzakm zzakmVar3 = zzakqVar.zzi;
                        if (iZzd7 == zzakqVar.zza && zzakmVar3 != null) {
                            int iZzd13 = zzdxVar.zzd(8);
                            zzdxVar.zzn(4);
                            boolean zZzp = zzdxVar.zzp();
                            zzdxVar.zzn(3);
                            int iZzd14 = zzdxVar.zzd(16);
                            int iZzd15 = zzdxVar.zzd(16);
                            int iZzd16 = zzdxVar.zzd(3);
                            int iZzd17 = zzdxVar.zzd(3);
                            zzdxVar.zzn(2);
                            int iZzd18 = zzdxVar.zzd(8);
                            int iZzd19 = zzdxVar.zzd(8);
                            int iZzd20 = zzdxVar.zzd(4);
                            int iZzd21 = zzdxVar.zzd(2);
                            zzdxVar.zzn(2);
                            int i6 = iZzd8 - 10;
                            SparseArray sparseArray2 = new SparseArray();
                            while (i6 > 0) {
                                int iZzd22 = zzdxVar.zzd(16);
                                int iZzd23 = zzdxVar.zzd(2);
                                int iZzd24 = zzdxVar.zzd(2);
                                int iZzd25 = zzdxVar.zzd(12);
                                zzdxVar.zzn(4);
                                int iZzd26 = zzdxVar.zzd(12);
                                int i7 = i6 - 6;
                                if (iZzd23 == 1) {
                                    i6 -= 8;
                                    i3 = iZzd23;
                                    iZzd = zzdxVar.zzd(8);
                                    iZzd2 = zzdxVar.zzd(8);
                                } else if (iZzd23 == 2) {
                                    iZzd23 = 2;
                                    i6 -= 8;
                                    i3 = iZzd23;
                                    iZzd = zzdxVar.zzd(8);
                                    iZzd2 = zzdxVar.zzd(8);
                                } else {
                                    i3 = iZzd23;
                                    i6 = i7;
                                    iZzd = 0;
                                    iZzd2 = 0;
                                }
                                sparseArray2.put(iZzd22, new zzakp(i3, iZzd24, iZzd25, iZzd26, iZzd, iZzd2));
                            }
                            zzako zzakoVar2 = new zzako(iZzd13, zZzp, iZzd14, iZzd15, iZzd16, iZzd17, iZzd18, iZzd19, iZzd20, iZzd21, sparseArray2);
                            if (zzakmVar3.zzb == 0 && (zzakoVar = (zzako) zzakqVar.zzc.get(zzakoVar2.zza)) != null) {
                                int i8 = 0;
                                while (true) {
                                    SparseArray sparseArray3 = zzakoVar.zzj;
                                    if (i8 < sparseArray3.size()) {
                                        zzakoVar2.zzj.put(sparseArray3.keyAt(i8), (zzakp) sparseArray3.valueAt(i8));
                                        i8++;
                                    }
                                }
                            }
                            zzakqVar.zzc.put(zzakoVar2.zza, zzakoVar2);
                        }
                        break;
                    case 18:
                        if (iZzd7 == zzakqVar.zza) {
                            zzakj zzakjVarZzc = zzc(zzdxVar, iZzd8);
                            zzakqVar.zzd.put(zzakjVarZzc.zza, zzakjVarZzc);
                        } else if (iZzd7 == zzakqVar.zzb) {
                            zzakj zzakjVarZzc2 = zzc(zzdxVar, iZzd8);
                            zzakqVar.zzf.put(zzakjVarZzc2.zza, zzakjVarZzc2);
                        }
                        break;
                    case 19:
                        if (iZzd7 == zzakqVar.zza) {
                            zzakl zzaklVarZzd = zzd(zzdxVar);
                            zzakqVar.zze.put(zzaklVarZzd.zza, zzaklVarZzd);
                        } else if (iZzd7 == zzakqVar.zzb) {
                            zzakl zzaklVarZzd2 = zzd(zzdxVar);
                            zzakqVar.zzg.put(zzaklVarZzd2.zza, zzaklVarZzd2);
                        }
                        break;
                    case 20:
                        if (iZzd7 == zzakqVar.zza) {
                            zzdxVar.zzn(4);
                            boolean zZzp2 = zzdxVar.zzp();
                            zzdxVar.zzn(3);
                            int iZzd27 = zzdxVar.zzd(16);
                            int iZzd28 = zzdxVar.zzd(16);
                            if (zZzp2) {
                                int iZzd29 = zzdxVar.zzd(16);
                                iZzd3 = zzdxVar.zzd(16);
                                iZzd5 = zzdxVar.zzd(16);
                                iZzd4 = zzdxVar.zzd(16);
                                i4 = iZzd29;
                            } else {
                                iZzd3 = iZzd27;
                                iZzd4 = iZzd28;
                                i4 = 0;
                                iZzd5 = 0;
                            }
                            zzakqVar.zzh = new zzakk(iZzd27, iZzd28, i4, iZzd3, iZzd5, iZzd4);
                        }
                        break;
                }
                zzdxVar.zzo(iZzb - zzdxVar.zzb());
            }
        }
        zzakq zzakqVar2 = this.zzi;
        zzakm zzakmVar4 = zzakqVar2.zzi;
        if (zzakmVar4 == null) {
            zzajxVar = new zzajx(zzfxn.zzn(), C.TIME_UNSET, C.TIME_UNSET);
        } else {
            zzakk zzakkVar = zzakqVar2.zzh;
            if (zzakkVar == null) {
                zzakkVar = this.zzg;
            }
            Bitmap bitmap = this.zzj;
            if (bitmap == null || zzakkVar.zza + 1 != bitmap.getWidth() || zzakkVar.zzb + 1 != this.zzj.getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(zzakkVar.zza + 1, zzakkVar.zzb + 1, Bitmap.Config.ARGB_8888);
                this.zzj = bitmapCreateBitmap;
                this.zzf.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray4 = zzakmVar4.zzc;
            int i9 = 0;
            while (i9 < sparseArray4.size()) {
                this.zzf.save();
                zzakn zzaknVar = (zzakn) sparseArray4.valueAt(i9);
                zzako zzakoVar3 = (zzako) this.zzi.zzc.get(sparseArray4.keyAt(i9));
                int i10 = zzaknVar.zza + zzakkVar.zzc;
                int i11 = zzaknVar.zzb + zzakkVar.zze;
                this.zzf.clipRect(i10, i11, Math.min(zzakoVar3.zzc + i10, zzakkVar.zzd), Math.min(zzakoVar3.zzd + i11, zzakkVar.zzf));
                zzakj zzakjVar = (zzakj) this.zzi.zzd.get(zzakoVar3.zzf);
                if (zzakjVar == null) {
                    zzakjVar = (zzakj) this.zzi.zzf.get(zzakoVar3.zzf);
                    if (zzakjVar == null) {
                        zzakjVar = this.zzh;
                    }
                }
                SparseArray sparseArray5 = zzakoVar3.zzj;
                int i12 = 0;
                while (i12 < sparseArray5.size()) {
                    int iKeyAt = sparseArray5.keyAt(i12);
                    zzakp zzakpVar = (zzakp) sparseArray5.valueAt(i12);
                    zzakl zzaklVar = (zzakl) this.zzi.zze.get(iKeyAt);
                    if (zzaklVar == null) {
                        zzaklVar = (zzakl) this.zzi.zzg.get(iKeyAt);
                    }
                    if (zzaklVar != null) {
                        Paint paint = zzaklVar.zzb ? null : this.zzd;
                        int i13 = zzakoVar3.zze;
                        int i14 = zzakpVar.zza + i10;
                        int i15 = zzakpVar.zzb + i11;
                        Canvas canvas = this.zzf;
                        int[] iArr = i13 == 3 ? zzakjVar.zzd : i13 == 2 ? zzakjVar.zzc : zzakjVar.zzb;
                        Paint paint2 = paint;
                        zze(zzaklVar.zzc, iArr, i13, i14, i15, paint2, canvas);
                        zze(zzaklVar.zzd, iArr, i13, i14, i15 + 1, paint2, canvas);
                    }
                    i12++;
                    sparseArray4 = sparseArray4;
                    sparseArray5 = sparseArray5;
                    i9 = i9;
                }
                SparseArray sparseArray6 = sparseArray4;
                int i16 = i9;
                float f = i11;
                float f2 = i10;
                if (zzakoVar3.zzb) {
                    int i17 = zzakoVar3.zze;
                    this.zze.setColor(i17 == 3 ? zzakjVar.zzd[zzakoVar3.zzg] : i17 == 2 ? zzakjVar.zzc[zzakoVar3.zzh] : zzakjVar.zzb[zzakoVar3.zzi]);
                    this.zzf.drawRect(f2, f, zzakoVar3.zzc + i10, zzakoVar3.zzd + i11, this.zze);
                }
                zzcm zzcmVar = new zzcm();
                zzcmVar.zzc(Bitmap.createBitmap(this.zzj, i10, i11, zzakoVar3.zzc, zzakoVar3.zzd));
                zzcmVar.zzh(f2 / zzakkVar.zza);
                zzcmVar.zzi(0);
                zzcmVar.zze(f / zzakkVar.zzb, 0);
                zzcmVar.zzf(0);
                zzcmVar.zzk(zzakoVar3.zzc / zzakkVar.zza);
                zzcmVar.zzd(zzakoVar3.zzd / zzakkVar.zzb);
                arrayList.add(zzcmVar.zzp());
                this.zzf.drawColor(0, PorterDuff.Mode.CLEAR);
                this.zzf.restore();
                i9 = i16 + 1;
                sparseArray4 = sparseArray6;
            }
            zzajxVar = new zzajx(arrayList, C.TIME_UNSET, C.TIME_UNSET);
        }
        zzdbVar.zza(zzajxVar);
    }
}
