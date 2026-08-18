package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: loaded from: classes3.dex */
final class zzais {
    /* JADX WARN: Code duplicated, block: B:130:0x0264 A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:9:0x0030, B:11:0x003b, B:14:0x004a, B:17:0x0056, B:20:0x0063, B:23:0x0072, B:26:0x007f, B:29:0x008d, B:31:0x0097, B:39:0x00b2, B:40:0x00c3, B:41:0x00d6, B:44:0x00e2, B:47:0x00ef, B:50:0x00fc, B:53:0x0109, B:56:0x0116, B:59:0x0123, B:62:0x0130, B:65:0x013d, B:68:0x014d, B:71:0x015d, B:75:0x0171, B:77:0x0177, B:79:0x018b, B:80:0x0192, B:82:0x0199, B:87:0x01a4, B:92:0x01b0, B:130:0x0264, B:93:0x01c5, B:95:0x01cc, B:97:0x01d6, B:98:0x01ea, B:111:0x0216, B:114:0x0223, B:117:0x022f, B:120:0x023b, B:123:0x0247, B:126:0x0253, B:129:0x025d, B:131:0x0278, B:132:0x027f), top: B:137:0x0022 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:130:0x0264, please report this as an issue */
    @Nullable
    public static zzax zza(zzdy zzdyVar) {
        String str;
        int iZzg = zzdyVar.zzg() + zzdyVar.zzd();
        int iZzg2 = zzdyVar.zzg();
        int i = (iZzg2 >> 24) & 255;
        zzax zzaxVarZze = null;
        try {
            if (i == 169 || i == 253) {
                int i2 = iZzg2 & ViewCompat.MEASURED_SIZE_MASK;
                if (i2 == 6516084) {
                    int iZzg3 = zzdyVar.zzg();
                    if (zzdyVar.zzg() == 1684108385) {
                        zzdyVar.zzM(8);
                        String strZzA = zzdyVar.zzA(iZzg3 - 16);
                        zzaxVarZze = new zzagb(C.LANGUAGE_UNDETERMINED, strZzA, strZzA);
                    } else {
                        zzdo.zzf("MetadataUtil", "Failed to parse comment attribute: ".concat(zzeq.zze(iZzg2)));
                    }
                } else if (i2 == 7233901 || i2 == 7631467) {
                    zzaxVarZze = zze(iZzg2, "TIT2", zzdyVar);
                } else if (i2 == 6516589 || i2 == 7828084) {
                    zzaxVarZze = zze(iZzg2, "TCOM", zzdyVar);
                } else if (i2 == 6578553) {
                    zzaxVarZze = zze(iZzg2, "TDRC", zzdyVar);
                } else if (i2 == 4280916) {
                    zzaxVarZze = zze(iZzg2, "TPE1", zzdyVar);
                } else if (i2 == 7630703) {
                    zzaxVarZze = zze(iZzg2, "TSSE", zzdyVar);
                } else if (i2 == 6384738) {
                    zzaxVarZze = zze(iZzg2, "TALB", zzdyVar);
                } else if (i2 == 7108978) {
                    zzaxVarZze = zze(iZzg2, "USLT", zzdyVar);
                } else if (i2 == 6776174) {
                    zzaxVarZze = zze(iZzg2, "TCON", zzdyVar);
                } else if (i2 == 6779504) {
                    zzaxVarZze = zze(iZzg2, "TIT1", zzdyVar);
                } else {
                    zzdo.zzb("MetadataUtil", "Skipped unknown metadata entry: " + zzeq.zze(iZzg2));
                }
            } else if (iZzg2 == 1735291493) {
                String strZza = zzagi.zza(zzb(zzdyVar) - 1);
                if (strZza != null) {
                    zzaxVarZze = new zzagq("TCON", null, zzfxn.zzo(strZza));
                } else {
                    zzdo.zzf("MetadataUtil", "Failed to parse standard genre code");
                }
            } else if (iZzg2 == 1684632427) {
                zzaxVarZze = zzd(1684632427, "TPOS", zzdyVar);
            } else if (iZzg2 == 1953655662) {
                zzaxVarZze = zzd(1953655662, "TRCK", zzdyVar);
            } else if (iZzg2 == 1953329263) {
                zzaxVarZze = zzc(1953329263, "TBPM", zzdyVar, true, false);
            } else if (iZzg2 == 1668311404) {
                zzaxVarZze = zzc(1668311404, "TCMP", zzdyVar, true, true);
            } else if (iZzg2 == 1668249202) {
                int iZzg4 = zzdyVar.zzg();
                if (zzdyVar.zzg() == 1684108385) {
                    int iZzg5 = zzdyVar.zzg();
                    int i3 = zzaik.zza;
                    int i4 = iZzg5 & ViewCompat.MEASURED_SIZE_MASK;
                    if (i4 == 13) {
                        str = "image/jpeg";
                    } else if (i4 == 14) {
                        str = "image/png";
                        i4 = 14;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        zzdo.zzf("MetadataUtil", "Unrecognized cover art flags: " + i4);
                    } else {
                        zzdyVar.zzM(4);
                        int i5 = iZzg4 - 16;
                        byte[] bArr = new byte[i5];
                        zzdyVar.zzH(bArr, 0, i5);
                        zzaxVarZze = new zzaft(str, null, 3, bArr);
                    }
                } else {
                    zzdo.zzf("MetadataUtil", "Failed to parse cover art attribute");
                }
            } else if (iZzg2 == 1631670868) {
                zzaxVarZze = zze(1631670868, "TPE2", zzdyVar);
            } else if (iZzg2 == 1936682605) {
                zzaxVarZze = zze(1936682605, "TSOT", zzdyVar);
            } else if (iZzg2 == 1936679276) {
                zzaxVarZze = zze(1936679276, "TSOA", zzdyVar);
            } else if (iZzg2 == 1936679282) {
                zzaxVarZze = zze(1936679282, "TSOP", zzdyVar);
            } else if (iZzg2 == 1936679265) {
                zzaxVarZze = zze(1936679265, "TSO2", zzdyVar);
            } else if (iZzg2 == 1936679791) {
                zzaxVarZze = zze(1936679791, "TSOC", zzdyVar);
            } else if (iZzg2 == 1920233063) {
                zzaxVarZze = zzc(1920233063, "ITUNESADVISORY", zzdyVar, false, false);
            } else if (iZzg2 == 1885823344) {
                zzaxVarZze = zzc(1885823344, "ITUNESGAPLESS", zzdyVar, false, true);
            } else if (iZzg2 == 1936683886) {
                zzaxVarZze = zze(1936683886, "TVSHOWSORT", zzdyVar);
            } else if (iZzg2 == 1953919848) {
                zzaxVarZze = zze(1953919848, "TVSHOW", zzdyVar);
            } else if (iZzg2 == 757935405) {
                String strZzA2 = null;
                String strZzA3 = null;
                int i6 = -1;
                int i7 = -1;
                while (zzdyVar.zzd() < iZzg) {
                    int iZzd = zzdyVar.zzd();
                    int iZzg6 = zzdyVar.zzg();
                    int iZzg7 = zzdyVar.zzg();
                    zzdyVar.zzM(4);
                    if (iZzg7 == 1835360622) {
                        strZzA2 = zzdyVar.zzA(iZzg6 - 12);
                    } else {
                        int i8 = iZzg6 - 12;
                        if (iZzg7 == 1851878757) {
                            strZzA3 = zzdyVar.zzA(i8);
                        } else {
                            if (iZzg7 == 1684108385) {
                                i7 = iZzg6;
                            }
                            if (iZzg7 == 1684108385) {
                                i6 = iZzd;
                            }
                            zzdyVar.zzM(i8);
                        }
                    }
                }
                if (strZzA2 != null && strZzA3 != null && i6 != -1) {
                    zzdyVar.zzL(i6);
                    zzdyVar.zzM(16);
                    zzaxVarZze = new zzagk(strZzA2, strZzA3, zzdyVar.zzA(i7 - 16));
                }
            } else {
                zzdo.zzb("MetadataUtil", "Skipped unknown metadata entry: " + zzeq.zze(iZzg2));
            }
            zzdyVar.zzL(iZzg);
            return zzaxVarZze;
        } catch (Throwable th) {
            zzdyVar.zzL(iZzg);
            throw th;
        }
    }

