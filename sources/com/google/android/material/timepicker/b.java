package com.google.android.material.timepicker;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f833a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i) {
        this.f833a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f833a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((RadialViewGroup) obj).updateLayoutParams();
                break;
            default:
                ((MaterialTimePicker) obj).lambda$onViewCreated$0();
                break;
        }
    }
}
