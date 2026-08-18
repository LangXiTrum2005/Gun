package androidx.core.util;

import android.util.LruCache;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3741ix;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WG;

/* JADX INFO: loaded from: classes.dex */
public final class LruCacheKt {

    /* JADX INFO: renamed from: androidx.core.util.LruCacheKt$lruCache$1, reason: invalid class name */
    public static final class AnonymousClass1 extends WG implements InterfaceC3567gx {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Integer invoke(Object obj, Object obj2) {
            return 1;
        }
    }

    /* JADX INFO: renamed from: androidx.core.util.LruCacheKt$lruCache$2, reason: invalid class name */
    public static final class AnonymousClass2 extends WG implements InterfaceC2766Sw {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
        public final Object invoke(Object obj) {
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.core.util.LruCacheKt$lruCache$3, reason: invalid class name */
    public static final class AnonymousClass3 extends WG implements InterfaceC3741ix {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(4);
        }

        public final void invoke(boolean z, Object obj, Object obj2, Object obj3) {
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3741ix
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke(((Boolean) obj).booleanValue(), obj2, obj3, obj4);
            return C5033xf0.f5238a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* JADX INFO: renamed from: androidx.core.util.LruCacheKt$lruCache$4, reason: invalid class name */
    public static final class AnonymousClass4<K, V> extends LruCache<K, V> {
        final /* synthetic */ InterfaceC2766Sw $create;
        final /* synthetic */ InterfaceC3741ix $onEntryRemoved;
        final /* synthetic */ InterfaceC3567gx $sizeOf;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(int i, InterfaceC3567gx interfaceC3567gx, InterfaceC2766Sw interfaceC2766Sw, InterfaceC3741ix interfaceC3741ix) {
            super(i);
            this.$sizeOf = interfaceC3567gx;
            this.$create = interfaceC2766Sw;
            this.$onEntryRemoved = interfaceC3741ix;
        }

        @Override // android.util.LruCache
        public V create(K k) {
            return (V) this.$create.invoke(k);
        }

        @Override // android.util.LruCache
        public void entryRemoved(boolean z, K k, V v, V v2) {
            this.$onEntryRemoved.invoke(Boolean.valueOf(z), k, v, v2);
        }

        @Override // android.util.LruCache
        public int sizeOf(K k, V v) {
            return ((Number) this.$sizeOf.invoke(k, v)).intValue();
        }
    }

    public static final <K, V> LruCache<K, V> lruCache(int i, InterfaceC3567gx interfaceC3567gx, InterfaceC2766Sw interfaceC2766Sw, InterfaceC3741ix interfaceC3741ix) {
        return new AnonymousClass4(i, interfaceC3567gx, interfaceC2766Sw, interfaceC3741ix);
    }

    public static /* synthetic */ LruCache lruCache$default(int i, InterfaceC3567gx interfaceC3567gx, InterfaceC2766Sw interfaceC2766Sw, InterfaceC3741ix interfaceC3741ix, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            interfaceC3567gx = AnonymousClass1.INSTANCE;
        }
        if ((i2 & 4) != 0) {
            interfaceC2766Sw = AnonymousClass2.INSTANCE;
        }
        if ((i2 & 8) != 0) {
            interfaceC3741ix = AnonymousClass3.INSTANCE;
        }
        return new AnonymousClass4(i, interfaceC3567gx, interfaceC2766Sw, interfaceC3741ix);
    }
}