    private static int zzb(zzdy zzdyVar) {
        int iZzg = zzdyVar.zzg();
        if (zzdyVar.zzg() == 1684108385) {
            zzdyVar.zzM(8);
            int i = iZzg - 16;
            if (i == 1) {
                return zzdyVar.zzm();
            }
            if (i == 2) {
                return zzdyVar.zzq();
            }
            if (i == 3) {
                return zzdyVar.zzo();
            }
            if (i == 4 && (zzdyVar.zzf() & 128) == 0) {
                return zzdyVar.zzp();
            }
        }
        zzdo.zzf("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    @Nullable
    private static zzagh zzc(int i, String str, zzdy zzdyVar, boolean z, boolean z2) {
        int iZzb = zzb(zzdyVar);
        if (z2) {
            iZzb = Math.min(1, iZzb);
        }
        if (iZzb >= 0) {
            return z ? new zzagq(str, null, zzfxn.zzo(Integer.toString(iZzb))) : new zzagb(C.LANGUAGE_UNDETERMINED, str, Integer.toString(iZzb));
        }
        zzdo.zzf("MetadataUtil", "Failed to parse uint8 attribute: ".concat(zzeq.zze(i)));
        return null;
    }

    @Nullable
    private static zzagq zzd(int i, String str, zzdy zzdyVar) {
        int iZzg = zzdyVar.zzg();
        if (zzdyVar.zzg() == 1684108385 && iZzg >= 22) {
            zzdyVar.zzM(10);
            int iZzq = zzdyVar.zzq();
            if (iZzq > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(iZzq);
                String string = sb.toString();
                int iZzq2 = zzdyVar.zzq();
                if (iZzq2 > 0) {
                    string = string + "/" + iZzq2;
                }
                return new zzagq(str, null, zzfxn.zzo(string));
            }
        }
        zzdo.zzf("MetadataUtil", "Failed to parse index/count attribute: ".concat(zzeq.zze(i)));
        return null;
    }

    @Nullable
    private static zzagq zze(int i, String str, zzdy zzdyVar) {
        int iZzg = zzdyVar.zzg();
        if (zzdyVar.zzg() == 1684108385) {
            zzdyVar.zzM(8);
            return new zzagq(str, null, zzfxn.zzo(zzdyVar.zzA(iZzg - 16)));
        }
        zzdo.zzf("MetadataUtil", "Failed to parse text attribute: ".concat(zzeq.zze(i)));
        return null;
    }
}
