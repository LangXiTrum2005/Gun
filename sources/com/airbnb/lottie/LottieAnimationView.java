package com.airbnb.lottie;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RawRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.color.utilities.Contrast;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.R;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.activity.MainActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4004lw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5187zP;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.B6;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3160cK;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3170cU;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3681iC;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3775jK;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3951lK;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4092mw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4215oK;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4738uG;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4948wh;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ChoreographerFrameCallbackC4127nK;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC3249dK;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC5108yY;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.GJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.HJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3072bK;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3513gK;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3593hC;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3689iK;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Jb0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.KJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.LJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.MJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.OJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Q60;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RunnableC2928Zc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.SW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Wm0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.XJ;
import java.io.ByteArrayInputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public class LottieAnimationView extends AppCompatImageView {
    public static final HJ n = new HJ();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LJ f53a;
    public final LJ b;
    public InterfaceC3513gK c;
    public int d;
    public final C3160cK e;
    public String f;
    public int g;
    public boolean h;
    public boolean i;
    public boolean j;
    public final HashSet k;
    public final HashSet l;
    public C3951lK m;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f54a;
        public int b;
        public float c;
        public boolean d;
        public String e;
        public int f;
        public int g;

        public /* synthetic */ SavedState(Parcel parcel, JJ jj) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f54a);
            parcel.writeFloat(this.c);
            parcel.writeInt(this.d ? 1 : 0);
            parcel.writeString(this.e);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f54a = parcel.readString();
            this.c = parcel.readFloat();
            this.d = parcel.readInt() == 1;
            this.e = parcel.readString();
            this.f = parcel.readInt();
            this.g = parcel.readInt();
        }
    }

    public LottieAnimationView(MainActivity mainActivity) {
        super(mainActivity);
        this.f53a = new LJ(this, 1);
        this.b = new LJ(this, 0);
        this.d = 0;
        this.e = new C3160cK();
        this.h = false;
        this.i = false;
        this.j = true;
        this.k = new HashSet();
        this.l = new HashSet();
        d(null);
    }

    private void setCompositionTask(C3951lK c3951lK) {
        C3775jK c3775jK = c3951lK.d;
        C3160cK c3160cK = this.e;
        if (c3775jK != null && c3160cK == getDrawable() && c3160cK.f4216a == c3775jK.f4549a) {
            return;
        }
        this.k.add(KJ.f3310a);
        this.e.d();
        c();
        c3951lK.b(this.f53a);
        c3951lK.a(this.b);
        this.m = c3951lK;
    }

    public final void a(Animator.AnimatorListener animatorListener) {
        this.e.b.addListener(animatorListener);
    }

    public final void b() {
        this.i = false;
        this.k.add(KJ.f);
        C3160cK c3160cK = this.e;
        c3160cK.f.clear();
        c3160cK.b.cancel();
        if (c3160cK.isVisible()) {
            return;
        }
        c3160cK.P = 1;
    }

    public final void c() {
        C3951lK c3951lK = this.m;
        if (c3951lK != null) {
            LJ lj = this.f53a;
            synchronized (c3951lK) {
                c3951lK.f4643a.remove(lj);
            }
            this.m.e(this.b);
        }
    }

    public final void d(AttributeSet attributeSet) {
        String string;
        boolean zRemove;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, SW.f3717a, R.attr.lottieAnimationViewStyle, 0);
        this.j = typedArrayObtainStyledAttributes.getBoolean(2, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(9);
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(19);
        if (zHasValue && zHasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (zHasValue) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(14, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (zHasValue2) {
            String string2 = typedArrayObtainStyledAttributes.getString(9);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (zHasValue3 && (string = typedArrayObtainStyledAttributes.getString(19)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(typedArrayObtainStyledAttributes.getResourceId(8, 0));
        if (typedArrayObtainStyledAttributes.getBoolean(1, false)) {
            this.i = true;
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(12, false);
        C3160cK c3160cK = this.e;
        if (z) {
            c3160cK.b.setRepeatCount(-1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(17)) {
            setRepeatMode(typedArrayObtainStyledAttributes.getInt(17, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(16)) {
            setRepeatCount(typedArrayObtainStyledAttributes.getInt(16, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            setSpeed(typedArrayObtainStyledAttributes.getFloat(18, 1.0f));
        }
        if (typedArrayObtainStyledAttributes.hasValue(4)) {
            setClipToCompositionBounds(typedArrayObtainStyledAttributes.getBoolean(4, true));
        }
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            setClipTextToBoundingBox(typedArrayObtainStyledAttributes.getBoolean(3, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setDefaultFontFileExtension(typedArrayObtainStyledAttributes.getString(6));
        }
        setImageAssetsFolder(typedArrayObtainStyledAttributes.getString(11));
        boolean zHasValue4 = typedArrayObtainStyledAttributes.hasValue(13);
        float f = typedArrayObtainStyledAttributes.getFloat(13, 0.0f);
        if (zHasValue4) {
            this.k.add(KJ.b);
        }
        c3160cK.u(f);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(7, false);
        EnumC3249dK enumC3249dK = EnumC3249dK.MergePathsApi19;
        Wm0 wm0 = c3160cK.l;
        if (z2) {
            wm0.getClass();
            zRemove = ((HashSet) wm0.b).add(enumC3249dK);
        } else {
            zRemove = ((HashSet) wm0.b).remove(enumC3249dK);
        }
        if (c3160cK.f4216a != null && zRemove) {
            c3160cK.c();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            c3160cK.a(new C4738uG("**"), InterfaceC3689iK.F, new C4215oK(new Q60(AppCompatResources.getColorStateList(getContext(), typedArrayObtainStyledAttributes.getResourceId(5, -1)).getDefaultColor(), PorterDuff.Mode.SRC_ATOP)));
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            int i = typedArrayObtainStyledAttributes.getInt(15, 0);
            if (i >= EnumC5108yY.values().length) {
                i = 0;
            }
            setRenderMode(EnumC5108yY.values()[i]);
        }
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            int i2 = typedArrayObtainStyledAttributes.getInt(0, 0);
            if (i2 >= EnumC5108yY.values().length) {
                i2 = 0;
            }
            setAsyncUpdates(B6.values()[i2]);
        }
        setIgnoreDisabledSystemAnimations(typedArrayObtainStyledAttributes.getBoolean(10, false));
        if (typedArrayObtainStyledAttributes.hasValue(20)) {
            setUseCompositionFrameRate(typedArrayObtainStyledAttributes.getBoolean(20, false));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void e() {
        this.k.add(KJ.f);
        this.e.l();
    }

    public B6 getAsyncUpdates() {
        B6 b6 = this.e.J;
        return b6 != null ? b6 : B6.f2856a;
    }

    public boolean getAsyncUpdatesEnabled() {
        B6 b6 = this.e.J;
        if (b6 == null) {
            b6 = B6.f2856a;
        }
        return b6 == B6.b;
    }

    public boolean getClipTextToBoundingBox() {
        return this.e.t;
    }

    public boolean getClipToCompositionBounds() {
        return this.e.n;
    }

    @Nullable
    public MJ getComposition() {
        Drawable drawable = getDrawable();
        C3160cK c3160cK = this.e;
        if (drawable == c3160cK) {
            return c3160cK.f4216a;
        }
        return null;
    }

    public long getDuration() {
        MJ composition = getComposition();
        if (composition != null) {
            return (long) composition.b();
        }
        return 0L;
    }

    public int getFrame() {
        return (int) this.e.b.h;
    }

    @Nullable
    public String getImageAssetsFolder() {
        return this.e.h;
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.e.m;
    }

    public float getMaxFrame() {
        return this.e.b.f();
    }

    public float getMinFrame() {
        return this.e.b.g();
    }

    @Nullable
    public C3170cU getPerformanceTracker() {
        MJ mj = this.e.f4216a;
        if (mj != null) {
            return mj.f3401a;
        }
        return null;
    }

    @FloatRange(from = 0.0d, to = Contrast.RATIO_MIN)
    public float getProgress() {
        return this.e.b.e();
    }

    public EnumC5108yY getRenderMode() {
        return this.e.v ? EnumC5108yY.c : EnumC5108yY.b;
    }

    public int getRepeatCount() {
        return this.e.b.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.e.b.getRepeatMode();
    }

    public float getSpeed() {
        return this.e.b.d;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if (drawable instanceof C3160cK) {
            boolean z = ((C3160cK) drawable).v;
            EnumC5108yY enumC5108yY = EnumC5108yY.c;
            if ((z ? enumC5108yY : EnumC5108yY.b) == enumC5108yY) {
                this.e.invalidateSelf();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        C3160cK c3160cK = this.e;
        if (drawable2 == c3160cK) {
            super.invalidateDrawable(c3160cK);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.i) {
            return;
        }
        this.e.l();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f = savedState.f54a;
        KJ kj = KJ.f3310a;
        HashSet hashSet = this.k;
        if (!hashSet.contains(kj) && !TextUtils.isEmpty(this.f)) {
            setAnimation(this.f);
        }
        this.g = savedState.b;
        if (!hashSet.contains(kj) && (i = this.g) != 0) {
            setAnimation(i);
        }
        if (!hashSet.contains(KJ.b)) {
            this.e.u(savedState.c);
        }
        if (!hashSet.contains(KJ.f) && savedState.d) {
            e();
        }
        if (!hashSet.contains(KJ.e)) {
            setImageAssetsFolder(savedState.e);
        }
        if (!hashSet.contains(KJ.c)) {
            setRepeatMode(savedState.f);
        }
        if (hashSet.contains(KJ.d)) {
            return;
        }
        setRepeatCount(savedState.g);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f54a = this.f;
        savedState.b = this.g;
        C3160cK c3160cK = this.e;
        savedState.c = c3160cK.b.e();
        boolean zIsVisible = c3160cK.isVisible();
        ChoreographerFrameCallbackC4127nK choreographerFrameCallbackC4127nK = c3160cK.b;
        if (zIsVisible) {
            z = choreographerFrameCallbackC4127nK.m;
        } else {
            int i = c3160cK.P;
            z = i == 2 || i == 3;
        }
        savedState.d = z;
        savedState.e = c3160cK.h;
        savedState.f = choreographerFrameCallbackC4127nK.getRepeatMode();
        savedState.g = choreographerFrameCallbackC4127nK.getRepeatCount();
        return savedState;
    }

    public void setAnimation(@RawRes final int i) {
        C3951lK c3951lKA;
        C3951lK c3951lK;
        this.g = i;
        final String str = null;
        this.f = null;
        if (isInEditMode()) {
            c3951lK = new C3951lK(new Callable() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IJ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    LottieAnimationView lottieAnimationView = this.f3211a;
                    boolean z = lottieAnimationView.j;
                    int i2 = i;
                    if (!z) {
                        return RJ.e(lottieAnimationView.getContext(), i2, null);
                    }
                    Context context = lottieAnimationView.getContext();
                    return RJ.e(context, i2, RJ.j(context, i2));
                }
            }, true);
        } else {
            if (this.j) {
                Context context = getContext();
                final String strJ = RJ.j(context, i);
                final WeakReference weakReference = new WeakReference(context);
                final Context applicationContext = context.getApplicationContext();
                c3951lKA = RJ.a(strJ, new Callable() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.QJ
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Context context2 = (Context) weakReference.get();
                        if (context2 == null) {
                            context2 = applicationContext;
                        }
                        return RJ.e(context2, i, strJ);
                    }
                }, null);
            } else {
                Context context2 = getContext();
                HashMap map = RJ.f3654a;
                final WeakReference weakReference2 = new WeakReference(context2);
                final Context applicationContext2 = context2.getApplicationContext();
                c3951lKA = RJ.a(null, new Callable() { // from class: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.QJ
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Context context3 = (Context) weakReference2.get();
                        if (context3 == null) {
                            context3 = applicationContext2;
                        }
                        return RJ.e(context3, i, str);
                    }
                }, null);
            }
            c3951lK = c3951lKA;
        }
        setCompositionTask(c3951lK);
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes());
        setCompositionTask(RJ.a(null, new GJ(1, byteArrayInputStream, null), new RunnableC2928Zc(byteArrayInputStream, 2)));
    }

    public void setAnimationFromUrl(String str) {
        C3951lK c3951lKA;
        int i = 0;
        Object obj = null;
        if (this.j) {
            Context context = getContext();
            HashMap map = RJ.f3654a;
            String strI = AbstractC3888ke0.i("url_", str);
            c3951lKA = RJ.a(strI, new OJ(context, str, strI, i), null);
        } else {
            c3951lKA = RJ.a(null, new OJ(getContext(), str, obj, i), null);
        }
        setCompositionTask(c3951lKA);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.e.s = z;
    }

    public void setAsyncUpdates(B6 b6) {
        this.e.J = b6;
    }

    public void setCacheComposition(boolean z) {
        this.j = z;
    }

    public void setClipTextToBoundingBox(boolean z) {
        C3160cK c3160cK = this.e;
        if (z != c3160cK.t) {
            c3160cK.t = z;
            c3160cK.invalidateSelf();
        }
    }

    public void setClipToCompositionBounds(boolean z) {
        C3160cK c3160cK = this.e;
        if (z != c3160cK.n) {
            c3160cK.n = z;
            C4948wh c4948wh = c3160cK.o;
            if (c4948wh != null) {
                c4948wh.J = z;
            }
            c3160cK.invalidateSelf();
        }
    }

    public void setComposition(@NonNull MJ mj) {
        C3160cK c3160cK = this.e;
        c3160cK.setCallback(this);
        boolean z = true;
        this.h = true;
        if (c3160cK.f4216a == mj) {
            z = false;
        } else {
            c3160cK.I = true;
            c3160cK.d();
            c3160cK.f4216a = mj;
            c3160cK.c();
            ChoreographerFrameCallbackC4127nK choreographerFrameCallbackC4127nK = c3160cK.b;
            boolean z2 = choreographerFrameCallbackC4127nK.l == null;
            choreographerFrameCallbackC4127nK.l = mj;
            if (z2) {
                choreographerFrameCallbackC4127nK.v(Math.max(choreographerFrameCallbackC4127nK.j, mj.l), Math.min(choreographerFrameCallbackC4127nK.k, mj.m));
            } else {
                choreographerFrameCallbackC4127nK.v((int) mj.l, (int) mj.m);
            }
            float f = choreographerFrameCallbackC4127nK.h;
            choreographerFrameCallbackC4127nK.h = 0.0f;
            choreographerFrameCallbackC4127nK.g = 0.0f;
            choreographerFrameCallbackC4127nK.t((int) f);
            choreographerFrameCallbackC4127nK.l();
            c3160cK.u(choreographerFrameCallbackC4127nK.getAnimatedFraction());
            ArrayList arrayList = c3160cK.f;
            Iterator it = new ArrayList(arrayList).iterator();
            while (it.hasNext()) {
                InterfaceC3072bK interfaceC3072bK = (InterfaceC3072bK) it.next();
                if (interfaceC3072bK != null) {
                    interfaceC3072bK.run();
                }
                it.remove();
            }
            arrayList.clear();
            mj.f3401a.f4224a = c3160cK.q;
            c3160cK.e();
            Drawable.Callback callback = c3160cK.getCallback();
            if (callback instanceof ImageView) {
                ImageView imageView = (ImageView) callback;
                imageView.setImageDrawable(null);
                imageView.setImageDrawable(c3160cK);
            }
        }
        if (this.i) {
            c3160cK.l();
        }
        this.h = false;
        if (getDrawable() != c3160cK || z) {
            if (!z) {
                boolean zJ = c3160cK.j();
                setImageDrawable(null);
                setImageDrawable(c3160cK);
                if (zJ) {
                    c3160cK.n();
                }
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator it2 = this.l.iterator();
            if (it2.hasNext()) {
                AbstractC3950lJ.z(it2.next());
                throw null;
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        C3160cK c3160cK = this.e;
        c3160cK.k = str;
        C4092mw c4092mwI = c3160cK.i();
        if (c4092mwI != null) {
            c4092mwI.f4722a = str;
        }
    }

    public void setFailureListener(@Nullable InterfaceC3513gK interfaceC3513gK) {
        this.c = interfaceC3513gK;
    }

    public void setFallbackResource(@DrawableRes int i) {
        this.d = i;
    }

    public void setFontAssetDelegate(AbstractC4004lw abstractC4004lw) {
        C4092mw c4092mw = this.e.i;
        if (c4092mw != null) {
            c4092mw.f = abstractC4004lw;
        }
    }

    public void setFontMap(@Nullable Map<String, Typeface> map) {
        C3160cK c3160cK = this.e;
        if (map == c3160cK.j) {
            return;
        }
        c3160cK.j = map;
        c3160cK.invalidateSelf();
    }

    public void setFrame(int i) {
        this.e.o(i);
    }

    @Deprecated
    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.e.d = z;
    }

    public void setImageAssetDelegate(InterfaceC3593hC interfaceC3593hC) {
        C3681iC c3681iC = this.e.g;
    }

    public void setImageAssetsFolder(String str) {
        this.e.h = str;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.g = 0;
        this.f = null;
        c();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.g = 0;
        this.f = null;
        c();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        this.g = 0;
        this.f = null;
        c();
        super.setImageResource(i);
    }

    public void setMaintainOriginalImageBounds(boolean z) {
        this.e.m = z;
    }

    public void setMaxFrame(int i) {
        this.e.p(i);
    }

    public void setMaxProgress(@FloatRange(from = 0.0d, to = Contrast.RATIO_MIN) float f) {
        C3160cK c3160cK = this.e;
        MJ mj = c3160cK.f4216a;
        if (mj == null) {
            c3160cK.f.add(new XJ(c3160cK, f, 2));
            return;
        }
        float fE = AbstractC5187zP.e(mj.l, mj.m, f);
        ChoreographerFrameCallbackC4127nK choreographerFrameCallbackC4127nK = c3160cK.b;
        choreographerFrameCallbackC4127nK.v(choreographerFrameCallbackC4127nK.j, fE);
    }

    public void setMinAndMaxFrame(String str) {
        this.e.r(str);
    }

    public void setMinFrame(int i) {
        this.e.s(i);
    }

    public void setMinProgress(float f) {
        C3160cK c3160cK = this.e;
        MJ mj = c3160cK.f4216a;
        if (mj == null) {
            c3160cK.f.add(new XJ(c3160cK, f, 0));
        } else {
            c3160cK.s((int) AbstractC5187zP.e(mj.l, mj.m, f));
        }
    }

    public void setOutlineMasksAndMattes(boolean z) {
        C3160cK c3160cK = this.e;
        if (c3160cK.r == z) {
            return;
        }
        c3160cK.r = z;
        C4948wh c4948wh = c3160cK.o;
        if (c4948wh != null) {
            c4948wh.q(z);
        }
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        C3160cK c3160cK = this.e;
        c3160cK.q = z;
        MJ mj = c3160cK.f4216a;
        if (mj != null) {
            mj.f3401a.f4224a = z;
        }
    }

    public void setProgress(@FloatRange(from = 0.0d, to = Contrast.RATIO_MIN) float f) {
        this.k.add(KJ.b);
        this.e.u(f);
    }

    public void setRenderMode(EnumC5108yY enumC5108yY) {
        C3160cK c3160cK = this.e;
        c3160cK.u = enumC5108yY;
        c3160cK.e();
    }

    public void setRepeatCount(int i) {
        this.k.add(KJ.d);
        this.e.b.setRepeatCount(i);
    }

    public void setRepeatMode(int i) {
        this.k.add(KJ.c);
        this.e.b.setRepeatMode(i);
    }

    public void setSafeMode(boolean z) {
        this.e.e = z;
    }

    public void setSpeed(float f) {
        this.e.b.d = f;
    }

    public void setTextDelegate(Jb0 jb0) {
        this.e.getClass();
    }

    public void setUseCompositionFrameRate(boolean z) {
        this.e.b.n = z;
    }

    @Override // android.view.View
    public final void unscheduleDrawable(Drawable drawable) {
        C3160cK c3160cK;
        if (!this.h && drawable == (c3160cK = this.e) && c3160cK.j()) {
            this.i = false;
            c3160cK.k();
        } else if (!this.h && (drawable instanceof C3160cK)) {
            C3160cK c3160cK2 = (C3160cK) drawable;
            if (c3160cK2.j()) {
                c3160cK2.k();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void setMaxFrame(String str) {
        this.e.q(str);
    }

    public void setMinFrame(String str) {
        this.e.t(str);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53a = new LJ(this, 1);
        this.b = new LJ(this, 0);
        this.d = 0;
        this.e = new C3160cK();
        this.h = false;
        this.i = false;
        this.j = true;
        this.k = new HashSet();
        this.l = new HashSet();
        d(attributeSet);
    }

    public void setAnimation(String str) {
        C3951lK c3951lKA;
        C3951lK c3951lK;
        this.f = str;
        int i = 0;
        this.g = 0;
        int i2 = 1;
        if (isInEditMode()) {
            c3951lK = new C3951lK(new GJ(i, this, str), true);
        } else {
            Object obj = null;
            if (this.j) {
                Context context = getContext();
                HashMap map = RJ.f3654a;
                String strI = AbstractC3888ke0.i("asset_", str);
                c3951lKA = RJ.a(strI, new OJ(context.getApplicationContext(), str, strI, i2), null);
            } else {
                Context context2 = getContext();
                HashMap map2 = RJ.f3654a;
                c3951lKA = RJ.a(null, new OJ(context2.getApplicationContext(), str, obj, i2), null);
            }
            c3951lK = c3951lKA;
        }
        setCompositionTask(c3951lK);
    }
}
