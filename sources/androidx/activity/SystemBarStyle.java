package androidx.activity;

import androidx.annotation.ColorInt;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes.dex */
public final class SystemBarStyle {
    public static final Companion Companion = new Companion(null);
    private final int darkScrim;
    private final InterfaceC2766Sw detectDarkMode;
    private final int lightScrim;
    private final int nightMode;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
            this();
        }

        public static /* synthetic */ SystemBarStyle auto$default(Companion companion, int i, int i2, InterfaceC2766Sw interfaceC2766Sw, int i3, Object obj) {
            if ((i3 & 4) != 0) {
                interfaceC2766Sw = SystemBarStyle$Companion$auto$1.INSTANCE;
            }
            return companion.auto(i, i2, interfaceC2766Sw);
        }

        public final SystemBarStyle auto(@ColorInt int i, @ColorInt int i2) {
            return auto$default(this, i, i2, null, 4, null);
        }

        public final SystemBarStyle dark(@ColorInt int i) {
            return new SystemBarStyle(i, i, 2, SystemBarStyle$Companion$dark$1.INSTANCE, null);
        }

        public final SystemBarStyle light(@ColorInt int i, @ColorInt int i2) {
            return new SystemBarStyle(i, i2, 1, SystemBarStyle$Companion$light$1.INSTANCE, null);
        }

        public final SystemBarStyle auto(@ColorInt int i, @ColorInt int i2, InterfaceC2766Sw interfaceC2766Sw) {
            AbstractC2995aW.q(interfaceC2766Sw, "detectDarkMode");
            return new SystemBarStyle(i, i2, 0, interfaceC2766Sw, null);
        }
    }

    public /* synthetic */ SystemBarStyle(int i, int i2, int i3, InterfaceC2766Sw interfaceC2766Sw, AbstractC2471Hm abstractC2471Hm) {
        this(i, i2, i3, interfaceC2766Sw);
    }

    public static final SystemBarStyle auto(@ColorInt int i, @ColorInt int i2) {
        return Companion.auto(i, i2);
    }

    public static final SystemBarStyle dark(@ColorInt int i) {
        return Companion.dark(i);
    }

    public static final SystemBarStyle light(@ColorInt int i, @ColorInt int i2) {
        return Companion.light(i, i2);
    }

    public final int getDarkScrim$activity_release() {
        return this.darkScrim;
    }

    public final InterfaceC2766Sw getDetectDarkMode$activity_release() {
        return this.detectDarkMode;
    }

    public final int getNightMode$activity_release() {
        return this.nightMode;
    }

    public final int getScrim$activity_release(boolean z) {
        return z ? this.darkScrim : this.lightScrim;
    }

    public final int getScrimWithEnforcedContrast$activity_release(boolean z) {
        if (this.nightMode == 0) {
            return 0;
        }
        return z ? this.darkScrim : this.lightScrim;
    }

    private SystemBarStyle(int i, int i2, int i3, InterfaceC2766Sw interfaceC2766Sw) {
        this.lightScrim = i;
        this.darkScrim = i2;
        this.nightMode = i3;
        this.detectDarkMode = interfaceC2766Sw;
    }

    public static final SystemBarStyle auto(@ColorInt int i, @ColorInt int i2, InterfaceC2766Sw interfaceC2766Sw) {
        return Companion.auto(i, i2, interfaceC2766Sw);
    }
}
