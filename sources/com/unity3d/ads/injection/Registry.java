package com.unity3d.ads.injection;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4995x90;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2838Vq;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4839vT;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4907w90;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3069bH;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4309pQ;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class Registry {
    private final InterfaceC4309pQ _services = AbstractC4995x90.a(C2838Vq.f3896a);

    public static EntryKey factory$default(Registry registry, String str, InterfaceC2714Qw interfaceC2714Qw, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        AbstractC2995aW.q(str, "named");
        AbstractC2995aW.q(interfaceC2714Qw, "instance");
        AbstractC2995aW.w0();
        throw null;
    }

    public static Object get$default(Registry registry, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        AbstractC2995aW.q(str, "named");
        AbstractC2995aW.w0();
        throw null;
    }

    public static Object getOrNull$default(Registry registry, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        AbstractC2995aW.q(str, "named");
        AbstractC2995aW.w0();
        throw null;
    }

    public static EntryKey single$default(Registry registry, String str, InterfaceC2714Qw interfaceC2714Qw, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        AbstractC2995aW.q(str, "named");
        AbstractC2995aW.q(interfaceC2714Qw, "instance");
        AbstractC2995aW.w0();
        throw null;
    }

    public final <T> void add(EntryKey entryKey, InterfaceC3069bH interfaceC3069bH) {
        C4907w90 c4907w90;
        Object value;
        LinkedHashMap linkedHashMap;
        AbstractC2995aW.q(entryKey, "key");
        AbstractC2995aW.q(interfaceC3069bH, "instance");
        if (!(!getServices().containsKey(entryKey))) {
            throw new IllegalStateException("Cannot have identical entries.".toString());
        }
        InterfaceC4309pQ interfaceC4309pQ = this._services;
        do {
            c4907w90 = (C4907w90) interfaceC4309pQ;
            value = c4907w90.getValue();
            Map map = (Map) value;
            Map mapO = AbstractC3375el.O(new C4839vT(entryKey, interfaceC3069bH));
            AbstractC2995aW.q(map, "<this>");
            linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.putAll(mapO);
        } while (!c4907w90.h(value, linkedHashMap));
    }

    public final <T> EntryKey factory(String str, InterfaceC2714Qw interfaceC2714Qw) {
        AbstractC2995aW.q(str, "named");
        AbstractC2995aW.q(interfaceC2714Qw, "instance");
        AbstractC2995aW.w0();
        throw null;
    }

    public final <T> T get(String str) {
        AbstractC2995aW.q(str, "named");
        AbstractC2995aW.w0();
        throw null;
    }

    public final <T> T getOrNull(String str) {
        AbstractC2995aW.q(str, "named");
        AbstractC2995aW.w0();
        throw null;
    }

    public final Map<EntryKey, InterfaceC3069bH> getServices() {
        return (Map) ((C4907w90) this._services).getValue();
    }

    public final <T> EntryKey single(String str, InterfaceC2714Qw interfaceC2714Qw) {
        AbstractC2995aW.q(str, "named");
        AbstractC2995aW.q(interfaceC2714Qw, "instance");
        AbstractC2995aW.w0();
        throw null;
    }
}
