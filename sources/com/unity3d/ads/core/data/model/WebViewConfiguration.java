package com.unity3d.ads.core.data.model;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class WebViewConfiguration {
    private final List<String> additionalFiles;
    private final String entryPoint;
    private final int version;

    public WebViewConfiguration(int i, String str, List<String> list) {
        AbstractC2995aW.q(str, "entryPoint");
        AbstractC2995aW.q(list, "additionalFiles");
        this.version = i;
        this.entryPoint = str;
        this.additionalFiles = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WebViewConfiguration copy$default(WebViewConfiguration webViewConfiguration, int i, String str, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = webViewConfiguration.version;
        }
        if ((i2 & 2) != 0) {
            str = webViewConfiguration.entryPoint;
        }
        if ((i2 & 4) != 0) {
            list = webViewConfiguration.additionalFiles;
        }
        return webViewConfiguration.copy(i, str, list);
    }

    public final int component1() {
        return this.version;
    }

    public final String component2() {
        return this.entryPoint;
    }

    public final List<String> component3() {
        return this.additionalFiles;
    }

    public final WebViewConfiguration copy(int i, String str, List<String> list) {
        AbstractC2995aW.q(str, "entryPoint");
        AbstractC2995aW.q(list, "additionalFiles");
        return new WebViewConfiguration(i, str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebViewConfiguration)) {
            return false;
        }
        WebViewConfiguration webViewConfiguration = (WebViewConfiguration) obj;
        return this.version == webViewConfiguration.version && AbstractC2995aW.i(this.entryPoint, webViewConfiguration.entryPoint) && AbstractC2995aW.i(this.additionalFiles, webViewConfiguration.additionalFiles);
    }

    public final List<String> getAdditionalFiles() {
        return this.additionalFiles;
    }

    public final String getEntryPoint() {
        return this.entryPoint;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.additionalFiles.hashCode() + DM.d(this.entryPoint, this.version * 31, 31);
    }

    public String toString() {
        return "WebViewConfiguration(version=" + this.version + ", entryPoint=" + this.entryPoint + ", additionalFiles=" + this.additionalFiles + ')';
    }
}
