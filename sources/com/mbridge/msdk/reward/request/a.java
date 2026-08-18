package com.mbridge.msdk.reward.request;

import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.tracker.network.h;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a extends c {
    public abstract void a(CampaignUnit campaignUnit);

    @Override // com.mbridge.msdk.reward.request.c
    public void a(List<Frame> list) {
    }

    public abstract void b(int i, String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar);

    @Override // com.mbridge.msdk.reward.request.c
    public void a(List<h> list, CampaignUnit campaignUnit) {
        a(campaignUnit);
    }

    @Override // com.mbridge.msdk.reward.request.c
    public void a(int i, String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        b(i, str, cVar);
    }
}
