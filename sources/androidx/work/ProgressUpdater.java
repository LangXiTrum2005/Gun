package androidx.work;

import android.content.Context;
import androidx.annotation.NonNull;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public interface ProgressUpdater {
    @NonNull
    AI updateProgress(@NonNull Context context, @NonNull UUID uuid, @NonNull Data data);
}
