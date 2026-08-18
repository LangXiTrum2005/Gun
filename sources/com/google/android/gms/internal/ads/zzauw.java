package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.core.view.PointerIconCompat;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzauw implements zzauv {
    protected static volatile zzawd zza;
    protected MotionEvent zzb;
    protected double zzk;
    protected float zzl;
    protected float zzm;
    protected float zzn;
    protected float zzo;
    protected DisplayMetrics zzq;

    @Nullable
    protected zzavv zzr;
    private double zzs;
    private double zzt;
    protected final LinkedList zzc = new LinkedList();
    protected long zzd = 0;
    protected long zze = 0;
    protected long zzf = 0;
    protected long zzg = 0;
    protected long zzh = 0;
    protected long zzi = 0;
    protected long zzj = 0;
    private boolean zzu = false;
    protected boolean zzp = false;

    public zzauw(Context context) {
        try {
            zzaty.zze();
            this.zzq = context.getResources().getDisplayMetrics();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzcT)).booleanValue()) {
                this.zzr = new zzavv();
            }
        } catch (Throwable unused) {
        }
    }

    private final void zzm() {
        this.zzh = 0L;
        this.zzd = 0L;
        this.zze = 0L;
        this.zzf = 0L;
        this.zzg = 0L;
        this.zzi = 0L;
        this.zzj = 0L;
        if (this.zzc.isEmpty()) {
            MotionEvent motionEvent = this.zzb;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        } else {
            Iterator it = this.zzc.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            this.zzc.clear();
        }
        this.zzb = null;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bb A[Catch: Exception -> 0x00f3, TryCatch #2 {Exception -> 0x00f3, blocks: (B:44:0x00ae, B:47:0x00bb, B:55:0x00e3, B:58:0x00f7), top: B:75:0x00ae }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00cf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:51:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00da  */
    /* JADX WARN: Code duplicated, block: B:54:0x00df  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f7 A[Catch: Exception -> 0x00f3, TRY_LEAVE, TryCatch #2 {Exception -> 0x00f3, blocks: (B:44:0x00ae, B:47:0x00bb, B:55:0x00e3, B:58:0x00f7), top: B:75:0x00ae }] */
    /* JADX WARN: Code duplicated, block: B:75:0x00ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private final String zzp(Context context, String str, int i, View view, Activity activity, byte[] bArr) {
        zzauu zzauuVarZzd;
        String str2;
        int i2;
        Exception exc;
        int i3;
        int i4;
        long jCurrentTimeMillis;
        String strZzb;
        int i5;
        int i6;
        int i7;
        int i8 = i;
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzcG)).booleanValue();
        zzasc zzascVarZzc = null;
        if (zBooleanValue) {
            zzauuVarZzd = zza != null ? zza.zzd() : null;
            str2 = "be";
        } else {
            zzauuVarZzd = null;
            str2 = null;
        }
        try {
            if (i8 == 3) {
                zzascVarZzc = zzb(context, view, activity);
                try {
                    this.zzu = true;
                    i7 = 1002;
                } catch (Exception e) {
                    exc = e;
                    i2 = 3;
                    if (!zBooleanValue) {
                    }
                    jCurrentTimeMillis = System.currentTimeMillis();
                    if (zzascVarZzc != null) {
                        try {
                            if (((zzasy) zzascVarZzc.zzbr()).zzaY() == 0) {
                                strZzb = Integer.toString(5);
                            } else {
                                zzasy zzasyVar = (zzasy) zzascVarZzc.zzbr();
                                int i9 = zzaty.zzc;
                                strZzb = zzaty.zzb(zzasyVar.zzaV(), str);
                                if (zBooleanValue) {
                                    if (i8 == i2) {
                                        i5 = PointerIconCompat.TYPE_CELL;
                                    } else if (i8 == i3) {
                                        i5 = 1010;
                                    } else {
                                        i5 = 1004;
                                    }
                                    zzauuVarZzd.zzc(i5, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, null);
                                }
                            }
                        } catch (Exception e2) {
                            strZzb = Integer.toString(7);
                            if (zBooleanValue && zzauuVarZzd != null) {
                                if (i8 == i2) {
                                    i6 = PointerIconCompat.TYPE_CROSSHAIR;
                                } else {
                                    i6 = i8 == i3 ? 1011 : 1005;
                                }
                                zzauuVarZzd.zzc(i6, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, e2);
                            }
                        }
                    } else {
                        strZzb = Integer.toString(5);
                    }
                    return strZzb;
                }
            } else if (i8 == 2) {
                zzascVarZzc = zzi(context, view, activity);
                i7 = PointerIconCompat.TYPE_TEXT;
            } else {
                zzascVarZzc = zzc(context, null);
                i7 = 1000;
            }
            if (!zBooleanValue || zzauuVarZzd == null) {
                i2 = 3;
            } else {
                i2 = 3;
                try {
                    zzauuVarZzd.zzc(i7, -1, System.currentTimeMillis() - jCurrentTimeMillis2, str2, null);
                } catch (Exception e3) {
                    e = e3;
                    exc = e;
                    if (!zBooleanValue && zzauuVarZzd != null) {
                        if (i8 == i2) {
                            i3 = 2;
                            i4 = PointerIconCompat.TYPE_HELP;
                        } else {
                            i3 = 2;
                            if (i8 == 2) {
                                i4 = PointerIconCompat.TYPE_VERTICAL_TEXT;
                            } else {
                                i8 = 1;
                                i4 = 1001;
                            }
                        }
                        zzauuVarZzd.zzc(i4, -1, System.currentTimeMillis() - jCurrentTimeMillis2, str2, exc);
                    }
                    jCurrentTimeMillis = System.currentTimeMillis();
                    if (zzascVarZzc != null) {
                        strZzb = Integer.toString(5);
                    } else if (((zzasy) zzascVarZzc.zzbr()).zzaY() == 0) {
                        strZzb = Integer.toString(5);
                    } else {
                        zzasy zzasyVar2 = (zzasy) zzascVarZzc.zzbr();
                        int i10 = zzaty.zzc;
                        strZzb = zzaty.zzb(zzasyVar2.zzaV(), str);
                        if (zBooleanValue) {
                            if (i8 == i2) {
                                i5 = PointerIconCompat.TYPE_CELL;
                            } else if (i8 == i3) {
                                i5 = 1010;
                            } else {
                                i5 = 1004;
                            }
                            zzauuVarZzd.zzc(i5, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, null);
                        }
                    }
                    return strZzb;
                }
            }
        } catch (Exception e4) {
            e = e4;
            i2 = 3;
        }
        i3 = 2;
        jCurrentTimeMillis = System.currentTimeMillis();
        if (zzascVarZzc != null) {
            strZzb = Integer.toString(5);
        } else if (((zzasy) zzascVarZzc.zzbr()).zzaY() == 0) {
            strZzb = Integer.toString(5);
        } else {
            zzasy zzasyVar3 = (zzasy) zzascVarZzc.zzbr();
            int i11 = zzaty.zzc;
            strZzb = zzaty.zzb(zzasyVar3.zzaV(), str);
            if (zBooleanValue && zzauuVarZzd != null) {
                if (i8 == i2) {
                    i5 = PointerIconCompat.TYPE_CELL;
                } else if (i8 == i3) {
                    i5 = 1010;
                } else {
                    i5 = 1004;
                }
                zzauuVarZzd.zzc(i5, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, null);
            }
        }
        return strZzb;
    }

    public abstract long zza(StackTraceElement[] stackTraceElementArr) throws zzavt;

    public abstract zzasc zzb(Context context, View view, Activity activity);

    public abstract zzasc zzc(Context context, zzarp zzarpVar);

    @Override // com.google.android.gms.internal.ads.zzauv
    public final String zzd(Context context, @Nullable String str, @Nullable View view) {
        return zzp(context, str, 3, view, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final String zze(Context context, @Nullable String str, @Nullable View view, @Nullable Activity activity) {
        return zzp(context, str, 3, view, activity, null);
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final String zzf(Context context) {
        if (zzawg.zzc()) {
            throw new IllegalStateException("The caller must not be called from the UI thread.");
        }
        return zzp(context, null, 1, null, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final String zzg(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final String zzh(Context context, @Nullable View view, @Nullable Activity activity) {
        return zzp(context, null, 2, view, activity, null);
    }

    public abstract zzasc zzi(Context context, View view, Activity activity);

    public abstract zzawf zzj(MotionEvent motionEvent) throws zzavt;

    @Override // com.google.android.gms.internal.ads.zzauv
    public final synchronized void zzk(@Nullable MotionEvent motionEvent) {
        Long l;
        try {
            if (this.zzu) {
                zzm();
                this.zzu = false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.zzk = 0.0d;
                this.zzs = motionEvent.getRawX();
                this.zzt = motionEvent.getRawY();
            } else if (action == 1 || action == 2) {
                double rawX = motionEvent.getRawX();
                double rawY = motionEvent.getRawY();
                double d = rawX - this.zzs;
                double d2 = rawY - this.zzt;
                this.zzk += Math.sqrt((d2 * d2) + (d * d));
                this.zzs = rawX;
                this.zzt = rawY;
            }
            int action2 = motionEvent.getAction();
            if (action2 != 0) {
                try {
                    if (action2 == 1) {
                        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                        this.zzb = motionEventObtain;
                        this.zzc.add(motionEventObtain);
                        if (this.zzc.size() > 6) {
                            ((MotionEvent) this.zzc.remove()).recycle();
                        }
                        this.zzf++;
                        this.zzh = zza(new Throwable().getStackTrace());
                    } else if (action2 == 2) {
                        this.zze += (long) (motionEvent.getHistorySize() + 1);
                        zzawf zzawfVarZzj = zzj(motionEvent);
                        Long l2 = zzawfVarZzj.zzd;
                        if (l2 != null && zzawfVarZzj.zzg != null) {
                            this.zzi = l2.longValue() + zzawfVarZzj.zzg.longValue() + this.zzi;
                        }
                        if (this.zzq != null && (l = zzawfVarZzj.zze) != null && zzawfVarZzj.zzh != null) {
                            this.zzj = l.longValue() + zzawfVarZzj.zzh.longValue() + this.zzj;
                        }
                    } else if (action2 == 3) {
                        this.zzg++;
                    }
                } catch (zzavt unused) {
                }
            } else {
                this.zzl = motionEvent.getX();
                this.zzm = motionEvent.getY();
                this.zzn = motionEvent.getRawX();
                this.zzo = motionEvent.getRawY();
                this.zzd++;
            }
            this.zzp = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final synchronized void zzl(int i, int i2, int i3) {
        try {
            if (this.zzb != null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzcE)).booleanValue()) {
                    zzm();
                } else {
                    this.zzb.recycle();
                }
            }
            DisplayMetrics displayMetrics = this.zzq;
            if (displayMetrics != null) {
                float f = displayMetrics.density;
                this.zzb = MotionEvent.obtain(0L, i3, 1, i * f, i2 * f, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            } else {
                this.zzb = null;
            }
            this.zzp = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        zzavv zzavvVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzcT)).booleanValue() || (zzavvVar = this.zzr) == null) {
            return;
        }
        zzavvVar.zzb(Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public void zzo(View view) {
    }
}
