package androidx.core.graphics;

import android.graphics.Matrix;
import android.graphics.Shader;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes.dex */
public final class ShaderKt {
    public static final void transform(Shader shader, InterfaceC2766Sw interfaceC2766Sw) {
        Matrix matrix = new Matrix();
        shader.getLocalMatrix(matrix);
        interfaceC2766Sw.invoke(matrix);
        shader.setLocalMatrix(matrix);
    }
}
