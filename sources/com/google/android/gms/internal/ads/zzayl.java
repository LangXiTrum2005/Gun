package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class zzayl implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {
    private static final long zzc = ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzbv)).longValue();

    @Nullable
    @VisibleForTesting
    BroadcastReceiver zza;
    final WeakReference zzb;
    private final Context zzd;
    private Application zze;
    private final WindowManager zzf;
    private final PowerManager zzg;
    private final KeyguardManager zzh;
    private WeakReference zzi;
    private zzayx zzj;
    private final com.google.android.gms.ads.internal.util.zzbx zzk = new com.google.android.gms.ads.internal.util.zzbx(zzc);
    private boolean zzl = false;
    private int zzm = -1;
    private final HashSet zzn = new HashSet();
    private final DisplayMetrics zzo;
    private final Rect zzp;

    public zzayl(Context context, View view) {
        Context applicationContext = context.getApplicationContext();
        this.zzd = applicationContext;
        WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
        this.zzf = windowManager;
        this.zzg = (PowerManager) applicationContext.getSystemService("power");
        this.zzh = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.zze = application;
            this.zzj = new zzayx(application, this);
        }
        this.zzo = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.zzp = rect;
        rect.right = windowManager.getDefaultDisplay().getWidth();
        rect.bottom = windowManager.getDefaultDisplay().getHeight();
        WeakReference weakReference = this.zzb;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            zzm(view2);
        }
        this.zzb = new WeakReference(view);
        if (view != null) {
            if (view.isAttachedToWindow()) {
                zzl(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    private final int zzh(int i) {
        return (int) (i / this.zzo.density);
    }

    private final void zzi(Activity activity, int i) {
        Window window;
        if (this.zzb == null || (window = activity.getWindow()) == null) {
            return;
        }
        WeakReference weakReference = this.zzb;
        View viewPeekDecorView = window.peekDecorView();
        View view = (View) weakReference.get();
        if (view == null || viewPeekDecorView == null || view.getRootView() != viewPeekDecorView.getRootView()) {
            return;
        }
        this.zzm = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:54:0x0135  */
    /* JADX WARN: Code duplicated, block: B:56:0x013a  */
    /* JADX WARN: Code duplicated, block: B:57:0x013c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0140  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v24, types: [int] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r32v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r33v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8, types: [boolean] */
    public final void zzj(int i) {
        WeakReference weakReference;
        View view;
        boolean globalVisibleRect;
        boolean localVisibleRect;
        ?? EmptyList;
        ?? r3;
        boolean z;
        if (this.zzn.isEmpty() || (weakReference = this.zzb) == null) {
            return;
        }
        View view2 = (View) weakReference.get();
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        Rect rect3 = new Rect();
        Rect rect4 = new Rect();
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        if (view2 != null) {
            globalVisibleRect = view2.getGlobalVisibleRect(rect2);
            localVisibleRect = view2.getLocalVisibleRect(rect3);
            view2.getHitRect(rect4);
            try {
                view2.getLocationOnScreen(iArr);
                view2.getLocationInWindow(iArr2);
            } catch (Exception e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Failure getting view location.", e);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzeU)).booleanValue()) {
                rect.left = iArr2[0];
                rect.top = iArr2[1];
            } else {
                rect.left = iArr[0];
                rect.top = iArr[1];
            }
            rect.right = view2.getWidth() + rect.left;
            rect.bottom = view2.getHeight() + rect.top;
            view = view2;
        } else {
            view = null;
            globalVisibleRect = false;
            localVisibleRect = false;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzby)).booleanValue() || view == null) {
            EmptyList = Collections.emptyList();
        } else {
            try {
                EmptyList = new ArrayList();
                ViewParent parent = view.getParent();
                while (parent instanceof View) {
                    View view3 = (View) parent;
                    Rect rect5 = new Rect();
                    if (view3.isScrollContainer() && view3.getGlobalVisibleRect(rect5)) {
                        EmptyList.add(zza(rect5));
                    }
                    parent = parent.getParent();
                }
            } catch (Exception e2) {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e2, "PositionWatcher.getParentScrollViewRects");
                EmptyList = Collections.emptyList();
            }
        }
        ?? r33 = EmptyList;
        int windowVisibility = view != null ? view.getWindowVisibility() : 8;
        int i2 = this.zzm;
        if (i2 != -1) {
            windowVisibility = i2;
        }
        com.google.android.gms.ads.internal.zzv.zzq();
        long jZzx = com.google.android.gms.ads.internal.util.zzs.zzx(view);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzku)).booleanValue()) {
            if (view2 != null) {
                PowerManager powerManager = this.zzg;
                KeyguardManager keyguardManager = this.zzh;
                com.google.android.gms.ads.internal.zzv.zzq();
                if (com.google.android.gms.ads.internal.util.zzs.zzS(view, powerManager, keyguardManager)) {
                    if (!globalVisibleRect) {
                        r3 = 0;
                        globalVisibleRect = false;
                    } else if (localVisibleRect) {
                        if (jZzx < ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkx)).intValue() || windowVisibility != 0) {
                            z = false;
                        } else {
                            z = true;
                            windowVisibility = 0;
                        }
                        globalVisibleRect = true;
                        localVisibleRect = true;
                        r3 = z;
                    } else {
                        r3 = 0;
                        globalVisibleRect = true;
                        localVisibleRect = false;
                    }
                }
            }
            r3 = 0;
        } else {
            if (view2 != null) {
                PowerManager powerManager2 = this.zzg;
                KeyguardManager keyguardManager2 = this.zzh;
                com.google.android.gms.ads.internal.zzv.zzq();
                if (com.google.android.gms.ads.internal.util.zzs.zzS(view, powerManager2, keyguardManager2)) {
                    if (!globalVisibleRect) {
                        r3 = 0;
                        globalVisibleRect = false;
                    } else if (localVisibleRect) {
                        if (windowVisibility == 0) {
                            z = true;
                            windowVisibility = 0;
                        } else {
                            z = false;
                        }
                        globalVisibleRect = true;
                        localVisibleRect = true;
                        r3 = z;
                    } else {
                        r3 = 0;
                        globalVisibleRect = true;
                        localVisibleRect = false;
                    }
                }
            }
            r3 = 0;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkz)).booleanValue()) {
            PowerManager powerManager3 = this.zzg;
            KeyguardManager keyguardManager3 = this.zzh;
            com.google.android.gms.ads.internal.zzv.zzq();
            int i3 = true != com.google.android.gms.ads.internal.util.zzs.zzS(view, powerManager3, keyguardManager3) ? 0 : 64;
            int i4 = true != globalVisibleRect ? 0 : 8;
            int i5 = true != localVisibleRect ? 0 : 16;
            int i6 = windowVisibility == 0 ? 128 : 0;
            int i7 = jZzx >= ((long) ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkx)).intValue()) ? 32 : 0;
            com.google.android.gms.ads.internal.zzv.zzq();
            com.google.android.gms.ads.internal.util.zzs.zzK(view, i7 | i6 | i3 | i4 | i5 | r3, null);
        }
        if (i == 1 && !this.zzk.zzb() && r3 == this.zzl) {
            return;
        }
        if (r3 == 0 && !this.zzl) {
            if (i == 1) {
                return;
            }
        }
        zzayj zzayjVar = new zzayj(com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime(), this.zzg.isScreenOn(), view != null && view.isAttachedToWindow(), view != null ? view.getWindowVisibility() : 8, zza(this.zzp), zza(rect), zza(rect2), globalVisibleRect, zza(rect3), localVisibleRect, jZzx, zza(rect4), this.zzo.density, r3, r33);
        Iterator it = this.zzn.iterator();
        while (it.hasNext()) {
            ((zzayk) it.next()).zzdn(zzayjVar);
        }
        this.zzl = r3;
    }

    private final void zzk() {
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzayh
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd();
            }
        });
    }

    private final void zzl(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.zzi = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.zza == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.zza = new zzayi(this);
            com.google.android.gms.ads.internal.zzv.zzw().zzc(this.zzd, this.zza, intentFilter);
        }
        Application application = this.zze;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.zzj);
            } catch (Exception e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Error registering activity lifecycle callbacks.", e);
            }
        }
    }

    private final void zzm(View view) {
        try {
            WeakReference weakReference = this.zzi;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.zzi = null;
            }
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error while unregistering listeners from the last ViewTreeObserver.", e);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error while unregistering listeners from the ViewTreeObserver.", e2);
        }
        if (this.zza != null) {
            try {
                com.google.android.gms.ads.internal.zzv.zzw().zzd(this.zzd, this.zza);
            } catch (IllegalStateException e3) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Failed trying to unregister the receiver", e3);
            } catch (Exception e4) {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e4, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.zza = null;
        }
        Application application = this.zze;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.zzj);
            } catch (Exception e5) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Error registering activity lifecycle callbacks.", e5);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zzi(activity, 0);
        zzj(3);
        zzk();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        zzj(3);
        zzk();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        zzi(activity, 4);
        zzj(3);
        zzk();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        zzi(activity, 0);
        zzj(3);
        zzk();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zzj(3);
        zzk();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        zzi(activity, 0);
        zzj(3);
        zzk();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        zzj(3);
        zzk();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        zzj(2);
        zzk();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        zzj(1);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.zzm = -1;
        zzl(view);
        zzj(3);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.zzm = -1;
        zzj(3);
        zzk();
        zzm(view);
    }

    public final Rect zza(Rect rect) {
        return new Rect(zzh(rect.left), zzh(rect.top), zzh(rect.right), zzh(rect.bottom));
    }

    public final void zzc(zzayk zzaykVar) {
        this.zzn.add(zzaykVar);
        zzj(3);
    }

    public final /* synthetic */ void zzd() {
        zzj(3);
    }

    public final void zze(zzayk zzaykVar) {
        this.zzn.remove(zzaykVar);
    }

    public final void zzf() {
        this.zzk.zza(zzc);
    }

    public final void zzg(long j) {
        this.zzk.zza(j);
    }
}
