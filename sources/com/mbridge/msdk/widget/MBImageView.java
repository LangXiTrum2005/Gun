package com.mbridge.msdk.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.same.image.b;
import com.mbridge.msdk.foundation.same.image.c;
import com.mbridge.msdk.foundation.tools.o0;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"AppCompatCustomView"})
public class MBImageView extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Bitmap f2410a;
    private String b;

    public class a implements c {
        public a() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            o0.b("mb-widget-imageview", str2 + " load failed:" + str);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            MBImageView.this.setImageBitmap(bitmap);
        }
    }

    public MBImageView(Context context) {
        super(context);
        this.f2410a = null;
    }

    private void a() {
        if (getContext() != null) {
            b.a(getContext()).a(this.b, new a());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Bitmap bitmap = this.f2410a;
        if (bitmap == null || !bitmap.isRecycled()) {
            super.onDraw(canvas);
        } else {
            o0.b("mb-widget-imageview", "onDraw bitmap recycled");
            a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f2410a = bitmap;
        if (bitmap == null) {
            super.setImageBitmap(bitmap);
        } else {
            if (!bitmap.isRecycled()) {
                super.setImageBitmap(bitmap);
                return;
            }
            this.f2410a = null;
            super.setImageBitmap(null);
            o0.b("mb-widget-imageview", "setImageBitmap recycled");
        }
    }

    public void setImageUrl(String str) {
        this.b = str;
    }

    public MBImageView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2410a = null;
    }

    public MBImageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2410a = null;
    }
}
