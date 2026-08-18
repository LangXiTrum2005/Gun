package com.bytedance.sdk.openadsdk.api;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class PAGRequest {
    private Map<String, Object> LD;
    private String Lxb;
    private Bundle lk = null;

    public final void addNetworkExtrasBundle(Class<?> cls, Bundle bundle) {
        if (this.lk == null) {
            this.lk = new Bundle();
        }
        this.lk.putBundle(cls.getName(), bundle);
    }

    public String getAdString() {
        return this.Lxb;
    }

    public Map<String, Object> getExtraInfo() {
        return this.LD;
    }

    public Bundle getNetworkExtrasBundle() {
        return this.lk;
    }

    public void setAdString(String str) {
        this.Lxb = str;
    }

    public void setExtraInfo(Map<String, Object> map) {
        this.LD = map;
    }
}
