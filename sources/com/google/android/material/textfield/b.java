package com.google.android.material.textfield;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f826a;
    public final /* synthetic */ EndIconDelegate b;

    public /* synthetic */ b(EndIconDelegate endIconDelegate, int i) {
        this.f826a = i;
        this.b = endIconDelegate;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        int i = this.f826a;
        EndIconDelegate endIconDelegate = this.b;
        switch (i) {
            case 0:
                ((ClearTextEndIconDelegate) endIconDelegate).lambda$new$1(view, z);
                break;
            default:
                ((DropdownMenuEndIconDelegate) endIconDelegate).lambda$new$1(view, z);
                break;
        }
    }
}
