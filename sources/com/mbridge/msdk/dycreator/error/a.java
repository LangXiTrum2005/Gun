package com.mbridge.msdk.dycreator.error;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1085a;
    private String b;

    public a(b bVar) {
        if (bVar != null) {
            this.f1085a = bVar.b();
            this.b = bVar.c();
        }
    }

    public String toString() {
        return DM.k(new StringBuilder("DyError{errorCode="), this.f1085a, '}');
    }

    public a(int i, String str) {
        this.f1085a = i;
        this.b = str;
    }
}
