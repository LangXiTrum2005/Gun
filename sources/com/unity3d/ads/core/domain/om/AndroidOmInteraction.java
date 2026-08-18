package com.unity3d.ads.core.domain.om;

import android.webkit.WebView;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer;
import com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.OmidOptions;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC3346eT;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC5042xk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RC;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AndroidOmInteraction implements OmInteraction {
    private final EnumC5042xk getCreativeType(JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt("creativeType");
        if (iOptInt == 1) {
            return EnumC5042xk.DEFINED_BY_JAVASCRIPT;
        }
        if (iOptInt == 2) {
            return EnumC5042xk.HTML_DISPLAY;
        }
        if (iOptInt == 3) {
            return EnumC5042xk.NATIVE_DISPLAY;
        }
        if (iOptInt == 4) {
            return EnumC5042xk.VIDEO;
        }
        if (iOptInt == 5) {
            return EnumC5042xk.AUDIO;
        }
        throw new IllegalArgumentException("Invalid creativeType");
    }

    private final RC getImpressionType(JSONObject jSONObject) {
        switch (jSONObject.optInt("impressionType")) {
            case 1:
                return RC.DEFINED_BY_JAVASCRIPT;
            case 2:
                return RC.UNSPECIFIED;
            case 3:
                return RC.LOADED;
            case 4:
                return RC.BEGIN_TO_RENDER;
            case 5:
                return RC.ONE_PIXEL;
            case 6:
                return RC.VIEWABLE;
            case 7:
                return RC.AUDIBLE;
            case 8:
                return RC.OTHER;
            default:
                throw new IllegalArgumentException("Invalid impressionType");
        }
    }

    private final EnumC3346eT getImpressionsOwner(JSONObject jSONObject) {
        EnumC3346eT enumC3346eT = EnumC3346eT.NONE;
        try {
            int iOptInt = jSONObject.optInt("impressionOwner");
            if (iOptInt == 1) {
                return EnumC3346eT.JAVASCRIPT;
            }
            if (iOptInt == 2) {
                return EnumC3346eT.NATIVE;
            }
            if (iOptInt == 3) {
                return enumC3346eT;
            }
            throw new IllegalArgumentException("Invalid impressionOwner");
        } catch (IllegalArgumentException unused) {
            return enumC3346eT;
        }
    }

    private final EnumC3346eT getMediaEventsOwner(JSONObject jSONObject) {
        EnumC3346eT enumC3346eT = EnumC3346eT.NONE;
        try {
            int iOptInt = jSONObject.optInt("mediaEventsOwner");
            if (iOptInt == 1) {
                return EnumC3346eT.JAVASCRIPT;
            }
            if (iOptInt == 2) {
                return EnumC3346eT.NATIVE;
            }
            if (iOptInt == 3) {
                return enumC3346eT;
            }
            throw new IllegalArgumentException("Invalid mediaEventsOwner");
        } catch (IllegalArgumentException unused) {
            return enumC3346eT;
        }
    }

    private final EnumC3346eT getVideoEventsOwner(JSONObject jSONObject) {
        EnumC3346eT enumC3346eT = EnumC3346eT.NONE;
        try {
            int iOptInt = jSONObject.optInt("videoEventsOwner");
            if (iOptInt == 1) {
                return EnumC3346eT.JAVASCRIPT;
            }
            if (iOptInt == 2) {
                return EnumC3346eT.NATIVE;
            }
            if (iOptInt == 3) {
                return enumC3346eT;
            }
            throw new IllegalArgumentException("Invalid videoEventsOwner");
        } catch (IllegalArgumentException unused) {
            return enumC3346eT;
        }
    }

    @Override // com.unity3d.ads.core.domain.om.OmInteraction
    public OmidOptions getOMidOptions(JSONObject jSONObject) {
        AbstractC2995aW.q(jSONObject, "options");
        return new OmidOptions(jSONObject.optBoolean("isolateVerificationScripts"), getImpressionsOwner(jSONObject), getVideoEventsOwner(jSONObject), jSONObject.optString("customReferenceData"), getImpressionType(jSONObject), getCreativeType(jSONObject), getMediaEventsOwner(jSONObject));
    }

    @Override // com.unity3d.ads.core.domain.om.OmInteraction
    public WebView getWebview(AdObject adObject) {
        AbstractC2995aW.q(adObject, "adObject");
        AdPlayer adPlayer = adObject.getAdPlayer();
        if (adPlayer instanceof AndroidFullscreenWebViewAdPlayer) {
            return ((AndroidFullscreenWebViewAdPlayer) adPlayer).getWebViewContainer().getWebView();
        }
        if (adPlayer instanceof AndroidEmbeddableWebViewAdPlayer) {
            return ((AndroidEmbeddableWebViewAdPlayer) adPlayer).getWebViewContainer().getWebView();
        }
        return null;
    }
}
