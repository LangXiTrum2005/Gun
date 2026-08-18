package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.NonNull;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class TransitionValues {

    @SuppressLint({"UnknownNullness"})
    public View view;
    public final Map<String, Object> values = new HashMap();
    final ArrayList<Transition> mTargetedTransitions = new ArrayList<>();

    @Deprecated
    public TransitionValues() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TransitionValues)) {
            return false;
        }
        TransitionValues transitionValues = (TransitionValues) obj;
        return this.view == transitionValues.view && this.values.equals(transitionValues.values);
    }

    public int hashCode() {
        return this.values.hashCode() + (this.view.hashCode() * 31);
    }

    @NonNull
    public String toString() {
        StringBuilder sbQ = DM.q("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbQ.append(this.view);
        sbQ.append("\n");
        String strH = DM.h(sbQ.toString(), "    values:");
        for (String str : this.values.keySet()) {
            strH = strH + "    " + str + ": " + this.values.get(str) + "\n";
        }
        return strH;
    }

    public TransitionValues(@NonNull View view) {
        this.view = view;
    }
}
