package androidx.browser.customtabs;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16a;
    public final /* synthetic */ EngagementSignalsCallback b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Bundle d;

    public /* synthetic */ b(EngagementSignalsCallback engagementSignalsCallback, boolean z, Bundle bundle, int i) {
        this.f16a = i;
        this.b = engagementSignalsCallback;
        this.c = z;
        this.d = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f16a;
        EngagementSignalsCallback engagementSignalsCallback = this.b;
        Bundle bundle = this.d;
        boolean z = this.c;
        switch (i) {
            case 0:
                engagementSignalsCallback.onSessionEnded(z, bundle);
                break;
            case 1:
                engagementSignalsCallback.onVerticalScrollEvent(z, bundle);
                break;
            case 2:
                engagementSignalsCallback.onVerticalScrollEvent(z, bundle);
                break;
            default:
                engagementSignalsCallback.onSessionEnded(z, bundle);
                break;
        }
    }
}
