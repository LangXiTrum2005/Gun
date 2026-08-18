package com.unity3d.services.core.extensions;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4748uQ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4660tQ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.HZ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IZ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3732io;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4397qQ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes4.dex */
public final class CoroutineExtensionsKt {
    private static final LinkedHashMap<Object, InterfaceC3732io> deferreds = new LinkedHashMap<Object, InterfaceC3732io>() { // from class: com.unity3d.services.core.extensions.CoroutineExtensionsKt$deferreds$1
        public /* bridge */ boolean containsValue(InterfaceC3732io interfaceC3732io) {
            return super.containsValue((Object) interfaceC3732io);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<Map.Entry<Object, InterfaceC3732io>> entrySet() {
            return getEntries();
        }

        public /* bridge */ Set<Map.Entry<Object, InterfaceC3732io>> getEntries() {
            return super.entrySet();
        }

        public /* bridge */ Set<Object> getKeys() {
            return super.keySet();
        }

        public /* bridge */ int getSize() {
            return super.size();
        }

        public /* bridge */ Collection<InterfaceC3732io> getValues() {
            return super.values();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Set<Object> keySet() {
            return getKeys();
        }

        public /* bridge */ boolean remove(Object obj, InterfaceC3732io interfaceC3732io) {
            return super.remove(obj, (Object) interfaceC3732io);
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<Object, InterfaceC3732io> entry) {
            AbstractC2995aW.q(entry, "eldest");
            return size() > 100;
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Collection<InterfaceC3732io> values() {
            return getValues();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof InterfaceC3732io) {
                return containsValue((InterfaceC3732io) obj);
            }
            return false;
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (obj != null && (obj2 instanceof InterfaceC3732io)) {
                return remove(obj, (InterfaceC3732io) obj2);
            }
            return false;
        }
    };
    private static final InterfaceC4397qQ mutex = AbstractC4748uQ.a();

    /* JADX INFO: renamed from: com.unity3d.services.core.extensions.CoroutineExtensionsKt$memoize$2, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.services.core.extensions.CoroutineExtensionsKt$memoize$2", f = "CoroutineExtensions.kt", l = {52, 45}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ InterfaceC2766Sw $action;
        final /* synthetic */ Object $key;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Object obj, InterfaceC2766Sw interfaceC2766Sw, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$key = obj;
            this.$action = interfaceC2766Sw;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$key, this.$action, interfaceC2857Wj);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((AnonymousClass2) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            InterfaceC4514rk interfaceC4514rk;
            Object obj2;
            InterfaceC2766Sw interfaceC2766Sw;
            InterfaceC4397qQ interfaceC4397qQ;
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i = this.label;
            try {
                if (i != 0) {
                    if (i == 1) {
                        interfaceC2766Sw = (InterfaceC2766Sw) this.L$3;
                        obj2 = this.L$2;
                        interfaceC4397qQ = (InterfaceC4397qQ) this.L$1;
                        interfaceC4514rk = (InterfaceC4514rk) this.L$0;
                        AbstractC3375el.b0(obj);
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC3375el.b0(obj);
                    }
                }
                AbstractC3375el.b0(obj);
                interfaceC4514rk = (InterfaceC4514rk) this.L$0;
                InterfaceC4397qQ mutex = CoroutineExtensionsKt.getMutex();
                Object obj3 = this.$key;
                InterfaceC2766Sw interfaceC2766Sw2 = this.$action;
                this.L$0 = interfaceC4514rk;
                this.L$1 = mutex;
                this.L$2 = obj3;
                this.L$3 = interfaceC2766Sw2;
                this.label = 1;
                C4660tQ c4660tQ = (C4660tQ) mutex;
                if (c4660tQ.d(null, this) == enumC4602sk) {
                    return enumC4602sk;
                }
                obj2 = obj3;
                interfaceC2766Sw = interfaceC2766Sw2;
                interfaceC4397qQ = c4660tQ;
                LinkedHashMap<Object, InterfaceC3732io> deferreds = CoroutineExtensionsKt.getDeferreds();
                InterfaceC3732io interfaceC3732ioG = deferreds.get(obj2);
                if (interfaceC3732ioG == null) {
                    interfaceC3732ioG = WD.g(interfaceC4514rk, null, new CoroutineExtensionsKt$memoize$2$deferred$1$1$1(interfaceC2766Sw, null), 3);
                    deferreds.put(obj2, interfaceC3732ioG);
                }
                InterfaceC3732io interfaceC3732io = interfaceC3732ioG;
                ((C4660tQ) interfaceC4397qQ).e(null);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 2;
                obj = interfaceC3732io.s(this);
                return obj == enumC4602sk ? enumC4602sk : obj;
            } catch (Throwable th) {
                ((C4660tQ) interfaceC4397qQ).e(null);
                throw th;
            }
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            InterfaceC4514rk interfaceC4514rk = (InterfaceC4514rk) this.L$0;
            InterfaceC4397qQ mutex = CoroutineExtensionsKt.getMutex();
            Object obj2 = this.$key;
            InterfaceC2766Sw interfaceC2766Sw = this.$action;
            C4660tQ c4660tQ = (C4660tQ) mutex;
            c4660tQ.d(null, this);
            try {
                LinkedHashMap<Object, InterfaceC3732io> deferreds = CoroutineExtensionsKt.getDeferreds();
                InterfaceC3732io interfaceC3732ioG = deferreds.get(obj2);
                if (interfaceC3732ioG == null) {
                    interfaceC3732ioG = WD.g(interfaceC4514rk, null, new CoroutineExtensionsKt$memoize$2$deferred$1$1$1(interfaceC2766Sw, null), 3);
                    deferreds.put(obj2, interfaceC3732ioG);
                }
                return interfaceC3732ioG.s(this);
            } finally {
                c4660tQ.e(null);
            }
        }
    }

    public static final LinkedHashMap<Object, InterfaceC3732io> getDeferreds() {
        return deferreds;
    }

    public static final InterfaceC4397qQ getMutex() {
        return mutex;
    }

    public static final <T> Object memoize(Object obj, InterfaceC2766Sw interfaceC2766Sw, InterfaceC2857Wj interfaceC2857Wj) {
        return WD.m(new AnonymousClass2(obj, interfaceC2766Sw, null), interfaceC2857Wj);
    }

    public static final <R> Object runReturnSuspendCatching(InterfaceC2714Qw interfaceC2714Qw) {
        Object objV;
        Throwable thA;
        AbstractC2995aW.q(interfaceC2714Qw, "block");
        try {
            objV = interfaceC2714Qw.invoke();
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            objV = AbstractC3375el.v(th);
        }
        return (((objV instanceof HZ) ^ true) || (thA = IZ.a(objV)) == null) ? objV : AbstractC3375el.v(thA);
    }

    public static final <R> Object runSuspendCatching(InterfaceC2714Qw interfaceC2714Qw) {
        AbstractC2995aW.q(interfaceC2714Qw, "block");
        try {
            return interfaceC2714Qw.invoke();
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            return AbstractC3375el.v(th);
        }
    }
}
