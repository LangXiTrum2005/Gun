package androidx.webkit.internal;

import androidx.annotation.NonNull;
import androidx.webkit.ScriptHandler;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4496rb;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.ScriptHandlerBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class ScriptHandlerImpl implements ScriptHandler {
    private final ScriptHandlerBoundaryInterface mBoundaryInterface;

    private ScriptHandlerImpl(@NonNull ScriptHandlerBoundaryInterface scriptHandlerBoundaryInterface) {
        this.mBoundaryInterface = scriptHandlerBoundaryInterface;
    }

    @NonNull
    public static ScriptHandlerImpl toScriptHandler(@NonNull InvocationHandler invocationHandler) {
        return new ScriptHandlerImpl((ScriptHandlerBoundaryInterface) AbstractC4496rb.h(ScriptHandlerBoundaryInterface.class, invocationHandler));
    }

    @Override // androidx.webkit.ScriptHandler
    public void remove() {
        this.mBoundaryInterface.remove();
    }
}
