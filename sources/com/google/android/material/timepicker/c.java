package com.google.android.material.timepicker;

import com.google.android.material.button.MaterialButtonToggleGroup;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements MaterialButtonToggleGroup.OnButtonCheckedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f834a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(Object obj, int i) {
        this.f834a = i;
        this.b = obj;
    }

    @Override // com.google.android.material.button.MaterialButtonToggleGroup.OnButtonCheckedListener
    public final void onButtonChecked(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z) {
        int i2 = this.f834a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                ((TimePickerTextInputPresenter) obj).lambda$setupPeriodToggle$0(materialButtonToggleGroup, i, z);
                break;
            default:
                ((TimePickerView) obj).lambda$new$0(materialButtonToggleGroup, i, z);
                break;
        }
    }
}
