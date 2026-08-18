package com.google.android.gms.internal.ads;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class zzakz implements zzakf {
    private static final Pattern zza = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
    private static final Pattern zzb = Pattern.compile("\\{\\\\.*?\\}");
    private final StringBuilder zzc = new StringBuilder();
    private final ArrayList zzd = new ArrayList();
    private final zzdy zze = new zzdy();

    @VisibleForTesting(otherwise = 2)
    public static float zzb(int i) {
        if (i == 0) {
            return 0.08f;
        }
        if (i == 1) {
            return 0.5f;
        }
        if (i == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    private static long zzc(Matcher matcher, int i) {
        String strGroup = matcher.group(i + 1);
        long j = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i + 2);
        strGroup2.getClass();
        long j2 = (Long.parseLong(strGroup2) * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) + j;
        String strGroup3 = matcher.group(i + 3);
        strGroup3.getClass();
        long j3 = (Long.parseLong(strGroup3) * 1000) + j2;
        String strGroup4 = matcher.group(i + 4);
        if (strGroup4 != null) {
            j3 += Long.parseLong(strGroup4);
        }
        return j3 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:59:0x013d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0197  */
    @Override // com.google.android.gms.internal.ads.zzakf
    public final void zza(byte[] bArr, int i, int i2, zzake zzakeVar, zzdb zzdbVar) {
        String str;
        byte b;
        byte b2;
        zzco zzcoVarZzp;
        zzakz zzakzVar = this;
        zzakzVar.zze.zzJ(bArr, i + i2);
        zzakzVar.zze.zzL(i);
        Charset charsetZzC = zzakzVar.zze.zzC();
        if (charsetZzC == null) {
            charsetZzC = StandardCharsets.UTF_8;
        }
        while (true) {
            String strZzz = zzakzVar.zze.zzz(charsetZzC);
            if (strZzz == null) {
                return;
            }
            if (strZzz.length() != 0) {
                try {
                    Integer.parseInt(strZzz);
                    String strZzz2 = zzakzVar.zze.zzz(charsetZzC);
                    if (strZzz2 == null) {
                        zzdo.zzf("SubripParser", "Unexpected end");
                        return;
                    }
                    Matcher matcher = zza.matcher(strZzz2);
                    if (matcher.matches()) {
                        long jZzc = zzc(matcher, 1);
                        long jZzc2 = zzc(matcher, 6);
                        zzakzVar.zzc.setLength(0);
                        zzakzVar.zzd.clear();
                        for (String strZzz3 = zzakzVar.zze.zzz(charsetZzC); !TextUtils.isEmpty(strZzz3); strZzz3 = zzakzVar.zze.zzz(charsetZzC)) {
                            if (zzakzVar.zzc.length() > 0) {
                                zzakzVar.zzc.append("<br>");
                            }
                            StringBuilder sb = zzakzVar.zzc;
                            ArrayList arrayList = zzakzVar.zzd;
                            String strTrim = strZzz3.trim();
                            StringBuilder sb2 = new StringBuilder(strTrim);
                            Matcher matcher2 = zzb.matcher(strTrim);
                            int i3 = 0;
                            while (matcher2.find()) {
                                String strGroup = matcher2.group();
                                arrayList.add(strGroup);
                                int iStart = matcher2.start() - i3;
                                int length = strGroup.length();
                                sb2.replace(iStart, iStart + length, "");
                                i3 += length;
                            }
                            sb.append(sb2.toString());
                        }
                        Spanned spannedFromHtml = Html.fromHtml(zzakzVar.zzc.toString());
                        int i4 = 0;
                        while (true) {
                            if (i4 < zzakzVar.zzd.size()) {
                                str = (String) zzakzVar.zzd.get(i4);
                                if (!str.matches("\\{\\\\an[1-9]\\}")) {
                                    i4++;
                                }
                            } else {
                                str = null;
                            }
                        }
                        zzcm zzcmVar = new zzcm();
                        zzcmVar.zzl(spannedFromHtml);
                        if (str == null) {
                            zzcoVarZzp = zzcmVar.zzp();
                        } else {
                            switch (str) {
                                case "{\an1}":
                                    b = 0;
                                    break;
                                case "{\an3}":
                                    b = 3;
                                    break;
                                case "{\an4}":
                                    b = 1;
                                    break;
                                case "{\an6}":
                                    b = 4;
                                    break;
                                case "{\an7}":
                                    b = 2;
                                    break;
                                case "{\an9}":
                                    b = 5;
                                    break;
                                default:
                                    b = -1;
                                    break;
                            }
                            if (b == 0 || b == 1 || b == 2) {
                                zzcmVar.zzi(0);
                            } else if (b == 3 || b == 4 || b == 5) {
                                zzcmVar.zzi(2);
                            } else {
                                zzcmVar.zzi(1);
                            }
                            switch (str) {
                                case "{\an1}":
                                    b2 = 0;
                                    break;
                                case "{\an2}":
                                    b2 = 1;
                                    break;
                                case "{\an3}":
                                    b2 = 2;
                                    break;
                                case "{\an7}":
                                    b2 = 3;
                                    break;
                                case "{\an8}":
                                    b2 = 4;
                                    break;
                                case "{\an9}":
                                    b2 = 5;
                                    break;
                                default:
                                    b2 = -1;
                                    break;
                            }
                            if (b2 == 0 || b2 == 1 || b2 == 2) {
                                zzcmVar.zzf(2);
                            } else if (b2 == 3 || b2 == 4 || b2 == 5) {
                                zzcmVar.zzf(0);
                            } else {
                                zzcmVar.zzf(1);
                            }
                            zzcmVar.zzh(zzb(zzcmVar.zzb()));
                            zzcmVar.zze(zzb(zzcmVar.zza()), 0);
                            zzcoVarZzp = zzcmVar.zzp();
                        }
                        zzdbVar.zza(new zzajx(zzfxn.zzo(zzcoVarZzp), jZzc, jZzc2 - jZzc));
                    } else {
                        zzdo.zzf("SubripParser", "Skipping invalid timing: ".concat(strZzz2));
                    }
                } catch (NumberFormatException unused) {
                    zzdo.zzf("SubripParser", "Skipping invalid index: ".concat(strZzz));
                }
            }
            zzakzVar = this;
        }
    }
}
