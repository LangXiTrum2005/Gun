package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdkb {
    private final zzdow zza;
    private final zzdnl zzb;
    private ViewTreeObserver.OnScrollChangedListener zzc = null;

    public zzdkb(zzdow zzdowVar, zzdnl zzdnlVar) {
        this.zza = zzdowVar;
        this.zzb = zzdnlVar;
    }

    private static final int zzf(Context context, String str, int i) {
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        com.google.android.gms.ads.internal.client.zzbc.zzb();
        return com.google.android.gms.ads.internal.util.client.zzf.zzx(context, i);
    }

    public final View zza(@NonNull final View view, @NonNull final WindowManager windowManager) throws zzcfj {
        zzcex zzcexVarZza = this.zza.zza(com.google.android.gms.ads.internal.client.zzs.zzc(), null, null);
        zzcexVarZza.zzF().setVisibility(4);
        zzcexVarZza.zzF().setContentDescription("policy_validator");
        zzcexVarZza.zzag("/sendMessageToSdk", new zzbjp() { // from class: com.google.android.gms.internal.ads.zzdjv
            @Override // com.google.android.gms.internal.ads.zzbjp
            public final void zza(Object obj, Map map) {
                this.zza.zzb((zzcex) obj, map);
            }
        });
        zzcexVarZza.zzag("/hideValidatorOverlay", new zzbjp() { // from class: com.google.android.gms.internal.ads.zzdjw
            @Override // com.google.android.gms.internal.ads.zzbjp
            public final void zza(Object obj, Map map) {
                this.zza.zzc(windowManager, view, (zzcex) obj, map);
            }
        });
        zzcexVarZza.zzag("/open", new zzbkb(null, null, null, null, null));
        this.zzb.zzm(new WeakReference(zzcexVarZza), "/loadNativeAdPolicyViolations", new zzbjp() { // from class: com.google.android.gms.internal.ads.zzdjx
            @Override // com.google.android.gms.internal.ads.zzbjp
            public final void zza(Object obj, Map map) {
                this.zza.zzd(view, windowManager, (zzcex) obj, map);
            }
        });
        this.zzb.zzm(new WeakReference(zzcexVarZza), "/showValidatorOverlay", new zzbjp() { // from class: com.google.android.gms.internal.ads.zzdjy
            @Override // com.google.android.gms.internal.ads.zzbjp
            public final void zza(Object obj, Map map) {
                com.google.android.gms.ads.internal.util.client.zzo.zze("Show native ad policy validator overlay.");
                ((zzcex) obj).zzF().setVisibility(0);
            }
        });
        return zzcexVarZza.zzF();
    }

    public final /* synthetic */ void zzb(zzcex zzcexVar, Map map) {
        this.zzb.zzj("sendMessageToNativeJs", map);
    }

    public final /* synthetic */ void zzc(WindowManager windowManager, View view, zzcex zzcexVar, Map map) {
        com.google.android.gms.ads.internal.util.client.zzo.zze("Hide native ad policy validator overlay.");
        zzcexVar.zzF().setVisibility(8);
        if (zzcexVar.zzF().getWindowToken() != null) {
            windowManager.removeView(zzcexVar.zzF());
        }
        zzcexVar.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.zzc == null || viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.removeOnScrollChangedListener(this.zzc);
    }

    public final /* synthetic */ void zzd(final View view, final WindowManager windowManager, final zzcex zzcexVar, final Map map) {
        zzcexVar.zzN().zzC(new zzcgn() { // from class: com.google.android.gms.internal.ads.zzdjz
            @Override // com.google.android.gms.internal.ads.zzcgn
            public final void zza(boolean z, int i, String str, String str2) {
                this.zza.zze(map, z, i, str, str2);
            }
        });
        if (map == null) {
            return;
        }
        Context context = view.getContext();
        int iZzf = zzf(context, (String) map.get("validator_width"), ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzhV)).intValue());
        int iZzf2 = zzf(context, (String) map.get("validator_height"), ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzhW)).intValue());
        int iZzf3 = zzf(context, (String) map.get("validator_x"), 0);
        int iZzf4 = zzf(context, (String) map.get("validator_y"), 0);
        zzcexVar.zzaj(zzcgr.zzb(iZzf, iZzf2));
        try {
            zzcexVar.zzG().getSettings().setUseWideViewPort(((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzhX)).booleanValue());
            zzcexVar.zzG().getSettings().setLoadWithOverviewMode(((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzhY)).booleanValue());
        } catch (NullPointerException unused) {
        }
        final WindowManager.LayoutParams layoutParamsZzb = com.google.android.gms.ads.internal.util.zzbv.zzb();
        layoutParamsZzb.x = iZzf3;
        layoutParamsZzb.y = iZzf4;
        windowManager.updateViewLayout(zzcexVar.zzF(), layoutParamsZzb);
        final String str = (String) map.get(AdUnitActivity.EXTRA_ORIENTATION);
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            final int i = (("1".equals(str) || "2".equals(str)) ? rect.bottom : rect.top) - iZzf4;
            this.zzc = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.gms.internal.ads.zzdka
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    Rect rect2 = new Rect();
                    if (view.getGlobalVisibleRect(rect2)) {
                        zzcex zzcexVar2 = zzcexVar;
                        if (zzcexVar2.zzF().getWindowToken() == null) {
                            return;
                        }
                        int i2 = i;
                        WindowManager.LayoutParams layoutParams = layoutParamsZzb;
                        String str2 = str;
                        if ("1".equals(str2) || "2".equals(str2)) {
                            layoutParams.y = rect2.bottom - i2;
                        } else {
                            layoutParams.y = rect2.top - i2;
                        }
                        windowManager.updateViewLayout(zzcexVar2.zzF(), layoutParams);
                    }
                }
            };
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnScrollChangedListener(this.zzc);
            }
        }
        String str2 = (String) map.get("overlay_url");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        zzcexVar.loadUrl(str2);
    }

    public final /* synthetic */ void zze(Map map, boolean z, int i, String str, String str2) {
        HashMap mapV = AbstractC3950lJ.v("messageType", "validatorHtmlLoaded");
        mapV.put("id", (String) map.get("id"));
        this.zzb.zzj("sendMessageToNativeJs", mapV);
    }
}
