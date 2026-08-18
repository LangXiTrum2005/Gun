package com.mbridge.msdk.nativex.view.mbfullview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.tools.g0;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* JADX INFO: loaded from: classes2.dex */
public class MBridgeTopFullView extends BaseView {
    public static final String INTERFACE_RESULT = MBridgeTopFullView.class.getName().concat("WithResault");
    protected ImageView j;
    protected TextView k;
    protected TextView l;
    protected StarLevelLayoutView m;

    public MBridgeTopFullView(Context context) {
        super(context);
        View viewInflate = LayoutInflater.from(getContext()).inflate(g0.a(getContext(), "mbridge_nativex_fullscreen_top", TtmlNode.TAG_LAYOUT), this.i);
        if (viewInflate != null) {
            this.j = (ImageView) viewInflate.findViewById(g0.a(getContext(), "mbridge_full_tv_display_icon", "id"));
            this.k = (TextView) viewInflate.findViewById(g0.a(getContext(), "mbridge_full_tv_display_title", "id"));
            this.l = (TextView) viewInflate.findViewById(g0.a(getContext(), "mbridge_full_tv_display_description", "id"));
            this.m = (StarLevelLayoutView) viewInflate.findViewById(g0.a(getContext(), "mbridge_full_tv_feeds_star", "id"));
            this.l.setTextColor(-7829368);
            viewInflate.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            updateLayoutParams();
        }
    }

    public TextView getMBridgeFullViewDisplayDscription() {
        return this.l;
    }

    public ImageView getMBridgeFullViewDisplayIcon() {
        return this.j;
    }

    public TextView getMBridgeFullViewDisplayTitle() {
        return this.k;
    }

    public StarLevelLayoutView getStarLevelLayoutView() {
        return this.m;
    }

    public void updateLayoutParams() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(10);
        this.f1540a.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(10);
        this.b.setLayoutParams(layoutParams2);
    }
}
