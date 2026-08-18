package androidx.core.view;

import android.view.Menu;
import android.view.MenuItem;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4545s40;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class MenuKt {
    public static final boolean contains(Menu menu, MenuItem menuItem) {
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            if (AbstractC2995aW.i(menu.getItem(i), menuItem)) {
                return true;
            }
        }
        return false;
    }

    public static final void forEach(Menu menu, InterfaceC2766Sw interfaceC2766Sw) {
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            interfaceC2766Sw.invoke(menu.getItem(i));
        }
    }

    public static final void forEachIndexed(Menu menu, InterfaceC3567gx interfaceC3567gx) {
        int size = menu.size();
        for (int i = 0; i < size; i++) {
            interfaceC3567gx.invoke(Integer.valueOf(i), menu.getItem(i));
        }
    }

    public static final MenuItem get(Menu menu, int i) {
        return menu.getItem(i);
    }

    public static final InterfaceC4545s40 getChildren(final Menu menu) {
        return new InterfaceC4545s40() { // from class: androidx.core.view.MenuKt$children$1
            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4545s40
            public Iterator<MenuItem> iterator() {
                return MenuKt.iterator(menu);
            }
        };
    }

    public static final int getSize(Menu menu) {
        return menu.size();
    }

    public static final boolean isEmpty(Menu menu) {
        return menu.size() == 0;
    }

    public static final boolean isNotEmpty(Menu menu) {
        return menu.size() != 0;
    }

    public static final Iterator<MenuItem> iterator(final Menu menu) {
        return new Iterator<MenuItem>() { // from class: androidx.core.view.MenuKt.iterator.1
            private int index;

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < menu.size();
            }

            @Override // java.util.Iterator
            public void remove() {
                C5033xf0 c5033xf0;
                Menu menu2 = menu;
                int i = this.index - 1;
                this.index = i;
                MenuItem item = menu2.getItem(i);
                if (item != null) {
                    menu2.removeItem(item.getItemId());
                    c5033xf0 = C5033xf0.f5238a;
                } else {
                    c5033xf0 = null;
                }
                if (c5033xf0 == null) {
                    throw new IndexOutOfBoundsException();
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.Iterator
            public MenuItem next() {
                Menu menu2 = menu;
                int i = this.index;
                this.index = i + 1;
                MenuItem item = menu2.getItem(i);
                if (item != null) {
                    return item;
                }
                throw new IndexOutOfBoundsException();
            }
        };
    }

    public static final void minusAssign(Menu menu, MenuItem menuItem) {
        menu.removeItem(menuItem.getItemId());
    }

    public static final void removeItemAt(Menu menu, int i) {
        C5033xf0 c5033xf0;
        MenuItem item = menu.getItem(i);
        if (item != null) {
            menu.removeItem(item.getItemId());
            c5033xf0 = C5033xf0.f5238a;
        } else {
            c5033xf0 = null;
        }
        if (c5033xf0 == null) {
            throw new IndexOutOfBoundsException();
        }
    }
}
