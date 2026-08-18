package androidx.core.graphics;

import android.graphics.Picture;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes.dex */
public final class PictureKt {
    public static final Picture record(Picture picture, int i, int i2, InterfaceC2766Sw interfaceC2766Sw) {
        try {
            interfaceC2766Sw.invoke(picture.beginRecording(i, i2));
            return picture;
        } finally {
            picture.endRecording();
        }
    }
}
