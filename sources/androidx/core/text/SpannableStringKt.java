package androidx.core.text;

import android.text.Spannable;
import android.text.SpannableString;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5175zD;

/* JADX INFO: loaded from: classes.dex */
public final class SpannableStringKt {
    public static final void clearSpans(Spannable spannable) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            spannable.removeSpan(obj);
        }
    }

    public static final void set(Spannable spannable, int i, int i2, Object obj) {
        spannable.setSpan(obj, i, i2, 17);
    }

    public static final Spannable toSpannable(CharSequence charSequence) {
        return SpannableString.valueOf(charSequence);
    }

    public static final void set(Spannable spannable, C5175zD c5175zD, Object obj) {
        spannable.setSpan(obj, c5175zD.f5212a, c5175zD.b, 17);
    }
}
