package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Px;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5175zD;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4545s40;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ViewGroupKt {
    public static final boolean contains(ViewGroup viewGroup, View view) {
        return viewGroup.indexOfChild(view) != -1;
    }

    public static final void forEach(ViewGroup viewGroup, InterfaceC2766Sw interfaceC2766Sw) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            interfaceC2766Sw.invoke(viewGroup.getChildAt(i));
        }
    }

    public static final void forEachIndexed(ViewGroup viewGroup, InterfaceC3567gx interfaceC3567gx) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            interfaceC3567gx.invoke(Integer.valueOf(i), viewGroup.getChildAt(i));
        }
    }

    public static final View get(ViewGroup viewGroup, int i) {
        View childAt = viewGroup.getChildAt(i);
        if (childAt != null) {
            return childAt;
        }
        StringBuilder sbQ = AbstractC5044xl.q("Index: ", i, ", Size: ");
        sbQ.append(viewGroup.getChildCount());
        throw new IndexOutOfBoundsException(sbQ.toString());
    }

    public static final InterfaceC4545s40 getChildren(final ViewGroup viewGroup) {
        return new InterfaceC4545s40() { // from class: androidx.core.view.ViewGroupKt$children$1
            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4545s40
            public Iterator<View> iterator() {
                return ViewGroupKt.iterator(viewGroup);
            }
        };
    }

    public static final InterfaceC4545s40 getDescendants(final ViewGroup viewGroup) {
        return new InterfaceC4545s40() { // from class: androidx.core.view.ViewGroupKt$special$$inlined$Sequence$1
            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4545s40
            public Iterator<View> iterator() {
                return new TreeIterator(ViewGroupKt.getChildren(viewGroup).iterator(), ViewGroupKt$descendants$1$1.INSTANCE);
            }
        };
    }

    public static final C5175zD getIndices(ViewGroup viewGroup) {
        return AbstractC3375el.f0(0, viewGroup.getChildCount());
    }

    public static final int getSize(ViewGroup viewGroup) {
        return viewGroup.getChildCount();
    }

    public static final boolean isEmpty(ViewGroup viewGroup) {
        return viewGroup.getChildCount() == 0;
    }

    public static final boolean isNotEmpty(ViewGroup viewGroup) {
        return viewGroup.getChildCount() != 0;
    }

    public static final Iterator<View> iterator(final ViewGroup viewGroup) {
        return new Iterator<View>() { // from class: androidx.core.view.ViewGroupKt.iterator.1
            private int index;

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < viewGroup.getChildCount();
            }

            @Override // java.util.Iterator
            public void remove() {
                ViewGroup viewGroup2 = viewGroup;
                int i = this.index - 1;
                this.index = i;
                viewGroup2.removeViewAt(i);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.Iterator
            public View next() {
                ViewGroup viewGroup2 = viewGroup;
                int i = this.index;
                this.index = i + 1;
                View childAt = viewGroup2.getChildAt(i);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
            }
        };
    }

    public static final void minusAssign(ViewGroup viewGroup, View view) {
        viewGroup.removeView(view);
    }

    public static final void plusAssign(ViewGroup viewGroup, View view) {
        viewGroup.addView(view);
    }

    public static final void setMargins(ViewGroup.MarginLayoutParams marginLayoutParams, @Px int i) {
        marginLayoutParams.setMargins(i, i, i, i);
    }

    public static final void updateMargins(ViewGroup.MarginLayoutParams marginLayoutParams, @Px int i, @Px int i2, @Px int i3, @Px int i4) {
        marginLayoutParams.setMargins(i, i2, i3, i4);
    }

    public static /* synthetic */ void updateMargins$default(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = marginLayoutParams.leftMargin;
        }
        if ((i5 & 2) != 0) {
            i2 = marginLayoutParams.topMargin;
        }
        if ((i5 & 4) != 0) {
            i3 = marginLayoutParams.rightMargin;
        }
        if ((i5 & 8) != 0) {
            i4 = marginLayoutParams.bottomMargin;
        }
        marginLayoutParams.setMargins(i, i2, i3, i4);
    }

    public static final void updateMarginsRelative(ViewGroup.MarginLayoutParams marginLayoutParams, @Px int i, @Px int i2, @Px int i3, @Px int i4) {
        marginLayoutParams.setMarginStart(i);
        marginLayoutParams.topMargin = i2;
        marginLayoutParams.setMarginEnd(i3);
        marginLayoutParams.bottomMargin = i4;
    }

    public static /* synthetic */ void updateMarginsRelative$default(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = marginLayoutParams.getMarginStart();
        }
        if ((i5 & 2) != 0) {
            i2 = marginLayoutParams.topMargin;
        }
        if ((i5 & 4) != 0) {
            i3 = marginLayoutParams.getMarginEnd();
        }
        if ((i5 & 8) != 0) {
            i4 = marginLayoutParams.bottomMargin;
        }
        marginLayoutParams.setMarginStart(i);
        marginLayoutParams.topMargin = i2;
        marginLayoutParams.setMarginEnd(i3);
        marginLayoutParams.bottomMargin = i4;
    }
}
