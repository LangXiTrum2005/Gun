package com.gyf.immersionbar;

import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RunnableC4646tC;

/* JADX INFO: loaded from: classes3.dex */
public final class SupportRequestBarManagerFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RunnableC4646tC f849a;

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        RunnableC4646tC runnableC4646tC = this.f849a;
        if (runnableC4646tC != null) {
            getResources().getConfiguration();
            runnableC4646tC.a();
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        RunnableC4646tC runnableC4646tC = this.f849a;
        if (runnableC4646tC != null) {
            runnableC4646tC.b();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        RunnableC4646tC runnableC4646tC = this.f849a;
        if (runnableC4646tC != null) {
            runnableC4646tC.c();
            this.f849a = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        RunnableC4646tC runnableC4646tC = this.f849a;
        if (runnableC4646tC != null) {
            runnableC4646tC.d();
        }
    }
}
