package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.os.Build;
import com.bytedance.sdk.component.utils.sLN;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes2.dex */
public class TTBaseActivity extends Activity {
    protected boolean ebl = false;

    public void LD(boolean z) {
        this.ebl = z;
    }

    @Override // android.app.Activity
    public void finish() {
        try {
            super.finish();
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        if (Build.VERSION.SDK_INT < 33) {
            super.onPause();
            return;
        }
        try {
            super.onPause();
        } catch (IllegalArgumentException e) {
            sLN.Lxb("TTBaseActivity", "super.onPause(); run fail", e);
            try {
                Field declaredField = Activity.class.getDeclaredField("mCalled");
                declaredField.setAccessible(true);
                declaredField.set(this, Boolean.TRUE);
            } catch (Exception e2) {
                sLN.Lxb("TTBaseActivity", "onPause() set mCalled fail", e2);
            }
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        int i = Build.VERSION.SDK_INT;
        if (i > 28 || i < 24) {
            super.onResume();
            return;
        }
        try {
            super.onResume();
        } catch (IllegalArgumentException e) {
            sLN.Lxb("TTBaseActivity", "super.onResume() run fail", e);
            try {
                Field declaredField = Activity.class.getDeclaredField("mCalled");
                declaredField.setAccessible(true);
                declaredField.set(this, Boolean.TRUE);
            } catch (Exception e2) {
                sLN.Lxb("TTBaseActivity", "onResume set mCalled fail", e2);
            }
        }
    }
}
