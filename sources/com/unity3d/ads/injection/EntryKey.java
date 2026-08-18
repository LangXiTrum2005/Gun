package com.unity3d.ads.injection;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3156cG;

/* JADX INFO: loaded from: classes4.dex */
public final class EntryKey {
    private final InterfaceC3156cG instanceClass;
    private final String named;

    public EntryKey(String str, InterfaceC3156cG interfaceC3156cG) {
        AbstractC2995aW.q(str, "named");
        AbstractC2995aW.q(interfaceC3156cG, "instanceClass");
        this.named = str;
        this.instanceClass = interfaceC3156cG;
    }

    public static /* synthetic */ EntryKey copy$default(EntryKey entryKey, String str, InterfaceC3156cG interfaceC3156cG, int i, Object obj) {
        if ((i & 1) != 0) {
            str = entryKey.named;
        }
        if ((i & 2) != 0) {
            interfaceC3156cG = entryKey.instanceClass;
        }
        return entryKey.copy(str, interfaceC3156cG);
    }

    public final String component1() {
        return this.named;
    }

    public final InterfaceC3156cG component2() {
        return this.instanceClass;
    }

    public final EntryKey copy(String str, InterfaceC3156cG interfaceC3156cG) {
        AbstractC2995aW.q(str, "named");
        AbstractC2995aW.q(interfaceC3156cG, "instanceClass");
        return new EntryKey(str, interfaceC3156cG);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EntryKey)) {
            return false;
        }
        EntryKey entryKey = (EntryKey) obj;
        return AbstractC2995aW.i(this.named, entryKey.named) && AbstractC2995aW.i(this.instanceClass, entryKey.instanceClass);
    }

    public final InterfaceC3156cG getInstanceClass() {
        return this.instanceClass;
    }

    public final String getNamed() {
        return this.named;
    }

    public int hashCode() {
        return this.instanceClass.hashCode() + (this.named.hashCode() * 31);
    }

    public String toString() {
        return "EntryKey(named=" + this.named + ", instanceClass=" + this.instanceClass + ')';
    }

    public /* synthetic */ EntryKey(String str, InterfaceC3156cG interfaceC3156cG, int i, AbstractC2471Hm abstractC2471Hm) {
        this((i & 1) != 0 ? "" : str, interfaceC3156cG);
    }
}
