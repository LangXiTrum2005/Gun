package androidx.lifecycle;

import android.app.Application;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes.dex */
public class AndroidViewModel extends ViewModel {
    private final Application application;

    public AndroidViewModel(Application application) {
        AbstractC2995aW.q(application, MimeTypes.BASE_TYPE_APPLICATION);
        this.application = application;
    }

    public <T extends Application> T getApplication() {
        T t = (T) this.application;
        AbstractC2995aW.o(t, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
        return t;
    }
}
