package com.unity3d.ads;

import com.unity3d.ads.core.domain.LegacyLoadUseCase;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public class UnityAdsLoadOptions extends UnityAdsBaseOptions {
    private String AD_MARKUP = LegacyLoadUseCase.KEY_AD_MARKUP;

    public void setAdMarkup(String str) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        set(this.AD_MARKUP, str);
    }
}
