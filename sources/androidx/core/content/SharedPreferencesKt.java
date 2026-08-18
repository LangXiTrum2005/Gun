package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes.dex */
public final class SharedPreferencesKt {
    @SuppressLint({"ApplySharedPref"})
    public static final void edit(SharedPreferences sharedPreferences, boolean z, InterfaceC2766Sw interfaceC2766Sw) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        interfaceC2766Sw.invoke(editorEdit);
        if (z) {
            editorEdit.commit();
        } else {
            editorEdit.apply();
        }
    }

    public static /* synthetic */ void edit$default(SharedPreferences sharedPreferences, boolean z, InterfaceC2766Sw interfaceC2766Sw, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        interfaceC2766Sw.invoke(editorEdit);
        if (z) {
            editorEdit.commit();
        } else {
            editorEdit.apply();
        }
    }
}
