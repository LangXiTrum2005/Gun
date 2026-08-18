package com.unity3d.ads.adplayer;

import android.webkit.WebView;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DisplayMessage {
    private final String opportunityId;

    public static final class DisplayDestroyed extends DisplayMessage {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DisplayDestroyed(String str) {
            super(str, null);
            AbstractC2995aW.q(str, "opportunityId");
        }
    }

    public static final class DisplayError extends DisplayMessage {
        private final String reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DisplayError(String str, String str2) {
            super(str, null);
            AbstractC2995aW.q(str, "opportunityId");
            AbstractC2995aW.q(str2, "reason");
            this.reason = str2;
        }

        public final String getReason() {
            return this.reason;
        }
    }

    public static final class DisplayFinishRequest extends DisplayMessage {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DisplayFinishRequest(String str) {
            super(str, null);
            AbstractC2995aW.q(str, "opportunityId");
        }
    }

    public static final class FocusChanged extends DisplayMessage {
        private final boolean isFocused;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FocusChanged(String str, boolean z) {
            super(str, null);
            AbstractC2995aW.q(str, "opportunityId");
            this.isFocused = z;
        }

        public final boolean isFocused() {
            return this.isFocused;
        }
    }

    public static final class SetOrientation extends DisplayMessage {
        private final int orientation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetOrientation(String str, int i) {
            super(str, null);
            AbstractC2995aW.q(str, "opportunityId");
            this.orientation = i;
        }

        public final int getOrientation() {
            return this.orientation;
        }
    }

    public static final class VisibilityChanged extends DisplayMessage {
        private final boolean isVisible;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VisibilityChanged(String str, boolean z) {
            super(str, null);
            AbstractC2995aW.q(str, "opportunityId");
            this.isVisible = z;
        }

        public final boolean isVisible() {
            return this.isVisible;
        }
    }

    public static final class WebViewInstanceRequest extends DisplayMessage {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WebViewInstanceRequest(String str) {
            super(str, null);
            AbstractC2995aW.q(str, "opportunityId");
        }
    }

    public static final class WebViewInstanceResponse extends DisplayMessage {
        private final WebView webView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WebViewInstanceResponse(String str, WebView webView) {
            super(str, null);
            AbstractC2995aW.q(str, "opportunityId");
            AbstractC2995aW.q(webView, "webView");
            this.webView = webView;
        }

        public final WebView getWebView() {
            return this.webView;
        }
    }

    public /* synthetic */ DisplayMessage(String str, AbstractC2471Hm abstractC2471Hm) {
        this(str);
    }

    public final String getOpportunityId() {
        return this.opportunityId;
    }

    public static final class DisplayReady extends DisplayMessage {
        private final Map<String, Object> showOptions;

        public /* synthetic */ DisplayReady(String str, Map map, int i, AbstractC2471Hm abstractC2471Hm) {
            this(str, (i & 2) != 0 ? null : map);
        }

        public final Map<String, Object> getShowOptions() {
            return this.showOptions;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DisplayReady(String str, Map<String, ? extends Object> map) {
            super(str, null);
            AbstractC2995aW.q(str, "opportunityId");
            this.showOptions = map;
        }
    }

    private DisplayMessage(String str) {
        this.opportunityId = str;
    }
}
