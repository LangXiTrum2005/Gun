package androidx.core.util;

import android.annotation.SuppressLint;
import android.util.Range;
import androidx.annotation.RequiresApi;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2490If;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ClassVerificationFailure"})
public final class RangeKt {
    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> Range<T> and(Range<T> range, Range<T> range2) {
        return range.intersect(range2);
    }

    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> Range<T> plus(Range<T> range, T t) {
        return range.extend(t);
    }

    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> Range<T> rangeTo(T t, T t2) {
        return new Range<>(t, t2);
    }

    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> InterfaceC2490If toClosedRange(final Range<T> range) {
        return new InterfaceC2490If() { // from class: androidx.core.util.RangeKt.toClosedRange.1
            /* JADX WARN: Incorrect types in method signature: (TT;)Z */
            public boolean contains(Comparable comparable) {
                AbstractC2995aW.q(comparable, AppMeasurementSdk.ConditionalUserProperty.VALUE);
                return comparable.compareTo(getStart()) >= 0 && comparable.compareTo(getEndInclusive()) <= 0;
            }

            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2490If
            public Comparable getEndInclusive() {
                return range.getUpper();
            }

            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2490If
            public Comparable getStart() {
                return range.getLower();
            }

            public boolean isEmpty() {
                return getStart().compareTo(getEndInclusive()) > 0;
            }
        };
    }

    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> Range<T> toRange(InterfaceC2490If interfaceC2490If) {
        return new Range<>(interfaceC2490If.getStart(), interfaceC2490If.getEndInclusive());
    }

    @RequiresApi(21)
    public static final <T extends Comparable<? super T>> Range<T> plus(Range<T> range, Range<T> range2) {
        return range.extend(range2);
    }
}
