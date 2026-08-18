package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4391qK;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3989ll;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.VX;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class a implements InterfaceC3989ll {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f217a = 0;
    public final Object b;

    public a(InputStream inputStream, C4391qK c4391qK) {
        VX vx = new VX(inputStream, c4391qK);
        this.b = vx;
        vx.mark(5242880);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3989ll
    public final Object a() {
        int i = this.f217a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return c();
            case 1:
                return obj;
            default:
                VX vx = (VX) obj;
                vx.reset();
                return vx;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3989ll
    public final void b() {
        switch (this.f217a) {
            case 0:
            case 1:
                break;
            default:
                ((VX) this.b).release();
                break;
        }
    }

    public final ParcelFileDescriptor c() {
        return ((ParcelFileDescriptorRewinder$InternalRewinder) this.b).rewind();
    }

    public a(ParcelFileDescriptor parcelFileDescriptor) {
        this.b = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }

    public a(Object obj) {
        this.b = obj;
    }
}
