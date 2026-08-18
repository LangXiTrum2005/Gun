package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2871Wx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2534Jx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2611Mx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2689Px;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3940l90;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2637Nx;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class GifDrawable extends Drawable implements InterfaceC2637Nx, Animatable, Animatable2Compat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2534Jx f218a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int f;
    public boolean h;
    public Paint i;
    public Rect j;
    public ArrayList k;
    public boolean e = true;
    public final int g = -1;

    public GifDrawable(C2534Jx c2534Jx) {
        AbstractC2871Wx.V(c2534Jx, "Argument must not be null");
        this.f218a = c2534Jx;
    }

    public final void a() {
        AbstractC2871Wx.S("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.d);
        C2689Px c2689Px = this.f218a.f3291a;
        if (((C3940l90) c2689Px.f3580a).l.c == 1) {
            invalidateSelf();
            return;
        }
        if (this.b) {
            return;
        }
        this.b = true;
        if (c2689Px.j) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        ArrayList arrayList = c2689Px.c;
        if (arrayList.contains(this)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = arrayList.isEmpty();
        arrayList.add(this);
        if (zIsEmpty && !c2689Px.f) {
            c2689Px.f = true;
            c2689Px.j = false;
            c2689Px.a();
        }
        invalidateSelf();
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public final void clearAnimationCallbacks() {
        ArrayList arrayList = this.k;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.d) {
            return;
        }
        if (this.h) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.j == null) {
                this.j = new Rect();
            }
            Gravity.apply(EnumC4719u30.JSON_ENCODE_ERROR_VALUE, intrinsicWidth, intrinsicHeight, bounds, this.j);
            this.h = false;
        }
        C2689Px c2689Px = this.f218a.f3291a;
        C2611Mx c2611Mx = c2689Px.i;
        Bitmap bitmap = c2611Mx != null ? c2611Mx.g : c2689Px.l;
        if (this.j == null) {
            this.j = new Rect();
        }
        Rect rect = this.j;
        if (this.i == null) {
            this.i = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.i);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f218a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f218a.f3291a.p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f218a.f3291a.o;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.h = true;
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public final void registerAnimationCallback(Animatable2Compat.AnimationCallback animationCallback) {
        if (animationCallback == null) {
            return;
        }
        if (this.k == null) {
            this.k = new ArrayList();
        }
        this.k.add(animationCallback);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.i == null) {
            this.i = new Paint(2);
        }
        this.i.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.i == null) {
            this.i = new Paint(2);
        }
        this.i.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        AbstractC2871Wx.S("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.d);
        this.e = z;
        if (!z) {
            this.b = false;
            C2689Px c2689Px = this.f218a.f3291a;
            ArrayList arrayList = c2689Px.c;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                c2689Px.f = false;
            }
        } else if (this.c) {
            a();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.c = true;
        this.f = 0;
        if (this.e) {
            a();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.c = false;
        this.b = false;
        C2689Px c2689Px = this.f218a.f3291a;
        ArrayList arrayList = c2689Px.c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            c2689Px.f = false;
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public final boolean unregisterAnimationCallback(Animatable2Compat.AnimationCallback animationCallback) {
        ArrayList arrayList = this.k;
        if (arrayList == null || animationCallback == null) {
            return false;
        }
        return arrayList.remove(animationCallback);
    }
}
