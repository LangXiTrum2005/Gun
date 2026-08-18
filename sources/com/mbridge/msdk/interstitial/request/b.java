package com.mbridge.msdk.interstitial.request;

import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.tracker.network.h;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b extends c {
    public abstract void a(CampaignUnit campaignUnit);

    @Override // com.mbridge.msdk.interstitial.request.c
    public void a(List<Frame> list) {
    }

    public abstract void b(int i, String str);

    @Override // com.mbridge.msdk.interstitial.request.c
    public void a(List<h> list, CampaignUnit campaignUnit) {
        a(campaignUnit);
    }

    @Override // com.mbridge.msdk.interstitial.request.c
    public void a(int i, String str) {
        b(i, str);
    }
}
