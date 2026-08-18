package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.umeng.analytics.pro.cw;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzahk {
    public byte[] zzN;
    public zzadu zzT;
    public boolean zzU;
    public zzadt zzW;
    public int zzX;
    private int zzY;
    public String zza;
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public boolean zzg;
    public byte[] zzh;
    public zzads zzi;
    public byte[] zzj;
    public zzu zzk;
    public int zzl = -1;
    public int zzm = -1;
    public int zzn = -1;
    public int zzo = -1;
    public int zzp = -1;
    public int zzq = 0;
    public int zzr = -1;
    public float zzs = 0.0f;
    public float zzt = 0.0f;
    public float zzu = 0.0f;
    public byte[] zzv = null;
    public int zzw = -1;
    public boolean zzx = false;
    public int zzy = -1;
    public int zzz = -1;
    public int zzA = -1;
    public int zzB = 1000;
    public int zzC = 200;
    public float zzD = -1.0f;
    public float zzE = -1.0f;
    public float zzF = -1.0f;
    public float zzG = -1.0f;
    public float zzH = -1.0f;
    public float zzI = -1.0f;
    public float zzJ = -1.0f;
    public float zzK = -1.0f;
    public float zzL = -1.0f;
    public float zzM = -1.0f;
    public int zzO = 1;
    public int zzP = -1;
    public int zzQ = 8000;
    public long zzR = 0;
    public long zzS = 0;
    public boolean zzV = true;
    private String zzZ = "eng";

    private static Pair zzf(zzdy zzdyVar) throws zzbc {
        try {
            zzdyVar.zzM(16);
            long jZzs = zzdyVar.zzs();
            if (jZzs == 1482049860) {
                return new Pair("video/divx", null);
            }
            if (jZzs == 859189832) {
                return new Pair(MimeTypes.VIDEO_H263, null);
            }
            if (jZzs != 826496599) {
                zzdo.zzf("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair(MimeTypes.VIDEO_UNKNOWN, null);
            }
            int iZzd = zzdyVar.zzd() + 20;
            byte[] bArrZzN = zzdyVar.zzN();
            while (true) {
                int length = bArrZzN.length;
                if (iZzd >= length - 4) {
                    throw zzbc.zza("Failed to find FourCC VC1 initialization data", null);
                }
                int i = iZzd + 1;
                if (bArrZzN[iZzd] == 0 && bArrZzN[i] == 0 && bArrZzN[iZzd + 2] == 1 && bArrZzN[iZzd + 3] == 15) {
                    return new Pair(MimeTypes.VIDEO_VC1, Collections.singletonList(Arrays.copyOfRange(bArrZzN, iZzd, length)));
                }
                iZzd = i;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzbc.zza("Error parsing FourCC private data", null);
        }
    }

    private static List zzg(byte[] bArr) throws zzbc {
        int i;
        int i2;
        try {
            if (bArr[0] != 2) {
                throw zzbc.zza("Error parsing vorbis codec private", null);
            }
            int i3 = 1;
            int i4 = 0;
            while (true) {
                int i5 = bArr[i3];
                i3++;
                i = i5 & 255;
                if (i != 255) {
                    break;
                }
                i4 += 255;
            }
            int i6 = i4 + i;
            int i7 = 0;
            while (true) {
                int i8 = bArr[i3];
                i3++;
                i2 = i8 & 255;
                if (i2 != 255) {
                    break;
                }
                i7 += 255;
            }
            int i9 = i7 + i2;
            if (bArr[i3] != 1) {
                throw zzbc.zza("Error parsing vorbis codec private", null);
            }
            byte[] bArr2 = new byte[i6];
            System.arraycopy(bArr, i3, bArr2, 0, i6);
            int i10 = i3 + i6;
            if (bArr[i10] != 3) {
                throw zzbc.zza("Error parsing vorbis codec private", null);
            }
            int i11 = i10 + i9;
            if (bArr[i11] != 5) {
                throw zzbc.zza("Error parsing vorbis codec private", null);
            }
            int length = bArr.length - i11;
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, i11, bArr3, 0, length);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(bArr2);
            arrayList.add(bArr3);
            return arrayList;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzbc.zza("Error parsing vorbis codec private", null);
        }
    }

    private static boolean zzh(zzdy zzdyVar) throws zzbc {
        try {
            int iZzk = zzdyVar.zzk();
            if (iZzk == 1) {
                return true;
            }
            if (iZzk == 65534) {
                zzdyVar.zzL(24);
                if (zzdyVar.zzt() == zzahm.zze.getMostSignificantBits() && zzdyVar.zzt() == zzahm.zze.getLeastSignificantBits()) {
                    return true;
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw zzbc.zza("Error parsing MS/ACM codec private", null);
        }
    }

    private final byte[] zzi(String str) throws zzbc {
        byte[] bArr = this.zzj;
        if (bArr != null) {
            return bArr;
        }
        throw zzbc.zza("Missing CodecPrivate for codec ".concat(String.valueOf(str)), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:104:0x0193  */
    /* JADX WARN: Code duplicated, block: B:121:0x01ef A[PHI: r9
  0x01ef: PHI (r9v7 int) = (r9v1 int), (r9v2 int), (r9v3 int), (r9v4 int), (r9v5 int), (r9v0 int) binds: [B:140:0x0271, B:135:0x0241, B:132:0x0223, B:130:0x021e, B:128:0x0219, B:120:0x01ed] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:172:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:177:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:178:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:181:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:182:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:184:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:186:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:188:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:191:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:193:0x0400  */
    /* JADX WARN: Code duplicated, block: B:196:0x0407  */
    /* JADX WARN: Code duplicated, block: B:199:0x0417  */
    /* JADX WARN: Code duplicated, block: B:202:0x041d  */
    /* JADX WARN: Code duplicated, block: B:204:0x0423  */
    /* JADX WARN: Code duplicated, block: B:227:0x0506  */
    /* JADX WARN: Code duplicated, block: B:232:0x0527  */
    /* JADX WARN: Code duplicated, block: B:250:0x0572  */
    /* JADX WARN: Code duplicated, block: B:252:0x0592  */
    /* JADX WARN: Code duplicated, block: B:254:0x059a  */
    /* JADX WARN: Code duplicated, block: B:269:0x05c9  */
    public final void zze(zzacq zzacqVar, int i) throws zzbc {
        byte b;
        List list;
        String str;
        String str2;
        List list2;
        int i2;
        List list3;
        List list4;
        List list5;
        String str3;
        int i3;
        zzz zzzVar;
        int i4;
        int iIntValue;
        int i5;
        float f;
        int i6;
        int i7;
        int i8;
        zzacj zzacjVarZza;
        List list6;
        String str4 = this.zzb;
        int iZzn = 4;
        int i9 = 0;
        switch (str4) {
            case "V_MPEG4/ISO/AP":
                b = 6;
                break;
            case "V_MPEG4/ISO/SP":
                b = 4;
                break;
            case "A_MS/ACM":
                b = 23;
                break;
            case "A_TRUEHD":
                b = 18;
                break;
            case "A_VORBIS":
                b = 11;
                break;
            case "A_MPEG/L2":
                b = cw.l;
                break;
            case "A_MPEG/L3":
                b = cw.m;
                break;
            case "V_MS/VFW/FOURCC":
                b = 9;
                break;
            case "S_DVBSUB":
                b = 32;
                break;
            case "V_MPEG4/ISO/ASP":
                b = 5;
                break;
            case "V_MPEG4/ISO/AVC":
                b = 7;
                break;
            case "S_VOBSUB":
                b = 30;
                break;
            case "A_DTS/LOSSLESS":
                b = 21;
                break;
            case "A_AAC":
                b = cw.k;
                break;
            case "A_AC3":
                b = cw.n;
                break;
            case "A_DTS":
                b = 19;
                break;
            case "V_AV1":
                b = 2;
                break;
            case "V_VP8":
                b = 0;
                break;
            case "V_VP9":
                b = 1;
                break;
            case "S_HDMV/PGS":
                b = 31;
                break;
            case "V_THEORA":
                b = 10;
                break;
            case "A_DTS/EXPRESS":
                b = 20;
                break;
            case "A_PCM/FLOAT/IEEE":
                b = 26;
                break;
            case "A_PCM/INT/BIG":
                b = 25;
                break;
            case "A_PCM/INT/LIT":
                b = 24;
                break;
            case "S_TEXT/ASS":
                b = 28;
                break;
            case "V_MPEGH/ISO/HEVC":
                b = 8;
                break;
            case "S_TEXT/WEBVTT":
                b = 29;
                break;
            case "S_TEXT/UTF8":
                b = 27;
                break;
            case "V_MPEG2":
                b = 3;
                break;
            case "A_EAC3":
                b = 17;
                break;
            case "A_FLAC":
                b = 22;
                break;
            case "A_OPUS":
                b = 12;
                break;
            default:
                b = -1;
                break;
        }
        String str5 = MimeTypes.AUDIO_RAW;
        zzk zzkVarZzg = null;
        bArr = null;
        bArr = null;
        bArr = null;
        bArr = null;
        bArr = null;
        bArr = null;
        bArr = null;
        bArr = null;
        bArr = null;
        byte[] bArr = null;
        switch (b) {
            case 0:
                str5 = MimeTypes.VIDEO_VP8;
                list2 = null;
                str2 = null;
                i2 = -1;
                list4 = list2;
                iZzn = -1;
                list5 = list4;
                if (this.zzN != null && (zzacjVarZza = zzacj.zza(new zzdy(this.zzN))) != null) {
                    str2 = zzacjVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z = this.zzV;
                if (true != this.zzU) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i10 = (z ? 1 : 0) | i3;
                zzzVar = new zzz();
                if (zzbb.zzg(str3)) {
                    zzzVar.zzz(this.zzO);
                    zzzVar.zzab(this.zzQ);
                    zzzVar.zzU(iZzn);
                    i4 = 1;
                } else if (zzbb.zzi(str3)) {
                    if (this.zzq == 0) {
                        i7 = this.zzo;
                        iIntValue = -1;
                        if (i7 == -1) {
                            i7 = this.zzl;
                        }
                        this.zzo = i7;
                        i8 = this.zzp;
                        if (i8 == -1) {
                            i8 = this.zzm;
                        }
                        this.zzp = i8;
                    } else {
                        iIntValue = -1;
                    }
                    i5 = this.zzo;
                    if (i5 != iIntValue || (i6 = this.zzp) == iIntValue) {
                        f = -1.0f;
                    } else {
                        f = (this.zzm * i5) / (this.zzl * i6);
                    }
                    if (this.zzx) {
                        if (this.zzD != -1.0f && this.zzE != -1.0f && this.zzF != -1.0f && this.zzG != -1.0f && this.zzH != -1.0f && this.zzI != -1.0f && this.zzJ != -1.0f && this.zzK != -1.0f && this.zzL != -1.0f && this.zzM != -1.0f) {
                            bArr = new byte[25];
                            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                            byteBufferOrder.put((byte) 0);
                            byteBufferOrder.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                            byteBufferOrder.putShort((short) (this.zzL + 0.5f));
                            byteBufferOrder.putShort((short) (this.zzM + 0.5f));
                            byteBufferOrder.putShort((short) this.zzB);
                            byteBufferOrder.putShort((short) this.zzC);
                        }
                        zzi zziVar = new zzi();
                        zziVar.zzc(this.zzy);
                        zziVar.zzb(this.zzA);
                        zziVar.zzd(this.zzz);
                        zziVar.zze(bArr);
                        zziVar.zzf(this.zzn);
                        zziVar.zza(this.zzn);
                        zzkVarZzg = zziVar.zzg();
                    }
                    if (this.zza != null && zzahm.zzf.containsKey(this.zza)) {
                        iIntValue = ((Integer) zzahm.zzf.get(this.zza)).intValue();
                    }
                    if (this.zzr == 0 || Float.compare(this.zzs, 0.0f) != 0 || Float.compare(this.zzt, 0.0f) != 0) {
                        i9 = iIntValue;
                    } else if (Float.compare(this.zzu, 0.0f) != 0) {
                        if (Float.compare(this.zzu, 90.0f) == 0) {
                            i9 = 90;
                        } else if (Float.compare(this.zzu, -180.0f) == 0 || Float.compare(this.zzu, 180.0f) == 0) {
                            i9 = 180;
                        } else if (Float.compare(this.zzu, -90.0f) == 0) {
                            i9 = 270;
                        } else {
                            i9 = iIntValue;
                        }
                    }
                    zzzVar.zzaf(this.zzl);
                    zzzVar.zzK(this.zzm);
                    zzzVar.zzW(f);
                    zzzVar.zzZ(i9);
                    zzzVar.zzX(this.zzv);
                    zzzVar.zzad(this.zzw);
                    zzzVar.zzB(zzkVarZzg);
                    i4 = 2;
                } else {
                    if (MimeTypes.APPLICATION_SUBRIP.equals(str3) && !MimeTypes.TEXT_SSA.equals(str3) && !MimeTypes.TEXT_VTT.equals(str3) && !MimeTypes.APPLICATION_VOBSUB.equals(str3) && !MimeTypes.APPLICATION_PGS.equals(str3) && !MimeTypes.APPLICATION_DVBSUBS.equals(str3)) {
                        throw zzbc.zza("Unexpected MIME type.", null);
                    }
                    i4 = 3;
                }
                if (this.zza != null && !zzahm.zzf.containsKey(this.zza)) {
                    zzzVar.zzO(this.zza);
                }
                zzzVar.zzL(i);
                zzzVar.zzaa(str3);
                zzzVar.zzR(i2);
                zzzVar.zzQ(this.zzZ);
                zzzVar.zzac(i10);
                zzzVar.zzN(list5);
                zzzVar.zzA(str2);
                zzzVar.zzF(this.zzk);
                zzab zzabVarZzag = zzzVar.zzag();
                zzadt zzadtVarZzw = zzacqVar.zzw(this.zzc, i4);
                this.zzW = zzadtVarZzw;
                zzadtVarZzw.zzm(zzabVarZzag);
                return;
            case 1:
                str5 = MimeTypes.VIDEO_VP9;
                list2 = null;
                str2 = null;
                i2 = -1;
                list4 = list2;
                iZzn = -1;
                list5 = list4;
                if (this.zzN != null) {
                    str2 = zzacjVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z2 = this.zzV;
                if (true != this.zzU) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i11 = (z2 ? 1 : 0) | i3;
                zzzVar = new zzz();
                if (zzbb.zzg(str3)) {
                    if (zzbb.zzi(str3)) {
                        if (this.zzq == 0) {
                            i7 = this.zzo;
                            iIntValue = -1;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzo = i7;
                            i8 = this.zzp;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzp = i8;
                        } else {
                            iIntValue = -1;
                        }
                        i5 = this.zzo;
                        if (i5 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder2 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder2.put((byte) 0);
                                byteBufferOrder2.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder2.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder2.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder2.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder2.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder2.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder2.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder2.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder2.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder2.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder2.putShort((short) this.zzB);
                                byteBufferOrder2.putShort((short) this.zzC);
                            }
                            zzi zziVar2 = new zzi();
                            zziVar2.zzc(this.zzy);
                            zziVar2.zzb(this.zzA);
                            zziVar2.zzd(this.zzz);
                            zziVar2.zze(bArr);
                            zziVar2.zzf(this.zzn);
                            zziVar2.zza(this.zzn);
                            zzkVarZzg = zziVar2.zzg();
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzahm.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzzVar.zzaf(this.zzl);
                        zzzVar.zzK(this.zzm);
                        zzzVar.zzW(f);
                        zzzVar.zzZ(i9);
                        zzzVar.zzX(this.zzv);
                        zzzVar.zzad(this.zzw);
                        zzzVar.zzB(zzkVarZzg);
                        i4 = 2;
                    } else {
                        if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        }
                        i4 = 3;
                    }
                    break;
                } else {
                    zzzVar.zzz(this.zzO);
                    zzzVar.zzab(this.zzQ);
                    zzzVar.zzU(iZzn);
                    i4 = 1;
                }
                if (this.zza != null) {
                    zzzVar.zzO(this.zza);
                }
                zzzVar.zzL(i);
                zzzVar.zzaa(str3);
                zzzVar.zzR(i2);
                zzzVar.zzQ(this.zzZ);
                zzzVar.zzac(i11);
                zzzVar.zzN(list5);
                zzzVar.zzA(str2);
                zzzVar.zzF(this.zzk);
                zzab zzabVarZzag2 = zzzVar.zzag();
                zzadt zzadtVarZzw2 = zzacqVar.zzw(this.zzc, i4);
                this.zzW = zzadtVarZzw2;
                zzadtVarZzw2.zzm(zzabVarZzag2);
                return;
            case 2:
                str5 = com.unity3d.services.core.device.MimeTypes.VIDEO_AV1;
                list2 = null;
                str2 = null;
                i2 = -1;
                list4 = list2;
                iZzn = -1;
                list5 = list4;
                if (this.zzN != null) {
                    str2 = zzacjVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z3 = this.zzV;
                if (true != this.zzU) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i12 = (z3 ? 1 : 0) | i3;
                zzzVar = new zzz();
                if (zzbb.zzg(str3)) {
                    if (zzbb.zzi(str3)) {
                        if (this.zzq == 0) {
                            i7 = this.zzo;
                            iIntValue = -1;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzo = i7;
                            i8 = this.zzp;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzp = i8;
                        } else {
                            iIntValue = -1;
                        }
                        i5 = this.zzo;
                        if (i5 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder3 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder3.put((byte) 0);
                                byteBufferOrder3.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder3.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder3.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder3.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder3.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder3.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder3.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder3.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder3.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder3.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder3.putShort((short) this.zzB);
                                byteBufferOrder3.putShort((short) this.zzC);
                            }
                            zzi zziVar3 = new zzi();
                            zziVar3.zzc(this.zzy);
                            zziVar3.zzb(this.zzA);
                            zziVar3.zzd(this.zzz);
                            zziVar3.zze(bArr);
                            zziVar3.zzf(this.zzn);
                            zziVar3.zza(this.zzn);
                            zzkVarZzg = zziVar3.zzg();
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzahm.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzzVar.zzaf(this.zzl);
                        zzzVar.zzK(this.zzm);
                        zzzVar.zzW(f);
                        zzzVar.zzZ(i9);
                        zzzVar.zzX(this.zzv);
                        zzzVar.zzad(this.zzw);
                        zzzVar.zzB(zzkVarZzg);
                        i4 = 2;
                    } else {
                        if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        }
                        i4 = 3;
                    }
                    break;
                } else {
                    zzzVar.zzz(this.zzO);
                    zzzVar.zzab(this.zzQ);
                    zzzVar.zzU(iZzn);
                    i4 = 1;
                }
                if (this.zza != null) {
                    zzzVar.zzO(this.zza);
                }
                zzzVar.zzL(i);
                zzzVar.zzaa(str3);
                zzzVar.zzR(i2);
                zzzVar.zzQ(this.zzZ);
                zzzVar.zzac(i12);
                zzzVar.zzN(list5);
                zzzVar.zzA(str2);
                zzzVar.zzF(this.zzk);
                zzab zzabVarZzag3 = zzzVar.zzag();
                zzadt zzadtVarZzw3 = zzacqVar.zzw(this.zzc, i4);
                this.zzW = zzadtVarZzw3;
                zzadtVarZzw3.zzm(zzabVarZzag3);
                return;
            case 3:
                str5 = MimeTypes.VIDEO_MPEG2;
                list2 = null;
                str2 = null;
                i2 = -1;
                list4 = list2;
                iZzn = -1;
                list5 = list4;
                if (this.zzN != null) {
                    str2 = zzacjVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z4 = this.zzV;
                if (true != this.zzU) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i13 = (z4 ? 1 : 0) | i3;
                zzzVar = new zzz();
                if (zzbb.zzg(str3)) {
                    if (zzbb.zzi(str3)) {
                        if (this.zzq == 0) {
                            i7 = this.zzo;
                            iIntValue = -1;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzo = i7;
                            i8 = this.zzp;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzp = i8;
                        } else {
                            iIntValue = -1;
                        }
                        i5 = this.zzo;
                        if (i5 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder4 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder4.put((byte) 0);
                                byteBufferOrder4.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder4.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder4.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder4.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder4.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder4.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder4.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder4.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder4.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder4.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder4.putShort((short) this.zzB);
                                byteBufferOrder4.putShort((short) this.zzC);
                            }
                            zzi zziVar4 = new zzi();
                            zziVar4.zzc(this.zzy);
                            zziVar4.zzb(this.zzA);
                            zziVar4.zzd(this.zzz);
                            zziVar4.zze(bArr);
                            zziVar4.zzf(this.zzn);
                            zziVar4.zza(this.zzn);
                            zzkVarZzg = zziVar4.zzg();
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzahm.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzzVar.zzaf(this.zzl);
                        zzzVar.zzK(this.zzm);
                        zzzVar.zzW(f);
                        zzzVar.zzZ(i9);
                        zzzVar.zzX(this.zzv);
                        zzzVar.zzad(this.zzw);
                        zzzVar.zzB(zzkVarZzg);
                        i4 = 2;
                    } else {
                        if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        }
                        i4 = 3;
                    }
                    break;
                } else {
                    zzzVar.zzz(this.zzO);
                    zzzVar.zzab(this.zzQ);
                    zzzVar.zzU(iZzn);
                    i4 = 1;
                }
                if (this.zza != null) {
                    zzzVar.zzO(this.zza);
                }
                zzzVar.zzL(i);
                zzzVar.zzaa(str3);
                zzzVar.zzR(i2);
                zzzVar.zzQ(this.zzZ);
                zzzVar.zzac(i13);
                zzzVar.zzN(list5);
                zzzVar.zzA(str2);
                zzzVar.zzF(this.zzk);
                zzab zzabVarZzag4 = zzzVar.zzag();
                zzadt zzadtVarZzw4 = zzacqVar.zzw(this.zzc, i4);
                this.zzW = zzadtVarZzw4;
                zzadtVarZzw4.zzm(zzabVarZzag4);
                return;
            case 4:
            case 5:
            case 6:
                byte[] bArr2 = this.zzj;
                List listSingletonList = bArr2 == null ? null : Collections.singletonList(bArr2);
                str5 = MimeTypes.VIDEO_MP4V;
                list6 = listSingletonList;
                str2 = null;
                list2 = list6;
                i2 = -1;
                list4 = list2;
                iZzn = -1;
                list5 = list4;
                if (this.zzN != null) {
                    str2 = zzacjVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z5 = this.zzV;
                if (true != this.zzU) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i14 = (z5 ? 1 : 0) | i3;
                zzzVar = new zzz();
                if (zzbb.zzg(str3)) {
                    if (zzbb.zzi(str3)) {
                        if (this.zzq == 0) {
                            i7 = this.zzo;
                            iIntValue = -1;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzo = i7;
                            i8 = this.zzp;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzp = i8;
                        } else {
                            iIntValue = -1;
                        }
                        i5 = this.zzo;
                        if (i5 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder5 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder5.put((byte) 0);
                                byteBufferOrder5.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder5.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder5.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder5.putShort((short) this.zzB);
                                byteBufferOrder5.putShort((short) this.zzC);
                            }
                            zzi zziVar5 = new zzi();
                            zziVar5.zzc(this.zzy);
                            zziVar5.zzb(this.zzA);
                            zziVar5.zzd(this.zzz);
                            zziVar5.zze(bArr);
                            zziVar5.zzf(this.zzn);
                            zziVar5.zza(this.zzn);
                            zzkVarZzg = zziVar5.zzg();
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzahm.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzzVar.zzaf(this.zzl);
                        zzzVar.zzK(this.zzm);
                        zzzVar.zzW(f);
                        zzzVar.zzZ(i9);
                        zzzVar.zzX(this.zzv);
                        zzzVar.zzad(this.zzw);
                        zzzVar.zzB(zzkVarZzg);
                        i4 = 2;
                    } else {
                        if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        }
                        i4 = 3;
                    }
                    break;
                } else {
                    zzzVar.zzz(this.zzO);
                    zzzVar.zzab(this.zzQ);
                    zzzVar.zzU(iZzn);
                    i4 = 1;
                }
                if (this.zza != null) {
                    zzzVar.zzO(this.zza);
                }
                zzzVar.zzL(i);
                zzzVar.zzaa(str3);
                zzzVar.zzR(i2);
                zzzVar.zzQ(this.zzZ);
                zzzVar.zzac(i14);
                zzzVar.zzN(list5);
                zzzVar.zzA(str2);
                zzzVar.zzF(this.zzk);
                zzab zzabVarZzag5 = zzzVar.zzag();
                zzadt zzadtVarZzw5 = zzacqVar.zzw(this.zzc, i4);
                this.zzW = zzadtVarZzw5;
                zzadtVarZzw5.zzm(zzabVarZzag5);
                return;
            case 7:
                zzabr zzabrVarZza = zzabr.zza(new zzdy(zzi(this.zzb)));
                list = zzabrVarZza.zza;
                this.zzX = zzabrVarZza.zzb;
                str = zzabrVarZza.zzl;
                str5 = "video/avc";
                str2 = str;
                list2 = list;
                i2 = -1;
                list4 = list2;
                iZzn = -1;
                list5 = list4;
                if (this.zzN != null) {
                    str2 = zzacjVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z6 = this.zzV;
                if (true != this.zzU) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i15 = (z6 ? 1 : 0) | i3;
                zzzVar = new zzz();
                if (zzbb.zzg(str3)) {
                    if (zzbb.zzi(str3)) {
                        if (this.zzq == 0) {
                            i7 = this.zzo;
                            iIntValue = -1;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzo = i7;
                            i8 = this.zzp;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzp = i8;
                        } else {
                            iIntValue = -1;
                        }
                        i5 = this.zzo;
                        if (i5 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder6 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder6.put((byte) 0);
                                byteBufferOrder6.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder6.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder6.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder6.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder6.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder6.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder6.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder6.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder6.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder6.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder6.putShort((short) this.zzB);
                                byteBufferOrder6.putShort((short) this.zzC);
                            }
                            zzi zziVar6 = new zzi();
                            zziVar6.zzc(this.zzy);
                            zziVar6.zzb(this.zzA);
                            zziVar6.zzd(this.zzz);
                            zziVar6.zze(bArr);
                            zziVar6.zzf(this.zzn);
                            zziVar6.zza(this.zzn);
                            zzkVarZzg = zziVar6.zzg();
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzahm.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzzVar.zzaf(this.zzl);
                        zzzVar.zzK(this.zzm);
                        zzzVar.zzW(f);
                        zzzVar.zzZ(i9);
                        zzzVar.zzX(this.zzv);
                        zzzVar.zzad(this.zzw);
                        zzzVar.zzB(zzkVarZzg);
                        i4 = 2;
                    } else {
                        if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        }
                        i4 = 3;
                    }
                    break;
                } else {
                    zzzVar.zzz(this.zzO);
                    zzzVar.zzab(this.zzQ);
                    zzzVar.zzU(iZzn);
                    i4 = 1;
                }
                if (this.zza != null) {
                    zzzVar.zzO(this.zza);
                }
                zzzVar.zzL(i);
                zzzVar.zzaa(str3);
                zzzVar.zzR(i2);
                zzzVar.zzQ(this.zzZ);
                zzzVar.zzac(i15);
                zzzVar.zzN(list5);
                zzzVar.zzA(str2);
                zzzVar.zzF(this.zzk);
                zzab zzabVarZzag6 = zzzVar.zzag();
                zzadt zzadtVarZzw6 = zzacqVar.zzw(this.zzc, i4);
                this.zzW = zzadtVarZzw6;
                zzadtVarZzw6.zzm(zzabVarZzag6);
                return;
            case 8:
                zzadc zzadcVarZza = zzadc.zza(new zzdy(zzi(this.zzb)));
                list = zzadcVarZza.zza;
                this.zzX = zzadcVarZza.zzb;
                str = zzadcVarZza.zzk;
                str5 = "video/hevc";
                str2 = str;
                list2 = list;
                i2 = -1;
                list4 = list2;
                iZzn = -1;
                list5 = list4;
                if (this.zzN != null) {
                    str2 = zzacjVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z7 = this.zzV;
                if (true != this.zzU) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i16 = (z7 ? 1 : 0) | i3;
                zzzVar = new zzz();
                if (zzbb.zzg(str3)) {
                    if (zzbb.zzi(str3)) {
                        if (this.zzq == 0) {
                            i7 = this.zzo;
                            iIntValue = -1;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzo = i7;
                            i8 = this.zzp;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzp = i8;
                        } else {
                            iIntValue = -1;
                        }
                        i5 = this.zzo;
                        if (i5 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder7 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder7.put((byte) 0);
                                byteBufferOrder7.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder7.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder7.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder7.putShort((short) this.zzB);
                                byteBufferOrder7.putShort((short) this.zzC);
                            }
                            zzi zziVar7 = new zzi();
                            zziVar7.zzc(this.zzy);
                            zziVar7.zzb(this.zzA);
                            zziVar7.zzd(this.zzz);
                            zziVar7.zze(bArr);
                            zziVar7.zzf(this.zzn);
                            zziVar7.zza(this.zzn);
                            zzkVarZzg = zziVar7.zzg();
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzahm.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzzVar.zzaf(this.zzl);
                        zzzVar.zzK(this.zzm);
                        zzzVar.zzW(f);
                        zzzVar.zzZ(i9);
                        zzzVar.zzX(this.zzv);
                        zzzVar.zzad(this.zzw);
                        zzzVar.zzB(zzkVarZzg);
                        i4 = 2;
                    } else {
                        if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        }
                        i4 = 3;
                    }
                    break;
                } else {
                    zzzVar.zzz(this.zzO);
                    zzzVar.zzab(this.zzQ);
                    zzzVar.zzU(iZzn);
                    i4 = 1;
                }
                if (this.zza != null) {
                    zzzVar.zzO(this.zza);
                }
                zzzVar.zzL(i);
                zzzVar.zzaa(str3);
                zzzVar.zzR(i2);
                zzzVar.zzQ(this.zzZ);
                zzzVar.zzac(i16);
                zzzVar.zzN(list5);
                zzzVar.zzA(str2);
                zzzVar.zzF(this.zzk);
                zzab zzabVarZzag7 = zzzVar.zzag();
                zzadt zzadtVarZzw7 = zzacqVar.zzw(this.zzc, i4);
                this.zzW = zzadtVarZzw7;
                zzadtVarZzw7.zzm(zzabVarZzag7);
                return;
            case 9:
                Pair pairZzf = zzf(new zzdy(zzi(this.zzb)));
                str5 = (String) pairZzf.first;
                list6 = (List) pairZzf.second;
                str2 = null;
                list2 = list6;
                i2 = -1;
                list4 = list2;
                iZzn = -1;
                list5 = list4;
                if (this.zzN != null) {
                    str2 = zzacjVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z8 = this.zzV;
                if (true != this.zzU) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i17 = (z8 ? 1 : 0) | i3;
                zzzVar = new zzz();
                if (zzbb.zzg(str3)) {
                    if (zzbb.zzi(str3)) {
                        if (this.zzq == 0) {
                            i7 = this.zzo;
                            iIntValue = -1;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzo = i7;
                            i8 = this.zzp;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzp = i8;
                        } else {
                            iIntValue = -1;
                        }
                        i5 = this.zzo;
                        if (i5 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder8 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder8.put((byte) 0);
                                byteBufferOrder8.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder8.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder8.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder8.putShort((short) this.zzB);
                                byteBufferOrder8.putShort((short) this.zzC);
                            }
                            zzi zziVar8 = new zzi();
                            zziVar8.zzc(this.zzy);
                            zziVar8.zzb(this.zzA);
                            zziVar8.zzd(this.zzz);
                            zziVar8.zze(bArr);
                            zziVar8.zzf(this.zzn);
                            zziVar8.zza(this.zzn);
                            zzkVarZzg = zziVar8.zzg();
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzahm.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzzVar.zzaf(this.zzl);
                        zzzVar.zzK(this.zzm);
                        zzzVar.zzW(f);
                        zzzVar.zzZ(i9);
                        zzzVar.zzX(this.zzv);
                        zzzVar.zzad(this.zzw);
                        zzzVar.zzB(zzkVarZzg);
                        i4 = 2;
                    } else {
                        if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        }
                        i4 = 3;
                    }
                    break;
                } else {
                    zzzVar.zzz(this.zzO);
                    zzzVar.zzab(this.zzQ);
                    zzzVar.zzU(iZzn);
                    i4 = 1;
                }
                if (this.zza != null) {
                    zzzVar.zzO(this.zza);
                }
                zzzVar.zzL(i);
                zzzVar.zzaa(str3);
                zzzVar.zzR(i2);
                zzzVar.zzQ(this.zzZ);
                zzzVar.zzac(i17);
                zzzVar.zzN(list5);
                zzzVar.zzA(str2);
                zzzVar.zzF(this.zzk);
                zzab zzabVarZzag8 = zzzVar.zzag();
                zzadt zzadtVarZzw8 = zzacqVar.zzw(this.zzc, i4);
                this.zzW = zzadtVarZzw8;
                zzadtVarZzw8.zzm(zzabVarZzag8);
                return;
            case 10:
                str5 = MimeTypes.VIDEO_UNKNOWN;
                list2 = null;
                str2 = null;
                i2 = -1;
                list4 = list2;
                iZzn = -1;
                list5 = list4;
                if (this.zzN != null) {
                    str2 = zzacjVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z9 = this.zzV;
                if (true != this.zzU) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i18 = (z9 ? 1 : 0) | i3;
                zzzVar = new zzz();
                if (zzbb.zzg(str3)) {
                    if (zzbb.zzi(str3)) {
                        if (this.zzq == 0) {
                            i7 = this.zzo;
                            iIntValue = -1;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzo = i7;
                            i8 = this.zzp;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzp = i8;
                        } else {
                            iIntValue = -1;
                        }
                        i5 = this.zzo;
                        if (i5 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder9 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder9.put((byte) 0);
                                byteBufferOrder9.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder9.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder9.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder9.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder9.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder9.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder9.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder9.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder9.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder9.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder9.putShort((short) this.zzB);
                                byteBufferOrder9.putShort((short) this.zzC);
                            }
                            zzi zziVar9 = new zzi();
                            zziVar9.zzc(this.zzy);
                            zziVar9.zzb(this.zzA);
                            zziVar9.zzd(this.zzz);
                            zziVar9.zze(bArr);
                            zziVar9.zzf(this.zzn);
                            zziVar9.zza(this.zzn);
                            zzkVarZzg = zziVar9.zzg();
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzahm.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzzVar.zzaf(this.zzl);
                        zzzVar.zzK(this.zzm);
                        zzzVar.zzW(f);
                        zzzVar.zzZ(i9);
                        zzzVar.zzX(this.zzv);
                        zzzVar.zzad(this.zzw);
                        zzzVar.zzB(zzkVarZzg);
                        i4 = 2;
                    } else {
                        if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        }
                        i4 = 3;
                    }
                    break;
                } else {
                    zzzVar.zzz(this.zzO);
                    zzzVar.zzab(this.zzQ);
                    zzzVar.zzU(iZzn);
                    i4 = 1;
                }
                if (this.zza != null) {
                    zzzVar.zzO(this.zza);
                }
                zzzVar.zzL(i);
                zzzVar.zzaa(str3);
                zzzVar.zzR(i2);
                zzzVar.zzQ(this.zzZ);
                zzzVar.zzac(i18);
                zzzVar.zzN(list5);
                zzzVar.zzA(str2);
                zzzVar.zzF(this.zzk);
                zzab zzabVarZzag9 = zzzVar.zzag();
                zzadt zzadtVarZzw9 = zzacqVar.zzw(this.zzc, i4);
                this.zzW = zzadtVarZzw9;
                zzadtVarZzw9.zzm(zzabVarZzag9);
                return;
            case 11:
                List listZzg = zzg(zzi(str4));
                i2 = 8192;
                str5 = MimeTypes.AUDIO_VORBIS;
                list3 = listZzg;
                str2 = null;
                list4 = list3;
                iZzn = -1;
                list5 = list4;
                if (this.zzN != null) {
                    str2 = zzacjVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z10 = this.zzV;
                if (true != this.zzU) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i19 = (z10 ? 1 : 0) | i3;
                zzzVar = new zzz();
                if (zzbb.zzg(str3)) {
                    if (zzbb.zzi(str3)) {
                        if (this.zzq == 0) {
                            i7 = this.zzo;
                            iIntValue = -1;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzo = i7;
                            i8 = this.zzp;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzp = i8;
                        } else {
                            iIntValue = -1;
                        }
                        i5 = this.zzo;
                        if (i5 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder10 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder10.put((byte) 0);
                                byteBufferOrder10.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder10.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder10.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder10.putShort((short) this.zzB);
                                byteBufferOrder10.putShort((short) this.zzC);
                            }
                            zzi zziVar10 = new zzi();
                            zziVar10.zzc(this.zzy);
                            zziVar10.zzb(this.zzA);
                            zziVar10.zzd(this.zzz);
                            zziVar10.zze(bArr);
                            zziVar10.zzf(this.zzn);
                            zziVar10.zza(this.zzn);
                            zzkVarZzg = zziVar10.zzg();
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzahm.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzzVar.zzaf(this.zzl);
                        zzzVar.zzK(this.zzm);
                        zzzVar.zzW(f);
                        zzzVar.zzZ(i9);
                        zzzVar.zzX(this.zzv);
                        zzzVar.zzad(this.zzw);
                        zzzVar.zzB(zzkVarZzg);
                        i4 = 2;
                    } else {
                        if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        }
                        i4 = 3;
                    }
                    break;
                } else {
                    zzzVar.zzz(this.zzO);
                    zzzVar.zzab(this.zzQ);
                    zzzVar.zzU(iZzn);
                    i4 = 1;
                }
                if (this.zza != null) {
                    zzzVar.zzO(this.zza);
                }
                zzzVar.zzL(i);
                zzzVar.zzaa(str3);
                zzzVar.zzR(i2);
                zzzVar.zzQ(this.zzZ);
                zzzVar.zzac(i19);
                zzzVar.zzN(list5);
                zzzVar.zzA(str2);
                zzzVar.zzF(this.zzk);
                zzab zzabVarZzag10 = zzzVar.zzag();
                zzadt zzadtVarZzw10 = zzacqVar.zzw(this.zzc, i4);
                this.zzW = zzadtVarZzw10;
                zzadtVarZzw10.zzm(zzabVarZzag10);
                return;
            case 12:
                ArrayList arrayList = new ArrayList(3);
                arrayList.add(zzi(this.zzb));
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                arrayList.add(byteBufferAllocate.order(byteOrder).putLong(this.zzR).array());
                arrayList.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.zzS).array());
                i2 = 5760;
                str5 = MimeTypes.AUDIO_OPUS;
                list3 = arrayList;
                str2 = null;
                list4 = list3;
                iZzn = -1;
                list5 = list4;
                if (this.zzN != null) {
                    str2 = zzacjVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z11 = this.zzV;
                if (true != this.zzU) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i110 = (z11 ? 1 : 0) | i3;
                zzzVar = new zzz();
                if (zzbb.zzg(str3)) {
                    if (zzbb.zzi(str3)) {
                        if (this.zzq == 0) {
                            i7 = this.zzo;
                            iIntValue = -1;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzo = i7;
                            i8 = this.zzp;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzp = i8;
                        } else {
                            iIntValue = -1;
                        }
                        i5 = this.zzo;
                        if (i5 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder11 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder11.put((byte) 0);
                                byteBufferOrder11.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder11.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder11.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder11.putShort((short) this.zzB);
                                byteBufferOrder11.putShort((short) this.zzC);
                            }
                            zzi zziVar11 = new zzi();
                            zziVar11.zzc(this.zzy);
                            zziVar11.zzb(this.zzA);
                            zziVar11.zzd(this.zzz);
                            zziVar11.zze(bArr);
                            zziVar11.zzf(this.zzn);
                            zziVar11.zza(this.zzn);
                            zzkVarZzg = zziVar11.zzg();
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzahm.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzzVar.zzaf(this.zzl);
                        zzzVar.zzK(this.zzm);
                        zzzVar.zzW(f);
                        zzzVar.zzZ(i9);
                        zzzVar.zzX(this.zzv);
                        zzzVar.zzad(this.zzw);
                        zzzVar.zzB(zzkVarZzg);
                        i4 = 2;
                    } else {
                        if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        }
                        i4 = 3;
                    }
                    break;
                } else {
                    zzzVar.zzz(this.zzO);
                    zzzVar.zzab(this.zzQ);
                    zzzVar.zzU(iZzn);
                    i4 = 1;
                }
                if (this.zza != null) {
                    zzzVar.zzO(this.zza);
                }
                zzzVar.zzL(i);
                zzzVar.zzaa(str3);
                zzzVar.zzR(i2);
                zzzVar.zzQ(this.zzZ);
                zzzVar.zzac(i110);
                zzzVar.zzN(list5);
                zzzVar.zzA(str2);
                zzzVar.zzF(this.zzk);
                zzab zzabVarZzag11 = zzzVar.zzag();
                zzadt zzadtVarZzw11 = zzacqVar.zzw(this.zzc, i4);
                this.zzW = zzadtVarZzw11;
                zzadtVarZzw11.zzm(zzabVarZzag11);
                return;
            case 13:
                List listSingletonList2 = Collections.singletonList(zzi(str4));
                zzabi zzabiVarZza = zzabk.zza(this.zzj);
                this.zzQ = zzabiVarZza.zza;
                this.zzO = zzabiVarZza.zzb;
                String str6 = zzabiVarZza.zzc;
                str5 = MimeTypes.AUDIO_AAC;
                str2 = str6;
                list2 = listSingletonList2;
                i2 = -1;
                list4 = list2;
                iZzn = -1;
                list5 = list4;
                if (this.zzN != null) {
                    str2 = zzacjVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z12 = this.zzV;
                if (true != this.zzU) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i111 = (z12 ? 1 : 0) | i3;
                zzzVar = new zzz();
                if (zzbb.zzg(str3)) {
                    if (zzbb.zzi(str3)) {
                        if (this.zzq == 0) {
                            i7 = this.zzo;
                            iIntValue = -1;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzo = i7;
                            i8 = this.zzp;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzp = i8;
                        } else {
                            iIntValue = -1;
                        }
                        i5 = this.zzo;
                        if (i5 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder12 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder12.put((byte) 0);
                                byteBufferOrder12.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder12.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder12.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder12.putShort((short) this.zzB);
                                byteBufferOrder12.putShort((short) this.zzC);
                            }
                            zzi zziVar12 = new zzi();
                            zziVar12.zzc(this.zzy);
                            zziVar12.zzb(this.zzA);
                            zziVar12.zzd(this.zzz);
                            zziVar12.zze(bArr);
                            zziVar12.zzf(this.zzn);
                            zziVar12.zza(this.zzn);
                            zzkVarZzg = zziVar12.zzg();
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzahm.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzzVar.zzaf(this.zzl);
                        zzzVar.zzK(this.zzm);
                        zzzVar.zzW(f);
                        zzzVar.zzZ(i9);
                        zzzVar.zzX(this.zzv);
                        zzzVar.zzad(this.zzw);
                        zzzVar.zzB(zzkVarZzg);
                        i4 = 2;
                    } else {
                        if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        }
                        i4 = 3;
                    }
                    break;
                } else {
                    zzzVar.zzz(this.zzO);
                    zzzVar.zzab(this.zzQ);
                    zzzVar.zzU(iZzn);
                    i4 = 1;
                }
                if (this.zza != null) {
                    zzzVar.zzO(this.zza);
                }
                zzzVar.zzL(i);
                zzzVar.zzaa(str3);
                zzzVar.zzR(i2);
                zzzVar.zzQ(this.zzZ);
                zzzVar.zzac(i111);
                zzzVar.zzN(list5);
                zzzVar.zzA(str2);
                zzzVar.zzF(this.zzk);
                zzab zzabVarZzag12 = zzzVar.zzag();
                zzadt zzadtVarZzw12 = zzacqVar.zzw(this.zzc, i4);
                this.zzW = zzadtVarZzw12;
                zzadtVarZzw12.zzm(zzabVarZzag12);
                return;
            case 14:
                str5 = MimeTypes.AUDIO_MPEG_L2;
                list4 = null;
                str2 = null;
                i2 = 4096;
                iZzn = -1;
                list5 = list4;
                if (this.zzN != null) {
                    str2 = zzacjVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z13 = this.zzV;
                if (true != this.zzU) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i112 = (z13 ? 1 : 0) | i3;
                zzzVar = new zzz();
                if (zzbb.zzg(str3)) {
                    if (zzbb.zzi(str3)) {
                        if (this.zzq == 0) {
                            i7 = this.zzo;
                            iIntValue = -1;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzo = i7;
                            i8 = this.zzp;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzp = i8;
                        } else {
                            iIntValue = -1;
                        }
                        i5 = this.zzo;
                        if (i5 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder13 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder13.put((byte) 0);
                                byteBufferOrder13.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder13.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder13.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder13.putShort((short) this.zzB);
                                byteBufferOrder13.putShort((short) this.zzC);
                            }
                            zzi zziVar13 = new zzi();
                            zziVar13.zzc(this.zzy);
                            zziVar13.zzb(this.zzA);
                            zziVar13.zzd(this.zzz);
                            zziVar13.zze(bArr);
                            zziVar13.zzf(this.zzn);
                            zziVar13.zza(this.zzn);
                            zzkVarZzg = zziVar13.zzg();
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzahm.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzzVar.zzaf(this.zzl);
                        zzzVar.zzK(this.zzm);
                        zzzVar.zzW(f);
                        zzzVar.zzZ(i9);
                        zzzVar.zzX(this.zzv);
                        zzzVar.zzad(this.zzw);
                        zzzVar.zzB(zzkVarZzg);
                        i4 = 2;
                    } else {
                        if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        }
                        i4 = 3;
                    }
                    break;
                } else {
                    zzzVar.zzz(this.zzO);
                    zzzVar.zzab(this.zzQ);
                    zzzVar.zzU(iZzn);
                    i4 = 1;
                }
                if (this.zza != null) {
                    zzzVar.zzO(this.zza);
                }
                zzzVar.zzL(i);
                zzzVar.zzaa(str3);
                zzzVar.zzR(i2);
                zzzVar.zzQ(this.zzZ);
                zzzVar.zzac(i112);
                zzzVar.zzN(list5);
                zzzVar.zzA(str2);
                zzzVar.zzF(this.zzk);
                zzab zzabVarZzag13 = zzzVar.zzag();
                zzadt zzadtVarZzw13 = zzacqVar.zzw(this.zzc, i4);
                this.zzW = zzadtVarZzw13;
                zzadtVarZzw13.zzm(zzabVarZzag13);
                return;
            case 15:
                str5 = MimeTypes.AUDIO_MPEG;
                list4 = null;
                str2 = null;
                i2 = 4096;
                iZzn = -1;
                list5 = list4;
                if (this.zzN != null) {
                    str2 = zzacjVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z14 = this.zzV;
                if (true != this.zzU) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i113 = (z14 ? 1 : 0) | i3;
                zzzVar = new zzz();
                if (zzbb.zzg(str3)) {
                    if (zzbb.zzi(str3)) {
                        if (this.zzq == 0) {
                            i7 = this.zzo;
                            iIntValue = -1;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzo = i7;
                            i8 = this.zzp;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzp = i8;
                        } else {
                            iIntValue = -1;
                        }
                        i5 = this.zzo;
                        if (i5 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder14 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder14.put((byte) 0);
                                byteBufferOrder14.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder14.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder14.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder14.putShort((short) this.zzB);
                                byteBufferOrder14.putShort((short) this.zzC);
                            }
                            zzi zziVar14 = new zzi();
                            zziVar14.zzc(this.zzy);
                            zziVar14.zzb(this.zzA);
                            zziVar14.zzd(this.zzz);
                            zziVar14.zze(bArr);
                            zziVar14.zzf(this.zzn);
                            zziVar14.zza(this.zzn);
                            zzkVarZzg = zziVar14.zzg();
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzahm.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzzVar.zzaf(this.zzl);
                        zzzVar.zzK(this.zzm);
                        zzzVar.zzW(f);
                        zzzVar.zzZ(i9);
                        zzzVar.zzX(this.zzv);
                        zzzVar.zzad(this.zzw);
                        zzzVar.zzB(zzkVarZzg);
                        i4 = 2;
                    } else {
                        if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        }
                        i4 = 3;
                    }
                    break;
                } else {
                    zzzVar.zzz(this.zzO);
                    zzzVar.zzab(this.zzQ);
                    zzzVar.zzU(iZzn);
                    i4 = 1;
                }
                if (this.zza != null) {
                    zzzVar.zzO(this.zza);
                }
                zzzVar.zzL(i);
                zzzVar.zzaa(str3);
                zzzVar.zzR(i2);
                zzzVar.zzQ(this.zzZ);
                zzzVar.zzac(i113);
                zzzVar.zzN(list5);
                zzzVar.zzA(str2);
                zzzVar.zzF(this.zzk);
                zzab zzabVarZzag14 = zzzVar.zzag();
                zzadt zzadtVarZzw14 = zzacqVar.zzw(this.zzc, i4);
                this.zzW = zzadtVarZzw14;
                zzadtVarZzw14.zzm(zzabVarZzag14);
                return;
            case 16:
                str5 = MimeTypes.AUDIO_AC3;
                list2 = null;
                str2 = null;
                i2 = -1;
                list4 = list2;
                iZzn = -1;
                list5 = list4;
                if (this.zzN != null) {
                    str2 = zzacjVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z15 = this.zzV;
                if (true != this.zzU) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i114 = (z15 ? 1 : 0) | i3;
                zzzVar = new zzz();
                if (zzbb.zzg(str3)) {
                    if (zzbb.zzi(str3)) {
                        if (this.zzq == 0) {
                            i7 = this.zzo;
                            iIntValue = -1;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzo = i7;
                            i8 = this.zzp;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzp = i8;
                        } else {
                            iIntValue = -1;
                        }
                        i5 = this.zzo;
                        if (i5 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder15 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder15.put((byte) 0);
                                byteBufferOrder15.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder15.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder15.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder15.putShort((short) this.zzB);
                                byteBufferOrder15.putShort((short) this.zzC);
                            }
                            zzi zziVar15 = new zzi();
                            zziVar15.zzc(this.zzy);
                            zziVar15.zzb(this.zzA);
                            zziVar15.zzd(this.zzz);
                            zziVar15.zze(bArr);
                            zziVar15.zzf(this.zzn);
                            zziVar15.zza(this.zzn);
                            zzkVarZzg = zziVar15.zzg();
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzahm.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzzVar.zzaf(this.zzl);
                        zzzVar.zzK(this.zzm);
                        zzzVar.zzW(f);
                        zzzVar.zzZ(i9);
                        zzzVar.zzX(this.zzv);
                        zzzVar.zzad(this.zzw);
                        zzzVar.zzB(zzkVarZzg);
                        i4 = 2;
                    } else {
                        if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        }
                        i4 = 3;
                    }
                    break;
                } else {
                    zzzVar.zzz(this.zzO);
                    zzzVar.zzab(this.zzQ);
                    zzzVar.zzU(iZzn);
                    i4 = 1;
                }
                if (this.zza != null) {
                    zzzVar.zzO(this.zza);
                }
                zzzVar.zzL(i);
                zzzVar.zzaa(str3);
                zzzVar.zzR(i2);
                zzzVar.zzQ(this.zzZ);
                zzzVar.zzac(i114);
                zzzVar.zzN(list5);
                zzzVar.zzA(str2);
                zzzVar.zzF(this.zzk);
                zzab zzabVarZzag15 = zzzVar.zzag();
                zzadt zzadtVarZzw15 = zzacqVar.zzw(this.zzc, i4);
                this.zzW = zzadtVarZzw15;
                zzadtVarZzw15.zzm(zzabVarZzag15);
                return;
            case 17:
                str5 = MimeTypes.AUDIO_E_AC3;
                list2 = null;
                str2 = null;
                i2 = -1;
                list4 = list2;
                iZzn = -1;
                list5 = list4;
                if (this.zzN != null) {
                    str2 = zzacjVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z16 = this.zzV;
                if (true != this.zzU) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i115 = (z16 ? 1 : 0) | i3;
                zzzVar = new zzz();
                if (zzbb.zzg(str3)) {
                    if (zzbb.zzi(str3)) {
                        if (this.zzq == 0) {
                            i7 = this.zzo;
                            iIntValue = -1;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzo = i7;
                            i8 = this.zzp;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzp = i8;
                        } else {
                            iIntValue = -1;
                        }
                        i5 = this.zzo;
                        if (i5 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder16 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder16.put((byte) 0);
                                byteBufferOrder16.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder16.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder16.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder16.putShort((short) this.zzB);
                                byteBufferOrder16.putShort((short) this.zzC);
                            }
                            zzi zziVar16 = new zzi();
                            zziVar16.zzc(this.zzy);
                            zziVar16.zzb(this.zzA);
                            zziVar16.zzd(this.zzz);
                            zziVar16.zze(bArr);
                            zziVar16.zzf(this.zzn);
                            zziVar16.zza(this.zzn);
                            zzkVarZzg = zziVar16.zzg();
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzahm.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzzVar.zzaf(this.zzl);
                        zzzVar.zzK(this.zzm);
                        zzzVar.zzW(f);
                        zzzVar.zzZ(i9);
                        zzzVar.zzX(this.zzv);
                        zzzVar.zzad(this.zzw);
                        zzzVar.zzB(zzkVarZzg);
                        i4 = 2;
                    } else {
                        if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        }
                        i4 = 3;
                    }
                    break;
                } else {
                    zzzVar.zzz(this.zzO);
                    zzzVar.zzab(this.zzQ);
                    zzzVar.zzU(iZzn);
                    i4 = 1;
                }
                if (this.zza != null) {
                    zzzVar.zzO(this.zza);
                }
                zzzVar.zzL(i);
                zzzVar.zzaa(str3);
                zzzVar.zzR(i2);
                zzzVar.zzQ(this.zzZ);
                zzzVar.zzac(i115);
                zzzVar.zzN(list5);
                zzzVar.zzA(str2);
                zzzVar.zzF(this.zzk);
                zzab zzabVarZzag16 = zzzVar.zzag();
                zzadt zzadtVarZzw16 = zzacqVar.zzw(this.zzc, i4);
                this.zzW = zzadtVarZzw16;
                zzadtVarZzw16.zzm(zzabVarZzag16);
                return;
            case 18:
                this.zzT = new zzadu();
                str5 = MimeTypes.AUDIO_TRUEHD;
                list2 = null;
                str2 = null;
                i2 = -1;
                list4 = list2;
                iZzn = -1;
                list5 = list4;
                if (this.zzN != null) {
                    str2 = zzacjVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z17 = this.zzV;
                if (true != this.zzU) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i116 = (z17 ? 1 : 0) | i3;
                zzzVar = new zzz();
                if (zzbb.zzg(str3)) {
                    if (zzbb.zzi(str3)) {
                        if (this.zzq == 0) {
                            i7 = this.zzo;
                            iIntValue = -1;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzo = i7;
                            i8 = this.zzp;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzp = i8;
                        } else {
                            iIntValue = -1;
                        }
                        i5 = this.zzo;
                        if (i5 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder17 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder17.put((byte) 0);
                                byteBufferOrder17.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder17.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder17.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder17.putShort((short) this.zzB);
                                byteBufferOrder17.putShort((short) this.zzC);
                            }
                            zzi zziVar17 = new zzi();
                            zziVar17.zzc(this.zzy);
                            zziVar17.zzb(this.zzA);
                            zziVar17.zzd(this.zzz);
                            zziVar17.zze(bArr);
                            zziVar17.zzf(this.zzn);
                            zziVar17.zza(this.zzn);
                            zzkVarZzg = zziVar17.zzg();
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzahm.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzzVar.zzaf(this.zzl);
                        zzzVar.zzK(this.zzm);
                        zzzVar.zzW(f);
                        zzzVar.zzZ(i9);
                        zzzVar.zzX(this.zzv);
                        zzzVar.zzad(this.zzw);
                        zzzVar.zzB(zzkVarZzg);
                        i4 = 2;
                    } else {
                        if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        }
                        i4 = 3;
                    }
                    break;
                } else {
                    zzzVar.zzz(this.zzO);
                    zzzVar.zzab(this.zzQ);
                    zzzVar.zzU(iZzn);
                    i4 = 1;
                }
                if (this.zza != null) {
                    zzzVar.zzO(this.zza);
                }
                zzzVar.zzL(i);
                zzzVar.zzaa(str3);
                zzzVar.zzR(i2);
                zzzVar.zzQ(this.zzZ);
                zzzVar.zzac(i116);
                zzzVar.zzN(list5);
                zzzVar.zzA(str2);
                zzzVar.zzF(this.zzk);
                zzab zzabVarZzag17 = zzzVar.zzag();
                zzadt zzadtVarZzw17 = zzacqVar.zzw(this.zzc, i4);
                this.zzW = zzadtVarZzw17;
                zzadtVarZzw17.zzm(zzabVarZzag17);
                return;
            case 19:
            case 20:
                str5 = MimeTypes.AUDIO_DTS;
                list2 = null;
                str2 = null;
                i2 = -1;
                list4 = list2;
                iZzn = -1;
                list5 = list4;
                if (this.zzN != null) {
                    str2 = zzacjVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z18 = this.zzV;
                if (true != this.zzU) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i117 = (z18 ? 1 : 0) | i3;
                zzzVar = new zzz();
                if (zzbb.zzg(str3)) {
                    if (zzbb.zzi(str3)) {
                        if (this.zzq == 0) {
                            i7 = this.zzo;
                            iIntValue = -1;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzo = i7;
                            i8 = this.zzp;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzp = i8;
                        } else {
                            iIntValue = -1;
                        }
                        i5 = this.zzo;
                        if (i5 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder18 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder18.put((byte) 0);
                                byteBufferOrder18.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder18.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder18.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder18.putShort((short) this.zzB);
                                byteBufferOrder18.putShort((short) this.zzC);
                            }
                            zzi zziVar18 = new zzi();
                            zziVar18.zzc(this.zzy);
                            zziVar18.zzb(this.zzA);
                            zziVar18.zzd(this.zzz);
                            zziVar18.zze(bArr);
                            zziVar18.zzf(this.zzn);
                            zziVar18.zza(this.zzn);
                            zzkVarZzg = zziVar18.zzg();
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzahm.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzzVar.zzaf(this.zzl);
                        zzzVar.zzK(this.zzm);
                        zzzVar.zzW(f);
                        zzzVar.zzZ(i9);
                        zzzVar.zzX(this.zzv);
                        zzzVar.zzad(this.zzw);
                        zzzVar.zzB(zzkVarZzg);
                        i4 = 2;
                    } else {
                        if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        }
                        i4 = 3;
                    }
                    break;
                } else {
                    zzzVar.zzz(this.zzO);
                    zzzVar.zzab(this.zzQ);
                    zzzVar.zzU(iZzn);
                    i4 = 1;
                }
                if (this.zza != null) {
                    zzzVar.zzO(this.zza);
                }
                zzzVar.zzL(i);
                zzzVar.zzaa(str3);
                zzzVar.zzR(i2);
                zzzVar.zzQ(this.zzZ);
                zzzVar.zzac(i117);
                zzzVar.zzN(list5);
                zzzVar.zzA(str2);
                zzzVar.zzF(this.zzk);
                zzab zzabVarZzag18 = zzzVar.zzag();
                zzadt zzadtVarZzw18 = zzacqVar.zzw(this.zzc, i4);
                this.zzW = zzadtVarZzw18;
                zzadtVarZzw18.zzm(zzabVarZzag18);
                return;
            case 21:
                str5 = MimeTypes.AUDIO_DTS_HD;
                list2 = null;
                str2 = null;
                i2 = -1;
                list4 = list2;
                iZzn = -1;
                list5 = list4;
                if (this.zzN != null) {
                    str2 = zzacjVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z19 = this.zzV;
                if (true != this.zzU) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i118 = (z19 ? 1 : 0) | i3;
                zzzVar = new zzz();
                if (zzbb.zzg(str3)) {
                    if (zzbb.zzi(str3)) {
                        if (this.zzq == 0) {
                            i7 = this.zzo;
                            iIntValue = -1;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzo = i7;
                            i8 = this.zzp;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzp = i8;
                        } else {
                            iIntValue = -1;
                        }
                        i5 = this.zzo;
                        if (i5 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder19 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder19.put((byte) 0);
                                byteBufferOrder19.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder19.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder19.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder19.putShort((short) this.zzB);
                                byteBufferOrder19.putShort((short) this.zzC);
                            }
                            zzi zziVar19 = new zzi();
                            zziVar19.zzc(this.zzy);
                            zziVar19.zzb(this.zzA);
                            zziVar19.zzd(this.zzz);
                            zziVar19.zze(bArr);
                            zziVar19.zzf(this.zzn);
                            zziVar19.zza(this.zzn);
                            zzkVarZzg = zziVar19.zzg();
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzahm.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzzVar.zzaf(this.zzl);
                        zzzVar.zzK(this.zzm);
                        zzzVar.zzW(f);
                        zzzVar.zzZ(i9);
                        zzzVar.zzX(this.zzv);
                        zzzVar.zzad(this.zzw);
                        zzzVar.zzB(zzkVarZzg);
                        i4 = 2;
                    } else {
                        if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        }
                        i4 = 3;
                    }
                    break;
                } else {
                    zzzVar.zzz(this.zzO);
                    zzzVar.zzab(this.zzQ);
                    zzzVar.zzU(iZzn);
                    i4 = 1;
                }
                if (this.zza != null) {
                    zzzVar.zzO(this.zza);
                }
                zzzVar.zzL(i);
                zzzVar.zzaa(str3);
                zzzVar.zzR(i2);
                zzzVar.zzQ(this.zzZ);
                zzzVar.zzac(i118);
                zzzVar.zzN(list5);
                zzzVar.zzA(str2);
                zzzVar.zzF(this.zzk);
                zzab zzabVarZzag19 = zzzVar.zzag();
                zzadt zzadtVarZzw19 = zzacqVar.zzw(this.zzc, i4);
                this.zzW = zzadtVarZzw19;
                zzadtVarZzw19.zzm(zzabVarZzag19);
                return;
            case 22:
                List listSingletonList3 = Collections.singletonList(zzi(str4));
                str5 = MimeTypes.AUDIO_FLAC;
                list6 = listSingletonList3;
                str2 = null;
                list2 = list6;
                i2 = -1;
                list4 = list2;
                iZzn = -1;
                list5 = list4;
                if (this.zzN != null) {
                    str2 = zzacjVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z110 = this.zzV;
                if (true != this.zzU) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i119 = (z110 ? 1 : 0) | i3;
                zzzVar = new zzz();
                if (zzbb.zzg(str3)) {
                    if (zzbb.zzi(str3)) {
                        if (this.zzq == 0) {
                            i7 = this.zzo;
                            iIntValue = -1;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzo = i7;
                            i8 = this.zzp;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzp = i8;
                        } else {
                            iIntValue = -1;
                        }
                        i5 = this.zzo;
                        if (i5 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder110 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder110.put((byte) 0);
                                byteBufferOrder110.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder110.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder110.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder110.putShort((short) this.zzB);
                                byteBufferOrder110.putShort((short) this.zzC);
                            }
                            zzi zziVar110 = new zzi();
                            zziVar110.zzc(this.zzy);
                            zziVar110.zzb(this.zzA);
                            zziVar110.zzd(this.zzz);
                            zziVar110.zze(bArr);
                            zziVar110.zzf(this.zzn);
                            zziVar110.zza(this.zzn);
                            zzkVarZzg = zziVar110.zzg();
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzahm.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzzVar.zzaf(this.zzl);
                        zzzVar.zzK(this.zzm);
                        zzzVar.zzW(f);
                        zzzVar.zzZ(i9);
                        zzzVar.zzX(this.zzv);
                        zzzVar.zzad(this.zzw);
                        zzzVar.zzB(zzkVarZzg);
                        i4 = 2;
                    } else {
                        if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        }
                        i4 = 3;
                    }
                    break;
                } else {
                    zzzVar.zzz(this.zzO);
                    zzzVar.zzab(this.zzQ);
                    zzzVar.zzU(iZzn);
                    i4 = 1;
                }
                if (this.zza != null) {
                    zzzVar.zzO(this.zza);
                }
                zzzVar.zzL(i);
                zzzVar.zzaa(str3);
                zzzVar.zzR(i2);
                zzzVar.zzQ(this.zzZ);
                zzzVar.zzac(i119);
                zzzVar.zzN(list5);
                zzzVar.zzA(str2);
                zzzVar.zzF(this.zzk);
                zzab zzabVarZzag110 = zzzVar.zzag();
                zzadt zzadtVarZzw110 = zzacqVar.zzw(this.zzc, i4);
                this.zzW = zzadtVarZzw110;
                zzadtVarZzw110.zzm(zzabVarZzag110);
                return;
            case 23:
                if (zzh(new zzdy(zzi(this.zzb)))) {
                    iZzn = zzei.zzn(this.zzP);
                    if (iZzn == 0) {
                        zzdo.zzf("MatroskaExtractor", "Unsupported PCM bit depth: " + this.zzP + ". Setting mimeType to audio/x-unknown");
                    } else {
                        list5 = null;
                        str2 = null;
                        i2 = -1;
                    }
                    if (this.zzN != null) {
                        str2 = zzacjVarZza.zza;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    boolean z111 = this.zzV;
                    if (true != this.zzU) {
                        i3 = 0;
                    } else {
                        i3 = 2;
                    }
                    int i1110 = (z111 ? 1 : 0) | i3;
                    zzzVar = new zzz();
                    if (zzbb.zzg(str3)) {
                        if (zzbb.zzi(str3)) {
                            if (this.zzq == 0) {
                                i7 = this.zzo;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.zzl;
                                }
                                this.zzo = i7;
                                i8 = this.zzp;
                                if (i8 == -1) {
                                    i8 = this.zzm;
                                }
                                this.zzp = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.zzo;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.zzx) {
                                if (this.zzD != -1.0f) {
                                    bArr = new byte[25];
                                    ByteBuffer byteBufferOrder111 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                    byteBufferOrder111.put((byte) 0);
                                    byteBufferOrder111.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                    byteBufferOrder111.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                    byteBufferOrder111.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                    byteBufferOrder111.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                    byteBufferOrder111.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                    byteBufferOrder111.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                    byteBufferOrder111.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                    byteBufferOrder111.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                    byteBufferOrder111.putShort((short) (this.zzL + 0.5f));
                                    byteBufferOrder111.putShort((short) (this.zzM + 0.5f));
                                    byteBufferOrder111.putShort((short) this.zzB);
                                    byteBufferOrder111.putShort((short) this.zzC);
                                }
                                zzi zziVar111 = new zzi();
                                zziVar111.zzc(this.zzy);
                                zziVar111.zzb(this.zzA);
                                zziVar111.zzd(this.zzz);
                                zziVar111.zze(bArr);
                                zziVar111.zzf(this.zzn);
                                zziVar111.zza(this.zzn);
                                zzkVarZzg = zziVar111.zzg();
                            }
                            if (this.zza != null) {
                                iIntValue = ((Integer) zzahm.zzf.get(this.zza)).intValue();
                            }
                            if (this.zzr == 0) {
                                i9 = iIntValue;
                            } else {
                                i9 = iIntValue;
                            }
                            zzzVar.zzaf(this.zzl);
                            zzzVar.zzK(this.zzm);
                            zzzVar.zzW(f);
                            zzzVar.zzZ(i9);
                            zzzVar.zzX(this.zzv);
                            zzzVar.zzad(this.zzw);
                            zzzVar.zzB(zzkVarZzg);
                            i4 = 2;
                        } else {
                            if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                            }
                            i4 = 3;
                        }
                        break;
                    } else {
                        zzzVar.zzz(this.zzO);
                        zzzVar.zzab(this.zzQ);
                        zzzVar.zzU(iZzn);
                        i4 = 1;
                    }
                    if (this.zza != null) {
                        zzzVar.zzO(this.zza);
                    }
                    zzzVar.zzL(i);
                    zzzVar.zzaa(str3);
                    zzzVar.zzR(i2);
                    zzzVar.zzQ(this.zzZ);
                    zzzVar.zzac(i1110);
                    zzzVar.zzN(list5);
                    zzzVar.zzA(str2);
                    zzzVar.zzF(this.zzk);
                    zzab zzabVarZzag111 = zzzVar.zzag();
                    zzadt zzadtVarZzw111 = zzacqVar.zzw(this.zzc, i4);
                    this.zzW = zzadtVarZzw111;
                    zzadtVarZzw111.zzm(zzabVarZzag111);
                    return;
                }
                zzdo.zzf("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                list2 = null;
                str2 = null;
                str5 = MimeTypes.AUDIO_UNKNOWN;
                i2 = -1;
                list4 = list2;
                iZzn = -1;
                list5 = list4;
                if (this.zzN != null) {
                    str2 = zzacjVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z112 = this.zzV;
                if (true != this.zzU) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i1111 = (z112 ? 1 : 0) | i3;
                zzzVar = new zzz();
                if (zzbb.zzg(str3)) {
                    if (zzbb.zzi(str3)) {
                        if (this.zzq == 0) {
                            i7 = this.zzo;
                            iIntValue = -1;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzo = i7;
                            i8 = this.zzp;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzp = i8;
                        } else {
                            iIntValue = -1;
                        }
                        i5 = this.zzo;
                        if (i5 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder112 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder112.put((byte) 0);
                                byteBufferOrder112.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder112.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder112.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder112.putShort((short) this.zzB);
                                byteBufferOrder112.putShort((short) this.zzC);
                            }
                            zzi zziVar112 = new zzi();
                            zziVar112.zzc(this.zzy);
                            zziVar112.zzb(this.zzA);
                            zziVar112.zzd(this.zzz);
                            zziVar112.zze(bArr);
                            zziVar112.zzf(this.zzn);
                            zziVar112.zza(this.zzn);
                            zzkVarZzg = zziVar112.zzg();
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzahm.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzzVar.zzaf(this.zzl);
                        zzzVar.zzK(this.zzm);
                        zzzVar.zzW(f);
                        zzzVar.zzZ(i9);
                        zzzVar.zzX(this.zzv);
                        zzzVar.zzad(this.zzw);
                        zzzVar.zzB(zzkVarZzg);
                        i4 = 2;
                    } else {
                        if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        }
                        i4 = 3;
                    }
                    break;
                } else {
                    zzzVar.zzz(this.zzO);
                    zzzVar.zzab(this.zzQ);
                    zzzVar.zzU(iZzn);
                    i4 = 1;
                }
                if (this.zza != null) {
                    zzzVar.zzO(this.zza);
                }
                zzzVar.zzL(i);
                zzzVar.zzaa(str3);
                zzzVar.zzR(i2);
                zzzVar.zzQ(this.zzZ);
                zzzVar.zzac(i1111);
                zzzVar.zzN(list5);
                zzzVar.zzA(str2);
                zzzVar.zzF(this.zzk);
                zzab zzabVarZzag112 = zzzVar.zzag();
                zzadt zzadtVarZzw112 = zzacqVar.zzw(this.zzc, i4);
                this.zzW = zzadtVarZzw112;
                zzadtVarZzw112.zzm(zzabVarZzag112);
                return;
            case 24:
                iZzn = zzei.zzn(this.zzP);
                if (iZzn == 0) {
                    zzdo.zzf("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + this.zzP + ". Setting mimeType to audio/x-unknown");
                    list2 = null;
                    str2 = null;
                    str5 = MimeTypes.AUDIO_UNKNOWN;
                    i2 = -1;
                    list4 = list2;
                    iZzn = -1;
                    list5 = list4;
                } else {
                    list5 = null;
                    str2 = null;
                    i2 = -1;
                }
                if (this.zzN != null) {
                    str2 = zzacjVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z113 = this.zzV;
                if (true != this.zzU) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i1112 = (z113 ? 1 : 0) | i3;
                zzzVar = new zzz();
                if (zzbb.zzg(str3)) {
                    if (zzbb.zzi(str3)) {
                        if (this.zzq == 0) {
                            i7 = this.zzo;
                            iIntValue = -1;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzo = i7;
                            i8 = this.zzp;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzp = i8;
                        } else {
                            iIntValue = -1;
                        }
                        i5 = this.zzo;
                        if (i5 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder113 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder113.put((byte) 0);
                                byteBufferOrder113.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder113.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder113.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder113.putShort((short) this.zzB);
                                byteBufferOrder113.putShort((short) this.zzC);
                            }
                            zzi zziVar113 = new zzi();
                            zziVar113.zzc(this.zzy);
                            zziVar113.zzb(this.zzA);
                            zziVar113.zzd(this.zzz);
                            zziVar113.zze(bArr);
                            zziVar113.zzf(this.zzn);
                            zziVar113.zza(this.zzn);
                            zzkVarZzg = zziVar113.zzg();
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzahm.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzzVar.zzaf(this.zzl);
                        zzzVar.zzK(this.zzm);
                        zzzVar.zzW(f);
                        zzzVar.zzZ(i9);
                        zzzVar.zzX(this.zzv);
                        zzzVar.zzad(this.zzw);
                        zzzVar.zzB(zzkVarZzg);
                        i4 = 2;
                    } else {
                        if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        }
                        i4 = 3;
                    }
                    break;
                } else {
                    zzzVar.zzz(this.zzO);
                    zzzVar.zzab(this.zzQ);
                    zzzVar.zzU(iZzn);
                    i4 = 1;
                }
                if (this.zza != null) {
                    zzzVar.zzO(this.zza);
                }
                zzzVar.zzL(i);
                zzzVar.zzaa(str3);
                zzzVar.zzR(i2);
                zzzVar.zzQ(this.zzZ);
                zzzVar.zzac(i1112);
                zzzVar.zzN(list5);
                zzzVar.zzA(str2);
                zzzVar.zzF(this.zzk);
                zzab zzabVarZzag113 = zzzVar.zzag();
                zzadt zzadtVarZzw113 = zzacqVar.zzw(this.zzc, i4);
                this.zzW = zzadtVarZzw113;
                zzadtVarZzw113.zzm(zzabVarZzag113);
                return;
            case 25:
                int i20 = this.zzP;
                if (i20 == 8) {
                    list5 = null;
                    str2 = null;
                    i2 = -1;
                    iZzn = 3;
                } else {
                    if (i20 == 16) {
                        iZzn = 268435456;
                    } else if (i20 == 24) {
                        iZzn = 1342177280;
                    } else if (i20 == 32) {
                        iZzn = 1610612736;
                    } else {
                        zzdo.zzf("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + i20 + ". Setting mimeType to audio/x-unknown");
                        list2 = null;
                        str2 = null;
                        str5 = MimeTypes.AUDIO_UNKNOWN;
                        i2 = -1;
                        list4 = list2;
                        iZzn = -1;
                        list5 = list4;
                    }
                    list5 = null;
                    str2 = null;
                    i2 = -1;
                }
                if (this.zzN != null) {
                    str2 = zzacjVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z114 = this.zzV;
                if (true != this.zzU) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i1113 = (z114 ? 1 : 0) | i3;
                zzzVar = new zzz();
                if (zzbb.zzg(str3)) {
                    if (zzbb.zzi(str3)) {
                        if (this.zzq == 0) {
                            i7 = this.zzo;
                            iIntValue = -1;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzo = i7;
                            i8 = this.zzp;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzp = i8;
                        } else {
                            iIntValue = -1;
                        }
                        i5 = this.zzo;
                        if (i5 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder114 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder114.put((byte) 0);
                                byteBufferOrder114.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder114.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder114.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder114.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder114.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder114.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder114.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder114.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder114.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder114.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder114.putShort((short) this.zzB);
                                byteBufferOrder114.putShort((short) this.zzC);
                            }
                            zzi zziVar114 = new zzi();
                            zziVar114.zzc(this.zzy);
                            zziVar114.zzb(this.zzA);
                            zziVar114.zzd(this.zzz);
                            zziVar114.zze(bArr);
                            zziVar114.zzf(this.zzn);
                            zziVar114.zza(this.zzn);
                            zzkVarZzg = zziVar114.zzg();
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzahm.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzzVar.zzaf(this.zzl);
                        zzzVar.zzK(this.zzm);
                        zzzVar.zzW(f);
                        zzzVar.zzZ(i9);
                        zzzVar.zzX(this.zzv);
                        zzzVar.zzad(this.zzw);
                        zzzVar.zzB(zzkVarZzg);
                        i4 = 2;
                    } else {
                        if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        }
                        i4 = 3;
                    }
                    break;
                } else {
                    zzzVar.zzz(this.zzO);
                    zzzVar.zzab(this.zzQ);
                    zzzVar.zzU(iZzn);
                    i4 = 1;
                }
                if (this.zza != null) {
                    zzzVar.zzO(this.zza);
                }
                zzzVar.zzL(i);
                zzzVar.zzaa(str3);
                zzzVar.zzR(i2);
                zzzVar.zzQ(this.zzZ);
                zzzVar.zzac(i1113);
                zzzVar.zzN(list5);
                zzzVar.zzA(str2);
                zzzVar.zzF(this.zzk);
                zzab zzabVarZzag114 = zzzVar.zzag();
                zzadt zzadtVarZzw114 = zzacqVar.zzw(this.zzc, i4);
                this.zzW = zzadtVarZzw114;
                zzadtVarZzw114.zzm(zzabVarZzag114);
                return;
            case 26:
                int i21 = this.zzP;
                if (i21 == 32) {
                    list5 = null;
                    str2 = null;
                    i2 = -1;
                } else {
                    zzdo.zzf("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + i21 + ". Setting mimeType to audio/x-unknown");
                    list2 = null;
                    str2 = null;
                    str5 = MimeTypes.AUDIO_UNKNOWN;
                    i2 = -1;
                    list4 = list2;
                    iZzn = -1;
                    list5 = list4;
                }
                if (this.zzN != null) {
                    str2 = zzacjVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z115 = this.zzV;
                if (true != this.zzU) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i1114 = (z115 ? 1 : 0) | i3;
                zzzVar = new zzz();
                if (zzbb.zzg(str3)) {
                    if (zzbb.zzi(str3)) {
                        if (this.zzq == 0) {
                            i7 = this.zzo;
                            iIntValue = -1;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzo = i7;
                            i8 = this.zzp;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzp = i8;
                        } else {
                            iIntValue = -1;
                        }
                        i5 = this.zzo;
                        if (i5 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder115 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder115.put((byte) 0);
                                byteBufferOrder115.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder115.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder115.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder115.putShort((short) this.zzB);
                                byteBufferOrder115.putShort((short) this.zzC);
                            }
                            zzi zziVar115 = new zzi();
                            zziVar115.zzc(this.zzy);
                            zziVar115.zzb(this.zzA);
                            zziVar115.zzd(this.zzz);
                            zziVar115.zze(bArr);
                            zziVar115.zzf(this.zzn);
                            zziVar115.zza(this.zzn);
                            zzkVarZzg = zziVar115.zzg();
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzahm.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzzVar.zzaf(this.zzl);
                        zzzVar.zzK(this.zzm);
                        zzzVar.zzW(f);
                        zzzVar.zzZ(i9);
                        zzzVar.zzX(this.zzv);
                        zzzVar.zzad(this.zzw);
                        zzzVar.zzB(zzkVarZzg);
                        i4 = 2;
                    } else {
                        if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        }
                        i4 = 3;
                    }
                    break;
                } else {
                    zzzVar.zzz(this.zzO);
                    zzzVar.zzab(this.zzQ);
                    zzzVar.zzU(iZzn);
                    i4 = 1;
                }
                if (this.zza != null) {
                    zzzVar.zzO(this.zza);
                }
                zzzVar.zzL(i);
                zzzVar.zzaa(str3);
                zzzVar.zzR(i2);
                zzzVar.zzQ(this.zzZ);
                zzzVar.zzac(i1114);
                zzzVar.zzN(list5);
                zzzVar.zzA(str2);
                zzzVar.zzF(this.zzk);
                zzab zzabVarZzag115 = zzzVar.zzag();
                zzadt zzadtVarZzw115 = zzacqVar.zzw(this.zzc, i4);
                this.zzW = zzadtVarZzw115;
                zzadtVarZzw115.zzm(zzabVarZzag115);
                return;
            case 27:
                str5 = MimeTypes.APPLICATION_SUBRIP;
                list2 = null;
                str2 = null;
                i2 = -1;
                list4 = list2;
                iZzn = -1;
                list5 = list4;
                if (this.zzN != null) {
                    str2 = zzacjVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z116 = this.zzV;
                if (true != this.zzU) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i1115 = (z116 ? 1 : 0) | i3;
                zzzVar = new zzz();
                if (zzbb.zzg(str3)) {
                    if (zzbb.zzi(str3)) {
                        if (this.zzq == 0) {
                            i7 = this.zzo;
                            iIntValue = -1;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzo = i7;
                            i8 = this.zzp;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzp = i8;
                        } else {
                            iIntValue = -1;
                        }
                        i5 = this.zzo;
                        if (i5 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder116 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder116.put((byte) 0);
                                byteBufferOrder116.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder116.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder116.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder116.putShort((short) this.zzB);
                                byteBufferOrder116.putShort((short) this.zzC);
                            }
                            zzi zziVar116 = new zzi();
                            zziVar116.zzc(this.zzy);
                            zziVar116.zzb(this.zzA);
                            zziVar116.zzd(this.zzz);
                            zziVar116.zze(bArr);
                            zziVar116.zzf(this.zzn);
                            zziVar116.zza(this.zzn);
                            zzkVarZzg = zziVar116.zzg();
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzahm.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzzVar.zzaf(this.zzl);
                        zzzVar.zzK(this.zzm);
                        zzzVar.zzW(f);
                        zzzVar.zzZ(i9);
                        zzzVar.zzX(this.zzv);
                        zzzVar.zzad(this.zzw);
                        zzzVar.zzB(zzkVarZzg);
                        i4 = 2;
                    } else {
                        if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        }
                        i4 = 3;
                    }
                    break;
                } else {
                    zzzVar.zzz(this.zzO);
                    zzzVar.zzab(this.zzQ);
                    zzzVar.zzU(iZzn);
                    i4 = 1;
                }
                if (this.zza != null) {
                    zzzVar.zzO(this.zza);
                }
                zzzVar.zzL(i);
                zzzVar.zzaa(str3);
                zzzVar.zzR(i2);
                zzzVar.zzQ(this.zzZ);
                zzzVar.zzac(i1115);
                zzzVar.zzN(list5);
                zzzVar.zzA(str2);
                zzzVar.zzF(this.zzk);
                zzab zzabVarZzag116 = zzzVar.zzag();
                zzadt zzadtVarZzw116 = zzacqVar.zzw(this.zzc, i4);
                this.zzW = zzadtVarZzw116;
                zzadtVarZzw116.zzm(zzabVarZzag116);
                return;
            case 28:
                zzfxn zzfxnVarZzp = zzfxn.zzp(zzahm.zzb, zzi(this.zzb));
                str5 = MimeTypes.TEXT_SSA;
                list6 = zzfxnVarZzp;
                str2 = null;
                list2 = list6;
                i2 = -1;
                list4 = list2;
                iZzn = -1;
                list5 = list4;
                if (this.zzN != null) {
                    str2 = zzacjVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z117 = this.zzV;
                if (true != this.zzU) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i1116 = (z117 ? 1 : 0) | i3;
                zzzVar = new zzz();
                if (zzbb.zzg(str3)) {
                    if (zzbb.zzi(str3)) {
                        if (this.zzq == 0) {
                            i7 = this.zzo;
                            iIntValue = -1;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzo = i7;
                            i8 = this.zzp;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzp = i8;
                        } else {
                            iIntValue = -1;
                        }
                        i5 = this.zzo;
                        if (i5 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder117 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder117.put((byte) 0);
                                byteBufferOrder117.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder117.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder117.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder117.putShort((short) this.zzB);
                                byteBufferOrder117.putShort((short) this.zzC);
                            }
                            zzi zziVar117 = new zzi();
                            zziVar117.zzc(this.zzy);
                            zziVar117.zzb(this.zzA);
                            zziVar117.zzd(this.zzz);
                            zziVar117.zze(bArr);
                            zziVar117.zzf(this.zzn);
                            zziVar117.zza(this.zzn);
                            zzkVarZzg = zziVar117.zzg();
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzahm.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzzVar.zzaf(this.zzl);
                        zzzVar.zzK(this.zzm);
                        zzzVar.zzW(f);
                        zzzVar.zzZ(i9);
                        zzzVar.zzX(this.zzv);
                        zzzVar.zzad(this.zzw);
                        zzzVar.zzB(zzkVarZzg);
                        i4 = 2;
                    } else {
                        if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        }
                        i4 = 3;
                    }
                    break;
                } else {
                    zzzVar.zzz(this.zzO);
                    zzzVar.zzab(this.zzQ);
                    zzzVar.zzU(iZzn);
                    i4 = 1;
                }
                if (this.zza != null) {
                    zzzVar.zzO(this.zza);
                }
                zzzVar.zzL(i);
                zzzVar.zzaa(str3);
                zzzVar.zzR(i2);
                zzzVar.zzQ(this.zzZ);
                zzzVar.zzac(i1116);
                zzzVar.zzN(list5);
                zzzVar.zzA(str2);
                zzzVar.zzF(this.zzk);
                zzab zzabVarZzag117 = zzzVar.zzag();
                zzadt zzadtVarZzw117 = zzacqVar.zzw(this.zzc, i4);
                this.zzW = zzadtVarZzw117;
                zzadtVarZzw117.zzm(zzabVarZzag117);
                return;
            case 29:
                str5 = MimeTypes.TEXT_VTT;
                list2 = null;
                str2 = null;
                i2 = -1;
                list4 = list2;
                iZzn = -1;
                list5 = list4;
                if (this.zzN != null) {
                    str2 = zzacjVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z118 = this.zzV;
                if (true != this.zzU) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i1117 = (z118 ? 1 : 0) | i3;
                zzzVar = new zzz();
                if (zzbb.zzg(str3)) {
                    if (zzbb.zzi(str3)) {
                        if (this.zzq == 0) {
                            i7 = this.zzo;
                            iIntValue = -1;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzo = i7;
                            i8 = this.zzp;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzp = i8;
                        } else {
                            iIntValue = -1;
                        }
                        i5 = this.zzo;
                        if (i5 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder118 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder118.put((byte) 0);
                                byteBufferOrder118.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder118.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder118.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder118.putShort((short) this.zzB);
                                byteBufferOrder118.putShort((short) this.zzC);
                            }
                            zzi zziVar118 = new zzi();
                            zziVar118.zzc(this.zzy);
                            zziVar118.zzb(this.zzA);
                            zziVar118.zzd(this.zzz);
                            zziVar118.zze(bArr);
                            zziVar118.zzf(this.zzn);
                            zziVar118.zza(this.zzn);
                            zzkVarZzg = zziVar118.zzg();
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzahm.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzzVar.zzaf(this.zzl);
                        zzzVar.zzK(this.zzm);
                        zzzVar.zzW(f);
                        zzzVar.zzZ(i9);
                        zzzVar.zzX(this.zzv);
                        zzzVar.zzad(this.zzw);
                        zzzVar.zzB(zzkVarZzg);
                        i4 = 2;
                    } else {
                        if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        }
                        i4 = 3;
                    }
                    break;
                } else {
                    zzzVar.zzz(this.zzO);
                    zzzVar.zzab(this.zzQ);
                    zzzVar.zzU(iZzn);
                    i4 = 1;
                }
                if (this.zza != null) {
                    zzzVar.zzO(this.zza);
                }
                zzzVar.zzL(i);
                zzzVar.zzaa(str3);
                zzzVar.zzR(i2);
                zzzVar.zzQ(this.zzZ);
                zzzVar.zzac(i1117);
                zzzVar.zzN(list5);
                zzzVar.zzA(str2);
                zzzVar.zzF(this.zzk);
                zzab zzabVarZzag118 = zzzVar.zzag();
                zzadt zzadtVarZzw118 = zzacqVar.zzw(this.zzc, i4);
                this.zzW = zzadtVarZzw118;
                zzadtVarZzw118.zzm(zzabVarZzag118);
                return;
            case 30:
                zzfxn zzfxnVarZzo = zzfxn.zzo(zzi(str4));
                str2 = null;
                str5 = MimeTypes.APPLICATION_VOBSUB;
                list2 = zzfxnVarZzo;
                i2 = -1;
                list4 = list2;
                iZzn = -1;
                list5 = list4;
                if (this.zzN != null) {
                    str2 = zzacjVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z119 = this.zzV;
                if (true != this.zzU) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i1118 = (z119 ? 1 : 0) | i3;
                zzzVar = new zzz();
                if (zzbb.zzg(str3)) {
                    if (zzbb.zzi(str3)) {
                        if (this.zzq == 0) {
                            i7 = this.zzo;
                            iIntValue = -1;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzo = i7;
                            i8 = this.zzp;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzp = i8;
                        } else {
                            iIntValue = -1;
                        }
                        i5 = this.zzo;
                        if (i5 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder119 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder119.put((byte) 0);
                                byteBufferOrder119.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder119.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder119.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder119.putShort((short) this.zzB);
                                byteBufferOrder119.putShort((short) this.zzC);
                            }
                            zzi zziVar119 = new zzi();
                            zziVar119.zzc(this.zzy);
                            zziVar119.zzb(this.zzA);
                            zziVar119.zzd(this.zzz);
                            zziVar119.zze(bArr);
                            zziVar119.zzf(this.zzn);
                            zziVar119.zza(this.zzn);
                            zzkVarZzg = zziVar119.zzg();
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzahm.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzzVar.zzaf(this.zzl);
                        zzzVar.zzK(this.zzm);
                        zzzVar.zzW(f);
                        zzzVar.zzZ(i9);
                        zzzVar.zzX(this.zzv);
                        zzzVar.zzad(this.zzw);
                        zzzVar.zzB(zzkVarZzg);
                        i4 = 2;
                    } else {
                        if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        }
                        i4 = 3;
                    }
                    break;
                } else {
                    zzzVar.zzz(this.zzO);
                    zzzVar.zzab(this.zzQ);
                    zzzVar.zzU(iZzn);
                    i4 = 1;
                }
                if (this.zza != null) {
                    zzzVar.zzO(this.zza);
                }
                zzzVar.zzL(i);
                zzzVar.zzaa(str3);
                zzzVar.zzR(i2);
                zzzVar.zzQ(this.zzZ);
                zzzVar.zzac(i1118);
                zzzVar.zzN(list5);
                zzzVar.zzA(str2);
                zzzVar.zzF(this.zzk);
                zzab zzabVarZzag119 = zzzVar.zzag();
                zzadt zzadtVarZzw119 = zzacqVar.zzw(this.zzc, i4);
                this.zzW = zzadtVarZzw119;
                zzadtVarZzw119.zzm(zzabVarZzag119);
                return;
            case 31:
                list2 = null;
                str2 = null;
                str5 = MimeTypes.APPLICATION_PGS;
                i2 = -1;
                list4 = list2;
                iZzn = -1;
                list5 = list4;
                if (this.zzN != null) {
                    str2 = zzacjVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z1110 = this.zzV;
                if (true != this.zzU) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i1119 = (z1110 ? 1 : 0) | i3;
                zzzVar = new zzz();
                if (zzbb.zzg(str3)) {
                    if (zzbb.zzi(str3)) {
                        if (this.zzq == 0) {
                            i7 = this.zzo;
                            iIntValue = -1;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzo = i7;
                            i8 = this.zzp;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzp = i8;
                        } else {
                            iIntValue = -1;
                        }
                        i5 = this.zzo;
                        if (i5 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder1110 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder1110.put((byte) 0);
                                byteBufferOrder1110.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder1110.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder1110.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder1110.putShort((short) this.zzB);
                                byteBufferOrder1110.putShort((short) this.zzC);
                            }
                            zzi zziVar1110 = new zzi();
                            zziVar1110.zzc(this.zzy);
                            zziVar1110.zzb(this.zzA);
                            zziVar1110.zzd(this.zzz);
                            zziVar1110.zze(bArr);
                            zziVar1110.zzf(this.zzn);
                            zziVar1110.zza(this.zzn);
                            zzkVarZzg = zziVar1110.zzg();
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzahm.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzzVar.zzaf(this.zzl);
                        zzzVar.zzK(this.zzm);
                        zzzVar.zzW(f);
                        zzzVar.zzZ(i9);
                        zzzVar.zzX(this.zzv);
                        zzzVar.zzad(this.zzw);
                        zzzVar.zzB(zzkVarZzg);
                        i4 = 2;
                    } else {
                        if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        }
                        i4 = 3;
                    }
                    break;
                } else {
                    zzzVar.zzz(this.zzO);
                    zzzVar.zzab(this.zzQ);
                    zzzVar.zzU(iZzn);
                    i4 = 1;
                }
                if (this.zza != null) {
                    zzzVar.zzO(this.zza);
                }
                zzzVar.zzL(i);
                zzzVar.zzaa(str3);
                zzzVar.zzR(i2);
                zzzVar.zzQ(this.zzZ);
                zzzVar.zzac(i1119);
                zzzVar.zzN(list5);
                zzzVar.zzA(str2);
                zzzVar.zzF(this.zzk);
                zzab zzabVarZzag1110 = zzzVar.zzag();
                zzadt zzadtVarZzw1110 = zzacqVar.zzw(this.zzc, i4);
                this.zzW = zzadtVarZzw1110;
                zzadtVarZzw1110.zzm(zzabVarZzag1110);
                return;
            case 32:
                byte[] bArr3 = new byte[4];
                System.arraycopy(zzi(str4), 0, bArr3, 0, 4);
                zzfxn zzfxnVarZzo2 = zzfxn.zzo(bArr3);
                str5 = MimeTypes.APPLICATION_DVBSUBS;
                list6 = zzfxnVarZzo2;
                str2 = null;
                list2 = list6;
                i2 = -1;
                list4 = list2;
                iZzn = -1;
                list5 = list4;
                if (this.zzN != null) {
                    str2 = zzacjVarZza.zza;
                    str5 = "video/dolby-vision";
                }
                str3 = str5;
                boolean z1111 = this.zzV;
                if (true != this.zzU) {
                    i3 = 0;
                } else {
                    i3 = 2;
                }
                int i11110 = (z1111 ? 1 : 0) | i3;
                zzzVar = new zzz();
                if (zzbb.zzg(str3)) {
                    if (zzbb.zzi(str3)) {
                        if (this.zzq == 0) {
                            i7 = this.zzo;
                            iIntValue = -1;
                            if (i7 == -1) {
                                i7 = this.zzl;
                            }
                            this.zzo = i7;
                            i8 = this.zzp;
                            if (i8 == -1) {
                                i8 = this.zzm;
                            }
                            this.zzp = i8;
                        } else {
                            iIntValue = -1;
                        }
                        i5 = this.zzo;
                        if (i5 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.zzx) {
                            if (this.zzD != -1.0f) {
                                bArr = new byte[25];
                                ByteBuffer byteBufferOrder1111 = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                byteBufferOrder1111.put((byte) 0);
                                byteBufferOrder1111.putShort((short) ((this.zzD * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.zzE * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.zzF * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.zzG * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.zzH * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.zzI * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.zzJ * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) ((this.zzK * 50000.0f) + 0.5f));
                                byteBufferOrder1111.putShort((short) (this.zzL + 0.5f));
                                byteBufferOrder1111.putShort((short) (this.zzM + 0.5f));
                                byteBufferOrder1111.putShort((short) this.zzB);
                                byteBufferOrder1111.putShort((short) this.zzC);
                            }
                            zzi zziVar1111 = new zzi();
                            zziVar1111.zzc(this.zzy);
                            zziVar1111.zzb(this.zzA);
                            zziVar1111.zzd(this.zzz);
                            zziVar1111.zze(bArr);
                            zziVar1111.zzf(this.zzn);
                            zziVar1111.zza(this.zzn);
                            zzkVarZzg = zziVar1111.zzg();
                        }
                        if (this.zza != null) {
                            iIntValue = ((Integer) zzahm.zzf.get(this.zza)).intValue();
                        }
                        if (this.zzr == 0) {
                            i9 = iIntValue;
                        } else {
                            i9 = iIntValue;
                        }
                        zzzVar.zzaf(this.zzl);
                        zzzVar.zzK(this.zzm);
                        zzzVar.zzW(f);
                        zzzVar.zzZ(i9);
                        zzzVar.zzX(this.zzv);
                        zzzVar.zzad(this.zzw);
                        zzzVar.zzB(zzkVarZzg);
                        i4 = 2;
                    } else {
                        if (MimeTypes.APPLICATION_SUBRIP.equals(str3)) {
                        }
                        i4 = 3;
                    }
                    break;
                } else {
                    zzzVar.zzz(this.zzO);
                    zzzVar.zzab(this.zzQ);
                    zzzVar.zzU(iZzn);
                    i4 = 1;
                }
                if (this.zza != null) {
                    zzzVar.zzO(this.zza);
                }
                zzzVar.zzL(i);
                zzzVar.zzaa(str3);
                zzzVar.zzR(i2);
                zzzVar.zzQ(this.zzZ);
                zzzVar.zzac(i11110);
                zzzVar.zzN(list5);
                zzzVar.zzA(str2);
                zzzVar.zzF(this.zzk);
                zzab zzabVarZzag1111 = zzzVar.zzag();
                zzadt zzadtVarZzw1111 = zzacqVar.zzw(this.zzc, i4);
                this.zzW = zzadtVarZzw1111;
                zzadtVarZzw1111.zzm(zzabVarZzag1111);
                return;
            default:
                throw zzbc.zza("Unrecognized codec identifier.", null);
        }
    }
}
