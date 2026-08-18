package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.view.View;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfmn {
    private final HashMap zza = new HashMap();
    private final HashMap zzb = new HashMap();
    private final HashMap zzc = new HashMap();
    private final HashSet zzd = new HashSet();
    private final HashSet zze = new HashSet();
    private final HashSet zzf = new HashSet();
    private final HashMap zzg = new HashMap();
    private final HashSet zzh = new HashSet();
    private final Map zzi = new WeakHashMap();
    private boolean zzj;

    public final View zza(String str) {
        return (View) this.zzc.get(str);
    }

    public final zzfmm zzb(View view) {
        zzfmm zzfmmVar = (zzfmm) this.zzb.get(view);
        if (zzfmmVar != null) {
            this.zzb.remove(view);
        }
        return zzfmmVar;
    }

    public final String zzc(String str) {
        return (String) this.zzg.get(str);
    }

    public final String zzd(View view) {
        if (this.zza.size() == 0) {
            return null;
        }
        String str = (String) this.zza.get(view);
        if (str != null) {
            this.zza.remove(view);
        }
        return str;
    }

    public final HashSet zze() {
        return this.zzf;
    }

    public final HashSet zzf() {
        return this.zze;
    }

    public final void zzg() {
        this.zza.clear();
        this.zzb.clear();
        this.zzc.clear();
        this.zzd.clear();
        this.zze.clear();
        this.zzf.clear();
        this.zzg.clear();
        this.zzj = false;
        this.zzh.clear();
    }

    public final void zzh() {
        this.zzj = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzi() {
        Boolean bool;
        Activity activity;
        zzflk zzflkVarZza = zzflk.zza();
        if (zzflkVarZza != null) {
            for (zzfkt zzfktVar : zzflkVarZza.zzb()) {
                View viewZzf = zzfktVar.zzf();
                if (zzfktVar.zzj()) {
                    String strZzh = zzfktVar.zzh();
                    if (viewZzf != null) {
                        boolean zIsInPictureInPictureMode = false;
                        String str = null;
                        if (Build.VERSION.SDK_INT >= 24) {
                            Context context = viewZzf.getContext();
                            while (true) {
                                if (!(context instanceof ContextWrapper)) {
                                    activity = null;
                                    break;
                                } else {
                                    if (context instanceof Activity) {
                                        activity = (Activity) context;
                                        break;
                                    }
                                    context = ((ContextWrapper) context).getBaseContext();
                                }
                            }
                            if (activity != null) {
                                zIsInPictureInPictureMode = activity.isInPictureInPictureMode();
                            }
                        }
                        if (zIsInPictureInPictureMode) {
                            this.zzh.add(strZzh);
                        }
                        if (viewZzf.isAttachedToWindow()) {
                            if (viewZzf.hasWindowFocus()) {
                                this.zzi.remove(viewZzf);
                                bool = Boolean.FALSE;
                            } else if (this.zzi.containsKey(viewZzf)) {
                                bool = (Boolean) this.zzi.get(viewZzf);
                            } else {
                                Map map = this.zzi;
                                Boolean bool2 = Boolean.FALSE;
                                map.put(viewZzf, bool2);
                                bool = bool2;
                            }
                            if (!bool.booleanValue() || zIsInPictureInPictureMode) {
                                HashSet hashSet = new HashSet();
                                View view = viewZzf;
                                while (true) {
                                    if (view == null) {
                                        this.zzd.addAll(hashSet);
                                        break;
                                    }
                                    String strZza = zzfml.zza(view);
                                    if (strZza != null) {
                                        str = strZza;
                                        break;
                                    } else {
                                        hashSet.add(view);
                                        Object parent = view.getParent();
                                        view = parent instanceof View ? (View) parent : null;
                                    }
                                }
                            } else {
                                str = "noWindowFocus";
                            }
                        } else {
                            str = "notAttached";
                        }
                        if (str == null) {
                            this.zze.add(strZzh);
                            this.zza.put(viewZzf, strZzh);
                            for (zzfln zzflnVar : zzfktVar.zzi()) {
                                View view2 = (View) zzflnVar.zzb().get();
                                if (view2 != null) {
                                    zzfmm zzfmmVar = (zzfmm) this.zzb.get(view2);
                                    if (zzfmmVar != null) {
                                        zzfmmVar.zzc(zzfktVar.zzh());
                                    } else {
                                        this.zzb.put(view2, new zzfmm(zzflnVar, zzfktVar.zzh()));
                                    }
                                }
                            }
                        } else if (str != "noWindowFocus") {
                            this.zzf.add(strZzh);
                            this.zzc.put(strZzh, viewZzf);
                            this.zzg.put(strZzh, str);
                        }
                    } else {
                        this.zzf.add(strZzh);
                        this.zzg.put(strZzh, "noAdView");
                    }
                }
            }
        }
    }

    public final boolean zzj(String str) {
        return this.zzh.contains(str);
    }

    public final boolean zzk(View view) {
        if (!this.zzi.containsKey(view)) {
            return true;
        }
        this.zzi.put(view, Boolean.TRUE);
        return false;
    }

    public final int zzl(View view) {
        if (this.zzd.contains(view)) {
            return 1;
        }
        return this.zzj ? 2 : 3;
    }
}
