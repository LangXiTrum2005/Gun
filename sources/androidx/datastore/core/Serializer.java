package androidx.datastore.core;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public interface Serializer<T> {
    T getDefaultValue();

    Object readFrom(InputStream inputStream, InterfaceC2857Wj interfaceC2857Wj);

    Object writeTo(T t, OutputStream outputStream, InterfaceC2857Wj interfaceC2857Wj);
}
