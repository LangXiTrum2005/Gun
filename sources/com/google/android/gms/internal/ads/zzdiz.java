package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
public final class zzdiz extends zzbgf implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzdkd {
    private final WeakReference zza;
    private final Map zzb = new HashMap();
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();
    private zzdia zze;
    private zzayl zzf;

    public zzdiz(View view, HashMap map, HashMap map2) {
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        com.google.android.gms.ads.internal.zzv.zzy();
        zzcaj.zza(view, this);
        com.google.android.gms.ads.internal.zzv.zzy();
        zzcaj.zzb(view, this);
        this.zza = new WeakReference(view);
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            View view2 = (View) entry.getValue();
            if (view2 != null) {
                this.zzb.put(str, new WeakReference(view2));
                if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
                    view2.setOnTouchListener(this);
                    view2.setClickable(true);
                    view2.setOnClickListener(this);
                }
            }
        }
        this.zzd.putAll(this.zzb);
        for (Map.Entry entry2 : map2.entrySet()) {
            View view3 = (View) entry2.getValue();
            if (view3 != null) {
                this.zzc.put((String) entry2.getKey(), new WeakReference(view3));
                view3.setOnTouchListener(this);
                view3.setClickable(false);
            }
        }
        this.zzd.putAll(this.zzc);
        this.zzf = new zzayl(view.getContext(), view);
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        zzdia zzdiaVar = this.zze;
        if (zzdiaVar != null) {
            zzdiaVar.zzD(view, zzf(), zzl(), zzm(), true);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        zzdia zzdiaVar = this.zze;
        if (zzdiaVar != null) {
            zzdiaVar.zzB(zzf(), zzl(), zzm(), zzdia.zzY(zzf()));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        zzdia zzdiaVar = this.zze;
        if (zzdiaVar != null) {
            zzdiaVar.zzB(zzf(), zzl(), zzm(), zzdia.zzY(zzf()));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        zzdia zzdiaVar = this.zze;
        if (zzdiaVar != null) {
            zzdiaVar.zzL(view, motionEvent, zzf());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbgg
    public final synchronized void zzb(IObjectWrapper iObjectWrapper) {
        try {
            if (this.zze != null) {
                Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
                if (!(objUnwrap instanceof View)) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
                }
                this.zze.zzN((View) objUnwrap);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgg
    public final synchronized void zzc(IObjectWrapper iObjectWrapper) {
        Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(objUnwrap instanceof zzdia)) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        zzdia zzdiaVar = this.zze;
        if (zzdiaVar != null) {
            zzdiaVar.zzT(this);
        }
        zzdia zzdiaVar2 = (zzdia) objUnwrap;
        if (!zzdiaVar2.zzU()) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
            return;
        }
        this.zze = zzdiaVar2;
        zzdiaVar2.zzS(this);
        this.zze.zzK(zzf());
    }

    @Override // com.google.android.gms.internal.ads.zzbgg
    public final synchronized void zzd() {
        zzdia zzdiaVar = this.zze;
        if (zzdiaVar != null) {
            zzdiaVar.zzT(this);
            this.zze = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdkd
    @Nullable
    public final View zzf() {
        return (View) this.zza.get();
    }

    @Override // com.google.android.gms.internal.ads.zzdkd
    @Nullable
    public final synchronized View zzg(String str) {
        WeakReference weakReference = (WeakReference) this.zzd.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    @Override // com.google.android.gms.internal.ads.zzdkd
    @Nullable
    public final FrameLayout zzh() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdkd
    public final zzayl zzi() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzdkd
    @Nullable
    public final synchronized IObjectWrapper zzj() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdkd
    public final synchronized String zzk() {
        return "1007";
    }

    @Override // com.google.android.gms.internal.ads.zzdkd
    public final synchronized Map zzl() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzdkd
    public final synchronized Map zzm() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdkd
    @Nullable
    public final synchronized Map zzn() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdkd
    @Nullable
    public final synchronized JSONObject zzo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdkd
    @Nullable
    public final synchronized JSONObject zzp() {
        zzdia zzdiaVar = this.zze;
        if (zzdiaVar == null) {
            return null;
        }
        return zzdiaVar.zzj(zzf(), zzl(), zzm());
    }

    @Override // com.google.android.gms.internal.ads.zzdkd
    public final synchronized void zzq(String str, View view, boolean z) {
        this.zzd.put(str, new WeakReference(view));
        if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
            this.zzb.put(str, new WeakReference(view));
            view.setClickable(true);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        }
    }
}
