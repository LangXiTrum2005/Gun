package androidx.core.util;

import android.annotation.SuppressLint;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4839vT;

/* JADX INFO: loaded from: classes.dex */
public final class PairKt {
    @SuppressLint({"UnknownNullness"})
    public static final <F, S> F component1(Pair<F, S> pair) {
        return pair.first;
    }

    @SuppressLint({"UnknownNullness"})
    public static final <F, S> S component2(Pair<F, S> pair) {
        return pair.second;
    }

    public static final <F, S> android.util.Pair<F, S> toAndroidPair(C4839vT c4839vT) {
        return new android.util.Pair<>(c4839vT.f5132a, c4839vT.b);
    }

    public static final <F, S> Pair<F, S> toAndroidXPair(C4839vT c4839vT) {
        return new Pair<>(c4839vT.f5132a, c4839vT.b);
    }

    public static final <F, S> C4839vT toKotlinPair(Pair<F, S> pair) {
        return new C4839vT(pair.first, pair.second);
    }

    @SuppressLint({"UnknownNullness"})
    public static final <F, S> F component1(android.util.Pair<F, S> pair) {
        return (F) pair.first;
    }

    @SuppressLint({"UnknownNullness"})
    public static final <F, S> S component2(android.util.Pair<F, S> pair) {
        return (S) pair.second;
    }

    public static final <F, S> C4839vT toKotlinPair(android.util.Pair<F, S> pair) {
        return new C4839vT(pair.first, pair.second);
    }
}
