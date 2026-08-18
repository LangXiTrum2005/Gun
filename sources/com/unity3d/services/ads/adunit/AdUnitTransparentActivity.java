package com.unity3d.services.ads.adunit;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import com.unity3d.services.core.misc.ViewUtilities;
import com.unity3d.services.core.webview.bridge.SharedInstances;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes4.dex */
public class AdUnitTransparentActivity extends AdUnitActivity {
    @Override // com.unity3d.services.ads.adunit.AdUnitActivity
    public AdUnitActivityController createController() {
        return new AdUnitTransparentActivityController(this, SharedInstances.INSTANCE.getWebViewEventSender(), new AdUnitViewHandlerFactory());
    }

    @Override // com.unity3d.services.ads.adunit.AdUnitActivity, android.app.Activity
    public void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        super.onCreate(bundle);
        ViewUtilities.setBackground(this._controller._layout, new ColorDrawable(0));
    }
}
