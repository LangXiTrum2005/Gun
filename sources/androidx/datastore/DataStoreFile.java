package androidx.datastore;

import android.content.Context;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class DataStoreFile {
    public static final File dataStoreFile(Context context, String str) {
        AbstractC2995aW.q(context, "<this>");
        AbstractC2995aW.q(str, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), AbstractC2995aW.v0(str, "datastore/"));
    }
}
