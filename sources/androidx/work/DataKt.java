package androidx.work;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4839vT;

/* JADX INFO: loaded from: classes.dex */
public final class DataKt {
    public static final <T> boolean hasKeyWithValueOfType(Data data, String str) {
        AbstractC2995aW.q(data, "<this>");
        AbstractC2995aW.q(str, "key");
        AbstractC2995aW.w0();
        throw null;
    }

    public static final Data workDataOf(C4839vT... c4839vTArr) throws Throwable {
        AbstractC2995aW.q(c4839vTArr, "pairs");
        Data.Builder builder = new Data.Builder();
        int length = c4839vTArr.length;
        int i = 0;
        while (i < length) {
            C4839vT c4839vT = c4839vTArr[i];
            i++;
            builder.put((String) c4839vT.f5132a, c4839vT.b);
        }
        Data dataBuild = builder.build();
        AbstractC2995aW.p(dataBuild, "dataBuilder.build()");
        return dataBuild;
    }
}
