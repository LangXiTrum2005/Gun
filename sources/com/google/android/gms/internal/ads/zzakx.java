package com.google.android.gms.internal.ads;

import android.graphics.PointF;
import androidx.annotation.Nullable;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
final class zzakx {
    private static final Pattern zzc = Pattern.compile("\\{([^}]*)\\}");
    private static final Pattern zzd;
    private static final Pattern zze;
    private static final Pattern zzf;
    public final int zza;

    @Nullable
    public final PointF zzb;

    static {
        Locale locale = Locale.US;
        zzd = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        zze = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        zzf = Pattern.compile("\\\\an(\\d+)");
    }

    private zzakx(int i, @Nullable PointF pointF) {
        this.zza = i;
        this.zzb = pointF;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0081  */
    /* JADX WARN: Code duplicated, block: B:24:0x008e A[Catch: RuntimeException -> 0x009a, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x009a, blocks: (B:22:0x0082, B:24:0x008e, B:26:0x0095), top: B:37:0x0082 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x009d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x000a A[SYNTHETIC] */
    public static zzakx zza(String str) {
        Matcher matcher;
        int iZzd;
        PointF pointF;
        String strGroup;
        String strGroup2;
        Matcher matcher2 = zzc.matcher(str);
        PointF pointF2 = null;
        int i = -1;
        while (matcher2.find()) {
            String strGroup3 = matcher2.group(1);
            strGroup3.getClass();
            try {
                try {
                    Matcher matcher3 = zzd.matcher(strGroup3);
                    Matcher matcher4 = zze.matcher(strGroup3);
                    boolean zFind = matcher3.find();
                    boolean zFind2 = matcher4.find();
                    if (zFind) {
                        if (zFind2) {
                            zzdo.zze("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + strGroup3 + "'");
                        }
                        strGroup = matcher3.group(1);
                        strGroup2 = matcher3.group(2);
                    } else {
                        if (zFind2) {
                            String strGroup4 = matcher4.group(1);
                            String strGroup5 = matcher4.group(2);
                            strGroup = strGroup4;
                            strGroup2 = strGroup5;
                        } else {
                            pointF = null;
                        }
                        if (pointF != null) {
                            pointF2 = pointF;
                        }
                        matcher = zzf.matcher(strGroup3);
                        if (matcher.find()) {
                            String strGroup6 = matcher.group(1);
                            strGroup6.getClass();
                            iZzd = zzaky.zzd(strGroup6);
                        } else {
                            iZzd = -1;
                        }
                        if (iZzd != -1) {
                            i = iZzd;
                        }
                    }
                    strGroup.getClass();
                    float f = Float.parseFloat(strGroup.trim());
                    strGroup2.getClass();
                    pointF = new PointF(f, Float.parseFloat(strGroup2.trim()));
                    if (pointF != null) {
                        pointF2 = pointF;
                    }
                } catch (RuntimeException unused) {
                }
                matcher = zzf.matcher(strGroup3);
                if (matcher.find()) {
                    String strGroup7 = matcher.group(1);
                    strGroup7.getClass();
                    iZzd = zzaky.zzd(strGroup7);
                } else {
                    iZzd = -1;
                }
                if (iZzd != -1) {
                    i = iZzd;
                }
            } catch (RuntimeException unused2) {
            }
        }
        return new zzakx(i, pointF2);
    }

    public static String zzb(String str) {
        return zzc.matcher(str).replaceAll("");
    }
}
