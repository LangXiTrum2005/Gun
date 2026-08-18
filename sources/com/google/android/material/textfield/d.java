package com.google.android.material.textfield;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f828a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(Object obj, int i) {
        this.f828a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f828a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ClearTextEndIconDelegate) obj).lambda$tearDown$2();
                break;
            case 1:
                ((DropdownMenuEndIconDelegate) obj).lambda$afterEditTextChanged$3();
                break;
            default:
                ((TextInputLayout) obj).lambda$onGlobalLayout$1();
                break;
        }
    }
}
