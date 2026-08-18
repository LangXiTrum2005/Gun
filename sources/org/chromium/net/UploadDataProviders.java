package org.chromium.net;

import android.os.ParcelFileDescriptor;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2294Ar;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4420qg0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4595sg0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Dn0;
import java.io.File;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class UploadDataProviders {
    private UploadDataProviders() {
    }

    public static UploadDataProvider create(File file) {
        return new C4595sg0(new C2294Ar(file, 9));
    }

    public static UploadDataProvider create(ParcelFileDescriptor parcelFileDescriptor) {
        return new C4595sg0(new Dn0(parcelFileDescriptor, 8));
    }

    public static UploadDataProvider create(ByteBuffer byteBuffer) {
        return new C4420qg0(byteBuffer.slice());
    }

    public static UploadDataProvider create(byte[] bArr, int i, int i2) {
        return new C4420qg0(ByteBuffer.wrap(bArr, i, i2).slice());
    }

    public static UploadDataProvider create(byte[] bArr) {
        return create(bArr, 0, bArr.length);
    }
}
