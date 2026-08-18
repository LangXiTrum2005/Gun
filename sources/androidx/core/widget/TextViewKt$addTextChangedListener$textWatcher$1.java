package androidx.core.widget;

import android.text.Editable;
import android.text.TextWatcher;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3741ix;

/* JADX INFO: loaded from: classes.dex */
public final class TextViewKt$addTextChangedListener$textWatcher$1 implements TextWatcher {
    final /* synthetic */ InterfaceC2766Sw $afterTextChanged;
    final /* synthetic */ InterfaceC3741ix $beforeTextChanged;
    final /* synthetic */ InterfaceC3741ix $onTextChanged;

    public TextViewKt$addTextChangedListener$textWatcher$1(InterfaceC2766Sw interfaceC2766Sw, InterfaceC3741ix interfaceC3741ix, InterfaceC3741ix interfaceC3741ix2) {
        this.$afterTextChanged = interfaceC2766Sw;
        this.$beforeTextChanged = interfaceC3741ix;
        this.$onTextChanged = interfaceC3741ix2;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        this.$afterTextChanged.invoke(editable);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.$beforeTextChanged.invoke(charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.$onTextChanged.invoke(charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }
}
