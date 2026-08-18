package androidx.core.util;

import android.util.SparseLongArray;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4823vD;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;

/* JADX INFO: loaded from: classes.dex */
public final class SparseLongArrayKt {
    public static final boolean contains(SparseLongArray sparseLongArray, int i) {
        return sparseLongArray.indexOfKey(i) >= 0;
    }

    public static final boolean containsKey(SparseLongArray sparseLongArray, int i) {
        return sparseLongArray.indexOfKey(i) >= 0;
    }

    public static final boolean containsValue(SparseLongArray sparseLongArray, long j) {
        return sparseLongArray.indexOfValue(j) >= 0;
    }

    public static final void forEach(SparseLongArray sparseLongArray, InterfaceC3567gx interfaceC3567gx) {
        int size = sparseLongArray.size();
        for (int i = 0; i < size; i++) {
            interfaceC3567gx.invoke(Integer.valueOf(sparseLongArray.keyAt(i)), Long.valueOf(sparseLongArray.valueAt(i)));
        }
    }

    public static final long getOrDefault(SparseLongArray sparseLongArray, int i, long j) {
        return sparseLongArray.get(i, j);
    }

    public static final long getOrElse(SparseLongArray sparseLongArray, int i, InterfaceC2714Qw interfaceC2714Qw) {
        int iIndexOfKey = sparseLongArray.indexOfKey(i);
        return iIndexOfKey >= 0 ? sparseLongArray.valueAt(iIndexOfKey) : ((Number) interfaceC2714Qw.invoke()).longValue();
    }

    public static final int getSize(SparseLongArray sparseLongArray) {
        return sparseLongArray.size();
    }

    public static final boolean isEmpty(SparseLongArray sparseLongArray) {
        return sparseLongArray.size() == 0;
    }

    public static final boolean isNotEmpty(SparseLongArray sparseLongArray) {
        return sparseLongArray.size() != 0;
    }

    public static final AbstractC4823vD keyIterator(final SparseLongArray sparseLongArray) {
        return new AbstractC4823vD() { // from class: androidx.core.util.SparseLongArrayKt.keyIterator.1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseLongArray.size();
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4823vD
            public int nextInt() {
                SparseLongArray sparseLongArray2 = sparseLongArray;
                int i = this.index;
                this.index = i + 1;
                return sparseLongArray2.keyAt(i);
            }

            public final void setIndex(int i) {
                this.index = i;
            }
        };
    }

    public static final SparseLongArray plus(SparseLongArray sparseLongArray, SparseLongArray sparseLongArray2) {
        SparseLongArray sparseLongArray3 = new SparseLongArray(sparseLongArray2.size() + sparseLongArray.size());
        putAll(sparseLongArray3, sparseLongArray);
        putAll(sparseLongArray3, sparseLongArray2);
        return sparseLongArray3;
    }

    public static final void putAll(SparseLongArray sparseLongArray, SparseLongArray sparseLongArray2) {
        int size = sparseLongArray2.size();
        for (int i = 0; i < size; i++) {
            sparseLongArray.put(sparseLongArray2.keyAt(i), sparseLongArray2.valueAt(i));
        }
    }

    public static final boolean remove(SparseLongArray sparseLongArray, int i, long j) {
        int iIndexOfKey = sparseLongArray.indexOfKey(i);
        if (iIndexOfKey < 0 || j != sparseLongArray.valueAt(iIndexOfKey)) {
            return false;
        }
        sparseLongArray.removeAt(iIndexOfKey);
        return true;
    }

    public static final void set(SparseLongArray sparseLongArray, int i, long j) {
        sparseLongArray.put(i, j);
    }

    public static final AJ valueIterator(final SparseLongArray sparseLongArray) {
        return new AJ() { // from class: androidx.core.util.SparseLongArrayKt.valueIterator.1
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < sparseLongArray.size();
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AJ
            public long nextLong() {
                SparseLongArray sparseLongArray2 = sparseLongArray;
                int i = this.index;
                this.index = i + 1;
                return sparseLongArray2.valueAt(i);
            }

            public final void setIndex(int i) {
                this.index = i;
            }
        };
    }
}
