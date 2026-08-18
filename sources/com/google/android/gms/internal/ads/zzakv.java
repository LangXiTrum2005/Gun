package com.google.android.gms.internal.ads;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import androidx.work.WorkRequest;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class zzakv implements zzakf {
    private static final Pattern zza = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    private final boolean zzb;

    @Nullable
    private final zzaku zzc;
    private final zzdy zzd;
    private Map zze;
    private float zzf;
    private float zzg;

    public zzakv() {
        this(null);
    }

    private static float zzb(int i) {
        if (i == 0) {
            return 0.05f;
        }
        if (i != 1) {
            return i != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    private static int zzc(long j, List list, List list2) {
        int i;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                i = 0;
                break;
            }
            if (((Long) list.get(size)).longValue() == j) {
                return size;
            }
            if (((Long) list.get(size)).longValue() < j) {
                i = size + 1;
                break;
            }
        }
        list.add(i, Long.valueOf(j));
        list2.add(i, i == 0 ? new ArrayList() : new ArrayList((Collection) list2.get(i - 1)));
        return i;
    }

    private static long zzd(String str) {
        Matcher matcher = zza.matcher(str.trim());
        if (!matcher.matches()) {
            return C.TIME_UNSET;
        }
        String strGroup = matcher.group(1);
        int i = zzei.zza;
        long j = Long.parseLong(strGroup) * 3600000000L;
        long j2 = Long.parseLong(matcher.group(2)) * 60000000;
        return j + j2 + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * WorkRequest.MIN_BACKOFF_MILLIS);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x0053  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void zze(zzdy zzdyVar, Charset charset) {
        while (true) {
            String strZzz = zzdyVar.zzz(charset);
            if (strZzz == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(strZzz)) {
                while (true) {
                    String strZzz2 = zzdyVar.zzz(charset);
                    if (strZzz2 == null || (zzdyVar.zzb() != 0 && zzdyVar.zza(charset) == '[')) {
                        break;
                    }
                    String[] strArrSplit = strZzz2.split(":");
                    if (strArrSplit.length == 2) {
                        byte b = 0;
                        String strZza = zzftt.zza(strArrSplit[0].trim());
                        switch (strZza.hashCode()) {
                            case 1879649548:
                                if (!strZza.equals("playresx")) {
                                    b = -1;
                                }
                                break;
                            case 1879649549:
                                if (!strZza.equals("playresy")) {
                                    b = -1;
                                } else {
                                    b = 1;
                                }
                                break;
                            default:
                                b = -1;
                                break;
                        }
                        if (b == 0) {
                            this.zzf = Float.parseFloat(strArrSplit[1].trim());
                        } else if (b == 1) {
                            try {
                                this.zzg = Float.parseFloat(strArrSplit[1].trim());
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(strZzz)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                zzakw zzakwVarZza = null;
                while (true) {
                    String strZzz3 = zzdyVar.zzz(charset);
                    if (strZzz3 != null && (zzdyVar.zzb() == 0 || zzdyVar.zza(charset) != '[')) {
                        if (strZzz3.startsWith("Format:")) {
                            zzakwVarZza = zzakw.zza(strZzz3);
                        } else if (strZzz3.startsWith("Style:")) {
                            if (zzakwVarZza == null) {
                                zzdo.zzf("SsaParser", "Skipping 'Style:' line before 'Format:' line: ".concat(strZzz3));
                            } else {
                                zzaky zzakyVarZzb = zzaky.zzb(strZzz3, zzakwVarZza);
                                if (zzakyVarZzb != null) {
                                    linkedHashMap.put(zzakyVarZzb.zza, zzakyVarZzb);
                                }
                            }
                        }
                    }
                }
                this.zze = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(strZzz)) {
                zzdo.zze("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strZzz)) {
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:120:0x0283  */
    /* JADX WARN: Code duplicated, block: B:134:0x02b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x019c  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ac  */
    @Override // com.google.android.gms.internal.ads.zzakf
    public final void zza(byte[] bArr, int i, int i2, zzake zzakeVar, zzdb zzdbVar) {
        int i3;
        zzdy zzdyVar;
        Layout.Alignment alignment;
        int i4;
        int i5;
        int i6;
        int i7;
        Integer num;
        int i8;
        zzakv zzakvVar = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        zzakvVar.zzd.zzJ(bArr, i + i2);
        zzakvVar.zzd.zzL(i);
        Charset charsetZzC = zzakvVar.zzd.zzC();
        if (charsetZzC == null) {
            charsetZzC = StandardCharsets.UTF_8;
        }
        if (!zzakvVar.zzb) {
            zzakvVar.zze(zzakvVar.zzd, charsetZzC);
        }
        zzdy zzdyVar2 = zzakvVar.zzd;
        zzaku zzakuVarZza = zzakvVar.zzb ? zzakvVar.zzc : null;
        while (true) {
            String strZzz = zzdyVar2.zzz(charsetZzC);
            if (strZzz == null) {
                int i9 = 0;
                while (i9 < arrayList.size()) {
                    List list = (List) arrayList.get(i9);
                    if (!list.isEmpty()) {
                        if (i9 != arrayList.size() - 1) {
                            throw new IllegalStateException();
                        }
                        zzdbVar.zza(new zzajx(list, ((Long) arrayList2.get(i9)).longValue(), ((Long) arrayList2.get(i9 + 1)).longValue() - ((Long) arrayList2.get(i9)).longValue()));
                        i3 = 1;
                    } else if (i9 != 0) {
                        i3 = 1;
                    } else {
                        i9 = 0;
                        if (i9 != arrayList.size() - 1) {
                            throw new IllegalStateException();
                        }
                        zzdbVar.zza(new zzajx(list, ((Long) arrayList2.get(i9)).longValue(), ((Long) arrayList2.get(i9 + 1)).longValue() - ((Long) arrayList2.get(i9)).longValue()));
                        i3 = 1;
                    }
                    i9 += i3;
                }
                return;
            }
            if (strZzz.startsWith("Format:")) {
                zzakuVarZza = zzaku.zza(strZzz);
            } else {
                if (strZzz.startsWith("Dialogue:")) {
                    if (zzakuVarZza == null) {
                        zzdo.zzf("SsaParser", "Skipping dialogue line before complete format: ".concat(strZzz));
                    } else {
                        zzcw.zzd(strZzz.startsWith("Dialogue:"));
                        String[] strArrSplit = strZzz.substring(9).split(",", zzakuVarZza.zze);
                        if (strArrSplit.length != zzakuVarZza.zze) {
                            zzdo.zzf("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(strZzz));
                        } else {
                            long jZzd = zzd(strArrSplit[zzakuVarZza.zza]);
                            if (jZzd == C.TIME_UNSET) {
                                zzdo.zzf("SsaParser", "Skipping invalid timing: ".concat(strZzz));
                            } else {
                                long jZzd2 = zzd(strArrSplit[zzakuVarZza.zzb]);
                                if (jZzd2 == C.TIME_UNSET) {
                                    zzdo.zzf("SsaParser", "Skipping invalid timing: ".concat(strZzz));
                                } else {
                                    Map map = zzakvVar.zze;
                                    zzaky zzakyVar = (map == null || (i8 = zzakuVarZza.zzc) == -1) ? null : (zzaky) map.get(strArrSplit[i8].trim());
                                    String str = strArrSplit[zzakuVarZza.zzd];
                                    zzakx zzakxVarZza = zzakx.zza(str);
                                    String strReplace = zzakx.zzb(str).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                    float f = zzakvVar.zzf;
                                    float f2 = zzakvVar.zzg;
                                    SpannableString spannableString = new SpannableString(strReplace);
                                    zzcm zzcmVar = new zzcm();
                                    zzcmVar.zzl(spannableString);
                                    if (zzakyVar != null) {
                                        Integer num2 = zzakyVar.zzc;
                                        zzdyVar = zzdyVar2;
                                        if (num2 != null) {
                                            spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                        }
                                        if (zzakyVar.zzj == 3 && (num = zzakyVar.zzd) != null) {
                                            spannableString.setSpan(new BackgroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                        }
                                        float f3 = zzakyVar.zze;
                                        if (f3 != -3.4028235E38f && f2 != -3.4028235E38f) {
                                            zzcmVar.zzn(f3 / f2, 1);
                                        }
                                        if (!zzakyVar.zzf) {
                                            i6 = 0;
                                            i7 = 33;
                                            if (zzakyVar.zzg) {
                                                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                            }
                                            if (zzakyVar.zzh) {
                                                spannableString.setSpan(new UnderlineSpan(), i6, spannableString.length(), i7);
                                            }
                                            if (zzakyVar.zzi) {
                                                spannableString.setSpan(new StrikethroughSpan(), i6, spannableString.length(), i7);
                                            }
                                        } else if (zzakyVar.zzg) {
                                            i6 = 0;
                                            i7 = 33;
                                            spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                        } else {
                                            i6 = 0;
                                            i7 = 33;
                                            spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                        }
                                        if (zzakyVar.zzh) {
                                            spannableString.setSpan(new UnderlineSpan(), i6, spannableString.length(), i7);
                                        }
                                        if (zzakyVar.zzi) {
                                            spannableString.setSpan(new StrikethroughSpan(), i6, spannableString.length(), i7);
                                        }
                                    } else {
                                        zzdyVar = zzdyVar2;
                                        zzakuVarZza = zzakuVarZza;
                                        jZzd2 = jZzd2;
                                    }
                                    int i10 = zzakxVarZza.zza;
                                    if (i10 == -1) {
                                        i10 = zzakyVar != null ? zzakyVar.zzb : -1;
                                    }
                                    switch (i10) {
                                        case 0:
                                        default:
                                            AbstractC3888ke0.r("Unknown alignment: ", i10, "SsaParser");
                                        case -1:
                                            alignment = null;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            alignment = Layout.Alignment.ALIGN_NORMAL;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            alignment = Layout.Alignment.ALIGN_CENTER;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                            break;
                                    }
                                    zzcmVar.zzm(alignment);
                                    switch (i10) {
                                        case 0:
                                        default:
                                            AbstractC3888ke0.r("Unknown alignment: ", i10, "SsaParser");
                                        case -1:
                                            i4 = Integer.MIN_VALUE;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            i4 = 0;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            i4 = 1;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            i4 = 2;
                                            break;
                                    }
                                    zzcmVar.zzi(i4);
                                    switch (i10) {
                                        case 0:
                                        default:
                                            AbstractC3888ke0.r("Unknown alignment: ", i10, "SsaParser");
                                        case -1:
                                            i5 = Integer.MIN_VALUE;
                                            break;
                                        case 1:
                                        case 2:
                                        case 3:
                                            i5 = 2;
                                            break;
                                        case 4:
                                        case 5:
                                        case 6:
                                            i5 = 1;
                                            break;
                                        case 7:
                                        case 8:
                                        case 9:
                                            i5 = 0;
                                            break;
                                    }
                                    zzcmVar.zzf(i5);
                                    PointF pointF = zzakxVarZza.zzb;
                                    if (pointF == null || f2 == -3.4028235E38f || f == -3.4028235E38f) {
                                        zzcmVar.zzh(zzb(zzcmVar.zzb()));
                                        zzcmVar.zze(zzb(zzcmVar.zza()), 0);
                                    } else {
                                        zzcmVar.zzh(pointF.x / f);
                                        zzcmVar.zze(zzakxVarZza.zzb.y / f2, 0);
                                    }
                                    zzco zzcoVarZzp = zzcmVar.zzp();
                                    int iZzc = zzc(jZzd2, arrayList2, arrayList);
                                    for (int iZzc2 = zzc(jZzd, arrayList2, arrayList); iZzc2 < iZzc; iZzc2++) {
                                        ((List) arrayList.get(iZzc2)).add(zzcoVarZzp);
                                    }
                                }
                            }
                        }
                    }
                    zzdyVar = zzdyVar2;
                    zzakuVarZza = zzakuVarZza;
                } else {
                    zzdyVar = zzdyVar2;
                    zzakuVarZza = zzakuVarZza;
                }
                zzakvVar = this;
                charsetZzC = charsetZzC;
                zzdyVar2 = zzdyVar;
                zzakuVarZza = zzakuVarZza;
            }
        }
    }

    public zzakv(@Nullable List list) {
        this.zzf = -3.4028235E38f;
        this.zzg = -3.4028235E38f;
        this.zzd = new zzdy();
        if (list == null || list.isEmpty()) {
            this.zzb = false;
            this.zzc = null;
            return;
        }
        this.zzb = true;
        String strZzB = zzei.zzB((byte[]) list.get(0));
        zzcw.zzd(strZzB.startsWith("Format:"));
        zzaku zzakuVarZza = zzaku.zza(strZzB);
        zzakuVarZza.getClass();
        this.zzc = zzakuVarZza;
        zze(new zzdy((byte[]) list.get(1)), StandardCharsets.UTF_8);
    }
}
