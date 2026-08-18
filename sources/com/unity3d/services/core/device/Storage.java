package com.unity3d.services.core.device;

import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.JsonStorage;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2307Be;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2749Sf;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2853Wf;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4995x90;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2812Uq;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4907w90;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4309pQ;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class Storage extends JsonStorage {
    public static final Companion Companion = new Companion(null);
    private static final InterfaceC4309pQ onStorageEventCallbacks = AbstractC4995x90.a(C2812Uq.f3846a);
    private final String _targetFileName;
    private final StorageManager.StorageType type;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
            this();
        }

        public final void addStorageEventCallback(InterfaceC2766Sw interfaceC2766Sw) {
            C4907w90 c4907w90;
            Object value;
            AbstractC2995aW.q(interfaceC2766Sw, "callback");
            InterfaceC4309pQ interfaceC4309pQ = Storage.onStorageEventCallbacks;
            do {
                c4907w90 = (C4907w90) interfaceC4309pQ;
                value = c4907w90.getValue();
            } while (!c4907w90.h(value, AbstractC2853Wf.q0(interfaceC2766Sw, (List) value)));
        }

        public final void removeStorageEventCallback(InterfaceC2766Sw interfaceC2766Sw) {
            C4907w90 c4907w90;
            Object value;
            ArrayList arrayList;
            AbstractC2995aW.q(interfaceC2766Sw, "callback");
            InterfaceC4309pQ interfaceC4309pQ = Storage.onStorageEventCallbacks;
            do {
                c4907w90 = (C4907w90) interfaceC4309pQ;
                value = c4907w90.getValue();
                List list = (List) value;
                AbstractC2995aW.q(list, "<this>");
                arrayList = new ArrayList(AbstractC2749Sf.Y(10, list));
                boolean z = false;
                for (Object obj : list) {
                    boolean z2 = true;
                    if (!z && AbstractC2995aW.i(obj, interfaceC2766Sw)) {
                        z = true;
                        z2 = false;
                    }
                    if (z2) {
                        arrayList.add(obj);
                    }
                }
            } while (!c4907w90.h(value, arrayList));
        }
    }

    public Storage(String str, StorageManager.StorageType storageType) {
        AbstractC2995aW.q(str, "_targetFileName");
        AbstractC2995aW.q(storageType, "type");
        this._targetFileName = str;
        this.type = storageType;
    }

    public final synchronized boolean clearStorage() {
        clearData();
        return new File(this._targetFileName).delete();
    }

    public final StorageManager.StorageType getType() {
        return this.type;
    }

    public final synchronized boolean initStorage() {
        readStorage();
        super.initData();
        return true;
    }

    public final synchronized boolean readStorage() {
        boolean z = true;
        synchronized (this) {
            try {
                try {
                    try {
                        byte[] fileBytes = Utilities.readFileBytes(new File(this._targetFileName));
                        if (fileBytes == null) {
                            return false;
                        }
                        setData(new JSONObject(new String(fileBytes, AbstractC2307Be.f2881a)));
                    } catch (Exception e) {
                        DeviceLog.debug("Failed to read storage JSON file:", e);
                        z = false;
                    }
                } catch (FileNotFoundException e2) {
                    DeviceLog.debug("Storage JSON file not found in local cache:", e2);
                    z = false;
                }
                return z;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void sendEvent(StorageEvent storageEvent, Object obj) {
        List list = (List) ((C4907w90) onStorageEventCallbacks).getValue();
        if (!(!list.isEmpty())) {
            if (WebViewApp.getCurrentApp() == null || !WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.STORAGE, storageEvent, this.type.name(), obj)) {
                DeviceLog.debug("Couldn't send storage event to WebApp");
            }
        } else {
            AbstractC2995aW.n(storageEvent);
            StorageEventInfo storageEventInfo = new StorageEventInfo(storageEvent, this.type, obj);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC2766Sw) it.next()).invoke(storageEventInfo);
            }
        }
    }

    public final synchronized boolean storageFileExists() {
        return new File(this._targetFileName).exists();
    }

    public final synchronized boolean writeStorage() {
        File file = new File(this._targetFileName);
        if (getData() == null) {
            return false;
        }
        return Utilities.writeFile(file, getData().toString());
    }
}
